sleep 5;
cp /home/demo-0.0.1-SNAPSHOT.jar /log/demo-0.0.1-SNAPSHOT.jar
cd /log
java -jar /log/demo-0.0.1-SNAPSHOT.jar --spring.config.location=/conf/application.properties
