# Apache Samza with apache kafka sample project

Head on to branch sample/samza for source code.

Instructions:

1) To set up this project, the minimal requirement is to have kafka zookeeper and server up and running.

2) Create two topics one acting as input stream ("test") and another as output stream ("testOut").

3) To see the project working, you need to run producer for "test" topic and consumer for "testOut" topic.

Note: Zookeeper should be running on port 2181 and server/broker on 9092 or you can change accordingly in 
        src/main/resources/application.conf file.
        
As the basic setup is ready, now you can follow these steps:
        
        - git clone https://github.com/yamini-ban/samza-sample.git
        - cd samza-sample
        - export BASE_DIR=`pwd`
        - sbt run

