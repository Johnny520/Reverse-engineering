package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends r7.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v7.h0 f14159m;

    public i0(int r3) {
            r2 = this;
            r2.<init>(r3)
            byte[] r3 = r2.f11553k
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto Le
            r1 = 0
            short r0 = (short) r0
            k7.a.F(r3, r1, r0)
        Le:
            byte[] r3 = r2.f11553k
            r0 = 4
            r1 = -1
            k7.a.D(r3, r0, r1)
            return
    }

    @Override // r7.b, k7.a
    public final void B(q7.b r5) {
            r4 = this;
            int r0 = r5.f10666k
            byte[] r1 = r4.f11553k
            int r2 = r1.length
            r5.e(r1, r2)
            byte[] r1 = r4.f11553k
            r2 = 2
            r3 = 3
            boolean r1 = k7.a.q(r1, r2, r3)
            if (r1 != 0) goto L27
            r5.g(r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            short r1 = r5.readShort()
            r0 = r0 & r1
            r1 = 0
            r4.M(r0, r1)
            byte[] r0 = r4.f11553k
            int r1 = r0.length
            r5.e(r0, r1)
        L27:
            return
    }

    public final int N() {
            r3 = this;
            byte[] r0 = r3.f11553k
            r1 = 2
            r2 = 3
            boolean r0 = k7.a.q(r0, r1, r2)
            byte[] r1 = r3.f11553k
            if (r0 == 0) goto L12
            r0 = 0
            int r0 = k7.a.x(r1, r0)
            return r0
        L12:
            r0 = 4
            int r0 = k7.a.s(r1, r0)
            return r0
    }
}
