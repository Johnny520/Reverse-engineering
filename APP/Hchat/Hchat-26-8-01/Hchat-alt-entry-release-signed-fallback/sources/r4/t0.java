package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w4.e f11509k;

    public t0(w4.e r3) {
            r2 = this;
            int r0 = r3.size()
            int r0 = r0 * 2
            r1 = 4
            int r0 = r0 + r1
            r2.<init>(r1, r0)
            r2.f11509k = r3
            return
    }

    @Override // r4.a0
    public final void a(r4.p r5) {
            r4 = this;
            r4.h0 r5 = r5.f11482g
            w4.e r0 = r4.f11509k
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L15
            w4.c r3 = r0.getType(r2)
            r5.t(r3)
            int r2 = r2 + 1
            goto L9
        L15:
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11367t
            return r0
    }

    @Override // r4.l0
    public final int e(r4.l0 r9) {
            r8 = this;
            r4.t0 r9 = (r4.t0) r9
            w4.e r9 = r9.f11509k
            w4.b r0 = w4.b.f14847i
            w4.e r0 = r8.f11509k
            int r1 = r0.size()
            int r2 = r9.size()
            int r3 = java.lang.Math.min(r1, r2)
            r4 = 0
            r5 = r4
        L16:
            if (r5 >= r3) goto L2e
            w4.c r6 = r0.getType(r5)
            w4.c r7 = r9.getType(r5)
            java.lang.String r6 = r6.f14878g
            java.lang.String r7 = r7.f14878g
            int r6 = r6.compareTo(r7)
            if (r6 == 0) goto L2b
            return r6
        L2b:
            int r5 = r5 + 1
            goto L16
        L2e:
            if (r1 != r2) goto L31
            return r4
        L31:
            if (r1 >= r2) goto L35
            r9 = -1
            return r9
        L35:
            r9 = 1
            return r9
    }

    public final int hashCode() {
            r5 = this;
            w4.b r0 = w4.b.f14847i
            w4.e r0 = r5.f11509k
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        La:
            if (r2 >= r1) goto L1c
            int r3 = r3 * 31
            w4.c r4 = r0.getType(r2)
            java.lang.String r4 = r4.f14878g
            int r4 = r4.hashCode()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto La
        L1c:
            return r3
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // r4.l0
    public final void m(r4.p r9, z4.d r10) {
            r8 = this;
            r4.h0 r9 = r9.f11482g
            w4.e r0 = r8.f11509k
            int r1 = r0.size()
            boolean r2 = r10.d()
            r3 = 0
            if (r2 == 0) goto L5a
            java.lang.String r2 = r8.g()
            java.lang.String r4 = " type_list"
            java.lang.String r2 = r2.concat(r4)
            r10.b(r3, r2)
            java.lang.String r2 = a.a.Y0(r1)
            java.lang.String r4 = "  size: "
            java.lang.String r2 = r4.concat(r2)
            r4 = 4
            r10.b(r4, r2)
            r2 = r3
        L2b:
            if (r2 >= r1) goto L5a
            w4.c r4 = r0.getType(r2)
            int r5 = r9.o(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "  "
            r6.<init>(r7)
            java.lang.String r5 = a.a.X0(r5)
            r6.append(r5)
            java.lang.String r5 = " // "
            r6.append(r5)
            java.lang.String r4 = r4.a()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5 = 2
            r10.b(r5, r4)
            int r2 = r2 + 1
            goto L2b
        L5a:
            r10.k(r1)
        L5d:
            if (r3 >= r1) goto L6d
            w4.c r2 = r0.getType(r3)
            int r2 = r9.o(r2)
            r10.l(r2)
            int r3 = r3 + 1
            goto L5d
        L6d:
            return
    }
}
