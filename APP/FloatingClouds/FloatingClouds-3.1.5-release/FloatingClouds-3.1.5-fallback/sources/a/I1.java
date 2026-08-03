package a;

/* JADX INFO: loaded from: classes.dex */
public final class I1 extends a.Z9 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ I1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.d = r1
            r0.e = r2
            r0.<init>()
            return
    }

    @Override // a.Z9
    public final void a() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.e
            a.L1 r0 = (a.L1) r0
            r0.clear()
            return
        Ld:
            java.lang.Object r0 = r1.e
            a.J1 r0 = (a.J1) r0
            r0.clear()
            return
    }

    @Override // a.Z9
    public final java.lang.Object b(int r2, int r3) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r1.e
            a.L1 r3 = (a.L1) r3
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            return r2
        Le:
            java.lang.Object r0 = r1.e
            a.J1 r0 = (a.J1) r0
            java.lang.Object[] r0 = r0.b
            int r2 = r2 << 1
            int r2 = r2 + r3
            r2 = r0[r2]
            return r2
    }

    @Override // a.Z9
    public final java.util.Map c() {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "not a map"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.Object r0 = r2.e
            a.J1 r0 = (a.J1) r0
            return r0
    }

    @Override // a.Z9
    public final int d() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.e
            a.L1 r0 = (a.L1) r0
            int r0 = r0.c
            return r0
        Lc:
            java.lang.Object r0 = r1.e
            a.J1 r0 = (a.J1) r0
            int r0 = r0.c
            return r0
    }

    @Override // a.Z9
    public final int e(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.e
            a.L1 r0 = (a.L1) r0
            if (r3 != 0) goto L10
            int r3 = r0.d()
            goto L18
        L10:
            int r1 = r3.hashCode()
            int r3 = r0.c(r1, r3)
        L18:
            return r3
        L19:
            java.lang.Object r0 = r2.e
            a.J1 r0 = (a.J1) r0
            int r3 = r0.e(r3)
            return r3
    }

    @Override // a.Z9
    public final int f(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.e
            a.L1 r0 = (a.L1) r0
            if (r3 != 0) goto L10
            int r3 = r0.d()
            goto L18
        L10:
            int r1 = r3.hashCode()
            int r3 = r0.c(r1, r3)
        L18:
            return r3
        L19:
            java.lang.Object r0 = r2.e
            a.J1 r0 = (a.J1) r0
            int r3 = r0.g(r3)
            return r3
    }

    @Override // a.Z9
    public final void g(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r1.e
            a.L1 r3 = (a.L1) r3
            r3.add(r2)
            return
        Ld:
            java.lang.Object r0 = r1.e
            a.J1 r0 = (a.J1) r0
            r0.put(r2, r3)
            return
    }

    @Override // a.Z9
    public final void h(int r2) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.e
            a.L1 r0 = (a.L1) r0
            r0.e(r2)
            return
        Ld:
            java.lang.Object r0 = r1.e
            a.J1 r0 = (a.J1) r0
            r0.i(r2)
            return
    }

    @Override // a.Z9
    public final java.lang.Object i(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "not a map"
            r3.<init>(r4)
            throw r3
        Ld:
            int r3 = r3 << 1
            int r3 = r3 + 1
            java.lang.Object r0 = r2.e
            a.J1 r0 = (a.J1) r0
            java.lang.Object[] r0 = r0.b
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }
}
