# Spring Profiles

## Properties 

Para activar el profiles desde el archivo propreties :

````yaml
spring.profiles.active=dev
````

## JVM

Activar properties desde JVM 

````bash
-Dspring.profiles.active=dev
````

## Docker

Activar Profile desde docker 

````bash
docker run -d -p 8080:8080 -e "SPRING_PROFILES_ACTIVE=dev" [imagen]:[version]
````

## Docker compose

````yaml
version: "3.7"
services:
  spring:
    build:
      context: .
    ports:
    - "8080:8080"
    environment:
      - "SPRING_PROFILES_ACTIVE=QA"
````

## Kubernetes

Activar profile desde kubernetes

````yaml
apiVersion: v1
kind: Pod
metadata:
  name: example
spec:
  containers:
  - name: example
    image: bash
    env:
    - name: SPRING_PROFILES_ACTIVE
      value: "dev"
````