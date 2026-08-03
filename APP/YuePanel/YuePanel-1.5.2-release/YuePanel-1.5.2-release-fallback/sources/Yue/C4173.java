package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4173 implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f12853;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f12854;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.zip.Deflater f12855;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C1801 f12856;

    public C4173(boolean r4) {
            r3 = this;
            r3.<init>()
            r3.f12853 = r4
            Yue.ۥۣ۟ۢۨ r4 = new Yue.ۥۣ۟ۢۨ
            r4.<init>()
            r3.f12854 = r4
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r0.<init>(r1, r2)
            r3.f12855 = r0
            Yue.ۥ۟ۨۧۨ r1 = new Yue.ۥ۟ۨۧۨ
            r1.<init>(r4, r0)
            r3.f12856 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            Yue.ۥ۟ۨۧۨ r0 = r1.f12856
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m16309(@Yue.InterfaceC4418 Yue.C0843 r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "buffer"
            Yue.C3329.m13906(r6, r0)
            Yue.ۥۣ۟ۢۨ r0 = r5.f12854
            long r0 = r0.m4889()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L63
            boolean r0 = r5.f12853
            if (r0 == 0) goto L1a
            java.util.zip.Deflater r0 = r5.f12855
            r0.reset()
        L1a:
            Yue.ۥ۟ۨۧۨ r0 = r5.f12856
            long r1 = r6.m4889()
            r0.mo4176(r6, r1)
            Yue.ۥ۟ۨۧۨ r0 = r5.f12856
            r0.flush()
            Yue.ۥۣ۟ۢۨ r0 = r5.f12854
            Yue.ۥۣ۟ۥۤ r1 = Yue.C4174.m16311()
            boolean r0 = r5.m16310(r0, r1)
            if (r0 == 0) goto L53
            Yue.ۥۣ۟ۢۨ r0 = r5.f12854
            long r0 = r0.m4889()
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 - r2
            Yue.ۥۣ۟ۢۨ r2 = r5.f12854
            r3 = 1
            r4 = 0
            Yue.ۥۣ۟ۢۨ$ۥ r2 = Yue.C0843.m4803(r2, r4, r3, r4)
            r2.m4917(r0)     // Catch: java.lang.Throwable -> L4c
            Yue.C1173.m6114(r2, r4)
            goto L59
        L4c:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            Yue.C1173.m6114(r2, r6)
            throw r0
        L53:
            Yue.ۥۣ۟ۢۨ r0 = r5.f12854
            r1 = 0
            r0.m4898(r1)
        L59:
            Yue.ۥۣ۟ۢۨ r0 = r5.f12854
            long r1 = r0.m4889()
            r6.mo4176(r0, r1)
            return
        L63:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m16310(Yue.C0843 r5, Yue.C0879 r6) {
            r4 = this;
            long r0 = r5.m4889()
            int r2 = r6.m5095()
            long r2 = (long) r2
            long r0 = r0 - r2
            boolean r5 = r5.mo4852(r0, r6)
            return r5
    }
}
