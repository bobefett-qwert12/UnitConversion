public class Conversion {
    private String convertIn;
    private String convertOut;
    private double convertValue;

    /**
     * Constructs a new Conversion object
     * @param convertIn unit to convert from
     * @param convertOut unit to convert to
     * @param convertValue number being converted
     */
    public Conversion(String convertIn, String convertOut, double convertValue) {
        this.convertIn = convertIn;
        this.convertOut = convertOut;
        this.convertValue = convertValue;
    }

    public double convert(){
        double convertedValue;
        if((this.convertIn.equals("fl.oz") || this.convertIn.equals("gal")) && (this.convertOut.equals("ml") || this.convertOut.equals("l"))){
            if(this.convertIn.equals("fl.oz") && this.convertOut.equals("ml")){         //fluid ounces to milliliters
                convertedValue = (this.convertValue * 29.5735);
            }else if(this.convertIn.equals("fl.oz") && this.convertOut.equals("l")){    //fluid ounces to liters
                convertedValue = (this.convertValue * 0.0295735);
            }else if(this.convertIn.equals("gal") && this.convertOut.equals("ml")){     //gallons to milliliters
                convertedValue = (this.convertValue * 3785.41);
            }else{                                                                      //gallons to liters
                convertedValue = (this.convertValue * 3.78541);
            }
            return convertedValue;
        }else if((this.convertIn.equals("oz") || this.convertIn.equals("lb")) && (this.convertOut.equals("g") || this.convertOut.equals("kg"))){
            if(this.convertIn.equals("oz") && this.convertOut.equals("g")){             //ounces to grams
                convertedValue = (this.convertValue * 28.3495);
            }else if(this.convertIn.equals("oz") && this.convertOut.equals("kg")){      //ounces to kilograms
                convertedValue = (this.convertValue * 0.0283495);
            }else if(this.convertIn.equals("lb") && this.convertOut.equals("g")){       //pounds to grams
                convertedValue = (this.convertValue * 453.592);
            }else{                                                                      //pounds to kilograms
                convertedValue = (this.convertValue * 0.453592);
            }
            return convertedValue;
        }else if((this.convertIn.equals("in") || this.convertIn.equals("ft") || this.convertIn.equals("mi")) &&
                (this.convertOut.equals("mm") || this.convertOut.equals("cm") || this.convertOut.equals("m") || this.convertOut.equals("km"))){
            if(this.convertIn.equals("in") && this.convertOut.equals("mm")){            //inches to millimeters
                convertedValue = (this.convertValue * 25.4);
            }else if(this.convertIn.equals("in") && this.convertOut.equals("cm")){      //inches to centimeters
                convertedValue = (this.convertValue * 2.54);
            }else if(this.convertIn.equals("in") && this.convertOut.equals("m")){       //inches to meters
                convertedValue = (this.convertValue * 0.0254);
            }else if(this.convertIn.equals("in") && this.convertOut.equals("km")){      //inches to kilometers
                convertedValue = (this.convertValue * 0.0000254);
            }else if(this.convertIn.equals("ft") && this.convertOut.equals("mm")){      //feet to millimeters
                convertedValue = (this.convertValue * 304.8);
            }else if(this.convertIn.equals("ft") && this.convertOut.equals("cm")){      //feet to centimeters
                convertedValue = (this.convertValue * 30.48);
            }else if(this.convertIn.equals("ft") && this.convertOut.equals("m")){       //feet to meters
                convertedValue = (this.convertValue * 0.3048);
            }else if(this.convertIn.equals("ft") && this.convertOut.equals("km")){      //feet to kilometers
                convertedValue = (this.convertValue * 0.0003048);
            }else if(this.convertIn.equals("mi") && this.convertOut.equals("mm")){      //miles to millimeters
                convertedValue = (this.convertValue * 1609000);
            }else if(this.convertIn.equals("mi") && this.convertOut.equals("cm")){      //miles to centimeters
                convertedValue = (this.convertValue * 160934);
            }else if(this.convertIn.equals("mi") && this.convertOut.equals("m")){       //miles to meters
                convertedValue = (this.convertValue * 1609.34);
            }else{                                                                      //miles to kilometers
                convertedValue = (this.convertValue * 1.60934);
            }
            return convertedValue;
        }else{
            return 0;
        }
    }
}
