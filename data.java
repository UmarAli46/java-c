class data{
    public static void main(String[] args) {

        String studentData = "John:85,Alice:92,Bob:78,Carol:95,David:88,Emma:79,Frank:90";
        String[] Records = studentData.split(",");              //split string into seprate parts......Records

        String[] Names = new String[Records.length];
        int[] Scores = new int[Records.length];
        for (int i = 0; i < Records.length; i++) {
            String[] parts = Records[i].split(":");           // split record string into name&score
            Names[i] = parts[0];
            Scores[i] = Integer.parseInt(parts[1]);            //string to integer parsing  (type casting) 
        }
        
        int totalStudents = Names.length;
        int totalScore = 0;
        int highScore = -1;
        int lowScore = 101;
        String highName = "";
        String lowName = "";

         for (int i = 0; i < totalStudents; i++) {
            totalScore += Scores[i];

            if (Scores[i] > highScore) {
                highScore = Scores[i];                       //condition for higest Name&Score
                highName = Names[i];
            }
            if (Scores[i] < lowScore) {
                lowScore = Scores[i];                        //condition for lowest Name&Score
                lowName = Names[i];
            }
        }
        double averageScore = (double) totalScore / totalStudents;

        System.out.println("Total number of students: " + totalStudents);
        System.out.println("Average score of all students: " + averageScore);
        System.out.println("Highest score: " + highScore + " (Student: " + highName + ")");
        System.out.println("Lowest score: " + lowScore + " (Student: " + lowName + ")");
    }
}
 