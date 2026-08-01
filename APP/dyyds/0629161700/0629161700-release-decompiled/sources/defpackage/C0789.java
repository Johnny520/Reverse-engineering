package defpackage;

/* JADX INFO: renamed from: ᛴᲇᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0789 extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f3662;

    public C0789(defpackage.C0125 r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f3662 = r1
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
            r2 = this;
            int r0 = r2.f3662
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Lb
            int r2 = super.available()
            return r2
        Lb:
            int r2 = super.available()
            int r2 = java.lang.Math.min(r0, r2)
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            super.mark(r1)     // Catch: java.lang.Throwable -> L8
            r0.f3662 = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
            r6 = this;
            r0 = 1
            long r2 = r6.m1713(r0)
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Le
            r6 = -1
            return r6
        Le:
            int r2 = super.read()
            r6.m1714(r0)
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
            r2 = this;
            long r0 = (long) r5
            long r0 = r2.m1713(r0)
            int r5 = (int) r0
            r0 = -1
            if (r5 != r0) goto La
            return r0
        La:
            int r3 = super.read(r3, r4, r5)
            long r4 = (long) r3
            r2.m1714(r4)
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
            r1 = this;
            monitor-enter(r1)
            super.reset()     // Catch: java.lang.Throwable -> La
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f3662 = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
            r2 = this;
            long r3 = r2.m1713(r3)
            r0 = -1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            r2 = 0
            return r2
        Ld:
            long r3 = super.skip(r3)
            r2.m1714(r3)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final long m1713(long r3) {
            r2 = this;
            int r2 = r2.f3662
            if (r2 != 0) goto L7
            r2 = -1
            return r2
        L7:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L12
            long r0 = (long) r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L12
            long r2 = (long) r2
            return r2
        L12:
            return r3
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m1714(long r4) {
            r3 = this;
            int r0 = r3.f3662
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L11
            r1 = -1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L11
            long r0 = (long) r0
            long r0 = r0 - r4
            int r4 = (int) r0
            r3.f3662 = r4
        L11:
            return
    }
}
