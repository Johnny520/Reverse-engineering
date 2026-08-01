package bsh.commands;

import androidx.activity.AbstractC0900;
import bsh.CallStack;
import bsh.Interpreter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class dir {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String[] f8167 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void invoke(Interpreter interpreter, CallStack callStack, String str) {
        try {
            String absolutePath = interpreter.pathToFile(str).getAbsolutePath();
            File filePathToFile = interpreter.pathToFile(str);
            if (!filePathToFile.exists() || !filePathToFile.canRead()) {
                interpreter.println("Can't read " + filePathToFile);
                return;
            }
            if (!filePathToFile.isDirectory()) {
                interpreter.println("'" + str + "' is not a directory");
            }
            String[] list = filePathToFile.list();
            if (list == null) {
                list = new String[0];
            }
            Arrays.sort(list);
            for (String str2 : list) {
                StringBuilder sbM700 = AbstractC0900.m700(absolutePath);
                sbM700.append(File.separator);
                sbM700.append(str2);
                File file = new File(sbM700.toString());
                StringBuilder sb = new StringBuilder();
                sb.append(file.canRead() ? "r" : "-");
                sb.append(file.canWrite() ? "w" : "-");
                sb.append("_ ");
                Date date = new Date(file.lastModified());
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(date);
                int i = gregorianCalendar.get(5);
                sb.append(f8167[gregorianCalendar.get(2)] + " " + i);
                if (i < 10) {
                    sb.append(" ");
                }
                sb.append(" ");
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < 8; i2++) {
                    sb2.append(" ");
                }
                sb2.insert(0, file.length());
                sb2.setLength(8);
                int iIndexOf = sb2.toString().indexOf(" ");
                if (iIndexOf != -1) {
                    String strSubstring = sb2.toString().substring(iIndexOf);
                    sb2.setLength(iIndexOf);
                    sb2.insert(0, strSubstring);
                }
                sb.append(sb2.toString());
                sb.append(" " + file.getName());
                if (file.isDirectory()) {
                    sb.append("/");
                }
                interpreter.println(sb.toString());
            }
        } catch (IOException e) {
            interpreter.println("error reading path: " + e);
        }
    }

    public static void invoke(Interpreter interpreter, CallStack callStack) {
        invoke(interpreter, callStack, ".");
    }
}
