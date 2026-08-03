package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tendcloud.tenddata.t */
/* JADX INFO: loaded from: classes.dex */
public class C0126t {
    private C0126t() {
    }

    /* JADX INFO: renamed from: a */
    public static String m729a(Context context, int i) {
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Throwable added to exception handler: 'NumberFormatException', keep only Throwable */
    /* JADX INFO: renamed from: a */
    public static List<C0113f> m730a() {
        ArrayList arrayList = new ArrayList();
        try {
            for (File file : new File("/proc").listFiles()) {
                if (file != null && file.isDirectory()) {
                    try {
                        int i = Integer.parseInt(file.getName());
                        C0113f c0113f = new C0113f(-1);
                        int i2 = c0113f.f493b;
                        if ((i2 < 1000 || i2 > 9999) && !c0113f.f494c.contains(":") && !c0113f.f494c.contains("/")) {
                            arrayList.add(new C0113f(i));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    /* JADX DEBUG: Throwable added to exception handler: 'NumberFormatException', keep only Throwable */
    /* JADX INFO: renamed from: a */
    public static List<C0113f> m731a(Context context) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            File[] fileArrListFiles = new File("/proc").listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file != null && file.isDirectory()) {
                        try {
                            C0113f c0113f = new C0113f(Integer.parseInt(file.getName()));
                            if (c0113f.f492a && (((i = c0113f.f493b) < 1000 || i > 9999) && !c0113f.f494c.contains(":") && !c0113f.f494c.contains("/"))) {
                                arrayList.add(c0113f);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static List<ActivityManager.RunningAppProcessInfo> m732b(Context context) {
        try {
            List<C0113f> listM730a = m730a();
            ArrayList arrayList = new ArrayList();
            for (C0113f c0113f : listM730a) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo(c0113f.f494c, c0113f.f495d, null);
                runningAppProcessInfo.uid = c0113f.f493b;
                arrayList.add(runningAppProcessInfo);
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m733b() {
        try {
            List<C0113f> listM730a = m730a();
            int iMyPid = Process.myPid();
            for (C0113f c0113f : listM730a) {
                if (c0113f.f495d == iMyPid && c0113f.f492a) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
