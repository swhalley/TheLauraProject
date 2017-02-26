FROM 'mongo:latest'

COPY seedData.json .
CMD mongoimport --db testDB --collection Contacts --file seedData.json