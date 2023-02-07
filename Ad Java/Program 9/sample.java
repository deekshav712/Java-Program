import java.sql.*;
import java.io.*;
public class Sample {
    Sample s=new Sample();
    static Connection con=null;
    static ResultSet rs=null;
    static Statement st=null;
    static void DbConnection(){
        try {
            System.out.println("Inside try");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Inside try after class forname");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/student","deeksha","123");
            System.out.println("Inside try after getConnection");
            st=con.createStatement();
        }
        catch(ClassNotFoundException e1){
            System.out.println("error" +e1.getMessage());
    }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
        }
}
    static void InsertRecord() throws IOException,SQLException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter USN:");
        int s1=Integer.parseInt(br.readLine());
        System.out.println("Enter Name:");
        String s2=br.readLine();
        System.out.println("Enter Sem:");
        int s3=Integer.parseInt(br.readLine());
        System.out.println("Enter Age:");
        int s4=Integer.parseInt(br.readLine());
        st.executeUpdate("insert into deeksha.STUDENTS values("+s1+",'"+s2+"',"+s3+","+s4+")");
        System.out.println("record added");
    }
    static void DeleteRecord() throws IOException,SQLException 
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         Sample.ViewRecord();
         System.out.println("Enter the usn to delete");
         int s1=Integer.parseInt(br.readLine());
         int a=st.executeUpdate("delete from deeksha.STUDENTS where usn="+s1+"");
         if(a>0)
           System.out.println("Record deleted");  
         else
             System.out.println("usn not found");
    }
    static void UpdateRecord() throws IOException,SQLException 
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Sample.ViewRecord();
         System.out.println("Enter the usn to update");
         int s1=Integer.parseInt(br.readLine());
         System.out.println("Enter the name");
         String s2=br.readLine();
         System.out.println("Enter the sem");
         int s3=Integer.parseInt(br.readLine());
         System.out.println("Enter the age");
         int s4=Integer.parseInt(br.readLine());
         
         int executeUpdate=st.executeUpdate("update deeksha.STUDENTS SET "
                 + "S_NAME='"+s2+"',SEM="+s3+",AGE="+s4+" where USN="+s1+"");
         if(executeUpdate>0)
              System.out.println("Record updated"); 
         else
              System.out.println("Record not updated");  
        }
        catch(SQLException e)
        {
           System.out.println(e.getMessage());  
        }
    }
    static void ViewRecord() throws IOException,SQLException {
        rs=st.executeQuery("select * from deeksha.STUDENTS");
        Boolean t=rs.next();
        if(!t)
           System.out.println("No records");  
        else
        {
             System.out.println("USN NAME SEMESTER AGE"); 
             do{
               System.out.println(""+rs.getString(1)+"..."+rs.getString(2)+"..."
                       +rs.getString(3)+"..."+rs.getString(4));  
             }
             while(rs.next());
        }
}
    public static void main(String[] args){
        try 
        {
            DbConnection();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(true)
            {
               System.out.println("1.Insert record"); 
               System.out.println("2.Delete record");
               System.out.println("3.View record");
               System.out.println("4.Update record");
               System.out.println("5.Exit");
               System.out.println("6.Enter your choice:");
               int ch=Integer.parseInt(br.readLine());
               switch(ch)
               {
                   case 1:InsertRecord();
                   break;
                   case 2:DeleteRecord();
                   break;
                   case 3:ViewRecord();
                   break;
                   case 4:UpdateRecord();
                   break;
                   case 5:System.exit(0);
                   default:break;
               }
            }
        }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
    }
    }
