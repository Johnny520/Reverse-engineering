package p000;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: x5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0881x5 {
    /* JADX INFO: renamed from: a */
    public static int m2610a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m2611b(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static AppOpsManager m2612c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
