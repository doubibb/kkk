package com.example.dazuoye;

import Szys.Szys;
import android.annotation.SuppressLint;
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

public class Jiandan extends Activity {
	private EditText tv1;
	private TextView tv2;
	private  Button btn1,btn2;
	int i=0,b=0;

		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.jiandan);
			tv1=(EditText) findViewById(R.id.editText1);
			tv2=(TextView) findViewById(R.id.textView2);
			btn1=(Button) findViewById(R.id.button1);
			btn2=(Button) findViewById(R.id.button2);
			ActionBar actionBar = getActionBar();//获取ActionBar对象
			actionBar.setDisplayShowHomeEnabled(true);//显示应用程序图标
			actionBar.setDisplayHomeAsUpEnabled(true);
			
				final Szys []binder=new Szys[10];
				for(int a=0;a<10;a++)
					binder[a]=new Szys((double)((int)(Math.random()*10000))/100,(double)((int)(Math.random()*10000))/100,(int)(Math.random()*3+1));
					tv2.setText(String.valueOf(binder[b].gete())+binder[b].getf()+String.valueOf(binder[b].getd())+"=");
			btn2.setOnClickListener(new View.OnClickListener() {				
		        	@SuppressLint("ResourceAsColor")
				public void onClick(View arg0) {
		        	tv1.getText().toString();
		       		if(String.valueOf(binder[b].b()).equals(tv1.getText().toString())==true)
		        	{
		        		i++;	
		        		Toast.makeText(Jiandan.this, "恭喜你答对了", Toast.LENGTH_LONG).show();
		        	}
		        	else
		        	{
		        		tv2.setBackgroundColor(R.color.red); 
		        		Toast.makeText(Jiandan.this, "很遗憾。你答错了", Toast.LENGTH_LONG).show();
		        	}
		        	}
		  	});
		   	btn1.setOnClickListener(new View.OnClickListener() {
						
			        	
					public void onClick(View arg0) {
		       		if(b<8)
		       		{		
		       			b++;
		       			tv2.setBackgroundColor(getResources().getColor(android.R.color.white));
		       			tv2.setText(String.valueOf(binder[b].gete())+binder[b].getf()+String.valueOf(binder[b].getd()));
		       			tv1.setText(null);
		       		}
		       		else if(b==8)
		       		{
		       			b++;
		       			tv2.setText(String.valueOf(binder[b].gete())+binder[b].getf()+String.valueOf(binder[b].getd())+"="+String.valueOf(binder[i].b()));
		       			btn1.setText("关闭");
		       		}		
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
				//创建启动MainActivity的Intent
				Intent intent=new Intent(this,MainActivity.class);
				//添加额外的Flag，将Activity栈中处于MainActivity之上的Activity弹出
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				break;


			default:
				break;
			}
			return super.onOptionsItemSelected(item);
		}
}
