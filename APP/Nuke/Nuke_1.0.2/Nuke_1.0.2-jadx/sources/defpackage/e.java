package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final byte[] a;
    public static final long[] b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        byte[] bytes = "0123456789abcdef".getBytes(wq.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String a(fn fnVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (fnVar.o(j2) == 13) {
                String strT = fnVar.t(j2, wq.a);
                fnVar.skip(2L);
                return strT;
            }
        }
        String strT2 = fnVar.t(j, wq.a);
        fnVar.skip(1L);
        return strT2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(fn fnVar, nv1 nv1Var, boolean z) {
        int i;
        int i2;
        int i3;
        mm2 mm2Var;
        int i4;
        nv1Var.getClass();
        mm2 mm2Var2 = fnVar.h;
        if (mm2Var2 != null) {
            byte[] bArr = mm2Var2.a;
            int i5 = mm2Var2.b;
            int i6 = mm2Var2.c;
            int[] iArr = nv1Var.i;
            mm2 mm2Var3 = mm2Var2;
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
                if (mm2Var3 == null) {
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
                                mm2Var3 = mm2Var3.f;
                                mm2Var3.getClass();
                                int i16 = mm2Var3.b;
                                byte[] bArr2 = mm2Var3.a;
                                i2 = mm2Var3.c;
                                if (mm2Var3 == mm2Var2) {
                                    i3 = i16;
                                    bArr = bArr2;
                                    mm2Var3 = null;
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
                        mm2Var3.getClass();
                        mm2 mm2Var4 = mm2Var3.f;
                        mm2Var4.getClass();
                        i3 = mm2Var4.b;
                        byte[] bArr3 = mm2Var4.a;
                        i4 = mm2Var4.c;
                        if (mm2Var4 != mm2Var2) {
                            mm2Var = mm2Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            mm2Var = null;
                        }
                    } else {
                        mm2Var = mm2Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        mm2Var3 = mm2Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    mm2Var3 = mm2Var;
                    i11 = i20;
                }
            }
        } else {
            return z ? -2 : -1;
        }
    }
}
