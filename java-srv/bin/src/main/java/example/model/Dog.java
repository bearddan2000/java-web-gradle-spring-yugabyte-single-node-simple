package example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String breed;
    private String color;

    public Dog(){}

    public Dog(Integer a, String b, String c){
        id =a;
        breed = b;
        color = c;
    }
    public Integer getId(){ return id;}
    public String getBreed(){ return breed;}
    public String getColor(){ return color;}

    public void setId(Integer val){ id = val;}
    public void setBreed(String val){ breed = val;}
    public void setColor(String val){ color = val;}
}
