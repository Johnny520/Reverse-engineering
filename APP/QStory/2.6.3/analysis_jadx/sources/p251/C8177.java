package p251;

import androidx.appcompat.widget.C0137;
import java.util.LinkedHashSet;
import java.util.Set;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8177 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8177 f22540 = new C8177();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static byte[] m13670(Object obj) {
        byte[] bArr;
        Set<String> set = (Set) obj;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i2 = 0;
        for (String str : set) {
            if (str == null) {
                i += 5;
                iArr[i2] = -1;
            } else {
                int iM562 = C0137.m562(str);
                strArr[i2] = str;
                iArr[i2] = iM562;
                i = ((iM562 >> 7) == 0 ? 1 : (iM562 >> 14) == 0 ? 2 : (iM562 >> 21) == 0 ? 3 : (iM562 >> 28) == 0 ? 4 : 5) + iM562 + i;
            }
            i2++;
        }
        C0137 c0137 = new C0137(i);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            int i5 = c0137.f596;
            int i6 = i4;
            while (true) {
                int i7 = i6 & (-128);
                bArr = (byte[]) c0137.f594;
                if (i7 == 0) {
                    break;
                }
                bArr[i5] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
                i5++;
            }
            bArr[i5] = (byte) i6;
            c0137.f596 = i5 + 1;
            if (i4 >= 0) {
                c0137.m572(strArr[i3]);
            }
        }
        return (byte[]) c0137.f594;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static LinkedHashSet m13671(int i, byte[] bArr, int i2) {
        int i3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            C0137 c0137 = new C0137(bArr, i);
            int i4 = i + i2;
            while (true) {
                i3 = c0137.f596;
                if (i3 >= i4) {
                    break;
                }
                byte[] bArr2 = (byte[]) c0137.f594;
                int i5 = i3 + 1;
                c0137.f596 = i5;
                int i6 = bArr2[i3];
                if ((i6 >> 7) != 0) {
                    int i7 = i3 + 2;
                    c0137.f596 = i7;
                    i6 = (i6 & 127) | (bArr2[i5] << 7);
                    if ((i6 >> 14) != 0) {
                        int i8 = i6 & 16383;
                        int i9 = i3 + 3;
                        c0137.f596 = i9;
                        int i10 = i8 | (bArr2[i7] << 14);
                        if ((i10 >> 21) == 0) {
                            i6 = i10;
                        } else {
                            int i11 = i3 + 4;
                            c0137.f596 = i11;
                            i6 = (bArr2[i9] << 21) | (i10 & 2097151);
                            if ((i6 >> 28) != 0) {
                                c0137.f596 = i3 + 5;
                                i6 = (268435455 & i6) | (bArr2[i11] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(c0137.m585(i6));
            }
            if (i3 != i4) {
                C5925.m11310("Invalid String set");
                return null;
            }
        }
        return linkedHashSet;
    }
}
