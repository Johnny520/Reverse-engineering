package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.collection.C1124;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.layout.InterfaceC2562;
import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p221.AbstractC8726;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1426 implements InterfaceC2562, InterfaceC1502 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1431 f1979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f1980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1439 f1981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1491 f1983;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1486 f1984;

    public C1426(InterfaceC1486 interfaceC1486, InterfaceC1491 interfaceC1491, float f, C1439 c1439, float f2, C1431 c1431) {
        this.f1984 = interfaceC1486;
        this.f1983 = interfaceC1491;
        this.f1982 = f;
        this.f1981 = c1439;
        this.f1980 = f2;
        this.f1979 = c1431;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m1920(List list, int i, int i2, int i3, C1431 c1431) {
        int i4;
        long jM1414;
        int i5 = 0;
        if (list.isEmpty()) {
            jM1414 = C1124.m1414(0, 0);
        } else {
            int i6 = Integer.MAX_VALUE;
            C1443 c1443 = new C1443(c1431, AbstractC8726.m13884(0, i, 0, Integer.MAX_VALUE), i2, i3);
            InterfaceC2533 interfaceC2533 = (InterfaceC2533) AbstractC5176.m9377(0, list);
            int iMo3614 = interfaceC2533 != null ? interfaceC2533.mo3614(i) : 0;
            int iMo3619 = interfaceC2533 != null ? interfaceC2533.mo3619(iMo3614) : 0;
            boolean z = true;
            if (list.size() > 1) {
                i4 = 1;
            } else {
                i4 = 1;
                z = false;
            }
            int i7 = 0;
            if (c1443.m1934(z, 0, C1124.m1414(i, Integer.MAX_VALUE), interfaceC2533 == null ? null : new C1124(C1124.m1414(iMo3619, iMo3614)), 0, 0, 0, false, false).f2037) {
                C1124 c1124M1929 = c1431.m1929(0, 0, interfaceC2533 != null ? i4 : 0);
                jM1414 = C1124.m1414(c1124M1929 != null ? (int) (c1124M1929.f1329 & 4294967295L) : 0, 0);
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
                    int i14 = i8 - iMo3619;
                    int i15 = i9 + 1;
                    int iMax = Math.max(i13, iMo3614);
                    InterfaceC2533 interfaceC25332 = (InterfaceC2533) AbstractC5176.m9377(i15, list);
                    int iMo36142 = interfaceC25332 != null ? interfaceC25332.mo3614(i) : i5;
                    int iMo36192 = interfaceC25332 != null ? interfaceC25332.mo3619(iMo36142) + i2 : i5;
                    int i16 = i15 - i11;
                    boolean z2 = i9 + 2 < list.size() ? i4 : i5;
                    int i17 = i12;
                    int i18 = iMo36142;
                    int i19 = iMo36192;
                    C1444 c1444M1934 = c1443.m1934(z2, i16, C1124.m1414(i14, i6), interfaceC25332 == null ? null : new C1124(C1124.m1414(iMo36192, iMo36142)), i17, i7, iMax, false, false);
                    if (c1444M1934.f2038) {
                        int i20 = iMax + i3 + i7;
                        C1445 c1445M1935 = c1443.m1935(c1444M1934, interfaceC25332 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i12 = i17 + 1;
                        if (c1444M1934.f2037) {
                            if (c1445M1935 != null) {
                                long j = c1445M1935.f2040;
                                if (!c1445M1935.f2039) {
                                    i20 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i20;
                            i10 = i15;
                        } else {
                            i11 = i15;
                            i7 = i20;
                            iMo3619 = i21;
                            i13 = 0;
                            i8 = i;
                        }
                    } else {
                        iMo3619 = i19;
                        i8 = i14;
                        i12 = i17;
                        i13 = iMax;
                    }
                    i9 = i15;
                    i10 = i9;
                    iMo3614 = i18;
                    i6 = Integer.MAX_VALUE;
                    i5 = 0;
                    i4 = 1;
                }
                jM1414 = C1124.m1414(i7 - i3, i10);
            }
        }
        return (int) (jM1414 >> 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1426)) {
            return false;
        }
        C1426 c1426 = (C1426) obj;
        return this.f1984.equals(c1426.f1984) && this.f1983.equals(c1426.f1983) && C8722.m13877(this.f1982, c1426.f1982) && this.f1981.equals(c1426.f1981) && C8722.m13877(this.f1980, c1426.f1980) && AbstractC5227.m9466(this.f1979, c1426.f1979);
    }

    public final int hashCode() {
        return this.f1979.hashCode() + AbstractC0900.m704(Integer.MAX_VALUE, AbstractC0900.m704(Integer.MAX_VALUE, AbstractC0900.m705((this.f1981.hashCode() + AbstractC0900.m705((this.f1983.hashCode() + ((this.f1984.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.f1982, 31)) * 31, this.f1980, 31), 31), 31);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f1984 + ", verticalArrangement=" + this.f1983 + ", mainAxisSpacing=" + ((Object) C8722.m13876(this.f1982)) + ", crossAxisAlignment=" + this.f1981 + ", crossAxisArrangementSpacing=" + ((Object) C8722.m13876(this.f1980)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f1979 + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo1921(AbstractC2559 abstractC2559) {
        return abstractC2559.mo3699();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long mo1922(int i, int i2, int i3, boolean z) {
        C1501 c1501 = AbstractC1499.f2184;
        return !z ? AbstractC8726.m13884(i, i2, 0, i3) : AbstractC7390.m12608(i, i2, 0, i3);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1923(int i, InterfaceC2488 interfaceC2488, int[] iArr, int[] iArr2) {
        this.f1984.mo2005(interfaceC2488, i, iArr, interfaceC2488.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC2492 mo1924(final AbstractC2559[] abstractC2559Arr, InterfaceC2488 interfaceC2488, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return interfaceC2488.mo2055(i, i2, AbstractC5171.m9335(), new InterfaceC7387(iArr2, i3, i4, i5, abstractC2559Arr, this, i2, layoutDirection, iArr) { // from class: androidx.compose.foundation.layout.飘花落叶言子世兰楪苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC2559[] f1985;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
            public final /* synthetic */ int f1986;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
            public final /* synthetic */ int[] f1987;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
            public final /* synthetic */ C1426 f1988;

            /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
            public final /* synthetic */ int f1989;

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ int f1990;

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
            public final /* synthetic */ int f1991;

            /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
            public final /* synthetic */ int[] f1992;

            {
                this.f1987 = iArr;
            }

            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                C1439 c1439;
                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                int[] iArr3 = this.f1992;
                int i6 = iArr3 != null ? iArr3[this.f1990] : 0;
                int i7 = this.f1991;
                for (int i8 = i7; i8 < this.f1986; i8++) {
                    AbstractC2559 abstractC2559 = this.f1985[i8];
                    abstractC2559.getClass();
                    Object objMo3616 = abstractC2559.mo3616();
                    C1503 c1503 = objMo3616 instanceof C1503 ? (C1503) objMo3616 : null;
                    if (c1503 == null || (c1439 = c1503.f2187) == null) {
                        c1439 = this.f1988.f1981;
                    }
                    abstractC2543.m3695(abstractC2559, this.f1987[i8 - i7], c1439.f2023.m4417(abstractC2559.mo3698(), this.f1989) + i6, 0.0f);
                }
                return C6008.f15084;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int mo1925(AbstractC2559 abstractC2559) {
        return abstractC2559.mo3698();
    }
}
