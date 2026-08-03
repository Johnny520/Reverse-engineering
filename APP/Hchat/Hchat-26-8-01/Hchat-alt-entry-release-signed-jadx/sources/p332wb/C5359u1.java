package p332wb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p243q9.C3471g;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import sh.C4029m1;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.u1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5359u1 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20983g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f20984h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20985i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20986j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5359u1(List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f20983g = i9;
        this.f20984h = list;
        this.f20985i = interfaceC1809a1;
        this.f20986j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f20983g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 0;
                    final List list = this.f20984h;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f20985i;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f20986j;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(172679849, new InterfaceC1235p() { // from class: wb.y1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            InterfaceC1809a1 interfaceC1809a13;
                            Object next;
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a14 = interfaceC1809a1;
                                        String str = (String) interfaceC1809a14.getValue();
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1809a14);
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a12;
                                        boolean zM4534f2 = zM4534f | c1836h02.m4534f(interfaceC1809a15);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4534f2 || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C4029m1(1, interfaceC1809a14, interfaceC1809a15);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9486Z(list, str, (InterfaceC1231l) objM4514P, c1836h02, 0);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a1;
                                        String str2 = (String) interfaceC1809a16.getValue();
                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a16);
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a12;
                                        boolean zM4534f4 = zM4534f3 | c1836h03.m4534f(interfaceC1809a17);
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (zM4534f4 || objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4029m1(13, interfaceC1809a16, interfaceC1809a17);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9486Z(list, str2, (InterfaceC1231l) objM4514P2, c1836h03, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        List<C3471g> list2 = list;
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            boolean zHasNext = it.hasNext();
                                            interfaceC1809a13 = interfaceC1809a1;
                                            if (zHasNext) {
                                                next = it.next();
                                                if (((C3471g) next).f11255a.equals((String) interfaceC1809a13.getValue())) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        C3471g c3471g = (C3471g) next;
                                        String str3 = c3471g != null ? c3471g.f11256b : null;
                                        if (str3 == null) {
                                            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                                        for (C3471g c3471g2 : list2) {
                                            String str4 = c3471g2.f11256b;
                                            String str5 = c3471g2.f11255a;
                                            if (AbstractC3149m.m6721t0(str4)) {
                                                str4 = str5;
                                            }
                                            arrayList.add(new C4825dq(str5, str4));
                                        }
                                        String str6 = (String) interfaceC1809a13.getValue();
                                        boolean zM4534f5 = c1836h04.m4534f(interfaceC1809a13);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4534f5 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C4916gi(interfaceC1809a13, 15);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9353I2("选择模板", str3, arrayList, str6, (InterfaceC1231l) objM4514P3, false, c1836h04, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a12;
                                        String str7 = (String) interfaceC1809a18.getValue();
                                        Object objM4514P4 = c1836h04.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4916gi(interfaceC1809a18, 16);
                                            c1836h04.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9304C1("搜索监听群", "群名称 / 群聊备注 / 群号", str7, 0, (InterfaceC1231l) objM4514P4, c1836h04, 24630, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i12 = 1;
                    final List list2 = this.f20984h;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f20985i;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f20986j;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(308976833, new InterfaceC1235p() { // from class: wb.y1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            InterfaceC1809a1 interfaceC1809a132;
                            Object next;
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a13;
                                        String str = (String) interfaceC1809a142.getValue();
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1809a142);
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a14;
                                        boolean zM4534f2 = zM4534f | c1836h02.m4534f(interfaceC1809a15);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4534f2 || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C4029m1(1, interfaceC1809a142, interfaceC1809a15);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9486Z(list2, str, (InterfaceC1231l) objM4514P, c1836h02, 0);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a13;
                                        String str2 = (String) interfaceC1809a16.getValue();
                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a16);
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a14;
                                        boolean zM4534f4 = zM4534f3 | c1836h03.m4534f(interfaceC1809a17);
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (zM4534f4 || objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4029m1(13, interfaceC1809a16, interfaceC1809a17);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9486Z(list2, str2, (InterfaceC1231l) objM4514P2, c1836h03, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        List<C3471g> list22 = list2;
                                        Iterator it = list22.iterator();
                                        while (true) {
                                            boolean zHasNext = it.hasNext();
                                            interfaceC1809a132 = interfaceC1809a13;
                                            if (zHasNext) {
                                                next = it.next();
                                                if (((C3471g) next).f11255a.equals((String) interfaceC1809a132.getValue())) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        C3471g c3471g = (C3471g) next;
                                        String str3 = c3471g != null ? c3471g.f11256b : null;
                                        if (str3 == null) {
                                            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list22));
                                        for (C3471g c3471g2 : list22) {
                                            String str4 = c3471g2.f11256b;
                                            String str5 = c3471g2.f11255a;
                                            if (AbstractC3149m.m6721t0(str4)) {
                                                str4 = str5;
                                            }
                                            arrayList.add(new C4825dq(str5, str4));
                                        }
                                        String str6 = (String) interfaceC1809a132.getValue();
                                        boolean zM4534f5 = c1836h04.m4534f(interfaceC1809a132);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4534f5 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C4916gi(interfaceC1809a132, 15);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9353I2("选择模板", str3, arrayList, str6, (InterfaceC1231l) objM4514P3, false, c1836h04, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a14;
                                        String str7 = (String) interfaceC1809a18.getValue();
                                        Object objM4514P4 = c1836h04.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4916gi(interfaceC1809a18, 16);
                                            c1836h04.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9304C1("搜索监听群", "群名称 / 群聊备注 / 群号", str7, 0, (InterfaceC1231l) objM4514P4, c1836h04, 24630, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i13 = 2;
                    final List list3 = this.f20984h;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f20985i;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f20986j;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1635756961, new InterfaceC1235p() { // from class: wb.y1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            InterfaceC1809a1 interfaceC1809a132;
                            Object next;
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a15;
                                        String str = (String) interfaceC1809a142.getValue();
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1809a142);
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a16;
                                        boolean zM4534f2 = zM4534f | c1836h02.m4534f(interfaceC1809a152);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4534f2 || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C4029m1(1, interfaceC1809a142, interfaceC1809a152);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9486Z(list3, str, (InterfaceC1231l) objM4514P, c1836h02, 0);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a15;
                                        String str2 = (String) interfaceC1809a162.getValue();
                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a162);
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a16;
                                        boolean zM4534f4 = zM4534f3 | c1836h03.m4534f(interfaceC1809a17);
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (zM4534f4 || objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4029m1(13, interfaceC1809a162, interfaceC1809a17);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9486Z(list3, str2, (InterfaceC1231l) objM4514P2, c1836h03, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        List<C3471g> list22 = list3;
                                        Iterator it = list22.iterator();
                                        while (true) {
                                            boolean zHasNext = it.hasNext();
                                            interfaceC1809a132 = interfaceC1809a15;
                                            if (zHasNext) {
                                                next = it.next();
                                                if (((C3471g) next).f11255a.equals((String) interfaceC1809a132.getValue())) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        C3471g c3471g = (C3471g) next;
                                        String str3 = c3471g != null ? c3471g.f11256b : null;
                                        if (str3 == null) {
                                            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list22));
                                        for (C3471g c3471g2 : list22) {
                                            String str4 = c3471g2.f11256b;
                                            String str5 = c3471g2.f11255a;
                                            if (AbstractC3149m.m6721t0(str4)) {
                                                str4 = str5;
                                            }
                                            arrayList.add(new C4825dq(str5, str4));
                                        }
                                        String str6 = (String) interfaceC1809a132.getValue();
                                        boolean zM4534f5 = c1836h04.m4534f(interfaceC1809a132);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4534f5 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C4916gi(interfaceC1809a132, 15);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9353I2("选择模板", str3, arrayList, str6, (InterfaceC1231l) objM4514P3, false, c1836h04, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a16;
                                        String str7 = (String) interfaceC1809a18.getValue();
                                        Object objM4514P4 = c1836h04.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4916gi(interfaceC1809a18, 16);
                                            c1836h04.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9304C1("搜索监听群", "群名称 / 群聊备注 / 群号", str7, 0, (InterfaceC1231l) objM4514P4, c1836h04, 24630, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
