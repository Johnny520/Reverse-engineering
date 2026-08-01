package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class f42 {

    /* JADX INFO: renamed from: β */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f3750 = null;
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: α */
    public p000.AbstractRunnableC0928vz[] f3751;

    static {
            java.lang.Class<f42> r0 = p000.f42.class
            java.lang.String r1 = "_size$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p000.f42.f3750 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2036(p000.AbstractRunnableC0928vz r5) {
            r4 = this;
            r0 = r4
            wz r0 = (p000.C0965wz) r0
            r5.m6288(r0)
            vz[] r0 = r4.f3751
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.f42.f3750
            if (r0 != 0) goto L12
            r0 = 4
            vz[] r0 = new p000.AbstractRunnableC0928vz[r0]
            r4.f3751 = r0
            goto L27
        L12:
            int r2 = r1.get(r4)
            int r3 = r0.length
            if (r2 < r3) goto L27
            int r2 = r1.get(r4)
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            vz[] r0 = (p000.AbstractRunnableC0928vz[]) r0
            r4.f3751 = r0
        L27:
            int r2 = r1.get(r4)
            int r3 = r2 + 1
            r1.set(r4, r3)
            r0[r2] = r5
            r5.f11493 = r2
            r4.m2038(r2)
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.AbstractRunnableC0928vz m2037(int r9) {
            r8 = this;
            vz[] r0 = r8.f3751
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.f42.f3750
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.m2039(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.m2039(r9, r2)
            r8.m2038(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            vz[] r5 = r8.f3751
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.m2039(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.m6288(r2)
            r9.f11493 = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
    }

    /* JADX INFO: renamed from: γ */
    public final void m2038(int r4) {
            r3 = this;
        L0:
            if (r4 > 0) goto L3
            goto L1c
        L3:
            vz[] r0 = r3.f3751
            r0.getClass()
            int r1 = r4 + (-1)
            int r1 = r1 / 2
            r2 = r0[r1]
            r2.getClass()
            r0 = r0[r4]
            r0.getClass()
            int r0 = r2.compareTo(r0)
            if (r0 > 0) goto L1d
        L1c:
            return
        L1d:
            r3.m2039(r4, r1)
            r4 = r1
            goto L0
    }

    /* JADX INFO: renamed from: δ */
    public final void m2039(int r3, int r4) {
            r2 = this;
            vz[] r2 = r2.f3751
            r2.getClass()
            r0 = r2[r4]
            r0.getClass()
            r1 = r2[r3]
            r1.getClass()
            r2[r3] = r0
            r2[r4] = r1
            r0.f11493 = r3
            r1.f11493 = r4
            return
    }
}
