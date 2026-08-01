package androidx.compose.foundation.layout;

import androidx.compose.p001ui.C2949;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.layout.InterfaceC2534;
import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p221.AbstractC8726;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1479 implements InterfaceC2493, InterfaceC1502 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2949 f2137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1491 f2138;

    public C1479(InterfaceC1491 interfaceC1491, C2949 c2949) {
        this.f2138 = interfaceC1491;
        this.f2137 = c2949;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1479)) {
            return false;
        }
        C1479 c1479 = (C1479) obj;
        return this.f2138.equals(c1479.f2138) && this.f2137.equals(c1479.f2137);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2137.f6600) + (this.f2138.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f2138 + ", horizontalAlignment=" + this.f2137 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1921(AbstractC2559 abstractC2559) {
        return abstractC2559.f5342;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1664(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMo1903 = interfaceC2534.mo1903(this.f2138.mo2015());
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
            int iMo3614 = interfaceC2533.mo3614(i);
            if (fM1999 == 0.0f) {
                i2 += iMo3614;
            } else if (fM1999 > 0.0f) {
                f += fM1999;
                iMax = Math.max(iMax, Math.round(iMo3614 / fM1999));
            }
        }
        return ((list.size() - 1) * iMo1903) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo1922(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC8726.m13884(0, i3, i, i2) : AbstractC7390.m12609(0, i3, i, i2);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1923(int i, InterfaceC2488 interfaceC2488, int[] iArr, int[] iArr2) {
        this.f2138.mo1980(i, interfaceC2488, iArr, iArr2);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1665(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMo1903 = interfaceC2534.mo1903(this.f2138.mo2015());
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
                int iMin2 = Math.min(interfaceC2533.mo3617(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2533.mo3618(iMin2));
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
                iMax = Math.max(iMax, interfaceC25332.mo3618(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM19992) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        return AbstractC1469.m2003(this, C8727.m13899(j), C8727.m13900(j), C8727.m13897(j), C8727.m13896(j), interfaceC2488.mo1903(this.f2138.mo2015()), interfaceC2488, list, new AbstractC2559[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC2492 mo1924(final AbstractC2559[] abstractC2559Arr, final InterfaceC2488 interfaceC2488, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC2488.mo2055(i2, i, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.foundation.layout.飘花落叶言子楪兰苏世哲
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                AbstractC2559[] abstractC2559Arr2 = abstractC2559Arr;
                int length = abstractC2559Arr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    AbstractC2559 abstractC2559 = abstractC2559Arr2[i6];
                    int i8 = i7 + 1;
                    abstractC2559.getClass();
                    Object objMo3616 = abstractC2559.mo3616();
                    C1503 c1503 = objMo3616 instanceof C1503 ? (C1503) objMo3616 : null;
                    LayoutDirection layoutDirection = interfaceC2488.getLayoutDirection();
                    C1439 c1439 = c1503 != null ? c1503.f2187 : null;
                    int i9 = i2;
                    abstractC2543.m3695(abstractC2559, c1439 != null ? c1439.f2023.m4417(abstractC2559.f5344, i9) : this.f2137.m4418(abstractC2559.f5344, i9, layoutDirection), iArr[i7], 0.0f);
                    i6++;
                    i7 = i8;
                }
                return C6008.f15084;
            }
        });
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1667(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMo1903 = interfaceC2534.mo1903(this.f2138.mo2015());
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
                int iMin2 = Math.min(interfaceC2533.mo3617(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2533.mo3619(iMin2));
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
                iMax = Math.max(iMax, interfaceC25332.mo3619(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM19992) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1668(InterfaceC2534 interfaceC2534, List list, int i) {
        int iMo1903 = interfaceC2534.mo1903(this.f2138.mo2015());
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
            int iMo3617 = interfaceC2533.mo3617(i);
            if (fM1999 == 0.0f) {
                i2 += iMo3617;
            } else if (fM1999 > 0.0f) {
                f += fM1999;
                iMax = Math.max(iMax, Math.round(iMo3617 / fM1999));
            }
        }
        return ((list.size() - 1) * iMo1903) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo1925(AbstractC2559 abstractC2559) {
        return abstractC2559.f5344;
    }
}
