package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class x5 {
    public static int a(AppOpsManager r0, String r1, int r2, String r3) {
        if (r0 != null) goto L6;
        return 1;
    L6:
        return r0.checkOpNoThrow(r1, r2, r3);
    }

    public static String b(Context r0) {
        return r0.getOpPackageName();
    }

    public static AppOpsManager c(Context r1) {
        return (AppOpsManager) r1.getSystemService(AppOpsManager.class);
    }
}
