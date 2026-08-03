package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends p4.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10213e;

    public /* synthetic */ l(p4.j r2, u4.t r3, u4.p r4) {
            r1 = this;
            r0 = 0
            r1.f10213e = r0
            r1.<init>(r2, r3, r4)
            return
    }

    public l(u4.t r2, u4.p r3) {
            r1 = this;
            r0 = 1
            r1.f10213e = r0
            p4.j r0 = p4.k.f10127b
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // p4.h
    public int b() {
            r1 = this;
            p4.j r0 = r1.f10114b
            f8.i r0 = r0.f10121d
            int r0 = r0.j()
            return r0
    }

    @Override // p4.h
    public java.lang.String g() {
            r5 = this;
            p4.j r0 = r5.f10114b
            f8.i r1 = r0.f10121d
            r1.getClass()
            java.lang.String r0 = r0.a()
            java.lang.String r2 = r1.P(r5)
            java.lang.String r1 = r1.Q(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 100
            r3.<init>(r4)
            r3.append(r0)
            int r0 = r2.length()
            if (r0 == 0) goto L2b
            r0 = 32
            r3.append(r0)
            r3.append(r2)
        L2b:
            int r0 = r1.length()
            if (r0 == 0) goto L39
            java.lang.String r0 = " // "
            r3.append(r0)
            r3.append(r1)
        L39:
            java.lang.String r0 = r3.toString()
            return r0
    }

    @Override // p4.h
    public p4.h i(p4.j r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }

    @Override // p4.h
    public final p4.h j(int r2) {
            r1 = this;
            int r0 = r1.f10213e
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            u4.p r0 = r1.f10116d
            u4.p r2 = r0.s(r2)
            p4.h r2 = r1.k(r2)
            return r2
        L10:
            u4.p r0 = r1.f10116d
            u4.p r2 = r0.s(r2)
            p4.h r2 = r1.k(r2)
            return r2
    }

    @Override // p4.h
    public void l(z4.d r2) {
            r1 = this;
            p4.j r0 = r1.f10114b
            f8.i r0 = r0.f10121d
            r0.R0(r2, r1)
            return
    }
}
