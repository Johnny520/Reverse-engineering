package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends w0.w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f5942c;

    public j2(java.lang.Object r1, long r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f5942c = r1
            return
    }

    @Override // w0.w
    public final void a(w0.w r1) {
            r0 = this;
            r1.getClass()
            i0.j2 r1 = (i0.j2) r1
            java.lang.Object r1 = r1.f5942c
            r0.f5942c = r1
            return
    }

    @Override // w0.w
    public final w0.w b(long r3) {
            r2 = this;
            i0.j2 r3 = new i0.j2
            w0.f r4 = w0.m.j()
            long r0 = r4.g()
            java.lang.Object r4 = r2.f5942c
            r3.<init>(r4, r0)
            return r3
    }
}
