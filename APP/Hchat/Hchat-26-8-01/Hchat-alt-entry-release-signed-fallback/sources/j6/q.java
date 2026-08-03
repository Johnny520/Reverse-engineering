package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends java.io.Writer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Appendable f6762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j6.p f6763h;

    public q(java.lang.Appendable r2) {
            r1 = this;
            r1.<init>()
            j6.p r0 = new j6.p
            r0.<init>()
            r1.f6763h = r0
            r1.f6762g = r2
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Appendable r0 = r1.f6762g
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            java.lang.Appendable r0 = r1.f6762g
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Appendable r0 = r1.f6762g
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            java.lang.Appendable r0 = r1.f6762g
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
            r0 = this;
            return
    }

    @Override // java.io.Writer
    public final void write(int r2) {
            r1 = this;
            java.lang.Appendable r0 = r1.f6762g
            char r2 = (char) r2
            r0.append(r2)
            return
    }

    @Override // java.io.Writer
    public final void write(java.lang.String r2, int r3, int r4) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.lang.Appendable r0 = r1.f6762g
            int r4 = r4 + r3
            r0.append(r2, r3, r4)
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r2, int r3, int r4) {
            r1 = this;
            j6.p r0 = r1.f6763h
            r0.f6760g = r2
            r2 = 0
            r0.f6761h = r2
            java.lang.Appendable r2 = r1.f6762g
            int r4 = r4 + r3
            r2.append(r0, r3, r4)
            return
    }
}
