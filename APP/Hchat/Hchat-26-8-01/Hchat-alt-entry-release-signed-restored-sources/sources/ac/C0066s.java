package ac;

import java.util.LinkedHashSet;
import java.util.Set;
import p136j8.C2104o;

/* JADX INFO: renamed from: ac.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0066s {

    /* JADX INFO: renamed from: a */
    public static final C0066s f221a = new C0066s();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static LinkedHashSet m435a(byte[] bArr, int i9, int i10) {
        int i11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i10 > 0) {
            C0058k c0058k = new C0058k(bArr, i9);
            int i12 = i9 + i10;
            while (true) {
                i11 = c0058k.f176h;
                if (i11 >= i12) {
                    break;
                }
                byte[] bArr2 = (byte[]) c0058k.f178j;
                int i13 = i11 + 1;
                c0058k.f176h = i13;
                int i14 = bArr2[i11];
                if ((i14 >> 7) != 0) {
                    int i15 = i11 + 2;
                    c0058k.f176h = i15;
                    i14 = (i14 & 127) | (bArr2[i13] << 7);
                    if ((i14 >> 14) != 0) {
                        int i16 = i14 & 16383;
                        int i17 = i11 + 3;
                        c0058k.f176h = i17;
                        int i18 = i16 | (bArr2[i15] << 14);
                        if ((i18 >> 21) == 0) {
                            i14 = i18;
                        } else {
                            int i19 = i11 + 4;
                            c0058k.f176h = i19;
                            i14 = (bArr2[i17] << 21) | (i18 & 2097151);
                            if ((i14 >> 28) != 0) {
                                c0058k.f176h = i11 + 5;
                                i14 = (268435455 & i14) | (bArr2[i19] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(c0058k.m372w(i14));
            }
            if (i11 != i12) {
                C2104o.m5294t("Invalid String set");
                return null;
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static byte[] m436b(Object obj) {
        byte[] bArr;
        Set<String> set = (Set) obj;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i9 = 0;
        int i10 = 0;
        for (String str : set) {
            if (str == null) {
                i9 += 5;
                iArr[i10] = -1;
            } else {
                int iM335x = C0058k.m335x(str);
                strArr[i10] = str;
                iArr[i10] = iM335x;
                i9 = ((iM335x >> 7) == 0 ? 1 : (iM335x >> 14) == 0 ? 2 : (iM335x >> 21) == 0 ? 3 : (iM335x >> 28) == 0 ? 4 : 5) + iM335x + i9;
            }
            i10++;
        }
        C0058k c0058k = new C0058k(i9);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            int i13 = c0058k.f176h;
            int i14 = i12;
            while (true) {
                int i15 = i14 & (-128);
                bArr = (byte[]) c0058k.f178j;
                if (i15 == 0) {
                    break;
                }
                bArr[i13] = (byte) ((i14 & 127) | 128);
                i14 >>>= 7;
                i13++;
            }
            bArr[i13] = (byte) i14;
            c0058k.f176h = i13 + 1;
            if (i12 >= 0) {
                c0058k.m341G(strArr[i11]);
            }
        }
        return (byte[]) c0058k.f178j;
    }
}
