package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ov2 {
    public static final ov2 a = new ov2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LinkedHashSet a(byte[] bArr, int i, int i2) {
        int i3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            e9 e9Var = new e9(i, bArr);
            int i4 = i + i2;
            while (true) {
                i3 = e9Var.i;
                if (i3 >= i4) {
                    break;
                }
                byte[] bArr2 = (byte[]) e9Var.k;
                int i5 = i3 + 1;
                e9Var.i = i5;
                int i6 = bArr2[i3];
                if ((i6 >> 7) != 0) {
                    int i7 = i3 + 2;
                    e9Var.i = i7;
                    i6 = (i6 & 127) | (bArr2[i5] << 7);
                    if ((i6 >> 14) != 0) {
                        int i8 = i6 & 16383;
                        int i9 = i3 + 3;
                        e9Var.i = i9;
                        int i10 = i8 | (bArr2[i7] << 14);
                        if ((i10 >> 21) == 0) {
                            i6 = i10;
                        } else {
                            int i11 = i3 + 4;
                            e9Var.i = i11;
                            i6 = (bArr2[i9] << 21) | (i10 & 2097151);
                            if ((i6 >> 28) != 0) {
                                e9Var.i = i3 + 5;
                                i6 = (268435455 & i6) | (bArr2[i11] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(e9Var.k(i6));
            }
            if (i3 != i4) {
                s.j("Invalid String set");
                return null;
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] b(Object obj) {
        byte[] bArr;
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        Iterator it = set.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 3;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (str == null) {
                i += 5;
                iArr[i2] = -1;
            } else {
                int iL = e9.l(str);
                strArr[i2] = str;
                iArr[i2] = iL;
                if ((iL >> 7) == 0) {
                    i3 = 1;
                } else if ((iL >> 14) == 0) {
                    i3 = 2;
                } else if ((iL >> 21) != 0) {
                    i3 = (iL >> 28) == 0 ? 4 : 5;
                }
                i = i3 + iL + i;
            }
            i2++;
        }
        e9 e9Var = new e9(i, 3);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = iArr[i4];
            int i6 = e9Var.i;
            int i7 = i5;
            while (true) {
                int i8 = i7 & (-128);
                bArr = (byte[]) e9Var.k;
                if (i8 == 0) {
                    break;
                }
                bArr[i6] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
                i6++;
            }
            bArr[i6] = (byte) i7;
            e9Var.i = i6 + 1;
            if (i5 >= 0) {
                e9Var.s(strArr[i4]);
            }
        }
        return (byte[]) e9Var.k;
    }
}
