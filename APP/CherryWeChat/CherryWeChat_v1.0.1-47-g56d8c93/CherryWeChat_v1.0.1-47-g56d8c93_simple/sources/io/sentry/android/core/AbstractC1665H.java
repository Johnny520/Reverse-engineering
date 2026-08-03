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
    public static final C0061Bb f5968a = null;

    /* JADX INFO: renamed from: b */
    public static final C0061Bb f5969b = null;

    /* JADX INFO: renamed from: c */
    public static final C0061Bb f5970c = null;

    /* JADX INFO: renamed from: d */
    public static final C0061Bb f5971d = null;

    /* JADX INFO: renamed from: e */
    public static final C0061Bb f5972e = null;

    static {
        f5968a = new C0061Bb(new C2438r1(26));
        f5969b = new C0061Bb(new C2438r1(27));
        f5970c = new C0061Bb(new C2438r1(28));
        f5971d = new C0061Bb(new C2438r1(29));
        f5972e = new C0061Bb(new C2438r1(25));
    }

    /* JADX INFO: renamed from: a */
    public static String m3823a(ILogger r3) {
        return Build.MODEL.split(" ", -1)[0];
    L4:
        th = move-exception;
        r3.mo3683r(EnumC1657a2.ERROR, "Error getting device family.", th);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ActivityManager.MemoryInfo m3824b(Context r3, ILogger r4) {
        ActivityManager r32 = (ActivityManager) r3.getSystemService("activity");     // Catch: Throwable -> L7
        ActivityManager.MemoryInfo r2 = new ActivityManager.MemoryInfo();     // Catch: Throwable -> L7
        if (r32 == null) goto L9;
        r32.getMemoryInfo(r2);     // Catch: Throwable -> L7
        return r2;
    L9:
        r4.mo3680e(EnumC1657a2.INFO, "Error getting MemoryInfo.", new Object[0]);     // Catch: Throwable -> L7
        return null;
    L7:
        th = move-exception;
        r4.mo3683r(EnumC1657a2.ERROR, "Error getting MemoryInfo.", th);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static PackageInfo m3825c(Context r1, C1666I r2) {
        r2.getClass();
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return (PackageInfo) f5968a.m97b(r1);
    L7:
        return (PackageInfo) f5969b.m97b(r1);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3826d() {
        ActivityManager.RunningAppProcessInfo r1 = new ActivityManager.RunningAppProcessInfo();     // Catch: Throwable -> L8
        ActivityManager.getMyMemoryState(r1);     // Catch: Throwable -> L8
        if (r1.importance != 100) goto L11;
        return true;
    L11:
        return false;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3827e(Bundle r1, ILogger r2, String r3, boolean r4) {
        boolean r12 = r1.getBoolean(r3, r4);
        r2.mo3680e(EnumC1657a2.DEBUG, r3 + " read: " + r12, new Object[0]);
        return r12;
    }

    /* JADX INFO: renamed from: f */
    public static double m3828f(Bundle r4, ILogger r5, String r6) {
        double r0 = Float.valueOf(r4.getFloat(r6, -1.0f)).doubleValue();
        if (r0 != (-1.0d)) goto L5;
        r0 = Integer.valueOf(r4.getInt(r6, -1)).doubleValue();
    L5:
        r5.mo3680e(EnumC1657a2.DEBUG, r6 + " read: " + r0, new Object[0]);
        return r0;
    }

    /* JADX INFO: renamed from: g */
    public static List m3829g(Bundle r2, ILogger r3, String r4) {
        String r22 = r2.getString(r4);
        r3.mo3680e(EnumC1657a2.DEBUG, r4 + " read: " + r22, new Object[0]);
        if (r22 != null) goto L5;
        return null;
    L5:
        return Arrays.asList(r22.split(",", -1));
    }

    /* JADX INFO: renamed from: h */
    public static long m3830h(Bundle r1, ILogger r2, String r3, long r4) {
        long r42 = r1.getInt(r3, (int) r4);
        r2.mo3680e(EnumC1657a2.DEBUG, r3 + " read: " + r42, new Object[0]);
        return r42;
    }

    /* JADX INFO: renamed from: i */
    public static String m3831i(Bundle r1, ILogger r2, String r3, String r4) {
        String r12 = r1.getString(r3, r4);
        r2.mo3680e(EnumC1657a2.DEBUG, r3 + " read: " + r12, new Object[0]);
        return r12;
    }

    /* JADX INFO: renamed from: j */
    public static String m3832j(Bundle r1, ILogger r2, String r3, String r4) {
        String r12 = r1.getString(r3, r4);
        r2.mo3680e(EnumC1657a2.DEBUG, r3 + " read: " + r12, new Object[0]);
        return r12;
    }
}
