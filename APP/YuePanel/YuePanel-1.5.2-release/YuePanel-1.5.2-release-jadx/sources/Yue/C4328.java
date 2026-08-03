package Yue;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4765
public final class C4328 extends InputStream {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InputStream f8881;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3509 f8882;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f8883;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f8884;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final byte[] f8885;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public final byte[] f8886;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final byte[] f8887;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f8888;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f8889;

    public C4328(@InterfaceC6399 InputStream inputStream, @InterfaceC6399 C3509 c3509) {
        C5499.m17103(inputStream, "input");
        C5499.m17103(c3509, "base64");
        this.f8881 = inputStream;
        this.f8882 = c3509;
        this.f8885 = new byte[1];
        this.f8886 = new byte[1024];
        this.f8887 = new byte[1024];
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f8883) {
            return;
        }
        this.f8883 = true;
        this.f8881.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.f8888;
        if (i < this.f8889) {
            int i2 = this.f8887[i] & 255;
            this.f8888 = i + 1;
            m12524();
            return i2;
        }
        int i3 = read(this.f8885, 0, 1);
        if (i3 == -1) {
            return -1;
        }
        if (i3 == 1) {
            return this.f8885[0] & 255;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1293(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f8887;
        int i3 = this.f8888;
        C3404.m7123(bArr2, bArr, i, i3, i3 + i2);
        this.f8888 += i2;
        m12524();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m12520(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f8889;
        this.f8889 = i4 + this.f8882.m9375(this.f8886, this.f8887, i4, 0, i3);
        int iMin = Math.min(m12521(), i2 - i);
        m1293(bArr, i, iMin);
        m12525();
        return iMin;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m12521() {
        return this.f8889 - this.f8888;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m12522(int i) throws IOException {
        this.f8886[i] = 61;
        if ((i & 3) != 2) {
            return i + 1;
        }
        int iM12523 = m12523();
        if (iM12523 >= 0) {
            this.f8886[i + 1] = (byte) iM12523;
        }
        return i + 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m12523() throws IOException {
        int i;
        if (!this.f8882.m9385()) {
            return this.f8881.read();
        }
        do {
            i = this.f8881.read();
            if (i == -1) {
                break;
            }
        } while (!C3512.m9408(i));
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m12524() {
        if (this.f8888 == this.f8889) {
            this.f8888 = 0;
            this.f8889 = 0;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m12525() {
        byte[] bArr = this.f8887;
        int length = bArr.length;
        int i = this.f8889;
        if ((this.f8886.length / 4) * 3 > length - i) {
            C3404.m7123(bArr, bArr, 0, this.f8888, i);
            this.f8889 -= this.f8888;
            this.f8888 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r3 != r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        if (r4 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        return r3 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(@InterfaceC6399 byte[] bArr, int i, int i2) throws IOException {
        int i3;
        boolean z;
        C5499.m17103(bArr, "destination");
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) <= bArr.length) {
            if (!this.f8883) {
                if (this.f8884) {
                    return -1;
                }
                if (i2 == 0) {
                    return 0;
                }
                if (m12521() >= i2) {
                    m1293(bArr, i, i2);
                    return i2;
                }
                int iM12521 = (((i2 - m12521()) + 2) / 3) * 4;
                int iM12520 = i;
                while (true) {
                    boolean z2 = this.f8884;
                    if (z2 || iM12521 <= 0) {
                        break;
                    }
                    int iMin = Math.min(this.f8886.length, iM12521);
                    int iM12522 = 0;
                    while (true) {
                        z = this.f8884;
                        if (z || iM12522 >= iMin) {
                            break;
                        }
                        int iM12523 = m12523();
                        if (iM12523 == -1) {
                            this.f8884 = true;
                        } else if (iM12523 != 61) {
                            this.f8886[iM12522] = (byte) iM12523;
                            iM12522++;
                        } else {
                            iM12522 = m12522(iM12522);
                            this.f8884 = true;
                        }
                    }
                    if (!z && iM12522 != iMin) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    iM12521 -= iM12522;
                    iM12520 += m12520(bArr, iM12520, i3, iM12522);
                }
            } else {
                throw new IOException("The input stream is closed.");
            }
        } else {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", buffer size: " + bArr.length);
        }
    }
}
