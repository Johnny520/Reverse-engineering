package org.apache.commons.compress.compressors.zstandard;

import androidx.profileinstaller.AbstractC2442;
import com.github.luben.zstd.ZstdInputStream;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.C5582;
import p357.C8913;
import p357.C8914;
import p362.C8939;
import p377.AbstractC8985;
import p378.AbstractC8988;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.zstandard.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5625 extends AbstractC8988 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ZstdInputStream f15508;

    public C5625(C5582 c5582) {
        C8914 c8914M14532 = C8913.m14532();
        c8914M14532.f25144 = new C8939(c5582);
        this.f15508 = new ZstdInputStream(new C8913(c8914M14532));
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f15508.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15508.close();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f15508.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f15508.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return this.f15508.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f15508.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ZstdInputStream zstdInputStream = this.f15508;
        byte[] bArr = AbstractC8985.f25236;
        if (j < 0) {
            C5919.m11249(AbstractC2442.m4572(j, "Skip count must be non-negative, actual: "));
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            byte[] bArr2 = AbstractC8985.f25234;
            Arrays.fill(bArr2, (byte) 0);
            long j3 = zstdInputStream.read(bArr2, 0, (int) Math.min(j2, bArr2.length));
            if (j3 < 0) {
                break;
            }
            j2 -= j3;
        }
        return j - j2;
    }

    public final String toString() {
        return this.f15508.toString();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f15508.read();
    }
}
