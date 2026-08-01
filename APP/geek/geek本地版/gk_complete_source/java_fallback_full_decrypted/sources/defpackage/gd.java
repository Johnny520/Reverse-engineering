package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gd {
    public static java.io.File a(android.content.Context r0) {
            java.io.File r0 = r0.getCodeCacheDir()
            return r0
    }

    public static android.graphics.drawable.Drawable b(android.content.Context r0, int r1) {
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            return r0
    }

    public static java.io.File c(android.content.Context r0) {
            java.io.File r0 = r0.getNoBackupFilesDir()
            return r0
    }
}
