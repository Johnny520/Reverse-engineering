package k7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends k7.a implements k7.e {
    @Override // k7.a
    public void B(q7.b r5) {
            r4 = this;
            k7.a[] r0 = r4.L()
            if (r0 != 0) goto L7
            goto L15
        L7:
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L15
            r3 = r0[r2]
            if (r3 == 0) goto L12
            r3.G(r5)
        L12:
            int r2 = r2 + 1
            goto L9
        L15:
            return
    }

    @Override // k7.a
    public int C(java.io.ByteArrayOutputStream r6) {
            r5 = this;
            boolean r0 = r5.y()
            r1 = 0
            if (r0 == 0) goto L8
            goto Le
        L8:
            k7.a[] r0 = r5.L()
            if (r0 != 0) goto Lf
        Le:
            return r1
        Lf:
            int r2 = r0.length
            r3 = r1
        L11:
            if (r1 >= r2) goto L20
            r4 = r0[r1]
            if (r4 == 0) goto L1d
            int r4 = r4.K(r6)
            int r4 = r4 + r3
            r3 = r4
        L1d:
            int r1 = r1 + 1
            goto L11
        L20:
            return r3
    }

    public abstract k7.a[] L();

    public void M() {
            r0 = this;
            return
    }

    public abstract void N();

    public void O() {
            r5 = this;
            k7.a[] r0 = r5.L()
            if (r0 != 0) goto L7
            goto L19
        L7:
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            boolean r4 = r3 instanceof k7.e
            if (r4 == 0) goto L16
            k7.e r3 = (k7.e) r3
            r3.c()
        L16:
            int r2 = r2 + 1
            goto L9
        L19:
            return
    }

    @Override // k7.e
    public final void c() {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto L7
            return
        L7:
            r1.M()
            r1.O()
            r1.N()
            return
    }

    @Override // k7.a
    public int p() {
            r5 = this;
            boolean r0 = r5.y()
            r1 = 0
            if (r0 == 0) goto L8
            goto Le
        L8:
            k7.a[] r0 = r5.L()
            if (r0 != 0) goto Lf
        Le:
            return r1
        Lf:
            int r2 = r0.length
            r3 = r1
        L11:
            if (r1 >= r2) goto L20
            r4 = r0[r1]
            if (r4 == 0) goto L1d
            int r4 = r4.p()
            int r4 = r4 + r3
            r3 = r4
        L1d:
            int r1 = r1 + 1
            goto L11
        L20:
            return r3
    }

    @Override // k7.a
    public byte[] r() {
            r5 = this;
            boolean r0 = r5.y()
            r1 = 0
            if (r0 == 0) goto L8
            goto Le
        L8:
            k7.a[] r0 = r5.L()
            if (r0 != 0) goto Lf
        Le:
            return r1
        Lf:
            int r2 = r0.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L22
            r4 = r0[r3]
            if (r4 == 0) goto L1f
            byte[] r4 = r4.r()
            byte[] r1 = k7.a.o(r1, r4)
        L1f:
            int r3 = r3 + 1
            goto L11
        L22:
            return r1
    }

    @Override // k7.a
    public void z(f6.b r5) {
            r4 = this;
            boolean r0 = r5.f3306b
            if (r0 == 0) goto L5
            goto L29
        L5:
            java.lang.Object r0 = r5.f3308d
            k7.a r0 = (k7.a) r0
            if (r0 != r4) goto Lf
            r0 = 1
            r5.f3306b = r0
            return
        Lf:
            k7.a[] r0 = r4.L()
            if (r0 != 0) goto L16
            goto L29
        L16:
            int r1 = r0.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L29
            boolean r3 = r5.f3306b
            if (r3 == 0) goto L1f
            goto L29
        L1f:
            r3 = r0[r2]
            if (r3 == 0) goto L26
            r3.z(r5)
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return
    }
}
