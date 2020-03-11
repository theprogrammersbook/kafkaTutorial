# **Kafka Application**

This Application used to create Producer and Consumer in Java.
Contains the following class.
1. Producer.java -> Used to produce the information a 
the provided topic.
2. Consumer.java --> Used to consumer the information form the given topic.


**How to Run:**

1. Start zookeepr server.
`kafka_2.12-2.4.0$ bin/zookeeper-server-start.sh config/zookeeper.properties `

2. Start Kafka Server.
`kafka_2.12-2.4.0$ bin/kafka-server-start.sh config/server.properties `

3. Run the Producer.java

`/usr/lib/jvm/java-8-openjdk-amd64/bin/java -javaagent:/home/nagaraju/workspace/softwares/idea-IC-193.5662.53/lib/idea_rt.jar=42093:/home/nagaraju/workspace/softwares/idea-IC-193.5662.53/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/home/nagaraju/IdeaProjects/KafkaApplication/target/classes:/home/nagaraju/.m2/repository/org/apache/kafka/kafka_2.12/1.0.1/kafka_2.12-1.0.1.jar:/home/nagaraju/.m2/repository/org/apache/kafka/kafka-clients/1.0.1/kafka-clients-1.0.1.jar:/home/nagaraju/.m2/repository/org/lz4/lz4-java/1.4/lz4-java-1.4.jar:/home/nagaraju/.m2/repository/org/xerial/snappy/snappy-java/1.1.4/snappy-java-1.1.4.jar:/home/nagaraju/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/home/nagaraju/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.1/jackson-databind-2.9.1.jar:/home/nagaraju/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/home/nagaraju/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.1/jackson-core-2.9.1.jar:/home/nagaraju/.m2/repository/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.jar:/home/nagaraju/.m2/repository/com/yammer/metrics/metrics-core/2.2.0/metrics-core-2.2.0.jar:/home/nagaraju/.m2/repository/org/scala-lang/scala-library/2.12.4/scala-library-2.12.4.jar:/home/nagaraju/.m2/repository/org/slf4j/slf4j-log4j12/1.7.25/slf4j-log4j12-1.7.25.jar:/home/nagaraju/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:/home/nagaraju/.m2/repository/com/101tec/zkclient/0.10/zkclient-0.10.jar:/home/nagaraju/.m2/repository/org/apache/zookeeper/zookeeper/3.4.10/zookeeper-3.4.10.jar Producer
 2020-03-11 11:12:50 INFO  ProducerConfig:238 - ProducerConfig values: 
 	acks = 1
 	batch.size = 16384
 	bootstrap.servers = [localhost:9092]
 	buffer.memory = 33554432
 	client.id = 
 	compression.type = none
 	connections.max.idle.ms = 540000
 	enable.idempotence = false
 	interceptor.classes = null
 	key.serializer = class org.apache.kafka.common.serialization.StringSerializer
 	linger.ms = 0
 	max.block.ms = 60000
 	max.in.flight.requests.per.connection = 5
 	max.request.size = 1048576
 	metadata.max.age.ms = 300000
 	metric.reporters = []
 	metrics.num.samples = 2
 	metrics.recording.level = INFO
 	metrics.sample.window.ms = 30000
 	partitioner.class = class org.apache.kafka.clients.producer.internals.DefaultPartitioner
 	receive.buffer.bytes = 32768
 	reconnect.backoff.max.ms = 1000
 	reconnect.backoff.ms = 50
 	request.timeout.ms = 30000
 	retries = 0
 	retry.backoff.ms = 100
 	sasl.jaas.config = null
 	sasl.kerberos.kinit.cmd = /usr/bin/kinit
 	sasl.kerberos.min.time.before.relogin = 60000
 	sasl.kerberos.service.name = null
 	sasl.kerberos.ticket.renew.jitter = 0.05
 	sasl.kerberos.ticket.renew.window.factor = 0.8
 	sasl.mechanism = GSSAPI
 	security.protocol = PLAINTEXT
 	send.buffer.bytes = 131072
 	ssl.cipher.suites = null
 	ssl.enabled.protocols = [TLSv1.2, TLSv1.1, TLSv1]
 	ssl.endpoint.identification.algorithm = null
 	ssl.key.password = null
 	ssl.keymanager.algorithm = SunX509
 	ssl.keystore.location = null
 	ssl.keystore.password = null
 	ssl.keystore.type = JKS
 	ssl.protocol = TLS
 	ssl.provider = null
 	ssl.secure.random.implementation = null
 	ssl.trustmanager.algorithm = PKIX
 	ssl.truststore.location = null
 	ssl.truststore.password = null
 	ssl.truststore.type = JKS
 	transaction.timeout.ms = 60000
 	transactional.id = null
 	value.serializer = class org.apache.kafka.common.serialization.StringSerializer
 
 2020-03-11 11:12:50 INFO  AppInfoParser:109 - Kafka version : 1.0.1
 2020-03-11 11:12:50 INFO  AppInfoParser:110 - Kafka commitId : c0518aa65f25317e
 0
 1
 2
 3
 4
 5
 6
 7
 8
 9
 10
 11
 12
 13
 14
 15
 16
 17
 18
 19
 20
 21
 22
 23
 24
 25
 26
 27
 28
 29
 30
 31
 32
 33
 34
 35
 36
 37
 38
 39
 40
 41
 42
 43
 44
 45
 46
 47
 48
 49
 50
 51
 52
 53
 54
 55
 56
 57
 58
 59
 60
 61
 62
 63
 64
 65
 66
 67
 68
 69
 70
 71
 72
 73
 74
 75
 76
 77
 78
 79
 80
 81
 82
 83
 84
 85
 86
 87
 88
 89
 90
 91
 92
 93
 94
 95
 96
 97
 98
 99
 2020-03-11 11:12:51 INFO  KafkaProducer:341 - [Producer clientId=producer-1] Closing the Kafka producer with timeoutMillis = 9223372036854775807 ms.
 
 Process finished with exit code 0
`

