package p000;

import android.content.Context;

/* JADX INFO: renamed from: hd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0294hd {
    /* JADX INFO: renamed from: a */
    public static int m1354a(Context context, int i) {
        return context.getColor(i);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m1355b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: c */
    public static String m1356c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
