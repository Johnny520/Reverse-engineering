package cd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements bd.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i4.c0 f1626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1627h;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            r0 = 0
            r1.f1627h = r0
            r0 = 0
            r1.f1626g = r0
            return
    }

    @Override // bd.a
    public final i4.c0 f(ud.u r2) {
            r1 = this;
            int r0 = r1.f1627h
            int r2 = r2.hashCode()
            if (r0 != r2) goto Lb
            i4.c0 r2 = r1.f1626g
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @Override // bd.a
    public final void p(ud.u r1, i4.c0 r2) {
            r0 = this;
            int r1 = r1.hashCode()
            r0.f1627h = r1
            r0.f1626g = r2
            return
    }
}
