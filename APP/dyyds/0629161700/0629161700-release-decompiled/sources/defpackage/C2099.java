package defpackage;

/* JADX INFO: renamed from: ᲇᛷᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2099 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final /* synthetic */ long f8999 = 0;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final /* synthetic */ long f9000 = 0;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f9001 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f9002 = 0;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f9003 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9004 = null;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private volatile /* synthetic */ java.lang.Object tail$volatile;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1913 f9005;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f9006;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᲇᛷᲈᛴ> r1 = defpackage.C2099.class
            java.lang.String r2 = "head$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.C2099.f9000 = r2
            java.lang.String r2 = "deqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r2)
            defpackage.C2099.f9001 = r2
            java.lang.String r2 = "tail$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.C2099.f9002 = r2
            java.lang.String r2 = "enqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r2)
            defpackage.C2099.f9003 = r2
            java.lang.String r2 = "_availablePermits$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r2)
            defpackage.C2099.f9004 = r3
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C2099.f8999 = r0
            return
    }

    public C2099(int r6) {
            r5 = this;
            r5.<init>()
            r5.f9006 = r6
            if (r6 <= 0) goto L2c
            if (r6 < 0) goto L21
            ᲇᛵᲀᛷ r0 = new ᲇᛵᲀᛷ
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r3, r1, r2)
            r5.head$volatile = r0
            r5.tail$volatile = r0
            r5._availablePermits$volatile = r6
            ᲁᲀᛷᛴ r6 = new ᲁᲀᛷᛴ
            r0 = 2
            r6.<init>(r0, r5)
            r5.f9005 = r6
            return
        L21:
            java.lang.String r5 = "The number of acquired permits should be in 0.."
            java.lang.String r5 = defpackage.AbstractC1124.m2145(r6, r5)
            defpackage.C2264.m3678(r5)
            r5 = 0
            throw r5
        L2c:
            java.lang.String r5 = "Semaphore should have at least 1 permit, but had "
            java.lang.String r5 = defpackage.AbstractC1124.m2145(r6, r5)
            defpackage.C2264.m3678(r5)
            r5 = 0
            throw r5
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m3521() {
            r16 = this;
            r1 = r16
        L2:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.C2099.f9004
            int r0 = r0.getAndIncrement(r1)
            int r6 = r1.f9006
            if (r0 >= r6) goto Le4
            if (r0 < 0) goto L10
            goto Lcc
        L10:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r7 = defpackage.C2099.f9000
            java.lang.Object r0 = r0.getObjectVolatile(r1, r7)
            r9 = r0
            ᲇᛵᲀᛷ r9 = (defpackage.C2053) r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.C2099.f9001
            long r10 = r0.getAndIncrement(r1)
            int r0 = defpackage.AbstractC2031.f8757
            long r2 = (long) r0
            long r12 = r10 / r2
            ᛲᛷᲇᛱ r14 = defpackage.C0328.f1696
        L28:
            java.lang.Object r15 = defpackage.AbstractC2279.m3699(r9, r12, r14)
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC2279.f9634
            if (r15 != r0) goto L31
            goto L67
        L31:
            ᛴᛱᛴᛳ r5 = defpackage.C1825.m3218(r15)
        L35:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Object r0 = r0.getObjectVolatile(r1, r7)
            r4 = r0
            ᛴᛱᛴᛳ r4 = (defpackage.AbstractC0606) r4
            long r2 = r4.f2995
            long r0 = r5.f2995
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L49
            r1 = r16
            goto L67
        L49:
            boolean r0 = r5.m1405()
            if (r0 != 0) goto L52
            r1 = r16
            goto L28
        L52:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2099.f9000
            r1 = r16
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto Ld3
            boolean r0 = r4.m1403()
            if (r0 == 0) goto L67
            r4.m1061()
        L67:
            ᛴᛱᛴᛳ r0 = defpackage.C1825.m3218(r15)
            ᲇᛵᲀᛷ r0 = (defpackage.C2053) r0
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.f8847
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r4 = defpackage.AbstractC0351.f1816
            r6 = 0
            r3.putObjectVolatile(r0, r4, r6)
            long r3 = r0.f2995
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r3 = 0
            if (r0 <= 0) goto L7f
            goto Lca
        L7f:
            int r0 = defpackage.AbstractC2031.f8757
            long r4 = (long) r0
            long r10 = r10 % r4
            int r0 = (int) r10
            ᛳᛴᛵᛱ r4 = defpackage.AbstractC2031.f8756
            java.lang.Object r4 = r2.getAndSet(r0, r4)
            r5 = 1
            if (r4 != 0) goto Lb3
            int r4 = defpackage.AbstractC2031.f8755
            r6 = r3
        L90:
            if (r6 >= r4) goto L9f
            java.lang.Object r7 = r2.get(r0)
            ᛳᛴᛵᛱ r8 = defpackage.AbstractC2031.f8754
            if (r7 != r8) goto L9c
        L9a:
            r3 = r5
            goto Lca
        L9c:
            int r6 = r6 + 1
            goto L90
        L9f:
            ᛳᛴᛵᛱ r6 = defpackage.AbstractC2031.f8756
            ᛳᛴᛵᛱ r7 = defpackage.AbstractC2031.f8753
        La3:
            boolean r4 = r2.compareAndSet(r0, r6, r7)
            if (r4 == 0) goto Lab
            r3 = r5
            goto Lb1
        Lab:
            java.lang.Object r4 = r2.get(r0)
            if (r4 == r6) goto La3
        Lb1:
            r3 = r3 ^ r5
            goto Lca
        Lb3:
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC2031.f8752
            if (r4 != r0) goto Lb8
            goto Lca
        Lb8:
            boolean r0 = r4 instanceof defpackage.InterfaceC1046
            if (r0 == 0) goto Lcd
            ᛶᛳᲀ r4 = (defpackage.InterfaceC1046) r4
            ᲁᲀᛷᛴ r0 = r1.f9005
            ᛳᛴᛵᛱ r0 = r4.mo2005(r0)
            if (r0 == 0) goto Lca
            r4.mo2003(r0)
            goto L9a
        Lca:
            if (r3 == 0) goto L2
        Lcc:
            return
        Lcd:
            java.lang.String r0 = "unexpected: "
            defpackage.C2264.m3681(r4, r0)
            return
        Ld3:
            java.lang.Object r0 = r0.getObjectVolatile(r1, r7)
            if (r0 == r4) goto L52
            boolean r0 = r5.m1403()
            if (r0 == 0) goto L35
            r5.m1061()
            goto L35
        Le4:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2099.f8999
            int r4 = r0.getIntVolatile(r1, r2)
            int r5 = r1.f9006
            if (r4 <= r5) goto Lf9
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r0 != 0) goto Lf9
            r1 = r16
            goto Le4
        Lf9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m3522(defpackage.InterfaceC1434 r18) {
            r17 = this;
            r1 = r17
            r6 = r18
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r7 = defpackage.C2099.f9002
            java.lang.Object r0 = r0.getObjectVolatile(r1, r7)
            r9 = r0
            ᲇᛵᲀᛷ r9 = (defpackage.C2053) r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.C2099.f9003
            long r10 = r0.getAndIncrement(r1)
            ᲁᲁᛲᛱ r12 = defpackage.C1922.f8362
            int r0 = defpackage.AbstractC2031.f8757
            long r2 = (long) r0
            long r13 = r10 / r2
        L1c:
            java.lang.Object r15 = defpackage.AbstractC2279.m3699(r9, r13, r12)
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC2279.f9634
            if (r15 != r0) goto L25
            goto L5b
        L25:
            ᛴᛱᛴᛳ r5 = defpackage.C1825.m3218(r15)
        L29:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Object r0 = r0.getObjectVolatile(r1, r7)
            r4 = r0
            ᛴᛱᛴᛳ r4 = (defpackage.AbstractC0606) r4
            long r2 = r4.f2995
            long r0 = r5.f2995
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L3d
            r1 = r17
            goto L5b
        L3d:
            boolean r0 = r5.m1405()
            if (r0 != 0) goto L46
            r1 = r17
            goto L1c
        L46:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2099.f9002
            r1 = r17
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L96
            boolean r0 = r4.m1403()
            if (r0 == 0) goto L5b
            r4.m1061()
        L5b:
            ᛴᛱᛴᛳ r0 = defpackage.C1825.m3218(r15)
            r2 = r0
            ᲇᛵᲀᛷ r2 = (defpackage.C2053) r2
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.f8847
            int r0 = defpackage.AbstractC2031.f8757
            long r4 = (long) r0
            long r10 = r10 % r4
            int r0 = (int) r10
        L69:
            r4 = 0
            boolean r4 = r3.compareAndSet(r0, r4, r6)
            r5 = 1
            if (r4 == 0) goto L75
            r6.mo2642(r2, r0)
            return r5
        L75:
            java.lang.Object r4 = r3.get(r0)
            if (r4 == 0) goto L69
            ᛳᛴᛵᛱ r4 = defpackage.AbstractC2031.f8756
            ᛳᛴᛵᛱ r7 = defpackage.AbstractC2031.f8754
        L7f:
            boolean r2 = r3.compareAndSet(r0, r4, r7)
            if (r2 == 0) goto L8e
            r0 = r6
            ᛶᛳᲀ r0 = (defpackage.InterfaceC1046) r0
            ᲁᲀᛷᛴ r1 = r1.f9005
            r0.mo2004(r1)
            return r5
        L8e:
            java.lang.Object r2 = r3.get(r0)
            if (r2 == r4) goto L7f
            r0 = 0
            return r0
        L96:
            java.lang.Object r0 = r0.getObjectVolatile(r1, r7)
            if (r0 == r4) goto L46
            boolean r0 = r5.m1403()
            if (r0 == 0) goto L29
            r5.m1061()
            goto L29
    }
}
