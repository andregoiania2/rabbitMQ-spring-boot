# rabbitMQ-spring-boot
Exemplo de produce e consume 

# Pre-requisitos para executar o projeto

docker e java versão 17

# Preparando o ambiente RabbitMQ

1 - Raiz do repositório tem um arquivo docker-compose.yml que vamos executar e levantar um container com RabbitMQ, execute o comando <b>docker-compose up -d</b>


2 - Vamos pegar qual é o ip do container, execute o comando <b>docker ps</b> copie o container id da imagem rabbitmq:3.9-management, e execute o comando <b>docker inspect <container_id> | grep "IPAddress"</b> copie o numero de IP pois você vai precisar em outras configurações, mais a frente.


3 - No browser digite a URL substituindo o Ip pelo o que vc copiou anteriormente <b>http://120.28.0.2:15672</b>


4 - Vai aparecer uma tela para que digite usuario e senha, como exemplo foi configurado na imagem docker o <b>Username: guest e Password: guest</b>


5 - Vamos criar a fila, <b>clique em Queues</b> em seguida em <b>Add a new queue</b> para esse exemplo vamos colocar somente o nome <b>teste</b> e deixar o restante default. 


Clicando no nome da fila temos uma tela que consiguimos ver como a fila está funcionando com numeros de consumidores e tambem tem como o evio de msg em publish message.


# Consumer

Para o consumer só precisa das configurações do application.properties e a anotação @EnableRabbit que pode ficar na class de boot.

# Produce

Para o produce necessita das mesma configurações usadas no consumer, mais uma que está no pacote config.


Para testar basta executar o comando <b>curl --location 'localhost:8080/teste' \
--header 'Content-Type: application/json' \
--data '{
    "msg":"teste de envio"
}'</b>


Esse foi um exemplo simples, mas existem outras propiedades que podem agregar a necessidade do negócio o intuito aqui foi só registrar as dependencias e de como é feito no spring boot.
