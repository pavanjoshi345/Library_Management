
import java.util.*;
class Bookapp
{
    private int id;
    private String name;
    private int price;
    private String author;
    private String publication;
   
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}

    
}
public class Book 
{
	public static void main(String[] args)
	{
	   int size;
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Total Number of books in library");
       size=sc.nextInt();
	   Bookapp b[]=new Bookapp[size];
	   int id,choice,sid,sprice;
	   String name,sname,sauthor;
	   int price;
	   String ch;
	   String author;
	   String publication,spublication;
	   int i,j,temp,flag=0;
	   do {
	   System.out.println("Enter the your choice:");
	   System.out.println("\t1.Add All Book Details");
	   System.out.println("\t2.Display All Book Details");
	   System.out.println("\t3.Display Book Details whose price range 100 to 500");
	   System.out.println("\t4.Search Book Details by Using id,name,price,author");
	   System.out.println("\t5 Update Book Details by Using id,name,price,publication");
	   System.out.println("\t6.Delet Book Details by Using id,name,price,publication,author");
	   System.out.println("\t7.Count Book Details by Using nane,price,publication,author");
	   System.out.println("\t8.Sort  Book Details In Ascending Order By Using Id");
	   System.out.println("\t9.Exit The Code");
	   choice=sc.nextInt();
  	   System.out.println("Your choice is:"+choice);
      
	   switch(choice)
	   {
	         case 1 : for(i=0; i<b.length; i++)
	              {
	    	         b[i]=new Bookapp();
	    	         System.out.println("\nEnter the Id,Name,Price,Author,Publication Of Book");
	    	         id=sc.nextInt();
	    	         name=sc.next();
	    	        price=sc.nextInt();
	    	        author=sc.next();
	    	        publication=sc.next();
	    	        b[i].setId(id);
	    	        b[i].setName(name);
	    	        b[i].setPrice(price);
	    	        b[i].setAuthor(author);
	    	       b[i].setPublication(publication);
	          }
	          break;
	          
	     case 2:
	         	System.out.println("\nBooId\t\t  Name\t\t  Price\t\t  Author\t Publication");
	           for(i=0; i<b.length; i++)
	         {
	        	     System.out.println("---------------------------------------------------------------------------------");
	    	     System.out.println(b[i].getId()+" \t\t  "+b[i].getName()+"\t\t  "+b[i].getPrice()+"\t\t  "
	    			  +b[i].getAuthor()+"\t\t  "
	    			  +b[i].getPublication());
	         }
	                 System.out.println("---------------------------------------------------------------------------------");
	       break;
	    
	     
	    case 3:       	System.out.println("\nBooId\t Name\t  Price\tAuthor\t  Publication");
	    	    for(i=0; i<b.length; i++)
	          {
	       	       if(b[i].getPrice()>=100 && b[i].getPrice()<=500)
	       	       {
	       	    	System.out.println(b[i].getId()+" \t  "+b[i].getName()+"\t  "+b[i].getPrice()+"\t  "
	  	    			  +b[i].getAuthor()+"\t  "
	  	    			  +b[i].getPublication());
	       	       }
	         }
	    	  break;
	    	  
	    case 4: int cc,f=0;
	          System.out.println("Enter the your choice");
	          System.out.println("1.Using Book Id");
	          System.out.println("2.Using Book Name");
	          System.out.println("3.Using Book Price");
	          System.out.println("1.Using Book Author");
              cc=sc.nextInt();
              switch(cc)
              {
     
                 case 1: System.out.println("Enter the Book Id for Check");
                         sid=sc.nextInt();
                         for(i=0; i<b.length; i++)
                         {
                        	  if(b[i].getId()==sid)
                        	  {
                        		   f=1;
                        		   break;
                        	  }
                         }
                         if(f==1)
                         {
                        	 System.out.println("Book Id is Found");
                         }
                         else {
                        	  System.out.println("Book Id is Not found");
                         }
                         break;
                 case 2: System.out.println("Enter the Book Name");
                         sname=sc.next();
                         for(i=0; i<b.length; i++)
                         {
                        	  if(b[i].getName().equals(sname))
                        	  {
                        		   f=1;
                        		   break;
                        	  }
                         }
                         if(f==1)
                         {
                        	  System.out.println("Book Name is Found");
                        	  
                         }
                         else
                         {
                             System.out.println("Book Name is Not found");
                             break;
                         }
                          break;
                          
                 case 3: System.out.println("Enter the Book Price");
                         sprice=sc.nextInt();
                         for(i=0; i<b.length; i++)
                         {
                        	  if(b[i].getPrice()==sprice)
                        	  {
                        		   f=1;
                        		   break;
                        	  }
                        	  if(f==1)
                        	  {
                        		   System.out.println("Book Price is Found");
                        		   break;
                        	  }
                        	  else {
                        		    System.out.println("Bookk Price is Not Found");
                        		    break;
                        	  }
                         }
                     
                 case 4: System.out.println("Enter the Author of Book");
                          sauthor=sc.next();
                          for(i=0; i<b.length; i++)
                          {
                        	   if(b[i].getAuthor().equals(sauthor))
                        	   {
                        		   f=1;
                        		   break;
                        	   }
                          }
                          if(f==1)
                          {
                        	   System.out.println("Book Author Is Found");
                        	   
                          }
                          else {
                        	   System.out.println("Book Author Is Not found");
                        	  
                          }
                          break;
                   default: System.out.println("Wrong choice");
                    
              }
	    	 break;
	    case 5 : int choice1,cid,cprice,mid,mprice;
	             String cname,cpublication,mname,mpublicaiton;
	             System.out.println("Enter the your choice");
	             System.out.println("1.Book Id");
	             System.out.println("2.Book Name");
	             System.out.println("3.Book Price");
	             System.out.println("4.Book Publication");
	             System.out.println("5.Display All Update Data");
	             choice1=sc.nextInt();
	         
	             switch(choice1)
	             {
	               case 1: System.out.println("Enter the Book Id for check & updated");
	                       mid=sc.nextInt();
	                       System.out.println("Enter the Id of Book for update");
	                       cid=sc.nextInt();
	                       for(i=0; i<b.length; i++)
	                       {
	                    	   if(b[i].getId()==mid)
	                    	   {
	                    		    b[i].setId(cid);
	                    	   }
	                    	   else
	                    	   {
	                    	        System.out.println("Id is not found");
	                    	        break;
	                    	   }
	                    	   System.out.println("Your Update Is Successfully");
	                       }
	                       break;
	               case 2: System.out.println("Enter the Book Name for check");
	                        mname=sc.next();
	                       System.out.println("Enter the New Book Name for update");
	                       cname=sc.next();
	                       for(i=0; i<b.length; i++)
	                       {
	                    	    if(b[i].getName().equals(mname))
	                    	    {
	                    	    	b[i].setName(cname);
	                    	    }
	                    	    else {
	                    	    	 System.out.println("This Name is Not Found");
	                    	    	 break;
	                    	    }
	                    	    System.out.println("Update Is Successfully");
	                       }
	                        break;
	             case 3: System.out.println("Enter the Price of Book for check data");
	                     mprice=sc.nextInt();
	                     System.out.println("Enter the New Price of Book for Update");
	                     cprice=sc.nextInt();
	                     for(i=0; i<b.length; i++)
	                     {
	                    	 if(b[i].getPrice()==mprice)
                            {
                            	b[i].setPrice(cprice);
	                        }
                            else {
                            	 System.out.println("Your Price is Not Found");
                            	 break;
                            }
                            System.out.println("Update Is Successfully");
	                     }
	                      break;
	               
	             case 4: System.out.println("Enter the publication for check data");
	                     mpublicaiton=sc.next();
	                     System.out.println("Enter the New Publication for update");
	                     cpublication=sc.next();
	                     for(i=0; i<b.length; i++)
	                     {
	                    	 if(b[i].getPublication().equals( mpublicaiton))
	                    	 {
	                    		 b[i].setPublication(cpublication);
	                    	 }
	                    	 else {
	                    		  System.out.println("Your Data Is Not Found");
	                    		  break;
	                    	 }
	                    	 System.out.println("Update is Successfully");
	                     }
	                     break;
	               default: System.out.println("Your choice is Wrong");
	             } 
	    	      
	                break;
	    case 6 : 
	    	      int did,dprice,chh;
	    	      String dname,dauthor,ff;
	    	      System.out.println("Enter the your choice");
	    	      System.out.println("1.Using Book Id");
	    	      System.out.println("2.Using Book Name");
	    	      System.out.println("3.Using Book Price");
	    	      System.out.println("4.Using Book Author");
	    	      chh=sc.nextInt();
	    	      switch(chh)
	    	      {
	    	         case 1: System.out.println("Enter the Book Id for Delet data");
	    	                 did=sc.nextInt();
	    	                 for(i=0; i<b.length; i++)
	    	                 {
	    	                	 if(b[i].getId()!=did)
	    	                	 {
	    	                		  System.out.println(b[i].getId()+" \t  "+b[i].getName()+"\t  "+b[i].getPrice()+"\t  "
	    	            	    			  +b[i].getAuthor()+"\t  "
	    	            	    			  +b[i].getPublication());
	    	                	 }
	    	                 }
	    	                 System.out.println("Delet is Successfully");
	    	                 break;
	    	         case 2: System.out.println("Enter the Name of Book for Delet Data");
	    	                  dname=sc.next();
	    	                  for(i=0; i<b.length; i++)
	    	                  {
	    	                	   if(b[i].getName().equals(dname))
	    	                	   {
	    	                		   
	    	                	   }
	    	                	   else {
	    	                		   System.out.println(b[i].getId()+" \t  "+b[i].getName()+"\t  "+b[i].getPrice()+"\t  "
		    	            	    			  +b[i].getAuthor()+"\t  "
		    	            	    			  +b[i].getPublication());
	    	                	   }
	    	                  }
	    	                  System.out.println("Delet is Successfully");
	    	                  break;
	    	                  
	    	         case 3: System.out.println("Enter the Price of Book for delet");
	    	                dprice=sc.nextInt();
	    	                for(i=0; i<b.length; i++)
	    	                {
	    	                    if(b[i].getPrice()!=dprice)
	    	                    {
	    	                    	System.out.println(b[i].getId()+" \t  "+b[i].getName()+"\t  "+b[i].getPrice()+"\t  "
	    	            	    			  +b[i].getAuthor()+"\t  "
	    	            	    			  +b[i].getPublication());
	    	                    }
	    	                    
	    	                }
	    	                System.out.println("Delet is Successfully");
	    	                break;
	    	                
	    	         case 4: System.out.println("Enter the author od Book for Delet");
	    	                 dauthor=sc.next();
	    	                 for(i=0; i<b.length; i++)
	    	                 {
	    	                	 if(b[i].getAuthor().equals(dauthor))
	    	                	 {
	    	                		 
	    	                	 }
	    	                	 else {
	    	                		 System.out.println(b[i].getId()+" \t  "+b[i].getName()+"\t  "+b[i].getPrice()+"\t  "
	    	            	    			  +b[i].getAuthor()+"\t  "
	    	            	    			  +b[i].getPublication());
	    	                	 }
	    	                 }
	    	                 System.out.println("Delet is Successfully");
	    	               break;
	    	  
	    	      default: System.out.println("Wrong Choice");
	    	      }
	    case 7:  int ch2,count=0,a=0,m=0,c=0,k=0;
	             String ctname,dpublication,kauthor;
	    	   System.out.println("Enter the your choie:");
	    	   System.out.println("1.Using By Book Name");
	    	   System.out.println("2.Using By Book Price");
	    	   System.out.println("3.Using By Book Publication");
	    	   System.out.println("4.Using By Book Author");
	           ch2=sc.nextInt();
	           switch(ch2)
	           {
	              case 1:
	            	  System.out.println("Enter the Book Name");
                      ctname=sc.next();
                      for(i=0; i<b.length; i++)
                      {
                     	  if(b[i].getName().equals(ctname))
                     	  {
                     		  count++;
                     	  }
                      }
                      System.out.println("Total Number of that Book Name is:"+count);
                       break;
                       
	              case 2: System.out.println("Enter the Price Of Book for Counting");
	                      dprice=sc.nextInt();
	                      for(i=0; i<b.length; i++)
	                      {
	                    	   if(b[i].getPrice()==dprice)
	                    	   {
	                    		    m++;
	                    	   }
	                      }
	                      System.out.println("Total Number of that Book Price is:"+m);
	                       break;
	              case 3: System.out.println("Enter the Publication of Book");
	                      dpublication=sc.next();
	                      for(i=0; i<b.length; i++)
	                      {
	                    	  if(b[i].getPublication().equals(dpublication))
	                    	  {
	                    		   a++;
	                    	  }
	                      }
	                       System.out.println("Totoal Number of Book Publication is:"+a);
	                       break;
	              
	              case 4: System.out.println("Enter the author of Book");
	                      kauthor=sc.next();
	                      for(i=0; i<b.length; i++)
	                      {
	                    	  if(b[i].getAuthor().equals(kauthor))
	                    	  {
	                    		 k++;
	                    	  }
	                      }
	                      System.out.println("Total Number of Book author is:"+k);
	                      break;
                 default: System.out.println("Wrong choice");
                }
	    case 8: 
	          for(i=0; i<b.length; i++)
	          {
	        	   for(j=i+1; j<b.length; j++)
	        	   {
	        		   if(b[i].getId()>b[j].getId())
	        		   {
	        			    Bookapp tem=b[i];
	        			    b[i]=b[j];
	        			    b[j]=tem;
	        		   }
	        	   }
	          }
	          System.out.println("Data Accending Using Id");
	           for(i=0; i<b.length; i++)
	           {
	        	   System.out.println(b[i].getId()+" \t  "+b[i].getName()+"\t  "+b[i].getPrice()+"\t  "
	 	    			  +b[i].getAuthor()+"\t  "
	 	    			  +b[i].getPublication());
	           }
	            break;
	      
	    case 9:    System.out.println("-----Your are Exited-------");
	               System.out.println("Thank For Upload Information.");
	    	      System.exit(0);
	         
	              break;
	    default: System.out.println("Your Choice Is Wrong....");
	   }
	    System.out.println("Do you want to Continue then press YES or yes");
        ch=sc.next();
	   }
	   
	   while(ch.equals("YES") || ch.equals("yes"));
	   
	
	}
}


	

