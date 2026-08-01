package androidx.compose.foundation.layout;

import androidx.compose.ui.C2115;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.layout.InterfaceC1699;
import java.util.List;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import p053.AbstractC6561;
import p205.AbstractC7897;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0660 implements InterfaceC1658, InterfaceC0661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2115 f1840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0645 f1841;

    public C0660(InterfaceC0645 interfaceC0645, C2115 c2115) {
        this.f1841 = interfaceC0645;
        this.f1840 = c2115;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0660)) {
            return false;
        }
        C0660 c0660 = (C0660) obj;
        return this.f1841.equals(c0660.f1841) && AbstractC4395.m8907(this.f1840, c0660.f1840);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1840.f6254) + (this.f1841.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f1841 + ", verticalAlignment=" + this.f1840 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1361(AbstractC1724 abstractC1724) {
        return abstractC1724.f4999;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1343 = interfaceC1699.mo1343(this.f1841.mo1455());
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
                int iMin2 = Math.min(interfaceC1698.mo3058(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1698.mo3054(iMin2));
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
                iMax = Math.max(iMax, interfaceC16982.mo3054(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM14392) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo1362(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC7897.m13325(i, i2, 0, i3) : AbstractC6561.m12049(i, i2, 0, i3);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1363(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        this.f1841.mo1445(interfaceC1653, i, iArr, interfaceC1653.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1105(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1343 = interfaceC1699.mo1343(this.f1841.mo1455());
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
            int iMo3058 = interfaceC1698.mo3058(i);
            if (fM1439 == 0.0f) {
                i2 += iMo3058;
            } else if (fM1439 > 0.0f) {
                f += fM1439;
                iMax = Math.max(iMax, Math.round(iMo3058 / fM1439));
            }
        }
        return ((list.size() - 1) * iMo1343) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        return AbstractC0628.m1443(this, C7898.m13341(j), C7898.m13340(j), C7898.m13337(j), C7898.m13338(j), interfaceC1653.mo1343(this.f1841.mo1455()), interfaceC1653, list, new AbstractC1724[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC1657 mo1364(AbstractC1724[] abstractC1724Arr, InterfaceC1653 interfaceC1653, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC1653.mo1495(i, i2, AbstractC4339.m8776(), new C0657(abstractC1724Arr, this, i2, iArr));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1343 = interfaceC1699.mo1343(this.f1841.mo1455());
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
            int iMo3059 = interfaceC1698.mo3059(i);
            if (fM1439 == 0.0f) {
                i2 += iMo3059;
            } else if (fM1439 > 0.0f) {
                f += fM1439;
                iMax = Math.max(iMax, Math.round(iMo3059 / fM1439));
            }
        }
        return ((list.size() - 1) * iMo1343) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1108(InterfaceC1699 interfaceC1699, List list, int i) {
        int iMo1343 = interfaceC1699.mo1343(this.f1841.mo1455());
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
                int iMin2 = Math.min(interfaceC1698.mo3058(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1698.mo3057(iMin2));
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
                iMax = Math.max(iMax, interfaceC16982.mo3057(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM14392) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo1365(AbstractC1724 abstractC1724) {
        return abstractC1724.f4997;
    }
}
