package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class gd {
    public static File a(Context r0) {
        return r0.getCodeCacheDir();
    }

    public static Drawable b(Context r0, int r1) {
        return r0.getDrawable(r1);
    }

    public static File c(Context r0) {
        return r0.getNoBackupFilesDir();
    }
}
