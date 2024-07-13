FROM gradle:7.6.4-jdk11-alpine

WORKDIR /app

ADD --chown=gradle:gradle bin .

ENTRYPOINT ["gradle"]

CMD ["bootRun"]
