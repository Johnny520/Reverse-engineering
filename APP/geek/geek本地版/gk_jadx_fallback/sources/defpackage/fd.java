package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fd {
    public static java.io.File[] a(android.content.Context r0) {
            java.io.File[] r0 = r0.getExternalCacheDirs()
            return r0
    }

    public static java.io.File[] b(android.content.Context r0, java.lang.String r1) {
            java.io.File[] r0 = r0.getExternalFilesDirs(r1)
            return r0
    }

    public static java.io.File[] c(android.content.Context r0) {
            java.io.File[] r0 = r0.getObbDirs()
            return r0
    }
}
