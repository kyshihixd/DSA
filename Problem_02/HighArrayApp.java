import java.util.Random;

// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArray {
   private long[] a; // ref to array a
   private int nElems; // number of data items
   public int comparison;
   // -----------------------------------------------------------

   public HighArray(int max) // constructor
   {
      a = new long[max]; // create the array
      nElems = 0; // no items yet
   }

   // -----------------------------------------------------------
   public boolean find(long searchKey) { // find specified value
      int j;
      for (j = 0; j < nElems; j++) { // for each element,
         comparison++;
         if (a[j] == searchKey) { // found item
            break;
         }
      } // exit loop before end
      if (j == nElems) // gone to end?
         return false; // yes, can't find it
      else
         return true; // no, found it
   } // end find()
     // -----------------------------------------------------------

   public void insert(long value) // put element into array
   {
      a[nElems] = value; // insert it
      nElems++; // increment size
   }

   // -----------------------------------------------------------
   public boolean delete(long value) {
      int j;
      for (j = 0; j < nElems; j++) // look for it
         if (value == a[j])
            break;
      if (j == nElems) // can't find it
         return false;
      else // found it
      {
         for (int k = j; k < nElems; k++) // move higher ones down
            a[k] = a[k + 1];
         nElems--; // decrement size
         return true;
      }
   } // end delete()
     // -----------------------------------------------------------

   public void display() // displays array contents
   {
      for (int j = 0; j < nElems; j++) // for each element,
         System.out.print(a[j] + " "); // display it
      System.out.println("");
   }

   // -----------------------------------------------------------
   // getMax() for problem 2 iii
   public long getMax() {
      if (nElems == 0) {
         return -1;
      }
      long hold = a[0];
      for (int i = 0; i < nElems; i++) {
         if (hold < a[i])
            hold = a[i];
      }
      return hold;
   }

   // ------------------------------------------------------------
   public void noDups() {
      for (int i = 0; i < nElems; i++) {
         for (int j = i + 1; j < nElems; j++) {
            if (a[i] == a[j]) {
               a[j] = -1;
            }
         }
      }

      int swap = 0;
      for (int i = 0; i < nElems; i++) {
         if (a[i] != -1) {
            a[swap] = a[i];
            swap++;
         }
      }

      nElems = swap;
   }
}

// end class HighArray
////////////////////////////////////////////////////////////////
class HighArrayApp {
   public static void main(String[] args) {
      Random ran = new Random();
      int maxSize = 200; // array size
      HighArray arr; // reference to array
      arr = new HighArray(maxSize); // create the array

      int ranNum = ran.nextInt(100);
      int find = 0;
      for (int i = 0; i < 100; i++) {
         if (ranNum != i) {
            arr.insert(ran.nextInt(1000000));
         } else {
            find = ran.nextInt(1000000);
            arr.insert(find);
         }
      }

      // arr.insert(77); // insert 10 items
      // arr.insert(99);
      // arr.insert(44);
      // arr.insert(55);
      // arr.insert(22);
      // arr.insert(88);
      // arr.insert(11);
      // arr.insert(00);
      // arr.insert(66);
      // arr.insert(33);
      // arr.insert(77);
      // arr.insert(22);
      // arr.insert(33);

      arr.display(); // display items
      // System.out.println(arr.getMax());
      // arr.display();
      // arr.noDups();
      // arr.display();
      int searchKey = 340; // search for item
      if (arr.find(find))
         System.out.println("Found " + find + " in " + arr.comparison + " comparisons");
      else
         System.out.println("Can't find " + find);

      arr.delete(00); // delete 3 items
      arr.delete(55);
      arr.delete(99);

      arr.display(); // display items again
   } // end main()
} // end class HighArrayApp
