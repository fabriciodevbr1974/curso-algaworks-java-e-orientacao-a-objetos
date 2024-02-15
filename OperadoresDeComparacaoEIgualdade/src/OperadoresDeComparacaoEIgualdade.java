public class OperadoresDeComparacaoEIgualdade {

  public static void main(String[] args) {
    //Comparação: > (maior), >= (maior ou igual), < (menor), <= (menor ou igual)
    //Igualdade: == (igual) e != (diferente)

    int a = 10;
    int b = 5;
    int c = 2;

    boolean maior = b > a;
    boolean maiorOuIgual = b >= a;
    boolean menor = a < b;
    boolean menorOuIgual = a <= 10;
    boolean igual = a == b - c;
    boolean diferente = a != c;

    System.out.println(maior);
    System.out.println(maiorOuIgual);
    System.out.println(menor);
    System.out.println(menorOuIgual);
    System.out.println(igual);
    System.out.println(diferente);

    //Operador unário
    boolean bloqueado = true;
    bloqueado = !bloqueado;
    System.out.println("Bloqueado: " + bloqueado);
    bloqueado = !bloqueado;
    System.out.println("Bloqueado: " + bloqueado);
  }

}
