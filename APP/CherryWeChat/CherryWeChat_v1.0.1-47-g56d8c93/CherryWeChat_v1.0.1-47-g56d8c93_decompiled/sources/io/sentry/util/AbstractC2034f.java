package io.sentry.util;

/* JADX INFO: renamed from: io.sentry.util.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2034f {

    /* JADX INFO: renamed from: a */
    public static final boolean f7219a;

    /* JADX INFO: renamed from: b */
    public static final boolean f7220b;

    static {
        try {
            f7219a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f7219a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f7220b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f7220b = false;
            }
        } catch (Throwable unused2) {
            f7220b = false;
        }
    }
}
