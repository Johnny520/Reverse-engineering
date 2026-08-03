package p332wb;

import gg.AbstractC1416l;
import java.util.List;
import p000a.AbstractC0000a;
import p036c9.C0500x0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3199a;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.u9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5367u9 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21042g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f21043h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21044i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21045j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21046k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21047l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21048m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21049n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5367u9(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, int i9) {
        this.f21042g = i9;
        this.f21043h = interfaceC1809a1;
        this.f21044i = interfaceC1809a12;
        this.f21045j = interfaceC1809a13;
        this.f21046k = interfaceC1809a14;
        this.f21047l = interfaceC1809a15;
        this.f21048m = interfaceC1809a16;
        this.f21049n = interfaceC1809a17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f21042g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 1;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f21043h;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f21044i;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f21045j;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f21046k;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f21047l;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f21048m;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f21049n;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-535566486, new InterfaceC1235p() { // from class: wb.td
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            String str;
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        String strM9484Y5 = AbstractC4955ho.m9484Y5((String) interfaceC1809a1.getValue());
                                        Object objM4514P = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a12;
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a18, 5);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("监听群与专属设置", strM9484Y5, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a13;
                                        String strM6836i = ((List) interfaceC1809a19.getValue()).isEmpty() ? "暂无模板，进入后添加批量配置" : AbstractC3199a.m6836i(((List) interfaceC1809a19.getValue()).size(), " 个模板，进入后修改或删除");
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4749bf(interfaceC1809a18, 6);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9444T5 = ((List) interfaceC1809a19.getValue()).isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5((List) interfaceC1809a14.getValue(), (List) interfaceC1809a19.getValue());
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a18, 7);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a15;
                                        String str2 = (String) interfaceC1809a110.getValue();
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C5109mf(interfaceC1809a110, 26);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9695w2("整体延迟", "单位秒，0-600", str2, (InterfaceC1231l) objM4514P4, c1836h02, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a16;
                                        String strM9476X5 = AbstractC4955ho.m9476X5((String) interfaceC1809a111.getValue());
                                        List listM9468W5 = AbstractC4955ho.m9468W5();
                                        String str3 = (String) interfaceC1809a111.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5109mf(interfaceC1809a111, 27);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9353I2("提示类型", strM9476X5, listM9468W5, str3, (InterfaceC1231l) objM4514P5, false, c1836h02, 24582, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a111.getValue(), "both")) {
                                            c1836h02.m4525a0(-1940785801);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a17;
                                            String str4 = AbstractC1416l.m3825a((String) interfaceC1809a112.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                            List listM9452U5 = AbstractC4955ho.m9452U5();
                                            String str5 = (String) interfaceC1809a112.getValue();
                                            Object objM4514P6 = c1836h02.m4514P();
                                            if (objM4514P6 == c1823e) {
                                                objM4514P6 = new C5109mf(interfaceC1809a112, 28);
                                                c1836h02.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9353I2("文本+卡片顺序", str4, listM9452U5, str5, (InterfaceC1231l) objM4514P6, false, c1836h02, 24582, 32);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-1940261095);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a1;
                                        String str6 = (String) interfaceC1809a113.getValue();
                                        Object objM4514P7 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P7 == c1823e2) {
                                            objM4514P7 = new C5109mf(interfaceC1809a113, 17);
                                            c1836h03.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9695w2("提示延迟", "单位 ms", str6, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a12;
                                        String str7 = (String) interfaceC1809a114.getValue();
                                        Object objM4514P8 = c1836h03.m4514P();
                                        if (objM4514P8 == c1823e2) {
                                            objM4514P8 = new C5109mf(interfaceC1809a114, 18);
                                            c1836h03.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9695w2("图片延迟", "单位 ms", str7, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a13;
                                        String str8 = (String) interfaceC1809a115.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C5109mf(interfaceC1809a115, 19);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9695w2("语音延迟", "单位 ms", str8, (InterfaceC1231l) objM4514P9, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a14;
                                        String str9 = (String) interfaceC1809a116.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5109mf(interfaceC1809a116, 20);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9695w2("表情延迟", "单位 ms", str9, (InterfaceC1231l) objM4514P10, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a15;
                                        String str10 = (String) interfaceC1809a117.getValue();
                                        Object objM4514P11 = c1836h03.m4514P();
                                        if (objM4514P11 == c1823e2) {
                                            objM4514P11 = new C5109mf(interfaceC1809a117, 21);
                                            c1836h03.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9695w2("视频延迟", "单位 ms", str10, (InterfaceC1231l) objM4514P11, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a16;
                                        String str11 = (String) interfaceC1809a118.getValue();
                                        Object objM4514P12 = c1836h03.m4514P();
                                        if (objM4514P12 == c1823e2) {
                                            objM4514P12 = new C5109mf(interfaceC1809a118, 22);
                                            c1836h03.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9695w2("文件延迟", "单位 ms", str11, (InterfaceC1231l) objM4514P12, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a17;
                                        String str12 = (String) interfaceC1809a119.getValue();
                                        Object objM4514P13 = c1836h03.m4514P();
                                        if (objM4514P13 == c1823e2) {
                                            objM4514P13 = new C5109mf(interfaceC1809a119, 23);
                                            c1836h03.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9695w2("收藏延迟", "单位 ms", str12, (InterfaceC1231l) objM4514P13, c1836h03, 3126);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a1;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a120.getValue()).booleanValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5534zd(interfaceC1809a120, 28);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "插入系统消息", "在对应群聊插入可点击成员资料的改名消息", false, (InterfaceC1231l) objM4514P14, c1836h04, 25008, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a12;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a121.getValue()).booleanValue();
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a121, 29);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "发送改名提醒", "向选择的监听群发送文本或卡片", false, (InterfaceC1231l) objM4514P15, c1836h04, 25008, 8);
                                        if (((Boolean) interfaceC1809a120.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1626701074);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a13;
                                            String str13 = (String) interfaceC1809a122.getValue();
                                            List list = AbstractC4955ho.f17701p;
                                            Object objM4514P16 = c1836h04.m4514P();
                                            if (objM4514P16 == c1823e3) {
                                                objM4514P16 = new C5535ze(interfaceC1809a122, 0);
                                                c1836h04.m4545k0(objM4514P16);
                                            }
                                            AbstractC4955ho.m9571i4("系统消息模板", "wxid变量会生成可点击资料链接", str13, list, 3, (InterfaceC1231l) objM4514P16, c1836h04, 221238, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a14;
                                            String str14 = "全部群聊";
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a123.getValue(), "specific")) {
                                                str = "全部群聊";
                                                str14 = "指定群聊";
                                            } else {
                                                str = "全部群聊";
                                            }
                                            List listM101y0 = AbstractC0000a.m101y0(new C4825dq("all", str), new C4825dq("specific", "指定群聊"));
                                            String str15 = (String) interfaceC1809a123.getValue();
                                            Object objM4514P17 = c1836h04.m4514P();
                                            if (objM4514P17 == c1823e3) {
                                                objM4514P17 = new C5535ze(interfaceC1809a123, 1);
                                                c1836h04.m4545k0(objM4514P17);
                                            }
                                            AbstractC4955ho.m9353I2("适用群聊", str14, listM101y0, str15, (InterfaceC1231l) objM4514P17, false, c1836h04, 24582, 32);
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a123.getValue(), "specific")) {
                                                c1836h04.m4525a0(1627890606);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a15;
                                                String strM9574i7 = AbstractC4955ho.m9574i7((String) interfaceC1809a124.getValue());
                                                Object objM4514P18 = c1836h04.m4514P();
                                                if (objM4514P18 == c1823e3) {
                                                    objM4514P18 = new C0500x0(20, interfaceC1809a124, interfaceC1809a16);
                                                    c1836h04.m4545k0(objM4514P18);
                                                }
                                                AbstractC4955ho.m9503b("选择指定群聊", strM9574i7, (InterfaceC1220a) objM4514P18, c1836h04, 390);
                                                c1836h04.m4553p(false);
                                            } else {
                                                c1836h04.m4525a0(1628757428);
                                                c1836h04.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a17;
                                            String str16 = (String) interfaceC1809a125.getValue();
                                            Object objM4514P19 = c1836h04.m4514P();
                                            if (objM4514P19 == c1823e3) {
                                                objM4514P19 = new C5371ud(interfaceC1809a125, 28);
                                                c1836h04.m4545k0(objM4514P19);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P19;
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5535ze(interfaceC1809a125, 2);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9430S("wxid颜色", "系统消息里的 wxid 链接颜色", str16, false, interfaceC1220a, (InterfaceC1231l) objM4514P20, c1836h04, 224310, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1629255412);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a1;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C4980ih(interfaceC1809a126, 23);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "应用静默时段", "批量修改时段静默", false, (InterfaceC1231l) objM4514P21, c1836h05, 25008, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(-1356920365);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a12;
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a127.getValue()).booleanValue();
                                            Object objM4514P22 = c1836h05.m4514P();
                                            if (objM4514P22 == c1823e4) {
                                                objM4514P22 = new C4980ih(interfaceC1809a127, 24);
                                                c1836h05.m4545k0(objM4514P22);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue4, "开启时段静默", "指定时间内不弹通知", false, (InterfaceC1231l) objM4514P22, c1836h05, 25008, 8);
                                            if (((Boolean) interfaceC1809a127.getValue()).booleanValue()) {
                                                c1836h05.m4525a0(-1356757677);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a13;
                                                String str17 = (String) interfaceC1809a128.getValue();
                                                Object objM4514P23 = c1836h05.m4514P();
                                                if (objM4514P23 == c1823e4) {
                                                    objM4514P23 = new C4980ih(interfaceC1809a128, 25);
                                                    c1836h05.m4545k0(objM4514P23);
                                                }
                                                AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P23, c1836h05, "开始时间", str17, false);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a14;
                                                String str18 = (String) interfaceC1809a129.getValue();
                                                Object objM4514P24 = c1836h05.m4514P();
                                                if (objM4514P24 == c1823e4) {
                                                    objM4514P24 = new C4980ih(interfaceC1809a129, 26);
                                                    c1836h05.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P24, c1836h05, "结束时间", str18, false);
                                                c1836h05 = c1836h05;
                                                c1836h05.m4553p(false);
                                            } else {
                                                c1836h05.m4525a0(-1356489558);
                                                c1836h05.m4553p(false);
                                            }
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(-1356467734);
                                            c1836h05.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a130 = interfaceC1809a15;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a130.getValue()).booleanValue();
                                        Object objM4514P25 = c1836h05.m4514P();
                                        if (objM4514P25 == c1823e4) {
                                            objM4514P25 = new C4980ih(interfaceC1809a130, 27);
                                            c1836h05.m4545k0(objM4514P25);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "应用群聊 @ 规则", "只对群聊规则生效", false, (InterfaceC1231l) objM4514P25, c1836h05, 25008, 8);
                                        if (((Boolean) interfaceC1809a130.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(-1356295343);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a131 = interfaceC1809a16;
                                            boolean zBooleanValue6 = ((Boolean) interfaceC1809a131.getValue()).booleanValue();
                                            Object objM4514P26 = c1836h05.m4514P();
                                            if (objM4514P26 == c1823e4) {
                                                objM4514P26 = new C4980ih(interfaceC1809a131, 28);
                                                c1836h05.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue6, "屏蔽@所有人", "命中 @所有人 时不弹通知", false, (InterfaceC1231l) objM4514P26, c1836h05, 25008, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a17;
                                            boolean zBooleanValue7 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Object objM4514P27 = c1836h05.m4514P();
                                            if (objM4514P27 == c1823e4) {
                                                objM4514P27 = new C4980ih(interfaceC1809a132, 29);
                                                c1836h05.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue7, "屏蔽@我", "命中 @我 时不弹通知", false, (InterfaceC1231l) objM4514P27, c1836h05, 25008, 8);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(-1356025302);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
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
                    final int i12 = 2;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f21043h;
                    final InterfaceC1809a1 interfaceC1809a19 = this.f21044i;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f21045j;
                    final InterfaceC1809a1 interfaceC1809a111 = this.f21046k;
                    final InterfaceC1809a1 interfaceC1809a112 = this.f21047l;
                    final InterfaceC1809a1 interfaceC1809a113 = this.f21048m;
                    final InterfaceC1809a1 interfaceC1809a114 = this.f21049n;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1850187694, new InterfaceC1235p() { // from class: wb.td
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            String str;
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        String strM9484Y5 = AbstractC4955ho.m9484Y5((String) interfaceC1809a18.getValue());
                                        Object objM4514P = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a19;
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a182, 5);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("监听群与专属设置", strM9484Y5, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a110;
                                        String strM6836i = ((List) interfaceC1809a192.getValue()).isEmpty() ? "暂无模板，进入后添加批量配置" : AbstractC3199a.m6836i(((List) interfaceC1809a192.getValue()).size(), " 个模板，进入后修改或删除");
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4749bf(interfaceC1809a182, 6);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9444T5 = ((List) interfaceC1809a192.getValue()).isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5((List) interfaceC1809a111.getValue(), (List) interfaceC1809a192.getValue());
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a182, 7);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a112;
                                        String str2 = (String) interfaceC1809a1102.getValue();
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C5109mf(interfaceC1809a1102, 26);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9695w2("整体延迟", "单位秒，0-600", str2, (InterfaceC1231l) objM4514P4, c1836h02, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a113;
                                        String strM9476X5 = AbstractC4955ho.m9476X5((String) interfaceC1809a1112.getValue());
                                        List listM9468W5 = AbstractC4955ho.m9468W5();
                                        String str3 = (String) interfaceC1809a1112.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5109mf(interfaceC1809a1112, 27);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9353I2("提示类型", strM9476X5, listM9468W5, str3, (InterfaceC1231l) objM4514P5, false, c1836h02, 24582, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a1112.getValue(), "both")) {
                                            c1836h02.m4525a0(-1940785801);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a114;
                                            String str4 = AbstractC1416l.m3825a((String) interfaceC1809a1122.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                            List listM9452U5 = AbstractC4955ho.m9452U5();
                                            String str5 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P6 = c1836h02.m4514P();
                                            if (objM4514P6 == c1823e) {
                                                objM4514P6 = new C5109mf(interfaceC1809a1122, 28);
                                                c1836h02.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9353I2("文本+卡片顺序", str4, listM9452U5, str5, (InterfaceC1231l) objM4514P6, false, c1836h02, 24582, 32);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-1940261095);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a18;
                                        String str6 = (String) interfaceC1809a1132.getValue();
                                        Object objM4514P7 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P7 == c1823e2) {
                                            objM4514P7 = new C5109mf(interfaceC1809a1132, 17);
                                            c1836h03.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9695w2("提示延迟", "单位 ms", str6, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a19;
                                        String str7 = (String) interfaceC1809a1142.getValue();
                                        Object objM4514P8 = c1836h03.m4514P();
                                        if (objM4514P8 == c1823e2) {
                                            objM4514P8 = new C5109mf(interfaceC1809a1142, 18);
                                            c1836h03.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9695w2("图片延迟", "单位 ms", str7, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a110;
                                        String str8 = (String) interfaceC1809a115.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C5109mf(interfaceC1809a115, 19);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9695w2("语音延迟", "单位 ms", str8, (InterfaceC1231l) objM4514P9, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a111;
                                        String str9 = (String) interfaceC1809a116.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5109mf(interfaceC1809a116, 20);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9695w2("表情延迟", "单位 ms", str9, (InterfaceC1231l) objM4514P10, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a112;
                                        String str10 = (String) interfaceC1809a117.getValue();
                                        Object objM4514P11 = c1836h03.m4514P();
                                        if (objM4514P11 == c1823e2) {
                                            objM4514P11 = new C5109mf(interfaceC1809a117, 21);
                                            c1836h03.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9695w2("视频延迟", "单位 ms", str10, (InterfaceC1231l) objM4514P11, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a113;
                                        String str11 = (String) interfaceC1809a118.getValue();
                                        Object objM4514P12 = c1836h03.m4514P();
                                        if (objM4514P12 == c1823e2) {
                                            objM4514P12 = new C5109mf(interfaceC1809a118, 22);
                                            c1836h03.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9695w2("文件延迟", "单位 ms", str11, (InterfaceC1231l) objM4514P12, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a114;
                                        String str12 = (String) interfaceC1809a119.getValue();
                                        Object objM4514P13 = c1836h03.m4514P();
                                        if (objM4514P13 == c1823e2) {
                                            objM4514P13 = new C5109mf(interfaceC1809a119, 23);
                                            c1836h03.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9695w2("收藏延迟", "单位 ms", str12, (InterfaceC1231l) objM4514P13, c1836h03, 3126);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a18;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a120.getValue()).booleanValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5534zd(interfaceC1809a120, 28);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "插入系统消息", "在对应群聊插入可点击成员资料的改名消息", false, (InterfaceC1231l) objM4514P14, c1836h04, 25008, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a19;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a121.getValue()).booleanValue();
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a121, 29);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "发送改名提醒", "向选择的监听群发送文本或卡片", false, (InterfaceC1231l) objM4514P15, c1836h04, 25008, 8);
                                        if (((Boolean) interfaceC1809a120.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1626701074);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a110;
                                            String str13 = (String) interfaceC1809a122.getValue();
                                            List list = AbstractC4955ho.f17701p;
                                            Object objM4514P16 = c1836h04.m4514P();
                                            if (objM4514P16 == c1823e3) {
                                                objM4514P16 = new C5535ze(interfaceC1809a122, 0);
                                                c1836h04.m4545k0(objM4514P16);
                                            }
                                            AbstractC4955ho.m9571i4("系统消息模板", "wxid变量会生成可点击资料链接", str13, list, 3, (InterfaceC1231l) objM4514P16, c1836h04, 221238, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a111;
                                            String str14 = "全部群聊";
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a123.getValue(), "specific")) {
                                                str = "全部群聊";
                                                str14 = "指定群聊";
                                            } else {
                                                str = "全部群聊";
                                            }
                                            List listM101y0 = AbstractC0000a.m101y0(new C4825dq("all", str), new C4825dq("specific", "指定群聊"));
                                            String str15 = (String) interfaceC1809a123.getValue();
                                            Object objM4514P17 = c1836h04.m4514P();
                                            if (objM4514P17 == c1823e3) {
                                                objM4514P17 = new C5535ze(interfaceC1809a123, 1);
                                                c1836h04.m4545k0(objM4514P17);
                                            }
                                            AbstractC4955ho.m9353I2("适用群聊", str14, listM101y0, str15, (InterfaceC1231l) objM4514P17, false, c1836h04, 24582, 32);
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a123.getValue(), "specific")) {
                                                c1836h04.m4525a0(1627890606);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a112;
                                                String strM9574i7 = AbstractC4955ho.m9574i7((String) interfaceC1809a124.getValue());
                                                Object objM4514P18 = c1836h04.m4514P();
                                                if (objM4514P18 == c1823e3) {
                                                    objM4514P18 = new C0500x0(20, interfaceC1809a124, interfaceC1809a113);
                                                    c1836h04.m4545k0(objM4514P18);
                                                }
                                                AbstractC4955ho.m9503b("选择指定群聊", strM9574i7, (InterfaceC1220a) objM4514P18, c1836h04, 390);
                                                c1836h04.m4553p(false);
                                            } else {
                                                c1836h04.m4525a0(1628757428);
                                                c1836h04.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a114;
                                            String str16 = (String) interfaceC1809a125.getValue();
                                            Object objM4514P19 = c1836h04.m4514P();
                                            if (objM4514P19 == c1823e3) {
                                                objM4514P19 = new C5371ud(interfaceC1809a125, 28);
                                                c1836h04.m4545k0(objM4514P19);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P19;
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5535ze(interfaceC1809a125, 2);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9430S("wxid颜色", "系统消息里的 wxid 链接颜色", str16, false, interfaceC1220a, (InterfaceC1231l) objM4514P20, c1836h04, 224310, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1629255412);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a18;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C4980ih(interfaceC1809a126, 23);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "应用静默时段", "批量修改时段静默", false, (InterfaceC1231l) objM4514P21, c1836h05, 25008, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(-1356920365);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a19;
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a127.getValue()).booleanValue();
                                            Object objM4514P22 = c1836h05.m4514P();
                                            if (objM4514P22 == c1823e4) {
                                                objM4514P22 = new C4980ih(interfaceC1809a127, 24);
                                                c1836h05.m4545k0(objM4514P22);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue4, "开启时段静默", "指定时间内不弹通知", false, (InterfaceC1231l) objM4514P22, c1836h05, 25008, 8);
                                            if (((Boolean) interfaceC1809a127.getValue()).booleanValue()) {
                                                c1836h05.m4525a0(-1356757677);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a110;
                                                String str17 = (String) interfaceC1809a128.getValue();
                                                Object objM4514P23 = c1836h05.m4514P();
                                                if (objM4514P23 == c1823e4) {
                                                    objM4514P23 = new C4980ih(interfaceC1809a128, 25);
                                                    c1836h05.m4545k0(objM4514P23);
                                                }
                                                AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P23, c1836h05, "开始时间", str17, false);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a111;
                                                String str18 = (String) interfaceC1809a129.getValue();
                                                Object objM4514P24 = c1836h05.m4514P();
                                                if (objM4514P24 == c1823e4) {
                                                    objM4514P24 = new C4980ih(interfaceC1809a129, 26);
                                                    c1836h05.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P24, c1836h05, "结束时间", str18, false);
                                                c1836h05 = c1836h05;
                                                c1836h05.m4553p(false);
                                            } else {
                                                c1836h05.m4525a0(-1356489558);
                                                c1836h05.m4553p(false);
                                            }
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(-1356467734);
                                            c1836h05.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a130 = interfaceC1809a112;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a130.getValue()).booleanValue();
                                        Object objM4514P25 = c1836h05.m4514P();
                                        if (objM4514P25 == c1823e4) {
                                            objM4514P25 = new C4980ih(interfaceC1809a130, 27);
                                            c1836h05.m4545k0(objM4514P25);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "应用群聊 @ 规则", "只对群聊规则生效", false, (InterfaceC1231l) objM4514P25, c1836h05, 25008, 8);
                                        if (((Boolean) interfaceC1809a130.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(-1356295343);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a131 = interfaceC1809a113;
                                            boolean zBooleanValue6 = ((Boolean) interfaceC1809a131.getValue()).booleanValue();
                                            Object objM4514P26 = c1836h05.m4514P();
                                            if (objM4514P26 == c1823e4) {
                                                objM4514P26 = new C4980ih(interfaceC1809a131, 28);
                                                c1836h05.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue6, "屏蔽@所有人", "命中 @所有人 时不弹通知", false, (InterfaceC1231l) objM4514P26, c1836h05, 25008, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a114;
                                            boolean zBooleanValue7 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Object objM4514P27 = c1836h05.m4514P();
                                            if (objM4514P27 == c1823e4) {
                                                objM4514P27 = new C4980ih(interfaceC1809a132, 29);
                                                c1836h05.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue7, "屏蔽@我", "命中 @我 时不弹通知", false, (InterfaceC1231l) objM4514P27, c1836h05, 25008, 8);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(-1356025302);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
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
            case 2:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i13 = 0;
                    final InterfaceC1809a1 interfaceC1809a115 = this.f21043h;
                    final InterfaceC1809a1 interfaceC1809a116 = this.f21044i;
                    final InterfaceC1809a1 interfaceC1809a117 = this.f21045j;
                    final InterfaceC1809a1 interfaceC1809a118 = this.f21046k;
                    final InterfaceC1809a1 interfaceC1809a119 = this.f21047l;
                    final InterfaceC1809a1 interfaceC1809a120 = this.f21048m;
                    final InterfaceC1809a1 interfaceC1809a121 = this.f21049n;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(671045961, new InterfaceC1235p() { // from class: wb.td
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            String str;
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        String strM9484Y5 = AbstractC4955ho.m9484Y5((String) interfaceC1809a115.getValue());
                                        Object objM4514P = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a116;
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a182, 5);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("监听群与专属设置", strM9484Y5, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a117;
                                        String strM6836i = ((List) interfaceC1809a192.getValue()).isEmpty() ? "暂无模板，进入后添加批量配置" : AbstractC3199a.m6836i(((List) interfaceC1809a192.getValue()).size(), " 个模板，进入后修改或删除");
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4749bf(interfaceC1809a182, 6);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9444T5 = ((List) interfaceC1809a192.getValue()).isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5((List) interfaceC1809a118.getValue(), (List) interfaceC1809a192.getValue());
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a182, 7);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a119;
                                        String str2 = (String) interfaceC1809a1102.getValue();
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C5109mf(interfaceC1809a1102, 26);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9695w2("整体延迟", "单位秒，0-600", str2, (InterfaceC1231l) objM4514P4, c1836h02, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a120;
                                        String strM9476X5 = AbstractC4955ho.m9476X5((String) interfaceC1809a1112.getValue());
                                        List listM9468W5 = AbstractC4955ho.m9468W5();
                                        String str3 = (String) interfaceC1809a1112.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5109mf(interfaceC1809a1112, 27);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9353I2("提示类型", strM9476X5, listM9468W5, str3, (InterfaceC1231l) objM4514P5, false, c1836h02, 24582, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a1112.getValue(), "both")) {
                                            c1836h02.m4525a0(-1940785801);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a121;
                                            String str4 = AbstractC1416l.m3825a((String) interfaceC1809a1122.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                            List listM9452U5 = AbstractC4955ho.m9452U5();
                                            String str5 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P6 = c1836h02.m4514P();
                                            if (objM4514P6 == c1823e) {
                                                objM4514P6 = new C5109mf(interfaceC1809a1122, 28);
                                                c1836h02.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9353I2("文本+卡片顺序", str4, listM9452U5, str5, (InterfaceC1231l) objM4514P6, false, c1836h02, 24582, 32);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-1940261095);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a115;
                                        String str6 = (String) interfaceC1809a1132.getValue();
                                        Object objM4514P7 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P7 == c1823e2) {
                                            objM4514P7 = new C5109mf(interfaceC1809a1132, 17);
                                            c1836h03.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9695w2("提示延迟", "单位 ms", str6, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a116;
                                        String str7 = (String) interfaceC1809a1142.getValue();
                                        Object objM4514P8 = c1836h03.m4514P();
                                        if (objM4514P8 == c1823e2) {
                                            objM4514P8 = new C5109mf(interfaceC1809a1142, 18);
                                            c1836h03.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9695w2("图片延迟", "单位 ms", str7, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a117;
                                        String str8 = (String) interfaceC1809a1152.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C5109mf(interfaceC1809a1152, 19);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9695w2("语音延迟", "单位 ms", str8, (InterfaceC1231l) objM4514P9, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a118;
                                        String str9 = (String) interfaceC1809a1162.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5109mf(interfaceC1809a1162, 20);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9695w2("表情延迟", "单位 ms", str9, (InterfaceC1231l) objM4514P10, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a119;
                                        String str10 = (String) interfaceC1809a1172.getValue();
                                        Object objM4514P11 = c1836h03.m4514P();
                                        if (objM4514P11 == c1823e2) {
                                            objM4514P11 = new C5109mf(interfaceC1809a1172, 21);
                                            c1836h03.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9695w2("视频延迟", "单位 ms", str10, (InterfaceC1231l) objM4514P11, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a120;
                                        String str11 = (String) interfaceC1809a1182.getValue();
                                        Object objM4514P12 = c1836h03.m4514P();
                                        if (objM4514P12 == c1823e2) {
                                            objM4514P12 = new C5109mf(interfaceC1809a1182, 22);
                                            c1836h03.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9695w2("文件延迟", "单位 ms", str11, (InterfaceC1231l) objM4514P12, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a121;
                                        String str12 = (String) interfaceC1809a1192.getValue();
                                        Object objM4514P13 = c1836h03.m4514P();
                                        if (objM4514P13 == c1823e2) {
                                            objM4514P13 = new C5109mf(interfaceC1809a1192, 23);
                                            c1836h03.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9695w2("收藏延迟", "单位 ms", str12, (InterfaceC1231l) objM4514P13, c1836h03, 3126);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1202 = interfaceC1809a115;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a1202.getValue()).booleanValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5534zd(interfaceC1809a1202, 28);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "插入系统消息", "在对应群聊插入可点击成员资料的改名消息", false, (InterfaceC1231l) objM4514P14, c1836h04, 25008, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1212 = interfaceC1809a116;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a1212.getValue()).booleanValue();
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a1212, 29);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "发送改名提醒", "向选择的监听群发送文本或卡片", false, (InterfaceC1231l) objM4514P15, c1836h04, 25008, 8);
                                        if (((Boolean) interfaceC1809a1202.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1626701074);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a117;
                                            String str13 = (String) interfaceC1809a122.getValue();
                                            List list = AbstractC4955ho.f17701p;
                                            Object objM4514P16 = c1836h04.m4514P();
                                            if (objM4514P16 == c1823e3) {
                                                objM4514P16 = new C5535ze(interfaceC1809a122, 0);
                                                c1836h04.m4545k0(objM4514P16);
                                            }
                                            AbstractC4955ho.m9571i4("系统消息模板", "wxid变量会生成可点击资料链接", str13, list, 3, (InterfaceC1231l) objM4514P16, c1836h04, 221238, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a118;
                                            String str14 = "全部群聊";
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a123.getValue(), "specific")) {
                                                str = "全部群聊";
                                                str14 = "指定群聊";
                                            } else {
                                                str = "全部群聊";
                                            }
                                            List listM101y0 = AbstractC0000a.m101y0(new C4825dq("all", str), new C4825dq("specific", "指定群聊"));
                                            String str15 = (String) interfaceC1809a123.getValue();
                                            Object objM4514P17 = c1836h04.m4514P();
                                            if (objM4514P17 == c1823e3) {
                                                objM4514P17 = new C5535ze(interfaceC1809a123, 1);
                                                c1836h04.m4545k0(objM4514P17);
                                            }
                                            AbstractC4955ho.m9353I2("适用群聊", str14, listM101y0, str15, (InterfaceC1231l) objM4514P17, false, c1836h04, 24582, 32);
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a123.getValue(), "specific")) {
                                                c1836h04.m4525a0(1627890606);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a119;
                                                String strM9574i7 = AbstractC4955ho.m9574i7((String) interfaceC1809a124.getValue());
                                                Object objM4514P18 = c1836h04.m4514P();
                                                if (objM4514P18 == c1823e3) {
                                                    objM4514P18 = new C0500x0(20, interfaceC1809a124, interfaceC1809a120);
                                                    c1836h04.m4545k0(objM4514P18);
                                                }
                                                AbstractC4955ho.m9503b("选择指定群聊", strM9574i7, (InterfaceC1220a) objM4514P18, c1836h04, 390);
                                                c1836h04.m4553p(false);
                                            } else {
                                                c1836h04.m4525a0(1628757428);
                                                c1836h04.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a121;
                                            String str16 = (String) interfaceC1809a125.getValue();
                                            Object objM4514P19 = c1836h04.m4514P();
                                            if (objM4514P19 == c1823e3) {
                                                objM4514P19 = new C5371ud(interfaceC1809a125, 28);
                                                c1836h04.m4545k0(objM4514P19);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P19;
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5535ze(interfaceC1809a125, 2);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9430S("wxid颜色", "系统消息里的 wxid 链接颜色", str16, false, interfaceC1220a, (InterfaceC1231l) objM4514P20, c1836h04, 224310, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1629255412);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a115;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C4980ih(interfaceC1809a126, 23);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "应用静默时段", "批量修改时段静默", false, (InterfaceC1231l) objM4514P21, c1836h05, 25008, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(-1356920365);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a116;
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a127.getValue()).booleanValue();
                                            Object objM4514P22 = c1836h05.m4514P();
                                            if (objM4514P22 == c1823e4) {
                                                objM4514P22 = new C4980ih(interfaceC1809a127, 24);
                                                c1836h05.m4545k0(objM4514P22);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue4, "开启时段静默", "指定时间内不弹通知", false, (InterfaceC1231l) objM4514P22, c1836h05, 25008, 8);
                                            if (((Boolean) interfaceC1809a127.getValue()).booleanValue()) {
                                                c1836h05.m4525a0(-1356757677);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a117;
                                                String str17 = (String) interfaceC1809a128.getValue();
                                                Object objM4514P23 = c1836h05.m4514P();
                                                if (objM4514P23 == c1823e4) {
                                                    objM4514P23 = new C4980ih(interfaceC1809a128, 25);
                                                    c1836h05.m4545k0(objM4514P23);
                                                }
                                                AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P23, c1836h05, "开始时间", str17, false);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a118;
                                                String str18 = (String) interfaceC1809a129.getValue();
                                                Object objM4514P24 = c1836h05.m4514P();
                                                if (objM4514P24 == c1823e4) {
                                                    objM4514P24 = new C4980ih(interfaceC1809a129, 26);
                                                    c1836h05.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P24, c1836h05, "结束时间", str18, false);
                                                c1836h05 = c1836h05;
                                                c1836h05.m4553p(false);
                                            } else {
                                                c1836h05.m4525a0(-1356489558);
                                                c1836h05.m4553p(false);
                                            }
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(-1356467734);
                                            c1836h05.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a130 = interfaceC1809a119;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a130.getValue()).booleanValue();
                                        Object objM4514P25 = c1836h05.m4514P();
                                        if (objM4514P25 == c1823e4) {
                                            objM4514P25 = new C4980ih(interfaceC1809a130, 27);
                                            c1836h05.m4545k0(objM4514P25);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "应用群聊 @ 规则", "只对群聊规则生效", false, (InterfaceC1231l) objM4514P25, c1836h05, 25008, 8);
                                        if (((Boolean) interfaceC1809a130.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(-1356295343);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a131 = interfaceC1809a120;
                                            boolean zBooleanValue6 = ((Boolean) interfaceC1809a131.getValue()).booleanValue();
                                            Object objM4514P26 = c1836h05.m4514P();
                                            if (objM4514P26 == c1823e4) {
                                                objM4514P26 = new C4980ih(interfaceC1809a131, 28);
                                                c1836h05.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue6, "屏蔽@所有人", "命中 @所有人 时不弹通知", false, (InterfaceC1231l) objM4514P26, c1836h05, 25008, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a121;
                                            boolean zBooleanValue7 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Object objM4514P27 = c1836h05.m4514P();
                                            if (objM4514P27 == c1823e4) {
                                                objM4514P27 = new C4980ih(interfaceC1809a132, 29);
                                                c1836h05.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue7, "屏蔽@我", "命中 @我 时不弹通知", false, (InterfaceC1231l) objM4514P27, c1836h05, 25008, 8);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(-1356025302);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
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
                    final int i14 = 3;
                    final InterfaceC1809a1 interfaceC1809a122 = this.f21043h;
                    final InterfaceC1809a1 interfaceC1809a123 = this.f21044i;
                    final InterfaceC1809a1 interfaceC1809a124 = this.f21045j;
                    final InterfaceC1809a1 interfaceC1809a125 = this.f21046k;
                    final InterfaceC1809a1 interfaceC1809a126 = this.f21047l;
                    final InterfaceC1809a1 interfaceC1809a127 = this.f21048m;
                    final InterfaceC1809a1 interfaceC1809a128 = this.f21049n;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-572400296, new InterfaceC1235p() { // from class: wb.td
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            String str;
                            switch (i14) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        String strM9484Y5 = AbstractC4955ho.m9484Y5((String) interfaceC1809a122.getValue());
                                        Object objM4514P = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a123;
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a182, 5);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("监听群与专属设置", strM9484Y5, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a124;
                                        String strM6836i = ((List) interfaceC1809a192.getValue()).isEmpty() ? "暂无模板，进入后添加批量配置" : AbstractC3199a.m6836i(((List) interfaceC1809a192.getValue()).size(), " 个模板，进入后修改或删除");
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4749bf(interfaceC1809a182, 6);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9503b("提醒模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9444T5 = ((List) interfaceC1809a192.getValue()).isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9444T5((List) interfaceC1809a125.getValue(), (List) interfaceC1809a192.getValue());
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a182, 7);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", strM9444T5, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a126;
                                        String str2 = (String) interfaceC1809a1102.getValue();
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C5109mf(interfaceC1809a1102, 26);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9695w2("整体延迟", "单位秒，0-600", str2, (InterfaceC1231l) objM4514P4, c1836h02, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a127;
                                        String strM9476X5 = AbstractC4955ho.m9476X5((String) interfaceC1809a1112.getValue());
                                        List listM9468W5 = AbstractC4955ho.m9468W5();
                                        String str3 = (String) interfaceC1809a1112.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5109mf(interfaceC1809a1112, 27);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9353I2("提示类型", strM9476X5, listM9468W5, str3, (InterfaceC1231l) objM4514P5, false, c1836h02, 24582, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a1112.getValue(), "both")) {
                                            c1836h02.m4525a0(-1940785801);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a128;
                                            String str4 = AbstractC1416l.m3825a((String) interfaceC1809a1122.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                            List listM9452U5 = AbstractC4955ho.m9452U5();
                                            String str5 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P6 = c1836h02.m4514P();
                                            if (objM4514P6 == c1823e) {
                                                objM4514P6 = new C5109mf(interfaceC1809a1122, 28);
                                                c1836h02.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9353I2("文本+卡片顺序", str4, listM9452U5, str5, (InterfaceC1231l) objM4514P6, false, c1836h02, 24582, 32);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-1940261095);
                                            c1836h02.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a122;
                                        String str6 = (String) interfaceC1809a1132.getValue();
                                        Object objM4514P7 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P7 == c1823e2) {
                                            objM4514P7 = new C5109mf(interfaceC1809a1132, 17);
                                            c1836h03.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9695w2("提示延迟", "单位 ms", str6, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a123;
                                        String str7 = (String) interfaceC1809a1142.getValue();
                                        Object objM4514P8 = c1836h03.m4514P();
                                        if (objM4514P8 == c1823e2) {
                                            objM4514P8 = new C5109mf(interfaceC1809a1142, 18);
                                            c1836h03.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9695w2("图片延迟", "单位 ms", str7, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a124;
                                        String str8 = (String) interfaceC1809a1152.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C5109mf(interfaceC1809a1152, 19);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9695w2("语音延迟", "单位 ms", str8, (InterfaceC1231l) objM4514P9, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a125;
                                        String str9 = (String) interfaceC1809a1162.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5109mf(interfaceC1809a1162, 20);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9695w2("表情延迟", "单位 ms", str9, (InterfaceC1231l) objM4514P10, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a126;
                                        String str10 = (String) interfaceC1809a1172.getValue();
                                        Object objM4514P11 = c1836h03.m4514P();
                                        if (objM4514P11 == c1823e2) {
                                            objM4514P11 = new C5109mf(interfaceC1809a1172, 21);
                                            c1836h03.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9695w2("视频延迟", "单位 ms", str10, (InterfaceC1231l) objM4514P11, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a127;
                                        String str11 = (String) interfaceC1809a1182.getValue();
                                        Object objM4514P12 = c1836h03.m4514P();
                                        if (objM4514P12 == c1823e2) {
                                            objM4514P12 = new C5109mf(interfaceC1809a1182, 22);
                                            c1836h03.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9695w2("文件延迟", "单位 ms", str11, (InterfaceC1231l) objM4514P12, c1836h03, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a128;
                                        String str12 = (String) interfaceC1809a1192.getValue();
                                        Object objM4514P13 = c1836h03.m4514P();
                                        if (objM4514P13 == c1823e2) {
                                            objM4514P13 = new C5109mf(interfaceC1809a1192, 23);
                                            c1836h03.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9695w2("收藏延迟", "单位 ms", str12, (InterfaceC1231l) objM4514P13, c1836h03, 3126);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1202 = interfaceC1809a122;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a1202.getValue()).booleanValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5534zd(interfaceC1809a1202, 28);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "插入系统消息", "在对应群聊插入可点击成员资料的改名消息", false, (InterfaceC1231l) objM4514P14, c1836h04, 25008, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1212 = interfaceC1809a123;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a1212.getValue()).booleanValue();
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a1212, 29);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "发送改名提醒", "向选择的监听群发送文本或卡片", false, (InterfaceC1231l) objM4514P15, c1836h04, 25008, 8);
                                        if (((Boolean) interfaceC1809a1202.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1626701074);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1222 = interfaceC1809a124;
                                            String str13 = (String) interfaceC1809a1222.getValue();
                                            List list = AbstractC4955ho.f17701p;
                                            Object objM4514P16 = c1836h04.m4514P();
                                            if (objM4514P16 == c1823e3) {
                                                objM4514P16 = new C5535ze(interfaceC1809a1222, 0);
                                                c1836h04.m4545k0(objM4514P16);
                                            }
                                            AbstractC4955ho.m9571i4("系统消息模板", "wxid变量会生成可点击资料链接", str13, list, 3, (InterfaceC1231l) objM4514P16, c1836h04, 221238, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1232 = interfaceC1809a125;
                                            String str14 = "全部群聊";
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a1232.getValue(), "specific")) {
                                                str = "全部群聊";
                                                str14 = "指定群聊";
                                            } else {
                                                str = "全部群聊";
                                            }
                                            List listM101y0 = AbstractC0000a.m101y0(new C4825dq("all", str), new C4825dq("specific", "指定群聊"));
                                            String str15 = (String) interfaceC1809a1232.getValue();
                                            Object objM4514P17 = c1836h04.m4514P();
                                            if (objM4514P17 == c1823e3) {
                                                objM4514P17 = new C5535ze(interfaceC1809a1232, 1);
                                                c1836h04.m4545k0(objM4514P17);
                                            }
                                            AbstractC4955ho.m9353I2("适用群聊", str14, listM101y0, str15, (InterfaceC1231l) objM4514P17, false, c1836h04, 24582, 32);
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a1232.getValue(), "specific")) {
                                                c1836h04.m4525a0(1627890606);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a1242 = interfaceC1809a126;
                                                String strM9574i7 = AbstractC4955ho.m9574i7((String) interfaceC1809a1242.getValue());
                                                Object objM4514P18 = c1836h04.m4514P();
                                                if (objM4514P18 == c1823e3) {
                                                    objM4514P18 = new C0500x0(20, interfaceC1809a1242, interfaceC1809a127);
                                                    c1836h04.m4545k0(objM4514P18);
                                                }
                                                AbstractC4955ho.m9503b("选择指定群聊", strM9574i7, (InterfaceC1220a) objM4514P18, c1836h04, 390);
                                                c1836h04.m4553p(false);
                                            } else {
                                                c1836h04.m4525a0(1628757428);
                                                c1836h04.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1252 = interfaceC1809a128;
                                            String str16 = (String) interfaceC1809a1252.getValue();
                                            Object objM4514P19 = c1836h04.m4514P();
                                            if (objM4514P19 == c1823e3) {
                                                objM4514P19 = new C5371ud(interfaceC1809a1252, 28);
                                                c1836h04.m4545k0(objM4514P19);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P19;
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5535ze(interfaceC1809a1252, 2);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9430S("wxid颜色", "系统消息里的 wxid 链接颜色", str16, false, interfaceC1220a, (InterfaceC1231l) objM4514P20, c1836h04, 224310, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1629255412);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1262 = interfaceC1809a122;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1262.getValue()).booleanValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C4980ih(interfaceC1809a1262, 23);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "应用静默时段", "批量修改时段静默", false, (InterfaceC1231l) objM4514P21, c1836h05, 25008, 8);
                                        if (((Boolean) interfaceC1809a1262.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(-1356920365);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1272 = interfaceC1809a123;
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a1272.getValue()).booleanValue();
                                            Object objM4514P22 = c1836h05.m4514P();
                                            if (objM4514P22 == c1823e4) {
                                                objM4514P22 = new C4980ih(interfaceC1809a1272, 24);
                                                c1836h05.m4545k0(objM4514P22);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue4, "开启时段静默", "指定时间内不弹通知", false, (InterfaceC1231l) objM4514P22, c1836h05, 25008, 8);
                                            if (((Boolean) interfaceC1809a1272.getValue()).booleanValue()) {
                                                c1836h05.m4525a0(-1356757677);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a1282 = interfaceC1809a124;
                                                String str17 = (String) interfaceC1809a1282.getValue();
                                                Object objM4514P23 = c1836h05.m4514P();
                                                if (objM4514P23 == c1823e4) {
                                                    objM4514P23 = new C4980ih(interfaceC1809a1282, 25);
                                                    c1836h05.m4545k0(objM4514P23);
                                                }
                                                AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P23, c1836h05, "开始时间", str17, false);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a125;
                                                String str18 = (String) interfaceC1809a129.getValue();
                                                Object objM4514P24 = c1836h05.m4514P();
                                                if (objM4514P24 == c1823e4) {
                                                    objM4514P24 = new C4980ih(interfaceC1809a129, 26);
                                                    c1836h05.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P24, c1836h05, "结束时间", str18, false);
                                                c1836h05 = c1836h05;
                                                c1836h05.m4553p(false);
                                            } else {
                                                c1836h05.m4525a0(-1356489558);
                                                c1836h05.m4553p(false);
                                            }
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(-1356467734);
                                            c1836h05.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a130 = interfaceC1809a126;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a130.getValue()).booleanValue();
                                        Object objM4514P25 = c1836h05.m4514P();
                                        if (objM4514P25 == c1823e4) {
                                            objM4514P25 = new C4980ih(interfaceC1809a130, 27);
                                            c1836h05.m4545k0(objM4514P25);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "应用群聊 @ 规则", "只对群聊规则生效", false, (InterfaceC1231l) objM4514P25, c1836h05, 25008, 8);
                                        if (((Boolean) interfaceC1809a130.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(-1356295343);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a131 = interfaceC1809a127;
                                            boolean zBooleanValue6 = ((Boolean) interfaceC1809a131.getValue()).booleanValue();
                                            Object objM4514P26 = c1836h05.m4514P();
                                            if (objM4514P26 == c1823e4) {
                                                objM4514P26 = new C4980ih(interfaceC1809a131, 28);
                                                c1836h05.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue6, "屏蔽@所有人", "命中 @所有人 时不弹通知", false, (InterfaceC1231l) objM4514P26, c1836h05, 25008, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a128;
                                            boolean zBooleanValue7 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Object objM4514P27 = c1836h05.m4514P();
                                            if (objM4514P27 == c1823e4) {
                                                objM4514P27 = new C4980ih(interfaceC1809a132, 29);
                                                c1836h05.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue7, "屏蔽@我", "命中 @我 时不弹通知", false, (InterfaceC1231l) objM4514P27, c1836h05, 25008, 8);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(-1356025302);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
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
