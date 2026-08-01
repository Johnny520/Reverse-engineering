package p103;

import p068.InterfaceC7383;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7940 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long[] f19386 = new long[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long[] f19387;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f19388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7383 f19389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8020 f19390;

    public C7940(InterfaceC8020 interfaceC8020, InterfaceC7383 interfaceC7383) {
        interfaceC8020.getClass();
        this.f19390 = interfaceC8020;
        this.f19389 = interfaceC7383;
        int iMo12939 = interfaceC8020.mo12939();
        if (iMo12939 <= 64) {
            this.f19388 = iMo12939 != 64 ? (-1) << iMo12939 : 0L;
            this.f19387 = f19386;
            return;
        }
        this.f19388 = 0L;
        int i = (iMo12939 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo12939 & 63) != 0) {
            jArr[i - 1] = (-1) << iMo12939;
        }
        this.f19387 = jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12962() {
        InterfaceC7383 interfaceC7383;
        int iNumberOfTrailingZeros;
        InterfaceC8020 interfaceC8020 = this.f19390;
        int iMo12939 = interfaceC8020.mo12939();
        do {
            long j = this.f19388;
            interfaceC7383 = this.f19389;
            if (j == -1) {
                if (iMo12939 <= 64) {
                    return -1;
                }
                long[] jArr = this.f19387;
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
                        if (((Boolean) interfaceC7383.invoke(interfaceC8020, Integer.valueOf(i4))).booleanValue()) {
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
            this.f19388 |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) interfaceC7383.invoke(interfaceC8020, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12963(int i) {
        if (i < 64) {
            this.f19388 = (1 << i) | this.f19388;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.f19387;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }
}
