package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class g extends java.io.Writer {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.lang.String f2009j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.io.Writer f2010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2012i;

    static {
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            d6.g.f2009j = r0
            return
    }

    public g(java.io.Writer r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2011h = r0
            r0 = 1
            r1.f2012i = r0
            r1.f2010g = r2
            return
    }

    public void a() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f2011h
            if (r0 >= r1) goto Lf
            java.io.Writer r1 = r3.f2010g
            r2 = 32
            r1.write(r2)
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(char r1) {
            r0 = this;
            r0.write(r1)
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.write(r1)
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r1 = r1.toString()
            r0.write(r1)
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(char r1) {
            r0 = this;
            r0.write(r1)
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) {
            r0 = this;
            r0.append(r1)
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            r0.append(r1, r2, r3)
            return r0
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.io.Writer r0 = r1.f2010g
            r0.close()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
            r1 = this;
            java.io.Writer r0 = r1.f2010g
            r0.flush()
            return
    }

    @Override // java.io.Writer
    public final void write(int r3) {
            r2 = this;
            r0 = 10
            java.io.Writer r1 = r2.f2010g
            if (r3 != r0) goto Lf
            java.lang.String r3 = d6.g.f2009j
            r1.write(r3)
            r3 = 1
            r2.f2012i = r3
            return
        Lf:
            boolean r0 = r2.f2012i
            if (r0 == 0) goto L16
            r2.a()
        L16:
            r0 = 0
            r2.f2012i = r0
            r1.write(r3)
            return
    }

    @Override // java.io.Writer
    public final void write(java.lang.String r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length()
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.Writer
    public final void write(java.lang.String r6, int r7, int r8) {
            r5 = this;
            int r8 = r8 + r7
            r0 = r7
        L2:
            if (r7 >= r8) goto L3d
            r7 = 10
            int r7 = r6.indexOf(r7, r0)
            r1 = -1
            r2 = 0
            java.io.Writer r3 = r5.f2010g
            if (r7 == r1) goto L2e
            if (r7 < r8) goto L13
            goto L2e
        L13:
            int r1 = r7 - r0
            boolean r4 = r5.f2012i
            if (r4 == 0) goto L20
            if (r1 <= 0) goto L20
            r5.a()
            r5.f2012i = r2
        L20:
            r3.write(r6, r0, r1)
            java.lang.String r0 = d6.g.f2009j
            r3.write(r0)
            r0 = 1
            r5.f2012i = r0
            int r0 = r7 + 1
            goto L2
        L2e:
            int r8 = r8 - r0
            boolean r7 = r5.f2012i
            if (r7 == 0) goto L3a
            if (r8 <= 0) goto L3a
            r5.a()
            r5.f2012i = r2
        L3a:
            r3.write(r6, r0, r8)
        L3d:
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r6, int r7, int r8) {
            r5 = this;
            int r8 = r8 + r7
            r0 = r7
        L2:
            r1 = 0
            java.io.Writer r2 = r5.f2010g
            if (r7 >= r8) goto L2c
            char r3 = r6[r7]
            r4 = 10
            if (r3 != r4) goto L29
            int r3 = r7 - r0
            boolean r4 = r5.f2012i
            if (r4 == 0) goto L1a
            if (r3 <= 0) goto L1a
            r5.a()
            r5.f2012i = r1
        L1a:
            r2.write(r6, r0, r3)
            java.lang.String r0 = d6.g.f2009j
            r2.write(r0)
            r0 = 1
            r5.f2012i = r0
            int r0 = r7 + 1
            r7 = r0
            goto L2
        L29:
            int r7 = r7 + 1
            goto L2
        L2c:
            int r7 = r7 - r0
            boolean r8 = r5.f2012i
            if (r8 == 0) goto L38
            if (r7 <= 0) goto L38
            r5.a()
            r5.f2012i = r1
        L38:
            r2.write(r6, r0, r7)
            return
    }
}
