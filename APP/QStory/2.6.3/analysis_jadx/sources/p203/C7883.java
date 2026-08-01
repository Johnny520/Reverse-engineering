package p203;

import androidx.activity.AbstractC0053;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import p206.C7909;
import p206.C7911;
import p206.C7912;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7883 extends AbstractC7886 {

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f21786;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public int f21787;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public boolean f21788;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public int f21789;

    @Override // p203.C7879
    public final String toString() {
        String strM151 = AbstractC0053.m151(new StringBuilder("[Barrier] "), this.f21751, " {");
        for (int i = 0; i < this.f21844; i++) {
            C7879 c7879 = this.f21845[i];
            if (i > 0) {
                strM151 = strM151.concat(", ");
            }
            StringBuilder sbM140 = AbstractC0053.m140(strM151);
            sbM140.append(c7879.f21751);
            strM151 = sbM140.toString();
        }
        return strM151.concat("}");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int m13295() {
        int i = this.f21789;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean m13296() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f21844;
            if (i4 >= i) {
                break;
            }
            C7879 c7879 = this.f21845[i4];
            if ((this.f21788 || c7879.mo13265()) && ((((i2 = this.f21789) == 0 || i2 == 1) && !c7879.mo13256()) || (((i3 = this.f21789) == 2 || i3 == 3) && !c7879.mo13255()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f21844; i5++) {
            C7879 c78792 = this.f21845[i5];
            if (this.f21788 || c78792.mo13265()) {
                if (!z2) {
                    int i6 = this.f21789;
                    if (i6 == 0) {
                        iMax = c78792.mo13281(ConstraintAnchor$Type.LEFT).m13285();
                    } else if (i6 == 1) {
                        iMax = c78792.mo13281(ConstraintAnchor$Type.RIGHT).m13285();
                    } else if (i6 == 2) {
                        iMax = c78792.mo13281(ConstraintAnchor$Type.TOP).m13285();
                    } else if (i6 == 3) {
                        iMax = c78792.mo13281(ConstraintAnchor$Type.BOTTOM).m13285();
                    }
                    z2 = true;
                }
                int i7 = this.f21789;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c78792.mo13281(ConstraintAnchor$Type.LEFT).m13285());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c78792.mo13281(ConstraintAnchor$Type.RIGHT).m13285());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c78792.mo13281(ConstraintAnchor$Type.TOP).m13285());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c78792.mo13281(ConstraintAnchor$Type.BOTTOM).m13285());
                }
            }
        }
        int i8 = iMax + this.f21787;
        int i9 = this.f21789;
        if (i9 == 0 || i9 == 1) {
            m13259(i8, i8);
        } else {
            m13251(i8, i8);
        }
        this.f21786 = true;
        return true;
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo13255() {
        return this.f21786;
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo13256() {
        return this.f21786;
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo13265() {
        return true;
    }

    @Override // p203.C7879
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo13266(C7911 c7911, boolean z) {
        boolean z2;
        int i;
        int i2;
        C7881[] c7881Arr = this.f21694;
        C7881 c7881 = this.f21710;
        c7881Arr[0] = c7881;
        int i3 = 2;
        C7881 c78812 = this.f21709;
        c7881Arr[2] = c78812;
        C7881 c78813 = this.f21700;
        c7881Arr[1] = c78813;
        C7881 c78814 = this.f21699;
        c7881Arr[3] = c78814;
        for (C7881 c78815 : c7881Arr) {
            c78815.f21768 = c7911.m13391(c78815);
        }
        int i4 = this.f21789;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C7881 c78816 = c7881Arr[i4];
        if (!this.f21786) {
            m13296();
        }
        if (this.f21786) {
            this.f21786 = false;
            int i5 = this.f21789;
            if (i5 == 0 || i5 == 1) {
                c7911.m13378(c7881.f21768, this.f21758);
                c7911.m13378(c78813.f21768, this.f21758);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c7911.m13378(c78812.f21768, this.f21755);
                    c7911.m13378(c78814.f21768, this.f21755);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f21844; i6++) {
            C7879 c7879 = this.f21845[i6];
            if ((this.f21788 || c7879.mo13265()) && ((((i2 = this.f21789) == 0 || i2 == 1) && c7879.f21695[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c7879.f21710.f21760 != null && c7879.f21700.f21760 != null) || ((i2 == 2 || i2 == 3) && c7879.f21695[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c7879.f21709.f21760 != null && c7879.f21699.f21760 != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = c7881.m13290() || c78813.m13290();
        boolean z4 = c78812.m13290() || c78814.m13290();
        int i7 = !(!z2 && (((i = this.f21789) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f21844) {
            C7879 c78792 = this.f21845[i8];
            if (this.f21788 || c78792.mo13265()) {
                C7909 c7909M13391 = c7911.m13391(c78792.f21694[this.f21789]);
                C7881[] c7881Arr2 = c78792.f21694;
                int i9 = this.f21789;
                C7881 c78817 = c7881Arr2[i9];
                c78817.f21768 = c7909M13391;
                C7881 c78818 = c78817.f21760;
                int i10 = (c78818 == null || c78818.f21762 != this) ? 0 : c78817.f21767;
                if (i9 == 0 || i9 == i3) {
                    C7909 c7909 = c78816.f21768;
                    int i11 = this.f21787 - i10;
                    C7912 c7912M13392 = c7911.m13392();
                    C7909 c7909M13384 = c7911.m13384();
                    c7909M13384.f21885 = 0;
                    c7912M13392.m13396(c7909, c7909M13391, c7909M13384, i11);
                    c7911.m13379(c7912M13392);
                } else {
                    C7909 c79092 = c78816.f21768;
                    int i12 = this.f21787 + i10;
                    C7912 c7912M133922 = c7911.m13392();
                    C7909 c7909M133842 = c7911.m13384();
                    c7909M133842.f21885 = 0;
                    c7912M133922.m13397(c79092, c7909M13391, c7909M133842, i12);
                    c7911.m13379(c7912M133922);
                }
                c7911.m13377(c78816.f21768, c7909M13391, this.f21787 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f21789;
        if (i13 == 0) {
            c7911.m13377(c78813.f21768, c7881.f21768, 0, 8);
            c7911.m13377(c7881.f21768, this.f21691.f21700.f21768, 0, 4);
            c7911.m13377(c7881.f21768, this.f21691.f21710.f21768, 0, 0);
            return;
        }
        if (i13 == 1) {
            c7911.m13377(c7881.f21768, c78813.f21768, 0, 8);
            c7911.m13377(c7881.f21768, this.f21691.f21710.f21768, 0, 4);
            c7911.m13377(c7881.f21768, this.f21691.f21700.f21768, 0, 0);
        } else if (i13 == 2) {
            c7911.m13377(c78814.f21768, c78812.f21768, 0, 8);
            c7911.m13377(c78812.f21768, this.f21691.f21699.f21768, 0, 4);
            c7911.m13377(c78812.f21768, this.f21691.f21709.f21768, 0, 0);
        } else if (i13 == 3) {
            c7911.m13377(c78812.f21768, c78814.f21768, 0, 8);
            c7911.m13377(c78812.f21768, this.f21691.f21709.f21768, 0, 4);
            c7911.m13377(c78812.f21768, this.f21691.f21699.f21768, 0, 0);
        }
    }
}
