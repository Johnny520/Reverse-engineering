package io.sentry.util;

/* JADX INFO: renamed from: io.sentry.util.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2034f {

    /* JADX INFO: renamed from: a */
    public static final boolean f7219a = false;

    /* JADX INFO: renamed from: b */
    public static final boolean f7220b = false;

    static {
        f7219a = "The Android Project".equals(System.getProperty("java.vendor"));     // Catch: Throwable -> L5
    L19:
        String r1 = System.getProperty("java.specification.version");     // Catch: Throwable -> L15
        if (r1 != null) goto L9;
        f7220b = false;     // Catch: Throwable -> L15
        return;
    L9:
        if (Double.valueOf(r1).doubleValue() < 9.0d) goto L11;
        boolean r12 = true;
    L12:
        f7220b = r12;     // Catch: Throwable -> L15
        return;
    L11:
        r12 = false;
    L15:
        f7220b = false;
        return;
    L5:
        f7219a = false;
        goto L19
    }
}
