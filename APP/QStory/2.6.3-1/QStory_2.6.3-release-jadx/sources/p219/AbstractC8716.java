package p219;

import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import p222.C8738;
import p222.C8740;
import p222.C8741;
import p222.C8742;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8716 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean[] f22191 = new boolean[3];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m13867(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13868(C8707 c8707, C8740 c8740, C8708 c8708) {
        c8708.f22076 = -1;
        C8710 c8710 = c8708.f22047;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8708.f22040;
        C8710 c87102 = c8708.f22044;
        C8710 c87103 = c8708.f22054;
        C8710 c87104 = c8708.f22045;
        C8710 c87105 = c8708.f22055;
        c8708.f22077 = -1;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = c8707.f22040;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr2[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 && constraintWidget$DimensionBehaviourArr[0] == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
            int i = c87105.f22112;
            int iM13834 = c8707.m13834() - c87104.f22112;
            c87105.f22113 = c8740.m13950(c87105);
            c87104.f22113 = c8740.m13950(c87104);
            c8740.m13937(c87105.f22113, i);
            c8740.m13937(c87104.f22113, iM13834);
            c8708.f22076 = 2;
            c8708.f22103 = i;
            int i2 = iM13834 - i;
            c8708.f22037 = i2;
            int i3 = c8708.f22089;
            if (i2 < i3) {
                c8708.f22037 = i3;
            }
        }
        if (constraintWidget$DimensionBehaviourArr2[1] == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviourArr[1] != ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i4 = c87103.f22112;
        int iM13838 = c8707.m13838() - c87102.f22112;
        c87103.f22113 = c8740.m13950(c87103);
        c87102.f22113 = c8740.m13950(c87102);
        c8740.m13937(c87103.f22113, i4);
        c8740.m13937(c87102.f22113, iM13838);
        if (c8708.f22101 > 0 || c8708.f22084 == 8) {
            C8738 c8738M13950 = c8740.m13950(c8710);
            c8710.f22113 = c8738M13950;
            c8740.m13937(c8738M13950, c8708.f22101 + i4);
        }
        c8708.f22077 = 2;
        c8708.f22100 = i4;
        int i5 = iM13838 - i4;
        c8708.f22099 = i5;
        int i6 = c8708.f22088;
        if (i5 < i6) {
            c8708.f22099 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m13869(C8707 c8707, C8740 c8740, ArrayList arrayList, int i) {
        int i2;
        C8711[] c8711Arr;
        int i3;
        int i4;
        C8710[] c8710Arr;
        float f;
        float f2;
        boolean z;
        boolean z2;
        C8708 c8708;
        boolean z3;
        boolean z4;
        int i5;
        C8708 c87082;
        C8740 c87402;
        C8708 c87083;
        C8738 c8738;
        C8710 c8710;
        C8738 c87382;
        C8708 c87084;
        int i6;
        C8710[] c8710Arr2;
        C8710 c87102;
        C8710 c87103;
        C8738 c87383;
        C8738 c87384;
        C8708 c87085;
        C8708 c87086;
        int i7;
        C8738 c87385;
        int size;
        ArrayList arrayList2;
        int i8;
        C8708 c87087;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        C8708 c87088;
        int i11;
        int i12;
        int i13;
        C8710[] c8710Arr3;
        C8708 c87089;
        float f6;
        C8707 c87072 = c8707;
        C8740 c87403 = c8740;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i2 = c87072.f22023;
            c8711Arr = c87072.f22019;
            i3 = 0;
        } else {
            i2 = c87072.f22017;
            c8711Arr = c87072.f22016;
            i3 = 2;
        }
        int i14 = i2;
        C8711[] c8711Arr2 = c8711Arr;
        int i15 = 0;
        while (i15 < i14) {
            C8711 c8711 = c8711Arr2[i15];
            boolean z5 = c8711.f22122;
            C8708 c870810 = c8711.f22119;
            C8710[] c8710Arr4 = c870810.f22039;
            int i16 = 8;
            if (z5) {
                i4 = i15;
                c8710Arr = c8710Arr4;
                f = 0.0f;
            } else {
                int i17 = c8711.f22128;
                int i18 = i17 * 2;
                C8708 c870811 = c870810;
                C8708 c870812 = c870811;
                boolean z6 = false;
                f = 0.0f;
                while (!z6) {
                    c8711.f22129++;
                    C8708[] c8708Arr = c870811.f22094;
                    C8710[] c8710Arr5 = c870811.f22039;
                    c8708Arr[i17] = null;
                    c870811.f22095[i17] = null;
                    if (c870811.f22084 != i16) {
                        c870811.m13841(i17);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                        c8710Arr5[i18].m13843();
                        int i19 = i18 + 1;
                        c8710Arr5[i19].m13843();
                        c8710Arr5[i18].m13843();
                        c8710Arr5[i19].m13843();
                        if (c8711.f22118 == null) {
                            c8711.f22118 = c870811;
                        }
                        c8711.f22116 = c870811;
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = c870811.f22040[i17];
                        if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour) {
                            i12 = i15;
                            int i20 = c870811.f22066[i17];
                            i13 = i17;
                            if (i20 == 0 || i20 == 3 || i20 == 2) {
                                c8711.f22130++;
                                float f7 = c870811.f22092[i13];
                                if (f7 > 0.0f) {
                                    f6 = f7;
                                    c8711.f22127 += f6;
                                } else {
                                    f6 = f7;
                                }
                                c8710Arr3 = c8710Arr4;
                                if (c870811.f22084 != 8 && constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour && (i20 == 0 || i20 == 3)) {
                                    if (f6 < 0.0f) {
                                        c8711.f22120 = true;
                                    } else {
                                        c8711.f22123 = true;
                                    }
                                    if (c8711.f22125 == null) {
                                        c8711.f22125 = new ArrayList();
                                    }
                                    c8711.f22125.add(c870811);
                                }
                                if (c8711.f22114 == null) {
                                    c8711.f22114 = c870811;
                                }
                                C8708 c870813 = c8711.f22126;
                                if (c870813 != null) {
                                    c870813.f22095[i13] = c870811;
                                }
                                c8711.f22126 = c870811;
                            } else {
                                c8710Arr3 = c8710Arr4;
                            }
                            if (i13 == 0) {
                                if (c870811.f22075 == 0 && c870811.f22070 == 0) {
                                    int i21 = c870811.f22071;
                                }
                            } else if (c870811.f22067 == 0 && c870811.f22069 == 0) {
                                int i22 = c870811.f22053;
                            }
                        } else {
                            i12 = i15;
                            i13 = i17;
                            c8710Arr3 = c8710Arr4;
                        }
                    }
                    if (c870812 != c870811) {
                        c870812.f22094[i13] = c870811;
                    }
                    C8710 c87104 = c8710Arr5[i18 + 1].f22105;
                    if (c87104 != null) {
                        c87089 = c87104.f22107;
                        C8710 c87105 = c87089.f22039[i18].f22105;
                        if (c87105 == null || c87105.f22107 != c870811) {
                            c87089 = null;
                        }
                    }
                    if (c87089 == null) {
                        c87089 = c870811;
                        z6 = true;
                    }
                    c870812 = c870811;
                    i17 = i13;
                    c8710Arr4 = c8710Arr3;
                    i16 = 8;
                    c870811 = c87089;
                    i15 = i12;
                }
                i4 = i15;
                int i23 = i17;
                c8710Arr = c8710Arr4;
                C8708 c870814 = c8711.f22118;
                if (c870814 != null) {
                    c870814.f22039[i18].m13843();
                }
                C8708 c870815 = c8711.f22116;
                if (c870815 != null) {
                    c870815.f22039[i18 + 1].m13843();
                }
                c8711.f22117 = c870811;
                if (i23 == 0 && c8711.f22121) {
                    c8711.f22115 = c870811;
                } else {
                    c8711.f22115 = c870810;
                }
                c8711.f22124 = c8711.f22123 && c8711.f22120;
            }
            c8711.f22122 = true;
            if (arrayList3 == null || arrayList3.contains(c870810)) {
                C8708 c870816 = c8711.f22117;
                C8708 c870817 = c8711.f22118;
                C8708 c870818 = c8711.f22116;
                C8708 c870819 = c8711.f22115;
                float f8 = c8711.f22127;
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c87072.f22040;
                C8710[] c8710Arr6 = c87072.f22039;
                boolean z7 = constraintWidget$DimensionBehaviourArr[i] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                if (i == 0) {
                    int i24 = c870819.f22097;
                    boolean z8 = i24 == 0;
                    f2 = f8;
                    z = i24 == 1;
                    z2 = i24 == 2;
                    c8708 = c870810;
                    z3 = z7;
                    z4 = z8;
                } else {
                    f2 = f8;
                    int i25 = c870819.f22093;
                    boolean z9 = i25 == 0;
                    z = i25 == 1;
                    z2 = i25 == 2;
                    c8708 = c870810;
                    z3 = z7;
                    z4 = z9;
                }
                boolean z10 = false;
                while (!z10) {
                    C8710[] c8710Arr7 = c8708.f22039;
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = c8708.f22040;
                    C8710 c87106 = c8710Arr7[i3];
                    int i26 = z2 ? 1 : 4;
                    int iM13843 = c87106.m13843();
                    C8710[] c8710Arr8 = c8710Arr6;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr2[i];
                    boolean z11 = z2;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z12 = constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && c8708.f22066[i] == 0;
                    C8710 c87107 = c87106.f22105;
                    if (c87107 != null && c8708 != c870810) {
                        iM13843 = c87107.m13843() + iM13843;
                    }
                    int i27 = iM13843;
                    if (z11 && c8708 != c870810 && c8708 != c870817) {
                        i26 = 8;
                    }
                    C8708 c870820 = c870810;
                    C8710 c87108 = c87106.f22105;
                    if (c87108 != null) {
                        C8738 c87386 = c87106.f22113;
                        C8738 c87387 = c87108.f22113;
                        if (c8708 == c870817) {
                            i10 = i14;
                            c87403.m13935(c87386, c87387, i27, 6);
                        } else {
                            i10 = i14;
                            c87403.m13935(c87386, c87387, i27, 8);
                        }
                        if (z12 && !z11) {
                            i26 = 5;
                        }
                        c87403.m13936(c87106.f22113, c87106.f22105.f22113, i27, (c8708 == c870817 && z11 && c8708.f22041[i]) ? 5 : i26);
                    } else {
                        i10 = i14;
                    }
                    if (z3) {
                        if (c8708.f22084 == 8 || constraintWidget$DimensionBehaviourArr2[i] != constraintWidget$DimensionBehaviour4) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            c87403.m13935(c8710Arr7[i3 + 1].f22113, c8710Arr7[i3].f22113, 0, 5);
                        }
                        c87403.m13935(c8710Arr7[i3].f22113, c8710Arr8[i3].f22113, i11, 8);
                    }
                    C8710 c87109 = c8710Arr7[i3 + 1].f22105;
                    if (c87109 != null) {
                        c87088 = c87109.f22107;
                        C8710 c871010 = c87088.f22039[i3].f22105;
                        if (c871010 == null || c871010.f22107 != c8708) {
                            c87088 = null;
                        }
                    }
                    if (c87088 != null) {
                        c8708 = c87088;
                    } else {
                        z10 = true;
                    }
                    c870810 = c870820;
                    c8710Arr6 = c8710Arr8;
                    z2 = z11;
                    i14 = i10;
                }
                C8710[] c8710Arr9 = c8710Arr6;
                boolean z13 = z2;
                i5 = i14;
                if (c870818 != null) {
                    int i28 = i3 + 1;
                    if (c870816.f22039[i28].f22105 != null) {
                        C8710 c871011 = c870818.f22039[i28];
                        if (c870818.f22040[i] == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && c870818.f22066[i] == 0 && !z13) {
                            C8710 c871012 = c871011.f22105;
                            if (c871012.f22107 == c87072) {
                                c87403.m13936(c871011.f22113, c871012.f22113, -c871011.m13843(), 5);
                            }
                            c87403.m13949(c871011.f22113, c870816.f22039[i28].f22105.f22113, -c871011.m13843(), 6);
                        } else {
                            if (z13) {
                                C8710 c871013 = c871011.f22105;
                                if (c871013.f22107 == c87072) {
                                    c87403.m13936(c871011.f22113, c871013.f22113, -c871011.m13843(), 4);
                                }
                            }
                            c87403.m13949(c871011.f22113, c870816.f22039[i28].f22105.f22113, -c871011.m13843(), 6);
                        }
                    }
                    if (z3) {
                        int i29 = i3 + 1;
                        C8738 c87388 = c8710Arr9[i29].f22113;
                        C8710 c871014 = c870816.f22039[i29];
                        c87403.m13935(c87388, c871014.f22113, c871014.m13843(), 8);
                    }
                    ArrayList arrayList4 = c8711.f22125;
                    if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                        if (c8711.f22120 && !c8711.f22124) {
                            f2 = c8711.f22130;
                        }
                        C8708 c870821 = null;
                        float f9 = f;
                        int i30 = 0;
                        while (i30 < size) {
                            C8708 c870822 = (C8708) arrayList4.get(i30);
                            float[] fArr = c870822.f22092;
                            C8710[] c8710Arr10 = c870822.f22039;
                            float f10 = fArr[i];
                            if (f10 >= f) {
                                arrayList2 = arrayList4;
                                if (f10 != f) {
                                    f5 = f9;
                                    c87403.m13936(c8710Arr10[i3 + 1].f22113, c8710Arr10[i3].f22113, 0, 8);
                                    i8 = size;
                                    f4 = f;
                                    f9 = f5;
                                    i9 = i30;
                                } else {
                                    float f11 = f9;
                                    if (c870821 != null) {
                                        C8710[] c8710Arr11 = c870821.f22039;
                                        C8738 c87389 = c8710Arr11[i3].f22113;
                                        int i31 = i3 + 1;
                                        C8738 c873810 = c8710Arr11[i31].f22113;
                                        C8738 c873811 = c8710Arr10[i3].f22113;
                                        C8738 c873812 = c8710Arr10[i31].f22113;
                                        i8 = size;
                                        C8741 c8741M13951 = c87403.m13951();
                                        c87087 = c870822;
                                        float f12 = f;
                                        c8741M13951.f22262 = f12;
                                        f4 = f12;
                                        if (f2 == f12 || f11 == f10) {
                                            i9 = i30;
                                            f3 = f10;
                                            c8741M13951.f22260.m13967(c87389, 1.0f);
                                            c8741M13951.f22260.m13967(c873810, -1.0f);
                                            c8741M13951.f22260.m13967(c873812, 1.0f);
                                            c8741M13951.f22260.m13967(c873811, -1.0f);
                                        } else {
                                            C8742 c8742 = c8741M13951.f22260;
                                            if (f11 == f4) {
                                                i9 = i30;
                                                c8742.m13967(c87389, 1.0f);
                                                c8741M13951.f22260.m13967(c873810, -1.0f);
                                                f3 = f10;
                                            } else {
                                                i9 = i30;
                                                f3 = f10;
                                                if (f10 == f) {
                                                    c8742.m13967(c873811, 1.0f);
                                                    c8741M13951.f22260.m13967(c873812, -1.0f);
                                                } else {
                                                    float f13 = (f11 / f2) / (f3 / f2);
                                                    c8742.m13967(c87389, 1.0f);
                                                    c8741M13951.f22260.m13967(c873810, -1.0f);
                                                    c8741M13951.f22260.m13967(c873812, f13);
                                                    c8741M13951.f22260.m13967(c873811, -f13);
                                                }
                                            }
                                        }
                                        c87403.m13938(c8741M13951);
                                    } else {
                                        i8 = size;
                                        c87087 = c870822;
                                        f3 = f10;
                                        f4 = f;
                                        i9 = i30;
                                    }
                                    c870821 = c87087;
                                    f9 = f3;
                                }
                            } else if (c8711.f22124) {
                                arrayList2 = arrayList4;
                                c87403.m13936(c8710Arr10[i3 + 1].f22113, c8710Arr10[i3].f22113, 0, 4);
                                f5 = f9;
                                i8 = size;
                                f4 = f;
                                f9 = f5;
                                i9 = i30;
                            } else {
                                f10 = 1.0f;
                                arrayList2 = arrayList4;
                                if (f10 != f) {
                                }
                            }
                            i30 = i9 + 1;
                            arrayList4 = arrayList2;
                            size = i8;
                            f = f4;
                        }
                    }
                    if (c870817 == null || !(c870817 == c870818 || z13)) {
                        c87082 = c870818;
                        if (z4 && c870817 != null) {
                            int i32 = c8711.f22130;
                            boolean z14 = i32 > 0 && c8711.f22129 == i32;
                            C8708 c870823 = c870817;
                            C8708 c870824 = c870823;
                            while (true) {
                                C8710[] c8710Arr12 = c870824.f22039;
                                if (c870823 == null) {
                                    break;
                                }
                                C8710[] c8710Arr13 = c870823.f22039;
                                C8708 c870825 = c870823.f22094[i];
                                while (true) {
                                    if (c870825 == null) {
                                        i6 = 8;
                                        break;
                                    }
                                    i6 = 8;
                                    if (c870825.f22084 != 8) {
                                        break;
                                    } else {
                                        c870825 = c870825.f22094[i];
                                    }
                                }
                                if (c870825 != null || c870823 == c87082) {
                                    C8710 c871015 = c8710Arr13[i3];
                                    C8738 c873813 = c871015.f22113;
                                    C8710 c871016 = c871015.f22105;
                                    C8738 c873814 = c871016 != null ? c871016.f22113 : null;
                                    if (c870824 != c870823) {
                                        c873814 = c8710Arr12[i3 + 1].f22113;
                                    } else if (c870823 == c870817) {
                                        C8710 c871017 = c8710Arr[i3].f22105;
                                        c873814 = c871017 != null ? c871017.f22113 : null;
                                    }
                                    int iM138432 = c871015.m13843();
                                    int i33 = i3 + 1;
                                    int iM138433 = c8710Arr13[i33].m13843();
                                    if (c870825 != null) {
                                        c87102 = c870825.f22039[i3];
                                        c8710Arr2 = c8710Arr12;
                                        c87384 = c87102.f22113;
                                    } else {
                                        c8710Arr2 = c8710Arr12;
                                        c87102 = c870816.f22039[i33].f22105;
                                        if (c87102 != null) {
                                            c87384 = c87102.f22113;
                                        } else {
                                            c87103 = c87102;
                                            c87383 = null;
                                            C8738 c873815 = c8710Arr13[i33].f22113;
                                            if (c87103 != null) {
                                                iM138433 += c87103.m13843();
                                            }
                                            int iM138434 = c8710Arr2[i33].m13843() + iM138432;
                                            if (c873813 != null || c873814 == null || c87383 == null || c873815 == null) {
                                                c87085 = c870825;
                                                c87086 = c870824;
                                                i7 = 8;
                                            } else {
                                                if (c870823 == c870817) {
                                                    iM138434 = c870817.f22039[i3].m13843();
                                                }
                                                int i34 = iM138434;
                                                if (c870823 == c87082) {
                                                    iM138433 = c87082.f22039[i33].m13843();
                                                }
                                                c87085 = c870825;
                                                c87086 = c870824;
                                                i7 = 8;
                                                c8740.m13939(c873813, c873814, i34, 0.5f, c87383, c873815, iM138433, z14 ? 8 : 5);
                                            }
                                        }
                                    }
                                    C8710 c871018 = c87102;
                                    c87383 = c87384;
                                    c87103 = c871018;
                                    C8738 c8738152 = c8710Arr13[i33].f22113;
                                    if (c87103 != null) {
                                    }
                                    int iM1384342 = c8710Arr2[i33].m13843() + iM138432;
                                    if (c873813 != null) {
                                        c87085 = c870825;
                                        c87086 = c870824;
                                        i7 = 8;
                                    }
                                } else {
                                    c87085 = c870825;
                                    c87086 = c870824;
                                    i7 = i6;
                                }
                                if (c870823.f22084 != i7) {
                                    c87086 = c870823;
                                }
                                c870823 = c87085;
                                c870824 = c87086;
                            }
                        } else {
                            int i35 = 8;
                            if (z && c870817 != null) {
                                int i36 = c8711.f22130;
                                boolean z15 = i36 > 0 && c8711.f22129 == i36;
                                C8708 c870826 = c870817;
                                C8708 c870827 = c870826;
                                while (true) {
                                    C8710[] c8710Arr14 = c870826.f22039;
                                    if (c870827 == null) {
                                        break;
                                    }
                                    C8710[] c8710Arr15 = c870827.f22039;
                                    C8708 c870828 = c870827.f22094[i];
                                    while (c870828 != null && c870828.f22084 == i35) {
                                        c870828 = c870828.f22094[i];
                                    }
                                    if (c870827 == c870817 || c870827 == c87082 || c870828 == null) {
                                        c87083 = c870826;
                                    } else {
                                        if (c870828 == c87082) {
                                            c870828 = null;
                                        }
                                        C8710 c871019 = c8710Arr15[i3];
                                        C8738 c873816 = c871019.f22113;
                                        int i37 = i3 + 1;
                                        C8738 c873817 = c8710Arr14[i37].f22113;
                                        int iM138435 = c871019.m13843();
                                        int iM138436 = c8710Arr15[i37].m13843();
                                        if (c870828 != null) {
                                            c8710 = c870828.f22039[i3];
                                            c8738 = c8710.f22113;
                                            c87083 = c870826;
                                            C8710 c871020 = c8710.f22105;
                                            c87382 = c871020 != null ? c871020.f22113 : null;
                                        } else {
                                            c87083 = c870826;
                                            C8710 c871021 = c87082.f22039[i3];
                                            c8738 = c871021 != null ? c871021.f22113 : null;
                                            C8738 c873818 = c8710Arr15[i37].f22113;
                                            c8710 = c871021;
                                            c87382 = c873818;
                                        }
                                        if (c8710 != null) {
                                            iM138436 += c8710.m13843();
                                        }
                                        int iM138437 = c8710Arr14[i37].m13843() + iM138435;
                                        int i38 = z15 ? 8 : 4;
                                        if (c873816 == null || c873817 == null || c8738 == null || c87382 == null) {
                                            c87084 = c870828;
                                        } else {
                                            C8738 c873819 = c8738;
                                            c87084 = c870828;
                                            c8740.m13939(c873816, c873817, iM138437, 0.5f, c873819, c87382, iM138436, i38);
                                        }
                                        c870828 = c87084;
                                    }
                                    i35 = 8;
                                    if (c870827.f22084 != 8) {
                                        c87083 = c870827;
                                    }
                                    c870827 = c870828;
                                    c870826 = c87083;
                                }
                                c87402 = c8740;
                                C8710 c871022 = c870817.f22039[i3];
                                C8710 c871023 = c8710Arr[i3].f22105;
                                int i39 = i3 + 1;
                                C8710 c871024 = c87082.f22039[i39];
                                C8710 c871025 = c870816.f22039[i39].f22105;
                                if (c871023 != null) {
                                    if (c870817 != c87082) {
                                        c87402.m13936(c871022.f22113, c871023.f22113, c871022.m13843(), 5);
                                    } else if (c871025 != null) {
                                        c87402.m13939(c871022.f22113, c871023.f22113, c871022.m13843(), 0.5f, c871024.f22113, c871025.f22113, c871024.m13843(), 5);
                                    }
                                }
                                if (c871025 != null && c870817 != c87082) {
                                    c87402.m13936(c871024.f22113, c871025.f22113, -c871024.m13843(), 5);
                                }
                            }
                            if ((z4 || z) && c870817 != null && c870817 != c87082) {
                                C8710[] c8710Arr16 = c870817.f22039;
                                C8710 c871026 = c8710Arr16[i3];
                                if (c87082 == null) {
                                    c87082 = c870817;
                                }
                                C8710[] c8710Arr17 = c87082.f22039;
                                int i40 = i3 + 1;
                                C8710 c871027 = c8710Arr17[i40];
                                C8710 c871028 = c871026.f22105;
                                c87385 = c871028 != null ? c871028.f22113 : null;
                                C8710 c871029 = c871027.f22105;
                                C8738 c873820 = c871029 != null ? c871029.f22113 : null;
                                if (c870816 != c87082) {
                                    C8710 c871030 = c870816.f22039[i40].f22105;
                                    c873820 = c871030 != null ? c871030.f22113 : null;
                                }
                                if (c870817 == c87082) {
                                    c871027 = c8710Arr16[i40];
                                }
                                if (c87385 != null && c873820 != null) {
                                    c87402.m13939(c871026.f22113, c87385, c871026.m13843(), 0.5f, c873820, c871027.f22113, c8710Arr17[i40].m13843(), 5);
                                }
                            }
                        }
                    } else {
                        C8710 c871031 = c8710Arr[i3];
                        int i41 = i3 + 1;
                        C8710 c871032 = c870816.f22039[i41];
                        C8710 c871033 = c871031.f22105;
                        C8738 c873821 = c871033 != null ? c871033.f22113 : null;
                        C8710 c871034 = c871032.f22105;
                        C8738 c873822 = c871034 != null ? c871034.f22113 : null;
                        C8710 c871035 = c870817.f22039[i3];
                        if (c870818 != null) {
                            c871032 = c870818.f22039[i41];
                        }
                        if (c873821 == null || c873822 == null) {
                            c87082 = c870818;
                        } else {
                            float f14 = i == 0 ? c870819.f22087 : c870819.f22086;
                            int iM138438 = c871035.m13843();
                            int iM138439 = c871032.m13843();
                            C8738 c873823 = c871035.f22113;
                            C8738 c873824 = c871032.f22113;
                            C8738 c873825 = c873821;
                            c87082 = c870818;
                            c87403.m13939(c873823, c873825, iM138438, f14, c873822, c873824, iM138439, 7);
                        }
                    }
                    c87402 = c8740;
                    if (z4) {
                        C8710[] c8710Arr162 = c870817.f22039;
                        C8710 c8710262 = c8710Arr162[i3];
                        if (c87082 == null) {
                        }
                        C8710[] c8710Arr172 = c87082.f22039;
                        int i402 = i3 + 1;
                        C8710 c8710272 = c8710Arr172[i402];
                        C8710 c8710282 = c8710262.f22105;
                        if (c8710282 != null) {
                        }
                        C8710 c8710292 = c8710272.f22105;
                        if (c8710292 != null) {
                        }
                        if (c870816 != c87082) {
                        }
                        if (c870817 == c87082) {
                        }
                        if (c87385 != null) {
                        }
                    } else {
                        C8710[] c8710Arr1622 = c870817.f22039;
                        C8710 c87102622 = c8710Arr1622[i3];
                        if (c87082 == null) {
                        }
                        C8710[] c8710Arr1722 = c87082.f22039;
                        int i4022 = i3 + 1;
                        C8710 c87102722 = c8710Arr1722[i4022];
                        C8710 c87102822 = c87102622.f22105;
                        if (c87102822 != null) {
                        }
                        C8710 c87102922 = c87102722.f22105;
                        if (c87102922 != null) {
                        }
                        if (c870816 != c87082) {
                        }
                        if (c870817 == c87082) {
                        }
                        if (c87385 != null) {
                        }
                    }
                }
            } else {
                i5 = i14;
            }
            i15 = i4 + 1;
            c87072 = c8707;
            c87403 = c8740;
            arrayList3 = arrayList;
            i14 = i5;
        }
    }
}
