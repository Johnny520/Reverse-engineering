package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.unit.LayoutDirection;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0649 implements InterfaceC0645, InterfaceC0650 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0630 f1821;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1822;

    public C0649(float f, C0630 c0630) {
        this.f1822 = f;
        this.f1821 = c0630;
        this.f1820 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0649) {
            C0649 c0649 = (C0649) obj;
            return C7893.m13318(this.f1822, c0649.f1822) && this.f1821 == c0649.f1821;
        }
        return false;
    }

    public final int hashCode() {
        return hashCode() + AbstractC0053.m141(Float.hashCode(this.f1822) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) C7893.m13317(this.f1822)) + ", " + this.f1821 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0645
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1445(InterfaceC1653 interfaceC1653, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iMo1343 = interfaceC1653.mo1343(this.f1822);
        boolean z = layoutDirection == LayoutDirection.Rtl;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iMo1343, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iMo1343, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (i2 > 0) {
            int iRound = Math.round((1.0f + (layoutDirection == LayoutDirection.Ltr ? -1.0f : 1.0f)) * (i2 / 2.0f));
            if (z) {
                iRound -= i2;
            }
            if (iRound != 0) {
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + iRound;
                }
            }
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0650
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1420(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        mo1445(interfaceC1653, i, iArr, LayoutDirection.Ltr, iArr2);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0645, androidx.compose.foundation.layout.InterfaceC0650
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo1455() {
        return this.f1820;
    }
}
