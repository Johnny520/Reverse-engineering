package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class x extends m7.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8776l;

    public /* synthetic */ x(k7.c r1, int r2) {
            r0 = this;
            r0.f8776l = r2
            r0.<init>(r1)
            return
    }

    private void O() {
            r0 = this;
            return
    }

    private void P() {
            r0 = this;
            return
    }

    @Override // m7.q
    public m7.q L() {
            r1 = this;
            int r0 = r1.f8776l
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            m7.q r0 = super.L()
            return r0
        La:
            m7.q r0 = super.L()
            m7.i r0 = (m7.i) r0
            return r0
    }

    @Override // m7.q
    public void M() {
            r1 = this;
            int r0 = r1.f8776l
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            k7.c r0 = r1.f8760k
            m7.w r0 = (m7.w) r0
            r0.Y()
            return
    }

    @Override // m7.q
    public void N() {
            r1 = this;
            int r0 = r1.f8776l
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            k7.c r0 = r1.f8760k
            m7.w r0 = (m7.w) r0
            r0.Z()
            return
    }

    @Override // m7.q
    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f8776l
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            k7.c r0 = r4.f8760k
            r1 = r0
            m7.w r1 = (m7.w) r1
            p7.a r2 = r1.f7869m
            p7.m r2 = (p7.m) r2
            r7.f r2 = r2.f10306s
            int r2 = r2.f11560n
            r7.o r1 = r1.V(r2)
            r2 = 0
            if (r1 == 0) goto L21
            java.lang.String r1 = r1.f11578m
            goto L22
        L21:
            r1 = r2
        L22:
            boolean r1 = y7.a.f(r1)
            if (r1 != 0) goto L55
            r1 = r0
            m7.w r1 = (m7.w) r1
            java.lang.String r1 = r1.c0()
            boolean r1 = y7.a.f(r1)
            if (r1 == 0) goto L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "<!--"
            r1.<init>(r3)
            m7.w r0 = (m7.w) r0
            p7.a r3 = r0.f7869m
            p7.m r3 = (p7.m) r3
            r7.f r3 = r3.f10306s
            int r3 = r3.f11560n
            r7.o r0 = r0.V(r3)
            if (r0 == 0) goto L4e
            java.lang.String r2 = r0.f11578m
        L4e:
            java.lang.String r0 = "-->"
            java.lang.String r0 = eh.a.r(r1, r2, r0)
            goto L5f
        L55:
            m7.w r0 = (m7.w) r0
            java.lang.String r0 = r0.c0()
            if (r0 != 0) goto L5f
            java.lang.String r0 = "null"
        L5f:
            return r0
    }

    @Override // m7.q, k7.a
    public boolean y() {
            r1 = this;
            int r0 = r1.f8776l
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r0 = super.y()
            return r0
        La:
            k7.c r0 = r1.f8760k
            m7.w r0 = (m7.w) r0
            boolean r0 = r0.y()
            return r0
    }
}
