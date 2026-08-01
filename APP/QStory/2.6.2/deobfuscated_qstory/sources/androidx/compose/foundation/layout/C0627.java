package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC1653;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0627 implements InterfaceC0650 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1761 = 1;

    public final String toString() {
        switch (this.f1761) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0650
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1410(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.f1761) {
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