4. Run the Consumer.java 

`/usr/lib/jvm/java-8-openjdk-amd64/bin/java -javaagent:/home/nagaraju/workspace/softwares/idea-IC-193.5662.53/lib/idea_rt.jar=44209:/home/nagaraju/workspace/softwares/idea-IC-193.5662.53/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/home/nagaraju/IdeaProjects/KafkaApplication/target/classes:/home/nagaraju/.m2/repository/org/apache/kafka/kafka_2.12/1.0.1/kafka_2.12-1.0.1.jar:/home/nagaraju/.m2/repository/org/apache/kafka/kafka-clients/1.0.1/kafka-clients-1.0.1.jar:/home/nagaraju/.m2/repository/org/lz4/lz4-java/1.4/lz4-java-1.4.jar:/home/nagaraju/.m2/repository/org/xerial/snappy/snappy-java/1.1.4/snappy-java-1.1.4.jar:/home/nagaraju/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/home/nagaraju/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.1/jackson-databind-2.9.1.jar:/home/nagaraju/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/home/nagaraju/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.1/jackson-core-2.9.1.jar:/home/nagaraju/.m2/repository/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.jar:/home/nagaraju/.m2/repository/com/yammer/metrics/metrics-core/2.2.0/metrics-core-2.2.0.jar:/home/nagaraju/.m2/repository/org/scala-lang/scala-library/2.12.4/scala-library-2.12.4.jar:/home/nagaraju/.m2/repository/org/slf4j/slf4j-log4j12/1.7.25/slf4j-log4j12-1.7.25.jar:/home/nagaraju/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:/home/nagaraju/.m2/repository/com/101tec/zkclient/0.10/zkclient-0.10.jar:/home/nagaraju/.m2/repository/org/apache/zookeeper/zookeeper/3.4.10/zookeeper-3.4.10.jar Consumer
 2020-03-11 11:11:45 INFO  ConsumerConfig:238 - ConsumerConfig values: 
 	auto.commit.interval.ms = 5000
 	auto.offset.reset = latest
 	bootstrap.servers = [localhost:9092]
 	check.crcs = true
 	client.id = 
 	connections.max.idle.ms = 540000
 	enable.auto.commit = true
 	exclude.internal.topics = true
 	fetch.max.bytes = 52428800
 	fetch.max.wait.ms = 500
 	fetch.min.bytes = 1
 	group.id = test-group
 	heartbeat.interval.ms = 3000
 	interceptor.classes = null
 	internal.leave.group.on.close = true
 	isolation.level = read_uncommitted
 	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
 	max.partition.fetch.bytes = 1048576
 	max.poll.interval.ms = 300000
 	max.poll.records = 500
 	metadata.max.age.ms = 300000
 	metric.reporters = []
 	metrics.num.samples = 2
 	metrics.recording.level = INFO
 	metrics.sample.window.ms = 30000
 	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor]
 	receive.buffer.bytes = 65536
 	reconnect.backoff.max.ms = 1000
 	reconnect.backoff.ms = 50
 	request.timeout.ms = 305000
 	retry.backoff.ms = 100
 	sasl.jaas.config = null
 	sasl.kerberos.kinit.cmd = /usr/bin/kinit
 	sasl.kerberos.min.time.before.relogin = 60000
 	sasl.kerberos.service.name = null
 	sasl.kerberos.ticket.renew.jitter = 0.05
 	sasl.kerberos.ticket.renew.window.factor = 0.8
 	sasl.mechanism = GSSAPI
 	security.protocol = PLAINTEXT
 	send.buffer.bytes = 131072
 	session.timeout.ms = 10000
 	ssl.cipher.suites = null
 	ssl.enabled.protocols = [TLSv1.2, TLSv1.1, TLSv1]
 	ssl.endpoint.identification.algorithm = null
 	ssl.key.password = null
 	ssl.keymanager.algorithm = SunX509
 	ssl.keystore.location = null
 	ssl.keystore.password = null
 	ssl.keystore.type = JKS
 	ssl.protocol = TLS
 	ssl.provider = null
 	ssl.secure.random.implementation = null
 	ssl.trustmanager.algorithm = PKIX
 	ssl.truststore.location = null
 	ssl.truststore.password = null
 	ssl.truststore.type = JKS
 	value.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
 
 2020-03-11 11:11:46 INFO  AppInfoParser:109 - Kafka version : 1.0.1
 2020-03-11 11:11:46 INFO  AppInfoParser:110 - Kafka commitId : c0518aa65f25317e
 2020-03-11 11:11:47 INFO  AbstractCoordinator:341 - [Consumer clientId=consumer-1, groupId=test-group] Discovered group coordinator nagaraju:9092 (id: 2147483647 rack: null)
 2020-03-11 11:11:47 INFO  ConsumerCoordinator:341 - [Consumer clientId=consumer-1, groupId=test-group] Revoking previously assigned partitions []
 2020-03-11 11:11:47 INFO  AbstractCoordinator:336 - [Consumer clientId=consumer-1, groupId=test-group] (Re-)joining group
 2020-03-11 11:11:49 INFO  AbstractCoordinator:341 - [Consumer clientId=consumer-1, groupId=test-group] Successfully joined group with generation 4
 2020-03-11 11:11:49 INFO  ConsumerCoordinator:341 - [Consumer clientId=consumer-1, groupId=test-group] Setting newly assigned partitions [simple-partitions-topic-0]
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 0
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 1
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 2
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 3
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 4
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 5
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 6
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 7
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 8
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 9
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 10
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 11
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 12
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 13
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 14
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 15
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 16
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 17
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 18
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 19
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 20
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 21
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 22
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 23
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 24
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 25
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 26
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 27
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 28
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 29
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 30
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 31
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 32
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 33
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 34
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 35
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 36
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 37
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 38
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 39
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 40
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 41
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 42
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 43
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 44
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 45
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 46
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 47
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 48
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 49
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 50
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 51
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 52
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 53
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 54
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 55
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 56
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 57
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 58
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 59
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 60
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 61
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 62
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 63
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 64
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 65
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 66
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 67
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 68
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 69
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 70
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 71
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 72
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 73
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 74
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 75
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 76
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 77
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 78
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 79
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 80
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 81
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 82
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 83
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 84
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 85
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 86
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 87
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 88
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 89
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 90
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 91
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 92
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 93
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 94
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 95
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 96
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 97
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 98
 Topic - simple-partitions-topic, Partition - 0, Value: test message - 99
`

