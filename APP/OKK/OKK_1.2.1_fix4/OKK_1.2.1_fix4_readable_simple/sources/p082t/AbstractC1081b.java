package p082t;

import android.content.Context;

/* JADX INFO: renamed from: t.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1081b {
    /* JADX INFO: renamed from: a */
    public static int m2562a(Context r02, int r1) {
        return r02.getColor(r1);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m2563b(Context r02, Class<T> r1) {
        return (T) r02.getSystemService(r1);
    }

    /* JADX INFO: renamed from: c */
    public static String m2564c(Context r02, Class<?> r1) {
        return r02.getSystemServiceName(r1);
    }
}
