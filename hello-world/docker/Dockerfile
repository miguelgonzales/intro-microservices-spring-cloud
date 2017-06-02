FROM java:8u111
COPY hello-world.jar /opt/microservices/app.jar
RUN useradd microservice
USER microservice
EXPOSE 8888
ENTRYPOINT ["/opt/jdk1.8.0_121/bin/java"]
CMD ["jar", "/opt/microservices/app.jar"]