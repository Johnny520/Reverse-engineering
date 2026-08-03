package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: nz */
/* JADX INFO: loaded from: classes.dex */
public final class C2298nz implements Closeable {

    /* JADX INFO: renamed from: a */
    public final FileInputStream f8055a;

    /* JADX INFO: renamed from: b */
    public final Charset f8056b;

    /* JADX INFO: renamed from: c */
    public byte[] f8057c;

    /* JADX INFO: renamed from: d */
    public int f8058d;

    /* JADX INFO: renamed from: e */
    public int f8059e;

    public C2298nz(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC2794zD.f9462a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f8055a = fileInputStream;
        this.f8056b = charset;
        this.f8057c = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8055a) {
            try {
                if (this.f8057c != null) {
                    this.f8057c = null;
                    this.f8055a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4673d() {
        int i;
        synchronized (this.f8055a) {
            try {
                byte[] bArr = this.f8057c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f8058d >= this.f8059e) {
                    int i2 = this.f8055a.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f8058d = 0;
                    this.f8059e = i2;
                }
                for (int i3 = this.f8058d; i3 != this.f8059e; i3++) {
                    byte[] bArr2 = this.f8057c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f8058d;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        }
                        String str = new String(bArr2, i4, i - i4, this.f8056b.name());
                        this.f8058d = i3 + 1;
                        return str;
                    }
                }
                C2255mz c2255mz = new C2255mz(this, (this.f8059e - this.f8058d) + 80);
                while (true) {
                    byte[] bArr3 = this.f8057c;
                    int i5 = this.f8058d;
                    c2255mz.write(bArr3, i5, this.f8059e - i5);
                    this.f8059e = -1;
                    FileInputStream fileInputStream = this.f8055a;
                    byte[] bArr4 = this.f8057c;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f8058d = 0;
                    this.f8059e = i6;
                    for (int i7 = 0; i7 != this.f8059e; i7++) {
                        byte[] bArr5 = this.f8057c;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f8058d;
                            if (i7 != i8) {
                                c2255mz.write(bArr5, i8, i7 - i8);
                            }
                            this.f8058d = i7 + 1;
                            return c2255mz.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
