# 파일 빌드 
`mvn clean compile package -DskipTests=true`

# Docker 이미지 빌드
`docker build -t developiaa/catalog-service:1.0 .`

# Docker 이미지 업로드
`docker push developiaa/catalog-service:1.0`

# Docker 실행
```shell
docker run -d --network ecommerce-network \

 --name catalog-service \

 -e "eureka.client.serviceUrl.defaultZone=http://discovery-service:8761/eureka/" \

 -e "logging.file=/api-logs/users-ws.log" \

 developiaa/catalog-service:1.0
```
