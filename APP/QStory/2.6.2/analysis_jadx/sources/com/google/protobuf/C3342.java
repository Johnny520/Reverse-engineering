package com.google.protobuf;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.protobuf.ByteString;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3342 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10967;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10968;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f10969;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ RopeByteString f10970;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ByteString.LeafByteString f10971;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f10972;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3343 f10973;

    public C3342(RopeByteString ropeByteString) {
        this.f10970 = ropeByteString;
        C3343 c3343 = new C3343(ropeByteString);
        this.f10973 = c3343;
        ByteString.LeafByteString leafByteStringM7403 = c3343.next();
        this.f10971 = leafByteStringM7403;
        this.f10972 = leafByteStringM7403.size();
        this.f10968 = 0;
        this.f10967 = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10970.size() - (this.f10967 + this.f10968);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f10969 = this.f10967 + this.f10968;
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
        int iM7401 = m7401(i, bArr, i2);
        if (iM7401 == 0) {
            if (i2 > 0) {
                return -1;
            }
            if (this.f10970.size() - (this.f10967 + this.f10968) == 0) {
                return -1;
            }
        }
        return iM7401;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        C3343 c3343 = new C3343(this.f10970);
        this.f10973 = c3343;
        ByteString.LeafByteString leafByteStringM7403 = c3343.next();
        this.f10971 = leafByteStringM7403;
        this.f10972 = leafByteStringM7403.size();
        this.f10968 = 0;
        this.f10967 = 0;
        m7401(0, null, this.f10969);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return m7401(0, null, (int) j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7401(int i, byte[] bArr, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            m7402();
            if (this.f10971 == null) {
                break;
            }
            int iMin = Math.min(this.f10972 - this.f10968, i3);
            if (bArr != null) {
                this.f10971.copyTo(bArr, this.f10968, i, iMin);
                i += iMin;
            }
            this.f10968 += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7402() {
        if (this.f10971 != null) {
            int i = this.f10968;
            int i2 = this.f10972;
            if (i == i2) {
                this.f10967 += i2;
                this.f10968 = 0;
                if (!this.f10973.hasNext()) {
                    this.f10971 = null;
                    this.f10972 = 0;
                } else {
                    ByteString.LeafByteString leafByteStringM7403 = this.f10973.next();
                    this.f10971 = leafByteStringM7403;
                    this.f10972 = leafByteStringM7403.size();
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        m7402();
        ByteString.LeafByteString leafByteString = this.f10971;
        if (leafByteString == null) {
            return -1;
        }
        int i = this.f10968;
        this.f10968 = i + 1;
        return leafByteString.byteAt(i) & DefaultClassResolver.NAME;
    }
}
