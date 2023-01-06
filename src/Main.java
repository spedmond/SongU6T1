public class Main {
    public static void main(String[] args) {
        /*int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }

        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[i]);
        }

        System.out.println("--------------------------------------");

        boolean[] bools = {true, false, true, false, true, false};

        bools[0] = bools[3];

        System.out.println(bools.length);
        System.out.println(bools[0] + " " + bools[bools.length - 1]);

        System.out.println("--------------------------------------");

        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        for (int i = 0; i < 4; i++) {
            System.out.println(alphabeticalNames[i]);
        }

        System.out.println("--------------------------------------");

        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        System.out.println(array3[0]);
        System.out.println(array3[1]);

        System.out.println("--------------------------------------");

        String[] animals = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.println(animals[i]);
        }
        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";
        for (int i = 0; i < 4; i++) {
            System.out.println(animals[i]);
        }
        animals[2] = animals[2] + "s";
        System.out.println(animals[2]);
        System.out.println(animals.length);
        System.out.println(animals[2].length());

        System.out.println("--------------------------------------");

        Dog dog1 = new Dog("Sparky", 4);
        Dog dog2 = new Dog("Toby", 7);
        Dog dog3 = new Dog("Fiona", 12);
        Dog[] dogs = {dog1, dog2, dog3};
        for (int i = 0; i < 3; i++) {
            System.out.println(dogs[i].getName());
        }

        System.out.println("--------------------------------------");

        int[] ints1 = {2, 4, 6, 8, 10};
        int[] ints2 = ints1;
        ints2[3] = 15;
        System.out.println(ints1[3]);
        System.out.println(ints2[3]);

        System.out.println("--------------------------------------");
        */

        int[] nums1 = {5, 8, 9, 10, 4};
        int numStr1 = 5;
        ArrayManipulator manipulator = new ArrayManipulator(nums1, numStr1);
        System.out.println("------------");
        System.out.println(manipulator.getNumsMiddleIndex());
        System.out.println(manipulator.getNumsAverage());
        System.out.println(manipulator.sameLengths());
        System.out.println(manipulator.getNumAt(3));
        System.out.println(manipulator.getWordAt(3));
        System.out.println(manipulator.updateWordsListAt(3, "hello"));
        System.out.println(manipulator.getWordAt(3));
        System.out.println(manipulator.howLongLastWord());
        System.out.println(manipulator.updateWordsListAt(4, "updated"));
        System.out.println(manipulator.howLongLastWord());


        int[] nums2 = {2, 5, 7, 9,};
        int numStr2 = 6;
        System.out.println("------------");
        manipulator = new ArrayManipulator(nums2, numStr2);
        System.out.println(manipulator.getNumsMiddleIndex());
        System.out.println(manipulator.getNumsAverage());
        System.out.println(manipulator.sameLengths());
        System.out.println(manipulator.getNumAt(3));
        System.out.println(manipulator.updateWordsListAt(6, "not valid"));
        System.out.println(manipulator.howLongLastWord());
        System.out.println(manipulator.updateWordsListAt(5, "valid"));
        System.out.println(manipulator.howLongLastWord());
    }
}
