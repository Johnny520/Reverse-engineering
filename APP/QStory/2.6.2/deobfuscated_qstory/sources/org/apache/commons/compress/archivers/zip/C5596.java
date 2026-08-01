package org.apache.commons.compress.archivers.zip;

import androidx.core.view.C2242;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import kotlinx.serialization.protobuf.internal.C5516;
import p357.C8912;
import p357.C8913;
import p357.C8914;
import p362.C8939;
import p376.AbstractC8977;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5596 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f15410;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f15411;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C2242 f15412;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5516 f15413 = new C5516();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2242 f15414;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C2242 f15415;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5597 f15416;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f15417;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5582 f15418;

    public C5596(int i, int i2, C5582 c5582) {
        if (i != 4096 && i != 8192) {
            C5919.m11249("The dictionary size must be 4096 or 8192");
            throw null;
        }
        if (i2 != 2 && i2 != 3) {
            C5919.m11249("The number of trees must be 2 or 3");
            throw null;
        }
        this.f15417 = i;
        this.f15411 = i2;
        this.f15410 = i2;
        this.f15418 = c5582;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15418.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C5516 c5516 = this.f15413;
        if (c5516.f15247 == c5516.f15246) {
            try {
                m10909();
            } catch (IllegalArgumentException e) {
                throw new IOException("bad IMPLODE stream", e);
            }
        }
        int i = c5516.f15247;
        if (i == c5516.f15246) {
            return -1;
        }
        byte b = c5516.f15248[i];
        c5516.f15247 = (i + 1) % 32768;
        return b & DefaultClassResolver.NAME;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10909() throws IOException {
        if (this.f15416 == null) {
            C8914 c8914M14532 = C8913.m14532();
            C5582 c5582 = this.f15418;
            c8914M14532.f25144 = new C8939(new C8912(c5582));
            C8913 c8913 = new C8913(c8914M14532);
            try {
                if (this.f15411 == 3) {
                    this.f15414 = C2242.m4130(c8913, 256);
                }
                this.f15415 = C2242.m4130(c8913, 64);
                this.f15412 = C2242.m4130(c8913, 64);
                c8913.m14534();
                c8913.close();
                this.f15416 = new C5597(c5582, ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                try {
                    c8913.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        int iM14567 = (int) this.f15416.m14567(1);
        if (iM14567 == -1) {
            return;
        }
        C5516 c5516 = this.f15413;
        if (iM14567 == 1) {
            C2242 c2242 = this.f15414;
            C5597 c5597 = this.f15416;
            int iM4132 = c2242 != null ? c2242.m4132(c5597) : (int) c5597.m14567(8);
            if (iM4132 == -1) {
                return;
            }
            byte[] bArr = c5516.f15248;
            int i = c5516.f15246;
            bArr[i] = (byte) iM4132;
            c5516.f15246 = (i + 1) % 32768;
            return;
        }
        int i2 = this.f15417 == 4096 ? 6 : 7;
        int iM10910 = (int) this.f15416.m10910(i2);
        int iM41322 = this.f15412.m4132(this.f15416);
        if (iM41322 != -1 || iM10910 > 0) {
            int i3 = (iM41322 << i2) | iM10910;
            int iM41323 = this.f15415.m4132(this.f15416);
            if (iM41323 == 63) {
                long jM10910 = this.f15416.m10910(8);
                if (jM10910 == -1) {
                    return;
                } else {
                    iM41323 = AbstractC8977.m14565(iM41323, jM10910);
                }
            }
            int i4 = iM41323 + this.f15410;
            int i5 = c5516.f15246 - (i3 + 1);
            int i6 = i4 + i5;
            while (i5 < i6) {
                byte[] bArr2 = c5516.f15248;
                int i7 = c5516.f15246;
                bArr2[i7] = bArr2[(i5 + 32768) % 32768];
                c5516.f15246 = (i7 + 1) % 32768;
                i5++;
            }
        }
    }
}
