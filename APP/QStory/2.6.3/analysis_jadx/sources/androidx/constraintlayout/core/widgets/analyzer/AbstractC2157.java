package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashSet;
import p199.C7866;
import p203.AbstractC7886;
import p203.C7878;
import p203.C7879;
import p203.C7881;
import p203.C7889;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2157 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2149 f6375 = new C2149();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m3908(int i, C7866 c7866, C7879 c7879) {
        float f = c7879.f21741;
        C7881 c7881 = c7879.f21709;
        int iM13285 = c7881.f21760.m13285();
        C7881 c78812 = c7879.f21699;
        int iM132852 = c78812.f21760.m13285();
        int iM13284 = c7881.m13284() + iM13285;
        int iM132842 = iM132852 - c78812.m13284();
        if (iM13285 == iM132852) {
            f = 0.5f;
        } else {
            iM13285 = iM13284;
            iM132852 = iM132842;
        }
        int iM13279 = c7879.m13279();
        int i2 = (iM132852 - iM13285) - iM13279;
        if (iM13285 > iM132852) {
            i2 = (iM13285 - iM132852) - iM13279;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iM13285 + i3;
        int i5 = i4 + iM13279;
        if (iM13285 > iM132852) {
            i4 = iM13285 - i3;
            i5 = i4 - iM13279;
        }
        c7879.m13251(i4, i5);
        m3916(i + 1, c7866, c7879);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m3909(int i, C7879 c7879, C7866 c7866, C7879 c78792, boolean z) {
        float f = c78792.f21742;
        C7881 c7881 = c78792.f21710;
        int iM13284 = c7881.m13284() + c7881.f21760.m13285();
        C7881 c78812 = c78792.f21700;
        int iM13285 = c78812.f21760.m13285() - c78812.m13284();
        if (iM13285 >= iM13284) {
            int iM13275 = c78792.m13275();
            if (c78792.f21739 != 8) {
                int i2 = c78792.f21730;
                if (i2 == 2) {
                    iM13275 = (int) (c78792.f21742 * 0.5f * (c7879 instanceof C7878 ? c7879.m13275() : c7879.f21691.m13275()));
                } else if (i2 == 0) {
                    iM13275 = iM13285 - iM13284;
                }
                iM13275 = Math.max(c78792.f21725, iM13275);
                int i3 = c78792.f21726;
                if (i3 > 0) {
                    iM13275 = Math.min(i3, iM13275);
                }
            }
            int i4 = iM13284 + ((int) ((f * ((iM13285 - iM13284) - iM13275)) + 0.5f));
            c78792.m13259(i4, iM13275 + i4);
            m3911(i + 1, c7866, c78792, z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m3910(int i, C7866 c7866, C7879 c7879, boolean z) {
        float f = c7879.f21742;
        C7881 c7881 = c7879.f21710;
        int iM13285 = c7881.f21760.m13285();
        C7881 c78812 = c7879.f21700;
        int iM132852 = c78812.f21760.m13285();
        int iM13284 = c7881.m13284() + iM13285;
        int iM132842 = iM132852 - c78812.m13284();
        if (iM13285 == iM132852) {
            f = 0.5f;
        } else {
            iM13285 = iM13284;
            iM132852 = iM132842;
        }
        int iM13275 = c7879.m13275();
        int i2 = (iM132852 - iM13285) - iM13275;
        if (iM13285 > iM132852) {
            i2 = (iM13285 - iM132852) - iM13275;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iM13285;
        int i4 = i3 + iM13275;
        if (iM13285 > iM132852) {
            i4 = i3 - iM13275;
        }
        c7879.m13259(i3, i4);
        m3911(i + 1, c7866, c7879, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m3911(int i, C7866 c7866, C7879 c7879, boolean z) {
        C7881 c7881;
        C7881 c78812;
        char c;
        C7881 c78813;
        C7881 c78814;
        if (c7879.f21728) {
            return;
        }
        if (!(c7879 instanceof C7878) && c7879.m13257() && m3913(c7879)) {
            C7878.m13234(c7879, c7866, new C2149());
        }
        C7881 c7881Mo13281 = c7879.mo13281(ConstraintAnchor$Type.LEFT);
        C7881 c7881Mo132812 = c7879.mo13281(ConstraintAnchor$Type.RIGHT);
        int iM13285 = c7881Mo13281.m13285();
        int iM132852 = c7881Mo132812.m13285();
        HashSet<C7881> hashSet = c7881Mo13281.f21765;
        if (hashSet != null && c7881Mo13281.f21763) {
            for (C7881 c78815 : hashSet) {
                C7879 c78792 = c78815.f21762;
                int i2 = i + 1;
                boolean zM3913 = m3913(c78792);
                C7881 c78816 = c78792.f21710;
                C7881 c78817 = c78792.f21700;
                if (c78792.m13257() && zM3913) {
                    c = 0;
                    C7878.m13234(c78792, c7866, new C2149());
                } else {
                    c = 0;
                }
                char c2 = ((c78815 == c78816 && (c78814 = c78817.f21760) != null && c78814.f21763) || (c78815 == c78817 && (c78813 = c78816.f21760) != null && c78813.f21763)) ? (char) 1 : c;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c78792.f21695[c];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 || zM3913) {
                    if (!c78792.m13257()) {
                        if (c78815 == c78816 && c78817.f21760 == null) {
                            int iM13284 = c78816.m13284() + iM13285;
                            c78792.m13259(iM13284, c78792.m13275() + iM13284);
                            m3911(i2, c7866, c78792, z);
                        } else if (c78815 == c78817 && c78816.f21760 == null) {
                            int iM132842 = iM13285 - c78817.m13284();
                            c78792.m13259(iM132842 - c78792.m13275(), iM132842);
                            m3911(i2, c7866, c78792, z);
                        } else if (c2 != 0 && !c78792.m13271()) {
                            m3910(i2, c7866, c78792, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 && c78792.f21726 >= 0 && c78792.f21725 >= 0 && (c78792.f21739 == 8 || (c78792.f21730 == 0 && c78792.f21753 == 0.0f))) {
                    if (!c78792.m13271() && !c78792.f21713 && c2 != 0 && !c78792.m13271()) {
                        m3909(i2, c7879, c7866, c78792, z);
                    }
                }
            }
        }
        if (c7879 instanceof C7889) {
            return;
        }
        HashSet<C7881> hashSet2 = c7881Mo132812.f21765;
        if (hashSet2 != null && c7881Mo132812.f21763) {
            for (C7881 c78818 : hashSet2) {
                C7879 c78793 = c78818.f21762;
                int i3 = i + 1;
                boolean zM39132 = m3913(c78793);
                C7881 c78819 = c78793.f21710;
                C7881 c788110 = c78793.f21700;
                if (c78793.m13257() && zM39132) {
                    C7878.m13234(c78793, c7866, new C2149());
                }
                boolean z2 = (c78818 == c78819 && (c78812 = c788110.f21760) != null && c78812.f21763) || (c78818 == c788110 && (c7881 = c78819.f21760) != null && c7881.f21763);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = c78793.f21695[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour4 || zM39132) {
                    if (!c78793.m13257()) {
                        if (c78818 == c78819 && c788110.f21760 == null) {
                            int iM132843 = c78819.m13284() + iM132852;
                            c78793.m13259(iM132843, c78793.m13275() + iM132843);
                            m3911(i3, c7866, c78793, z);
                        } else if (c78818 == c788110 && c78819.f21760 == null) {
                            int iM132844 = iM132852 - c788110.m13284();
                            c78793.m13259(iM132844 - c78793.m13275(), iM132844);
                            m3911(i3, c7866, c78793, z);
                        } else if (z2 && !c78793.m13271()) {
                            m3910(i3, c7866, c78793, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && c78793.f21726 >= 0 && c78793.f21725 >= 0) {
                    if (c78793.f21739 == 8 || (c78793.f21730 == 0 && c78793.f21753 == 0.0f)) {
                        if (!c78793.m13271() && !c78793.f21713 && z2 && !c78793.m13271()) {
                            m3909(i3, c7879, c7866, c78793, z);
                        }
                    }
                }
            }
        }
        c7879.f21728 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2156 m3912(C7879 c7879, int i, ArrayList arrayList, C2156 c2156) {
        int i2;
        int i3 = i == 0 ? c7879.f21745 : c7879.f21746;
        if (i3 != -1 && (c2156 == null || i3 != c2156.f6373)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C2156 c21562 = (C2156) arrayList.get(i4);
                if (c21562.f6373 == i3) {
                    if (c2156 != null) {
                        c2156.m3905(i, c21562);
                        arrayList.remove(c2156);
                    }
                    c2156 = c21562;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c2156;
        }
        if (c2156 == null) {
            if (c7879 instanceof AbstractC7886) {
                AbstractC7886 abstractC7886 = (AbstractC7886) c7879;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC7886.f21844) {
                        i2 = -1;
                        break;
                    }
                    C7879 c78792 = abstractC7886.f21845[i5];
                    if ((i == 0 && (i2 = c78792.f21745) != -1) || (i == 1 && (i2 = c78792.f21746) != -1)) {
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
                        C2156 c21563 = (C2156) arrayList.get(i6);
                        if (c21563.f6373 == i2) {
                            c2156 = c21563;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c2156 == null) {
                c2156 = new C2156();
                c2156.f6374 = new ArrayList();
                c2156.f6371 = null;
                c2156.f6370 = -1;
                int i7 = C2156.f6369;
                C2156.f6369 = i7 + 1;
                c2156.f6373 = i7;
                c2156.f6372 = i;
            }
            arrayList.add(c2156);
        }
        ArrayList arrayList2 = c2156.f6374;
        if (arrayList2.contains(c7879)) {
            return c2156;
        }
        arrayList2.add(c7879);
        if (c7879 instanceof C7889) {
            C7889 c7889 = (C7889) c7879;
            c7889.f21852.m13286(c7889.f21849 == 0 ? 1 : 0, c2156, arrayList);
        }
        int i8 = c2156.f6373;
        if (i == 0) {
            c7879.f21745 = i8;
            c7879.f21710.m13286(i, c2156, arrayList);
            c7879.f21700.m13286(i, c2156, arrayList);
        } else {
            c7879.f21746 = i8;
            c7879.f21709.m13286(i, c2156, arrayList);
            c7879.f21702.m13286(i, c2156, arrayList);
            c7879.f21699.m13286(i, c2156, arrayList);
        }
        c7879.f21698.m13286(i, c2156, arrayList);
        return c2156;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m3913(C7879 c7879) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7879.f21695;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviourArr[1];
        C7879 c78792 = c7879.f21691;
        C7878 c7878 = c78792 != null ? (C7878) c78792 : null;
        if (c7878 != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = c7878.f21695[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        if (c7878 != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = c7878.f21695[1];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z = constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour9 || c7879.mo13256() || constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour3 == (constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) && c7879.f21730 == 0 && c7879.f21753 == 0.0f && c7879.m13268(0)) || (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour2 && c7879.f21730 == 1 && c7879.m13272(0, c7879.m13275()));
        boolean z2 = constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour9 || c7879.mo13255() || constraintWidget$DimensionBehaviour4 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour4 == (constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) && c7879.f21722 == 0 && c7879.f21753 == 0.0f && c7879.m13268(1)) || (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour && c7879.f21722 == 1 && c7879.m13272(1, c7879.m13279()));
        return (c7879.f21753 > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m3914(ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.FIXED;
        return (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour3 == (constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || (constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour6)) || (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour4 == (constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || (constraintWidget$DimensionBehaviour4 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m3915(int i, C7879 c7879, C7866 c7866, C7879 c78792) {
        float f = c78792.f21741;
        C7881 c7881 = c78792.f21709;
        int iM13284 = c7881.m13284() + c7881.f21760.m13285();
        C7881 c78812 = c78792.f21699;
        int iM13285 = c78812.f21760.m13285() - c78812.m13284();
        if (iM13285 >= iM13284) {
            int iM13279 = c78792.m13279();
            if (c78792.f21739 != 8) {
                int i2 = c78792.f21722;
                if (i2 == 2) {
                    iM13279 = (int) (f * 0.5f * (c7879 instanceof C7878 ? c7879.m13279() : c7879.f21691.m13279()));
                } else if (i2 == 0) {
                    iM13279 = iM13285 - iM13284;
                }
                iM13279 = Math.max(c78792.f21724, iM13279);
                int i3 = c78792.f21708;
                if (i3 > 0) {
                    iM13279 = Math.min(i3, iM13279);
                }
            }
            int i4 = iM13284 + ((int) ((f * ((iM13285 - iM13284) - iM13279)) + 0.5f));
            c78792.m13251(i4, iM13279 + i4);
            m3916(i + 1, c7866, c78792);
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
    public static void m3916(int i, C7866 c7866, C7879 c7879) {
        boolean z;
        C7881 c7881;
        C7881 c78812;
        float f;
        C7881 c78813;
        C7881 c78814;
        if (c7879.f21727) {
            return;
        }
        if (!(c7879 instanceof C7878) && c7879.m13257() && m3913(c7879)) {
            C7878.m13234(c7879, c7866, new C2149());
        }
        C7881 c7881Mo13281 = c7879.mo13281(ConstraintAnchor$Type.TOP);
        C7881 c7881Mo132812 = c7879.mo13281(ConstraintAnchor$Type.BOTTOM);
        int iM13285 = c7881Mo13281.m13285();
        int iM132852 = c7881Mo132812.m13285();
        HashSet<C7881> hashSet = c7881Mo13281.f21765;
        char c = 1;
        if (hashSet != null && c7881Mo13281.f21763) {
            for (C7881 c78815 : hashSet) {
                C7879 c78792 = c78815.f21762;
                int i2 = i + 1;
                boolean zM3913 = m3913(c78792);
                C7881 c78816 = c78792.f21709;
                C7881 c78817 = c78792.f21699;
                if (c78792.m13257() && zM3913) {
                    f = 0.0f;
                    C7878.m13234(c78792, c7866, new C2149());
                } else {
                    f = 0.0f;
                }
                char c2 = ((c78815 == c78816 && (c78814 = c78817.f21760) != null && c78814.f21763) || (c78815 == c78817 && (c78813 = c78816.f21760) != null && c78813.f21763)) ? c : (char) 0;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c78792.f21695[c];
                char c3 = c;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 || zM3913) {
                    if (!c78792.m13257()) {
                        if (c78815 == c78816 && c78817.f21760 == null) {
                            int iM13284 = c78816.m13284() + iM13285;
                            c78792.m13251(iM13284, c78792.m13279() + iM13284);
                            m3916(i2, c7866, c78792);
                        } else if (c78815 == c78817 && c78816.f21760 == null) {
                            int iM132842 = iM13285 - c78817.m13284();
                            c78792.m13251(iM132842 - c78792.m13279(), iM132842);
                            m3916(i2, c7866, c78792);
                        } else if (c2 != 0 && !c78792.m13258()) {
                            m3908(i2, c7866, c78792);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 && c78792.f21708 >= 0 && c78792.f21724 >= 0 && ((c78792.f21739 == 8 || (c78792.f21722 == 0 && c78792.f21753 == f)) && !c78792.m13258() && !c78792.f21713 && c2 != 0 && !c78792.m13258())) {
                    m3915(i2, c7879, c7866, c78792);
                }
                c = c3;
            }
        }
        ?? r17 = c;
        if (c7879 instanceof C7889) {
            return;
        }
        HashSet<C7881> hashSet2 = c7881Mo132812.f21765;
        if (hashSet2 != null && c7881Mo132812.f21763) {
            for (C7881 c78818 : hashSet2) {
                C7879 c78793 = c78818.f21762;
                int i3 = i + 1;
                boolean zM39132 = m3913(c78793);
                C7881 c78819 = c78793.f21709;
                C7881 c788110 = c78793.f21699;
                if (c78793.m13257() && zM39132) {
                    C7878.m13234(c78793, c7866, new C2149());
                }
                ?? r11 = ((c78818 == c78819 && (c78812 = c788110.f21760) != null && c78812.f21763) || (c78818 == c788110 && (c7881 = c78819.f21760) != null && c7881.f21763)) ? r17 == true ? 1 : 0 : 0;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = c78793.f21695[r17 == true ? 1 : 0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour4 || zM39132) {
                    if (!c78793.m13257()) {
                        if (c78818 == c78819 && c788110.f21760 == null) {
                            int iM132843 = c78819.m13284() + iM132852;
                            c78793.m13251(iM132843, c78793.m13279() + iM132843);
                            m3916(i3, c7866, c78793);
                        } else if (c78818 == c788110 && c78819.f21760 == null) {
                            int iM132844 = iM132852 - c788110.m13284();
                            c78793.m13251(iM132844 - c78793.m13279(), iM132844);
                            m3916(i3, c7866, c78793);
                        } else if (r11 != 0 && !c78793.m13258()) {
                            m3908(i3, c7866, c78793);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && c78793.f21708 >= 0 && c78793.f21724 >= 0 && (c78793.f21739 == 8 || (c78793.f21722 == 0 && c78793.f21753 == 0.0f))) {
                    if (!c78793.m13258() && !c78793.f21713 && r11 != 0 && !c78793.m13258()) {
                        m3915(i3, c7879, c7866, c78793);
                    }
                }
            }
        }
        C7881 c7881Mo132813 = c7879.mo13281(ConstraintAnchor$Type.BASELINE);
        if (c7881Mo132813.f21765 != null && c7881Mo132813.f21763) {
            int iM132853 = c7881Mo132813.m13285();
            for (C7881 c788111 : c7881Mo132813.f21765) {
                C7879 c78794 = c788111.f21762;
                int i4 = i + 1;
                boolean zM39133 = m3913(c78794);
                C7881 c788112 = c78794.f21702;
                if (c78794.m13257() && zM39133) {
                    C7878.m13234(c78794, c7866, new C2149());
                }
                if (c78794.f21695[r17 == true ? 1 : 0] != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || zM39133) {
                    if (!c78794.m13257()) {
                        if (c788111 == c788112) {
                            int iM132845 = c788111.m13284() + iM132853;
                            if (c78794.f21714) {
                                int i5 = iM132845 - c78794.f21756;
                                int i6 = c78794.f21754 + i5;
                                c78794.f21755 = i5;
                                c78794.f21709.m13292(i5);
                                c78794.f21699.m13292(i6);
                                c788112.m13292(iM132845);
                                z = r17 == true ? 1 : 0;
                                c78794.f21736 = z;
                            } else {
                                z = r17 == true ? 1 : 0;
                            }
                            m3916(i4, c7866, c78794);
                        }
                        r17 = z;
                    }
                }
                z = r17 == true ? 1 : 0;
                r17 = z;
            }
        }
        c7879.f21727 = r17;
    }
}
