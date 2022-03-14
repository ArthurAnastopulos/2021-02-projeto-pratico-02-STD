# Projeto prático 2: Implementação da API RESTful de uma central de automação residencial

## Relatório - Compilação e Execução

Para compilar e excutar o projeto utilizei a IDE IntelliJ onde utilizei o `build` e `run` da propria IDE. Portanto, execute a tarefa do gradle (task) chamada `bootRun` que, no meu da IDE, estará dentro da categoria `application`. Ao executar, será instanciado um processo que ficará aceitando conexões HTTP na porta 8080.

## Relatório - Exemplos para Consumir alguns recursos da API

Para consumir o serviço REST desta aplicação foi utilizado o aplicativo de linha de comando: `curl`.

```bash

# Obtendo a lista com todos os dispositivos no sistema
curl -L -X GET 'http://localhost:8080/api/v1/dispositivos'
# Obtendo uma lista de objetos de um tipo de dispositivo especifico
curl -L -X GET 'http://localhost:8080/api/v1/dispositivos/arcondicionado'
# Obtendo e atualizando um tipo dispositivos de especifio apartir de seu id 
curl -L -X GET 'http://localhost:8080/api/v1/dispositivos/arcondicionado/arCondicionado2'
curl -L -X PUT 'http://localhost:8080/api/v1/dispositivos/arcondicionado/arCondicionado2' -H 'Content-Type: application/json' --data-raw '{ "temperatura": 10, "ativo":false }'
# Obtendo/Criando/Atualizando/Deletendo um Ambiente
curl -L -X POST 'http://localhost:8080/sala' \
-H 'Content-Type: application/json' \
--data-raw '{ "dispositivos":["lampada1", "tv1"] }'
curl -L -X GET 'http://localhost:8080/api/v1/ambiente/sala'
curl -L -X PUT 'http://localhost:8080/api/v1/ambiente/sala' -H 'Content-Type: application/json' --data-raw '{ "dispositivos":["lampada4", "tv3"] }'
curl -L -X DELETE 'http://localhost:8080/api/v1/ambiente/sala'
```

## Relatório - Tabela de Funcionalidades Implementadas

|Funcionalidade|Implementação|
|---	|---	|
|Documentação OpenAPI|Ok|
|Dispositivos GET|Ok|
|Dispositivos ArCondicionado GET|Ok|
|Dispositivos ArCondicionado {Id} GET|Ok|
|Dispositivos ArCondicionado {Id} PUT|Ok|
|Dispositivos Lampada GET|Ok|
|Dispositivos Lampada {Id} GET|Ok|
|Dispositivos Lampada {Id} PUT|Ok|
|Dispositivos Cortina GET|Ok|
|Dispositivos Cortina {Id} GET|Ok|
|Dispositivos Cortina {Id} PUT|Ok|
|Dispositivos SistemaSom GET|Ok|
|Dispositivos SistemaSom {Id} GET|Ok|
|Dispositivos SistemaSom {Id} PUT|Ok|
|Dispositivos PortaoEletronico GET|Ok|
|Dispositivos PortaoEletronico {Id} GET|Ok|
|Dispositivos PortaoEletronico {Id} PUT|Ok|
|Dispositivos TV GET|Ok|
|Dispositivos TV {Id} GET|Ok|
|Dispositivos TV {Id} PUT|Ok|
|Ambiente GET|Ok|
|Ambiente {Local} GET|Ok|
|Ambiente {Local} POST|Ok|
|Ambiente {Local} PUT|Ok|
|Ambiente {Local} DELETE|Ok|
|Cenario GET|Ok|
|Cenario {chave} GET|Ok|
|Cenario {chave} POST|Ok|
|Cenario {chave} PUT|Ok|
|Cenario {chave} DELETE|Ok|

