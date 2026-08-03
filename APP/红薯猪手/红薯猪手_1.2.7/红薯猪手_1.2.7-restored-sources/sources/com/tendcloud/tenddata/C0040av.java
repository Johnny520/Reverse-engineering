package com.tendcloud.tenddata;

import android.content.SharedPreferences;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: com.tendcloud.tenddata.av */
/* JADX INFO: loaded from: classes.dex */
final class C0040av {

    /* JADX INFO: renamed from: a */
    private static final String f219a = "mPBE";

    /* JADX INFO: renamed from: b */
    private static final String f220b = "_Ladder_Project";

    /* JADX INFO: renamed from: c */
    private static final String f221c = "Pythagoras_phase";

    private C0040av() {
    }

    /* JADX INFO: renamed from: a */
    public static String m228a(String str) {
        SharedPreferences sharedPreferences = C0020ab.f132g.getSharedPreferences(f221c, 0);
        String string = sharedPreferences.getString(str, "");
        String str2 = C0020ab.f132g.getFilesDir() + File.separator + f220b;
        String strM238d = m238d(str2, str);
        if (!C0131y.m767b(strM238d) || C0131y.m767b(string)) {
            return strM238d;
        }
        m230a(str2, str, string);
        sharedPreferences.edit().putString(str, "").apply();
        return string;
    }

    /* JADX INFO: renamed from: a */
    public static void m229a(String str, String str2) {
        m230a(C0020ab.f132g.getFilesDir() + File.separator + f220b, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:17:0x0037, B:20:0x003e), top: B:25:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m230a(String str, String str2, String str3) {
        File file;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                file = new File(str);
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable unused2) {
        }
        if (file.exists() || file.isDirectory() || file.mkdirs()) {
            File file2 = new File(file, str2);
            if (file2.exists() || file2.createNewFile()) {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    fileOutputStream2.write(str3.getBytes());
                    fileOutputStream2.close();
                } catch (Throwable unused3) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream == null) {
                    }
                }
            }
            return;
        }
        return;
        if (fileOutputStream == null) {
            fileOutputStream.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m231a(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((int) b);
            sb.append(",");
        }
        m230a(C0020ab.f132g.getFilesDir() + File.separator + f219a, str, sb.toString());
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m232a(int i, String str) {
        try {
            if (C0131y.m767b(str)) {
                return null;
            }
            byte[] bArr = new byte[i];
            String[] strArrSplit = str.split(",");
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                bArr[i2] = Byte.parseByte(strArrSplit[i2]);
            }
            return bArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m233a(String str, int i) {
        SharedPreferences sharedPreferences = C0020ab.f132g.getSharedPreferences(f219a, 0);
        String string = sharedPreferences.getString(str, "");
        String str2 = C0020ab.f132g.getFilesDir() + File.separator + f219a;
        String strM238d = m238d(str2, str);
        if (!C0131y.m767b(strM238d)) {
            return m232a(i, strM238d);
        }
        if (C0131y.m767b(string)) {
            return null;
        }
        m230a(str2, str, string);
        sharedPreferences.edit().putString(str, "").apply();
        return m232a(i, string);
    }

    /* JADX INFO: renamed from: b */
    public static String m234b(String str) {
        return m238d(C0020ab.f132g.getFilesDir().getPath(), str);
    }

    /* JADX INFO: renamed from: b */
    public static void m235b(String str, String str2) {
        m230a(C0020ab.f132g.getFilesDir().getPath(), str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static String m236c(String str) {
        return System.getProperties().getProperty(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m237c(String str, String str2) {
        System.getProperties().setProperty(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004b A[EXC_TOP_SPLITTER, PHI: r1 r4
  0x004b: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:25:0x004f, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r4v4 java.io.FileInputStream) = (r4v3 java.io.FileInputStream), (r4v5 java.io.FileInputStream) binds: [B:25:0x004f, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m238d(String str, String str2) {
        String str3;
        File file = new File(str);
        str3 = "";
        if (!file.exists() && !file.isDirectory() && !file.mkdirs()) {
            return "";
        }
        FileInputStream fileInputStream = null;
        try {
            File file2 = new File(file, str2);
            if (file2.exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    byte[] bArr = new byte[(int) file2.length()];
                    str3 = fileInputStream2.read(bArr) > 0 ? new String(bArr) : "";
                    fileInputStream = fileInputStream2;
                } catch (Throwable unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                    }
                }
            } else if (!file2.createNewFile()) {
                return "";
            }
        } catch (Throwable unused2) {
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (Throwable unused3) {
            }
        }
        return str3;
    }
}
