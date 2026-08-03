package p082t;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1080a {
    /* JADX INFO: renamed from: a */
    public static File m2559a(Context context) {
        return context.getCodeCacheDir();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m2560b(Context context, int i2) {
        return context.getDrawable(i2);
    }

    /* JADX INFO: renamed from: c */
    public static File m2561c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
