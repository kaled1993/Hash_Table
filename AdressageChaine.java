
package HashTable;

import java.util.Random;

public class AdressageChaine {
    
	private ElementListe m[] ;
	private int n ;
        
	public AdressageChaine (int x){
		n=x ;
		m= new ElementListe[n] ;
                Random gen = new Random();
                for(int j=0;j<n;++j)
                 insert((Math.abs(gen.nextInt()))%n);
	}


	public void insert(int elt) {
	int k =hashfunction(elt);
		if(m[k]==null)
		m[k]=new ElementListe(elt,null) ; 
		else {
                        ElementListe e = new ElementListe(elt,null);
			m[k].suivant=e;
			
		}
	}
	public int search(int elt) {
		int key = hashfunction(elt);
		ElementListe e = m[hashfunction(elt)] ;
                if(e!=null){
		while ((elt != e.valeur)&&(e.suivant!=null)) {
			e=e.suivant ;
		}
		if (elt== e.valeur)
			return key ; 
                }  
            return -1;
	}
	private int hashfunction (int elt) {
		int k ; 
		k=elt % 17 ;
		while (k > n) {
			k=k%17 ;
		}
		return k ;
	}
        public void remove(int elt)
        {
            int k =hashfunction(elt);
		if(m[k]==null)
		return ; 
		else {
                    m[k]=null;
		}
        }  
}


