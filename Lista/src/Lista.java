
public class Lista {
	private Nodo head;
	
	public Lista(){
		head=null;
	}
	
	
	public String toString(){
		String s="";
		for(Nodo p = head;p!=null;p = p.getLink()){
			s= s + " - " + p.getInfo();
		}
		return s;
	}

	public int conta1(){
		int c=0;
		for(Nodo p=head; p.getLink()!=null;p=p.getLink()){
			c++;
		}
	return c;
	}
	
	public boolean conta2(){
		boolean siono=false;
		for(Nodo p=head; p.getLink()!=null;p=p.getLink()){
			siono=true;
			return siono;
		}
	return siono;
	}
	
	
	public int conta(){
		return conta3(head);
	}
	public int conta3(Nodo p){
		if(p==null){
			return 0;
		}else{
			return 1+conta3(p.getLink());
		}
	}
/////////////////////////INSERISCI/////////////////////////////
	public void inserisciInTesta(int x){
		Nodo pn=new Nodo();
		pn.setInfo(x);
		pn.setLink(head);
		head=pn;
	}
	
	public void inserisciInCoda(int x){
		Nodo pn=new Nodo();
		if(head==null){
			head=null;
		}else{
			for(Nodo p=head; p.getLink()!=null;p=p.getLink()){
				p.setLink(pn);
			}
		}
	}
	
	public void inserisciInPos(int x,int pos){
		int n=conta();
		int i=0;
		Nodo pn=new Nodo(x,null);
		if(head==null){
			head=pn;
		}
		if(pos>n){
			inserisciInCoda(x);
		}else{
			for(Nodo p=head;p!=null;p=p.getLink()){
				if(pos==i){
					p.setLink(pn);
					pn.setLink(p.getLink());
				}
				i++;
			}
		}
	}

/////////////////////ELIMINA///////////////////////
	public void eliminaInTesta(){
		Nodo p=head;
		if(head==null){
			return;
		}else{
			head=p.getLink();
			//head=head.getLink();
		}
	}
	
	public void eliminaInCoda(){
		if(head==null){
			return;
		}
		if(conta()==1){
		//if(head.getLink()==null)
			head=null;			
		}else{
			Nodo p=head;
			//while(p.getLink().getLink()!=null){
			//	p=p.getLink();
			//}
			int n=conta();
			for(int i=0;i<n-2;i++){
				p.getLink();
			}
		}

	}
	
	public void eliminaInPos(int pos){
		int i=0;
		if(head==null){
			if(pos==0){
				head=head.getLink();
			}
		}else{
			
			for(Nodo p=head;p!=null;p=p.getLink()){
				if(i==pos-1){
					p.setLink(p.getLink().getLink());
				}
			}
		}
		
	}
	
	public void rovesciaLista(int[] v){
		for(int i=0; i<v.length;i++){
			inserisciInCoda(v[i]);
		}
	}
	
	public int shuffle(int k,int h){
		int N=conta();
		int i=0;
		Nodo pk=new Nodo();
		Nodo ph=new Nodo();
		int temp;
		
		if(k==h){
			return 0;	
		}
		if(head==null){
			return -1;
		}
		if(head.getLink()==null){
			return -1;
		}

		for(Nodo p=head;p!=null;p=p.getLink()){
			if(i==k){
				pk.setInfo(p.getInfo());
			}
			if(i==h){
				ph.setInfo(p.getInfo());
			}		
		i++;
		
		}
		temp=pk.getInfo();
		pk.setInfo(ph.getInfo());
		ph.setInfo(temp);	
		
	return 1;
	}
	
	///METODO FATTO IN CLASSE (INNOCENTE)
	/*public int shuffle(int k,int h){
		if(k == h){
			return 0;
		}if(h < 1 || k >= conta()){
			return -1;
		}else{
			Nodo k1 = new Nodo();
			Nodo h1 = new Nodo();
			int c = 0;
			Nodo p = head;
			
			while(p!=null){
				if(c == k){
					k1.setInfo(p.getInfo());
				}if(c == h){
					h1.setInfo(p.getInfo());
				}
				c++;
				p = p.getLink();
			}
			
			Nodo d = head;
			int d1 = 0;
			while(d!=null){
				if(d1 == k){
					d.setInfo(h1.getInfo());
				}if(d1 == h){
					d.setInfo(k1.getInfo());
				}
				d1++;
				d = d.getLink();
			}
			
			return 1;
			
			
		}
	*/
	
	
	
	public void lastFirst(){
		int i=0;
		int temp=0;
		Nodo ultimo=new Nodo();
		int N=conta();
		
		for(Nodo p=head;p!=null;p=p.getLink()){
			if(i==N-1){
				ultimo.setInfo(p.getInfo());
			}
			i++;
		}
		temp=head.getInfo();
		head.setInfo(ultimo.getInfo());
		ultimo.setInfo(temp);	
	}
	
	

	
	
	

}
