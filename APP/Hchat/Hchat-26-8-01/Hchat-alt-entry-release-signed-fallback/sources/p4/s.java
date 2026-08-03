package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends p4.l {
    public s(u4.t r2) {
            r1 = this;
            u4.p r0 = u4.p.f13403i
            r1.<init>(r2, r0)
            return
    }

    @Override // p4.h
    public final java.lang.String a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p4.l, p4.h
    public final int b() {
            r1 = this;
            int r0 = r1.e()
            r0 = r0 & 1
            return r0
    }

    @Override // p4.l, p4.h
    public final java.lang.String g() {
            r1 = this;
            int r0 = r1.b()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = "nop // spacer"
            return r0
    }

    @Override // p4.h
    public final p4.h k(u4.p r2) {
            r1 = this;
            p4.s r2 = new p4.s
            u4.t r0 = r1.f10115c
            r2.<init>(r0)
            return r2
    }

    @Override // p4.l, p4.h
    public final void l(z4.d r2) {
            r1 = this;
            int r0 = r1.b()
            if (r0 == 0) goto Le
            r0 = 0
            short r0 = f8.i.k(r0, r0)
            r2.l(r0)
        Le:
            return
    }
}
