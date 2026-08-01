package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲀᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C1181 extends xhss.C0213 {

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static final long f3806 = 0;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static xhss.C1181 f3807;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final xhss.C0107 f3808 = null;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final long f3809 = 0;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final java.util.concurrent.locks.ReentrantLock f3810 = null;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final java.util.concurrent.locks.Condition f3811 = null;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f3812;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public long f3813;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f3814;

    static {
            xhss.ᛱᲇᛴᲇ r0 = new xhss.ᛱᲇᛴᲇ
            r1 = 5
            r2 = 0
            r0.<init>(r1, r2)
            r1 = 8
            xhss.ᲈᲀᲇᛶ[] r1 = new xhss.C1181[r1]
            r0.f486 = r1
            xhss.C1181.f3808 = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            xhss.C1181.f3810 = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            xhss.C1181.f3811 = r0
            r0 = 60000(0xea60, double:2.9644E-319)
            xhss.C1181.f3806 = r0
            r0 = 60000000000(0xdf8475800, double:2.96439387505E-313)
            xhss.C1181.f3809 = r0
            return
    }

    public C1181() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f3814 = r0
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final boolean m1892() {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = xhss.C1181.f3810
            r0.lock()
            int r1 = r4.f3812     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r4.f3812 = r2     // Catch: java.lang.Throwable -> L16
            r3 = 1
            if (r1 != r3) goto L18
            xhss.ᛱᲇᛴᲇ r1 = xhss.C1181.f3808     // Catch: java.lang.Throwable -> L16
            r1.m295(r4)     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return r2
        L16:
            r4 = move-exception
            goto L20
        L18:
            r4 = 2
            if (r1 != r4) goto L1c
            r2 = r3
        L1c:
            r0.unlock()
            return r2
        L20:
            r0.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final void m1893() {
            r5 = this;
            long r0 = r5.f789
            boolean r2 = r5.f790
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.concurrent.locks.ReentrantLock r0 = xhss.C1181.f3810
            r0.lock()
            int r1 = r5.f3812     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L22
            r1 = 1
            r5.f3812 = r1     // Catch: java.lang.Throwable -> L20
            xhss.AbstractC0694.m1220(r5)     // Catch: java.lang.Throwable -> L20
            r0.unlock()
            return
        L20:
            r5 = move-exception
            goto L2a
        L22:
            java.lang.String r5 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L2a:
            r0.unlock()
            throw r5
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public void mo851() {
            r0 = this;
            return
    }
}
