package view;

import controller.ClienteJpaDAO;
import model.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Cliente cliente = new Cliente();
      cliente.setCpf("434.706.748-84");
      cliente.setId(1);
      cliente.setNome("Musketo");
      cliente.setRg("36.039.659-8");
      ClienteJpaDAO.getInstance().merge(cliente);
      System.out.println("Objetos salvo com sucesso!!!");
    }
}
