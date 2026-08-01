package androidx.compose.foundation.layout;

import androidx.compose.p001ui.C2948;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.layout.InterfaceC2534;
import java.util.List;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p069.AbstractC7390;
import p221.AbstractC8726;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1501 implements InterfaceC2493, InterfaceC1502 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2948 f2185;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1486 f2186;

    public C1501(InterfaceC1486 interfaceC1486, C2948 c2948) {
        this.f2186 = interfaceC1486;
        this.f2185 = c2948;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1501)) {
            return false;
        }
        C1501 c1501 = (C1501) obj;
        return this.f2186.equals(c1501.f2186) && AbstractC5227.m9466(this.f2185, c1501.f2185);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2185.f6599) + (this.f2186.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f2186 + ", verticalAlignment=" + this.f2185 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1921(AbstractC2559 abstractC2559) {
        return abstractC2559.f5344;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1664(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMo1903 = interfaceC2534.mo1903(this.f2186.mo2015());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo1903, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC2533 interfaceC2533 = (InterfaceC2533) list.get(i2);
            float fM1999 = AbstractC1469.m1999(AbstractC1469.m2000(interfaceC2533));
            if (fM1999 == 0.0f) {
                int iMin2 = Math.min(interfaceC2533.mo3618(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2533.mo3614(iMin2));
            } else if (fM1999 > 0.0f) {
                f += fM1999;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC2533 interfaceC25332 = (InterfaceC2533) list.get(i3);
            float fM19992 = AbstractC1469.m1999(AbstractC1469.m2000(interfaceC25332));
            if (fM19992 > 0.0f) {
                iMax = Math.max(iMax, interfaceC25332.mo3614(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM19992) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo1922(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC8726.m13884(i, i2, 0, i3) : AbstractC7390.m12608(i, i2, 0, i3);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1923(int i, InterfaceC2488 interfaceC2488, int[] iArr, int[] iArr2) {
        this.f2186.mo2005(interfaceC2488, i, iArr, interfaceC2488.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1665(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMo1903 = interfaceC2534.mo1903(this.f2186.mo2015());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC2533 interfaceC2533 = (InterfaceC2533) list.get(i3);
            float fM1999 = AbstractC1469.m1999(AbstractC1469.m2000(interfaceC2533));
            int iMo3618 = interfaceC2533.mo3618(i);
            if (fM1999 == 0.0f) {
                i2 += iMo3618;
            } else if (fM1999 > 0.0f) {
                f += fM1999;
                iMax = Math.max(iMax, Math.round(iMo3618 / fM1999));
            }
        }
        return ((list.size() - 1) * iMo1903) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        return AbstractC1469.m2003(this, C8727.m13900(j), C8727.m13899(j), C8727.m13896(j), C8727.m13897(j), interfaceC2488.mo1903(this.f2186.mo2015()), interfaceC2488, list, new AbstractC2559[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC2492 mo1924(AbstractC2559[] abstractC2559Arr, InterfaceC2488 interfaceC2488, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC2488.mo2055(i, i2, AbstractC5171.m9335(), new C1498(abstractC2559Arr, this, i2, iArr));
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1667(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMo1903 = interfaceC2534.mo1903(this.f2186.mo2015());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC2533 interfaceC2533 = (InterfaceC2533) list.get(i3);
            float fM1999 = AbstractC1469.m1999(AbstractC1469.m2000(interfaceC2533));
            int iMo3619 = interfaceC2533.mo3619(i);
            if (fM1999 == 0.0f) {
                i2 += iMo3619;
            } else if (fM1999 > 0.0f) {
                f += fM1999;
                iMax = Math.max(iMax, Math.round(iMo3619 / fM1999));
            }
        }
        return ((list.size() - 1) * iMo1903) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1668(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMo1903 = interfaceC2534.mo1903(this.f2186.mo2015());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo1903, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC2533 interfaceC2533 = (InterfaceC2533) list.get(i2);
            float fM1999 = AbstractC1469.m1999(AbstractC1469.m2000(interfaceC2533));
            if (fM1999 == 0.0f) {
                int iMin2 = Math.min(interfaceC2533.mo3618(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2533.mo3617(iMin2));
            } else if (fM1999 > 0.0f) {
                f += fM1999;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC2533 interfaceC25332 = (InterfaceC2533) list.get(i3);
            float fM19992 = AbstractC1469.m1999(AbstractC1469.m2000(interfaceC25332));
            if (fM19992 > 0.0f) {
                iMax = Math.max(iMax, interfaceC25332.mo3617(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM19992) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo1925(AbstractC2559 abstractC2559) {
        return abstractC2559.f5342;
    }
}
