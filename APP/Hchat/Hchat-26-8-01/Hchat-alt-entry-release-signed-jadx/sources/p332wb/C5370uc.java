package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.C1414j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import na.C2920h;
import p000a.AbstractC0000a;
import p015b0.C0146l;
import p025bc.AbstractC0255e;
import p036c9.C0500x0;
import p049d9.AbstractC0754o;
import p051db.C0765c;
import p065eb.C0880m;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.AbstractC3617b0;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p277t.C4074f;
import p317vb.InterfaceC4544a;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;
import sh.C4029m1;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.uc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5370uc implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21087g = 6;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f21088h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f21089i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f21090j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f21091k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21092l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21093m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f21094n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f21095o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f21096p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5370uc(C4060x c4060x, ArrayList arrayList, List list, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f21088h = c4060x;
        this.f21091k = arrayList;
        this.f21096p = list;
        this.f21090j = list2;
        this.f21089i = interfaceC1235p;
        this.f21092l = interfaceC1809a1;
        this.f21093m = interfaceC1809a12;
        this.f21094n = interfaceC1809a13;
        this.f21095o = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Object next;
        InterfaceC1220a interfaceC1220a;
        Context context;
        C2920h c2920h;
        switch (this.f21087g) {
            case 0:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f21088h;
                Context context2 = (Context) this.f21091k;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f21094n;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f21090j;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21089i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f21095o;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21096p;
                EnumC4997j2 enumC4997j2 = (EnumC4997j2) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                enumC4997j2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4530d(enumC4997j2.ordinal()) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int iOrdinal = enumC4997j2.ordinal();
                    InterfaceC1809a1 interfaceC1809a14 = this.f21093m;
                    C1823e c1823e = C1851l.f6155a;
                    if (iOrdinal == 0) {
                        c1836h0.m4525a0(1644494661);
                        InterfaceC1809a1 interfaceC1809a15 = this.f21092l;
                        Iterator it = ((List) interfaceC1809a15.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (AbstractC1416l.m3825a(((C5292s0) next).f20550a, (String) interfaceC1809a14.getValue())) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        C5292s0 c5292s0 = (C5292s0) next;
                        boolean zM4530d = c1836h0.m4530d(((Number) interfaceC1809a1.getValue()).intValue());
                        Object objM4514P = c1836h0.m4514P();
                        if (zM4530d || objM4514P == c1823e) {
                            objM4514P = AbstractC0754o.m1945b(context2);
                            c1836h0.m4545k0(objM4514P);
                        }
                        Set set = (Set) objM4514P;
                        List list = (List) interfaceC1809a15.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (set.contains(((C5292s0) obj4).f20550a)) {
                                arrayList.add(obj4);
                            }
                        }
                        C3641z c3641zM7603a = AbstractC3617b0.m7603a(c1836h0);
                        C4060x c4060xM8245i = AbstractC4045s.m8245i(c1836h0);
                        AbstractC4955ho.m9297B2(interfaceC4544a.mo4984b(), interfaceC4544a.mo4984b(), c4060xM8245i, null, null, AbstractC3879i.m8071e(1628712005, new C4853el(interfaceC1220a2, 3), c1836h0), AbstractC3879i.m8071e(426449215, new C4801d1(c4060xM8245i, c3641zM7603a, sharedPreferences, c5292s0, context2, arrayList, interfaceC1809a12, interfaceC1809a13, interfaceC1809a1, interfaceC1809a14), c1836h0), c1836h0, 1769472, 24);
                        c1836h0.m4553p(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw AbstractC0255e.m1015d(c1836h0, -1886615522, false);
                        }
                        c1836h0.m4525a0(-1886347568);
                        String str = (String) interfaceC1809a14.getValue();
                        Object objM4514P2 = c1836h0.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C5015jk(5);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        C5391v0 c5391v0 = new C5391v0("选择好友", EnumC5358u0.f20978g, false, str, (InterfaceC1231l) objM4514P2, false, false, "确定");
                        Object objM4514P3 = c1836h0.m4514P();
                        if (objM4514P3 == c1823e) {
                            objM4514P3 = new C4919gl(interfaceC1809a13, 7);
                            c1836h0.m4545k0(objM4514P3);
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P3;
                        Object objM4514P4 = c1836h0.m4514P();
                        if (objM4514P4 == c1823e) {
                            objM4514P4 = new C4029m1(27, interfaceC1809a14, interfaceC1809a13);
                            c1836h0.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9504b0(context2, c5391v0, interfaceC1220a3, (InterfaceC1231l) objM4514P4, c1836h0, 3456);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC4544a interfaceC4544a2 = (InterfaceC4544a) this.f21088h;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f21089i;
                C3641z c3641z = (C3641z) this.f21095o;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f21090j;
                C3641z c3641z2 = (C3641z) this.f21096p;
                Context context3 = (Context) this.f21091k;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f21094n;
                AbstractC4862eu abstractC4862eu = (AbstractC4862eu) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                abstractC4862eu.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? c1836h02.m4534f(abstractC4862eu) : c1836h02.m4538h(abstractC4862eu) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zEquals = abstractC4862eu.equals(C4797cu.f16466c);
                    InterfaceC1809a1 interfaceC1809a17 = this.f21092l;
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zEquals) {
                        c1836h02.m4525a0(557243462);
                        Object objM4514P5 = c1836h02.m4514P();
                        if (objM4514P5 == c1823e2) {
                            objM4514P5 = new C4885fk(interfaceC1809a17, 12);
                            c1836h02.m4545k0(objM4514P5);
                        }
                        AbstractC4955ho.m9720z3(interfaceC4544a2, sharedPreferences2, c3641z, interfaceC1220a4, (InterfaceC1220a) objM4514P5, c1836h02, 24576);
                        c1836h02.m4553p(false);
                    } else {
                        boolean zEquals2 = abstractC4862eu.equals(C4797cu.f16465b);
                        InterfaceC1809a1 interfaceC1809a18 = this.f21093m;
                        if (zEquals2) {
                            c1836h02.m4525a0(557643610);
                            C0765c c0765c = (C0765c) interfaceC1809a18.getValue();
                            int iIntValue3 = ((Number) interfaceC1809a16.getValue()).intValue();
                            Object objM4514P6 = c1836h02.m4514P();
                            if (objM4514P6 == c1823e2) {
                                objM4514P6 = new C4885fk(interfaceC1809a17, 13);
                                c1836h02.m4545k0(objM4514P6);
                            }
                            InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P6;
                            Object objM4514P7 = c1836h02.m4514P();
                            if (objM4514P7 == c1823e2) {
                                objM4514P7 = new C4917gj(interfaceC1809a18, 17);
                                c1836h02.m4545k0(objM4514P7);
                            }
                            InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P7;
                            Object objM4514P8 = c1836h02.m4514P();
                            if (objM4514P8 == c1823e2) {
                                objM4514P8 = new C4029m1(18, interfaceC1809a16, interfaceC1809a18);
                                c1836h02.m4545k0(objM4514P8);
                            }
                            InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P8;
                            boolean zM4538h = c1836h02.m4538h(context3);
                            Object objM4514P9 = c1836h02.m4514P();
                            if (zM4538h || objM4514P9 == c1823e2) {
                                objM4514P9 = new C4791co(context3, interfaceC1809a16, interfaceC1809a18, interfaceC1809a17);
                                c1836h02.m4545k0(objM4514P9);
                            }
                            InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) ((C1414j) objM4514P9);
                            boolean zM4538h2 = c1836h02.m4538h(context3);
                            Object objM4514P10 = c1836h02.m4514P();
                            if (zM4538h2 || objM4514P10 == c1823e2) {
                                objM4514P10 = new C4776c9(context3, interfaceC1809a18, 6);
                                c1836h02.m4545k0(objM4514P10);
                            }
                            InterfaceC1235p interfaceC1235p = (InterfaceC1235p) objM4514P10;
                            Object objM4514P11 = c1836h02.m4514P();
                            if (objM4514P11 == c1823e2) {
                                interfaceC1220a = interfaceC1220a5;
                                objM4514P11 = new C4029m1(19, interfaceC1809a18, interfaceC1809a17);
                                c1836h02.m4545k0(objM4514P11);
                            } else {
                                interfaceC1220a = interfaceC1220a5;
                            }
                            InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) objM4514P11;
                            boolean zM4538h3 = c1836h02.m4538h(context3);
                            Object objM4514P12 = c1836h02.m4514P();
                            if (zM4538h3 || objM4514P12 == c1823e2) {
                                objM4514P12 = new C4074f(context3, interfaceC1809a16, interfaceC1809a18);
                                c1836h02.m4545k0(objM4514P12);
                            }
                            AbstractC4955ho.m9712y3(c0765c, iIntValue3, c3641z2, interfaceC1220a, interfaceC1231l, interfaceC1231l2, interfaceC1220a6, interfaceC1235p, interfaceC1231l3, (InterfaceC1220a) ((C1414j) objM4514P12), c1836h02, 100887552);
                            c1836h02.m4553p(false);
                        } else if (abstractC4862eu.equals(C4797cu.f16464a)) {
                            c1836h02.m4525a0(559747766);
                            boolean z9 = ((Number) interfaceC1809a16.getValue()).intValue() == 1;
                            String str2 = z9 ? "选择官方群发好友" : "选择群发对象";
                            EnumC5358u0 enumC5358u0 = z9 ? EnumC5358u0.f20978g : EnumC5358u0.f20981j;
                            String strM9316D5 = AbstractC4955ho.m9316D5(((C0765c) interfaceC1809a18.getValue()).f2293f);
                            Object objM4514P13 = c1836h02.m4514P();
                            if (objM4514P13 == c1823e2) {
                                objM4514P13 = new C5015jk(0);
                                c1836h02.m4545k0(objM4514P13);
                            }
                            C5391v0 c5391v02 = new C5391v0(str2, enumC5358u0, true, strM9316D5, (InterfaceC1231l) objM4514P13, true, Opcodes.CHECKCAST);
                            Object objM4514P14 = c1836h02.m4514P();
                            if (objM4514P14 == c1823e2) {
                                objM4514P14 = new C4885fk(interfaceC1809a17, 14);
                                c1836h02.m4545k0(objM4514P14);
                            }
                            InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P14;
                            Object objM4514P15 = c1836h02.m4514P();
                            if (objM4514P15 == c1823e2) {
                                objM4514P15 = new C4029m1(20, interfaceC1809a18, interfaceC1809a17);
                                c1836h02.m4545k0(objM4514P15);
                            }
                            AbstractC4955ho.m9504b0(context3, c5391v02, interfaceC1220a7, (InterfaceC1231l) objM4514P15, c1836h02, 3456);
                            c1836h02.m4553p(false);
                        } else {
                            if (!(abstractC4862eu instanceof C4829du)) {
                                throw AbstractC0255e.m1015d(c1836h02, 572166326, false);
                            }
                            c1836h02.m4525a0(560699125);
                            C4737b3 c4737b3 = ((C4829du) abstractC4862eu).f16732a;
                            Object objM4514P16 = c1836h02.m4514P();
                            if (objM4514P16 == c1823e2) {
                                objM4514P16 = new C4885fk(interfaceC1809a17, 15);
                                c1836h02.m4545k0(objM4514P16);
                            }
                            AbstractC4955ho.m9319E0(c4737b3, (InterfaceC1220a) objM4514P16, c1836h02, 48);
                            c1836h02.m4553p(false);
                        }
                    }
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f21088h;
                C4806d6 c4806d6 = (C4806d6) this.f21089i;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f21094n;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f21095o;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f21096p;
                Context context4 = (Context) this.f21091k;
                InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) this.f21090j;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h03.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zM4534f = c1836h03.m4534f(interfaceC1231l4) | c1836h03.m4538h(c4806d6);
                    InterfaceC1809a1 interfaceC1809a112 = this.f21092l;
                    boolean zM4534f2 = zM4534f | c1836h03.m4534f(interfaceC1809a112);
                    InterfaceC1809a1 interfaceC1809a113 = this.f21093m;
                    boolean zM4534f3 = zM4534f2 | c1836h03.m4534f(interfaceC1809a113) | c1836h03.m4534f(interfaceC1809a19) | c1836h03.m4534f(interfaceC1809a110) | c1836h03.m4534f(interfaceC1809a111) | c1836h03.m4538h(context4);
                    Object objM4514P17 = c1836h03.m4514P();
                    if (zM4534f3 || objM4514P17 == C1851l.f6155a) {
                        objM4514P17 = new C4743b9(interfaceC1231l4, c4806d6, context4, interfaceC1809a112, interfaceC1809a113, interfaceC1809a19, interfaceC1809a110, interfaceC1809a111);
                        c1836h03.m4545k0(objM4514P17);
                    }
                    AbstractC4955ho.m9382M("保存模板", (InterfaceC1220a) objM4514P17, "返回", interfaceC1220a8, null, null, c1836h03, 390, 48);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f21089i;
                Context context5 = (Context) this.f21091k;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f21094n;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f21095o;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f21096p;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f21088h;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f21090j;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h04.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(66268010, new C4772c5(sharedPreferences3, context5, this.f21092l, this.f21093m, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, 2), c1836h04), c1836h04, 48, 1);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C4060x c4060x = (C4060x) this.f21088h;
                C3641z c3641z3 = (C3641z) this.f21094n;
                String str3 = (String) this.f21095o;
                C4957hq c4957hq = (C4957hq) this.f21096p;
                List list2 = (List) this.f21089i;
                InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) this.f21090j;
                Context context6 = (Context) this.f21091k;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c1836h05.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4534f4 = c1836h05.m4534f(str3) | c1836h05.m4538h(c4957hq);
                    InterfaceC1809a1 interfaceC1809a119 = this.f21092l;
                    boolean zM4534f5 = zM4534f4 | c1836h05.m4534f(interfaceC1809a119);
                    InterfaceC1809a1 interfaceC1809a120 = this.f21093m;
                    boolean zM4534f6 = zM4534f5 | c1836h05.m4534f(interfaceC1809a120) | c1836h05.m4538h(list2) | c1836h05.m4534f(interfaceC1220a9) | c1836h05.m4538h(context6);
                    Object objM4514P18 = c1836h05.m4514P();
                    if (zM4534f6 || objM4514P18 == C1851l.f6155a) {
                        C0880m c0880m = new C0880m(c4957hq, str3, interfaceC1809a119, interfaceC1809a120, list2, interfaceC1220a9, context6);
                        c1836h05.m4545k0(c0880m);
                        objM4514P18 = c0880m;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z3, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P18, c1836h05, 0, 504);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f21094n;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f21095o;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f21096p;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f21088h;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f21091k;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f21090j;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f21089i;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1593751118, new C4772c5(this.f21092l, this.f21093m, interfaceC1809a121, interfaceC1809a122, interfaceC1809a123, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, 1), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                Context context7 = (Context) this.f21091k;
                List list3 = (List) this.f21088h;
                String str4 = (String) this.f21095o;
                C3641z c3641z4 = (C3641z) this.f21096p;
                InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) this.f21090j;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f21089i;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f21094n;
                AbstractC5120mq abstractC5120mq = (AbstractC5120mq) obj;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                abstractC5120mq.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= (iIntValue8 & 8) == 0 ? c1836h07.m4534f(abstractC5120mq) : c1836h07.m4538h(abstractC5120mq) ? 4 : 2;
                }
                if (c1836h07.m4516S(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    boolean z10 = abstractC5120mq instanceof C5021jq;
                    InterfaceC1809a1 interfaceC1809a129 = this.f21093m;
                    C1823e c1823e3 = C1851l.f6155a;
                    if (z10) {
                        c1836h07.m4525a0(-608551642);
                        C4737b3 c4737b32 = ((C5021jq) abstractC5120mq).f18211a;
                        Object objM4514P19 = c1836h07.m4514P();
                        if (objM4514P19 == c1823e3) {
                            objM4514P19 = new C5070l9(interfaceC1809a129, 2);
                            c1836h07.m4545k0(objM4514P19);
                        }
                        AbstractC4955ho.m9319E0(c4737b32, (InterfaceC1220a) objM4514P19, c1836h07, 48);
                        c1836h07.m4553p(false);
                    } else {
                        boolean z11 = abstractC5120mq instanceof C5087lq;
                        InterfaceC1809a1 interfaceC1809a130 = this.f21092l;
                        if (z11) {
                            c1836h07.m4525a0(-608277850);
                            int i9 = ((C5087lq) abstractC5120mq).f18771a;
                            C2920h c2920h2 = (C2920h) ((List) interfaceC1809a130.getValue()).get(i9);
                            String strM2250m = AbstractC0921a.m2250m(i9 + 1, "第 ", " 条回复");
                            boolean z12 = i9 > 0;
                            boolean z13 = i9 < AbstractC0000a.m54b0((List) interfaceC1809a130.getValue());
                            Object objM4514P20 = c1836h07.m4514P();
                            if (objM4514P20 == c1823e3) {
                                objM4514P20 = new C5070l9(interfaceC1809a128, 3);
                                c1836h07.m4545k0(objM4514P20);
                            }
                            InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) objM4514P20;
                            boolean zM4534f7 = c1836h07.m4534f(interfaceC1809a130) | c1836h07.m4530d(i9);
                            Object objM4514P21 = c1836h07.m4514P();
                            if (zM4534f7 || objM4514P21 == c1823e3) {
                                objM4514P21 = new C5233q7(i9, interfaceC1809a130, 1);
                                c1836h07.m4545k0(objM4514P21);
                            }
                            InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) objM4514P21;
                            Object objM4514P22 = c1836h07.m4514P();
                            if (objM4514P22 == c1823e3) {
                                context = context7;
                                objM4514P22 = new C0146l(interfaceC1809a129, 28);
                                c1836h07.m4545k0(objM4514P22);
                            } else {
                                context = context7;
                            }
                            InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) objM4514P22;
                            boolean zM4530d2 = c1836h07.m4530d(i9) | c1836h07.m4534f(interfaceC1809a130);
                            Object objM4514P23 = c1836h07.m4514P();
                            if (zM4530d2 || objM4514P23 == c1823e3) {
                                objM4514P23 = new C5038ka(i9, interfaceC1809a130, interfaceC1809a128, 0);
                                c1836h07.m4545k0(objM4514P23);
                            }
                            InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) objM4514P23;
                            boolean zM4530d3 = c1836h07.m4530d(i9) | c1836h07.m4534f(interfaceC1809a130);
                            Object objM4514P24 = c1836h07.m4514P();
                            if (zM4530d3 || objM4514P24 == c1823e3) {
                                c2920h = c2920h2;
                                objM4514P24 = new C5038ka(i9, interfaceC1809a130, interfaceC1809a128, 1);
                                c1836h07.m4545k0(objM4514P24);
                            } else {
                                c2920h = c2920h2;
                            }
                            InterfaceC1220a interfaceC1220a13 = (InterfaceC1220a) objM4514P24;
                            boolean zM4534f8 = c1836h07.m4534f(interfaceC1809a130) | c1836h07.m4530d(i9);
                            Object objM4514P25 = c1836h07.m4514P();
                            if (zM4534f8 || objM4514P25 == c1823e3) {
                                objM4514P25 = new C5038ka(i9, interfaceC1809a130, interfaceC1809a128);
                                c1836h07.m4545k0(objM4514P25);
                            }
                            AbstractC4955ho.m9507b3(context, strM2250m, c2920h, z12, z13, interfaceC1220a11, interfaceC1231l6, list3, interfaceC1231l7, interfaceC1220a12, interfaceC1220a13, (InterfaceC1220a) objM4514P25, c1836h07, 100859904);
                            c1836h07.m4553p(false);
                        } else {
                            if (!abstractC5120mq.equals(C5054kq.f18516a)) {
                                throw AbstractC0255e.m1015d(c1836h07, -1959292785, false);
                            }
                            c1836h07.m4525a0(-1959231632);
                            List list4 = (List) interfaceC1809a130.getValue();
                            boolean zM4534f9 = c1836h07.m4534f(interfaceC1231l5) | c1836h07.m4534f(interfaceC1809a130);
                            Object objM4514P26 = c1836h07.m4514P();
                            if (zM4534f9 || objM4514P26 == c1823e3) {
                                objM4514P26 = new C5161o1(interfaceC1231l5, interfaceC1809a130, 2);
                                c1836h07.m4545k0(objM4514P26);
                            }
                            InterfaceC1220a interfaceC1220a14 = (InterfaceC1220a) objM4514P26;
                            Object objM4514P27 = c1836h07.m4514P();
                            if (objM4514P27 == c1823e3) {
                                objM4514P27 = new C0146l(interfaceC1809a128, 29);
                                c1836h07.m4545k0(objM4514P27);
                            }
                            InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) objM4514P27;
                            boolean zM4534f10 = c1836h07.m4534f(interfaceC1809a130);
                            Object objM4514P28 = c1836h07.m4514P();
                            if (zM4534f10 || objM4514P28 == c1823e3) {
                                objM4514P28 = new C0500x0(10, interfaceC1809a130, interfaceC1809a128);
                                c1836h07.m4545k0(objM4514P28);
                            }
                            InterfaceC1220a interfaceC1220a15 = (InterfaceC1220a) objM4514P28;
                            boolean zM4534f11 = c1836h07.m4534f(interfaceC1809a130);
                            Object objM4514P29 = c1836h07.m4514P();
                            if (zM4534f11 || objM4514P29 == c1823e3) {
                                objM4514P29 = new C0146l(interfaceC1809a130, 25);
                                c1836h07.m4545k0(objM4514P29);
                            }
                            InterfaceC1231l interfaceC1231l9 = (InterfaceC1231l) objM4514P29;
                            boolean zM4534f12 = c1836h07.m4534f(interfaceC1809a130);
                            Object objM4514P30 = c1836h07.m4514P();
                            if (zM4534f12 || objM4514P30 == c1823e3) {
                                objM4514P30 = new C0146l(interfaceC1809a130, 26);
                                c1836h07.m4545k0(objM4514P30);
                            }
                            InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) objM4514P30;
                            boolean zM4534f13 = c1836h07.m4534f(interfaceC1809a130);
                            Object objM4514P31 = c1836h07.m4514P();
                            if (zM4534f13 || objM4514P31 == c1823e3) {
                                objM4514P31 = new C0146l(interfaceC1809a130, 27);
                                c1836h07.m4545k0(objM4514P31);
                            }
                            AbstractC4955ho.m9516c3(str4, list4, c3641z4, interfaceC1220a10, interfaceC1220a14, interfaceC1231l8, interfaceC1220a15, interfaceC1231l9, interfaceC1231l10, (InterfaceC1231l) objM4514P31, c1836h07, 196608);
                            c1836h07.m4553p(false);
                        }
                    }
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                C4060x c4060x2 = (C4060x) this.f21088h;
                C3641z c3641z5 = (C3641z) this.f21091k;
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f21089i;
                Set set2 = (Set) this.f21096p;
                InterfaceC1220a interfaceC1220a16 = (InterfaceC1220a) this.f21090j;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f21094n;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f21095o;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= c1836h08.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h08.m4516S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    boolean zM4538h4 = c1836h08.m4538h(sharedPreferences4) | c1836h08.m4538h(set2) | c1836h08.m4534f(interfaceC1220a16);
                    Object objM4514P32 = c1836h08.m4514P();
                    if (zM4538h4 || objM4514P32 == C1851l.f6155a) {
                        C0880m c0880m2 = new C0880m(sharedPreferences4, set2, interfaceC1220a16, this.f21092l, this.f21093m, interfaceC1809a131, interfaceC1809a132, 3);
                        c1836h08.m4545k0(c0880m2);
                        objM4514P32 = c0880m2;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z5, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P32, c1836h08, 0, 504);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                C4060x c4060x3 = (C4060x) this.f21088h;
                ArrayList arrayList2 = (ArrayList) this.f21091k;
                List list5 = (List) this.f21096p;
                List list6 = (List) this.f21090j;
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f21089i;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f21094n;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f21095o;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= c1836h09.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h09.m4516S(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x3.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    boolean zM4538h5 = c1836h09.m4538h(arrayList2) | c1836h09.m4538h(list5) | c1836h09.m4538h(list6) | c1836h09.m4534f(interfaceC1235p2);
                    Object objM4514P33 = c1836h09.m4514P();
                    if (zM4538h5 || objM4514P33 == C1851l.f6155a) {
                        objM4514P33 = new C5128n1(this.f21092l, this.f21093m, arrayList2, list5, list6, interfaceC1235p2, interfaceC1809a133, interfaceC1809a134);
                        c1836h09.m4545k0(objM4514P33);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, null, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P33, c1836h09, 0, 506);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            default:
                C4060x c4060x4 = (C4060x) this.f21088h;
                C3641z c3641z6 = (C3641z) this.f21091k;
                List list7 = (List) this.f21090j;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f21094n;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f21095o;
                ArrayList arrayList3 = (ArrayList) this.f21089i;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f21096p;
                InterfaceC3268x0 interfaceC3268x04 = (InterfaceC3268x0) obj;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                interfaceC3268x04.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= c1836h010.m4534f(interfaceC3268x04) ? 4 : 2;
                }
                if (c1836h010.m4516S(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x4.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x04.mo6924c() + 8, interfaceC3268x04.mo6922a() + 84, 5);
                    boolean zM4538h6 = c1836h010.m4538h(list7);
                    InterfaceC1809a1 interfaceC1809a138 = this.f21092l;
                    boolean zM4534f14 = zM4538h6 | c1836h010.m4534f(interfaceC1809a138);
                    InterfaceC1809a1 interfaceC1809a139 = this.f21093m;
                    boolean zM4534f15 = zM4534f14 | c1836h010.m4534f(interfaceC1809a139) | c1836h010.m4534f(interfaceC1809a135) | c1836h010.m4534f(interfaceC1809a136) | c1836h010.m4538h(arrayList3);
                    Object objM4514P34 = c1836h010.m4514P();
                    if (zM4534f15 || objM4514P34 == C1851l.f6155a) {
                        C0880m c0880m3 = new C0880m(arrayList3, list7, interfaceC1809a138, interfaceC1809a137, interfaceC1809a139, interfaceC1809a135, interfaceC1809a136, 4);
                        c1836h010.m4545k0(c0880m3);
                        objM4514P34 = c0880m3;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, c3641z6, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P34, c1836h010, 0, 504);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5370uc(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17) {
        this.f21089i = sharedPreferences;
        this.f21091k = context;
        this.f21092l = interfaceC1809a1;
        this.f21093m = interfaceC1809a12;
        this.f21094n = interfaceC1809a13;
        this.f21095o = interfaceC1809a14;
        this.f21096p = interfaceC1809a15;
        this.f21088h = interfaceC1809a16;
        this.f21090j = interfaceC1809a17;
    }

    public /* synthetic */ C5370uc(InterfaceC1231l interfaceC1231l, C4806d6 c4806d6, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, Context context, InterfaceC1220a interfaceC1220a) {
        this.f21088h = interfaceC1231l;
        this.f21089i = c4806d6;
        this.f21092l = interfaceC1809a1;
        this.f21093m = interfaceC1809a12;
        this.f21094n = interfaceC1809a13;
        this.f21095o = interfaceC1809a14;
        this.f21096p = interfaceC1809a15;
        this.f21091k = context;
        this.f21090j = interfaceC1220a;
    }

    public /* synthetic */ C5370uc(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19) {
        this.f21092l = interfaceC1809a1;
        this.f21093m = interfaceC1809a12;
        this.f21094n = interfaceC1809a13;
        this.f21095o = interfaceC1809a14;
        this.f21096p = interfaceC1809a15;
        this.f21088h = interfaceC1809a16;
        this.f21091k = interfaceC1809a17;
        this.f21090j = interfaceC1809a18;
        this.f21089i = interfaceC1809a19;
    }

    public /* synthetic */ C5370uc(Context context, InterfaceC1809a1 interfaceC1809a1, List list, String str, C3641z c3641z, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f21091k = context;
        this.f21092l = interfaceC1809a1;
        this.f21088h = list;
        this.f21095o = str;
        this.f21096p = c3641z;
        this.f21090j = interfaceC1220a;
        this.f21089i = interfaceC1231l;
        this.f21093m = interfaceC1809a12;
        this.f21094n = interfaceC1809a13;
    }

    public /* synthetic */ C5370uc(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, Set set, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f21088h = c4060x;
        this.f21091k = c3641z;
        this.f21089i = sharedPreferences;
        this.f21096p = set;
        this.f21090j = interfaceC1220a;
        this.f21092l = interfaceC1809a1;
        this.f21093m = interfaceC1809a12;
        this.f21094n = interfaceC1809a13;
        this.f21095o = interfaceC1809a14;
    }

    public /* synthetic */ C5370uc(C4060x c4060x, C3641z c3641z, String str, C4957hq c4957hq, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list, InterfaceC1220a interfaceC1220a, Context context) {
        this.f21088h = c4060x;
        this.f21094n = c3641z;
        this.f21095o = str;
        this.f21096p = c4957hq;
        this.f21092l = interfaceC1809a1;
        this.f21093m = interfaceC1809a12;
        this.f21089i = list;
        this.f21090j = interfaceC1220a;
        this.f21091k = context;
    }

    public /* synthetic */ C5370uc(C4060x c4060x, C3641z c3641z, List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, ArrayList arrayList, InterfaceC1809a1 interfaceC1809a15) {
        this.f21088h = c4060x;
        this.f21091k = c3641z;
        this.f21090j = list;
        this.f21092l = interfaceC1809a1;
        this.f21093m = interfaceC1809a12;
        this.f21094n = interfaceC1809a13;
        this.f21095o = interfaceC1809a14;
        this.f21089i = arrayList;
        this.f21096p = interfaceC1809a15;
    }

    public /* synthetic */ C5370uc(InterfaceC4544a interfaceC4544a, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1220a interfaceC1220a, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f21088h = interfaceC4544a;
        this.f21091k = context;
        this.f21092l = interfaceC1809a1;
        this.f21093m = interfaceC1809a12;
        this.f21094n = interfaceC1809a13;
        this.f21090j = interfaceC1220a;
        this.f21089i = sharedPreferences;
        this.f21095o = interfaceC1809a14;
        this.f21096p = interfaceC1809a15;
    }

    public /* synthetic */ C5370uc(InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, C3641z c3641z, InterfaceC1220a interfaceC1220a, C3641z c3641z2, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f21088h = interfaceC4544a;
        this.f21089i = sharedPreferences;
        this.f21095o = c3641z;
        this.f21090j = interfaceC1220a;
        this.f21096p = c3641z2;
        this.f21091k = context;
        this.f21092l = interfaceC1809a1;
        this.f21093m = interfaceC1809a12;
        this.f21094n = interfaceC1809a13;
    }
}
