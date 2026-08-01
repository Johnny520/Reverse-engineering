package p080o;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: o.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0779e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m1435a(AppOpsManager appOpsManager, String str, int i2, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1436b(Context context) {
        return context.getOpPackageName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static AppOpsManager m1437c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
