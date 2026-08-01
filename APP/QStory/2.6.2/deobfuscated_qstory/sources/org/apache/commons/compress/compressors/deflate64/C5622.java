package org.apache.commons.compress.compressors.deflate64;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import p007.AbstractC6136;
import p377.AbstractC8985;
import p378.AbstractC8988;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5622 extends AbstractC8988 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5618 f15505;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final byte[] f15506;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InputStream f15507;

    public C5622(InputStream inputStream) {
        C5618 c5618 = new C5618(inputStream);
        this.f15506 = new byte[1];
        this.f15505 = c5618;
        this.f15507 = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        C5618 c5618 = this.f15505;
        if (c5618 != null) {
            return c5618.f15491.mo9912();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            C5618 c5618 = this.f15505;
            byte[] bArr = AbstractC8985.f25236;
            if (c5618 != null) {
                try {
                    c5618.close();
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
            byte[] bArr2 = AbstractC8985.f25236;
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
        C5618 c5618 = this.f15505;
        if (c5618 == null) {
            return -1;
        }
        try {
            int iM10924 = c5618.m10924(i, bArr, i2);
            this.f15505.f15492.f25224.m14534();
            if (iM10924 == -1) {
                C5618 c56182 = this.f15505;
                byte[] bArr2 = AbstractC8985.f25236;
                if (c56182 != null) {
                    try {
                        c56182.close();
                    } catch (Exception unused) {
                    }
                }
                this.f15505 = null;
            }
            return iM10924;
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
        C5919.m11250(AbstractC6136.m11556(i, "Invalid return value from read: "));
        return 0;
    }
}
