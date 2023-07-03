package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {

        StringBuilder builder = new StringBuilder();
        int i = 0;

        while(i < personArray.length){
            builder.append(personArray[i]);
            i++;
        }

        // create a `counter`
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        return builder.toString();
    }



    public String forLoop() {
        StringBuilder builder = new StringBuilder();



        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < personArray.length; i++){
            builder.append(personArray[i]);

        }

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return builder.toString();
    }



    public String forEachLoop() {
        StringBuilder builder = new StringBuilder();
        // identify array's type
        // identify array's variable-name
        for(Person person : personArray){
            builder.append(person);
        }

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return builder.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
