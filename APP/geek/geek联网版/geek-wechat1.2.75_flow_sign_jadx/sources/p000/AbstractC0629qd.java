package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: qd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0629qd {
    /* JADX INFO: renamed from: a */
    public static File m2147a(Context context) {
        return context.getCodeCacheDir();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m2148b(Context context, int i) {
        return context.getDrawable(i);
    }

    /* JADX INFO: renamed from: c */
    public static File m2149c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
