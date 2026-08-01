package defpackage;

/* JADX INFO: renamed from: ᛴᛱᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0606 extends defpackage.AbstractC0351 implements defpackage.InterfaceC0484 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final /* synthetic */ long f2993 = 0;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f2994 = null;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final long f2995;

    static {
            java.lang.Class<ᛴᛱᛴᛳ> r0 = defpackage.AbstractC0606.class
            java.lang.String r1 = "cleanedAndPointers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.AbstractC0606.f2994 = r2
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            long r0 = r2.objectFieldOffset(r0)
            defpackage.AbstractC0606.f2993 = r0
            return
    }

    public AbstractC0606(long r1, defpackage.C2053 r3, int r4) {
            r0 = this;
            r0.<init>(r3)
            r0.f2995 = r1
            int r1 = r4 << 16
            r0.cleanedAndPointers$volatile = r1
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public abstract int mo1402();

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean m1403() {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.AbstractC0606.f2994
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r3, r1)
            int r1 = r3.mo1402()
            if (r0 != r1) goto L23
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC0351.f1815
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC2279.f9634
            if (r3 != r0) goto L1c
            r3 = 0
            goto L1e
        L1c:
            ᛲᲀᛵᲈ r3 = (defpackage.AbstractC0351) r3
        L1e:
            if (r3 != 0) goto L21
            goto L23
        L21:
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    @Override // defpackage.AbstractC0351
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo1062() {
            r3 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC0606.f2993
            int r1 = r0.getIntVolatile(r3, r1)
            int r2 = r3.mo1402()
            if (r1 != r2) goto L21
            long r1 = defpackage.AbstractC0351.f1815
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC2279.f9634
            if (r3 != r0) goto L1a
            r3 = 0
            goto L1c
        L1a:
            ᛲᲀᛵᲈ r3 = (defpackage.AbstractC0351) r3
        L1c:
            if (r3 != 0) goto L1f
            goto L21
        L1f:
            r3 = 1
            return r3
        L21:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public abstract void mo1404(int r1);

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean m1405() {
            r7 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0606.f2993
            int r4 = r0.getIntVolatile(r7, r2)
            int r1 = r7.mo1402()
            if (r4 != r1) goto L21
            long r5 = defpackage.AbstractC0351.f1815
            java.lang.Object r1 = r0.getObjectVolatile(r7, r5)
            ᛳᛴᛵᛱ r5 = defpackage.AbstractC2279.f9634
            if (r1 != r5) goto L1a
            r1 = 0
            goto L1c
        L1a:
            ᛲᲀᛵᲈ r1 = (defpackage.AbstractC0351) r1
        L1c:
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r7 = 0
            return r7
        L21:
            r1 = 65536(0x10000, float:9.1835E-41)
            int r5 = r4 + r1
            r1 = r7
            boolean r7 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r7 == 0) goto L2e
            r7 = 1
            return r7
        L2e:
            r7 = r1
            goto L0
    }
}
