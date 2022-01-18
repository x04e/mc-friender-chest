#!/bin/sh
if [ -f "./env.sh" ]; then
    echo "Found 'env.sh', sourcing."
    source ./env.sh
fi

if [ ! -f "./server/spigot-1.18.1.jar" ]; then
    echo "Spigot jar not found, fetching..."
    mkdir "./server"
    curl -o "./server/spigot-1.18.1.jar" "https://download.getbukkit.org/spigot/spigot-1.18.1.jar"
    echo "Done"
fi

cd server
echo -e "\n### Starting Spigot ###############################"
java -Xms1G -Xmx2G -XX:+UseG1GC -jar 'spigot-1.18.1.jar' nogui
