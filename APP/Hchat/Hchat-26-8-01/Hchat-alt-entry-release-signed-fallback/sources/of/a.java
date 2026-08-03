package of;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements nf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of.b f9797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.zip.ZipEntry f9798b;

    public a(of.b r1, java.util.zip.ZipEntry r2) {
            r0 = this;
            r0.<init>()
            r0.f9797a = r1
            r0.f9798b = r2
            return
    }

    @Override // nf.a
    public final boolean a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // nf.a
    public final java.io.InputStream b() {
            r3 = this;
            of.b r0 = r3.f9797a
            java.io.BufferedInputStream r0 = r0.a(r3)     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = move-exception
            java.util.zip.ZipEntry r1 = r3.f9798b
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "Failed to open input stream for entry: "
            java.lang.String r1 = wb.en.g(r2, r1)
            ah.a.p(r1, r0)
            r0 = 0
            return r0
    }

    @Override // nf.a
    public final long c() {
            r2 = this;
            java.util.zip.ZipEntry r0 = r2.f9798b
            long r0 = r0.getSize()
            return r0
    }

    @Override // nf.a
    public final long d() {
            r2 = this;
            java.util.zip.ZipEntry r0 = r2.f9798b
            long r0 = r0.getCompressedSize()
            return r0
    }

    @Override // nf.a
    public final byte[] getBytes() {
            r3 = this;
            of.b r0 = r3.f9797a
            java.io.BufferedInputStream r0 = r0.a(r3)     // Catch: java.lang.Exception -> Le
            byte[] r1 = ai.a.B(r0)     // Catch: java.lang.Throwable -> L10
            r0.close()     // Catch: java.lang.Exception -> Le
            return r1
        Le:
            r0 = move-exception
            goto L1a
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Exception -> Le
        L19:
            throw r1     // Catch: java.lang.Exception -> Le
        L1a:
            java.util.zip.ZipEntry r1 = r3.f9798b
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "Failed to read bytes for entry: "
            java.lang.String r1 = wb.en.g(r2, r1)
            ah.a.p(r1, r0)
            r0 = 0
            return r0
    }

    @Override // nf.a
    public final java.lang.String getName() {
            r1 = this;
            java.util.zip.ZipEntry r0 = r1.f9798b
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // nf.a
    public final boolean isDirectory() {
            r1 = this;
            java.util.zip.ZipEntry r0 = r1.f9798b
            boolean r0 = r0.isDirectory()
            return r0
    }
}
