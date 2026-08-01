package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p219.AbstractC8715;
import p219.C8708;
import p219.C8710;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2993 extends AbstractC2987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int[] f6723 = new int[2];

    public C2993(C8708 c8708) {
        super(c8708);
        this.f6708.f6667 = DependencyNode$Type.LEFT;
        this.f6710.f6667 = DependencyNode$Type.RIGHT;
        this.f6702 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m4477(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
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
        return "HorizontalRun " + this.f6706.f22096;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4449() {
        this.f6705 = null;
        this.f6708.m4439();
        this.f6710.m4439();
        this.f6703.m4439();
        this.f6709 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4450() {
        C2978 c2978 = this.f6708;
        if (c2978.f6677) {
            this.f6706.f22103 = c2978.f6673;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4451() {
        C8708 c8708;
        C8708 c87082;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        C8708 c87083;
        C8708 c87084;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        C8708 c87085 = this.f6706;
        boolean z = c87085.f22065;
        C2991 c2991 = this.f6703;
        if (z) {
            c2991.mo4438(c87085.m13834());
        }
        boolean z2 = c2991.f6677;
        ArrayList arrayList = c2991.f6674;
        ArrayList arrayList2 = c2991.f6675;
        C2978 c2978 = this.f6710;
        C2978 c29782 = this.f6708;
        if (z2) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = this.f6704;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
            if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && (c87082 = (c8708 = this.f6706).f22036) != null && ((constraintWidget$DimensionBehaviour = c87082.f22040[0]) == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4)) {
                AbstractC2987.m4458(c29782, c87082.f22062.f6708, c8708.f22055.m13843());
                AbstractC2987.m4458(c2978, c87082.f22062.f6710, -this.f6706.f22045.m13843());
                return;
            }
        } else {
            C8708 c87086 = this.f6706;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = c87086.f22040[0];
            this.f6704 = constraintWidget$DimensionBehaviour5;
            if (constraintWidget$DimensionBehaviour5 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
                if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour6 && (c87084 = c87086.f22036) != null && ((constraintWidget$DimensionBehaviour2 = c87084.f22040[0]) == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour6)) {
                    int iM13834 = (c87084.m13834() - this.f6706.f22055.m13843()) - this.f6706.f22045.m13843();
                    AbstractC2987.m4458(c29782, c87084.f22062.f6708, this.f6706.f22055.m13843());
                    AbstractC2987.m4458(c2978, c87084.f22062.f6710, -this.f6706.f22045.m13843());
                    c2991.mo4438(iM13834);
                    return;
                }
                if (constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.FIXED) {
                    c2991.mo4438(c87086.m13834());
                }
            }
        }
        if (c2991.f6677) {
            C8708 c87087 = this.f6706;
            if (c87087.f22065) {
                C8710[] c8710Arr = c87087.f22039;
                C8710 c8710 = c8710Arr[0];
                C8710 c87102 = c8710.f22105;
                if (c87102 != null && c8710Arr[1].f22105 != null) {
                    boolean zM13830 = c87087.m13830();
                    C8708 c87088 = this.f6706;
                    if (zM13830) {
                        c29782.f6666 = c87088.f22039[0].m13843();
                        c2978.f6666 = -this.f6706.f22039[1].m13843();
                        return;
                    }
                    C2978 c2978M4459 = AbstractC2987.m4459(c87088.f22039[0]);
                    if (c2978M4459 != null) {
                        AbstractC2987.m4458(c29782, c2978M4459, this.f6706.f22039[0].m13843());
                    }
                    C2978 c2978M44592 = AbstractC2987.m4459(this.f6706.f22039[1]);
                    if (c2978M44592 != null) {
                        AbstractC2987.m4458(c2978, c2978M44592, -this.f6706.f22039[1].m13843());
                    }
                    c29782.f6670 = true;
                    c2978.f6670 = true;
                    return;
                }
                if (c87102 != null) {
                    C2978 c2978M44593 = AbstractC2987.m4459(c8710);
                    if (c2978M44593 != null) {
                        AbstractC2987.m4458(c29782, c2978M44593, this.f6706.f22039[0].m13843());
                        AbstractC2987.m4458(c2978, c29782, c2991.f6673);
                        return;
                    }
                    return;
                }
                C8710 c87103 = c8710Arr[1];
                if (c87103.f22105 != null) {
                    C2978 c2978M44594 = AbstractC2987.m4459(c87103);
                    if (c2978M44594 != null) {
                        AbstractC2987.m4458(c2978, c2978M44594, -this.f6706.f22039[1].m13843());
                        AbstractC2987.m4458(c29782, c2978, -c2991.f6673);
                        return;
                    }
                    return;
                }
                if ((c87087 instanceof AbstractC8715) || c87087.f22036 == null || c87087.mo13840(ConstraintAnchor$Type.CENTER).f22105 != null) {
                    return;
                }
                C8708 c87089 = this.f6706;
                AbstractC2987.m4458(c29782, c87089.f22036.f22062.f6708, c87089.m13835());
                AbstractC2987.m4458(c2978, c29782, c2991.f6673);
                return;
            }
        }
        if (this.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            C8708 c870810 = this.f6706;
            int i = c870810.f22075;
            if (i == 2) {
                C8708 c870811 = c870810.f22036;
                if (c870811 != null) {
                    C2991 c29912 = c870811.f22061.f6703;
                    arrayList2.add(c29912);
                    c29912.f6674.add(c2991);
                    c2991.f6670 = true;
                    arrayList.add(c29782);
                    arrayList.add(c2978);
                }
            } else if (i == 3) {
                if (c870810.f22067 == 3) {
                    c29782.f6671 = this;
                    c2978.f6671 = this;
                    C2988 c2988 = c870810.f22061;
                    c2988.f6708.f6671 = this;
                    c2988.f6710.f6671 = this;
                    c2991.f6671 = this;
                    if (c870810.m13817()) {
                        arrayList2.add(this.f6706.f22061.f6703);
                        this.f6706.f22061.f6703.f6674.add(c2991);
                        C2988 c29882 = this.f6706.f22061;
                        c29882.f6703.f6671 = this;
                        arrayList2.add(c29882.f6708);
                        arrayList2.add(this.f6706.f22061.f6710);
                        this.f6706.f22061.f6708.f6674.add(c2991);
                        this.f6706.f22061.f6710.f6674.add(c2991);
                    } else {
                        boolean zM138302 = this.f6706.m13830();
                        C8708 c870812 = this.f6706;
                        if (zM138302) {
                            c870812.f22061.f6703.f6675.add(c2991);
                            arrayList.add(this.f6706.f22061.f6703);
                        } else {
                            c870812.f22061.f6703.f6675.add(c2991);
                        }
                    }
                } else {
                    C2991 c29913 = c870810.f22061.f6703;
                    arrayList2.add(c29913);
                    c29913.f6674.add(c2991);
                    this.f6706.f22061.f6708.f6674.add(c2991);
                    this.f6706.f22061.f6710.f6674.add(c2991);
                    c2991.f6670 = true;
                    arrayList.add(c29782);
                    arrayList.add(c2978);
                    c29782.f6675.add(c2991);
                    c2978.f6675.add(c2991);
                }
            }
        }
        C8708 c870813 = this.f6706;
        C8710[] c8710Arr2 = c870813.f22039;
        C8710 c87104 = c8710Arr2[0];
        C8710 c87105 = c87104.f22105;
        if (c87105 != null && c8710Arr2[1].f22105 != null) {
            boolean zM138303 = c870813.m13830();
            C8708 c870814 = this.f6706;
            if (zM138303) {
                c29782.f6666 = c870814.f22039[0].m13843();
                c2978.f6666 = -this.f6706.f22039[1].m13843();
                return;
            }
            C2978 c2978M44595 = AbstractC2987.m4459(c870814.f22039[0]);
            C2978 c2978M44596 = AbstractC2987.m4459(this.f6706.f22039[1]);
            if (c2978M44595 != null) {
                c2978M44595.m4440(this);
            }
            if (c2978M44596 != null) {
                c2978M44596.m4440(this);
            }
            this.f6711 = WidgetRun$RunType.CENTER;
            return;
        }
        if (c87105 != null) {
            C2978 c2978M44597 = AbstractC2987.m4459(c87104);
            if (c2978M44597 != null) {
                AbstractC2987.m4458(c29782, c2978M44597, this.f6706.f22039[0].m13843());
                m4461(c2978, c29782, 1, c2991);
                return;
            }
            return;
        }
        C8710 c87106 = c8710Arr2[1];
        if (c87106.f22105 != null) {
            C2978 c2978M44598 = AbstractC2987.m4459(c87106);
            if (c2978M44598 != null) {
                AbstractC2987.m4458(c2978, c2978M44598, -this.f6706.f22039[1].m13843());
                m4461(c29782, c2978, -1, c2991);
                return;
            }
            return;
        }
        if ((c870813 instanceof AbstractC8715) || (c87083 = c870813.f22036) == null) {
            return;
        }
        AbstractC2987.m4458(c29782, c87083.f22062.f6708, c870813.m13835());
        m4461(c2978, c29782, 1, c2991);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2980
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4441(InterfaceC2980 interfaceC2980) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC2992.f6722[this.f6711.ordinal()] == 3) {
            C8708 c8708 = this.f6706;
            m4463(c8708.f22055, c8708.f22045, 0);
            return;
        }
        C2991 c2991 = this.f6703;
        boolean z = c2991.f6677;
        C2978 c2978 = this.f6708;
        C2978 c29782 = this.f6710;
        if (!z && this.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            C8708 c87082 = this.f6706;
            int i2 = c87082.f22075;
            if (i2 == 2) {
                C8708 c87083 = c87082.f22036;
                if (c87083 != null) {
                    if (c87083.f22062.f6703.f6677) {
                        c2991.mo4438((int) ((r3.f6673 * c87082.f22068) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c87082.f22067;
                if (i3 == 0 || i3 == 3) {
                    C2988 c2988 = c87082.f22061;
                    C2978 c29783 = c2988.f6708;
                    C2978 c29784 = c2988.f6710;
                    boolean z2 = c87082.f22055.f22105 != null;
                    boolean z3 = c87082.f22054.f22105 != null;
                    boolean z4 = c87082.f22045.f22105 != null;
                    boolean z5 = c87082.f22044.f22105 != null;
                    int i4 = c87082.f22102;
                    if (z2 && z3 && z4 && z5) {
                        float f4 = c87082.f22098;
                        boolean z6 = c29783.f6677;
                        ArrayList arrayList = c29783.f6675;
                        int[] iArr = f6723;
                        if (z6 && c29784.f6677) {
                            if (c2978.f6669 && c29782.f6669) {
                                m4477(iArr, ((C2978) c2978.f6675.get(0)).f6673 + c2978.f6666, ((C2978) c29782.f6675.get(0)).f6673 - c29782.f6666, c29783.f6673 + c29783.f6666, c29784.f6673 - c29784.f6666, f4, i4);
                                c2991.mo4438(iArr[0]);
                                this.f6706.f22061.f6703.mo4438(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c2978.f6677 && c29782.f6677) {
                            if (!c29783.f6669 || !c29784.f6669) {
                                return;
                            }
                            m4477(iArr, c2978.f6673 + c2978.f6666, c29782.f6673 - c29782.f6666, ((C2978) arrayList.get(0)).f6673 + c29783.f6666, ((C2978) c29784.f6675.get(0)).f6673 - c29784.f6666, f4, i4);
                            c2991.mo4438(iArr[0]);
                            this.f6706.f22061.f6703.mo4438(iArr[1]);
                        }
                        if (!c2978.f6669 || !c29782.f6669 || !c29783.f6669 || !c29784.f6669) {
                            return;
                        }
                        m4477(iArr, ((C2978) c2978.f6675.get(0)).f6673 + c2978.f6666, ((C2978) c29782.f6675.get(0)).f6673 - c29782.f6666, ((C2978) arrayList.get(0)).f6673 + c29783.f6666, ((C2978) c29784.f6675.get(0)).f6673 - c29784.f6666, f4, i4);
                        c2991.mo4438(iArr[0]);
                        this.f6706.f22061.f6703.mo4438(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c2978.f6669 || !c29782.f6669) {
                            return;
                        }
                        float f5 = c87082.f22098;
                        int i5 = ((C2978) c2978.f6675.get(0)).f6673 + c2978.f6666;
                        int i6 = ((C2978) c29782.f6675.get(0)).f6673 - c29782.f6666;
                        if (i4 == -1 || i4 == 0) {
                            int iM4462 = m4462(i6 - i5, 0);
                            int i7 = (int) ((iM4462 * f5) + 0.5f);
                            int iM44622 = m4462(i7, 1);
                            if (i7 != iM44622) {
                                iM4462 = (int) ((iM44622 / f5) + 0.5f);
                            }
                            c2991.mo4438(iM4462);
                            this.f6706.f22061.f6703.mo4438(iM44622);
                        } else if (i4 == 1) {
                            int iM44623 = m4462(i6 - i5, 0);
                            int i8 = (int) ((iM44623 / f5) + 0.5f);
                            int iM44624 = m4462(i8, 1);
                            if (i8 != iM44624) {
                                iM44623 = (int) ((iM44624 * f5) + 0.5f);
                            }
                            c2991.mo4438(iM44623);
                            this.f6706.f22061.f6703.mo4438(iM44624);
                        }
                    } else if (z3 && z5) {
                        if (!c29783.f6669 || !c29784.f6669) {
                            return;
                        }
                        float f6 = c87082.f22098;
                        int i9 = ((C2978) c29783.f6675.get(0)).f6673 + c29783.f6666;
                        int i10 = ((C2978) c29784.f6675.get(0)).f6673 - c29784.f6666;
                        if (i4 == -1) {
                            int iM44625 = m4462(i10 - i9, 1);
                            int i11 = (int) ((iM44625 / f6) + 0.5f);
                            int iM44626 = m4462(i11, 0);
                            if (i11 != iM44626) {
                                iM44625 = (int) ((iM44626 * f6) + 0.5f);
                            }
                            c2991.mo4438(iM44626);
                            this.f6706.f22061.f6703.mo4438(iM44625);
                        } else if (i4 == 0) {
                            int iM44627 = m4462(i10 - i9, 1);
                            int i12 = (int) ((iM44627 * f6) + 0.5f);
                            int iM44628 = m4462(i12, 0);
                            if (i12 != iM44628) {
                                iM44627 = (int) ((iM44628 / f6) + 0.5f);
                            }
                            c2991.mo4438(iM44628);
                            this.f6706.f22061.f6703.mo4438(iM44627);
                        } else if (i4 == 1) {
                        }
                    }
                } else {
                    int i13 = c87082.f22102;
                    if (i13 == -1) {
                        f = c87082.f22061.f6703.f6673;
                        f2 = c87082.f22098;
                    } else if (i13 == 0) {
                        f3 = c87082.f22061.f6703.f6673 / c87082.f22098;
                        i = (int) (f3 + 0.5f);
                        c2991.mo4438(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c2991.mo4438(i);
                    } else {
                        f = c87082.f22061.f6703.f6673;
                        f2 = c87082.f22098;
                    }
                    f3 = f * f2;
                    i = (int) (f3 + 0.5f);
                    c2991.mo4438(i);
                }
            }
        }
        boolean z7 = c2978.f6669;
        ArrayList arrayList2 = c2978.f6675;
        if (z7) {
            boolean z8 = c29782.f6669;
            ArrayList arrayList3 = c29782.f6675;
            if (z8) {
                if (c2978.f6677 && c29782.f6677 && c2991.f6677) {
                    return;
                }
                if (!c2991.f6677 && this.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    C8708 c87084 = this.f6706;
                    if (c87084.f22075 == 0 && !c87084.m13830()) {
                        C2978 c29785 = (C2978) arrayList2.get(0);
                        C2978 c29786 = (C2978) arrayList3.get(0);
                        int i14 = c29785.f6673 + c2978.f6666;
                        int i15 = c29786.f6673 + c29782.f6666;
                        c2978.mo4438(i14);
                        c29782.mo4438(i15);
                        c2991.mo4438(i15 - i14);
                        return;
                    }
                }
                if (!c2991.f6677 && this.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && this.f6707 == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C2978) arrayList3.get(0)).f6673 + c29782.f6666) - (((C2978) arrayList2.get(0)).f6673 + c2978.f6666), c2991.f6721);
                    C8708 c87085 = this.f6706;
                    int i16 = c87085.f22071;
                    int iMax = Math.max(c87085.f22070, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    c2991.mo4438(iMax);
                }
                if (c2991.f6677) {
                    C2978 c29787 = (C2978) arrayList2.get(0);
                    C2978 c29788 = (C2978) arrayList3.get(0);
                    int i17 = c29787.f6673;
                    int i18 = c2978.f6666 + i17;
                    int i19 = c29788.f6673;
                    int i20 = c29782.f6666 + i19;
                    float f7 = this.f6706.f22087;
                    if (c29787 == c29788) {
                        f7 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c2978.mo4438((int) ((((i19 - i17) - c2991.f6673) * f7) + i17 + 0.5f));
                    c29782.mo4438(c2978.f6673 + c2991.f6673);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4478() {
        this.f6709 = false;
        C2978 c2978 = this.f6708;
        c2978.m4439();
        c2978.f6677 = false;
        C2978 c29782 = this.f6710;
        c29782.m4439();
        c29782.f6677 = false;
        this.f6703.f6677 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo4454() {
        return this.f6704 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || this.f6706.f22075 == 0;
    }
}
