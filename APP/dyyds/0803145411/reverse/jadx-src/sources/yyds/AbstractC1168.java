package yyds;

import java.io.EOFException;

/* JADX INFO: renamed from: yyds.ᛵᛸᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1168 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final byte[] f5369 = "0123456789abcdef".getBytes(AbstractC0347.f1806);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final long[] f5370 = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final String m2357(long j, C1507 c1507) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c1507.m3038(j2) == 13) {
                String strM3031 = c1507.m3031(j2, AbstractC0347.f1806);
                c1507.m3030(2L);
                return strM3031;
            }
        }
        String strM30312 = c1507.m3031(j, AbstractC0347.f1806);
        c1507.m3030(1L);
        return strM30312;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        return r9;
     */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m2358(C1507 c1507, C1662 c1662, boolean z) {
        int i;
        int i2;
        int i3;
        C0502 c0502;
        int i4;
        C0502 c05022 = c1507.f7086;
        if (c05022 != null) {
            byte[] bArr = c05022.f2443;
            int i5 = c05022.f2444;
            int i6 = c05022.f2446;
            int[] iArr = c1662.f8466;
            C0502 c05023 = c05022;
            int i7 = -1;
            int i8 = 0;
            loop0: while (true) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = i8 + 2;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (c05023 == null) {
                    break;
                }
                if (i10 >= 0) {
                    int i13 = i5 + 1;
                    int i14 = bArr[i5] & 255;
                    int i15 = i11 + i10;
                    while (i11 != i15) {
                        if (i14 == iArr[i11]) {
                            i = iArr[i11 + i10];
                            if (i13 == i6) {
                                c05023 = c05023.f2447;
                                int i16 = c05023.f2444;
                                byte[] bArr2 = c05023.f2443;
                                i2 = c05023.f2446;
                                if (c05023 == c05022) {
                                    i3 = i16;
                                    bArr = bArr2;
                                    c05023 = null;
                                } else {
                                    i3 = i16;
                                    bArr = bArr2;
                                }
                            } else {
                                i2 = i6;
                                i3 = i13;
                            }
                            if (i >= 0) {
                                return i;
                            }
                            int i17 = i2;
                            i8 = -i;
                            i5 = i3;
                            i6 = i17;
                        } else {
                            i11++;
                        }
                    }
                    break loop0;
                }
                int i18 = (i10 * (-1)) + i11;
                while (true) {
                    int i19 = i5 + 1;
                    int i20 = i11 + 1;
                    if ((bArr[i5] & 255) != iArr[i11]) {
                        break loop0;
                    }
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        C0502 c05024 = c05023.f2447;
                        i3 = c05024.f2444;
                        byte[] bArr3 = c05024.f2443;
                        i4 = c05024.f2446;
                        if (c05024 != c05022) {
                            c0502 = c05024;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c0502 = null;
                        }
                    } else {
                        c0502 = c05023;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        c05023 = c0502;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    c05023 = c0502;
                    i11 = i20;
                }
            }
        } else {
            return z ? -2 : -1;
        }
    }
}
