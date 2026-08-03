package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: Jg */
/* JADX INFO: loaded from: classes.dex */
public final class C0410Jg extends FilterInputStream {

    /* JADX INFO: renamed from: c */
    public static final byte[] f1373c = null;

    /* JADX INFO: renamed from: d */
    public static final int f1374d = 0;

    /* JADX INFO: renamed from: a */
    public final byte f1375a;

    /* JADX INFO: renamed from: b */
    public int f1376b;

    static {
        f1373c = new byte[]{-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f1374d = 31;
    }

    public C0410Jg(InputStream r2, int r3) {
        super(r2);
        if (r3 < (-1)) goto L9;
        if (r3 > 8) goto L9;
        this.f1375a = (byte) r3;
        return;
    L9:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r3, "Cannot add invalid orientation: "));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int r0 = this.f1376b;
        if (r0 < 2) goto L10;
        int r2 = f1374d;
        if (r0 > r2) goto L10;
        if (r0 != r2) goto L9;
        int r02 = this.f1375a;
    L12:
        if (r02 == (-1)) goto L14;
        this.f1376b++;
    L14:
        return r02;
    L9:
        r02 = f1373c[r0 - 2] & 255;
    L10:
        r02 = super.read();
        goto L12
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
        long r32 = super.skip(r3);
        if (r32 <= 0) goto L5;
        this.f1376b = (int) (((long) this.f1376b) + r32);
    L5:
        return r32;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r4, int r5, int r6) {
        int r0 = this.f1376b;
        int r1 = f1374d;
        if (r0 <= r1) goto L5;
        int r42 = super.read(r4, r5, r6);
    L11:
        if (r42 <= 0) goto L13;
        this.f1376b += r42;
    L13:
        return r42;
    L5:
        if (r0 != r1) goto L8;
        r4[r5] = this.f1375a;
        r42 = 1;
        goto L11
    L8:
        if (r0 >= 2) goto L10;
        r42 = super.read(r4, r5, 2 - r0);
        goto L11
    L10:
        int r62 = Math.min(r1 - r0, r6);
        System.arraycopy(f1373c, this.f1376b - 2, r4, r5, r62);
        r42 = r62;
        goto L11
    }
}
