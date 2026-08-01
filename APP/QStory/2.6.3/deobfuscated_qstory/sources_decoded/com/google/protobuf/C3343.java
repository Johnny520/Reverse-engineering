package com.google.protobuf;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.protobuf.ByteString;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3343 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10972;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10973;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f10974;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ RopeByteString f10975;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ByteString.LeafByteString f10976;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f10977;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3344 f10978;

    public C3343(RopeByteString ropeByteString) {
        this.f10975 = ropeByteString;
        C3344 c3344 = new C3344(ropeByteString);
        this.f10978 = c3344;
        ByteString.LeafByteString leafByteStringM7390 = c3344.next();
        this.f10976 = leafByteStringM7390;
        this.f10977 = leafByteStringM7390.size();
        this.f10973 = 0;
        this.f10972 = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10975.size() - (this.f10972 + this.f10973);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f10974 = this.f10972 + this.f10973;
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
        int iM7388 = m7388(i, bArr, i2);
        if (iM7388 == 0) {
            if (i2 > 0) {
                return -1;
            }
            if (this.f10975.size() - (this.f10972 + this.f10973) == 0) {
                return -1;
            }
        }
        return iM7388;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        C3344 c3344 = new C3344(this.f10975);
        this.f10978 = c3344;
        ByteString.LeafByteString leafByteStringM7390 = c3344.next();
        this.f10976 = leafByteStringM7390;
        this.f10977 = leafByteStringM7390.size();
        this.f10973 = 0;
        this.f10972 = 0;
        m7388(0, null, this.f10974);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return m7388(0, null, (int) j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7388(int i, byte[] bArr, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            m7389();
            if (this.f10976 == null) {
                break;
            }
            int iMin = Math.min(this.f10977 - this.f10973, i3);
            if (bArr != null) {
                this.f10976.copyTo(bArr, this.f10973, i, iMin);
                i += iMin;
            }
            this.f10973 += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7389() {
        if (this.f10976 != null) {
            int i = this.f10973;
            int i2 = this.f10977;
            if (i == i2) {
                this.f10972 += i2;
                this.f10973 = 0;
                if (!this.f10978.hasNext()) {
                    this.f10976 = null;
                    this.f10977 = 0;
                } else {
                    ByteString.LeafByteString leafByteStringM7390 = this.f10978.next();
                    this.f10976 = leafByteStringM7390;
                    this.f10977 = leafByteStringM7390.size();
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        m7389();
        ByteString.LeafByteString leafByteString = this.f10976;
        if (leafByteString == null) {
            return -1;
        }
        int i = this.f10973;
        this.f10973 = i + 1;
        return leafByteString.byteAt(i) & DefaultClassResolver.NAME;
    }
}
