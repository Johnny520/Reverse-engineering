package p332wb;

import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import p000a.AbstractC0000a;
import p036c9.C0500x0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3958e;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.md */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5107md implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18910g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f18911h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18912i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18913j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18914k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f18915l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18916m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f18917n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f18918o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f18919p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5107md(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a18) {
        this.f18910g = 2;
        this.f18912i = interfaceC1809a1;
        this.f18913j = interfaceC1809a12;
        this.f18914k = interfaceC1809a13;
        this.f18915l = interfaceC1809a14;
        this.f18916m = interfaceC1809a15;
        this.f18917n = interfaceC1809a16;
        this.f18918o = interfaceC1809a17;
        this.f18911h = sharedPreferences;
        this.f18919p = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1809a1 interfaceC1809a1;
        switch (this.f18910g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a12 = this.f18912i;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a12.getValue()).booleanValue();
                    SharedPreferences sharedPreferences = this.f18911h;
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4538h || objM4514P == c1823e) {
                        objM4514P = new C5108me(sharedPreferences, interfaceC1809a12, 13);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "退群系统消息", "保留现有退群监控逻辑，检测到成员退出后插入可点击资料页的系统消息", false, (InterfaceC1231l) objM4514P, c1836h0, 432, 8);
                    if (((Boolean) interfaceC1809a12.getValue()).booleanValue()) {
                        c1836h0.m4525a0(-794607399);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a13 = this.f18913j;
                        String str = (String) interfaceC1809a13.getValue();
                        List list = AbstractC4955ho.f17702q;
                        Object objM4514P2 = c1836h0.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C5109mf(interfaceC1809a13, 4);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9571i4("退群系统消息模板", "wxid变量会生成可点击资料链接", str, list, 3, (InterfaceC1231l) objM4514P2, c1836h0, 221238, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-794238375);
                        c1836h0.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    InterfaceC1809a1 interfaceC1809a14 = this.f18914k;
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                    boolean zM4538h2 = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P3 == c1823e) {
                        objM4514P3 = new C5108me(sharedPreferences, interfaceC1809a14, 14);
                        c1836h0.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "邀请详情", "检测到邀请进群后插入邀请者、被邀请者和累计邀请次数", false, (InterfaceC1231l) objM4514P3, c1836h0, 432, 8);
                    if (((Boolean) interfaceC1809a14.getValue()).booleanValue()) {
                        c1836h0.m4525a0(-793730130);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a15 = this.f18915l;
                        String str2 = (String) interfaceC1809a15.getValue();
                        List list2 = AbstractC4955ho.f17703r;
                        Object objM4514P4 = c1836h0.m4514P();
                        if (objM4514P4 == c1823e) {
                            objM4514P4 = new C5109mf(interfaceC1809a15, 5);
                            c1836h0.m4545k0(objM4514P4);
                        }
                        interfaceC1809a1 = interfaceC1809a14;
                        AbstractC4955ho.m9571i4("邀请详情系统消息模板", "邀请者和被邀请者wxid会生成可点击资料链接", str2, list2, 4, (InterfaceC1231l) objM4514P4, c1836h0, 221238, 0);
                        c1836h0.m4553p(false);
                    } else {
                        interfaceC1809a1 = interfaceC1809a14;
                        c1836h0.m4525a0(-793350535);
                        c1836h0.m4553p(false);
                    }
                    if (((Boolean) interfaceC1809a12.getValue()).booleanValue() || ((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                        c1836h0.m4525a0(-793240640);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a16 = this.f18916m;
                        String str3 = AbstractC1416l.m3825a((String) interfaceC1809a16.getValue(), "specific") ? "指定群聊" : "全部群聊";
                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("all", "全部群聊"), new C4825dq("specific", "指定群聊"));
                        String str4 = (String) interfaceC1809a16.getValue();
                        Object objM4514P5 = c1836h0.m4514P();
                        if (objM4514P5 == c1823e) {
                            objM4514P5 = new C5109mf(interfaceC1809a16, 6);
                            c1836h0.m4545k0(objM4514P5);
                        }
                        AbstractC4955ho.m9353I2("适用群聊", str3, listM101y0, str4, (InterfaceC1231l) objM4514P5, false, c1836h0, 24582, 32);
                        if (AbstractC1416l.m3825a((String) interfaceC1809a16.getValue(), "specific")) {
                            c1836h0.m4525a0(-792530182);
                            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            InterfaceC1809a1 interfaceC1809a17 = this.f18917n;
                            String strM9574i7 = AbstractC4955ho.m9574i7((String) interfaceC1809a17.getValue());
                            Object objM4514P6 = c1836h0.m4514P();
                            if (objM4514P6 == c1823e) {
                                objM4514P6 = new C0500x0(24, interfaceC1809a17, this.f18918o);
                                c1836h0.m4545k0(objM4514P6);
                            }
                            AbstractC4955ho.m9503b("选择指定群聊", strM9574i7, (InterfaceC1220a) objM4514P6, c1836h0, 390);
                            c1836h0.m4553p(false);
                        } else {
                            c1836h0.m4525a0(-791946855);
                            c1836h0.m4553p(false);
                        }
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-791925031);
                        c1836h0.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    InterfaceC1809a1 interfaceC1809a18 = this.f18919p;
                    String str5 = (String) interfaceC1809a18.getValue();
                    Object objM4514P7 = c1836h0.m4514P();
                    if (objM4514P7 == c1823e) {
                        objM4514P7 = new C4749bf(interfaceC1809a18, 3);
                        c1836h0.m4545k0(objM4514P7);
                    }
                    InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P7;
                    Object objM4514P8 = c1836h0.m4514P();
                    if (objM4514P8 == c1823e) {
                        objM4514P8 = new C5109mf(interfaceC1809a18, 7);
                        c1836h0.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9430S("wxid颜色", "退群和邀请详情里的 wxid 链接颜色", str5, false, interfaceC1220a, (InterfaceC1231l) objM4514P8, c1836h0, 224310, 0);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a19 = this.f18912i;
                    String str6 = ((Number) interfaceC1809a19.getValue()).intValue() == 1 ? "在范围内随机等待" : "每条等待固定时间";
                    ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("固定延迟", 0), new C3958e("随机延迟", 1));
                    int iIntValue3 = ((Number) interfaceC1809a19.getValue()).intValue();
                    SharedPreferences sharedPreferences2 = this.f18911h;
                    boolean zM4538h3 = c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P9 = c1836h02.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4538h3 || objM4514P9 == c1823e2) {
                        objM4514P9 = new C5441wh(sharedPreferences2, interfaceC1809a19, 15);
                        c1836h02.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9361J2("点赞延迟", str6, arrayListM9699w6, iIntValue3, (InterfaceC1231l) objM4514P9, false, c1836h02, 6);
                    if (((Number) interfaceC1809a19.getValue()).intValue() == 0) {
                        c1836h02.m4525a0(1036135200);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a110 = this.f18913j;
                        String str7 = (String) interfaceC1809a110.getValue();
                        boolean zM4538h4 = c1836h02.m4538h(sharedPreferences2);
                        Object objM4514P10 = c1836h02.m4514P();
                        if (zM4538h4 || objM4514P10 == c1823e2) {
                            objM4514P10 = new C5441wh(interfaceC1809a110, sharedPreferences2, 16);
                            c1836h02.m4545k0(objM4514P10);
                        }
                        AbstractC4955ho.m9695w2("等待时间", "单位秒，最少 0 秒", str7, (InterfaceC1231l) objM4514P10, c1836h02, 54);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1036610771);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a111 = this.f18914k;
                        String str8 = (String) interfaceC1809a111.getValue();
                        boolean zM4538h5 = c1836h02.m4538h(sharedPreferences2);
                        Object objM4514P11 = c1836h02.m4514P();
                        if (zM4538h5 || objM4514P11 == c1823e2) {
                            objM4514P11 = new C5441wh(interfaceC1809a111, sharedPreferences2, 17);
                            c1836h02.m4545k0(objM4514P11);
                        }
                        AbstractC4955ho.m9695w2("最短等待", "单位秒，最少 0 秒", str8, (InterfaceC1231l) objM4514P11, c1836h02, 54);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a112 = this.f18915l;
                        String str9 = (String) interfaceC1809a112.getValue();
                        boolean zM4538h6 = c1836h02.m4538h(sharedPreferences2);
                        Object objM4514P12 = c1836h02.m4514P();
                        if (zM4538h6 || objM4514P12 == c1823e2) {
                            objM4514P12 = new C5441wh(interfaceC1809a112, sharedPreferences2, 18);
                            c1836h02.m4545k0(objM4514P12);
                        }
                        AbstractC4955ho.m9695w2("最长等待", "单位秒，不能小于最短等待", str9, (InterfaceC1231l) objM4514P12, c1836h02, 54);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a113 = this.f18916m;
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                    boolean zM4538h7 = c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P13 = c1836h02.m4514P();
                    if (zM4538h7 || objM4514P13 == c1823e2) {
                        objM4514P13 = new C5441wh(sharedPreferences2, interfaceC1809a113, 19);
                        c1836h02.m4545k0(objM4514P13);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, "限制运行时段", "支持跨零点时段", false, (InterfaceC1231l) objM4514P13, c1836h02, 432, 8);
                    C1836h0 c1836h03 = c1836h02;
                    if (((Boolean) interfaceC1809a113.getValue()).booleanValue()) {
                        c1836h03.m4525a0(1037809231);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a114 = this.f18917n;
                        String str10 = (String) interfaceC1809a114.getValue();
                        boolean zM4538h8 = c1836h03.m4538h(sharedPreferences2);
                        Object objM4514P14 = c1836h03.m4514P();
                        if (zM4538h8 || objM4514P14 == c1823e2) {
                            objM4514P14 = new C5441wh(sharedPreferences2, interfaceC1809a114, 20);
                            c1836h03.m4545k0(objM4514P14);
                        }
                        AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P14, c1836h03, "开始时间", str10, false);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a115 = this.f18918o;
                        String str11 = (String) interfaceC1809a115.getValue();
                        boolean zM4538h9 = c1836h03.m4538h(sharedPreferences2);
                        Object objM4514P15 = c1836h03.m4514P();
                        if (zM4538h9 || objM4514P15 == c1823e2) {
                            objM4514P15 = new C5441wh(sharedPreferences2, interfaceC1809a115, 21);
                            c1836h03.m4545k0(objM4514P15);
                        }
                        AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P15, c1836h03, "结束时间", str11, false);
                        c1836h03 = c1836h03;
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(1038390636);
                        c1836h03.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    InterfaceC1809a1 interfaceC1809a116 = this.f18919p;
                    String str12 = (String) interfaceC1809a116.getValue();
                    boolean zM4538h10 = c1836h03.m4538h(sharedPreferences2);
                    Object objM4514P16 = c1836h03.m4514P();
                    if (zM4538h10 || objM4514P16 == c1823e2) {
                        objM4514P16 = new C5441wh(interfaceC1809a116, sharedPreferences2, 22);
                        c1836h03.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9695w2("发布时间限制", "仅点赞发布后指定小时内的朋友圈，最少 1 小时", str12, (InterfaceC1231l) objM4514P16, c1836h03, 54);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC4955ho.m9296B1("当前启用", (String) this.f18919p.getValue(), null, c1836h04, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    InterfaceC1809a1 interfaceC1809a117 = this.f18912i;
                    String str13 = (String) interfaceC1809a117.getValue();
                    boolean zM4534f = c1836h04.m4534f(interfaceC1809a117);
                    Object objM4514P17 = c1836h04.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4534f || objM4514P17 == c1823e3) {
                        objM4514P17 = new C5145ni(interfaceC1809a117, 11);
                        c1836h04.m4545k0(objM4514P17);
                    }
                    AbstractC4955ho.m9304C1("配置名称", "例如 DeepSeek 主账号", str13, 0, (InterfaceC1231l) objM4514P17, c1836h04, 54, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    InterfaceC1809a1 interfaceC1809a118 = this.f18913j;
                    String str14 = (String) interfaceC1809a118.getValue();
                    boolean zM4534f2 = c1836h04.m4534f(interfaceC1809a118);
                    Object objM4514P18 = c1836h04.m4514P();
                    if (zM4534f2 || objM4514P18 == c1823e3) {
                        objM4514P18 = new C5145ni(interfaceC1809a118, 12);
                        c1836h04.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9304C1("API Key", "OpenAI 兼容接口密钥", str14, 0, (InterfaceC1231l) objM4514P18, c1836h04, 54, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    InterfaceC1809a1 interfaceC1809a119 = this.f18914k;
                    String str15 = (String) interfaceC1809a119.getValue();
                    boolean zM4534f3 = c1836h04.m4534f(interfaceC1809a119);
                    Object objM4514P19 = c1836h04.m4514P();
                    if (zM4534f3 || objM4514P19 == c1823e3) {
                        objM4514P19 = new C5145ni(interfaceC1809a119, 13);
                        c1836h04.m4545k0(objM4514P19);
                    }
                    AbstractC4955ho.m9304C1("API 地址", "例如 https://api.xxx.com/v1", str15, 0, (InterfaceC1231l) objM4514P19, c1836h04, 54, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    InterfaceC1809a1 interfaceC1809a120 = this.f18915l;
                    String str16 = (String) interfaceC1809a120.getValue();
                    boolean zM4534f4 = c1836h04.m4534f(interfaceC1809a120);
                    Object objM4514P20 = c1836h04.m4514P();
                    if (zM4534f4 || objM4514P20 == c1823e3) {
                        objM4514P20 = new C5145ni(interfaceC1809a120, 14);
                        c1836h04.m4545k0(objM4514P20);
                    }
                    AbstractC4955ho.m9304C1("API 路径", "默认 /chat/completions", str16, 0, (InterfaceC1231l) objM4514P20, c1836h04, 54, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    InterfaceC1809a1 interfaceC1809a121 = this.f18916m;
                    String str17 = (String) interfaceC1809a121.getValue();
                    boolean zM4534f5 = c1836h04.m4534f(interfaceC1809a121);
                    Object objM4514P21 = c1836h04.m4514P();
                    if (zM4534f5 || objM4514P21 == c1823e3) {
                        objM4514P21 = new C5145ni(interfaceC1809a121, 15);
                        c1836h04.m4545k0(objM4514P21);
                    }
                    AbstractC4955ho.m9304C1("模型", "例如 deepseek-ai/DeepSeek-V3", str17, 0, (InterfaceC1231l) objM4514P21, c1836h04, 54, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    InterfaceC1809a1 interfaceC1809a122 = this.f18917n;
                    String str18 = (String) interfaceC1809a122.getValue();
                    boolean zM4534f6 = c1836h04.m4534f(interfaceC1809a122);
                    Object objM4514P22 = c1836h04.m4514P();
                    if (zM4534f6 || objM4514P22 == c1823e3) {
                        objM4514P22 = new C5145ni(interfaceC1809a122, 16);
                        c1836h04.m4545k0(objM4514P22);
                    }
                    AbstractC4955ho.m9304C1("系统指令", "AI 角色设定和回复要求", str18, 4, (InterfaceC1231l) objM4514P22, c1836h04, 3126, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    InterfaceC1809a1 interfaceC1809a123 = this.f18918o;
                    String str19 = (String) interfaceC1809a123.getValue();
                    boolean zM4534f7 = c1836h04.m4534f(interfaceC1809a123);
                    Object objM4514P23 = c1836h04.m4514P();
                    if (zM4534f7 || objM4514P23 == c1823e3) {
                        objM4514P23 = new C5145ni(interfaceC1809a123, 17);
                        c1836h04.m4545k0(objM4514P23);
                    }
                    AbstractC4955ho.m9695w2("上下文轮数", "0 表示不保留上下文", str19, (InterfaceC1231l) objM4514P23, c1836h04, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    SharedPreferences sharedPreferences3 = this.f18911h;
                    AbstractC4955ho.m9402O3(sharedPreferences3, "ai_stream", "流式请求", "失败时会自动尝试非流式", false, c1836h04, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "ai_clear_context_on_save", "保存后清空上下文", "修改人设或模型后避免继续沿用旧对话", true, c1836h04, 28080);
                } else {
                    c1836h04.m4519V();
                }
                break;
            default:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a124 = this.f18912i;
                    String str20 = ((Number) interfaceC1809a124.getValue()).intValue() == 1 ? "在范围内随机等待" : "每条等待固定时间";
                    ArrayList arrayListM9699w62 = AbstractC4955ho.m9699w6(new C3958e("固定延迟", 0), new C3958e("随机延迟", 1));
                    int iIntValue6 = ((Number) interfaceC1809a124.getValue()).intValue();
                    SharedPreferences sharedPreferences4 = this.f18911h;
                    boolean zM4538h11 = c1836h05.m4538h(sharedPreferences4);
                    Object objM4514P24 = c1836h05.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4538h11 || objM4514P24 == c1823e4) {
                        objM4514P24 = new C4818di(sharedPreferences4, interfaceC1809a124, 20);
                        c1836h05.m4545k0(objM4514P24);
                    }
                    AbstractC4955ho.m9361J2("评论延迟", str20, arrayListM9699w62, iIntValue6, (InterfaceC1231l) objM4514P24, false, c1836h05, 6);
                    if (((Number) interfaceC1809a124.getValue()).intValue() == 0) {
                        c1836h05.m4525a0(-1811880392);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a125 = this.f18913j;
                        String str21 = (String) interfaceC1809a125.getValue();
                        boolean zM4538h12 = c1836h05.m4538h(sharedPreferences4);
                        Object objM4514P25 = c1836h05.m4514P();
                        if (zM4538h12 || objM4514P25 == c1823e4) {
                            objM4514P25 = new C4818di(interfaceC1809a125, sharedPreferences4, 21);
                            c1836h05.m4545k0(objM4514P25);
                        }
                        AbstractC4955ho.m9695w2("等待时间", "单位秒，最少 0 秒", str21, (InterfaceC1231l) objM4514P25, c1836h05, 54);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-1811401752);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a126 = this.f18914k;
                        String str22 = (String) interfaceC1809a126.getValue();
                        boolean zM4538h13 = c1836h05.m4538h(sharedPreferences4);
                        Object objM4514P26 = c1836h05.m4514P();
                        if (zM4538h13 || objM4514P26 == c1823e4) {
                            objM4514P26 = new C4818di(interfaceC1809a126, sharedPreferences4, 22);
                            c1836h05.m4545k0(objM4514P26);
                        }
                        AbstractC4955ho.m9695w2("最短等待", "单位秒，最少 0 秒", str22, (InterfaceC1231l) objM4514P26, c1836h05, 54);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a127 = this.f18915l;
                        String str23 = (String) interfaceC1809a127.getValue();
                        boolean zM4538h14 = c1836h05.m4538h(sharedPreferences4);
                        Object objM4514P27 = c1836h05.m4514P();
                        if (zM4538h14 || objM4514P27 == c1823e4) {
                            objM4514P27 = new C4818di(interfaceC1809a127, sharedPreferences4, 23);
                            c1836h05.m4545k0(objM4514P27);
                        }
                        AbstractC4955ho.m9695w2("最长等待", "单位秒，不能小于最短等待", str23, (InterfaceC1231l) objM4514P27, c1836h05, 54);
                        c1836h05.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a128 = this.f18916m;
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a128.getValue()).booleanValue();
                    boolean zM4538h15 = c1836h05.m4538h(sharedPreferences4);
                    Object objM4514P28 = c1836h05.m4514P();
                    if (zM4538h15 || objM4514P28 == c1823e4) {
                        objM4514P28 = new C4818di(sharedPreferences4, interfaceC1809a128, 24);
                        c1836h05.m4545k0(objM4514P28);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue4, "限制运行时段", "支持跨零点时段", false, (InterfaceC1231l) objM4514P28, c1836h05, 432, 8);
                    C1836h0 c1836h06 = c1836h05;
                    if (((Boolean) interfaceC1809a128.getValue()).booleanValue()) {
                        c1836h06.m4525a0(-1810194364);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        InterfaceC1809a1 interfaceC1809a129 = this.f18917n;
                        String str24 = (String) interfaceC1809a129.getValue();
                        boolean zM4538h16 = c1836h06.m4538h(sharedPreferences4);
                        Object objM4514P29 = c1836h06.m4514P();
                        if (zM4538h16 || objM4514P29 == c1823e4) {
                            objM4514P29 = new C4818di(sharedPreferences4, interfaceC1809a129, 25);
                            c1836h06.m4545k0(objM4514P29);
                        }
                        AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P29, c1836h06, "开始时间", str24, false);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        InterfaceC1809a1 interfaceC1809a130 = this.f18918o;
                        String str25 = (String) interfaceC1809a130.getValue();
                        boolean zM4538h17 = c1836h06.m4538h(sharedPreferences4);
                        Object objM4514P30 = c1836h06.m4514P();
                        if (zM4538h17 || objM4514P30 == c1823e4) {
                            objM4514P30 = new C4818di(sharedPreferences4, interfaceC1809a130, 26);
                            c1836h06.m4545k0(objM4514P30);
                        }
                        AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P30, c1836h06, "结束时间", str25, false);
                        c1836h06 = c1836h06;
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(-1809607193);
                        c1836h06.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    InterfaceC1809a1 interfaceC1809a131 = this.f18919p;
                    String str26 = (String) interfaceC1809a131.getValue();
                    boolean zM4538h18 = c1836h06.m4538h(sharedPreferences4);
                    Object objM4514P31 = c1836h06.m4514P();
                    if (zM4538h18 || objM4514P31 == c1823e4) {
                        objM4514P31 = new C4818di(interfaceC1809a131, sharedPreferences4, 27);
                        c1836h06.m4545k0(objM4514P31);
                    }
                    AbstractC4955ho.m9695w2("发布时间限制", "仅评论发布后指定小时内的朋友圈，最少 1 小时", str26, (InterfaceC1231l) objM4514P31, c1836h06, 54);
                } else {
                    c1836h05.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5107md(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, int i9) {
        this.f18910g = i9;
        this.f18911h = sharedPreferences;
        this.f18912i = interfaceC1809a1;
        this.f18913j = interfaceC1809a12;
        this.f18914k = interfaceC1809a13;
        this.f18915l = interfaceC1809a14;
        this.f18916m = interfaceC1809a15;
        this.f18917n = interfaceC1809a16;
        this.f18918o = interfaceC1809a17;
        this.f18919p = interfaceC1809a18;
    }
}
