package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r7.b implements r7.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f11561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11562n;

    public h(boolean r2) {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            r1.f11561m = r2
            return
    }

    @Override // r7.b
    public final void L() {
            r8 = this;
            byte[] r0 = r8.f11553k
            boolean r1 = r8.f11561m
            r2 = 0
            if (r1 == 0) goto L1b
            int r1 = r0.length
            r3 = 8
            r4 = 0
            if (r3 <= r1) goto Lf
            goto L1f
        Lf:
            if (r2 >= r3) goto L1f
            long r4 = r4 << r3
            r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            long r6 = (long) r1
            long r4 = r4 | r6
            int r2 = r2 + 1
            goto Lf
        L1b:
            long r4 = k7.a.t(r0, r2)
        L1f:
            r8.f11562n = r4
            return
    }

    public final void N(long r8) {
            r7 = this;
            long r0 = r7.f11562n
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            goto L35
        L7:
            r7.f11562n = r8
            byte[] r0 = r7.f11553k
            boolean r1 = r7.f11561m
            r2 = 255(0xff, double:1.26E-321)
            r4 = 8
            if (r1 == 0) goto L24
            int r1 = r0.length
            if (r4 <= r1) goto L17
            goto L35
        L17:
            r1 = 7
        L18:
            if (r1 < 0) goto L35
            long r5 = r8 & r2
            int r5 = (int) r5
            byte r5 = (byte) r5
            r0[r1] = r5
            long r8 = r8 >>> r4
            int r1 = r1 + (-1)
            goto L18
        L24:
            int r1 = r0.length
            if (r4 <= r1) goto L28
            goto L35
        L28:
            r1 = 0
        L29:
            if (r1 >= r4) goto L35
            long r5 = r8 & r2
            int r5 = (int) r5
            byte r5 = (byte) r5
            r0[r1] = r5
            long r8 = r8 >>> r4
            int r1 = r1 + 1
            goto L29
        L35:
            return
    }

    @Override // r7.g
    public final int get() {
            r2 = this;
            long r0 = r2.f11562n
            int r0 = (int) r0
            return r0
    }

    @Override // r7.g
    public final void k(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4.N(r0)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f11562n
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
