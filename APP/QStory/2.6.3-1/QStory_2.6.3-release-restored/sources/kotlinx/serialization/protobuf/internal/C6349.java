package kotlinx.serialization.protobuf.internal;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import kotlinx.serialization.SerializationException;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6349 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f15591;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f15592;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f15593;

    public C6349(byte[] bArr, int i) {
        bArr.getClass();
        this.f15593 = bArr;
        this.f15592 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long m11325(boolean z) {
        int i = this.f15591;
        int i2 = this.f15592;
        if (i == i2) {
            if (z) {
                return -1L;
            }
            throw new SerializationException("Unexpected EOF");
        }
        int i3 = i + 1;
        byte[] bArr = this.f15593;
        long j = bArr[i];
        long j2 = 0;
        if (j >= 0) {
            this.f15591 = i3;
            return j;
        }
        if (i2 - i > 1) {
            int i4 = i + 2;
            long j3 = (((long) bArr[i3]) << 7) ^ j;
            if (j3 < 0) {
                this.f15591 = i4;
                return (-128) ^ j3;
            }
        }
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int iM11326 = m11326();
            j2 |= ((long) (iM11326 & 127)) << i5;
            if ((iM11326 & 128) == 0) {
                return j2;
            }
        }
        throw new SerializationException("Input stream is malformed: Varint too long (exceeded 64 bits)");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m11326() {
        int i = this.f15591;
        if (i >= this.f15592) {
            return -1;
        }
        this.f15591 = i + 1;
        return this.f15593[i] & DefaultClassResolver.NAME;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m11327(int i) {
        int i2 = this.f15592;
        if (i <= i2 - this.f15591) {
            return;
        }
        throw new SerializationException("Unexpected EOF, available " + (i2 - this.f15591) + " bytes, requested: " + i);
    }

    public C6349() {
        this.f15593 = new byte[32768];
    }

    public C6349(byte[] bArr, int i, int i2) {
        this.f15593 = bArr;
        this.f15592 = i;
        this.f15591 = i2;
    }
}
