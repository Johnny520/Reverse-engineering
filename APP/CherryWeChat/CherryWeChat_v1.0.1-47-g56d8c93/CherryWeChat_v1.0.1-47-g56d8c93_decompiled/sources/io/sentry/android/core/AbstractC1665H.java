package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import java.util.Arrays;
import java.util.List;
import p000.C0061Bb;
import p000.C2438r1;

/* JADX INFO: renamed from: io.sentry.android.core.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1665H {

    /* JADX INFO: renamed from: a */
    public static final C0061Bb f5968a = new C0061Bb(new C2438r1(26));

    /* JADX INFO: renamed from: b */
    public static final C0061Bb f5969b = new C0061Bb(new C2438r1(27));

    /* JADX INFO: renamed from: c */
    public static final C0061Bb f5970c = new C0061Bb(new C2438r1(28));

    /* JADX INFO: renamed from: d */
    public static final C0061Bb f5971d = new C0061Bb(new C2438r1(29));

    /* JADX INFO: renamed from: e */
    public static final C0061Bb f5972e = new C0061Bb(new C2438r1(25));

    /* JADX INFO: renamed from: a */
    public static String m3823a(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            iLogger.mo3683r(EnumC1657a2.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static ActivityManager.MemoryInfo m3824b(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.mo3680e(EnumC1657a2.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.mo3683r(EnumC1657a2.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static PackageInfo m3825c(Context context, C1666I c1666i) {
        c1666i.getClass();
        return Build.VERSION.SDK_INT >= 33 ? (PackageInfo) f5968a.m97b(context) : (PackageInfo) f5969b.m97b(context);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3826d() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3827e(Bundle bundle, ILogger iLogger, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        iLogger.mo3680e(EnumC1657a2.DEBUG, str + " read: " + z2, new Object[0]);
        return z2;
    }

    /* JADX INFO: renamed from: f */
    public static double m3828f(Bundle bundle, ILogger iLogger, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        iLogger.mo3680e(EnumC1657a2.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: g */
    public static List m3829g(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.mo3680e(EnumC1657a2.DEBUG, str + " read: " + string, new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static long m3830h(Bundle bundle, ILogger iLogger, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        iLogger.mo3680e(EnumC1657a2.DEBUG, str + " read: " + j2, new Object[0]);
        return j2;
    }

    /* JADX INFO: renamed from: i */
    public static String m3831i(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.mo3680e(EnumC1657a2.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }

    /* JADX INFO: renamed from: j */
    public static String m3832j(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.mo3680e(EnumC1657a2.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }
}
