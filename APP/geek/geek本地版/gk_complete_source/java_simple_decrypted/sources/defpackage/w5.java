package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class w5 {
    public static <T> T a(Context r0, Class<T> r1) {
        return (T) r0.getSystemService(r1);
    }

    public static int b(AppOpsManager r0, String r1, String r2) {
        return r0.noteProxyOp(r1, r2);
    }

    public static int c(AppOpsManager r0, String r1, String r2) {
        return r0.noteProxyOpNoThrow(r1, r2);
    }

    public static String d(String r0) {
        return AppOpsManager.permissionToOp(r0);
    }
}
