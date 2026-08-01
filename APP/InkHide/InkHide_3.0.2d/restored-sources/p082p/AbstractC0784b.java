package p082p;

import android.content.Context;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0784b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m1448a(Context context, int i2) {
        return context.getColor(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static <T> T m1449b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m1450c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
