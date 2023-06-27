FROM eclipse-temurin:19-jammy AS builder
RUN mkdir java_project
COPY . /java_project/
RUN cd java_project && ./gradlew bootJar

FROM eclipse-temurin:19-jammy
RUN mkdir /usr/local/bin/initial && mkdir /usr/local/bin/sample && mkdir /tmp/build
COPY --from=builder /java_project/build/ /tmp/build
WORKDIR /usr/local/bin/sample/build/libs