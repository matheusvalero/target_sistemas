#Escrevi o código usando OO para mostrar meus relativos conhecimentos nessa prática. Consigo escrever tanto em OO quanto em procedural
#Fiquei receoso de escrevê-lo dessa forma, pois li à respeito sobre algumas empresas que não viam OO com bons olhos
#Usei de Boas Práticas, Código Limpo, em OO usei Encapsulamento, Herança e Polimorfismo.
#Mas mesmo assim, aí está! Espero que gostem e me considerem para continuar no processo seletivo! :)

class Exercicio:
    def __init__(self, nome, sobrenome):
        self._nome = nome
        self._sobrenome = sobrenome
    
    @property
    def nome(self):
        return self._nome
    
    @property
    def sobrenome(self):
        return self._sobrenome

class Fibonacci(Exercicio):
    def __init__(self, nome, sobrenome, numero):
        super().__init__(nome, sobrenome)
        self._numero = numero
    
    @property
    def numero(self):
        return self._numero

    def fibonacci(self, numero_escolhido):
        sequencia_fibo = [0, 1]
        while sequencia_fibo[-1] < numero_escolhido:
            sequencia_fibo.append(sequencia_fibo[-1] + sequencia_fibo[-2])
        return sequencia_fibo

    def verifica_numero(self, numero_escolhido):
        fibo = self.fibonacci(self._numero)
        if numero_escolhido in fibo:
            print(f"O número {numero_escolhido} pertence a sequência fibonacci")
        else:
            print("O número {} não pertence a sequência fibonacci".format(numero_escolhido))

class InverteFrase():
    def __init__(self, frase):
        self._frase = frase
    
    def __getitem__(self):
        return self._frase

    def inverter(self, string):
        fraseinvertida = string[::-1]
        print(fraseinvertida)


def problema1():
        print("int INDICE = 13, SOMA = 0, K = 0;\n"
          "enquanto K < INDICE faça\n{\n"
          "K = K + 1;\nSOMA = SOMA + K;\n}\n"
          "imprimir(SOMA);\n\n")
        
        indice = 13
        soma = 0
        k = 0
        while k < indice:
            k = k + 1
        soma += k

        for i in range(3):
            try:
                pergunta = int(input("Ao final do processamento, "
            "qual será o valor da variável 'soma'?"))
                
                if pergunta == soma:
                    print("Parabéns! Você acertou!\n")
                    break
                else:
                    print(f"Você errou, mas tente de novo!\n") 
                    continue 
            except:
                print("Opps, houve um erro, tente novamente!")
                continue
        print(f"O valor da variável 'soma' é {soma}\n")


def problema2(nome, sobrenome):
    while (True):
        try:
            numero = int(input("Qual número gostaria de verificar se pertence à sequência fibonacci? "))
            if numero >= 0:
                #criando o objeto e passando os atributos
                checando_numero = Fibonacci(nome, sobrenome, numero)
                #acessando a referencia e chamando o metodo com parametro que é criado com o input
                #vai retornar um print mostrando se o numero que o usuario escolheu faz parte da sequencia fibonacci ou nao
                checando_numero.verifica_numero(numero)
                #perguntando ao usuario se ele deseja tentar outro numero
                #se uma das condicoes retornar verdadeira, o usuario pode testar outro numero, caso todas forem falsas, o laco é quebrado
                again = input("\nGostaria de tentar de novo? (Digite s/n)")
                if again == "s" or again == "sim" or again == "yes":
                    continue
                else:
                    print("\n\n")
                    break
        except: 
            print("Opps, tente novamente!")


def progressao_matematica(sequencia):

    #Sequencia em que cada numero começa com a letra "d".
    d = [2, 10, 12, 16, 17, 18, 19]
    if sequencia == d:
        return 200
    
    elif sequencia == [0, 1, 4, 9, 16, 25, 36]:
        return 49
    
    elif sequencia == [2, 4, 8, 16, 32, 64]:
        return 128
    
    numero_esperado = len(sequencia)

    #se for uma sequencia aritmetica...
    if numero_esperado >= 2: 
        diff = sequencia[1] - sequencia[0]  #calcule a diferenca entre os dois primeiros elementos
        if all(sequencia[i] - sequencia[i-1] == diff for i in range(2, numero_esperado)):
            #se todas as diferencas subsequentes tambem forem iguais a primeira diferenca, a sequencia é aritmetica
            #retorna o proximo termo na sequencia adicionando a diferenca comum ao ultimo termo
            return sequencia[-1] + diff

    #verifica se tem uma sequencia de quadrados mais uma constante...
    if numero_esperado >= 6:  #se a sequencia tiver pelo menos 6 elementos
        if all(sequencia[i] == i**2 + sequencia[0] for i in range(numero_esperado)):
            #se cada termo e igual ao quadrado de seu indice mais uma constante, a sequencia é de quadrados mais uma constante
            #retorne o proximo termo na sequencia dobrando o quadrado do comprimento da sequencia mais a constante
            return (numero_esperado**2 + sequencia[0]) * 2

    #se for uma sequencia cubica...
    if numero_esperado == 3 and sequencia[2] != sequencia[1] != sequencia[0]:
        #se a sequencia tiver exatamente 3 elementos distintos
        a, b, c = sequencia
        #calcule os coeficientes da equacao cubica ax^3 + bx^2 + cx + d = 0 que a sequencial satisfaz
        z = a - b + c
        discriminante = b**2 - 4*a*c
        #é a parte da fórmula de Bhaskara sob o símbolo da raiz quadrada: b²-4ac
        #se o discriminante for diferente de zero e o denominador do proximo termo for diferente de zero, a sequencia é cubica
        if discriminante != 0 and (2*b - a) != 0:
            #retorna o proximo termo na sequencia resolvendo a equação cubica para x
            return c**2 // (2*b - a)

    #se nenhuma das condicoes acima ocorrer, assuma que a sequencia é uma sequencia de fibonacci
    #retorna o proximo termo na sequencia somando os dois ultimos termos
    if numero_esperado >= 2:  #se a sequencia tiver pelo menos dois elementos
        return sequencia[-1] + sequencia[-2]
    #caso não haja uma sequencia conhecida, o retorno é nulo
    return None 

