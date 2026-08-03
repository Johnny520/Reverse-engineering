package p332wb;

import java.util.List;
import na.C2922j;
import p000a.AbstractC0000a;
import p010aa.C0040h;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p109hb.C1676e0;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import sh.C4056v1;
import ua.C4298i;

/* JADX INFO: renamed from: wb.se */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5306se implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20652g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f20653h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1235p f20654i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5306se(List list, InterfaceC1235p interfaceC1235p, int i9) {
        this.f20652g = 4;
        this.f20653h = list;
        this.f20654i = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1836h0 c1836h0 = (C1836h0) obj;
        Integer num = (Integer) obj2;
        switch (this.f20652g) {
            case 0:
                int iIntValue = num.intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = this.f20653h;
                    if (list.isEmpty()) {
                        c1836h0.m4525a0(1189114016);
                        AbstractC4955ho.m9657s0("暂无模板。模板只配置消息类型和关键词，名单在“名单管理”里分配模板。", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(1189227042);
                        int i9 = 0;
                        for (Object obj3 : list) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C0040h c0040h = (C0040h) obj3;
                            String strM2249l = c0040h.f132b;
                            if (AbstractC3149m.m6721t0(strM2249l)) {
                                strM2249l = AbstractC0921a.m2249l(i10, "模板 ");
                            }
                            String strM9653r5 = AbstractC4955ho.m9653r5(c0040h);
                            InterfaceC1235p interfaceC1235p = this.f20654i;
                            boolean zM4534f = c1836h0.m4534f(interfaceC1235p) | c1836h0.m4530d(i9) | c1836h0.m4538h(c0040h);
                            Object objM4514P = c1836h0.m4514P();
                            if (zM4534f || objM4514P == C1851l.f6155a) {
                                objM4514P = new C1676e0(interfaceC1235p, i9, c0040h, 7);
                                c1836h0.m4545k0(objM4514P);
                            }
                            AbstractC4955ho.m9704x3(strM2249l, strM9653r5, (InterfaceC1220a) objM4514P, c1836h0, 0);
                            if (i9 < list.size() - 1) {
                                c1836h0.m4525a0(-451338058);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            } else {
                                c1836h0.m4525a0(-1106564454);
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
                    List list2 = this.f20653h;
                    if (list2.isEmpty()) {
                        c1836h0.m4525a0(-1611702761);
                        AbstractC4955ho.m9657s0("暂无模板。模板只配置抢包策略，适用聊天在“适用聊天”里分配。", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1611593672);
                        int i11 = 0;
                        for (Object obj4 : list2) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C2922j c2922j = (C2922j) obj4;
                            String strM2249l2 = c2922j.f9513b;
                            if (AbstractC3149m.m6721t0(strM2249l2)) {
                                strM2249l2 = AbstractC0921a.m2249l(i12, "模板 ");
                            }
                            String strM9680u5 = AbstractC4955ho.m9680u5(c2922j);
                            InterfaceC1235p interfaceC1235p2 = this.f20654i;
                            boolean zM4534f2 = c1836h0.m4534f(interfaceC1235p2) | c1836h0.m4530d(i11) | c1836h0.m4538h(c2922j);
                            Object objM4514P2 = c1836h0.m4514P();
                            if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                                objM4514P2 = new C1676e0(interfaceC1235p2, i11, c2922j, 8);
                                c1836h0.m4545k0(objM4514P2);
                            }
                            AbstractC4955ho.m9704x3(strM2249l2, strM9680u5, (InterfaceC1220a) objM4514P2, c1836h0, 0);
                            if (i11 < list2.size() - 1) {
                                c1836h0.m4525a0(-1095597990);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            } else {
                                c1836h0.m4525a0(396214134);
                            }
                            c1836h0.m4553p(false);
                            i11 = i12;
                        }
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                int iIntValue3 = num.intValue();
                if (c1836h0.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list3 = this.f20653h;
                    if (list3.isEmpty()) {
                        c1836h0.m4525a0(993951823);
                        AbstractC4955ho.m9657s0("暂无模板。新增后可设为默认规则或分配给指定聊天。", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(994052976);
                        int i13 = 0;
                        for (Object obj5 : list3) {
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C4298i c4298i = (C4298i) obj5;
                            String strM2249l3 = c4298i.f14301b;
                            if (AbstractC3149m.m6721t0(strM2249l3)) {
                                strM2249l3 = AbstractC0921a.m2249l(i14, "模板 ");
                            }
                            String strM9698w5 = AbstractC4955ho.m9698w5(c4298i);
                            InterfaceC1235p interfaceC1235p3 = this.f20654i;
                            boolean zM4534f3 = c1836h0.m4534f(interfaceC1235p3) | c1836h0.m4530d(i13) | c1836h0.m4538h(c4298i);
                            Object objM4514P3 = c1836h0.m4514P();
                            if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                                objM4514P3 = new C1676e0(interfaceC1235p3, i13, c4298i, 10);
                                c1836h0.m4545k0(objM4514P3);
                            }
                            AbstractC4955ho.m9704x3(strM2249l3, strM9698w5, (InterfaceC1220a) objM4514P3, c1836h0, 0);
                            if (i13 < list3.size() - 1) {
                                c1836h0.m4525a0(1546756498);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            } else {
                                c1836h0.m4525a0(704824638);
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
                    List list4 = this.f20653h;
                    if (list4.isEmpty()) {
                        c1836h0.m4525a0(-1701987459);
                        AbstractC4955ho.m9657s0("没有匹配功能", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1701929148);
                        int i15 = 0;
                        for (Object obj6 : list4) {
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C4803d3 c4803d3 = (C4803d3) obj6;
                            InterfaceC1235p interfaceC1235p4 = this.f20654i;
                            boolean zM4534f4 = c1836h0.m4534f(interfaceC1235p4) | c1836h0.m4538h(c4803d3);
                            Object objM4514P4 = c1836h0.m4514P();
                            if (zM4534f4 || objM4514P4 == C1851l.f6155a) {
                                objM4514P4 = new C4056v1(interfaceC1235p4, 10, c4803d3);
                                c1836h0.m4545k0(objM4514P4);
                            }
                            AbstractC4955ho.m9367K0(c4803d3, (InterfaceC1220a) objM4514P4, c1836h0, 0);
                            if (i15 < list4.size() - 1) {
                                c1836h0.m4525a0(-920588766);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                                c1836h0.m4553p(false);
                            } else {
                                c1836h0.m4525a0(-920536872);
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
            default:
                num.getClass();
                AbstractC4955ho.m9359J0(this.f20653h, this.f20654i, c1836h0, AbstractC1874r.m4617C(1));
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C5306se(List list, InterfaceC1235p interfaceC1235p, int i9, byte b10) {
        this.f20652g = i9;
        this.f20653h = list;
        this.f20654i = interfaceC1235p;
    }
}
