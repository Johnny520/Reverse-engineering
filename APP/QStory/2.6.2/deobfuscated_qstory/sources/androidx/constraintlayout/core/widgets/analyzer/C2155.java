package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p203.AbstractC7885;
import p203.C7878;
import p203.C7880;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2155 extends AbstractC2154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C2145 f6366;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C2150 f6367;

    public C2155(C7878 c7878) {
        super(c7878);
        C2145 c2145 = new C2145(this);
        this.f6366 = c2145;
        this.f6367 = null;
        this.f6362.f6321 = DependencyNode$Type.TOP;
        this.f6364.f6321 = DependencyNode$Type.BOTTOM;
        c2145.f6321 = DependencyNode$Type.BASELINE;
        this.f6356 = 1;
    }

    public final String toString() {
        return "VerticalRun " + this.f6360.f21754;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3879() {
        this.f6359 = null;
        this.f6362.m3869();
        this.f6364.m3869();
        this.f6366.m3869();
        this.f6357.m3869();
        this.f6363 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3880() {
        C2145 c2145 = this.f6362;
        if (c2145.f6331) {
            this.f6360.f21758 = c2145.f6327;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3881() {
        C7878 c7878;
        C7878 c78782;
        C7878 c78783;
        C7878 c78784;
        C7878 c78785 = this.f6360;
        boolean z = c78785.f21723;
        C2158 c2158 = this.f6357;
        if (z) {
            c2158.mo3868(c78785.m13251());
        }
        boolean z2 = c2158.f6331;
        ArrayList arrayList = c2158.f6328;
        ArrayList arrayList2 = c2158.f6329;
        C2145 c2145 = this.f6364;
        C2145 c21452 = this.f6362;
        if (!z2) {
            C7878 c78786 = this.f6360;
            this.f6358 = c78786.f21698[1];
            if (c78786.f21717) {
                this.f6367 = new C2150(this);
            }
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = this.f6358;
            if (constraintWidget$DimensionBehaviour != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                if (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && (c78784 = this.f6360.f21694) != null && c78784.f21698[1] == ConstraintWidget$DimensionBehaviour.FIXED) {
                    int iM13251 = (c78784.m13251() - this.f6360.f21712.m13256()) - this.f6360.f21702.m13256();
                    AbstractC2154.m3888(c21452, c78784.f21719.f6362, this.f6360.f21712.m13256());
                    AbstractC2154.m3888(c2145, c78784.f21719.f6364, -this.f6360.f21702.m13256());
                    c2158.mo3868(iM13251);
                    return;
                }
                if (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.FIXED) {
                    c2158.mo3868(this.f6360.m13251());
                }
            }
        } else if (this.f6358 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && (c78782 = (c7878 = this.f6360).f21694) != null && c78782.f21698[1] == ConstraintWidget$DimensionBehaviour.FIXED) {
            AbstractC2154.m3888(c21452, c78782.f21719.f6362, c7878.f21712.m13256());
            AbstractC2154.m3888(c2145, c78782.f21719.f6364, -this.f6360.f21702.m13256());
            return;
        }
        boolean z3 = c2158.f6331;
        C2145 c21453 = this.f6366;
        if (z3) {
            C7878 c78787 = this.f6360;
            if (c78787.f21723) {
                C7880[] c7880Arr = c78787.f21697;
                C7880 c7880 = c7880Arr[2];
                C7880 c78802 = c7880.f21763;
                if (c78802 != null && c7880Arr[3].f21763 != null) {
                    boolean zM13230 = c78787.m13230();
                    C7878 c78788 = this.f6360;
                    if (zM13230) {
                        c21452.f6320 = c78788.f21697[2].m13256();
                        c2145.f6320 = -this.f6360.f21697[3].m13256();
                    } else {
                        C2145 c2145M3889 = AbstractC2154.m3889(c78788.f21697[2]);
                        if (c2145M3889 != null) {
                            AbstractC2154.m3888(c21452, c2145M3889, this.f6360.f21697[2].m13256());
                        }
                        C2145 c2145M38892 = AbstractC2154.m3889(this.f6360.f21697[3]);
                        if (c2145M38892 != null) {
                            AbstractC2154.m3888(c2145, c2145M38892, -this.f6360.f21697[3].m13256());
                        }
                        c21452.f6324 = true;
                        c2145.f6324 = true;
                    }
                    C7878 c78789 = this.f6360;
                    if (c78789.f21717) {
                        AbstractC2154.m3888(c21453, c21452, c78789.f21759);
                        return;
                    }
                    return;
                }
                if (c78802 != null) {
                    C2145 c2145M38893 = AbstractC2154.m3889(c7880);
                    if (c2145M38893 != null) {
                        AbstractC2154.m3888(c21452, c2145M38893, this.f6360.f21697[2].m13256());
                        AbstractC2154.m3888(c2145, c21452, c2158.f6327);
                        C7878 c787810 = this.f6360;
                        if (c787810.f21717) {
                            AbstractC2154.m3888(c21453, c21452, c787810.f21759);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C7880 c78803 = c7880Arr[3];
                if (c78803.f21763 != null) {
                    C2145 c2145M38894 = AbstractC2154.m3889(c78803);
                    if (c2145M38894 != null) {
                        AbstractC2154.m3888(c2145, c2145M38894, -this.f6360.f21697[3].m13256());
                        AbstractC2154.m3888(c21452, c2145, -c2158.f6327);
                    }
                    C7878 c787811 = this.f6360;
                    if (c787811.f21717) {
                        AbstractC2154.m3888(c21453, c21452, c787811.f21759);
                        return;
                    }
                    return;
                }
                C7880 c78804 = c7880Arr[4];
                if (c78804.f21763 != null) {
                    C2145 c2145M38895 = AbstractC2154.m3889(c78804);
                    if (c2145M38895 != null) {
                        AbstractC2154.m3888(c21453, c2145M38895, 0);
                        AbstractC2154.m3888(c21452, c21453, -this.f6360.f21759);
                        AbstractC2154.m3888(c2145, c21452, c2158.f6327);
                        return;
                    }
                    return;
                }
                if ((c78787 instanceof AbstractC7885) || c78787.f21694 == null || c78787.mo13253(ConstraintAnchor$Type.CENTER).f21763 != null) {
                    return;
                }
                C7878 c787812 = this.f6360;
                AbstractC2154.m3888(c21452, c787812.f21694.f21719.f6362, c787812.m13241());
                AbstractC2154.m3888(c2145, c21452, c2158.f6327);
                C7878 c787813 = this.f6360;
                if (c787813.f21717) {
                    AbstractC2154.m3888(c21453, c21452, c787813.f21759);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f6358 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            c2158.m3870(this);
        } else {
            C7878 c787814 = this.f6360;
            int i = c787814.f21725;
            if (i == 2) {
                C7878 c787815 = c787814.f21694;
                if (c787815 != null) {
                    C2158 c21582 = c787815.f21719.f6357;
                    arrayList2.add(c21582);
                    c21582.f6328.add(c2158);
                    c2158.f6324 = true;
                    arrayList.add(c21452);
                    arrayList.add(c2145);
                }
            } else if (i == 3 && !c787814.m13230()) {
                C7878 c787816 = this.f6360;
                if (c787816.f21733 != 3) {
                    C2158 c21583 = c787816.f21720.f6357;
                    arrayList2.add(c21583);
                    c21583.f6328.add(c2158);
                    c2158.f6324 = true;
                    arrayList.add(c21452);
                    arrayList.add(c2145);
                }
            }
        }
        C7878 c787817 = this.f6360;
        C7880[] c7880Arr2 = c787817.f21697;
        C7880 c78805 = c7880Arr2[2];
        C7880 c78806 = c78805.f21763;
        if (c78806 != null && c7880Arr2[3].f21763 != null) {
            boolean zM132302 = c787817.m13230();
            C7878 c787818 = this.f6360;
            if (zM132302) {
                c21452.f6320 = c787818.f21697[2].m13256();
                c2145.f6320 = -this.f6360.f21697[3].m13256();
            } else {
                C2145 c2145M38896 = AbstractC2154.m3889(c787818.f21697[2]);
                C2145 c2145M38897 = AbstractC2154.m3889(this.f6360.f21697[3]);
                if (c2145M38896 != null) {
                    c2145M38896.m3870(this);
                }
                if (c2145M38897 != null) {
                    c2145M38897.m3870(this);
                }
                this.f6365 = WidgetRun$RunType.CENTER;
            }
            if (this.f6360.f21717) {
                m3891(c21453, c21452, 1, this.f6367);
            }
        } else if (c78806 != null) {
            C2145 c2145M38898 = AbstractC2154.m3889(c78805);
            if (c2145M38898 != null) {
                AbstractC2154.m3888(c21452, c2145M38898, this.f6360.f21697[2].m13256());
                m3891(c2145, c21452, 1, c2158);
                if (this.f6360.f21717) {
                    m3891(c21453, c21452, 1, this.f6367);
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = this.f6358;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                    C7878 c787819 = this.f6360;
                    if (c787819.f21756 > 0.0f) {
                        C2160 c2160 = c787819.f21720;
                        if (c2160.f6358 == constraintWidget$DimensionBehaviour3) {
                            c2160.f6357.f6328.add(c2158);
                            arrayList2.add(this.f6360.f21720.f6357);
                            c2158.f6325 = this;
                        }
                    }
                }
            }
        } else {
            C7880 c78807 = c7880Arr2[3];
            if (c78807.f21763 != null) {
                C2145 c2145M38899 = AbstractC2154.m3889(c78807);
                if (c2145M38899 != null) {
                    AbstractC2154.m3888(c2145, c2145M38899, -this.f6360.f21697[3].m13256());
                    m3891(c21452, c2145, -1, c2158);
                    if (this.f6360.f21717) {
                        m3891(c21453, c21452, 1, this.f6367);
                    }
                }
            } else {
                C7880 c78808 = c7880Arr2[4];
                if (c78808.f21763 != null) {
                    C2145 c2145M388910 = AbstractC2154.m3889(c78808);
                    if (c2145M388910 != null) {
                        AbstractC2154.m3888(c21453, c2145M388910, 0);
                        m3891(c21452, c21453, -1, this.f6367);
                        m3891(c2145, c21452, 1, c2158);
                    }
                } else if (!(c787817 instanceof AbstractC7885) && (c78783 = c787817.f21694) != null) {
                    AbstractC2154.m3888(c21452, c78783.f21719.f6362, c787817.m13241());
                    m3891(c2145, c21452, 1, c2158);
                    if (this.f6360.f21717) {
                        m3891(c21453, c21452, 1, this.f6367);
                    }
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = this.f6358;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour5) {
                        C7878 c787820 = this.f6360;
                        if (c787820.f21756 > 0.0f) {
                            C2160 c21602 = c787820.f21720;
                            if (c21602.f6358 == constraintWidget$DimensionBehaviour5) {
                                c21602.f6357.f6328.add(c2158);
                                arrayList2.add(this.f6360.f21720.f6357);
                                c2158.f6325 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c2158.f6323 = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3871(InterfaceC2147 interfaceC2147) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC2151.f6352[this.f6365.ordinal()] == 3) {
            C7878 c7878 = this.f6360;
            m3893(c7878.f21712, c7878.f21702, 1);
            return;
        }
        C2158 c2158 = this.f6357;
        if (c2158.f6323 && !c2158.f6331 && this.f6358 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            C7878 c78782 = this.f6360;
            int i2 = c78782.f21725;
            if (i2 == 2) {
                C7878 c78783 = c78782.f21694;
                if (c78783 != null) {
                    if (c78783.f21719.f6357.f6331) {
                        c2158.mo3868((int) ((r1.f6327 * c78782.f21710) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C2158 c21582 = c78782.f21720.f6357;
                if (c21582.f6331) {
                    int i3 = c78782.f21760;
                    if (i3 == -1) {
                        f = c21582.f6327;
                        f2 = c78782.f21756;
                    } else if (i3 == 0) {
                        f3 = c21582.f6327 * c78782.f21756;
                        i = (int) (f3 + 0.5f);
                        c2158.mo3868(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c2158.mo3868(i);
                    } else {
                        f = c21582.f6327;
                        f2 = c78782.f21756;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c2158.mo3868(i);
                }
            }
        }
        C2145 c2145 = this.f6362;
        boolean z = c2145.f6323;
        ArrayList arrayList = c2145.f6329;
        if (z) {
            C2145 c21452 = this.f6364;
            boolean z2 = c21452.f6323;
            ArrayList arrayList2 = c21452.f6329;
            if (z2) {
                if (c2145.f6331 && c21452.f6331 && c2158.f6331) {
                    return;
                }
                if (!c2158.f6331 && this.f6358 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    C7878 c78784 = this.f6360;
                    if (c78784.f21733 == 0 && !c78784.m13230()) {
                        C2145 c21453 = (C2145) arrayList.get(0);
                        C2145 c21454 = (C2145) arrayList2.get(0);
                        int i4 = c21453.f6327 + c2145.f6320;
                        int i5 = c21454.f6327 + c21452.f6320;
                        c2145.mo3868(i4);
                        c21452.mo3868(i5);
                        c2158.mo3868(i5 - i4);
                        return;
                    }
                }
                if (!c2158.f6331 && this.f6358 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && this.f6361 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2145 c21455 = (C2145) arrayList.get(0);
                    int i6 = (((C2145) arrayList2.get(0)).f6327 + c21452.f6320) - (c21455.f6327 + c2145.f6320);
                    int i7 = c2158.f6375;
                    if (i6 < i7) {
                        c2158.mo3868(i6);
                    } else {
                        c2158.mo3868(i7);
                    }
                }
                if (c2158.f6331 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2145 c21456 = (C2145) arrayList.get(0);
                    C2145 c21457 = (C2145) arrayList2.get(0);
                    int i8 = c21456.f6327;
                    int i9 = c2145.f6320 + i8;
                    int i10 = c21457.f6327;
                    int i11 = c21452.f6320 + i10;
                    float f4 = this.f6360.f21744;
                    if (c21456 == c21457) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c2145.mo3868((int) ((((i10 - i8) - c2158.f6327) * f4) + i8 + 0.5f));
                    c21452.mo3868(c2145.f6327 + c2158.f6327);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3894() {
        this.f6363 = false;
        C2145 c2145 = this.f6362;
        c2145.m3869();
        c2145.f6331 = false;
        C2145 c21452 = this.f6364;
        c21452.m3869();
        c21452.f6331 = false;
        C2145 c21453 = this.f6366;
        c21453.m3869();
        c21453.f6331 = false;
        this.f6357.f6331 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo3884() {
        return this.f6358 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || this.f6360.f21725 == 0;
    }
}
