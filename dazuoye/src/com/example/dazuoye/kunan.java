package com.example.dazuoye;
import Szys.Szys1;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kunan extends Activity {
	private EditText tv1;
	private TextView tv2,tv3;
	private  Button btn1,btn2;
	int i=0,b=0;
	boolean sh=true;

		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.kunan);
			tv1=(EditText) findViewById(R.id.editText1);
			tv2=(TextView) findViewById(R.id.textView2);
			tv3=(TextView) findViewById(R.id.textView1);
			btn1=(Button) findViewById(R.id.button1);
			btn2=(Button) findViewById(R.id.button2);
			ActionBar actionBar = getActionBar();//��ȡActionBar����
			actionBar.setDisplayShowHomeEnabled(true);//��ʾӦ�ó���ͼ��
			actionBar.setDisplayHomeAsUpEnabled(true);
		    final Szys1 []binder=new Szys1[10];
			for(int a=0;a<10;a++)
			binder[a]=new Szys1((double)((int)(Math.random()*10000))/100,(double)((int)(Math.random()*10000))/100,(double)((int)(Math.random()*10000))/100,(double)((int)(Math.random()*10000))/100,(int)(Math.random()*3+1),(int)(Math.random()*3+1),(int)(Math.random()*3+1),(int)(Math.random()*5+1));
			//binder[a]=new Szys1((double)((int)(Math.random()*100)),(double)((int)(Math.random()*100)),(double)((int)(Math.random()*100)),(double)((int)(Math.random()*100)),1,1,1,1);
			tv2.setText(binder[b].str());		
		   	btn1.setOnClickListener(new View.OnClickListener() {
						
			        	
				public void onClick(View arg0) {
					if(sh==true)
					{
						
							tv1.getText().toString();
							if(String.valueOf(binder[b].b()).equals(tv1.getText().toString())==true)
							{
								i++;	
			        		Toast.makeText(kunan.this, "��ϲ������", Toast.LENGTH_LONG).show();
							}
							else
							{
			        		//tv2.setBackgroundColor(R.color.red); 
			        		Toast.makeText(kunan.this, "���ź���������", Toast.LENGTH_LONG).show();
							}
							sh=false;
							btn1.setText("��һ��");
						
		        	}
					else if(sh==false)
					{	
						if(b==9)
						{
							Intent intent=new Intent();
						    intent.setClass(kunan.this,kunan.class);
						    startActivity(intent);
						    kunan.this.finish();
						}
						else if(b<8)
		       			{		
			       			b++;
			       			tv2.setBackgroundColor(getResources().getColor(android.R.color.white));
			       			tv2.setText(binder[b].str());
			       			tv1.setText(null);
			       			btn1.setText("�ύ");
		       			}
		       			else if(b==8)
		       			{
			       			b++;
			       			tv2.setText(binder[b].str());
		       			}	
		       			sh=true;
		        	}
				}
			});
		   	btn2.setOnClickListener(new View.OnClickListener() {				
				public void onClick(View arg0) {
					tv3.setText("");		
					}
			 });
		}
		public boolean onOptionsItemSelected(MenuItem item) {
			// TODO Auto-generated method stub
			switch (item.getItemId()) {
			case R.id.help:
		//		Intent intent1=new Intent(this,Help.class);
			//	startActivity(intent1);
				break;
			case R.id.newgame:
			//	Intent intent2=new Intent(this,New_Game.class);
			//	startActivity(intent2);
				break;
			case R.id.about:
			//	Intent intent3=new Intent(this,About.class);
			//	startActivity(intent3);
				break;
			case android.R.id.home:
				//��������MainActivity��Intent
				Intent intent=new Intent(this,MainActivity.class);
				//��Ӷ����Flag����Activityջ�д���MainActivity֮�ϵ�Activity����
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				break;
			default:
				break;
			}
			return super.onOptionsItemSelected(item);
		}
}
