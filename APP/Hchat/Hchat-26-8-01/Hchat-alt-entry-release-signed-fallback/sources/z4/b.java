package z4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends java.io.InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g8.b f22533i;

    public b(g8.b r1) {
            r0 = this;
            r0.f22533i = r1
            r0.<init>()
            r1 = 0
            r0.f22531g = r1
            r0.f22532h = r1
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r2 = this;
            g8.b r0 = r2.f22533i
            int r0 = r0.f4344c
            int r1 = r2.f22531g
            int r0 = r0 - r1
            return r0
    }

    @Override // java.io.InputStream
    public final void mark(int r1) {
            r0 = this;
            int r1 = r0.f22531g
            r0.f22532h = r1
            return
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.InputStream
    public final int read() {
            r3 = this;
            int r0 = r3.f22531g
            g8.b r1 = r3.f22533i
            int r2 = r1.f4344c
            if (r0 < r2) goto La
            r0 = -1
            return r0
        La:
            int r0 = r1.f(r0)
            int r1 = r3.f22531g
            int r1 = r1 + 1
            r3.f22531g = r1
            return r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r4, int r5, int r6) {
            r3 = this;
            int r0 = r5 + r6
            int r1 = r4.length
            if (r0 <= r1) goto L7
            int r6 = r4.length
            int r6 = r6 - r5
        L7:
            g8.b r0 = r3.f22533i
            int r1 = r0.f4344c
            int r2 = r3.f22531g
            int r1 = r1 - r2
            if (r6 <= r1) goto L11
            r6 = r1
        L11:
            byte[] r0 = r0.f4343b
            java.lang.System.arraycopy(r0, r2, r4, r5, r6)
            int r4 = r3.f22531g
            int r4 = r4 + r6
            r3.f22531g = r4
            return r6
    }

    @Override // java.io.InputStream
    public final void reset() {
            r1 = this;
            int r0 = r1.f22532h
            r1.f22531g = r0
            return
    }
}
