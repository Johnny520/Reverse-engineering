package Yue;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4765
public final class C4638 extends OutputStream {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final OutputStream f9951;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3509 f9952;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f9953;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f9954;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final byte[] f9955;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final byte[] f9956;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f9957;

    public C4638(@InterfaceC6399 OutputStream outputStream, @InterfaceC6399 C3509 c3509) {
        C5499.m17103(outputStream, "output");
        C5499.m17103(c3509, "base64");
        this.f9951 = outputStream;
        this.f9952 = c3509;
        this.f9954 = c3509.m9385() ? 76 : -1;
        this.f9955 = new byte[1024];
        this.f9956 = new byte[3];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f9953) {
            return;
        }
        this.f9953 = true;
        if (this.f9957 != 0) {
            m13943();
        }
        this.f9951.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m1596();
        this.f9951.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        m1596();
        byte[] bArr = this.f9956;
        int i2 = this.f9957;
        int i3 = i2 + 1;
        this.f9957 = i3;
        bArr[i2] = (byte) i;
        if (i3 == 3) {
            m13943();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1596() throws IOException {
        if (this.f9953) {
            throw new IOException("The output stream is closed.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m13942(byte[] bArr, int i, int i2) {
        int iMin = Math.min(3 - this.f9957, i2 - i);
        C3404.m7123(bArr, this.f9956, this.f9957, i, i + iMin);
        int i3 = this.f9957 + iMin;
        this.f9957 = i3;
        if (i3 == 3) {
            m13943();
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m13943() {
        if (m13944(this.f9956, 0, this.f9957) != 4) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f9957 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m13944(byte[] bArr, int i, int i2) throws IOException {
        int iM9378 = this.f9952.m9378(bArr, this.f9955, 0, i, i2);
        if (this.f9954 == 0) {
            this.f9951.write(C3509.f5888.m9389());
            this.f9954 = 76;
            if (iM9378 > 76) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.f9951.write(this.f9955, 0, iM9378);
        this.f9954 -= iM9378;
        return iM9378;
    }

    @Override // java.io.OutputStream
    public void write(@InterfaceC6399 byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C5499.m17103(bArr, "source");
        m1596();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", source size: " + bArr.length);
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.f9957;
        if (i4 < 3) {
            if (i4 != 0) {
                i += m13942(bArr, i, i3);
                if (this.f9957 != 0) {
                    return;
                }
            }
            while (i + 3 <= i3) {
                int iMin = Math.min((this.f9952.m9385() ? this.f9954 : this.f9955.length) / 4, (i3 - i) / 3);
                int i5 = (iMin * 3) + i;
                if (m13944(bArr, i, i5) != iMin * 4) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                i = i5;
            }
            C3404.m7123(bArr, this.f9956, 0, i, i3);
            this.f9957 = i3 - i;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
