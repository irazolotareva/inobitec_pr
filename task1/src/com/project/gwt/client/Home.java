package com.project.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;


public class Home implements EntryPoint {
	
	private Label msg = new Label("boa->parrot");
	private Button btn = new Button("Go");
	private TextBox t1 = new TextBox();
	private TextBox t2 = new TextBox();
	//private int aInt =0;
//	private LittleForm form = new LittleForm();

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		//form.setText("new text");
		//RootPanel.get().add(form);
		RootPanel.get().add(msg);
		RootPanel.get().add(t1);
		RootPanel.get().add(btn);
		RootPanel.get().add(t2);
		
		
		//int chislo=Integer.parseInt(b);
		//String aString = Integer.toString(chislo);
	   // String c = "jhgjhg";
		btn.addClickHandler(new ClickHandler()
				{
			public void onClick(ClickEvent event)
			{
				String b = t1.getText();
				int chislo=Integer.parseInt(b);
				chislo = chislo*38;
				String aString = Integer.toString(chislo);
			  //  String aString = Integer.toString(b);
				Window.alert("Mouse on event");
				//t1.setText();
				//t2.setText(aString);
				t2.setText(aString);
			}
				}
				
				);
		
		
	}
	
	

}
