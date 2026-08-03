package q4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f8.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q4.b f10660b = null;

    static {
            q4.b r0 = new q4.b
            r0.<init>()
            q4.b.f10660b = r0
            return
    }

    @Override // f8.i
    public final java.lang.String P(p4.l r1) {
            r0 = this;
            java.lang.String r1 = f8.i.g(r1)
            return r1
    }

    @Override // f8.i
    public final java.lang.String Q(p4.l r1) {
            r0 = this;
            java.lang.String r1 = f8.i.e(r1)
            return r1
    }

    @Override // f8.i
    public final void R0(z4.d r3, p4.l r4) {
            r2 = this;
            r0 = r4
            p4.b0 r0 = (p4.b0) r0
            int r0 = r0.m()
            r1 = 0
            short r4 = f8.i.p0(r4, r1)
            short r1 = (short) r0
            int r0 = r0 >> 16
            short r0 = (short) r0
            r3.l(r4)
            r3.l(r1)
            r3.l(r0)
            return
    }

    @Override // f8.i
    public final boolean S(p4.h r2) {
            r1 = this;
            boolean r0 = r2 instanceof p4.b0
            if (r0 == 0) goto Le
            u4.p r2 = r2.f10116d
            java.lang.Object[] r2 = r2.f22543h
            int r2 = r2.length
            if (r2 == 0) goto Lc
            goto Le
        Lc:
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // f8.i
    public final int j() {
            r1 = this;
            r0 = 3
            return r0
    }
}
