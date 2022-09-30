//package chat_server.server;
//
//
//import java.io.*;
//
//
//public class ChatHistory {
//
//      public static void writeHistory(String login, String message) {
//      String path = String.format("C:/Users/ОиК/Desktop/Homework/3-1/src/history_[%s].txt", login);
//        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(path, true), true)) {
//            printWriter.println(message);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//        public static String readLastNLines(String file, int count) {
//        int readLines = 0;
//        StringBuilder sb = new StringBuilder();
//
//        try {
//            RandomAccessFile raf = new RandomAccessFile(file, "r");
//            long fileLength = file.length() - 1;
//            raf.seek(fileLength);
//
//            for (long ptr = fileLength; ptr >= 0; ptr--) {
//                raf.seek(ptr);
//                char ch = raf.readChar();
//
//                if (ch == '\n') {
//                    readLines++;
//                    if (readLines == count) {
//                        break;
//                    }
//                }
//                sb.append(ch);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        sb.reverse();
//        System.out.println(sb.toString());
//
//        return sb.toString();
//
//    }
//
//    }
