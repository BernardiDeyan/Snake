
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Nodo nod = new Nodo();
       Lista li = new Lista();
       li.inserisciInTesta(10);
       System.out.println(li);
       li.inserisciInTesta(6);
       System.out.println(li);
       li.inserisciInTesta(5);
       System.out.println(li);
       li.inserisciInTesta(2);
       System.out.println(li);
       li.inserisciInCoda(200);
       System.out.println(li);
       li.inserisciInCoda(300);
       System.out.println(li);
       
       System.out.println(""+ li);
       li.eliminaInTesta();
       System.out.println(li);
       li.eliminaInCoda();
       System.out.println(li);
       li.inserisciInPos(12, 1);
       System.out.println(li);
       li.lastFirst();
       System.out.println(li);
       
	}

}
