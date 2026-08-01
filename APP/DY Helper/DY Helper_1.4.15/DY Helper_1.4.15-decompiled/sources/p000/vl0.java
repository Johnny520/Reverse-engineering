package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vl0 implements p000.rx1 {

    /* JADX INFO: renamed from: ε */
    public final p000.rk1 f11342;

    /* JADX INFO: renamed from: ζ */
    public final java.util.zip.Inflater f11343;

    /* JADX INFO: renamed from: η */
    public int f11344;

    /* JADX INFO: renamed from: θ */
    public boolean f11345;

    public vl0(p000.rk1 r1, java.util.zip.Inflater r2) {
            r0 = this;
            r0.<init>()
            r0.f11342 = r1
            r0.f11343 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f11345
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.f11343
            r0.end()
            r0 = 1
            r1.f11345 = r0
            rk1 r1 = r1.f11342
            r1.close()
            return
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            rk1 r0 = r0.f11342
            rx1 r0 = r0.f9395
            m42 r0 = r0.mo2105()
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r8, p000.C0793sc r10) {
            r7 = this;
            java.util.zip.Inflater r8 = r7.f11343
            r10.getClass()
        L5:
            boolean r9 = r7.f11345
            if (r9 != 0) goto La4
            r9 = 1
            rr1 r9 = r10.m5462(r9)     // Catch: java.util.zip.DataFormatException -> L9d
            int r0 = r9.f9473     // Catch: java.util.zip.DataFormatException -> L9d
            int r0 = 8192 - r0
            long r0 = (long) r0     // Catch: java.util.zip.DataFormatException -> L9d
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.util.zip.DataFormatException -> L9d
            int r0 = (int) r0     // Catch: java.util.zip.DataFormatException -> L9d
            boolean r1 = r8.needsInput()     // Catch: java.util.zip.DataFormatException -> L9d
            rk1 r2 = r7.f11342
            if (r1 != 0) goto L23
            goto L3d
        L23:
            boolean r1 = r2.m5109()     // Catch: java.util.zip.DataFormatException -> L9d
            if (r1 == 0) goto L2a
            goto L3d
        L2a:
            sc r1 = r2.f9396     // Catch: java.util.zip.DataFormatException -> L9d
            rr1 r1 = r1.f9827     // Catch: java.util.zip.DataFormatException -> L9d
            r1.getClass()     // Catch: java.util.zip.DataFormatException -> L9d
            int r3 = r1.f9473     // Catch: java.util.zip.DataFormatException -> L9d
            int r4 = r1.f9472     // Catch: java.util.zip.DataFormatException -> L9d
            int r3 = r3 - r4
            r7.f11344 = r3     // Catch: java.util.zip.DataFormatException -> L9d
            byte[] r1 = r1.f9471     // Catch: java.util.zip.DataFormatException -> L9d
            r8.setInput(r1, r4, r3)     // Catch: java.util.zip.DataFormatException -> L9d
        L3d:
            byte[] r1 = r9.f9471     // Catch: java.util.zip.DataFormatException -> L9d
            int r3 = r9.f9473     // Catch: java.util.zip.DataFormatException -> L9d
            int r0 = r8.inflate(r1, r3, r0)     // Catch: java.util.zip.DataFormatException -> L9d
            int r1 = r7.f11344     // Catch: java.util.zip.DataFormatException -> L9d
            if (r1 != 0) goto L4a
            goto L58
        L4a:
            int r3 = r8.getRemaining()     // Catch: java.util.zip.DataFormatException -> L9d
            int r1 = r1 - r3
            int r3 = r7.f11344     // Catch: java.util.zip.DataFormatException -> L9d
            int r3 = r3 - r1
            r7.f11344 = r3     // Catch: java.util.zip.DataFormatException -> L9d
            long r3 = (long) r1     // Catch: java.util.zip.DataFormatException -> L9d
            r2.skip(r3)     // Catch: java.util.zip.DataFormatException -> L9d
        L58:
            r3 = 0
            if (r0 <= 0) goto L68
            int r1 = r9.f9473     // Catch: java.util.zip.DataFormatException -> L9d
            int r1 = r1 + r0
            r9.f9473 = r1     // Catch: java.util.zip.DataFormatException -> L9d
            long r5 = r10.f9828     // Catch: java.util.zip.DataFormatException -> L9d
            long r0 = (long) r0     // Catch: java.util.zip.DataFormatException -> L9d
            long r5 = r5 + r0
            r10.f9828 = r5     // Catch: java.util.zip.DataFormatException -> L9d
            goto L78
        L68:
            int r0 = r9.f9472     // Catch: java.util.zip.DataFormatException -> L9d
            int r1 = r9.f9473     // Catch: java.util.zip.DataFormatException -> L9d
            if (r0 != r1) goto L77
            rr1 r0 = r9.m5123()     // Catch: java.util.zip.DataFormatException -> L9d
            r10.f9827 = r0     // Catch: java.util.zip.DataFormatException -> L9d
            p000.tr1.m5737(r9)     // Catch: java.util.zip.DataFormatException -> L9d
        L77:
            r0 = r3
        L78:
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 <= 0) goto L7d
            return r0
        L7d:
            boolean r9 = r8.finished()
            if (r9 != 0) goto L9a
            boolean r9 = r8.needsDictionary()
            if (r9 == 0) goto L8a
            goto L9a
        L8a:
            boolean r9 = r2.m5109()
            if (r9 != 0) goto L92
            goto L5
        L92:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r8 = "source exhausted prematurely"
            r7.<init>(r8)
            throw r7
        L9a:
            r7 = -1
            return r7
        L9d:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        La4:
            java.lang.String r7 = "closed"
            p000.C1080.m7279(r7)
            r7 = 0
            return r7
    }
}
