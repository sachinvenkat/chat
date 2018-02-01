/*
 * No License for this file
 */
package chatme;


import java.awt.*;


import java.io.*;


/**
 *
 * @author sachin
 */

public class FrenzChat extends Frame implements ActionListener,Runnable  {
	

	
	private Label label1,label2;
	
private Button button1;
	
private TextArea textarea1,textarea2;
	
ServerSocket socket;
	
Socket insocket;
	
int port=13;
	
Thread thread;
	


   	ServerSocket server;
	
	Socket connection=null;
	

	InputStream in;
	
	OutputStream out;
	



public static void main(String[] arg)

{
		
	new FrenzChat();
	
}
	

	public FrenzChat()
	
	{
		
		setLayout(null);
		


		label2=new Label("Frenz Chat");
		
		label2.setBounds(100,35,200,30);
		
		label2.setFont(new Font("Times New Roman",Font.BOLD,36));
        
		add(label2);
        


		setSize(400,400);

	        setVisible(true);
        
		setTitle("Chatter");
        

        	button1 = new Button("Send");
        
		button1.setBounds(160, 360, 60, 20);
        
		add(button1);
        
		button1.addActionListener(this);
    
    
       	textarea1 = new TextArea("", 7, 45, 		TextArea.SCROLLBARS_VERTICAL_ONLY);
   
    		textarea1.setBounds(20, 80, 340, 100);
        //textarea1.setText("hi");
        
    		add(textarea1); 
        
       
    		 label1=new Label();
        
    		label1.setBounds(20,210,100,20);
        
label1.setText("Type Here");
        
add(label1);
        

        textarea2 = new TextArea("", 7, 45, TextArea.SCROLLBARS_VERTICAL_ONLY);
        
		textarea2.setBounds(20, 230, 340, 120);
        
		textarea2.setForeground(Color.RED);
        
		add(textarea2); 
        



        this.addWindowListener(new WindowAdapter()
 
	 {
        
		public void windowClosing(WindowEvent e)
  
		{
        		
		System.exit(0);
        		
		try  	{

    			socket.close();
        			
			}
		catch(Exception ex){}
        
		}

        }
    );
    

 }

