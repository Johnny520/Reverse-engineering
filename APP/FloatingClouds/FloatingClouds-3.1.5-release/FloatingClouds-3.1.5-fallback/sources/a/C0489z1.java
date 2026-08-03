package a;

/* JADX INFO: renamed from: a.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0489z1 {
    public static int a(android.app.AppOpsManager r0, java.lang.String r1, int r2, java.lang.String r3) {
            if (r0 != 0) goto L4
            r0 = 1
            return r0
        L4:
            int r0 = r0.checkOpNoThrow(r1, r2, r3)
            return r0
    }

    public static java.lang.String b(android.content.Context r0) {
            java.lang.String r0 = r0.getOpPackageName()
            return r0
    }

    public static android.app.AppOpsManager c(android.content.Context r1) {
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            return r1
    }
}
