FROM tomcat:latest

# Copy artefact in webapps dir
COPY target/Cloud-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/

CMD ["catalina.sh", "run"]
