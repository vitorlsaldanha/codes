/*
  FACULDADE DOM BOSCO DE PORTO ALEGRE
* Sistemas de Informa��o � Algoritmos
*
* Programa SegundoT2:
* --------------------------
* Objetivo do Programa: Realizer o bubble sort e a pesquisa ordenada
* Componentes do grupo: F�bio e Vitor
* Data da entrega do arquivo fonte:

Escrever um programa que leia 35 RGs de pessoas procuradas pela justi�a e armazene-os em um
vetor.
Ap�s este processo, inicia-se uma pesquisa dos RGs armazenados no vetor, cada vez que um RG �
pesquisado, um contador associado a esta entrada na tabela � incrementada.
Ao final, exibir os 5 RGs mais pesquisados e os 5 RGs menos pesquisados.
Defina um flag para o encerramento da pesquisa. 
*/

#include <stdio.h>
#define N 6

int main (void){
	
	int rg[N];
	int i, contador_pesquisa = 0, ancora, aux, rg_pesquisado;
	int flag_while = 0;
	
	//preenche o vetor de RG's
	for(i = 0; i < N; i++){
		printf("Informe o %d RG: ",i+1);
		scanf("%d",&rg[i]);
	}
	
	//Apresenta os RG's digitados // esse aqui � s� pra verificar se ta tudo ok
	for(i = 0 ; i < N; i++){
		printf("%d \n",rg[i]);
	}
	
	//valida a entrada na pesquisa do RG
	printf("Digite um RG para pesquisar ou 0 para sair: ");
	scanf("%d",&rg_pesquisado);
	
	//zero os contadores e inicializo o i com 0
	i = 0, contador_pesquisa = 1;
	while(rg_pesquisado != 0){
		//flag do while recebe verdadeiro
		flag_while = 1;		
	
		//buuble sort para ordenar os RGS
		for(ancora = 0; ancora<N; ancora++){
			for(i = ancora+1; i < N; i++){
				if(rg[ancora]>rg[i]){
					aux = rg[ancora];
					rg[ancora] = rg[i];
					rg[i] = aux;
				}
			}
		}
		
		//verifica se o bubble sort est� correto
		/*
		for(i = 0; i < N; i++){
			printf("%d ",rg[i]);				
		}
		*/
		
		//faz uma nova pergunta
		printf("Digite um novo RG para pesquisar ou 0 para sair: ");
		scanf("%d",&rg_pesquisado);
	}	
	
	
	
	
	//se entrou no while .....   N�o sei se vamos precisar ainda mas ok
	if(flag_while == 1){
		
	}
	
	
	
	printf("\n\n");
	system("pause");
}
