#!/bin/bash

set -e

SCRIPT_DIR=$(dirname $0)

cd "$SCRIPT_DIR"/petstore-provider

./gradlew pactPublish
