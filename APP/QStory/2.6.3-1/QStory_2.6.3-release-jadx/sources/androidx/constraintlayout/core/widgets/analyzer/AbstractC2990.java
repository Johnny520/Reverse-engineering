package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashSet;
import p215.C8695;
import p219.AbstractC8715;
import p219.C8707;
import p219.C8708;
import p219.C8710;
import p219.C8718;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2990 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2982 f6720 = new C2982();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m4468(int i, C8695 c8695, C8708 c8708) {
        float f = c8708.f22086;
        C8710 c8710 = c8708.f22054;
        int iM13844 = c8710.f22105.m13844();
        C8710 c87102 = c8708.f22044;
        int iM138442 = c87102.f22105.m13844();
        int iM13843 = c8710.m13843() + iM13844;
        int iM138432 = iM138442 - c87102.m13843();
        if (iM13844 == iM138442) {
            f = 0.5f;
        } else {
            iM13844 = iM13843;
            iM138442 = iM138432;
        }
        int iM13838 = c8708.m13838();
        int i2 = (iM138442 - iM13844) - iM13838;
        if (iM13844 > iM138442) {
            i2 = (iM13844 - iM138442) - iM13838;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iM13844 + i3;
        int i5 = i4 + iM13838;
        if (iM13844 > iM138442) {
            i4 = iM13844 - i3;
            i5 = i4 - iM13838;
        }
        c8708.m13810(i4, i5);
        m4476(i + 1, c8695, c8708);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m4469(int i, C8708 c8708, C8695 c8695, C8708 c87082, boolean z) {
        float f = c87082.f22087;
        C8710 c8710 = c87082.f22055;
        int iM13843 = c8710.m13843() + c8710.f22105.m13844();
        C8710 c87102 = c87082.f22045;
        int iM13844 = c87102.f22105.m13844() - c87102.m13843();
        if (iM13844 >= iM13843) {
            int iM13834 = c87082.m13834();
            if (c87082.f22084 != 8) {
                int i2 = c87082.f22075;
                if (i2 == 2) {
                    iM13834 = (int) (c87082.f22087 * 0.5f * (c8708 instanceof C8707 ? c8708.m13834() : c8708.f22036.m13834()));
                } else if (i2 == 0) {
                    iM13834 = iM13844 - iM13843;
                }
                iM13834 = Math.max(c87082.f22070, iM13834);
                int i3 = c87082.f22071;
                if (i3 > 0) {
                    iM13834 = Math.min(i3, iM13834);
                }
            }
            int i4 = iM13843 + ((int) ((f * ((iM13844 - iM13843) - iM13834)) + 0.5f));
            c87082.m13818(i4, iM13834 + i4);
            m4471(i + 1, c8695, c87082, z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m4470(int i, C8695 c8695, C8708 c8708, boolean z) {
        float f = c8708.f22087;
        C8710 c8710 = c8708.f22055;
        int iM13844 = c8710.f22105.m13844();
        C8710 c87102 = c8708.f22045;
        int iM138442 = c87102.f22105.m13844();
        int iM13843 = c8710.m13843() + iM13844;
        int iM138432 = iM138442 - c87102.m13843();
        if (iM13844 == iM138442) {
            f = 0.5f;
        } else {
            iM13844 = iM13843;
            iM138442 = iM138432;
        }
        int iM13834 = c8708.m13834();
        int i2 = (iM138442 - iM13844) - iM13834;
        if (iM13844 > iM138442) {
            i2 = (iM13844 - iM138442) - iM13834;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iM13844;
        int i4 = i3 + iM13834;
        if (iM13844 > iM138442) {
            i4 = i3 - iM13834;
        }
        c8708.m13818(i3, i4);
        m4471(i + 1, c8695, c8708, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m4471(int i, C8695 c8695, C8708 c8708, boolean z) {
        C8710 c8710;
        C8710 c87102;
        char c;
        C8710 c87103;
        C8710 c87104;
        if (c8708.f22073) {
            return;
        }
        if (!(c8708 instanceof C8707) && c8708.m13816() && m4473(c8708)) {
            C8707.m13793(c8708, c8695, new C2982());
        }
        C8710 c8710Mo13840 = c8708.mo13840(ConstraintAnchor$Type.LEFT);
        C8710 c8710Mo138402 = c8708.mo13840(ConstraintAnchor$Type.RIGHT);
        int iM13844 = c8710Mo13840.m13844();
        int iM138442 = c8710Mo138402.m13844();
        HashSet<C8710> hashSet = c8710Mo13840.f22110;
        if (hashSet != null && c8710Mo13840.f22108) {
            for (C8710 c87105 : hashSet) {
                C8708 c87082 = c87105.f22107;
                int i2 = i + 1;
                boolean zM4473 = m4473(c87082);
                C8710 c87106 = c87082.f22055;
                C8710 c87107 = c87082.f22045;
                if (c87082.m13816() && zM4473) {
                    c = 0;
                    C8707.m13793(c87082, c8695, new C2982());
                } else {
                    c = 0;
                }
                char c2 = ((c87105 == c87106 && (c87104 = c87107.f22105) != null && c87104.f22108) || (c87105 == c87107 && (c87103 = c87106.f22105) != null && c87103.f22108)) ? (char) 1 : c;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c87082.f22040[c];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 || zM4473) {
                    if (!c87082.m13816()) {
                        if (c87105 == c87106 && c87107.f22105 == null) {
                            int iM13843 = c87106.m13843() + iM13844;
                            c87082.m13818(iM13843, c87082.m13834() + iM13843);
                            m4471(i2, c8695, c87082, z);
                        } else if (c87105 == c87107 && c87106.f22105 == null) {
                            int iM138432 = iM13844 - c87107.m13843();
                            c87082.m13818(iM138432 - c87082.m13834(), iM138432);
                            m4471(i2, c8695, c87082, z);
                        } else if (c2 != 0 && !c87082.m13830()) {
                            m4470(i2, c8695, c87082, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 && c87082.f22071 >= 0 && c87082.f22070 >= 0 && (c87082.f22084 == 8 || (c87082.f22075 == 0 && c87082.f22098 == 0.0f))) {
                    if (!c87082.m13830() && !c87082.f22058 && c2 != 0 && !c87082.m13830()) {
                        m4469(i2, c8708, c8695, c87082, z);
                    }
                }
            }
        }
        if (c8708 instanceof C8718) {
            return;
        }
        HashSet<C8710> hashSet2 = c8710Mo138402.f22110;
        if (hashSet2 != null && c8710Mo138402.f22108) {
            for (C8710 c87108 : hashSet2) {
                C8708 c87083 = c87108.f22107;
                int i3 = i + 1;
                boolean zM44732 = m4473(c87083);
                C8710 c87109 = c87083.f22055;
                C8710 c871010 = c87083.f22045;
                if (c87083.m13816() && zM44732) {
                    C8707.m13793(c87083, c8695, new C2982());
                }
                boolean z2 = (c87108 == c87109 && (c87102 = c871010.f22105) != null && c87102.f22108) || (c87108 == c871010 && (c8710 = c87109.f22105) != null && c8710.f22108);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = c87083.f22040[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour4 || zM44732) {
                    if (!c87083.m13816()) {
                        if (c87108 == c87109 && c871010.f22105 == null) {
                            int iM138433 = c87109.m13843() + iM138442;
                            c87083.m13818(iM138433, c87083.m13834() + iM138433);
                            m4471(i3, c8695, c87083, z);
                        } else if (c87108 == c871010 && c87109.f22105 == null) {
                            int iM138434 = iM138442 - c871010.m13843();
                            c87083.m13818(iM138434 - c87083.m13834(), iM138434);
                            m4471(i3, c8695, c87083, z);
                        } else if (z2 && !c87083.m13830()) {
                            m4470(i3, c8695, c87083, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && c87083.f22071 >= 0 && c87083.f22070 >= 0) {
                    if (c87083.f22084 == 8 || (c87083.f22075 == 0 && c87083.f22098 == 0.0f)) {
                        if (!c87083.m13830() && !c87083.f22058 && z2 && !c87083.m13830()) {
                            m4469(i3, c8708, c8695, c87083, z);
                        }
                    }
                }
            }
        }
        c8708.f22073 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2989 m4472(C8708 c8708, int i, ArrayList arrayList, C2989 c2989) {
        int i2;
        int i3 = i == 0 ? c8708.f22090 : c8708.f22091;
        if (i3 != -1 && (c2989 == null || i3 != c2989.f6718)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C2989 c29892 = (C2989) arrayList.get(i4);
                if (c29892.f6718 == i3) {
                    if (c2989 != null) {
                        c2989.m4465(i, c29892);
                        arrayList.remove(c2989);
                    }
                    c2989 = c29892;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c2989;
        }
        if (c2989 == null) {
            if (c8708 instanceof AbstractC8715) {
                AbstractC8715 abstractC8715 = (AbstractC8715) c8708;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC8715.f22189) {
                        i2 = -1;
                        break;
                    }
                    C8708 c87082 = abstractC8715.f22190[i5];
                    if ((i == 0 && (i2 = c87082.f22090) != -1) || (i == 1 && (i2 = c87082.f22091) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C2989 c29893 = (C2989) arrayList.get(i6);
                        if (c29893.f6718 == i2) {
                            c2989 = c29893;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c2989 == null) {
                c2989 = new C2989();
                c2989.f6719 = new ArrayList();
                c2989.f6716 = null;
                c2989.f6715 = -1;
                int i7 = C2989.f6714;
                C2989.f6714 = i7 + 1;
                c2989.f6718 = i7;
                c2989.f6717 = i;
            }
            arrayList.add(c2989);
        }
        ArrayList arrayList2 = c2989.f6719;
        if (arrayList2.contains(c8708)) {
            return c2989;
        }
        arrayList2.add(c8708);
        if (c8708 instanceof C8718) {
            C8718 c8718 = (C8718) c8708;
            c8718.f22197.m13845(c8718.f22194 == 0 ? 1 : 0, c2989, arrayList);
        }
        int i8 = c2989.f6718;
        if (i == 0) {
            c8708.f22090 = i8;
            c8708.f22055.m13845(i, c2989, arrayList);
            c8708.f22045.m13845(i, c2989, arrayList);
        } else {
            c8708.f22091 = i8;
            c8708.f22054.m13845(i, c2989, arrayList);
            c8708.f22047.m13845(i, c2989, arrayList);
            c8708.f22044.m13845(i, c2989, arrayList);
        }
        c8708.f22043.m13845(i, c2989, arrayList);
        return c2989;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m4473(C8708 c8708) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8708.f22040;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviourArr[1];
        C8708 c87082 = c8708.f22036;
        C8707 c8707 = c87082 != null ? (C8707) c87082 : null;
        if (c8707 != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = c8707.f22040[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        if (c8707 != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = c8707.f22040[1];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z = constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour9 || c8708.mo13815() || constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour3 == (constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) && c8708.f22075 == 0 && c8708.f22098 == 0.0f && c8708.m13827(0)) || (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour2 && c8708.f22075 == 1 && c8708.m13831(0, c8708.m13834()));
        boolean z2 = constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour9 || c8708.mo13814() || constraintWidget$DimensionBehaviour4 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour4 == (constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) && c8708.f22067 == 0 && c8708.f22098 == 0.0f && c8708.m13827(1)) || (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour && c8708.f22067 == 1 && c8708.m13831(1, c8708.m13838()));
        return (c8708.f22098 > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m4474(ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.FIXED;
        return (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour3 == (constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || (constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour6)) || (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour4 == (constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || (constraintWidget$DimensionBehaviour4 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m4475(int i, C8708 c8708, C8695 c8695, C8708 c87082) {
        float f = c87082.f22086;
        C8710 c8710 = c87082.f22054;
        int iM13843 = c8710.m13843() + c8710.f22105.m13844();
        C8710 c87102 = c87082.f22044;
        int iM13844 = c87102.f22105.m13844() - c87102.m13843();
        if (iM13844 >= iM13843) {
            int iM13838 = c87082.m13838();
            if (c87082.f22084 != 8) {
                int i2 = c87082.f22067;
                if (i2 == 2) {
                    iM13838 = (int) (f * 0.5f * (c8708 instanceof C8707 ? c8708.m13838() : c8708.f22036.m13838()));
                } else if (i2 == 0) {
                    iM13838 = iM13844 - iM13843;
                }
                iM13838 = Math.max(c87082.f22069, iM13838);
                int i3 = c87082.f22053;
                if (i3 > 0) {
                    iM13838 = Math.min(i3, iM13838);
                }
            }
            int i4 = iM13843 + ((int) ((f * ((iM13844 - iM13843) - iM13838)) + 0.5f));
            c87082.m13810(i4, iM13838 + i4);
            m4476(i + 1, c8695, c87082);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m4476(int i, C8695 c8695, C8708 c8708) {
        boolean z;
        C8710 c8710;
        C8710 c87102;
        float f;
        C8710 c87103;
        C8710 c87104;
        if (c8708.f22072) {
            return;
        }
        if (!(c8708 instanceof C8707) && c8708.m13816() && m4473(c8708)) {
            C8707.m13793(c8708, c8695, new C2982());
        }
        C8710 c8710Mo13840 = c8708.mo13840(ConstraintAnchor$Type.TOP);
        C8710 c8710Mo138402 = c8708.mo13840(ConstraintAnchor$Type.BOTTOM);
        int iM13844 = c8710Mo13840.m13844();
        int iM138442 = c8710Mo138402.m13844();
        HashSet<C8710> hashSet = c8710Mo13840.f22110;
        char c = 1;
        if (hashSet != null && c8710Mo13840.f22108) {
            for (C8710 c87105 : hashSet) {
                C8708 c87082 = c87105.f22107;
                int i2 = i + 1;
                boolean zM4473 = m4473(c87082);
                C8710 c87106 = c87082.f22054;
                C8710 c87107 = c87082.f22044;
                if (c87082.m13816() && zM4473) {
                    f = 0.0f;
                    C8707.m13793(c87082, c8695, new C2982());
                } else {
                    f = 0.0f;
                }
                char c2 = ((c87105 == c87106 && (c87104 = c87107.f22105) != null && c87104.f22108) || (c87105 == c87107 && (c87103 = c87106.f22105) != null && c87103.f22108)) ? c : (char) 0;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c87082.f22040[c];
                char c3 = c;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 || zM4473) {
                    if (!c87082.m13816()) {
                        if (c87105 == c87106 && c87107.f22105 == null) {
                            int iM13843 = c87106.m13843() + iM13844;
                            c87082.m13810(iM13843, c87082.m13838() + iM13843);
                            m4476(i2, c8695, c87082);
                        } else if (c87105 == c87107 && c87106.f22105 == null) {
                            int iM138432 = iM13844 - c87107.m13843();
                            c87082.m13810(iM138432 - c87082.m13838(), iM138432);
                            m4476(i2, c8695, c87082);
                        } else if (c2 != 0 && !c87082.m13817()) {
                            m4468(i2, c8695, c87082);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 && c87082.f22053 >= 0 && c87082.f22069 >= 0 && ((c87082.f22084 == 8 || (c87082.f22067 == 0 && c87082.f22098 == f)) && !c87082.m13817() && !c87082.f22058 && c2 != 0 && !c87082.m13817())) {
                    m4475(i2, c8708, c8695, c87082);
                }
                c = c3;
            }
        }
        ?? r17 = c;
        if (c8708 instanceof C8718) {
            return;
        }
        HashSet<C8710> hashSet2 = c8710Mo138402.f22110;
        if (hashSet2 != null && c8710Mo138402.f22108) {
            for (C8710 c87108 : hashSet2) {
                C8708 c87083 = c87108.f22107;
                int i3 = i + 1;
                boolean zM44732 = m4473(c87083);
                C8710 c87109 = c87083.f22054;
                C8710 c871010 = c87083.f22044;
                if (c87083.m13816() && zM44732) {
                    C8707.m13793(c87083, c8695, new C2982());
                }
                ?? r11 = ((c87108 == c87109 && (c87102 = c871010.f22105) != null && c87102.f22108) || (c87108 == c871010 && (c8710 = c87109.f22105) != null && c8710.f22108)) ? r17 == true ? 1 : 0 : 0;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = c87083.f22040[r17 == true ? 1 : 0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour4 || zM44732) {
                    if (!c87083.m13816()) {
                        if (c87108 == c87109 && c871010.f22105 == null) {
                            int iM138433 = c87109.m13843() + iM138442;
                            c87083.m13810(iM138433, c87083.m13838() + iM138433);
                            m4476(i3, c8695, c87083);
                        } else if (c87108 == c871010 && c87109.f22105 == null) {
                            int iM138434 = iM138442 - c871010.m13843();
                            c87083.m13810(iM138434 - c87083.m13838(), iM138434);
                            m4476(i3, c8695, c87083);
                        } else if (r11 != 0 && !c87083.m13817()) {
                            m4468(i3, c8695, c87083);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && c87083.f22053 >= 0 && c87083.f22069 >= 0 && (c87083.f22084 == 8 || (c87083.f22067 == 0 && c87083.f22098 == 0.0f))) {
                    if (!c87083.m13817() && !c87083.f22058 && r11 != 0 && !c87083.m13817()) {
                        m4475(i3, c8708, c8695, c87083);
                    }
                }
            }
        }
        C8710 c8710Mo138403 = c8708.mo13840(ConstraintAnchor$Type.BASELINE);
        if (c8710Mo138403.f22110 != null && c8710Mo138403.f22108) {
            int iM138443 = c8710Mo138403.m13844();
            for (C8710 c871011 : c8710Mo138403.f22110) {
                C8708 c87084 = c871011.f22107;
                int i4 = i + 1;
                boolean zM44733 = m4473(c87084);
                C8710 c871012 = c87084.f22047;
                if (c87084.m13816() && zM44733) {
                    C8707.m13793(c87084, c8695, new C2982());
                }
                if (c87084.f22040[r17 == true ? 1 : 0] != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || zM44733) {
                    if (!c87084.m13816()) {
                        if (c871011 == c871012) {
                            int iM138435 = c871011.m13843() + iM138443;
                            if (c87084.f22059) {
                                int i5 = iM138435 - c87084.f22101;
                                int i6 = c87084.f22099 + i5;
                                c87084.f22100 = i5;
                                c87084.f22054.m13851(i5);
                                c87084.f22044.m13851(i6);
                                c871012.m13851(iM138435);
                                z = r17 == true ? 1 : 0;
                                c87084.f22081 = z;
                            } else {
                                z = r17 == true ? 1 : 0;
                            }
                            m4476(i4, c8695, c87084);
                        }
                        r17 = z;
                    }
                }
                z = r17 == true ? 1 : 0;
                r17 = z;
            }
        }
        c8708.f22072 = r17;
    }
}
