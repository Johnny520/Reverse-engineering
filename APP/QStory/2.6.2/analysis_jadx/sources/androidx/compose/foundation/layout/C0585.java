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
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;
import p052.InterfaceC6557;
import p205.AbstractC7896;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0585 implements InterfaceC1727, InterfaceC0661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0590 f1633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f1634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0598 f1635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0650 f1637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0645 f1638;

    public C0585(InterfaceC0645 interfaceC0645, InterfaceC0650 interfaceC0650, float f, C0598 c0598, float f2, C0590 c0590) {
        this.f1638 = interfaceC0645;
        this.f1637 = interfaceC0650;
        this.f1636 = f;
        this.f1635 = c0598;
        this.f1634 = f2;
        this.f1633 = c0590;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m1350(List list, int i, int i2, int i3, C0590 c0590) {
        int i4;
        long jM853;
        int i5 = 0;
        if (list.isEmpty()) {
            jM853 = C0277.m853(0, 0);
        } else {
            int i6 = Integer.MAX_VALUE;
            C0602 c0602 = new C0602(c0590, AbstractC7896.m13297(0, i, 0, Integer.MAX_VALUE), i2, i3);
            InterfaceC1698 interfaceC1698 = (InterfaceC1698) AbstractC4343.m8831(0, list);
            int iMo3044 = interfaceC1698 != null ? interfaceC1698.mo3044(i) : 0;
            int iMo3049 = interfaceC1698 != null ? interfaceC1698.mo3049(iMo3044) : 0;
            boolean z = true;
            if (list.size() > 1) {
                i4 = 1;
            } else {
                i4 = 1;
                z = false;
            }
            int i7 = 0;
            if (c0602.m1364(z, 0, C0277.m853(i, Integer.MAX_VALUE), interfaceC1698 == null ? null : new C0277(C0277.m853(iMo3049, iMo3044)), 0, 0, 0, false, false).f1691) {
                C0277 c0277M1359 = c0590.m1359(0, 0, interfaceC1698 != null ? i4 : 0);
                jM853 = C0277.m853(c0277M1359 != null ? (int) (c0277M1359.f984 & 4294967295L) : 0, 0);
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
                    int i14 = i8 - iMo3049;
                    int i15 = i9 + 1;
                    int iMax = Math.max(i13, iMo3044);
                    InterfaceC1698 interfaceC16982 = (InterfaceC1698) AbstractC4343.m8831(i15, list);
                    int iMo30442 = interfaceC16982 != null ? interfaceC16982.mo3044(i) : i5;
                    int iMo30492 = interfaceC16982 != null ? interfaceC16982.mo3049(iMo30442) + i2 : i5;
                    int i16 = i15 - i11;
                    boolean z2 = i9 + 2 < list.size() ? i4 : i5;
                    int i17 = i12;
                    int i18 = iMo30442;
                    int i19 = iMo30492;
                    C0603 c0603M1364 = c0602.m1364(z2, i16, C0277.m853(i14, i6), interfaceC16982 == null ? null : new C0277(C0277.m853(iMo30492, iMo30442)), i17, i7, iMax, false, false);
                    if (c0603M1364.f1692) {
                        int i20 = iMax + i3 + i7;
                        C0604 c0604M1365 = c0602.m1365(c0603M1364, interfaceC16982 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i12 = i17 + 1;
                        if (c0603M1364.f1691) {
                            if (c0604M1365 != null) {
                                long j = c0604M1365.f1694;
                                if (!c0604M1365.f1693) {
                                    i20 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i20;
                            i10 = i15;
                        } else {
                            i11 = i15;
                            i7 = i20;
                            iMo3049 = i21;
                            i13 = 0;
                            i8 = i;
                        }
                    } else {
                        iMo3049 = i19;
                        i8 = i14;
                        i12 = i17;
                        i13 = iMax;
                    }
                    i9 = i15;
                    i10 = i9;
                    iMo3044 = i18;
                    i6 = Integer.MAX_VALUE;
                    i5 = 0;
                    i4 = 1;
                }
                jM853 = C0277.m853(i7 - i3, i10);
            }
        }
        return (int) (jM853 >> 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0585)) {
            return false;
        }
        C0585 c0585 = (C0585) obj;
        return this.f1638.equals(c0585.f1638) && this.f1637.equals(c0585.f1637) && C7892.m13290(this.f1636, c0585.f1636) && this.f1635.equals(c0585.f1635) && C7892.m13290(this.f1634, c0585.f1634) && AbstractC4394.m8917(this.f1633, c0585.f1633);
    }

    public final int hashCode() {
        return this.f1633.hashCode() + AbstractC0053.m143(Integer.MAX_VALUE, AbstractC0053.m143(Integer.MAX_VALUE, AbstractC0053.m144((this.f1635.hashCode() + AbstractC0053.m144((this.f1637.hashCode() + ((this.f1638.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.f1636, 31)) * 31, this.f1634, 31), 31), 31);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f1638 + ", verticalArrangement=" + this.f1637 + ", mainAxisSpacing=" + ((Object) C7892.m13289(this.f1636)) + ", crossAxisAlignment=" + this.f1635 + ", crossAxisArrangementSpacing=" + ((Object) C7892.m13289(this.f1634)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f1633 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo1351(AbstractC1724 abstractC1724) {
        return abstractC1724.mo3129();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long mo1352(int i, int i2, int i3, boolean z) {
        C0660 c0660 = AbstractC0658.f1838;
        return !z ? AbstractC7896.m13297(i, i2, 0, i3) : AbstractC6087.m11408(i, i2, 0, i3);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1353(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        this.f1638.mo1435(interfaceC1653, i, iArr, interfaceC1653.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC1657 mo1354(final AbstractC1724[] abstractC1724Arr, InterfaceC1653 interfaceC1653, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return interfaceC1653.mo1485(i, i2, AbstractC4338.m8781(), new InterfaceC6557(iArr2, i3, i4, i5, abstractC1724Arr, this, i2, layoutDirection, iArr) { // from class: androidx.compose.foundation.layout.飘花落叶言子世兰楪苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC1724[] f1639;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
            public final /* synthetic */ int f1640;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
            public final /* synthetic */ int[] f1641;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
            public final /* synthetic */ C0585 f1642;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
            public final /* synthetic */ int f1643;

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ int f1644;

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
            public final /* synthetic */ int f1645;

            /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
            public final /* synthetic */ int[] f1646;

            {
                this.f1641 = iArr;
            }

            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                C0598 c0598;
                AbstractC1708 abstractC1708 = (AbstractC1708) obj;
                int[] iArr3 = this.f1646;
                int i6 = iArr3 != null ? iArr3[this.f1644] : 0;
                int i7 = this.f1645;
                for (int i8 = i7; i8 < this.f1640; i8++) {
                    AbstractC1724 abstractC1724 = this.f1639[i8];
                    abstractC1724.getClass();
                    Object objMo3046 = abstractC1724.mo3046();
                    C0662 c0662 = objMo3046 instanceof C0662 ? (C0662) objMo3046 : null;
                    if (c0662 == null || (c0598 = c0662.f1841) == null) {
                        c0598 = this.f1642.f1635;
                    }
                    abstractC1708.m3125(abstractC1724, this.f1641[i8 - i7], c0598.f1677.m3847(abstractC1724.mo3128(), this.f1643) + i6, 0.0f);
                }
                return C5175.f14739;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0661
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int mo1355(AbstractC1724 abstractC1724) {
        return abstractC1724.mo3128();
    }
}
