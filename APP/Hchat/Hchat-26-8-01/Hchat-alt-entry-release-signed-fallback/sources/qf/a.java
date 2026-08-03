package qf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements nf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf.b f11012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f11013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11018g;

    public a(qf.b r1, java.lang.String r2, int r3, int r4, int r5, long r6, long r8) {
            r0 = this;
            r0.<init>()
            r0.f11012a = r1
            r0.f11013b = r2
            r0.f11015d = r3
            r0.f11016e = r4
            r0.f11014c = r5
            r0.f11017f = r6
            r0.f11018g = r8
            return
    }

    @Override // nf.a
    public final boolean a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // nf.a
    public final java.io.InputStream b() {
            r6 = this;
            qf.b r0 = r6.f11012a
            monitor-enter(r0)
            boolean r1 = r0.f11024k     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            qf.b.l(r6)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L72
        Ld:
            int r1 = r6.f11014c     // Catch: java.lang.Throwable -> Lb
            java.nio.ByteBuffer r2 = r0.f11028o
            int r3 = r6.f11016e
            r4 = 8
            if (r1 != r4) goto L4b
            long r4 = r6.f11017f     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            int r1 = (int) r4     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            java.nio.Buffer r3 = r2.position(r3)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            java.nio.ByteBuffer r2 = r2.slice()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            java.nio.Buffer r1 = r2.limit(r1)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            pf.a r1 = new pf.a     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            java.util.zip.Inflater r2 = new java.util.zip.Inflater     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            r3 = 1
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            r4 = 4096(0x1000, float:5.74E-42)
            r3.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L3d
            goto L63
        L3d:
            r1 = move-exception
            r0.a(r6, r1)     // Catch: java.lang.Throwable -> Lb
            nf.a r1 = r0.k(r6)     // Catch: java.lang.Throwable -> Lb
            java.io.InputStream r1 = r1.b()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L4b:
            long r4 = r6.f11018g     // Catch: java.lang.Throwable -> Lb
            int r1 = (int) r4     // Catch: java.lang.Throwable -> Lb
            java.nio.Buffer r3 = r2.position(r3)     // Catch: java.lang.Throwable -> Lb
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch: java.lang.Throwable -> Lb
            java.nio.ByteBuffer r2 = r2.slice()     // Catch: java.lang.Throwable -> Lb
            java.nio.Buffer r1 = r2.limit(r1)     // Catch: java.lang.Throwable -> Lb
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: java.lang.Throwable -> Lb
            pf.a r3 = new pf.a     // Catch: java.lang.Throwable -> Lb
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lb
        L63:
            boolean r1 = r0.f11025l     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L70
            pf.b r1 = new pf.b     // Catch: java.lang.Throwable -> Lb
            long r4 = r6.f11018g     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L70:
            monitor-exit(r0)
            return r3
        L72:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // nf.a
    public final long c() {
            r2 = this;
            long r0 = r2.f11018g
            return r0
    }

    @Override // nf.a
    public final long d() {
            r2 = this;
            long r0 = r2.f11017f
            return r0
    }

    @Override // nf.a
    public final byte[] getBytes() {
            r5 = this;
            qf.b r0 = r5.f11012a
            monitor-enter(r0)
            boolean r1 = r0.f11024k     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            qf.b.l(r5)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L3b
        Ld:
            int r1 = r5.f11014c     // Catch: java.lang.Throwable -> Lb
            java.nio.ByteBuffer r2 = r0.f11028o
            r3 = 8
            if (r1 != r3) goto L29
            byte[] r1 = i3.a.a(r2, r5)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L1b
            monitor-exit(r0)
            return r1
        L1b:
            r1 = move-exception
            r0.a(r5, r1)     // Catch: java.lang.Throwable -> Lb
            nf.a r1 = r0.k(r5)     // Catch: java.lang.Throwable -> Lb
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L29:
            int r1 = r5.f11016e     // Catch: java.lang.Throwable -> Lb
            long r3 = r5.f11018g     // Catch: java.lang.Throwable -> Lb
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Lb
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Lb
            java.nio.Buffer r1 = r2.position(r1)     // Catch: java.lang.Throwable -> Lb
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: java.lang.Throwable -> Lb
            r2.get(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r3
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // nf.a
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f11013b
            return r0
    }

    @Override // nf.a
    public final boolean isDirectory() {
            r2 = this;
            java.lang.String r0 = r2.f11013b
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            qf.b r0 = r3.f11012a
            java.io.File r0 = r0.f11020g
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r3.f11013b
            java.lang.String r2 = ":"
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }
}
