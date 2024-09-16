class Solution {
    int num  ;    
    public int myAtoi(String s) {
        String sign = "-";
        if (s.contains("-")){
            sign = "-";
        }else{
            sign = "+";
        }

        String arr[] = s.split(" ");

        for (int i  =0; i<s.length(); i++){
          for(int j =0; j<arr[i].length; j++){
           String str = arr[i];
            if(Character.isDigit(str.charAt(j))){
                 if(s.charAt(i)== '0'){
                    continue;
                 }
                  num *= 10;
                num += (int)str.charAt(j);
            }else{
                if(num>0){
                    break;
                }
                return 0;
            }
               
            }
        }

              if(sign.equals("-")){
            return (-1*num);
        }
        return num;
        }
      


}

