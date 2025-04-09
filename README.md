# ATT-SOLID
#RELATÓRIO
Alunos: João Pedro Gonçalves Ferreira, Pedro Henrique Vengrus, Kauan Idalgo Lopes

S Solid:
Havia uma classe para fazer duas ações, SalvarArquivo e Processar, criei 2 classes para cada uma fazer apenas uma tarefa e respeitar o conceito S do Solid.

O Solid:
Separei cada método de pagamento em uma classe específica que implementa uma interface IMetodoPagamento, a classe sistemaPagamento foi refatorada para usar essa interface. 

L Solid:
Separei a funcionalidade de saque em uma interface chamada ISacar e só as classes que suportam saque como a conta corrente implementa essa interface. A conta poupança continua herdando de conta bancária mas não implementa ISacar.

I SOlid:
Os comportamentos em interfaces foram separados, evitando criar uma interface única e aleatória com métodos que nem todos os veículos usariam. Dessa forma, cada classe implementa apenas a interface que faz sentido.
