package p000;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: w5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0844w5 {
    /* JADX INFO: renamed from: a */
    public static <T> T m2546a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: b */
    public static int m2547b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m2548c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m2549d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
