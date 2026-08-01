package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: fd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0220fd {
    /* JADX INFO: renamed from: a */
    public static File[] m1155a(Context context) {
        return context.getExternalCacheDirs();
    }

    /* JADX INFO: renamed from: b */
    public static File[] m1156b(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    /* JADX INFO: renamed from: c */
    public static File[] m1157c(Context context) {
        return context.getObbDirs();
    }
}
