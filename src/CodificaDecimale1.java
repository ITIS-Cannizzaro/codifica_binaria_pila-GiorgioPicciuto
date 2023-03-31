public class CodificaDecimale1 {
	    public static void main(String[]args){
	        Stack <Integer> pila = new Stack<Integer>();
	        int num=64;
	        int resto=0;
	        while(num>0){
	            resto=(num%2);
	            pila.push(resto);
	            num=num/2;
	        }
	        while(pila.isEmpty()==false){
	            System.out.println(pila.pop());
	        }
	    }
	}

