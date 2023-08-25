FROM openjdk:8
EXPOSE 8012
ADD target/springboot-docker-spotify.jar springboot-docker-spotify.jar
				#Source					   #Destination also we can use . here 	

ENTRYPOINT ["java", "-jar", "springboot-docker-spotify.jar"]