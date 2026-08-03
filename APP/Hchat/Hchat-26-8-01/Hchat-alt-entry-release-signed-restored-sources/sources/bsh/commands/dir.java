package bsh.commands;

import bsh.CallStack;
import bsh.Interpreter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class dir {
    static final String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
                File file = new File(absolutePath + File.separator + str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file.canRead() ? "r" : "-");
                sb2.append(file.canWrite() ? "w" : "-");
                sb2.append("_ ");
                Date date = new Date(file.lastModified());
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(date);
                int i9 = gregorianCalendar.get(5);
                sb2.append(months[gregorianCalendar.get(2)] + " " + i9);
                if (i9 < 10) {
                    sb2.append(" ");
                }
                sb2.append(" ");
                StringBuilder sb3 = new StringBuilder();
                for (int i10 = 0; i10 < 8; i10++) {
                    sb3.append(" ");
                }
                sb3.insert(0, file.length());
                sb3.setLength(8);
                int iIndexOf = sb3.toString().indexOf(" ");
                if (iIndexOf != -1) {
                    String strSubstring = sb3.toString().substring(iIndexOf);
                    sb3.setLength(iIndexOf);
                    sb3.insert(0, strSubstring);
                }
                sb2.append(sb3.toString());
                sb2.append(" " + file.getName());
                if (file.isDirectory()) {
                    sb2.append("/");
                }
                interpreter.println(sb2.toString());
            }
        } catch (IOException e6) {
            interpreter.println("error reading path: " + e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String usage() {
        return "usage: dir( String dir )\n       dir()";
    }

    public static void invoke(Interpreter interpreter, CallStack callStack) {
        invoke(interpreter, callStack, ".");
    }
}
