#! /bin/bash

echo 'Starting Drill4J services...'
docker-compose -f docker/docker-compose-admin.yml up -d
sleep 5 # workaround for test2code plugin not being loaded yet
echo 'Starting example application - RealWorld App Angular + Spring'
docker-compose -f docker/docker-compose-app.yml up -d
echo 'Set up chrome-driver and chromium-binary.'
chmod +x ./chrome-driver-setup.sh
chmod +x ./chromium-setup.sh
echo 'Drill4J Admin Panel is available at http://localhost:8091'
echo 'Example application is available at http://localhost:8080 (wait a few seconds for it to become available)'
