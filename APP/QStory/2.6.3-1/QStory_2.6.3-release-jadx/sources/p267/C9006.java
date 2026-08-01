package p267;

import androidx.appcompat.widget.C0984;
import java.util.LinkedHashSet;
import java.util.Set;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9006 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9006 f22885 = new C9006();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static byte[] m14229(Object obj) {
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
                int iM1122 = C0984.m1122(str);
                strArr[i2] = str;
                iArr[i2] = iM1122;
                i = ((iM1122 >> 7) == 0 ? 1 : (iM1122 >> 14) == 0 ? 2 : (iM1122 >> 21) == 0 ? 3 : (iM1122 >> 28) == 0 ? 4 : 5) + iM1122 + i;
            }
            i2++;
        }
        C0984 c0984 = new C0984(i);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            int i5 = c0984.f941;
            int i6 = i4;
            while (true) {
                int i7 = i6 & (-128);
                bArr = (byte[]) c0984.f939;
                if (i7 == 0) {
                    break;
                }
                bArr[i5] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
                i5++;
            }
            bArr[i5] = (byte) i6;
            c0984.f941 = i5 + 1;
            if (i4 >= 0) {
                c0984.m1132(strArr[i3]);
            }
        }
        return (byte[]) c0984.f939;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static LinkedHashSet m14230(int i, byte[] bArr, int i2) {
        int i3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            C0984 c0984 = new C0984(bArr, i);
            int i4 = i + i2;
            while (true) {
                i3 = c0984.f941;
                if (i3 >= i4) {
                    break;
                }
                byte[] bArr2 = (byte[]) c0984.f939;
                int i5 = i3 + 1;
                c0984.f941 = i5;
                int i6 = bArr2[i3];
                if ((i6 >> 7) != 0) {
                    int i7 = i3 + 2;
                    c0984.f941 = i7;
                    i6 = (i6 & 127) | (bArr2[i5] << 7);
                    if ((i6 >> 14) != 0) {
                        int i8 = i6 & 16383;
                        int i9 = i3 + 3;
                        c0984.f941 = i9;
                        int i10 = i8 | (bArr2[i7] << 14);
                        if ((i10 >> 21) == 0) {
                            i6 = i10;
                        } else {
                            int i11 = i3 + 4;
                            c0984.f941 = i11;
                            i6 = (bArr2[i9] << 21) | (i10 & 2097151);
                            if ((i6 >> 28) != 0) {
                                c0984.f941 = i3 + 5;
                                i6 = (268435455 & i6) | (bArr2[i11] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(c0984.m1145(i6));
            }
            if (i3 != i4) {
                C6755.m11869("Invalid String set");
                return null;
            }
        }
        return linkedHashSet;
    }
}
