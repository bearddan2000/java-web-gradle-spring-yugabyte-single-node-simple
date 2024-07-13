# java-web-gradle-spring-yugabyte-single-node-simple

## Description
A thyme springboot java gradle build,
that connects to yugabyte
single node database.

## Tech stack
- springboot
  - web
- thymeleaf
- gradle
  - postgres
- bootstrap
- jquery
- dataTable

## Docker stack
- yugabytedb/yugabyte
- gradle:jdk11

## To run
`sudo ./install.sh -u`
Available http://localhost

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Docker image](https://hub.docker.com/r/yugabytedb/yugabyte)
- [Java tutorial](https://www.baeldung.com/yugabytedb)