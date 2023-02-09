package com.jdbclibrary.onelibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        

    	try {
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
    	if(con.isClosed()) {
    		System.out.println("Connection failed");
    	}else {
    		System.out.println("Connection Successfull");
    	}
    			  insert();{
    				String q= "insert into books (bid, bname, bprice) values (?,?,?)";
    				PreparedStatement pstmt=con.prepareStatement(q);
    				
    				int bid;
    				System.out.println("Enter bid:");
    				bid=sc.nextInt();
    				String bname;
    				System.out.println("Enter bname:");
    				bname=sc.next();
    				int bprice;
    				System.out.println("Enter bprice:");
    				bprice=sc.nextInt();
    				
    				
    				
    				pstmt.setInt(1, bid);

    				pstmt.setString(2, bname);

    				pstmt.setInt(3, bprice);
    			

    				pstmt.executeUpdate();
    				System.out.println("Data inserted Sucessfully");
    				}
    				  delete();{
    							String a= "delete from books where bid=?";
    							PreparedStatement pstmt=con.prepareStatement(a); 
    							int id;
    							System.out.println("Enter bid you want to delete:");
    							id=sc.nextInt();
    							pstmt.setInt(1,id);
    							pstmt.execute();
    							
    				  }
    			
    				 update();{
    						String b= "UPDATE books SET bname = ?, bprice = ? WHERE bid = ?";
    						PreparedStatement pstmt=con.prepareStatement(b); 
    						int id;
    						System.out.println("Enter bid you want to update:");
    						id=sc.nextInt();
    						System.out.println("Enter bname:");
    						String bname;
    						bname=sc.next();
    						System.out.println("Enter bprice ");
    						int bprice=sc.nextInt();
    						pstmt.setString(1,bname);
    						pstmt.setInt(2,bprice);
    						pstmt.setInt(3,id);
    						pstmt.execute();
    						
    			  }
    				  show();{
    					  String c = "SELECT *FROM books ";
    						PreparedStatement pstmt=con.prepareStatement(c); 
    						int bid;
    						System.out.println("Enter a bid you want to view:");
    						bid=sc.nextInt();
    						pstmt.setInt(1,bid);
    						pstmt.execute(c);}
    			
    				
    			
    			}catch (Exception e) {
    				// TODO Auto-generated catch block
    	        	System.out.println(e);
    			}
    	    }	
    					
    					
    				
    	   
    	    

    		private static void show() {
    			// TODO Auto-generated method stub
    			
    		}


    		private static void update() {
    			// TODO Auto-generated method stub
    			
    		}


    		private static void delete() {
    			// TODO Auto-generated method stub
    			
    		}

    		private static void insert() {
    			// TODO Auto-generated method stub
    			
    		}
    }