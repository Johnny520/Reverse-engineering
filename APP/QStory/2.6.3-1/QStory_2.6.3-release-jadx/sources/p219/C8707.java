package p219;

import androidx.appcompat.app.C0955;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC2987;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC2990;
import androidx.constraintlayout.core.widgets.analyzer.C2979;
import androidx.constraintlayout.core.widgets.analyzer.C2981;
import androidx.constraintlayout.core.widgets.analyzer.C2982;
import androidx.constraintlayout.core.widgets.analyzer.C2989;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p209.C8657;
import p215.C8695;
import p222.C8740;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8707 extends C8708 {

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public boolean f22014;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public boolean f22015;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public C8711[] f22016;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public int f22017;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public int f22018;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public C8711[] f22019;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public boolean f22020;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public C8695 f22021;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public int f22022;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public int f22023;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final C8740 f22024;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public int f22025;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public WeakReference f22026;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public WeakReference f22027;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final C2982 f22028;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final HashSet f22029;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public WeakReference f22030;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public WeakReference f22031;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public int f22034;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final C2979 f22035;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public ArrayList f22033 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final C0955 f22032 = new C0955(this);

    public C8707() {
        C2979 c2979 = new C2979();
        c2979.f6682 = true;
        c2979.f6681 = true;
        c2979.f6679 = new ArrayList();
        new ArrayList();
        c2979.f6678 = null;
        c2979.f6685 = new C2982();
        c2979.f6684 = new ArrayList();
        c2979.f6683 = this;
        c2979.f6680 = this;
        this.f22035 = c2979;
        this.f22021 = null;
        this.f22020 = false;
        this.f22024 = new C8740();
        this.f22023 = 0;
        this.f22017 = 0;
        this.f22016 = new C8711[4];
        this.f22019 = new C8711[4];
        this.f22018 = 257;
        this.f22014 = false;
        this.f22015 = false;
        this.f22030 = null;
        this.f22031 = null;
        this.f22027 = null;
        this.f22026 = null;
        this.f22029 = new HashSet();
        this.f22028 = new C2982();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m13793(C8708 c8708, C8695 c8695, C2982 c2982) {
        int i;
        int i2;
        if (c8695 == null) {
            return;
        }
        int i3 = c8708.f22084;
        int[] iArr = c8708.f22066;
        if (i3 == 8 || (c8708 instanceof C8718) || (c8708 instanceof C8712)) {
            c2982.f6689 = 0;
            c2982.f6688 = 0;
            return;
        }
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8708.f22040;
        c2982.f6693 = constraintWidget$DimensionBehaviourArr[0];
        c2982.f6692 = constraintWidget$DimensionBehaviourArr[1];
        c2982.f6691 = c8708.m13834();
        c2982.f6690 = c8708.m13838();
        c2982.f6696 = false;
        c2982.f6697 = 0;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c2982.f6693;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2;
        boolean z2 = c2982.f6692 == constraintWidget$DimensionBehaviour2;
        boolean z3 = z && c8708.f22098 > 0.0f;
        boolean z4 = z2 && c8708.f22098 > 0.0f;
        if (z && c8708.m13827(0) && c8708.f22075 == 0 && !z3) {
            c2982.f6693 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (z2 && c8708.f22067 == 0) {
                c2982.f6693 = ConstraintWidget$DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && c8708.m13827(1) && c8708.f22067 == 0 && !z4) {
            c2982.f6692 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (z && c8708.f22075 == 0) {
                c2982.f6692 = ConstraintWidget$DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (c8708.mo13815()) {
            c2982.f6693 = ConstraintWidget$DimensionBehaviour.FIXED;
            z = false;
        }
        if (c8708.mo13814()) {
            c2982.f6692 = ConstraintWidget$DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c2982.f6693 = ConstraintWidget$DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = c2982.f6692;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.FIXED;
                if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4) {
                    i2 = c2982.f6690;
                } else {
                    c2982.f6693 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    c8695.m13783(c8708, c2982);
                    i2 = c2982.f6688;
                }
                c2982.f6693 = constraintWidget$DimensionBehaviour4;
                c2982.f6691 = (int) (c8708.f22098 * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c2982.f6692 = ConstraintWidget$DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = c2982.f6693;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.FIXED;
                if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour6) {
                    i = c2982.f6691;
                } else {
                    c2982.f6692 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    c8695.m13783(c8708, c2982);
                    i = c2982.f6689;
                }
                c2982.f6692 = constraintWidget$DimensionBehaviour6;
                int i4 = c8708.f22102;
                float f = c8708.f22098;
                if (i4 == -1) {
                    c2982.f6690 = (int) (i / f);
                } else {
                    c2982.f6690 = (int) (f * i);
                }
            }
        }
        c8695.m13783(c8708, c2982);
        c8708.m13808(c2982.f6689);
        c8708.m13809(c2982.f6688);
        c8708.f22059 = c2982.f6694;
        c8708.m13819(c2982.f6695);
        c2982.f6697 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0838 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08a3 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0915 A[PHI: r13 r14
  0x0915: PHI (r13v6 ??) = (r13v5 ??), (r13v8 ??), (r13v8 ??), (r13v8 ??) binds: [B:513:0x08de, B:521:0x08fd, B:522:0x08ff, B:524:0x0905] A[DONT_GENERATE, DONT_INLINE]
  0x0915: PHI (r14v10 boolean) = (r14v9 boolean), (r14v14 boolean), (r14v14 boolean), (r14v14 boolean) binds: [B:513:0x08de, B:521:0x08fd, B:522:0x08ff, B:524:0x0905] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x091a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰哲苏, 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰苏哲] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13794() {
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr;
        C8710 c8710;
        int i;
        boolean z;
        char c;
        int i2;
        ?? r13;
        boolean z2;
        C8710 c87102;
        boolean z3;
        boolean z4;
        boolean[] zArr;
        boolean z5;
        int i3;
        int iMax;
        int iMax2;
        ?? r5;
        boolean z6;
        ?? r132;
        int i4;
        boolean z7;
        ?? r133;
        boolean z8;
        WeakReference weakReference;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        int iM4466;
        int iM44662;
        int i5;
        ArrayList arrayList;
        C2989 c2989;
        C2989 c29892;
        boolean z9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C8695 c8695;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i6;
        int i7;
        this.f22103 = 0;
        this.f22100 = 0;
        this.f22014 = false;
        this.f22015 = false;
        int size = this.f22033.size();
        int iMax3 = Math.max(0, m13834());
        int iMax4 = Math.max(0, m13838());
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = this.f22040;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr2[1];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr2[0];
        int i8 = this.f22034;
        C8710 c87103 = this.f22054;
        C8710 c87104 = this.f22055;
        if (i8 == 0 && AbstractC8716.m13867(this.f22018, 1)) {
            C8695 c86952 = this.f22021;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviourArr2[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviourArr2[1];
            m13820();
            ArrayList arrayList6 = this.f22033;
            int size2 = arrayList6.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((C8708) arrayList6.get(i9)).m13820();
            }
            boolean z10 = this.f22020;
            if (constraintWidget$DimensionBehaviour4 == ConstraintWidget$DimensionBehaviour.FIXED) {
                m13818(0, m13834());
            } else {
                c87104.m13851(0);
                this.f22103 = 0;
            }
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (i10 < size2) {
                boolean z13 = z11;
                C8708 c8708 = (C8708) arrayList6.get(i10);
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr3 = constraintWidget$DimensionBehaviourArr2;
                if (c8708 instanceof C8718) {
                    C8718 c8718 = (C8718) c8708;
                    i7 = i10;
                    if (c8718.f22194 == 1) {
                        int i11 = c8718.f22195;
                        if (i11 != -1) {
                            c8718.m13870(i11);
                        } else if (c8718.f22198 != -1 && mo13815()) {
                            c8718.m13870(m13834() - c8718.f22198);
                        } else if (mo13815()) {
                            c8718.m13870((int) ((c8718.f22196 * m13834()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    i7 = i10;
                    if ((c8708 instanceof C8712) && ((C8712) c8708).m13854() == 0) {
                        z11 = z13;
                        z12 = true;
                    }
                    i10 = i7 + 1;
                    constraintWidget$DimensionBehaviourArr2 = constraintWidget$DimensionBehaviourArr3;
                }
                z11 = z13;
                i10 = i7 + 1;
                constraintWidget$DimensionBehaviourArr2 = constraintWidget$DimensionBehaviourArr3;
            }
            constraintWidget$DimensionBehaviourArr = constraintWidget$DimensionBehaviourArr2;
            if (z11) {
                for (int i12 = 0; i12 < size2; i12 = i6 + 1) {
                    C8708 c87082 = (C8708) arrayList6.get(i12);
                    if (c87082 instanceof C8718) {
                        C8718 c87182 = (C8718) c87082;
                        i6 = i12;
                        if (c87182.f22194 == 1) {
                            AbstractC2990.m4471(0, c86952, c87182, z10);
                        }
                    } else {
                        i6 = i12;
                    }
                }
            }
            AbstractC2990.m4471(0, c86952, this, z10);
            if (z12) {
                for (int i13 = 0; i13 < size2; i13++) {
                    C8708 c87083 = (C8708) arrayList6.get(i13);
                    if (c87083 instanceof C8712) {
                        C8712 c8712 = (C8712) c87083;
                        if (c8712.m13854() == 0 && c8712.m13855()) {
                            AbstractC2990.m4471(1, c86952, c8712, z10);
                        }
                    }
                }
            }
            if (constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.FIXED) {
                m13810(0, m13838());
            } else {
                c87103.m13851(0);
                this.f22100 = 0;
            }
            int i14 = 0;
            boolean z14 = false;
            boolean z15 = false;
            while (i14 < size2) {
                C8708 c87084 = (C8708) arrayList6.get(i14);
                int i15 = i14;
                if (c87084 instanceof C8718) {
                    C8718 c87183 = (C8718) c87084;
                    if (c87183.f22194 == 0) {
                        int i16 = c87183.f22195;
                        if (i16 != -1) {
                            c87183.m13870(i16);
                        } else if (c87183.f22198 != -1 && mo13814()) {
                            c87183.m13870(m13838() - c87183.f22198);
                        } else if (mo13814()) {
                            c87183.m13870((int) ((c87183.f22196 * m13838()) + 0.5f));
                        }
                        z14 = true;
                    }
                } else if ((c87084 instanceof C8712) && ((C8712) c87084).m13854() == 1) {
                    z15 = true;
                }
                i14 = i15 + 1;
            }
            if (z14) {
                for (int i17 = 0; i17 < size2; i17++) {
                    C8708 c87085 = (C8708) arrayList6.get(i17);
                    if (c87085 instanceof C8718) {
                        C8718 c87184 = (C8718) c87085;
                        if (c87184.f22194 == 0) {
                            AbstractC2990.m4476(1, c86952, c87184);
                        }
                    }
                }
            }
            AbstractC2990.m4476(0, c86952, this);
            if (z15) {
                for (int i18 = 0; i18 < size2; i18++) {
                    C8708 c87086 = (C8708) arrayList6.get(i18);
                    if (c87086 instanceof C8712) {
                        C8712 c87122 = (C8712) c87086;
                        if (c87122.m13854() == 1 && c87122.m13855()) {
                            AbstractC2990.m4476(1, c86952, c87122);
                        }
                    }
                }
            }
            for (int i19 = 0; i19 < size2; i19++) {
                C8708 c87087 = (C8708) arrayList6.get(i19);
                if (c87087.m13816() && AbstractC2990.m4473(c87087)) {
                    m13793(c87087, c86952, AbstractC2990.f6720);
                    if (!(c87087 instanceof C8718)) {
                        AbstractC2990.m4471(0, c86952, c87087, z10);
                        AbstractC2990.m4476(0, c86952, c87087);
                    } else if (((C8718) c87087).f22194 == 0) {
                        AbstractC2990.m4476(0, c86952, c87087);
                    } else {
                        AbstractC2990.m4471(0, c86952, c87087, z10);
                    }
                }
            }
            for (int i20 = 0; i20 < size; i20++) {
                C8708 c87088 = (C8708) this.f22033.get(i20);
                if (c87088.m13816() && !(c87088 instanceof C8718) && !(c87088 instanceof C8712) && !(c87088 instanceof C8713) && !c87088.f22058) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM13841 = c87088.m13841(0);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM138412 = c87088.m13841(1);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviourM13841 != constraintWidget$DimensionBehaviour6 || c87088.f22075 == 1 || constraintWidget$DimensionBehaviourM138412 != constraintWidget$DimensionBehaviour6 || c87088.f22067 == 1) {
                        m13793(c87088, this.f22021, new C2982());
                    }
                }
            }
        } else {
            constraintWidget$DimensionBehaviourArr = constraintWidget$DimensionBehaviourArr2;
        }
        C8740 c8740 = this.f22024;
        if (size > 2 && ((constraintWidget$DimensionBehaviour3 == (constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour) && AbstractC8716.m13867(this.f22018, 1024))) {
            C8695 c86953 = this.f22021;
            ArrayList arrayList7 = this.f22033;
            int size3 = arrayList7.size();
            int i21 = 0;
            while (true) {
                if (i21 < size3) {
                    C8708 c87089 = (C8708) arrayList7.get(i21);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviourArr[0];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = constraintWidget$DimensionBehaviourArr[1];
                    int i22 = i21;
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr4 = c87089.f22040;
                    c8710 = c87104;
                    if (!AbstractC2990.m4474(constraintWidget$DimensionBehaviour7, constraintWidget$DimensionBehaviour8, constraintWidget$DimensionBehaviourArr4[0], constraintWidget$DimensionBehaviourArr4[1]) || (c87089 instanceof C8713)) {
                        break;
                    }
                    i21 = i22 + 1;
                    c87104 = c8710;
                } else {
                    c8710 = c87104;
                    int i23 = 0;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    ArrayList arrayList12 = null;
                    ArrayList arrayList13 = null;
                    while (i23 < size3) {
                        int i24 = i23;
                        C8708 c870810 = (C8708) arrayList7.get(i23);
                        ArrayList arrayList14 = arrayList8;
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = constraintWidget$DimensionBehaviourArr[0];
                        ArrayList arrayList15 = arrayList9;
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour10 = constraintWidget$DimensionBehaviourArr[1];
                        ArrayList arrayList16 = arrayList10;
                        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr5 = c870810.f22040;
                        ArrayList arrayList17 = arrayList11;
                        if (!AbstractC2990.m4474(constraintWidget$DimensionBehaviour9, constraintWidget$DimensionBehaviour10, constraintWidget$DimensionBehaviourArr5[0], constraintWidget$DimensionBehaviourArr5[1])) {
                            m13793(c870810, c86953, this.f22028);
                        }
                        boolean z16 = c870810 instanceof C8718;
                        if (z16) {
                            C8718 c87185 = (C8718) c870810;
                            if (c87185.f22194 == 0) {
                                arrayList10 = arrayList16 == null ? new ArrayList() : arrayList16;
                                arrayList10.add(c87185);
                            } else {
                                arrayList10 = arrayList16;
                            }
                            z9 = z16;
                            if (c87185.f22194 == 1) {
                                arrayList2 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList2.add(c87185);
                            } else {
                                arrayList2 = arrayList14;
                            }
                        } else {
                            z9 = z16;
                            arrayList2 = arrayList14;
                            arrayList10 = arrayList16;
                        }
                        if (!(c870810 instanceof AbstractC8715)) {
                            arrayList3 = arrayList2;
                            c8695 = c86953;
                            arrayList9 = arrayList15;
                            arrayList11 = arrayList17;
                        } else if (c870810 instanceof C8712) {
                            C8712 c87123 = (C8712) c870810;
                            if (c87123.m13854() == 0) {
                                arrayList4 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList4.add(c87123);
                            } else {
                                arrayList4 = arrayList15;
                            }
                            arrayList3 = arrayList2;
                            c8695 = c86953;
                            if (c87123.m13854() == 1) {
                                arrayList5 = arrayList17 == null ? new ArrayList() : arrayList17;
                                arrayList5.add(c87123);
                            } else {
                                arrayList5 = arrayList17;
                            }
                            arrayList9 = arrayList4;
                            arrayList11 = arrayList5;
                        } else {
                            arrayList3 = arrayList2;
                            c8695 = c86953;
                            AbstractC8715 abstractC8715 = (AbstractC8715) c870810;
                            arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                            arrayList9.add(abstractC8715);
                            arrayList11 = arrayList17 == null ? new ArrayList() : arrayList17;
                            arrayList11.add(abstractC8715);
                        }
                        if (c870810.f22055.f22105 == null && c870810.f22045.f22105 == null && !z9 && !(c870810 instanceof C8712)) {
                            if (arrayList12 == null) {
                                arrayList12 = new ArrayList();
                            }
                            ArrayList arrayList18 = arrayList12;
                            arrayList18.add(c870810);
                            arrayList12 = arrayList18;
                        }
                        if (c870810.f22054.f22105 == null && c870810.f22044.f22105 == null && c870810.f22047.f22105 == null && !z9 && !(c870810 instanceof C8712)) {
                            if (arrayList13 == null) {
                                arrayList13 = new ArrayList();
                            }
                            ArrayList arrayList19 = arrayList13;
                            arrayList19.add(c870810);
                            arrayList13 = arrayList19;
                        }
                        i23 = i24 + 1;
                        arrayList8 = arrayList3;
                        c86953 = c8695;
                    }
                    ArrayList arrayList20 = arrayList8;
                    ArrayList<AbstractC8715> arrayList21 = arrayList9;
                    ArrayList arrayList22 = arrayList10;
                    ArrayList<AbstractC8715> arrayList23 = arrayList11;
                    ArrayList<C2989> arrayList24 = new ArrayList();
                    if (arrayList20 != null) {
                        Iterator it = arrayList20.iterator();
                        while (it.hasNext()) {
                            AbstractC2990.m4472((C8718) it.next(), 0, arrayList24, null);
                        }
                    }
                    C2989 c29893 = null;
                    int i25 = 0;
                    if (arrayList21 != null) {
                        for (AbstractC8715 abstractC87152 : arrayList21) {
                            C2989 c2989M4472 = AbstractC2990.m4472(abstractC87152, i25, arrayList24, c29893);
                            abstractC87152.m13866(i25, c2989M4472, arrayList24);
                            c2989M4472.m4467(arrayList24);
                            c29893 = null;
                            i25 = 0;
                        }
                    }
                    HashSet hashSet = mo13840(ConstraintAnchor$Type.LEFT).f22110;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            AbstractC2990.m4472(((C8710) it2.next()).f22107, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet2 = mo13840(ConstraintAnchor$Type.RIGHT).f22110;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            AbstractC2990.m4472(((C8710) it3.next()).f22107, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet3 = mo13840(ConstraintAnchor$Type.CENTER).f22110;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            AbstractC2990.m4472(((C8710) it4.next()).f22107, 0, arrayList24, null);
                        }
                    }
                    C2989 c29894 = null;
                    if (arrayList12 != null) {
                        Iterator it5 = arrayList12.iterator();
                        while (it5.hasNext()) {
                            AbstractC2990.m4472((C8708) it5.next(), 0, arrayList24, null);
                        }
                    }
                    if (arrayList22 != null) {
                        Iterator it6 = arrayList22.iterator();
                        while (it6.hasNext()) {
                            AbstractC2990.m4472((C8718) it6.next(), 1, arrayList24, null);
                        }
                    }
                    int i26 = 1;
                    if (arrayList23 != null) {
                        for (AbstractC8715 abstractC87153 : arrayList23) {
                            C2989 c2989M44722 = AbstractC2990.m4472(abstractC87153, i26, arrayList24, c29894);
                            abstractC87153.m13866(i26, c2989M44722, arrayList24);
                            c2989M44722.m4467(arrayList24);
                            c29894 = null;
                            i26 = 1;
                        }
                    }
                    HashSet hashSet4 = mo13840(ConstraintAnchor$Type.TOP).f22110;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            AbstractC2990.m4472(((C8710) it7.next()).f22107, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet5 = mo13840(ConstraintAnchor$Type.BASELINE).f22110;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            AbstractC2990.m4472(((C8710) it8.next()).f22107, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet6 = mo13840(ConstraintAnchor$Type.BOTTOM).f22110;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            AbstractC2990.m4472(((C8710) it9.next()).f22107, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet7 = mo13840(ConstraintAnchor$Type.CENTER).f22110;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            AbstractC2990.m4472(((C8710) it10.next()).f22107, 1, arrayList24, null);
                        }
                    }
                    if (arrayList13 != null) {
                        Iterator it11 = arrayList13.iterator();
                        while (it11.hasNext()) {
                            AbstractC2990.m4472((C8708) it11.next(), 1, arrayList24, null);
                        }
                    }
                    int i27 = 0;
                    while (i27 < size3) {
                        C8708 c870811 = (C8708) arrayList7.get(i27);
                        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr6 = c870811.f22040;
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour11 = constraintWidget$DimensionBehaviourArr6[0];
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour12 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                        if (constraintWidget$DimensionBehaviour11 == constraintWidget$DimensionBehaviour12 && constraintWidget$DimensionBehaviourArr6[1] == constraintWidget$DimensionBehaviour12) {
                            int i28 = c870811.f22090;
                            int size4 = arrayList24.size();
                            int i29 = 0;
                            while (true) {
                                if (i29 >= size4) {
                                    i5 = i27;
                                    arrayList = arrayList7;
                                    c2989 = null;
                                    break;
                                }
                                i5 = i27;
                                c2989 = (C2989) arrayList24.get(i29);
                                arrayList = arrayList7;
                                if (i28 == c2989.f6718) {
                                    break;
                                }
                                i29++;
                                arrayList7 = arrayList;
                                i27 = i5;
                            }
                            int i30 = c870811.f22091;
                            int size5 = arrayList24.size();
                            int i31 = 0;
                            while (true) {
                                if (i31 >= size5) {
                                    c29892 = null;
                                    break;
                                }
                                c29892 = (C2989) arrayList24.get(i31);
                                if (i30 == c29892.f6718) {
                                    break;
                                } else {
                                    i31++;
                                }
                            }
                            if (c2989 != null && c29892 != null) {
                                c2989.m4465(0, c29892);
                                c29892.f6717 = 2;
                                arrayList24.remove(c2989);
                            }
                        } else {
                            i5 = i27;
                            arrayList = arrayList7;
                        }
                        i27 = i5 + 1;
                        arrayList7 = arrayList;
                    }
                    if (arrayList24.size() > 1) {
                        if (constraintWidget$DimensionBehaviourArr[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                            int i32 = 0;
                            C2989 c29895 = null;
                            for (C2989 c29896 : arrayList24) {
                                if (c29896.f6717 != 1 && (iM44662 = c29896.m4466(c8740, 0)) > i32) {
                                    c29895 = c29896;
                                    i32 = iM44662;
                                }
                            }
                            if (c29895 != null) {
                                m13812(ConstraintWidget$DimensionBehaviour.FIXED);
                                m13808(i32);
                            } else {
                                c29895 = null;
                            }
                            if (constraintWidget$DimensionBehaviourArr[1] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                                int i33 = 0;
                                C2989 c29897 = null;
                                for (C2989 c29898 : arrayList24) {
                                    if (c29898.f6717 != 0 && (iM4466 = c29898.m4466(c8740, 1)) > i33) {
                                        c29897 = c29898;
                                        i33 = iM4466;
                                    }
                                }
                                if (c29897 != null) {
                                    m13811(ConstraintWidget$DimensionBehaviour.FIXED);
                                    m13809(i33);
                                } else {
                                    c29897 = null;
                                }
                                if (c29895 != null || c29897 != null) {
                                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour13 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                                    if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour13) {
                                        if (iMax3 >= m13834() || iMax3 <= 0) {
                                            iMax3 = m13834();
                                        } else {
                                            m13808(iMax3);
                                            this.f22014 = true;
                                        }
                                    }
                                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour13) {
                                        if (iMax4 >= m13838() || iMax4 <= 0) {
                                            iMax4 = m13838();
                                        } else {
                                            m13809(iMax4);
                                            this.f22015 = true;
                                        }
                                    }
                                    i = iMax3;
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            boolean z17 = !m13802(64) || m13802(128);
            c8740.getClass();
            c8740.f22253 = false;
            if (this.f22018 == 0 && z17) {
                c = 1;
                c8740.f22253 = true;
            } else {
                c = 1;
            }
            ArrayList arrayList25 = this.f22033;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour14 = constraintWidget$DimensionBehaviourArr[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour15 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            boolean z18 = constraintWidget$DimensionBehaviour14 != constraintWidget$DimensionBehaviour15 || constraintWidget$DimensionBehaviourArr[c] == constraintWidget$DimensionBehaviour15;
            this.f22023 = 0;
            this.f22017 = 0;
            for (i2 = 0; i2 < size; i2++) {
                C8708 c870812 = (C8708) this.f22033.get(i2);
                if (c870812 instanceof C8707) {
                    ((C8707) c870812).m13794();
                }
            }
            boolean zM13802 = m13802(64);
            r13 = z;
            int i34 = 0;
            z2 = true;
            while (z2) {
                int i35 = i34 + 1;
                try {
                    c8740.m13941();
                    this.f22023 = 0;
                    this.f22017 = 0;
                    m13837(c8740);
                    for (int i36 = 0; i36 < size; i36++) {
                        ((C8708) this.f22033.get(i36)).m13837(c8740);
                    }
                    m13797(c8740);
                    try {
                        WeakReference weakReference2 = this.f22030;
                        if (weakReference2 == null || weakReference2.get() == null) {
                            c87102 = c87103;
                        } else {
                            c87102 = c87103;
                            try {
                                c8740.m13935(c8740.m13950((C8710) this.f22030.get()), c8740.m13950(c87103), 0, 5);
                                this.f22030 = null;
                            } catch (Exception e) {
                                e = e;
                                z8 = true;
                                e.printStackTrace();
                                z3 = z18;
                                System.out.println("EXCEPTION : " + e);
                                z4 = z8;
                                boolean[] zArr2 = AbstractC8716.f22191;
                                if (z4) {
                                }
                                if (z3) {
                                }
                                iMax = Math.max(this.f22089, m13834());
                                ?? r134 = r13;
                                boolean z19 = z5;
                                if (iMax > m13834()) {
                                }
                                iMax2 = Math.max(this.f22088, m13838());
                                if (iMax2 > m13838()) {
                                }
                                if (r132 == 0) {
                                }
                                if (i35 > i4) {
                                }
                                i34 = i35;
                                c87103 = c87102;
                                z18 = z3;
                                size = i3;
                                r13 = r133;
                                z2 = z7;
                            }
                        }
                        WeakReference weakReference3 = this.f22027;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            c8740.m13935(c8740.m13950(this.f22044), c8740.m13950((C8710) this.f22027.get()), 0, 5);
                            this.f22027 = null;
                        }
                        WeakReference weakReference4 = this.f22031;
                        if (weakReference4 == null || weakReference4.get() == null) {
                            weakReference = this.f22026;
                            if (weakReference == null && weakReference.get() != null) {
                                try {
                                    c8740.m13935(c8740.m13950(this.f22045), c8740.m13950((C8710) this.f22026.get()), 0, 5);
                                } catch (Exception e2) {
                                    e = e2;
                                    z8 = true;
                                    e.printStackTrace();
                                    z3 = z18;
                                    System.out.println("EXCEPTION : " + e);
                                    z4 = z8;
                                }
                                try {
                                    this.f22026 = null;
                                } catch (Exception e3) {
                                    e = e3;
                                    z8 = true;
                                    e.printStackTrace();
                                    z3 = z18;
                                    System.out.println("EXCEPTION : " + e);
                                    z4 = z8;
                                }
                            }
                            c8740.m13947();
                            z3 = z18;
                            z4 = true;
                        } else {
                            C8710 c87105 = c8710;
                            try {
                                c8710 = c87105;
                                c8740.m13935(c8740.m13950((C8710) this.f22031.get()), c8740.m13950(c87105), 0, 5);
                                this.f22031 = null;
                                weakReference = this.f22026;
                                if (weakReference == null) {
                                    c8740.m13947();
                                    z3 = z18;
                                    z4 = true;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                c8710 = c87105;
                                z8 = true;
                                e.printStackTrace();
                                z3 = z18;
                                System.out.println("EXCEPTION : " + e);
                                z4 = z8;
                                boolean[] zArr22 = AbstractC8716.f22191;
                                if (z4) {
                                }
                                i3 = z3 ? size : size;
                                iMax = Math.max(this.f22089, m13834());
                                ?? r1342 = r13;
                                boolean z192 = z5;
                                if (iMax > m13834()) {
                                }
                                iMax2 = Math.max(this.f22088, m13838());
                                if (iMax2 > m13838()) {
                                }
                                if (r132 == 0) {
                                }
                                if (i35 > i4) {
                                }
                                i34 = i35;
                                c87103 = c87102;
                                z18 = z3;
                                size = i3;
                                r13 = r133;
                                z2 = z7;
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        c87102 = c87103;
                    }
                } catch (Exception e6) {
                    e = e6;
                    c87102 = c87103;
                    z8 = z2;
                }
                boolean[] zArr222 = AbstractC8716.f22191;
                if (z4) {
                    zArr222[2] = false;
                    boolean zM138022 = m13802(64);
                    mo13807(c8740, zM138022);
                    int size6 = this.f22033.size();
                    int i37 = 0;
                    boolean z20 = false;
                    while (i37 < size6) {
                        boolean[] zArr3 = zArr222;
                        C8708 c870813 = (C8708) this.f22033.get(i37);
                        c870813.mo13807(c8740, zM138022);
                        int i38 = i37;
                        boolean z21 = zM138022;
                        if (c870813.f22078 != -1 || c870813.f22082 != -1) {
                            z20 = true;
                        }
                        i37 = i38 + 1;
                        zArr222 = zArr3;
                        zM138022 = z21;
                        z20 = z20;
                    }
                    zArr = zArr222;
                    z5 = z20;
                } else {
                    zArr = zArr222;
                    mo13807(c8740, zM13802);
                    for (int i39 = 0; i39 < size; i39++) {
                        ((C8708) this.f22033.get(i39)).mo13807(c8740, zM13802);
                    }
                    z5 = false;
                }
                if (z3 && i35 < 8 && zArr[2]) {
                    int i40 = 0;
                    int iMax5 = 0;
                    int iMax6 = 0;
                    while (i40 < size) {
                        C8708 c870814 = (C8708) this.f22033.get(i40);
                        iMax6 = Math.max(iMax6, c870814.m13834() + c870814.f22103);
                        iMax5 = Math.max(iMax5, c870814.m13838() + c870814.f22100);
                        i40++;
                        size = size;
                    }
                    i3 = size;
                    int iMax7 = Math.max(this.f22089, iMax6);
                    int iMax8 = Math.max(this.f22088, iMax5);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour16 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    r13 = r13;
                    z5 = z5;
                    if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour16) {
                        r13 = r13;
                        z5 = z5;
                        if (m13834() < iMax7) {
                            m13808(iMax7);
                            constraintWidget$DimensionBehaviourArr[0] = constraintWidget$DimensionBehaviour16;
                            r13 = 1;
                            z5 = true;
                        }
                    }
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour16 && m13838() < iMax8) {
                        m13809(iMax8);
                        constraintWidget$DimensionBehaviourArr[1] = constraintWidget$DimensionBehaviour16;
                        r13 = 1;
                        z5 = true;
                    }
                } else {
                    i3 = size;
                }
                iMax = Math.max(this.f22089, m13834());
                ?? r13422 = r13;
                boolean z1922 = z5;
                if (iMax > m13834()) {
                    m13808(iMax);
                    constraintWidget$DimensionBehaviourArr[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                    r13422 = 1;
                    z1922 = true;
                }
                iMax2 = Math.max(this.f22088, m13838());
                if (iMax2 > m13838()) {
                    m13809(iMax2);
                    r5 = 1;
                    constraintWidget$DimensionBehaviourArr[1] = ConstraintWidget$DimensionBehaviour.FIXED;
                    r132 = 1;
                    z6 = true;
                } else {
                    r5 = 1;
                    r132 = r13422;
                    z6 = z1922;
                }
                if (r132 == 0) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour17 = constraintWidget$DimensionBehaviourArr[0];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour18 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    r132 = r132;
                    r132 = r132;
                    z6 = z6;
                    z6 = z6;
                    if (constraintWidget$DimensionBehaviour17 == constraintWidget$DimensionBehaviour18 && i > 0) {
                        r132 = r132;
                        z6 = z6;
                        if (m13834() > i) {
                            this.f22014 = r5;
                            constraintWidget$DimensionBehaviourArr[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                            m13808(i);
                            ?? r135 = r5;
                            z6 = r135 == true ? 1 : 0;
                            r132 = r135;
                        }
                    }
                    if (constraintWidget$DimensionBehaviourArr[r5] != constraintWidget$DimensionBehaviour18 || iMax4 <= 0 || m13838() <= iMax4) {
                        i4 = 8;
                        r133 = r132;
                        z7 = z6;
                    } else {
                        this.f22015 = r5;
                        constraintWidget$DimensionBehaviourArr[r5] = ConstraintWidget$DimensionBehaviour.FIXED;
                        m13809(iMax4);
                        i4 = 8;
                        r133 = 1;
                        z7 = true;
                    }
                }
                if (i35 > i4) {
                    z7 = false;
                }
                i34 = i35;
                c87103 = c87102;
                z18 = z3;
                size = i3;
                r13 = r133;
                z2 = z7;
            }
            this.f22033 = arrayList25;
            if (r13 != 0) {
                constraintWidget$DimensionBehaviourArr[0] = constraintWidget$DimensionBehaviour3;
                constraintWidget$DimensionBehaviourArr[1] = constraintWidget$DimensionBehaviour2;
            }
            mo13800(c8740.f22250);
        }
        c8710 = c87104;
        i = iMax3;
        z = false;
        if (m13802(64)) {
        }
        c8740.getClass();
        c8740.f22253 = false;
        if (this.f22018 == 0) {
            c = 1;
        }
        ArrayList arrayList252 = this.f22033;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour142 = constraintWidget$DimensionBehaviourArr[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour152 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        if (constraintWidget$DimensionBehaviour142 != constraintWidget$DimensionBehaviour152) {
        }
        this.f22023 = 0;
        this.f22017 = 0;
        while (i2 < size) {
        }
        boolean zM138023 = m13802(64);
        r13 = z;
        int i342 = 0;
        z2 = true;
        while (z2) {
        }
        this.f22033 = arrayList252;
        if (r13 != 0) {
        }
        mo13800(c8740.f22250);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13795(C8708 c8708, int i) {
        if (i == 0) {
            int i2 = this.f22023 + 1;
            C8711[] c8711Arr = this.f22019;
            if (i2 >= c8711Arr.length) {
                this.f22019 = (C8711[]) Arrays.copyOf(c8711Arr, c8711Arr.length * 2);
            }
            C8711[] c8711Arr2 = this.f22019;
            int i3 = this.f22023;
            c8711Arr2[i3] = new C8711(c8708, 0, this.f22020);
            this.f22023 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f22017 + 1;
            C8711[] c8711Arr3 = this.f22016;
            if (i4 >= c8711Arr3.length) {
                this.f22016 = (C8711[]) Arrays.copyOf(c8711Arr3, c8711Arr3.length * 2);
            }
            C8711[] c8711Arr4 = this.f22016;
            int i5 = this.f22017;
            c8711Arr4[i5] = new C8711(c8708, 1, this.f22020);
            this.f22017 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean m13796(int i, boolean z) {
        boolean z2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        C2979 c2979 = this.f22035;
        ArrayList<AbstractC2987> arrayList = c2979.f6679;
        C8707 c8707 = c2979.f6683;
        boolean z3 = false;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM13841 = c8707.m13841(0);
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM138412 = c8707.m13841(1);
        int iM13835 = c8707.m13835();
        int iM13828 = c8707.m13828();
        if (z && (constraintWidget$DimensionBehaviourM13841 == (constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || constraintWidget$DimensionBehaviourM138412 == constraintWidget$DimensionBehaviour)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2987 abstractC2987 = (AbstractC2987) it.next();
                if (abstractC2987.f6702 == i && !abstractC2987.mo4454()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && constraintWidget$DimensionBehaviourM13841 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                    c8707.m13812(ConstraintWidget$DimensionBehaviour.FIXED);
                    c8707.m13808(c2979.m4444(c8707, 0));
                    c8707.f22062.f6703.mo4438(c8707.m13834());
                }
            } else if (z && constraintWidget$DimensionBehaviourM138412 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                c8707.m13811(ConstraintWidget$DimensionBehaviour.FIXED);
                c8707.m13809(c2979.m4444(c8707, 1));
                c8707.f22061.f6703.mo4438(c8707.m13838());
            }
        }
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8707.f22040;
        if (i == 0) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[0];
            if (constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                int iM13834 = c8707.m13834() + iM13835;
                c8707.f22062.f6710.mo4438(iM13834);
                c8707.f22062.f6703.mo4438(iM13834 - iM13835);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr[1];
            if (constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                int iM13838 = c8707.m13838() + iM13828;
                c8707.f22061.f6710.mo4438(iM13838);
                c8707.f22061.f6703.mo4438(iM13838 - iM13828);
                z2 = true;
            }
            z2 = false;
        }
        c2979.m4448();
        for (AbstractC2987 abstractC29872 : arrayList) {
            if (abstractC29872.f6702 == i && (abstractC29872.f6706 != c8707 || abstractC29872.f6709)) {
                abstractC29872.mo4450();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            AbstractC2987 abstractC29873 = (AbstractC2987) it2.next();
            if (abstractC29873.f6702 == i && (z2 || abstractC29873.f6706 != c8707)) {
                if (!abstractC29873.f6708.f6677 || !abstractC29873.f6710.f6677 || (!(abstractC29873 instanceof C2981) && !abstractC29873.f6703.f6677)) {
                    break;
                }
            }
        }
        c8707.m13812(constraintWidget$DimensionBehaviourM13841);
        c8707.m13811(constraintWidget$DimensionBehaviourM138412);
        return z3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m13797(C8740 c8740) {
        C8707 c8707;
        C8740 c87402;
        boolean zM13802 = m13802(64);
        mo13825(c8740, zM13802);
        int size = this.f22033.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C8708 c8708 = (C8708) this.f22033.get(i);
            boolean[] zArr = c8708.f22041;
            zArr[0] = false;
            zArr[1] = false;
            if (c8708 instanceof C8712) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C8708 c87082 = (C8708) this.f22033.get(i2);
                if (c87082 instanceof C8712) {
                    C8712 c8712 = (C8712) c87082;
                    for (int i3 = 0; i3 < c8712.f22189; i3++) {
                        C8708 c87083 = c8712.f22190[i3];
                        if (c8712.f22133 || c87083.mo13824()) {
                            int i4 = c8712.f22134;
                            if (i4 == 0 || i4 == 1) {
                                c87083.f22041[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c87083.f22041[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f22029;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C8708 c87084 = (C8708) this.f22033.get(i5);
            c87084.getClass();
            boolean z2 = c87084 instanceof C8713;
            if (z2 || (c87084 instanceof C8718)) {
                if (z2) {
                    hashSet.add(c87084);
                } else {
                    c87084.mo13825(c8740, zM13802);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8713 c8713 = (C8713) ((C8708) it.next());
                for (int i6 = 0; i6 < c8713.f22189; i6++) {
                    if (hashSet.contains(c8713.f22190[i6])) {
                        c8713.mo13825(c8740, zM13802);
                        hashSet.remove(c8713);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C8708) it2.next()).mo13825(c8740, zM13802);
                }
                hashSet.clear();
            }
        }
        if (C8740.f22242) {
            HashSet<C8708> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C8708 c87085 = (C8708) this.f22033.get(i7);
                c87085.getClass();
                if (!(c87085 instanceof C8713) && !(c87085 instanceof C8718)) {
                    hashSet2.add(c87085);
                }
            }
            c8707 = this;
            c87402 = c8740;
            c8707.m13826(this, c87402, hashSet2, this.f22040[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (C8708 c87086 : hashSet2) {
                AbstractC8716.m13868(c8707, c87402, c87086);
                c87086.mo13825(c87402, zM13802);
            }
        } else {
            c8707 = this;
            c87402 = c8740;
            for (int i8 = 0; i8 < size; i8++) {
                C8708 c87087 = (C8708) c8707.f22033.get(i8);
                if (c87087 instanceof C8707) {
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c87087.f22040;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[1];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3) {
                        c87087.m13812(ConstraintWidget$DimensionBehaviour.FIXED);
                    }
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                        c87087.m13811(ConstraintWidget$DimensionBehaviour.FIXED);
                    }
                    c87087.mo13825(c87402, zM13802);
                    if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3) {
                        c87087.m13812(constraintWidget$DimensionBehaviour);
                    }
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                        c87087.m13811(constraintWidget$DimensionBehaviour2);
                    }
                } else {
                    AbstractC8716.m13868(c8707, c87402, c87087);
                    if (!(c87087 instanceof C8713) && !(c87087 instanceof C8718)) {
                        c87087.mo13825(c87402, zM13802);
                    }
                }
            }
        }
        if (c8707.f22023 > 0) {
            AbstractC8716.m13869(c8707, c87402, null, 0);
        }
        if (c8707.f22017 > 0) {
            AbstractC8716.m13869(c8707, c87402, null, 1);
        }
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void mo13798(boolean z, boolean z2) {
        super.mo13798(z, z2);
        int size = this.f22033.size();
        for (int i = 0; i < size; i++) {
            ((C8708) this.f22033.get(i)).mo13798(z, z2);
        }
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo13799() {
        this.f22024.m13941();
        this.f22025 = 0;
        this.f22022 = 0;
        this.f22033.clear();
        super.mo13799();
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo13800(C8657 c8657) {
        super.mo13800(c8657);
        int size = this.f22033.size();
        for (int i = 0; i < size; i++) {
            ((C8708) this.f22033.get(i)).mo13800(c8657);
        }
    }

    @Override // p219.C8708
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo13801(StringBuilder sb) {
        sb.append(this.f22083 + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f22037);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f22099);
        sb.append("\n");
        Iterator it = this.f22033.iterator();
        while (it.hasNext()) {
            ((C8708) it.next()).mo13801(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean m13802(int i) {
        return (this.f22018 & i) == i;
    }
}
