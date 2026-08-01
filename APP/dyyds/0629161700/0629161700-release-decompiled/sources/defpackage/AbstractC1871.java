package defpackage;

/* JADX INFO: renamed from: ᲁᛶᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1871 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.ArrayList f8126 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.Random f8127 = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            defpackage.AbstractC1871.f8126 = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            defpackage.AbstractC1871.f8127 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static synchronized int m3277(int r4) {
            java.lang.Class<ᲁᛶᛵᛲ> r0 = defpackage.AbstractC1871.class
            monitor-enter(r0)
        L3:
            r1 = 20000(0x4e20, float:2.8026E-41)
            if (r4 <= r1) goto La
            int r1 = r4 + (-10000)
            goto Lc
        La:
            int r1 = r4 / 2
        Lc:
            java.util.Random r2 = defpackage.AbstractC1871.f8127     // Catch: java.lang.Throwable -> L2e
            int r3 = r4 - r1
            int r2 = r2.nextInt(r3)     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + r1
            r1 = 1025(0x401, float:1.436E-42)
            if (r2 == r1) goto L3
            java.util.ArrayList r1 = defpackage.AbstractC1871.f8126     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            r1.add(r4)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            return r2
        L2e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r4
    }
}
