package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p203.AbstractC7886;
import p203.C7879;
import p203.C7881;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2155 extends AbstractC2154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C2145 f6367;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C2150 f6368;

    public C2155(C7879 c7879) {
        super(c7879);
        C2145 c2145 = new C2145(this);
        this.f6367 = c2145;
        this.f6368 = null;
        this.f6363.f6322 = DependencyNode$Type.TOP;
        this.f6365.f6322 = DependencyNode$Type.BOTTOM;
        c2145.f6322 = DependencyNode$Type.BASELINE;
        this.f6357 = 1;
    }

    public final String toString() {
        return "VerticalRun " + this.f6361.f21751;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3889() {
        this.f6360 = null;
        this.f6363.m3879();
        this.f6365.m3879();
        this.f6367.m3879();
        this.f6358.m3879();
        this.f6364 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3890() {
        C2145 c2145 = this.f6363;
        if (c2145.f6332) {
            this.f6361.f21755 = c2145.f6328;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3891() {
        C7879 c7879;
        C7879 c78792;
        C7879 c78793;
        C7879 c78794;
        C7879 c78795 = this.f6361;
        boolean z = c78795.f21720;
        C2158 c2158 = this.f6358;
        if (z) {
            c2158.mo3878(c78795.m13279());
        }
        boolean z2 = c2158.f6332;
        ArrayList arrayList = c2158.f6329;
        ArrayList arrayList2 = c2158.f6330;
        C2145 c2145 = this.f6365;
        C2145 c21452 = this.f6363;
        if (!z2) {
            C7879 c78796 = this.f6361;
            this.f6359 = c78796.f21695[1];
            if (c78796.f21714) {
                this.f6368 = new C2150(this);
            }
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = this.f6359;
            if (constraintWidget$DimensionBehaviour != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                if (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && (c78794 = this.f6361.f21691) != null && c78794.f21695[1] == ConstraintWidget$DimensionBehaviour.FIXED) {
                    int iM13279 = (c78794.m13279() - this.f6361.f21709.m13284()) - this.f6361.f21699.m13284();
                    AbstractC2154.m3898(c21452, c78794.f21716.f6363, this.f6361.f21709.m13284());
                    AbstractC2154.m3898(c2145, c78794.f21716.f6365, -this.f6361.f21699.m13284());
                    c2158.mo3878(iM13279);
                    return;
                }
                if (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.FIXED) {
                    c2158.mo3878(this.f6361.m13279());
                }
            }
        } else if (this.f6359 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && (c78792 = (c7879 = this.f6361).f21691) != null && c78792.f21695[1] == ConstraintWidget$DimensionBehaviour.FIXED) {
            AbstractC2154.m3898(c21452, c78792.f21716.f6363, c7879.f21709.m13284());
            AbstractC2154.m3898(c2145, c78792.f21716.f6365, -this.f6361.f21699.m13284());
            return;
        }
        boolean z3 = c2158.f6332;
        C2145 c21453 = this.f6367;
        if (z3) {
            C7879 c78797 = this.f6361;
            if (c78797.f21720) {
                C7881[] c7881Arr = c78797.f21694;
                C7881 c7881 = c7881Arr[2];
                C7881 c78812 = c7881.f21760;
                if (c78812 != null && c7881Arr[3].f21760 != null) {
                    boolean zM13258 = c78797.m13258();
                    C7879 c78798 = this.f6361;
                    if (zM13258) {
                        c21452.f6321 = c78798.f21694[2].m13284();
                        c2145.f6321 = -this.f6361.f21694[3].m13284();
                    } else {
                        C2145 c2145M3899 = AbstractC2154.m3899(c78798.f21694[2]);
                        if (c2145M3899 != null) {
                            AbstractC2154.m3898(c21452, c2145M3899, this.f6361.f21694[2].m13284());
                        }
                        C2145 c2145M38992 = AbstractC2154.m3899(this.f6361.f21694[3]);
                        if (c2145M38992 != null) {
                            AbstractC2154.m3898(c2145, c2145M38992, -this.f6361.f21694[3].m13284());
                        }
                        c21452.f6325 = true;
                        c2145.f6325 = true;
                    }
                    C7879 c78799 = this.f6361;
                    if (c78799.f21714) {
                        AbstractC2154.m3898(c21453, c21452, c78799.f21756);
                        return;
                    }
                    return;
                }
                if (c78812 != null) {
                    C2145 c2145M38993 = AbstractC2154.m3899(c7881);
                    if (c2145M38993 != null) {
                        AbstractC2154.m3898(c21452, c2145M38993, this.f6361.f21694[2].m13284());
                        AbstractC2154.m3898(c2145, c21452, c2158.f6328);
                        C7879 c787910 = this.f6361;
                        if (c787910.f21714) {
                            AbstractC2154.m3898(c21453, c21452, c787910.f21756);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C7881 c78813 = c7881Arr[3];
                if (c78813.f21760 != null) {
                    C2145 c2145M38994 = AbstractC2154.m3899(c78813);
                    if (c2145M38994 != null) {
                        AbstractC2154.m3898(c2145, c2145M38994, -this.f6361.f21694[3].m13284());
                        AbstractC2154.m3898(c21452, c2145, -c2158.f6328);
                    }
                    C7879 c787911 = this.f6361;
                    if (c787911.f21714) {
                        AbstractC2154.m3898(c21453, c21452, c787911.f21756);
                        return;
                    }
                    return;
                }
                C7881 c78814 = c7881Arr[4];
                if (c78814.f21760 != null) {
                    C2145 c2145M38995 = AbstractC2154.m3899(c78814);
                    if (c2145M38995 != null) {
                        AbstractC2154.m3898(c21453, c2145M38995, 0);
                        AbstractC2154.m3898(c21452, c21453, -this.f6361.f21756);
                        AbstractC2154.m3898(c2145, c21452, c2158.f6328);
                        return;
                    }
                    return;
                }
                if ((c78797 instanceof AbstractC7886) || c78797.f21691 == null || c78797.mo13281(ConstraintAnchor$Type.CENTER).f21760 != null) {
                    return;
                }
                C7879 c787912 = this.f6361;
                AbstractC2154.m3898(c21452, c787912.f21691.f21716.f6363, c787912.m13269());
                AbstractC2154.m3898(c2145, c21452, c2158.f6328);
                C7879 c787913 = this.f6361;
                if (c787913.f21714) {
                    AbstractC2154.m3898(c21453, c21452, c787913.f21756);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f6359 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            c2158.m3880(this);
        } else {
            C7879 c787914 = this.f6361;
            int i = c787914.f21722;
            if (i == 2) {
                C7879 c787915 = c787914.f21691;
                if (c787915 != null) {
                    C2158 c21582 = c787915.f21716.f6358;
                    arrayList2.add(c21582);
                    c21582.f6329.add(c2158);
                    c2158.f6325 = true;
                    arrayList.add(c21452);
                    arrayList.add(c2145);
                }
            } else if (i == 3 && !c787914.m13258()) {
                C7879 c787916 = this.f6361;
                if (c787916.f21730 != 3) {
                    C2158 c21583 = c787916.f21717.f6358;
                    arrayList2.add(c21583);
                    c21583.f6329.add(c2158);
                    c2158.f6325 = true;
                    arrayList.add(c21452);
                    arrayList.add(c2145);
                }
            }
        }
        C7879 c787917 = this.f6361;
        C7881[] c7881Arr2 = c787917.f21694;
        C7881 c78815 = c7881Arr2[2];
        C7881 c78816 = c78815.f21760;
        if (c78816 != null && c7881Arr2[3].f21760 != null) {
            boolean zM132582 = c787917.m13258();
            C7879 c787918 = this.f6361;
            if (zM132582) {
                c21452.f6321 = c787918.f21694[2].m13284();
                c2145.f6321 = -this.f6361.f21694[3].m13284();
            } else {
                C2145 c2145M38996 = AbstractC2154.m3899(c787918.f21694[2]);
                C2145 c2145M38997 = AbstractC2154.m3899(this.f6361.f21694[3]);
                if (c2145M38996 != null) {
                    c2145M38996.m3880(this);
                }
                if (c2145M38997 != null) {
                    c2145M38997.m3880(this);
                }
                this.f6366 = WidgetRun$RunType.CENTER;
            }
            if (this.f6361.f21714) {
                m3901(c21453, c21452, 1, this.f6368);
            }
        } else if (c78816 != null) {
            C2145 c2145M38998 = AbstractC2154.m3899(c78815);
            if (c2145M38998 != null) {
                AbstractC2154.m3898(c21452, c2145M38998, this.f6361.f21694[2].m13284());
                m3901(c2145, c21452, 1, c2158);
                if (this.f6361.f21714) {
                    m3901(c21453, c21452, 1, this.f6368);
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = this.f6359;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                    C7879 c787919 = this.f6361;
                    if (c787919.f21753 > 0.0f) {
                        C2160 c2160 = c787919.f21717;
                        if (c2160.f6359 == constraintWidget$DimensionBehaviour3) {
                            c2160.f6358.f6329.add(c2158);
                            arrayList2.add(this.f6361.f21717.f6358);
                            c2158.f6326 = this;
                        }
                    }
                }
            }
        } else {
            C7881 c78817 = c7881Arr2[3];
            if (c78817.f21760 != null) {
                C2145 c2145M38999 = AbstractC2154.m3899(c78817);
                if (c2145M38999 != null) {
                    AbstractC2154.m3898(c2145, c2145M38999, -this.f6361.f21694[3].m13284());
                    m3901(c21452, c2145, -1, c2158);
                    if (this.f6361.f21714) {
                        m3901(c21453, c21452, 1, this.f6368);
                    }
                }
            } else {
                C7881 c78818 = c7881Arr2[4];
                if (c78818.f21760 != null) {
                    C2145 c2145M389910 = AbstractC2154.m3899(c78818);
                    if (c2145M389910 != null) {
                        AbstractC2154.m3898(c21453, c2145M389910, 0);
                        m3901(c21452, c21453, -1, this.f6368);
                        m3901(c2145, c21452, 1, c2158);
                    }
                } else if (!(c787917 instanceof AbstractC7886) && (c78793 = c787917.f21691) != null) {
                    AbstractC2154.m3898(c21452, c78793.f21716.f6363, c787917.m13269());
                    m3901(c2145, c21452, 1, c2158);
                    if (this.f6361.f21714) {
                        m3901(c21453, c21452, 1, this.f6368);
                    }
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = this.f6359;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour5) {
                        C7879 c787920 = this.f6361;
                        if (c787920.f21753 > 0.0f) {
                            C2160 c21602 = c787920.f21717;
                            if (c21602.f6359 == constraintWidget$DimensionBehaviour5) {
                                c21602.f6358.f6329.add(c2158);
                                arrayList2.add(this.f6361.f21717.f6358);
                                c2158.f6326 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c2158.f6324 = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3881(InterfaceC2147 interfaceC2147) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC2151.f6353[this.f6366.ordinal()] == 3) {
            C7879 c7879 = this.f6361;
            m3903(c7879.f21709, c7879.f21699, 1);
            return;
        }
        C2158 c2158 = this.f6358;
        if (c2158.f6324 && !c2158.f6332 && this.f6359 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            C7879 c78792 = this.f6361;
            int i2 = c78792.f21722;
            if (i2 == 2) {
                C7879 c78793 = c78792.f21691;
                if (c78793 != null) {
                    if (c78793.f21716.f6358.f6332) {
                        c2158.mo3878((int) ((r1.f6328 * c78792.f21707) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C2158 c21582 = c78792.f21717.f6358;
                if (c21582.f6332) {
                    int i3 = c78792.f21757;
                    if (i3 == -1) {
                        f = c21582.f6328;
                        f2 = c78792.f21753;
                    } else if (i3 == 0) {
                        f3 = c21582.f6328 * c78792.f21753;
                        i = (int) (f3 + 0.5f);
                        c2158.mo3878(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c2158.mo3878(i);
                    } else {
                        f = c21582.f6328;
                        f2 = c78792.f21753;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c2158.mo3878(i);
                }
            }
        }
        C2145 c2145 = this.f6363;
        boolean z = c2145.f6324;
        ArrayList arrayList = c2145.f6330;
        if (z) {
            C2145 c21452 = this.f6365;
            boolean z2 = c21452.f6324;
            ArrayList arrayList2 = c21452.f6330;
            if (z2) {
                if (c2145.f6332 && c21452.f6332 && c2158.f6332) {
                    return;
                }
                if (!c2158.f6332 && this.f6359 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    C7879 c78794 = this.f6361;
                    if (c78794.f21730 == 0 && !c78794.m13258()) {
                        C2145 c21453 = (C2145) arrayList.get(0);
                        C2145 c21454 = (C2145) arrayList2.get(0);
                        int i4 = c21453.f6328 + c2145.f6321;
                        int i5 = c21454.f6328 + c21452.f6321;
                        c2145.mo3878(i4);
                        c21452.mo3878(i5);
                        c2158.mo3878(i5 - i4);
                        return;
                    }
                }
                if (!c2158.f6332 && this.f6359 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && this.f6362 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2145 c21455 = (C2145) arrayList.get(0);
                    int i6 = (((C2145) arrayList2.get(0)).f6328 + c21452.f6321) - (c21455.f6328 + c2145.f6321);
                    int i7 = c2158.f6376;
                    if (i6 < i7) {
                        c2158.mo3878(i6);
                    } else {
                        c2158.mo3878(i7);
                    }
                }
                if (c2158.f6332 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2145 c21456 = (C2145) arrayList.get(0);
                    C2145 c21457 = (C2145) arrayList2.get(0);
                    int i8 = c21456.f6328;
                    int i9 = c2145.f6321 + i8;
                    int i10 = c21457.f6328;
                    int i11 = c21452.f6321 + i10;
                    float f4 = this.f6361.f21741;
                    if (c21456 == c21457) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c2145.mo3878((int) ((((i10 - i8) - c2158.f6328) * f4) + i8 + 0.5f));
                    c21452.mo3878(c2145.f6328 + c2158.f6328);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3904() {
        this.f6364 = false;
        C2145 c2145 = this.f6363;
        c2145.m3879();
        c2145.f6332 = false;
        C2145 c21452 = this.f6365;
        c21452.m3879();
        c21452.f6332 = false;
        C2145 c21453 = this.f6367;
        c21453.m3879();
        c21453.f6332 = false;
        this.f6358.f6332 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo3894() {
        return this.f6359 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || this.f6361.f21722 == 0;
    }
}
