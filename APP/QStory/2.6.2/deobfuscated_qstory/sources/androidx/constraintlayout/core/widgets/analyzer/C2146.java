package androidx.constraintlayout.core.widgets.analyzer;

import androidx.activity.AbstractC0053;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p199.C7865;
import p203.AbstractC7885;
import p203.C7877;
import p203.C7878;
import p203.C7880;
import p203.C7888;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7865 f6332;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ArrayList f6333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7877 f6334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f6335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f6336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7877 f6337;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ArrayList f6338;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2149 f6339;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3872(C7878 c7878, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, int i, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, int i2) {
        C2149 c2149 = this.f6339;
        c2149.f6347 = constraintWidget$DimensionBehaviour;
        c2149.f6346 = constraintWidget$DimensionBehaviour2;
        c2149.f6345 = i;
        c2149.f6344 = i2;
        this.f6332.m13196(c7878, c2149);
        c7878.m13221(c2149.f6343);
        c7878.m13222(c2149.f6342);
        c7878.f21717 = c2149.f6348;
        c7878.m13232(c2149.f6349);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3873(AbstractC2154 abstractC2154, int i, ArrayList arrayList) {
        C2145 c2145 = abstractC2154.f6362;
        C2145 c21452 = abstractC2154.f6364;
        for (InterfaceC2147 interfaceC2147 : c2145.f6328) {
            if (interfaceC2147 instanceof C2145) {
                m3877((C2145) interfaceC2147, i, arrayList, null);
            } else if (interfaceC2147 instanceof AbstractC2154) {
                m3877(((AbstractC2154) interfaceC2147).f6362, i, arrayList, null);
            }
        }
        for (InterfaceC2147 interfaceC21472 : c21452.f6328) {
            if (interfaceC21472 instanceof C2145) {
                m3877((C2145) interfaceC21472, i, arrayList, null);
            } else if (interfaceC21472 instanceof AbstractC2154) {
                m3877(((AbstractC2154) interfaceC21472).f6364, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC2147 interfaceC21473 : ((C2155) abstractC2154).f6366.f6328) {
                if (interfaceC21473 instanceof C2145) {
                    m3877((C2145) interfaceC21473, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m3874(C7877 c7877, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        C7877 c78772 = c7877;
        ArrayList arrayList2 = this.f6338;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            AbstractC2154 abstractC2154 = ((C2152) arrayList2.get(i3)).f6354;
            if (!(abstractC2154 instanceof C2148) ? !(i != 0 ? (abstractC2154 instanceof C2155) : (abstractC2154 instanceof C2160)) : ((C2148) abstractC2154).f6356 != i) {
                C2145 c2145 = (i == 0 ? c78772.f21720 : c78772.f21719).f6362;
                C2145 c21452 = (i == 0 ? c78772.f21720 : c78772.f21719).f6364;
                C2145 c21453 = abstractC2154.f6362;
                C2145 c21454 = abstractC2154.f6364;
                boolean zContains = c21453.f6329.contains(c2145);
                boolean zContains2 = c21454.f6329.contains(c21452);
                long jMo3885 = abstractC2154.mo3885();
                if (zContains && zContains2) {
                    long jM3886 = C2152.m3886(c21453, j);
                    arrayList = arrayList2;
                    long jM3887 = C2152.m3887(c21454, j);
                    long j2 = jM3886 - jMo3885;
                    int i4 = c21454.f6320;
                    i2 = i3;
                    if (j2 >= (-i4)) {
                        j2 += (long) i4;
                    }
                    long j3 = c21453.f6320;
                    long j4 = ((-jM3887) - jMo3885) - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C7878 c7878 = abstractC2154.f6360;
                    if (i == 0) {
                        f = c7878.f21745;
                    } else if (i == 1) {
                        f = c7878.f21744;
                    } else {
                        c7878.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (((long) c21453.f6320) + ((((long) ((f2 * f) + 0.5f)) + jMo3885) + ((long) AbstractC0053.m145(1.0f, f, f2, 0.5f)))) - ((long) c21454.f6320);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    jMax = zContains ? Math.max(C2152.m3886(c21453, c21453.f6320), ((long) c21453.f6320) + jMo3885) : zContains2 ? Math.max(-C2152.m3887(c21454, c21454.f6320), ((long) (-c21454.f6320)) + jMo3885) : (abstractC2154.mo3885() + ((long) c21453.f6320)) - ((long) c21454.f6320);
                }
            } else {
                arrayList = arrayList2;
                jMax = j;
                i2 = i3;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            c78772 = c7877;
            j = 0;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3875() {
        C7877 c7877 = this.f6337;
        ArrayList arrayList = this.f6338;
        ArrayList<AbstractC2154> arrayList2 = this.f6333;
        arrayList2.clear();
        C7877 c78772 = this.f6334;
        c78772.f21720.mo3879();
        c78772.f21719.mo3879();
        arrayList2.add(c78772.f21720);
        arrayList2.add(c78772.f21719);
        HashSet hashSet = null;
        for (C7878 c7878 : c78772.f21691) {
            if (c7878 instanceof C7888) {
                C2161 c2161 = new C2161(c7878);
                c7878.f21720.mo3879();
                c7878.f21719.mo3879();
                c2161.f6356 = ((C7888) c7878).f21852;
                arrayList2.add(c2161);
            } else {
                if (c7878.m13243()) {
                    if (c7878.f21722 == null) {
                        c7878.f21722 = new C2148(c7878, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c7878.f21722);
                } else {
                    arrayList2.add(c7878.f21720);
                }
                if (c7878.m13230()) {
                    if (c7878.f21721 == null) {
                        c7878.f21721 = new C2148(c7878, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c7878.f21721);
                } else {
                    arrayList2.add(c7878.f21719);
                }
                if (c7878 instanceof AbstractC7885) {
                    arrayList2.add(new C2162(c7878));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC2154) it.next()).mo3879();
        }
        for (AbstractC2154 abstractC2154 : arrayList2) {
            if (abstractC2154.f6360 != c78772) {
                abstractC2154.mo3881();
            }
        }
        arrayList.clear();
        m3873(c7877.f21720, 0, arrayList);
        m3873(c7877.f21719, 1, arrayList);
        this.f6336 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3876(C7877 c7877) {
        float f;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        int i;
        int i2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        C2146 c2146;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6;
        ArrayList arrayList = c7877.f21691;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7877.f21698;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7878 c7878 = (C7878) it.next();
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = c7878.f21698;
            C7880[] c7880Arr = c7878.f21697;
            C7880 c7880 = c7878.f21702;
            C7880 c78802 = c7878.f21712;
            C7880 c78803 = c7878.f21703;
            C7880 c78804 = c7878.f21713;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviourArr2[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = constraintWidget$DimensionBehaviourArr2[1];
            if (c7878.f21742 == 8) {
                c7878.f21723 = true;
            } else {
                float f2 = c7878.f21726;
                if (f2 < 1.0f && constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    c7878.f21733 = 2;
                }
                float f3 = c7878.f21710;
                if (f3 < 1.0f) {
                    f = 1.0f;
                    if (constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                        c7878.f21725 = 2;
                    }
                } else {
                    f = 1.0f;
                }
                if (c7878.f21756 > 0.0f) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour9 && (constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.FIXED)) {
                        c7878.f21733 = 3;
                    } else if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour9 && (constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.FIXED)) {
                        c7878.f21725 = 3;
                    } else if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour9 && constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour9) {
                        if (c7878.f21733 == 0) {
                            c7878.f21733 = 3;
                        }
                        if (c7878.f21725 == 0) {
                            c7878.f21725 = 3;
                        }
                    }
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour10 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour10 && c7878.f21733 == 1 && (c78804.f21763 == null || c78803.f21763 == null)) {
                    constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                }
                if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour10 && c7878.f21725 == 1 && (c78802.f21763 == null || c7880.f21763 == null)) {
                    constraintWidget$DimensionBehaviour8 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                }
                C2160 c2160 = c7878.f21720;
                c2160.f6358 = constraintWidget$DimensionBehaviour7;
                int i3 = c7878.f21733;
                c2160.f6361 = i3;
                C2155 c2155 = c7878.f21719;
                c2155.f6358 = constraintWidget$DimensionBehaviour8;
                int i4 = c7878.f21725;
                c2155.f6361 = i4;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour11 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
                Iterator it2 = it;
                if ((constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour11 || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour11 || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour12 = constraintWidget$DimensionBehaviour8;
                    int iM13247 = c7878.m13247();
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour11) {
                        iM13247 = (c7877.m13247() - c78804.f21770) - c78803.f21770;
                        constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.FIXED;
                    }
                    int iM13251 = c7878.m13251();
                    if (constraintWidget$DimensionBehaviour12 == constraintWidget$DimensionBehaviour11) {
                        int iM132512 = (c7877.m13251() - c78802.f21770) - c7880.f21770;
                        constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.FIXED;
                        c2146 = this;
                        i = iM13247;
                        i2 = iM132512;
                        constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour7;
                    } else {
                        constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviour12;
                        i = iM13247;
                        i2 = iM13251;
                        constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour7;
                        c2146 = this;
                    }
                    c2146.m3872(c7878, constraintWidget$DimensionBehaviour2, i, constraintWidget$DimensionBehaviour, i2);
                    c7878.f21720.f6357.mo3868(c7878.m13247());
                    c7878.f21719.f6357.mo3868(c7878.m13251());
                    c7878.f21723 = true;
                } else {
                    if (constraintWidget$DimensionBehaviour7 != constraintWidget$DimensionBehaviour10 || (constraintWidget$DimensionBehaviour8 != (constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && constraintWidget$DimensionBehaviour8 != ConstraintWidget$DimensionBehaviour.FIXED)) {
                        constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviour8;
                    } else if (i3 == 3) {
                        if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour6) {
                            m3872(c7878, constraintWidget$DimensionBehaviour6, 0, constraintWidget$DimensionBehaviour6, 0);
                        }
                        int iM132513 = c7878.m13251();
                        int i5 = (int) ((iM132513 * c7878.f21756) + 0.5f);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour13 = ConstraintWidget$DimensionBehaviour.FIXED;
                        m3872(c7878, constraintWidget$DimensionBehaviour13, i5, constraintWidget$DimensionBehaviour13, iM132513);
                        c7878.f21720.f6357.mo3868(c7878.m13247());
                        c7878.f21719.f6357.mo3868(c7878.m13251());
                        c7878.f21723 = true;
                    } else if (i3 == 1) {
                        m3872(c7878, constraintWidget$DimensionBehaviour6, 0, constraintWidget$DimensionBehaviour8, 0);
                        c7878.f21720.f6357.f6375 = c7878.m13247();
                    } else {
                        constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviour8;
                        if (i3 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour14 = constraintWidget$DimensionBehaviourArr[0];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour15 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour14 == constraintWidget$DimensionBehaviour15 || constraintWidget$DimensionBehaviour14 == constraintWidget$DimensionBehaviour11) {
                                m3872(c7878, constraintWidget$DimensionBehaviour15, (int) ((f2 * c7877.m13247()) + 0.5f), constraintWidget$DimensionBehaviour3, c7878.m13251());
                                c7878.f21720.f6357.mo3868(c7878.m13247());
                                c7878.f21719.f6357.mo3868(c7878.m13251());
                                c7878.f21723 = true;
                            }
                        } else if (c7880Arr[0].f21763 == null || c7880Arr[1].f21763 == null) {
                            m3872(c7878, constraintWidget$DimensionBehaviour6, 0, constraintWidget$DimensionBehaviour3, 0);
                            c7878.f21720.f6357.mo3868(c7878.m13247());
                            c7878.f21719.f6357.mo3868(c7878.m13251());
                            c7878.f21723 = true;
                        }
                    }
                    if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour10 || (constraintWidget$DimensionBehaviour7 != (constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && constraintWidget$DimensionBehaviour7 != ConstraintWidget$DimensionBehaviour.FIXED)) {
                        constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour3;
                    } else if (i4 == 3) {
                        if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour5) {
                            m3872(c7878, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour5, 0);
                        }
                        int iM132472 = c7878.m13247();
                        float f4 = c7878.f21756;
                        if (c7878.f21760 == -1) {
                            f4 = f / f4;
                        }
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour16 = ConstraintWidget$DimensionBehaviour.FIXED;
                        m3872(c7878, constraintWidget$DimensionBehaviour16, iM132472, constraintWidget$DimensionBehaviour16, (int) ((iM132472 * f4) + 0.5f));
                        c7878.f21720.f6357.mo3868(c7878.m13247());
                        c7878.f21719.f6357.mo3868(c7878.m13251());
                        c7878.f21723 = true;
                    } else if (i4 == 1) {
                        m3872(c7878, constraintWidget$DimensionBehaviour7, 0, constraintWidget$DimensionBehaviour5, 0);
                        c7878.f21719.f6357.f6375 = c7878.m13251();
                    } else {
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour17 = constraintWidget$DimensionBehaviour7;
                        if (i4 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour18 = constraintWidget$DimensionBehaviourArr[1];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour19 = constraintWidget$DimensionBehaviour3;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour20 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour18 == constraintWidget$DimensionBehaviour20 || constraintWidget$DimensionBehaviour18 == constraintWidget$DimensionBehaviour11) {
                                m3872(c7878, constraintWidget$DimensionBehaviour17, c7878.m13247(), constraintWidget$DimensionBehaviour20, (int) ((f3 * c7877.m13251()) + 0.5f));
                                c7878.f21720.f6357.mo3868(c7878.m13247());
                                c7878.f21719.f6357.mo3868(c7878.m13251());
                                c7878.f21723 = true;
                            } else {
                                constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour19;
                                constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviour17;
                            }
                        } else {
                            constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviour17;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour21 = constraintWidget$DimensionBehaviour3;
                            if (c7880Arr[2].f21763 == null || c7880Arr[3].f21763 == null) {
                                m3872(c7878, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour21, 0);
                                c7878.f21720.f6357.mo3868(c7878.m13247());
                                c7878.f21719.f6357.mo3868(c7878.m13251());
                                c7878.f21723 = true;
                            } else {
                                constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour21;
                            }
                        }
                    }
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour10 && constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour10) {
                        if (i3 == 1 || i4 == 1) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour22 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                            m3872(c7878, constraintWidget$DimensionBehaviour22, 0, constraintWidget$DimensionBehaviour22, 0);
                            c7878.f21720.f6357.f6375 = c7878.m13247();
                            c7878.f21719.f6357.f6375 = c7878.m13251();
                        } else if (i4 == 2 && i3 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour23 = constraintWidget$DimensionBehaviourArr[0];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour24 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour23 == constraintWidget$DimensionBehaviour24 && constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour24) {
                                m3872(c7878, constraintWidget$DimensionBehaviour24, (int) ((f2 * c7877.m13247()) + 0.5f), constraintWidget$DimensionBehaviour24, (int) ((f3 * c7877.m13251()) + 0.5f));
                                c7878.f21720.f6357.mo3868(c7878.m13247());
                                c7878.f21719.f6357.mo3868(c7878.m13251());
                                c7878.f21723 = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3877(C2145 c2145, int i, ArrayList arrayList, C2152 c2152) {
        AbstractC2154 abstractC2154 = c2145.f6322;
        C2152 c21522 = abstractC2154.f6359;
        C2145 c21452 = abstractC2154.f6364;
        C2145 c21453 = abstractC2154.f6362;
        if (c21522 == null) {
            C7877 c7877 = this.f6337;
            if (abstractC2154 == c7877.f21720 || abstractC2154 == c7877.f21719) {
                return;
            }
            if (c2152 == null) {
                c2152 = new C2152();
                c2152.f6354 = null;
                c2152.f6353 = new ArrayList();
                c2152.f6354 = abstractC2154;
                arrayList.add(c2152);
            }
            abstractC2154.f6359 = c2152;
            c2152.f6353.add(abstractC2154);
            for (InterfaceC2147 interfaceC2147 : c21453.f6328) {
                if (interfaceC2147 instanceof C2145) {
                    m3877((C2145) interfaceC2147, i, arrayList, c2152);
                }
            }
            for (InterfaceC2147 interfaceC21472 : c21452.f6328) {
                if (interfaceC21472 instanceof C2145) {
                    m3877((C2145) interfaceC21472, i, arrayList, c2152);
                }
            }
            if (i == 1 && (abstractC2154 instanceof C2155)) {
                for (InterfaceC2147 interfaceC21473 : ((C2155) abstractC2154).f6366.f6328) {
                    if (interfaceC21473 instanceof C2145) {
                        m3877((C2145) interfaceC21473, i, arrayList, c2152);
                    }
                }
            }
            Iterator it = c21453.f6329.iterator();
            while (it.hasNext()) {
                m3877((C2145) it.next(), i, arrayList, c2152);
            }
            Iterator it2 = c21452.f6329.iterator();
            while (it2.hasNext()) {
                m3877((C2145) it2.next(), i, arrayList, c2152);
            }
            if (i == 1 && (abstractC2154 instanceof C2155)) {
                Iterator it3 = ((C2155) abstractC2154).f6366.f6329.iterator();
                while (it3.hasNext()) {
                    m3877((C2145) it3.next(), i, arrayList, c2152);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3878() {
        C2146 c2146;
        C2150 c2150;
        for (C7878 c7878 : this.f6337.f21691) {
            if (!c7878.f21723) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7878.f21698;
                boolean z = false;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[1];
                int i = c7878.f21733;
                int i2 = c7878.f21725;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3 || (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 || (constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C2158 c2158 = c7878.f21720.f6357;
                boolean z3 = c2158.f6331;
                C2158 c21582 = c7878.f21719.f6357;
                boolean z4 = c21582.f6331;
                if (z3 && z4) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.FIXED;
                    c2146 = this;
                    c2146.m3872(c7878, constraintWidget$DimensionBehaviour4, c2158.f6327, constraintWidget$DimensionBehaviour4, c21582.f6327);
                    c7878.f21723 = true;
                } else if (z3 && z) {
                    c2146 = this;
                    c2146.m3872(c7878, ConstraintWidget$DimensionBehaviour.FIXED, c2158.f6327, constraintWidget$DimensionBehaviour3, c21582.f6327);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    C2155 c2155 = c7878.f21719;
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour5) {
                        c2155.f6357.f6375 = c7878.m13251();
                    } else {
                        c2155.f6357.mo3868(c7878.m13251());
                        c7878.f21723 = true;
                    }
                } else {
                    c2146 = this;
                    if (z4 && z2) {
                        c2146.m3872(c7878, constraintWidget$DimensionBehaviour3, c2158.f6327, ConstraintWidget$DimensionBehaviour.FIXED, c21582.f6327);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                        C2160 c2160 = c7878.f21720;
                        if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour6) {
                            c2160.f6357.f6375 = c7878.m13247();
                        } else {
                            c2160.f6357.mo3868(c7878.m13247());
                            c7878.f21723 = true;
                        }
                    }
                }
                if (c7878.f21723 && (c2150 = c7878.f21719.f6367) != null) {
                    c2150.mo3868(c7878.f21759);
                }
                this = c2146;
            }
        }
    }
}
