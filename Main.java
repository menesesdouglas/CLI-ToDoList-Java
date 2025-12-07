import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        //TO DO LIST
        Scanner input = new Scanner(System.in);
        ArrayList<String>  lista = new ArrayList<>();
        boolean true_or_false = true;
        while(true_or_false){
            for(int i=0;i<="To Do List".length();i++){
                System.out.print("=");
            }
            System.out.print(" To Do List ");
            for(int i=0;i<="To Do List".length();i++){
                System.out.print("=");
            }
            
            System.out.println("\n1. Adicionar tarefa\n2. Ver tarefas\n3.Finalizar Tarefa\n0. Sair");
            int choice = input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Nome da tarefa: ");
                    String name = input.next();
                    
                    lista.add(name);
                    System.out.printf("Tarefa %s adicionada.\n",name);
                    break;
                case 2:
                    System.out.println("Tarefas:");
                    for(int i=0;i<lista.size();i++){
                        System.out.printf("    .%d %s\n",i+1,lista.get(i));
                    }
                    break;
                case 3:
                    if(lista.isEmpty()){
                        System.out.println("Sem tarefas na lista.");
                        break;
                    } else {
                        System.out.print("Escreva o nº da tarefa: ");
                        int tarefaNumber = input.nextInt();
                        if(tarefaNumber<=0 || tarefaNumber>lista.size()){
                            System.out.println("Tarefa inválida!");
                        } else if(tarefaNumber>=0 && tarefaNumber<=lista.size()){
                            System.out.printf("Finalizando tarefa '%s'...\n",lista.get(tarefaNumber-1));
                            lista.remove(tarefaNumber-1);
                            System.out.println("Tarefa finalizada!");
                        }
                        break;
                    }
                case 0:
                    System.out.println("Saindo...");
                    true_or_false = false;
                    break;
            }
        }
    }
}
