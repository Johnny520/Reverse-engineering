package bsh.commands;

import bsh.C1174f1;
import bsh.RunnableC1205k2;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class dir {
    static final String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void invoke(RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, String str) {
        try {
            String absolutePath = runnableC1205k2.m4465A(str).getAbsolutePath();
            File fileM4465A = runnableC1205k2.m4465A(str);
            if (!fileM4465A.exists() || !fileM4465A.canRead()) {
                runnableC1205k2.m4467C("Can't read " + fileM4465A);
                return;
            }
            if (!fileM4465A.isDirectory()) {
                runnableC1205k2.m4467C("'" + str + "' is not a directory");
            }
            String[] list = fileM4465A.list();
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
                int i10 = gregorianCalendar.get(5);
                sb2.append(months[gregorianCalendar.get(2)] + " " + i10);
                if (i10 < 10) {
                    sb2.append(" ");
                }
                sb2.append(" ");
                StringBuilder sb3 = new StringBuilder();
                for (int i11 = 0; i11 < 8; i11++) {
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
                runnableC1205k2.m4467C(sb2.toString());
            }
        } catch (IOException e10) {
            runnableC1205k2.m4467C("error reading path: " + e10);
        }
    }

    public static String usage() {
        return "usage: dir( String dir )\n       dir()";
    }

    public static void invoke(RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1) {
        invoke(runnableC1205k2, c1174f1, ".");
    }
}
