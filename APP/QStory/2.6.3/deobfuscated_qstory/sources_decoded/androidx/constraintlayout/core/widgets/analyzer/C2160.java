package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p203.AbstractC7886;
import p203.C7879;
import p203.C7881;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2160 extends AbstractC2154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int[] f6378 = new int[2];

    public C2160(C7879 c7879) {
        super(c7879);
        this.f6363.f6322 = DependencyNode$Type.LEFT;
        this.f6365.f6322 = DependencyNode$Type.RIGHT;
        this.f6357 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m3917(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public final String toString() {
        return "HorizontalRun " + this.f6361.f21751;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3889() {
        this.f6360 = null;
        this.f6363.m3879();
        this.f6365.m3879();
        this.f6358.m3879();
        this.f6364 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3890() {
        C2145 c2145 = this.f6363;
        if (c2145.f6332) {
            this.f6361.f21758 = c2145.f6328;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3891() {
        C7879 c7879;
        C7879 c78792;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        C7879 c78793;
        C7879 c78794;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        C7879 c78795 = this.f6361;
        boolean z = c78795.f21720;
        C2158 c2158 = this.f6358;
        if (z) {
            c2158.mo3878(c78795.m13275());
        }
        boolean z2 = c2158.f6332;
        ArrayList arrayList = c2158.f6329;
        ArrayList arrayList2 = c2158.f6330;
        C2145 c2145 = this.f6365;
        C2145 c21452 = this.f6363;
        if (z2) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = this.f6359;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
            if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && (c78792 = (c7879 = this.f6361).f21691) != null && ((constraintWidget$DimensionBehaviour = c78792.f21695[0]) == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4)) {
                AbstractC2154.m3898(c21452, c78792.f21717.f6363, c7879.f21710.m13284());
                AbstractC2154.m3898(c2145, c78792.f21717.f6365, -this.f6361.f21700.m13284());
                return;
            }
        } else {
            C7879 c78796 = this.f6361;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = c78796.f21695[0];
            this.f6359 = constraintWidget$DimensionBehaviour5;
            if (constraintWidget$DimensionBehaviour5 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
                if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour6 && (c78794 = c78796.f21691) != null && ((constraintWidget$DimensionBehaviour2 = c78794.f21695[0]) == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour6)) {
                    int iM13275 = (c78794.m13275() - this.f6361.f21710.m13284()) - this.f6361.f21700.m13284();
                    AbstractC2154.m3898(c21452, c78794.f21717.f6363, this.f6361.f21710.m13284());
                    AbstractC2154.m3898(c2145, c78794.f21717.f6365, -this.f6361.f21700.m13284());
                    c2158.mo3878(iM13275);
                    return;
                }
                if (constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.FIXED) {
                    c2158.mo3878(c78796.m13275());
                }
            }
        }
        if (c2158.f6332) {
            C7879 c78797 = this.f6361;
            if (c78797.f21720) {
                C7881[] c7881Arr = c78797.f21694;
                C7881 c7881 = c7881Arr[0];
                C7881 c78812 = c7881.f21760;
                if (c78812 != null && c7881Arr[1].f21760 != null) {
                    boolean zM13271 = c78797.m13271();
                    C7879 c78798 = this.f6361;
                    if (zM13271) {
                        c21452.f6321 = c78798.f21694[0].m13284();
                        c2145.f6321 = -this.f6361.f21694[1].m13284();
                        return;
                    }
                    C2145 c2145M3899 = AbstractC2154.m3899(c78798.f21694[0]);
                    if (c2145M3899 != null) {
                        AbstractC2154.m3898(c21452, c2145M3899, this.f6361.f21694[0].m13284());
                    }
                    C2145 c2145M38992 = AbstractC2154.m3899(this.f6361.f21694[1]);
                    if (c2145M38992 != null) {
                        AbstractC2154.m3898(c2145, c2145M38992, -this.f6361.f21694[1].m13284());
                    }
                    c21452.f6325 = true;
                    c2145.f6325 = true;
                    return;
                }
                if (c78812 != null) {
                    C2145 c2145M38993 = AbstractC2154.m3899(c7881);
                    if (c2145M38993 != null) {
                        AbstractC2154.m3898(c21452, c2145M38993, this.f6361.f21694[0].m13284());
                        AbstractC2154.m3898(c2145, c21452, c2158.f6328);
                        return;
                    }
                    return;
                }
                C7881 c78813 = c7881Arr[1];
                if (c78813.f21760 != null) {
                    C2145 c2145M38994 = AbstractC2154.m3899(c78813);
                    if (c2145M38994 != null) {
                        AbstractC2154.m3898(c2145, c2145M38994, -this.f6361.f21694[1].m13284());
                        AbstractC2154.m3898(c21452, c2145, -c2158.f6328);
                        return;
                    }
                    return;
                }
                if ((c78797 instanceof AbstractC7886) || c78797.f21691 == null || c78797.mo13281(ConstraintAnchor$Type.CENTER).f21760 != null) {
                    return;
                }
                C7879 c78799 = this.f6361;
                AbstractC2154.m3898(c21452, c78799.f21691.f21717.f6363, c78799.m13276());
                AbstractC2154.m3898(c2145, c21452, c2158.f6328);
                return;
            }
        }
        if (this.f6359 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            C7879 c787910 = this.f6361;
            int i = c787910.f21730;
            if (i == 2) {
                C7879 c787911 = c787910.f21691;
                if (c787911 != null) {
                    C2158 c21582 = c787911.f21716.f6358;
                    arrayList2.add(c21582);
                    c21582.f6329.add(c2158);
                    c2158.f6325 = true;
                    arrayList.add(c21452);
                    arrayList.add(c2145);
                }
            } else if (i == 3) {
                if (c787910.f21722 == 3) {
                    c21452.f6326 = this;
                    c2145.f6326 = this;
                    C2155 c2155 = c787910.f21716;
                    c2155.f6363.f6326 = this;
                    c2155.f6365.f6326 = this;
                    c2158.f6326 = this;
                    if (c787910.m13258()) {
                        arrayList2.add(this.f6361.f21716.f6358);
                        this.f6361.f21716.f6358.f6329.add(c2158);
                        C2155 c21552 = this.f6361.f21716;
                        c21552.f6358.f6326 = this;
                        arrayList2.add(c21552.f6363);
                        arrayList2.add(this.f6361.f21716.f6365);
                        this.f6361.f21716.f6363.f6329.add(c2158);
                        this.f6361.f21716.f6365.f6329.add(c2158);
                    } else {
                        boolean zM132712 = this.f6361.m13271();
                        C7879 c787912 = this.f6361;
                        if (zM132712) {
                            c787912.f21716.f6358.f6330.add(c2158);
                            arrayList.add(this.f6361.f21716.f6358);
                        } else {
                            c787912.f21716.f6358.f6330.add(c2158);
                        }
                    }
                } else {
                    C2158 c21583 = c787910.f21716.f6358;
                    arrayList2.add(c21583);
                    c21583.f6329.add(c2158);
                    this.f6361.f21716.f6363.f6329.add(c2158);
                    this.f6361.f21716.f6365.f6329.add(c2158);
                    c2158.f6325 = true;
                    arrayList.add(c21452);
                    arrayList.add(c2145);
                    c21452.f6330.add(c2158);
                    c2145.f6330.add(c2158);
                }
            }
        }
        C7879 c787913 = this.f6361;
        C7881[] c7881Arr2 = c787913.f21694;
        C7881 c78814 = c7881Arr2[0];
        C7881 c78815 = c78814.f21760;
        if (c78815 != null && c7881Arr2[1].f21760 != null) {
            boolean zM132713 = c787913.m13271();
            C7879 c787914 = this.f6361;
            if (zM132713) {
                c21452.f6321 = c787914.f21694[0].m13284();
                c2145.f6321 = -this.f6361.f21694[1].m13284();
                return;
            }
            C2145 c2145M38995 = AbstractC2154.m3899(c787914.f21694[0]);
            C2145 c2145M38996 = AbstractC2154.m3899(this.f6361.f21694[1]);
            if (c2145M38995 != null) {
                c2145M38995.m3880(this);
            }
            if (c2145M38996 != null) {
                c2145M38996.m3880(this);
            }
            this.f6366 = WidgetRun$RunType.CENTER;
            return;
        }
        if (c78815 != null) {
            C2145 c2145M38997 = AbstractC2154.m3899(c78814);
            if (c2145M38997 != null) {
                AbstractC2154.m3898(c21452, c2145M38997, this.f6361.f21694[0].m13284());
                m3901(c2145, c21452, 1, c2158);
                return;
            }
            return;
        }
        C7881 c78816 = c7881Arr2[1];
        if (c78816.f21760 != null) {
            C2145 c2145M38998 = AbstractC2154.m3899(c78816);
            if (c2145M38998 != null) {
                AbstractC2154.m3898(c2145, c2145M38998, -this.f6361.f21694[1].m13284());
                m3901(c21452, c2145, -1, c2158);
                return;
            }
            return;
        }
        if ((c787913 instanceof AbstractC7886) || (c78793 = c787913.f21691) == null) {
            return;
        }
        AbstractC2154.m3898(c21452, c78793.f21717.f6363, c787913.m13276());
        m3901(c2145, c21452, 1, c2158);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3881(androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147 r23) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C2160.mo3881(androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世哲兰苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3918() {
        this.f6364 = false;
        C2145 c2145 = this.f6363;
        c2145.m3879();
        c2145.f6332 = false;
        C2145 c21452 = this.f6365;
        c21452.m3879();
        c21452.f6332 = false;
        this.f6358.f6332 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo3894() {
        return this.f6359 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || this.f6361.f21730 == 0;
    }
}
