int n1 = 0;
int n2 = 1;
int loop;
int fib;

public static int getFibonacciNumber(int n) {

  for (loop = 0; loop < n; loop ++)
    {
      fib = n1 + n2;
      n1 = n2;
      n2 = fib;
    }
}
