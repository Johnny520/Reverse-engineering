package p148k;

import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p121i3.C3185o;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p148k.C3876g;
import p172l8.C4700i0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3868c implements InterfaceC3555o0 {

    /* JADX INFO: renamed from: a */
    public final C3876g f11112a;

    /* JADX INFO: renamed from: k.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ AbstractC3545l1[] f11113r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C3868c f11114s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f11115t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ int f11116u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3545l1[] abstractC3545l1Arr, C3868c c3868c, int i10, int i11) {
            super(1);
            this.f11113r = abstractC3545l1Arr;
            this.f11114s = c3868c;
            this.f11115t = i10;
            this.f11116u = i11;
        }

        /* JADX INFO: renamed from: a */
        public final void m15343a(AbstractC3545l1.a aVar) {
            AbstractC3545l1[] abstractC3545l1Arr;
            AbstractC3545l1[] abstractC3545l1Arr2 = this.f11113r;
            C3868c c3868c = this.f11114s;
            int i10 = this.f11115t;
            int i11 = this.f11116u;
            int length = abstractC3545l1Arr2.length;
            int i12 = 0;
            while (i12 < length) {
                AbstractC3545l1 abstractC3545l1 = abstractC3545l1Arr2[i12];
                if (abstractC3545l1 != null) {
                    abstractC3545l1Arr = abstractC3545l1Arr2;
                    long jMo17411a = c3868c.m15342a().m15358h().mo17411a(C3189s.m12082c((((long) abstractC3545l1.m13264M0()) << 32) | (((long) abstractC3545l1.m13259G0()) & 4294967295L)), C3189s.m12082c((((long) i11) & 4294967295L) | (((long) i10) << 32)), EnumC3191u.f8484q);
                    AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, C3185o.m12049i(jMo17411a), C3185o.m12050j(jMo17411a), 0.0f, 4, null);
                } else {
                    abstractC3545l1Arr = abstractC3545l1Arr2;
                }
                i12++;
                abstractC3545l1Arr2 = abstractC3545l1Arr;
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m15343a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    public C3868c(C3876g c3876g) {
        this.f11112a = c3876g;
    }

    /* JADX INFO: renamed from: a */
    public final C3876g m15342a() {
        return this.f11112a;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: b */
    public int mo3081b(InterfaceC3566s interfaceC3566s, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC3563r) list.get(0)).mo13147W(i10));
            int iM20802q = AbstractC5114x.m20802q(list);
            int i11 = 1;
            if (1 <= iM20802q) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC3563r) list.get(i11)).mo13147W(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM20802q) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
        AbstractC3545l1 abstractC3545l1;
        int i10;
        AbstractC3545l1 abstractC3545l12;
        int iM13264M0;
        int iM13259G0;
        int size = list.size();
        AbstractC3545l1[] abstractC3545l1Arr = new AbstractC3545l1[size];
        long jM12088a = C3189s.f8481b.m12088a();
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            abstractC3545l1 = null;
            i10 = 1;
            if (i11 >= size2) {
                break;
            }
            InterfaceC3552n0 interfaceC3552n0 = (InterfaceC3552n0) list.get(i11);
            Object objMo13149o = interfaceC3552n0.mo13149o();
            C3876g.a aVar = objMo13149o instanceof C3876g.a ? (C3876g.a) objMo13149o : null;
            if (aVar != null && aVar.m15364j()) {
                AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(j10);
                long jM12082c = C3189s.m12082c((((long) abstractC3545l1Mo13148X.m13264M0()) << 32) | (((long) abstractC3545l1Mo13148X.m13259G0()) & 4294967295L));
                C4700i0 c4700i0 = C4700i0.f13910a;
                abstractC3545l1Arr[i11] = abstractC3545l1Mo13148X;
                jM12088a = jM12082c;
            }
            i11++;
        }
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            InterfaceC3552n0 interfaceC3552n02 = (InterfaceC3552n0) list.get(i12);
            if (abstractC3545l1Arr[i12] == null) {
                abstractC3545l1Arr[i12] = interfaceC3552n02.mo13148X(j10);
            }
        }
        if (interfaceC3561q0.mo1232g1()) {
            iM13264M0 = (int) (jM12088a >> 32);
        } else {
            if (size == 0) {
                abstractC3545l12 = null;
            } else {
                abstractC3545l12 = abstractC3545l1Arr[0];
                int iM20732f0 = AbstractC5106t.m20732f0(abstractC3545l1Arr);
                if (iM20732f0 != 0) {
                    int iM13264M02 = abstractC3545l12 != null ? abstractC3545l12.m13264M0() : 0;
                    if (1 <= iM20732f0) {
                        int i13 = 1;
                        while (true) {
                            AbstractC3545l1 abstractC3545l13 = abstractC3545l1Arr[i13];
                            int iM13264M03 = abstractC3545l13 != null ? abstractC3545l13.m13264M0() : 0;
                            if (iM13264M02 < iM13264M03) {
                                abstractC3545l12 = abstractC3545l13;
                                iM13264M02 = iM13264M03;
                            }
                            if (i13 == iM20732f0) {
                                break;
                            }
                            i13++;
                        }
                    }
                }
            }
            iM13264M0 = abstractC3545l12 != null ? abstractC3545l12.m13264M0() : 0;
        }
        if (interfaceC3561q0.mo1232g1()) {
            iM13259G0 = (int) (jM12088a & 4294967295L);
        } else {
            if (size != 0) {
                abstractC3545l1 = abstractC3545l1Arr[0];
                int iM20732f02 = AbstractC5106t.m20732f0(abstractC3545l1Arr);
                if (iM20732f02 != 0) {
                    int iM13259G02 = abstractC3545l1 != null ? abstractC3545l1.m13259G0() : 0;
                    if (1 <= iM20732f02) {
                        while (true) {
                            AbstractC3545l1 abstractC3545l14 = abstractC3545l1Arr[i10];
                            int iM13259G03 = abstractC3545l14 != null ? abstractC3545l14.m13259G0() : 0;
                            if (iM13259G02 < iM13259G03) {
                                abstractC3545l1 = abstractC3545l14;
                                iM13259G02 = iM13259G03;
                            }
                            if (i10 == iM20732f02) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
            iM13259G0 = abstractC3545l1 != null ? abstractC3545l1.m13259G0() : 0;
        }
        if (!interfaceC3561q0.mo1232g1()) {
            this.f11112a.m15363m(C3189s.m12082c((((long) iM13264M0) << 32) | (((long) iM13259G0) & 4294967295L)));
        }
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, iM13264M0, iM13259G0, null, new a(abstractC3545l1Arr, this, iM13264M0, iM13259G0), 4, null);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: d */
    public int mo13327d(InterfaceC3566s interfaceC3566s, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC3563r) list.get(0)).mo13150t(i10));
            int iM20802q = AbstractC5114x.m20802q(list);
            int i11 = 1;
            if (1 <= iM20802q) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC3563r) list.get(i11)).mo13150t(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM20802q) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: e */
    public int mo13328e(InterfaceC3566s interfaceC3566s, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC3563r) list.get(0)).mo13146S(i10));
            int iM20802q = AbstractC5114x.m20802q(list);
            int i11 = 1;
            if (1 <= iM20802q) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC3563r) list.get(i11)).mo13146S(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM20802q) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: h */
    public int mo13329h(InterfaceC3566s interfaceC3566s, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC3563r) list.get(0)).mo13151z0(i10));
            int iM20802q = AbstractC5114x.m20802q(list);
            int i11 = 1;
            if (1 <= iM20802q) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC3563r) list.get(i11)).mo13151z0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM20802q) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
