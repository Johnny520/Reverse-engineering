package p332wb;

import bi.AbstractC0316d;
import bi.C0314b;
import p071f1.C1017n;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p144k.AbstractC2192n;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p266s0.C3878h;
import p276sf.C3967n;
import p308v1.InterfaceC4412n0;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: wb.p9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5202p9 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19948g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f19949h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5202p9(int i9, int i10, InterfaceC1220a interfaceC1220a) {
        this.f19948g = i10;
        this.f19949h = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19948g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9330F3(this.f19949h, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 1:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a = this.f19949h;
                    boolean zM4534f = c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C5040kc(interfaceC1220a, 1);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9503b("插件 Agent", "按需求生成或修改脚本插件", (InterfaceC1220a) objM4514P, c1836h0, 54);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a2 = this.f19949h;
                    boolean zM4534f2 = c1836h02.m4534f(interfaceC1220a2);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C5040kc(interfaceC1220a2, 0);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9503b("在线插件", "浏览、安装或上传社区脚本插件", (InterfaceC1220a) objM4514P2, c1836h02, 54);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a3 = this.f19949h;
                    boolean zM4534f3 = c1836h03.m4534f(interfaceC1220a3);
                    Object objM4514P3 = c1836h03.m4514P();
                    if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                        objM4514P3 = new C5040kc(interfaceC1220a3, 13);
                        c1836h03.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9503b("删除模板", "删除后同时解除所有群绑定", (InterfaceC1220a) objM4514P3, c1836h03, 54);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a4 = this.f19949h;
                    boolean zM4534f4 = c1836h04.m4534f(interfaceC1220a4);
                    Object objM4514P4 = c1836h04.m4514P();
                    if (zM4534f4 || objM4514P4 == C1851l.f6155a) {
                        objM4514P4 = new C5040kc(interfaceC1220a4, 10);
                        c1836h04.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9503b("删除关键词", "移除该关键词", (InterfaceC1220a) objM4514P4, c1836h04, 54);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC4955ho.m9503b("移除适用聊天", "移除后恢复默认规则", this.f19949h, c1836h05, 54);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a5 = this.f19949h;
                    boolean zM4534f5 = c1836h06.m4534f(interfaceC1220a5);
                    Object objM4514P5 = c1836h06.m4514P();
                    if (zM4534f5 || objM4514P5 == C1851l.f6155a) {
                        objM4514P5 = new C5040kc(interfaceC1220a5, 15);
                        c1836h06.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9503b("自定义群发", "编辑内容并选择模块或微信原生通道", (InterfaceC1220a) objM4514P5, c1836h06, 54);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a6 = this.f19949h;
                    boolean zM4534f6 = c1836h07.m4534f(interfaceC1220a6);
                    Object objM4514P6 = c1836h07.m4514P();
                    if (zM4534f6 || objM4514P6 == C1851l.f6155a) {
                        objM4514P6 = new C5040kc(interfaceC1220a6, 9);
                        c1836h07.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9503b("清空所有关键词", "移除全部关键词", (InterfaceC1220a) objM4514P6, c1836h07, 54);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a7 = this.f19949h;
                    boolean zM4534f7 = c1836h08.m4534f(interfaceC1220a7);
                    Object objM4514P7 = c1836h08.m4514P();
                    if (zM4534f7 || objM4514P7 == C1851l.f6155a) {
                        objM4514P7 = new C5040kc(interfaceC1220a7, 4);
                        c1836h08.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9503b("删除规则", "移除该会话自定义通知配置", (InterfaceC1220a) objM4514P7, c1836h08, 54);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                C1836h0 c1836h09 = (C1836h0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC4955ho.m9503b("删除标签", "删除后不会移除原功能中已经保存的群聊", this.f19949h, c1836h09, 54);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                C1836h0 c1836h010 = (C1836h0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC4955ho.m9503b("删除模板", "删除后相关聊天恢复默认规则", this.f19949h, c1836h010, 54);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
            case 11:
                C1836h0 c1836h011 = (C1836h0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a8 = this.f19949h;
                    boolean zM4534f8 = c1836h011.m4534f(interfaceC1220a8);
                    Object objM4514P8 = c1836h011.m4514P();
                    if (zM4534f8 || objM4514P8 == C1851l.f6155a) {
                        objM4514P8 = new C5040kc(interfaceC1220a8, 22);
                        c1836h011.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9503b("删除模板", "删除后绑定关系也会移除", (InterfaceC1220a) objM4514P8, c1836h011, 54);
                } else {
                    c1836h011.m4519V();
                }
                return C3967n.f12976a;
            case 12:
                C1836h0 c1836h012 = (C1836h0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a9 = this.f19949h;
                    boolean zM4534f9 = c1836h012.m4534f(interfaceC1220a9);
                    Object objM4514P9 = c1836h012.m4514P();
                    if (zM4534f9 || objM4514P9 == C1851l.f6155a) {
                        objM4514P9 = new C5040kc(interfaceC1220a9, 23);
                        c1836h012.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9503b("删除当前群", "移除监听、模板绑定和本群专属设置", (InterfaceC1220a) objM4514P9, c1836h012, 54);
                } else {
                    c1836h012.m4519V();
                }
                return C3967n.f12976a;
            case 13:
                C1836h0 c1836h013 = (C1836h0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c1836h013.m4516S(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC4955ho.m9503b("新增回复", "添加一条按顺序发送的回复", this.f19949h, c1836h013, 54);
                } else {
                    c1836h013.m4519V();
                }
                return C3967n.f12976a;
            case 14:
                C1836h0 c1836h014 = (C1836h0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c1836h014.m4516S(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    InterfaceC1220a interfaceC1220a10 = this.f19949h;
                    if (interfaceC1220a10 == null) {
                        c1836h014.m4525a0(-1080253013);
                        c1836h014.m4553p(false);
                    } else {
                        c1836h014.m4525a0(-1080253012);
                        C5850l c5850l = C5850l.f23787a;
                        InterfaceC5853o interfaceC5853oM9405O6 = AbstractC4955ho.m9405O6(AbstractC3222h1.m6907j(c5850l, 40), interfaceC1220a10);
                        InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23765k, false);
                        int iHashCode = Long.hashCode(c1836h014.f6095T);
                        C3878h c3878hM4546l = c1836h014.m4546l();
                        InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h014, interfaceC5853oM9405O6);
                        InterfaceC5605g.f22815f.getClass();
                        C5660y c5660y = C5601f.f22758b;
                        c1836h014.m4531d0();
                        if (c1836h014.f6094S) {
                            c1836h014.m4544k(c5660y);
                        } else {
                            c1836h014.m4551n0();
                        }
                        AbstractC1874r.m4615A(C5601f.f22761e, c1836h014, interfaceC4412n0M6930d);
                        AbstractC1874r.m4615A(C5601f.f22760d, c1836h014, c3878hM4546l);
                        AbstractC1874r.m4615A(C5601f.f22762f, c1836h014, Integer.valueOf(iHashCode));
                        AbstractC1874r.m4641w(C5601f.f22763g, c1836h014);
                        AbstractC1874r.m4615A(C5601f.f22759c, c1836h014, interfaceC5853oM10543c);
                        AbstractC2192n.m5426c(AbstractC4726ap.f15853a, "返回", AbstractC3222h1.m6907j(c5850l, 24), new C1017n(((C0314b) c1836h014.m4542j(AbstractC0316d.f944a)).m1237g(), 5), c1836h014, 438);
                        c1836h014.m4553p(true);
                        c1836h014.m4553p(false);
                    }
                } else {
                    c1836h014.m4519V();
                }
                return C3967n.f12976a;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9585k0(this.f19949h, (C1836h0) obj, AbstractC1874r.m4617C(7));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5202p9(InterfaceC1220a interfaceC1220a, int i9) {
        this.f19948g = i9;
        this.f19949h = interfaceC1220a;
    }
}
