package androidx.constraintlayout.core.widgets.analyzer;

import androidx.activity.AbstractC0053;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p199.C7866;
import p203.AbstractC7886;
import p203.C7878;
import p203.C7879;
import p203.C7881;
import p203.C7889;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7866 f6333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ArrayList f6334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7878 f6335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f6336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f6337;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7878 f6338;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ArrayList f6339;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2149 f6340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3882(C7879 c7879, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, int i, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, int i2) {
        C2149 c2149 = this.f6340;
        c2149.f6348 = constraintWidget$DimensionBehaviour;
        c2149.f6347 = constraintWidget$DimensionBehaviour2;
        c2149.f6346 = i;
        c2149.f6345 = i2;
        this.f6333.m13224(c7879, c2149);
        c7879.m13249(c2149.f6344);
        c7879.m13250(c2149.f6343);
        c7879.f21714 = c2149.f6349;
        c7879.m13260(c2149.f6350);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3883(AbstractC2154 abstractC2154, int i, ArrayList arrayList) {
        C2145 c2145 = abstractC2154.f6363;
        C2145 c21452 = abstractC2154.f6365;
        for (InterfaceC2147 interfaceC2147 : c2145.f6329) {
            if (interfaceC2147 instanceof C2145) {
                m3887((C2145) interfaceC2147, i, arrayList, null);
            } else if (interfaceC2147 instanceof AbstractC2154) {
                m3887(((AbstractC2154) interfaceC2147).f6363, i, arrayList, null);
            }
        }
        for (InterfaceC2147 interfaceC21472 : c21452.f6329) {
            if (interfaceC21472 instanceof C2145) {
                m3887((C2145) interfaceC21472, i, arrayList, null);
            } else if (interfaceC21472 instanceof AbstractC2154) {
                m3887(((AbstractC2154) interfaceC21472).f6365, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC2147 interfaceC21473 : ((C2155) abstractC2154).f6367.f6329) {
                if (interfaceC21473 instanceof C2145) {
                    m3887((C2145) interfaceC21473, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m3884(C7878 c7878, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        C7878 c78782 = c7878;
        ArrayList arrayList2 = this.f6339;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            AbstractC2154 abstractC2154 = ((C2152) arrayList2.get(i3)).f6355;
            if (!(abstractC2154 instanceof C2148) ? !(i != 0 ? (abstractC2154 instanceof C2155) : (abstractC2154 instanceof C2160)) : ((C2148) abstractC2154).f6357 != i) {
                C2145 c2145 = (i == 0 ? c78782.f21717 : c78782.f21716).f6363;
                C2145 c21452 = (i == 0 ? c78782.f21717 : c78782.f21716).f6365;
                C2145 c21453 = abstractC2154.f6363;
                C2145 c21454 = abstractC2154.f6365;
                boolean zContains = c21453.f6330.contains(c2145);
                boolean zContains2 = c21454.f6330.contains(c21452);
                long jMo3895 = abstractC2154.mo3895();
                if (zContains && zContains2) {
                    long jM3896 = C2152.m3896(c21453, j);
                    arrayList = arrayList2;
                    long jM3897 = C2152.m3897(c21454, j);
                    long j2 = jM3896 - jMo3895;
                    int i4 = c21454.f6321;
                    i2 = i3;
                    if (j2 >= (-i4)) {
                        j2 += (long) i4;
                    }
                    long j3 = c21453.f6321;
                    long j4 = ((-jM3897) - jMo3895) - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C7879 c7879 = abstractC2154.f6361;
                    if (i == 0) {
                        f = c7879.f21742;
                    } else if (i == 1) {
                        f = c7879.f21741;
                    } else {
                        c7879.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (((long) c21453.f6321) + ((((long) ((f2 * f) + 0.5f)) + jMo3895) + ((long) AbstractC0053.m146(1.0f, f, f2, 0.5f)))) - ((long) c21454.f6321);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    jMax = zContains ? Math.max(C2152.m3896(c21453, c21453.f6321), ((long) c21453.f6321) + jMo3895) : zContains2 ? Math.max(-C2152.m3897(c21454, c21454.f6321), ((long) (-c21454.f6321)) + jMo3895) : (abstractC2154.mo3895() + ((long) c21453.f6321)) - ((long) c21454.f6321);
                }
            } else {
                arrayList = arrayList2;
                jMax = j;
                i2 = i3;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            c78782 = c7878;
            j = 0;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3885() {
        C7878 c7878 = this.f6338;
        ArrayList arrayList = this.f6339;
        ArrayList<AbstractC2154> arrayList2 = this.f6334;
        arrayList2.clear();
        C7878 c78782 = this.f6335;
        c78782.f21717.mo3889();
        c78782.f21716.mo3889();
        arrayList2.add(c78782.f21717);
        arrayList2.add(c78782.f21716);
        HashSet hashSet = null;
        for (C7879 c7879 : c78782.f21688) {
            if (c7879 instanceof C7889) {
                C2161 c2161 = new C2161(c7879);
                c7879.f21717.mo3889();
                c7879.f21716.mo3889();
                c2161.f6357 = ((C7889) c7879).f21849;
                arrayList2.add(c2161);
            } else {
                if (c7879.m13271()) {
                    if (c7879.f21719 == null) {
                        c7879.f21719 = new C2148(c7879, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c7879.f21719);
                } else {
                    arrayList2.add(c7879.f21717);
                }
                if (c7879.m13258()) {
                    if (c7879.f21718 == null) {
                        c7879.f21718 = new C2148(c7879, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c7879.f21718);
                } else {
                    arrayList2.add(c7879.f21716);
                }
                if (c7879 instanceof AbstractC7886) {
                    arrayList2.add(new C2162(c7879));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC2154) it.next()).mo3889();
        }
        for (AbstractC2154 abstractC2154 : arrayList2) {
            if (abstractC2154.f6361 != c78782) {
                abstractC2154.mo3891();
            }
        }
        arrayList.clear();
        m3883(c7878.f21717, 0, arrayList);
        m3883(c7878.f21716, 1, arrayList);
        this.f6337 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3886(C7878 c7878) {
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
        ArrayList arrayList = c7878.f21688;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7878.f21695;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7879 c7879 = (C7879) it.next();
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = c7879.f21695;
            C7881[] c7881Arr = c7879.f21694;
            C7881 c7881 = c7879.f21699;
            C7881 c78812 = c7879.f21709;
            C7881 c78813 = c7879.f21700;
            C7881 c78814 = c7879.f21710;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviourArr2[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = constraintWidget$DimensionBehaviourArr2[1];
            if (c7879.f21739 == 8) {
                c7879.f21720 = true;
            } else {
                float f2 = c7879.f21723;
                if (f2 < 1.0f && constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    c7879.f21730 = 2;
                }
                float f3 = c7879.f21707;
                if (f3 < 1.0f) {
                    f = 1.0f;
                    if (constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                        c7879.f21722 = 2;
                    }
                } else {
                    f = 1.0f;
                }
                if (c7879.f21753 > 0.0f) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour9 && (constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.FIXED)) {
                        c7879.f21730 = 3;
                    } else if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour9 && (constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.FIXED)) {
                        c7879.f21722 = 3;
                    } else if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour9 && constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour9) {
                        if (c7879.f21730 == 0) {
                            c7879.f21730 = 3;
                        }
                        if (c7879.f21722 == 0) {
                            c7879.f21722 = 3;
                        }
                    }
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour10 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour10 && c7879.f21730 == 1 && (c78814.f21760 == null || c78813.f21760 == null)) {
                    constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                }
                if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour10 && c7879.f21722 == 1 && (c78812.f21760 == null || c7881.f21760 == null)) {
                    constraintWidget$DimensionBehaviour8 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                }
                C2160 c2160 = c7879.f21717;
                c2160.f6359 = constraintWidget$DimensionBehaviour7;
                int i3 = c7879.f21730;
                c2160.f6362 = i3;
                C2155 c2155 = c7879.f21716;
                c2155.f6359 = constraintWidget$DimensionBehaviour8;
                int i4 = c7879.f21722;
                c2155.f6362 = i4;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour11 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
                Iterator it2 = it;
                if ((constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour11 || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour11 || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour12 = constraintWidget$DimensionBehaviour8;
                    int iM13275 = c7879.m13275();
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour11) {
                        iM13275 = (c7878.m13275() - c78814.f21767) - c78813.f21767;
                        constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.FIXED;
                    }
                    int iM13279 = c7879.m13279();
                    if (constraintWidget$DimensionBehaviour12 == constraintWidget$DimensionBehaviour11) {
                        int iM132792 = (c7878.m13279() - c78812.f21767) - c7881.f21767;
                        constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.FIXED;
                        c2146 = this;
                        i = iM13275;
                        i2 = iM132792;
                        constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour7;
                    } else {
                        constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviour12;
                        i = iM13275;
                        i2 = iM13279;
                        constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour7;
                        c2146 = this;
                    }
                    c2146.m3882(c7879, constraintWidget$DimensionBehaviour2, i, constraintWidget$DimensionBehaviour, i2);
                    c7879.f21717.f6358.mo3878(c7879.m13275());
                    c7879.f21716.f6358.mo3878(c7879.m13279());
                    c7879.f21720 = true;
                } else {
                    if (constraintWidget$DimensionBehaviour7 != constraintWidget$DimensionBehaviour10 || (constraintWidget$DimensionBehaviour8 != (constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && constraintWidget$DimensionBehaviour8 != ConstraintWidget$DimensionBehaviour.FIXED)) {
                        constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviour8;
                    } else if (i3 == 3) {
                        if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour6) {
                            m3882(c7879, constraintWidget$DimensionBehaviour6, 0, constraintWidget$DimensionBehaviour6, 0);
                        }
                        int iM132793 = c7879.m13279();
                        int i5 = (int) ((iM132793 * c7879.f21753) + 0.5f);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour13 = ConstraintWidget$DimensionBehaviour.FIXED;
                        m3882(c7879, constraintWidget$DimensionBehaviour13, i5, constraintWidget$DimensionBehaviour13, iM132793);
                        c7879.f21717.f6358.mo3878(c7879.m13275());
                        c7879.f21716.f6358.mo3878(c7879.m13279());
                        c7879.f21720 = true;
                    } else if (i3 == 1) {
                        m3882(c7879, constraintWidget$DimensionBehaviour6, 0, constraintWidget$DimensionBehaviour8, 0);
                        c7879.f21717.f6358.f6376 = c7879.m13275();
                    } else {
                        constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviour8;
                        if (i3 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour14 = constraintWidget$DimensionBehaviourArr[0];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour15 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour14 == constraintWidget$DimensionBehaviour15 || constraintWidget$DimensionBehaviour14 == constraintWidget$DimensionBehaviour11) {
                                m3882(c7879, constraintWidget$DimensionBehaviour15, (int) ((f2 * c7878.m13275()) + 0.5f), constraintWidget$DimensionBehaviour3, c7879.m13279());
                                c7879.f21717.f6358.mo3878(c7879.m13275());
                                c7879.f21716.f6358.mo3878(c7879.m13279());
                                c7879.f21720 = true;
                            }
                        } else if (c7881Arr[0].f21760 == null || c7881Arr[1].f21760 == null) {
                            m3882(c7879, constraintWidget$DimensionBehaviour6, 0, constraintWidget$DimensionBehaviour3, 0);
                            c7879.f21717.f6358.mo3878(c7879.m13275());
                            c7879.f21716.f6358.mo3878(c7879.m13279());
                            c7879.f21720 = true;
                        }
                    }
                    if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour10 || (constraintWidget$DimensionBehaviour7 != (constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && constraintWidget$DimensionBehaviour7 != ConstraintWidget$DimensionBehaviour.FIXED)) {
                        constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour3;
                    } else if (i4 == 3) {
                        if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour5) {
                            m3882(c7879, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour5, 0);
                        }
                        int iM132752 = c7879.m13275();
                        float f4 = c7879.f21753;
                        if (c7879.f21757 == -1) {
                            f4 = f / f4;
                        }
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour16 = ConstraintWidget$DimensionBehaviour.FIXED;
                        m3882(c7879, constraintWidget$DimensionBehaviour16, iM132752, constraintWidget$DimensionBehaviour16, (int) ((iM132752 * f4) + 0.5f));
                        c7879.f21717.f6358.mo3878(c7879.m13275());
                        c7879.f21716.f6358.mo3878(c7879.m13279());
                        c7879.f21720 = true;
                    } else if (i4 == 1) {
                        m3882(c7879, constraintWidget$DimensionBehaviour7, 0, constraintWidget$DimensionBehaviour5, 0);
                        c7879.f21716.f6358.f6376 = c7879.m13279();
                    } else {
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour17 = constraintWidget$DimensionBehaviour7;
                        if (i4 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour18 = constraintWidget$DimensionBehaviourArr[1];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour19 = constraintWidget$DimensionBehaviour3;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour20 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour18 == constraintWidget$DimensionBehaviour20 || constraintWidget$DimensionBehaviour18 == constraintWidget$DimensionBehaviour11) {
                                m3882(c7879, constraintWidget$DimensionBehaviour17, c7879.m13275(), constraintWidget$DimensionBehaviour20, (int) ((f3 * c7878.m13279()) + 0.5f));
                                c7879.f21717.f6358.mo3878(c7879.m13275());
                                c7879.f21716.f6358.mo3878(c7879.m13279());
                                c7879.f21720 = true;
                            } else {
                                constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour19;
                                constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviour17;
                            }
                        } else {
                            constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviour17;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour21 = constraintWidget$DimensionBehaviour3;
                            if (c7881Arr[2].f21760 == null || c7881Arr[3].f21760 == null) {
                                m3882(c7879, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour21, 0);
                                c7879.f21717.f6358.mo3878(c7879.m13275());
                                c7879.f21716.f6358.mo3878(c7879.m13279());
                                c7879.f21720 = true;
                            } else {
                                constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour21;
                            }
                        }
                    }
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour10 && constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour10) {
                        if (i3 == 1 || i4 == 1) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour22 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                            m3882(c7879, constraintWidget$DimensionBehaviour22, 0, constraintWidget$DimensionBehaviour22, 0);
                            c7879.f21717.f6358.f6376 = c7879.m13275();
                            c7879.f21716.f6358.f6376 = c7879.m13279();
                        } else if (i4 == 2 && i3 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour23 = constraintWidget$DimensionBehaviourArr[0];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour24 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour23 == constraintWidget$DimensionBehaviour24 && constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour24) {
                                m3882(c7879, constraintWidget$DimensionBehaviour24, (int) ((f2 * c7878.m13275()) + 0.5f), constraintWidget$DimensionBehaviour24, (int) ((f3 * c7878.m13279()) + 0.5f));
                                c7879.f21717.f6358.mo3878(c7879.m13275());
                                c7879.f21716.f6358.mo3878(c7879.m13279());
                                c7879.f21720 = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3887(C2145 c2145, int i, ArrayList arrayList, C2152 c2152) {
        AbstractC2154 abstractC2154 = c2145.f6323;
        C2152 c21522 = abstractC2154.f6360;
        C2145 c21452 = abstractC2154.f6365;
        C2145 c21453 = abstractC2154.f6363;
        if (c21522 == null) {
            C7878 c7878 = this.f6338;
            if (abstractC2154 == c7878.f21717 || abstractC2154 == c7878.f21716) {
                return;
            }
            if (c2152 == null) {
                c2152 = new C2152();
                c2152.f6355 = null;
                c2152.f6354 = new ArrayList();
                c2152.f6355 = abstractC2154;
                arrayList.add(c2152);
            }
            abstractC2154.f6360 = c2152;
            c2152.f6354.add(abstractC2154);
            for (InterfaceC2147 interfaceC2147 : c21453.f6329) {
                if (interfaceC2147 instanceof C2145) {
                    m3887((C2145) interfaceC2147, i, arrayList, c2152);
                }
            }
            for (InterfaceC2147 interfaceC21472 : c21452.f6329) {
                if (interfaceC21472 instanceof C2145) {
                    m3887((C2145) interfaceC21472, i, arrayList, c2152);
                }
            }
            if (i == 1 && (abstractC2154 instanceof C2155)) {
                for (InterfaceC2147 interfaceC21473 : ((C2155) abstractC2154).f6367.f6329) {
                    if (interfaceC21473 instanceof C2145) {
                        m3887((C2145) interfaceC21473, i, arrayList, c2152);
                    }
                }
            }
            Iterator it = c21453.f6330.iterator();
            while (it.hasNext()) {
                m3887((C2145) it.next(), i, arrayList, c2152);
            }
            Iterator it2 = c21452.f6330.iterator();
            while (it2.hasNext()) {
                m3887((C2145) it2.next(), i, arrayList, c2152);
            }
            if (i == 1 && (abstractC2154 instanceof C2155)) {
                Iterator it3 = ((C2155) abstractC2154).f6367.f6330.iterator();
                while (it3.hasNext()) {
                    m3887((C2145) it3.next(), i, arrayList, c2152);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3888() {
        C2146 c2146;
        C2150 c2150;
        for (C7879 c7879 : this.f6338.f21688) {
            if (!c7879.f21720) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c7879.f21695;
                boolean z = false;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[1];
                int i = c7879.f21730;
                int i2 = c7879.f21722;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3 || (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 || (constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C2158 c2158 = c7879.f21717.f6358;
                boolean z3 = c2158.f6332;
                C2158 c21582 = c7879.f21716.f6358;
                boolean z4 = c21582.f6332;
                if (z3 && z4) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.FIXED;
                    c2146 = this;
                    c2146.m3882(c7879, constraintWidget$DimensionBehaviour4, c2158.f6328, constraintWidget$DimensionBehaviour4, c21582.f6328);
                    c7879.f21720 = true;
                } else if (z3 && z) {
                    c2146 = this;
                    c2146.m3882(c7879, ConstraintWidget$DimensionBehaviour.FIXED, c2158.f6328, constraintWidget$DimensionBehaviour3, c21582.f6328);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    C2155 c2155 = c7879.f21716;
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour5) {
                        c2155.f6358.f6376 = c7879.m13279();
                    } else {
                        c2155.f6358.mo3878(c7879.m13279());
                        c7879.f21720 = true;
                    }
                } else {
                    c2146 = this;
                    if (z4 && z2) {
                        c2146.m3882(c7879, constraintWidget$DimensionBehaviour3, c2158.f6328, ConstraintWidget$DimensionBehaviour.FIXED, c21582.f6328);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                        C2160 c2160 = c7879.f21717;
                        if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour6) {
                            c2160.f6358.f6376 = c7879.m13275();
                        } else {
                            c2160.f6358.mo3878(c7879.m13275());
                            c7879.f21720 = true;
                        }
                    }
                }
                if (c7879.f21720 && (c2150 = c7879.f21716.f6368) != null) {
                    c2150.mo3878(c7879.f21756);
                }
                this = c2146;
            }
        }
    }
}
