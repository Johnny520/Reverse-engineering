package org.apache.commons.compress.compressors.zstandard;

import androidx.profileinstaller.AbstractC3275;
import com.github.luben.zstd.ZstdInputStream;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.C6413;
import p373.C9732;
import p373.C9733;
import p390.AbstractC9806;
import p392.AbstractC9814;
import p393.C9820;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.zstandard.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6456 extends AbstractC9806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ZstdInputStream f15853;

    public C6456(C6413 c6413) {
        C9733 c9733M15104 = C9732.m15104();
        c9733M15104.f25563 = new C9820(c6413);
        this.f15853 = new ZstdInputStream(new C9732(c9733M15104));
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f15853.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15853.close();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f15853.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f15853.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return this.f15853.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f15853.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ZstdInputStream zstdInputStream = this.f15853;
        byte[] bArr = AbstractC9814.f25560;
        if (j < 0) {
            C6755.m11869(AbstractC3275.m5143(j, "Skip count must be non-negative, actual: "));
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            byte[] bArr2 = AbstractC9814.f25558;
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
        return this.f15853.toString();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f15853.read();
    }
}
