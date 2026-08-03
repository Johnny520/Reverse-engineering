package p332wb;

import java.util.ArrayList;
import p000a.AbstractC0000a;
import p036c9.C0439g0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3623h;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.C3874d;
import p276sf.C3967n;
import p315v8.C4521a;
import p345x8.C5709b;
import p356y0.InterfaceC5853o;
import sh.C4060x;

/* JADX INFO: renamed from: wb.an */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4724an implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15836g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4060x f15837h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3641z f15838i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f15839j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1231l f15840k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ArrayList f15841l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1235p f15842m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1231l f15843n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1231l f15844o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f15845p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f15846q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4724an(C4060x c4060x, C3641z c3641z, String str, InterfaceC1231l interfaceC1231l, ArrayList arrayList, InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f15836g = i9;
        this.f15837h = c4060x;
        this.f15838i = c3641z;
        this.f15839j = str;
        this.f15840k = interfaceC1231l;
        this.f15841l = arrayList;
        this.f15842m = interfaceC1235p;
        this.f15843n = interfaceC1231l2;
        this.f15844o = interfaceC1231l3;
        this.f15845p = interfaceC1809a1;
        this.f15846q = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f15836g) {
            case 0:
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f15837h.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    final String str = this.f15839j;
                    boolean zM4534f = c1836h0.m4534f(str);
                    final InterfaceC1231l interfaceC1231l = this.f15840k;
                    boolean zM4534f2 = zM4534f | c1836h0.m4534f(interfaceC1231l);
                    final ArrayList arrayList = this.f15841l;
                    boolean zM4538h = zM4534f2 | c1836h0.m4538h(arrayList);
                    final InterfaceC1235p interfaceC1235p = this.f15842m;
                    boolean zM4534f3 = zM4538h | c1836h0.m4534f(interfaceC1235p);
                    final InterfaceC1231l interfaceC1231l2 = this.f15843n;
                    boolean zM4534f4 = zM4534f3 | c1836h0.m4534f(interfaceC1231l2);
                    final InterfaceC1231l interfaceC1231l3 = this.f15844o;
                    boolean zM4534f5 = zM4534f4 | c1836h0.m4534f(interfaceC1231l3);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f5 || objM4514P == C1851l.f6155a) {
                        final int i9 = 1;
                        final InterfaceC1809a1 interfaceC1809a1 = this.f15845p;
                        final InterfaceC1809a1 interfaceC1809a12 = this.f15846q;
                        InterfaceC1231l interfaceC1231l4 = new InterfaceC1231l() { // from class: wb.f9
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                switch (i9) {
                                    case 0:
                                        C3623h c3623h = (C3623h) obj4;
                                        c3623h.getClass();
                                        C3623h.m7604a(c3623h, null, new C3874d(-818040000, new C0439g0(2, interfaceC1231l, str), true), 3);
                                        ArrayList arrayList2 = arrayList;
                                        if (arrayList2.isEmpty()) {
                                            C3623h.m7604a(c3623h, null, AbstractC5193p0.f19622M0, 3);
                                        } else {
                                            int i10 = 0;
                                            for (Object obj5 : arrayList2) {
                                                int i11 = i10 + 1;
                                                if (i10 < 0) {
                                                    AbstractC0000a.m32Q0();
                                                    throw null;
                                                }
                                                C3623h.m7604a(c3623h, null, new C3874d(-485687118, new C5500yb(i10, 1), true), 3);
                                                C3623h.m7604a(c3623h, null, new C3874d(-467292759, new C5532zb((C4521a) obj5, i10, interfaceC1235p, interfaceC1231l2, interfaceC1231l3, interfaceC1809a1, interfaceC1809a12, 1), true), 3);
                                                i10 = i11;
                                            }
                                        }
                                        return C3967n.f12976a;
                                    default:
                                        C3623h c3623h2 = (C3623h) obj4;
                                        c3623h2.getClass();
                                        C3623h.m7604a(c3623h2, null, new C3874d(1650641188, new C0439g0(1, interfaceC1231l, str), true), 3);
                                        ArrayList arrayList3 = arrayList;
                                        if (arrayList3.isEmpty()) {
                                            C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19664S0, 3);
                                        } else {
                                            int i12 = 0;
                                            for (Object obj6 : arrayList3) {
                                                int i13 = i12 + 1;
                                                if (i12 < 0) {
                                                    AbstractC0000a.m32Q0();
                                                    throw null;
                                                }
                                                C3623h.m7604a(c3623h2, null, new C3874d(164902994, new C5500yb(i12, 0), true), 3);
                                                C3623h.m7604a(c3623h2, null, new C3874d(-604240631, new C5532zb((C5709b) obj6, i12, interfaceC1235p, interfaceC1231l2, interfaceC1231l3, interfaceC1809a1, interfaceC1809a12, 0), true), 3);
                                                i12 = i13;
                                            }
                                        }
                                        return C3967n.f12976a;
                                }
                            }
                        };
                        c1836h0.m4545k0(interfaceC1231l4);
                        objM4514P = interfaceC1231l4;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, this.f15838i, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f15837h.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    final String str2 = this.f15839j;
                    boolean zM4534f6 = c1836h02.m4534f(str2);
                    final InterfaceC1231l interfaceC1231l5 = this.f15840k;
                    boolean zM4534f7 = zM4534f6 | c1836h02.m4534f(interfaceC1231l5);
                    final ArrayList arrayList2 = this.f15841l;
                    boolean zM4538h2 = zM4534f7 | c1836h02.m4538h(arrayList2);
                    final InterfaceC1235p interfaceC1235p2 = this.f15842m;
                    boolean zM4534f8 = zM4538h2 | c1836h02.m4534f(interfaceC1235p2);
                    final InterfaceC1231l interfaceC1231l6 = this.f15843n;
                    boolean zM4534f9 = zM4534f8 | c1836h02.m4534f(interfaceC1231l6);
                    final InterfaceC1231l interfaceC1231l7 = this.f15844o;
                    boolean zM4534f10 = zM4534f9 | c1836h02.m4534f(interfaceC1231l7);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f10 || objM4514P2 == C1851l.f6155a) {
                        final int i10 = 0;
                        final InterfaceC1809a1 interfaceC1809a13 = this.f15845p;
                        final InterfaceC1809a1 interfaceC1809a14 = this.f15846q;
                        InterfaceC1231l interfaceC1231l8 = new InterfaceC1231l() { // from class: wb.f9
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                switch (i10) {
                                    case 0:
                                        C3623h c3623h = (C3623h) obj4;
                                        c3623h.getClass();
                                        C3623h.m7604a(c3623h, null, new C3874d(-818040000, new C0439g0(2, interfaceC1231l5, str2), true), 3);
                                        ArrayList arrayList22 = arrayList2;
                                        if (arrayList22.isEmpty()) {
                                            C3623h.m7604a(c3623h, null, AbstractC5193p0.f19622M0, 3);
                                        } else {
                                            int i102 = 0;
                                            for (Object obj5 : arrayList22) {
                                                int i11 = i102 + 1;
                                                if (i102 < 0) {
                                                    AbstractC0000a.m32Q0();
                                                    throw null;
                                                }
                                                C3623h.m7604a(c3623h, null, new C3874d(-485687118, new C5500yb(i102, 1), true), 3);
                                                C3623h.m7604a(c3623h, null, new C3874d(-467292759, new C5532zb((C4521a) obj5, i102, interfaceC1235p2, interfaceC1231l6, interfaceC1231l7, interfaceC1809a13, interfaceC1809a14, 1), true), 3);
                                                i102 = i11;
                                            }
                                        }
                                        return C3967n.f12976a;
                                    default:
                                        C3623h c3623h2 = (C3623h) obj4;
                                        c3623h2.getClass();
                                        C3623h.m7604a(c3623h2, null, new C3874d(1650641188, new C0439g0(1, interfaceC1231l5, str2), true), 3);
                                        ArrayList arrayList3 = arrayList2;
                                        if (arrayList3.isEmpty()) {
                                            C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19664S0, 3);
                                        } else {
                                            int i12 = 0;
                                            for (Object obj6 : arrayList3) {
                                                int i13 = i12 + 1;
                                                if (i12 < 0) {
                                                    AbstractC0000a.m32Q0();
                                                    throw null;
                                                }
                                                C3623h.m7604a(c3623h2, null, new C3874d(164902994, new C5500yb(i12, 0), true), 3);
                                                C3623h.m7604a(c3623h2, null, new C3874d(-604240631, new C5532zb((C5709b) obj6, i12, interfaceC1235p2, interfaceC1231l6, interfaceC1231l7, interfaceC1809a13, interfaceC1809a14, 0), true), 3);
                                                i12 = i13;
                                            }
                                        }
                                        return C3967n.f12976a;
                                }
                            }
                        };
                        c1836h02.m4545k0(interfaceC1231l8);
                        objM4514P2 = interfaceC1231l8;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, this.f15838i, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
