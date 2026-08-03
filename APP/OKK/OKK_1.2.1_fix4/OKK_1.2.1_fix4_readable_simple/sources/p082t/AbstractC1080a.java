package p082t;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1080a {
    /* JADX INFO: renamed from: a */
    public static File m2559a(Context r02) {
        return r02.getCodeCacheDir();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m2560b(Context r02, int r1) {
        return r02.getDrawable(r1);
    }

    /* JADX INFO: renamed from: c */
    public static File m2561c(Context r02) {
        return r02.getNoBackupFilesDir();
    }
}
