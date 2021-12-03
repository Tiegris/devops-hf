# Stage 1: BUILD
FROM gradle:7.3-jdk11 as build
COPY . /build
RUN cd /build && \
    gradle build --no-daemon

# Stage 2: FINAL
FROM openjdk:11-jre-slim as final
COPY --from=build /build/build/lib/*.jar /app/app.jar
