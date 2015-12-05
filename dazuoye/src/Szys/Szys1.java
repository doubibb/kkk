package Szys;



public class Szys1 {
		public double a,b,c,d,e;
		double b2;
		public double result;
		public int a1,b1,c1,d1,b3; 
		public char f,f1,f2;
		public String str,fe1,fe2;
		double fen1,fen2;
		public Szys1(double a,double e,double g,double h,int a1,int b1,int c1,int d1)
		{
			this.c=g;
			this.d=h;
			this.a=a;
			this.b=e;
			this.a1=a1;
			this.b1=b1;
			this.c1=c1;
			this.d1=d1;
		}
		public double geta(){return a;}
		public double getb(){return b;}
		public double getc(){return c;}
		public double getd(){return d;}
		public char getf(){	
			switch(a1)
	        {
            case 1: f='+';break;
            case 2: f='-';break;
            case 3: f='*';break;
            case 4: f='/';break; 
            default: 
            	break;
	        }
			return f;
		}	
		public char getf1(){	
			switch(b1)
	        {
            case 1: f1='+';break;
            case 2: f1='-';break;
            case 3: f1='*';break;
            case 4: f1='/';break; 
            default: 
            	break;
	        }
			return f1;
		}
		public char getf2(){	
			switch(c1)
	        {
            case 1: f2='+';break;
            case 2: f2='-';break;
            case 3: f2='*';break;
            case 4: f2='/';break; 
            default: 
            	break;
	        }
			return f2;
		}
		public double d1(double h1,double h2,int h3) {
			switch(h3)
	        {
	            case 1: e=h1+h2;break;
	            case 2: e=h1-h2;break;
	            case 3: e=h1*h2;break;
	            case 4: e=h1/h2;break;
	        }
			// TODO Auto-generated method stub
			return e;
		}
		public double b(){
			switch(d1)
	        {
	            case 1: 
	            	if(b1>2||c1<=2)
	            		b2=d1(d1(d1(a,b,a1),c,b1),d,c1);	            		
	            	else if(b1<=2&&c1>2)		
	            		b2=d1(d1(a,b,a1),d1(c,d,c1),b1);
	            	break;
	            case 2: 
	            	if(a1>2||c1<=2)
	            		b2=d1(d1(d1(a,b,a1),c,b1),d,c1);
	            	else if(a1<=2&&c1>2)
	            		b2=d1(d1(a,(d1(b,c,b1)),a1),d,c1);
	            	break;
	            case 3: b2=d1(d1(a,b,a1),d1(c,d,c1),b1);break;
	            case 4: 
	            	if(a1>2||c1<=2)
	            		b2=d1(d1(a,d1(b,c,b1),a1),d,c1);
	            	else if(a1<=2&&c1>2)
	            		b2=d1(a,d1(d1(b,c,b1),d,c1),a1);
	            	break;
	            case 5:	
	            	if(b1>2||c1<=2)
	            		b2=d1(a,d1(d1(b,c,b1),d,c1),a1);
	            	else if(b1<=2&&c1>2)
	            		b2=d1(a,d1(b,d1(c,d,c1),b1),a1);
	            	break;
	            case 6:	
	            	if(a1>2||b1<=2)
	            		b2=d1(d1(a,b,a1),d1(c,d,c1),b1);
	            	else if(a1<=2&&b1>2)
	            		b2=d1(a,d1(b,d1(c,d,c1),b1),a1);
	            	break;
	        }
			// TODO Auto-generated method stub
			b3=(int)(b2*100);
			b2=((double)b3/100);
			return b2;
		}
		public double fen1(){
			switch(d1)
			{
			case 1: fen1=d1(a,b,a1);break;     
            case 2: if(a1>2||c1<=2)
            			fen1=d1(a,b,a1);
            		else if(a1<=2&&c1>2)
            			fen1=d1(b,c,b1);
            		break;
            case 3: fen1=d1(a,b,a1);break;
            case 4: fen1=d1(b,c,b1);break;
            case 5:	
            	if(b1>2||c1<=2)
            		fen1=d1(b,c,b1);
            	else if(b1<=2&&c1>2)
            		fen1=d1(c,d,c1);
            		break;
            case 6:	fen1=d1(c,d,c1);break;
			}
			return fen1;
		}
		public double fen2(){
			switch(d1)
			{
			case 1: if(b1>2||c1<=2)
		        		fen2=d1(d1(a,b,a1),c,b1);	            		
		        	else if(b1<=2&&c1>2)		
		        		fen2=d1(c,d,c1);
		        	break;
            case 2: if(a1>2||c1<=2)
	            		fen2=d1(d1(a,b,a1),c,b1); 
	            	else if(a1<=2&&c1>2) 
	            		fen2=d1(a,(d1(b,c,b1)),a1); 
	            	break;
            case 3: fen2=d1(c,d,c1);break;
            case 4: if(a1>2||c1<=2)
        		fen2=d1(a,d1(b,c,b1),a1);
        	else if(a1<=2&&c1>2)
        		fen2=d1(d1(b,c,b1),d,c1);
            break;
            case 5:	
            	if(b1>2||c1<=2)
            		fen2=d1(d1(b,c,b1),d,c1);
            	else if(b1<=2&&c1>2)
            		fen2=d1(b,d1(c,d,c1),b1);
            	break;
            case 6:	fen2=d1(c,d,c1);if(a1>2||b1<=2)
        		fen2=d1(a,b,a1);
        	else if(a1<=2&&b1>2)
        		fen2=d1(b,d1(c,d,c1),b1);
        	break;
			}
			return fen2;
		}
		public String str(){
			switch(d1)
	        {
	            case 1:str="("+String.valueOf(a)+getf()+String.valueOf(b)+")"+getf1()+String.valueOf(c)+getf2()+String.valueOf(d)+'=';break;
	            case 2:str="("+String.valueOf(a)+getf()+String.valueOf(b)+getf1()+String.valueOf(c)+")"+getf2()+String.valueOf(d)+'=';break;
	            case 3:str="("+String.valueOf(a)+getf()+String.valueOf(b)+")"+getf1()+"("+String.valueOf(c)+getf2()+String.valueOf(d)+")"+'=';break;
	            case 4:str=String.valueOf(a)+getf()+"("+String.valueOf(b)+getf1()+String.valueOf(c)+")"+getf2()+String.valueOf(d)+'=';break;
	            case 5:str=String.valueOf(a)+getf()+"("+String.valueOf(b)+getf1()+String.valueOf(c)+getf2()+String.valueOf(d)+")"+'=';break;
	            case 6:str=String.valueOf(a)+getf()+String.valueOf(b)+getf1()+"("+String.valueOf(c)+getf2()+String.valueOf(d)+")"+'='; break;
	        }
			return str;
		}
		public String fe1(){
			switch(d1)
	        {
	            case 1:fe1=String.valueOf(a)+getf()+String.valueOf(b)+'='+String.valueOf(fen1());break;
	            case 2:if(a1>2||c1<=2)   			
	            	fe1=String.valueOf(a)+getf()+String.valueOf(b)+'='+String.valueOf(fen1());
        		else if(a1<=2&&c1>2)
        			fe1=String.valueOf(b)+getf1()+String.valueOf(c)+'='+String.valueOf(fen1());
        		break;
	            case 3:fe1=String.valueOf(a)+getf()+String.valueOf(b)+'='+String.valueOf(fen1());break;
	            case 4:fe1=String.valueOf(b)+getf1()+String.valueOf(c)+'='+String.valueOf(fen1());break;
	            case 5:if(b1>2||c1<=2)
	            	fe1=String.valueOf(b)+getf1()+String.valueOf(c)+'='+String.valueOf(fen1());
            	else if(b1<=2&&c1>2)
	            	fe1=String.valueOf(c)+getf2()+String.valueOf(d)+'='+String.valueOf(fen1());
            		break;
	            case 6:fe1=String.valueOf(c)+getf2()+String.valueOf(d)+'='+String.valueOf(fen1()); break;
	        }
			return fe1;
		}
		public String fe2(){
			switch(d1)
	        {
	            case 1:fe2="("+String.valueOf(a)+getf()+String.valueOf(b)+")"+getf1()+String.valueOf(c)+getf2()+String.valueOf(d)+'=';break;
	            case 2:fe2="("+String.valueOf(a)+getf()+String.valueOf(b)+getf1()+String.valueOf(c)+")"+getf2()+String.valueOf(d)+'=';break;
	            case 3:fe2="("+String.valueOf(a)+getf()+String.valueOf(b)+")"+getf1()+"("+String.valueOf(c)+getf2()+String.valueOf(d)+")"+'=';break;
	            case 4:fe2=String.valueOf(a)+getf()+"("+String.valueOf(b)+getf1()+String.valueOf(c)+")"+getf2()+String.valueOf(d)+'=';break;
	            case 5:fe2=String.valueOf(a)+getf()+"("+String.valueOf(b)+getf1()+String.valueOf(c)+getf2()+String.valueOf(d)+")"+'=';break;
	            case 6:fe2=String.valueOf(a)+getf()+String.valueOf(b)+getf1()+"("+String.valueOf(c)+getf2()+String.valueOf(d)+")"+'='; break;
	        }
			return fe2;
		}
}