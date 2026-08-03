package p000a;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: a.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0946z1 {
    /* JADX INFO: renamed from: a */
    public static int m2233a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m2234b(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static AppOpsManager m2235c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
