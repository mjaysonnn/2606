import java.util.Scanner;

public class Main {
    static boolean[] visited=new boolean[105];
    static int[][] arr=new int[105][105];
    static int infect_num= -1;
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int vertex_number=sc.nextInt();
        int edge_num=sc.nextInt();
        for(int i=0; i<edge_num; ++i)
        {
            int vertex_x=sc.nextInt();
            int vertex_y=sc.nextInt();
            arr[vertex_x][vertex_y]=1;
            arr[vertex_y][vertex_x]=1;
        }
        dfs(1,vertex_number);
        System.out.print(infect_num);
    }

    static void dfs(int startvertex, int vertex_number){
        visited[startvertex]=true;
        infect_num++;
        for(int i=1; i<=vertex_number; i++){
            if(!visited[i] && arr[startvertex][i]==1){
                dfs(i,vertex_number);
            }
        }
    }

   
}
