package org.apache.commons.compress.compressors.deflate64;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import p025.AbstractC7012;
import p390.AbstractC9806;
import p392.AbstractC9814;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6453 extends AbstractC9806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6449 f15850;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final byte[] f15851;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InputStream f15852;

    public C6453(InputStream inputStream) {
        C6449 c6449 = new C6449(inputStream);
        this.f15851 = new byte[1];
        this.f15850 = c6449;
        this.f15852 = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        C6449 c6449 = this.f15850;
        if (c6449 != null) {
            return c6449.f15836.mo7321();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            C6449 c6449 = this.f15850;
            byte[] bArr = AbstractC9814.f25560;
            if (c6449 != null) {
                try {
                    c6449.close();
                } catch (Exception unused) {
                }
            }
            this.f15850 = null;
            InputStream inputStream = this.f15852;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f15852 = null;
        } catch (Throwable th) {
            InputStream inputStream2 = this.f15852;
            byte[] bArr2 = AbstractC9814.f25560;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            this.f15852 = null;
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        C6449 c6449 = this.f15850;
        if (c6449 == null) {
            return -1;
        }
        try {
            int iM11540 = c6449.m11540(i, bArr, i2);
            this.f15850.f15837.f25609.m15106();
            if (iM11540 == -1) {
                C6449 c64492 = this.f15850;
                byte[] bArr2 = AbstractC9814.f25560;
                if (c64492 != null) {
                    try {
                        c64492.close();
                    } catch (Exception unused) {
                    }
                }
                this.f15850 = null;
            }
            return iM11540;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input", e);
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr;
        int i;
        do {
            bArr = this.f15851;
            i = read(bArr);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return bArr[0] & DefaultClassResolver.NAME;
        }
        C6755.m11870(AbstractC7012.m12147(i, "Invalid return value from read: "));
        return 0;
    }
}
