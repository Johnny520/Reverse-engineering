package androidx.constraintlayout.core.widgets.analyzer;

import androidx.activity.AbstractC0900;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p215.C8695;
import p219.AbstractC8715;
import p219.C8707;
import p219.C8708;
import p219.C8710;
import p219.C8718;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2979 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8695 f6678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ArrayList f6679;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8707 f6680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f6681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f6682;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8707 f6683;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ArrayList f6684;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2982 f6685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4442(C8708 c8708, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, int i, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, int i2) {
        C2982 c2982 = this.f6685;
        c2982.f6693 = constraintWidget$DimensionBehaviour;
        c2982.f6692 = constraintWidget$DimensionBehaviour2;
        c2982.f6691 = i;
        c2982.f6690 = i2;
        this.f6678.m13783(c8708, c2982);
        c8708.m13808(c2982.f6689);
        c8708.m13809(c2982.f6688);
        c8708.f22059 = c2982.f6694;
        c8708.m13819(c2982.f6695);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4443(AbstractC2987 abstractC2987, int i, ArrayList arrayList) {
        C2978 c2978 = abstractC2987.f6708;
        C2978 c29782 = abstractC2987.f6710;
        for (InterfaceC2980 interfaceC2980 : c2978.f6674) {
            if (interfaceC2980 instanceof C2978) {
                m4447((C2978) interfaceC2980, i, arrayList, null);
            } else if (interfaceC2980 instanceof AbstractC2987) {
                m4447(((AbstractC2987) interfaceC2980).f6708, i, arrayList, null);
            }
        }
        for (InterfaceC2980 interfaceC29802 : c29782.f6674) {
            if (interfaceC29802 instanceof C2978) {
                m4447((C2978) interfaceC29802, i, arrayList, null);
            } else if (interfaceC29802 instanceof AbstractC2987) {
                m4447(((AbstractC2987) interfaceC29802).f6710, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC2980 interfaceC29803 : ((C2988) abstractC2987).f6712.f6674) {
                if (interfaceC29803 instanceof C2978) {
                    m4447((C2978) interfaceC29803, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4444(C8707 c8707, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        C8707 c87072 = c8707;
        ArrayList arrayList2 = this.f6684;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            AbstractC2987 abstractC2987 = ((C2985) arrayList2.get(i3)).f6700;
            if (!(abstractC2987 instanceof C2981) ? !(i != 0 ? (abstractC2987 instanceof C2988) : (abstractC2987 instanceof C2993)) : ((C2981) abstractC2987).f6702 != i) {
                C2978 c2978 = (i == 0 ? c87072.f22062 : c87072.f22061).f6708;
                C2978 c29782 = (i == 0 ? c87072.f22062 : c87072.f22061).f6710;
                C2978 c29783 = abstractC2987.f6708;
                C2978 c29784 = abstractC2987.f6710;
                boolean zContains = c29783.f6675.contains(c2978);
                boolean zContains2 = c29784.f6675.contains(c29782);
                long jMo4455 = abstractC2987.mo4455();
                if (zContains && zContains2) {
                    long jM4456 = C2985.m4456(c29783, j);
                    arrayList = arrayList2;
                    long jM4457 = C2985.m4457(c29784, j);
                    long j2 = jM4456 - jMo4455;
                    int i4 = c29784.f6666;
                    i2 = i3;
                    if (j2 >= (-i4)) {
                        j2 += (long) i4;
                    }
                    long j3 = c29783.f6666;
                    long j4 = ((-jM4457) - jMo4455) - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C8708 c8708 = abstractC2987.f6706;
                    if (i == 0) {
                        f = c8708.f22087;
                    } else if (i == 1) {
                        f = c8708.f22086;
                    } else {
                        c8708.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (((long) c29783.f6666) + ((((long) ((f2 * f) + 0.5f)) + jMo4455) + ((long) AbstractC0900.m706(1.0f, f, f2, 0.5f)))) - ((long) c29784.f6666);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    jMax = zContains ? Math.max(C2985.m4456(c29783, c29783.f6666), ((long) c29783.f6666) + jMo4455) : zContains2 ? Math.max(-C2985.m4457(c29784, c29784.f6666), ((long) (-c29784.f6666)) + jMo4455) : (abstractC2987.mo4455() + ((long) c29783.f6666)) - ((long) c29784.f6666);
                }
            } else {
                arrayList = arrayList2;
                jMax = j;
                i2 = i3;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            c87072 = c8707;
            j = 0;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4445() {
        C8707 c8707 = this.f6683;
        ArrayList arrayList = this.f6684;
        ArrayList<AbstractC2987> arrayList2 = this.f6679;
        arrayList2.clear();
        C8707 c87072 = this.f6680;
        c87072.f22062.mo4449();
        c87072.f22061.mo4449();
        arrayList2.add(c87072.f22062);
        arrayList2.add(c87072.f22061);
        HashSet hashSet = null;
        for (C8708 c8708 : c87072.f22033) {
            if (c8708 instanceof C8718) {
                C2994 c2994 = new C2994(c8708);
                c8708.f22062.mo4449();
                c8708.f22061.mo4449();
                c2994.f6702 = ((C8718) c8708).f22194;
                arrayList2.add(c2994);
            } else {
                if (c8708.m13830()) {
                    if (c8708.f22064 == null) {
                        c8708.f22064 = new C2981(c8708, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c8708.f22064);
                } else {
                    arrayList2.add(c8708.f22062);
                }
                if (c8708.m13817()) {
                    if (c8708.f22063 == null) {
                        c8708.f22063 = new C2981(c8708, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c8708.f22063);
                } else {
                    arrayList2.add(c8708.f22061);
                }
                if (c8708 instanceof AbstractC8715) {
                    arrayList2.add(new C2995(c8708));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC2987) it.next()).mo4449();
        }
        for (AbstractC2987 abstractC2987 : arrayList2) {
            if (abstractC2987.f6706 != c87072) {
                abstractC2987.mo4451();
            }
        }
        arrayList.clear();
        m4443(c8707.f22062, 0, arrayList);
        m4443(c8707.f22061, 1, arrayList);
        this.f6682 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4446(C8707 c8707) {
        float f;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        int i;
        int i2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        C2979 c2979;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6;
        ArrayList arrayList = c8707.f22033;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8707.f22040;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8708 c8708 = (C8708) it.next();
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = c8708.f22040;
            C8710[] c8710Arr = c8708.f22039;
            C8710 c8710 = c8708.f22044;
            C8710 c87102 = c8708.f22054;
            C8710 c87103 = c8708.f22045;
            C8710 c87104 = c8708.f22055;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviourArr2[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = constraintWidget$DimensionBehaviourArr2[1];
            if (c8708.f22084 == 8) {
                c8708.f22065 = true;
            } else {
                float f2 = c8708.f22068;
                if (f2 < 1.0f && constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    c8708.f22075 = 2;
                }
                float f3 = c8708.f22052;
                if (f3 < 1.0f) {
                    f = 1.0f;
                    if (constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                        c8708.f22067 = 2;
                    }
                } else {
                    f = 1.0f;
                }
                if (c8708.f22098 > 0.0f) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour9 && (constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.FIXED)) {
                        c8708.f22075 = 3;
                    } else if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour9 && (constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.FIXED)) {
                        c8708.f22067 = 3;
                    } else if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour9 && constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour9) {
                        if (c8708.f22075 == 0) {
                            c8708.f22075 = 3;
                        }
                        if (c8708.f22067 == 0) {
                            c8708.f22067 = 3;
                        }
                    }
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour10 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour10 && c8708.f22075 == 1 && (c87104.f22105 == null || c87103.f22105 == null)) {
                    constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                }
                if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour10 && c8708.f22067 == 1 && (c87102.f22105 == null || c8710.f22105 == null)) {
                    constraintWidget$DimensionBehaviour8 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                }
                C2993 c2993 = c8708.f22062;
                c2993.f6704 = constraintWidget$DimensionBehaviour7;
                int i3 = c8708.f22075;
                c2993.f6707 = i3;
                C2988 c2988 = c8708.f22061;
                c2988.f6704 = constraintWidget$DimensionBehaviour8;
                int i4 = c8708.f22067;
                c2988.f6707 = i4;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour11 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
                Iterator it2 = it;
                if ((constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour11 || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour7 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour11 || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour12 = constraintWidget$DimensionBehaviour8;
                    int iM13834 = c8708.m13834();
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour11) {
                        iM13834 = (c8707.m13834() - c87104.f22112) - c87103.f22112;
                        constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.FIXED;
                    }
                    int iM13838 = c8708.m13838();
                    if (constraintWidget$DimensionBehaviour12 == constraintWidget$DimensionBehaviour11) {
                        int iM138382 = (c8707.m13838() - c87102.f22112) - c8710.f22112;
                        constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.FIXED;
                        c2979 = this;
                        i = iM13834;
                        i2 = iM138382;
                        constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour7;
                    } else {
                        constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviour12;
                        i = iM13834;
                        i2 = iM13838;
                        constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour7;
                        c2979 = this;
                    }
                    c2979.m4442(c8708, constraintWidget$DimensionBehaviour2, i, constraintWidget$DimensionBehaviour, i2);
                    c8708.f22062.f6703.mo4438(c8708.m13834());
                    c8708.f22061.f6703.mo4438(c8708.m13838());
                    c8708.f22065 = true;
                } else {
                    if (constraintWidget$DimensionBehaviour7 != constraintWidget$DimensionBehaviour10 || (constraintWidget$DimensionBehaviour8 != (constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && constraintWidget$DimensionBehaviour8 != ConstraintWidget$DimensionBehaviour.FIXED)) {
                        constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviour8;
                    } else if (i3 == 3) {
                        if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour6) {
                            m4442(c8708, constraintWidget$DimensionBehaviour6, 0, constraintWidget$DimensionBehaviour6, 0);
                        }
                        int iM138383 = c8708.m13838();
                        int i5 = (int) ((iM138383 * c8708.f22098) + 0.5f);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour13 = ConstraintWidget$DimensionBehaviour.FIXED;
                        m4442(c8708, constraintWidget$DimensionBehaviour13, i5, constraintWidget$DimensionBehaviour13, iM138383);
                        c8708.f22062.f6703.mo4438(c8708.m13834());
                        c8708.f22061.f6703.mo4438(c8708.m13838());
                        c8708.f22065 = true;
                    } else if (i3 == 1) {
                        m4442(c8708, constraintWidget$DimensionBehaviour6, 0, constraintWidget$DimensionBehaviour8, 0);
                        c8708.f22062.f6703.f6721 = c8708.m13834();
                    } else {
                        constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviour8;
                        if (i3 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour14 = constraintWidget$DimensionBehaviourArr[0];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour15 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour14 == constraintWidget$DimensionBehaviour15 || constraintWidget$DimensionBehaviour14 == constraintWidget$DimensionBehaviour11) {
                                m4442(c8708, constraintWidget$DimensionBehaviour15, (int) ((f2 * c8707.m13834()) + 0.5f), constraintWidget$DimensionBehaviour3, c8708.m13838());
                                c8708.f22062.f6703.mo4438(c8708.m13834());
                                c8708.f22061.f6703.mo4438(c8708.m13838());
                                c8708.f22065 = true;
                            }
                        } else if (c8710Arr[0].f22105 == null || c8710Arr[1].f22105 == null) {
                            m4442(c8708, constraintWidget$DimensionBehaviour6, 0, constraintWidget$DimensionBehaviour3, 0);
                            c8708.f22062.f6703.mo4438(c8708.m13834());
                            c8708.f22061.f6703.mo4438(c8708.m13838());
                            c8708.f22065 = true;
                        }
                    }
                    if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour10 || (constraintWidget$DimensionBehaviour7 != (constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && constraintWidget$DimensionBehaviour7 != ConstraintWidget$DimensionBehaviour.FIXED)) {
                        constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour3;
                    } else if (i4 == 3) {
                        if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour5) {
                            m4442(c8708, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour5, 0);
                        }
                        int iM138342 = c8708.m13834();
                        float f4 = c8708.f22098;
                        if (c8708.f22102 == -1) {
                            f4 = f / f4;
                        }
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour16 = ConstraintWidget$DimensionBehaviour.FIXED;
                        m4442(c8708, constraintWidget$DimensionBehaviour16, iM138342, constraintWidget$DimensionBehaviour16, (int) ((iM138342 * f4) + 0.5f));
                        c8708.f22062.f6703.mo4438(c8708.m13834());
                        c8708.f22061.f6703.mo4438(c8708.m13838());
                        c8708.f22065 = true;
                    } else if (i4 == 1) {
                        m4442(c8708, constraintWidget$DimensionBehaviour7, 0, constraintWidget$DimensionBehaviour5, 0);
                        c8708.f22061.f6703.f6721 = c8708.m13838();
                    } else {
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour17 = constraintWidget$DimensionBehaviour7;
                        if (i4 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour18 = constraintWidget$DimensionBehaviourArr[1];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour19 = constraintWidget$DimensionBehaviour3;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour20 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour18 == constraintWidget$DimensionBehaviour20 || constraintWidget$DimensionBehaviour18 == constraintWidget$DimensionBehaviour11) {
                                m4442(c8708, constraintWidget$DimensionBehaviour17, c8708.m13834(), constraintWidget$DimensionBehaviour20, (int) ((f3 * c8707.m13838()) + 0.5f));
                                c8708.f22062.f6703.mo4438(c8708.m13834());
                                c8708.f22061.f6703.mo4438(c8708.m13838());
                                c8708.f22065 = true;
                            } else {
                                constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour19;
                                constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviour17;
                            }
                        } else {
                            constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviour17;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour21 = constraintWidget$DimensionBehaviour3;
                            if (c8710Arr[2].f22105 == null || c8710Arr[3].f22105 == null) {
                                m4442(c8708, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour21, 0);
                                c8708.f22062.f6703.mo4438(c8708.m13834());
                                c8708.f22061.f6703.mo4438(c8708.m13838());
                                c8708.f22065 = true;
                            } else {
                                constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour21;
                            }
                        }
                    }
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour10 && constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour10) {
                        if (i3 == 1 || i4 == 1) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour22 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                            m4442(c8708, constraintWidget$DimensionBehaviour22, 0, constraintWidget$DimensionBehaviour22, 0);
                            c8708.f22062.f6703.f6721 = c8708.m13834();
                            c8708.f22061.f6703.f6721 = c8708.m13838();
                        } else if (i4 == 2 && i3 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour23 = constraintWidget$DimensionBehaviourArr[0];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour24 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour23 == constraintWidget$DimensionBehaviour24 && constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour24) {
                                m4442(c8708, constraintWidget$DimensionBehaviour24, (int) ((f2 * c8707.m13834()) + 0.5f), constraintWidget$DimensionBehaviour24, (int) ((f3 * c8707.m13838()) + 0.5f));
                                c8708.f22062.f6703.mo4438(c8708.m13834());
                                c8708.f22061.f6703.mo4438(c8708.m13838());
                                c8708.f22065 = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4447(C2978 c2978, int i, ArrayList arrayList, C2985 c2985) {
        AbstractC2987 abstractC2987 = c2978.f6668;
        C2985 c29852 = abstractC2987.f6705;
        C2978 c29782 = abstractC2987.f6710;
        C2978 c29783 = abstractC2987.f6708;
        if (c29852 == null) {
            C8707 c8707 = this.f6683;
            if (abstractC2987 == c8707.f22062 || abstractC2987 == c8707.f22061) {
                return;
            }
            if (c2985 == null) {
                c2985 = new C2985();
                c2985.f6700 = null;
                c2985.f6699 = new ArrayList();
                c2985.f6700 = abstractC2987;
                arrayList.add(c2985);
            }
            abstractC2987.f6705 = c2985;
            c2985.f6699.add(abstractC2987);
            for (InterfaceC2980 interfaceC2980 : c29783.f6674) {
                if (interfaceC2980 instanceof C2978) {
                    m4447((C2978) interfaceC2980, i, arrayList, c2985);
                }
            }
            for (InterfaceC2980 interfaceC29802 : c29782.f6674) {
                if (interfaceC29802 instanceof C2978) {
                    m4447((C2978) interfaceC29802, i, arrayList, c2985);
                }
            }
            if (i == 1 && (abstractC2987 instanceof C2988)) {
                for (InterfaceC2980 interfaceC29803 : ((C2988) abstractC2987).f6712.f6674) {
                    if (interfaceC29803 instanceof C2978) {
                        m4447((C2978) interfaceC29803, i, arrayList, c2985);
                    }
                }
            }
            Iterator it = c29783.f6675.iterator();
            while (it.hasNext()) {
                m4447((C2978) it.next(), i, arrayList, c2985);
            }
            Iterator it2 = c29782.f6675.iterator();
            while (it2.hasNext()) {
                m4447((C2978) it2.next(), i, arrayList, c2985);
            }
            if (i == 1 && (abstractC2987 instanceof C2988)) {
                Iterator it3 = ((C2988) abstractC2987).f6712.f6675.iterator();
                while (it3.hasNext()) {
                    m4447((C2978) it3.next(), i, arrayList, c2985);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m4448() {
        C2979 c2979;
        C2983 c2983;
        for (C8708 c8708 : this.f6683.f22033) {
            if (!c8708.f22065) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8708.f22040;
                boolean z = false;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[1];
                int i = c8708.f22075;
                int i2 = c8708.f22067;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3 || (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 || (constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C2991 c2991 = c8708.f22062.f6703;
                boolean z3 = c2991.f6677;
                C2991 c29912 = c8708.f22061.f6703;
                boolean z4 = c29912.f6677;
                if (z3 && z4) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.FIXED;
                    c2979 = this;
                    c2979.m4442(c8708, constraintWidget$DimensionBehaviour4, c2991.f6673, constraintWidget$DimensionBehaviour4, c29912.f6673);
                    c8708.f22065 = true;
                } else if (z3 && z) {
                    c2979 = this;
                    c2979.m4442(c8708, ConstraintWidget$DimensionBehaviour.FIXED, c2991.f6673, constraintWidget$DimensionBehaviour3, c29912.f6673);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    C2988 c2988 = c8708.f22061;
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour5) {
                        c2988.f6703.f6721 = c8708.m13838();
                    } else {
                        c2988.f6703.mo4438(c8708.m13838());
                        c8708.f22065 = true;
                    }
                } else {
                    c2979 = this;
                    if (z4 && z2) {
                        c2979.m4442(c8708, constraintWidget$DimensionBehaviour3, c2991.f6673, ConstraintWidget$DimensionBehaviour.FIXED, c29912.f6673);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                        C2993 c2993 = c8708.f22062;
                        if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour6) {
                            c2993.f6703.f6721 = c8708.m13834();
                        } else {
                            c2993.f6703.mo4438(c8708.m13834());
                            c8708.f22065 = true;
                        }
                    }
                }
                if (c8708.f22065 && (c2983 = c8708.f22061.f6713) != null) {
                    c2983.mo4438(c8708.f22101);
                }
                this = c2979;
            }
        }
    }
}
