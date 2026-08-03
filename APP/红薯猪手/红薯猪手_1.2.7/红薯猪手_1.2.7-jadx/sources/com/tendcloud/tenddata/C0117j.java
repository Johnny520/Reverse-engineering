package com.tendcloud.tenddata;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Environment;
import android.preference.PreferenceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;
import java.util.regex.Pattern;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.j */
/* JADX INFO: loaded from: classes.dex */
public class C0117j {

    /* JADX INFO: renamed from: a */
    private static final String f532a = "pref.deviceid.key";

    /* JADX INFO: renamed from: d */
    private static final String f535d = ".tcookieid";

    /* JADX INFO: renamed from: e */
    private static final String f536e = ".tlocalcookieid";

    /* JADX INFO: renamed from: f */
    private static volatile String f537f;

    /* JADX INFO: renamed from: b */
    private static final Pattern f533b = Pattern.compile("[0-4][0-9a-f]{24,32}");

    /* JADX INFO: renamed from: c */
    private static final Pattern f534c = Pattern.compile("[0-4][0-9a-f]{32}");

    /* JADX INFO: renamed from: g */
    private static String f538g = "TD_Custom_Dev_Id";

    /* JADX INFO: renamed from: h */
    private static String f539h = null;

    /* JADX INFO: renamed from: a */
    public static synchronized String m570a(Context context) {
        if (f537f == null) {
            f537f = m582d(context);
        }
        return f537f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m571a(Context context, boolean z, String str) {
        if (C0131y.m754a(23) && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return null;
        }
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return "";
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (!z) {
            StringBuilder sbM1039 = C0167c4.m1039(str);
            sbM1039.append(m581c(context));
            str = sbM1039.toString();
        }
        String strM572a = m572a(new File(externalStorageDirectory, str));
        if (!C0131y.m767b(strM572a)) {
            return strM572a;
        }
        File externalStorageDirectory2 = Environment.getExternalStorageDirectory();
        StringBuilder sbM10392 = C0167c4.m1039(".tid");
        sbM10392.append(m581c(context));
        return m572a(new File(externalStorageDirectory2, sbM10392.toString()));
    }

    /* JADX INFO: renamed from: a */
    private static String m572a(File file) {
        FileInputStream fileInputStream;
        try {
            if (file.exists() && file.canRead()) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[128];
                        String str = new String(bArr, 0, fileInputStream.read(bArr));
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return str;
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    fileInputStream = null;
                }
            } else {
                fileInputStream = null;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m573a(String str) {
        String strM572a = null;
        try {
            File[] fileArrListFiles = new File("/").listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && !"/sdcard".equals(file.getAbsolutePath())) {
                        if (file.canWrite()) {
                            strM572a = m572a(new File(file, str));
                            if (!C0131y.m767b(strM572a)) {
                                return strM572a;
                            }
                        }
                        if (file.listFiles() != null) {
                            for (File file2 : file.listFiles()) {
                                if (file2.isDirectory()) {
                                    strM572a = m572a(new File(file2, str));
                                    if (!C0131y.m767b(strM572a)) {
                                        return strM572a;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return strM572a;
    }

    /* JADX INFO: renamed from: a */
    private static void m574a(Context context, String str) {
        try {
            File[] fileArrListFiles = new File("/").listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && !"/sdcard".equals(file.getAbsolutePath())) {
                        if (file.canWrite()) {
                            if (!new File(file, f535d + m581c(context)).exists()) {
                                m576a(new File(file, f535d), str);
                            }
                        }
                        if (file.listFiles() != null) {
                            for (File file2 : file.listFiles()) {
                                if (file2.isDirectory() && file2.canWrite()) {
                                    if (!new File(file2, f535d + m581c(context)).exists()) {
                                        m576a(new File(file2, f535d), str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m575a(Context context, String str, boolean z) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            String str2 = f536e;
            if (!z) {
                str2 = f536e + m581c(context);
            }
            m576a(new File(externalStorageDirectory, str2), str);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m576a(File file, String str) {
        FileOutputStream fileOutputStream = null;
        try {
            if (file.exists() || !C0131y.m766b(C0020ab.f132g, "android.permission.WRITE_EXTERNAL_STORAGE") || ((C0131y.m756a(C0020ab.f132g, 29) && C0131y.m754a(29)) || file.createNewFile())) {
                if (file.canWrite()) {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(str.getBytes());
                        if (C0131y.m754a(9)) {
                            Class<?> cls = file.getClass();
                            Class<?> cls2 = Boolean.TYPE;
                            cls.getMethod("setReadable", cls2, cls2).invoke(file, Boolean.TRUE, Boolean.FALSE);
                        } else {
                            Runtime.getRuntime().exec("chmod 444 " + file.getAbsolutePath());
                        }
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable unused) {
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream == null) {
                        }
                    }
                }
                if (fileOutputStream == null) {
                    return;
                }
                fileOutputStream.close();
                return;
            }
            return;
            fileOutputStream.close();
            return;
        } catch (Throwable unused2) {
            return;
        }
        if (fileOutputStream == null) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m577a() {
        return !(C0131y.m754a(9) ? Environment.isExternalStorageRemovable() : true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    private static String m578b() {
        String strM640a = C0119l.m640a("mac");
        if (C0131y.m767b(strM640a)) {
            strM640a = C0119l.m640a("androidId");
        }
        if (C0131y.m767b(strM640a)) {
            strM640a = UUID.randomUUID().toString();
        }
        StringBuilder sbM1039 = C0167c4.m1039("4");
        sbM1039.append(C0131y.m771c(3 + strM640a));
        return sbM1039.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m579b(Context context) {
        try {
            String strM728b = C0125s.m728b(context, "tdid", f532a, (String) null);
            return C0131y.m767b(strM728b) ? PreferenceManager.getDefaultSharedPreferences(context).getString(f532a, null) : strM728b;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m580b(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("tdid", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(f532a, str);
                editorEdit.apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m581c(Context context) {
        if (f539h == null) {
            try {
                Sensor[] sensorArr = new Sensor[64];
                for (Sensor sensor : ((SensorManager) context.getSystemService("sensor")).getSensorList(-1)) {
                    if (sensor.getType() < 64 && sensor.getType() >= 0) {
                        sensorArr[sensor.getType()] = sensor;
                    }
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < 64; i++) {
                    if (sensorArr[i] != null) {
                        stringBuffer.append(i);
                        stringBuffer.append('.');
                        stringBuffer.append(sensorArr[i].getVendor());
                        stringBuffer.append('-');
                        stringBuffer.append(sensorArr[i].getName());
                        stringBuffer.append('-');
                        stringBuffer.append(sensorArr[i].getVersion());
                        stringBuffer.append('\n');
                    }
                }
                f539h = String.valueOf(stringBuffer.toString().hashCode());
            } catch (Throwable unused) {
            }
        }
        return f539h;
    }

    /* JADX INFO: renamed from: d */
    private static String m582d(Context context) {
        String strM578b;
        String strM579b = m579b(context);
        boolean zM577a = m577a();
        String strM571a = m571a(context, zM577a, f536e);
        if (!C0131y.m767b(strM579b) && f534c.matcher(strM579b).matches()) {
            strM578b = strM579b;
        } else if (C0131y.m767b(strM571a) || !f534c.matcher(strM571a).matches()) {
            int i = 0;
            String[] strArr = {m573a(f535d), m571a(context, zM577a, f535d)};
            while (true) {
                if (i >= 2) {
                    strM578b = null;
                    break;
                }
                strM578b = strArr[i];
                if (!C0131y.m767b(strM578b) && f534c.matcher(strM578b).matches()) {
                    break;
                }
                i++;
            }
        } else {
            strM578b = strM571a;
        }
        if (C0131y.m767b(strM578b)) {
            strM578b = C0131y.m754a(29) ? m578b() : m583e(context);
        }
        if (!strM578b.equals(strM579b)) {
            m580b(context, strM578b);
        }
        if (C0131y.m767b(strM571a)) {
            m575a(context, strM578b, zM577a);
        }
        return strM578b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private static String m583e(Context context) {
        String strM584f = m584f(context);
        StringBuilder sbM1039 = C0167c4.m1039("3");
        sbM1039.append(C0131y.m771c(strM584f));
        return sbM1039.toString();
    }

    /* JADX INFO: renamed from: f */
    private static String m584f(Context context) {
        try {
            return C0119l.m655f(context) + '-' + C0119l.m640a("mac") + '-' + C0119l.m640a("androidId");
        } catch (Throwable unused) {
            return "";
        }
    }
}
