#!/bin/sh
if [ -f "./env.sh" ]; then
    echo "Found 'env.sh', sourcing."
    source ./env.sh
fi

java -Xms1G -Xmx2G -XX:+UseG1GC -jar ./server/spigot-1.18.1.jar nogui
