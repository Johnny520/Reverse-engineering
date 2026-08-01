package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class fd {
    public static File[] a(Context r0) {
        return r0.getExternalCacheDirs();
    }

    public static File[] b(Context r0, String r1) {
        return r0.getExternalFilesDirs(r1);
    }

    public static File[] c(Context r0) {
        return r0.getObbDirs();
    }
}
