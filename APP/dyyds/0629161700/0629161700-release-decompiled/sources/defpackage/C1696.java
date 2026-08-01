package defpackage;

/* JADX INFO: renamed from: ᲀᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1696 extends java.io.OutputStream {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C2063 f7552;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public byte[] f7553;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.io.FileOutputStream f7554;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f7555;

    public C1696(java.io.FileOutputStream r2, defpackage.C2063 r3) {
            r1 = this;
            r1.<init>()
            r1.f7554 = r2
            r1.f7552 = r3
            java.lang.Class<byte[]> r2 = byte[].class
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r2 = r3.m3464(r2, r0)
            byte[] r2 = (byte[]) r2
            r1.f7553 = r2
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.io.FileOutputStream r0 = r2.f7554
            r2.flush()     // Catch: java.lang.Throwable -> L15
            r0.close()
            byte[] r0 = r2.f7553
            if (r0 == 0) goto L14
            ᲇᛶᛳᛱ r1 = r2.f7552
            r1.m3468(r0)
            r0 = 0
            r2.f7553 = r0
        L14:
            return
        L15:
            r2 = move-exception
            r0.close()
            throw r2
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
            r4 = this;
            int r0 = r4.f7555
            java.io.FileOutputStream r1 = r4.f7554
            if (r0 <= 0) goto Le
            byte[] r2 = r4.f7553
            r3 = 0
            r1.write(r2, r3, r0)
            r4.f7555 = r3
        Le:
            r1.flush()
            return
    }

    @Override // java.io.OutputStream
    public final void write(int r4) {
            r3 = this;
            byte[] r0 = r3.f7553
            int r1 = r3.f7555
            int r2 = r1 + 1
            r3.f7555 = r2
            byte r4 = (byte) r4
            r0[r1] = r4
            int r4 = r0.length
            if (r2 != r4) goto L18
            if (r2 <= 0) goto L18
            java.io.FileOutputStream r4 = r3.f7554
            r1 = 0
            r4.write(r0, r1, r2)
            r3.f7555 = r1
        L18:
            return
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r8, int r9, int r10) {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10 - r1
            int r3 = r9 + r1
            int r4 = r7.f7555
            java.io.FileOutputStream r5 = r7.f7554
            if (r4 != 0) goto L15
            byte[] r6 = r7.f7553
            int r6 = r6.length
            if (r2 < r6) goto L15
            r5.write(r8, r3, r2)
            return
        L15:
            byte[] r6 = r7.f7553
            int r6 = r6.length
            int r6 = r6 - r4
            int r2 = java.lang.Math.min(r2, r6)
            byte[] r4 = r7.f7553
            int r6 = r7.f7555
            java.lang.System.arraycopy(r8, r3, r4, r6, r2)
            int r3 = r7.f7555
            int r3 = r3 + r2
            r7.f7555 = r3
            int r1 = r1 + r2
            byte[] r2 = r7.f7553
            int r4 = r2.length
            if (r3 != r4) goto L36
            if (r3 <= 0) goto L36
            r5.write(r2, r0, r3)
            r7.f7555 = r0
        L36:
            if (r1 < r10) goto L2
            return
    }
}
