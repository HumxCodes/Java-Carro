// 1) Criamos uma Main classe customizada com a palavra-chave class.
public class Main {
  // 2) Criamos os métodos fullThrottle() e speed() na Main classe.
  public void fullThrottle() {
    System.out.println("Acelerando o carro!");
  }

  // 3) O Aceleracao() método e o velocidade() método imprimirão algum texto quando forem chamados.
  // 4) O velocidade() método aceita um int parâmetro chamado maxVelocidade - usaremos isso em 8).
  public void speed(int maxSpeed) {
    System.out.println("Velocidade máxima: " + maxSpeed + " km/h");
  }

  // 6) Em seguida, vá para o main() método, que você já sabe que é um método Java
  // integrado que executa seu programa (qualquer código dentro de main é executado).
  public static void main(String[] args) {
    // 5) Para utilizar a Main classe e seus métodos, precisamos criar um objeto da Main Classe.
    // 7) Usando a new palavra-chave, criamos um objeto com o nome myCar.
    Main myCar = new Main();

    // 8) Em seguida, chamamos os métodos aceleracao() e velocidade() no myCar objeto
    // e executamos o programa usando o nome do objeto (myCar), seguido de um ponto ( .),
    // seguido do nome do método (fullThrottle() e speed(200)). Observe que adicionamos um
    // int parâmetro 200 dentro do speed() método.
    myCar.fullThrottle();
    myCar.speed(200);
  }
}
