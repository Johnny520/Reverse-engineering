package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛷᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0185 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final int f711 = 0;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicReference[] f712 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0147 f713 = null;

    static {
            xhss.ᛲᛳᲁᛳ r0 = new xhss.ᛲᛳᲁᛳ
            r1 = 0
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1, r1, r1)
            xhss.AbstractC0185.f713 = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 * 2
            int r0 = r0 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
            xhss.AbstractC0185.f711 = r0
            java.util.concurrent.atomic.AtomicReference[] r2 = new java.util.concurrent.atomic.AtomicReference[r0]
        L1e:
            if (r1 >= r0) goto L2a
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1e
        L2a:
            xhss.AbstractC0185.f712 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0147 m444() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = xhss.AbstractC0185.f711
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicReference[] r1 = xhss.AbstractC0185.f712
            r0 = r1[r0]
            xhss.ᛲᛳᲁᛳ r1 = xhss.AbstractC0185.f713
            java.lang.Object r2 = r0.getAndSet(r1)
            xhss.ᛲᛳᲁᛳ r2 = (xhss.C0147) r2
            if (r2 != r1) goto L24
            xhss.ᛲᛳᲁᛳ r0 = new xhss.ᛲᛳᲁᛳ
            r0.<init>()
            return r0
        L24:
            r1 = 0
            if (r2 != 0) goto L30
            r0.set(r1)
            xhss.ᛲᛳᲁᛳ r0 = new xhss.ᛲᛳᲁᛳ
            r0.<init>()
            return r0
        L30:
            xhss.ᛲᛳᲁᛳ r3 = r2.f625
            r0.set(r3)
            r2.f625 = r1
            r0 = 0
            r2.f620 = r0
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final void m445(xhss.C0147 r6) {
            xhss.ᛲᛳᲁᛳ r0 = r6.f625
            if (r0 != 0) goto L47
            xhss.ᛲᛳᲁᛳ r0 = r6.f623
            if (r0 != 0) goto L47
            boolean r0 = r6.f624
            if (r0 == 0) goto Ld
            goto L2b
        Ld:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = xhss.AbstractC0185.f711
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicReference[] r1 = xhss.AbstractC0185.f712
            r0 = r1[r0]
            xhss.ᛲᛳᲁᛳ r1 = xhss.AbstractC0185.f713
            java.lang.Object r2 = r0.getAndSet(r1)
            xhss.ᛲᛳᲁᛳ r2 = (xhss.C0147) r2
            if (r2 != r1) goto L2c
        L2b:
            return
        L2c:
            r1 = 0
            if (r2 == 0) goto L32
            int r3 = r2.f620
            goto L33
        L32:
            r3 = r1
        L33:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r3 < r4) goto L3b
            r0.set(r2)
            return
        L3b:
            r6.f625 = r2
            r6.f619 = r1
            int r3 = r3 + 8192
            r6.f620 = r3
            r0.set(r6)
            return
        L47:
            java.lang.String r6 = "Failed requirement."
            xhss.C0532.m959(r6)
            return
    }
}
