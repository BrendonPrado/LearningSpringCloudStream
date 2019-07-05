# Projeto feito utilizando o spring Cloud Stream 

## Binder ativo RabbitMQ

## Pré requisito para rodar
- Java 8 
- RabbitMQ

### endpoint

- post em /sales rodando na porta 8090 de um json com um objeto sale.


### Obrigações delegadas as aplicações
- sender apenas possui o endpoint que recebe um objeto novo de sale e repassa para consumer.
- consumer recebe de sender e persiste este novo objeto.

