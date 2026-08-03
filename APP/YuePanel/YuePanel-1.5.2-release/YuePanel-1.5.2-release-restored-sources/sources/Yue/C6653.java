package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6653 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f2210 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2211 = -1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f17099 = -2;

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠۠$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1045 {
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m3127(@InterfaceC6391 Context context, @InterfaceC6391 String str) {
        return m21275(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m3128(@InterfaceC6391 Context context, @InterfaceC6391 String str, @InterfaceC6490 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return m21275(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m21275(@InterfaceC6391 Context context, @InterfaceC6391 String str, int i, int i2, @InterfaceC6490 String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strM6895 = C3366.m6895(str);
        if (strM6895 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i2 || !C6499.m2995(context.getPackageName(), str2)) ? C3366.m6894(context, strM6895, str2) : C3366.m447(context, i2, strM6895, str2)) == 0 ? 0 : -2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m21276(@InterfaceC6391 Context context, @InterfaceC6391 String str) {
        return m21275(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
