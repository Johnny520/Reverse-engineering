package p080o;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: o.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0778d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static <T> T m1431a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m1432b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m1433c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m1434d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
