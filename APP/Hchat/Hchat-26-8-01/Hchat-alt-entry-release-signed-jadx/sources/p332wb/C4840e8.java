package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import gg.AbstractC1416l;
import gg.C1414j;
import java.util.Iterator;
import java.util.List;
import okio.C3193a;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p036c9.C0467n0;
import p036c9.C0482r0;
import p036c9.C0491u0;
import p036c9.C0500x0;
import p063e9.C0832c;
import p063e9.C0848s;
import p065eb.C0884o;
import p065eb.C0886p;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p144k.C2209s1;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p249qg.InterfaceC3599t;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p288tb.C4143c;
import p317vb.InterfaceC4544a;
import p322w0.C4661l;
import p345x8.C5725r;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.e8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4840e8 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16764g = 2;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f16765h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16766i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16767j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16768k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16769l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f16770m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f16771n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f16772o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f16773p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f16774q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f16775r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f16776s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f16777t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f16778u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4840e8(C4060x c4060x, C3641z c3641z, String str, C4969i5 c4969i5, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1220a interfaceC1220a, Context context) {
        this.f16773p = c4060x;
        this.f16775r = c3641z;
        this.f16765h = str;
        this.f16776s = c4969i5;
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16777t = list;
        this.f16768k = interfaceC1809a13;
        this.f16769l = interfaceC1809a14;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
        this.f16778u = interfaceC1809a17;
        this.f16774q = interfaceC1220a;
        this.f16772o = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Context context;
        Object next;
        Context context2;
        final C0832c c0832c;
        C0832c c0832c2;
        Context context3;
        C1823e c1823e;
        InterfaceC1809a1 interfaceC1809a1;
        C1836h0 c1836h0;
        InterfaceC1809a1 interfaceC1809a12;
        Object c5237qb;
        C1836h0 c1836h02;
        InterfaceC1220a interfaceC1220a;
        C1836h0 c1836h03;
        int i9;
        Object c0467n0;
        C1823e c1823e2;
        InterfaceC1809a1 interfaceC1809a13;
        InterfaceC1809a1 interfaceC1809a14;
        Object c5237qb2;
        C1836h0 c1836h04;
        switch (this.f16764g) {
            case 0:
                Context context4 = (Context) this.f16772o;
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f16773p;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f16765h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f16774q;
                C3641z c3641z = (C3641z) this.f16775r;
                C0848s c0848s = (C0848s) this.f16778u;
                C3641z c3641z2 = (C3641z) this.f16776s;
                C3641z c3641z3 = (C3641z) this.f16777t;
                AbstractC5261r2 abstractC5261r2 = (AbstractC5261r2) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                abstractC5261r2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c1836h05.m4534f(abstractC5261r2) : c1836h05.m4538h(abstractC5261r2) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zEquals = abstractC5261r2.equals(C5096m2.f18832b);
                    InterfaceC1809a1 interfaceC1809a15 = this.f16766i;
                    InterfaceC1809a1 interfaceC1809a16 = this.f16767j;
                    InterfaceC1809a1 interfaceC1809a17 = this.f16768k;
                    InterfaceC1809a1 interfaceC1809a18 = this.f16769l;
                    int i10 = iIntValue;
                    InterfaceC1809a1 interfaceC1809a19 = this.f16770m;
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zEquals) {
                        c1836h05.m4525a0(299103929);
                        List list = (List) interfaceC1809a15.getValue();
                        C0832c c0832c3 = (C0832c) interfaceC1809a16.getValue();
                        C0832c c0832c4 = (C0832c) interfaceC1809a17.getValue();
                        C0832c c0832c5 = (C0832c) interfaceC1809a18.getValue();
                        Object objM4514P = c1836h05.m4514P();
                        if (objM4514P == c1823e3) {
                            objM4514P = new C4885fk(interfaceC1809a19, 3);
                            c1836h05.m4545k0(objM4514P);
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P;
                        Object objM4514P2 = c1836h05.m4514P();
                        if (objM4514P2 == c1823e3) {
                            objM4514P2 = new C4917gj(interfaceC1809a19, 14);
                            c1836h05.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9576j0(context4, interfaceC4544a, sharedPreferences, list, c0832c3, c0832c4, c0832c5, interfaceC1220a2, interfaceC1220a3, (InterfaceC1231l) objM4514P2, c1836h05, 905969664);
                        c1836h05.m4553p(false);
                    } else if (abstractC5261r2 instanceof C5162o2) {
                        c1836h05.m4525a0(682887493);
                        int iOrdinal = ((C5162o2) abstractC5261r2).f19311a.ordinal();
                        if (iOrdinal == 0) {
                            c0832c2 = (C0832c) interfaceC1809a16.getValue();
                        } else if (iOrdinal == 1) {
                            c0832c2 = (C0832c) interfaceC1809a17.getValue();
                        } else {
                            if (iOrdinal != 2) {
                                C3193a.m6822k();
                                return null;
                            }
                            c0832c2 = (C0832c) interfaceC1809a18.getValue();
                        }
                        C0832c c0832c6 = c0832c2;
                        Object objM4514P3 = c1836h05.m4514P();
                        if (objM4514P3 == c1823e3) {
                            objM4514P3 = new C4885fk(interfaceC1809a19, 10);
                            c1836h05.m4545k0(objM4514P3);
                        }
                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P3;
                        boolean zM4538h = c1836h05.m4538h(c0848s) | c1836h05.m4538h(context4);
                        Object objM4514P4 = c1836h05.m4514P();
                        if (zM4538h || objM4514P4 == c1823e3) {
                            context3 = context4;
                            c1823e = c1823e3;
                            C0886p c0886p = new C0886p(context3, c0848s, interfaceC1809a18, interfaceC1809a17, interfaceC1809a16, interfaceC1809a19, 10);
                            c1836h05.m4545k0(c0886p);
                            objM4514P4 = c0886p;
                        } else {
                            context3 = context4;
                            c1823e = c1823e3;
                        }
                        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P4;
                        Object objM4514P5 = c1836h05.m4514P();
                        if (objM4514P5 == c1823e) {
                            objM4514P5 = new C2209s1(25);
                            c1836h05.m4545k0(objM4514P5);
                        }
                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P5;
                        Object objM4514P6 = c1836h05.m4514P();
                        if (objM4514P6 == c1823e) {
                            objM4514P6 = new C5204pb(28);
                            c1836h05.m4545k0(objM4514P6);
                        }
                        InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P6;
                        Object objM4514P7 = c1836h05.m4514P();
                        if (objM4514P7 == c1823e) {
                            objM4514P7 = new C5204pb(29);
                            c1836h05.m4545k0(objM4514P7);
                        }
                        AbstractC4955ho.m9612n0(context3, c0832c6, c3641z, true, interfaceC1220a4, interfaceC1231l, interfaceC1220a5, interfaceC1231l2, (InterfaceC1231l) objM4514P7, c1836h05, 114846720, 0);
                        c1836h05.m4553p(false);
                    } else {
                        final InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a19;
                        if (abstractC5261r2.equals(C5096m2.f18833c)) {
                            c1836h05.m4525a0(299157696);
                            List list2 = (List) interfaceC1809a15.getValue();
                            InterfaceC1809a1 interfaceC1809a111 = this.f16771n;
                            String str = (String) interfaceC1809a111.getValue();
                            Object objM4514P8 = c1836h05.m4514P();
                            if (objM4514P8 == c1823e3) {
                                objM4514P8 = new C4917gj(interfaceC1809a111, 15);
                                c1836h05.m4545k0(objM4514P8);
                            }
                            InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) objM4514P8;
                            Object objM4514P9 = c1836h05.m4514P();
                            if (objM4514P9 == c1823e3) {
                                objM4514P9 = new C4885fk(interfaceC1809a110, 11);
                                c1836h05.m4545k0(objM4514P9);
                            }
                            InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P9;
                            boolean zM4538h2 = c1836h05.m4538h(c0848s);
                            Object objM4514P10 = c1836h05.m4514P();
                            if (zM4538h2 || objM4514P10 == c1823e3) {
                                objM4514P10 = new C5216pn(c0848s, interfaceC1809a15);
                                c1836h05.m4545k0(objM4514P10);
                            }
                            InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) ((C1414j) objM4514P10);
                            Object objM4514P11 = c1836h05.m4514P();
                            if (objM4514P11 == c1823e3) {
                                objM4514P11 = new C4917gj(interfaceC1809a110, 16);
                                c1836h05.m4545k0(objM4514P11);
                            }
                            InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) objM4514P11;
                            boolean zM4538h3 = c1836h05.m4538h(c0848s) | c1836h05.m4538h(context4);
                            Object objM4514P12 = c1836h05.m4514P();
                            if (zM4538h3 || objM4514P12 == c1823e3) {
                                objM4514P12 = new C5278rj(context4, interfaceC1809a15, c0848s, 3);
                                c1836h05.m4545k0(objM4514P12);
                            }
                            InterfaceC1235p interfaceC1235p = (InterfaceC1235p) objM4514P12;
                            Object objM4514P13 = c1836h05.m4514P();
                            if (objM4514P13 == c1823e3) {
                                objM4514P13 = new C4885fk(interfaceC1809a110, 4);
                                c1836h05.m4545k0(objM4514P13);
                            }
                            InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P13;
                            Object objM4514P14 = c1836h05.m4514P();
                            if (objM4514P14 == c1823e3) {
                                objM4514P14 = new C4885fk(interfaceC1809a110, 5);
                                c1836h05.m4545k0(objM4514P14);
                            }
                            AbstractC4955ho.m9621o0(context4, list2, str, interfaceC1231l3, c3641z2, interfaceC1220a6, interfaceC1231l4, interfaceC1231l5, interfaceC1235p, interfaceC1220a7, (InterfaceC1220a) objM4514P14, c1836h05, 818088960);
                            c1836h05.m4553p(false);
                        } else if (abstractC5261r2.equals(C5096m2.f18831a)) {
                            c1836h05.m4525a0(299200537);
                            int size = ((List) interfaceC1809a15.getValue()).size();
                            Object objM4514P15 = c1836h05.m4514P();
                            if (objM4514P15 == c1823e3) {
                                objM4514P15 = new C4885fk(interfaceC1809a110, 6);
                                c1836h05.m4545k0(objM4514P15);
                            }
                            InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P15;
                            boolean zM4538h4 = c1836h05.m4538h(context4) | c1836h05.m4538h(c0848s);
                            Object objM4514P16 = c1836h05.m4514P();
                            if (zM4538h4 || objM4514P16 == c1823e3) {
                                C4918gk c4918gk = new C4918gk(context4, interfaceC1809a15, c0848s, interfaceC1809a110, 0);
                                c1836h05.m4545k0(c4918gk);
                                objM4514P16 = c4918gk;
                            }
                            AbstractC4955ho.m9567i0(size, interfaceC1220a8, (InterfaceC1231l) objM4514P16, c1836h05, 48);
                            c1836h05.m4553p(false);
                        } else if (abstractC5261r2 instanceof C5228q2) {
                            c1836h05.m4525a0(686013254);
                            Iterator it = ((List) interfaceC1809a15.getValue()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (AbstractC1416l.m3825a(((C0832c) next).f2511b, ((C5228q2) abstractC5261r2).f20118a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            C0832c c0832c7 = (C0832c) next;
                            if (c0832c7 == null) {
                                c1836h05.m4525a0(686062544);
                                Object objM4514P17 = c1836h05.m4514P();
                                if (objM4514P17 == c1823e3) {
                                    objM4514P17 = new C4885fk(interfaceC1809a110, 7);
                                    c1836h05.m4545k0(objM4514P17);
                                }
                                AbstractC4955ho.m9585k0((InterfaceC1220a) objM4514P17, c1836h05, 6);
                                c1836h05.m4553p(false);
                            } else {
                                c1836h05.m4525a0(686299198);
                                Object objM4514P18 = c1836h05.m4514P();
                                if (objM4514P18 == c1823e3) {
                                    objM4514P18 = new C4885fk(interfaceC1809a110, 8);
                                    c1836h05.m4545k0(objM4514P18);
                                }
                                InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) objM4514P18;
                                boolean zM4538h5 = c1836h05.m4538h(c0848s) | c1836h05.m4538h(context4);
                                Object objM4514P19 = c1836h05.m4514P();
                                if (zM4538h5 || objM4514P19 == c1823e3) {
                                    context2 = context4;
                                    C4918gk c4918gk2 = new C4918gk(context2, interfaceC1809a15, c0848s, interfaceC1809a110, 1);
                                    c1836h05.m4545k0(c4918gk2);
                                    objM4514P19 = c4918gk2;
                                } else {
                                    context2 = context4;
                                }
                                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) objM4514P19;
                                boolean zM4538h6 = c1836h05.m4538h(c0848s) | c1836h05.m4538h(c0832c7) | c1836h05.m4538h(context2);
                                Object objM4514P20 = c1836h05.m4514P();
                                if (zM4538h6 || objM4514P20 == c1823e3) {
                                    c0832c = c0832c7;
                                    C0482r0 c0482r0 = new C0482r0(context2, interfaceC1809a15, c0832c, c0848s, interfaceC1809a110, 23);
                                    interfaceC1809a110 = interfaceC1809a110;
                                    c1836h05.m4545k0(c0482r0);
                                    objM4514P20 = c0482r0;
                                } else {
                                    c0832c = c0832c7;
                                }
                                InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) objM4514P20;
                                boolean zM4538h7 = c1836h05.m4538h(c0832c);
                                Object objM4514P21 = c1836h05.m4514P();
                                if (zM4538h7 || objM4514P21 == c1823e3) {
                                    final int i11 = 0;
                                    objM4514P21 = new InterfaceC1231l() { // from class: wb.hk
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1231l
                                        public final Object invoke(Object obj4) {
                                            String str2 = (String) obj4;
                                            switch (i11) {
                                                case 0:
                                                    str2.getClass();
                                                    String str3 = c0832c.f2511b;
                                                    interfaceC1809a110.setValue(new C5195p2(str3, new C4804d4("仅显示成员通知", AbstractC4955ho.m9591k6(str3, str2), new C5015jk(22), null)));
                                                    break;
                                                default:
                                                    str2.getClass();
                                                    String str4 = c0832c.f2511b;
                                                    interfaceC1809a110.setValue(new C5195p2(str4, new C4804d4("屏蔽成员通知", AbstractC4955ho.m9591k6(str4, str2), new C4661l(9), null)));
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    };
                                    c1836h05.m4545k0(objM4514P21);
                                }
                                InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) objM4514P21;
                                boolean zM4538h8 = c1836h05.m4538h(c0832c);
                                Object objM4514P22 = c1836h05.m4514P();
                                if (zM4538h8 || objM4514P22 == c1823e3) {
                                    final int i12 = 1;
                                    objM4514P22 = new InterfaceC1231l() { // from class: wb.hk
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1231l
                                        public final Object invoke(Object obj4) {
                                            String str2 = (String) obj4;
                                            switch (i12) {
                                                case 0:
                                                    str2.getClass();
                                                    String str3 = c0832c.f2511b;
                                                    interfaceC1809a110.setValue(new C5195p2(str3, new C4804d4("仅显示成员通知", AbstractC4955ho.m9591k6(str3, str2), new C5015jk(22), null)));
                                                    break;
                                                default:
                                                    str2.getClass();
                                                    String str4 = c0832c.f2511b;
                                                    interfaceC1809a110.setValue(new C5195p2(str4, new C4804d4("屏蔽成员通知", AbstractC4955ho.m9591k6(str4, str2), new C4661l(9), null)));
                                                    break;
                                            }
                                            return C3967n.f12976a;
                                        }
                                    };
                                    c1836h05.m4545k0(objM4514P22);
                                }
                                AbstractC4955ho.m9612n0(context2, c0832c, c3641z3, false, interfaceC1220a9, interfaceC1231l6, interfaceC1220a10, interfaceC1231l7, (InterfaceC1231l) objM4514P22, c1836h05, 24576, 8);
                                c1836h05.m4553p(false);
                            }
                            c1836h05.m4553p(false);
                        } else if (abstractC5261r2 instanceof C5129n2) {
                            c1836h05.m4525a0(299301040);
                            C5391v0 c5391v0 = ((C5129n2) abstractC5261r2).f19099a;
                            Object objM4514P23 = c1836h05.m4514P();
                            if (objM4514P23 == c1823e3) {
                                objM4514P23 = new C4885fk(interfaceC1809a110, 9);
                                c1836h05.m4545k0(objM4514P23);
                            }
                            InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) objM4514P23;
                            boolean zM4538h9 = c1836h05.m4538h(context4) | c1836h05.m4538h(c0848s);
                            Object objM4514P24 = c1836h05.m4514P();
                            if (zM4538h9 || objM4514P24 == c1823e3) {
                                objM4514P24 = new C4918gk(context4, interfaceC1809a110, interfaceC1809a15, c0848s);
                                c1836h05.m4545k0(objM4514P24);
                            }
                            AbstractC4955ho.m9504b0(context4, c5391v0, interfaceC1220a11, (InterfaceC1231l) objM4514P24, c1836h05, 384);
                            c1836h05.m4553p(false);
                        } else {
                            if (!(abstractC5261r2 instanceof C5195p2)) {
                                throw AbstractC0255e.m1015d(c1836h05, 299110535, false);
                            }
                            c1836h05.m4525a0(299363950);
                            C4804d4 c4804d4 = ((C5195p2) abstractC5261r2).f19925b;
                            int i13 = i10 & 14;
                            boolean z9 = i13 == 4 || ((i10 & 8) != 0 && c1836h05.m4538h(abstractC5261r2));
                            Object objM4514P25 = c1836h05.m4514P();
                            if (z9 || objM4514P25 == c1823e3) {
                                objM4514P25 = new C5475xi(abstractC5261r2, 3, interfaceC1809a110);
                                c1836h05.m4545k0(objM4514P25);
                            }
                            InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) objM4514P25;
                            boolean zM4538h10 = c1836h05.m4538h(c0848s) | (i13 == 4 || ((i10 & 8) != 0 && c1836h05.m4538h(abstractC5261r2))) | c1836h05.m4538h(context4);
                            Object objM4514P26 = c1836h05.m4514P();
                            if (zM4538h10 || objM4514P26 == c1823e3) {
                                C0884o c0884o = new C0884o(abstractC5261r2, interfaceC1809a15, context4, c0848s, interfaceC1809a110, 13);
                                context = context4;
                                c1836h05.m4545k0(c0884o);
                                objM4514P26 = c0884o;
                            } else {
                                context = context4;
                            }
                            AbstractC4955ho.m9622o1(context, c4804d4, interfaceC1220a12, (InterfaceC1231l) objM4514P26, c1836h05, 0);
                            c1836h05.m4553p(false);
                        }
                    }
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f16765h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f16772o;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f16773p;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f16774q;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f16775r;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f16776s;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f16777t;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f16778u;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-424232595, new C5369ub(sharedPreferences2, this.f16766i, this.f16767j, this.f16768k, this.f16769l, this.f16770m, this.f16771n, interfaceC1809a112, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                Context context5 = (Context) this.f16772o;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f16773p;
                C5725r c5725r = (C5725r) this.f16774q;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f16765h;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f16775r;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f16776s;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f16777t;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f16778u;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h07.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zM4538h11 = c1836h07.m4538h(context5);
                    InterfaceC1809a1 interfaceC1809a124 = this.f16766i;
                    boolean zM4534f = zM4538h11 | c1836h07.m4534f(interfaceC1809a124);
                    InterfaceC1809a1 interfaceC1809a125 = this.f16767j;
                    boolean zM4534f2 = zM4534f | c1836h07.m4534f(interfaceC1809a125);
                    InterfaceC1809a1 interfaceC1809a126 = this.f16768k;
                    boolean zM4534f3 = zM4534f2 | c1836h07.m4534f(interfaceC1809a126);
                    InterfaceC1809a1 interfaceC1809a127 = this.f16769l;
                    boolean zM4534f4 = zM4534f3 | c1836h07.m4534f(interfaceC1809a127);
                    InterfaceC1809a1 interfaceC1809a128 = this.f16770m;
                    boolean zM4534f5 = zM4534f4 | c1836h07.m4534f(interfaceC1809a128);
                    InterfaceC1809a1 interfaceC1809a129 = this.f16771n;
                    boolean zM4534f6 = zM4534f5 | c1836h07.m4534f(interfaceC1809a129) | c1836h07.m4534f(interfaceC1809a119) | c1836h07.m4538h(c5725r) | c1836h07.m4538h(sharedPreferences3);
                    Object objM4514P27 = c1836h07.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4534f6 || objM4514P27 == c1823e4) {
                        interfaceC1809a1 = interfaceC1809a123;
                        c1836h0 = c1836h07;
                        objM4514P27 = new C4715ae(interfaceC1809a120, context5, c5725r, interfaceC1809a121, sharedPreferences3, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a119, interfaceC1809a122);
                        c1836h0.m4545k0(objM4514P27);
                    } else {
                        interfaceC1809a1 = interfaceC1809a123;
                        c1836h0 = c1836h07;
                    }
                    InterfaceC1220a interfaceC1220a13 = (InterfaceC1220a) objM4514P27;
                    Object objM4514P28 = c1836h0.m4514P();
                    if (objM4514P28 == c1823e4) {
                        objM4514P28 = new C5371ud(interfaceC1809a1, 7);
                        c1836h0.m4545k0(objM4514P28);
                    }
                    AbstractC4955ho.m9382M("切换到所选", interfaceC1220a13, "返回", (InterfaceC1220a) objM4514P28, null, null, c1836h0, 3462, 48);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                C4060x c4060x = (C4060x) this.f16773p;
                C3641z c3641z4 = (C3641z) this.f16775r;
                Context context6 = (Context) this.f16772o;
                C5725r c5725r2 = (C5725r) this.f16765h;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f16774q;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f16776s;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f16777t;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f16778u;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c1836h08.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h08.m4516S(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h12 = c1836h08.m4538h(context6) | c1836h08.m4538h(c5725r2);
                    InterfaceC1809a1 interfaceC1809a134 = this.f16766i;
                    boolean zM4534f7 = zM4538h12 | c1836h08.m4534f(interfaceC1809a134);
                    InterfaceC1809a1 interfaceC1809a135 = this.f16767j;
                    boolean zM4534f8 = zM4534f7 | c1836h08.m4534f(interfaceC1809a135);
                    InterfaceC1809a1 interfaceC1809a136 = this.f16768k;
                    boolean zM4534f9 = zM4534f8 | c1836h08.m4534f(interfaceC1809a136);
                    InterfaceC1809a1 interfaceC1809a137 = this.f16769l;
                    boolean zM4534f10 = zM4534f9 | c1836h08.m4534f(interfaceC1809a137);
                    InterfaceC1809a1 interfaceC1809a138 = this.f16770m;
                    boolean zM4534f11 = zM4534f10 | c1836h08.m4534f(interfaceC1809a138);
                    InterfaceC1809a1 interfaceC1809a139 = this.f16771n;
                    boolean zM4534f12 = zM4534f11 | c1836h08.m4534f(interfaceC1809a139) | c1836h08.m4534f(interfaceC1809a130);
                    Object objM4514P29 = c1836h08.m4514P();
                    if (zM4534f12) {
                        interfaceC1809a12 = interfaceC1809a130;
                    } else {
                        interfaceC1809a12 = interfaceC1809a130;
                        if (objM4514P29 != C1851l.f6155a) {
                            c5237qb = objM4514P29;
                            c1836h02 = c1836h08;
                        }
                        AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z4, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) c5237qb, c1836h02, 0, 504);
                    }
                    c1836h02 = c1836h08;
                    c5237qb = new C5237qb(interfaceC1809a131, context6, interfaceC1809a132, interfaceC1809a133, c5725r2, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, interfaceC1809a139, interfaceC1809a12);
                    c1836h02.m4545k0(c5237qb);
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z4, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) c5237qb, c1836h02, 0, 504);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C4060x c4060x2 = (C4060x) this.f16773p;
                C3641z c3641z5 = (C3641z) this.f16775r;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f16765h;
                Context context7 = (Context) this.f16772o;
                List list3 = (List) this.f16774q;
                C5725r c5725r3 = (C5725r) this.f16776s;
                InterfaceC1809a1 interfaceC1809a140 = (InterfaceC1809a1) this.f16777t;
                InterfaceC1809a1 interfaceC1809a141 = (InterfaceC1809a1) this.f16778u;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c1836h09.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h09.m4516S(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    InterfaceC1809a1 interfaceC1809a142 = this.f16766i;
                    boolean zM4534f13 = c1836h09.m4534f(interfaceC1809a142);
                    InterfaceC1809a1 interfaceC1809a143 = this.f16767j;
                    boolean zM4534f14 = zM4534f13 | c1836h09.m4534f(interfaceC1809a143) | c1836h09.m4538h(interfaceC3599t) | c1836h09.m4538h(context7) | c1836h09.m4538h(list3);
                    InterfaceC1809a1 interfaceC1809a144 = this.f16768k;
                    boolean zM4534f15 = zM4534f14 | c1836h09.m4534f(interfaceC1809a144);
                    InterfaceC1809a1 interfaceC1809a145 = this.f16769l;
                    boolean zM4534f16 = zM4534f15 | c1836h09.m4534f(interfaceC1809a145) | c1836h09.m4538h(c5725r3);
                    Object objM4514P30 = c1836h09.m4514P();
                    if (zM4534f16 || objM4514P30 == C1851l.f6155a) {
                        C5237qb c5237qb3 = new C5237qb(list3, interfaceC1809a142, interfaceC1809a143, interfaceC3599t, context7, this.f16770m, this.f16771n, interfaceC1809a140, interfaceC1809a145, c5725r3, interfaceC1809a144, interfaceC1809a141);
                        c1836h09.m4545k0(c5237qb3);
                        objM4514P30 = c5237qb3;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z5, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P30, c1836h09, 0, 504);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                InterfaceC1809a1 interfaceC1809a146 = (InterfaceC1809a1) this.f16772o;
                InterfaceC1809a1 interfaceC1809a147 = (InterfaceC1809a1) this.f16773p;
                InterfaceC1809a1 interfaceC1809a148 = (InterfaceC1809a1) this.f16765h;
                InterfaceC1809a1 interfaceC1809a149 = (InterfaceC1809a1) this.f16774q;
                InterfaceC1809a1 interfaceC1809a150 = (InterfaceC1809a1) this.f16775r;
                InterfaceC1809a1 interfaceC1809a151 = (InterfaceC1809a1) this.f16776s;
                InterfaceC1809a1 interfaceC1809a152 = (InterfaceC1809a1) this.f16777t;
                InterfaceC1809a1 interfaceC1809a153 = (InterfaceC1809a1) this.f16778u;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h010.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1553151078, new C5369ub(this.f16766i, this.f16767j, this.f16768k, this.f16769l, this.f16770m, this.f16771n, interfaceC1809a146, interfaceC1809a147, interfaceC1809a148, interfaceC1809a149, interfaceC1809a150, interfaceC1809a151, interfaceC1809a152, interfaceC1809a153), c1836h010), c1836h010, 48, 1);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                InterfaceC4544a interfaceC4544a2 = (InterfaceC4544a) this.f16773p;
                C4060x c4060x3 = (C4060x) this.f16776s;
                Context context8 = (Context) this.f16772o;
                InterfaceC1220a interfaceC1220a14 = (InterfaceC1220a) this.f16774q;
                C3641z c3641z6 = (C3641z) this.f16775r;
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f16765h;
                InterfaceC1809a1 interfaceC1809a154 = (InterfaceC1809a1) this.f16777t;
                InterfaceC1809a1 interfaceC1809a155 = (InterfaceC1809a1) this.f16778u;
                EnumC5262r3 enumC5262r3 = (EnumC5262r3) obj;
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                enumC5262r3.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c1836h011.m4530d(enumC5262r3.ordinal()) ? 4 : 2;
                }
                if (c1836h011.m4516S(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    int iOrdinal2 = enumC5262r3.ordinal();
                    InterfaceC1809a1 interfaceC1809a156 = this.f16769l;
                    if (iOrdinal2 == 0) {
                        c1836h011.m4525a0(-2051275043);
                        AbstractC4955ho.m9297B2(interfaceC4544a2.mo4984b(), interfaceC4544a2.mo4984b(), c4060x3, null, null, AbstractC3879i.m8071e(322851453, new C4880ff(interfaceC1220a14, 23), c1836h011), AbstractC3879i.m8071e(-1867068297, new C4852ek(c4060x3, c3641z6, context8, sharedPreferences4, this.f16766i, this.f16767j, this.f16768k, interfaceC1809a156, this.f16770m, this.f16771n, interfaceC1809a154, interfaceC1809a155), c1836h011), c1836h011, 1769472, 24);
                        c1836h011.m4553p(false);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw AbstractC0255e.m1015d(c1836h011, -2051276819, false);
                        }
                        c1836h011.m4525a0(-2050963047);
                        Object objM4514P31 = c1836h011.m4514P();
                        if (objM4514P31 == C1851l.f6155a) {
                            objM4514P31 = new C4885fk(interfaceC1809a156, 2);
                            c1836h011.m4545k0(objM4514P31);
                        }
                        AbstractC4955ho.m9399O0(context8, (InterfaceC1220a) objM4514P31, c1836h011, 48);
                        c1836h011.m4553p(false);
                    }
                } else {
                    c1836h011.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                SharedPreferences sharedPreferences5 = (SharedPreferences) this.f16765h;
                Context context9 = (Context) this.f16772o;
                InterfaceC1220a interfaceC1220a15 = (InterfaceC1220a) this.f16774q;
                InterfaceC1809a1 interfaceC1809a157 = (InterfaceC1809a1) this.f16773p;
                InterfaceC1809a1 interfaceC1809a158 = (InterfaceC1809a1) this.f16775r;
                InterfaceC1809a1 interfaceC1809a159 = (InterfaceC1809a1) this.f16776s;
                InterfaceC1809a1 interfaceC1809a160 = (InterfaceC1809a1) this.f16777t;
                InterfaceC1809a1 interfaceC1809a161 = (InterfaceC1809a1) this.f16778u;
                C1836h0 c1836h012 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h012.m4516S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    boolean zM4538h13 = c1836h012.m4538h(sharedPreferences5) | c1836h012.m4538h(context9);
                    Object objM4514P32 = c1836h012.m4514P();
                    if (zM4538h13 || objM4514P32 == C1851l.f6155a) {
                        interfaceC1220a = interfaceC1220a15;
                        c1836h03 = c1836h012;
                        C4715ae c4715ae = new C4715ae(sharedPreferences5, context9, this.f16766i, this.f16767j, this.f16768k, this.f16769l, this.f16770m, this.f16771n, interfaceC1809a157, interfaceC1809a158, interfaceC1809a159, interfaceC1809a160, interfaceC1809a161);
                        c1836h03.m4545k0(c4715ae);
                        objM4514P32 = c4715ae;
                    } else {
                        interfaceC1220a = interfaceC1220a15;
                        c1836h03 = c1836h012;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P32, "返回", interfaceC1220a, null, null, c1836h03, 390, 48);
                } else {
                    c1836h012.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                InterfaceC4544a interfaceC4544a3 = (InterfaceC4544a) this.f16773p;
                C3641z c3641z7 = (C3641z) this.f16775r;
                InterfaceC1220a interfaceC1220a16 = (InterfaceC1220a) this.f16774q;
                SharedPreferences sharedPreferences6 = (SharedPreferences) this.f16765h;
                Context context10 = (Context) this.f16772o;
                C4143c c4143c = (C4143c) this.f16776s;
                Handler handler = (Handler) this.f16777t;
                InterfaceC1809a1 interfaceC1809a162 = (InterfaceC1809a1) this.f16778u;
                C4831e c4831e = (C4831e) obj;
                C1836h0 c1836h013 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                c4831e.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= (iIntValue9 & 8) == 0 ? c1836h013.m4534f(c4831e) : c1836h013.m4538h(c4831e) ? 4 : 2;
                }
                if (c1836h013.m4516S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    boolean zEquals2 = c4831e.equals(C4831e.f16739b);
                    InterfaceC1809a1 interfaceC1809a163 = this.f16768k;
                    C1823e c1823e5 = C1851l.f6155a;
                    if (zEquals2) {
                        c1836h013.m4525a0(-678191935);
                        InterfaceC1809a1 interfaceC1809a164 = this.f16769l;
                        int iM9548g = AbstractC4955ho.m9548g(interfaceC1809a164);
                        InterfaceC1809a1 interfaceC1809a165 = this.f16766i;
                        String str2 = (String) interfaceC1809a165.getValue();
                        InterfaceC1809a1 interfaceC1809a166 = this.f16767j;
                        String str3 = (String) interfaceC1809a166.getValue();
                        String str4 = (String) interfaceC1809a163.getValue();
                        InterfaceC1809a1 interfaceC1809a167 = this.f16770m;
                        boolean zBooleanValue = ((Boolean) interfaceC1809a167.getValue()).booleanValue();
                        InterfaceC1809a1 interfaceC1809a168 = this.f16771n;
                        String str5 = (String) interfaceC1809a168.getValue();
                        boolean zM4538h14 = c1836h013.m4538h(sharedPreferences6);
                        Object objM4514P33 = c1836h013.m4514P();
                        if (zM4538h14 || objM4514P33 == c1823e5) {
                            i9 = iM9548g;
                            objM4514P33 = new C4818di(sharedPreferences6, interfaceC1809a164, 11);
                            c1836h013.m4545k0(objM4514P33);
                        } else {
                            i9 = iM9548g;
                        }
                        InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) objM4514P33;
                        boolean zM4538h15 = c1836h013.m4538h(context10) | c1836h013.m4534f(interfaceC1809a165) | c1836h013.m4534f(interfaceC1809a166);
                        Object objM4514P34 = c1836h013.m4514P();
                        if (zM4538h15 || objM4514P34 == c1823e5) {
                            c1823e2 = c1823e5;
                            interfaceC1809a13 = interfaceC1809a163;
                            interfaceC1809a14 = interfaceC1809a168;
                            c0467n0 = new C0467n0(context10, interfaceC1809a14, interfaceC1809a165, interfaceC1809a166, 20);
                            c1836h013.m4545k0(c0467n0);
                        } else {
                            interfaceC1809a13 = interfaceC1809a163;
                            c0467n0 = objM4514P34;
                            c1823e2 = c1823e5;
                            interfaceC1809a14 = interfaceC1809a168;
                        }
                        InterfaceC1220a interfaceC1220a17 = (InterfaceC1220a) c0467n0;
                        Object objM4514P35 = c1836h013.m4514P();
                        if (objM4514P35 == c1823e2) {
                            objM4514P35 = new C4753bj(interfaceC1809a162, 23);
                            c1836h013.m4545k0(objM4514P35);
                        }
                        InterfaceC1220a interfaceC1220a18 = (InterfaceC1220a) objM4514P35;
                        boolean zM4534f17 = c1836h013.m4534f(interfaceC1809a165) | c1836h013.m4534f(interfaceC1809a166);
                        Object objM4514P36 = c1836h013.m4514P();
                        if (zM4534f17 || objM4514P36 == c1823e2) {
                            objM4514P36 = new C0500x0(28, interfaceC1809a165, interfaceC1809a166);
                            c1836h013.m4545k0(objM4514P36);
                        }
                        InterfaceC1220a interfaceC1220a19 = (InterfaceC1220a) objM4514P36;
                        boolean zM4534f18 = c1836h013.m4534f(interfaceC1809a165) | c1836h013.m4538h(context10) | c1836h013.m4534f(interfaceC1809a13) | c1836h013.m4538h(c4143c) | c1836h013.m4538h(handler) | c1836h013.m4534f(interfaceC1809a166);
                        Object objM4514P37 = c1836h013.m4514P();
                        if (zM4534f18 || objM4514P37 == c1823e2) {
                            C0491u0 c0491u0 = new C0491u0(interfaceC1809a164, c4143c, interfaceC1809a167, interfaceC1809a165, context10, interfaceC1809a14, interfaceC1809a13, handler, interfaceC1809a166);
                            c1836h013.m4545k0(c0491u0);
                            objM4514P37 = c0491u0;
                        }
                        AbstractC4955ho.m9530e(interfaceC4544a3, i9, str2, str3, str4, zBooleanValue, str5, c3641z7, interfaceC1220a16, interfaceC1231l8, interfaceC1220a17, interfaceC1220a18, interfaceC1220a19, (InterfaceC1220a) objM4514P37, c1836h013, 0);
                        c1836h013.m4553p(false);
                    } else {
                        if (!c4831e.equals(C4831e.f16738a)) {
                            throw AbstractC0255e.m1015d(c1836h013, 255216496, false);
                        }
                        c1836h013.m4525a0(-676469699);
                        String str6 = (String) interfaceC1809a163.getValue();
                        if (AbstractC3149m.m6721t0(str6)) {
                            str6 = null;
                        }
                        String strM9316D5 = AbstractC4955ho.m9316D5(AbstractC0000a.m1A0(str6));
                        Object objM4514P38 = c1836h013.m4514P();
                        if (objM4514P38 == c1823e5) {
                            objM4514P38 = new C5204pb(27);
                            c1836h013.m4545k0(objM4514P38);
                        }
                        C5391v0 c5391v02 = new C5391v0("选择发送聊天", EnumC5358u0.f20981j, false, strM9316D5, (InterfaceC1231l) objM4514P38, false, 224);
                        Object objM4514P39 = c1836h013.m4514P();
                        if (objM4514P39 == c1823e5) {
                            objM4514P39 = new C4753bj(interfaceC1809a162, 24);
                            c1836h013.m4545k0(objM4514P39);
                        }
                        InterfaceC1220a interfaceC1220a20 = (InterfaceC1220a) objM4514P39;
                        boolean zM4534f19 = c1836h013.m4534f(interfaceC1809a163) | c1836h013.m4538h(sharedPreferences6);
                        Object objM4514P40 = c1836h013.m4514P();
                        if (zM4534f19 || objM4514P40 == c1823e5) {
                            objM4514P40 = new C4746bc(sharedPreferences6, interfaceC1809a163, interfaceC1809a162, 7);
                            c1836h013.m4545k0(objM4514P40);
                        }
                        AbstractC4955ho.m9504b0(context10, c5391v02, interfaceC1220a20, (InterfaceC1231l) objM4514P40, c1836h013, 384);
                        c1836h013.m4553p(false);
                    }
                } else {
                    c1836h013.m4519V();
                }
                return C3967n.f12976a;
            default:
                C4060x c4060x4 = (C4060x) this.f16773p;
                C3641z c3641z8 = (C3641z) this.f16775r;
                String str7 = (String) this.f16765h;
                C4969i5 c4969i5 = (C4969i5) this.f16776s;
                List list4 = (List) this.f16777t;
                InterfaceC1809a1 interfaceC1809a169 = (InterfaceC1809a1) this.f16778u;
                InterfaceC1220a interfaceC1220a21 = (InterfaceC1220a) this.f16774q;
                Context context11 = (Context) this.f16772o;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h014 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= c1836h014.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h014.m4516S(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x4.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    boolean zM4534f20 = c1836h014.m4534f(str7) | c1836h014.m4538h(c4969i5);
                    InterfaceC1809a1 interfaceC1809a170 = this.f16766i;
                    boolean zM4534f21 = zM4534f20 | c1836h014.m4534f(interfaceC1809a170);
                    InterfaceC1809a1 interfaceC1809a171 = this.f16767j;
                    boolean zM4534f22 = zM4534f21 | c1836h014.m4534f(interfaceC1809a171) | c1836h014.m4538h(list4);
                    InterfaceC1809a1 interfaceC1809a172 = this.f16768k;
                    boolean zM4534f23 = zM4534f22 | c1836h014.m4534f(interfaceC1809a172);
                    InterfaceC1809a1 interfaceC1809a173 = this.f16769l;
                    boolean zM4534f24 = zM4534f23 | c1836h014.m4534f(interfaceC1809a173);
                    InterfaceC1809a1 interfaceC1809a174 = this.f16770m;
                    boolean zM4534f25 = zM4534f24 | c1836h014.m4534f(interfaceC1809a174);
                    InterfaceC1809a1 interfaceC1809a175 = this.f16771n;
                    boolean zM4534f26 = zM4534f25 | c1836h014.m4534f(interfaceC1809a175) | c1836h014.m4534f(interfaceC1809a169) | c1836h014.m4534f(interfaceC1220a21) | c1836h014.m4538h(context11);
                    Object objM4514P41 = c1836h014.m4514P();
                    if (zM4534f26 || objM4514P41 == C1851l.f6155a) {
                        c1836h04 = c1836h014;
                        c5237qb2 = new C5237qb(c4969i5, str7, interfaceC1809a170, interfaceC1809a171, list4, interfaceC1809a172, interfaceC1809a173, interfaceC1809a174, interfaceC1809a175, interfaceC1809a169, interfaceC1220a21, context11);
                        c1836h04.m4545k0(c5237qb2);
                    } else {
                        c5237qb2 = objM4514P41;
                        c1836h04 = c1836h014;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, c3641z8, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) c5237qb2, c1836h04, 0, 504);
                } else {
                    c1836h014.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C4840e8(Context context, InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, InterfaceC1220a interfaceC1220a, C3641z c3641z, C0848s c0848s, C3641z c3641z2, C3641z c3641z3, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16) {
        this.f16772o = context;
        this.f16773p = interfaceC4544a;
        this.f16765h = sharedPreferences;
        this.f16774q = interfaceC1220a;
        this.f16775r = c3641z;
        this.f16778u = c0848s;
        this.f16776s = c3641z2;
        this.f16777t = c3641z3;
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16768k = interfaceC1809a13;
        this.f16769l = interfaceC1809a14;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
    }

    public /* synthetic */ C4840e8(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111) {
        this.f16765h = sharedPreferences;
        this.f16772o = context;
        this.f16774q = interfaceC1220a;
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16768k = interfaceC1809a13;
        this.f16769l = interfaceC1809a14;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
        this.f16773p = interfaceC1809a17;
        this.f16775r = interfaceC1809a18;
        this.f16776s = interfaceC1809a19;
        this.f16777t = interfaceC1809a110;
        this.f16778u = interfaceC1809a111;
    }

    public /* synthetic */ C4840e8(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f16765h = sharedPreferences;
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16768k = interfaceC1809a13;
        this.f16769l = interfaceC1809a14;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
        this.f16772o = interfaceC1809a17;
        this.f16773p = interfaceC1809a18;
        this.f16774q = interfaceC1809a19;
        this.f16775r = interfaceC1809a110;
        this.f16776s = interfaceC1809a111;
        this.f16777t = interfaceC1809a112;
        this.f16778u = interfaceC1809a113;
    }

    public /* synthetic */ C4840e8(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16768k = interfaceC1809a13;
        this.f16769l = interfaceC1809a14;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
        this.f16772o = interfaceC1809a17;
        this.f16773p = interfaceC1809a18;
        this.f16765h = interfaceC1809a19;
        this.f16774q = interfaceC1809a110;
        this.f16775r = interfaceC1809a111;
        this.f16776s = interfaceC1809a112;
        this.f16777t = interfaceC1809a113;
        this.f16778u = interfaceC1809a114;
    }

    public /* synthetic */ C4840e8(C4060x c4060x, C3641z c3641z, Context context, C5725r c5725r, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110) {
        this.f16773p = c4060x;
        this.f16775r = c3641z;
        this.f16772o = context;
        this.f16765h = c5725r;
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16768k = interfaceC1809a13;
        this.f16769l = interfaceC1809a14;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
        this.f16774q = interfaceC1809a17;
        this.f16776s = interfaceC1809a18;
        this.f16777t = interfaceC1809a19;
        this.f16778u = interfaceC1809a110;
    }

    public /* synthetic */ C4840e8(C4060x c4060x, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC3599t interfaceC3599t, Context context, List list, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, C5725r c5725r, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f16773p = c4060x;
        this.f16775r = c3641z;
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16765h = interfaceC3599t;
        this.f16772o = context;
        this.f16774q = list;
        this.f16768k = interfaceC1809a13;
        this.f16769l = interfaceC1809a14;
        this.f16776s = c5725r;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
        this.f16777t = interfaceC1809a17;
        this.f16778u = interfaceC1809a18;
    }

    public /* synthetic */ C4840e8(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, C5725r c5725r, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111) {
        this.f16772o = context;
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16768k = interfaceC1809a13;
        this.f16769l = interfaceC1809a14;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
        this.f16773p = interfaceC1809a17;
        this.f16774q = c5725r;
        this.f16765h = sharedPreferences;
        this.f16775r = interfaceC1809a18;
        this.f16776s = interfaceC1809a19;
        this.f16777t = interfaceC1809a110;
        this.f16778u = interfaceC1809a111;
    }

    public /* synthetic */ C4840e8(InterfaceC4544a interfaceC4544a, C3641z c3641z, InterfaceC1220a interfaceC1220a, SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, C4143c c4143c, Handler handler, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f16773p = interfaceC4544a;
        this.f16775r = c3641z;
        this.f16774q = interfaceC1220a;
        this.f16765h = sharedPreferences;
        this.f16772o = context;
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16768k = interfaceC1809a13;
        this.f16776s = c4143c;
        this.f16777t = handler;
        this.f16769l = interfaceC1809a14;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
        this.f16778u = interfaceC1809a17;
    }

    public /* synthetic */ C4840e8(InterfaceC4544a interfaceC4544a, C4060x c4060x, Context context, InterfaceC1220a interfaceC1220a, C3641z c3641z, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f16773p = interfaceC4544a;
        this.f16776s = c4060x;
        this.f16772o = context;
        this.f16774q = interfaceC1220a;
        this.f16775r = c3641z;
        this.f16765h = sharedPreferences;
        this.f16766i = interfaceC1809a1;
        this.f16767j = interfaceC1809a12;
        this.f16768k = interfaceC1809a13;
        this.f16769l = interfaceC1809a14;
        this.f16770m = interfaceC1809a15;
        this.f16771n = interfaceC1809a16;
        this.f16777t = interfaceC1809a17;
        this.f16778u = interfaceC1809a18;
    }
}
