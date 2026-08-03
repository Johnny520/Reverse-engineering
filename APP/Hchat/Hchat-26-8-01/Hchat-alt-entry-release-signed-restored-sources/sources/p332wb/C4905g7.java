package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p011ab.C0045e;
import p025bc.AbstractC0255e;
import p036c9.C0427d0;
import p036c9.C0454k;
import p036c9.C0482r0;
import p036c9.C0500x0;
import p063e9.C0832c;
import p065eb.C0880m;
import p065eb.C0886p;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p198nb.C2957z;
import p211o9.C3104q;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p261rb.C3796l;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p315v8.C4521a;
import p317vb.InterfaceC4544a;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.g7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4905g7 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17347g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f17348h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f17349i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f17350j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f17351k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f17352l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f17353m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f17354n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f17355o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4905g7(Context context, InterfaceC4544a interfaceC4544a, InterfaceC1220a interfaceC1220a, C3796l c3796l, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f17348h = context;
        this.f17353m = interfaceC4544a;
        this.f17354n = interfaceC1220a;
        this.f17355o = c3796l;
        this.f17349i = interfaceC1809a1;
        this.f17350j = interfaceC1809a12;
        this.f17351k = interfaceC1809a13;
        this.f17352l = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Context context;
        boolean z9;
        switch (this.f17347g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f17349i;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f17354n;
                String str = (String) this.f17355o;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f17350j;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f17351k;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f17352l;
                Context context2 = (Context) this.f17348h;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f17353m;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-739258937, new C0427d0(interfaceC1809a1, sharedPreferences, str, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, context2, interfaceC1809a15, 6), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                C4060x c4060x = (C4060x) this.f17349i;
                C3641z c3641z = (C3641z) this.f17350j;
                C4521a c4521a = (C4521a) this.f17351k;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f17352l;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f17353m;
                Context context3 = (Context) this.f17348h;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f17354n;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f17355o;
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
                    boolean zM4538h = c1836h02.m4538h(c4521a) | c1836h02.m4534f(interfaceC1231l) | c1836h02.m4534f(interfaceC1235p) | c1836h02.m4538h(context3) | c1836h02.m4534f(interfaceC1231l2) | c1836h02.m4534f(interfaceC1231l3);
                    Object objM4514P = c1836h02.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        C0886p c0886p = new C0886p(c4521a, interfaceC1231l, interfaceC1235p, context3, interfaceC1231l2, interfaceC1231l3, 5);
                        c1836h02.m4545k0(c0886p);
                        objM4514P = c0886p;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f17351k;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f17354n;
                C3641z c3641z2 = (C3641z) this.f17352l;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f17353m;
                Context context4 = (Context) this.f17348h;
                C2957z c2957z = (C2957z) this.f17355o;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f17349i;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f17350j;
                AbstractC4992iu abstractC4992iu = (AbstractC4992iu) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                abstractC4992iu.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? c1836h03.m4534f(abstractC4992iu) : c1836h03.m4538h(abstractC4992iu) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zEquals = abstractC4992iu.equals(C4961hu.f17742a);
                    C1823e c1823e = C1851l.f6155a;
                    if (zEquals) {
                        c1836h03.m4525a0(-1714010644);
                        Set set = (Set) interfaceC1809a16.getValue();
                        Object objM4514P2 = c1836h03.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C5213pk(6, interfaceC1809a16, interfaceC1809a17);
                            c1836h03.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9418Q3(interfaceC4544a, sharedPreferences2, set, c3641z2, interfaceC1220a, (InterfaceC1220a) objM4514P2, c1836h03, 196608);
                        c1836h03.m4553p(false);
                    } else {
                        if (!(abstractC4992iu instanceof C4928gu)) {
                            throw AbstractC0255e.m1015d(c1836h03, -1714011819, false);
                        }
                        c1836h03.m4525a0(-1713985262);
                        C5391v0 c5391v0 = ((C4928gu) abstractC4992iu).f17500a;
                        Object objM4514P3 = c1836h03.m4514P();
                        if (objM4514P3 == c1823e) {
                            objM4514P3 = new C5509yk(interfaceC1809a17, 24);
                            c1836h03.m4545k0(objM4514P3);
                        }
                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P3;
                        boolean zM4538h2 = c1836h03.m4538h(c2957z) | c1836h03.m4538h(context4);
                        Object objM4514P4 = c1836h03.m4514P();
                        if (zM4538h2 || objM4514P4 == c1823e) {
                            context = context4;
                            C0454k c0454k = new C0454k(context, c2957z, interfaceC1809a16, interfaceC1809a17, 25);
                            c1836h03.m4545k0(c0454k);
                            objM4514P4 = c0454k;
                        } else {
                            context = context4;
                        }
                        AbstractC4955ho.m9504b0(context, c5391v0, interfaceC1220a2, (InterfaceC1231l) objM4514P4, c1836h03, 384);
                        c1836h03.m4553p(false);
                    }
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f17354n;
                List list = (List) this.f17351k;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f17352l;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f17353m;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f17355o;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f17348h;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f17349i;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f17350j;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(2089705438, new C0427d0(sharedPreferences3, list, interfaceC1220a3, interfaceC1220a4, interfaceC1220a5, interfaceC1220a6, interfaceC1809a18, interfaceC1809a19, 8), c1836h04), c1836h04, 48, 1);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C4060x c4060x2 = (C4060x) this.f17349i;
                C3641z c3641z3 = (C3641z) this.f17350j;
                List list2 = (List) this.f17351k;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f17352l;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f17353m;
                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) this.f17354n;
                InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) this.f17355o;
                InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) this.f17348h;
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
                    boolean zM4538h3 = c1836h05.m4538h(list2) | c1836h05.m4534f(interfaceC1231l4) | c1836h05.m4534f(interfaceC1231l5) | c1836h05.m4534f(interfaceC1231l6) | c1836h05.m4534f(interfaceC1231l7) | c1836h05.m4534f(interfaceC1220a7);
                    Object objM4514P5 = c1836h05.m4514P();
                    if (zM4538h3 || objM4514P5 == C1851l.f6155a) {
                        C0886p c0886p2 = new C0886p(list2, interfaceC1231l4, interfaceC1231l5, interfaceC1231l6, interfaceC1231l7, interfaceC1220a7, 7);
                        c1836h05.m4545k0(c0886p2);
                        objM4514P5 = c0886p2;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z3, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P5, c1836h05, 0, 504);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f17354n;
                Context context5 = (Context) this.f17348h;
                Set set2 = (Set) this.f17351k;
                InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) this.f17352l;
                Set set3 = (Set) this.f17353m;
                InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) this.f17355o;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f17349i;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f17350j;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1280318595, new C0427d0(sharedPreferences4, context5, set2, interfaceC1220a8, set3, interfaceC1220a9, interfaceC1809a110, interfaceC1809a111), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                SharedPreferences sharedPreferences5 = (SharedPreferences) this.f17354n;
                Context context6 = (Context) this.f17348h;
                C0832c c0832c = (C0832c) this.f17349i;
                InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) this.f17350j;
                C0832c c0832c2 = (C0832c) this.f17351k;
                C0832c c0832c3 = (C0832c) this.f17352l;
                List list3 = (List) this.f17353m;
                InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) this.f17355o;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-549738989, new C0427d0(sharedPreferences5, context6, c0832c, interfaceC1231l8, c0832c2, c0832c3, list3, interfaceC1220a10), c1836h07), c1836h07, 48, 1);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                List list4 = (List) this.f17349i;
                C3104q c3104q = (C3104q) this.f17350j;
                ArrayList arrayList = (ArrayList) this.f17351k;
                List list5 = (List) this.f17352l;
                String str2 = (String) this.f17355o;
                String str3 = (String) this.f17353m;
                InterfaceC1231l interfaceC1231l9 = (InterfaceC1231l) this.f17354n;
                Context context7 = (Context) this.f17348h;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1096536718, new C0427d0(list4, c3104q, arrayList, list5, str2, str3, interfaceC1231l9, context7), c1836h08), c1836h08, 48, 1);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                Context context8 = (Context) this.f17348h;
                InterfaceC4544a interfaceC4544a2 = (InterfaceC4544a) this.f17353m;
                InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) this.f17354n;
                C3796l c3796l = (C3796l) this.f17355o;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f17349i;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f17350j;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f17351k;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f17352l;
                AbstractC5422vv abstractC5422vv = (AbstractC5422vv) obj;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                abstractC5422vv.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= (iIntValue9 & 8) == 0 ? c1836h09.m4534f(abstractC5422vv) : c1836h09.m4538h(abstractC5422vv) ? 4 : 2;
                }
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    boolean zEquals2 = abstractC5422vv.equals(C5389uv.f21257a);
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zEquals2) {
                        c1836h09.m4525a0(-680006298);
                        Set set4 = (Set) interfaceC1809a112.getValue();
                        Set set5 = (Set) interfaceC1809a113.getValue();
                        List list6 = (List) interfaceC1809a114.getValue();
                        Object objM4514P6 = c1836h09.m4514P();
                        if (objM4514P6 == c1823e2) {
                            objM4514P6 = new C5213pk(0, interfaceC1809a112, interfaceC1809a115);
                            c1836h09.m4545k0(objM4514P6);
                        }
                        InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) objM4514P6;
                        Object objM4514P7 = c1836h09.m4514P();
                        if (objM4514P7 == c1823e2) {
                            objM4514P7 = new C5213pk(1, interfaceC1809a113, interfaceC1809a115);
                            c1836h09.m4545k0(objM4514P7);
                        }
                        InterfaceC1220a interfaceC1220a13 = (InterfaceC1220a) objM4514P7;
                        Object objM4514P8 = c1836h09.m4514P();
                        if (objM4514P8 == c1823e2) {
                            objM4514P8 = new C4885fk(interfaceC1809a115, 17);
                            c1836h09.m4545k0(objM4514P8);
                        }
                        InterfaceC1220a interfaceC1220a14 = (InterfaceC1220a) objM4514P8;
                        Object objM4514P9 = c1836h09.m4514P();
                        if (objM4514P9 == c1823e2) {
                            objM4514P9 = new C4885fk(interfaceC1809a114, 18);
                            c1836h09.m4545k0(objM4514P9);
                        }
                        InterfaceC1220a interfaceC1220a15 = (InterfaceC1220a) objM4514P9;
                        Object objM4514P10 = c1836h09.m4514P();
                        if (objM4514P10 == c1823e2) {
                            objM4514P10 = new C5144nh(interfaceC1809a114, 10);
                            c1836h09.m4545k0(objM4514P10);
                        }
                        AbstractC4955ho.m9652r4(context8, interfaceC4544a2, set4, set5, list6, interfaceC1220a11, interfaceC1220a12, interfaceC1220a13, interfaceC1220a14, interfaceC1220a15, (InterfaceC1235p) objM4514P10, c1836h09, 920125440);
                        c1836h09.m4553p(false);
                    } else {
                        if (!(abstractC5422vv instanceof C5356tv)) {
                            throw AbstractC0255e.m1015d(c1836h09, -680006983, false);
                        }
                        c1836h09.m4525a0(-679919294);
                        C5391v0 c5391v02 = ((C5356tv) abstractC5422vv).f20976b;
                        Object objM4514P11 = c1836h09.m4514P();
                        if (objM4514P11 == c1823e2) {
                            objM4514P11 = new C4885fk(interfaceC1809a115, 19);
                            c1836h09.m4545k0(objM4514P11);
                        }
                        InterfaceC1220a interfaceC1220a16 = (InterfaceC1220a) objM4514P11;
                        boolean zM4538h4 = ((iIntValue9 & 14) == 4 || ((iIntValue9 & 8) != 0 && c1836h09.m4538h(abstractC5422vv))) | c1836h09.m4538h(c3796l);
                        Object objM4514P12 = c1836h09.m4514P();
                        if (zM4538h4 || objM4514P12 == c1823e2) {
                            z9 = false;
                            C0886p c0886p3 = new C0886p(abstractC5422vv, c3796l, interfaceC1809a112, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, 11);
                            c1836h09.m4545k0(c0886p3);
                            objM4514P12 = c0886p3;
                        } else {
                            z9 = false;
                        }
                        AbstractC4955ho.m9504b0(context8, c5391v02, interfaceC1220a16, (InterfaceC1231l) objM4514P12, c1836h09, 384);
                        c1836h09.m4553p(z9);
                    }
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                C4060x c4060x3 = (C4060x) this.f17353m;
                C3641z c3641z4 = (C3641z) this.f17355o;
                SharedPreferences sharedPreferences6 = (SharedPreferences) this.f17354n;
                Context context9 = (Context) this.f17348h;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f17349i;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f17350j;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f17351k;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f17352l;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= c1836h010.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x3.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    boolean zM4538h5 = c1836h010.m4538h(sharedPreferences6) | c1836h010.m4538h(context9);
                    Object objM4514P13 = c1836h010.m4514P();
                    if (zM4538h5 || objM4514P13 == C1851l.f6155a) {
                        objM4514P13 = new C5508yj(sharedPreferences6, context9, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119);
                        c1836h010.m4545k0(objM4514P13);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, c3641z4, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P13, c1836h010, 0, 504);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                C5292s0 c5292s0 = (C5292s0) this.f17353m;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f17349i;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f17350j;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f17351k;
                Context context10 = (Context) this.f17348h;
                InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) this.f17354n;
                InterfaceC1220a interfaceC1220a17 = (InterfaceC1220a) this.f17355o;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f17352l;
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    String str4 = (c5292s0 == null && ((Set) interfaceC1809a121.getValue()).isEmpty() && !((Boolean) interfaceC1809a122.getValue()).booleanValue()) ? "选择群聊" : "保存选择";
                    boolean zM4534f = c1836h011.m4534f(interfaceC1809a120) | c1836h011.m4534f(interfaceC1809a121) | c1836h011.m4534f(interfaceC1809a122) | c1836h011.m4538h(context10) | c1836h011.m4534f(interfaceC1231l10);
                    Object objM4514P14 = c1836h011.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4534f || objM4514P14 == c1823e3) {
                        C0482r0 c0482r0 = new C0482r0(context10, interfaceC1231l10, interfaceC1809a120, interfaceC1809a121, interfaceC1809a122, 9);
                        c1836h011.m4545k0(c0482r0);
                        objM4514P14 = c0482r0;
                    }
                    InterfaceC1220a interfaceC1220a18 = (InterfaceC1220a) objM4514P14;
                    String str5 = c5292s0 == null ? "返回" : "重新选群";
                    boolean zM4534f2 = c1836h011.m4534f(interfaceC1809a120) | c1836h011.m4534f(interfaceC1220a17) | c1836h011.m4534f(interfaceC1809a123);
                    Object objM4514P15 = c1836h011.m4514P();
                    if (zM4534f2 || objM4514P15 == c1823e3) {
                        objM4514P15 = new C0045e(interfaceC1220a17, interfaceC1809a120, interfaceC1809a123, 17);
                        c1836h011.m4545k0(objM4514P15);
                    }
                    InterfaceC1220a interfaceC1220a19 = (InterfaceC1220a) objM4514P15;
                    InterfaceC1220a interfaceC1220a20 = null;
                    String str6 = ((Set) interfaceC1809a121.getValue()).isEmpty() ? null : "清空选择";
                    if (((Set) interfaceC1809a121.getValue()).isEmpty()) {
                        c1836h011.m4525a0(-1723354404);
                    } else {
                        c1836h011.m4525a0(-1723339554);
                        boolean zM4534f3 = c1836h011.m4534f(interfaceC1809a121) | c1836h011.m4534f(interfaceC1809a122);
                        Object objM4514P16 = c1836h011.m4514P();
                        if (zM4534f3 || objM4514P16 == c1823e3) {
                            objM4514P16 = new C0500x0(13, interfaceC1809a121, interfaceC1809a122);
                            c1836h011.m4545k0(objM4514P16);
                        }
                        interfaceC1220a20 = (InterfaceC1220a) objM4514P16;
                    }
                    c1836h011.m4553p(false);
                    AbstractC4955ho.m9382M(str4, interfaceC1220a18, str5, interfaceC1220a19, str6, interfaceC1220a20, c1836h011, 0, 0);
                } else {
                    c1836h011.m4519V();
                }
                return C3967n.f12976a;
            case 11:
                C4060x c4060x4 = (C4060x) this.f17352l;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f17349i;
                List list7 = (List) this.f17353m;
                Context context11 = (Context) this.f17348h;
                C5157nu c5157nu = (C5157nu) this.f17354n;
                InterfaceC1220a interfaceC1220a21 = (InterfaceC1220a) this.f17355o;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f17350j;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f17351k;
                InterfaceC3268x0 interfaceC3268x04 = (InterfaceC3268x0) obj;
                C1836h0 c1836h012 = (C1836h0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                interfaceC3268x04.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= c1836h012.m4534f(interfaceC3268x04) ? 4 : 2;
                }
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x4.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x04.mo6924c() + 8, interfaceC3268x04.mo6922a() + 84, 5);
                    boolean zM4534f4 = c1836h012.m4534f(interfaceC1809a124) | c1836h012.m4538h(list7) | c1836h012.m4538h(context11) | c1836h012.m4538h(c5157nu) | c1836h012.m4534f(interfaceC1220a21);
                    Object objM4514P17 = c1836h012.m4514P();
                    if (zM4534f4 || objM4514P17 == C1851l.f6155a) {
                        objM4514P17 = new C0880m(c5157nu, interfaceC1809a124, list7, interfaceC1809a125, interfaceC1809a126, context11, interfaceC1220a21, 6);
                        c1836h012.m4545k0(objM4514P17);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, null, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P17, c1836h012, 0, 506);
                } else {
                    c1836h012.m4519V();
                }
                return C3967n.f12976a;
            case 12:
                SharedPreferences sharedPreferences7 = (SharedPreferences) this.f17354n;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f17349i;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f17350j;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f17351k;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f17352l;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f17353m;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f17355o;
                InterfaceC1220a interfaceC1220a22 = (InterfaceC1220a) this.f17348h;
                C1836h0 c1836h013 = (C1836h0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h013.m4516S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    boolean zM4538h6 = c1836h013.m4538h(sharedPreferences7) | c1836h013.m4534f(interfaceC1809a127) | c1836h013.m4534f(interfaceC1809a128) | c1836h013.m4534f(interfaceC1809a129) | c1836h013.m4534f(interfaceC1809a130) | c1836h013.m4534f(interfaceC1809a131) | c1836h013.m4534f(interfaceC1809a132) | c1836h013.m4534f(interfaceC1220a22);
                    Object objM4514P18 = c1836h013.m4514P();
                    if (zM4538h6 || objM4514P18 == C1851l.f6155a) {
                        objM4514P18 = new C4743b9(0, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, interfaceC1809a132, interfaceC1220a22, sharedPreferences7);
                        c1836h013.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9382M("返回", (InterfaceC1220a) objM4514P18, null, null, null, null, c1836h013, 6, 60);
                } else {
                    c1836h013.m4519V();
                }
                return C3967n.f12976a;
            case 13:
                C4060x c4060x5 = (C4060x) this.f17354n;
                C3641z c3641z5 = (C3641z) this.f17355o;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f17349i;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f17350j;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f17351k;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f17352l;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f17353m;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f17348h;
                InterfaceC3268x0 interfaceC3268x05 = (InterfaceC3268x0) obj;
                C1836h0 c1836h014 = (C1836h0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                interfaceC3268x05.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= c1836h014.m4534f(interfaceC3268x05) ? 4 : 2;
                }
                if (c1836h014.m4516S(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a5 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x5.f13440e, null);
                    C3272z0 c3272z0M6872b5 = AbstractC3208d.m6872b(interfaceC3268x05.mo6924c() + 8, interfaceC3268x05.mo6922a() + 84, 5);
                    Object objM4514P19 = c1836h014.m4514P();
                    if (objM4514P19 == C1851l.f6155a) {
                        objM4514P19 = new C0886p(interfaceC1809a133, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, 4);
                        c1836h014.m4545k0(objM4514P19);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a5, c3641z5, c3272z0M6872b5, null, null, null, false, null, (InterfaceC1231l) objM4514P19, c1836h014, 805306368, 504);
                } else {
                    c1836h014.m4519V();
                }
                return C3967n.f12976a;
            default:
                C4060x c4060x6 = (C4060x) this.f17349i;
                C3641z c3641z6 = (C3641z) this.f17350j;
                String str7 = (String) this.f17355o;
                InterfaceC1231l interfaceC1231l11 = (InterfaceC1231l) this.f17351k;
                ArrayList arrayList2 = (ArrayList) this.f17352l;
                List list8 = (List) this.f17353m;
                InterfaceC1231l interfaceC1231l12 = (InterfaceC1231l) this.f17354n;
                InterfaceC1220a interfaceC1220a23 = (InterfaceC1220a) this.f17348h;
                InterfaceC3268x0 interfaceC3268x06 = (InterfaceC3268x0) obj;
                C1836h0 c1836h015 = (C1836h0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                interfaceC3268x06.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= c1836h015.m4534f(interfaceC3268x06) ? 4 : 2;
                }
                if (c1836h015.m4516S(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a6 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x6.f13440e, null);
                    C3272z0 c3272z0M6872b6 = AbstractC3208d.m6872b(interfaceC3268x06.mo6924c() + 8, interfaceC3268x06.mo6922a() + 84, 5);
                    boolean zM4534f5 = c1836h015.m4534f(str7) | c1836h015.m4534f(interfaceC1231l11) | c1836h015.m4538h(arrayList2) | c1836h015.m4538h(list8) | c1836h015.m4534f(interfaceC1231l12) | c1836h015.m4534f(interfaceC1220a23);
                    Object objM4514P20 = c1836h015.m4514P();
                    if (zM4534f5 || objM4514P20 == C1851l.f6155a) {
                        objM4514P20 = new C0886p(list8, arrayList2, str7, interfaceC1231l11, interfaceC1231l12, interfaceC1220a23);
                        c1836h015.m4545k0(objM4514P20);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a6, c3641z6, c3272z0M6872b6, null, null, null, false, null, (InterfaceC1231l) objM4514P20, c1836h015, 0, 504);
                } else {
                    c1836h015.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C4905g7(Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, String str) {
        this.f17349i = interfaceC1809a1;
        this.f17354n = sharedPreferences;
        this.f17355o = str;
        this.f17350j = interfaceC1809a12;
        this.f17351k = interfaceC1809a13;
        this.f17352l = interfaceC1809a14;
        this.f17348h = context;
        this.f17353m = interfaceC1809a15;
    }

    public /* synthetic */ C4905g7(SharedPreferences sharedPreferences, Context context, C0832c c0832c, InterfaceC1231l interfaceC1231l, C0832c c0832c2, C0832c c0832c3, List list, InterfaceC1220a interfaceC1220a) {
        this.f17354n = sharedPreferences;
        this.f17348h = context;
        this.f17349i = c0832c;
        this.f17350j = interfaceC1231l;
        this.f17351k = c0832c2;
        this.f17352l = c0832c3;
        this.f17353m = list;
        this.f17355o = interfaceC1220a;
    }

    public /* synthetic */ C4905g7(SharedPreferences sharedPreferences, Context context, Set set, InterfaceC1220a interfaceC1220a, Set set2, InterfaceC1220a interfaceC1220a2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f17354n = sharedPreferences;
        this.f17348h = context;
        this.f17351k = set;
        this.f17352l = interfaceC1220a;
        this.f17353m = set2;
        this.f17355o = interfaceC1220a2;
        this.f17349i = interfaceC1809a1;
        this.f17350j = interfaceC1809a12;
    }

    public /* synthetic */ C4905g7(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1220a interfaceC1220a) {
        this.f17354n = sharedPreferences;
        this.f17349i = interfaceC1809a1;
        this.f17350j = interfaceC1809a12;
        this.f17351k = interfaceC1809a13;
        this.f17352l = interfaceC1809a14;
        this.f17353m = interfaceC1809a15;
        this.f17355o = interfaceC1809a16;
        this.f17348h = interfaceC1220a;
    }

    public /* synthetic */ C4905g7(SharedPreferences sharedPreferences, List list, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, InterfaceC1220a interfaceC1220a4, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f17354n = sharedPreferences;
        this.f17351k = list;
        this.f17352l = interfaceC1220a;
        this.f17353m = interfaceC1220a2;
        this.f17355o = interfaceC1220a3;
        this.f17348h = interfaceC1220a4;
        this.f17349i = interfaceC1809a1;
        this.f17350j = interfaceC1809a12;
    }

    public /* synthetic */ C4905g7(List list, C3104q c3104q, ArrayList arrayList, List list2, String str, String str2, InterfaceC1231l interfaceC1231l, Context context) {
        this.f17349i = list;
        this.f17350j = c3104q;
        this.f17351k = arrayList;
        this.f17352l = list2;
        this.f17355o = str;
        this.f17353m = str2;
        this.f17354n = interfaceC1231l;
        this.f17348h = context;
    }

    public /* synthetic */ C4905g7(C4060x c4060x, InterfaceC1809a1 interfaceC1809a1, List list, Context context, C5157nu c5157nu, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f17352l = c4060x;
        this.f17349i = interfaceC1809a1;
        this.f17353m = list;
        this.f17348h = context;
        this.f17354n = c5157nu;
        this.f17355o = interfaceC1220a;
        this.f17350j = interfaceC1809a12;
        this.f17351k = interfaceC1809a13;
    }

    public /* synthetic */ C4905g7(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f17353m = c4060x;
        this.f17355o = c3641z;
        this.f17354n = sharedPreferences;
        this.f17348h = context;
        this.f17349i = interfaceC1809a1;
        this.f17350j = interfaceC1809a12;
        this.f17351k = interfaceC1809a13;
        this.f17352l = interfaceC1809a14;
    }

    public /* synthetic */ C4905g7(C4060x c4060x, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16) {
        this.f17354n = c4060x;
        this.f17355o = c3641z;
        this.f17349i = interfaceC1809a1;
        this.f17350j = interfaceC1809a12;
        this.f17351k = interfaceC1809a13;
        this.f17352l = interfaceC1809a14;
        this.f17353m = interfaceC1809a15;
        this.f17348h = interfaceC1809a16;
    }

    public /* synthetic */ C4905g7(C4060x c4060x, C3641z c3641z, String str, InterfaceC1231l interfaceC1231l, ArrayList arrayList, List list, InterfaceC1231l interfaceC1231l2, InterfaceC1220a interfaceC1220a) {
        this.f17349i = c4060x;
        this.f17350j = c3641z;
        this.f17355o = str;
        this.f17351k = interfaceC1231l;
        this.f17352l = arrayList;
        this.f17353m = list;
        this.f17354n = interfaceC1231l2;
        this.f17348h = interfaceC1220a;
    }

    public /* synthetic */ C4905g7(C4060x c4060x, C3641z c3641z, List list, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3, InterfaceC1231l interfaceC1231l4, InterfaceC1220a interfaceC1220a) {
        this.f17349i = c4060x;
        this.f17350j = c3641z;
        this.f17351k = list;
        this.f17352l = interfaceC1231l;
        this.f17353m = interfaceC1231l2;
        this.f17354n = interfaceC1231l3;
        this.f17355o = interfaceC1231l4;
        this.f17348h = interfaceC1220a;
    }

    public /* synthetic */ C4905g7(C4060x c4060x, C3641z c3641z, C4521a c4521a, InterfaceC1231l interfaceC1231l, InterfaceC1235p interfaceC1235p, Context context, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3) {
        this.f17349i = c4060x;
        this.f17350j = c3641z;
        this.f17351k = c4521a;
        this.f17352l = interfaceC1231l;
        this.f17353m = interfaceC1235p;
        this.f17348h = context;
        this.f17354n = interfaceC1231l2;
        this.f17355o = interfaceC1231l3;
    }

    public /* synthetic */ C4905g7(InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, C3641z c3641z, InterfaceC1220a interfaceC1220a, Context context, C2957z c2957z, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f17351k = interfaceC4544a;
        this.f17354n = sharedPreferences;
        this.f17352l = c3641z;
        this.f17353m = interfaceC1220a;
        this.f17348h = context;
        this.f17355o = c2957z;
        this.f17349i = interfaceC1809a1;
        this.f17350j = interfaceC1809a12;
    }

    public /* synthetic */ C4905g7(C5292s0 c5292s0, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, Context context, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a14) {
        this.f17353m = c5292s0;
        this.f17349i = interfaceC1809a1;
        this.f17350j = interfaceC1809a12;
        this.f17351k = interfaceC1809a13;
        this.f17348h = context;
        this.f17354n = interfaceC1231l;
        this.f17355o = interfaceC1220a;
        this.f17352l = interfaceC1809a14;
    }
}
