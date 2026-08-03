package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class f extends r7.b implements r7.m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f11559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11560n;

    public f(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.k(r2)
            return
    }

    public f(boolean r2) {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            r1.f11559m = r2
            return
    }

    @Override // r7.b
    public final void L() {
            r4 = this;
            byte[] r0 = r4.f11553k
            boolean r1 = r4.f11559m
            r2 = 0
            if (r1 == 0) goto L2a
            r1 = 4
            int r3 = r0.length
            if (r1 <= r3) goto Lc
            goto L2e
        Lc:
            r1 = 3
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r1 = r1 | r3
            r3 = 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r1 = r1 | r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r2 = r1 | r0
            goto L2e
        L2a:
            int r2 = k7.a.s(r0, r2)
        L2e:
            r4.f11560n = r2
            return
    }

    @Override // r7.g
    public final int get() {
            r1 = this;
            int r0 = r1.f11560n
            return r0
    }

    @Override // r7.g
    public final void k(int r5) {
            r4 = this;
            int r0 = r4.f11560n
            if (r5 != r0) goto L5
            goto L12
        L5:
            r4.f11560n = r5
            byte[] r0 = r4.f11553k
            boolean r1 = r4.f11559m
            r2 = 0
            if (r1 == 0) goto L31
            r1 = 4
            int r3 = r0.length
            if (r1 <= r3) goto L13
        L12:
            return
        L13:
            int r1 = r5 >>> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r0[r2] = r1
            int r1 = r5 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 1
            r0[r2] = r1
            int r1 = r5 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 2
            r0[r2] = r1
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r1 = 3
            r0[r1] = r5
            return
        L31:
            k7.a.D(r0, r2, r5)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f11560n
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
