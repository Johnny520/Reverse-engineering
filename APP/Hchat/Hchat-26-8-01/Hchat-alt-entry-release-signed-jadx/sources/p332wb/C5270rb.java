package p332wb;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import p000a.AbstractC0000a;
import p010aa.C0034b;
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
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.rb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5270rb implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20388g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f20389h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20390i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20391j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20392k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20393l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20394m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20395n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f20396o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5270rb(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, int i9) {
        this.f20388g = i9;
        this.f20389h = interfaceC1809a1;
        this.f20390i = interfaceC1809a12;
        this.f20391j = interfaceC1809a13;
        this.f20392k = interfaceC1809a14;
        this.f20393l = interfaceC1809a15;
        this.f20394m = interfaceC1809a16;
        this.f20395n = interfaceC1809a17;
        this.f20396o = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f20388g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 0;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f20389h;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f20390i;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f20391j;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f20392k;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f20393l;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f20394m;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f20395n;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f20396o;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1886810870, new InterfaceC1235p() { // from class: wb.zc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        C0034b c0034b = (C0034b) interfaceC1809a1.getValue();
                                        InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a12;
                                        String strM9635p5 = AbstractC4955ho.m9635p5(c0034b, (List) interfaceC1809a19.getValue());
                                        Object objM4514P = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a13;
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a110, 12);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9704x3("默认私聊规则", strM9635p5, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9635p52 = AbstractC4955ho.m9635p5((C0034b) interfaceC1809a14.getValue(), (List) interfaceC1809a19.getValue());
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4749bf(interfaceC1809a110, 13);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9704x3("默认群聊规则", strM9635p52, (InterfaceC1220a) objM4514P2, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9635p53 = AbstractC4955ho.m9635p5((C0034b) interfaceC1809a15.getValue(), (List) interfaceC1809a19.getValue());
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a110, 14);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9704x3("默认公众号规则", strM9635p53, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM6836i = ((List) interfaceC1809a19.getValue()).isEmpty() ? "暂无模板，进入后添加屏蔽规则" : AbstractC3199a.m6836i(((List) interfaceC1809a19.getValue()).size(), " 个模板，进入后添加或修改规则");
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4749bf(interfaceC1809a16, 15);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9704x3("模板管理", strM6836i, (InterfaceC1220a) objM4514P4, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a17;
                                        String strM6836i2 = ((List) interfaceC1809a111.getValue()).isEmpty() ? "暂无名单，进入后添加好友、群聊、公众号或群成员" : AbstractC3199a.m6836i(((List) interfaceC1809a111.getValue()).size(), " 个名单项，进入后分配模板");
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C4749bf(interfaceC1809a18, 16);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9704x3("名单管理", strM6836i2, (InterfaceC1220a) objM4514P5, c1836h02, 390);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a1;
                                        String str = AbstractC1416l.m3825a((String) interfaceC1809a112.getValue(), "custom") ? "单独设置" : "跟随全局";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("global", "跟随全局"), new C4825dq("custom", "单独设置"));
                                        String str2 = (String) interfaceC1809a112.getValue();
                                        boolean zM4534f = c1836h03.m4534f(interfaceC1809a112);
                                        Object objM4514P6 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4534f || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C5145ni(interfaceC1809a112, 24);
                                            c1836h03.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9353I2("精细延迟", str, listM101y0, str2, (InterfaceC1231l) objM4514P6, false, c1836h03, 6, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a112.getValue(), "custom")) {
                                            c1836h03.m4525a0(531624164);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a12;
                                            String str3 = (String) interfaceC1809a113.getValue();
                                            boolean zM4534f2 = c1836h03.m4534f(interfaceC1809a113);
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (zM4534f2 || objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5145ni(interfaceC1809a113, 25);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("提示延迟", "单位 ms", str3, (InterfaceC1231l) objM4514P7, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a13;
                                            String str4 = (String) interfaceC1809a114.getValue();
                                            boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a114);
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (zM4534f3 || objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5145ni(interfaceC1809a114, 26);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("图片延迟", "单位 ms", str4, (InterfaceC1231l) objM4514P8, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a14;
                                            String str5 = (String) interfaceC1809a115.getValue();
                                            boolean zM4534f4 = c1836h03.m4534f(interfaceC1809a115);
                                            Object objM4514P9 = c1836h03.m4514P();
                                            if (zM4534f4 || objM4514P9 == c1823e2) {
                                                objM4514P9 = new C5145ni(interfaceC1809a115, 27);
                                                c1836h03.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9695w2("语音延迟", "单位 ms", str5, (InterfaceC1231l) objM4514P9, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a15;
                                            String str6 = (String) interfaceC1809a116.getValue();
                                            boolean zM4534f5 = c1836h03.m4534f(interfaceC1809a116);
                                            Object objM4514P10 = c1836h03.m4514P();
                                            if (zM4534f5 || objM4514P10 == c1823e2) {
                                                objM4514P10 = new C5145ni(interfaceC1809a116, 28);
                                                c1836h03.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9695w2("表情延迟", "单位 ms", str6, (InterfaceC1231l) objM4514P10, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a16;
                                            String str7 = (String) interfaceC1809a117.getValue();
                                            boolean zM4534f6 = c1836h03.m4534f(interfaceC1809a117);
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (zM4534f6 || objM4514P11 == c1823e2) {
                                                objM4514P11 = new C5145ni(interfaceC1809a117, 29);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9695w2("视频延迟", "单位 ms", str7, (InterfaceC1231l) objM4514P11, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a17;
                                            String str8 = (String) interfaceC1809a118.getValue();
                                            boolean zM4534f7 = c1836h03.m4534f(interfaceC1809a118);
                                            Object objM4514P12 = c1836h03.m4514P();
                                            if (zM4534f7 || objM4514P12 == c1823e2) {
                                                objM4514P12 = new C5343ti(interfaceC1809a118, 0);
                                                c1836h03.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9695w2("文件延迟", "单位 ms", str8, (InterfaceC1231l) objM4514P12, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a18;
                                            String str9 = (String) interfaceC1809a119.getValue();
                                            boolean zM4534f8 = c1836h03.m4534f(interfaceC1809a119);
                                            Object objM4514P13 = c1836h03.m4514P();
                                            if (zM4534f8 || objM4514P13 == c1823e2) {
                                                objM4514P13 = new C5343ti(interfaceC1809a119, 1);
                                                c1836h03.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9695w2("收藏延迟", "单位 ms", str9, (InterfaceC1231l) objM4514P13, c1836h03, 54);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(532564022);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a1;
                                        String strM9436S5 = AbstractC4955ho.m9436S5((String) interfaceC1809a120.getValue());
                                        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(AbstractC0000a.m99x0(new C4825dq("global", "跟随全局")), AbstractC4955ho.m9428R5());
                                        String str10 = (String) interfaceC1809a120.getValue();
                                        boolean zM4534f9 = c1836h04.m4534f(interfaceC1809a120);
                                        Object objM4514P14 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4534f9 || objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5343ti(interfaceC1809a120, 19);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9353I2("提示设置", strM9436S5, arrayListM8397F1, str10, (InterfaceC1231l) objM4514P14, false, c1836h04, 6, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a120.getValue(), "global")) {
                                            c1836h04.m4525a0(329146458);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(327507953);
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a120.getValue(), "both")) {
                                                c1836h04.m4525a0(327556840);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a12;
                                                String str11 = AbstractC1416l.m3825a((String) interfaceC1809a121.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                                List listM9332F5 = AbstractC4955ho.m9332F5();
                                                String str12 = (String) interfaceC1809a121.getValue();
                                                boolean zM4534f10 = c1836h04.m4534f(interfaceC1809a121);
                                                Object objM4514P15 = c1836h04.m4514P();
                                                if (zM4534f10 || objM4514P15 == c1823e3) {
                                                    objM4514P15 = new C5343ti(interfaceC1809a121, 20);
                                                    c1836h04.m4545k0(objM4514P15);
                                                }
                                                AbstractC4955ho.m9353I2("文本+卡片顺序", str11, listM9332F5, str12, (InterfaceC1231l) objM4514P15, false, c1836h04, 6, 32);
                                                c1836h04.m4553p(false);
                                            } else {
                                                c1836h04.m4525a0(328035418);
                                                c1836h04.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a13;
                                            String str13 = (String) interfaceC1809a122.getValue();
                                            List list = AbstractC4955ho.f17699n;
                                            boolean zM4534f11 = c1836h04.m4534f(interfaceC1809a122);
                                            Object objM4514P16 = c1836h04.m4514P();
                                            if (zM4534f11 || objM4514P16 == c1823e3) {
                                                objM4514P16 = new C5343ti(interfaceC1809a122, 21);
                                                c1836h04.m4545k0(objM4514P16);
                                            }
                                            AbstractC4955ho.m9571i4("进群文本", "多个模板用 || 分隔随机选择", str13, list, 4, (InterfaceC1231l) objM4514P16, c1836h04, 24630, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a14;
                                            String str14 = (String) interfaceC1809a123.getValue();
                                            boolean zM4534f12 = c1836h04.m4534f(interfaceC1809a123);
                                            Object objM4514P17 = c1836h04.m4514P();
                                            if (zM4534f12 || objM4514P17 == c1823e3) {
                                                objM4514P17 = new C5343ti(interfaceC1809a123, 22);
                                                c1836h04.m4545k0(objM4514P17);
                                            }
                                            AbstractC4955ho.m9571i4("退群文本", "多个模板用 || 分隔随机选择", str14, list, 4, (InterfaceC1231l) objM4514P17, c1836h04, 24630, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a15;
                                            String str15 = (String) interfaceC1809a124.getValue();
                                            boolean zM4534f13 = c1836h04.m4534f(interfaceC1809a124);
                                            Object objM4514P18 = c1836h04.m4514P();
                                            if (zM4534f13 || objM4514P18 == c1823e3) {
                                                objM4514P18 = new C5343ti(interfaceC1809a124, 23);
                                                c1836h04.m4545k0(objM4514P18);
                                            }
                                            AbstractC4955ho.m9571i4("进群卡片标题", "支持变量", str15, list, 0, (InterfaceC1231l) objM4514P18, c1836h04, 54, 16);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a16;
                                            String str16 = (String) interfaceC1809a125.getValue();
                                            boolean zM4534f14 = c1836h04.m4534f(interfaceC1809a125);
                                            Object objM4514P19 = c1836h04.m4514P();
                                            if (zM4534f14 || objM4514P19 == c1823e3) {
                                                objM4514P19 = new C5343ti(interfaceC1809a125, 24);
                                                c1836h04.m4545k0(objM4514P19);
                                            }
                                            AbstractC4955ho.m9571i4("进群卡片描述", "支持变量", str16, list, 3, (InterfaceC1231l) objM4514P19, c1836h04, 24630, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a17;
                                            String str17 = (String) interfaceC1809a126.getValue();
                                            boolean zM4534f15 = c1836h04.m4534f(interfaceC1809a126);
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (zM4534f15 || objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5343ti(interfaceC1809a126, 25);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9571i4("退群卡片标题", "支持变量", str17, list, 0, (InterfaceC1231l) objM4514P20, c1836h04, 54, 16);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a18;
                                            String str18 = (String) interfaceC1809a127.getValue();
                                            boolean zM4534f16 = c1836h04.m4534f(interfaceC1809a127);
                                            Object objM4514P21 = c1836h04.m4514P();
                                            if (zM4534f16 || objM4514P21 == c1823e3) {
                                                objM4514P21 = new C5343ti(interfaceC1809a127, 26);
                                                c1836h04.m4545k0(objM4514P21);
                                            }
                                            AbstractC4955ho.m9571i4("退群卡片描述", "支持变量", str18, list, 3, (InterfaceC1231l) objM4514P21, c1836h04, 24630, 0);
                                            c1836h04.m4553p(false);
                                        }
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
                    final int i12 = 2;
                    final InterfaceC1809a1 interfaceC1809a19 = this.f20389h;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f20390i;
                    final InterfaceC1809a1 interfaceC1809a111 = this.f20391j;
                    final InterfaceC1809a1 interfaceC1809a112 = this.f20392k;
                    final InterfaceC1809a1 interfaceC1809a113 = this.f20393l;
                    final InterfaceC1809a1 interfaceC1809a114 = this.f20394m;
                    final InterfaceC1809a1 interfaceC1809a115 = this.f20395n;
                    final InterfaceC1809a1 interfaceC1809a116 = this.f20396o;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-80003352, new InterfaceC1235p() { // from class: wb.zc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        C0034b c0034b = (C0034b) interfaceC1809a19.getValue();
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a110;
                                        String strM9635p5 = AbstractC4955ho.m9635p5(c0034b, (List) interfaceC1809a192.getValue());
                                        Object objM4514P = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a111;
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a1102, 12);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9704x3("默认私聊规则", strM9635p5, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9635p52 = AbstractC4955ho.m9635p5((C0034b) interfaceC1809a112.getValue(), (List) interfaceC1809a192.getValue());
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4749bf(interfaceC1809a1102, 13);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9704x3("默认群聊规则", strM9635p52, (InterfaceC1220a) objM4514P2, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9635p53 = AbstractC4955ho.m9635p5((C0034b) interfaceC1809a113.getValue(), (List) interfaceC1809a192.getValue());
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a1102, 14);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9704x3("默认公众号规则", strM9635p53, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM6836i = ((List) interfaceC1809a192.getValue()).isEmpty() ? "暂无模板，进入后添加屏蔽规则" : AbstractC3199a.m6836i(((List) interfaceC1809a192.getValue()).size(), " 个模板，进入后添加或修改规则");
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4749bf(interfaceC1809a114, 15);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9704x3("模板管理", strM6836i, (InterfaceC1220a) objM4514P4, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a115;
                                        String strM6836i2 = ((List) interfaceC1809a1112.getValue()).isEmpty() ? "暂无名单，进入后添加好友、群聊、公众号或群成员" : AbstractC3199a.m6836i(((List) interfaceC1809a1112.getValue()).size(), " 个名单项，进入后分配模板");
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C4749bf(interfaceC1809a116, 16);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9704x3("名单管理", strM6836i2, (InterfaceC1220a) objM4514P5, c1836h02, 390);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a19;
                                        String str = AbstractC1416l.m3825a((String) interfaceC1809a1122.getValue(), "custom") ? "单独设置" : "跟随全局";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("global", "跟随全局"), new C4825dq("custom", "单独设置"));
                                        String str2 = (String) interfaceC1809a1122.getValue();
                                        boolean zM4534f = c1836h03.m4534f(interfaceC1809a1122);
                                        Object objM4514P6 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4534f || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C5145ni(interfaceC1809a1122, 24);
                                            c1836h03.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9353I2("精细延迟", str, listM101y0, str2, (InterfaceC1231l) objM4514P6, false, c1836h03, 6, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a1122.getValue(), "custom")) {
                                            c1836h03.m4525a0(531624164);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a110;
                                            String str3 = (String) interfaceC1809a1132.getValue();
                                            boolean zM4534f2 = c1836h03.m4534f(interfaceC1809a1132);
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (zM4534f2 || objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5145ni(interfaceC1809a1132, 25);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("提示延迟", "单位 ms", str3, (InterfaceC1231l) objM4514P7, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a111;
                                            String str4 = (String) interfaceC1809a1142.getValue();
                                            boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a1142);
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (zM4534f3 || objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5145ni(interfaceC1809a1142, 26);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("图片延迟", "单位 ms", str4, (InterfaceC1231l) objM4514P8, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a112;
                                            String str5 = (String) interfaceC1809a1152.getValue();
                                            boolean zM4534f4 = c1836h03.m4534f(interfaceC1809a1152);
                                            Object objM4514P9 = c1836h03.m4514P();
                                            if (zM4534f4 || objM4514P9 == c1823e2) {
                                                objM4514P9 = new C5145ni(interfaceC1809a1152, 27);
                                                c1836h03.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9695w2("语音延迟", "单位 ms", str5, (InterfaceC1231l) objM4514P9, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a113;
                                            String str6 = (String) interfaceC1809a1162.getValue();
                                            boolean zM4534f5 = c1836h03.m4534f(interfaceC1809a1162);
                                            Object objM4514P10 = c1836h03.m4514P();
                                            if (zM4534f5 || objM4514P10 == c1823e2) {
                                                objM4514P10 = new C5145ni(interfaceC1809a1162, 28);
                                                c1836h03.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9695w2("表情延迟", "单位 ms", str6, (InterfaceC1231l) objM4514P10, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a114;
                                            String str7 = (String) interfaceC1809a117.getValue();
                                            boolean zM4534f6 = c1836h03.m4534f(interfaceC1809a117);
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (zM4534f6 || objM4514P11 == c1823e2) {
                                                objM4514P11 = new C5145ni(interfaceC1809a117, 29);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9695w2("视频延迟", "单位 ms", str7, (InterfaceC1231l) objM4514P11, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a115;
                                            String str8 = (String) interfaceC1809a118.getValue();
                                            boolean zM4534f7 = c1836h03.m4534f(interfaceC1809a118);
                                            Object objM4514P12 = c1836h03.m4514P();
                                            if (zM4534f7 || objM4514P12 == c1823e2) {
                                                objM4514P12 = new C5343ti(interfaceC1809a118, 0);
                                                c1836h03.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9695w2("文件延迟", "单位 ms", str8, (InterfaceC1231l) objM4514P12, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a116;
                                            String str9 = (String) interfaceC1809a119.getValue();
                                            boolean zM4534f8 = c1836h03.m4534f(interfaceC1809a119);
                                            Object objM4514P13 = c1836h03.m4514P();
                                            if (zM4534f8 || objM4514P13 == c1823e2) {
                                                objM4514P13 = new C5343ti(interfaceC1809a119, 1);
                                                c1836h03.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9695w2("收藏延迟", "单位 ms", str9, (InterfaceC1231l) objM4514P13, c1836h03, 54);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(532564022);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a19;
                                        String strM9436S5 = AbstractC4955ho.m9436S5((String) interfaceC1809a120.getValue());
                                        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(AbstractC0000a.m99x0(new C4825dq("global", "跟随全局")), AbstractC4955ho.m9428R5());
                                        String str10 = (String) interfaceC1809a120.getValue();
                                        boolean zM4534f9 = c1836h04.m4534f(interfaceC1809a120);
                                        Object objM4514P14 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4534f9 || objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5343ti(interfaceC1809a120, 19);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9353I2("提示设置", strM9436S5, arrayListM8397F1, str10, (InterfaceC1231l) objM4514P14, false, c1836h04, 6, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a120.getValue(), "global")) {
                                            c1836h04.m4525a0(329146458);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(327507953);
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a120.getValue(), "both")) {
                                                c1836h04.m4525a0(327556840);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a110;
                                                String str11 = AbstractC1416l.m3825a((String) interfaceC1809a121.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                                List listM9332F5 = AbstractC4955ho.m9332F5();
                                                String str12 = (String) interfaceC1809a121.getValue();
                                                boolean zM4534f10 = c1836h04.m4534f(interfaceC1809a121);
                                                Object objM4514P15 = c1836h04.m4514P();
                                                if (zM4534f10 || objM4514P15 == c1823e3) {
                                                    objM4514P15 = new C5343ti(interfaceC1809a121, 20);
                                                    c1836h04.m4545k0(objM4514P15);
                                                }
                                                AbstractC4955ho.m9353I2("文本+卡片顺序", str11, listM9332F5, str12, (InterfaceC1231l) objM4514P15, false, c1836h04, 6, 32);
                                                c1836h04.m4553p(false);
                                            } else {
                                                c1836h04.m4525a0(328035418);
                                                c1836h04.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a111;
                                            String str13 = (String) interfaceC1809a122.getValue();
                                            List list = AbstractC4955ho.f17699n;
                                            boolean zM4534f11 = c1836h04.m4534f(interfaceC1809a122);
                                            Object objM4514P16 = c1836h04.m4514P();
                                            if (zM4534f11 || objM4514P16 == c1823e3) {
                                                objM4514P16 = new C5343ti(interfaceC1809a122, 21);
                                                c1836h04.m4545k0(objM4514P16);
                                            }
                                            AbstractC4955ho.m9571i4("进群文本", "多个模板用 || 分隔随机选择", str13, list, 4, (InterfaceC1231l) objM4514P16, c1836h04, 24630, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a112;
                                            String str14 = (String) interfaceC1809a123.getValue();
                                            boolean zM4534f12 = c1836h04.m4534f(interfaceC1809a123);
                                            Object objM4514P17 = c1836h04.m4514P();
                                            if (zM4534f12 || objM4514P17 == c1823e3) {
                                                objM4514P17 = new C5343ti(interfaceC1809a123, 22);
                                                c1836h04.m4545k0(objM4514P17);
                                            }
                                            AbstractC4955ho.m9571i4("退群文本", "多个模板用 || 分隔随机选择", str14, list, 4, (InterfaceC1231l) objM4514P17, c1836h04, 24630, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a113;
                                            String str15 = (String) interfaceC1809a124.getValue();
                                            boolean zM4534f13 = c1836h04.m4534f(interfaceC1809a124);
                                            Object objM4514P18 = c1836h04.m4514P();
                                            if (zM4534f13 || objM4514P18 == c1823e3) {
                                                objM4514P18 = new C5343ti(interfaceC1809a124, 23);
                                                c1836h04.m4545k0(objM4514P18);
                                            }
                                            AbstractC4955ho.m9571i4("进群卡片标题", "支持变量", str15, list, 0, (InterfaceC1231l) objM4514P18, c1836h04, 54, 16);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a114;
                                            String str16 = (String) interfaceC1809a125.getValue();
                                            boolean zM4534f14 = c1836h04.m4534f(interfaceC1809a125);
                                            Object objM4514P19 = c1836h04.m4514P();
                                            if (zM4534f14 || objM4514P19 == c1823e3) {
                                                objM4514P19 = new C5343ti(interfaceC1809a125, 24);
                                                c1836h04.m4545k0(objM4514P19);
                                            }
                                            AbstractC4955ho.m9571i4("进群卡片描述", "支持变量", str16, list, 3, (InterfaceC1231l) objM4514P19, c1836h04, 24630, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a115;
                                            String str17 = (String) interfaceC1809a126.getValue();
                                            boolean zM4534f15 = c1836h04.m4534f(interfaceC1809a126);
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (zM4534f15 || objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5343ti(interfaceC1809a126, 25);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9571i4("退群卡片标题", "支持变量", str17, list, 0, (InterfaceC1231l) objM4514P20, c1836h04, 54, 16);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a116;
                                            String str18 = (String) interfaceC1809a127.getValue();
                                            boolean zM4534f16 = c1836h04.m4534f(interfaceC1809a127);
                                            Object objM4514P21 = c1836h04.m4514P();
                                            if (zM4534f16 || objM4514P21 == c1823e3) {
                                                objM4514P21 = new C5343ti(interfaceC1809a127, 26);
                                                c1836h04.m4545k0(objM4514P21);
                                            }
                                            AbstractC4955ho.m9571i4("退群卡片描述", "支持变量", str18, list, 3, (InterfaceC1231l) objM4514P21, c1836h04, 24630, 0);
                                            c1836h04.m4553p(false);
                                        }
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
                    final int i13 = 1;
                    final InterfaceC1809a1 interfaceC1809a117 = this.f20389h;
                    final InterfaceC1809a1 interfaceC1809a118 = this.f20390i;
                    final InterfaceC1809a1 interfaceC1809a119 = this.f20391j;
                    final InterfaceC1809a1 interfaceC1809a120 = this.f20392k;
                    final InterfaceC1809a1 interfaceC1809a121 = this.f20393l;
                    final InterfaceC1809a1 interfaceC1809a122 = this.f20394m;
                    final InterfaceC1809a1 interfaceC1809a123 = this.f20395n;
                    final InterfaceC1809a1 interfaceC1809a124 = this.f20396o;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(2032958444, new InterfaceC1235p() { // from class: wb.zc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        C0034b c0034b = (C0034b) interfaceC1809a117.getValue();
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a118;
                                        String strM9635p5 = AbstractC4955ho.m9635p5(c0034b, (List) interfaceC1809a192.getValue());
                                        Object objM4514P = c1836h02.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a119;
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4749bf(interfaceC1809a1102, 12);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9704x3("默认私聊规则", strM9635p5, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9635p52 = AbstractC4955ho.m9635p5((C0034b) interfaceC1809a120.getValue(), (List) interfaceC1809a192.getValue());
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4749bf(interfaceC1809a1102, 13);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9704x3("默认群聊规则", strM9635p52, (InterfaceC1220a) objM4514P2, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9635p53 = AbstractC4955ho.m9635p5((C0034b) interfaceC1809a121.getValue(), (List) interfaceC1809a192.getValue());
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C4749bf(interfaceC1809a1102, 14);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9704x3("默认公众号规则", strM9635p53, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM6836i = ((List) interfaceC1809a192.getValue()).isEmpty() ? "暂无模板，进入后添加屏蔽规则" : AbstractC3199a.m6836i(((List) interfaceC1809a192.getValue()).size(), " 个模板，进入后添加或修改规则");
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4749bf(interfaceC1809a122, 15);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9704x3("模板管理", strM6836i, (InterfaceC1220a) objM4514P4, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a123;
                                        String strM6836i2 = ((List) interfaceC1809a1112.getValue()).isEmpty() ? "暂无名单，进入后添加好友、群聊、公众号或群成员" : AbstractC3199a.m6836i(((List) interfaceC1809a1112.getValue()).size(), " 个名单项，进入后分配模板");
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C4749bf(interfaceC1809a124, 16);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9704x3("名单管理", strM6836i2, (InterfaceC1220a) objM4514P5, c1836h02, 390);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a117;
                                        String str = AbstractC1416l.m3825a((String) interfaceC1809a1122.getValue(), "custom") ? "单独设置" : "跟随全局";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("global", "跟随全局"), new C4825dq("custom", "单独设置"));
                                        String str2 = (String) interfaceC1809a1122.getValue();
                                        boolean zM4534f = c1836h03.m4534f(interfaceC1809a1122);
                                        Object objM4514P6 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4534f || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C5145ni(interfaceC1809a1122, 24);
                                            c1836h03.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9353I2("精细延迟", str, listM101y0, str2, (InterfaceC1231l) objM4514P6, false, c1836h03, 6, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a1122.getValue(), "custom")) {
                                            c1836h03.m4525a0(531624164);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a118;
                                            String str3 = (String) interfaceC1809a1132.getValue();
                                            boolean zM4534f2 = c1836h03.m4534f(interfaceC1809a1132);
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (zM4534f2 || objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5145ni(interfaceC1809a1132, 25);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("提示延迟", "单位 ms", str3, (InterfaceC1231l) objM4514P7, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a119;
                                            String str4 = (String) interfaceC1809a1142.getValue();
                                            boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a1142);
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (zM4534f3 || objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5145ni(interfaceC1809a1142, 26);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("图片延迟", "单位 ms", str4, (InterfaceC1231l) objM4514P8, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a120;
                                            String str5 = (String) interfaceC1809a1152.getValue();
                                            boolean zM4534f4 = c1836h03.m4534f(interfaceC1809a1152);
                                            Object objM4514P9 = c1836h03.m4514P();
                                            if (zM4534f4 || objM4514P9 == c1823e2) {
                                                objM4514P9 = new C5145ni(interfaceC1809a1152, 27);
                                                c1836h03.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9695w2("语音延迟", "单位 ms", str5, (InterfaceC1231l) objM4514P9, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a121;
                                            String str6 = (String) interfaceC1809a1162.getValue();
                                            boolean zM4534f5 = c1836h03.m4534f(interfaceC1809a1162);
                                            Object objM4514P10 = c1836h03.m4514P();
                                            if (zM4534f5 || objM4514P10 == c1823e2) {
                                                objM4514P10 = new C5145ni(interfaceC1809a1162, 28);
                                                c1836h03.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9695w2("表情延迟", "单位 ms", str6, (InterfaceC1231l) objM4514P10, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a122;
                                            String str7 = (String) interfaceC1809a1172.getValue();
                                            boolean zM4534f6 = c1836h03.m4534f(interfaceC1809a1172);
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (zM4534f6 || objM4514P11 == c1823e2) {
                                                objM4514P11 = new C5145ni(interfaceC1809a1172, 29);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9695w2("视频延迟", "单位 ms", str7, (InterfaceC1231l) objM4514P11, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a123;
                                            String str8 = (String) interfaceC1809a1182.getValue();
                                            boolean zM4534f7 = c1836h03.m4534f(interfaceC1809a1182);
                                            Object objM4514P12 = c1836h03.m4514P();
                                            if (zM4534f7 || objM4514P12 == c1823e2) {
                                                objM4514P12 = new C5343ti(interfaceC1809a1182, 0);
                                                c1836h03.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9695w2("文件延迟", "单位 ms", str8, (InterfaceC1231l) objM4514P12, c1836h03, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a124;
                                            String str9 = (String) interfaceC1809a1192.getValue();
                                            boolean zM4534f8 = c1836h03.m4534f(interfaceC1809a1192);
                                            Object objM4514P13 = c1836h03.m4514P();
                                            if (zM4534f8 || objM4514P13 == c1823e2) {
                                                objM4514P13 = new C5343ti(interfaceC1809a1192, 1);
                                                c1836h03.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9695w2("收藏延迟", "单位 ms", str9, (InterfaceC1231l) objM4514P13, c1836h03, 54);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(532564022);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1202 = interfaceC1809a117;
                                        String strM9436S5 = AbstractC4955ho.m9436S5((String) interfaceC1809a1202.getValue());
                                        ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(AbstractC0000a.m99x0(new C4825dq("global", "跟随全局")), AbstractC4955ho.m9428R5());
                                        String str10 = (String) interfaceC1809a1202.getValue();
                                        boolean zM4534f9 = c1836h04.m4534f(interfaceC1809a1202);
                                        Object objM4514P14 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4534f9 || objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5343ti(interfaceC1809a1202, 19);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9353I2("提示设置", strM9436S5, arrayListM8397F1, str10, (InterfaceC1231l) objM4514P14, false, c1836h04, 6, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a1202.getValue(), "global")) {
                                            c1836h04.m4525a0(329146458);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(327507953);
                                            if (AbstractC1416l.m3825a((String) interfaceC1809a1202.getValue(), "both")) {
                                                c1836h04.m4525a0(327556840);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a1212 = interfaceC1809a118;
                                                String str11 = AbstractC1416l.m3825a((String) interfaceC1809a1212.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                                List listM9332F5 = AbstractC4955ho.m9332F5();
                                                String str12 = (String) interfaceC1809a1212.getValue();
                                                boolean zM4534f10 = c1836h04.m4534f(interfaceC1809a1212);
                                                Object objM4514P15 = c1836h04.m4514P();
                                                if (zM4534f10 || objM4514P15 == c1823e3) {
                                                    objM4514P15 = new C5343ti(interfaceC1809a1212, 20);
                                                    c1836h04.m4545k0(objM4514P15);
                                                }
                                                AbstractC4955ho.m9353I2("文本+卡片顺序", str11, listM9332F5, str12, (InterfaceC1231l) objM4514P15, false, c1836h04, 6, 32);
                                                c1836h04.m4553p(false);
                                            } else {
                                                c1836h04.m4525a0(328035418);
                                                c1836h04.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1222 = interfaceC1809a119;
                                            String str13 = (String) interfaceC1809a1222.getValue();
                                            List list = AbstractC4955ho.f17699n;
                                            boolean zM4534f11 = c1836h04.m4534f(interfaceC1809a1222);
                                            Object objM4514P16 = c1836h04.m4514P();
                                            if (zM4534f11 || objM4514P16 == c1823e3) {
                                                objM4514P16 = new C5343ti(interfaceC1809a1222, 21);
                                                c1836h04.m4545k0(objM4514P16);
                                            }
                                            AbstractC4955ho.m9571i4("进群文本", "多个模板用 || 分隔随机选择", str13, list, 4, (InterfaceC1231l) objM4514P16, c1836h04, 24630, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1232 = interfaceC1809a120;
                                            String str14 = (String) interfaceC1809a1232.getValue();
                                            boolean zM4534f12 = c1836h04.m4534f(interfaceC1809a1232);
                                            Object objM4514P17 = c1836h04.m4514P();
                                            if (zM4534f12 || objM4514P17 == c1823e3) {
                                                objM4514P17 = new C5343ti(interfaceC1809a1232, 22);
                                                c1836h04.m4545k0(objM4514P17);
                                            }
                                            AbstractC4955ho.m9571i4("退群文本", "多个模板用 || 分隔随机选择", str14, list, 4, (InterfaceC1231l) objM4514P17, c1836h04, 24630, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1242 = interfaceC1809a121;
                                            String str15 = (String) interfaceC1809a1242.getValue();
                                            boolean zM4534f13 = c1836h04.m4534f(interfaceC1809a1242);
                                            Object objM4514P18 = c1836h04.m4514P();
                                            if (zM4534f13 || objM4514P18 == c1823e3) {
                                                objM4514P18 = new C5343ti(interfaceC1809a1242, 23);
                                                c1836h04.m4545k0(objM4514P18);
                                            }
                                            AbstractC4955ho.m9571i4("进群卡片标题", "支持变量", str15, list, 0, (InterfaceC1231l) objM4514P18, c1836h04, 54, 16);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a122;
                                            String str16 = (String) interfaceC1809a125.getValue();
                                            boolean zM4534f14 = c1836h04.m4534f(interfaceC1809a125);
                                            Object objM4514P19 = c1836h04.m4514P();
                                            if (zM4534f14 || objM4514P19 == c1823e3) {
                                                objM4514P19 = new C5343ti(interfaceC1809a125, 24);
                                                c1836h04.m4545k0(objM4514P19);
                                            }
                                            AbstractC4955ho.m9571i4("进群卡片描述", "支持变量", str16, list, 3, (InterfaceC1231l) objM4514P19, c1836h04, 24630, 0);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a123;
                                            String str17 = (String) interfaceC1809a126.getValue();
                                            boolean zM4534f15 = c1836h04.m4534f(interfaceC1809a126);
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (zM4534f15 || objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5343ti(interfaceC1809a126, 25);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9571i4("退群卡片标题", "支持变量", str17, list, 0, (InterfaceC1231l) objM4514P20, c1836h04, 54, 16);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a124;
                                            String str18 = (String) interfaceC1809a127.getValue();
                                            boolean zM4534f16 = c1836h04.m4534f(interfaceC1809a127);
                                            Object objM4514P21 = c1836h04.m4514P();
                                            if (zM4534f16 || objM4514P21 == c1823e3) {
                                                objM4514P21 = new C5343ti(interfaceC1809a127, 26);
                                                c1836h04.m4545k0(objM4514P21);
                                            }
                                            AbstractC4955ho.m9571i4("退群卡片描述", "支持变量", str18, list, 3, (InterfaceC1231l) objM4514P21, c1836h04, 24630, 0);
                                            c1836h04.m4553p(false);
                                        }
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
