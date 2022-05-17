# SobrecargaMetodos
Sobrecarga de Métodos

- Sobrecarga de método significa que o número de parametros ou os tipos dos parametros são diferentes

- Um método pode ter o mesmo nome que outro, desde que a chamada não fique ambígua: os argumentos que são recebidos têm de ser obrigatoriamente diferentes, 
seja em quantidade ou em tipos.

- No caso de sobrecarga com tipos que possuem polimorfismo, como em Object ou String, o compilador sempre invoca o método com o tipo mais específico (menos genérico).

- Se quisermos forçar a invocação ao método mais genérico, devemos fazer um casting.

