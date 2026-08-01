package androidx.compose.animation.core;

import androidx.collection.C1093;
import androidx.collection.C1094;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import p160.C8376;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1149 implements InterfaceC1184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1158 f1380;

    public C1149(C1158 c1158) {
        this.f1380 = c1158;
    }

    @Override // androidx.compose.animation.core.InterfaceC1195
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C1165 mo1487(InterfaceC1204 interfaceC1204) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        C1158 c1158 = this.f1380;
        C1093 c1093 = c1158.f1394;
        C1094 c1094 = new C1094(c1093.f1315 + 2);
        C1093 c10932 = new C1093(c1093.f1315);
        int[] iArr3 = c1093.f1318;
        Object[] objArr3 = c1093.f1317;
        long[] jArr = c1093.f1319;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            C1159 c1159 = (C1159) objArr3[i6];
                            c1094.m1355(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c10932.m1350(i7, new C1170((AbstractC1189) interfaceC1204.mo1622().invoke(c1159.f1397), c1159.f1396));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c1093.m1394(0)) {
            int i8 = c1094.f1330;
            if (i8 < 0) {
                C8376.m13331("Index must be between 0 and size");
                return null;
            }
            c1094.m1354(i8 + 1);
            int[] iArr4 = c1094.f1331;
            int i9 = c1094.f1330;
            if (i9 != 0) {
                AbstractC5179.m9395(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            c1094.f1330++;
        }
        if (!c1093.m1394(c1158.f1395)) {
            c1094.m1355(c1158.f1395);
        }
        int i10 = c1094.f1330;
        if (i10 != 0) {
            int[] iArr5 = c1094.f1331;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new C1165(c1094, c10932, c1158.f1395, AbstractC1182.f1486);
    }
}
