FROM eclipse-temurin:19-jammy AS builder
RUN mkdir java_project
COPY . /java_project/
RUN cd java_project && ./gradlew bootJar

FROM eclipse-temurin:19-jammy
RUN mkdir /usr/local/bin/initial
COPY --from=builder /java_project/build/libs/app.jar /usr/local/bin/initial
WORKDIR /usr/local/bin/
CMD  java -jar /usr/local/bin/initial/app.jar