package yyds;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: yyds.ᛵᛵᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1104 implements Closeable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public byte[] f5078;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f5079;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final FileInputStream f5080;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f5081;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Charset f5082;

    public C1104(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC2176.f10662)) {
            C0188.m798("Unsupported encoding");
            throw null;
        }
        this.f5080 = fileInputStream;
        this.f5082 = charset;
        this.f5078 = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f5080) {
            try {
                if (this.f5078 != null) {
                    this.f5078 = null;
                    this.f5080.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2307() {
        int i;
        synchronized (this.f5080) {
            try {
                byte[] bArr = this.f5078;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                int i2 = this.f5081;
                if (i2 >= this.f5079) {
                    int i3 = this.f5080.read(bArr, 0, bArr.length);
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.f5081 = 0;
                    this.f5079 = i3;
                    i2 = 0;
                }
                while (i2 != this.f5079) {
                    byte[] bArr2 = this.f5078;
                    if (bArr2[i2] == 10) {
                        int i4 = this.f5081;
                        if (i2 != i4) {
                            i = i2 - 1;
                            if (bArr2[i] != 13) {
                                i = i2;
                            }
                        }
                        String str = new String(bArr2, i4, i - i4, this.f5082.name());
                        this.f5081 = i2 + 1;
                        return str;
                    }
                    i2++;
                }
                C0878 c0878 = new C0878(this, (this.f5079 - this.f5081) + 80);
                while (true) {
                    byte[] bArr3 = this.f5078;
                    int i5 = this.f5081;
                    c0878.write(bArr3, i5, this.f5079 - i5);
                    this.f5079 = -1;
                    FileInputStream fileInputStream = this.f5080;
                    byte[] bArr4 = this.f5078;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f5081 = 0;
                    this.f5079 = i6;
                    for (int i7 = 0; i7 != this.f5079; i7++) {
                        byte[] bArr5 = this.f5078;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f5081;
                            if (i7 != i8) {
                                c0878.write(bArr5, i8, i7 - i8);
                            }
                            this.f5081 = i7 + 1;
                            return c0878.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
