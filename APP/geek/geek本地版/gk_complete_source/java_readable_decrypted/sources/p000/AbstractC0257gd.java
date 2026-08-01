package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: gd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0257gd {
    /* JADX INFO: renamed from: a */
    public static File m1269a(Context context) {
        return context.getCodeCacheDir();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m1270b(Context context, int i) {
        return context.getDrawable(i);
    }

    /* JADX INFO: renamed from: c */
    public static File m1271c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
