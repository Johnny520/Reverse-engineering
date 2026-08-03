package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4176 implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f12863;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0843 f12864;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.zip.Inflater f12865;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3244 f12866;

    public C4176(boolean r3) {
            r2 = this;
            r2.<init>()
            r2.f12863 = r3
            Yue.ۥۣ۟ۢۨ r3 = new Yue.ۥۣ۟ۢۨ
            r3.<init>()
            r2.f12864 = r3
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = 1
            r0.<init>(r1)
            r2.f12865 = r0
            Yue.ۥ۠ۥۡۨ r1 = new Yue.ۥ۠ۥۡۨ
            r1.<init>(r3, r0)
            r2.f12866 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            Yue.ۥ۠ۥۡۨ r0 = r1.f12866
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m16331(@Yue.InterfaceC4418 Yue.C0843 r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "buffer"
            Yue.C3329.m13906(r6, r0)
            Yue.ۥۣ۟ۢۨ r0 = r5.f12864
            long r0 = r0.m4889()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            boolean r0 = r5.f12863
            if (r0 == 0) goto L1a
            java.util.zip.Inflater r0 = r5.f12865
            r0.reset()
        L1a:
            Yue.ۥۣ۟ۢۨ r0 = r5.f12864
            r0.mo4815(r6)
            Yue.ۥۣ۟ۢۨ r0 = r5.f12864
            r1 = 65535(0xffff, float:9.1834E-41)
            r0.m4901(r1)
            java.util.zip.Inflater r0 = r5.f12865
            long r0 = r0.getBytesRead()
            Yue.ۥۣ۟ۢۨ r2 = r5.f12864
            long r2 = r2.m4889()
            long r0 = r0 + r2
        L34:
            Yue.ۥ۠ۥۡۨ r2 = r5.f12866
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.m13670(r6, r3)
            java.util.zip.Inflater r2 = r5.f12865
            long r2 = r2.getBytesRead()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 < 0) goto L34
            return
        L49:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }
}
