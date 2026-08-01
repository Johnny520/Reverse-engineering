package defpackage;

/* JADX INFO: renamed from: ᛸᲇᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1590 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicReference[] f7033 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1946 f7034 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final int f7035 = 0;

    static {
            ᲁᲇᛶᛶ r0 = new ᲁᲇᛶᛶ
            r1 = 0
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1, r1, r1)
            defpackage.AbstractC1590.f7034 = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 * 2
            int r0 = r0 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
            defpackage.AbstractC1590.f7035 = r0
            java.util.concurrent.atomic.AtomicReference[] r2 = new java.util.concurrent.atomic.AtomicReference[r0]
        L1e:
            if (r1 >= r0) goto L2a
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1e
        L2a:
            defpackage.AbstractC1590.f7033 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final void m2869(defpackage.C1946 r6) {
            ᲁᲇᛶᛶ r0 = r6.f8469
            if (r0 != 0) goto L47
            ᲁᲇᛶᛶ r0 = r6.f8470
            if (r0 != 0) goto L47
            boolean r0 = r6.f8465
            if (r0 == 0) goto Ld
            goto L2b
        Ld:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = defpackage.AbstractC1590.f7035
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicReference[] r1 = defpackage.AbstractC1590.f7033
            r0 = r1[r0]
            ᲁᲇᛶᛶ r1 = defpackage.AbstractC1590.f7034
            java.lang.Object r2 = r0.getAndSet(r1)
            ᲁᲇᛶᛶ r2 = (defpackage.C1946) r2
            if (r2 != r1) goto L2c
        L2b:
            return
        L2c:
            r1 = 0
            if (r2 == 0) goto L32
            int r3 = r2.f8466
            goto L33
        L32:
            r3 = r1
        L33:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r3 < r4) goto L3b
            r0.set(r2)
            return
        L3b:
            r6.f8469 = r2
            r6.f8468 = r1
            int r3 = r3 + 8192
            r6.f8466 = r3
            r0.set(r6)
            return
        L47:
            java.lang.String r6 = "Failed requirement."
            defpackage.C2264.m3684(r6)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1946 m2870() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = defpackage.AbstractC1590.f7035
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicReference[] r1 = defpackage.AbstractC1590.f7033
            r0 = r1[r0]
            ᲁᲇᛶᛶ r1 = defpackage.AbstractC1590.f7034
            java.lang.Object r2 = r0.getAndSet(r1)
            ᲁᲇᛶᛶ r2 = (defpackage.C1946) r2
            if (r2 != r1) goto L24
            ᲁᲇᛶᛶ r0 = new ᲁᲇᛶᛶ
            r0.<init>()
            return r0
        L24:
            r1 = 0
            if (r2 != 0) goto L30
            r0.set(r1)
            ᲁᲇᛶᛶ r0 = new ᲁᲇᛶᛶ
            r0.<init>()
            return r0
        L30:
            ᲁᲇᛶᛶ r3 = r2.f8469
            r0.set(r3)
            r2.f8469 = r1
            r0 = 0
            r2.f8466 = r0
            return r2
    }
}
