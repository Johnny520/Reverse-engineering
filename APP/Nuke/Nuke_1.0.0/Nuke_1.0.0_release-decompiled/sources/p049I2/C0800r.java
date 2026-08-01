package p049I2;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: I2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0800r {

    /* JADX INFO: renamed from: a */
    public static final C0800r f2577a = new C0800r();

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet m1404a(byte[] bArr, int i5, int i6) {
        int i7;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i6 > 0) {
            C0793k c0793k = new C0793k(i5, bArr);
            int i8 = i5 + i6;
            while (true) {
                i7 = c0793k.f2537e;
                if (i7 >= i8) {
                    break;
                }
                byte[] bArr2 = (byte[]) c0793k.f2539g;
                int i9 = i7 + 1;
                c0793k.f2537e = i9;
                int i10 = bArr2[i7];
                if ((i10 >> 7) != 0) {
                    int i11 = i7 + 2;
                    c0793k.f2537e = i11;
                    i10 = (i10 & 127) | (bArr2[i9] << 7);
                    if ((i10 >> 14) != 0) {
                        int i12 = i10 & 16383;
                        int i13 = i7 + 3;
                        c0793k.f2537e = i13;
                        int i14 = i12 | (bArr2[i11] << 14);
                        if ((i14 >> 21) == 0) {
                            i10 = i14;
                        } else {
                            int i15 = i7 + 4;
                            c0793k.f2537e = i15;
                            i10 = (bArr2[i13] << 21) | (i14 & 2097151);
                            if ((i10 >> 28) != 0) {
                                c0793k.f2537e = i7 + 5;
                                i10 = (268435455 & i10) | (bArr2[i15] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(c0793k.m1347k(i10));
            }
            if (i7 != i8) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1405b(Object obj) {
        Set<String> set = (Set) obj;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i5 = 0;
        int i6 = 0;
        for (String str : set) {
            if (str == null) {
                i5 += 5;
                iArr[i6] = -1;
            } else {
                int iM1337l = C0793k.m1337l(str);
                strArr[i6] = str;
                iArr[i6] = iM1337l;
                i5 = ((iM1337l >> 7) == 0 ? 1 : (iM1337l >> 14) == 0 ? 2 : (iM1337l >> 21) == 0 ? 3 : (iM1337l >> 28) == 0 ? 4 : 5) + iM1337l + i5;
            }
            i6++;
        }
        C0793k c0793k = new C0793k(i5, 0);
        for (int i7 = 0; i7 < size; i7++) {
            int i8 = iArr[i7];
            int i9 = c0793k.f2537e;
            int i10 = i8;
            while ((i10 & (-128)) != 0) {
                ((byte[]) c0793k.f2539g)[i9] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
                i9++;
            }
            ((byte[]) c0793k.f2539g)[i9] = (byte) i10;
            c0793k.f2537e = i9 + 1;
            if (i8 >= 0) {
                c0793k.m1353s(strArr[i7]);
            }
        }
        return (byte[]) c0793k.f2539g;
    }
}
