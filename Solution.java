class Solution {
    int num  ;    
    public int myAtoi(String s) {
        String sign = "-";
        if (s.contains("-")){
            sign = "-";
        }else{
            sign = "+";
        }

        for (int i  =0; i<s.length(); i++){
            if(s.charAt(i)  ==   '\\s'){
                continue;
            }
           
            if(Character.isDigit(s.charAt(i))){
                 if(s.charAt(i)== '0'){
                    continue;
                 }
                  num *= 10;
                num += (int)s.charAt(i);
            }else{
                if(num>0){
                    break;
                }
                return 0;
            }
               
            }
              if(sign.equals("-")){
            return (-1*num);
        }
        return num;
        }
      


}
