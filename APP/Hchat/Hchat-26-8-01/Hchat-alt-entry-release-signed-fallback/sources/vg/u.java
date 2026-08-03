package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f14361b = null;
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qg.j0[] f14362a;

    static {
            java.lang.Class<vg.u> r0 = vg.u.class
            java.lang.String r1 = "_size$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            vg.u.f14361b = r0
            return
    }

    public final void a(qg.j0 r5) {
            r4 = this;
            r0 = r4
            qg.k0 r0 = (qg.k0) r0
            r5.d(r0)
            qg.j0[] r0 = r4.f14362a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = vg.u.f14361b
            if (r0 != 0) goto L12
            r0 = 4
            qg.j0[] r0 = new qg.j0[r0]
            r4.f14362a = r0
            goto L27
        L12:
            int r2 = r1.get(r4)
            int r3 = r0.length
            if (r2 < r3) goto L27
            int r2 = r1.get(r4)
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            qg.j0[] r0 = (qg.j0[]) r0
            r4.f14362a = r0
        L27:
            int r2 = r1.get(r4)
            int r3 = r2 + 1
            r1.set(r4, r3)
            r0[r2] = r5
            r5.f11064h = r2
            r4.c(r2)
            return
    }

    public final qg.j0 b(int r9) {
            r8 = this;
            qg.j0[] r0 = r8.f14362a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = vg.u.f14361b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            qg.j0[] r5 = r8.f14362a
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
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.f11064h = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
    }

    public final void c(int r4) {
            r3 = this;
        L0:
            if (r4 > 0) goto L3
            goto L1c
        L3:
            qg.j0[] r0 = r3.f14362a
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
            r3.d(r4, r1)
            r4 = r1
            goto L0
    }

    public final void d(int r4, int r5) {
            r3 = this;
            qg.j0[] r0 = r3.f14362a
            r0.getClass()
            r1 = r0[r5]
            r1.getClass()
            r2 = r0[r4]
            r2.getClass()
            r0[r4] = r1
            r0[r5] = r2
            r1.f11064h = r4
            r2.f11064h = r5
            return
    }
}
