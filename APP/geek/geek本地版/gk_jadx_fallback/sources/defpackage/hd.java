package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hd {
    public static int a(android.content.Context r0, int r1) {
            int r0 = r0.getColor(r1)
            return r0
    }

    public static <T> T b(android.content.Context r0, java.lang.Class<T> r1) {
            java.lang.Object r0 = r0.getSystemService(r1)
            return r0
    }

    public static java.lang.String c(android.content.Context r0, java.lang.Class<?> r1) {
            java.lang.String r0 = r0.getSystemServiceName(r1)
            return r0
    }
}
