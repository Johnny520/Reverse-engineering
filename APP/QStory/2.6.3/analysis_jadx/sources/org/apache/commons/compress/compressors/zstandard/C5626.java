package org.apache.commons.compress.compressors.zstandard;

import androidx.profileinstaller.AbstractC2442;
import com.github.luben.zstd.ZstdInputStream;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.C5583;
import p357.C8903;
import p357.C8904;
import p374.AbstractC8977;
import p376.AbstractC8985;
import p377.C8991;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.zstandard.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5626 extends AbstractC8977 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ZstdInputStream f15508;

    public C5626(C5583 c5583) {
        C8904 c8904M14545 = C8903.m14545();
        c8904M14545.f25218 = new C8991(c5583);
        this.f15508 = new ZstdInputStream(new C8903(c8904M14545));
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
        byte[] bArr = AbstractC8985.f25215;
        if (j < 0) {
            C5925.m11310(AbstractC2442.m4583(j, "Skip count must be non-negative, actual: "));
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            byte[] bArr2 = AbstractC8985.f25213;
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
