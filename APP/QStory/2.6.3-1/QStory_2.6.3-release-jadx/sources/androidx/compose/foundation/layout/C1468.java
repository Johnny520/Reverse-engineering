package androidx.compose.foundation.layout;

import androidx.compose.p001ui.layout.InterfaceC2488;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1468 implements InterfaceC1491 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2107 = 1;

    public final String toString() {
        switch (this.f2107) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1491
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1980(int i, InterfaceC2488 interfaceC2488, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.f2107) {
            case 0:
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int i5 = i - i3;
                int length = iArr.length;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
                break;
            default:
                int length2 = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i8] = i9;
                    i9 += i10;
                    i2++;
                    i8++;
                }
                break;
        }
    }
}
