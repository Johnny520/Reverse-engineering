package p068N1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: N1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1017g implements Closeable {

    /* JADX INFO: renamed from: d */
    public final FileInputStream f3154d;

    /* JADX INFO: renamed from: e */
    public final Charset f3155e;

    /* JADX INFO: renamed from: f */
    public byte[] f3156f;

    /* JADX INFO: renamed from: g */
    public int f3157g;

    /* JADX INFO: renamed from: h */
    public int f3158h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1017g(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC1018h.f3159a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f3154d = fileInputStream;
        this.f3155e = charset;
        this.f3156f = new byte[8192];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2102b() {
        int i5;
        synchronized (this.f3154d) {
            try {
                byte[] bArr = this.f3156f;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f3157g >= this.f3158h) {
                    int i6 = this.f3154d.read(bArr, 0, bArr.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f3157g = 0;
                    this.f3158h = i6;
                }
                for (int i7 = this.f3157g; i7 != this.f3158h; i7++) {
                    byte[] bArr2 = this.f3156f;
                    if (bArr2[i7] == 10) {
                        int i8 = this.f3157g;
                        if (i7 != i8) {
                            i5 = i7 - 1;
                            if (bArr2[i5] != 13) {
                                i5 = i7;
                            }
                        }
                        String str = new String(bArr2, i8, i5 - i8, this.f3155e.name());
                        this.f3157g = i7 + 1;
                        return str;
                    }
                }
                C1016f c1016f = new C1016f(this, (this.f3158h - this.f3157g) + 80);
                while (true) {
                    byte[] bArr3 = this.f3156f;
                    int i9 = this.f3157g;
                    c1016f.write(bArr3, i9, this.f3158h - i9);
                    this.f3158h = -1;
                    FileInputStream fileInputStream = this.f3154d;
                    byte[] bArr4 = this.f3156f;
                    int i10 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i10 == -1) {
                        throw new EOFException();
                    }
                    this.f3157g = 0;
                    this.f3158h = i10;
                    for (int i11 = 0; i11 != this.f3158h; i11++) {
                        byte[] bArr5 = this.f3156f;
                        if (bArr5[i11] == 10) {
                            int i12 = this.f3157g;
                            if (i11 != i12) {
                                c1016f.write(bArr5, i12, i11 - i12);
                            }
                            this.f3157g = i11 + 1;
                            return c1016f.toString();
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
        synchronized (this.f3154d) {
            try {
                if (this.f3156f != null) {
                    this.f3156f = null;
                    this.f3154d.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
