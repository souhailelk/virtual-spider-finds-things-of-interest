# A virtual spider for instant things finding Close to Point of Interest

A spider is walking beside a way and collect the surrounding information with (a circle radius R).  
The collected information can be any type.  
The information should be stored on a neo4j spatial database.  
The Information will be processed by a machine learning algorithm.

## Usefull Kafka commands

- Run zookeeper : `.\bin\windows\zookeeper-server-start.sh .\config\zookeeper.properties`.
- Start kafka broker :  `.\bin\windows\kafka-server-start.bat .\config\server.properties`.
- Check a topic already created :  `.\bin\windows\kafka-topics.bat --describe --topic myTopic1 --bootstrap-server localhost:9092`.
- Produce message to a given topic : `.\bin\windows\kafka-console-producer.bat  --topic myTopic1 --bootstrap-server localhost:9092`.
- Consume message from a given topic : `.\bin\windows\kafka-console-consumer.bat  --topic myTopic1 --from-beginning --bootstrap-server localhost:9092`.
