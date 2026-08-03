package a;

/* JADX INFO: renamed from: a.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0471y1 {
    public static <T> T a(android.content.Context r0, java.lang.Class<T> r1) {
            java.lang.Object r0 = r0.getSystemService(r1)
            return r0
    }

    public static int b(android.app.AppOpsManager r0, java.lang.String r1, java.lang.String r2) {
            int r0 = r0.noteProxyOp(r1, r2)
            return r0
    }

    public static int c(android.app.AppOpsManager r0, java.lang.String r1, java.lang.String r2) {
            int r0 = r0.noteProxyOpNoThrow(r1, r2)
            return r0
    }

    public static java.lang.String d(java.lang.String r0) {
            java.lang.String r0 = android.app.AppOpsManager.permissionToOp(r0)
            return r0
    }
}
