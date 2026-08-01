package androidx.compose.foundation.layout;

import androidx.compose.ui.C2115;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.layout.InterfaceC1699;
import java.util.List;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;
import p205.AbstractC7896;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0660 implements InterfaceC1658, InterfaceC0661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2115 f1839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0645 f1840;

    public C0660(InterfaceC0645 interfaceC0645, C2115 c2115) {
        this.f1840 = interfaceC0645;
        this.f1839 = c2115;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0660)) {
            return false;
        }
        C0660 c0660 = (C0660) obj;
        return this.f1840.equals(c0660.f1840) && AbstractC4394.m8917(this.f1839, c0660.f1839);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1839.f6253) + (this.f1840.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f1840 + ", verticalAlignment=" + this.f1839 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1351(AbstractC1724 abstractC1724) {
        return abstractC1724.f4998;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1103(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1333 = interfaceC1699.mo1333(this.f1840.mo1445());
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
                int iMin2 = Math.min(interfaceC1698.mo3048(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1698.mo3044(iMin2));
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
                iMax = Math.max(iMax, interfaceC16982.mo3044(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM14292) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo1352(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC7896.m13297(i, i2, 0, i3) : AbstractC6087.m11408(i, i2, 0, i3);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1353(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        this.f1840.mo1435(interfaceC1653, i, iArr, interfaceC1653.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1333 = interfaceC1699.mo1333(this.f1840.mo1445());
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
            int iMo3048 = interfaceC1698.mo3048(i);
            if (fM1429 == 0.0f) {
                i2 += iMo3048;
            } else if (fM1429 > 0.0f) {
                f += fM1429;
                iMax = Math.max(iMax, Math.round(iMo3048 / fM1429));
            }
        }
        return ((list.size() - 1) * iMo1333) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        return AbstractC0628.m1433(this, C7897.m13313(j), C7897.m13312(j), C7897.m13309(j), C7897.m13310(j), interfaceC1653.mo1333(this.f1840.mo1445()), interfaceC1653, list, new AbstractC1724[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC1657 mo1354(AbstractC1724[] abstractC1724Arr, InterfaceC1653 interfaceC1653, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC1653.mo1485(i, i2, AbstractC4338.m8781(), new C0657(abstractC1724Arr, this, i2, iArr));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1106(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1333 = interfaceC1699.mo1333(this.f1840.mo1445());
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
            int iMo3049 = interfaceC1698.mo3049(i);
            if (fM1429 == 0.0f) {
                i2 += iMo3049;
            } else if (fM1429 > 0.0f) {
                f += fM1429;
                iMax = Math.max(iMax, Math.round(iMo3049 / fM1429));
            }
        }
        return ((list.size() - 1) * iMo1333) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1333 = interfaceC1699.mo1333(this.f1840.mo1445());
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
                int iMin2 = Math.min(interfaceC1698.mo3048(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1698.mo3047(iMin2));
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
                iMax = Math.max(iMax, interfaceC16982.mo3047(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM14292) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo1355(AbstractC1724 abstractC1724) {
        return abstractC1724.f4996;
    }
}
