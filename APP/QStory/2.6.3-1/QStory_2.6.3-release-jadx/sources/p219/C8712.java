package p219;

import androidx.activity.AbstractC0900;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import p222.C8738;
import p222.C8740;
import p222.C8741;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8712 extends AbstractC8715 {

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f22131;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public int f22132;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public boolean f22133;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public int f22134;

    @Override // p219.C8708
    public final String toString() {
        String strM711 = AbstractC0900.m711(new StringBuilder("[Barrier] "), this.f22096, " {");
        for (int i = 0; i < this.f22189; i++) {
            C8708 c8708 = this.f22190[i];
            if (i > 0) {
                strM711 = strM711.concat(", ");
            }
            StringBuilder sbM700 = AbstractC0900.m700(strM711);
            sbM700.append(c8708.f22096);
            strM711 = sbM700.toString();
        }
        return strM711.concat("}");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int m13854() {
        int i = this.f22134;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean m13855() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f22189;
            if (i4 >= i) {
                break;
            }
            C8708 c8708 = this.f22190[i4];
            if ((this.f22133 || c8708.mo13824()) && ((((i2 = this.f22134) == 0 || i2 == 1) && !c8708.mo13815()) || (((i3 = this.f22134) == 2 || i3 == 3) && !c8708.mo13814()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f22189; i5++) {
            C8708 c87082 = this.f22190[i5];
            if (this.f22133 || c87082.mo13824()) {
                if (!z2) {
                    int i6 = this.f22134;
                    if (i6 == 0) {
                        iMax = c87082.mo13840(ConstraintAnchor$Type.LEFT).m13844();
                    } else if (i6 == 1) {
                        iMax = c87082.mo13840(ConstraintAnchor$Type.RIGHT).m13844();
                    } else if (i6 == 2) {
                        iMax = c87082.mo13840(ConstraintAnchor$Type.TOP).m13844();
                    } else if (i6 == 3) {
                        iMax = c87082.mo13840(ConstraintAnchor$Type.BOTTOM).m13844();
                    }
                    z2 = true;
                }
                int i7 = this.f22134;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c87082.mo13840(ConstraintAnchor$Type.LEFT).m13844());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c87082.mo13840(ConstraintAnchor$Type.RIGHT).m13844());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c87082.mo13840(ConstraintAnchor$Type.TOP).m13844());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c87082.mo13840(ConstraintAnchor$Type.BOTTOM).m13844());
                }
            }
        }
        int i8 = iMax + this.f22132;
        int i9 = this.f22134;
        if (i9 == 0 || i9 == 1) {
            m13818(i8, i8);
        } else {
            m13810(i8, i8);
        }
        this.f22131 = true;
        return true;
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo13814() {
        return this.f22131;
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo13815() {
        return this.f22131;
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo13824() {
        return true;
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo13825(C8740 c8740, boolean z) {
        boolean z2;
        int i;
        int i2;
        C8710[] c8710Arr = this.f22039;
        C8710 c8710 = this.f22055;
        c8710Arr[0] = c8710;
        int i3 = 2;
        C8710 c87102 = this.f22054;
        c8710Arr[2] = c87102;
        C8710 c87103 = this.f22045;
        c8710Arr[1] = c87103;
        C8710 c87104 = this.f22044;
        c8710Arr[3] = c87104;
        for (C8710 c87105 : c8710Arr) {
            c87105.f22113 = c8740.m13950(c87105);
        }
        int i4 = this.f22134;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C8710 c87106 = c8710Arr[i4];
        if (!this.f22131) {
            m13855();
        }
        if (this.f22131) {
            this.f22131 = false;
            int i5 = this.f22134;
            if (i5 == 0 || i5 == 1) {
                c8740.m13937(c8710.f22113, this.f22103);
                c8740.m13937(c87103.f22113, this.f22103);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c8740.m13937(c87102.f22113, this.f22100);
                    c8740.m13937(c87104.f22113, this.f22100);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f22189; i6++) {
            C8708 c8708 = this.f22190[i6];
            if ((this.f22133 || c8708.mo13824()) && ((((i2 = this.f22134) == 0 || i2 == 1) && c8708.f22040[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c8708.f22055.f22105 != null && c8708.f22045.f22105 != null) || ((i2 == 2 || i2 == 3) && c8708.f22040[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c8708.f22054.f22105 != null && c8708.f22044.f22105 != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = c8710.m13849() || c87103.m13849();
        boolean z4 = c87102.m13849() || c87104.m13849();
        int i7 = !(!z2 && (((i = this.f22134) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f22189) {
            C8708 c87082 = this.f22190[i8];
            if (this.f22133 || c87082.mo13824()) {
                C8738 c8738M13950 = c8740.m13950(c87082.f22039[this.f22134]);
                C8710[] c8710Arr2 = c87082.f22039;
                int i9 = this.f22134;
                C8710 c87107 = c8710Arr2[i9];
                c87107.f22113 = c8738M13950;
                C8710 c87108 = c87107.f22105;
                int i10 = (c87108 == null || c87108.f22107 != this) ? 0 : c87107.f22112;
                if (i9 == 0 || i9 == i3) {
                    C8738 c8738 = c87106.f22113;
                    int i11 = this.f22132 - i10;
                    C8741 c8741M13951 = c8740.m13951();
                    C8738 c8738M13943 = c8740.m13943();
                    c8738M13943.f22230 = 0;
                    c8741M13951.m13955(c8738, c8738M13950, c8738M13943, i11);
                    c8740.m13938(c8741M13951);
                } else {
                    C8738 c87382 = c87106.f22113;
                    int i12 = this.f22132 + i10;
                    C8741 c8741M139512 = c8740.m13951();
                    C8738 c8738M139432 = c8740.m13943();
                    c8738M139432.f22230 = 0;
                    c8741M139512.m13956(c87382, c8738M13950, c8738M139432, i12);
                    c8740.m13938(c8741M139512);
                }
                c8740.m13936(c87106.f22113, c8738M13950, this.f22132 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f22134;
        if (i13 == 0) {
            c8740.m13936(c87103.f22113, c8710.f22113, 0, 8);
            c8740.m13936(c8710.f22113, this.f22036.f22045.f22113, 0, 4);
            c8740.m13936(c8710.f22113, this.f22036.f22055.f22113, 0, 0);
            return;
        }
        if (i13 == 1) {
            c8740.m13936(c8710.f22113, c87103.f22113, 0, 8);
            c8740.m13936(c8710.f22113, this.f22036.f22055.f22113, 0, 4);
            c8740.m13936(c8710.f22113, this.f22036.f22045.f22113, 0, 0);
        } else if (i13 == 2) {
            c8740.m13936(c87104.f22113, c87102.f22113, 0, 8);
            c8740.m13936(c87102.f22113, this.f22036.f22044.f22113, 0, 4);
            c8740.m13936(c87102.f22113, this.f22036.f22054.f22113, 0, 0);
        } else if (i13 == 3) {
            c8740.m13936(c87102.f22113, c87104.f22113, 0, 8);
            c8740.m13936(c87102.f22113, this.f22036.f22054.f22113, 0, 4);
            c8740.m13936(c87102.f22113, this.f22036.f22044.f22113, 0, 0);
        }
    }
}
