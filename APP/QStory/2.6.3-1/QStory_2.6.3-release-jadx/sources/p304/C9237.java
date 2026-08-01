package p304;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9237 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f23628;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f23629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Charset f23630;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public byte[] f23631;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final FileInputStream f23632;

    public C9237(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC9236.f23627)) {
            C6755.m11869("Unsupported encoding");
            throw null;
        }
        this.f23632 = fileInputStream;
        this.f23630 = charset;
        this.f23631 = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f23632) {
            try {
                if (this.f23631 != null) {
                    this.f23631 = null;
                    this.f23632.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m14535() {
        int i;
        synchronized (this.f23632) {
            try {
                byte[] bArr = this.f23631;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f23629 >= this.f23628) {
                    int i2 = this.f23632.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f23629 = 0;
                    this.f23628 = i2;
                }
                for (int i3 = this.f23629; i3 != this.f23628; i3++) {
                    byte[] bArr2 = this.f23631;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f23629;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        }
                        String str = new String(bArr2, i4, i - i4, this.f23630.name());
                        this.f23629 = i3 + 1;
                        return str;
                    }
                }
                C9238 c9238 = new C9238(this, (this.f23628 - this.f23629) + 80);
                while (true) {
                    byte[] bArr3 = this.f23631;
                    int i5 = this.f23629;
                    c9238.write(bArr3, i5, this.f23628 - i5);
                    this.f23628 = -1;
                    FileInputStream fileInputStream = this.f23632;
                    byte[] bArr4 = this.f23631;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f23629 = 0;
                    this.f23628 = i6;
                    for (int i7 = 0; i7 != this.f23628; i7++) {
                        byte[] bArr5 = this.f23631;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f23629;
                            if (i7 != i8) {
                                c9238.write(bArr5, i8, i7 - i8);
                            }
                            this.f23629 = i7 + 1;
                            return c9238.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
