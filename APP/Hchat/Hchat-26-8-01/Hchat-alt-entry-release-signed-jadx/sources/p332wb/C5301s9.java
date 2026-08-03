package p332wb;

import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3199a;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.s9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5301s9 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20610g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f20611h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20612i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20613j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20614k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20615l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20616m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20617n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f20618o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f20619p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f20620q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5301s9(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, int i9) {
        this.f20610g = i9;
        this.f20611h = sharedPreferences;
        this.f20612i = interfaceC1809a1;
        this.f20613j = interfaceC1809a12;
        this.f20614k = interfaceC1809a13;
        this.f20615l = interfaceC1809a14;
        this.f20616m = interfaceC1809a15;
        this.f20617n = interfaceC1809a16;
        this.f20618o = interfaceC1809a17;
        this.f20619p = interfaceC1809a18;
        this.f20620q = interfaceC1809a19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f20610g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    final int i9 = 0;
                    final SharedPreferences sharedPreferences = this.f20611h;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f20612i;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f20613j;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f20614k;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f20615l;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f20616m;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f20617n;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f20618o;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f20619p;
                    final InterfaceC1809a1 interfaceC1809a19 = this.f20620q;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1162930635, new InterfaceC1235p() { // from class: wb.pe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i9) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        AbstractC4955ho.m9402O3(sharedPreferences2, "group_member_reply_enable", "启用自动回复", "只对下方监听群生效，默认关闭", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences2, "group_member_reply_join_enable", "进群回复", "检测到新成员进群后发送欢迎内容", true, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences2, "group_member_reply_left_enable", "退群回复", "检测到成员退群后发送退群内容", true, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9484Y5 = AbstractC4955ho.m9484Y5((String) interfaceC1809a1.getValue());
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C5371ud(interfaceC1809a12, 22);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("监听群与专属设置", strM9484Y5, (InterfaceC1220a) objM4514P, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a13;
                                        String strM6836i = ((List) interfaceC1809a110.getValue()).isEmpty() ? "暂无模板，进入后添加批量配置" : AbstractC3199a.m6836i(((List) interfaceC1809a110.getValue()).size(), " 个模板，进入后修改或删除");
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C5371ud(interfaceC1809a14, 23);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9503b("回复模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        String strM9348H5 = ((List) interfaceC1809a110.getValue()).isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5((List) interfaceC1809a15.getValue(), (List) interfaceC1809a110.getValue());
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C5371ud(interfaceC1809a16, 24);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P3, c1836h02, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a17;
                                        String str = (String) interfaceC1809a111.getValue();
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C5534zd(interfaceC1809a111, 24);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9695w2("整体延迟", "单位秒，0-600", str, (InterfaceC1231l) objM4514P4, c1836h02, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a18;
                                        String str2 = (String) interfaceC1809a112.getValue();
                                        String str3 = AbstractC1416l.m3825a(str2, WeChatSnsPost.TYPE_CARD) ? "卡片" : AbstractC1416l.m3825a(str2, "both") ? "文本+卡片" : "文本";
                                        List listM9428R5 = AbstractC4955ho.m9428R5();
                                        String str4 = (String) interfaceC1809a112.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5534zd(interfaceC1809a112, 25);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9353I2("提示类型", str3, listM9428R5, str4, (InterfaceC1231l) objM4514P5, false, c1836h02, 24582, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a112.getValue(), "both")) {
                                            c1836h02.m4525a0(1662786193);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a19;
                                            String str5 = AbstractC1416l.m3825a((String) interfaceC1809a113.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                            List listM9332F5 = AbstractC4955ho.m9332F5();
                                            String str6 = (String) interfaceC1809a113.getValue();
                                            Object objM4514P6 = c1836h02.m4514P();
                                            if (objM4514P6 == c1823e) {
                                                objM4514P6 = new C5534zd(interfaceC1809a113, 26);
                                                c1836h02.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9353I2("文本+卡片顺序", str5, listM9332F5, str6, (InterfaceC1231l) objM4514P6, false, c1836h02, 24582, 32);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(1663253239);
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
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a1;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences3 = sharedPreferences;
                                        boolean zM4538h = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P7 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h || objM4514P7 == c1823e2) {
                                            objM4514P7 = new C5441wh(sharedPreferences3, interfaceC1809a114, 23);
                                            c1836h03.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "文字朋友圈", "允许自动点赞", false, (InterfaceC1231l) objM4514P7, c1836h03, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a12;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a115.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P8 = c1836h03.m4514P();
                                        if (zM4538h2 || objM4514P8 == c1823e2) {
                                            objM4514P8 = new C5441wh(sharedPreferences3, interfaceC1809a115, 24);
                                            c1836h03.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "图片/图文朋友圈", "允许自动点赞", false, (InterfaceC1231l) objM4514P8, c1836h03, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a13;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                        boolean zM4538h3 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P9 = c1836h03.m4514P();
                                        if (zM4538h3 || objM4514P9 == c1823e2) {
                                            objM4514P9 = new C5441wh(sharedPreferences3, interfaceC1809a116, 25);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "视频/视文朋友圈", "允许自动点赞", false, (InterfaceC1231l) objM4514P9, c1836h03, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a14;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a117.getValue()).booleanValue();
                                        boolean zM4538h4 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (zM4538h4 || objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5441wh(sharedPreferences3, interfaceC1809a117, 26);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "文字朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P10, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a117.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-807315378);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a15;
                                            String str7 = (String) interfaceC1809a118.getValue();
                                            boolean zM4538h5 = c1836h03.m4538h(sharedPreferences3);
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (zM4538h5 || objM4514P11 == c1823e2) {
                                                objM4514P11 = new C5441wh(sharedPreferences3, interfaceC1809a118, 27);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9304C1("文字排除关键词", "多个关键词用逗号或换行分隔", str7, 2, (InterfaceC1231l) objM4514P11, c1836h03, 3126, 0);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-806977106);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a16;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a119.getValue()).booleanValue();
                                        boolean zM4538h6 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P12 = c1836h03.m4514P();
                                        if (zM4538h6 || objM4514P12 == c1823e2) {
                                            objM4514P12 = new C5441wh(sharedPreferences3, interfaceC1809a119, 28);
                                            c1836h03.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "图文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P12, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a119.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-806662146);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a17;
                                            String str8 = (String) interfaceC1809a120.getValue();
                                            boolean zM4538h7 = c1836h03.m4538h(sharedPreferences3);
                                            Object objM4514P13 = c1836h03.m4514P();
                                            if (zM4538h7 || objM4514P13 == c1823e2) {
                                                objM4514P13 = new C5441wh(sharedPreferences3, interfaceC1809a120, 29);
                                                c1836h03.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9304C1("图文排除关键词", "多个关键词用逗号或换行分隔", str8, 2, (InterfaceC1231l) objM4514P13, c1836h03, 3126, 0);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-806308498);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a18;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a121.getValue()).booleanValue();
                                        boolean zM4538h8 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P14 = c1836h03.m4514P();
                                        if (zM4538h8 || objM4514P14 == c1823e2) {
                                            objM4514P14 = new C4818di(sharedPreferences3, interfaceC1809a121, 0);
                                            c1836h03.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "视文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P14, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a121.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-805993538);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a19;
                                            String str9 = (String) interfaceC1809a122.getValue();
                                            boolean zM4538h9 = c1836h03.m4538h(sharedPreferences3);
                                            Object objM4514P15 = c1836h03.m4514P();
                                            if (zM4538h9 || objM4514P15 == c1823e2) {
                                                objM4514P15 = new C4818di(sharedPreferences3, interfaceC1809a122, 1);
                                                c1836h03.m4545k0(objM4514P15);
                                            }
                                            AbstractC4955ho.m9304C1("视文排除关键词", "多个关键词用逗号或换行分隔", str9, 2, (InterfaceC1231l) objM4514P15, c1836h03, 3126, 0);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-805639890);
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
                                        InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a1;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a123.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences;
                                        boolean zM4538h10 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P16 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h10 || objM4514P16 == c1823e3) {
                                            objM4514P16 = new C5019jo(sharedPreferences4, interfaceC1809a123, 0);
                                            c1836h04.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "文字朋友圈", "允许自动评论", false, (InterfaceC1231l) objM4514P16, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a12;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a124.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P17 = c1836h04.m4514P();
                                        if (zM4538h11 || objM4514P17 == c1823e3) {
                                            objM4514P17 = new C5019jo(sharedPreferences4, interfaceC1809a124, 1);
                                            c1836h04.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "图片/图文朋友圈", "允许自动评论", false, (InterfaceC1231l) objM4514P17, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a13;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P18 = c1836h04.m4514P();
                                        if (zM4538h12 || objM4514P18 == c1823e3) {
                                            objM4514P18 = new C5019jo(sharedPreferences4, interfaceC1809a125, 2);
                                            c1836h04.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "视频/视文朋友圈", "允许自动评论", false, (InterfaceC1231l) objM4514P18, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a14;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        boolean zM4538h13 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P19 = c1836h04.m4514P();
                                        if (zM4538h13 || objM4514P19 == c1823e3) {
                                            objM4514P19 = new C5019jo(sharedPreferences4, interfaceC1809a126, 3);
                                            c1836h04.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "文字朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P19, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(472996934);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a15;
                                            String str10 = (String) interfaceC1809a127.getValue();
                                            boolean zM4538h14 = c1836h04.m4538h(sharedPreferences4);
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (zM4538h14 || objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5019jo(sharedPreferences4, interfaceC1809a127, 4);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9304C1("文字排除关键词", "多个关键词用逗号或换行分隔", str10, 2, (InterfaceC1231l) objM4514P20, c1836h04, 3126, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(473338089);
                                            c1836h04.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a16;
                                        boolean zBooleanValue11 = ((Boolean) interfaceC1809a128.getValue()).booleanValue();
                                        boolean zM4538h15 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P21 = c1836h04.m4514P();
                                        if (zM4538h15 || objM4514P21 == c1823e3) {
                                            objM4514P21 = new C5019jo(sharedPreferences4, interfaceC1809a128, 5);
                                            c1836h04.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue11, "图文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P21, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a128.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(473656118);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a17;
                                            String str11 = (String) interfaceC1809a129.getValue();
                                            boolean zM4538h16 = c1836h04.m4538h(sharedPreferences4);
                                            Object objM4514P22 = c1836h04.m4514P();
                                            if (zM4538h16 || objM4514P22 == c1823e3) {
                                                objM4514P22 = new C5019jo(sharedPreferences4, interfaceC1809a129, 6);
                                                c1836h04.m4545k0(objM4514P22);
                                            }
                                            AbstractC4955ho.m9304C1("图文排除关键词", "多个关键词用逗号或换行分隔", str11, 2, (InterfaceC1231l) objM4514P22, c1836h04, 3126, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(474012649);
                                            c1836h04.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a130 = interfaceC1809a18;
                                        boolean zBooleanValue12 = ((Boolean) interfaceC1809a130.getValue()).booleanValue();
                                        boolean zM4538h17 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P23 = c1836h04.m4514P();
                                        if (zM4538h17 || objM4514P23 == c1823e3) {
                                            objM4514P23 = new C5019jo(sharedPreferences4, interfaceC1809a130, 7);
                                            c1836h04.m4545k0(objM4514P23);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue12, "视文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P23, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a130.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(474330678);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a131 = interfaceC1809a19;
                                            String str12 = (String) interfaceC1809a131.getValue();
                                            boolean zM4538h18 = c1836h04.m4538h(sharedPreferences4);
                                            Object objM4514P24 = c1836h04.m4514P();
                                            if (zM4538h18 || objM4514P24 == c1823e3) {
                                                objM4514P24 = new C5019jo(sharedPreferences4, interfaceC1809a131, 8);
                                                c1836h04.m4545k0(objM4514P24);
                                            }
                                            AbstractC4955ho.m9304C1("视文排除关键词", "多个关键词用逗号或换行分隔", str12, 2, (InterfaceC1231l) objM4514P24, c1836h04, 3126, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(474687209);
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
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    final int i10 = 1;
                    final SharedPreferences sharedPreferences2 = this.f20611h;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f20612i;
                    final InterfaceC1809a1 interfaceC1809a111 = this.f20613j;
                    final InterfaceC1809a1 interfaceC1809a112 = this.f20614k;
                    final InterfaceC1809a1 interfaceC1809a113 = this.f20615l;
                    final InterfaceC1809a1 interfaceC1809a114 = this.f20616m;
                    final InterfaceC1809a1 interfaceC1809a115 = this.f20617n;
                    final InterfaceC1809a1 interfaceC1809a116 = this.f20618o;
                    final InterfaceC1809a1 interfaceC1809a117 = this.f20619p;
                    final InterfaceC1809a1 interfaceC1809a118 = this.f20620q;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1420767828, new InterfaceC1235p() { // from class: wb.pe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i10) {
                                case 0:
                                    C1836h0 c1836h022 = (C1836h0) obj4;
                                    int iIntValue22 = ((Integer) obj5).intValue();
                                    if (c1836h022.m4516S(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "group_member_reply_enable", "启用自动回复", "只对下方监听群生效，默认关闭", false, c1836h022, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "group_member_reply_join_enable", "进群回复", "检测到新成员进群后发送欢迎内容", true, c1836h022, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "group_member_reply_left_enable", "退群回复", "检测到成员退群后发送退群内容", true, c1836h022, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        String strM9484Y5 = AbstractC4955ho.m9484Y5((String) interfaceC1809a110.getValue());
                                        Object objM4514P = c1836h022.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C5371ud(interfaceC1809a111, 22);
                                            c1836h022.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("监听群与专属设置", strM9484Y5, (InterfaceC1220a) objM4514P, c1836h022, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a112;
                                        String strM6836i = ((List) interfaceC1809a1102.getValue()).isEmpty() ? "暂无模板，进入后添加批量配置" : AbstractC3199a.m6836i(((List) interfaceC1809a1102.getValue()).size(), " 个模板，进入后修改或删除");
                                        Object objM4514P2 = c1836h022.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C5371ud(interfaceC1809a113, 23);
                                            c1836h022.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9503b("回复模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h022, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        String strM9348H5 = ((List) interfaceC1809a1102.getValue()).isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5((List) interfaceC1809a114.getValue(), (List) interfaceC1809a1102.getValue());
                                        Object objM4514P3 = c1836h022.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C5371ud(interfaceC1809a115, 24);
                                            c1836h022.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P3, c1836h022, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a116;
                                        String str = (String) interfaceC1809a1112.getValue();
                                        Object objM4514P4 = c1836h022.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C5534zd(interfaceC1809a1112, 24);
                                            c1836h022.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9695w2("整体延迟", "单位秒，0-600", str, (InterfaceC1231l) objM4514P4, c1836h022, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a117;
                                        String str2 = (String) interfaceC1809a1122.getValue();
                                        String str3 = AbstractC1416l.m3825a(str2, WeChatSnsPost.TYPE_CARD) ? "卡片" : AbstractC1416l.m3825a(str2, "both") ? "文本+卡片" : "文本";
                                        List listM9428R5 = AbstractC4955ho.m9428R5();
                                        String str4 = (String) interfaceC1809a1122.getValue();
                                        Object objM4514P5 = c1836h022.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5534zd(interfaceC1809a1122, 25);
                                            c1836h022.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9353I2("提示类型", str3, listM9428R5, str4, (InterfaceC1231l) objM4514P5, false, c1836h022, 24582, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a1122.getValue(), "both")) {
                                            c1836h022.m4525a0(1662786193);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a118;
                                            String str5 = AbstractC1416l.m3825a((String) interfaceC1809a1132.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                            List listM9332F5 = AbstractC4955ho.m9332F5();
                                            String str6 = (String) interfaceC1809a1132.getValue();
                                            Object objM4514P6 = c1836h022.m4514P();
                                            if (objM4514P6 == c1823e) {
                                                objM4514P6 = new C5534zd(interfaceC1809a1132, 26);
                                                c1836h022.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9353I2("文本+卡片顺序", str5, listM9332F5, str6, (InterfaceC1231l) objM4514P6, false, c1836h022, 24582, 32);
                                            c1836h022.m4553p(false);
                                        } else {
                                            c1836h022.m4525a0(1663253239);
                                            c1836h022.m4553p(false);
                                        }
                                    } else {
                                        c1836h022.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a110;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a1142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                                        boolean zM4538h = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P7 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h || objM4514P7 == c1823e2) {
                                            objM4514P7 = new C5441wh(sharedPreferences3, interfaceC1809a1142, 23);
                                            c1836h03.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "文字朋友圈", "允许自动点赞", false, (InterfaceC1231l) objM4514P7, c1836h03, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a111;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a1152.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P8 = c1836h03.m4514P();
                                        if (zM4538h2 || objM4514P8 == c1823e2) {
                                            objM4514P8 = new C5441wh(sharedPreferences3, interfaceC1809a1152, 24);
                                            c1836h03.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "图片/图文朋友圈", "允许自动点赞", false, (InterfaceC1231l) objM4514P8, c1836h03, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a112;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1162.getValue()).booleanValue();
                                        boolean zM4538h3 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P9 = c1836h03.m4514P();
                                        if (zM4538h3 || objM4514P9 == c1823e2) {
                                            objM4514P9 = new C5441wh(sharedPreferences3, interfaceC1809a1162, 25);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "视频/视文朋友圈", "允许自动点赞", false, (InterfaceC1231l) objM4514P9, c1836h03, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a113;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a1172.getValue()).booleanValue();
                                        boolean zM4538h4 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (zM4538h4 || objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5441wh(sharedPreferences3, interfaceC1809a1172, 26);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "文字朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P10, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a1172.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-807315378);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a114;
                                            String str7 = (String) interfaceC1809a1182.getValue();
                                            boolean zM4538h5 = c1836h03.m4538h(sharedPreferences3);
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (zM4538h5 || objM4514P11 == c1823e2) {
                                                objM4514P11 = new C5441wh(sharedPreferences3, interfaceC1809a1182, 27);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9304C1("文字排除关键词", "多个关键词用逗号或换行分隔", str7, 2, (InterfaceC1231l) objM4514P11, c1836h03, 3126, 0);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-806977106);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a115;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a119.getValue()).booleanValue();
                                        boolean zM4538h6 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P12 = c1836h03.m4514P();
                                        if (zM4538h6 || objM4514P12 == c1823e2) {
                                            objM4514P12 = new C5441wh(sharedPreferences3, interfaceC1809a119, 28);
                                            c1836h03.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "图文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P12, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a119.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-806662146);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a116;
                                            String str8 = (String) interfaceC1809a120.getValue();
                                            boolean zM4538h7 = c1836h03.m4538h(sharedPreferences3);
                                            Object objM4514P13 = c1836h03.m4514P();
                                            if (zM4538h7 || objM4514P13 == c1823e2) {
                                                objM4514P13 = new C5441wh(sharedPreferences3, interfaceC1809a120, 29);
                                                c1836h03.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9304C1("图文排除关键词", "多个关键词用逗号或换行分隔", str8, 2, (InterfaceC1231l) objM4514P13, c1836h03, 3126, 0);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-806308498);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a117;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a121.getValue()).booleanValue();
                                        boolean zM4538h8 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P14 = c1836h03.m4514P();
                                        if (zM4538h8 || objM4514P14 == c1823e2) {
                                            objM4514P14 = new C4818di(sharedPreferences3, interfaceC1809a121, 0);
                                            c1836h03.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "视文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P14, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a121.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-805993538);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a118;
                                            String str9 = (String) interfaceC1809a122.getValue();
                                            boolean zM4538h9 = c1836h03.m4538h(sharedPreferences3);
                                            Object objM4514P15 = c1836h03.m4514P();
                                            if (zM4538h9 || objM4514P15 == c1823e2) {
                                                objM4514P15 = new C4818di(sharedPreferences3, interfaceC1809a122, 1);
                                                c1836h03.m4545k0(objM4514P15);
                                            }
                                            AbstractC4955ho.m9304C1("视文排除关键词", "多个关键词用逗号或换行分隔", str9, 2, (InterfaceC1231l) objM4514P15, c1836h03, 3126, 0);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-805639890);
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
                                        InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a110;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a123.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences2;
                                        boolean zM4538h10 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P16 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h10 || objM4514P16 == c1823e3) {
                                            objM4514P16 = new C5019jo(sharedPreferences4, interfaceC1809a123, 0);
                                            c1836h04.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "文字朋友圈", "允许自动评论", false, (InterfaceC1231l) objM4514P16, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a111;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a124.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P17 = c1836h04.m4514P();
                                        if (zM4538h11 || objM4514P17 == c1823e3) {
                                            objM4514P17 = new C5019jo(sharedPreferences4, interfaceC1809a124, 1);
                                            c1836h04.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "图片/图文朋友圈", "允许自动评论", false, (InterfaceC1231l) objM4514P17, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a112;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P18 = c1836h04.m4514P();
                                        if (zM4538h12 || objM4514P18 == c1823e3) {
                                            objM4514P18 = new C5019jo(sharedPreferences4, interfaceC1809a125, 2);
                                            c1836h04.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "视频/视文朋友圈", "允许自动评论", false, (InterfaceC1231l) objM4514P18, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a113;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        boolean zM4538h13 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P19 = c1836h04.m4514P();
                                        if (zM4538h13 || objM4514P19 == c1823e3) {
                                            objM4514P19 = new C5019jo(sharedPreferences4, interfaceC1809a126, 3);
                                            c1836h04.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "文字朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P19, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(472996934);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a114;
                                            String str10 = (String) interfaceC1809a127.getValue();
                                            boolean zM4538h14 = c1836h04.m4538h(sharedPreferences4);
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (zM4538h14 || objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5019jo(sharedPreferences4, interfaceC1809a127, 4);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9304C1("文字排除关键词", "多个关键词用逗号或换行分隔", str10, 2, (InterfaceC1231l) objM4514P20, c1836h04, 3126, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(473338089);
                                            c1836h04.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a115;
                                        boolean zBooleanValue11 = ((Boolean) interfaceC1809a128.getValue()).booleanValue();
                                        boolean zM4538h15 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P21 = c1836h04.m4514P();
                                        if (zM4538h15 || objM4514P21 == c1823e3) {
                                            objM4514P21 = new C5019jo(sharedPreferences4, interfaceC1809a128, 5);
                                            c1836h04.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue11, "图文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P21, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a128.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(473656118);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a116;
                                            String str11 = (String) interfaceC1809a129.getValue();
                                            boolean zM4538h16 = c1836h04.m4538h(sharedPreferences4);
                                            Object objM4514P22 = c1836h04.m4514P();
                                            if (zM4538h16 || objM4514P22 == c1823e3) {
                                                objM4514P22 = new C5019jo(sharedPreferences4, interfaceC1809a129, 6);
                                                c1836h04.m4545k0(objM4514P22);
                                            }
                                            AbstractC4955ho.m9304C1("图文排除关键词", "多个关键词用逗号或换行分隔", str11, 2, (InterfaceC1231l) objM4514P22, c1836h04, 3126, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(474012649);
                                            c1836h04.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a130 = interfaceC1809a117;
                                        boolean zBooleanValue12 = ((Boolean) interfaceC1809a130.getValue()).booleanValue();
                                        boolean zM4538h17 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P23 = c1836h04.m4514P();
                                        if (zM4538h17 || objM4514P23 == c1823e3) {
                                            objM4514P23 = new C5019jo(sharedPreferences4, interfaceC1809a130, 7);
                                            c1836h04.m4545k0(objM4514P23);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue12, "视文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P23, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a130.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(474330678);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a131 = interfaceC1809a118;
                                            String str12 = (String) interfaceC1809a131.getValue();
                                            boolean zM4538h18 = c1836h04.m4538h(sharedPreferences4);
                                            Object objM4514P24 = c1836h04.m4514P();
                                            if (zM4538h18 || objM4514P24 == c1823e3) {
                                                objM4514P24 = new C5019jo(sharedPreferences4, interfaceC1809a131, 8);
                                                c1836h04.m4545k0(objM4514P24);
                                            }
                                            AbstractC4955ho.m9304C1("视文排除关键词", "多个关键词用逗号或换行分隔", str12, 2, (InterfaceC1231l) objM4514P24, c1836h04, 3126, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(474687209);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
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
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    final int i11 = 2;
                    final SharedPreferences sharedPreferences3 = this.f20611h;
                    final InterfaceC1809a1 interfaceC1809a119 = this.f20612i;
                    final InterfaceC1809a1 interfaceC1809a120 = this.f20613j;
                    final InterfaceC1809a1 interfaceC1809a121 = this.f20614k;
                    final InterfaceC1809a1 interfaceC1809a122 = this.f20615l;
                    final InterfaceC1809a1 interfaceC1809a123 = this.f20616m;
                    final InterfaceC1809a1 interfaceC1809a124 = this.f20617n;
                    final InterfaceC1809a1 interfaceC1809a125 = this.f20618o;
                    final InterfaceC1809a1 interfaceC1809a126 = this.f20619p;
                    final InterfaceC1809a1 interfaceC1809a127 = this.f20620q;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1919030503, new InterfaceC1235p() { // from class: wb.pe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h022 = (C1836h0) obj4;
                                    int iIntValue22 = ((Integer) obj5).intValue();
                                    if (c1836h022.m4516S(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences3;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "group_member_reply_enable", "启用自动回复", "只对下方监听群生效，默认关闭", false, c1836h022, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "group_member_reply_join_enable", "进群回复", "检测到新成员进群后发送欢迎内容", true, c1836h022, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "group_member_reply_left_enable", "退群回复", "检测到成员退群后发送退群内容", true, c1836h022, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        String strM9484Y5 = AbstractC4955ho.m9484Y5((String) interfaceC1809a119.getValue());
                                        Object objM4514P = c1836h022.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C5371ud(interfaceC1809a120, 22);
                                            c1836h022.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9503b("监听群与专属设置", strM9484Y5, (InterfaceC1220a) objM4514P, c1836h022, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a121;
                                        String strM6836i = ((List) interfaceC1809a1102.getValue()).isEmpty() ? "暂无模板，进入后添加批量配置" : AbstractC3199a.m6836i(((List) interfaceC1809a1102.getValue()).size(), " 个模板，进入后修改或删除");
                                        Object objM4514P2 = c1836h022.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C5371ud(interfaceC1809a122, 23);
                                            c1836h022.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9503b("回复模板管理", strM6836i, (InterfaceC1220a) objM4514P2, c1836h022, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        String strM9348H5 = ((List) interfaceC1809a1102.getValue()).isEmpty() ? "先新增模板，再批量绑定监听群" : AbstractC4955ho.m9348H5((List) interfaceC1809a123.getValue(), (List) interfaceC1809a1102.getValue());
                                        Object objM4514P3 = c1836h022.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C5371ud(interfaceC1809a124, 24);
                                            c1836h022.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9503b("批量套用模板", strM9348H5, (InterfaceC1220a) objM4514P3, c1836h022, 390);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a125;
                                        String str = (String) interfaceC1809a1112.getValue();
                                        Object objM4514P4 = c1836h022.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C5534zd(interfaceC1809a1112, 24);
                                            c1836h022.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9695w2("整体延迟", "单位秒，0-600", str, (InterfaceC1231l) objM4514P4, c1836h022, 3126);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a126;
                                        String str2 = (String) interfaceC1809a1122.getValue();
                                        String str3 = AbstractC1416l.m3825a(str2, WeChatSnsPost.TYPE_CARD) ? "卡片" : AbstractC1416l.m3825a(str2, "both") ? "文本+卡片" : "文本";
                                        List listM9428R5 = AbstractC4955ho.m9428R5();
                                        String str4 = (String) interfaceC1809a1122.getValue();
                                        Object objM4514P5 = c1836h022.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5534zd(interfaceC1809a1122, 25);
                                            c1836h022.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9353I2("提示类型", str3, listM9428R5, str4, (InterfaceC1231l) objM4514P5, false, c1836h022, 24582, 32);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a1122.getValue(), "both")) {
                                            c1836h022.m4525a0(1662786193);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a127;
                                            String str5 = AbstractC1416l.m3825a((String) interfaceC1809a1132.getValue(), "card_first") ? "先卡片后文本" : "先文本后卡片";
                                            List listM9332F5 = AbstractC4955ho.m9332F5();
                                            String str6 = (String) interfaceC1809a1132.getValue();
                                            Object objM4514P6 = c1836h022.m4514P();
                                            if (objM4514P6 == c1823e) {
                                                objM4514P6 = new C5534zd(interfaceC1809a1132, 26);
                                                c1836h022.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9353I2("文本+卡片顺序", str5, listM9332F5, str6, (InterfaceC1231l) objM4514P6, false, c1836h022, 24582, 32);
                                            c1836h022.m4553p(false);
                                        } else {
                                            c1836h022.m4525a0(1663253239);
                                            c1836h022.m4553p(false);
                                        }
                                    } else {
                                        c1836h022.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h032 = (C1836h0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    if (c1836h032.m4516S(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a119;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a1142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences32 = sharedPreferences3;
                                        boolean zM4538h = c1836h032.m4538h(sharedPreferences32);
                                        Object objM4514P7 = c1836h032.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h || objM4514P7 == c1823e2) {
                                            objM4514P7 = new C5441wh(sharedPreferences32, interfaceC1809a1142, 23);
                                            c1836h032.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "文字朋友圈", "允许自动点赞", false, (InterfaceC1231l) objM4514P7, c1836h032, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a120;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a1152.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h032.m4538h(sharedPreferences32);
                                        Object objM4514P8 = c1836h032.m4514P();
                                        if (zM4538h2 || objM4514P8 == c1823e2) {
                                            objM4514P8 = new C5441wh(sharedPreferences32, interfaceC1809a1152, 24);
                                            c1836h032.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "图片/图文朋友圈", "允许自动点赞", false, (InterfaceC1231l) objM4514P8, c1836h032, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a121;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1162.getValue()).booleanValue();
                                        boolean zM4538h3 = c1836h032.m4538h(sharedPreferences32);
                                        Object objM4514P9 = c1836h032.m4514P();
                                        if (zM4538h3 || objM4514P9 == c1823e2) {
                                            objM4514P9 = new C5441wh(sharedPreferences32, interfaceC1809a1162, 25);
                                            c1836h032.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "视频/视文朋友圈", "允许自动点赞", false, (InterfaceC1231l) objM4514P9, c1836h032, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a122;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a1172.getValue()).booleanValue();
                                        boolean zM4538h4 = c1836h032.m4538h(sharedPreferences32);
                                        Object objM4514P10 = c1836h032.m4514P();
                                        if (zM4538h4 || objM4514P10 == c1823e2) {
                                            objM4514P10 = new C5441wh(sharedPreferences32, interfaceC1809a1172, 26);
                                            c1836h032.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "文字朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P10, c1836h032, 432, 8);
                                        if (((Boolean) interfaceC1809a1172.getValue()).booleanValue()) {
                                            c1836h032.m4525a0(-807315378);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a123;
                                            String str7 = (String) interfaceC1809a1182.getValue();
                                            boolean zM4538h5 = c1836h032.m4538h(sharedPreferences32);
                                            Object objM4514P11 = c1836h032.m4514P();
                                            if (zM4538h5 || objM4514P11 == c1823e2) {
                                                objM4514P11 = new C5441wh(sharedPreferences32, interfaceC1809a1182, 27);
                                                c1836h032.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9304C1("文字排除关键词", "多个关键词用逗号或换行分隔", str7, 2, (InterfaceC1231l) objM4514P11, c1836h032, 3126, 0);
                                            c1836h032.m4553p(false);
                                        } else {
                                            c1836h032.m4525a0(-806977106);
                                            c1836h032.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a124;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a1192.getValue()).booleanValue();
                                        boolean zM4538h6 = c1836h032.m4538h(sharedPreferences32);
                                        Object objM4514P12 = c1836h032.m4514P();
                                        if (zM4538h6 || objM4514P12 == c1823e2) {
                                            objM4514P12 = new C5441wh(sharedPreferences32, interfaceC1809a1192, 28);
                                            c1836h032.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "图文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P12, c1836h032, 432, 8);
                                        if (((Boolean) interfaceC1809a1192.getValue()).booleanValue()) {
                                            c1836h032.m4525a0(-806662146);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1202 = interfaceC1809a125;
                                            String str8 = (String) interfaceC1809a1202.getValue();
                                            boolean zM4538h7 = c1836h032.m4538h(sharedPreferences32);
                                            Object objM4514P13 = c1836h032.m4514P();
                                            if (zM4538h7 || objM4514P13 == c1823e2) {
                                                objM4514P13 = new C5441wh(sharedPreferences32, interfaceC1809a1202, 29);
                                                c1836h032.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9304C1("图文排除关键词", "多个关键词用逗号或换行分隔", str8, 2, (InterfaceC1231l) objM4514P13, c1836h032, 3126, 0);
                                            c1836h032.m4553p(false);
                                        } else {
                                            c1836h032.m4525a0(-806308498);
                                            c1836h032.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1212 = interfaceC1809a126;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a1212.getValue()).booleanValue();
                                        boolean zM4538h8 = c1836h032.m4538h(sharedPreferences32);
                                        Object objM4514P14 = c1836h032.m4514P();
                                        if (zM4538h8 || objM4514P14 == c1823e2) {
                                            objM4514P14 = new C4818di(sharedPreferences32, interfaceC1809a1212, 0);
                                            c1836h032.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "视文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P14, c1836h032, 432, 8);
                                        if (((Boolean) interfaceC1809a1212.getValue()).booleanValue()) {
                                            c1836h032.m4525a0(-805993538);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h032, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1222 = interfaceC1809a127;
                                            String str9 = (String) interfaceC1809a1222.getValue();
                                            boolean zM4538h9 = c1836h032.m4538h(sharedPreferences32);
                                            Object objM4514P15 = c1836h032.m4514P();
                                            if (zM4538h9 || objM4514P15 == c1823e2) {
                                                objM4514P15 = new C4818di(sharedPreferences32, interfaceC1809a1222, 1);
                                                c1836h032.m4545k0(objM4514P15);
                                            }
                                            AbstractC4955ho.m9304C1("视文排除关键词", "多个关键词用逗号或换行分隔", str9, 2, (InterfaceC1231l) objM4514P15, c1836h032, 3126, 0);
                                            c1836h032.m4553p(false);
                                        } else {
                                            c1836h032.m4525a0(-805639890);
                                            c1836h032.m4553p(false);
                                        }
                                    } else {
                                        c1836h032.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1232 = interfaceC1809a119;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a1232.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences3;
                                        boolean zM4538h10 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P16 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h10 || objM4514P16 == c1823e3) {
                                            objM4514P16 = new C5019jo(sharedPreferences4, interfaceC1809a1232, 0);
                                            c1836h04.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "文字朋友圈", "允许自动评论", false, (InterfaceC1231l) objM4514P16, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1242 = interfaceC1809a120;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a1242.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P17 = c1836h04.m4514P();
                                        if (zM4538h11 || objM4514P17 == c1823e3) {
                                            objM4514P17 = new C5019jo(sharedPreferences4, interfaceC1809a1242, 1);
                                            c1836h04.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "图片/图文朋友圈", "允许自动评论", false, (InterfaceC1231l) objM4514P17, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1252 = interfaceC1809a121;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a1252.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P18 = c1836h04.m4514P();
                                        if (zM4538h12 || objM4514P18 == c1823e3) {
                                            objM4514P18 = new C5019jo(sharedPreferences4, interfaceC1809a1252, 2);
                                            c1836h04.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "视频/视文朋友圈", "允许自动评论", false, (InterfaceC1231l) objM4514P18, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1262 = interfaceC1809a122;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a1262.getValue()).booleanValue();
                                        boolean zM4538h13 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P19 = c1836h04.m4514P();
                                        if (zM4538h13 || objM4514P19 == c1823e3) {
                                            objM4514P19 = new C5019jo(sharedPreferences4, interfaceC1809a1262, 3);
                                            c1836h04.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "文字朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P19, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a1262.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(472996934);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1272 = interfaceC1809a123;
                                            String str10 = (String) interfaceC1809a1272.getValue();
                                            boolean zM4538h14 = c1836h04.m4538h(sharedPreferences4);
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (zM4538h14 || objM4514P20 == c1823e3) {
                                                objM4514P20 = new C5019jo(sharedPreferences4, interfaceC1809a1272, 4);
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            AbstractC4955ho.m9304C1("文字排除关键词", "多个关键词用逗号或换行分隔", str10, 2, (InterfaceC1231l) objM4514P20, c1836h04, 3126, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(473338089);
                                            c1836h04.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a124;
                                        boolean zBooleanValue11 = ((Boolean) interfaceC1809a128.getValue()).booleanValue();
                                        boolean zM4538h15 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P21 = c1836h04.m4514P();
                                        if (zM4538h15 || objM4514P21 == c1823e3) {
                                            objM4514P21 = new C5019jo(sharedPreferences4, interfaceC1809a128, 5);
                                            c1836h04.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue11, "图文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P21, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a128.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(473656118);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a125;
                                            String str11 = (String) interfaceC1809a129.getValue();
                                            boolean zM4538h16 = c1836h04.m4538h(sharedPreferences4);
                                            Object objM4514P22 = c1836h04.m4514P();
                                            if (zM4538h16 || objM4514P22 == c1823e3) {
                                                objM4514P22 = new C5019jo(sharedPreferences4, interfaceC1809a129, 6);
                                                c1836h04.m4545k0(objM4514P22);
                                            }
                                            AbstractC4955ho.m9304C1("图文排除关键词", "多个关键词用逗号或换行分隔", str11, 2, (InterfaceC1231l) objM4514P22, c1836h04, 3126, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(474012649);
                                            c1836h04.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a130 = interfaceC1809a126;
                                        boolean zBooleanValue12 = ((Boolean) interfaceC1809a130.getValue()).booleanValue();
                                        boolean zM4538h17 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P23 = c1836h04.m4514P();
                                        if (zM4538h17 || objM4514P23 == c1823e3) {
                                            objM4514P23 = new C5019jo(sharedPreferences4, interfaceC1809a130, 7);
                                            c1836h04.m4545k0(objM4514P23);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue12, "视文朋友圈关键词", "开启后按关键词排除", false, (InterfaceC1231l) objM4514P23, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a130.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(474330678);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a131 = interfaceC1809a127;
                                            String str12 = (String) interfaceC1809a131.getValue();
                                            boolean zM4538h18 = c1836h04.m4538h(sharedPreferences4);
                                            Object objM4514P24 = c1836h04.m4514P();
                                            if (zM4538h18 || objM4514P24 == c1823e3) {
                                                objM4514P24 = new C5019jo(sharedPreferences4, interfaceC1809a131, 8);
                                                c1836h04.m4545k0(objM4514P24);
                                            }
                                            AbstractC4955ho.m9304C1("视文排除关键词", "多个关键词用逗号或换行分隔", str12, 2, (InterfaceC1231l) objM4514P24, c1836h04, 3126, 0);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(474687209);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    }, c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
