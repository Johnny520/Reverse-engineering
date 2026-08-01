package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p203.AbstractC7885;
import p203.C7878;
import p203.C7880;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2160 extends AbstractC2154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int[] f6377 = new int[2];

    public C2160(C7878 c7878) {
        super(c7878);
        this.f6362.f6321 = DependencyNode$Type.LEFT;
        this.f6364.f6321 = DependencyNode$Type.RIGHT;
        this.f6356 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m3907(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
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
        return "HorizontalRun " + this.f6360.f21754;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3879() {
        this.f6359 = null;
        this.f6362.m3869();
        this.f6364.m3869();
        this.f6357.m3869();
        this.f6363 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3880() {
        C2145 c2145 = this.f6362;
        if (c2145.f6331) {
            this.f6360.f21761 = c2145.f6327;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3881() {
        C7878 c7878;
        C7878 c78782;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        C7878 c78783;
        C7878 c78784;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        C7878 c78785 = this.f6360;
        boolean z = c78785.f21723;
        C2158 c2158 = this.f6357;
        if (z) {
            c2158.mo3868(c78785.m13247());
        }
        boolean z2 = c2158.f6331;
        ArrayList arrayList = c2158.f6328;
        ArrayList arrayList2 = c2158.f6329;
        C2145 c2145 = this.f6364;
        C2145 c21452 = this.f6362;
        if (z2) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = this.f6358;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
            if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && (c78782 = (c7878 = this.f6360).f21694) != null && ((constraintWidget$DimensionBehaviour = c78782.f21698[0]) == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4)) {
                AbstractC2154.m3888(c21452, c78782.f21720.f6362, c7878.f21713.m13256());
                AbstractC2154.m3888(c2145, c78782.f21720.f6364, -this.f6360.f21703.m13256());
                return;
            }
        } else {
            C7878 c78786 = this.f6360;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = c78786.f21698[0];
            this.f6358 = constraintWidget$DimensionBehaviour5;
            if (constraintWidget$DimensionBehaviour5 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
                if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour6 && (c78784 = c78786.f21694) != null && ((constraintWidget$DimensionBehaviour2 = c78784.f21698[0]) == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour6)) {
                    int iM13247 = (c78784.m13247() - this.f6360.f21713.m13256()) - this.f6360.f21703.m13256();
                    AbstractC2154.m3888(c21452, c78784.f21720.f6362, this.f6360.f21713.m13256());
                    AbstractC2154.m3888(c2145, c78784.f21720.f6364, -this.f6360.f21703.m13256());
                    c2158.mo3868(iM13247);
                    return;
                }
                if (constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.FIXED) {
                    c2158.mo3868(c78786.m13247());
                }
            }
        }
        if (c2158.f6331) {
            C7878 c78787 = this.f6360;
            if (c78787.f21723) {
                C7880[] c7880Arr = c78787.f21697;
                C7880 c7880 = c7880Arr[0];
                C7880 c78802 = c7880.f21763;
                if (c78802 != null && c7880Arr[1].f21763 != null) {
                    boolean zM13243 = c78787.m13243();
                    C7878 c78788 = this.f6360;
                    if (zM13243) {
                        c21452.f6320 = c78788.f21697[0].m13256();
                        c2145.f6320 = -this.f6360.f21697[1].m13256();
                        return;
                    }
                    C2145 c2145M3889 = AbstractC2154.m3889(c78788.f21697[0]);
                    if (c2145M3889 != null) {
                        AbstractC2154.m3888(c21452, c2145M3889, this.f6360.f21697[0].m13256());
                    }
                    C2145 c2145M38892 = AbstractC2154.m3889(this.f6360.f21697[1]);
                    if (c2145M38892 != null) {
                        AbstractC2154.m3888(c2145, c2145M38892, -this.f6360.f21697[1].m13256());
                    }
                    c21452.f6324 = true;
                    c2145.f6324 = true;
                    return;
                }
                if (c78802 != null) {
                    C2145 c2145M38893 = AbstractC2154.m3889(c7880);
                    if (c2145M38893 != null) {
                        AbstractC2154.m3888(c21452, c2145M38893, this.f6360.f21697[0].m13256());
                        AbstractC2154.m3888(c2145, c21452, c2158.f6327);
                        return;
                    }
                    return;
                }
                C7880 c78803 = c7880Arr[1];
                if (c78803.f21763 != null) {
                    C2145 c2145M38894 = AbstractC2154.m3889(c78803);
                    if (c2145M38894 != null) {
                        AbstractC2154.m3888(c2145, c2145M38894, -this.f6360.f21697[1].m13256());
                        AbstractC2154.m3888(c21452, c2145, -c2158.f6327);
                        return;
                    }
                    return;
                }
                if ((c78787 instanceof AbstractC7885) || c78787.f21694 == null || c78787.mo13253(ConstraintAnchor$Type.CENTER).f21763 != null) {
                    return;
                }
                C7878 c78789 = this.f6360;
                AbstractC2154.m3888(c21452, c78789.f21694.f21720.f6362, c78789.m13248());
                AbstractC2154.m3888(c2145, c21452, c2158.f6327);
                return;
            }
        }
        if (this.f6358 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            C7878 c787810 = this.f6360;
            int i = c787810.f21733;
            if (i == 2) {
                C7878 c787811 = c787810.f21694;
                if (c787811 != null) {
                    C2158 c21582 = c787811.f21719.f6357;
                    arrayList2.add(c21582);
                    c21582.f6328.add(c2158);
                    c2158.f6324 = true;
                    arrayList.add(c21452);
                    arrayList.add(c2145);
                }
            } else if (i == 3) {
                if (c787810.f21725 == 3) {
                    c21452.f6325 = this;
                    c2145.f6325 = this;
                    C2155 c2155 = c787810.f21719;
                    c2155.f6362.f6325 = this;
                    c2155.f6364.f6325 = this;
                    c2158.f6325 = this;
                    if (c787810.m13230()) {
                        arrayList2.add(this.f6360.f21719.f6357);
                        this.f6360.f21719.f6357.f6328.add(c2158);
                        C2155 c21552 = this.f6360.f21719;
                        c21552.f6357.f6325 = this;
                        arrayList2.add(c21552.f6362);
                        arrayList2.add(this.f6360.f21719.f6364);
                        this.f6360.f21719.f6362.f6328.add(c2158);
                        this.f6360.f21719.f6364.f6328.add(c2158);
                    } else {
                        boolean zM132432 = this.f6360.m13243();
                        C7878 c787812 = this.f6360;
                        if (zM132432) {
                            c787812.f21719.f6357.f6329.add(c2158);
                            arrayList.add(this.f6360.f21719.f6357);
                        } else {
                            c787812.f21719.f6357.f6329.add(c2158);
                        }
                    }
                } else {
                    C2158 c21583 = c787810.f21719.f6357;
                    arrayList2.add(c21583);
                    c21583.f6328.add(c2158);
                    this.f6360.f21719.f6362.f6328.add(c2158);
                    this.f6360.f21719.f6364.f6328.add(c2158);
                    c2158.f6324 = true;
                    arrayList.add(c21452);
                    arrayList.add(c2145);
                    c21452.f6329.add(c2158);
                    c2145.f6329.add(c2158);
                }
            }
        }
        C7878 c787813 = this.f6360;
        C7880[] c7880Arr2 = c787813.f21697;
        C7880 c78804 = c7880Arr2[0];
        C7880 c78805 = c78804.f21763;
        if (c78805 != null && c7880Arr2[1].f21763 != null) {
            boolean zM132433 = c787813.m13243();
            C7878 c787814 = this.f6360;
            if (zM132433) {
                c21452.f6320 = c787814.f21697[0].m13256();
                c2145.f6320 = -this.f6360.f21697[1].m13256();
                return;
            }
            C2145 c2145M38895 = AbstractC2154.m3889(c787814.f21697[0]);
            C2145 c2145M38896 = AbstractC2154.m3889(this.f6360.f21697[1]);
            if (c2145M38895 != null) {
                c2145M38895.m3870(this);
            }
            if (c2145M38896 != null) {
                c2145M38896.m3870(this);
            }
            this.f6365 = WidgetRun$RunType.CENTER;
            return;
        }
        if (c78805 != null) {
            C2145 c2145M38897 = AbstractC2154.m3889(c78804);
            if (c2145M38897 != null) {
                AbstractC2154.m3888(c21452, c2145M38897, this.f6360.f21697[0].m13256());
                m3891(c2145, c21452, 1, c2158);
                return;
            }
            return;
        }
        C7880 c78806 = c7880Arr2[1];
        if (c78806.f21763 != null) {
            C2145 c2145M38898 = AbstractC2154.m3889(c78806);
            if (c2145M38898 != null) {
                AbstractC2154.m3888(c2145, c2145M38898, -this.f6360.f21697[1].m13256());
                m3891(c21452, c2145, -1, c2158);
                return;
            }
            return;
        }
        if ((c787813 instanceof AbstractC7885) || (c78783 = c787813.f21694) == null) {
            return;
        }
        AbstractC2154.m3888(c21452, c78783.f21720.f6362, c787813.m13248());
        m3891(c2145, c21452, 1, c2158);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3871(androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147 r23) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C2160.mo3871(androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世哲兰苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3908() {
        this.f6363 = false;
        C2145 c2145 = this.f6362;
        c2145.m3869();
        c2145.f6331 = false;
        C2145 c21452 = this.f6364;
        c21452.m3869();
        c21452.f6331 = false;
        this.f6357.f6331 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo3884() {
        return this.f6358 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || this.f6360.f21733 == 0;
    }
}
