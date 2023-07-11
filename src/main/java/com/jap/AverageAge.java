package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;

        try{
            //Write the logic
                int sum=0;
                int count=0;
                for(String age: ageRawData){
                    int ageValue= Integer.parseInt(age);
                            sum += ageValue;
                            count++;
                }
                if(count>0){
                    avg= (double)sum/count;
                }
            //Handle specific exception
        }catch (NumberFormatException exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }



}
