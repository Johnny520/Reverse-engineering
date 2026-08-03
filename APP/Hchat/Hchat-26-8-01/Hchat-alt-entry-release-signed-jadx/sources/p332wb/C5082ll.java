package p332wb;

import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p109hb.C1676e0;
import p117i0.C1836h0;
import p117i0.C1851l;
import p211o9.C3104q;
import p211o9.C3105r;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p243q9.C3471g;
import p243q9.C3472h;
import p251r.C3619d;
import p251r.C3623h;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;

/* JADX INFO: renamed from: wb.ll */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5082ll implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18755g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4060x f18756h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3641z f18757i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f18758j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ List f18759k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1235p f18760l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5082ll(C4060x c4060x, C3641z c3641z, List list, List list2, InterfaceC1235p interfaceC1235p, int i9) {
        this.f18755g = i9;
        this.f18756h = c4060x;
        this.f18757i = c3641z;
        this.f18758j = list;
        this.f18759k = list2;
        this.f18760l = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f18755g;
        InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        interfaceC3268x0.getClass();
        int i10 = iIntValue & 6;
        switch (i9) {
            case 0:
                if (i10 == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f18756h.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    final List list = this.f18758j;
                    boolean zM4538h = c1836h0.m4538h(list);
                    final List list2 = this.f18759k;
                    boolean zM4538h2 = zM4538h | c1836h0.m4538h(list2);
                    final InterfaceC1235p interfaceC1235p = this.f18760l;
                    boolean zM4534f = zM4538h2 | c1836h0.m4534f(interfaceC1235p);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        final int i11 = 0;
                        objM4514P = new InterfaceC1231l() { // from class: wb.a9
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                C3623h c3623h = (C3623h) obj4;
                                switch (i11) {
                                    case 0:
                                        c3623h.getClass();
                                        C3623h.m7604a(c3623h, null, AbstractC5193p0.f19667S3, 3);
                                        final int i12 = 1;
                                        final List list3 = list;
                                        final List list4 = list2;
                                        final InterfaceC1235p interfaceC1235p2 = interfaceC1235p;
                                        C3623h.m7604a(c3623h, null, new C3874d(156742028, new InterfaceC1236q() { // from class: wb.ac
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1236q
                                            /* JADX INFO: renamed from: b */
                                            public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                int i13 = i12;
                                                C1836h0 c1836h02 = (C1836h0) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                ((C3619d) obj5).getClass();
                                                int i14 = iIntValue2 & 17;
                                                switch (i13) {
                                                    case 0:
                                                        if (c1836h02.m4516S(iIntValue2 & 1, i14 != 16)) {
                                                            final int i15 = 1;
                                                            final List list5 = list3;
                                                            final List list6 = list4;
                                                            final InterfaceC1235p interfaceC1235p3 = interfaceC1235p2;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1196043154, new InterfaceC1235p() { // from class: wb.lf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i16;
                                                                    int i17;
                                                                    int i18 = i15;
                                                                    C1836h0 c1836h03 = (C1836h0) obj8;
                                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                                    switch (i18) {
                                                                        case 0:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list7 = list5;
                                                                                if (list7.isEmpty()) {
                                                                                    c1836h03.m4525a0(-1276765158);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。模板保存一整套进退群回复配置，再批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(-1276652659);
                                                                                    int i19 = 0;
                                                                                    for (Object obj10 : list7) {
                                                                                        int i20 = i19 + 1;
                                                                                        if (i19 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3104q c3104q = (C3104q) obj10;
                                                                                        List list8 = list6;
                                                                                        if (list8 == null || !list8.isEmpty()) {
                                                                                            Iterator it = list8.iterator();
                                                                                            i16 = 0;
                                                                                            while (it.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3105r) it.next()).f10073c, c3104q.f10045a) && (i16 = i16 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i16 = 0;
                                                                                        }
                                                                                        String strM2249l = c3104q.f10046b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l)) {
                                                                                            strM2249l = AbstractC0921a.m2249l(i20, "模板 ");
                                                                                        }
                                                                                        String str = AbstractC4955ho.m9608m5(c3104q) + " · 已绑定 " + i16 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p4 = interfaceC1235p3;
                                                                                        boolean zM4534f2 = c1836h03.m4534f(interfaceC1235p4) | c1836h03.m4530d(i19) | c1836h03.m4538h(c3104q);
                                                                                        Object objM4514P2 = c1836h03.m4514P();
                                                                                        if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                                                                                            objM4514P2 = new C1676e0(interfaceC1235p4, i19, c3104q, 4);
                                                                                            c1836h03.m4545k0(objM4514P2);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l, str, (InterfaceC1220a) objM4514P2, c1836h03, 0);
                                                                                        if (i19 < list7.size() - 1) {
                                                                                            c1836h03.m4525a0(465840026);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1556152374);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i19 = i20;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list9 = list5;
                                                                                if (list9.isEmpty()) {
                                                                                    c1836h03.m4525a0(272962273);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。新增后可批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(273061907);
                                                                                    int i21 = 0;
                                                                                    for (Object obj11 : list9) {
                                                                                        int i22 = i21 + 1;
                                                                                        if (i21 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3471g c3471g = (C3471g) obj11;
                                                                                        String strM2249l2 = c3471g.f11256b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l2)) {
                                                                                            strM2249l2 = AbstractC0921a.m2249l(i22, "模板 ");
                                                                                        }
                                                                                        String strM9617n5 = AbstractC4955ho.m9617n5(c3471g);
                                                                                        List list10 = list6;
                                                                                        if (list10 == null || !list10.isEmpty()) {
                                                                                            Iterator it2 = list10.iterator();
                                                                                            i17 = 0;
                                                                                            while (it2.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3472h) it2.next()).f11266c, c3471g.f11255a) && (i17 = i17 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i17 = 0;
                                                                                        }
                                                                                        String str2 = strM9617n5 + " · 已绑定 " + i17 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p5 = interfaceC1235p3;
                                                                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1235p5) | c1836h03.m4530d(i21) | c1836h03.m4538h(c3471g);
                                                                                        Object objM4514P3 = c1836h03.m4514P();
                                                                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                                                                            objM4514P3 = new C1676e0(interfaceC1235p5, i21, c3471g, 9);
                                                                                            c1836h03.m4545k0(objM4514P3);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l2, str2, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                                                                        if (i21 < list9.size() - 1) {
                                                                                            c1836h03.m4525a0(-1607466964);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1708145124);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i21 = i22;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h02), c1836h02, 48, 1);
                                                        } else {
                                                            c1836h02.m4519V();
                                                        }
                                                        break;
                                                    default:
                                                        if (c1836h02.m4516S(iIntValue2 & 1, i14 != 16)) {
                                                            final int i16 = 0;
                                                            final List list7 = list3;
                                                            final List list8 = list4;
                                                            final InterfaceC1235p interfaceC1235p4 = interfaceC1235p2;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1828897261, new InterfaceC1235p() { // from class: wb.lf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i162;
                                                                    int i17;
                                                                    int i18 = i16;
                                                                    C1836h0 c1836h03 = (C1836h0) obj8;
                                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                                    switch (i18) {
                                                                        case 0:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list72 = list7;
                                                                                if (list72.isEmpty()) {
                                                                                    c1836h03.m4525a0(-1276765158);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。模板保存一整套进退群回复配置，再批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(-1276652659);
                                                                                    int i19 = 0;
                                                                                    for (Object obj10 : list72) {
                                                                                        int i20 = i19 + 1;
                                                                                        if (i19 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3104q c3104q = (C3104q) obj10;
                                                                                        List list82 = list8;
                                                                                        if (list82 == null || !list82.isEmpty()) {
                                                                                            Iterator it = list82.iterator();
                                                                                            i162 = 0;
                                                                                            while (it.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3105r) it.next()).f10073c, c3104q.f10045a) && (i162 = i162 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i162 = 0;
                                                                                        }
                                                                                        String strM2249l = c3104q.f10046b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l)) {
                                                                                            strM2249l = AbstractC0921a.m2249l(i20, "模板 ");
                                                                                        }
                                                                                        String str = AbstractC4955ho.m9608m5(c3104q) + " · 已绑定 " + i162 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p42 = interfaceC1235p4;
                                                                                        boolean zM4534f2 = c1836h03.m4534f(interfaceC1235p42) | c1836h03.m4530d(i19) | c1836h03.m4538h(c3104q);
                                                                                        Object objM4514P2 = c1836h03.m4514P();
                                                                                        if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                                                                                            objM4514P2 = new C1676e0(interfaceC1235p42, i19, c3104q, 4);
                                                                                            c1836h03.m4545k0(objM4514P2);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l, str, (InterfaceC1220a) objM4514P2, c1836h03, 0);
                                                                                        if (i19 < list72.size() - 1) {
                                                                                            c1836h03.m4525a0(465840026);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1556152374);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i19 = i20;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list9 = list7;
                                                                                if (list9.isEmpty()) {
                                                                                    c1836h03.m4525a0(272962273);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。新增后可批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(273061907);
                                                                                    int i21 = 0;
                                                                                    for (Object obj11 : list9) {
                                                                                        int i22 = i21 + 1;
                                                                                        if (i21 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3471g c3471g = (C3471g) obj11;
                                                                                        String strM2249l2 = c3471g.f11256b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l2)) {
                                                                                            strM2249l2 = AbstractC0921a.m2249l(i22, "模板 ");
                                                                                        }
                                                                                        String strM9617n5 = AbstractC4955ho.m9617n5(c3471g);
                                                                                        List list10 = list8;
                                                                                        if (list10 == null || !list10.isEmpty()) {
                                                                                            Iterator it2 = list10.iterator();
                                                                                            i17 = 0;
                                                                                            while (it2.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3472h) it2.next()).f11266c, c3471g.f11255a) && (i17 = i17 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i17 = 0;
                                                                                        }
                                                                                        String str2 = strM9617n5 + " · 已绑定 " + i17 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p5 = interfaceC1235p4;
                                                                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1235p5) | c1836h03.m4530d(i21) | c1836h03.m4538h(c3471g);
                                                                                        Object objM4514P3 = c1836h03.m4514P();
                                                                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                                                                            objM4514P3 = new C1676e0(interfaceC1235p5, i21, c3471g, 9);
                                                                                            c1836h03.m4545k0(objM4514P3);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l2, str2, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                                                                        if (i21 < list9.size() - 1) {
                                                                                            c1836h03.m4525a0(-1607466964);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1708145124);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i21 = i22;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h02), c1836h02, 48, 1);
                                                        } else {
                                                            c1836h02.m4519V();
                                                        }
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        }, true), 3);
                                        break;
                                    default:
                                        c3623h.getClass();
                                        C3623h.m7604a(c3623h, null, AbstractC5193p0.f19896w3, 3);
                                        final int i13 = 0;
                                        final List list5 = list;
                                        final List list6 = list2;
                                        final InterfaceC1235p interfaceC1235p3 = interfaceC1235p;
                                        C3623h.m7604a(c3623h, null, new C3874d(898838483, new InterfaceC1236q() { // from class: wb.ac
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1236q
                                            /* JADX INFO: renamed from: b */
                                            public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                int i132 = i13;
                                                C1836h0 c1836h02 = (C1836h0) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                ((C3619d) obj5).getClass();
                                                int i14 = iIntValue2 & 17;
                                                switch (i132) {
                                                    case 0:
                                                        if (c1836h02.m4516S(iIntValue2 & 1, i14 != 16)) {
                                                            final int i15 = 1;
                                                            final List list52 = list5;
                                                            final List list62 = list6;
                                                            final InterfaceC1235p interfaceC1235p32 = interfaceC1235p3;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1196043154, new InterfaceC1235p() { // from class: wb.lf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i162;
                                                                    int i17;
                                                                    int i18 = i15;
                                                                    C1836h0 c1836h03 = (C1836h0) obj8;
                                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                                    switch (i18) {
                                                                        case 0:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list72 = list52;
                                                                                if (list72.isEmpty()) {
                                                                                    c1836h03.m4525a0(-1276765158);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。模板保存一整套进退群回复配置，再批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(-1276652659);
                                                                                    int i19 = 0;
                                                                                    for (Object obj10 : list72) {
                                                                                        int i20 = i19 + 1;
                                                                                        if (i19 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3104q c3104q = (C3104q) obj10;
                                                                                        List list82 = list62;
                                                                                        if (list82 == null || !list82.isEmpty()) {
                                                                                            Iterator it = list82.iterator();
                                                                                            i162 = 0;
                                                                                            while (it.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3105r) it.next()).f10073c, c3104q.f10045a) && (i162 = i162 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i162 = 0;
                                                                                        }
                                                                                        String strM2249l = c3104q.f10046b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l)) {
                                                                                            strM2249l = AbstractC0921a.m2249l(i20, "模板 ");
                                                                                        }
                                                                                        String str = AbstractC4955ho.m9608m5(c3104q) + " · 已绑定 " + i162 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p42 = interfaceC1235p32;
                                                                                        boolean zM4534f2 = c1836h03.m4534f(interfaceC1235p42) | c1836h03.m4530d(i19) | c1836h03.m4538h(c3104q);
                                                                                        Object objM4514P2 = c1836h03.m4514P();
                                                                                        if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                                                                                            objM4514P2 = new C1676e0(interfaceC1235p42, i19, c3104q, 4);
                                                                                            c1836h03.m4545k0(objM4514P2);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l, str, (InterfaceC1220a) objM4514P2, c1836h03, 0);
                                                                                        if (i19 < list72.size() - 1) {
                                                                                            c1836h03.m4525a0(465840026);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1556152374);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i19 = i20;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list9 = list52;
                                                                                if (list9.isEmpty()) {
                                                                                    c1836h03.m4525a0(272962273);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。新增后可批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(273061907);
                                                                                    int i21 = 0;
                                                                                    for (Object obj11 : list9) {
                                                                                        int i22 = i21 + 1;
                                                                                        if (i21 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3471g c3471g = (C3471g) obj11;
                                                                                        String strM2249l2 = c3471g.f11256b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l2)) {
                                                                                            strM2249l2 = AbstractC0921a.m2249l(i22, "模板 ");
                                                                                        }
                                                                                        String strM9617n5 = AbstractC4955ho.m9617n5(c3471g);
                                                                                        List list10 = list62;
                                                                                        if (list10 == null || !list10.isEmpty()) {
                                                                                            Iterator it2 = list10.iterator();
                                                                                            i17 = 0;
                                                                                            while (it2.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3472h) it2.next()).f11266c, c3471g.f11255a) && (i17 = i17 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i17 = 0;
                                                                                        }
                                                                                        String str2 = strM9617n5 + " · 已绑定 " + i17 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p5 = interfaceC1235p32;
                                                                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1235p5) | c1836h03.m4530d(i21) | c1836h03.m4538h(c3471g);
                                                                                        Object objM4514P3 = c1836h03.m4514P();
                                                                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                                                                            objM4514P3 = new C1676e0(interfaceC1235p5, i21, c3471g, 9);
                                                                                            c1836h03.m4545k0(objM4514P3);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l2, str2, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                                                                        if (i21 < list9.size() - 1) {
                                                                                            c1836h03.m4525a0(-1607466964);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1708145124);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i21 = i22;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h02), c1836h02, 48, 1);
                                                        } else {
                                                            c1836h02.m4519V();
                                                        }
                                                        break;
                                                    default:
                                                        if (c1836h02.m4516S(iIntValue2 & 1, i14 != 16)) {
                                                            final int i16 = 0;
                                                            final List list7 = list5;
                                                            final List list8 = list6;
                                                            final InterfaceC1235p interfaceC1235p4 = interfaceC1235p3;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1828897261, new InterfaceC1235p() { // from class: wb.lf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i162;
                                                                    int i17;
                                                                    int i18 = i16;
                                                                    C1836h0 c1836h03 = (C1836h0) obj8;
                                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                                    switch (i18) {
                                                                        case 0:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list72 = list7;
                                                                                if (list72.isEmpty()) {
                                                                                    c1836h03.m4525a0(-1276765158);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。模板保存一整套进退群回复配置，再批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(-1276652659);
                                                                                    int i19 = 0;
                                                                                    for (Object obj10 : list72) {
                                                                                        int i20 = i19 + 1;
                                                                                        if (i19 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3104q c3104q = (C3104q) obj10;
                                                                                        List list82 = list8;
                                                                                        if (list82 == null || !list82.isEmpty()) {
                                                                                            Iterator it = list82.iterator();
                                                                                            i162 = 0;
                                                                                            while (it.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3105r) it.next()).f10073c, c3104q.f10045a) && (i162 = i162 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i162 = 0;
                                                                                        }
                                                                                        String strM2249l = c3104q.f10046b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l)) {
                                                                                            strM2249l = AbstractC0921a.m2249l(i20, "模板 ");
                                                                                        }
                                                                                        String str = AbstractC4955ho.m9608m5(c3104q) + " · 已绑定 " + i162 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p42 = interfaceC1235p4;
                                                                                        boolean zM4534f2 = c1836h03.m4534f(interfaceC1235p42) | c1836h03.m4530d(i19) | c1836h03.m4538h(c3104q);
                                                                                        Object objM4514P2 = c1836h03.m4514P();
                                                                                        if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                                                                                            objM4514P2 = new C1676e0(interfaceC1235p42, i19, c3104q, 4);
                                                                                            c1836h03.m4545k0(objM4514P2);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l, str, (InterfaceC1220a) objM4514P2, c1836h03, 0);
                                                                                        if (i19 < list72.size() - 1) {
                                                                                            c1836h03.m4525a0(465840026);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1556152374);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i19 = i20;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list9 = list7;
                                                                                if (list9.isEmpty()) {
                                                                                    c1836h03.m4525a0(272962273);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。新增后可批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(273061907);
                                                                                    int i21 = 0;
                                                                                    for (Object obj11 : list9) {
                                                                                        int i22 = i21 + 1;
                                                                                        if (i21 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3471g c3471g = (C3471g) obj11;
                                                                                        String strM2249l2 = c3471g.f11256b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l2)) {
                                                                                            strM2249l2 = AbstractC0921a.m2249l(i22, "模板 ");
                                                                                        }
                                                                                        String strM9617n5 = AbstractC4955ho.m9617n5(c3471g);
                                                                                        List list10 = list8;
                                                                                        if (list10 == null || !list10.isEmpty()) {
                                                                                            Iterator it2 = list10.iterator();
                                                                                            i17 = 0;
                                                                                            while (it2.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3472h) it2.next()).f11266c, c3471g.f11255a) && (i17 = i17 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i17 = 0;
                                                                                        }
                                                                                        String str2 = strM9617n5 + " · 已绑定 " + i17 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p5 = interfaceC1235p4;
                                                                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1235p5) | c1836h03.m4530d(i21) | c1836h03.m4538h(c3471g);
                                                                                        Object objM4514P3 = c1836h03.m4514P();
                                                                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                                                                            objM4514P3 = new C1676e0(interfaceC1235p5, i21, c3471g, 9);
                                                                                            c1836h03.m4545k0(objM4514P3);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l2, str2, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                                                                        if (i21 < list9.size() - 1) {
                                                                                            c1836h03.m4525a0(-1607466964);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1708145124);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i21 = i22;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h02), c1836h02, 48, 1);
                                                        } else {
                                                            c1836h02.m4519V();
                                                        }
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        }, true), 3);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, this.f18757i, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (i10 == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f18756h.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    final List list3 = this.f18758j;
                    boolean zM4538h3 = c1836h0.m4538h(list3);
                    final List list4 = this.f18759k;
                    boolean zM4538h4 = zM4538h3 | c1836h0.m4538h(list4);
                    final InterfaceC1235p interfaceC1235p2 = this.f18760l;
                    boolean zM4534f2 = zM4538h4 | c1836h0.m4534f(interfaceC1235p2);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                        final int i12 = 1;
                        objM4514P2 = new InterfaceC1231l() { // from class: wb.a9
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                C3623h c3623h = (C3623h) obj4;
                                switch (i12) {
                                    case 0:
                                        c3623h.getClass();
                                        C3623h.m7604a(c3623h, null, AbstractC5193p0.f19667S3, 3);
                                        final int i122 = 1;
                                        final List list32 = list3;
                                        final List list42 = list4;
                                        final InterfaceC1235p interfaceC1235p22 = interfaceC1235p2;
                                        C3623h.m7604a(c3623h, null, new C3874d(156742028, new InterfaceC1236q() { // from class: wb.ac
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1236q
                                            /* JADX INFO: renamed from: b */
                                            public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                int i132 = i122;
                                                C1836h0 c1836h02 = (C1836h0) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                ((C3619d) obj5).getClass();
                                                int i14 = iIntValue2 & 17;
                                                switch (i132) {
                                                    case 0:
                                                        if (c1836h02.m4516S(iIntValue2 & 1, i14 != 16)) {
                                                            final int i15 = 1;
                                                            final List list52 = list32;
                                                            final List list62 = list42;
                                                            final InterfaceC1235p interfaceC1235p32 = interfaceC1235p22;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1196043154, new InterfaceC1235p() { // from class: wb.lf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i162;
                                                                    int i17;
                                                                    int i18 = i15;
                                                                    C1836h0 c1836h03 = (C1836h0) obj8;
                                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                                    switch (i18) {
                                                                        case 0:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list72 = list52;
                                                                                if (list72.isEmpty()) {
                                                                                    c1836h03.m4525a0(-1276765158);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。模板保存一整套进退群回复配置，再批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(-1276652659);
                                                                                    int i19 = 0;
                                                                                    for (Object obj10 : list72) {
                                                                                        int i20 = i19 + 1;
                                                                                        if (i19 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3104q c3104q = (C3104q) obj10;
                                                                                        List list82 = list62;
                                                                                        if (list82 == null || !list82.isEmpty()) {
                                                                                            Iterator it = list82.iterator();
                                                                                            i162 = 0;
                                                                                            while (it.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3105r) it.next()).f10073c, c3104q.f10045a) && (i162 = i162 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i162 = 0;
                                                                                        }
                                                                                        String strM2249l = c3104q.f10046b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l)) {
                                                                                            strM2249l = AbstractC0921a.m2249l(i20, "模板 ");
                                                                                        }
                                                                                        String str = AbstractC4955ho.m9608m5(c3104q) + " · 已绑定 " + i162 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p42 = interfaceC1235p32;
                                                                                        boolean zM4534f22 = c1836h03.m4534f(interfaceC1235p42) | c1836h03.m4530d(i19) | c1836h03.m4538h(c3104q);
                                                                                        Object objM4514P22 = c1836h03.m4514P();
                                                                                        if (zM4534f22 || objM4514P22 == C1851l.f6155a) {
                                                                                            objM4514P22 = new C1676e0(interfaceC1235p42, i19, c3104q, 4);
                                                                                            c1836h03.m4545k0(objM4514P22);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l, str, (InterfaceC1220a) objM4514P22, c1836h03, 0);
                                                                                        if (i19 < list72.size() - 1) {
                                                                                            c1836h03.m4525a0(465840026);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1556152374);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i19 = i20;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list9 = list52;
                                                                                if (list9.isEmpty()) {
                                                                                    c1836h03.m4525a0(272962273);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。新增后可批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(273061907);
                                                                                    int i21 = 0;
                                                                                    for (Object obj11 : list9) {
                                                                                        int i22 = i21 + 1;
                                                                                        if (i21 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3471g c3471g = (C3471g) obj11;
                                                                                        String strM2249l2 = c3471g.f11256b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l2)) {
                                                                                            strM2249l2 = AbstractC0921a.m2249l(i22, "模板 ");
                                                                                        }
                                                                                        String strM9617n5 = AbstractC4955ho.m9617n5(c3471g);
                                                                                        List list10 = list62;
                                                                                        if (list10 == null || !list10.isEmpty()) {
                                                                                            Iterator it2 = list10.iterator();
                                                                                            i17 = 0;
                                                                                            while (it2.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3472h) it2.next()).f11266c, c3471g.f11255a) && (i17 = i17 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i17 = 0;
                                                                                        }
                                                                                        String str2 = strM9617n5 + " · 已绑定 " + i17 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p5 = interfaceC1235p32;
                                                                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1235p5) | c1836h03.m4530d(i21) | c1836h03.m4538h(c3471g);
                                                                                        Object objM4514P3 = c1836h03.m4514P();
                                                                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                                                                            objM4514P3 = new C1676e0(interfaceC1235p5, i21, c3471g, 9);
                                                                                            c1836h03.m4545k0(objM4514P3);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l2, str2, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                                                                        if (i21 < list9.size() - 1) {
                                                                                            c1836h03.m4525a0(-1607466964);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1708145124);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i21 = i22;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h02), c1836h02, 48, 1);
                                                        } else {
                                                            c1836h02.m4519V();
                                                        }
                                                        break;
                                                    default:
                                                        if (c1836h02.m4516S(iIntValue2 & 1, i14 != 16)) {
                                                            final int i16 = 0;
                                                            final List list7 = list32;
                                                            final List list8 = list42;
                                                            final InterfaceC1235p interfaceC1235p4 = interfaceC1235p22;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1828897261, new InterfaceC1235p() { // from class: wb.lf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i162;
                                                                    int i17;
                                                                    int i18 = i16;
                                                                    C1836h0 c1836h03 = (C1836h0) obj8;
                                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                                    switch (i18) {
                                                                        case 0:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list72 = list7;
                                                                                if (list72.isEmpty()) {
                                                                                    c1836h03.m4525a0(-1276765158);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。模板保存一整套进退群回复配置，再批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(-1276652659);
                                                                                    int i19 = 0;
                                                                                    for (Object obj10 : list72) {
                                                                                        int i20 = i19 + 1;
                                                                                        if (i19 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3104q c3104q = (C3104q) obj10;
                                                                                        List list82 = list8;
                                                                                        if (list82 == null || !list82.isEmpty()) {
                                                                                            Iterator it = list82.iterator();
                                                                                            i162 = 0;
                                                                                            while (it.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3105r) it.next()).f10073c, c3104q.f10045a) && (i162 = i162 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i162 = 0;
                                                                                        }
                                                                                        String strM2249l = c3104q.f10046b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l)) {
                                                                                            strM2249l = AbstractC0921a.m2249l(i20, "模板 ");
                                                                                        }
                                                                                        String str = AbstractC4955ho.m9608m5(c3104q) + " · 已绑定 " + i162 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p42 = interfaceC1235p4;
                                                                                        boolean zM4534f22 = c1836h03.m4534f(interfaceC1235p42) | c1836h03.m4530d(i19) | c1836h03.m4538h(c3104q);
                                                                                        Object objM4514P22 = c1836h03.m4514P();
                                                                                        if (zM4534f22 || objM4514P22 == C1851l.f6155a) {
                                                                                            objM4514P22 = new C1676e0(interfaceC1235p42, i19, c3104q, 4);
                                                                                            c1836h03.m4545k0(objM4514P22);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l, str, (InterfaceC1220a) objM4514P22, c1836h03, 0);
                                                                                        if (i19 < list72.size() - 1) {
                                                                                            c1836h03.m4525a0(465840026);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1556152374);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i19 = i20;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list9 = list7;
                                                                                if (list9.isEmpty()) {
                                                                                    c1836h03.m4525a0(272962273);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。新增后可批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(273061907);
                                                                                    int i21 = 0;
                                                                                    for (Object obj11 : list9) {
                                                                                        int i22 = i21 + 1;
                                                                                        if (i21 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3471g c3471g = (C3471g) obj11;
                                                                                        String strM2249l2 = c3471g.f11256b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l2)) {
                                                                                            strM2249l2 = AbstractC0921a.m2249l(i22, "模板 ");
                                                                                        }
                                                                                        String strM9617n5 = AbstractC4955ho.m9617n5(c3471g);
                                                                                        List list10 = list8;
                                                                                        if (list10 == null || !list10.isEmpty()) {
                                                                                            Iterator it2 = list10.iterator();
                                                                                            i17 = 0;
                                                                                            while (it2.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3472h) it2.next()).f11266c, c3471g.f11255a) && (i17 = i17 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i17 = 0;
                                                                                        }
                                                                                        String str2 = strM9617n5 + " · 已绑定 " + i17 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p5 = interfaceC1235p4;
                                                                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1235p5) | c1836h03.m4530d(i21) | c1836h03.m4538h(c3471g);
                                                                                        Object objM4514P3 = c1836h03.m4514P();
                                                                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                                                                            objM4514P3 = new C1676e0(interfaceC1235p5, i21, c3471g, 9);
                                                                                            c1836h03.m4545k0(objM4514P3);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l2, str2, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                                                                        if (i21 < list9.size() - 1) {
                                                                                            c1836h03.m4525a0(-1607466964);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1708145124);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i21 = i22;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h02), c1836h02, 48, 1);
                                                        } else {
                                                            c1836h02.m4519V();
                                                        }
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        }, true), 3);
                                        break;
                                    default:
                                        c3623h.getClass();
                                        C3623h.m7604a(c3623h, null, AbstractC5193p0.f19896w3, 3);
                                        final int i13 = 0;
                                        final List list5 = list3;
                                        final List list6 = list4;
                                        final InterfaceC1235p interfaceC1235p3 = interfaceC1235p2;
                                        C3623h.m7604a(c3623h, null, new C3874d(898838483, new InterfaceC1236q() { // from class: wb.ac
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1236q
                                            /* JADX INFO: renamed from: b */
                                            public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                int i132 = i13;
                                                C1836h0 c1836h02 = (C1836h0) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                ((C3619d) obj5).getClass();
                                                int i14 = iIntValue2 & 17;
                                                switch (i132) {
                                                    case 0:
                                                        if (c1836h02.m4516S(iIntValue2 & 1, i14 != 16)) {
                                                            final int i15 = 1;
                                                            final List list52 = list5;
                                                            final List list62 = list6;
                                                            final InterfaceC1235p interfaceC1235p32 = interfaceC1235p3;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1196043154, new InterfaceC1235p() { // from class: wb.lf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i162;
                                                                    int i17;
                                                                    int i18 = i15;
                                                                    C1836h0 c1836h03 = (C1836h0) obj8;
                                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                                    switch (i18) {
                                                                        case 0:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list72 = list52;
                                                                                if (list72.isEmpty()) {
                                                                                    c1836h03.m4525a0(-1276765158);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。模板保存一整套进退群回复配置，再批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(-1276652659);
                                                                                    int i19 = 0;
                                                                                    for (Object obj10 : list72) {
                                                                                        int i20 = i19 + 1;
                                                                                        if (i19 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3104q c3104q = (C3104q) obj10;
                                                                                        List list82 = list62;
                                                                                        if (list82 == null || !list82.isEmpty()) {
                                                                                            Iterator it = list82.iterator();
                                                                                            i162 = 0;
                                                                                            while (it.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3105r) it.next()).f10073c, c3104q.f10045a) && (i162 = i162 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i162 = 0;
                                                                                        }
                                                                                        String strM2249l = c3104q.f10046b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l)) {
                                                                                            strM2249l = AbstractC0921a.m2249l(i20, "模板 ");
                                                                                        }
                                                                                        String str = AbstractC4955ho.m9608m5(c3104q) + " · 已绑定 " + i162 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p42 = interfaceC1235p32;
                                                                                        boolean zM4534f22 = c1836h03.m4534f(interfaceC1235p42) | c1836h03.m4530d(i19) | c1836h03.m4538h(c3104q);
                                                                                        Object objM4514P22 = c1836h03.m4514P();
                                                                                        if (zM4534f22 || objM4514P22 == C1851l.f6155a) {
                                                                                            objM4514P22 = new C1676e0(interfaceC1235p42, i19, c3104q, 4);
                                                                                            c1836h03.m4545k0(objM4514P22);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l, str, (InterfaceC1220a) objM4514P22, c1836h03, 0);
                                                                                        if (i19 < list72.size() - 1) {
                                                                                            c1836h03.m4525a0(465840026);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1556152374);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i19 = i20;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list9 = list52;
                                                                                if (list9.isEmpty()) {
                                                                                    c1836h03.m4525a0(272962273);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。新增后可批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(273061907);
                                                                                    int i21 = 0;
                                                                                    for (Object obj11 : list9) {
                                                                                        int i22 = i21 + 1;
                                                                                        if (i21 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3471g c3471g = (C3471g) obj11;
                                                                                        String strM2249l2 = c3471g.f11256b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l2)) {
                                                                                            strM2249l2 = AbstractC0921a.m2249l(i22, "模板 ");
                                                                                        }
                                                                                        String strM9617n5 = AbstractC4955ho.m9617n5(c3471g);
                                                                                        List list10 = list62;
                                                                                        if (list10 == null || !list10.isEmpty()) {
                                                                                            Iterator it2 = list10.iterator();
                                                                                            i17 = 0;
                                                                                            while (it2.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3472h) it2.next()).f11266c, c3471g.f11255a) && (i17 = i17 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i17 = 0;
                                                                                        }
                                                                                        String str2 = strM9617n5 + " · 已绑定 " + i17 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p5 = interfaceC1235p32;
                                                                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1235p5) | c1836h03.m4530d(i21) | c1836h03.m4538h(c3471g);
                                                                                        Object objM4514P3 = c1836h03.m4514P();
                                                                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                                                                            objM4514P3 = new C1676e0(interfaceC1235p5, i21, c3471g, 9);
                                                                                            c1836h03.m4545k0(objM4514P3);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l2, str2, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                                                                        if (i21 < list9.size() - 1) {
                                                                                            c1836h03.m4525a0(-1607466964);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1708145124);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i21 = i22;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h02), c1836h02, 48, 1);
                                                        } else {
                                                            c1836h02.m4519V();
                                                        }
                                                        break;
                                                    default:
                                                        if (c1836h02.m4516S(iIntValue2 & 1, i14 != 16)) {
                                                            final int i16 = 0;
                                                            final List list7 = list5;
                                                            final List list8 = list6;
                                                            final InterfaceC1235p interfaceC1235p4 = interfaceC1235p3;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1828897261, new InterfaceC1235p() { // from class: wb.lf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i162;
                                                                    int i17;
                                                                    int i18 = i16;
                                                                    C1836h0 c1836h03 = (C1836h0) obj8;
                                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                                    switch (i18) {
                                                                        case 0:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list72 = list7;
                                                                                if (list72.isEmpty()) {
                                                                                    c1836h03.m4525a0(-1276765158);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。模板保存一整套进退群回复配置，再批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(-1276652659);
                                                                                    int i19 = 0;
                                                                                    for (Object obj10 : list72) {
                                                                                        int i20 = i19 + 1;
                                                                                        if (i19 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3104q c3104q = (C3104q) obj10;
                                                                                        List list82 = list8;
                                                                                        if (list82 == null || !list82.isEmpty()) {
                                                                                            Iterator it = list82.iterator();
                                                                                            i162 = 0;
                                                                                            while (it.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3105r) it.next()).f10073c, c3104q.f10045a) && (i162 = i162 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i162 = 0;
                                                                                        }
                                                                                        String strM2249l = c3104q.f10046b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l)) {
                                                                                            strM2249l = AbstractC0921a.m2249l(i20, "模板 ");
                                                                                        }
                                                                                        String str = AbstractC4955ho.m9608m5(c3104q) + " · 已绑定 " + i162 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p42 = interfaceC1235p4;
                                                                                        boolean zM4534f22 = c1836h03.m4534f(interfaceC1235p42) | c1836h03.m4530d(i19) | c1836h03.m4538h(c3104q);
                                                                                        Object objM4514P22 = c1836h03.m4514P();
                                                                                        if (zM4534f22 || objM4514P22 == C1851l.f6155a) {
                                                                                            objM4514P22 = new C1676e0(interfaceC1235p42, i19, c3104q, 4);
                                                                                            c1836h03.m4545k0(objM4514P22);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l, str, (InterfaceC1220a) objM4514P22, c1836h03, 0);
                                                                                        if (i19 < list72.size() - 1) {
                                                                                            c1836h03.m4525a0(465840026);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1556152374);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i19 = i20;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                List list9 = list7;
                                                                                if (list9.isEmpty()) {
                                                                                    c1836h03.m4525a0(272962273);
                                                                                    AbstractC4955ho.m9657s0("暂无模板。新增后可批量套用到监听群。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    c1836h03.m4525a0(273061907);
                                                                                    int i21 = 0;
                                                                                    for (Object obj11 : list9) {
                                                                                        int i22 = i21 + 1;
                                                                                        if (i21 < 0) {
                                                                                            AbstractC0000a.m32Q0();
                                                                                            throw null;
                                                                                        }
                                                                                        C3471g c3471g = (C3471g) obj11;
                                                                                        String strM2249l2 = c3471g.f11256b;
                                                                                        if (AbstractC3149m.m6721t0(strM2249l2)) {
                                                                                            strM2249l2 = AbstractC0921a.m2249l(i22, "模板 ");
                                                                                        }
                                                                                        String strM9617n5 = AbstractC4955ho.m9617n5(c3471g);
                                                                                        List list10 = list8;
                                                                                        if (list10 == null || !list10.isEmpty()) {
                                                                                            Iterator it2 = list10.iterator();
                                                                                            i17 = 0;
                                                                                            while (it2.hasNext()) {
                                                                                                if (AbstractC1416l.m3825a(((C3472h) it2.next()).f11266c, c3471g.f11255a) && (i17 = i17 + 1) < 0) {
                                                                                                    AbstractC0000a.m30P0();
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i17 = 0;
                                                                                        }
                                                                                        String str2 = strM9617n5 + " · 已绑定 " + i17 + " 个群";
                                                                                        InterfaceC1235p interfaceC1235p5 = interfaceC1235p4;
                                                                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1235p5) | c1836h03.m4530d(i21) | c1836h03.m4538h(c3471g);
                                                                                        Object objM4514P3 = c1836h03.m4514P();
                                                                                        if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                                                                            objM4514P3 = new C1676e0(interfaceC1235p5, i21, c3471g, 9);
                                                                                            c1836h03.m4545k0(objM4514P3);
                                                                                        }
                                                                                        AbstractC4955ho.m9704x3(strM2249l2, str2, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                                                                        if (i21 < list9.size() - 1) {
                                                                                            c1836h03.m4525a0(-1607466964);
                                                                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                        } else {
                                                                                            c1836h03.m4525a0(1708145124);
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                        i21 = i22;
                                                                                    }
                                                                                    c1836h03.m4553p(false);
                                                                                }
                                                                            } else {
                                                                                c1836h03.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h02), c1836h02, 48, 1);
                                                        } else {
                                                            c1836h02.m4519V();
                                                        }
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        }, true), 3);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, this.f18757i, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
