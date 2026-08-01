package p203;

import androidx.activity.AbstractC0053;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import p206.C7908;
import p206.C7910;
import p206.C7911;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7882 extends AbstractC7885 {

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f21789;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public int f21790;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public boolean f21791;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public int f21792;

    @Override // p203.C7878
    public final String toString() {
        String strM146 = AbstractC0053.m146(new StringBuilder("[Barrier] "), this.f21754, " {");
        for (int i = 0; i < this.f21847; i++) {
            C7878 c7878 = this.f21848[i];
            if (i > 0) {
                strM146 = strM146.concat(", ");
            }
            StringBuilder sbM149 = AbstractC0053.m149(strM146);
            sbM149.append(c7878.f21754);
            strM146 = sbM149.toString();
        }
        return strM146.concat("}");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int m13267() {
        int i = this.f21792;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean m13268() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f21847;
            if (i4 >= i) {
                break;
            }
            C7878 c7878 = this.f21848[i4];
            if ((this.f21791 || c7878.mo13237()) && ((((i2 = this.f21792) == 0 || i2 == 1) && !c7878.mo13228()) || (((i3 = this.f21792) == 2 || i3 == 3) && !c7878.mo13227()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f21847; i5++) {
            C7878 c78782 = this.f21848[i5];
            if (this.f21791 || c78782.mo13237()) {
                if (!z2) {
                    int i6 = this.f21792;
                    if (i6 == 0) {
                        iMax = c78782.mo13253(ConstraintAnchor$Type.LEFT).m13257();
                    } else if (i6 == 1) {
                        iMax = c78782.mo13253(ConstraintAnchor$Type.RIGHT).m13257();
                    } else if (i6 == 2) {
                        iMax = c78782.mo13253(ConstraintAnchor$Type.TOP).m13257();
                    } else if (i6 == 3) {
                        iMax = c78782.mo13253(ConstraintAnchor$Type.BOTTOM).m13257();
                    }
                    z2 = true;
                }
                int i7 = this.f21792;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c78782.mo13253(ConstraintAnchor$Type.LEFT).m13257());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c78782.mo13253(ConstraintAnchor$Type.RIGHT).m13257());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c78782.mo13253(ConstraintAnchor$Type.TOP).m13257());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c78782.mo13253(ConstraintAnchor$Type.BOTTOM).m13257());
                }
            }
        }
        int i8 = iMax + this.f21790;
        int i9 = this.f21792;
        if (i9 == 0 || i9 == 1) {
            m13231(i8, i8);
        } else {
            m13223(i8, i8);
        }
        this.f21789 = true;
        return true;
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo13227() {
        return this.f21789;
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo13228() {
        return this.f21789;
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo13237() {
        return true;
    }

    @Override // p203.C7878
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo13238(C7910 c7910, boolean z) {
        boolean z2;
        int i;
        int i2;
        C7880[] c7880Arr = this.f21697;
        C7880 c7880 = this.f21713;
        c7880Arr[0] = c7880;
        int i3 = 2;
        C7880 c78802 = this.f21712;
        c7880Arr[2] = c78802;
        C7880 c78803 = this.f21703;
        c7880Arr[1] = c78803;
        C7880 c78804 = this.f21702;
        c7880Arr[3] = c78804;
        for (C7880 c78805 : c7880Arr) {
            c78805.f21771 = c7910.m13363(c78805);
        }
        int i4 = this.f21792;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C7880 c78806 = c7880Arr[i4];
        if (!this.f21789) {
            m13268();
        }
        if (this.f21789) {
            this.f21789 = false;
            int i5 = this.f21792;
            if (i5 == 0 || i5 == 1) {
                c7910.m13350(c7880.f21771, this.f21761);
                c7910.m13350(c78803.f21771, this.f21761);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c7910.m13350(c78802.f21771, this.f21758);
                    c7910.m13350(c78804.f21771, this.f21758);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f21847; i6++) {
            C7878 c7878 = this.f21848[i6];
            if ((this.f21791 || c7878.mo13237()) && ((((i2 = this.f21792) == 0 || i2 == 1) && c7878.f21698[0] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c7878.f21713.f21763 != null && c7878.f21703.f21763 != null) || ((i2 == 2 || i2 == 3) && c7878.f21698[1] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c7878.f21712.f21763 != null && c7878.f21702.f21763 != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = c7880.m13262() || c78803.m13262();
        boolean z4 = c78802.m13262() || c78804.m13262();
        int i7 = !(!z2 && (((i = this.f21792) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f21847) {
            C7878 c78782 = this.f21848[i8];
            if (this.f21791 || c78782.mo13237()) {
                C7908 c7908M13363 = c7910.m13363(c78782.f21697[this.f21792]);
                C7880[] c7880Arr2 = c78782.f21697;
                int i9 = this.f21792;
                C7880 c78807 = c7880Arr2[i9];
                c78807.f21771 = c7908M13363;
                C7880 c78808 = c78807.f21763;
                int i10 = (c78808 == null || c78808.f21765 != this) ? 0 : c78807.f21770;
                if (i9 == 0 || i9 == i3) {
                    C7908 c7908 = c78806.f21771;
                    int i11 = this.f21790 - i10;
                    C7911 c7911M13364 = c7910.m13364();
                    C7908 c7908M13356 = c7910.m13356();
                    c7908M13356.f21888 = 0;
                    c7911M13364.m13368(c7908, c7908M13363, c7908M13356, i11);
                    c7910.m13351(c7911M13364);
                } else {
                    C7908 c79082 = c78806.f21771;
                    int i12 = this.f21790 + i10;
                    C7911 c7911M133642 = c7910.m13364();
                    C7908 c7908M133562 = c7910.m13356();
                    c7908M133562.f21888 = 0;
                    c7911M133642.m13369(c79082, c7908M13363, c7908M133562, i12);
                    c7910.m13351(c7911M133642);
                }
                c7910.m13349(c78806.f21771, c7908M13363, this.f21790 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f21792;
        if (i13 == 0) {
            c7910.m13349(c78803.f21771, c7880.f21771, 0, 8);
            c7910.m13349(c7880.f21771, this.f21694.f21703.f21771, 0, 4);
            c7910.m13349(c7880.f21771, this.f21694.f21713.f21771, 0, 0);
            return;
        }
        if (i13 == 1) {
            c7910.m13349(c7880.f21771, c78803.f21771, 0, 8);
            c7910.m13349(c7880.f21771, this.f21694.f21713.f21771, 0, 4);
            c7910.m13349(c7880.f21771, this.f21694.f21703.f21771, 0, 0);
        } else if (i13 == 2) {
            c7910.m13349(c78804.f21771, c78802.f21771, 0, 8);
            c7910.m13349(c78802.f21771, this.f21694.f21702.f21771, 0, 4);
            c7910.m13349(c78802.f21771, this.f21694.f21712.f21771, 0, 0);
        } else if (i13 == 3) {
            c7910.m13349(c78802.f21771, c78804.f21771, 0, 8);
            c7910.m13349(c78802.f21771, this.f21694.f21712.f21771, 0, 4);
            c7910.m13349(c78802.f21771, this.f21694.f21702.f21771, 0, 0);
        }
    }
}
