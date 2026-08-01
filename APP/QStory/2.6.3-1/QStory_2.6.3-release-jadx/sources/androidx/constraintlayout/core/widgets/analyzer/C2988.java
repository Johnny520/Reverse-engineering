package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p219.AbstractC8715;
import p219.C8708;
import p219.C8710;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2988 extends AbstractC2987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C2978 f6712;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C2983 f6713;

    public C2988(C8708 c8708) {
        super(c8708);
        C2978 c2978 = new C2978(this);
        this.f6712 = c2978;
        this.f6713 = null;
        this.f6708.f6667 = DependencyNode$Type.TOP;
        this.f6710.f6667 = DependencyNode$Type.BOTTOM;
        c2978.f6667 = DependencyNode$Type.BASELINE;
        this.f6702 = 1;
    }

    public final String toString() {
        return "VerticalRun " + this.f6706.f22096;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4449() {
        this.f6705 = null;
        this.f6708.m4439();
        this.f6710.m4439();
        this.f6712.m4439();
        this.f6703.m4439();
        this.f6709 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4450() {
        C2978 c2978 = this.f6708;
        if (c2978.f6677) {
            this.f6706.f22100 = c2978.f6673;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4451() {
        C8708 c8708;
        C8708 c87082;
        C8708 c87083;
        C8708 c87084;
        C8708 c87085 = this.f6706;
        boolean z = c87085.f22065;
        C2991 c2991 = this.f6703;
        if (z) {
            c2991.mo4438(c87085.m13838());
        }
        boolean z2 = c2991.f6677;
        ArrayList arrayList = c2991.f6674;
        ArrayList arrayList2 = c2991.f6675;
        C2978 c2978 = this.f6710;
        C2978 c29782 = this.f6708;
        if (!z2) {
            C8708 c87086 = this.f6706;
            this.f6704 = c87086.f22040[1];
            if (c87086.f22059) {
                this.f6713 = new C2983(this);
            }
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = this.f6704;
            if (constraintWidget$DimensionBehaviour != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                if (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && (c87084 = this.f6706.f22036) != null && c87084.f22040[1] == ConstraintWidget$DimensionBehaviour.FIXED) {
                    int iM13838 = (c87084.m13838() - this.f6706.f22054.m13843()) - this.f6706.f22044.m13843();
                    AbstractC2987.m4458(c29782, c87084.f22061.f6708, this.f6706.f22054.m13843());
                    AbstractC2987.m4458(c2978, c87084.f22061.f6710, -this.f6706.f22044.m13843());
                    c2991.mo4438(iM13838);
                    return;
                }
                if (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.FIXED) {
                    c2991.mo4438(this.f6706.m13838());
                }
            }
        } else if (this.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && (c87082 = (c8708 = this.f6706).f22036) != null && c87082.f22040[1] == ConstraintWidget$DimensionBehaviour.FIXED) {
            AbstractC2987.m4458(c29782, c87082.f22061.f6708, c8708.f22054.m13843());
            AbstractC2987.m4458(c2978, c87082.f22061.f6710, -this.f6706.f22044.m13843());
            return;
        }
        boolean z3 = c2991.f6677;
        C2978 c29783 = this.f6712;
        if (z3) {
            C8708 c87087 = this.f6706;
            if (c87087.f22065) {
                C8710[] c8710Arr = c87087.f22039;
                C8710 c8710 = c8710Arr[2];
                C8710 c87102 = c8710.f22105;
                if (c87102 != null && c8710Arr[3].f22105 != null) {
                    boolean zM13817 = c87087.m13817();
                    C8708 c87088 = this.f6706;
                    if (zM13817) {
                        c29782.f6666 = c87088.f22039[2].m13843();
                        c2978.f6666 = -this.f6706.f22039[3].m13843();
                    } else {
                        C2978 c2978M4459 = AbstractC2987.m4459(c87088.f22039[2]);
                        if (c2978M4459 != null) {
                            AbstractC2987.m4458(c29782, c2978M4459, this.f6706.f22039[2].m13843());
                        }
                        C2978 c2978M44592 = AbstractC2987.m4459(this.f6706.f22039[3]);
                        if (c2978M44592 != null) {
                            AbstractC2987.m4458(c2978, c2978M44592, -this.f6706.f22039[3].m13843());
                        }
                        c29782.f6670 = true;
                        c2978.f6670 = true;
                    }
                    C8708 c87089 = this.f6706;
                    if (c87089.f22059) {
                        AbstractC2987.m4458(c29783, c29782, c87089.f22101);
                        return;
                    }
                    return;
                }
                if (c87102 != null) {
                    C2978 c2978M44593 = AbstractC2987.m4459(c8710);
                    if (c2978M44593 != null) {
                        AbstractC2987.m4458(c29782, c2978M44593, this.f6706.f22039[2].m13843());
                        AbstractC2987.m4458(c2978, c29782, c2991.f6673);
                        C8708 c870810 = this.f6706;
                        if (c870810.f22059) {
                            AbstractC2987.m4458(c29783, c29782, c870810.f22101);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C8710 c87103 = c8710Arr[3];
                if (c87103.f22105 != null) {
                    C2978 c2978M44594 = AbstractC2987.m4459(c87103);
                    if (c2978M44594 != null) {
                        AbstractC2987.m4458(c2978, c2978M44594, -this.f6706.f22039[3].m13843());
                        AbstractC2987.m4458(c29782, c2978, -c2991.f6673);
                    }
                    C8708 c870811 = this.f6706;
                    if (c870811.f22059) {
                        AbstractC2987.m4458(c29783, c29782, c870811.f22101);
                        return;
                    }
                    return;
                }
                C8710 c87104 = c8710Arr[4];
                if (c87104.f22105 != null) {
                    C2978 c2978M44595 = AbstractC2987.m4459(c87104);
                    if (c2978M44595 != null) {
                        AbstractC2987.m4458(c29783, c2978M44595, 0);
                        AbstractC2987.m4458(c29782, c29783, -this.f6706.f22101);
                        AbstractC2987.m4458(c2978, c29782, c2991.f6673);
                        return;
                    }
                    return;
                }
                if ((c87087 instanceof AbstractC8715) || c87087.f22036 == null || c87087.mo13840(ConstraintAnchor$Type.CENTER).f22105 != null) {
                    return;
                }
                C8708 c870812 = this.f6706;
                AbstractC2987.m4458(c29782, c870812.f22036.f22061.f6708, c870812.m13828());
                AbstractC2987.m4458(c2978, c29782, c2991.f6673);
                C8708 c870813 = this.f6706;
                if (c870813.f22059) {
                    AbstractC2987.m4458(c29783, c29782, c870813.f22101);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f6704 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            c2991.m4440(this);
        } else {
            C8708 c870814 = this.f6706;
            int i = c870814.f22067;
            if (i == 2) {
                C8708 c870815 = c870814.f22036;
                if (c870815 != null) {
                    C2991 c29912 = c870815.f22061.f6703;
                    arrayList2.add(c29912);
                    c29912.f6674.add(c2991);
                    c2991.f6670 = true;
                    arrayList.add(c29782);
                    arrayList.add(c2978);
                }
            } else if (i == 3 && !c870814.m13817()) {
                C8708 c870816 = this.f6706;
                if (c870816.f22075 != 3) {
                    C2991 c29913 = c870816.f22062.f6703;
                    arrayList2.add(c29913);
                    c29913.f6674.add(c2991);
                    c2991.f6670 = true;
                    arrayList.add(c29782);
                    arrayList.add(c2978);
                }
            }
        }
        C8708 c870817 = this.f6706;
        C8710[] c8710Arr2 = c870817.f22039;
        C8710 c87105 = c8710Arr2[2];
        C8710 c87106 = c87105.f22105;
        if (c87106 != null && c8710Arr2[3].f22105 != null) {
            boolean zM138172 = c870817.m13817();
            C8708 c870818 = this.f6706;
            if (zM138172) {
                c29782.f6666 = c870818.f22039[2].m13843();
                c2978.f6666 = -this.f6706.f22039[3].m13843();
            } else {
                C2978 c2978M44596 = AbstractC2987.m4459(c870818.f22039[2]);
                C2978 c2978M44597 = AbstractC2987.m4459(this.f6706.f22039[3]);
                if (c2978M44596 != null) {
                    c2978M44596.m4440(this);
                }
                if (c2978M44597 != null) {
                    c2978M44597.m4440(this);
                }
                this.f6711 = WidgetRun$RunType.CENTER;
            }
            if (this.f6706.f22059) {
                m4461(c29783, c29782, 1, this.f6713);
            }
        } else if (c87106 != null) {
            C2978 c2978M44598 = AbstractC2987.m4459(c87105);
            if (c2978M44598 != null) {
                AbstractC2987.m4458(c29782, c2978M44598, this.f6706.f22039[2].m13843());
                m4461(c2978, c29782, 1, c2991);
                if (this.f6706.f22059) {
                    m4461(c29783, c29782, 1, this.f6713);
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = this.f6704;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                    C8708 c870819 = this.f6706;
                    if (c870819.f22098 > 0.0f) {
                        C2993 c2993 = c870819.f22062;
                        if (c2993.f6704 == constraintWidget$DimensionBehaviour3) {
                            c2993.f6703.f6674.add(c2991);
                            arrayList2.add(this.f6706.f22062.f6703);
                            c2991.f6671 = this;
                        }
                    }
                }
            }
        } else {
            C8710 c87107 = c8710Arr2[3];
            if (c87107.f22105 != null) {
                C2978 c2978M44599 = AbstractC2987.m4459(c87107);
                if (c2978M44599 != null) {
                    AbstractC2987.m4458(c2978, c2978M44599, -this.f6706.f22039[3].m13843());
                    m4461(c29782, c2978, -1, c2991);
                    if (this.f6706.f22059) {
                        m4461(c29783, c29782, 1, this.f6713);
                    }
                }
            } else {
                C8710 c87108 = c8710Arr2[4];
                if (c87108.f22105 != null) {
                    C2978 c2978M445910 = AbstractC2987.m4459(c87108);
                    if (c2978M445910 != null) {
                        AbstractC2987.m4458(c29783, c2978M445910, 0);
                        m4461(c29782, c29783, -1, this.f6713);
                        m4461(c2978, c29782, 1, c2991);
                    }
                } else if (!(c870817 instanceof AbstractC8715) && (c87083 = c870817.f22036) != null) {
                    AbstractC2987.m4458(c29782, c87083.f22061.f6708, c870817.m13828());
                    m4461(c2978, c29782, 1, c2991);
                    if (this.f6706.f22059) {
                        m4461(c29783, c29782, 1, this.f6713);
                    }
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = this.f6704;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour5) {
                        C8708 c870820 = this.f6706;
                        if (c870820.f22098 > 0.0f) {
                            C2993 c29932 = c870820.f22062;
                            if (c29932.f6704 == constraintWidget$DimensionBehaviour5) {
                                c29932.f6703.f6674.add(c2991);
                                arrayList2.add(this.f6706.f22062.f6703);
                                c2991.f6671 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c2991.f6669 = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2980
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4441(InterfaceC2980 interfaceC2980) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC2984.f6698[this.f6711.ordinal()] == 3) {
            C8708 c8708 = this.f6706;
            m4463(c8708.f22054, c8708.f22044, 1);
            return;
        }
        C2991 c2991 = this.f6703;
        if (c2991.f6669 && !c2991.f6677 && this.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
            C8708 c87082 = this.f6706;
            int i2 = c87082.f22067;
            if (i2 == 2) {
                C8708 c87083 = c87082.f22036;
                if (c87083 != null) {
                    if (c87083.f22061.f6703.f6677) {
                        c2991.mo4438((int) ((r1.f6673 * c87082.f22052) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C2991 c29912 = c87082.f22062.f6703;
                if (c29912.f6677) {
                    int i3 = c87082.f22102;
                    if (i3 == -1) {
                        f = c29912.f6673;
                        f2 = c87082.f22098;
                    } else if (i3 == 0) {
                        f3 = c29912.f6673 * c87082.f22098;
                        i = (int) (f3 + 0.5f);
                        c2991.mo4438(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c2991.mo4438(i);
                    } else {
                        f = c29912.f6673;
                        f2 = c87082.f22098;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c2991.mo4438(i);
                }
            }
        }
        C2978 c2978 = this.f6708;
        boolean z = c2978.f6669;
        ArrayList arrayList = c2978.f6675;
        if (z) {
            C2978 c29782 = this.f6710;
            boolean z2 = c29782.f6669;
            ArrayList arrayList2 = c29782.f6675;
            if (z2) {
                if (c2978.f6677 && c29782.f6677 && c2991.f6677) {
                    return;
                }
                if (!c2991.f6677 && this.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    C8708 c87084 = this.f6706;
                    if (c87084.f22075 == 0 && !c87084.m13817()) {
                        C2978 c29783 = (C2978) arrayList.get(0);
                        C2978 c29784 = (C2978) arrayList2.get(0);
                        int i4 = c29783.f6673 + c2978.f6666;
                        int i5 = c29784.f6673 + c29782.f6666;
                        c2978.mo4438(i4);
                        c29782.mo4438(i5);
                        c2991.mo4438(i5 - i4);
                        return;
                    }
                }
                if (!c2991.f6677 && this.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && this.f6707 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2978 c29785 = (C2978) arrayList.get(0);
                    int i6 = (((C2978) arrayList2.get(0)).f6673 + c29782.f6666) - (c29785.f6673 + c2978.f6666);
                    int i7 = c2991.f6721;
                    if (i6 < i7) {
                        c2991.mo4438(i6);
                    } else {
                        c2991.mo4438(i7);
                    }
                }
                if (c2991.f6677 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2978 c29786 = (C2978) arrayList.get(0);
                    C2978 c29787 = (C2978) arrayList2.get(0);
                    int i8 = c29786.f6673;
                    int i9 = c2978.f6666 + i8;
                    int i10 = c29787.f6673;
                    int i11 = c29782.f6666 + i10;
                    float f4 = this.f6706.f22086;
                    if (c29786 == c29787) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c2978.mo4438((int) ((((i10 - i8) - c2991.f6673) * f4) + i8 + 0.5f));
                    c29782.mo4438(c2978.f6673 + c2991.f6673);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4464() {
        this.f6709 = false;
        C2978 c2978 = this.f6708;
        c2978.m4439();
        c2978.f6677 = false;
        C2978 c29782 = this.f6710;
        c29782.m4439();
        c29782.f6677 = false;
        C2978 c29783 = this.f6712;
        c29783.m4439();
        c29783.f6677 = false;
        this.f6703.f6677 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo4454() {
        return this.f6704 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || this.f6706.f22067 == 0;
    }
}
