package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends java.io.OutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fc.f f21576g;

    public r(fc.f r1) {
            r0 = this;
            r0.f21576g = r1
            r0.<init>()
            return
    }

    @Override // java.io.OutputStream
    public final void write(int r3) {
            r2 = this;
            char r3 = (char) r3
            r0 = 10
            fc.f r1 = r2.f21576g
            if (r3 == r0) goto Lf
            r0 = 13
            if (r3 == r0) goto Le
            r1.d(r3)
        Le:
            return
        Lf:
            r1.p()
            return
    }
}
