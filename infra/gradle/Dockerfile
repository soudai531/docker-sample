FROM gradle:7-jdk-jammy
WORKDIR /java_project/
RUN mkdir ./docker-sample
WORKDIR /java_project/docker-sample
COPY . .
RUN ./gradlew bootJar
RUN cp ./build/libs/app.jar /usr/local/bin
WORKDIR /usr/local/bin
CMD  java -jar /usr/local/bin/app.jar