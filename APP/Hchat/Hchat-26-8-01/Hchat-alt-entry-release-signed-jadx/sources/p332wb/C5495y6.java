package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p036c9.C0454k;
import p036c9.C0475p0;
import p036c9.C0482r0;
import p065eb.C0884o;
import p080fb.C1183v;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p155ka.C2381g;
import p213ob.AbstractC3123p;
import p213ob.C3122o;
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
import p317vb.InterfaceC4544a;
import p345x8.C5709b;
import p345x8.C5725r;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import tf.AbstractC4167n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.y6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5495y6 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22073g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f22074h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f22075i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f22076j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f22077k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f22078l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f22079m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f22080n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5495y6(InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1231l interfaceC1231l, C4936h5 c4936h5, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1220a interfaceC1220a) {
        this.f22073g = 6;
        this.f22077k = interfaceC1809a1;
        this.f22075i = context;
        this.f22076j = interfaceC1231l;
        this.f22080n = c4936h5;
        this.f22078l = interfaceC1809a12;
        this.f22079m = interfaceC1809a13;
        this.f22074h = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        String str;
        Context context;
        switch (this.f22073g) {
            case 0:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f22075i;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f22076j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f22074h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f22077k;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f22078l;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f22079m;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f22080n;
                AbstractC5091lu abstractC5091lu = (AbstractC5091lu) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                abstractC5091lu.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c1836h0.m4534f(abstractC5091lu) : c1836h0.m4538h(abstractC5091lu) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zEquals = abstractC5091lu.equals(C5025ju.f18248a);
                    C1823e c1823e = C1851l.f6155a;
                    if (zEquals) {
                        c1836h0.m4525a0(377005164);
                        String str2 = (String) interfaceC1809a1.getValue();
                        String str3 = (String) interfaceC1809a12.getValue();
                        String str4 = (String) interfaceC1809a13.getValue();
                        Object objM4514P = c1836h0.m4514P();
                        if (objM4514P == c1823e) {
                            objM4514P = new C4919gl(interfaceC1809a14, 8);
                            c1836h0.m4545k0(objM4514P);
                        }
                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P;
                        boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P2 = c1836h0.m4514P();
                        if (zM4538h || objM4514P2 == c1823e) {
                            objM4514P2 = new C4746bc(sharedPreferences, interfaceC1809a12, interfaceC1809a13, 13);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P2;
                        boolean zM4538h2 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P3 = c1836h0.m4514P();
                        if (zM4538h2 || objM4514P3 == c1823e) {
                            objM4514P3 = new C4818di(sharedPreferences, interfaceC1809a13, 16);
                            c1836h0.m4545k0(objM4514P3);
                        }
                        AbstractC4955ho.m9434S3(interfaceC4544a, sharedPreferences, str2, str3, str4, interfaceC1220a, interfaceC1220a2, interfaceC1231l, (InterfaceC1231l) objM4514P3, c1836h0, 1572864);
                        c1836h0.m4553p(false);
                    } else {
                        if (!abstractC5091lu.equals(C5058ku.f18540a)) {
                            throw AbstractC0255e.m1015d(c1836h0, 377004370, false);
                        }
                        c1836h0.m4525a0(377037406);
                        List list = AbstractC3123p.f10127a;
                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                        int i9 = 0;
                        for (Object obj4 : list) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C3122o c3122o = (C3122o) obj4;
                            arrayList.add(new C4759bp(c3122o.f10125b, i9, c3122o.f10126c));
                            i9 = i10;
                        }
                        Iterator it = AbstractC3123p.f10127a.iterator();
                        int i11 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i11 = -1;
                            } else if (!((C3122o) it.next()).f10124a.equals((String) interfaceC1809a1.getValue())) {
                                i11++;
                            }
                        }
                        if (i11 < 0) {
                            i11 = 0;
                        }
                        Object objM4514P4 = c1836h0.m4514P();
                        if (objM4514P4 == c1823e) {
                            objM4514P4 = new C5015jk(6);
                            c1836h0.m4545k0(objM4514P4);
                        }
                        C4792cp c4792cp = new C4792cp("选择在线语音", arrayList, i11, (InterfaceC1231l) objM4514P4);
                        Object objM4514P5 = c1836h0.m4514P();
                        if (objM4514P5 == c1823e) {
                            objM4514P5 = new C4919gl(interfaceC1809a14, 9);
                            c1836h0.m4545k0(objM4514P5);
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P5;
                        boolean zM4538h3 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P6 = c1836h0.m4514P();
                        if (zM4538h3 || objM4514P6 == c1823e) {
                            objM4514P6 = new C4818di(sharedPreferences, interfaceC1809a1, 17);
                            c1836h0.m4545k0(objM4514P6);
                        }
                        AbstractC4955ho.m9711y2(c4792cp, interfaceC1220a3, (InterfaceC1231l) objM4514P6, c1836h0, 48);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                C4060x c4060x = (C4060x) this.f22075i;
                C3641z c3641z = (C3641z) this.f22076j;
                C5709b c5709b = (C5709b) this.f22077k;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f22078l;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f22079m;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f22080n;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f22074h;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h4 = c1836h02.m4538h(c5709b) | c1836h02.m4534f(interfaceC1231l2) | c1836h02.m4534f(interfaceC1231l3) | c1836h02.m4534f(interfaceC1231l4) | c1836h02.m4534f(interfaceC1220a4);
                    Object objM4514P7 = c1836h02.m4514P();
                    if (zM4538h4 || objM4514P7 == C1851l.f6155a) {
                        objM4514P7 = new C0884o(c5709b, interfaceC1231l2, interfaceC1231l3, interfaceC1231l4, interfaceC1220a4, 9);
                        c1836h02.m4545k0(objM4514P7);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P7, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                List list2 = (List) this.f22075i;
                ArrayList arrayList2 = (ArrayList) this.f22076j;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f22077k;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f22078l;
                List list3 = (List) this.f22074h;
                List list4 = (List) this.f22080n;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f22079m;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-664393352, new C4805d5(list2, arrayList2, interfaceC1809a15, interfaceC1809a16, list3, list4, interfaceC1809a17, 1), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                String str5 = (String) this.f22075i;
                Context context2 = (Context) this.f22076j;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f22077k;
                C5725r c5725r = (C5725r) this.f22074h;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f22078l;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f22079m;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f22080n;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String str6 = (String) interfaceC1809a110.getValue();
                    String str7 = (String) interfaceC1809a111.getValue();
                    boolean zContains = ((Set) interfaceC1809a18.getValue()).contains(str5);
                    boolean zM4534f = c1836h04.m4534f(str5) | c1836h04.m4538h(context2);
                    Object objM4514P8 = c1836h04.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4534f || objM4514P8 == c1823e2) {
                        objM4514P8 = new C5538zh(str5, context2, interfaceC1809a111, 0);
                        c1836h04.m4545k0(objM4514P8);
                    }
                    InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P8;
                    boolean zM4534f2 = c1836h04.m4534f(interfaceC1809a18) | c1836h04.m4534f(str5) | c1836h04.m4538h(c5725r) | c1836h04.m4534f(interfaceC1809a19) | c1836h04.m4538h(context2);
                    Object objM4514P9 = c1836h04.m4514P();
                    if (zM4534f2 || objM4514P9 == c1823e2) {
                        str = str5;
                        C0482r0 c0482r0 = new C0482r0(str, c5725r, context2, interfaceC1809a18, interfaceC1809a19, 15);
                        c1836h04.m4545k0(c0482r0);
                        objM4514P9 = c0482r0;
                    } else {
                        str = str5;
                    }
                    AbstractC4955ho.m9643q4(str, str6, str7, zContains, interfaceC1220a5, (InterfaceC1220a) objM4514P9, c1836h04, 0);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C4060x c4060x2 = (C4060x) this.f22075i;
                C3641z c3641z2 = (C3641z) this.f22074h;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f22076j;
                Context context3 = (Context) this.f22080n;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f22077k;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f22078l;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f22079m;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c1836h05.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    boolean zM4538h5 = c1836h05.m4538h(sharedPreferences2) | c1836h05.m4538h(context3);
                    Object objM4514P10 = c1836h05.m4514P();
                    if (zM4538h5 || objM4514P10 == C1851l.f6155a) {
                        objM4514P10 = new C4711aa(sharedPreferences2, interfaceC1809a112, interfaceC1809a113, context3, interfaceC1809a114);
                        c1836h05.m4545k0(objM4514P10);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z2, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P10, c1836h05, 0, 504);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                InterfaceC4544a interfaceC4544a2 = (InterfaceC4544a) this.f22075i;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f22076j;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f22074h;
                Context context4 = (Context) this.f22079m;
                C2381g c2381g = (C2381g) this.f22080n;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f22077k;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f22078l;
                AbstractC4924gq abstractC4924gq = (AbstractC4924gq) obj;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                abstractC4924gq.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? c1836h06.m4534f(abstractC4924gq) : c1836h06.m4538h(abstractC4924gq) ? 4 : 2;
                }
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    boolean zEquals2 = abstractC4924gq.equals(C4891fq.f17278a);
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zEquals2) {
                        c1836h06.m4525a0(1555977424);
                        Set set = (Set) interfaceC1809a115.getValue();
                        Object objM4514P11 = c1836h06.m4514P();
                        if (objM4514P11 == c1823e3) {
                            objM4514P11 = new C5213pk(3, interfaceC1809a115, interfaceC1809a116);
                            c1836h06.m4545k0(objM4514P11);
                        }
                        AbstractC4955ho.m9393N2(interfaceC4544a2, sharedPreferences3, set, interfaceC1220a6, (InterfaceC1220a) objM4514P11, c1836h06, 24576);
                        c1836h06.m4553p(false);
                    } else {
                        if (!(abstractC4924gq instanceof C4858eq)) {
                            throw AbstractC0255e.m1015d(c1836h06, 1555976149, false);
                        }
                        c1836h06.m4525a0(1556001590);
                        C5391v0 c5391v0 = ((C4858eq) abstractC4924gq).f16971a;
                        Object objM4514P12 = c1836h06.m4514P();
                        if (objM4514P12 == c1823e3) {
                            objM4514P12 = new C4885fk(interfaceC1809a116, 26);
                            c1836h06.m4545k0(objM4514P12);
                        }
                        InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P12;
                        boolean zM4538h6 = c1836h06.m4538h(c2381g) | c1836h06.m4538h(context4);
                        Object objM4514P13 = c1836h06.m4514P();
                        if (zM4538h6 || objM4514P13 == c1823e3) {
                            context = context4;
                            C0454k c0454k = new C0454k(c2381g, context, interfaceC1809a115, interfaceC1809a116, 24);
                            c1836h06.m4545k0(c0454k);
                            objM4514P13 = c0454k;
                        } else {
                            context = context4;
                        }
                        AbstractC4955ho.m9504b0(context, c5391v0, interfaceC1220a7, (InterfaceC1231l) objM4514P13, c1836h06, 384);
                        c1836h06.m4553p(false);
                    }
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f22077k;
                Context context5 = (Context) this.f22075i;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f22076j;
                C4936h5 c4936h5 = (C4936h5) this.f22080n;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f22078l;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f22079m;
                InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) this.f22074h;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    boolean zM4534f3 = c1836h07.m4534f(interfaceC1809a117) | c1836h07.m4538h(context5) | c1836h07.m4534f(interfaceC1231l5) | c1836h07.m4538h(c4936h5) | c1836h07.m4534f(interfaceC1809a118) | c1836h07.m4534f(interfaceC1809a119);
                    Object objM4514P14 = c1836h07.m4514P();
                    if (zM4534f3 || objM4514P14 == C1851l.f6155a) {
                        objM4514P14 = new C0475p0(context5, interfaceC1231l5, c4936h5, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, 3);
                        c1836h07.m4545k0(objM4514P14);
                    }
                    AbstractC4955ho.m9382M("保存名单", (InterfaceC1220a) objM4514P14, "返回", interfaceC1220a8, null, null, c1836h07, 390, 48);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                C4060x c4060x3 = (C4060x) this.f22075i;
                C3641z c3641z3 = (C3641z) this.f22076j;
                C4936h5 c4936h52 = (C4936h5) this.f22074h;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f22077k;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f22078l;
                List list5 = (List) this.f22080n;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f22079m;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c1836h08.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x3.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    boolean zM4538h7 = c1836h08.m4538h(c4936h52) | c1836h08.m4534f(interfaceC1809a120) | c1836h08.m4534f(interfaceC1809a121) | c1836h08.m4538h(list5) | c1836h08.m4534f(interfaceC1809a122);
                    Object objM4514P15 = c1836h08.m4514P();
                    if (zM4538h7 || objM4514P15 == C1851l.f6155a) {
                        objM4514P15 = new C0884o(c4936h52, interfaceC1809a120, interfaceC1809a121, list5, interfaceC1809a122, 7);
                        c1836h08.m4545k0(objM4514P15);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, c3641z3, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P15, c1836h08, 0, 504);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                C4060x c4060x4 = (C4060x) this.f22075i;
                C3641z c3641z4 = (C3641z) this.f22076j;
                ArrayList arrayList3 = (ArrayList) this.f22074h;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f22077k;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f22078l;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f22079m;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f22080n;
                InterfaceC3268x0 interfaceC3268x04 = (InterfaceC3268x0) obj;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                interfaceC3268x04.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= c1836h09.m4534f(interfaceC3268x04) ? 4 : 2;
                }
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x4.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x04.mo6924c() + 8, interfaceC3268x04.mo6922a() + 84, 5);
                    boolean zM4538h8 = c1836h09.m4538h(arrayList3);
                    Object objM4514P16 = c1836h09.m4514P();
                    if (zM4538h8 || objM4514P16 == C1851l.f6155a) {
                        objM4514P16 = new C0884o(arrayList3, interfaceC1809a123, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, 8);
                        c1836h09.m4545k0(objM4514P16);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, c3641z4, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P16, c1836h09, 0, 504);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            default:
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f22075i;
                C1183v c1183v = (C1183v) this.f22076j;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f22077k;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f22078l;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f22079m;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f22080n;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f22074h;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(2011776858, new C4805d5(interfaceC3599t, c1183v, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, 5), c1836h010), c1836h010, 48, 1);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5495y6(Object obj, Object obj2, Object obj3, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, int i9) {
        this.f22073g = i9;
        this.f22075i = obj;
        this.f22076j = obj2;
        this.f22074h = obj3;
        this.f22077k = interfaceC1809a1;
        this.f22078l = interfaceC1809a12;
        this.f22079m = interfaceC1809a13;
        this.f22080n = interfaceC1809a14;
    }

    public /* synthetic */ C5495y6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i9) {
        this.f22073g = i9;
        this.f22075i = obj;
        this.f22076j = obj2;
        this.f22077k = obj3;
        this.f22078l = obj4;
        this.f22079m = obj5;
        this.f22080n = obj6;
        this.f22074h = obj7;
    }

    public /* synthetic */ C5495y6(String str, Context context, InterfaceC1809a1 interfaceC1809a1, C5725r c5725r, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f22073g = 3;
        this.f22075i = str;
        this.f22076j = context;
        this.f22077k = interfaceC1809a1;
        this.f22074h = c5725r;
        this.f22078l = interfaceC1809a12;
        this.f22079m = interfaceC1809a13;
        this.f22080n = interfaceC1809a14;
    }

    public /* synthetic */ C5495y6(List list, ArrayList arrayList, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list2, List list3, InterfaceC1809a1 interfaceC1809a13) {
        this.f22073g = 2;
        this.f22075i = list;
        this.f22076j = arrayList;
        this.f22077k = interfaceC1809a1;
        this.f22078l = interfaceC1809a12;
        this.f22074h = list2;
        this.f22080n = list3;
        this.f22079m = interfaceC1809a13;
    }

    public /* synthetic */ C5495y6(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f22073g = 4;
        this.f22075i = c4060x;
        this.f22074h = c3641z;
        this.f22076j = sharedPreferences;
        this.f22080n = context;
        this.f22077k = interfaceC1809a1;
        this.f22078l = interfaceC1809a12;
        this.f22079m = interfaceC1809a13;
    }

    public /* synthetic */ C5495y6(C4060x c4060x, C3641z c3641z, C4936h5 c4936h5, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list, InterfaceC1809a1 interfaceC1809a13) {
        this.f22073g = 7;
        this.f22075i = c4060x;
        this.f22076j = c3641z;
        this.f22074h = c4936h5;
        this.f22077k = interfaceC1809a1;
        this.f22078l = interfaceC1809a12;
        this.f22080n = list;
        this.f22079m = interfaceC1809a13;
    }

    public /* synthetic */ C5495y6(InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, InterfaceC1220a interfaceC1220a, Context context, C2381g c2381g, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f22073g = 5;
        this.f22075i = interfaceC4544a;
        this.f22076j = sharedPreferences;
        this.f22074h = interfaceC1220a;
        this.f22079m = context;
        this.f22080n = c2381g;
        this.f22077k = interfaceC1809a1;
        this.f22078l = interfaceC1809a12;
    }
}
