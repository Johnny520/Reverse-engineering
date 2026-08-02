package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gv2 implements Closeable {
    public final FileInputStream h;
    public final Charset i;
    public byte[] j;
    public int k;
    public int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gv2(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(c93.a)) {
            s.j("Unsupported encoding");
            throw null;
        }
        this.h = fileInputStream;
        this.i = charset;
        this.j = new byte[8192];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b() {
        int i;
        synchronized (this.h) {
            try {
                byte[] bArr = this.j;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.k >= this.l) {
                    int i2 = this.h.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.k = 0;
                    this.l = i2;
                }
                for (int i3 = this.k; i3 != this.l; i3++) {
                    byte[] bArr2 = this.j;
                    if (bArr2[i3] == 10) {
                        int i4 = this.k;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        }
                        String str = new String(bArr2, i4, i - i4, this.i.name());
                        this.k = i3 + 1;
                        return str;
                    }
                }
                fv2 fv2Var = new fv2(this, (this.l - this.k) + 80);
                while (true) {
                    byte[] bArr3 = this.j;
                    int i5 = this.k;
                    fv2Var.write(bArr3, i5, this.l - i5);
                    this.l = -1;
                    FileInputStream fileInputStream = this.h;
                    byte[] bArr4 = this.j;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.k = 0;
                    this.l = i6;
                    for (int i7 = 0; i7 != this.l; i7++) {
                        byte[] bArr5 = this.j;
                        if (bArr5[i7] == 10) {
                            int i8 = this.k;
                            if (i7 != i8) {
                                fv2Var.write(bArr5, i8, i7 - i8);
                            }
                            this.k = i7 + 1;
                            return fv2Var.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            try {
                if (this.j != null) {
                    this.j = null;
                    this.h.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
