import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import scala.collection.immutable.Stream;

import java.util.Properties;
import java.util.concurrent.CountDownLatch;

public class PipeApplication {
   public static void main(String args []){
      Properties prop = new Properties();
      prop.put(StreamsConfig.APPLICATION_ID_CONFIG,"streams-pipe");
      prop.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
      prop.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
      prop.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,Serdes.String().getClass());
      // Create Stream Builder
      final StreamsBuilder builder = new StreamsBuilder();
      builder.stream("streams-plaintext-input").to("streams-pipe-output");

      // Create topology
      final Topology topology  = builder.build();
      // create kafka streams
      final KafkaStreams streams = new KafkaStreams(topology,prop);
      final CountDownLatch latch = new CountDownLatch(1);

      Runtime.getRuntime().addShutdownHook(new Thread("streams-shutdown-hook"){
         @Override
         public void run() {
            streams.close();
            latch.countDown();
         }
      });
      try{
          streams.start();
          latch.wait();
      }catch(Throwable ex){
         System.out.println(ex.getLocalizedMessage());
         System.exit(1);
      }
      System.out.println("Before System.exit");
      System.exit(0);
      System.out.println("After System.exit");
   }

}
