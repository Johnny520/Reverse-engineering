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
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p205.AbstractC7897;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0638 implements InterfaceC1658, InterfaceC0661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2116 f1792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0650 f1793;

    public C0638(InterfaceC0650 interfaceC0650, C2116 c2116) {
        this.f1793 = interfaceC0650;
        this.f1792 = c2116;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0638)) {
            return false;
        }
        C0638 c0638 = (C0638) obj;
        return this.f1793.equals(c0638.f1793) && this.f1792.equals(c0638.f1792);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1792.f6255) + (this.f1793.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f1793 + ", horizontalAlignment=" + this.f1792 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1361(AbstractC1724 abstractC1724) {
        return abstractC1724.f4997;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1343 = interfaceC1699.mo1343(this.f1793.mo1455());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) list.get(i3);
            float fM1439 = AbstractC0628.m1439(AbstractC0628.m1440(interfaceC1698));
            int iMo3054 = interfaceC1698.mo3054(i);
            if (fM1439 == 0.0f) {
                i2 += iMo3054;
            } else if (fM1439 > 0.0f) {
                f += fM1439;
                iMax = Math.max(iMax, Math.round(iMo3054 / fM1439));
            }
        }
        return ((list.size() - 1) * iMo1343) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo1362(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC7897.m13325(0, i3, i, i2) : AbstractC6561.m12050(0, i3, i, i2);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1363(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        this.f1793.mo1420(i, interfaceC1653, iArr, iArr2);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1105(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1343 = interfaceC1699.mo1343(this.f1793.mo1455());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo1343, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) list.get(i2);
            float fM1439 = AbstractC0628.m1439(AbstractC0628.m1440(interfaceC1698));
            if (fM1439 == 0.0f) {
                int iMin2 = Math.min(interfaceC1698.mo3057(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1698.mo3058(iMin2));
            } else if (fM1439 > 0.0f) {
                f += fM1439;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC1698 interfaceC16982 = (InterfaceC1698) list.get(i3);
            float fM14392 = AbstractC0628.m1439(AbstractC0628.m1440(interfaceC16982));
            if (fM14392 > 0.0f) {
                iMax = Math.max(iMax, interfaceC16982.mo3058(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM14392) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        return AbstractC0628.m1443(this, C7898.m13340(j), C7898.m13341(j), C7898.m13338(j), C7898.m13337(j), interfaceC1653.mo1343(this.f1793.mo1455()), interfaceC1653, list, new AbstractC1724[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC1657 mo1364(final AbstractC1724[] abstractC1724Arr, final InterfaceC1653 interfaceC1653, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC1653.mo1495(i2, i, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.foundation.layout.飘花落叶言子楪兰苏世哲
            @Override // p052.InterfaceC6558
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
                    Object objMo3056 = abstractC1724.mo3056();
                    C0662 c0662 = objMo3056 instanceof C0662 ? (C0662) objMo3056 : null;
                    LayoutDirection layoutDirection = interfaceC1653.getLayoutDirection();
                    C0598 c0598 = c0662 != null ? c0662.f1842 : null;
                    int i9 = i2;
                    abstractC1708.m3135(abstractC1724, c0598 != null ? c0598.f1678.m3857(abstractC1724.f4999, i9) : this.f1792.m3858(abstractC1724.f4999, i9, layoutDirection), iArr[i7], 0.0f);
                    i6++;
                    i7 = i8;
                }
                return C5176.f14739;
            }
        });
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1343 = interfaceC1699.mo1343(this.f1793.mo1455());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo1343, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) list.get(i2);
            float fM1439 = AbstractC0628.m1439(AbstractC0628.m1440(interfaceC1698));
            if (fM1439 == 0.0f) {
                int iMin2 = Math.min(interfaceC1698.mo3057(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1698.mo3059(iMin2));
            } else if (fM1439 > 0.0f) {
                f += fM1439;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC1698 interfaceC16982 = (InterfaceC1698) list.get(i3);
            float fM14392 = AbstractC0628.m1439(AbstractC0628.m1440(interfaceC16982));
            if (fM14392 > 0.0f) {
                iMax = Math.max(iMax, interfaceC16982.mo3059(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM14392) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1108(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1343 = interfaceC1699.mo1343(this.f1793.mo1455());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) list.get(i3);
            float fM1439 = AbstractC0628.m1439(AbstractC0628.m1440(interfaceC1698));
            int iMo3057 = interfaceC1698.mo3057(i);
            if (fM1439 == 0.0f) {
                i2 += iMo3057;
            } else if (fM1439 > 0.0f) {
                f += fM1439;
                iMax = Math.max(iMax, Math.round(iMo3057 / fM1439));
            }
        }
        return ((list.size() - 1) * iMo1343) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo1365(AbstractC1724 abstractC1724) {
        return abstractC1724.f4999;
    }
}
