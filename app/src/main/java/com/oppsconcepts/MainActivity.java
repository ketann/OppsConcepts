package com.oppsconcepts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.oppsconcepts.Encapsulation.FruitDetails;
import com.oppsconcepts.Encapsulation.UserDetails;
import com.oppsconcepts.Inheritance.ChildClass;
import com.oppsconcepts.Interface.Dove;
import com.oppsconcepts.Interface.Duck;
import com.oppsconcepts.Polymorphism.Addition;
import com.oppsconcepts.Polymorphism.Bike;
import com.oppsconcepts.Polymorphism.Vehicle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView userDetail = (TextView) findViewById(R.id.txt_user_details);
        TextView fruitDetail = (TextView) findViewById(R.id.txt_fruit_details);
        TextView fruitUpdateDetail = (TextView) findViewById(R.id.txt_fruit_update_details);

        //---------------------------------Example 1 of encapsulation----------------------------------------//

        // Creating a object of UserDetail class

        UserDetails userDetails = new UserDetails();
        userDetails.setName("Nakum Ketan");
        userDetails.setEmail("ketan.nakum77@gmail.com");

        Log.d("UserDetail", "Name is : " + userDetails.getName());
        Log.d("UserDetail", "Email is : " + userDetails.getEmail());

        userDetail.setText("Name is : " + userDetails.getName() + "\n" + "Email is : " + userDetails.getEmail());

        //---------------------------------Example 2 of encapsulation----------------------------------------//

        //Using constructor to inititialize
        FruitDetails fruitDetails = new FruitDetails("Apple", "35", "Red");

        System.out.println("Name -->" + fruitDetails.getName() + "\n" + "Price -->" + fruitDetails.getPrice() + "\n" + "Color -->" + fruitDetails.getColor());

        fruitDetail.setText("Name -->" + fruitDetails.getName() + "\n" + "Price -->" + fruitDetails.getPrice() + "\n" + "Color -->" + fruitDetails.getColor());
        //Lets update the price and color using setter

        fruitDetails.setName("Banana");
        fruitDetails.setPrice("12");
        fruitDetails.setColor("Yellow");

        System.out.println("Name -->" + fruitDetails.getName() + "\n" + "Price -->" + fruitDetails.getPrice() + "\n" + "Color -->" + fruitDetails.getColor());

        fruitUpdateDetail.setText("Name -->" + fruitDetails.getName() + "\n" + "Price -->" + fruitDetails.getPrice() + "\n" + "Color -->" + fruitDetails.getColor());


        //---------------------------------Example 1 Polymorphism Method Overloading---------------------------------------//

        Addition addition = new Addition();

        System.out.println(addition.add(5, 7));
        System.out.println(addition.add(4, 3, 8));
        System.out.println(addition.add(5, 2.5));

        //---------------------------------Example 2 Polymorphism Method Overriding---------------------------------------//
        Vehicle v1 = new Bike();
        v1.move();

        Vehicle v = new Vehicle();
        v.move();

        //---------------------------------Example Inheritance---------------------------------------//

        ChildClass childClass = new ChildClass();
        //Subtraction method called on child object
        childClass.substract();

        //---------------------------------Example Abstract---------------------------------------//


        //---------------------------------Example interface---------------------------------------//

        Duck duck = new Duck();
        duck.goFroword();
        duck.goDown();

        Dove dove = new Dove();
        dove.goFroword();
        dove.goDown();

        //---------------------------------Example StringBuffer and StringBuilder----------------------------------------//

        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Ketan");
        for (int i = 0; i < 1000; i++) {
            sb.append("Nakum");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Ketan");
        for (int i = 0; i < 1000; i++) {
            sb2.append("Nakum");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");



    }
}
