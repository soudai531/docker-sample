FROM eclipse-temurin:19-jammy
RUN apt-get update
RUN apt-get -y install curl
RUN apt-get -y install zip
RUN curl -s "https://get.sdkman.io" | bash
RUN echo ". $HOME/.sdkman/bin/sdkman-init.sh; sdk install gradle" | bash
WORKDIR /java_project/
RUN mkdir ./docker-sample
WORKDIR /java_project/docker-sample
COPY . .
RUN ./gradlew bootJar
RUN cp ./build/libs/app.jar /usr/local/bin
WORKDIR /usr/local/bin
ENTRYPOINT ["java", "-jar", "/usr/local/bin/app.jar"]