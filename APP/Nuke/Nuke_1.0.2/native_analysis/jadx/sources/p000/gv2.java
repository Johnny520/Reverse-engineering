package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gv2 implements Closeable {

    /* JADX INFO: renamed from: h */
    public final FileInputStream f3711h;

    /* JADX INFO: renamed from: i */
    public final Charset f3712i;

    /* JADX INFO: renamed from: j */
    public byte[] f3713j;

    /* JADX INFO: renamed from: k */
    public int f3714k;

    /* JADX INFO: renamed from: l */
    public int f3715l;

    public gv2(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(c93.f1254a)) {
            C0676s.m4651j("Unsupported encoding");
            throw null;
        }
        this.f3711h = fileInputStream;
        this.f3712i = charset;
        this.f3713j = new byte[8192];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2026b() {
        int i;
        synchronized (this.f3711h) {
            try {
                byte[] bArr = this.f3713j;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f3714k >= this.f3715l) {
                    int i2 = this.f3711h.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f3714k = 0;
                    this.f3715l = i2;
                }
                for (int i3 = this.f3714k; i3 != this.f3715l; i3++) {
                    byte[] bArr2 = this.f3713j;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f3714k;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        }
                        String str = new String(bArr2, i4, i - i4, this.f3712i.name());
                        this.f3714k = i3 + 1;
                        return str;
                    }
                }
                fv2 fv2Var = new fv2(this, (this.f3715l - this.f3714k) + 80);
                while (true) {
                    byte[] bArr3 = this.f3713j;
                    int i5 = this.f3714k;
                    fv2Var.write(bArr3, i5, this.f3715l - i5);
                    this.f3715l = -1;
                    FileInputStream fileInputStream = this.f3711h;
                    byte[] bArr4 = this.f3713j;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f3714k = 0;
                    this.f3715l = i6;
                    for (int i7 = 0; i7 != this.f3715l; i7++) {
                        byte[] bArr5 = this.f3713j;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f3714k;
                            if (i7 != i8) {
                                fv2Var.write(bArr5, i8, i7 - i8);
                            }
                            this.f3714k = i7 + 1;
                            return fv2Var.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f3711h) {
            try {
                if (this.f3713j != null) {
                    this.f3713j = null;
                    this.f3711h.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
