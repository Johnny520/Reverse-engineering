package p087;

import p052.InterfaceC6553;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long[] f19046 = new long[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long[] f19047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f19048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6553 f19049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7190 f19050;

    public C7110(InterfaceC7190 interfaceC7190, InterfaceC6553 interfaceC6553) {
        interfaceC7190.getClass();
        this.f19050 = interfaceC7190;
        this.f19049 = interfaceC6553;
        int iMo12353 = interfaceC7190.mo12353();
        if (iMo12353 <= 64) {
            this.f19048 = iMo12353 != 64 ? (-1) << iMo12353 : 0L;
            this.f19047 = f19046;
            return;
        }
        this.f19048 = 0L;
        int i = (iMo12353 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo12353 & 63) != 0) {
            jArr[i - 1] = (-1) << iMo12353;
        }
        this.f19047 = jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12376() {
        InterfaceC6553 interfaceC6553;
        int iNumberOfTrailingZeros;
        InterfaceC7190 interfaceC7190 = this.f19050;
        int iMo12353 = interfaceC7190.mo12353();
        do {
            long j = this.f19048;
            interfaceC6553 = this.f19049;
            if (j == -1) {
                if (iMo12353 <= 64) {
                    return -1;
                }
                long[] jArr = this.f19047;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << iNumberOfTrailingZeros2;
                        int i4 = iNumberOfTrailingZeros2 + i3;
                        if (((Boolean) interfaceC6553.invoke(interfaceC7190, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.f19048 |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) interfaceC6553.invoke(interfaceC7190, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12377(int i) {
        if (i < 64) {
            this.f19048 = (1 << i) | this.f19048;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.f19047;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }
}
