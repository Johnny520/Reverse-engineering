package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class hd {
    public static int a(Context r0, int r1) {
        return r0.getColor(r1);
    }

    public static <T> T b(Context r0, Class<T> r1) {
        return (T) r0.getSystemService(r1);
    }

    public static String c(Context r0, Class<?> r1) {
        return r0.getSystemServiceName(r1);
    }
}
