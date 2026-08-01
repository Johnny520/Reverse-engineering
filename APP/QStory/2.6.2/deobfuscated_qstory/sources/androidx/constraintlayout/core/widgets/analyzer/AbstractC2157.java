package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashSet;
import p199.C7865;
import p203.AbstractC7885;
import p203.C7877;
import p203.C7878;
import p203.C7880;
import p203.C7888;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2157 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2149 f6374 = new C2149();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m3898(int i, C7865 c7865, C7878 c7878) {
        float f = c7878.f21744;
        C7880 c7880 = c7878.f21712;
        int iM13257 = c7880.f21763.m13257();
        C7880 c78802 = c7878.f21702;
        int iM132572 = c78802.f21763.m13257();
        int iM13256 = c7880.m13256() + iM13257;
        int iM132562 = iM132572 - c78802.m13256();
        if (iM13257 == iM132572) {
            f = 0.5f;
        } else {
            iM13257 = iM13256;
            iM132572 = iM132562;
        }
        int iM13251 = c7878.m13251();
        int i2 = (iM132572 - iM13257) - iM13251;
        if (iM13257 > iM132572) {
            i2 = (iM13257 - iM132572) - iM13251;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iM13257 + i3;
        int i5 = i4 + iM13251;
        if (iM13257 > iM132572) {
            i4 = iM13257 - i3;
            i5 = i4 - iM13251;
        }
        c7878.m13223(i4, i5);
        m3906(i + 1, c7865, c7878);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m3899(int i, C7878 c7878, C7865 c7865, C7878 c78782, boolean z) {
        float f = c78782.f21745;
        C7880 c7880 = c78782.f21713;
        int iM13256 = c7880.m13256() + c7880.f21763.m13257();
        C7880 c78802 = c78782.f21703;
        int iM13257 = c78802.f21763.m13257() - c78802.m13256();
        if (iM13257 >= iM13256) {
            int iM13247 = c78782.m13247();
            if (c78782.f21742 != 8) {
                int i2 = c78782.f21733;
                if (i2 == 2) {
                    iM13247 = (int) (c78782.f21745 * 0.5f * (c7878 instanceof C7877 ? c7878.m13247() : c7878.f21694.m13247()));
                } else if (i2 == 0) {
                    iM13247 = iM13257 - iM13256;
                }
                iM13247 = Math.max(c78782.f21728, iM13247);
                int i3 = c78782.f21729;
                if (i3 > 0) {
                    iM13247 = Math.min(i3, iM13247);
                }
            }
            int i4 = iM13256 + ((int) ((f * ((iM13257 - iM13256) - iM13247)) + 0.5f));
            c78782.m13231(i4, iM13247 + i4);
            m3901(i + 1, c7865, c78782, z);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m3900(int i, C7865 c7865, C7878 c7878, boolean z) {
        float f = c7878.f21745;
        C7880 c7880 = c7878.f21713;
        int iM13257 = c7880.f21763.m13257();
        C7880 c78802 = c7878.f21703;
        int iM132572 = c78802.f21763.m13257();
        int iM13256 = c7880.m13256() + iM13257;
        int iM132562 = iM132572 - c78802.m13256();
        if (iM13257 == iM132572) {
            f = 0.5f;
        } else {
            iM13257 = iM13256;
            iM132572 = iM132562;
        }
        int iM13247 = c7878.m13247();
        int i2 = (iM132572 - iM13257) - iM13247;
        if (iM13257 > iM132572) {
            i2 = (iM13257 - iM132572) - iM13247;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iM13257;
        int i4 = i3 + iM13247;
        if (iM13257 > iM132572) {
            i4 = i3 - iM13247;
        }
        c7878.m13231(i3, i4);
        m3901(i + 1, c7865, c7878, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m3901(int i, C7865 c7865, C7878 c7878, boolean z) {
        C7880 c7880;
        C7880 c78802;
        char c;
        C7880 c78803;
        C7880 c78804;
        if (c7878.f21731) {
            return;
        }
        if (!(c7878 instanceof C7877) && c7878.m13229() && m3903(c7878)) {
            C7877.m13206(c7878, c7865, new C2149());
        }
        C7880 c7880Mo13253 = c7878.mo13253(ConstraintAnchor$Type.LEFT);
        C7880 c7880Mo132532 = c7878.mo13253(ConstraintAnchor$Type.RIGHT);
        int iM13257 = c7880Mo13253.m13257();
        int iM132572 = c7880Mo132532.m13257();
        HashSet<C7880> hashSet = c7880Mo13253.f21768;
        if (hashSet != null && c7880Mo13253.f21766) {
            for (C7880 c78805 : hashSet) {
                C7878 c78782 = c78805.f21765;
                int i2 = i + 1;
                boolean zM3903 = m3903(c78782);
                C7880 c78806 = c78782.f21713;
                C7880 c78807 = c78782.f21703;
                if (c78782.m13229() && zM3903) {
                    c = 0;
                    C7877.m13206(c78782, c7865, new C2149());
                } else {
                    c = 0;
                }
                char c2 = ((c78805 == c78806 && (c78804 = c78807.f21763) != null && c78804.f21766) || (c78805 == c78807 && (c78803 = c78806.f21763) != null && c78803.f21766)) ? (char) 1 : c;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c78782.f21698[c];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 || zM3903) {
                    if (!c78782.m13229()) {
                        if (c78805 == c78806 && c78807.f21763 == null) {
                            int iM13256 = c78806.m13256() + iM13257;
                            c78782.m13231(iM13256, c78782.m13247() + iM13256);
                            m3901(i2, c7865, c78782, z);
                        } else if (c78805 == c78807 && c78806.f21763 == null) {
                            int iM132562 = iM13257 - c78807.m13256();
                            c78782.m13231(iM132562 - c78782.m13247(), iM132562);
                            m3901(i2, c7865, c78782, z);
                        } else if (c2 != 0 && !c78782.m13243()) {
                            m3900(i2, c7865, c78782, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 && c78782.f21729 >= 0 && c78782.f21728 >= 0 && (c78782.f21742 == 8 || (c78782.f21733 == 0 && c78782.f21756 == 0.0f))) {
                    if (!c78782.m13243() && !c78782.f21716 && c2 != 0 && !c78782.m13243()) {
                        m3899(i2, c7878, c7865, c78782, z);
                    }
                }
            }
        }
        if (c7878 instanceof C7888) {
            return;
        }
        HashSet<C7880> hashSet2 = c7880Mo132532.f21768;
        if (hashSet2 != null && c7880Mo132532.f21766) {
            for (C7880 c78808 : hashSet2) {
                C7878 c78783 = c78808.f21765;
                int i3 = i + 1;
                boolean zM39032 = m3903(c78783);
                C7880 c78809 = c78783.f21713;
                C7880 c788010 = c78783.f21703;
                if (c78783.m13229() && zM39032) {
                    C7877.m13206(c78783, c7865, new C2149());
                }
                boolean z2 = (c78808 == c78809 && (c78802 = c788010.f21763) != null && c78802.f21766) || (c78808 == c788010 && (c7880 = c78809.f21763) != null && c7880.f21766);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = c78783.f21698[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour4 || zM39032) {
                    if (!c78783.m13229()) {
                        if (c78808 == c78809 && c788010.f21763 == null) {
                            int iM132563 = c78809.m13256() + iM132572;
                            c78783.m13231(iM132563, c78783.m13247() + iM132563);
                            m3901(i3, c7865, c78783, z);
                        } else if (c78808 == c788010 && c78809.f21763 == null) {
                            int iM132564 = iM132572 - c788010.m13256();
                            c78783.m13231(iM132564 - c78783.m13247(), iM132564);
                            m3901(i3, c7865, c78783, z);
                        } else if (z2 && !c78783.m13243()) {
                            m3900(i3, c7865, c78783, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && c78783.f21729 >= 0 && c78783.f21728 >= 0) {
                    if (c78783.f21742 == 8 || (c78783.f21733 == 0 && c78783.f21756 == 0.0f)) {
                        if (!c78783.m13243() && !c78783.f21716 && z2 && !c78783.m13243()) {
                            m3899(i3, c7878, c7865, c78783, z);
                        }
                    }
                }
            }
        }
        c7878.f21731 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2156 m3902(C7878 c7878, int i, ArrayList arrayList, C2156 c2156) {
        int i2;
        int i3 = i == 0 ? c7878.f21748 : c7878.f21749;
        if (i3 != -1 && (c2156 == null || i3 != c2156.f6372)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C2156 c21562 = (C2156) arrayList.get(i4);
                if (c21562.f6372 == i3) {
                    if (c2156 != null) {
                        c2156.m3895(i, c21562);
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
            if (c7878 instanceof AbstractC7885) {
                AbstractC7885 abstractC7885 = (AbstractC7885) c7878;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC7885.f21847) {
                        i2 = -1;
                        break;
                    }
                    C7878 c78782 = abstractC7885.f21848[i5];
                    if ((i == 0 && (i2 = c78782.f21748) != -1) || (i == 1 && (i2 = c78782.f21749) != -1)) {
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
                        if (c21563.f6372 == i2) {
                            c2156 = c21563;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c2156 == null) {
                c2156 = new C2156();
                c2156.f6373 = new ArrayList();
                c2156.f6370 = null;
                c2156.f6369 = -1;
                int i7 = C2156.f6368;
                C2156.f6368 = i7 + 1;
                c2156.f6372 = i7;
                c2156.f6371 = i;
            }
            arrayList.add(c2156);
        }
        ArrayList arrayList2 = c2156.f6373;
        if (arrayList2.contains(c7878)) {
            return c2156;
        }
        arrayList2.add(c7878);
        if (c7878 instanceof C7888) {
            C7888 c7888 = (C7888) c7878;
            c7888.f21855.m13258(c7888.f21852 == 0 ? 1 : 0, c2156, arrayList);
        }
        int i8 = c2156.f6372;
        if (i == 0) {
            c7878.f21748 = i8;
            c7878.f21713.m13258(i, c2156, arrayList);
            c7878.f21703.m13258(i, c2156, arrayList);
        } else {
            c7878.f21749 = i8;
            c7878.f21712.m13258(i, c2156, arrayList);
            c7878.f21705.m13258(i, c2156, arrayList);
            c7878.f21702.m13258(i, c2156, arrayList);
        }
        c7878.f21701.m13258(i, c2156, arrayList);
        return c2156;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m3903(C7878 c7878) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7878.f21698;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviourArr[1];
        C7878 c78782 = c7878.f21694;
        C7877 c7877 = c78782 != null ? (C7877) c78782 : null;
        if (c7877 != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = c7877.f21698[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        if (c7877 != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = c7877.f21698[1];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z = constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour9 || c7878.mo13228() || constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour3 == (constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) && c7878.f21733 == 0 && c7878.f21756 == 0.0f && c7878.m13240(0)) || (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour2 && c7878.f21733 == 1 && c7878.m13244(0, c7878.m13247()));
        boolean z2 = constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour9 || c7878.mo13227() || constraintWidget$DimensionBehaviour4 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour4 == (constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) && c7878.f21725 == 0 && c7878.f21756 == 0.0f && c7878.m13240(1)) || (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour && c7878.f21725 == 1 && c7878.m13244(1, c7878.m13251()));
        return (c7878.f21756 > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m3904(ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.FIXED;
        return (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour3 == (constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || (constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour6)) || (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour4 == (constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || (constraintWidget$DimensionBehaviour4 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT && constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m3905(int i, C7878 c7878, C7865 c7865, C7878 c78782) {
        float f = c78782.f21744;
        C7880 c7880 = c78782.f21712;
        int iM13256 = c7880.m13256() + c7880.f21763.m13257();
        C7880 c78802 = c78782.f21702;
        int iM13257 = c78802.f21763.m13257() - c78802.m13256();
        if (iM13257 >= iM13256) {
            int iM13251 = c78782.m13251();
            if (c78782.f21742 != 8) {
                int i2 = c78782.f21725;
                if (i2 == 2) {
                    iM13251 = (int) (f * 0.5f * (c7878 instanceof C7877 ? c7878.m13251() : c7878.f21694.m13251()));
                } else if (i2 == 0) {
                    iM13251 = iM13257 - iM13256;
                }
                iM13251 = Math.max(c78782.f21727, iM13251);
                int i3 = c78782.f21711;
                if (i3 > 0) {
                    iM13251 = Math.min(i3, iM13251);
                }
            }
            int i4 = iM13256 + ((int) ((f * ((iM13257 - iM13256) - iM13251)) + 0.5f));
            c78782.m13223(i4, iM13251 + i4);
            m3906(i + 1, c7865, c78782);
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
    public static void m3906(int i, C7865 c7865, C7878 c7878) {
        boolean z;
        C7880 c7880;
        C7880 c78802;
        float f;
        C7880 c78803;
        C7880 c78804;
        if (c7878.f21730) {
            return;
        }
        if (!(c7878 instanceof C7877) && c7878.m13229() && m3903(c7878)) {
            C7877.m13206(c7878, c7865, new C2149());
        }
        C7880 c7880Mo13253 = c7878.mo13253(ConstraintAnchor$Type.TOP);
        C7880 c7880Mo132532 = c7878.mo13253(ConstraintAnchor$Type.BOTTOM);
        int iM13257 = c7880Mo13253.m13257();
        int iM132572 = c7880Mo132532.m13257();
        HashSet<C7880> hashSet = c7880Mo13253.f21768;
        char c = 1;
        if (hashSet != null && c7880Mo13253.f21766) {
            for (C7880 c78805 : hashSet) {
                C7878 c78782 = c78805.f21765;
                int i2 = i + 1;
                boolean zM3903 = m3903(c78782);
                C7880 c78806 = c78782.f21712;
                C7880 c78807 = c78782.f21702;
                if (c78782.m13229() && zM3903) {
                    f = 0.0f;
                    C7877.m13206(c78782, c7865, new C2149());
                } else {
                    f = 0.0f;
                }
                char c2 = ((c78805 == c78806 && (c78804 = c78807.f21763) != null && c78804.f21766) || (c78805 == c78807 && (c78803 = c78806.f21763) != null && c78803.f21766)) ? c : (char) 0;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = c78782.f21698[c];
                char c3 = c;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 || zM3903) {
                    if (!c78782.m13229()) {
                        if (c78805 == c78806 && c78807.f21763 == null) {
                            int iM13256 = c78806.m13256() + iM13257;
                            c78782.m13223(iM13256, c78782.m13251() + iM13256);
                            m3906(i2, c7865, c78782);
                        } else if (c78805 == c78807 && c78806.f21763 == null) {
                            int iM132562 = iM13257 - c78807.m13256();
                            c78782.m13223(iM132562 - c78782.m13251(), iM132562);
                            m3906(i2, c7865, c78782);
                        } else if (c2 != 0 && !c78782.m13230()) {
                            m3898(i2, c7865, c78782);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 && c78782.f21711 >= 0 && c78782.f21727 >= 0 && ((c78782.f21742 == 8 || (c78782.f21725 == 0 && c78782.f21756 == f)) && !c78782.m13230() && !c78782.f21716 && c2 != 0 && !c78782.m13230())) {
                    m3905(i2, c7878, c7865, c78782);
                }
                c = c3;
            }
        }
        ?? r17 = c;
        if (c7878 instanceof C7888) {
            return;
        }
        HashSet<C7880> hashSet2 = c7880Mo132532.f21768;
        if (hashSet2 != null && c7880Mo132532.f21766) {
            for (C7880 c78808 : hashSet2) {
                C7878 c78783 = c78808.f21765;
                int i3 = i + 1;
                boolean zM39032 = m3903(c78783);
                C7880 c78809 = c78783.f21712;
                C7880 c788010 = c78783.f21702;
                if (c78783.m13229() && zM39032) {
                    C7877.m13206(c78783, c7865, new C2149());
                }
                ?? r11 = ((c78808 == c78809 && (c78802 = c788010.f21763) != null && c78802.f21766) || (c78808 == c788010 && (c7880 = c78809.f21763) != null && c7880.f21766)) ? r17 == true ? 1 : 0 : 0;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = c78783.f21698[r17 == true ? 1 : 0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour4 || zM39032) {
                    if (!c78783.m13229()) {
                        if (c78808 == c78809 && c788010.f21763 == null) {
                            int iM132563 = c78809.m13256() + iM132572;
                            c78783.m13223(iM132563, c78783.m13251() + iM132563);
                            m3906(i3, c7865, c78783);
                        } else if (c78808 == c788010 && c78809.f21763 == null) {
                            int iM132564 = iM132572 - c788010.m13256();
                            c78783.m13223(iM132564 - c78783.m13251(), iM132564);
                            m3906(i3, c7865, c78783);
                        } else if (r11 != 0 && !c78783.m13230()) {
                            m3898(i3, c7865, c78783);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && c78783.f21711 >= 0 && c78783.f21727 >= 0 && (c78783.f21742 == 8 || (c78783.f21725 == 0 && c78783.f21756 == 0.0f))) {
                    if (!c78783.m13230() && !c78783.f21716 && r11 != 0 && !c78783.m13230()) {
                        m3905(i3, c7878, c7865, c78783);
                    }
                }
            }
        }
        C7880 c7880Mo132533 = c7878.mo13253(ConstraintAnchor$Type.BASELINE);
        if (c7880Mo132533.f21768 != null && c7880Mo132533.f21766) {
            int iM132573 = c7880Mo132533.m13257();
            for (C7880 c788011 : c7880Mo132533.f21768) {
                C7878 c78784 = c788011.f21765;
                int i4 = i + 1;
                boolean zM39033 = m3903(c78784);
                C7880 c788012 = c78784.f21705;
                if (c78784.m13229() && zM39033) {
                    C7877.m13206(c78784, c7865, new C2149());
                }
                if (c78784.f21698[r17 == true ? 1 : 0] != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || zM39033) {
                    if (!c78784.m13229()) {
                        if (c788011 == c788012) {
                            int iM132565 = c788011.m13256() + iM132573;
                            if (c78784.f21717) {
                                int i5 = iM132565 - c78784.f21759;
                                int i6 = c78784.f21757 + i5;
                                c78784.f21758 = i5;
                                c78784.f21712.m13264(i5);
                                c78784.f21702.m13264(i6);
                                c788012.m13264(iM132565);
                                z = r17 == true ? 1 : 0;
                                c78784.f21739 = z;
                            } else {
                                z = r17 == true ? 1 : 0;
                            }
                            m3906(i4, c7865, c78784);
                        }
                        r17 = z;
                    }
                }
                z = r17 == true ? 1 : 0;
                r17 = z;
            }
        }
        c7878.f21730 = r17;
    }
}