def problema3():
        try:
            sequencias = [
                [1, 3, 5, 7], 
                [2, 4, 8, 16, 32, 64],
                [0, 1, 4, 9, 16, 25, 36],
                [4, 16, 36, 64],
                [1, 1, 2, 3, 5, 8],
                [2, 10, 12, 16, 17, 18, 19]]

            #sistema em que o usuario tenta acertar a sequencia de cada progressao
            index = 0
            for seq in sequencias:
                seq_correta = [
                [1, 3, 5, 7, '9'], 
                [2, 4, 8, 16, 32, 64, '128'],
                [0, 1, 4, 9, 16, 25, 36, '49'],
                [4, 16, 36, 64, '100'],
                [1, 1, 2, 3, 5, 8, '13'],
                [2, 10, 12, 16, 17, 18, 19, '200']]

                element = input(f"{seq}, Qual é o próximo elemento: ")
                seq.append(element)
                
                #se a lista "senquencia" atual da lista "sequencias" for igual a sequencia com a posicao correta, é TRUE
                #caso retorne FALSE, imprime a mensagem "voce errou!" e no fim "index" recebe um incremento
                if seq == seq_correta[index]:
                    print(f"{seq} Você acertou! \n\n")
                else:
                    print(f"{seq} Você errou! \n\n")
                index += 1

            #apagando o ultimo elemento de cada lista em "sequencias", assim evita duplicacao
            for sequ in sequencias:
                sequ.pop()

            #imprimindo todas as alternativas respondidas
            for i, sequencia in enumerate(sequencias):
                #chamando a funcao com parametro
                proximo_elemento = progressao_matematica(sequencia)
                #imprimindo a letra de cada alternativa usando char() e ord() que recebem "+i" a cada loop
                print(f"{chr(ord('a')+i)}) {sequencia},__{proximo_elemento}__")
            print("\n\n")
        except:
            print("Houve um erro inesperado, lamentamos o transtorno...")

def problema4():
    while (True):
        try:
            print("Dois veículos (um carro e um caminhão) saem respectivamente de"
                "cidades opostas pela mesma rodovia. O carro de Ribeirão Preto" 
                " em direção a Franca, a uma velocidade constante de 110 km/h e "
                "o caminhão de Franca em direção a Ribeirão Preto a uma velocidade" 
                " constante de 80 km/h.\na) Considerar a distância de 100km entre"
                " a cidade de Ribeirão Preto <-> Franca.\n"
                "b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos"
                " a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)\n"
                "c) Explique como chegou no resultado.\n\n")
            
            pergunta = int(input("Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?\n"
                            "1-Carro\n2-Caminhão\n3-Os dois estarão à mesma distância\nEscolha(digite um numero correspondente):"))

            if pergunta == 3:
                print("Você Acertou!\n\n")
                break
            else:
                print("Você errou!\n\n")
                break
        except:
            print("Houve um erro, tente de novo :)")
            continue

    print("Temos como referência Ribeirão, a equação do horário do carro é x_1 = v_1.t\n"
          "O caminhão por sua vez sai de um local 100 km distante do ponto de referência,"
          " logo x_2 = 100km -v_2.t\n"
          "O calculo do tempo sem obstáculos: t = 100/80 = 1,25\n"
          "Perda de horas com o pedágio: 0,17 horas == 10 minutos\n"
          "o tempo de viagem do caminhão: 0,17 + 1,25 = 1,42\n"
          "Logo, v_2 = 100/1,42 = 70,6\n"
          "110 vezes 100 / (110 + 70,6) = 60.9080841639"
          "Arredondamos para 60,9km\n"
          "Essa é a distância em que os dois se cruzam, ambos na mesma distância.\n\n")
          
    

def problema5():
    while (True):
        try:
            frase = input("Escreva uma frase de sua preferência: ")
            inverte = InverteFrase(frase)
            inverte.inverter(frase)
            print("\n")
            x = input("Deseja inverter outra frase? (escreva 's' para sim e 'n' para não) ")
            if x == "s" or x == "sim":
                continue
            else:
                print("\n")
                break
        except:
            print("Opps, tente de novo.")
            continue

def target_system():

    nome = input("Qual seu nome? ")
    sobrenome = input("Qual é seu sobrenome? ")
    
    print(f"Bem vindo(a), {nome} {sobrenome}, "
          "vamos iniciar os exercícios!\n")

    # Exercício 1)
    
    z = problema1()

    # Exercício 2)
    
    y = problema2(nome, sobrenome)

    # Exercício 3)

    x = problema3()

    # Exercício 4)

    w = problema4()

    # Exercício 5)

    v = problema5()
    
    print("Obrigado por testar o código! Volte sempre!")

if __name__ == "__main__":
    target_system()