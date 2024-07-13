package Soft_Computing;

import java.util.Scanner;

public class OR_perceptron {
    public static int activation(int theta,int p){
        if(p<=theta)
            return 0;
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theta=0;
        double w1=0,w2=0;
        int a[]={-1,1,-1,1};
        int b[]={-1,-1,1,1};
        int res[]={-1,1,-1,-1};
        int bias=0;
        int epoch=2;
        double lr=0.2;
        while (epoch-->0){
            for(int i=0;i<a.length;i++){
                double p=a[i]*w1+b[i]*w2+bias;
//                p=activation(theta,p);
                double err=lr*(res[i]-p);
                double d1=a[i]*err;
                w1=w1+d1;
                double d2=b[i]*err;
                w2=w2+d2;
                double db=lr*err;
                bias+=db;
            }
        }
        System.out.println(w1+" "+w2);
    }
}
