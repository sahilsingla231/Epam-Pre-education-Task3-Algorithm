/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epamalgorithm;

/**
 *
 * @author Sahil Singla
 */

import java.util.*;
class Descending_Names_B_Sort {
    /**
 *
 * @author Sahil Singla
 */
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Pair a[]=new Pair[n];
        for(int i=0;i<n;i++)
        {
            int j=sc.nextInt();
            a[i]=new Pair(j,j%k);
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        System.out.print(a[i].x+" ");
    }
}
class Pair implements Comparable<Pair>
{
    int x,y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int compareTo(Pair p)
    {
        int i=p.y-y;
        if(i!=0)
        return i;
        return x-p.x;
        /*return Comparator.comparingInt(Pair::y).compare(p,this)
        .thenComparingInt(Pair::x).compare(this,p);
        if(p.y>y || (p.y==y && x<p.x))
        return 1;
        else
        return -1;
    */
    }
}
