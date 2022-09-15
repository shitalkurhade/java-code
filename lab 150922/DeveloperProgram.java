java.util.Scanner

class DeveloperProgram {

int id;
String name;
String location;

DeveloperProgram(int id) {
       this.id = id;
}

DeveloperProgram(int id,String name) {
       this.id = id;
       this.name = name;
}

DeveloperProgram(int id,String name,String location) {
       this.id = id;
       this.name = name;
       this.location = location;
}

void showData() {
           System.out.println("ID: "+ id);
           System.out.println("name: " + name);
           System.out.println(:location: " + location);
           System.out.println();
        }
        public static void main(String[] args) {
             Scanner scan =new Scanner(System.in);

             
             DeveloperProgram std1 = new ConstructorProgram(100);
             DeveloperProgram std2 = new ConstructorProgram(100,"Shital");
             DeveloperProgram std3 = new ConstructorProgram(100,"Vishakha","Padagha"); 
             std1.showdata();
             std2.showdata();
             std3.showdata();
      }
}
             