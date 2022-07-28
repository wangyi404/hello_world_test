#构建镜像的Dockerfile
# From java image, version : 8
FROM java:8

##将maven构建好的jar添加到镜像中(前面为打包出的jar包名，后面任意与上上步执行shell中一致即可)
ADD target/springboot-hello-world-test.jar springboot-hello-world-test.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "springboot-hello-world-test.jar"]

