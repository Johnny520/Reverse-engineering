package kotlinx.serialization.protobuf.internal;

import kotlin.collections.AbstractC4346;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C5515 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f15243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f15244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public byte[] f15245 = new byte[32];

    static {
        int[] iArr = new int[65];
        for (int i = 0; i < 65; i++) {
            iArr[i] = (63 - i) / 7;
        }
        f15243 = iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10705(long j) {
        m10707(8);
        for (int i = 7; -1 < i; i--) {
            byte[] bArr = this.f15245;
            int i2 = this.f15244;
            this.f15244 = i2 + 1;
            bArr[i2] = (byte) (j >> (i * 8));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m10706(int i) {
        m10707(4);
        for (int i2 = 3; -1 < i2; i2--) {
            byte[] bArr = this.f15245;
            int i3 = this.f15244;
            this.f15244 = i3 + 1;
            bArr[i3] = (byte) (i >> (i2 * 8));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10707(int i) {
        int i2 = this.f15244 + i;
        if (i2 <= this.f15245.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        AbstractC4346.m8833(this.f15245, 0, bArr, 0, 14);
        this.f15245 = bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10708(int i, long j) {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f15245;
            int i3 = this.f15244;
            if (i2 >= i) {
                bArr[i3 + i] = (byte) j;
                this.f15244 = i + 1 + i3;
                return;
            } else {
                bArr[i3 + i2] = (byte) ((127 & j) | 128);
                j >>>= 7;
                i2++;
            }
        }
    }
}
