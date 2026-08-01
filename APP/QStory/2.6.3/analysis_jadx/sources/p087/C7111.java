package p087;

import p052.InterfaceC6554;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7111 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long[] f19041 = new long[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long[] f19042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f19043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6554 f19044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7191 f19045;

    public C7111(InterfaceC7191 interfaceC7191, InterfaceC6554 interfaceC6554) {
        interfaceC7191.getClass();
        this.f19045 = interfaceC7191;
        this.f19044 = interfaceC6554;
        int iMo12380 = interfaceC7191.mo12380();
        if (iMo12380 <= 64) {
            this.f19043 = iMo12380 != 64 ? (-1) << iMo12380 : 0L;
            this.f19042 = f19041;
            return;
        }
        this.f19043 = 0L;
        int i = (iMo12380 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo12380 & 63) != 0) {
            jArr[i - 1] = (-1) << iMo12380;
        }
        this.f19042 = jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12403() {
        InterfaceC6554 interfaceC6554;
        int iNumberOfTrailingZeros;
        InterfaceC7191 interfaceC7191 = this.f19045;
        int iMo12380 = interfaceC7191.mo12380();
        do {
            long j = this.f19043;
            interfaceC6554 = this.f19044;
            if (j == -1) {
                if (iMo12380 <= 64) {
                    return -1;
                }
                long[] jArr = this.f19042;
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
                        if (((Boolean) interfaceC6554.invoke(interfaceC7191, Integer.valueOf(i4))).booleanValue()) {
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
            this.f19043 |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) interfaceC6554.invoke(interfaceC7191, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12404(int i) {
        if (i < 64) {
            this.f19043 = (1 << i) | this.f19043;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.f19042;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }
}
