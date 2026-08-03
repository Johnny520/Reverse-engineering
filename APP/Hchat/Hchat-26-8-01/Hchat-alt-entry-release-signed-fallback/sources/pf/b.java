package pf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10554i;

    public b(java.io.InputStream r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f10552g = r2
            return
    }

    public final void a(long r3) {
            r2 = this;
            long r0 = r2.f10553h
            long r0 = r0 + r3
            r2.f10553h = r0
            long r3 = r2.f10552g
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto Lc
            return
        Lc:
            java.lang.String r3 = "Read limit exceeded"
            j8.o.A(r3)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int r3) {
            r2 = this;
            super.mark(r3)
            long r0 = r2.f10553h
            r2.f10554i = r0
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
            r3 = this;
            int r0 = super.read()
            r1 = -1
            if (r0 == r1) goto Lc
            r1 = 1
            r3.a(r1)
        Lc:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r1, int r2, int r3) {
            r0 = this;
            int r1 = super.read(r1, r2, r3)
            if (r1 <= 0) goto La
            long r2 = (long) r1
            r0.a(r2)
        La:
            return r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
            r2 = this;
            super.reset()
            long r0 = r2.f10554i
            r2.f10553h = r0
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
            r2 = this;
            long r3 = super.skip(r3)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r2.a(r3)
        Ld:
            return r3
    }
}
