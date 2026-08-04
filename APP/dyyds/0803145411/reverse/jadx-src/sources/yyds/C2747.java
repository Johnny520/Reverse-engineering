package yyds;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᲈᲀᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2747 extends FilterInputStream {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f13460;

    public C2747(C1716 c1716) {
        super(c1716);
        this.f13460 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f13460;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f13460 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m4872(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m4873(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f13460 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jM4872 = m4872(j);
        if (jM4872 == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM4872);
        m4873(jSkip);
        return jSkip;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final long m4872(long j) {
        int i = this.f13460;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m4873(long j) {
        int i = this.f13460;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f13460 = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM4872 = (int) m4872(i2);
        if (iM4872 == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM4872);
        m4873(i3);
        return i3;
    }
}
