package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.collection.C0277;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.layout.InterfaceC1727;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p205.AbstractC7897;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0585 implements InterfaceC1727, InterfaceC0661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0590 f1634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f1635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0598 f1636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0650 f1638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0645 f1639;

    public C0585(InterfaceC0645 interfaceC0645, InterfaceC0650 interfaceC0650, float f, C0598 c0598, float f2, C0590 c0590) {
        this.f1639 = interfaceC0645;
        this.f1638 = interfaceC0650;
        this.f1637 = f;
        this.f1636 = c0598;
        this.f1635 = f2;
        this.f1634 = c0590;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m1360(List list, int i, int i2, int i3, C0590 c0590) {
        int i4;
        long jM854;
        int i5 = 0;
        if (list.isEmpty()) {
            jM854 = C0277.m854(0, 0);
        } else {
            int i6 = Integer.MAX_VALUE;
            C0602 c0602 = new C0602(c0590, AbstractC7897.m13325(0, i, 0, Integer.MAX_VALUE), i2, i3);
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) AbstractC4344.m8818(0, list);
            int iMo3054 = interfaceC1698 != null ? interfaceC1698.mo3054(i) : 0;
            int iMo3059 = interfaceC1698 != null ? interfaceC1698.mo3059(iMo3054) : 0;
            boolean z = true;
            if (list.size() > 1) {
                i4 = 1;
            } else {
                i4 = 1;
                z = false;
            }
            int i7 = 0;
            if (c0602.m1374(z, 0, C0277.m854(i, Integer.MAX_VALUE), interfaceC1698 == null ? null : new C0277(C0277.m854(iMo3059, iMo3054)), 0, 0, 0, false, false).f1692) {
                C0277 c0277M1369 = c0590.m1369(0, 0, interfaceC1698 != null ? i4 : 0);
                jM854 = C0277.m854(c0277M1369 != null ? (int) (c0277M1369.f984 & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i14 = i8 - iMo3059;
                    int i15 = i9 + 1;
                    int iMax = Math.max(i13, iMo3054);
                    InterfaceC1698 interfaceC16982 = (InterfaceC1698) AbstractC4344.m8818(i15, list);
                    int iMo30542 = interfaceC16982 != null ? interfaceC16982.mo3054(i) : i5;
                    int iMo30592 = interfaceC16982 != null ? interfaceC16982.mo3059(iMo30542) + i2 : i5;
                    int i16 = i15 - i11;
                    boolean z2 = i9 + 2 < list.size() ? i4 : i5;
                    int i17 = i12;
                    int i18 = iMo30542;
                    int i19 = iMo30592;
                    C0603 c0603M1374 = c0602.m1374(z2, i16, C0277.m854(i14, i6), interfaceC16982 == null ? null : new C0277(C0277.m854(iMo30592, iMo30542)), i17, i7, iMax, false, false);
                    if (c0603M1374.f1693) {
                        int i20 = iMax + i3 + i7;
                        C0604 c0604M1375 = c0602.m1375(c0603M1374, interfaceC16982 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i12 = i17 + 1;
                        if (c0603M1374.f1692) {
                            if (c0604M1375 != null) {
                                long j = c0604M1375.f1695;
                                if (!c0604M1375.f1694) {
                                    i20 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i20;
                            i10 = i15;
                        } else {
                            i11 = i15;
                            i7 = i20;
                            iMo3059 = i21;
                            i13 = 0;
                            i8 = i;
                        }
                    } else {
                        iMo3059 = i19;
                        i8 = i14;
                        i12 = i17;
                        i13 = iMax;
                    }
                    i9 = i15;
                    i10 = i9;
                    iMo3054 = i18;
                    i6 = Integer.MAX_VALUE;
                    i5 = 0;
                    i4 = 1;
                }
                jM854 = C0277.m854(i7 - i3, i10);
            }
        }
        return (int) (jM854 >> 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0585)) {
            return false;
        }
        C0585 c0585 = (C0585) obj;
        return this.f1639.equals(c0585.f1639) && this.f1638.equals(c0585.f1638) && C7893.m13318(this.f1637, c0585.f1637) && this.f1636.equals(c0585.f1636) && C7893.m13318(this.f1635, c0585.f1635) && AbstractC4395.m8907(this.f1634, c0585.f1634);
    }

    public final int hashCode() {
        return this.f1634.hashCode() + AbstractC0053.m144(Integer.MAX_VALUE, AbstractC0053.m144(Integer.MAX_VALUE, AbstractC0053.m145((this.f1636.hashCode() + AbstractC0053.m145((this.f1638.hashCode() + ((this.f1639.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.f1637, 31)) * 31, this.f1635, 31), 31), 31);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f1639 + ", verticalArrangement=" + this.f1638 + ", mainAxisSpacing=" + ((Object) C7893.m13317(this.f1637)) + ", crossAxisAlignment=" + this.f1636 + ", crossAxisArrangementSpacing=" + ((Object) C7893.m13317(this.f1635)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f1634 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo1361(AbstractC1724 abstractC1724) {
        return abstractC1724.mo3139();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long mo1362(int i, int i2, int i3, boolean z) {
        C0660 c0660 = AbstractC0658.f1839;
        return !z ? AbstractC7897.m13325(i, i2, 0, i3) : AbstractC6561.m12049(i, i2, 0, i3);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1363(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        this.f1639.mo1445(interfaceC1653, i, iArr, interfaceC1653.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC1657 mo1364(final AbstractC1724[] abstractC1724Arr, InterfaceC1653 interfaceC1653, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return interfaceC1653.mo1495(i, i2, AbstractC4339.m8776(), new InterfaceC6558(iArr2, i3, i4, i5, abstractC1724Arr, this, i2, layoutDirection, iArr) { // from class: androidx.compose.foundation.layout.飘花落叶言子世兰楪苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC1724[] f1640;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
            public final /* synthetic */ int f1641;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
            public final /* synthetic */ int[] f1642;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
            public final /* synthetic */ C0585 f1643;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
            public final /* synthetic */ int f1644;

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ int f1645;

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
            public final /* synthetic */ int f1646;

            /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
            public final /* synthetic */ int[] f1647;

            {
                this.f1642 = iArr;
            }

            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                C0598 c0598;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                int[] iArr3 = this.f1647;
                int i6 = iArr3 != null ? iArr3[this.f1645] : 0;
                int i7 = this.f1646;
                for (int i8 = i7; i8 < this.f1641; i8++) {
                    AbstractC1724 abstractC1724 = this.f1640[i8];
                    abstractC1724.getClass();
                    Object objMo3056 = abstractC1724.mo3056();
                    C0662 c0662 = objMo3056 instanceof C0662 ? (C0662) objMo3056 : null;
                    if (c0662 == null || (c0598 = c0662.f1842) == null) {
                        c0598 = this.f1643.f1636;
                    }
                    abstractC1708.m3135(abstractC1724, this.f1642[i8 - i7], c0598.f1678.m3857(abstractC1724.mo3138(), this.f1644) + i6, 0.0f);
                }
                return C5176.f14739;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int mo1365(AbstractC1724 abstractC1724) {
        return abstractC1724.mo3138();
    }
}
