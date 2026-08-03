package p332wb;

import java.util.List;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p065eb.C0859c0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p197n9.C2912a;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p276sf.C3967n;
import sh.C4056v1;

/* JADX INFO: renamed from: wb.z1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5522z1 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22311g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f22312h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f22313i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5522z1(List list, InterfaceC1231l interfaceC1231l, int i9) {
        this.f22311g = 4;
        this.f22312h = list;
        this.f22313i = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1836h0 c1836h0 = (C1836h0) obj;
        Integer num = (Integer) obj2;
        switch (this.f22311g) {
            case 0:
                int iIntValue = num.intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = this.f22312h;
                    if (list.isEmpty()) {
                        c1836h0.m4525a0(-1936885700);
                        AbstractC4955ho.m9657s0("没有其它可用分组", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1936798869);
                        int i9 = 0;
                        for (Object obj3 : list) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C4900g2 c4900g2 = (C4900g2) obj3;
                            String strM1020i = AbstractC0255e.m1020i(AbstractC3156t.m6736Z(c4900g2.f17325b, "  "), c4900g2.f17324a.f1180b);
                            String str = c4900g2.f17326c;
                            InterfaceC1231l interfaceC1231l = this.f22313i;
                            boolean zM4534f = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c4900g2);
                            Object objM4514P = c1836h0.m4514P();
                            if (zM4534f || objM4514P == C1851l.f6155a) {
                                objM4514P = new C4736b2(interfaceC1231l, c4900g2, 1);
                                c1836h0.m4545k0(objM4514P);
                            }
                            AbstractC4955ho.m9704x3(strM1020i, str, (InterfaceC1220a) objM4514P, c1836h0, 0);
                            if (i9 < list.size() - 1) {
                                c1836h0.m4525a0(1834762129);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            } else {
                                c1836h0.m4525a0(1043064607);
                            }
                            c1836h0.m4553p(false);
                            i9 = i10;
                        }
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                int iIntValue2 = num.intValue();
                if (c1836h0.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    List list2 = this.f22312h;
                    int i11 = 0;
                    for (Object obj4 : list2) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C4770c3 c4770c3 = (C4770c3) obj4;
                        InterfaceC1231l interfaceC1231l2 = this.f22313i;
                        boolean zM4534f2 = c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c4770c3);
                        Object objM4514P2 = c1836h0.m4514P();
                        if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                            objM4514P2 = new C4056v1(interfaceC1231l2, 14, c4770c3);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9327F0(c4770c3, (InterfaceC1220a) objM4514P2, c1836h0, 0);
                        if (i11 < list2.size() - 1) {
                            c1836h0.m4525a0(-1948652417);
                            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            c1836h0.m4553p(false);
                        } else {
                            c1836h0.m4525a0(-1948600523);
                            c1836h0.m4553p(false);
                        }
                        i11 = i12;
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                int iIntValue3 = num.intValue();
                if (c1836h0.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list3 = this.f22312h;
                    if (list3.isEmpty()) {
                        c1836h0.m4525a0(-102094501);
                        AbstractC4955ho.m9657s0("暂无群聊标签", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-102010553);
                        int i13 = 0;
                        for (Object obj5 : list3) {
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C2912a c2912a = (C2912a) obj5;
                            String str2 = c2912a.f9410b;
                            String strM6836i = AbstractC3199a.m6836i(c2912a.f9411c.size(), " 个群聊");
                            InterfaceC1231l interfaceC1231l3 = this.f22313i;
                            boolean zM4534f3 = c1836h0.m4534f(interfaceC1231l3) | c1836h0.m4538h(c2912a);
                            Object objM4514P3 = c1836h0.m4514P();
                            if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                objM4514P3 = new C5012jh(interfaceC1231l3, c2912a, 1);
                                c1836h0.m4545k0(objM4514P3);
                            }
                            AbstractC4955ho.m9704x3(str2, strM6836i, (InterfaceC1220a) objM4514P3, c1836h0, 0);
                            if (i13 < list3.size() - 1) {
                                c1836h0.m4525a0(1758687824);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            } else {
                                c1836h0.m4525a0(-1315238848);
                            }
                            c1836h0.m4553p(false);
                            i13 = i14;
                        }
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                int iIntValue4 = num.intValue();
                if (c1836h0.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    List list4 = this.f22312h;
                    if (list4.isEmpty()) {
                        c1836h0.m4525a0(-1874154283);
                        AbstractC4955ho.m9657s0("没有匹配插件", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1874096778);
                        int i15 = 0;
                        for (Object obj6 : list4) {
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C0859c0 c0859c0 = (C0859c0) obj6;
                            InterfaceC1231l interfaceC1231l4 = this.f22313i;
                            boolean zM4534f4 = c1836h0.m4534f(interfaceC1231l4) | c1836h0.m4538h(c0859c0);
                            Object objM4514P4 = c1836h0.m4514P();
                            if (zM4534f4 || objM4514P4 == C1851l.f6155a) {
                                objM4514P4 = new C5235q9(interfaceC1231l4, c0859c0, 0);
                                c1836h0.m4545k0(objM4514P4);
                            }
                            AbstractC4955ho.m9345H2(c0859c0, (InterfaceC1220a) objM4514P4, c1836h0, 8);
                            if (i15 < list4.size() - 1) {
                                c1836h0.m4525a0(848063917);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                                c1836h0.m4553p(false);
                            } else {
                                c1836h0.m4525a0(848115811);
                                c1836h0.m4553p(false);
                            }
                            i15 = i16;
                        }
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                num.getClass();
                AbstractC4955ho.m9337G2(this.f22312h, this.f22313i, c1836h0, AbstractC1874r.m4617C(1));
                return C3967n.f12976a;
            default:
                int iIntValue5 = num.intValue();
                if (c1836h0.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    List list5 = this.f22312h;
                    boolean zM4538h = c1836h0.m4538h(list5);
                    InterfaceC1231l interfaceC1231l5 = this.f22313i;
                    boolean zM4534f5 = zM4538h | c1836h0.m4534f(interfaceC1231l5);
                    Object objM4514P5 = c1836h0.m4514P();
                    if (zM4534f5 || objM4514P5 == C1851l.f6155a) {
                        objM4514P5 = new C5475xi(list5, interfaceC1231l5, 17);
                        c1836h0.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9503b("添加 MCP", "可同时启用多个远程 MCP 服务器", (InterfaceC1220a) objM4514P5, c1836h0, 54);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5522z1(List list, InterfaceC1231l interfaceC1231l, int i9, byte b10) {
        this.f22311g = i9;
        this.f22312h = list;
        this.f22313i = interfaceC1231l;
    }
}
