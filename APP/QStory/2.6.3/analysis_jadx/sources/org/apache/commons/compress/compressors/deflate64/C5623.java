package org.apache.commons.compress.compressors.deflate64;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import p009.AbstractC6183;
import p374.AbstractC8977;
import p376.AbstractC8985;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5623 extends AbstractC8977 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5619 f15505;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final byte[] f15506;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InputStream f15507;

    public C5623(InputStream inputStream) {
        C5619 c5619 = new C5619(inputStream);
        this.f15506 = new byte[1];
        this.f15505 = c5619;
        this.f15507 = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        C5619 c5619 = this.f15505;
        if (c5619 != null) {
            return c5619.f15491.mo6761();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            C5619 c5619 = this.f15505;
            byte[] bArr = AbstractC8985.f25215;
            if (c5619 != null) {
                try {
                    c5619.close();
                } catch (Exception unused) {
                }
            }
            this.f15505 = null;
            InputStream inputStream = this.f15507;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f15507 = null;
        } catch (Throwable th) {
            InputStream inputStream2 = this.f15507;
            byte[] bArr2 = AbstractC8985.f25215;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            this.f15507 = null;
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        C5619 c5619 = this.f15505;
        if (c5619 == null) {
            return -1;
        }
        try {
            int iM10981 = c5619.m10981(i, bArr, i2);
            this.f15505.f15492.f25264.m14547();
            if (iM10981 == -1) {
                C5619 c56192 = this.f15505;
                byte[] bArr2 = AbstractC8985.f25215;
                if (c56192 != null) {
                    try {
                        c56192.close();
                    } catch (Exception unused) {
                    }
                }
                this.f15505 = null;
            }
            return iM10981;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input", e);
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr;
        int i;
        do {
            bArr = this.f15506;
            i = read(bArr);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return bArr[0] & DefaultClassResolver.NAME;
        }
        C5925.m11311(AbstractC6183.m11588(i, "Invalid return value from read: "));
        return 0;
    }
}
