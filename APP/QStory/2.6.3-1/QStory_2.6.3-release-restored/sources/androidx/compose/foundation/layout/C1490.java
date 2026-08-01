package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.unit.LayoutDirection;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1490 implements InterfaceC1486, InterfaceC1491 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f2165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1471 f2166;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f2167;

    public C1490(float f, C1471 c1471) {
        this.f2167 = f;
        this.f2166 = c1471;
        this.f2165 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1490) {
            C1490 c1490 = (C1490) obj;
            return C8722.m13877(this.f2167, c1490.f2167) && this.f2166 == c1490.f2166;
        }
        return false;
    }

    public final int hashCode() {
        return hashCode() + AbstractC0900.m701(Float.hashCode(this.f2167) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) C8722.m13876(this.f2167)) + ", " + this.f2166 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1486
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2005(InterfaceC2488 interfaceC2488, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iMo1903 = interfaceC2488.mo1903(this.f2167);
        boolean z = layoutDirection == LayoutDirection.Rtl;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iMo1903, iMax);
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
                int iMin3 = Math.min(iMo1903, (i - iMin2) - i9);
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

    @Override // androidx.compose.foundation.layout.InterfaceC1491
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1980(int i, InterfaceC2488 interfaceC2488, int[] iArr, int[] iArr2) {
        mo2005(interfaceC2488, i, iArr, LayoutDirection.Ltr, iArr2);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1486, androidx.compose.foundation.layout.InterfaceC1491
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo2015() {
        return this.f2165;
    }
}
