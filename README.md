# ScanPDF
A springboot application that scans pdf using the ClamAV  


mvn clean compile package

docker build -t scanner-file .

docker image ls -a | grep scanner-file

docker run -p 8080:8080 scanner-file

http://localhost:8080/swagger-ui.html