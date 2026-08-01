package defpackage;

/* JADX INFO: renamed from: ᛶᲇᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1166 extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final byte[] f5280 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final int f5281 = 0;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f5282;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final byte f5283;

    static {
            r0 = 29
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0} // fill-array
            defpackage.C1166.f5280 = r0
            r0 = 31
            defpackage.C1166.f5281 = r0
            return
    }

    public C1166(java.io.InputStream r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            if (r2 < r1) goto Le
            r1 = 8
            if (r2 > r1) goto Le
            byte r1 = (byte) r2
            r0.f5283 = r1
            return
        Le:
            java.lang.String r0 = "Cannot add invalid orientation: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r2, r0)
            defpackage.C2264.m3684(r0)
            r0 = 0
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
            r3 = this;
            int r0 = r3.f5282
            r1 = 2
            if (r0 < r1) goto L17
            int r2 = defpackage.C1166.f5281
            if (r0 <= r2) goto La
            goto L17
        La:
            if (r0 != r2) goto Lf
            byte r0 = r3.f5283
            goto L1b
        Lf:
            byte[] r2 = defpackage.C1166.f5280
            int r0 = r0 - r1
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L1b
        L17:
            int r0 = super.read()
        L1b:
            r1 = -1
            if (r0 == r1) goto L24
            int r1 = r3.f5282
            int r1 = r1 + 1
            r3.f5282 = r1
        L24:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.f5282
            int r1 = defpackage.C1166.f5281
            if (r0 <= r1) goto Lb
            int r4 = super.read(r4, r5, r6)
            goto L2a
        Lb:
            if (r0 != r1) goto L13
            byte r6 = r3.f5283
            r4[r5] = r6
            r4 = 1
            goto L2a
        L13:
            r2 = 2
            if (r0 >= r2) goto L1c
            int r2 = r2 - r0
            int r4 = super.read(r4, r5, r2)
            goto L2a
        L1c:
            int r1 = r1 - r0
            int r6 = java.lang.Math.min(r1, r6)
            int r0 = r3.f5282
            int r0 = r0 - r2
            byte[] r1 = defpackage.C1166.f5280
            java.lang.System.arraycopy(r1, r0, r4, r5, r6)
            r4 = r6
        L2a:
            if (r4 <= 0) goto L31
            int r5 = r3.f5282
            int r5 = r5 + r4
            r3.f5282 = r5
        L31:
            return r4
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
            r2 = this;
            long r3 = super.skip(r3)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            int r0 = r2.f5282
            long r0 = (long) r0
            long r0 = r0 + r3
            int r0 = (int) r0
            r2.f5282 = r0
        L11:
            return r3
    }
}
