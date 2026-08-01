package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: pd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0592pd {
    /* JADX INFO: renamed from: a */
    public static File[] m2087a(Context context) {
        return context.getExternalCacheDirs();
    }

    /* JADX INFO: renamed from: b */
    public static File[] m2088b(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    /* JADX INFO: renamed from: c */
    public static File[] m2089c(Context context) {
        return context.getObbDirs();
    }
}
