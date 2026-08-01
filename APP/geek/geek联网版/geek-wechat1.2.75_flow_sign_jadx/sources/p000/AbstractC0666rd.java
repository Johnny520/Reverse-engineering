package p000;

import android.content.Context;

/* JADX INFO: renamed from: rd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0666rd {
    /* JADX INFO: renamed from: a */
    public static int m2288a(Context context, int i) {
        return context.getColor(i);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m2289b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: c */
    public static String m2290c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
