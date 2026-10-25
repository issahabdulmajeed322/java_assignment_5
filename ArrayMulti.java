public class ArrayMulti {
    public static void main(String[] args) {
        String groups [][] = {
            {"group1","Maryam","Muhammad","yusuf"},
            {"group2","John","Jane","Ali"},
            {"group3","Aisha","Fatima",}

        };
           for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                System.out.print(groups[i][j] + " ");
            }
            System.out.println();
    }
  }
}
