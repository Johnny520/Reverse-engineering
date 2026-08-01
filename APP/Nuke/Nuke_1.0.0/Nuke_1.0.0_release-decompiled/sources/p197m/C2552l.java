package p197m;

import java.util.List;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p029F0.InterfaceC0420q;
import p061L2.C0982v;
import p153e1.C2016l;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: m.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2552l implements InterfaceC0377O {

    /* JADX INFO: renamed from: a */
    public final C2559s f8157a;

    public C2552l(C2559s c2559s) {
        this.f8157a = c2559s;
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: a */
    public final int mo651a(InterfaceC0420q interfaceC0420q, List list, int i5) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC0376N) list.get(0)).mo649f(i5));
            int iM4208u = AbstractC2352g.m4208u(list);
            int i6 = 1;
            if (1 <= iM4208u) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC0376N) list.get(i6)).mo649f(i5));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i6 == iM4208u) {
                        break;
                    }
                    i6++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: e */
    public final int mo652e(InterfaceC0420q interfaceC0420q, List list, int i5) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC0376N) list.get(0)).mo645T(i5));
            int iM4208u = AbstractC2352g.m4208u(list);
            int i6 = 1;
            if (1 <= iM4208u) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC0376N) list.get(i6)).mo645T(i5));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i6 == iM4208u) {
                        break;
                    }
                    i6++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: f */
    public final int mo15f(InterfaceC0420q interfaceC0420q, List list, int i5) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC0376N) list.get(0)).mo646X(i5));
            int iM4208u = AbstractC2352g.m4208u(list);
            int i6 = 1;
            if (1 <= iM4208u) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC0376N) list.get(i6)).mo646X(i5));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i6 == iM4208u) {
                        break;
                    }
                    i6++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: h */
    public final int mo653h(InterfaceC0420q interfaceC0420q, List list, int i5) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC0376N) list.get(0)).mo647Z(i5));
            int iM4208u = AbstractC2352g.m4208u(list);
            int i6 = 1;
            if (1 <= iM4208u) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC0376N) list.get(i6)).mo647Z(i5));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i6 == iM4208u) {
                        break;
                    }
                    i6++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        AbstractC0391b0 abstractC0391b0;
        int i5;
        AbstractC0391b0 abstractC0391b02;
        int i6;
        int i7;
        int size = list.size();
        AbstractC0391b0[] abstractC0391b0Arr = new AbstractC0391b0[size];
        int size2 = list.size();
        long j6 = 0;
        int i8 = 0;
        while (true) {
            abstractC0391b0 = null;
            i5 = 1;
            if (i8 >= size2) {
                break;
            }
            InterfaceC0376N interfaceC0376N = (InterfaceC0376N) list.get(i8);
            Object objMo650l = interfaceC0376N.mo650l();
            C2554n c2554n = objMo650l instanceof C2554n ? (C2554n) objMo650l : null;
            if (c2554n != null && ((Boolean) c2554n.f8158a.getValue()).booleanValue()) {
                AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
                long j7 = (((long) abstractC0391b0Mo648e.f1207e) & 4294967295L) | (((long) abstractC0391b0Mo648e.f1206d) << 32);
                abstractC0391b0Arr[i8] = abstractC0391b0Mo648e;
                j6 = j7;
            }
            i8++;
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            InterfaceC0376N interfaceC0376N2 = (InterfaceC0376N) list.get(i9);
            if (abstractC0391b0Arr[i9] == null) {
                abstractC0391b0Arr[i9] = interfaceC0376N2.mo648e(j5);
            }
        }
        if (interfaceC0379Q.mo606z()) {
            i6 = (int) (j6 >> 32);
        } else {
            if (size == 0) {
                abstractC0391b02 = null;
            } else {
                abstractC0391b02 = abstractC0391b0Arr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = abstractC0391b02 != null ? abstractC0391b02.f1206d : 0;
                    if (1 <= i10) {
                        int i12 = 1;
                        while (true) {
                            AbstractC0391b0 abstractC0391b03 = abstractC0391b0Arr[i12];
                            int i13 = abstractC0391b03 != null ? abstractC0391b03.f1206d : 0;
                            if (i11 < i13) {
                                abstractC0391b02 = abstractC0391b03;
                                i11 = i13;
                            }
                            if (i12 == i10) {
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            i6 = abstractC0391b02 != null ? abstractC0391b02.f1206d : 0;
        }
        if (interfaceC0379Q.mo606z()) {
            i7 = (int) (j6 & 4294967295L);
        } else {
            if (size != 0) {
                abstractC0391b0 = abstractC0391b0Arr[0];
                int i14 = size - 1;
                if (i14 != 0) {
                    int i15 = abstractC0391b0 != null ? abstractC0391b0.f1207e : 0;
                    if (1 <= i14) {
                        while (true) {
                            AbstractC0391b0 abstractC0391b04 = abstractC0391b0Arr[i5];
                            int i16 = abstractC0391b04 != null ? abstractC0391b04.f1207e : 0;
                            if (i15 < i16) {
                                abstractC0391b0 = abstractC0391b04;
                                i15 = i16;
                            }
                            if (i5 == i14) {
                                break;
                            }
                            i5++;
                        }
                    }
                }
            }
            i7 = abstractC0391b0 != null ? abstractC0391b0.f1207e : 0;
        }
        if (!interfaceC0379Q.mo606z()) {
            this.f8157a.f8173b.setValue(new C2016l((((long) i6) << 32) | (((long) i7) & 4294967295L)));
        }
        return interfaceC0379Q.mo604f0(i6, i7, C0982v.f3048d, new C2551k(abstractC0391b0Arr, this, i6, i7));
    }
}
