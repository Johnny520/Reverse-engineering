package yyds;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᲇᲇᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2546 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final long f12548;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final String f12549;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final long f12550;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final int f12551;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C0135 f12552;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final int f12553;

    static {
        String property;
        int i = AbstractC1445.f6859;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f12549 = property;
        f12550 = AbstractC1544.m3185("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC1445.f6859;
        if (i2 < 2) {
            i2 = 2;
        }
        f12551 = AbstractC1544.m3183("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        f12553 = AbstractC1544.m3183("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f12548 = TimeUnit.SECONDS.toNanos(AbstractC1544.m3185("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f12552 = C0135.f837;
    }
}
