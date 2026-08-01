package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.Iterator;
import p025.AbstractC7012;
import p219.C8707;
import p219.C8708;
import p219.C8710;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2981 extends AbstractC2987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f6686;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f6687;

    public C2981(C8708 c8708, int i) {
        C8708 c87082;
        super(c8708);
        ArrayList<AbstractC2987> arrayList = new ArrayList();
        this.f6686 = arrayList;
        this.f6702 = i;
        C8708 c87083 = this.f6706;
        C8708 c8708M13833 = c87083.m13833(i);
        while (true) {
            c87082 = c87083;
            c87083 = c8708M13833;
            if (c87083 == null) {
                break;
            } else {
                c8708M13833 = c87083.m13833(this.f6702);
            }
        }
        this.f6706 = c87082;
        int i2 = this.f6702;
        arrayList.add(i2 == 0 ? c87082.f22062 : i2 == 1 ? c87082.f22061 : null);
        C8708 c8708M13839 = c87082.m13839(this.f6702);
        while (c8708M13839 != null) {
            int i3 = this.f6702;
            arrayList.add(i3 == 0 ? c8708M13839.f22062 : i3 == 1 ? c8708M13839.f22061 : null);
            c8708M13839 = c8708M13839.m13839(this.f6702);
        }
        for (AbstractC2987 abstractC2987 : arrayList) {
            int i4 = this.f6702;
            if (i4 == 0) {
                abstractC2987.f6706.f22064 = this;
            } else if (i4 == 1) {
                abstractC2987.f6706.f22063 = this;
            }
        }
        if (this.f6702 == 0 && ((C8707) this.f6706.f22036).f22020 && arrayList.size() > 1) {
            this.f6706 = ((AbstractC2987) AbstractC7012.m12145(1, arrayList)).f6706;
        }
        int i5 = this.f6702;
        C8708 c87084 = this.f6706;
        this.f6687 = i5 == 0 ? c87084.f22097 : c87084.f22093;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f6702 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC2987 abstractC2987 : this.f6686) {
            sb.append("<");
            sb.append(abstractC2987);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo4449() {
        this.f6705 = null;
        Iterator it = this.f6686.iterator();
        while (it.hasNext()) {
            ((AbstractC2987) it.next()).mo4449();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo4450() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6686;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC2987) arrayList.get(i)).mo4450();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo4451() {
        ArrayList arrayList = this.f6686;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2987) it.next()).mo4451();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C8708 c8708 = ((AbstractC2987) arrayList.get(0)).f6706;
        C8708 c87082 = ((AbstractC2987) arrayList.get(size - 1)).f6706;
        int i = this.f6702;
        C2978 c2978 = this.f6710;
        C2978 c29782 = this.f6708;
        if (i == 0) {
            C8710 c8710 = c8708.f22055;
            C8710 c87102 = c87082.f22045;
            C2978 c2978M4460 = AbstractC2987.m4460(c8710, 0);
            int iM13843 = c8710.m13843();
            C8708 c8708M4453 = m4453();
            if (c8708M4453 != null) {
                iM13843 = c8708M4453.f22055.m13843();
            }
            if (c2978M4460 != null) {
                AbstractC2987.m4458(c29782, c2978M4460, iM13843);
            }
            C2978 c2978M44602 = AbstractC2987.m4460(c87102, 0);
            int iM138432 = c87102.m13843();
            C8708 c8708M4452 = m4452();
            if (c8708M4452 != null) {
                iM138432 = c8708M4452.f22045.m13843();
            }
            if (c2978M44602 != null) {
                AbstractC2987.m4458(c2978, c2978M44602, -iM138432);
            }
        } else {
            C8710 c87103 = c8708.f22054;
            C8710 c87104 = c87082.f22044;
            C2978 c2978M44603 = AbstractC2987.m4460(c87103, 1);
            int iM138433 = c87103.m13843();
            C8708 c8708M44532 = m4453();
            if (c8708M44532 != null) {
                iM138433 = c8708M44532.f22054.m13843();
            }
            if (c2978M44603 != null) {
                AbstractC2987.m4458(c29782, c2978M44603, iM138433);
            }
            C2978 c2978M44604 = AbstractC2987.m4460(c87104, 1);
            int iM138434 = c87104.m13843();
            C8708 c8708M44522 = m4452();
            if (c8708M44522 != null) {
                iM138434 = c8708M44522.f22044.m13843();
            }
            if (c2978M44604 != null) {
                AbstractC2987.m4458(c2978, c2978M44604, -iM138434);
            }
        }
        c29782.f6671 = this;
        c2978.f6671 = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2980
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4441(InterfaceC2980 interfaceC2980) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        C2978 c2978 = this.f6708;
        if (c2978.f6677) {
            C2978 c29782 = this.f6710;
            if (c29782.f6677) {
                C8708 c8708 = this.f6706.f22036;
                boolean z3 = c8708 instanceof C8707 ? ((C8707) c8708).f22020 : false;
                int i13 = c29782.f6673 - c2978.f6673;
                ArrayList arrayList = this.f6686;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((AbstractC2987) arrayList.get(i14)).f6706.f22084 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                int i16 = i15;
                while (true) {
                    if (i16 < 0) {
                        break;
                    }
                    if (((AbstractC2987) arrayList.get(i16)).f6706.f22084 != 8) {
                        i = i16;
                        break;
                    }
                    i16--;
                }
                int i17 = 0;
                while (i17 < 2) {
                    f = 0.0f;
                    i4 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    f2 = 0.0f;
                    while (i18 < size) {
                        AbstractC2987 abstractC2987 = (AbstractC2987) arrayList.get(i18);
                        C8708 c87082 = abstractC2987.f6706;
                        boolean z4 = z3;
                        if (c87082.f22084 != i2) {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i4 += abstractC2987.f6708.f6666;
                            }
                            C2991 c2991 = abstractC2987.f6703;
                            int i21 = c2991.f6673;
                            int i22 = i4;
                            boolean z5 = abstractC2987.f6704 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                            if (z5) {
                                int i23 = this.f6702;
                                if (i23 == 0 && !c87082.f22062.f6703.f6677) {
                                    return;
                                }
                                if (i23 == 1 && !c87082.f22061.f6703.f6677) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (abstractC2987.f6707 == 1 && i17 == 0) {
                                    i12 = c2991.f6721;
                                    i19++;
                                } else if (c2991.f6677) {
                                    i12 = i21;
                                }
                                z2 = true;
                                if (z2) {
                                    i19++;
                                    float f4 = c87082.f22092[this.f6702];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                    i4 = i22;
                                } else {
                                    i4 = i22 + i12;
                                }
                                if (i18 >= i15 && i18 < i) {
                                    i4 += -abstractC2987.f6710.f6666;
                                }
                            }
                            i12 = i21;
                            if (z2) {
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z3 = z4;
                        i2 = 8;
                    }
                    z = z3;
                    if (i4 < i13 || i19 == 0) {
                        i3 = i19;
                        i5 = i20;
                        break;
                    } else {
                        i17++;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = 0.0f;
                f2 = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i24 = c2978.f6673;
                if (z) {
                    i24 = c29782.f6673;
                }
                float f5 = 0.5f;
                if (i4 > i13) {
                    i24 = z ? i24 + ((int) (((i4 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i4 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f6 = i13 - i4;
                    int i25 = (int) ((f6 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f7 = f5;
                        AbstractC2987 abstractC29872 = (AbstractC2987) arrayList.get(i26);
                        int i28 = i24;
                        C8708 c87083 = abstractC29872.f6706;
                        int i29 = i3;
                        C2991 c29912 = abstractC29872.f6703;
                        int i30 = i4;
                        float f8 = f6;
                        if (c87083.f22084 == 8 || abstractC29872.f6704 != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || c29912.f6677) {
                            i11 = i25;
                        } else {
                            int i31 = f2 > f ? (int) (((c87083.f22092[this.f6702] * f8) / f2) + f7) : i25;
                            if (this.f6702 == 0) {
                                i9 = c87083.f22071;
                                i10 = c87083.f22070;
                            } else {
                                i9 = c87083.f22053;
                                i10 = c87083.f22069;
                            }
                            i11 = i25;
                            int iMax = Math.max(i10, abstractC29872.f6707 == 1 ? Math.min(i31, c29912.f6721) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            c29912.mo4438(i31);
                        }
                        i26++;
                        i24 = i28;
                        f5 = f7;
                        i3 = i29;
                        i4 = i30;
                        f6 = f8;
                        i25 = i11;
                    }
                    i6 = i24;
                    f3 = f5;
                    int i32 = i3;
                    int i33 = i4;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i4 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            AbstractC2987 abstractC29873 = (AbstractC2987) arrayList.get(i34);
                            if (abstractC29873.f6706.f22084 != 8) {
                                if (i34 > 0 && i34 >= i14) {
                                    i4 += abstractC29873.f6708.f6666;
                                }
                                i4 += abstractC29873.f6703.f6673;
                                if (i34 < i15 && i34 < i) {
                                    i4 += -abstractC29873.f6710.f6666;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                        i4 = i33;
                    }
                    i8 = 2;
                    if (this.f6687 == 2 && i27 == 0) {
                        i7 = 0;
                        this.f6687 = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f3 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i4 > i13) {
                    this.f6687 = i8;
                }
                if (i5 > 0 && i3 == 0 && i14 == i) {
                    this.f6687 = i8;
                }
                int i35 = this.f6687;
                if (i35 == 1) {
                    int i36 = i5 > 1 ? (i13 - i4) / (i5 - 1) : i5 == 1 ? (i13 - i4) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        AbstractC2987 abstractC29874 = (AbstractC2987) arrayList.get(z ? size - (i38 + 1) : i38);
                        C8708 c87084 = abstractC29874.f6706;
                        C2978 c29783 = abstractC29874.f6710;
                        C2978 c29784 = abstractC29874.f6708;
                        if (c87084.f22084 == 8) {
                            c29784.mo4438(i37);
                            c29783.mo4438(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i14) {
                                i37 = z ? i37 - c29784.f6666 : i37 + c29784.f6666;
                            }
                            if (z) {
                                c29783.mo4438(i37);
                            } else {
                                c29784.mo4438(i37);
                            }
                            C2991 c29913 = abstractC29874.f6703;
                            int i39 = c29913.f6673;
                            if (abstractC29874.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && abstractC29874.f6707 == 1) {
                                i39 = c29913.f6721;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                c29784.mo4438(i37);
                            } else {
                                c29783.mo4438(i37);
                            }
                            abstractC29874.f6709 = true;
                            if (i38 < i15 && i38 < i) {
                                i37 = z ? i37 - (-c29783.f6666) : i37 + (-c29783.f6666);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i13 - i4) / (i5 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        AbstractC2987 abstractC29875 = (AbstractC2987) arrayList.get(z ? size - (i42 + 1) : i42);
                        C8708 c87085 = abstractC29875.f6706;
                        C2978 c29785 = abstractC29875.f6710;
                        C2978 c29786 = abstractC29875.f6708;
                        if (c87085.f22084 == 8) {
                            c29786.mo4438(i41);
                            c29785.mo4438(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i14) {
                                i43 = z ? i43 - c29786.f6666 : i43 + c29786.f6666;
                            }
                            if (z) {
                                c29785.mo4438(i43);
                            } else {
                                c29786.mo4438(i43);
                            }
                            C2991 c29914 = abstractC29875.f6703;
                            int iMin = c29914.f6673;
                            if (abstractC29875.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && abstractC29875.f6707 == 1) {
                                iMin = Math.min(iMin, c29914.f6721);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                c29786.mo4438(i41);
                            } else {
                                c29785.mo4438(i41);
                            }
                            if (i42 < i15 && i42 < i) {
                                i41 = z ? i41 - (-c29785.f6666) : i41 + (-c29785.f6666);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i44 = this.f6702;
                    C8708 c87086 = this.f6706;
                    float f9 = i44 == 0 ? c87086.f22087 : c87086.f22086;
                    if (z) {
                        f9 = 1.0f - f9;
                    }
                    int i45 = (int) (((i13 - i4) * f9) + f3);
                    if (i45 < 0 || i3 > 0) {
                        i45 = i7;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = i7; i47 < size; i47++) {
                        AbstractC2987 abstractC29876 = (AbstractC2987) arrayList.get(z ? size - (i47 + 1) : i47);
                        C8708 c87087 = abstractC29876.f6706;
                        C2978 c29787 = abstractC29876.f6710;
                        C2978 c29788 = abstractC29876.f6708;
                        if (c87087.f22084 == 8) {
                            c29788.mo4438(i46);
                            c29787.mo4438(i46);
                        } else {
                            if (i47 > 0 && i47 >= i14) {
                                i46 = z ? i46 - c29788.f6666 : i46 + c29788.f6666;
                            }
                            if (z) {
                                c29787.mo4438(i46);
                            } else {
                                c29788.mo4438(i46);
                            }
                            C2991 c29915 = abstractC29876.f6703;
                            int i48 = c29915.f6673;
                            if (abstractC29876.f6704 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && abstractC29876.f6707 == 1) {
                                i48 = c29915.f6721;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                c29788.mo4438(i46);
                            } else {
                                c29787.mo4438(i46);
                            }
                            if (i47 < i15 && i47 < i) {
                                i46 = z ? i46 - (-c29787.f6666) : i46 + (-c29787.f6666);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C8708 m4452() {
        ArrayList arrayList = this.f6686;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C8708 c8708 = ((AbstractC2987) arrayList.get(size)).f6706;
            if (c8708.f22084 != 8) {
                return c8708;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8708 m4453() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6686;
            if (i >= arrayList.size()) {
                return null;
            }
            C8708 c8708 = ((AbstractC2987) arrayList.get(i)).f6706;
            if (c8708.f22084 != 8) {
                return c8708;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo4454() {
        ArrayList arrayList = this.f6686;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC2987) arrayList.get(i)).mo4454()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2987
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long mo4455() {
        ArrayList arrayList = this.f6686;
        int size = arrayList.size();
        long jMo4455 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC2987 abstractC2987 = (AbstractC2987) arrayList.get(i);
            jMo4455 = ((long) abstractC2987.f6710.f6666) + abstractC2987.mo4455() + jMo4455 + ((long) abstractC2987.f6708.f6666);
        }
        return jMo4455;
    }
}
