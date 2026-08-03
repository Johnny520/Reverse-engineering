package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bg */
/* JADX INFO: loaded from: classes.dex */
public final class C0052bg {

    /* JADX INFO: renamed from: a */
    private static volatile C0052bg f286a = null;

    /* JADX INFO: renamed from: b */
    private static Map<String, Object> f287b = new TreeMap();

    /* JADX INFO: renamed from: c */
    private static final int f288c = 10800000;

    private C0052bg() {
        try {
            if (m311c()) {
                m310b();
                m312d();
                m313e();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0052bg m308a() {
        if (f286a == null) {
            synchronized (C0052bg.class) {
                if (f286a == null) {
                    f286a = new C0052bg();
                }
            }
        }
        return f286a;
    }

    /* JADX INFO: renamed from: a */
    private List<String> m309a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (m311c()) {
            return arrayList;
        }
        if (C0131y.m754a(30) && C0131y.m756a(context, 30) && !C0131y.m773c(context, "android.permission.QUERY_ALL_PACKAGES")) {
            return arrayList;
        }
        PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> listM601d = C0118k.m601d(context);
        if (listM601d != null) {
            for (PackageInfo packageInfo : listM601d) {
                arrayList.add(packageInfo.packageName);
                try {
                    arrayList.add(C0131y.m761b(packageManager.getApplicationLabel(packageInfo.applicationInfo).toString().getBytes()));
                } catch (Throwable unused) {
                    arrayList.add("");
                }
                arrayList.add((packageInfo.applicationInfo.flags & 1) > 0 ? "1" : "0");
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private void m310b() {
        List<PackageInfo> listM601d;
        try {
            ArrayList arrayList = new ArrayList();
            if (C0131y.m754a(21) && C0131y.m764b(24)) {
                for (C0113f c0113f : C0126t.m730a()) {
                    if (!c0113f.f494c.startsWith("android.") && !c0113f.f494c.equals("system")) {
                        arrayList.add(c0113f.f494c);
                    }
                }
            } else if (C0131y.m764b(21)) {
                ActivityManager activityManager = (ActivityManager) C0020ab.f132g.getSystemService("activity");
                if (activityManager != null) {
                    PackageManager packageManager = C0020ab.f132g.getPackageManager();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (it.hasNext()) {
                            String str = it.next().processName;
                            try {
                                if (packageManager.getLaunchIntentForPackage(str) != null) {
                                    arrayList.add(str);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            } else if (C0131y.m764b(30) && (listM601d = C0118k.m601d(C0020ab.f132g)) != null) {
                for (PackageInfo packageInfo : listM601d) {
                    int i = packageInfo.applicationInfo.flags;
                    if ((i & 1) == 0 && (i & 128) == 0 && (i & 2097152) == 0) {
                        arrayList.add(packageInfo.packageName);
                    }
                }
            }
            f287b.put("ras", arrayList.toString());
            C0116i.setCollectRunningTime(System.currentTimeMillis());
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m311c() {
        try {
            if (C0020ab.f110T.isAppListEnabled() && !C0020ab.f109S) {
                return System.currentTimeMillis() - C0116i.m555g() > 10800000;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m312d() {
        try {
            f287b.put("aas", m309a(C0020ab.f132g).toString());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private void m313e() {
        C0067bv c0067bv = new C0067bv();
        c0067bv.f353b = "env";
        c0067bv.f354c = "apps";
        c0067bv.f355d = f287b;
        c0067bv.f352a = AbstractC0018a.ENV;
        C0132z.m785a().post(c0067bv);
    }
}
