package rf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f11950a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.nio.file.Path f11951b = null;

    static {
            java.lang.Class<rf.c> r0 = rf.c.class
            mh.b r0 = mh.d.b(r0)
            rf.c.f11950a = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "."
            java.nio.file.Path r0 = java.nio.file.Paths.get(r1, r0)
            java.nio.file.Path r0 = r0.toAbsolutePath()
            java.nio.file.Path r0 = r0.normalize()
            rf.c.f11951b = r0
            return
    }

    @Override // rf.b
    public final boolean a(nf.a r10) {
            r9 = this;
            java.lang.String r0 = r10.getName()
            boolean r0 = r9.c(r0)
            r1 = 0
            if (r0 == 0) goto L4f
            long r2 = r10.d()
            long r4 = r10.c()
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r8 = 1
            if (r0 < 0) goto L21
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L1f
            goto L21
        L1f:
            r0 = r1
            goto L22
        L21:
            r0 = r8
        L22:
            r6 = 26214400(0x1900000, float:5.2897246E-38)
            long r6 = (long) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L33
            r6 = 100
            long r6 = (long) r6
            long r6 = r6 * r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L33
            r6 = r8
            goto L34
        L33:
            r6 = r1
        L34:
            if (r0 != 0) goto L3a
            if (r6 == 0) goto L39
            goto L3a
        L39:
            return r8
        L3a:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r10 = r10.getName()
            java.lang.Object[] r10 = new java.lang.Object[]{r0, r2, r10}
            mh.b r0 = rf.c.f11950a
            r0.q(r10)
        L4f:
            return r1
    }

    @Override // rf.b
    public final int b() {
            r1 = this;
            r0 = 100000(0x186a0, float:1.4013E-40)
            return r0
    }

    @Override // rf.b
    public final boolean c(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = ".."
            boolean r0 = r5.contains(r0)
            r1 = 0
            mh.b r2 = rf.c.f11950a
            if (r0 == 0) goto L21
            java.lang.String r0 = "../"
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "..\\"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L21
        L1b:
            java.lang.String r0 = "Path traversal attack detected in entry: '{}'"
            r2.r(r5, r0)
            return r1
        L21:
            java.nio.file.Path r0 = rf.c.f11951b     // Catch: java.lang.Exception -> L39
            java.nio.file.Path r3 = r0.resolve(r5)     // Catch: java.lang.Exception -> L39
            java.nio.file.Path r3 = r3.normalize()     // Catch: java.lang.Exception -> L39
            boolean r0 = r3.startsWith(r0)     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L33
            r5 = 1
            return r5
        L33:
            java.lang.String r0 = "Invalid file name or path traversal attack detected: {}"
            r2.r(r5, r0)
            return r1
        L39:
            r0 = move-exception
            java.lang.String r3 = "Invalid file name or path traversal attack detected: {} - error: {}"
            java.lang.String r0 = r0.getMessage()
            r2.n(r5, r3, r0)
            return r1
    }

    @Override // rf.b
    public final boolean d() {
            r1 = this;
            r0 = 1
            return r0
    }
}
