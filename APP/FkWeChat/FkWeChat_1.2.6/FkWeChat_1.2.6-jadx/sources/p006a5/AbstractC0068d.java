package p006a5;

import p020b5.InterfaceC0995a;

/* JADX INFO: renamed from: a5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0068d {
    /* JADX INFO: renamed from: a */
    public static void m221a(InterfaceC0995a interfaceC0995a, int i10, long j10) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j10);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i11 = (iNumberOfTrailingZeros + 7) >> 3;
        long j11 = j10 >> (64 - (i11 * 8));
        interfaceC0995a.writeByte(i10 | ((i11 - 1) << 5));
        while (i11 > 0) {
            interfaceC0995a.writeByte((byte) j11);
            j11 >>= 8;
            i11--;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m222b(InterfaceC0995a interfaceC0995a, int i10, long j10) {
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((j10 >> 63) ^ j10)) >> 3;
        interfaceC0995a.writeByte(i10 | ((iNumberOfLeadingZeros - 1) << 5));
        while (iNumberOfLeadingZeros > 0) {
            interfaceC0995a.writeByte((byte) j10);
            j10 >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m223c(InterfaceC0995a interfaceC0995a, int i10, long j10) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i11 = (iNumberOfLeadingZeros + 7) >> 3;
        interfaceC0995a.writeByte(i10 | ((i11 - 1) << 5));
        while (i11 > 0) {
            interfaceC0995a.writeByte((byte) j10);
            j10 >>= 8;
            i11--;
        }
    }
}
