
# Виконане завдання
## done.png
![alt text](https://github.com/ppc-ntu-khpi/java-1-grumpiestjohn/blob/main/Solution/done.png "done.png")
## advanced.png
![alt text](https://github.com/ppc-ntu-khpi/java-1-grumpiestjohn/blob/main/Solution/advanced.png "advanced.png")
## Код Customer.java
````java
package domain;  
  
public class Customer {  
    private int ID;  
    private boolean isNew;  
    private int total;  
    public void displayCustomerInfo() {  
        System.out.println("Customer's ID: " + ID);  
        System.out.println("Customer is new: " + isNew);  
        System.out.println("Total purchases: " + total);  
    }  
    public boolean setID(int ID) {  
        if (ID >= 0) {  
            this.ID = ID;  
            return true;  
        }  
        return false;  
    }  
    public void setNew(boolean aNew) {  
        isNew = aNew;  
    }  
    public boolean setTotal(int total) {  
        if (total >= 0) {  
            this.total = total;  
            return true;  
        }  
        return false;  
    }  
    public Customer() {  
        ID = 10;  
        isNew = true;  
        total = 100;  
    }  
}
````
