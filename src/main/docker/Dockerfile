#
FROM frolvlad/alpine-java:jdk8-slim
# VOLUME 指定了临时文件目录为/tmp
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
#
ADD demo-app-1.0.jar app.jar
#
ADD Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
#
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
