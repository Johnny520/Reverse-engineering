package p082p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0783a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static File m1445a(Context context) {
        return context.getCodeCacheDir();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Drawable m1446b(Context context, int i2) {
        return context.getDrawable(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static File m1447c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
