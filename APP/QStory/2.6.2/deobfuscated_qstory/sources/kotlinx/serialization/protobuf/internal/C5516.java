package kotlinx.serialization.protobuf.internal;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import kotlinx.serialization.SerializationException;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5516 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f15246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f15247;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte[] f15248;

    public C5516(byte[] bArr, int i) {
        bArr.getClass();
        this.f15248 = bArr;
        this.f15247 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long m10709(boolean z) {
        int i = this.f15246;
        int i2 = this.f15247;
        if (i == i2) {
            if (z) {
                return -1L;
            }
            throw new SerializationException("Unexpected EOF");
        }
        int i3 = i + 1;
        byte[] bArr = this.f15248;
        long j = bArr[i];
        long j2 = 0;
        if (j >= 0) {
            this.f15246 = i3;
            return j;
        }
        if (i2 - i > 1) {
            int i4 = i + 2;
            long j3 = (((long) bArr[i3]) << 7) ^ j;
            if (j3 < 0) {
                this.f15246 = i4;
                return (-128) ^ j3;
            }
        }
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int iM10710 = m10710();
            j2 |= ((long) (iM10710 & 127)) << i5;
            if ((iM10710 & 128) == 0) {
                return j2;
            }
        }
        throw new SerializationException("Input stream is malformed: Varint too long (exceeded 64 bits)");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m10710() {
        int i = this.f15246;
        if (i >= this.f15247) {
            return -1;
        }
        this.f15246 = i + 1;
        return this.f15248[i] & DefaultClassResolver.NAME;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m10711(int i) {
        int i2 = this.f15247;
        if (i <= i2 - this.f15246) {
            return;
        }
        throw new SerializationException("Unexpected EOF, available " + (i2 - this.f15246) + " bytes, requested: " + i);
    }

    public C5516() {
        this.f15248 = new byte[32768];
    }

    public C5516(byte[] bArr, int i, int i2) {
        this.f15248 = bArr;
        this.f15247 = i;
        this.f15246 = i2;
    }
}
