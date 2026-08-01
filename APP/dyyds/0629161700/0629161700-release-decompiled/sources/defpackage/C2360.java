package defpackage;

/* JADX INFO: renamed from: ᲈᲇᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2360 extends defpackage.AbstractC1947 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f10204;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f8471
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r1.f10204
            if (r0 != 0) goto Le
            ᛱᛱᛷᛳ r0 = defpackage.C0669.f3239
            r1.m3363(r0)
        Le:
            r0 = 1
            r1.f8471 = r0
            return
    }

    @Override // defpackage.AbstractC1947, defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r3, defpackage.C1569 r5) {
            r2 = this;
            boolean r3 = r2.f8471
            if (r3 != 0) goto L1f
            boolean r3 = r2.f10204
            r0 = -1
            if (r3 == 0) goto Lb
            return r0
        Lb:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = super.mo782(r3, r5)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L1e
            r3 = 1
            r2.f10204 = r3
            ᛱᛱᛷᛳ r3 = defpackage.C0024.f465
            r2.m3363(r3)
            return r0
        L1e:
            return r3
        L1f:
            java.lang.String r2 = "closed"
            defpackage.C2264.m3676(r2)
            r2 = 0
            return r2
    }
}
