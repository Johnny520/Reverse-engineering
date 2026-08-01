package com.bumptech.glide.load.data;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2972 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f9396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte f9397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final byte[] f9395 = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int f9394 = 31;

    public C2972(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            C5925.m11310(AbstractC6183.m11588(i, "Cannot add invalid orientation: "));
            throw null;
        }
        this.f9397 = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f9396;
        int i5 = f9394;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f9397;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f9395, this.f9396 - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f9396 += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f9396 = (int) (((long) this.f9396) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f9396;
        if (i3 < 2 || i3 > (i2 = f9394)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f9397;
        } else {
            i = f9395[i3 - 2] & DefaultClassResolver.NAME;
        }
        if (i != -1) {
            this.f9396++;
        }
        return i;
    }
}
