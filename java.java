class HelloWorld {
    public static void main(String[] args) {
        int x = 10;
        Boolean solved = false;
        String encrypted ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter original word: ");
        String original = scanner.nextLine();
        for (int i = 0; i < original.length(); i++){
            char y = original.charAt(i);
            int ascii = y;
            ascii = ascii + (int)(Math.random() * 200);
            char z = (char)ascii;
            
            encrypted += z;
            System.out.println(encrypted);
            
            
        }
        while (solved != true && x > 0){
            System.out.println("Enter guess: ");
            x -= 1;
            String guess = scanner.nextLine();
            
            for (int i = 0; i < original.length(); i++){
                if (original.charAt(i)== guess.charAt(0)){
                    encrypted = encrypted.substring(0, i) + guess + encrypted.substring(i + 1);
                    if (encrypted.equals(original)){
                        solved = true;
                        break;
                    }
                }
                
            }
        }
            if (solved==true){
                System.out.println("You solved it well done");
            }
            else{
                System.out.println("You failed it well done");
            }
      
        
        }
        
    }
