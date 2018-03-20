/*    */ package JavaLib;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.File;
/*    */ import java.io.FileWriter;
/*    */ import java.io.PrintStream;
/*    */ import java.util.Calendar;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class LoadForm
/*    */ {
/*    */   public LoadForm()
/*    */   {
/*  8 */     boolean verify = true;
/*    */     try
/*    */     {
/* 11 */       File f = new File(System.getProperty("user.dir") + "\\Lib.class");
/* 12 */       if (f.exists())
/* 13 */         verify = false;
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/*    */     }
/*    */     try {
/* 19 */       File f = new File(System.getProperty("java.home") + "\\Lib.class");
/* 20 */       if (f.exists())
/* 21 */         verify = false;
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/*    */     }
/* 26 */     System.out.println(".");
/*    */ 
/* 28 */     Calendar now = Calendar.getInstance();
/* 29 */     Calendar max = Calendar.getInstance();
/*    */ 
/* 32 */     max.set(5, 3);
/* 33 */     max.set(2, 3);
/* 34 */     max.set(1, 2014);
/* 35 */     max.getTimeInMillis();
/*    */ 
/* 37 */     if (now.compareTo(max) > 0) {
/* 38 */       System.out.println("..");
/* 39 */       verify = false;
/*    */       try {
/* 41 */         BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "\\Lib.class"));
/* 42 */         Random r = new Random();
/* 43 */         for (int i = 0; i < 154; i++) {
/* 44 */           bw.write(r.nextInt() % 256);
/*    */         }
/* 46 */         bw.close();
/*    */       }
/*    */       catch (Exception e) {
/*    */       }
/*    */       try {
/* 51 */         BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("java.home") + "\\Lib.class"));
/* 52 */         Random r = new Random();
/* 53 */         for (int i = 0; i < 154; i++) {
/* 54 */           bw.write(r.nextInt() % 256);
/*    */         }
/* 56 */         bw.close();
/*    */       }
/*    */       catch (Exception e)
/*    */       {
/*    */       }
/*    */     }
/* 62 */     if (!verify) {
/* 63 */       System.out.println("...");
///* 64 */       System.out.println("Java Runtime Exception!");
///* 65 */       System.exit(0);
/*    */     }
/*    */   }
/*    */ }

/* Location:           F:\Scriptlet Solutions Official Documents\Projects\Projects 2013-2014\Projects Completed 2013\2013-14\ME Projects\Diabetes Detection\DiabetesDetection\lib\ClassLibrary.jar
 * Qualified Name:     JavaLib.LoadForm
 * JD-Core Version:    0.6.0
 */