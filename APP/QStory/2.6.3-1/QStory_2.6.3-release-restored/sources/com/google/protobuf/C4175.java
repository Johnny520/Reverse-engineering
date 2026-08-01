package com.google.protobuf;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.protobuf.ByteString;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4175 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11317;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f11318;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f11319;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ RopeByteString f11320;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ByteString.LeafByteString f11321;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11322;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C4176 f11323;

    public C4175(RopeByteString ropeByteString) {
        this.f11320 = ropeByteString;
        C4176 c4176 = new C4176(ropeByteString);
        this.f11323 = c4176;
        ByteString.LeafByteString leafByteStringM7949 = c4176.next();
        this.f11321 = leafByteStringM7949;
        this.f11322 = leafByteStringM7949.size();
        this.f11318 = 0;
        this.f11317 = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f11320.size() - (this.f11317 + this.f11318);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f11319 = this.f11317 + this.f11318;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int iM7947 = m7947(i, bArr, i2);
        if (iM7947 == 0) {
            if (i2 > 0) {
                return -1;
            }
            if (this.f11320.size() - (this.f11317 + this.f11318) == 0) {
                return -1;
            }
        }
        return iM7947;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        C4176 c4176 = new C4176(this.f11320);
        this.f11323 = c4176;
        ByteString.LeafByteString leafByteStringM7949 = c4176.next();
        this.f11321 = leafByteStringM7949;
        this.f11322 = leafByteStringM7949.size();
        this.f11318 = 0;
        this.f11317 = 0;
        m7947(0, null, this.f11319);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return m7947(0, null, (int) j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7947(int i, byte[] bArr, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            m7948();
            if (this.f11321 == null) {
                break;
            }
            int iMin = Math.min(this.f11322 - this.f11318, i3);
            if (bArr != null) {
                this.f11321.copyTo(bArr, this.f11318, i, iMin);
                i += iMin;
            }
            this.f11318 += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7948() {
        if (this.f11321 != null) {
            int i = this.f11318;
            int i2 = this.f11322;
            if (i == i2) {
                this.f11317 += i2;
                this.f11318 = 0;
                if (!this.f11323.hasNext()) {
                    this.f11321 = null;
                    this.f11322 = 0;
                } else {
                    ByteString.LeafByteString leafByteStringM7949 = this.f11323.next();
                    this.f11321 = leafByteStringM7949;
                    this.f11322 = leafByteStringM7949.size();
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        m7948();
        ByteString.LeafByteString leafByteString = this.f11321;
        if (leafByteString == null) {
            return -1;
        }
        int i = this.f11318;
        this.f11318 = i + 1;
        return leafByteString.byteAt(i) & DefaultClassResolver.NAME;
    }
}
