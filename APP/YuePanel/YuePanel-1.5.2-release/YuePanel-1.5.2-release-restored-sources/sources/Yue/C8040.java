package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8040 {
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ */
    public static final int m4059(long[] jArr, int i, int i2) {
        long jM26469 = C8065.m26469(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compareUnsigned(C8065.m26469(jArr, i), jM26469) < 0) {
                i++;
            }
            while (Long.compareUnsigned(C8065.m26469(jArr, i2), jM26469) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM264692 = C8065.m26469(jArr, i);
                C8065.m26475(jArr, i, C8065.m26469(jArr, i2));
                C8065.m26475(jArr, i2, jM264692);
                i++;
                i2--;
            }
        }
        return i;
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m4060(byte[] bArr, int i, int i2) {
        int i3;
        byte bM26252 = C8049.m26252(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM26252 & 255;
                if (C5499.m17107(C8049.m26252(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (C5499.m17107(C8049.m26252(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM262522 = C8049.m26252(bArr, i);
                C8049.m26258(bArr, i, C8049.m26252(bArr, i2));
                C8049.m26258(bArr, i2, bM262522);
                i++;
                i2--;
            }
        }
        return i;
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m25424(short[] sArr, int i, int i2) {
        int i3;
        short sM26649 = C8081.m26649(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM26649 = C8081.m26649(sArr, i) & C8080.f23970;
                i3 = sM26649 & C8080.f23970;
                if (C5499.m17107(iM26649, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (C5499.m17107(C8081.m26649(sArr, i2) & C8080.f23970, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM266492 = C8081.m26649(sArr, i);
                C8081.m26655(sArr, i, C8081.m26649(sArr, i2));
                C8081.m26655(sArr, i2, sM266492);
                i++;
                i2--;
            }
        }
        return i;
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m25425(int[] iArr, int i, int i2) {
        int iM26379 = C8058.m26379(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compareUnsigned(C8058.m26379(iArr, i), iM26379) < 0) {
                i++;
            }
            while (Integer.compareUnsigned(C8058.m26379(iArr, i2), iM26379) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM263792 = C8058.m26379(iArr, i);
                C8058.m26385(iArr, i, C8058.m26379(iArr, i2));
                C8058.m26385(iArr, i2, iM263792);
                i++;
                i2--;
            }
        }
        return i;
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m25426(long[] jArr, int i, int i2) {
        int iM4059 = m4059(jArr, i, i2);
        int i3 = iM4059 - 1;
        if (i < i3) {
            m25426(jArr, i, i3);
        }
        if (iM4059 < i2) {
            m25426(jArr, iM4059, i2);
        }
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m25427(byte[] bArr, int i, int i2) {
        int iM4060 = m4060(bArr, i, i2);
        int i3 = iM4060 - 1;
        if (i < i3) {
            m25427(bArr, i, i3);
        }
        if (iM4060 < i2) {
            m25427(bArr, iM4060, i2);
        }
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m25428(short[] sArr, int i, int i2) {
        int iM25424 = m25424(sArr, i, i2);
        int i3 = iM25424 - 1;
        if (i < i3) {
            m25428(sArr, i, i3);
        }
        if (iM25424 < i2) {
            m25428(sArr, iM25424, i2);
        }
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m25429(int[] iArr, int i, int i2) {
        int iM25425 = m25425(iArr, i, i2);
        int i3 = iM25425 - 1;
        if (i < i3) {
            m25429(iArr, i, i3);
        }
        if (iM25425 < i2) {
            m25429(iArr, iM25425, i2);
        }
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m25430(@InterfaceC6399 long[] jArr, int i, int i2) {
        C5499.m17103(jArr, "array");
        m25426(jArr, i, i2 - 1);
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m25431(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "array");
        m25427(bArr, i, i2 - 1);
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m25432(@InterfaceC6399 short[] sArr, int i, int i2) {
        C5499.m17103(sArr, "array");
        m25428(sArr, i, i2 - 1);
    }

    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m25433(@InterfaceC6399 int[] iArr, int i, int i2) {
        C5499.m17103(iArr, "array");
        m25429(iArr, i, i2 - 1);
    }
}
