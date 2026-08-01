package androidx.compose.animation.core;

import androidx.collection.C0246;
import androidx.collection.C0247;
import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import p144.C7546;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0303 implements InterfaceC0338 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0312 f1035;

    public C0303(C0312 c0312) {
        this.f1035 = c0312;
    }

    @Override // androidx.compose.animation.core.InterfaceC0349
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0319 mo926(InterfaceC0358 interfaceC0358) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        C0312 c0312 = this.f1035;
        C0246 c0246 = c0312.f1049;
        C0247 c0247 = new C0247(c0246.f970 + 2);
        C0246 c02462 = new C0246(c0246.f970);
        int[] iArr3 = c0246.f973;
        Object[] objArr3 = c0246.f972;
        long[] jArr = c0246.f974;
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
                            C0313 c0313 = (C0313) objArr3[i6];
                            c0247.m794(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c02462.m789(i7, new C0324((AbstractC0343) interfaceC0358.mo1061().invoke(c0313.f1052), c0313.f1051));
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
        if (!c0246.m833(0)) {
            int i8 = c0247.f985;
            if (i8 < 0) {
                C7546.m12743("Index must be between 0 and size");
                return null;
            }
            c0247.m793(i8 + 1);
            int[] iArr4 = c0247.f986;
            int i9 = c0247.f985;
            if (i9 != 0) {
                AbstractC4346.m8842(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            c0247.f985++;
        }
        if (!c0246.m833(c0312.f1050)) {
            c0247.m794(c0312.f1050);
        }
        int i10 = c0247.f985;
        if (i10 != 0) {
            int[] iArr5 = c0247.f986;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new C0319(c0247, c02462, c0312.f1050, AbstractC0336.f1141);
    }
}
