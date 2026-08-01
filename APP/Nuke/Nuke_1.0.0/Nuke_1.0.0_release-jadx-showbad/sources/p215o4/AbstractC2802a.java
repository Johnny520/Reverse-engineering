package p215o4;

import java.io.EOFException;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1973a;
import p208n4.C2706e;
import p208n4.C2714m;
import p208n4.C2717p;

/* JADX INFO: renamed from: o4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2802a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f8825a;

    /* JADX INFO: renamed from: b */
    public static final long[] f8826b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1973a.f6662a);
        AbstractC1665j.m2984d(bytes, "getBytes(...)");
        f8825a = bytes;
        f8826b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final String m4986a(C2706e c2706e, long j5) throws EOFException {
        if (j5 > 0) {
            long j6 = j5 - 1;
            if (c2706e.m4721n(j6) == 13) {
                String strM4730x = c2706e.m4730x(j6, AbstractC1973a.f6662a);
                c2706e.skip(2L);
                return strM4730x;
            }
        }
        String strM4730x2 = c2706e.m4730x(j5, AbstractC1973a.f6662a);
        c2706e.skip(1L);
        return strM4730x2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r9;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m4987b(C2706e c2706e, C2714m c2714m, boolean z5) {
        int i5;
        int i6;
        int i7;
        C2717p c2717p;
        int i8;
        AbstractC1665j.m2985e(c2714m, "options");
        C2717p c2717p2 = c2706e.f8628d;
        if (c2717p2 != null) {
            byte[] bArr = c2717p2.f8653a;
            int i9 = c2717p2.f8654b;
            int i10 = c2717p2.f8655c;
            int[] iArr = c2714m.f8646e;
            C2717p c2717p3 = c2717p2;
            int i11 = -1;
            int i12 = 0;
            loop0: while (true) {
                int i13 = i12 + 1;
                int i14 = iArr[i12];
                int i15 = i12 + 2;
                int i16 = iArr[i13];
                if (i16 != -1) {
                    i11 = i16;
                }
                if (c2717p3 == null) {
                    break;
                }
                if (i14 >= 0) {
                    int i17 = i9 + 1;
                    int i18 = bArr[i9] & 255;
                    int i19 = i15 + i14;
                    while (i15 != i19) {
                        if (i18 == iArr[i15]) {
                            i5 = iArr[i15 + i14];
                            if (i17 == i10) {
                                c2717p3 = c2717p3.f8658f;
                                AbstractC1665j.m2982b(c2717p3);
                                int i20 = c2717p3.f8654b;
                                byte[] bArr2 = c2717p3.f8653a;
                                i6 = c2717p3.f8655c;
                                if (c2717p3 == c2717p2) {
                                    i7 = i20;
                                    bArr = bArr2;
                                    c2717p3 = null;
                                } else {
                                    i7 = i20;
                                    bArr = bArr2;
                                }
                            } else {
                                i6 = i10;
                                i7 = i17;
                            }
                            if (i5 >= 0) {
                                return i5;
                            }
                            int i21 = i6;
                            i12 = -i5;
                            i9 = i7;
                            i10 = i21;
                        } else {
                            i15++;
                        }
                    }
                    break loop0;
                }
                int i22 = (i14 * (-1)) + i15;
                while (true) {
                    int i23 = i9 + 1;
                    int i24 = i15 + 1;
                    if ((bArr[i9] & 255) != iArr[i15]) {
                        break loop0;
                    }
                    boolean z6 = i24 == i22;
                    if (i23 == i10) {
                        AbstractC1665j.m2982b(c2717p3);
                        C2717p c2717p4 = c2717p3.f8658f;
                        AbstractC1665j.m2982b(c2717p4);
                        i7 = c2717p4.f8654b;
                        byte[] bArr3 = c2717p4.f8653a;
                        i8 = c2717p4.f8655c;
                        if (c2717p4 != c2717p2) {
                            c2717p = c2717p4;
                            bArr = bArr3;
                        } else {
                            if (!z6) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c2717p = null;
                        }
                    } else {
                        c2717p = c2717p3;
                        i8 = i10;
                        i7 = i23;
                    }
                    if (z6) {
                        i5 = iArr[i24];
                        int i25 = i8;
                        c2717p3 = c2717p;
                        i6 = i25;
                        break;
                    }
                    i9 = i7;
                    i10 = i8;
                    c2717p3 = c2717p;
                    i15 = i24;
                }
            }
        } else {
            return z5 ? -2 : -1;
        }
    }
}
