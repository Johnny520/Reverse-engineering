package androidx.compose.foundation.layout;

import androidx.compose.ui.C2116;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.layout.InterfaceC1699;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p000.AbstractC6087;
import p052.InterfaceC6557;
import p205.AbstractC7896;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0638 implements InterfaceC1658, InterfaceC0661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2116 f1791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0650 f1792;

    public C0638(InterfaceC0650 interfaceC0650, C2116 c2116) {
        this.f1792 = interfaceC0650;
        this.f1791 = c2116;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0638)) {
            return false;
        }
        C0638 c0638 = (C0638) obj;
        return this.f1792.equals(c0638.f1792) && this.f1791.equals(c0638.f1791);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1791.f6254) + (this.f1792.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f1792 + ", horizontalAlignment=" + this.f1791 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1351(AbstractC1724 abstractC1724) {
        return abstractC1724.f4996;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1103(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1333 = interfaceC1699.mo1333(this.f1792.mo1445());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) list.get(i3);
            float fM1429 = AbstractC0628.m1429(AbstractC0628.m1430(interfaceC1698));
            int iMo3044 = interfaceC1698.mo3044(i);
            if (fM1429 == 0.0f) {
                i2 += iMo3044;
            } else if (fM1429 > 0.0f) {
                f += fM1429;
                iMax = Math.max(iMax, Math.round(iMo3044 / fM1429));
            }
        }
        return ((list.size() - 1) * iMo1333) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo1352(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC7896.m13297(0, i3, i, i2) : AbstractC6087.m11407(0, i3, i, i2);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1353(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        this.f1792.mo1410(i, interfaceC1653, iArr, iArr2);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1333 = interfaceC1699.mo1333(this.f1792.mo1445());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo1333, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) list.get(i2);
            float fM1429 = AbstractC0628.m1429(AbstractC0628.m1430(interfaceC1698));
            if (fM1429 == 0.0f) {
                int iMin2 = Math.min(interfaceC1698.mo3047(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1698.mo3048(iMin2));
            } else if (fM1429 > 0.0f) {
                f += fM1429;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC1698 interfaceC16982 = (InterfaceC1698) list.get(i3);
            float fM14292 = AbstractC0628.m1429(AbstractC0628.m1430(interfaceC16982));
            if (fM14292 > 0.0f) {
                iMax = Math.max(iMax, interfaceC16982.mo3048(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM14292) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        return AbstractC0628.m1433(this, C7897.m13312(j), C7897.m13313(j), C7897.m13310(j), C7897.m13309(j), interfaceC1653.mo1333(this.f1792.mo1445()), interfaceC1653, list, new AbstractC1724[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC1657 mo1354(final AbstractC1724[] abstractC1724Arr, final InterfaceC1653 interfaceC1653, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC1653.mo1485(i2, i, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.foundation.layout.飘花落叶言子楪兰苏世哲
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                AbstractC1724[] abstractC1724Arr2 = abstractC1724Arr;
                int length = abstractC1724Arr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    AbstractC1724 abstractC1724 = abstractC1724Arr2[i6];
                    int i8 = i7 + 1;
                    abstractC1724.getClass();
                    Object objMo3046 = abstractC1724.mo3046();
                    C0662 c0662 = objMo3046 instanceof C0662 ? (C0662) objMo3046 : null;
                    LayoutDirection layoutDirection = interfaceC1653.getLayoutDirection();
                    C0598 c0598 = c0662 != null ? c0662.f1841 : null;
                    int i9 = i2;
                    abstractC1708.m3125(abstractC1724, c0598 != null ? c0598.f1677.m3847(abstractC1724.f4998, i9) : this.f1791.m3848(abstractC1724.f4998, i9, layoutDirection), iArr[i7], 0.0f);
                    i6++;
                    i7 = i8;
                }
                return C5175.f14739;
            }
        });
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1106(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1333 = interfaceC1699.mo1333(this.f1792.mo1445());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo1333, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) list.get(i2);
            float fM1429 = AbstractC0628.m1429(AbstractC0628.m1430(interfaceC1698));
            if (fM1429 == 0.0f) {
                int iMin2 = Math.min(interfaceC1698.mo3047(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1698.mo3049(iMin2));
            } else if (fM1429 > 0.0f) {
                f += fM1429;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC1698 interfaceC16982 = (InterfaceC1698) list.get(i3);
            float fM14292 = AbstractC0628.m1429(AbstractC0628.m1430(interfaceC16982));
            if (fM14292 > 0.0f) {
                iMax = Math.max(iMax, interfaceC16982.mo3049(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM14292) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1333 = interfaceC1699.mo1333(this.f1792.mo1445());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) list.get(i3);
            float fM1429 = AbstractC0628.m1429(AbstractC0628.m1430(interfaceC1698));
            int iMo3047 = interfaceC1698.mo3047(i);
            if (fM1429 == 0.0f) {
                i2 += iMo3047;
            } else if (fM1429 > 0.0f) {
                f += fM1429;
                iMax = Math.max(iMax, Math.round(iMo3047 / fM1429));
            }
        }
        return ((list.size() - 1) * iMo1333) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo1355(AbstractC1724 abstractC1724) {
        return abstractC1724.f4998;
    }
}
