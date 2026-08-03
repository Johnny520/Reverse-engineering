package p332wb;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import na.C2922j;
import p000a.AbstractC0000a;
import p010aa.C0040h;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p109hb.C1676e0;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p197n9.C2912a;
import p218og.AbstractC3149m;
import p276sf.C3963j;
import p276sf.C3967n;
import sh.C4056v1;
import ua.C4298i;

/* JADX INFO: renamed from: wb.ve */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5405ve implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21379g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f21380h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f21381i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5405ve(InterfaceC1809a1 interfaceC1809a1, List list, int i9) {
        this.f21379g = i9;
        this.f21380h = interfaceC1809a1;
        this.f21381i = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9;
        switch (this.f21379g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i10 = 0;
                    for (Object obj3 : this.f21381i) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C3963j c3963j = (C3963j) obj3;
                        if (i10 > 0) {
                            c1836h0.m4525a0(610054091);
                            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        } else {
                            c1836h0.m4525a0(1731821093);
                        }
                        c1836h0.m4553p(false);
                        InterfaceC1809a1 interfaceC1809a1 = this.f21380h;
                        boolean zContains = ((Set) interfaceC1809a1.getValue()).contains(c3963j.f12971g);
                        String str = (String) c3963j.f12972h;
                        String str2 = (String) c3963j.f12973i;
                        boolean zM4534f = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4534f(c3963j);
                        Object objM4514P = c1836h0.m4514P();
                        if (zM4534f || objM4514P == C1851l.f6155a) {
                            objM4514P = new C5068l7(c3963j, 7, interfaceC1809a1);
                            c1836h0.m4545k0(objM4514P);
                        }
                        AbstractC4955ho.m9410P3(zContains, str, str2, false, (InterfaceC1231l) objM4514P, c1836h0, 0, 8);
                        i10 = i11;
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C4759bp c4759bp = new C4759bp("跟随默认规则", -1, "使用默认模板或全局设置");
                    InterfaceC1809a1 interfaceC1809a12 = this.f21380h;
                    boolean zM6721t0 = AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue());
                    boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a12);
                    Object objM4514P2 = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f2 || objM4514P2 == c1823e) {
                        objM4514P2 = new C4749bf(interfaceC1809a12, 22);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9703x2(c4759bp, zM6721t0, (InterfaceC1220a) objM4514P2, c1836h02, 0);
                    int i12 = 0;
                    for (Object obj4 : this.f21381i) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C4298i c4298i = (C4298i) obj4;
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        String strM2249l = c4298i.f14301b;
                        if (AbstractC3149m.m6721t0(strM2249l)) {
                            strM2249l = AbstractC0921a.m2249l(i13, "模板 ");
                        }
                        C4759bp c4759bp2 = new C4759bp(strM2249l, i12, AbstractC4955ho.m9698w5(c4298i));
                        boolean zM3825a = AbstractC1416l.m3825a((String) interfaceC1809a12.getValue(), c4298i.f14300a);
                        boolean zM4534f3 = c1836h02.m4534f(interfaceC1809a12) | c1836h02.m4538h(c4298i);
                        Object objM4514P3 = c1836h02.m4514P();
                        if (zM4534f3 || objM4514P3 == c1823e) {
                            objM4514P3 = new C4056v1(c4298i, 22, interfaceC1809a12);
                            c1836h02.m4545k0(objM4514P3);
                        }
                        AbstractC4955ho.m9703x2(c4759bp2, zM3825a, (InterfaceC1220a) objM4514P3, c1836h02, 0);
                        i12 = i13;
                    }
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list = this.f21381i;
                    if (list.isEmpty()) {
                        c1836h03.m4525a0(-1817022569);
                        AbstractC4955ho.m9657s0("暂无模板。先新增模板，再回来批量添加名单。", c1836h03, 6);
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(-1816910380);
                        int i14 = 0;
                        for (Object obj5 : list) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C0040h c0040h = (C0040h) obj5;
                            InterfaceC1809a1 interfaceC1809a13 = this.f21380h;
                            boolean zContains2 = ((Set) interfaceC1809a13.getValue()).contains(c0040h.f131a);
                            String strM2249l2 = c0040h.f132b;
                            if (AbstractC3149m.m6721t0(strM2249l2)) {
                                strM2249l2 = AbstractC0921a.m2249l(i15, "模板 ");
                            }
                            String strM9653r5 = AbstractC4955ho.m9653r5(c0040h);
                            boolean zM4534f4 = c1836h03.m4534f(interfaceC1809a13) | c1836h03.m4538h(c0040h);
                            Object objM4514P4 = c1836h03.m4514P();
                            if (zM4534f4 || objM4514P4 == C1851l.f6155a) {
                                objM4514P4 = new C5068l7(c0040h, 11, interfaceC1809a13);
                                c1836h03.m4545k0(objM4514P4);
                            }
                            AbstractC4955ho.m9410P3(zContains2, strM2249l2, strM9653r5, false, (InterfaceC1231l) objM4514P4, c1836h03, 0, 8);
                            if (i14 < list.size() - 1) {
                                c1836h03.m4525a0(-1688119444);
                                AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                            } else {
                                c1836h03.m4525a0(-792081756);
                            }
                            c1836h03.m4553p(false);
                            i14 = i15;
                        }
                        c1836h03.m4553p(false);
                    }
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    List list2 = this.f21381i;
                    int i16 = 0;
                    for (Object obj6 : list2) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C2912a c2912a = (C2912a) obj6;
                        Set set = c2912a.f9411c;
                        boolean z9 = set instanceof Collection;
                        InterfaceC1809a1 interfaceC1809a14 = this.f21380h;
                        if (z9 && set.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it = set.iterator();
                            i9 = 0;
                            while (it.hasNext()) {
                                if (((Set) interfaceC1809a14.getValue()).contains((String) it.next()) && (i9 = i9 + 1) < 0) {
                                    AbstractC0000a.m30P0();
                                    throw null;
                                }
                            }
                        }
                        boolean zM4534f5 = c1836h04.m4534f(interfaceC1809a14) | c1836h04.m4530d(i9) | c1836h04.m4538h(c2912a);
                        Object objM4514P5 = c1836h04.m4514P();
                        if (zM4534f5 || objM4514P5 == C1851l.f6155a) {
                            objM4514P5 = new C1676e0(i9, c2912a, interfaceC1809a14);
                            c1836h04.m4545k0(objM4514P5);
                        }
                        AbstractC4955ho.m9541f1(c2912a, i9, (InterfaceC1220a) objM4514P5, c1836h04, 8);
                        if (i16 < list2.size() - 1) {
                            c1836h04.m4525a0(-144951775);
                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                        } else {
                            c1836h04.m4525a0(-198524273);
                        }
                        c1836h04.m4553p(false);
                        i16 = i17;
                    }
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C4759bp c4759bp3 = new C4759bp("跟随默认规则", -1, "启用后按默认规则或旧版全局设置抢红包");
                    InterfaceC1809a1 interfaceC1809a15 = this.f21380h;
                    boolean zM6721t02 = AbstractC3149m.m6721t0((String) interfaceC1809a15.getValue());
                    boolean zM4534f6 = c1836h05.m4534f(interfaceC1809a15);
                    Object objM4514P6 = c1836h05.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4534f6 || objM4514P6 == c1823e2) {
                        objM4514P6 = new C4749bf(interfaceC1809a15, 19);
                        c1836h05.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9703x2(c4759bp3, zM6721t02, (InterfaceC1220a) objM4514P6, c1836h05, 0);
                    List list3 = this.f21381i;
                    if (list3.isEmpty()) {
                        c1836h05.m4525a0(1588224445);
                    } else {
                        c1836h05.m4525a0(-1611335373);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    }
                    c1836h05.m4553p(false);
                    int i18 = 0;
                    for (Object obj7 : list3) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C2922j c2922j = (C2922j) obj7;
                        String strM2249l3 = c2922j.f9513b;
                        if (AbstractC3149m.m6721t0(strM2249l3)) {
                            strM2249l3 = AbstractC0921a.m2249l(i19, "模板 ");
                        }
                        C4759bp c4759bp4 = new C4759bp(strM2249l3, i18, AbstractC4955ho.m9680u5(c2922j));
                        boolean zM3825a2 = AbstractC1416l.m3825a((String) interfaceC1809a15.getValue(), c2922j.f9512a);
                        boolean zM4534f7 = c1836h05.m4534f(interfaceC1809a15) | c1836h05.m4538h(c2922j);
                        Object objM4514P7 = c1836h05.m4514P();
                        if (zM4534f7 || objM4514P7 == c1823e2) {
                            objM4514P7 = new C4056v1(c2922j, 17, interfaceC1809a15);
                            c1836h05.m4545k0(objM4514P7);
                        }
                        AbstractC4955ho.m9703x2(c4759bp4, zM3825a2, (InterfaceC1220a) objM4514P7, c1836h05, 0);
                        if (i18 < list3.size() - 1) {
                            c1836h05.m4525a0(-1600825573);
                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        } else {
                            c1836h05.m4525a0(1914028245);
                        }
                        c1836h05.m4553p(false);
                        i18 = i19;
                    }
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            default:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a16 = this.f21380h;
                    String str3 = ((C4298i) interfaceC1809a16.getValue()).f14307h;
                    boolean zM4534f8 = c1836h06.m4534f(interfaceC1809a16);
                    Object objM4514P8 = c1836h06.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4534f8 || objM4514P8 == c1823e3) {
                        objM4514P8 = new C4916gi(interfaceC1809a16, 1);
                        c1836h06.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9353I2("收款位置", "选择转账到账账户", this.f21381i, str3, (InterfaceC1231l) objM4514P8, false, c1836h06, 54, 32);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    boolean z10 = ((C4298i) interfaceC1809a16.getValue()).f14320u;
                    boolean zM4534f9 = c1836h06.m4534f(interfaceC1809a16);
                    Object objM4514P9 = c1836h06.m4514P();
                    if (zM4534f9 || objM4514P9 == c1823e3) {
                        objM4514P9 = new C4916gi(interfaceC1809a16, 2);
                        c1836h06.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9410P3(z10, "拒收时退回", "规则不通过时原路退回", false, (InterfaceC1231l) objM4514P9, c1836h06, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    int i20 = ((C4298i) interfaceC1809a16.getValue()).f14303d;
                    String str4 = i20 != 1 ? i20 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                    ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                    int i21 = ((C4298i) interfaceC1809a16.getValue()).f14303d;
                    boolean zM4534f10 = c1836h06.m4534f(interfaceC1809a16);
                    Object objM4514P10 = c1836h06.m4514P();
                    if (zM4534f10 || objM4514P10 == c1823e3) {
                        objM4514P10 = new C4916gi(interfaceC1809a16, 3);
                        c1836h06.m4545k0(objM4514P10);
                    }
                    AbstractC4955ho.m9361J2("收款延迟", str4, arrayListM9333F6, i21, (InterfaceC1231l) objM4514P10, false, c1836h06, 6);
                    if (((C4298i) interfaceC1809a16.getValue()).f14303d == 2) {
                        c1836h06.m4525a0(1690583379);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        String strValueOf = String.valueOf(((C4298i) interfaceC1809a16.getValue()).f14304e);
                        boolean zM4534f11 = c1836h06.m4534f(interfaceC1809a16);
                        Object objM4514P11 = c1836h06.m4514P();
                        if (zM4534f11 || objM4514P11 == c1823e3) {
                            objM4514P11 = new C4916gi(interfaceC1809a16, 4);
                            c1836h06.m4545k0(objM4514P11);
                        }
                        AbstractC4955ho.m9695w2("自定义延迟", "单位 ms", strValueOf, (InterfaceC1231l) objM4514P11, c1836h06, 54);
                        c1836h06.m4553p(false);
                    } else if (((C4298i) interfaceC1809a16.getValue()).f14303d == 1) {
                        c1836h06.m4525a0(1690853203);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        String strValueOf2 = String.valueOf(((C4298i) interfaceC1809a16.getValue()).f14305f);
                        boolean zM4534f12 = c1836h06.m4534f(interfaceC1809a16);
                        Object objM4514P12 = c1836h06.m4514P();
                        if (zM4534f12 || objM4514P12 == c1823e3) {
                            objM4514P12 = new C4916gi(interfaceC1809a16, 5);
                            c1836h06.m4545k0(objM4514P12);
                        }
                        AbstractC4955ho.m9695w2("最小延迟", "单位 ms", strValueOf2, (InterfaceC1231l) objM4514P12, c1836h06, 54);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        String strValueOf3 = String.valueOf(((C4298i) interfaceC1809a16.getValue()).f14306g);
                        boolean zM4534f13 = c1836h06.m4534f(interfaceC1809a16);
                        Object objM4514P13 = c1836h06.m4514P();
                        if (zM4534f13 || objM4514P13 == c1823e3) {
                            objM4514P13 = new C4916gi(interfaceC1809a16, 6);
                            c1836h06.m4545k0(objM4514P13);
                        }
                        AbstractC4955ho.m9695w2("最大延迟", "单位 ms", strValueOf3, (InterfaceC1231l) objM4514P13, c1836h06, 54);
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(1691263550);
                        c1836h06.m4553p(false);
                    }
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5405ve(List list, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21379g = i9;
        this.f21381i = list;
        this.f21380h = interfaceC1809a1;
    }
}
