package p332wb;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3619d;
import p251r.C3623h;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;

/* JADX INFO: renamed from: wb.j7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5002j7 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18052g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4060x f18053h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3641z f18054i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f18055j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1220a f18056k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ List f18057l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1220a f18058m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ List f18059n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f18060o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f18061p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ ArrayList f18062q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1235p f18063r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f18064s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f18065t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f18066u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5002j7(C4060x c4060x, C3641z c3641z, List list, InterfaceC1220a interfaceC1220a, List list2, InterfaceC1220a interfaceC1220a2, List list3, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, ArrayList arrayList, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, int i9) {
        this.f18052g = i9;
        this.f18053h = c4060x;
        this.f18054i = c3641z;
        this.f18055j = list;
        this.f18056k = interfaceC1220a;
        this.f18057l = list2;
        this.f18058m = interfaceC1220a2;
        this.f18059n = list3;
        this.f18060o = interfaceC1809a1;
        this.f18061p = interfaceC1809a12;
        this.f18062q = arrayList;
        this.f18063r = interfaceC1235p;
        this.f18064s = interfaceC1809a13;
        this.f18065t = interfaceC1809a14;
        this.f18066u = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f18052g) {
            case 0:
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f18053h.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    final List list = this.f18055j;
                    boolean zM4538h = c1836h0.m4538h(list);
                    final InterfaceC1220a interfaceC1220a = this.f18056k;
                    boolean zM4534f = zM4538h | c1836h0.m4534f(interfaceC1220a);
                    final List list2 = this.f18057l;
                    boolean zM4538h2 = zM4534f | c1836h0.m4538h(list2);
                    final InterfaceC1220a interfaceC1220a2 = this.f18058m;
                    boolean zM4534f2 = zM4538h2 | c1836h0.m4534f(interfaceC1220a2);
                    final List list3 = this.f18059n;
                    boolean zM4538h3 = zM4534f2 | c1836h0.m4538h(list3);
                    final InterfaceC1809a1 interfaceC1809a1 = this.f18060o;
                    boolean zM4534f3 = zM4538h3 | c1836h0.m4534f(interfaceC1809a1);
                    final InterfaceC1809a1 interfaceC1809a12 = this.f18061p;
                    boolean zM4534f4 = zM4534f3 | c1836h0.m4534f(interfaceC1809a12);
                    final ArrayList arrayList = this.f18062q;
                    boolean zM4538h4 = zM4534f4 | c1836h0.m4538h(arrayList);
                    final InterfaceC1235p interfaceC1235p = this.f18063r;
                    boolean zM4534f5 = zM4538h4 | c1836h0.m4534f(interfaceC1235p);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f5 || objM4514P == C1851l.f6155a) {
                        final int i9 = 0;
                        final InterfaceC1809a1 interfaceC1809a13 = this.f18064s;
                        final InterfaceC1809a1 interfaceC1809a14 = this.f18065t;
                        final InterfaceC1809a1 interfaceC1809a15 = this.f18066u;
                        InterfaceC1231l interfaceC1231l = new InterfaceC1231l() { // from class: wb.v9
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                switch (i9) {
                                    case 0:
                                        C3623h c3623h = (C3623h) obj4;
                                        c3623h.getClass();
                                        C3623h.m7604a(c3623h, null, new C3874d(606284915, new C5293s1(interfaceC1809a13, 21), true), 3);
                                        final InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a14;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                                        final List list4 = list;
                                        final List list5 = list2;
                                        if (!zBooleanValue) {
                                            C3623h.m7604a(c3623h, null, AbstractC5193p0.f19889v3, 3);
                                            final int i10 = 0;
                                            final InterfaceC1220a interfaceC1220a3 = interfaceC1220a;
                                            final InterfaceC1220a interfaceC1220a4 = interfaceC1220a2;
                                            C3623h.m7604a(c3623h, null, new C3874d(1526331589, new InterfaceC1236q() { // from class: wb.ce
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1236q
                                                /* JADX INFO: renamed from: b */
                                                public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                    int i11 = i10;
                                                    C1836h0 c1836h02 = (C1836h0) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((C3619d) obj5).getClass();
                                                    int i12 = iIntValue2 & 17;
                                                    switch (i11) {
                                                        case 0:
                                                            if (c1836h02.m4516S(iIntValue2 & 1, i12 != 16)) {
                                                                final int i13 = 0;
                                                                final List list6 = list4;
                                                                final InterfaceC1220a interfaceC1220a5 = interfaceC1220a3;
                                                                final List list7 = list5;
                                                                final InterfaceC1220a interfaceC1220a6 = interfaceC1220a4;
                                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1061974566, new InterfaceC1235p() { // from class: wb.pf
                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    @Override // p085fg.InterfaceC1235p
                                                                    public final Object invoke(Object obj8, Object obj9) {
                                                                        int i14 = i13;
                                                                        C1836h0 c1836h03 = (C1836h0) obj8;
                                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                                        switch (i14) {
                                                                            case 0:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list8 = list6;
                                                                                    String strM6836i = list8.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list8.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a7 = interfaceC1220a5;
                                                                                    boolean zM4534f6 = c1836h03.m4534f(interfaceC1220a7);
                                                                                    Object objM4514P2 = c1836h03.m4514P();
                                                                                    C1823e c1823e = C1851l.f6155a;
                                                                                    if (zM4534f6 || objM4514P2 == c1823e) {
                                                                                        objM4514P2 = new C5040kc(interfaceC1220a7, 7);
                                                                                        c1836h03.m4545k0(objM4514P2);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9444T5 = list8.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5(list7, list8);
                                                                                    InterfaceC1220a interfaceC1220a8 = interfaceC1220a6;
                                                                                    boolean zM4534f7 = c1836h03.m4534f(interfaceC1220a8);
                                                                                    Object objM4514P3 = c1836h03.m4514P();
                                                                                    if (zM4534f7 || objM4514P3 == c1823e) {
                                                                                        objM4514P3 = new C5040kc(interfaceC1220a8, 8);
                                                                                        c1836h03.m4545k0(objM4514P3);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list9 = list6;
                                                                                    String strM6836i2 = list9.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list9.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a9 = interfaceC1220a5;
                                                                                    boolean zM4534f8 = c1836h03.m4534f(interfaceC1220a9);
                                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                                    if (zM4534f8 || objM4514P4 == c1823e2) {
                                                                                        objM4514P4 = new C5040kc(interfaceC1220a9, 11);
                                                                                        c1836h03.m4545k0(objM4514P4);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("回复模板管理", strM6836i2, (InterfaceC1220a) objM4514P4, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9348H5 = list9.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5(list7, list9);
                                                                                    InterfaceC1220a interfaceC1220a10 = interfaceC1220a6;
                                                                                    boolean zM4534f9 = c1836h03.m4534f(interfaceC1220a10);
                                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                                    if (zM4534f9 || objM4514P5 == c1823e2) {
                                                                                        objM4514P5 = new C5040kc(interfaceC1220a10, 12);
                                                                                        c1836h03.m4545k0(objM4514P5);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P5, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return C3967n.f12976a;
                                                                    }
                                                                }, c1836h02), c1836h02, 48, 1);
                                                            } else {
                                                                c1836h02.m4519V();
                                                            }
                                                            break;
                                                        default:
                                                            if (c1836h02.m4516S(iIntValue2 & 1, i12 != 16)) {
                                                                final int i14 = 1;
                                                                final List list8 = list4;
                                                                final InterfaceC1220a interfaceC1220a7 = interfaceC1220a3;
                                                                final List list9 = list5;
                                                                final InterfaceC1220a interfaceC1220a8 = interfaceC1220a4;
                                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-898159862, new InterfaceC1235p() { // from class: wb.pf
                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    @Override // p085fg.InterfaceC1235p
                                                                    public final Object invoke(Object obj8, Object obj9) {
                                                                        int i142 = i14;
                                                                        C1836h0 c1836h03 = (C1836h0) obj8;
                                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                                        switch (i142) {
                                                                            case 0:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list82 = list8;
                                                                                    String strM6836i = list82.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list82.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a72 = interfaceC1220a7;
                                                                                    boolean zM4534f6 = c1836h03.m4534f(interfaceC1220a72);
                                                                                    Object objM4514P2 = c1836h03.m4514P();
                                                                                    C1823e c1823e = C1851l.f6155a;
                                                                                    if (zM4534f6 || objM4514P2 == c1823e) {
                                                                                        objM4514P2 = new C5040kc(interfaceC1220a72, 7);
                                                                                        c1836h03.m4545k0(objM4514P2);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9444T5 = list82.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5(list9, list82);
                                                                                    InterfaceC1220a interfaceC1220a82 = interfaceC1220a8;
                                                                                    boolean zM4534f7 = c1836h03.m4534f(interfaceC1220a82);
                                                                                    Object objM4514P3 = c1836h03.m4514P();
                                                                                    if (zM4534f7 || objM4514P3 == c1823e) {
                                                                                        objM4514P3 = new C5040kc(interfaceC1220a82, 8);
                                                                                        c1836h03.m4545k0(objM4514P3);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list92 = list8;
                                                                                    String strM6836i2 = list92.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list92.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a9 = interfaceC1220a7;
                                                                                    boolean zM4534f8 = c1836h03.m4534f(interfaceC1220a9);
                                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                                    if (zM4534f8 || objM4514P4 == c1823e2) {
                                                                                        objM4514P4 = new C5040kc(interfaceC1220a9, 11);
                                                                                        c1836h03.m4545k0(objM4514P4);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("回复模板管理", strM6836i2, (InterfaceC1220a) objM4514P4, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9348H5 = list92.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5(list9, list92);
                                                                                    InterfaceC1220a interfaceC1220a10 = interfaceC1220a8;
                                                                                    boolean zM4534f9 = c1836h03.m4534f(interfaceC1220a10);
                                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                                    if (zM4534f9 || objM4514P5 == c1823e2) {
                                                                                        objM4514P5 = new C5040kc(interfaceC1220a10, 12);
                                                                                        c1836h03.m4545k0(objM4514P5);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P5, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return C3967n.f12976a;
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
                                        }
                                        final List list6 = list3;
                                        C3623h.m7604a(c3623h, null, new C3874d(1031318890, new C5140nd(1, list6), true), 3);
                                        final int i11 = 0;
                                        final ArrayList arrayList2 = arrayList;
                                        final InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a1;
                                        final InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a12;
                                        final InterfaceC1235p interfaceC1235p2 = interfaceC1235p;
                                        final InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a15;
                                        C3623h.m7604a(c3623h, null, new C3874d(-1319676501, new InterfaceC1236q() { // from class: wb.de
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1236q
                                            /* JADX INFO: renamed from: b */
                                            public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                switch (i11) {
                                                    case 0:
                                                        C1836h0 c1836h02 = (C1836h0) obj6;
                                                        int iIntValue2 = ((Integer) obj7).intValue();
                                                        ((C3619d) obj5).getClass();
                                                        if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            final int i12 = 0;
                                                            final List list7 = list6;
                                                            final ArrayList arrayList3 = arrayList2;
                                                            final InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a17;
                                                            final InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a18;
                                                            final List list8 = list5;
                                                            final List list9 = list4;
                                                            final InterfaceC1235p interfaceC1235p3 = interfaceC1235p2;
                                                            final InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a16;
                                                            final InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a19;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-2022775732, new InterfaceC1235p() { // from class: wb.sf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i13 = i12;
                                                                    C1836h0 c1836h03 = (C1836h0) obj8;
                                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                                    switch (i13) {
                                                                        case 0:
                                                                            if (!c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                c1836h03.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a110.getValue()).booleanValue()) {
                                                                                c1836h03.m4525a0(1732708707);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h03, 6);
                                                                                c1836h03.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a111;
                                                                                if (((String) interfaceC1809a114.getValue()).length() > 0) {
                                                                                    c1836h03.m4525a0(1732710940);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a114.getValue(), c1836h03, 0);
                                                                                    c1836h03.m4553p(false);
                                                                                } else if (list7.isEmpty()) {
                                                                                    c1836h03.m4525a0(1732713069);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList4 = arrayList3;
                                                                                    if (arrayList4.isEmpty()) {
                                                                                        c1836h03.m4525a0(1732715583);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h03, 6);
                                                                                        c1836h03.m4553p(false);
                                                                                    } else {
                                                                                        c1836h03.m4525a0(-2120284544);
                                                                                        int i14 = 0;
                                                                                        for (Object obj10 : arrayList4) {
                                                                                            int i15 = i14 + 1;
                                                                                            if (i14 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s0 = (C5292s0) obj10;
                                                                                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                                                                                            List list10 = list8;
                                                                                            List list11 = list9;
                                                                                            C1823e c1823e = C1851l.f6155a;
                                                                                            if (zBooleanValue2) {
                                                                                                c1836h03.m4525a0(1203979937);
                                                                                                String str = c5292s0.f20551b;
                                                                                                String str2 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str)) {
                                                                                                    str = str2;
                                                                                                }
                                                                                                C4759bp c4759bp = new C4759bp(str, i14, AbstractC4955ho.m9460V5(str2, list10, list11));
                                                                                                InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a113;
                                                                                                boolean zContains = ((Set) interfaceC1809a115.getValue()).contains(str2);
                                                                                                boolean zM4538h5 = c1836h03.m4538h(c5292s0);
                                                                                                Object objM4514P2 = c1836h03.m4514P();
                                                                                                if (zM4538h5 || objM4514P2 == c1823e) {
                                                                                                    objM4514P2 = new C5458x1(c5292s0, interfaceC1809a115, 2);
                                                                                                    c1836h03.m4545k0(objM4514P2);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P2, c1836h03, 0);
                                                                                                c1836h03.m4553p(false);
                                                                                            } else {
                                                                                                c1836h03.m4525a0(1204922988);
                                                                                                String str3 = c5292s0.f20551b;
                                                                                                String str4 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str3)) {
                                                                                                    str3 = str4;
                                                                                                }
                                                                                                String strM9460V5 = AbstractC4955ho.m9460V5(str4, list10, list11);
                                                                                                final InterfaceC1235p interfaceC1235p4 = interfaceC1235p3;
                                                                                                boolean zM4534f6 = c1836h03.m4534f(interfaceC1235p4) | c1836h03.m4538h(c5292s0);
                                                                                                Object objM4514P3 = c1836h03.m4514P();
                                                                                                if (zM4534f6 || objM4514P3 == c1823e) {
                                                                                                    final int i16 = 0;
                                                                                                    objM4514P3 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i16) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s02 = c5292s0;
                                                                                                                    String str5 = c5292s02.f20550a;
                                                                                                                    String str6 = c5292s02.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str6)) {
                                                                                                                        str6 = str5;
                                                                                                                    }
                                                                                                                    interfaceC1235p4.invoke(str5, str6);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s0;
                                                                                                                    String str7 = c5292s03.f20550a;
                                                                                                                    String str8 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str8)) {
                                                                                                                        str8 = str7;
                                                                                                                    }
                                                                                                                    interfaceC1235p4.invoke(str7, str8);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h03.m4545k0(objM4514P3);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str3, strM9460V5, (InterfaceC1220a) objM4514P3, c1836h03, 0);
                                                                                                c1836h03.m4553p(false);
                                                                                            }
                                                                                            if (i14 < arrayList4.size() - 1) {
                                                                                                c1836h03.m4525a0(-1485137619);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                            } else {
                                                                                                c1836h03.m4525a0(1205387523);
                                                                                            }
                                                                                            c1836h03.m4553p(false);
                                                                                            i14 = i15;
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (!c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                c1836h03.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a110.getValue()).booleanValue()) {
                                                                                c1836h03.m4525a0(-760800953);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h03, 6);
                                                                                c1836h03.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a111;
                                                                                if (((String) interfaceC1809a116.getValue()).length() > 0) {
                                                                                    c1836h03.m4525a0(-760798720);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a116.getValue(), c1836h03, 0);
                                                                                    c1836h03.m4553p(false);
                                                                                } else if (list7.isEmpty()) {
                                                                                    c1836h03.m4525a0(-760796591);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h03, 6);
                                                                                    c1836h03.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList5 = arrayList3;
                                                                                    if (arrayList5.isEmpty()) {
                                                                                        c1836h03.m4525a0(-760794077);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h03, 6);
                                                                                        c1836h03.m4553p(false);
                                                                                    } else {
                                                                                        c1836h03.m4525a0(-2109671560);
                                                                                        int i17 = 0;
                                                                                        for (Object obj11 : arrayList5) {
                                                                                            int i18 = i17 + 1;
                                                                                            if (i17 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s02 = (C5292s0) obj11;
                                                                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                                                                                            List list12 = list8;
                                                                                            List list13 = list9;
                                                                                            C1823e c1823e2 = C1851l.f6155a;
                                                                                            if (zBooleanValue3) {
                                                                                                c1836h03.m4525a0(1214592363);
                                                                                                String str5 = c5292s02.f20551b;
                                                                                                String str6 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str5)) {
                                                                                                    str5 = str6;
                                                                                                }
                                                                                                C4759bp c4759bp2 = new C4759bp(str5, i17, AbstractC4955ho.m9340G5(str6, str6, list12, list13));
                                                                                                InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a113;
                                                                                                boolean zContains2 = ((Set) interfaceC1809a117.getValue()).contains(str6);
                                                                                                boolean zM4538h6 = c1836h03.m4538h(c5292s02);
                                                                                                Object objM4514P4 = c1836h03.m4514P();
                                                                                                if (zM4538h6 || objM4514P4 == c1823e2) {
                                                                                                    objM4514P4 = new C5458x1(c5292s02, interfaceC1809a117, 3);
                                                                                                    c1836h03.m4545k0(objM4514P4);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P4, c1836h03, 0);
                                                                                                c1836h03.m4553p(false);
                                                                                            } else {
                                                                                                c1836h03.m4525a0(1215553270);
                                                                                                String str7 = c5292s02.f20551b;
                                                                                                String str8 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str7)) {
                                                                                                    str7 = str8;
                                                                                                }
                                                                                                String strM9340G5 = AbstractC4955ho.m9340G5(str8, str8, list12, list13);
                                                                                                final InterfaceC1235p interfaceC1235p5 = interfaceC1235p3;
                                                                                                boolean zM4534f7 = c1836h03.m4534f(interfaceC1235p5) | c1836h03.m4538h(c5292s02);
                                                                                                Object objM4514P5 = c1836h03.m4514P();
                                                                                                if (zM4534f7 || objM4514P5 == c1823e2) {
                                                                                                    final int i19 = 1;
                                                                                                    objM4514P5 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i19) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s02;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s02;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h03.m4545k0(objM4514P5);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str7, strM9340G5, (InterfaceC1220a) objM4514P5, c1836h03, 0);
                                                                                                c1836h03.m4553p(false);
                                                                                            }
                                                                                            if (i17 < arrayList5.size() - 1) {
                                                                                                c1836h03.m4525a0(316321169);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                            } else {
                                                                                                c1836h03.m4525a0(1216035103);
                                                                                            }
                                                                                            c1836h03.m4553p(false);
                                                                                            i17 = i18;
                                                                                        }
                                                                                        c1836h03.m4553p(false);
                                                                                    }
                                                                                }
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
                                                        C1836h0 c1836h03 = (C1836h0) obj6;
                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                        ((C3619d) obj5).getClass();
                                                        if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            final int i13 = 1;
                                                            final List list10 = list6;
                                                            final ArrayList arrayList4 = arrayList2;
                                                            final InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a17;
                                                            final InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a18;
                                                            final List list11 = list5;
                                                            final List list12 = list4;
                                                            final InterfaceC1235p interfaceC1235p4 = interfaceC1235p2;
                                                            final InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a16;
                                                            final InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a19;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(312057136, new InterfaceC1235p() { // from class: wb.sf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i132 = i13;
                                                                    C1836h0 c1836h032 = (C1836h0) obj8;
                                                                    int iIntValue32 = ((Integer) obj9).intValue();
                                                                    switch (i132) {
                                                                        case 0:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(1732708707);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a115;
                                                                                if (((String) interfaceC1809a1142.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(1732710940);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1142.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list10.isEmpty()) {
                                                                                    c1836h032.m4525a0(1732713069);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList42 = arrayList4;
                                                                                    if (arrayList42.isEmpty()) {
                                                                                        c1836h032.m4525a0(1732715583);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2120284544);
                                                                                        int i14 = 0;
                                                                                        for (Object obj10 : arrayList42) {
                                                                                            int i15 = i14 + 1;
                                                                                            if (i14 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s0 = (C5292s0) obj10;
                                                                                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                                                                            List list102 = list11;
                                                                                            List list112 = list12;
                                                                                            C1823e c1823e = C1851l.f6155a;
                                                                                            if (zBooleanValue2) {
                                                                                                c1836h032.m4525a0(1203979937);
                                                                                                String str = c5292s0.f20551b;
                                                                                                String str2 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str)) {
                                                                                                    str = str2;
                                                                                                }
                                                                                                C4759bp c4759bp = new C4759bp(str, i14, AbstractC4955ho.m9460V5(str2, list102, list112));
                                                                                                InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a117;
                                                                                                boolean zContains = ((Set) interfaceC1809a1152.getValue()).contains(str2);
                                                                                                boolean zM4538h5 = c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P2 = c1836h032.m4514P();
                                                                                                if (zM4538h5 || objM4514P2 == c1823e) {
                                                                                                    objM4514P2 = new C5458x1(c5292s0, interfaceC1809a1152, 2);
                                                                                                    c1836h032.m4545k0(objM4514P2);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P2, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1204922988);
                                                                                                String str3 = c5292s0.f20551b;
                                                                                                String str4 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str3)) {
                                                                                                    str3 = str4;
                                                                                                }
                                                                                                String strM9460V5 = AbstractC4955ho.m9460V5(str4, list102, list112);
                                                                                                final InterfaceC1235p interfaceC1235p42 = interfaceC1235p4;
                                                                                                boolean zM4534f6 = c1836h032.m4534f(interfaceC1235p42) | c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P3 = c1836h032.m4514P();
                                                                                                if (zM4534f6 || objM4514P3 == c1823e) {
                                                                                                    final int i16 = 0;
                                                                                                    objM4514P3 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i16) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s0;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s0;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P3);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str3, strM9460V5, (InterfaceC1220a) objM4514P3, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i14 < arrayList42.size() - 1) {
                                                                                                c1836h032.m4525a0(-1485137619);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1205387523);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i14 = i15;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(-760800953);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a115;
                                                                                if (((String) interfaceC1809a1162.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(-760798720);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1162.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list10.isEmpty()) {
                                                                                    c1836h032.m4525a0(-760796591);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList5 = arrayList4;
                                                                                    if (arrayList5.isEmpty()) {
                                                                                        c1836h032.m4525a0(-760794077);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2109671560);
                                                                                        int i17 = 0;
                                                                                        for (Object obj11 : arrayList5) {
                                                                                            int i18 = i17 + 1;
                                                                                            if (i17 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s02 = (C5292s0) obj11;
                                                                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                                                                            List list122 = list11;
                                                                                            List list13 = list12;
                                                                                            C1823e c1823e2 = C1851l.f6155a;
                                                                                            if (zBooleanValue3) {
                                                                                                c1836h032.m4525a0(1214592363);
                                                                                                String str5 = c5292s02.f20551b;
                                                                                                String str6 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str5)) {
                                                                                                    str5 = str6;
                                                                                                }
                                                                                                C4759bp c4759bp2 = new C4759bp(str5, i17, AbstractC4955ho.m9340G5(str6, str6, list122, list13));
                                                                                                InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a117;
                                                                                                boolean zContains2 = ((Set) interfaceC1809a1172.getValue()).contains(str6);
                                                                                                boolean zM4538h6 = c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P4 = c1836h032.m4514P();
                                                                                                if (zM4538h6 || objM4514P4 == c1823e2) {
                                                                                                    objM4514P4 = new C5458x1(c5292s02, interfaceC1809a1172, 3);
                                                                                                    c1836h032.m4545k0(objM4514P4);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P4, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1215553270);
                                                                                                String str7 = c5292s02.f20551b;
                                                                                                String str8 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str7)) {
                                                                                                    str7 = str8;
                                                                                                }
                                                                                                String strM9340G5 = AbstractC4955ho.m9340G5(str8, str8, list122, list13);
                                                                                                final InterfaceC1235p interfaceC1235p5 = interfaceC1235p4;
                                                                                                boolean zM4534f7 = c1836h032.m4534f(interfaceC1235p5) | c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P5 = c1836h032.m4514P();
                                                                                                if (zM4534f7 || objM4514P5 == c1823e2) {
                                                                                                    final int i19 = 1;
                                                                                                    objM4514P5 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i19) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s02;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s02;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P5);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str7, strM9340G5, (InterfaceC1220a) objM4514P5, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i17 < arrayList5.size() - 1) {
                                                                                                c1836h032.m4525a0(316321169);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1216035103);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i17 = i18;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h03), c1836h03, 48, 1);
                                                        } else {
                                                            c1836h03.m4519V();
                                                        }
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        }, true), 3);
                                        break;
                                    default:
                                        C3623h c3623h2 = (C3623h) obj4;
                                        c3623h2.getClass();
                                        C3623h.m7604a(c3623h2, null, new C3874d(-1353849513, new C5293s1(interfaceC1809a13, 27), true), 3);
                                        final InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a14;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a110.getValue()).booleanValue();
                                        final List list7 = list;
                                        final List list8 = list2;
                                        if (!zBooleanValue2) {
                                            C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19660R3, 3);
                                            final int i12 = 1;
                                            final InterfaceC1220a interfaceC1220a5 = interfaceC1220a;
                                            final InterfaceC1220a interfaceC1220a6 = interfaceC1220a2;
                                            C3623h.m7604a(c3623h2, null, new C3874d(-433802839, new InterfaceC1236q() { // from class: wb.ce
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1236q
                                                /* JADX INFO: renamed from: b */
                                                public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                    int i112 = i12;
                                                    C1836h0 c1836h02 = (C1836h0) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    ((C3619d) obj5).getClass();
                                                    int i122 = iIntValue2 & 17;
                                                    switch (i112) {
                                                        case 0:
                                                            if (c1836h02.m4516S(iIntValue2 & 1, i122 != 16)) {
                                                                final int i13 = 0;
                                                                final List list62 = list7;
                                                                final InterfaceC1220a interfaceC1220a52 = interfaceC1220a5;
                                                                final List list72 = list8;
                                                                final InterfaceC1220a interfaceC1220a62 = interfaceC1220a6;
                                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1061974566, new InterfaceC1235p() { // from class: wb.pf
                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    @Override // p085fg.InterfaceC1235p
                                                                    public final Object invoke(Object obj8, Object obj9) {
                                                                        int i142 = i13;
                                                                        C1836h0 c1836h03 = (C1836h0) obj8;
                                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                                        switch (i142) {
                                                                            case 0:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list82 = list62;
                                                                                    String strM6836i = list82.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list82.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a72 = interfaceC1220a52;
                                                                                    boolean zM4534f6 = c1836h03.m4534f(interfaceC1220a72);
                                                                                    Object objM4514P2 = c1836h03.m4514P();
                                                                                    C1823e c1823e = C1851l.f6155a;
                                                                                    if (zM4534f6 || objM4514P2 == c1823e) {
                                                                                        objM4514P2 = new C5040kc(interfaceC1220a72, 7);
                                                                                        c1836h03.m4545k0(objM4514P2);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9444T5 = list82.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5(list72, list82);
                                                                                    InterfaceC1220a interfaceC1220a82 = interfaceC1220a62;
                                                                                    boolean zM4534f7 = c1836h03.m4534f(interfaceC1220a82);
                                                                                    Object objM4514P3 = c1836h03.m4514P();
                                                                                    if (zM4534f7 || objM4514P3 == c1823e) {
                                                                                        objM4514P3 = new C5040kc(interfaceC1220a82, 8);
                                                                                        c1836h03.m4545k0(objM4514P3);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list92 = list62;
                                                                                    String strM6836i2 = list92.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list92.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a9 = interfaceC1220a52;
                                                                                    boolean zM4534f8 = c1836h03.m4534f(interfaceC1220a9);
                                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                                    if (zM4534f8 || objM4514P4 == c1823e2) {
                                                                                        objM4514P4 = new C5040kc(interfaceC1220a9, 11);
                                                                                        c1836h03.m4545k0(objM4514P4);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("回复模板管理", strM6836i2, (InterfaceC1220a) objM4514P4, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9348H5 = list92.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5(list72, list92);
                                                                                    InterfaceC1220a interfaceC1220a10 = interfaceC1220a62;
                                                                                    boolean zM4534f9 = c1836h03.m4534f(interfaceC1220a10);
                                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                                    if (zM4534f9 || objM4514P5 == c1823e2) {
                                                                                        objM4514P5 = new C5040kc(interfaceC1220a10, 12);
                                                                                        c1836h03.m4545k0(objM4514P5);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P5, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return C3967n.f12976a;
                                                                    }
                                                                }, c1836h02), c1836h02, 48, 1);
                                                            } else {
                                                                c1836h02.m4519V();
                                                            }
                                                            break;
                                                        default:
                                                            if (c1836h02.m4516S(iIntValue2 & 1, i122 != 16)) {
                                                                final int i14 = 1;
                                                                final List list82 = list7;
                                                                final InterfaceC1220a interfaceC1220a7 = interfaceC1220a5;
                                                                final List list9 = list8;
                                                                final InterfaceC1220a interfaceC1220a8 = interfaceC1220a6;
                                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-898159862, new InterfaceC1235p() { // from class: wb.pf
                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    @Override // p085fg.InterfaceC1235p
                                                                    public final Object invoke(Object obj8, Object obj9) {
                                                                        int i142 = i14;
                                                                        C1836h0 c1836h03 = (C1836h0) obj8;
                                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                                        switch (i142) {
                                                                            case 0:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list822 = list82;
                                                                                    String strM6836i = list822.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list822.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a72 = interfaceC1220a7;
                                                                                    boolean zM4534f6 = c1836h03.m4534f(interfaceC1220a72);
                                                                                    Object objM4514P2 = c1836h03.m4514P();
                                                                                    C1823e c1823e = C1851l.f6155a;
                                                                                    if (zM4534f6 || objM4514P2 == c1823e) {
                                                                                        objM4514P2 = new C5040kc(interfaceC1220a72, 7);
                                                                                        c1836h03.m4545k0(objM4514P2);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9444T5 = list822.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5(list9, list822);
                                                                                    InterfaceC1220a interfaceC1220a82 = interfaceC1220a8;
                                                                                    boolean zM4534f7 = c1836h03.m4534f(interfaceC1220a82);
                                                                                    Object objM4514P3 = c1836h03.m4514P();
                                                                                    if (zM4534f7 || objM4514P3 == c1823e) {
                                                                                        objM4514P3 = new C5040kc(interfaceC1220a82, 8);
                                                                                        c1836h03.m4545k0(objM4514P3);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list92 = list82;
                                                                                    String strM6836i2 = list92.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list92.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a9 = interfaceC1220a7;
                                                                                    boolean zM4534f8 = c1836h03.m4534f(interfaceC1220a9);
                                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                                    if (zM4534f8 || objM4514P4 == c1823e2) {
                                                                                        objM4514P4 = new C5040kc(interfaceC1220a9, 11);
                                                                                        c1836h03.m4545k0(objM4514P4);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("回复模板管理", strM6836i2, (InterfaceC1220a) objM4514P4, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9348H5 = list92.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5(list9, list92);
                                                                                    InterfaceC1220a interfaceC1220a10 = interfaceC1220a8;
                                                                                    boolean zM4534f9 = c1836h03.m4534f(interfaceC1220a10);
                                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                                    if (zM4534f9 || objM4514P5 == c1823e2) {
                                                                                        objM4514P5 = new C5040kc(interfaceC1220a10, 12);
                                                                                        c1836h03.m4545k0(objM4514P5);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P5, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return C3967n.f12976a;
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
                                        }
                                        final List list9 = list3;
                                        C3623h.m7604a(c3623h2, null, new C3874d(-928815538, new C5140nd(2, list9), true), 3);
                                        final int i13 = 1;
                                        final ArrayList arrayList3 = arrayList;
                                        final InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a1;
                                        final InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a12;
                                        final InterfaceC1235p interfaceC1235p3 = interfaceC1235p;
                                        final InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a15;
                                        C3623h.m7604a(c3623h2, null, new C3874d(1015156367, new InterfaceC1236q() { // from class: wb.de
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1236q
                                            /* JADX INFO: renamed from: b */
                                            public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                switch (i13) {
                                                    case 0:
                                                        C1836h0 c1836h02 = (C1836h0) obj6;
                                                        int iIntValue2 = ((Integer) obj7).intValue();
                                                        ((C3619d) obj5).getClass();
                                                        if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                            final int i122 = 0;
                                                            final List list72 = list9;
                                                            final ArrayList arrayList32 = arrayList3;
                                                            final InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a111;
                                                            final InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a112;
                                                            final List list82 = list8;
                                                            final List list92 = list7;
                                                            final InterfaceC1235p interfaceC1235p32 = interfaceC1235p3;
                                                            final InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a110;
                                                            final InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a113;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-2022775732, new InterfaceC1235p() { // from class: wb.sf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i132 = i122;
                                                                    C1836h0 c1836h032 = (C1836h0) obj8;
                                                                    int iIntValue32 = ((Integer) obj9).intValue();
                                                                    switch (i132) {
                                                                        case 0:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a1102.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(1732708707);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a1112;
                                                                                if (((String) interfaceC1809a1142.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(1732710940);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1142.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list72.isEmpty()) {
                                                                                    c1836h032.m4525a0(1732713069);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList42 = arrayList32;
                                                                                    if (arrayList42.isEmpty()) {
                                                                                        c1836h032.m4525a0(1732715583);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2120284544);
                                                                                        int i14 = 0;
                                                                                        for (Object obj10 : arrayList42) {
                                                                                            int i15 = i14 + 1;
                                                                                            if (i14 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s0 = (C5292s0) obj10;
                                                                                            boolean zBooleanValue22 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                                                                            List list102 = list82;
                                                                                            List list112 = list92;
                                                                                            C1823e c1823e = C1851l.f6155a;
                                                                                            if (zBooleanValue22) {
                                                                                                c1836h032.m4525a0(1203979937);
                                                                                                String str = c5292s0.f20551b;
                                                                                                String str2 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str)) {
                                                                                                    str = str2;
                                                                                                }
                                                                                                C4759bp c4759bp = new C4759bp(str, i14, AbstractC4955ho.m9460V5(str2, list102, list112));
                                                                                                InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a1132;
                                                                                                boolean zContains = ((Set) interfaceC1809a1152.getValue()).contains(str2);
                                                                                                boolean zM4538h5 = c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P2 = c1836h032.m4514P();
                                                                                                if (zM4538h5 || objM4514P2 == c1823e) {
                                                                                                    objM4514P2 = new C5458x1(c5292s0, interfaceC1809a1152, 2);
                                                                                                    c1836h032.m4545k0(objM4514P2);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P2, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1204922988);
                                                                                                String str3 = c5292s0.f20551b;
                                                                                                String str4 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str3)) {
                                                                                                    str3 = str4;
                                                                                                }
                                                                                                String strM9460V5 = AbstractC4955ho.m9460V5(str4, list102, list112);
                                                                                                final InterfaceC1235p interfaceC1235p42 = interfaceC1235p32;
                                                                                                boolean zM4534f6 = c1836h032.m4534f(interfaceC1235p42) | c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P3 = c1836h032.m4514P();
                                                                                                if (zM4534f6 || objM4514P3 == c1823e) {
                                                                                                    final int i16 = 0;
                                                                                                    objM4514P3 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i16) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s0;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s0;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P3);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str3, strM9460V5, (InterfaceC1220a) objM4514P3, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i14 < arrayList42.size() - 1) {
                                                                                                c1836h032.m4525a0(-1485137619);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1205387523);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i14 = i15;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a1102.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(-760800953);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a1112;
                                                                                if (((String) interfaceC1809a1162.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(-760798720);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1162.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list72.isEmpty()) {
                                                                                    c1836h032.m4525a0(-760796591);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList5 = arrayList32;
                                                                                    if (arrayList5.isEmpty()) {
                                                                                        c1836h032.m4525a0(-760794077);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2109671560);
                                                                                        int i17 = 0;
                                                                                        for (Object obj11 : arrayList5) {
                                                                                            int i18 = i17 + 1;
                                                                                            if (i17 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s02 = (C5292s0) obj11;
                                                                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                                                                            List list122 = list82;
                                                                                            List list13 = list92;
                                                                                            C1823e c1823e2 = C1851l.f6155a;
                                                                                            if (zBooleanValue3) {
                                                                                                c1836h032.m4525a0(1214592363);
                                                                                                String str5 = c5292s02.f20551b;
                                                                                                String str6 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str5)) {
                                                                                                    str5 = str6;
                                                                                                }
                                                                                                C4759bp c4759bp2 = new C4759bp(str5, i17, AbstractC4955ho.m9340G5(str6, str6, list122, list13));
                                                                                                InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a1132;
                                                                                                boolean zContains2 = ((Set) interfaceC1809a1172.getValue()).contains(str6);
                                                                                                boolean zM4538h6 = c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P4 = c1836h032.m4514P();
                                                                                                if (zM4538h6 || objM4514P4 == c1823e2) {
                                                                                                    objM4514P4 = new C5458x1(c5292s02, interfaceC1809a1172, 3);
                                                                                                    c1836h032.m4545k0(objM4514P4);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P4, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1215553270);
                                                                                                String str7 = c5292s02.f20551b;
                                                                                                String str8 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str7)) {
                                                                                                    str7 = str8;
                                                                                                }
                                                                                                String strM9340G5 = AbstractC4955ho.m9340G5(str8, str8, list122, list13);
                                                                                                final InterfaceC1235p interfaceC1235p5 = interfaceC1235p32;
                                                                                                boolean zM4534f7 = c1836h032.m4534f(interfaceC1235p5) | c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P5 = c1836h032.m4514P();
                                                                                                if (zM4534f7 || objM4514P5 == c1823e2) {
                                                                                                    final int i19 = 1;
                                                                                                    objM4514P5 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i19) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s02;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s02;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P5);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str7, strM9340G5, (InterfaceC1220a) objM4514P5, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i17 < arrayList5.size() - 1) {
                                                                                                c1836h032.m4525a0(316321169);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1216035103);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i17 = i18;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
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
                                                        C1836h0 c1836h03 = (C1836h0) obj6;
                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                        ((C3619d) obj5).getClass();
                                                        if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            final int i132 = 1;
                                                            final List list10 = list9;
                                                            final ArrayList arrayList4 = arrayList3;
                                                            final InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a111;
                                                            final InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a112;
                                                            final List list11 = list8;
                                                            final List list12 = list7;
                                                            final InterfaceC1235p interfaceC1235p4 = interfaceC1235p3;
                                                            final InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a110;
                                                            final InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a113;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(312057136, new InterfaceC1235p() { // from class: wb.sf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i1322 = i132;
                                                                    C1836h0 c1836h032 = (C1836h0) obj8;
                                                                    int iIntValue32 = ((Integer) obj9).intValue();
                                                                    switch (i1322) {
                                                                        case 0:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(1732708707);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a115;
                                                                                if (((String) interfaceC1809a1142.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(1732710940);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1142.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list10.isEmpty()) {
                                                                                    c1836h032.m4525a0(1732713069);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList42 = arrayList4;
                                                                                    if (arrayList42.isEmpty()) {
                                                                                        c1836h032.m4525a0(1732715583);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2120284544);
                                                                                        int i14 = 0;
                                                                                        for (Object obj10 : arrayList42) {
                                                                                            int i15 = i14 + 1;
                                                                                            if (i14 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s0 = (C5292s0) obj10;
                                                                                            boolean zBooleanValue22 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                                                                            List list102 = list11;
                                                                                            List list112 = list12;
                                                                                            C1823e c1823e = C1851l.f6155a;
                                                                                            if (zBooleanValue22) {
                                                                                                c1836h032.m4525a0(1203979937);
                                                                                                String str = c5292s0.f20551b;
                                                                                                String str2 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str)) {
                                                                                                    str = str2;
                                                                                                }
                                                                                                C4759bp c4759bp = new C4759bp(str, i14, AbstractC4955ho.m9460V5(str2, list102, list112));
                                                                                                InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a117;
                                                                                                boolean zContains = ((Set) interfaceC1809a1152.getValue()).contains(str2);
                                                                                                boolean zM4538h5 = c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P2 = c1836h032.m4514P();
                                                                                                if (zM4538h5 || objM4514P2 == c1823e) {
                                                                                                    objM4514P2 = new C5458x1(c5292s0, interfaceC1809a1152, 2);
                                                                                                    c1836h032.m4545k0(objM4514P2);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P2, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1204922988);
                                                                                                String str3 = c5292s0.f20551b;
                                                                                                String str4 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str3)) {
                                                                                                    str3 = str4;
                                                                                                }
                                                                                                String strM9460V5 = AbstractC4955ho.m9460V5(str4, list102, list112);
                                                                                                final InterfaceC1235p interfaceC1235p42 = interfaceC1235p4;
                                                                                                boolean zM4534f6 = c1836h032.m4534f(interfaceC1235p42) | c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P3 = c1836h032.m4514P();
                                                                                                if (zM4534f6 || objM4514P3 == c1823e) {
                                                                                                    final int i16 = 0;
                                                                                                    objM4514P3 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i16) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s0;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s0;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P3);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str3, strM9460V5, (InterfaceC1220a) objM4514P3, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i14 < arrayList42.size() - 1) {
                                                                                                c1836h032.m4525a0(-1485137619);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1205387523);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i14 = i15;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(-760800953);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a115;
                                                                                if (((String) interfaceC1809a1162.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(-760798720);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1162.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list10.isEmpty()) {
                                                                                    c1836h032.m4525a0(-760796591);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList5 = arrayList4;
                                                                                    if (arrayList5.isEmpty()) {
                                                                                        c1836h032.m4525a0(-760794077);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2109671560);
                                                                                        int i17 = 0;
                                                                                        for (Object obj11 : arrayList5) {
                                                                                            int i18 = i17 + 1;
                                                                                            if (i17 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s02 = (C5292s0) obj11;
                                                                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                                                                            List list122 = list11;
                                                                                            List list13 = list12;
                                                                                            C1823e c1823e2 = C1851l.f6155a;
                                                                                            if (zBooleanValue3) {
                                                                                                c1836h032.m4525a0(1214592363);
                                                                                                String str5 = c5292s02.f20551b;
                                                                                                String str6 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str5)) {
                                                                                                    str5 = str6;
                                                                                                }
                                                                                                C4759bp c4759bp2 = new C4759bp(str5, i17, AbstractC4955ho.m9340G5(str6, str6, list122, list13));
                                                                                                InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a117;
                                                                                                boolean zContains2 = ((Set) interfaceC1809a1172.getValue()).contains(str6);
                                                                                                boolean zM4538h6 = c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P4 = c1836h032.m4514P();
                                                                                                if (zM4538h6 || objM4514P4 == c1823e2) {
                                                                                                    objM4514P4 = new C5458x1(c5292s02, interfaceC1809a1172, 3);
                                                                                                    c1836h032.m4545k0(objM4514P4);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P4, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1215553270);
                                                                                                String str7 = c5292s02.f20551b;
                                                                                                String str8 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str7)) {
                                                                                                    str7 = str8;
                                                                                                }
                                                                                                String strM9340G5 = AbstractC4955ho.m9340G5(str8, str8, list122, list13);
                                                                                                final InterfaceC1235p interfaceC1235p5 = interfaceC1235p4;
                                                                                                boolean zM4534f7 = c1836h032.m4534f(interfaceC1235p5) | c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P5 = c1836h032.m4514P();
                                                                                                if (zM4534f7 || objM4514P5 == c1823e2) {
                                                                                                    final int i19 = 1;
                                                                                                    objM4514P5 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i19) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s02;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s02;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P5);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str7, strM9340G5, (InterfaceC1220a) objM4514P5, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i17 < arrayList5.size() - 1) {
                                                                                                c1836h032.m4525a0(316321169);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1216035103);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i17 = i18;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h03), c1836h03, 48, 1);
                                                        } else {
                                                            c1836h03.m4519V();
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
                        c1836h0.m4545k0(interfaceC1231l);
                        objM4514P = interfaceC1231l;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, this.f18054i, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
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
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f18053h.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    final List list4 = this.f18055j;
                    boolean zM4538h5 = c1836h02.m4538h(list4);
                    final InterfaceC1220a interfaceC1220a3 = this.f18056k;
                    boolean zM4534f6 = zM4538h5 | c1836h02.m4534f(interfaceC1220a3);
                    final List list5 = this.f18057l;
                    boolean zM4538h6 = zM4534f6 | c1836h02.m4538h(list5);
                    final InterfaceC1220a interfaceC1220a4 = this.f18058m;
                    boolean zM4534f7 = zM4538h6 | c1836h02.m4534f(interfaceC1220a4);
                    final List list6 = this.f18059n;
                    boolean zM4538h7 = zM4534f7 | c1836h02.m4538h(list6);
                    final InterfaceC1809a1 interfaceC1809a16 = this.f18060o;
                    boolean zM4534f8 = zM4538h7 | c1836h02.m4534f(interfaceC1809a16);
                    final InterfaceC1809a1 interfaceC1809a17 = this.f18061p;
                    boolean zM4534f9 = zM4534f8 | c1836h02.m4534f(interfaceC1809a17);
                    final ArrayList arrayList2 = this.f18062q;
                    boolean zM4538h8 = zM4534f9 | c1836h02.m4538h(arrayList2);
                    final InterfaceC1235p interfaceC1235p2 = this.f18063r;
                    boolean zM4534f10 = zM4538h8 | c1836h02.m4534f(interfaceC1235p2);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f10 || objM4514P2 == C1851l.f6155a) {
                        final int i10 = 1;
                        final InterfaceC1809a1 interfaceC1809a18 = this.f18064s;
                        final InterfaceC1809a1 interfaceC1809a19 = this.f18065t;
                        final InterfaceC1809a1 interfaceC1809a110 = this.f18066u;
                        InterfaceC1231l interfaceC1231l2 = new InterfaceC1231l() { // from class: wb.v9
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                switch (i10) {
                                    case 0:
                                        C3623h c3623h = (C3623h) obj4;
                                        c3623h.getClass();
                                        C3623h.m7604a(c3623h, null, new C3874d(606284915, new C5293s1(interfaceC1809a18, 21), true), 3);
                                        final InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a19;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a162.getValue()).booleanValue();
                                        final List list42 = list4;
                                        final List list52 = list5;
                                        if (!zBooleanValue) {
                                            C3623h.m7604a(c3623h, null, AbstractC5193p0.f19889v3, 3);
                                            final int i102 = 0;
                                            final InterfaceC1220a interfaceC1220a32 = interfaceC1220a3;
                                            final InterfaceC1220a interfaceC1220a42 = interfaceC1220a4;
                                            C3623h.m7604a(c3623h, null, new C3874d(1526331589, new InterfaceC1236q() { // from class: wb.ce
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1236q
                                                /* JADX INFO: renamed from: b */
                                                public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                    int i112 = i102;
                                                    C1836h0 c1836h022 = (C1836h0) obj6;
                                                    int iIntValue22 = ((Integer) obj7).intValue();
                                                    ((C3619d) obj5).getClass();
                                                    int i122 = iIntValue22 & 17;
                                                    switch (i112) {
                                                        case 0:
                                                            if (c1836h022.m4516S(iIntValue22 & 1, i122 != 16)) {
                                                                final int i13 = 0;
                                                                final List list62 = list42;
                                                                final InterfaceC1220a interfaceC1220a52 = interfaceC1220a32;
                                                                final List list72 = list52;
                                                                final InterfaceC1220a interfaceC1220a62 = interfaceC1220a42;
                                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1061974566, new InterfaceC1235p() { // from class: wb.pf
                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    @Override // p085fg.InterfaceC1235p
                                                                    public final Object invoke(Object obj8, Object obj9) {
                                                                        int i142 = i13;
                                                                        C1836h0 c1836h03 = (C1836h0) obj8;
                                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                                        switch (i142) {
                                                                            case 0:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list822 = list62;
                                                                                    String strM6836i = list822.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list822.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a72 = interfaceC1220a52;
                                                                                    boolean zM4534f62 = c1836h03.m4534f(interfaceC1220a72);
                                                                                    Object objM4514P22 = c1836h03.m4514P();
                                                                                    C1823e c1823e = C1851l.f6155a;
                                                                                    if (zM4534f62 || objM4514P22 == c1823e) {
                                                                                        objM4514P22 = new C5040kc(interfaceC1220a72, 7);
                                                                                        c1836h03.m4545k0(objM4514P22);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P22, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9444T5 = list822.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5(list72, list822);
                                                                                    InterfaceC1220a interfaceC1220a82 = interfaceC1220a62;
                                                                                    boolean zM4534f72 = c1836h03.m4534f(interfaceC1220a82);
                                                                                    Object objM4514P3 = c1836h03.m4514P();
                                                                                    if (zM4534f72 || objM4514P3 == c1823e) {
                                                                                        objM4514P3 = new C5040kc(interfaceC1220a82, 8);
                                                                                        c1836h03.m4545k0(objM4514P3);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list92 = list62;
                                                                                    String strM6836i2 = list92.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list92.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a9 = interfaceC1220a52;
                                                                                    boolean zM4534f82 = c1836h03.m4534f(interfaceC1220a9);
                                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                                    if (zM4534f82 || objM4514P4 == c1823e2) {
                                                                                        objM4514P4 = new C5040kc(interfaceC1220a9, 11);
                                                                                        c1836h03.m4545k0(objM4514P4);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("回复模板管理", strM6836i2, (InterfaceC1220a) objM4514P4, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9348H5 = list92.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5(list72, list92);
                                                                                    InterfaceC1220a interfaceC1220a10 = interfaceC1220a62;
                                                                                    boolean zM4534f92 = c1836h03.m4534f(interfaceC1220a10);
                                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                                    if (zM4534f92 || objM4514P5 == c1823e2) {
                                                                                        objM4514P5 = new C5040kc(interfaceC1220a10, 12);
                                                                                        c1836h03.m4545k0(objM4514P5);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P5, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return C3967n.f12976a;
                                                                    }
                                                                }, c1836h022), c1836h022, 48, 1);
                                                            } else {
                                                                c1836h022.m4519V();
                                                            }
                                                            break;
                                                        default:
                                                            if (c1836h022.m4516S(iIntValue22 & 1, i122 != 16)) {
                                                                final int i14 = 1;
                                                                final List list82 = list42;
                                                                final InterfaceC1220a interfaceC1220a7 = interfaceC1220a32;
                                                                final List list9 = list52;
                                                                final InterfaceC1220a interfaceC1220a8 = interfaceC1220a42;
                                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-898159862, new InterfaceC1235p() { // from class: wb.pf
                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    @Override // p085fg.InterfaceC1235p
                                                                    public final Object invoke(Object obj8, Object obj9) {
                                                                        int i142 = i14;
                                                                        C1836h0 c1836h03 = (C1836h0) obj8;
                                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                                        switch (i142) {
                                                                            case 0:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list822 = list82;
                                                                                    String strM6836i = list822.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list822.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a72 = interfaceC1220a7;
                                                                                    boolean zM4534f62 = c1836h03.m4534f(interfaceC1220a72);
                                                                                    Object objM4514P22 = c1836h03.m4514P();
                                                                                    C1823e c1823e = C1851l.f6155a;
                                                                                    if (zM4534f62 || objM4514P22 == c1823e) {
                                                                                        objM4514P22 = new C5040kc(interfaceC1220a72, 7);
                                                                                        c1836h03.m4545k0(objM4514P22);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P22, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9444T5 = list822.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5(list9, list822);
                                                                                    InterfaceC1220a interfaceC1220a82 = interfaceC1220a8;
                                                                                    boolean zM4534f72 = c1836h03.m4534f(interfaceC1220a82);
                                                                                    Object objM4514P3 = c1836h03.m4514P();
                                                                                    if (zM4534f72 || objM4514P3 == c1823e) {
                                                                                        objM4514P3 = new C5040kc(interfaceC1220a82, 8);
                                                                                        c1836h03.m4545k0(objM4514P3);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list92 = list82;
                                                                                    String strM6836i2 = list92.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list92.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a9 = interfaceC1220a7;
                                                                                    boolean zM4534f82 = c1836h03.m4534f(interfaceC1220a9);
                                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                                    if (zM4534f82 || objM4514P4 == c1823e2) {
                                                                                        objM4514P4 = new C5040kc(interfaceC1220a9, 11);
                                                                                        c1836h03.m4545k0(objM4514P4);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("回复模板管理", strM6836i2, (InterfaceC1220a) objM4514P4, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9348H5 = list92.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5(list9, list92);
                                                                                    InterfaceC1220a interfaceC1220a10 = interfaceC1220a8;
                                                                                    boolean zM4534f92 = c1836h03.m4534f(interfaceC1220a10);
                                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                                    if (zM4534f92 || objM4514P5 == c1823e2) {
                                                                                        objM4514P5 = new C5040kc(interfaceC1220a10, 12);
                                                                                        c1836h03.m4545k0(objM4514P5);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P5, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return C3967n.f12976a;
                                                                    }
                                                                }, c1836h022), c1836h022, 48, 1);
                                                            } else {
                                                                c1836h022.m4519V();
                                                            }
                                                            break;
                                                    }
                                                    return C3967n.f12976a;
                                                }
                                            }, true), 3);
                                        }
                                        final List list62 = list6;
                                        C3623h.m7604a(c3623h, null, new C3874d(1031318890, new C5140nd(1, list62), true), 3);
                                        final int i11 = 0;
                                        final ArrayList arrayList22 = arrayList2;
                                        final InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a16;
                                        final InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a17;
                                        final InterfaceC1235p interfaceC1235p22 = interfaceC1235p2;
                                        final InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a110;
                                        C3623h.m7604a(c3623h, null, new C3874d(-1319676501, new InterfaceC1236q() { // from class: wb.de
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1236q
                                            /* JADX INFO: renamed from: b */
                                            public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                switch (i11) {
                                                    case 0:
                                                        C1836h0 c1836h022 = (C1836h0) obj6;
                                                        int iIntValue22 = ((Integer) obj7).intValue();
                                                        ((C3619d) obj5).getClass();
                                                        if (c1836h022.m4516S(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                                                            final int i122 = 0;
                                                            final List list72 = list62;
                                                            final ArrayList arrayList32 = arrayList22;
                                                            final InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a172;
                                                            final InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a182;
                                                            final List list82 = list52;
                                                            final List list92 = list42;
                                                            final InterfaceC1235p interfaceC1235p32 = interfaceC1235p22;
                                                            final InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a162;
                                                            final InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a192;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-2022775732, new InterfaceC1235p() { // from class: wb.sf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i1322 = i122;
                                                                    C1836h0 c1836h032 = (C1836h0) obj8;
                                                                    int iIntValue32 = ((Integer) obj9).intValue();
                                                                    switch (i1322) {
                                                                        case 0:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a1102.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(1732708707);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a1112;
                                                                                if (((String) interfaceC1809a1142.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(1732710940);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1142.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list72.isEmpty()) {
                                                                                    c1836h032.m4525a0(1732713069);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList42 = arrayList32;
                                                                                    if (arrayList42.isEmpty()) {
                                                                                        c1836h032.m4525a0(1732715583);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2120284544);
                                                                                        int i14 = 0;
                                                                                        for (Object obj10 : arrayList42) {
                                                                                            int i15 = i14 + 1;
                                                                                            if (i14 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s0 = (C5292s0) obj10;
                                                                                            boolean zBooleanValue22 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                                                                            List list102 = list82;
                                                                                            List list112 = list92;
                                                                                            C1823e c1823e = C1851l.f6155a;
                                                                                            if (zBooleanValue22) {
                                                                                                c1836h032.m4525a0(1203979937);
                                                                                                String str = c5292s0.f20551b;
                                                                                                String str2 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str)) {
                                                                                                    str = str2;
                                                                                                }
                                                                                                C4759bp c4759bp = new C4759bp(str, i14, AbstractC4955ho.m9460V5(str2, list102, list112));
                                                                                                InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a1132;
                                                                                                boolean zContains = ((Set) interfaceC1809a1152.getValue()).contains(str2);
                                                                                                boolean zM4538h52 = c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P22 = c1836h032.m4514P();
                                                                                                if (zM4538h52 || objM4514P22 == c1823e) {
                                                                                                    objM4514P22 = new C5458x1(c5292s0, interfaceC1809a1152, 2);
                                                                                                    c1836h032.m4545k0(objM4514P22);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P22, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1204922988);
                                                                                                String str3 = c5292s0.f20551b;
                                                                                                String str4 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str3)) {
                                                                                                    str3 = str4;
                                                                                                }
                                                                                                String strM9460V5 = AbstractC4955ho.m9460V5(str4, list102, list112);
                                                                                                final InterfaceC1235p interfaceC1235p42 = interfaceC1235p32;
                                                                                                boolean zM4534f62 = c1836h032.m4534f(interfaceC1235p42) | c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P3 = c1836h032.m4514P();
                                                                                                if (zM4534f62 || objM4514P3 == c1823e) {
                                                                                                    final int i16 = 0;
                                                                                                    objM4514P3 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i16) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s0;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s0;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P3);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str3, strM9460V5, (InterfaceC1220a) objM4514P3, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i14 < arrayList42.size() - 1) {
                                                                                                c1836h032.m4525a0(-1485137619);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1205387523);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i14 = i15;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a1102.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(-760800953);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a1112;
                                                                                if (((String) interfaceC1809a1162.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(-760798720);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1162.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list72.isEmpty()) {
                                                                                    c1836h032.m4525a0(-760796591);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList5 = arrayList32;
                                                                                    if (arrayList5.isEmpty()) {
                                                                                        c1836h032.m4525a0(-760794077);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2109671560);
                                                                                        int i17 = 0;
                                                                                        for (Object obj11 : arrayList5) {
                                                                                            int i18 = i17 + 1;
                                                                                            if (i17 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s02 = (C5292s0) obj11;
                                                                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                                                                            List list122 = list82;
                                                                                            List list13 = list92;
                                                                                            C1823e c1823e2 = C1851l.f6155a;
                                                                                            if (zBooleanValue3) {
                                                                                                c1836h032.m4525a0(1214592363);
                                                                                                String str5 = c5292s02.f20551b;
                                                                                                String str6 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str5)) {
                                                                                                    str5 = str6;
                                                                                                }
                                                                                                C4759bp c4759bp2 = new C4759bp(str5, i17, AbstractC4955ho.m9340G5(str6, str6, list122, list13));
                                                                                                InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a1132;
                                                                                                boolean zContains2 = ((Set) interfaceC1809a1172.getValue()).contains(str6);
                                                                                                boolean zM4538h62 = c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P4 = c1836h032.m4514P();
                                                                                                if (zM4538h62 || objM4514P4 == c1823e2) {
                                                                                                    objM4514P4 = new C5458x1(c5292s02, interfaceC1809a1172, 3);
                                                                                                    c1836h032.m4545k0(objM4514P4);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P4, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1215553270);
                                                                                                String str7 = c5292s02.f20551b;
                                                                                                String str8 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str7)) {
                                                                                                    str7 = str8;
                                                                                                }
                                                                                                String strM9340G5 = AbstractC4955ho.m9340G5(str8, str8, list122, list13);
                                                                                                final InterfaceC1235p interfaceC1235p5 = interfaceC1235p32;
                                                                                                boolean zM4534f72 = c1836h032.m4534f(interfaceC1235p5) | c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P5 = c1836h032.m4514P();
                                                                                                if (zM4534f72 || objM4514P5 == c1823e2) {
                                                                                                    final int i19 = 1;
                                                                                                    objM4514P5 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i19) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s02;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s02;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P5);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str7, strM9340G5, (InterfaceC1220a) objM4514P5, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i17 < arrayList5.size() - 1) {
                                                                                                c1836h032.m4525a0(316321169);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1216035103);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i17 = i18;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h022), c1836h022, 48, 1);
                                                        } else {
                                                            c1836h022.m4519V();
                                                        }
                                                        break;
                                                    default:
                                                        C1836h0 c1836h03 = (C1836h0) obj6;
                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                        ((C3619d) obj5).getClass();
                                                        if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            final int i132 = 1;
                                                            final List list10 = list62;
                                                            final ArrayList arrayList4 = arrayList22;
                                                            final InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a172;
                                                            final InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a182;
                                                            final List list11 = list52;
                                                            final List list12 = list42;
                                                            final InterfaceC1235p interfaceC1235p4 = interfaceC1235p22;
                                                            final InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a162;
                                                            final InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a192;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(312057136, new InterfaceC1235p() { // from class: wb.sf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i1322 = i132;
                                                                    C1836h0 c1836h032 = (C1836h0) obj8;
                                                                    int iIntValue32 = ((Integer) obj9).intValue();
                                                                    switch (i1322) {
                                                                        case 0:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(1732708707);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a115;
                                                                                if (((String) interfaceC1809a1142.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(1732710940);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1142.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list10.isEmpty()) {
                                                                                    c1836h032.m4525a0(1732713069);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList42 = arrayList4;
                                                                                    if (arrayList42.isEmpty()) {
                                                                                        c1836h032.m4525a0(1732715583);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2120284544);
                                                                                        int i14 = 0;
                                                                                        for (Object obj10 : arrayList42) {
                                                                                            int i15 = i14 + 1;
                                                                                            if (i14 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s0 = (C5292s0) obj10;
                                                                                            boolean zBooleanValue22 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                                                                            List list102 = list11;
                                                                                            List list112 = list12;
                                                                                            C1823e c1823e = C1851l.f6155a;
                                                                                            if (zBooleanValue22) {
                                                                                                c1836h032.m4525a0(1203979937);
                                                                                                String str = c5292s0.f20551b;
                                                                                                String str2 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str)) {
                                                                                                    str = str2;
                                                                                                }
                                                                                                C4759bp c4759bp = new C4759bp(str, i14, AbstractC4955ho.m9460V5(str2, list102, list112));
                                                                                                InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a117;
                                                                                                boolean zContains = ((Set) interfaceC1809a1152.getValue()).contains(str2);
                                                                                                boolean zM4538h52 = c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P22 = c1836h032.m4514P();
                                                                                                if (zM4538h52 || objM4514P22 == c1823e) {
                                                                                                    objM4514P22 = new C5458x1(c5292s0, interfaceC1809a1152, 2);
                                                                                                    c1836h032.m4545k0(objM4514P22);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P22, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1204922988);
                                                                                                String str3 = c5292s0.f20551b;
                                                                                                String str4 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str3)) {
                                                                                                    str3 = str4;
                                                                                                }
                                                                                                String strM9460V5 = AbstractC4955ho.m9460V5(str4, list102, list112);
                                                                                                final InterfaceC1235p interfaceC1235p42 = interfaceC1235p4;
                                                                                                boolean zM4534f62 = c1836h032.m4534f(interfaceC1235p42) | c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P3 = c1836h032.m4514P();
                                                                                                if (zM4534f62 || objM4514P3 == c1823e) {
                                                                                                    final int i16 = 0;
                                                                                                    objM4514P3 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i16) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s0;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s0;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P3);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str3, strM9460V5, (InterfaceC1220a) objM4514P3, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i14 < arrayList42.size() - 1) {
                                                                                                c1836h032.m4525a0(-1485137619);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1205387523);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i14 = i15;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(-760800953);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a115;
                                                                                if (((String) interfaceC1809a1162.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(-760798720);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1162.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list10.isEmpty()) {
                                                                                    c1836h032.m4525a0(-760796591);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList5 = arrayList4;
                                                                                    if (arrayList5.isEmpty()) {
                                                                                        c1836h032.m4525a0(-760794077);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2109671560);
                                                                                        int i17 = 0;
                                                                                        for (Object obj11 : arrayList5) {
                                                                                            int i18 = i17 + 1;
                                                                                            if (i17 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s02 = (C5292s0) obj11;
                                                                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                                                                            List list122 = list11;
                                                                                            List list13 = list12;
                                                                                            C1823e c1823e2 = C1851l.f6155a;
                                                                                            if (zBooleanValue3) {
                                                                                                c1836h032.m4525a0(1214592363);
                                                                                                String str5 = c5292s02.f20551b;
                                                                                                String str6 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str5)) {
                                                                                                    str5 = str6;
                                                                                                }
                                                                                                C4759bp c4759bp2 = new C4759bp(str5, i17, AbstractC4955ho.m9340G5(str6, str6, list122, list13));
                                                                                                InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a117;
                                                                                                boolean zContains2 = ((Set) interfaceC1809a1172.getValue()).contains(str6);
                                                                                                boolean zM4538h62 = c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P4 = c1836h032.m4514P();
                                                                                                if (zM4538h62 || objM4514P4 == c1823e2) {
                                                                                                    objM4514P4 = new C5458x1(c5292s02, interfaceC1809a1172, 3);
                                                                                                    c1836h032.m4545k0(objM4514P4);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P4, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1215553270);
                                                                                                String str7 = c5292s02.f20551b;
                                                                                                String str8 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str7)) {
                                                                                                    str7 = str8;
                                                                                                }
                                                                                                String strM9340G5 = AbstractC4955ho.m9340G5(str8, str8, list122, list13);
                                                                                                final InterfaceC1235p interfaceC1235p5 = interfaceC1235p4;
                                                                                                boolean zM4534f72 = c1836h032.m4534f(interfaceC1235p5) | c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P5 = c1836h032.m4514P();
                                                                                                if (zM4534f72 || objM4514P5 == c1823e2) {
                                                                                                    final int i19 = 1;
                                                                                                    objM4514P5 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i19) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s02;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s02;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P5);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str7, strM9340G5, (InterfaceC1220a) objM4514P5, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i17 < arrayList5.size() - 1) {
                                                                                                c1836h032.m4525a0(316321169);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1216035103);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i17 = i18;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h03), c1836h03, 48, 1);
                                                        } else {
                                                            c1836h03.m4519V();
                                                        }
                                                        break;
                                                }
                                                return C3967n.f12976a;
                                            }
                                        }, true), 3);
                                        break;
                                    default:
                                        C3623h c3623h2 = (C3623h) obj4;
                                        c3623h2.getClass();
                                        C3623h.m7604a(c3623h2, null, new C3874d(-1353849513, new C5293s1(interfaceC1809a18, 27), true), 3);
                                        final InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a19;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a1102.getValue()).booleanValue();
                                        final List list7 = list4;
                                        final List list8 = list5;
                                        if (!zBooleanValue2) {
                                            C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19660R3, 3);
                                            final int i12 = 1;
                                            final InterfaceC1220a interfaceC1220a5 = interfaceC1220a3;
                                            final InterfaceC1220a interfaceC1220a6 = interfaceC1220a4;
                                            C3623h.m7604a(c3623h2, null, new C3874d(-433802839, new InterfaceC1236q() { // from class: wb.ce
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1236q
                                                /* JADX INFO: renamed from: b */
                                                public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                    int i112 = i12;
                                                    C1836h0 c1836h022 = (C1836h0) obj6;
                                                    int iIntValue22 = ((Integer) obj7).intValue();
                                                    ((C3619d) obj5).getClass();
                                                    int i122 = iIntValue22 & 17;
                                                    switch (i112) {
                                                        case 0:
                                                            if (c1836h022.m4516S(iIntValue22 & 1, i122 != 16)) {
                                                                final int i13 = 0;
                                                                final List list622 = list7;
                                                                final InterfaceC1220a interfaceC1220a52 = interfaceC1220a5;
                                                                final List list72 = list8;
                                                                final InterfaceC1220a interfaceC1220a62 = interfaceC1220a6;
                                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1061974566, new InterfaceC1235p() { // from class: wb.pf
                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    @Override // p085fg.InterfaceC1235p
                                                                    public final Object invoke(Object obj8, Object obj9) {
                                                                        int i142 = i13;
                                                                        C1836h0 c1836h03 = (C1836h0) obj8;
                                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                                        switch (i142) {
                                                                            case 0:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list822 = list622;
                                                                                    String strM6836i = list822.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list822.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a72 = interfaceC1220a52;
                                                                                    boolean zM4534f62 = c1836h03.m4534f(interfaceC1220a72);
                                                                                    Object objM4514P22 = c1836h03.m4514P();
                                                                                    C1823e c1823e = C1851l.f6155a;
                                                                                    if (zM4534f62 || objM4514P22 == c1823e) {
                                                                                        objM4514P22 = new C5040kc(interfaceC1220a72, 7);
                                                                                        c1836h03.m4545k0(objM4514P22);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P22, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9444T5 = list822.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5(list72, list822);
                                                                                    InterfaceC1220a interfaceC1220a82 = interfaceC1220a62;
                                                                                    boolean zM4534f72 = c1836h03.m4534f(interfaceC1220a82);
                                                                                    Object objM4514P3 = c1836h03.m4514P();
                                                                                    if (zM4534f72 || objM4514P3 == c1823e) {
                                                                                        objM4514P3 = new C5040kc(interfaceC1220a82, 8);
                                                                                        c1836h03.m4545k0(objM4514P3);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list92 = list622;
                                                                                    String strM6836i2 = list92.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list92.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a9 = interfaceC1220a52;
                                                                                    boolean zM4534f82 = c1836h03.m4534f(interfaceC1220a9);
                                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                                    if (zM4534f82 || objM4514P4 == c1823e2) {
                                                                                        objM4514P4 = new C5040kc(interfaceC1220a9, 11);
                                                                                        c1836h03.m4545k0(objM4514P4);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("回复模板管理", strM6836i2, (InterfaceC1220a) objM4514P4, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9348H5 = list92.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5(list72, list92);
                                                                                    InterfaceC1220a interfaceC1220a10 = interfaceC1220a62;
                                                                                    boolean zM4534f92 = c1836h03.m4534f(interfaceC1220a10);
                                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                                    if (zM4534f92 || objM4514P5 == c1823e2) {
                                                                                        objM4514P5 = new C5040kc(interfaceC1220a10, 12);
                                                                                        c1836h03.m4545k0(objM4514P5);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P5, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return C3967n.f12976a;
                                                                    }
                                                                }, c1836h022), c1836h022, 48, 1);
                                                            } else {
                                                                c1836h022.m4519V();
                                                            }
                                                            break;
                                                        default:
                                                            if (c1836h022.m4516S(iIntValue22 & 1, i122 != 16)) {
                                                                final int i14 = 1;
                                                                final List list82 = list7;
                                                                final InterfaceC1220a interfaceC1220a7 = interfaceC1220a5;
                                                                final List list9 = list8;
                                                                final InterfaceC1220a interfaceC1220a8 = interfaceC1220a6;
                                                                AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-898159862, new InterfaceC1235p() { // from class: wb.pf
                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    @Override // p085fg.InterfaceC1235p
                                                                    public final Object invoke(Object obj8, Object obj9) {
                                                                        int i142 = i14;
                                                                        C1836h0 c1836h03 = (C1836h0) obj8;
                                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                                        switch (i142) {
                                                                            case 0:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list822 = list82;
                                                                                    String strM6836i = list822.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list822.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a72 = interfaceC1220a7;
                                                                                    boolean zM4534f62 = c1836h03.m4534f(interfaceC1220a72);
                                                                                    Object objM4514P22 = c1836h03.m4514P();
                                                                                    C1823e c1823e = C1851l.f6155a;
                                                                                    if (zM4534f62 || objM4514P22 == c1823e) {
                                                                                        objM4514P22 = new C5040kc(interfaceC1220a72, 7);
                                                                                        c1836h03.m4545k0(objM4514P22);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P22, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9444T5 = list822.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5(list9, list822);
                                                                                    InterfaceC1220a interfaceC1220a82 = interfaceC1220a8;
                                                                                    boolean zM4534f72 = c1836h03.m4534f(interfaceC1220a82);
                                                                                    Object objM4514P3 = c1836h03.m4514P();
                                                                                    if (zM4534f72 || objM4514P3 == c1823e) {
                                                                                        objM4514P3 = new C5040kc(interfaceC1220a82, 8);
                                                                                        c1836h03.m4545k0(objM4514P3);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    List list92 = list82;
                                                                                    String strM6836i2 = list92.isEmpty() ? "暂无模板，进入后添加" : AbstractC3199a.m6836i(list92.size(), " 个模板");
                                                                                    InterfaceC1220a interfaceC1220a9 = interfaceC1220a7;
                                                                                    boolean zM4534f82 = c1836h03.m4534f(interfaceC1220a9);
                                                                                    Object objM4514P4 = c1836h03.m4514P();
                                                                                    C1823e c1823e2 = C1851l.f6155a;
                                                                                    if (zM4534f82 || objM4514P4 == c1823e2) {
                                                                                        objM4514P4 = new C5040kc(interfaceC1220a9, 11);
                                                                                        c1836h03.m4545k0(objM4514P4);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("回复模板管理", strM6836i2, (InterfaceC1220a) objM4514P4, c1836h03, 6);
                                                                                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                                                                    String strM9348H5 = list92.isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5(list9, list92);
                                                                                    InterfaceC1220a interfaceC1220a10 = interfaceC1220a8;
                                                                                    boolean zM4534f92 = c1836h03.m4534f(interfaceC1220a10);
                                                                                    Object objM4514P5 = c1836h03.m4514P();
                                                                                    if (zM4534f92 || objM4514P5 == c1823e2) {
                                                                                        objM4514P5 = new C5040kc(interfaceC1220a10, 12);
                                                                                        c1836h03.m4545k0(objM4514P5);
                                                                                    }
                                                                                    AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P5, c1836h03, 6);
                                                                                } else {
                                                                                    c1836h03.m4519V();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return C3967n.f12976a;
                                                                    }
                                                                }, c1836h022), c1836h022, 48, 1);
                                                            } else {
                                                                c1836h022.m4519V();
                                                            }
                                                            break;
                                                    }
                                                    return C3967n.f12976a;
                                                }
                                            }, true), 3);
                                        }
                                        final List list9 = list6;
                                        C3623h.m7604a(c3623h2, null, new C3874d(-928815538, new C5140nd(2, list9), true), 3);
                                        final int i13 = 1;
                                        final ArrayList arrayList3 = arrayList2;
                                        final InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a16;
                                        final InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a17;
                                        final InterfaceC1235p interfaceC1235p3 = interfaceC1235p2;
                                        final InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a110;
                                        C3623h.m7604a(c3623h2, null, new C3874d(1015156367, new InterfaceC1236q() { // from class: wb.de
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1236q
                                            /* JADX INFO: renamed from: b */
                                            public final Object mo734b(Object obj5, Object obj6, Object obj7) {
                                                switch (i13) {
                                                    case 0:
                                                        C1836h0 c1836h022 = (C1836h0) obj6;
                                                        int iIntValue22 = ((Integer) obj7).intValue();
                                                        ((C3619d) obj5).getClass();
                                                        if (c1836h022.m4516S(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                                                            final int i122 = 0;
                                                            final List list72 = list9;
                                                            final ArrayList arrayList32 = arrayList3;
                                                            final InterfaceC1809a1 interfaceC1809a11022 = interfaceC1809a111;
                                                            final InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a112;
                                                            final List list82 = list8;
                                                            final List list92 = list7;
                                                            final InterfaceC1235p interfaceC1235p32 = interfaceC1235p3;
                                                            final InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a1102;
                                                            final InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a113;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-2022775732, new InterfaceC1235p() { // from class: wb.sf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i1322 = i122;
                                                                    C1836h0 c1836h032 = (C1836h0) obj8;
                                                                    int iIntValue32 = ((Integer) obj9).intValue();
                                                                    switch (i1322) {
                                                                        case 0:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a11022.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(1732708707);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a1112;
                                                                                if (((String) interfaceC1809a1142.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(1732710940);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1142.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list72.isEmpty()) {
                                                                                    c1836h032.m4525a0(1732713069);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList42 = arrayList32;
                                                                                    if (arrayList42.isEmpty()) {
                                                                                        c1836h032.m4525a0(1732715583);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2120284544);
                                                                                        int i14 = 0;
                                                                                        for (Object obj10 : arrayList42) {
                                                                                            int i15 = i14 + 1;
                                                                                            if (i14 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s0 = (C5292s0) obj10;
                                                                                            boolean zBooleanValue22 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                                                                            List list102 = list82;
                                                                                            List list112 = list92;
                                                                                            C1823e c1823e = C1851l.f6155a;
                                                                                            if (zBooleanValue22) {
                                                                                                c1836h032.m4525a0(1203979937);
                                                                                                String str = c5292s0.f20551b;
                                                                                                String str2 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str)) {
                                                                                                    str = str2;
                                                                                                }
                                                                                                C4759bp c4759bp = new C4759bp(str, i14, AbstractC4955ho.m9460V5(str2, list102, list112));
                                                                                                InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a1132;
                                                                                                boolean zContains = ((Set) interfaceC1809a1152.getValue()).contains(str2);
                                                                                                boolean zM4538h52 = c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P22 = c1836h032.m4514P();
                                                                                                if (zM4538h52 || objM4514P22 == c1823e) {
                                                                                                    objM4514P22 = new C5458x1(c5292s0, interfaceC1809a1152, 2);
                                                                                                    c1836h032.m4545k0(objM4514P22);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P22, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1204922988);
                                                                                                String str3 = c5292s0.f20551b;
                                                                                                String str4 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str3)) {
                                                                                                    str3 = str4;
                                                                                                }
                                                                                                String strM9460V5 = AbstractC4955ho.m9460V5(str4, list102, list112);
                                                                                                final InterfaceC1235p interfaceC1235p42 = interfaceC1235p32;
                                                                                                boolean zM4534f62 = c1836h032.m4534f(interfaceC1235p42) | c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P3 = c1836h032.m4514P();
                                                                                                if (zM4534f62 || objM4514P3 == c1823e) {
                                                                                                    final int i16 = 0;
                                                                                                    objM4514P3 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i16) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s0;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s0;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P3);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str3, strM9460V5, (InterfaceC1220a) objM4514P3, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i14 < arrayList42.size() - 1) {
                                                                                                c1836h032.m4525a0(-1485137619);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1205387523);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i14 = i15;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a11022.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(-760800953);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a1112;
                                                                                if (((String) interfaceC1809a1162.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(-760798720);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1162.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list72.isEmpty()) {
                                                                                    c1836h032.m4525a0(-760796591);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList5 = arrayList32;
                                                                                    if (arrayList5.isEmpty()) {
                                                                                        c1836h032.m4525a0(-760794077);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2109671560);
                                                                                        int i17 = 0;
                                                                                        for (Object obj11 : arrayList5) {
                                                                                            int i18 = i17 + 1;
                                                                                            if (i17 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s02 = (C5292s0) obj11;
                                                                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                                                                            List list122 = list82;
                                                                                            List list13 = list92;
                                                                                            C1823e c1823e2 = C1851l.f6155a;
                                                                                            if (zBooleanValue3) {
                                                                                                c1836h032.m4525a0(1214592363);
                                                                                                String str5 = c5292s02.f20551b;
                                                                                                String str6 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str5)) {
                                                                                                    str5 = str6;
                                                                                                }
                                                                                                C4759bp c4759bp2 = new C4759bp(str5, i17, AbstractC4955ho.m9340G5(str6, str6, list122, list13));
                                                                                                InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a1132;
                                                                                                boolean zContains2 = ((Set) interfaceC1809a1172.getValue()).contains(str6);
                                                                                                boolean zM4538h62 = c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P4 = c1836h032.m4514P();
                                                                                                if (zM4538h62 || objM4514P4 == c1823e2) {
                                                                                                    objM4514P4 = new C5458x1(c5292s02, interfaceC1809a1172, 3);
                                                                                                    c1836h032.m4545k0(objM4514P4);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P4, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1215553270);
                                                                                                String str7 = c5292s02.f20551b;
                                                                                                String str8 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str7)) {
                                                                                                    str7 = str8;
                                                                                                }
                                                                                                String strM9340G5 = AbstractC4955ho.m9340G5(str8, str8, list122, list13);
                                                                                                final InterfaceC1235p interfaceC1235p5 = interfaceC1235p32;
                                                                                                boolean zM4534f72 = c1836h032.m4534f(interfaceC1235p5) | c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P5 = c1836h032.m4514P();
                                                                                                if (zM4534f72 || objM4514P5 == c1823e2) {
                                                                                                    final int i19 = 1;
                                                                                                    objM4514P5 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i19) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s02;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s02;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P5);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str7, strM9340G5, (InterfaceC1220a) objM4514P5, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i17 < arrayList5.size() - 1) {
                                                                                                c1836h032.m4525a0(316321169);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1216035103);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i17 = i18;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h022), c1836h022, 48, 1);
                                                        } else {
                                                            c1836h022.m4519V();
                                                        }
                                                        break;
                                                    default:
                                                        C1836h0 c1836h03 = (C1836h0) obj6;
                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                        ((C3619d) obj5).getClass();
                                                        if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            final int i132 = 1;
                                                            final List list10 = list9;
                                                            final ArrayList arrayList4 = arrayList3;
                                                            final InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a111;
                                                            final InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a112;
                                                            final List list11 = list8;
                                                            final List list12 = list7;
                                                            final InterfaceC1235p interfaceC1235p4 = interfaceC1235p3;
                                                            final InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a1102;
                                                            final InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a113;
                                                            AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(312057136, new InterfaceC1235p() { // from class: wb.sf
                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                @Override // p085fg.InterfaceC1235p
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    int i1322 = i132;
                                                                    C1836h0 c1836h032 = (C1836h0) obj8;
                                                                    int iIntValue32 = ((Integer) obj9).intValue();
                                                                    switch (i1322) {
                                                                        case 0:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(1732708707);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a115;
                                                                                if (((String) interfaceC1809a1142.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(1732710940);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1142.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list10.isEmpty()) {
                                                                                    c1836h032.m4525a0(1732713069);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList42 = arrayList4;
                                                                                    if (arrayList42.isEmpty()) {
                                                                                        c1836h032.m4525a0(1732715583);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2120284544);
                                                                                        int i14 = 0;
                                                                                        for (Object obj10 : arrayList42) {
                                                                                            int i15 = i14 + 1;
                                                                                            if (i14 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s0 = (C5292s0) obj10;
                                                                                            boolean zBooleanValue22 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                                                                            List list102 = list11;
                                                                                            List list112 = list12;
                                                                                            C1823e c1823e = C1851l.f6155a;
                                                                                            if (zBooleanValue22) {
                                                                                                c1836h032.m4525a0(1203979937);
                                                                                                String str = c5292s0.f20551b;
                                                                                                String str2 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str)) {
                                                                                                    str = str2;
                                                                                                }
                                                                                                C4759bp c4759bp = new C4759bp(str, i14, AbstractC4955ho.m9460V5(str2, list102, list112));
                                                                                                InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a117;
                                                                                                boolean zContains = ((Set) interfaceC1809a1152.getValue()).contains(str2);
                                                                                                boolean zM4538h52 = c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P22 = c1836h032.m4514P();
                                                                                                if (zM4538h52 || objM4514P22 == c1823e) {
                                                                                                    objM4514P22 = new C5458x1(c5292s0, interfaceC1809a1152, 2);
                                                                                                    c1836h032.m4545k0(objM4514P22);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P22, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1204922988);
                                                                                                String str3 = c5292s0.f20551b;
                                                                                                String str4 = c5292s0.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str3)) {
                                                                                                    str3 = str4;
                                                                                                }
                                                                                                String strM9460V5 = AbstractC4955ho.m9460V5(str4, list102, list112);
                                                                                                final InterfaceC1235p interfaceC1235p42 = interfaceC1235p4;
                                                                                                boolean zM4534f62 = c1836h032.m4534f(interfaceC1235p42) | c1836h032.m4538h(c5292s0);
                                                                                                Object objM4514P3 = c1836h032.m4514P();
                                                                                                if (zM4534f62 || objM4514P3 == c1823e) {
                                                                                                    final int i16 = 0;
                                                                                                    objM4514P3 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i16) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s0;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s0;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p42.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P3);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str3, strM9460V5, (InterfaceC1220a) objM4514P3, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i14 < arrayList42.size() - 1) {
                                                                                                c1836h032.m4525a0(-1485137619);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1205387523);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i14 = i15;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        default:
                                                                            if (!c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                                                                c1836h032.m4519V();
                                                                            } else if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                                                                                c1836h032.m4525a0(-760800953);
                                                                                AbstractC4955ho.m9657s0("正在载入监听群...", c1836h032, 6);
                                                                                c1836h032.m4553p(false);
                                                                            } else {
                                                                                InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a115;
                                                                                if (((String) interfaceC1809a1162.getValue()).length() > 0) {
                                                                                    c1836h032.m4525a0(-760798720);
                                                                                    AbstractC4955ho.m9657s0((String) interfaceC1809a1162.getValue(), c1836h032, 0);
                                                                                    c1836h032.m4553p(false);
                                                                                } else if (list10.isEmpty()) {
                                                                                    c1836h032.m4525a0(-760796591);
                                                                                    AbstractC4955ho.m9657s0("暂无监听群。点击底部“选择监听群”添加。", c1836h032, 6);
                                                                                    c1836h032.m4553p(false);
                                                                                } else {
                                                                                    ArrayList arrayList5 = arrayList4;
                                                                                    if (arrayList5.isEmpty()) {
                                                                                        c1836h032.m4525a0(-760794077);
                                                                                        AbstractC4955ho.m9657s0("没有匹配结果", c1836h032, 6);
                                                                                        c1836h032.m4553p(false);
                                                                                    } else {
                                                                                        c1836h032.m4525a0(-2109671560);
                                                                                        int i17 = 0;
                                                                                        for (Object obj11 : arrayList5) {
                                                                                            int i18 = i17 + 1;
                                                                                            if (i17 < 0) {
                                                                                                AbstractC0000a.m32Q0();
                                                                                                throw null;
                                                                                            }
                                                                                            final C5292s0 c5292s02 = (C5292s0) obj11;
                                                                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                                                                            List list122 = list11;
                                                                                            List list13 = list12;
                                                                                            C1823e c1823e2 = C1851l.f6155a;
                                                                                            if (zBooleanValue3) {
                                                                                                c1836h032.m4525a0(1214592363);
                                                                                                String str5 = c5292s02.f20551b;
                                                                                                String str6 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str5)) {
                                                                                                    str5 = str6;
                                                                                                }
                                                                                                C4759bp c4759bp2 = new C4759bp(str5, i17, AbstractC4955ho.m9340G5(str6, str6, list122, list13));
                                                                                                InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a117;
                                                                                                boolean zContains2 = ((Set) interfaceC1809a1172.getValue()).contains(str6);
                                                                                                boolean zM4538h62 = c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P4 = c1836h032.m4514P();
                                                                                                if (zM4538h62 || objM4514P4 == c1823e2) {
                                                                                                    objM4514P4 = new C5458x1(c5292s02, interfaceC1809a1172, 3);
                                                                                                    c1836h032.m4545k0(objM4514P4);
                                                                                                }
                                                                                                AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P4, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1215553270);
                                                                                                String str7 = c5292s02.f20551b;
                                                                                                String str8 = c5292s02.f20550a;
                                                                                                if (AbstractC3149m.m6721t0(str7)) {
                                                                                                    str7 = str8;
                                                                                                }
                                                                                                String strM9340G5 = AbstractC4955ho.m9340G5(str8, str8, list122, list13);
                                                                                                final InterfaceC1235p interfaceC1235p5 = interfaceC1235p4;
                                                                                                boolean zM4534f72 = c1836h032.m4534f(interfaceC1235p5) | c1836h032.m4538h(c5292s02);
                                                                                                Object objM4514P5 = c1836h032.m4514P();
                                                                                                if (zM4534f72 || objM4514P5 == c1823e2) {
                                                                                                    final int i19 = 1;
                                                                                                    objM4514P5 = new InterfaceC1220a() { // from class: wb.ah
                                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                        @Override // p085fg.InterfaceC1220a
                                                                                                        public final Object invoke() {
                                                                                                            switch (i19) {
                                                                                                                case 0:
                                                                                                                    C5292s0 c5292s022 = c5292s02;
                                                                                                                    String str52 = c5292s022.f20550a;
                                                                                                                    String str62 = c5292s022.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str62)) {
                                                                                                                        str62 = str52;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str52, str62);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    C5292s0 c5292s03 = c5292s02;
                                                                                                                    String str72 = c5292s03.f20550a;
                                                                                                                    String str82 = c5292s03.f20551b;
                                                                                                                    if (AbstractC3149m.m6721t0(str82)) {
                                                                                                                        str82 = str72;
                                                                                                                    }
                                                                                                                    interfaceC1235p5.invoke(str72, str82);
                                                                                                                    break;
                                                                                                            }
                                                                                                            return C3967n.f12976a;
                                                                                                        }
                                                                                                    };
                                                                                                    c1836h032.m4545k0(objM4514P5);
                                                                                                }
                                                                                                AbstractC4955ho.m9704x3(str7, strM9340G5, (InterfaceC1220a) objM4514P5, c1836h032, 0);
                                                                                                c1836h032.m4553p(false);
                                                                                            }
                                                                                            if (i17 < arrayList5.size() - 1) {
                                                                                                c1836h032.m4525a0(316321169);
                                                                                                AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                                                                            } else {
                                                                                                c1836h032.m4525a0(1216035103);
                                                                                            }
                                                                                            c1836h032.m4553p(false);
                                                                                            i17 = i18;
                                                                                        }
                                                                                        c1836h032.m4553p(false);
                                                                                    }
                                                                                }
                                                                            }
                                                                            return C3967n.f12976a;
                                                                    }
                                                                }
                                                            }, c1836h03), c1836h03, 48, 1);
                                                        } else {
                                                            c1836h03.m4519V();
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
                        c1836h02.m4545k0(interfaceC1231l2);
                        objM4514P2 = interfaceC1231l2;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, this.f18054i, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
