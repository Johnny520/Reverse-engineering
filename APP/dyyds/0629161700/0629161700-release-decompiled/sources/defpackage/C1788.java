package defpackage;

/* JADX INFO: renamed from: ᲀᲈᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1788 extends defpackage.AbstractC1947 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0669 f7869;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public long f7870;

    public C1788(defpackage.C0669 r1, defpackage.C0520 r2, long r3) {
            r0 = this;
            r0.f7869 = r1
            r0.<init>(r1, r2)
            r0.f7870 = r3
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            ᛱᛱᛷᛳ r1 = defpackage.C0024.f465
            r0.m3363(r1)
        L12:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            boolean r0 = r4.f8471
            if (r0 == 0) goto L5
            return
        L5:
            long r0 = r4.f7870
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            r0 = 100
            boolean r0 = defpackage.AbstractC0508.m1299(r4, r0)     // Catch: java.io.IOException -> L14
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L23
            ᛴᛴᲈᛷ r0 = r4.f7869
            ᛳᲁᲀᲇ r0 = r0.f3244
            r0.mo1355()
            ᛱᛱᛷᛳ r0 = defpackage.C0669.f3239
            r4.m3363(r0)
        L23:
            r0 = 1
            r4.f8471 = r0
            return
    }

    @Override // defpackage.AbstractC1947, defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r8, defpackage.C1569 r10) {
            r7 = this;
            boolean r8 = r7.f8471
            r0 = 0
            if (r8 != 0) goto L40
            long r8 = r7.f7870
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r3 = -1
            if (r2 != 0) goto Lf
            return r3
        Lf:
            r5 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r8, r5)
            long r8 = super.mo782(r8, r10)
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 == 0) goto L2c
            long r2 = r7.f7870
            long r2 = r2 - r8
            r7.f7870 = r2
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L2b
            ᛱᛱᛷᛳ r10 = defpackage.C0024.f465
            r7.m3363(r10)
        L2b:
            return r8
        L2c:
            ᛴᛴᲈᛷ r8 = r7.f7869
            ᛳᲁᲀᲇ r8 = r8.f3244
            r8.mo1355()
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r9 = "unexpected end of stream"
            r8.<init>(r9)
            ᛱᛱᛷᛳ r9 = defpackage.C0669.f3239
            r7.m3363(r9)
            throw r8
        L40:
            java.lang.String r7 = "closed"
            defpackage.C2264.m3676(r7)
            return r0
    }
}
