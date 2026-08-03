package of;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements nf.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final mh.b f9799k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.io.File f9800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rf.b f9801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.util.zip.ZipFile f9803j;

    static {
            java.lang.Class<of.b> r0 = of.b.class
            mh.b r0 = mh.d.b(r0)
            of.b.f9799k = r0
            return
    }

    public b(java.io.File r1, b.e r2) {
            r0 = this;
            r0.<init>()
            r0.f9800g = r1
            java.lang.Object r1 = r2.f332h
            rf.b r1 = (rf.b) r1
            r0.f9801h = r1
            boolean r1 = r1.d()
            r0.f9802i = r1
            return
    }

    public final java.io.BufferedInputStream a(of.a r5) {
            r4 = this;
            java.util.zip.ZipFile r0 = r4.f9803j
            java.util.zip.ZipEntry r5 = r5.f9798b
            java.io.InputStream r0 = r0.getInputStream(r5)
            boolean r1 = r4.f9802i
            if (r1 == 0) goto L16
            pf.b r1 = new pf.b
            long r2 = r5.getSize()
            r1.<init>(r0, r2)
            r0 = r1
        L16:
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            r5.<init>(r0)
            return r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            r0 = 0
            java.util.zip.ZipFile r1 = r2.f9803j     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            r1.close()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r1 = move-exception
            goto Le
        Lb:
            r2.f9803j = r0
            return
        Le:
            r2.f9803j = r0
            throw r1
    }

    @Override // nf.b
    public final nf.c d() {
            r8 = this;
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            java.io.File r1 = r8.f9800g
            r0.<init>(r1)
            r8.f9803j = r0
            rf.b r0 = r8.f9801h
            int r1 = r0.b()
            r2 = -1
            if (r1 != r2) goto L15
            r1 = 2147483647(0x7fffffff, float:NaN)
        L15:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.zip.ZipFile r3 = r8.f9803j
            java.util.Enumeration r3 = r3.entries()
        L20:
            boolean r4 = r3.hasMoreElements()
            if (r4 == 0) goto L59
            of.a r4 = new of.a
            java.lang.Object r5 = r3.nextElement()
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5
            r4.<init>(r8, r5)
            boolean r5 = r0.a(r4)
            if (r5 != 0) goto L3e
            mh.b r6 = of.b.f9799k
            java.lang.String r7 = "Zip entry '{}' is invalid and excluded from processing"
            r6.h(r4, r7)
        L3e:
            if (r5 == 0) goto L20
            r2.add(r4)
            int r4 = r2.size()
            if (r4 > r1) goto L4a
            goto L20
        L4a:
            int r0 = r2.size()
            java.lang.String r1 = "Max entries count limit exceeded: "
            java.lang.String r0 = eh.a.l(r0, r1)
            j8.o.A(r0)
            r0 = 0
            return r0
        L59:
            nf.c r0 = new nf.c
            r0.<init>(r8, r2)
            return r0
    }
}
