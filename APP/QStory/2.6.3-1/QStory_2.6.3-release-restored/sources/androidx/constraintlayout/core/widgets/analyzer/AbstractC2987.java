package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import p219.C8708;
import p219.C8710;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2987 implements InterfaceC2980 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ConstraintWidget$DimensionBehaviour f6704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2985 f6705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8708 f6706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f6707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2991 f6703 = new C2991(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6702 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f6709 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2978 f6708 = new C2978(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2978 f6710 = new C2978(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public WidgetRun$RunType f6711 = WidgetRun$RunType.NONE;

    public AbstractC2987(C8708 c8708) {
        this.f6706 = c8708;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m4458(C2978 c2978, C2978 c29782, int i) {
        c2978.f6675.add(c29782);
        c2978.f6666 = i;
        c29782.f6674.add(c2978);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C2978 m4459(C8710 c8710) {
        C8710 c87102 = c8710.f22105;
        if (c87102 == null) {
            return null;
        }
        C8708 c8708 = c87102.f22107;
        int i = AbstractC2986.f6701[c87102.f22106.ordinal()];
        if (i == 1) {
            return c8708.f22062.f6708;
        }
        if (i == 2) {
            return c8708.f22062.f6710;
        }
        if (i == 3) {
            return c8708.f22061.f6708;
        }
        if (i == 4) {
            return c8708.f22061.f6712;
        }
        if (i != 5) {
            return null;
        }
        return c8708.f22061.f6710;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C2978 m4460(C8710 c8710, int i) {
        C8710 c87102 = c8710.f22105;
        if (c87102 == null) {
            return null;
        }
        C8708 c8708 = c87102.f22107;
        AbstractC2987 abstractC2987 = i == 0 ? c8708.f22062 : c8708.f22061;
        int i2 = AbstractC2986.f6701[c87102.f22106.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC2987.f6710;
        }
        return abstractC2987.f6708;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo4449();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo4450();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo4451();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4461(C2978 c2978, C2978 c29782, int i, C2991 c2991) {
        c2978.f6675.add(c29782);
        c2978.f6675.add(this.f6703);
        c2978.f6672 = i;
        c2978.f6676 = c2991;
        c29782.f6674.add(c2978);
        c2991.f6674.add(c2978);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m4462(int i, int i2) {
        C8708 c8708 = this.f6706;
        if (i2 == 0) {
            int i3 = c8708.f22071;
            int iMax = Math.max(c8708.f22070, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = c8708.f22053;
            int iMax2 = Math.max(c8708.f22069, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract boolean mo4454();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4463(C8710 c8710, C8710 c87102, int i) {
        C2978 c2978M4459 = m4459(c8710);
        C2978 c2978M44592 = m4459(c87102);
        if (c2978M4459.f6677 && c2978M44592.f6677) {
            int iM13843 = c8710.m13843() + c2978M4459.f6673;
            int iM138432 = c2978M44592.f6673 - c87102.m13843();
            int i2 = iM138432 - iM13843;
            C2991 c2991 = this.f6703;
            if (!c2991.f6677) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = this.f6704;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2) {
                    int i3 = this.f6707;
                    if (i3 == 0) {
                        c2991.mo4438(m4462(i2, i));
                    } else if (i3 == 1) {
                        c2991.mo4438(Math.min(m4462(c2991.f6721, i), i2));
                    } else if (i3 == 2) {
                        C8708 c8708 = this.f6706;
                        C8708 c87082 = c8708.f22036;
                        if (c87082 != null) {
                            if ((i == 0 ? c87082.f22062 : c87082.f22061).f6703.f6677) {
                                c2991.mo4438(m4462((int) ((r6.f6673 * (i == 0 ? c8708.f22068 : c8708.f22052)) + 0.5f), i));
                            }
                        }
                    } else if (i3 == 3) {
                        C8708 c87083 = this.f6706;
                        AbstractC2987 abstractC2987 = c87083.f22062;
                        if (abstractC2987.f6704 == constraintWidget$DimensionBehaviour2 && abstractC2987.f6707 == 3) {
                            C2988 c2988 = c87083.f22061;
                            if (c2988.f6704 != constraintWidget$DimensionBehaviour2 || c2988.f6707 != 3) {
                            }
                        } else {
                            if (i == 0) {
                                abstractC2987 = c87083.f22061;
                            }
                            C2991 c29912 = abstractC2987.f6703;
                            if (c29912.f6677) {
                                float f = c87083.f22098;
                                int i4 = c29912.f6673;
                                c2991.mo4438(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                            }
                        }
                    }
                }
            }
            if (c2991.f6677) {
                int i5 = c2991.f6673;
                C2978 c2978 = this.f6710;
                C2978 c29782 = this.f6708;
                if (i5 == i2) {
                    c29782.mo4438(iM13843);
                    c2978.mo4438(iM138432);
                    return;
                }
                C8708 c87084 = this.f6706;
                float f2 = i == 0 ? c87084.f22087 : c87084.f22086;
                if (c2978M4459 == c2978M44592) {
                    iM13843 = c2978M4459.f6673;
                    iM138432 = c2978M44592.f6673;
                    f2 = 0.5f;
                }
                c29782.mo4438((int) ((((iM138432 - iM13843) - i5) * f2) + iM13843 + 0.5f));
                c2978.mo4438(c29782.f6673 + c2991.f6673);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public long mo4455() {
        if (this.f6703.f6677) {
            return r2.f6673;
        }
        return 0L;
    }
}
