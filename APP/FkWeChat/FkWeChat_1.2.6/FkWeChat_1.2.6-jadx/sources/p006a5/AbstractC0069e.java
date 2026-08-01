package p006a5;

import p020b5.InterfaceC0995a;

/* JADX INFO: renamed from: a5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0069e {
    /* JADX INFO: renamed from: a */
    public static int m224a(int i10) {
        int i11 = i10 >> 7;
        int i12 = 0;
        while (i11 != 0) {
            i11 >>= 7;
            i12++;
        }
        return i12 + 1;
    }

    /* JADX INFO: renamed from: b */
    public static void m225b(InterfaceC0995a interfaceC0995a, int i10) {
        int i11 = i10 >> 7;
        int i12 = (Integer.MIN_VALUE & i10) == 0 ? 0 : -1;
        int i13 = i10;
        int i14 = i11;
        boolean z10 = true;
        while (z10) {
            z10 = (i14 == i12 && (i14 & 1) == ((i13 >> 6) & 1)) ? false : true;
            interfaceC0995a.writeByte((byte) ((i13 & 127) | (z10 ? 128 : 0)));
            i13 = i14;
            i14 >>= 7;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m226c(InterfaceC0995a interfaceC0995a, int i10) {
        while (true) {
            int i11 = i10;
            i10 >>>= 7;
            if (i10 == 0) {
                interfaceC0995a.writeByte((byte) (i11 & 127));
                return;
            }
            interfaceC0995a.writeByte((byte) ((i11 & 127) | 128));
        }
    }
}
