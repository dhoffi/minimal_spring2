#!/bin/bash

cd https-only-tests-master
ls -lsh

./mvnw package

# output convention: output-<repoName>-deploy
cp -r target output-https-only-tests-master-check

ls -lsh output-https-only-tests-master-check