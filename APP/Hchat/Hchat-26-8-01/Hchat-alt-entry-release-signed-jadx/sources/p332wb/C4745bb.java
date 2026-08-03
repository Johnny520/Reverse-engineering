package p332wb;

import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import okhttp3.HttpUrl;
import p036c9.C0500x0;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3967n;
import sh.C4029m1;

/* JADX INFO: renamed from: wb.bb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4745bb implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16003g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f16004h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16005i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16006j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16007k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16008l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4745bb(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, int i9) {
        this.f16003g = i9;
        this.f16004h = sharedPreferences;
        this.f16005i = interfaceC1809a1;
        this.f16006j = interfaceC1809a12;
        this.f16007k = interfaceC1809a13;
        this.f16008l = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f16003g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 2;
                    final SharedPreferences sharedPreferences = this.f16004h;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f16005i;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f16006j;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f16007k;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f16008l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1600225062, new InterfaceC1235p() { // from class: wb.na
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object c3959f;
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        AbstractC4955ho.m9402O3(sharedPreferences2, "sns_anti_recall_enable", "朋友圈防撤回", "已缓存的朋友圈在对方删除或限制可见范围后继续显示", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a1;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences2);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences2, interfaceC1809a15, 16);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "自定义朋友圈撤回提示", "开启后可自定义朋友圈正文被删除时的提示文案", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a15.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(836444387);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a12;
                                            String str = (String) interfaceC1809a16.getValue();
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (objM4514P2 == c1823e) {
                                                objM4514P2 = new C4944hd(interfaceC1809a16, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("朋友圈提示文案", "默认 [已删除]", str, 0, (InterfaceC1231l) objM4514P2, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(836596225);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences2, "sns_comment_anti_recall_enable", "朋友圈评论防撤回", "已缓存的朋友圈评论被删除后继续显示，并标记已删除", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a13;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences2);
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C5435wb(sharedPreferences2, interfaceC1809a17, 17);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "自定义评论撤回提示", "开启后可自定义朋友圈评论被删除时的提示文案", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a17.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(837427490);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a14;
                                            String str2 = (String) interfaceC1809a18.getValue();
                                            Object objM4514P4 = c1836h02.m4514P();
                                            if (objM4514P4 == c1823e) {
                                                objM4514P4 = new C5534zd(interfaceC1809a18, 0);
                                                c1836h02.m4545k0(objM4514P4);
                                            }
                                            AbstractC4955ho.m9304C1("评论提示文案", "默认 [已删除]", str2, 0, (InterfaceC1231l) objM4514P4, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(837580289);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences2, "sns_force_legacy_profile_enable", "强制旧版个人主页朋友圈", "Flutter 个人主页看不到已删除朋友圈时，改用微信旧版 SnsUserUI", false, c1836h02, 28080);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences3 = sharedPreferences;
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "hb_auto_enable", "自动抢红包", "开启后自动识别并抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9719z2(sharedPreferences3, "hb_grab_mode", "抢包模式", AbstractC4955ho.m9699w6(new C3958e("打开红包页面", 0), new C3958e("静默抢包（后台）", 1)), 1, null, c1836h03, 25008, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "hb_skip_self", "跳过自己的红包", "不会抢自己发出的红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "hb_block_new_group_enable", "自动屏蔽新进群", "新群自动加入适用聊天，并默认关闭该群抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "hb_auto_close", "自动关闭页面", "抢完或失败后自动收起红包页", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a1;
                                        int iIntValue4 = ((Number) interfaceC1809a19.getValue()).intValue();
                                        String str3 = iIntValue4 != 1 ? iIntValue4 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue5 = ((Number) interfaceC1809a19.getValue()).intValue();
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a12;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C4029m1(8, interfaceC1809a19, interfaceC1809a110);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str3, arrayListM9333F6, iIntValue5, (InterfaceC1231l) objM4514P5, false, c1836h03, 24582);
                                        if (((Number) interfaceC1809a19.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-51714471);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a110.getValue();
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C5109mf(interfaceC1809a110, 9);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，保存后生效", str4, (InterfaceC1231l) objM4514P6, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a19.getValue()).intValue() == 1) {
                                            c1836h03.m4525a0(-51494960);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a13;
                                            String str5 = (String) interfaceC1809a111.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5109mf(interfaceC1809a111, 10);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms，保存后生效", str5, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a14;
                                            String str6 = (String) interfaceC1809a112.getValue();
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5109mf(interfaceC1809a112, 11);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str6, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-51183596);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a1;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences;
                                        boolean zM4538h3 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a12;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h3 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C4746bc(sharedPreferences4, interfaceC1809a113, interfaceC1809a114, 3);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "屏蔽艾特所有人", "仅拦截所选群聊的艾特所有人通知", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a113.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1833080695);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                                            InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a13;
                                            String strM2250m = zBooleanValue4 ? "当前屏蔽全部群聊，重新选择后按选择生效" : ((Set) interfaceC1809a115.getValue()).isEmpty() ? "未选择群聊，不会屏蔽通知" : AbstractC0921a.m2250m(((Set) interfaceC1809a115.getValue()).size(), "已选择 ", " 个群聊");
                                            Object objM4514P10 = c1836h04.m4514P();
                                            if (objM4514P10 == c1823e3) {
                                                objM4514P10 = new C0500x0(23, interfaceC1809a115, interfaceC1809a14);
                                                c1836h04.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9503b("选择屏蔽群聊", strM2250m, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1834173352);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a1;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences;
                                        boolean zM4538h4 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences5, interfaceC1809a116, 12);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "抢到后自动回复", "发送到红包所在会话", false, (InterfaceC1231l) objM4514P11, c1836h05, 432, 8);
                                        if (((Boolean) interfaceC1809a116.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(690083194);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t5 = AbstractC4955ho.m9671t5((List) interfaceC1809a12.getValue());
                                            Object objM4514P12 = c1836h05.m4514P();
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a13;
                                            if (objM4514P12 == c1823e4) {
                                                objM4514P12 = new C4749bf(interfaceC1809a117, 1);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9704x3("私聊红包回复", strM9671t5, (InterfaceC1220a) objM4514P12, c1836h05, 390);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t52 = AbstractC4955ho.m9671t5((List) interfaceC1809a14.getValue());
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (objM4514P13 == c1823e4) {
                                                objM4514P13 = new C4749bf(interfaceC1809a117, 2);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9704x3("群红包回复", strM9671t52, (InterfaceC1220a) objM4514P13, c1836h05, 390);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(690693429);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a1;
                                        String str7 = (String) interfaceC1809a118.getValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences;
                                        boolean zM4538h5 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C5242qg(interfaceC1809a118, sharedPreferences6, 24);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9695w2("最小间隔", "单位秒，0-60", str7, (InterfaceC1231l) objM4514P14, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a12;
                                        String str8 = (String) interfaceC1809a119.getValue();
                                        boolean zM4538h6 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P15 = c1836h06.m4514P();
                                        if (zM4538h6 || objM4514P15 == c1823e5) {
                                            objM4514P15 = new C5242qg(interfaceC1809a119, sharedPreferences6, 25);
                                            c1836h06.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9695w2("最大间隔", "单位秒，0-120", str8, (InterfaceC1231l) objM4514P15, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a13;
                                        String str9 = (String) interfaceC1809a120.getValue();
                                        boolean zM4538h7 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h7 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C5242qg(interfaceC1809a120, sharedPreferences6, 26);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9695w2("请求超时", "单位秒，5-60", str9, (InterfaceC1231l) objM4514P16, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a14;
                                        String str10 = (String) interfaceC1809a121.getValue();
                                        boolean zM4538h8 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P17 = c1836h06.m4514P();
                                        if (zM4538h8 || objM4514P17 == c1823e5) {
                                            objM4514P17 = new C5242qg(interfaceC1809a121, sharedPreferences6, 27);
                                            c1836h06.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9695w2("超时重试", "每位好友最多重试 0-5 次", str10, (InterfaceC1231l) objM4514P17, c1836h06, 54);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a1;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences;
                                        boolean zM4538h9 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P18 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h9 || objM4514P18 == c1823e6) {
                                            objM4514P18 = new C5242qg(sharedPreferences7, interfaceC1809a122, 1);
                                            c1836h07.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "文字", "允许自动转发", false, (InterfaceC1231l) objM4514P18, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a12;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a123.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P19 = c1836h07.m4514P();
                                        if (zM4538h10 || objM4514P19 == c1823e6) {
                                            objM4514P19 = new C5242qg(sharedPreferences7, interfaceC1809a123, 2);
                                            c1836h07.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "图片/图文", "允许自动转发", false, (InterfaceC1231l) objM4514P19, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a13;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a124.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P20 = c1836h07.m4514P();
                                        if (zM4538h11 || objM4514P20 == c1823e6) {
                                            objM4514P20 = new C5242qg(sharedPreferences7, interfaceC1809a124, 3);
                                            c1836h07.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "视频/视文", "允许自动转发", false, (InterfaceC1231l) objM4514P20, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a14;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P21 = c1836h07.m4514P();
                                        if (zM4538h12 || objM4514P21 == c1823e6) {
                                            objM4514P21 = new C5242qg(sharedPreferences7, interfaceC1809a125, 4);
                                            c1836h07.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "实况照片", "允许自动转发", false, (InterfaceC1231l) objM4514P21, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a1;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences;
                                        boolean zM4538h13 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P22 = c1836h08.m4514P();
                                        C1823e c1823e7 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P22 == c1823e7) {
                                            objM4514P22 = new C5019jo(sharedPreferences8, interfaceC1809a126, 10);
                                            c1836h08.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "朋友圈自动评论", "按下方规则处理新获取的朋友圈", false, (InterfaceC1231l) objM4514P22, c1836h08, 432, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h08.m4525a0(1171686964);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a12;
                                            String str11 = AbstractC3149m.m6721t0((String) interfaceC1809a127.getValue()) ? "需要填写" : "点击下方中文变量插入到光标位置";
                                            String str12 = (String) interfaceC1809a127.getValue();
                                            List list = AbstractC4955ho.f17697l;
                                            boolean zM4538h14 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P23 = c1836h08.m4514P();
                                            if (zM4538h14 || objM4514P23 == c1823e7) {
                                                objM4514P23 = new C5019jo(sharedPreferences8, interfaceC1809a127, 11);
                                                c1836h08.m4545k0(objM4514P23);
                                            }
                                            AbstractC4955ho.m9571i4("评论内容", str11, str12, list, 3, (InterfaceC1231l) objM4514P23, c1836h08, 24582, 0);
                                            if (AbstractC3149m.m6709h0((String) interfaceC1809a127.getValue(), "${time}", false)) {
                                                c1836h08.m4525a0(1172345993);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a13;
                                                String str13 = (String) interfaceC1809a128.getValue();
                                                try {
                                                    if (str13 == null) {
                                                        str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    String string = AbstractC3149m.m6703R0(str13).toString();
                                                    if (AbstractC3149m.m6721t0(string)) {
                                                        string = "yyyy-MM-dd HH:mm:ss";
                                                    }
                                                    c3959f = new SimpleDateFormat(string, Locale.getDefault());
                                                } catch (Throwable th2) {
                                                    c3959f = new C3959f(th2);
                                                }
                                                String str14 = !(c3959f instanceof C3959f) ? "例如 HH:mm:ss 或 yyyy-MM-dd HH:mm:ss" : "格式无效，当前输入不会保存";
                                                String str15 = (String) interfaceC1809a128.getValue();
                                                boolean zM4538h15 = c1836h08.m4538h(sharedPreferences8);
                                                Object objM4514P24 = c1836h08.m4514P();
                                                if (zM4538h15 || objM4514P24 == c1823e7) {
                                                    objM4514P24 = new C5019jo(sharedPreferences8, interfaceC1809a128, 12);
                                                    c1836h08.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9304C1("时间变量格式", str14, str15, 0, (InterfaceC1231l) objM4514P24, c1836h08, 6, 8);
                                                c1836h08.m4553p(false);
                                            } else {
                                                c1836h08.m4525a0(1173331018);
                                                c1836h08.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a14;
                                            boolean zBooleanValue11 = ((Boolean) interfaceC1809a129.getValue()).booleanValue();
                                            boolean zM4538h16 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P25 = c1836h08.m4514P();
                                            if (zM4538h16 || objM4514P25 == c1823e7) {
                                                objM4514P25 = new C5019jo(sharedPreferences8, interfaceC1809a129, 13);
                                                c1836h08.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue11, "评论自己的朋友圈", "自己的朋友圈不受好友名单限制", false, (InterfaceC1231l) objM4514P25, c1836h08, 432, 8);
                                            c1836h08.m4553p(false);
                                        } else {
                                            c1836h08.m4525a0(1173645482);
                                            c1836h08.m4553p(false);
                                        }
                                    } else {
                                        c1836h08.m4519V();
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
                    final SharedPreferences sharedPreferences2 = this.f16004h;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f16005i;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f16006j;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f16007k;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f16008l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1785254830, new InterfaceC1235p() { // from class: wb.na
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object c3959f;
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_anti_recall_enable", "朋友圈防撤回", "已缓存的朋友圈在对方删除或限制可见范围后继续显示", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a15;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a152.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a152, 16);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "自定义朋友圈撤回提示", "开启后可自定义朋友圈正文被删除时的提示文案", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a152.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(836444387);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a16;
                                            String str = (String) interfaceC1809a162.getValue();
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (objM4514P2 == c1823e) {
                                                objM4514P2 = new C4944hd(interfaceC1809a162, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("朋友圈提示文案", "默认 [已删除]", str, 0, (InterfaceC1231l) objM4514P2, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(836596225);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_comment_anti_recall_enable", "朋友圈评论防撤回", "已缓存的朋友圈评论被删除后继续显示，并标记已删除", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C5435wb(sharedPreferences22, interfaceC1809a172, 17);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "自定义评论撤回提示", "开启后可自定义朋友圈评论被删除时的提示文案", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(837427490);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a18;
                                            String str2 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P4 = c1836h02.m4514P();
                                            if (objM4514P4 == c1823e) {
                                                objM4514P4 = new C5534zd(interfaceC1809a182, 0);
                                                c1836h02.m4545k0(objM4514P4);
                                            }
                                            AbstractC4955ho.m9304C1("评论提示文案", "默认 [已删除]", str2, 0, (InterfaceC1231l) objM4514P4, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(837580289);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_force_legacy_profile_enable", "强制旧版个人主页朋友圈", "Flutter 个人主页看不到已删除朋友圈时，改用微信旧版 SnsUserUI", false, c1836h02, 28080);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "hb_auto_enable", "自动抢红包", "开启后自动识别并抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9719z2(sharedPreferences3, "hb_grab_mode", "抢包模式", AbstractC4955ho.m9699w6(new C3958e("打开红包页面", 0), new C3958e("静默抢包（后台）", 1)), 1, null, c1836h03, 25008, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "hb_skip_self", "跳过自己的红包", "不会抢自己发出的红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "hb_block_new_group_enable", "自动屏蔽新进群", "新群自动加入适用聊天，并默认关闭该群抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "hb_auto_close", "自动关闭页面", "抢完或失败后自动收起红包页", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a15;
                                        int iIntValue4 = ((Number) interfaceC1809a19.getValue()).intValue();
                                        String str3 = iIntValue4 != 1 ? iIntValue4 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue5 = ((Number) interfaceC1809a19.getValue()).intValue();
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a16;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C4029m1(8, interfaceC1809a19, interfaceC1809a110);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str3, arrayListM9333F6, iIntValue5, (InterfaceC1231l) objM4514P5, false, c1836h03, 24582);
                                        if (((Number) interfaceC1809a19.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-51714471);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a110.getValue();
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C5109mf(interfaceC1809a110, 9);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，保存后生效", str4, (InterfaceC1231l) objM4514P6, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a19.getValue()).intValue() == 1) {
                                            c1836h03.m4525a0(-51494960);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a17;
                                            String str5 = (String) interfaceC1809a111.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5109mf(interfaceC1809a111, 10);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms，保存后生效", str5, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a18;
                                            String str6 = (String) interfaceC1809a112.getValue();
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5109mf(interfaceC1809a112, 11);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str6, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-51183596);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a15;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences2;
                                        boolean zM4538h3 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a16;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h3 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C4746bc(sharedPreferences4, interfaceC1809a113, interfaceC1809a114, 3);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "屏蔽艾特所有人", "仅拦截所选群聊的艾特所有人通知", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a113.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1833080695);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                                            InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a17;
                                            String strM2250m = zBooleanValue4 ? "当前屏蔽全部群聊，重新选择后按选择生效" : ((Set) interfaceC1809a115.getValue()).isEmpty() ? "未选择群聊，不会屏蔽通知" : AbstractC0921a.m2250m(((Set) interfaceC1809a115.getValue()).size(), "已选择 ", " 个群聊");
                                            Object objM4514P10 = c1836h04.m4514P();
                                            if (objM4514P10 == c1823e3) {
                                                objM4514P10 = new C0500x0(23, interfaceC1809a115, interfaceC1809a18);
                                                c1836h04.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9503b("选择屏蔽群聊", strM2250m, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1834173352);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a15;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences2;
                                        boolean zM4538h4 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences5, interfaceC1809a116, 12);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "抢到后自动回复", "发送到红包所在会话", false, (InterfaceC1231l) objM4514P11, c1836h05, 432, 8);
                                        if (((Boolean) interfaceC1809a116.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(690083194);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t5 = AbstractC4955ho.m9671t5((List) interfaceC1809a16.getValue());
                                            Object objM4514P12 = c1836h05.m4514P();
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a17;
                                            if (objM4514P12 == c1823e4) {
                                                objM4514P12 = new C4749bf(interfaceC1809a117, 1);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9704x3("私聊红包回复", strM9671t5, (InterfaceC1220a) objM4514P12, c1836h05, 390);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t52 = AbstractC4955ho.m9671t5((List) interfaceC1809a18.getValue());
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (objM4514P13 == c1823e4) {
                                                objM4514P13 = new C4749bf(interfaceC1809a117, 2);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9704x3("群红包回复", strM9671t52, (InterfaceC1220a) objM4514P13, c1836h05, 390);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(690693429);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a15;
                                        String str7 = (String) interfaceC1809a118.getValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences2;
                                        boolean zM4538h5 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C5242qg(interfaceC1809a118, sharedPreferences6, 24);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9695w2("最小间隔", "单位秒，0-60", str7, (InterfaceC1231l) objM4514P14, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a16;
                                        String str8 = (String) interfaceC1809a119.getValue();
                                        boolean zM4538h6 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P15 = c1836h06.m4514P();
                                        if (zM4538h6 || objM4514P15 == c1823e5) {
                                            objM4514P15 = new C5242qg(interfaceC1809a119, sharedPreferences6, 25);
                                            c1836h06.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9695w2("最大间隔", "单位秒，0-120", str8, (InterfaceC1231l) objM4514P15, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a17;
                                        String str9 = (String) interfaceC1809a120.getValue();
                                        boolean zM4538h7 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h7 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C5242qg(interfaceC1809a120, sharedPreferences6, 26);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9695w2("请求超时", "单位秒，5-60", str9, (InterfaceC1231l) objM4514P16, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a18;
                                        String str10 = (String) interfaceC1809a121.getValue();
                                        boolean zM4538h8 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P17 = c1836h06.m4514P();
                                        if (zM4538h8 || objM4514P17 == c1823e5) {
                                            objM4514P17 = new C5242qg(interfaceC1809a121, sharedPreferences6, 27);
                                            c1836h06.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9695w2("超时重试", "每位好友最多重试 0-5 次", str10, (InterfaceC1231l) objM4514P17, c1836h06, 54);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a15;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences2;
                                        boolean zM4538h9 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P18 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h9 || objM4514P18 == c1823e6) {
                                            objM4514P18 = new C5242qg(sharedPreferences7, interfaceC1809a122, 1);
                                            c1836h07.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "文字", "允许自动转发", false, (InterfaceC1231l) objM4514P18, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a16;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a123.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P19 = c1836h07.m4514P();
                                        if (zM4538h10 || objM4514P19 == c1823e6) {
                                            objM4514P19 = new C5242qg(sharedPreferences7, interfaceC1809a123, 2);
                                            c1836h07.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "图片/图文", "允许自动转发", false, (InterfaceC1231l) objM4514P19, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a17;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a124.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P20 = c1836h07.m4514P();
                                        if (zM4538h11 || objM4514P20 == c1823e6) {
                                            objM4514P20 = new C5242qg(sharedPreferences7, interfaceC1809a124, 3);
                                            c1836h07.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "视频/视文", "允许自动转发", false, (InterfaceC1231l) objM4514P20, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a18;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P21 = c1836h07.m4514P();
                                        if (zM4538h12 || objM4514P21 == c1823e6) {
                                            objM4514P21 = new C5242qg(sharedPreferences7, interfaceC1809a125, 4);
                                            c1836h07.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "实况照片", "允许自动转发", false, (InterfaceC1231l) objM4514P21, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a15;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences2;
                                        boolean zM4538h13 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P22 = c1836h08.m4514P();
                                        C1823e c1823e7 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P22 == c1823e7) {
                                            objM4514P22 = new C5019jo(sharedPreferences8, interfaceC1809a126, 10);
                                            c1836h08.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "朋友圈自动评论", "按下方规则处理新获取的朋友圈", false, (InterfaceC1231l) objM4514P22, c1836h08, 432, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h08.m4525a0(1171686964);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a16;
                                            String str11 = AbstractC3149m.m6721t0((String) interfaceC1809a127.getValue()) ? "需要填写" : "点击下方中文变量插入到光标位置";
                                            String str12 = (String) interfaceC1809a127.getValue();
                                            List list = AbstractC4955ho.f17697l;
                                            boolean zM4538h14 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P23 = c1836h08.m4514P();
                                            if (zM4538h14 || objM4514P23 == c1823e7) {
                                                objM4514P23 = new C5019jo(sharedPreferences8, interfaceC1809a127, 11);
                                                c1836h08.m4545k0(objM4514P23);
                                            }
                                            AbstractC4955ho.m9571i4("评论内容", str11, str12, list, 3, (InterfaceC1231l) objM4514P23, c1836h08, 24582, 0);
                                            if (AbstractC3149m.m6709h0((String) interfaceC1809a127.getValue(), "${time}", false)) {
                                                c1836h08.m4525a0(1172345993);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a17;
                                                String str13 = (String) interfaceC1809a128.getValue();
                                                try {
                                                    if (str13 == null) {
                                                        str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    String string = AbstractC3149m.m6703R0(str13).toString();
                                                    if (AbstractC3149m.m6721t0(string)) {
                                                        string = "yyyy-MM-dd HH:mm:ss";
                                                    }
                                                    c3959f = new SimpleDateFormat(string, Locale.getDefault());
                                                } catch (Throwable th2) {
                                                    c3959f = new C3959f(th2);
                                                }
                                                String str14 = !(c3959f instanceof C3959f) ? "例如 HH:mm:ss 或 yyyy-MM-dd HH:mm:ss" : "格式无效，当前输入不会保存";
                                                String str15 = (String) interfaceC1809a128.getValue();
                                                boolean zM4538h15 = c1836h08.m4538h(sharedPreferences8);
                                                Object objM4514P24 = c1836h08.m4514P();
                                                if (zM4538h15 || objM4514P24 == c1823e7) {
                                                    objM4514P24 = new C5019jo(sharedPreferences8, interfaceC1809a128, 12);
                                                    c1836h08.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9304C1("时间变量格式", str14, str15, 0, (InterfaceC1231l) objM4514P24, c1836h08, 6, 8);
                                                c1836h08.m4553p(false);
                                            } else {
                                                c1836h08.m4525a0(1173331018);
                                                c1836h08.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a18;
                                            boolean zBooleanValue11 = ((Boolean) interfaceC1809a129.getValue()).booleanValue();
                                            boolean zM4538h16 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P25 = c1836h08.m4514P();
                                            if (zM4538h16 || objM4514P25 == c1823e7) {
                                                objM4514P25 = new C5019jo(sharedPreferences8, interfaceC1809a129, 13);
                                                c1836h08.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue11, "评论自己的朋友圈", "自己的朋友圈不受好友名单限制", false, (InterfaceC1231l) objM4514P25, c1836h08, 432, 8);
                                            c1836h08.m4553p(false);
                                        } else {
                                            c1836h08.m4525a0(1173645482);
                                            c1836h08.m4553p(false);
                                        }
                                    } else {
                                        c1836h08.m4519V();
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
                    final int i13 = 3;
                    final SharedPreferences sharedPreferences3 = this.f16004h;
                    final InterfaceC1809a1 interfaceC1809a19 = this.f16005i;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f16006j;
                    final InterfaceC1809a1 interfaceC1809a111 = this.f16007k;
                    final InterfaceC1809a1 interfaceC1809a112 = this.f16008l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1081442029, new InterfaceC1235p() { // from class: wb.na
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object c3959f;
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences3;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_anti_recall_enable", "朋友圈防撤回", "已缓存的朋友圈在对方删除或限制可见范围后继续显示", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a19;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a152.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a152, 16);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "自定义朋友圈撤回提示", "开启后可自定义朋友圈正文被删除时的提示文案", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a152.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(836444387);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a110;
                                            String str = (String) interfaceC1809a162.getValue();
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (objM4514P2 == c1823e) {
                                                objM4514P2 = new C4944hd(interfaceC1809a162, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("朋友圈提示文案", "默认 [已删除]", str, 0, (InterfaceC1231l) objM4514P2, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(836596225);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_comment_anti_recall_enable", "朋友圈评论防撤回", "已缓存的朋友圈评论被删除后继续显示，并标记已删除", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a111;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C5435wb(sharedPreferences22, interfaceC1809a172, 17);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "自定义评论撤回提示", "开启后可自定义朋友圈评论被删除时的提示文案", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(837427490);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a112;
                                            String str2 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P4 = c1836h02.m4514P();
                                            if (objM4514P4 == c1823e) {
                                                objM4514P4 = new C5534zd(interfaceC1809a182, 0);
                                                c1836h02.m4545k0(objM4514P4);
                                            }
                                            AbstractC4955ho.m9304C1("评论提示文案", "默认 [已删除]", str2, 0, (InterfaceC1231l) objM4514P4, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(837580289);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_force_legacy_profile_enable", "强制旧版个人主页朋友圈", "Flutter 个人主页看不到已删除朋友圈时，改用微信旧版 SnsUserUI", false, c1836h02, 28080);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences3;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_enable", "自动抢红包", "开启后自动识别并抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9719z2(sharedPreferences32, "hb_grab_mode", "抢包模式", AbstractC4955ho.m9699w6(new C3958e("打开红包页面", 0), new C3958e("静默抢包（后台）", 1)), 1, null, c1836h03, 25008, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_skip_self", "跳过自己的红包", "不会抢自己发出的红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_block_new_group_enable", "自动屏蔽新进群", "新群自动加入适用聊天，并默认关闭该群抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_close", "自动关闭页面", "抢完或失败后自动收起红包页", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a19;
                                        int iIntValue4 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        String str3 = iIntValue4 != 1 ? iIntValue4 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue5 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a110;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C4029m1(8, interfaceC1809a192, interfaceC1809a1102);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str3, arrayListM9333F6, iIntValue5, (InterfaceC1231l) objM4514P5, false, c1836h03, 24582);
                                        if (((Number) interfaceC1809a192.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-51714471);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a1102.getValue();
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C5109mf(interfaceC1809a1102, 9);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，保存后生效", str4, (InterfaceC1231l) objM4514P6, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a192.getValue()).intValue() == 1) {
                                            c1836h03.m4525a0(-51494960);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a111;
                                            String str5 = (String) interfaceC1809a1112.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5109mf(interfaceC1809a1112, 10);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms，保存后生效", str5, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a112;
                                            String str6 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5109mf(interfaceC1809a1122, 11);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str6, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-51183596);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a19;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences3;
                                        boolean zM4538h3 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a110;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h3 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C4746bc(sharedPreferences4, interfaceC1809a113, interfaceC1809a114, 3);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "屏蔽艾特所有人", "仅拦截所选群聊的艾特所有人通知", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a113.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1833080695);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                                            InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a111;
                                            String strM2250m = zBooleanValue4 ? "当前屏蔽全部群聊，重新选择后按选择生效" : ((Set) interfaceC1809a115.getValue()).isEmpty() ? "未选择群聊，不会屏蔽通知" : AbstractC0921a.m2250m(((Set) interfaceC1809a115.getValue()).size(), "已选择 ", " 个群聊");
                                            Object objM4514P10 = c1836h04.m4514P();
                                            if (objM4514P10 == c1823e3) {
                                                objM4514P10 = new C0500x0(23, interfaceC1809a115, interfaceC1809a112);
                                                c1836h04.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9503b("选择屏蔽群聊", strM2250m, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1834173352);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a19;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences3;
                                        boolean zM4538h4 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences5, interfaceC1809a116, 12);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "抢到后自动回复", "发送到红包所在会话", false, (InterfaceC1231l) objM4514P11, c1836h05, 432, 8);
                                        if (((Boolean) interfaceC1809a116.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(690083194);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t5 = AbstractC4955ho.m9671t5((List) interfaceC1809a110.getValue());
                                            Object objM4514P12 = c1836h05.m4514P();
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a111;
                                            if (objM4514P12 == c1823e4) {
                                                objM4514P12 = new C4749bf(interfaceC1809a117, 1);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9704x3("私聊红包回复", strM9671t5, (InterfaceC1220a) objM4514P12, c1836h05, 390);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t52 = AbstractC4955ho.m9671t5((List) interfaceC1809a112.getValue());
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (objM4514P13 == c1823e4) {
                                                objM4514P13 = new C4749bf(interfaceC1809a117, 2);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9704x3("群红包回复", strM9671t52, (InterfaceC1220a) objM4514P13, c1836h05, 390);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(690693429);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a19;
                                        String str7 = (String) interfaceC1809a118.getValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences3;
                                        boolean zM4538h5 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C5242qg(interfaceC1809a118, sharedPreferences6, 24);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9695w2("最小间隔", "单位秒，0-60", str7, (InterfaceC1231l) objM4514P14, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a110;
                                        String str8 = (String) interfaceC1809a119.getValue();
                                        boolean zM4538h6 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P15 = c1836h06.m4514P();
                                        if (zM4538h6 || objM4514P15 == c1823e5) {
                                            objM4514P15 = new C5242qg(interfaceC1809a119, sharedPreferences6, 25);
                                            c1836h06.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9695w2("最大间隔", "单位秒，0-120", str8, (InterfaceC1231l) objM4514P15, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a111;
                                        String str9 = (String) interfaceC1809a120.getValue();
                                        boolean zM4538h7 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h7 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C5242qg(interfaceC1809a120, sharedPreferences6, 26);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9695w2("请求超时", "单位秒，5-60", str9, (InterfaceC1231l) objM4514P16, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a112;
                                        String str10 = (String) interfaceC1809a121.getValue();
                                        boolean zM4538h8 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P17 = c1836h06.m4514P();
                                        if (zM4538h8 || objM4514P17 == c1823e5) {
                                            objM4514P17 = new C5242qg(interfaceC1809a121, sharedPreferences6, 27);
                                            c1836h06.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9695w2("超时重试", "每位好友最多重试 0-5 次", str10, (InterfaceC1231l) objM4514P17, c1836h06, 54);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a19;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences3;
                                        boolean zM4538h9 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P18 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h9 || objM4514P18 == c1823e6) {
                                            objM4514P18 = new C5242qg(sharedPreferences7, interfaceC1809a122, 1);
                                            c1836h07.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "文字", "允许自动转发", false, (InterfaceC1231l) objM4514P18, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a110;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a123.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P19 = c1836h07.m4514P();
                                        if (zM4538h10 || objM4514P19 == c1823e6) {
                                            objM4514P19 = new C5242qg(sharedPreferences7, interfaceC1809a123, 2);
                                            c1836h07.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "图片/图文", "允许自动转发", false, (InterfaceC1231l) objM4514P19, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a111;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a124.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P20 = c1836h07.m4514P();
                                        if (zM4538h11 || objM4514P20 == c1823e6) {
                                            objM4514P20 = new C5242qg(sharedPreferences7, interfaceC1809a124, 3);
                                            c1836h07.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "视频/视文", "允许自动转发", false, (InterfaceC1231l) objM4514P20, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a112;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P21 = c1836h07.m4514P();
                                        if (zM4538h12 || objM4514P21 == c1823e6) {
                                            objM4514P21 = new C5242qg(sharedPreferences7, interfaceC1809a125, 4);
                                            c1836h07.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "实况照片", "允许自动转发", false, (InterfaceC1231l) objM4514P21, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a19;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences3;
                                        boolean zM4538h13 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P22 = c1836h08.m4514P();
                                        C1823e c1823e7 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P22 == c1823e7) {
                                            objM4514P22 = new C5019jo(sharedPreferences8, interfaceC1809a126, 10);
                                            c1836h08.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "朋友圈自动评论", "按下方规则处理新获取的朋友圈", false, (InterfaceC1231l) objM4514P22, c1836h08, 432, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h08.m4525a0(1171686964);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a110;
                                            String str11 = AbstractC3149m.m6721t0((String) interfaceC1809a127.getValue()) ? "需要填写" : "点击下方中文变量插入到光标位置";
                                            String str12 = (String) interfaceC1809a127.getValue();
                                            List list = AbstractC4955ho.f17697l;
                                            boolean zM4538h14 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P23 = c1836h08.m4514P();
                                            if (zM4538h14 || objM4514P23 == c1823e7) {
                                                objM4514P23 = new C5019jo(sharedPreferences8, interfaceC1809a127, 11);
                                                c1836h08.m4545k0(objM4514P23);
                                            }
                                            AbstractC4955ho.m9571i4("评论内容", str11, str12, list, 3, (InterfaceC1231l) objM4514P23, c1836h08, 24582, 0);
                                            if (AbstractC3149m.m6709h0((String) interfaceC1809a127.getValue(), "${time}", false)) {
                                                c1836h08.m4525a0(1172345993);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a111;
                                                String str13 = (String) interfaceC1809a128.getValue();
                                                try {
                                                    if (str13 == null) {
                                                        str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    String string = AbstractC3149m.m6703R0(str13).toString();
                                                    if (AbstractC3149m.m6721t0(string)) {
                                                        string = "yyyy-MM-dd HH:mm:ss";
                                                    }
                                                    c3959f = new SimpleDateFormat(string, Locale.getDefault());
                                                } catch (Throwable th2) {
                                                    c3959f = new C3959f(th2);
                                                }
                                                String str14 = !(c3959f instanceof C3959f) ? "例如 HH:mm:ss 或 yyyy-MM-dd HH:mm:ss" : "格式无效，当前输入不会保存";
                                                String str15 = (String) interfaceC1809a128.getValue();
                                                boolean zM4538h15 = c1836h08.m4538h(sharedPreferences8);
                                                Object objM4514P24 = c1836h08.m4514P();
                                                if (zM4538h15 || objM4514P24 == c1823e7) {
                                                    objM4514P24 = new C5019jo(sharedPreferences8, interfaceC1809a128, 12);
                                                    c1836h08.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9304C1("时间变量格式", str14, str15, 0, (InterfaceC1231l) objM4514P24, c1836h08, 6, 8);
                                                c1836h08.m4553p(false);
                                            } else {
                                                c1836h08.m4525a0(1173331018);
                                                c1836h08.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a112;
                                            boolean zBooleanValue11 = ((Boolean) interfaceC1809a129.getValue()).booleanValue();
                                            boolean zM4538h16 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P25 = c1836h08.m4514P();
                                            if (zM4538h16 || objM4514P25 == c1823e7) {
                                                objM4514P25 = new C5019jo(sharedPreferences8, interfaceC1809a129, 13);
                                                c1836h08.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue11, "评论自己的朋友圈", "自己的朋友圈不受好友名单限制", false, (InterfaceC1231l) objM4514P25, c1836h08, 432, 8);
                                            c1836h08.m4553p(false);
                                        } else {
                                            c1836h08.m4525a0(1173645482);
                                            c1836h08.m4553p(false);
                                        }
                                    } else {
                                        c1836h08.m4519V();
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
            case 3:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i14 = 5;
                    final SharedPreferences sharedPreferences4 = this.f16004h;
                    final InterfaceC1809a1 interfaceC1809a113 = this.f16005i;
                    final InterfaceC1809a1 interfaceC1809a114 = this.f16006j;
                    final InterfaceC1809a1 interfaceC1809a115 = this.f16007k;
                    final InterfaceC1809a1 interfaceC1809a116 = this.f16008l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1868505552, new InterfaceC1235p() { // from class: wb.na
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object c3959f;
                            switch (i14) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences4;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_anti_recall_enable", "朋友圈防撤回", "已缓存的朋友圈在对方删除或限制可见范围后继续显示", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a113;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a152.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a152, 16);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "自定义朋友圈撤回提示", "开启后可自定义朋友圈正文被删除时的提示文案", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a152.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(836444387);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a114;
                                            String str = (String) interfaceC1809a162.getValue();
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (objM4514P2 == c1823e) {
                                                objM4514P2 = new C4944hd(interfaceC1809a162, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("朋友圈提示文案", "默认 [已删除]", str, 0, (InterfaceC1231l) objM4514P2, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(836596225);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_comment_anti_recall_enable", "朋友圈评论防撤回", "已缓存的朋友圈评论被删除后继续显示，并标记已删除", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a115;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C5435wb(sharedPreferences22, interfaceC1809a172, 17);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "自定义评论撤回提示", "开启后可自定义朋友圈评论被删除时的提示文案", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(837427490);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a116;
                                            String str2 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P4 = c1836h02.m4514P();
                                            if (objM4514P4 == c1823e) {
                                                objM4514P4 = new C5534zd(interfaceC1809a182, 0);
                                                c1836h02.m4545k0(objM4514P4);
                                            }
                                            AbstractC4955ho.m9304C1("评论提示文案", "默认 [已删除]", str2, 0, (InterfaceC1231l) objM4514P4, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(837580289);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_force_legacy_profile_enable", "强制旧版个人主页朋友圈", "Flutter 个人主页看不到已删除朋友圈时，改用微信旧版 SnsUserUI", false, c1836h02, 28080);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences4;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_enable", "自动抢红包", "开启后自动识别并抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9719z2(sharedPreferences32, "hb_grab_mode", "抢包模式", AbstractC4955ho.m9699w6(new C3958e("打开红包页面", 0), new C3958e("静默抢包（后台）", 1)), 1, null, c1836h03, 25008, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_skip_self", "跳过自己的红包", "不会抢自己发出的红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_block_new_group_enable", "自动屏蔽新进群", "新群自动加入适用聊天，并默认关闭该群抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_close", "自动关闭页面", "抢完或失败后自动收起红包页", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a113;
                                        int iIntValue4 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        String str3 = iIntValue4 != 1 ? iIntValue4 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue5 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a114;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C4029m1(8, interfaceC1809a192, interfaceC1809a1102);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str3, arrayListM9333F6, iIntValue5, (InterfaceC1231l) objM4514P5, false, c1836h03, 24582);
                                        if (((Number) interfaceC1809a192.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-51714471);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a1102.getValue();
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C5109mf(interfaceC1809a1102, 9);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，保存后生效", str4, (InterfaceC1231l) objM4514P6, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a192.getValue()).intValue() == 1) {
                                            c1836h03.m4525a0(-51494960);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a115;
                                            String str5 = (String) interfaceC1809a1112.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5109mf(interfaceC1809a1112, 10);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms，保存后生效", str5, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a116;
                                            String str6 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5109mf(interfaceC1809a1122, 11);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str6, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-51183596);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a113;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1132.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences4;
                                        boolean zM4538h3 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a114;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h3 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C4746bc(sharedPreferences42, interfaceC1809a1132, interfaceC1809a1142, 3);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "屏蔽艾特所有人", "仅拦截所选群聊的艾特所有人通知", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a1132.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1833080695);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a1142.getValue()).booleanValue();
                                            InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a115;
                                            String strM2250m = zBooleanValue4 ? "当前屏蔽全部群聊，重新选择后按选择生效" : ((Set) interfaceC1809a1152.getValue()).isEmpty() ? "未选择群聊，不会屏蔽通知" : AbstractC0921a.m2250m(((Set) interfaceC1809a1152.getValue()).size(), "已选择 ", " 个群聊");
                                            Object objM4514P10 = c1836h04.m4514P();
                                            if (objM4514P10 == c1823e3) {
                                                objM4514P10 = new C0500x0(23, interfaceC1809a1152, interfaceC1809a116);
                                                c1836h04.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9503b("选择屏蔽群聊", strM2250m, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1834173352);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a113;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a1162.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences4;
                                        boolean zM4538h4 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences5, interfaceC1809a1162, 12);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "抢到后自动回复", "发送到红包所在会话", false, (InterfaceC1231l) objM4514P11, c1836h05, 432, 8);
                                        if (((Boolean) interfaceC1809a1162.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(690083194);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t5 = AbstractC4955ho.m9671t5((List) interfaceC1809a114.getValue());
                                            Object objM4514P12 = c1836h05.m4514P();
                                            InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a115;
                                            if (objM4514P12 == c1823e4) {
                                                objM4514P12 = new C4749bf(interfaceC1809a117, 1);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9704x3("私聊红包回复", strM9671t5, (InterfaceC1220a) objM4514P12, c1836h05, 390);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t52 = AbstractC4955ho.m9671t5((List) interfaceC1809a116.getValue());
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (objM4514P13 == c1823e4) {
                                                objM4514P13 = new C4749bf(interfaceC1809a117, 2);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9704x3("群红包回复", strM9671t52, (InterfaceC1220a) objM4514P13, c1836h05, 390);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(690693429);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a113;
                                        String str7 = (String) interfaceC1809a118.getValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences4;
                                        boolean zM4538h5 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C5242qg(interfaceC1809a118, sharedPreferences6, 24);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9695w2("最小间隔", "单位秒，0-60", str7, (InterfaceC1231l) objM4514P14, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a114;
                                        String str8 = (String) interfaceC1809a119.getValue();
                                        boolean zM4538h6 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P15 = c1836h06.m4514P();
                                        if (zM4538h6 || objM4514P15 == c1823e5) {
                                            objM4514P15 = new C5242qg(interfaceC1809a119, sharedPreferences6, 25);
                                            c1836h06.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9695w2("最大间隔", "单位秒，0-120", str8, (InterfaceC1231l) objM4514P15, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a115;
                                        String str9 = (String) interfaceC1809a120.getValue();
                                        boolean zM4538h7 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h7 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C5242qg(interfaceC1809a120, sharedPreferences6, 26);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9695w2("请求超时", "单位秒，5-60", str9, (InterfaceC1231l) objM4514P16, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a116;
                                        String str10 = (String) interfaceC1809a121.getValue();
                                        boolean zM4538h8 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P17 = c1836h06.m4514P();
                                        if (zM4538h8 || objM4514P17 == c1823e5) {
                                            objM4514P17 = new C5242qg(interfaceC1809a121, sharedPreferences6, 27);
                                            c1836h06.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9695w2("超时重试", "每位好友最多重试 0-5 次", str10, (InterfaceC1231l) objM4514P17, c1836h06, 54);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a113;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences4;
                                        boolean zM4538h9 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P18 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h9 || objM4514P18 == c1823e6) {
                                            objM4514P18 = new C5242qg(sharedPreferences7, interfaceC1809a122, 1);
                                            c1836h07.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "文字", "允许自动转发", false, (InterfaceC1231l) objM4514P18, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a114;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a123.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P19 = c1836h07.m4514P();
                                        if (zM4538h10 || objM4514P19 == c1823e6) {
                                            objM4514P19 = new C5242qg(sharedPreferences7, interfaceC1809a123, 2);
                                            c1836h07.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "图片/图文", "允许自动转发", false, (InterfaceC1231l) objM4514P19, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a115;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a124.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P20 = c1836h07.m4514P();
                                        if (zM4538h11 || objM4514P20 == c1823e6) {
                                            objM4514P20 = new C5242qg(sharedPreferences7, interfaceC1809a124, 3);
                                            c1836h07.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "视频/视文", "允许自动转发", false, (InterfaceC1231l) objM4514P20, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a116;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P21 = c1836h07.m4514P();
                                        if (zM4538h12 || objM4514P21 == c1823e6) {
                                            objM4514P21 = new C5242qg(sharedPreferences7, interfaceC1809a125, 4);
                                            c1836h07.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "实况照片", "允许自动转发", false, (InterfaceC1231l) objM4514P21, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a113;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences4;
                                        boolean zM4538h13 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P22 = c1836h08.m4514P();
                                        C1823e c1823e7 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P22 == c1823e7) {
                                            objM4514P22 = new C5019jo(sharedPreferences8, interfaceC1809a126, 10);
                                            c1836h08.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "朋友圈自动评论", "按下方规则处理新获取的朋友圈", false, (InterfaceC1231l) objM4514P22, c1836h08, 432, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h08.m4525a0(1171686964);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a114;
                                            String str11 = AbstractC3149m.m6721t0((String) interfaceC1809a127.getValue()) ? "需要填写" : "点击下方中文变量插入到光标位置";
                                            String str12 = (String) interfaceC1809a127.getValue();
                                            List list = AbstractC4955ho.f17697l;
                                            boolean zM4538h14 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P23 = c1836h08.m4514P();
                                            if (zM4538h14 || objM4514P23 == c1823e7) {
                                                objM4514P23 = new C5019jo(sharedPreferences8, interfaceC1809a127, 11);
                                                c1836h08.m4545k0(objM4514P23);
                                            }
                                            AbstractC4955ho.m9571i4("评论内容", str11, str12, list, 3, (InterfaceC1231l) objM4514P23, c1836h08, 24582, 0);
                                            if (AbstractC3149m.m6709h0((String) interfaceC1809a127.getValue(), "${time}", false)) {
                                                c1836h08.m4525a0(1172345993);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a115;
                                                String str13 = (String) interfaceC1809a128.getValue();
                                                try {
                                                    if (str13 == null) {
                                                        str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    String string = AbstractC3149m.m6703R0(str13).toString();
                                                    if (AbstractC3149m.m6721t0(string)) {
                                                        string = "yyyy-MM-dd HH:mm:ss";
                                                    }
                                                    c3959f = new SimpleDateFormat(string, Locale.getDefault());
                                                } catch (Throwable th2) {
                                                    c3959f = new C3959f(th2);
                                                }
                                                String str14 = !(c3959f instanceof C3959f) ? "例如 HH:mm:ss 或 yyyy-MM-dd HH:mm:ss" : "格式无效，当前输入不会保存";
                                                String str15 = (String) interfaceC1809a128.getValue();
                                                boolean zM4538h15 = c1836h08.m4538h(sharedPreferences8);
                                                Object objM4514P24 = c1836h08.m4514P();
                                                if (zM4538h15 || objM4514P24 == c1823e7) {
                                                    objM4514P24 = new C5019jo(sharedPreferences8, interfaceC1809a128, 12);
                                                    c1836h08.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9304C1("时间变量格式", str14, str15, 0, (InterfaceC1231l) objM4514P24, c1836h08, 6, 8);
                                                c1836h08.m4553p(false);
                                            } else {
                                                c1836h08.m4525a0(1173331018);
                                                c1836h08.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a116;
                                            boolean zBooleanValue11 = ((Boolean) interfaceC1809a129.getValue()).booleanValue();
                                            boolean zM4538h16 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P25 = c1836h08.m4514P();
                                            if (zM4538h16 || objM4514P25 == c1823e7) {
                                                objM4514P25 = new C5019jo(sharedPreferences8, interfaceC1809a129, 13);
                                                c1836h08.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue11, "评论自己的朋友圈", "自己的朋友圈不受好友名单限制", false, (InterfaceC1231l) objM4514P25, c1836h08, 432, 8);
                                            c1836h08.m4553p(false);
                                        } else {
                                            c1836h08.m4525a0(1173645482);
                                            c1836h08.m4553p(false);
                                        }
                                    } else {
                                        c1836h08.m4519V();
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
            case 4:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i15 = 4;
                    final SharedPreferences sharedPreferences5 = this.f16004h;
                    final InterfaceC1809a1 interfaceC1809a117 = this.f16005i;
                    final InterfaceC1809a1 interfaceC1809a118 = this.f16006j;
                    final InterfaceC1809a1 interfaceC1809a119 = this.f16007k;
                    final InterfaceC1809a1 interfaceC1809a120 = this.f16008l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1028464257, new InterfaceC1235p() { // from class: wb.na
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object c3959f;
                            switch (i15) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences5;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_anti_recall_enable", "朋友圈防撤回", "已缓存的朋友圈在对方删除或限制可见范围后继续显示", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a117;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a152.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a152, 16);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "自定义朋友圈撤回提示", "开启后可自定义朋友圈正文被删除时的提示文案", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a152.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(836444387);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a118;
                                            String str = (String) interfaceC1809a162.getValue();
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (objM4514P2 == c1823e) {
                                                objM4514P2 = new C4944hd(interfaceC1809a162, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("朋友圈提示文案", "默认 [已删除]", str, 0, (InterfaceC1231l) objM4514P2, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(836596225);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_comment_anti_recall_enable", "朋友圈评论防撤回", "已缓存的朋友圈评论被删除后继续显示，并标记已删除", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a119;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C5435wb(sharedPreferences22, interfaceC1809a172, 17);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "自定义评论撤回提示", "开启后可自定义朋友圈评论被删除时的提示文案", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(837427490);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a120;
                                            String str2 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P4 = c1836h02.m4514P();
                                            if (objM4514P4 == c1823e) {
                                                objM4514P4 = new C5534zd(interfaceC1809a182, 0);
                                                c1836h02.m4545k0(objM4514P4);
                                            }
                                            AbstractC4955ho.m9304C1("评论提示文案", "默认 [已删除]", str2, 0, (InterfaceC1231l) objM4514P4, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(837580289);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_force_legacy_profile_enable", "强制旧版个人主页朋友圈", "Flutter 个人主页看不到已删除朋友圈时，改用微信旧版 SnsUserUI", false, c1836h02, 28080);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences5;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_enable", "自动抢红包", "开启后自动识别并抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9719z2(sharedPreferences32, "hb_grab_mode", "抢包模式", AbstractC4955ho.m9699w6(new C3958e("打开红包页面", 0), new C3958e("静默抢包（后台）", 1)), 1, null, c1836h03, 25008, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_skip_self", "跳过自己的红包", "不会抢自己发出的红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_block_new_group_enable", "自动屏蔽新进群", "新群自动加入适用聊天，并默认关闭该群抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_close", "自动关闭页面", "抢完或失败后自动收起红包页", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a117;
                                        int iIntValue4 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        String str3 = iIntValue4 != 1 ? iIntValue4 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue5 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a118;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C4029m1(8, interfaceC1809a192, interfaceC1809a1102);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str3, arrayListM9333F6, iIntValue5, (InterfaceC1231l) objM4514P5, false, c1836h03, 24582);
                                        if (((Number) interfaceC1809a192.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-51714471);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a1102.getValue();
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C5109mf(interfaceC1809a1102, 9);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，保存后生效", str4, (InterfaceC1231l) objM4514P6, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a192.getValue()).intValue() == 1) {
                                            c1836h03.m4525a0(-51494960);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a119;
                                            String str5 = (String) interfaceC1809a1112.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5109mf(interfaceC1809a1112, 10);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms，保存后生效", str5, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a120;
                                            String str6 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5109mf(interfaceC1809a1122, 11);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str6, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-51183596);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a117;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1132.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences5;
                                        boolean zM4538h3 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a118;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h3 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C4746bc(sharedPreferences42, interfaceC1809a1132, interfaceC1809a1142, 3);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "屏蔽艾特所有人", "仅拦截所选群聊的艾特所有人通知", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a1132.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1833080695);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a1142.getValue()).booleanValue();
                                            InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a119;
                                            String strM2250m = zBooleanValue4 ? "当前屏蔽全部群聊，重新选择后按选择生效" : ((Set) interfaceC1809a1152.getValue()).isEmpty() ? "未选择群聊，不会屏蔽通知" : AbstractC0921a.m2250m(((Set) interfaceC1809a1152.getValue()).size(), "已选择 ", " 个群聊");
                                            Object objM4514P10 = c1836h04.m4514P();
                                            if (objM4514P10 == c1823e3) {
                                                objM4514P10 = new C0500x0(23, interfaceC1809a1152, interfaceC1809a120);
                                                c1836h04.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9503b("选择屏蔽群聊", strM2250m, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1834173352);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a117;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a1162.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences52 = sharedPreferences5;
                                        boolean zM4538h4 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences52, interfaceC1809a1162, 12);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "抢到后自动回复", "发送到红包所在会话", false, (InterfaceC1231l) objM4514P11, c1836h05, 432, 8);
                                        if (((Boolean) interfaceC1809a1162.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(690083194);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t5 = AbstractC4955ho.m9671t5((List) interfaceC1809a118.getValue());
                                            Object objM4514P12 = c1836h05.m4514P();
                                            InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a119;
                                            if (objM4514P12 == c1823e4) {
                                                objM4514P12 = new C4749bf(interfaceC1809a1172, 1);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9704x3("私聊红包回复", strM9671t5, (InterfaceC1220a) objM4514P12, c1836h05, 390);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t52 = AbstractC4955ho.m9671t5((List) interfaceC1809a120.getValue());
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (objM4514P13 == c1823e4) {
                                                objM4514P13 = new C4749bf(interfaceC1809a1172, 2);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9704x3("群红包回复", strM9671t52, (InterfaceC1220a) objM4514P13, c1836h05, 390);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(690693429);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a117;
                                        String str7 = (String) interfaceC1809a1182.getValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences5;
                                        boolean zM4538h5 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C5242qg(interfaceC1809a1182, sharedPreferences6, 24);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9695w2("最小间隔", "单位秒，0-60", str7, (InterfaceC1231l) objM4514P14, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a118;
                                        String str8 = (String) interfaceC1809a1192.getValue();
                                        boolean zM4538h6 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P15 = c1836h06.m4514P();
                                        if (zM4538h6 || objM4514P15 == c1823e5) {
                                            objM4514P15 = new C5242qg(interfaceC1809a1192, sharedPreferences6, 25);
                                            c1836h06.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9695w2("最大间隔", "单位秒，0-120", str8, (InterfaceC1231l) objM4514P15, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1202 = interfaceC1809a119;
                                        String str9 = (String) interfaceC1809a1202.getValue();
                                        boolean zM4538h7 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h7 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C5242qg(interfaceC1809a1202, sharedPreferences6, 26);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9695w2("请求超时", "单位秒，5-60", str9, (InterfaceC1231l) objM4514P16, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a120;
                                        String str10 = (String) interfaceC1809a121.getValue();
                                        boolean zM4538h8 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P17 = c1836h06.m4514P();
                                        if (zM4538h8 || objM4514P17 == c1823e5) {
                                            objM4514P17 = new C5242qg(interfaceC1809a121, sharedPreferences6, 27);
                                            c1836h06.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9695w2("超时重试", "每位好友最多重试 0-5 次", str10, (InterfaceC1231l) objM4514P17, c1836h06, 54);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a117;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences5;
                                        boolean zM4538h9 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P18 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h9 || objM4514P18 == c1823e6) {
                                            objM4514P18 = new C5242qg(sharedPreferences7, interfaceC1809a122, 1);
                                            c1836h07.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "文字", "允许自动转发", false, (InterfaceC1231l) objM4514P18, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a118;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a123.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P19 = c1836h07.m4514P();
                                        if (zM4538h10 || objM4514P19 == c1823e6) {
                                            objM4514P19 = new C5242qg(sharedPreferences7, interfaceC1809a123, 2);
                                            c1836h07.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "图片/图文", "允许自动转发", false, (InterfaceC1231l) objM4514P19, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a119;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a124.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P20 = c1836h07.m4514P();
                                        if (zM4538h11 || objM4514P20 == c1823e6) {
                                            objM4514P20 = new C5242qg(sharedPreferences7, interfaceC1809a124, 3);
                                            c1836h07.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "视频/视文", "允许自动转发", false, (InterfaceC1231l) objM4514P20, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a120;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P21 = c1836h07.m4514P();
                                        if (zM4538h12 || objM4514P21 == c1823e6) {
                                            objM4514P21 = new C5242qg(sharedPreferences7, interfaceC1809a125, 4);
                                            c1836h07.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "实况照片", "允许自动转发", false, (InterfaceC1231l) objM4514P21, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a117;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences5;
                                        boolean zM4538h13 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P22 = c1836h08.m4514P();
                                        C1823e c1823e7 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P22 == c1823e7) {
                                            objM4514P22 = new C5019jo(sharedPreferences8, interfaceC1809a126, 10);
                                            c1836h08.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "朋友圈自动评论", "按下方规则处理新获取的朋友圈", false, (InterfaceC1231l) objM4514P22, c1836h08, 432, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h08.m4525a0(1171686964);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a118;
                                            String str11 = AbstractC3149m.m6721t0((String) interfaceC1809a127.getValue()) ? "需要填写" : "点击下方中文变量插入到光标位置";
                                            String str12 = (String) interfaceC1809a127.getValue();
                                            List list = AbstractC4955ho.f17697l;
                                            boolean zM4538h14 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P23 = c1836h08.m4514P();
                                            if (zM4538h14 || objM4514P23 == c1823e7) {
                                                objM4514P23 = new C5019jo(sharedPreferences8, interfaceC1809a127, 11);
                                                c1836h08.m4545k0(objM4514P23);
                                            }
                                            AbstractC4955ho.m9571i4("评论内容", str11, str12, list, 3, (InterfaceC1231l) objM4514P23, c1836h08, 24582, 0);
                                            if (AbstractC3149m.m6709h0((String) interfaceC1809a127.getValue(), "${time}", false)) {
                                                c1836h08.m4525a0(1172345993);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a119;
                                                String str13 = (String) interfaceC1809a128.getValue();
                                                try {
                                                    if (str13 == null) {
                                                        str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    String string = AbstractC3149m.m6703R0(str13).toString();
                                                    if (AbstractC3149m.m6721t0(string)) {
                                                        string = "yyyy-MM-dd HH:mm:ss";
                                                    }
                                                    c3959f = new SimpleDateFormat(string, Locale.getDefault());
                                                } catch (Throwable th2) {
                                                    c3959f = new C3959f(th2);
                                                }
                                                String str14 = !(c3959f instanceof C3959f) ? "例如 HH:mm:ss 或 yyyy-MM-dd HH:mm:ss" : "格式无效，当前输入不会保存";
                                                String str15 = (String) interfaceC1809a128.getValue();
                                                boolean zM4538h15 = c1836h08.m4538h(sharedPreferences8);
                                                Object objM4514P24 = c1836h08.m4514P();
                                                if (zM4538h15 || objM4514P24 == c1823e7) {
                                                    objM4514P24 = new C5019jo(sharedPreferences8, interfaceC1809a128, 12);
                                                    c1836h08.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9304C1("时间变量格式", str14, str15, 0, (InterfaceC1231l) objM4514P24, c1836h08, 6, 8);
                                                c1836h08.m4553p(false);
                                            } else {
                                                c1836h08.m4525a0(1173331018);
                                                c1836h08.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a120;
                                            boolean zBooleanValue11 = ((Boolean) interfaceC1809a129.getValue()).booleanValue();
                                            boolean zM4538h16 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P25 = c1836h08.m4514P();
                                            if (zM4538h16 || objM4514P25 == c1823e7) {
                                                objM4514P25 = new C5019jo(sharedPreferences8, interfaceC1809a129, 13);
                                                c1836h08.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue11, "评论自己的朋友圈", "自己的朋友圈不受好友名单限制", false, (InterfaceC1231l) objM4514P25, c1836h08, 432, 8);
                                            c1836h08.m4553p(false);
                                        } else {
                                            c1836h08.m4525a0(1173645482);
                                            c1836h08.m4553p(false);
                                        }
                                    } else {
                                        c1836h08.m4519V();
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
            case 5:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i16 = 0;
                    final SharedPreferences sharedPreferences6 = this.f16004h;
                    final InterfaceC1809a1 interfaceC1809a121 = this.f16005i;
                    final InterfaceC1809a1 interfaceC1809a122 = this.f16006j;
                    final InterfaceC1809a1 interfaceC1809a123 = this.f16007k;
                    final InterfaceC1809a1 interfaceC1809a124 = this.f16008l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1316099519, new InterfaceC1235p() { // from class: wb.na
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object c3959f;
                            switch (i16) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences6;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_anti_recall_enable", "朋友圈防撤回", "已缓存的朋友圈在对方删除或限制可见范围后继续显示", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a121;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a152.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a152, 16);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "自定义朋友圈撤回提示", "开启后可自定义朋友圈正文被删除时的提示文案", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a152.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(836444387);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a122;
                                            String str = (String) interfaceC1809a162.getValue();
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (objM4514P2 == c1823e) {
                                                objM4514P2 = new C4944hd(interfaceC1809a162, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("朋友圈提示文案", "默认 [已删除]", str, 0, (InterfaceC1231l) objM4514P2, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(836596225);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_comment_anti_recall_enable", "朋友圈评论防撤回", "已缓存的朋友圈评论被删除后继续显示，并标记已删除", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a123;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C5435wb(sharedPreferences22, interfaceC1809a172, 17);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "自定义评论撤回提示", "开启后可自定义朋友圈评论被删除时的提示文案", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(837427490);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a124;
                                            String str2 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P4 = c1836h02.m4514P();
                                            if (objM4514P4 == c1823e) {
                                                objM4514P4 = new C5534zd(interfaceC1809a182, 0);
                                                c1836h02.m4545k0(objM4514P4);
                                            }
                                            AbstractC4955ho.m9304C1("评论提示文案", "默认 [已删除]", str2, 0, (InterfaceC1231l) objM4514P4, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(837580289);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_force_legacy_profile_enable", "强制旧版个人主页朋友圈", "Flutter 个人主页看不到已删除朋友圈时，改用微信旧版 SnsUserUI", false, c1836h02, 28080);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences6;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_enable", "自动抢红包", "开启后自动识别并抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9719z2(sharedPreferences32, "hb_grab_mode", "抢包模式", AbstractC4955ho.m9699w6(new C3958e("打开红包页面", 0), new C3958e("静默抢包（后台）", 1)), 1, null, c1836h03, 25008, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_skip_self", "跳过自己的红包", "不会抢自己发出的红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_block_new_group_enable", "自动屏蔽新进群", "新群自动加入适用聊天，并默认关闭该群抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_close", "自动关闭页面", "抢完或失败后自动收起红包页", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a121;
                                        int iIntValue4 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        String str3 = iIntValue4 != 1 ? iIntValue4 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue5 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a122;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C4029m1(8, interfaceC1809a192, interfaceC1809a1102);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str3, arrayListM9333F6, iIntValue5, (InterfaceC1231l) objM4514P5, false, c1836h03, 24582);
                                        if (((Number) interfaceC1809a192.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-51714471);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a1102.getValue();
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C5109mf(interfaceC1809a1102, 9);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，保存后生效", str4, (InterfaceC1231l) objM4514P6, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a192.getValue()).intValue() == 1) {
                                            c1836h03.m4525a0(-51494960);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a123;
                                            String str5 = (String) interfaceC1809a1112.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5109mf(interfaceC1809a1112, 10);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms，保存后生效", str5, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a124;
                                            String str6 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5109mf(interfaceC1809a1122, 11);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str6, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-51183596);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a121;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1132.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences6;
                                        boolean zM4538h3 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a122;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h3 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C4746bc(sharedPreferences42, interfaceC1809a1132, interfaceC1809a1142, 3);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "屏蔽艾特所有人", "仅拦截所选群聊的艾特所有人通知", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a1132.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1833080695);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a1142.getValue()).booleanValue();
                                            InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a123;
                                            String strM2250m = zBooleanValue4 ? "当前屏蔽全部群聊，重新选择后按选择生效" : ((Set) interfaceC1809a1152.getValue()).isEmpty() ? "未选择群聊，不会屏蔽通知" : AbstractC0921a.m2250m(((Set) interfaceC1809a1152.getValue()).size(), "已选择 ", " 个群聊");
                                            Object objM4514P10 = c1836h04.m4514P();
                                            if (objM4514P10 == c1823e3) {
                                                objM4514P10 = new C0500x0(23, interfaceC1809a1152, interfaceC1809a124);
                                                c1836h04.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9503b("选择屏蔽群聊", strM2250m, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1834173352);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a121;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a1162.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences52 = sharedPreferences6;
                                        boolean zM4538h4 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences52, interfaceC1809a1162, 12);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "抢到后自动回复", "发送到红包所在会话", false, (InterfaceC1231l) objM4514P11, c1836h05, 432, 8);
                                        if (((Boolean) interfaceC1809a1162.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(690083194);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t5 = AbstractC4955ho.m9671t5((List) interfaceC1809a122.getValue());
                                            Object objM4514P12 = c1836h05.m4514P();
                                            InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a123;
                                            if (objM4514P12 == c1823e4) {
                                                objM4514P12 = new C4749bf(interfaceC1809a1172, 1);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9704x3("私聊红包回复", strM9671t5, (InterfaceC1220a) objM4514P12, c1836h05, 390);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t52 = AbstractC4955ho.m9671t5((List) interfaceC1809a124.getValue());
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (objM4514P13 == c1823e4) {
                                                objM4514P13 = new C4749bf(interfaceC1809a1172, 2);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9704x3("群红包回复", strM9671t52, (InterfaceC1220a) objM4514P13, c1836h05, 390);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(690693429);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a121;
                                        String str7 = (String) interfaceC1809a1182.getValue();
                                        SharedPreferences sharedPreferences62 = sharedPreferences6;
                                        boolean zM4538h5 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C5242qg(interfaceC1809a1182, sharedPreferences62, 24);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9695w2("最小间隔", "单位秒，0-60", str7, (InterfaceC1231l) objM4514P14, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a122;
                                        String str8 = (String) interfaceC1809a1192.getValue();
                                        boolean zM4538h6 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P15 = c1836h06.m4514P();
                                        if (zM4538h6 || objM4514P15 == c1823e5) {
                                            objM4514P15 = new C5242qg(interfaceC1809a1192, sharedPreferences62, 25);
                                            c1836h06.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9695w2("最大间隔", "单位秒，0-120", str8, (InterfaceC1231l) objM4514P15, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1202 = interfaceC1809a123;
                                        String str9 = (String) interfaceC1809a1202.getValue();
                                        boolean zM4538h7 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h7 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C5242qg(interfaceC1809a1202, sharedPreferences62, 26);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9695w2("请求超时", "单位秒，5-60", str9, (InterfaceC1231l) objM4514P16, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1212 = interfaceC1809a124;
                                        String str10 = (String) interfaceC1809a1212.getValue();
                                        boolean zM4538h8 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P17 = c1836h06.m4514P();
                                        if (zM4538h8 || objM4514P17 == c1823e5) {
                                            objM4514P17 = new C5242qg(interfaceC1809a1212, sharedPreferences62, 27);
                                            c1836h06.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9695w2("超时重试", "每位好友最多重试 0-5 次", str10, (InterfaceC1231l) objM4514P17, c1836h06, 54);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1222 = interfaceC1809a121;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a1222.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences6;
                                        boolean zM4538h9 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P18 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h9 || objM4514P18 == c1823e6) {
                                            objM4514P18 = new C5242qg(sharedPreferences7, interfaceC1809a1222, 1);
                                            c1836h07.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "文字", "允许自动转发", false, (InterfaceC1231l) objM4514P18, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1232 = interfaceC1809a122;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a1232.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P19 = c1836h07.m4514P();
                                        if (zM4538h10 || objM4514P19 == c1823e6) {
                                            objM4514P19 = new C5242qg(sharedPreferences7, interfaceC1809a1232, 2);
                                            c1836h07.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "图片/图文", "允许自动转发", false, (InterfaceC1231l) objM4514P19, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1242 = interfaceC1809a123;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a1242.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P20 = c1836h07.m4514P();
                                        if (zM4538h11 || objM4514P20 == c1823e6) {
                                            objM4514P20 = new C5242qg(sharedPreferences7, interfaceC1809a1242, 3);
                                            c1836h07.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "视频/视文", "允许自动转发", false, (InterfaceC1231l) objM4514P20, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a124;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P21 = c1836h07.m4514P();
                                        if (zM4538h12 || objM4514P21 == c1823e6) {
                                            objM4514P21 = new C5242qg(sharedPreferences7, interfaceC1809a125, 4);
                                            c1836h07.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "实况照片", "允许自动转发", false, (InterfaceC1231l) objM4514P21, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a126 = interfaceC1809a121;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences6;
                                        boolean zM4538h13 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P22 = c1836h08.m4514P();
                                        C1823e c1823e7 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P22 == c1823e7) {
                                            objM4514P22 = new C5019jo(sharedPreferences8, interfaceC1809a126, 10);
                                            c1836h08.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "朋友圈自动评论", "按下方规则处理新获取的朋友圈", false, (InterfaceC1231l) objM4514P22, c1836h08, 432, 8);
                                        if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                                            c1836h08.m4525a0(1171686964);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a127 = interfaceC1809a122;
                                            String str11 = AbstractC3149m.m6721t0((String) interfaceC1809a127.getValue()) ? "需要填写" : "点击下方中文变量插入到光标位置";
                                            String str12 = (String) interfaceC1809a127.getValue();
                                            List list = AbstractC4955ho.f17697l;
                                            boolean zM4538h14 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P23 = c1836h08.m4514P();
                                            if (zM4538h14 || objM4514P23 == c1823e7) {
                                                objM4514P23 = new C5019jo(sharedPreferences8, interfaceC1809a127, 11);
                                                c1836h08.m4545k0(objM4514P23);
                                            }
                                            AbstractC4955ho.m9571i4("评论内容", str11, str12, list, 3, (InterfaceC1231l) objM4514P23, c1836h08, 24582, 0);
                                            if (AbstractC3149m.m6709h0((String) interfaceC1809a127.getValue(), "${time}", false)) {
                                                c1836h08.m4525a0(1172345993);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a128 = interfaceC1809a123;
                                                String str13 = (String) interfaceC1809a128.getValue();
                                                try {
                                                    if (str13 == null) {
                                                        str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    String string = AbstractC3149m.m6703R0(str13).toString();
                                                    if (AbstractC3149m.m6721t0(string)) {
                                                        string = "yyyy-MM-dd HH:mm:ss";
                                                    }
                                                    c3959f = new SimpleDateFormat(string, Locale.getDefault());
                                                } catch (Throwable th2) {
                                                    c3959f = new C3959f(th2);
                                                }
                                                String str14 = !(c3959f instanceof C3959f) ? "例如 HH:mm:ss 或 yyyy-MM-dd HH:mm:ss" : "格式无效，当前输入不会保存";
                                                String str15 = (String) interfaceC1809a128.getValue();
                                                boolean zM4538h15 = c1836h08.m4538h(sharedPreferences8);
                                                Object objM4514P24 = c1836h08.m4514P();
                                                if (zM4538h15 || objM4514P24 == c1823e7) {
                                                    objM4514P24 = new C5019jo(sharedPreferences8, interfaceC1809a128, 12);
                                                    c1836h08.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9304C1("时间变量格式", str14, str15, 0, (InterfaceC1231l) objM4514P24, c1836h08, 6, 8);
                                                c1836h08.m4553p(false);
                                            } else {
                                                c1836h08.m4525a0(1173331018);
                                                c1836h08.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a124;
                                            boolean zBooleanValue11 = ((Boolean) interfaceC1809a129.getValue()).booleanValue();
                                            boolean zM4538h16 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P25 = c1836h08.m4514P();
                                            if (zM4538h16 || objM4514P25 == c1823e7) {
                                                objM4514P25 = new C5019jo(sharedPreferences8, interfaceC1809a129, 13);
                                                c1836h08.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue11, "评论自己的朋友圈", "自己的朋友圈不受好友名单限制", false, (InterfaceC1231l) objM4514P25, c1836h08, 432, 8);
                                            c1836h08.m4553p(false);
                                        } else {
                                            c1836h08.m4525a0(1173645482);
                                            c1836h08.m4553p(false);
                                        }
                                    } else {
                                        c1836h08.m4519V();
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
                    final int i17 = 6;
                    final SharedPreferences sharedPreferences7 = this.f16004h;
                    final InterfaceC1809a1 interfaceC1809a125 = this.f16005i;
                    final InterfaceC1809a1 interfaceC1809a126 = this.f16006j;
                    final InterfaceC1809a1 interfaceC1809a127 = this.f16007k;
                    final InterfaceC1809a1 interfaceC1809a128 = this.f16008l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(416113816, new InterfaceC1235p() { // from class: wb.na
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object c3959f;
                            switch (i17) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences7;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_anti_recall_enable", "朋友圈防撤回", "已缓存的朋友圈在对方删除或限制可见范围后继续显示", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a125;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a152.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a152, 16);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "自定义朋友圈撤回提示", "开启后可自定义朋友圈正文被删除时的提示文案", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a152.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(836444387);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a126;
                                            String str = (String) interfaceC1809a162.getValue();
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (objM4514P2 == c1823e) {
                                                objM4514P2 = new C4944hd(interfaceC1809a162, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("朋友圈提示文案", "默认 [已删除]", str, 0, (InterfaceC1231l) objM4514P2, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(836596225);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_comment_anti_recall_enable", "朋友圈评论防撤回", "已缓存的朋友圈评论被删除后继续显示，并标记已删除", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a127;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            objM4514P3 = new C5435wb(sharedPreferences22, interfaceC1809a172, 17);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "自定义评论撤回提示", "开启后可自定义朋友圈评论被删除时的提示文案", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(837427490);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a128;
                                            String str2 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P4 = c1836h02.m4514P();
                                            if (objM4514P4 == c1823e) {
                                                objM4514P4 = new C5534zd(interfaceC1809a182, 0);
                                                c1836h02.m4545k0(objM4514P4);
                                            }
                                            AbstractC4955ho.m9304C1("评论提示文案", "默认 [已删除]", str2, 0, (InterfaceC1231l) objM4514P4, c1836h02, 24630, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(837580289);
                                            c1836h02.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "sns_force_legacy_profile_enable", "强制旧版个人主页朋友圈", "Flutter 个人主页看不到已删除朋友圈时，改用微信旧版 SnsUserUI", false, c1836h02, 28080);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences7;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_enable", "自动抢红包", "开启后自动识别并抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9719z2(sharedPreferences32, "hb_grab_mode", "抢包模式", AbstractC4955ho.m9699w6(new C3958e("打开红包页面", 0), new C3958e("静默抢包（后台）", 1)), 1, null, c1836h03, 25008, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_skip_self", "跳过自己的红包", "不会抢自己发出的红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_block_new_group_enable", "自动屏蔽新进群", "新群自动加入适用聊天，并默认关闭该群抢红包", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "hb_auto_close", "自动关闭页面", "抢完或失败后自动收起红包页", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a125;
                                        int iIntValue4 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        String str3 = iIntValue4 != 1 ? iIntValue4 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue5 = ((Number) interfaceC1809a192.getValue()).intValue();
                                        Object objM4514P5 = c1836h03.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a126;
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P5 == c1823e2) {
                                            objM4514P5 = new C4029m1(8, interfaceC1809a192, interfaceC1809a1102);
                                            c1836h03.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str3, arrayListM9333F6, iIntValue5, (InterfaceC1231l) objM4514P5, false, c1836h03, 24582);
                                        if (((Number) interfaceC1809a192.getValue()).intValue() == 2) {
                                            c1836h03.m4525a0(-51714471);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str4 = (String) interfaceC1809a1102.getValue();
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C5109mf(interfaceC1809a1102, 9);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，保存后生效", str4, (InterfaceC1231l) objM4514P6, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else if (((Number) interfaceC1809a192.getValue()).intValue() == 1) {
                                            c1836h03.m4525a0(-51494960);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a127;
                                            String str5 = (String) interfaceC1809a1112.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5109mf(interfaceC1809a1112, 10);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms，保存后生效", str5, (InterfaceC1231l) objM4514P7, c1836h03, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a128;
                                            String str6 = (String) interfaceC1809a1122.getValue();
                                            Object objM4514P8 = c1836h03.m4514P();
                                            if (objM4514P8 == c1823e2) {
                                                objM4514P8 = new C5109mf(interfaceC1809a1122, 11);
                                                c1836h03.m4545k0(objM4514P8);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str6, (InterfaceC1231l) objM4514P8, c1836h03, 3126);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-51183596);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a125;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1132.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences7;
                                        boolean zM4538h3 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a126;
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h3 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C4746bc(sharedPreferences42, interfaceC1809a1132, interfaceC1809a1142, 3);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "屏蔽艾特所有人", "仅拦截所选群聊的艾特所有人通知", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a1132.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1833080695);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a1142.getValue()).booleanValue();
                                            InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a127;
                                            String strM2250m = zBooleanValue4 ? "当前屏蔽全部群聊，重新选择后按选择生效" : ((Set) interfaceC1809a1152.getValue()).isEmpty() ? "未选择群聊，不会屏蔽通知" : AbstractC0921a.m2250m(((Set) interfaceC1809a1152.getValue()).size(), "已选择 ", " 个群聊");
                                            Object objM4514P10 = c1836h04.m4514P();
                                            if (objM4514P10 == c1823e3) {
                                                objM4514P10 = new C0500x0(23, interfaceC1809a1152, interfaceC1809a128);
                                                c1836h04.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9503b("选择屏蔽群聊", strM2250m, (InterfaceC1220a) objM4514P10, c1836h04, 390);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1834173352);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a125;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a1162.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences52 = sharedPreferences7;
                                        boolean zM4538h4 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences52, interfaceC1809a1162, 12);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "抢到后自动回复", "发送到红包所在会话", false, (InterfaceC1231l) objM4514P11, c1836h05, 432, 8);
                                        if (((Boolean) interfaceC1809a1162.getValue()).booleanValue()) {
                                            c1836h05.m4525a0(690083194);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t5 = AbstractC4955ho.m9671t5((List) interfaceC1809a126.getValue());
                                            Object objM4514P12 = c1836h05.m4514P();
                                            InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a127;
                                            if (objM4514P12 == c1823e4) {
                                                objM4514P12 = new C4749bf(interfaceC1809a1172, 1);
                                                c1836h05.m4545k0(objM4514P12);
                                            }
                                            AbstractC4955ho.m9704x3("私聊红包回复", strM9671t5, (InterfaceC1220a) objM4514P12, c1836h05, 390);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                            String strM9671t52 = AbstractC4955ho.m9671t5((List) interfaceC1809a128.getValue());
                                            Object objM4514P13 = c1836h05.m4514P();
                                            if (objM4514P13 == c1823e4) {
                                                objM4514P13 = new C4749bf(interfaceC1809a1172, 2);
                                                c1836h05.m4545k0(objM4514P13);
                                            }
                                            AbstractC4955ho.m9704x3("群红包回复", strM9671t52, (InterfaceC1220a) objM4514P13, c1836h05, 390);
                                            c1836h05.m4553p(false);
                                        } else {
                                            c1836h05.m4525a0(690693429);
                                            c1836h05.m4553p(false);
                                        }
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a125;
                                        String str7 = (String) interfaceC1809a1182.getValue();
                                        SharedPreferences sharedPreferences62 = sharedPreferences7;
                                        boolean zM4538h5 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C5242qg(interfaceC1809a1182, sharedPreferences62, 24);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9695w2("最小间隔", "单位秒，0-60", str7, (InterfaceC1231l) objM4514P14, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a126;
                                        String str8 = (String) interfaceC1809a1192.getValue();
                                        boolean zM4538h6 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P15 = c1836h06.m4514P();
                                        if (zM4538h6 || objM4514P15 == c1823e5) {
                                            objM4514P15 = new C5242qg(interfaceC1809a1192, sharedPreferences62, 25);
                                            c1836h06.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9695w2("最大间隔", "单位秒，0-120", str8, (InterfaceC1231l) objM4514P15, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1202 = interfaceC1809a127;
                                        String str9 = (String) interfaceC1809a1202.getValue();
                                        boolean zM4538h7 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h7 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C5242qg(interfaceC1809a1202, sharedPreferences62, 26);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9695w2("请求超时", "单位秒，5-60", str9, (InterfaceC1231l) objM4514P16, c1836h06, 54);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1212 = interfaceC1809a128;
                                        String str10 = (String) interfaceC1809a1212.getValue();
                                        boolean zM4538h8 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P17 = c1836h06.m4514P();
                                        if (zM4538h8 || objM4514P17 == c1823e5) {
                                            objM4514P17 = new C5242qg(interfaceC1809a1212, sharedPreferences62, 27);
                                            c1836h06.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9695w2("超时重试", "每位好友最多重试 0-5 次", str10, (InterfaceC1231l) objM4514P17, c1836h06, 54);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1222 = interfaceC1809a125;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a1222.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences72 = sharedPreferences7;
                                        boolean zM4538h9 = c1836h07.m4538h(sharedPreferences72);
                                        Object objM4514P18 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h9 || objM4514P18 == c1823e6) {
                                            objM4514P18 = new C5242qg(sharedPreferences72, interfaceC1809a1222, 1);
                                            c1836h07.m4545k0(objM4514P18);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "文字", "允许自动转发", false, (InterfaceC1231l) objM4514P18, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1232 = interfaceC1809a126;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a1232.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h07.m4538h(sharedPreferences72);
                                        Object objM4514P19 = c1836h07.m4514P();
                                        if (zM4538h10 || objM4514P19 == c1823e6) {
                                            objM4514P19 = new C5242qg(sharedPreferences72, interfaceC1809a1232, 2);
                                            c1836h07.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "图片/图文", "允许自动转发", false, (InterfaceC1231l) objM4514P19, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1242 = interfaceC1809a127;
                                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a1242.getValue()).booleanValue();
                                        boolean zM4538h11 = c1836h07.m4538h(sharedPreferences72);
                                        Object objM4514P20 = c1836h07.m4514P();
                                        if (zM4538h11 || objM4514P20 == c1823e6) {
                                            objM4514P20 = new C5242qg(sharedPreferences72, interfaceC1809a1242, 3);
                                            c1836h07.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue8, "视频/视文", "允许自动转发", false, (InterfaceC1231l) objM4514P20, c1836h07, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1252 = interfaceC1809a128;
                                        boolean zBooleanValue9 = ((Boolean) interfaceC1809a1252.getValue()).booleanValue();
                                        boolean zM4538h12 = c1836h07.m4538h(sharedPreferences72);
                                        Object objM4514P21 = c1836h07.m4514P();
                                        if (zM4538h12 || objM4514P21 == c1823e6) {
                                            objM4514P21 = new C5242qg(sharedPreferences72, interfaceC1809a1252, 4);
                                            c1836h07.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue9, "实况照片", "允许自动转发", false, (InterfaceC1231l) objM4514P21, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue10 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1262 = interfaceC1809a125;
                                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a1262.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences7;
                                        boolean zM4538h13 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P22 = c1836h08.m4514P();
                                        C1823e c1823e7 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P22 == c1823e7) {
                                            objM4514P22 = new C5019jo(sharedPreferences8, interfaceC1809a1262, 10);
                                            c1836h08.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue10, "朋友圈自动评论", "按下方规则处理新获取的朋友圈", false, (InterfaceC1231l) objM4514P22, c1836h08, 432, 8);
                                        if (((Boolean) interfaceC1809a1262.getValue()).booleanValue()) {
                                            c1836h08.m4525a0(1171686964);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1272 = interfaceC1809a126;
                                            String str11 = AbstractC3149m.m6721t0((String) interfaceC1809a1272.getValue()) ? "需要填写" : "点击下方中文变量插入到光标位置";
                                            String str12 = (String) interfaceC1809a1272.getValue();
                                            List list = AbstractC4955ho.f17697l;
                                            boolean zM4538h14 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P23 = c1836h08.m4514P();
                                            if (zM4538h14 || objM4514P23 == c1823e7) {
                                                objM4514P23 = new C5019jo(sharedPreferences8, interfaceC1809a1272, 11);
                                                c1836h08.m4545k0(objM4514P23);
                                            }
                                            AbstractC4955ho.m9571i4("评论内容", str11, str12, list, 3, (InterfaceC1231l) objM4514P23, c1836h08, 24582, 0);
                                            if (AbstractC3149m.m6709h0((String) interfaceC1809a1272.getValue(), "${time}", false)) {
                                                c1836h08.m4525a0(1172345993);
                                                AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                                InterfaceC1809a1 interfaceC1809a1282 = interfaceC1809a127;
                                                String str13 = (String) interfaceC1809a1282.getValue();
                                                try {
                                                    if (str13 == null) {
                                                        str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    String string = AbstractC3149m.m6703R0(str13).toString();
                                                    if (AbstractC3149m.m6721t0(string)) {
                                                        string = "yyyy-MM-dd HH:mm:ss";
                                                    }
                                                    c3959f = new SimpleDateFormat(string, Locale.getDefault());
                                                } catch (Throwable th2) {
                                                    c3959f = new C3959f(th2);
                                                }
                                                String str14 = !(c3959f instanceof C3959f) ? "例如 HH:mm:ss 或 yyyy-MM-dd HH:mm:ss" : "格式无效，当前输入不会保存";
                                                String str15 = (String) interfaceC1809a1282.getValue();
                                                boolean zM4538h15 = c1836h08.m4538h(sharedPreferences8);
                                                Object objM4514P24 = c1836h08.m4514P();
                                                if (zM4538h15 || objM4514P24 == c1823e7) {
                                                    objM4514P24 = new C5019jo(sharedPreferences8, interfaceC1809a1282, 12);
                                                    c1836h08.m4545k0(objM4514P24);
                                                }
                                                AbstractC4955ho.m9304C1("时间变量格式", str14, str15, 0, (InterfaceC1231l) objM4514P24, c1836h08, 6, 8);
                                                c1836h08.m4553p(false);
                                            } else {
                                                c1836h08.m4525a0(1173331018);
                                                c1836h08.m4553p(false);
                                            }
                                            AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a129 = interfaceC1809a128;
                                            boolean zBooleanValue11 = ((Boolean) interfaceC1809a129.getValue()).booleanValue();
                                            boolean zM4538h16 = c1836h08.m4538h(sharedPreferences8);
                                            Object objM4514P25 = c1836h08.m4514P();
                                            if (zM4538h16 || objM4514P25 == c1823e7) {
                                                objM4514P25 = new C5019jo(sharedPreferences8, interfaceC1809a129, 13);
                                                c1836h08.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue11, "评论自己的朋友圈", "自己的朋友圈不受好友名单限制", false, (InterfaceC1231l) objM4514P25, c1836h08, 432, 8);
                                            c1836h08.m4553p(false);
                                        } else {
                                            c1836h08.m4525a0(1173645482);
                                            c1836h08.m4553p(false);
                                        }
                                    } else {
                                        c1836h08.m4519V();
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
