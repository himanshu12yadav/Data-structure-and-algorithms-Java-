package Bitwise_operators.problems;

public class Solutions {
    public static void fibinocci(int n){
        int a = 0, b=1;
        for (int i=1; i <= n; i++){
            int c = a +  b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    public boolean isPrime(int n){
        for (int i=2; i < n; i++){
            if ((n % i) == 0){
                return false;
            }
        }

        return true;
    }

    public int solution1(int n){
        int product=1, sum = 0, result;
        while (n > 0){
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n = n / 10;
        }

        result = product - sum;
        return result;
    }

    public long decimalToBinary(int n){
        int anwser = 0;
        int i=0;
        while (n != 0){
            int bits = n & 1;
            anwser += Math.pow(10, i) * bits;
            n = n >> 1;
            i++;
        }

        return  anwser;
    }

    public long decimalToBinary_version_2(int n){
        int answer = 0;
        int i = 0;
        while (n!=0){
            int rem = n % 2;
            answer += Math.pow(10, i) * rem;
            n = ((n-rem) / 2);
            i++;
        }

        return answer;
    }

    public int binaryToDecimal(int n){
        int i=0, ans=0;
        while (n != 0){
            int digit = n % 10;
            if (digit == 1){
                ans += Math.pow(2, i);
            }
            n = n / 10;
            i++;
        }
        return ans;
    }

    public int reverseInteger(int n){
        int ans = 0;
        while (n != 0){
            int digit = n % 10;
            if ((ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE / 10)){
                return 0;
            }
            ans = (ans * 10) + digit;
            n = n / 10;
        }
        return ans;
    }

    public int complimentOf10(int n){
        int m = n;
        int mask = 0;
        while (m != 0){
            mask = (mask << 1) | 1;
            m = m >> 1;
        }

        int result = ~n&mask;
        return result;
    }

    public boolean powerOfTwo(int n){
        int count = 0;
        while (n != 0){
            int bits = n&1;
            if (bits == 1) count++;
            n = n >> 1;
        }

        if (count == 1){
            return true;
        }
        return false;
    }

    public boolean powerOfTwo_version_2(int n){
        int power = 1;
        while (power < n){
            power *= 2;
            if (power == n){
                return true;
            }
        }
        return false;
    }

    public boolean powerOfTwo_version_3(int n){
        for (int i=0; i <= 30; i++){
            int ans = (int) Math.pow(2, i);
            if (ans == n){
                return true;
            }
            if (ans < Integer.MAX_VALUE / 2){
                ans *= 2;
            }
        }
        return false;
    }

    public boolean isEven(int a){
        if ((int)(a & 1)== 1){
            return false;
        }
        return true;
    }

    public int factorial(int n){
        int fact = 1;
        for(int i=1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public int nCr(int n,int r){
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n-r);

        int combinator = numerator / denominator;
        return combinator;
    }

    public int nthTerm(int n){
        return (3*n + 7);
    }

    public int totalSetBit(int a, int b){
        int count = 0;
        while (a != 0){
            int bits = a & 1;
            if (bits == 1){
                count++;
            }
            a = a >> 1;
        }

        while (b != 0){
            int bits = b & 1;
            if (bits == 1) count++;
            b = b >> 1;
        }

        return count;
    }

    public int nthFib(int n){
        int a = 0;
        int b = 1;

        for (int i=2; i < n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

}
