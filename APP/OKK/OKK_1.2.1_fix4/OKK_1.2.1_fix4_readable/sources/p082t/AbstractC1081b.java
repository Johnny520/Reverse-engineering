package p082t;

import android.content.Context;

/* JADX INFO: renamed from: t.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1081b {
    /* JADX INFO: renamed from: a */
    public static int m2562a(Context context, int i2) {
        return context.getColor(i2);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m2563b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: c */
    public static String m2564c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
