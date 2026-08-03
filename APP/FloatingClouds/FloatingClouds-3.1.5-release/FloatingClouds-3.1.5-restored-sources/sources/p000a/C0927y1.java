package p000a;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: a.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0927y1 {
    /* JADX INFO: renamed from: a */
    public static <T> T m2212a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: b */
    public static int m2213b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m2214c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m2215d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
