void main() {
    Scanner sc = new Scanner(System.in);
    double x;
    double a;
    double b;
    double c;
    double F = 0;

    x = sc.nextDouble();
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    if (x<0 && b!=0)
        F = a * (x * x) - b * (x * x);
    if (x>0 && b==0)
        F = (x-a)/(x-c);
    if (!(x<0 && b!=0) && !(x>0 && b==0))
        F = x + 5 / (c * (x - 10));

    System.out.println(F);

    // спосіб 2
    if (x<0 && b!=0)
        F = a * (x * x) - b * (x * x);
    else {
        if (x>0 && b==0)
            F = (x-a)/(x-c);
        else {
            F = x + 5 / (c * (x - 10));
        }
    }

    System.out.println(F);
}
