cd tallercliente
mvn clean package
cd ..
cd tallerlog
mvn clean package
docker-compose up --build --no-start