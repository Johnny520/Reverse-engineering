package p332wb;

import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.util.List;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.pa */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5203pa implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19950g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f19951h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19952i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f19953j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f19954k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5203pa(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, int i9) {
        this.f19950g = i9;
        this.f19951h = sharedPreferences;
        this.f19952i = interfaceC1809a1;
        this.f19953j = interfaceC1809a12;
        this.f19954k = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f19950g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 3;
                    final SharedPreferences sharedPreferences = this.f19951h;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f19952i;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f19953j;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f19954k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1044525743, new InterfaceC1235p() { // from class: wb.y8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object obj6;
                            String str;
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a14 = interfaceC1809a1;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences2);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences2, interfaceC1809a14, 28);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈上传尾巴", "发布时附带指定的 SDK 来源", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a14.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(1700057301);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a12;
                                            String str2 = (String) interfaceC1809a15.getValue();
                                            boolean zM4538h2 = c1836h02.m4538h(sharedPreferences2);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4538h2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5435wb(sharedPreferences2, interfaceC1809a15, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("SDK ID", "输入第三方 SDK 标识", str2, 0, (InterfaceC1231l) objM4514P2, c1836h02, 54, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a13;
                                            String str3 = (String) interfaceC1809a16.getValue();
                                            boolean zM4538h3 = c1836h02.m4538h(sharedPreferences2);
                                            Object objM4514P3 = c1836h02.m4514P();
                                            if (zM4538h3 || objM4514P3 == c1823e) {
                                                objM4514P3 = new C5108me(sharedPreferences2, interfaceC1809a16, 0);
                                                c1836h02.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9304C1("SDK 名称", "输入显示的 SDK 名称", str3, 0, (InterfaceC1231l) objM4514P3, c1836h02, 54, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(1700677146);
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
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a1;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences3 = sharedPreferences;
                                        boolean zM4538h4 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P4 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C5435wb(sharedPreferences3, interfaceC1809a17, 5);
                                            c1836h03.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "群昵称自定义颜色", "修改群聊成员昵称的颜色和粗细", false, (InterfaceC1231l) objM4514P4, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a17.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-691695926);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a12;
                                            String str4 = (String) interfaceC1809a18.getValue();
                                            Object objM4514P5 = c1836h03.m4514P();
                                            if (objM4514P5 == c1823e2) {
                                                objM4514P5 = new C5070l9(interfaceC1809a18, 12);
                                                c1836h03.m4545k0(objM4514P5);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P5;
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C4712ab(interfaceC1809a18, 8);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9430S("昵称颜色", "留空跟随微信，渐变用 #F59E0B,#22C55E", str4, false, interfaceC1220a, (InterfaceC1231l) objM4514P6, c1836h03, 221238, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a13;
                                            String str5 = (String) interfaceC1809a19.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C4712ab(interfaceC1809a19, 9);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9616n4("昵称粗细", str5, (InterfaceC1231l) objM4514P7, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-691232724);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a1;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a110.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences;
                                        boolean zM4538h5 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P8 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P8 == c1823e3) {
                                            objM4514P8 = new C5435wb(sharedPreferences4, interfaceC1809a110, 10);
                                            c1836h04.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "余额", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P8, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a12;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                                        boolean zM4538h6 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        if (zM4538h6 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C5435wb(sharedPreferences4, interfaceC1809a111, 11);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "零钱通", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a13;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                                        boolean zM4538h7 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P10 = c1836h04.m4514P();
                                        if (zM4538h7 || objM4514P10 == c1823e3) {
                                            objM4514P10 = new C5435wb(sharedPreferences4, interfaceC1809a112, 12);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "经营账户", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P10, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a1;
                                        String str6 = AbstractC1416l.m3825a((String) interfaceC1809a113.getValue(), "all") ? "微信所有页面" : "仅微信主页";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("home", "仅微信主页"), new C4825dq("all", "所有微信页面"));
                                        String str7 = (String) interfaceC1809a113.getValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences;
                                        boolean zM4538h8 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h8 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences5, interfaceC1809a113, 24);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9353I2("显示范围", str6, listM101y0, str7, (InterfaceC1231l) objM4514P11, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a12;
                                        String str8 = (String) interfaceC1809a114.getValue();
                                        if (AbstractC1416l.m3825a(str8, WeChatSnsPost.TYPE_TEXT)) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅文字";
                                        } else if (AbstractC1416l.m3825a(str8, "both")) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "图标和文字";
                                        } else {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅图标";
                                        }
                                        List listM101y02 = AbstractC0000a.m101y0(new C4825dq("icon", "仅图标"), new C4825dq(obj6, "仅文字"), new C4825dq("both", "图标和文字"));
                                        String str9 = (String) interfaceC1809a114.getValue();
                                        boolean zM4538h9 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P12 = c1836h05.m4514P();
                                        if (zM4538h9 || objM4514P12 == c1823e4) {
                                            objM4514P12 = new C5108me(sharedPreferences5, interfaceC1809a114, 25);
                                            c1836h05.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9353I2("快捷项样式", str, listM101y02, str9, (InterfaceC1231l) objM4514P12, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        Object objM4514P13 = c1836h05.m4514P();
                                        if (objM4514P13 == c1823e4) {
                                            objM4514P13 = new C4749bf(interfaceC1809a13, 8);
                                            c1836h05.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9503b("按钮外观", "设置按钮渐变、大小和菜单名称样式", (InterfaceC1220a) objM4514P13, c1836h05, 438);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        SharedPreferences sharedPreferences6 = sharedPreferences;
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_cover_with_avatar", "封面使用点歌人头像", "头像不可用时保留歌曲封面", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_singer_with_nickname", "歌手使用点歌人昵称", "昵称不可用时保留原歌手", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a1;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a115.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h10 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C4818di(sharedPreferences6, interfaceC1809a115, 2);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "自定义 singer", "允许通过 & 指定歌手显示名称", false, (InterfaceC1231l) objM4514P14, c1836h06, 432, 8);
                                        if (((Boolean) interfaceC1809a115.getValue()).booleanValue()) {
                                            c1836h06.m4525a0(-683704780);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a12;
                                            String str10 = (String) interfaceC1809a116.getValue();
                                            boolean zM4538h11 = c1836h06.m4538h(sharedPreferences6);
                                            Object objM4514P15 = c1836h06.m4514P();
                                            if (zM4538h11 || objM4514P15 == c1823e5) {
                                                objM4514P15 = new C4818di(sharedPreferences6, interfaceC1809a116, 3);
                                                c1836h06.m4545k0(objM4514P15);
                                            }
                                            AbstractC4955ho.m9304C1("默认 singer", "留空时使用原歌手或点歌人昵称", str10, 0, (InterfaceC1231l) objM4514P15, c1836h06, 54, 8);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-683399182);
                                            c1836h06.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a13;
                                        String str11 = (String) interfaceC1809a117.getValue();
                                        boolean zM4538h12 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h12 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C4818di(sharedPreferences6, interfaceC1809a117, 4);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9304C1("AppID", "留空时使用 QQ 音乐默认 AppID", str11, 0, (InterfaceC1231l) objM4514P16, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a1;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a118.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences;
                                        boolean zM4538h13 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P17 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P17 == c1823e6) {
                                            objM4514P17 = new C5441wh(sharedPreferences7, interfaceC1809a118, 3);
                                            c1836h07.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "启用免打扰", "指定时间内不提醒", false, (InterfaceC1231l) objM4514P17, c1836h07, 432, 8);
                                        if (((Boolean) interfaceC1809a118.getValue()).booleanValue()) {
                                            c1836h07.m4525a0(-785358099);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a12;
                                            String str12 = (String) interfaceC1809a119.getValue();
                                            boolean zM4538h14 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P18 = c1836h07.m4514P();
                                            if (zM4538h14 || objM4514P18 == c1823e6) {
                                                objM4514P18 = new C5441wh(sharedPreferences7, interfaceC1809a119, 4);
                                                c1836h07.m4545k0(objM4514P18);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P18, c1836h07, "开始时间", str12, false);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a13;
                                            String str13 = (String) interfaceC1809a120.getValue();
                                            boolean zM4538h15 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P19 = c1836h07.m4514P();
                                            if (zM4538h15 || objM4514P19 == c1823e6) {
                                                objM4514P19 = new C5441wh(sharedPreferences7, interfaceC1809a120, 5);
                                                c1836h07.m4545k0(objM4514P19);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P19, c1836h07, "结束时间", str13, false);
                                            c1836h07.m4553p(false);
                                        } else {
                                            c1836h07.m4525a0(-784792070);
                                            c1836h07.m4553p(false);
                                        }
                                    } else {
                                        c1836h07.m4519V();
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
                    final int i12 = 5;
                    final SharedPreferences sharedPreferences2 = this.f19951h;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f19952i;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f19953j;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f19954k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1352773112, new InterfaceC1235p() { // from class: wb.y8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object obj6;
                            String str;
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a14;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a142, 28);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈上传尾巴", "发布时附带指定的 SDK 来源", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a142.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(1700057301);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a15;
                                            String str2 = (String) interfaceC1809a152.getValue();
                                            boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4538h2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5435wb(sharedPreferences22, interfaceC1809a152, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("SDK ID", "输入第三方 SDK 标识", str2, 0, (InterfaceC1231l) objM4514P2, c1836h02, 54, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a16;
                                            String str3 = (String) interfaceC1809a162.getValue();
                                            boolean zM4538h3 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P3 = c1836h02.m4514P();
                                            if (zM4538h3 || objM4514P3 == c1823e) {
                                                objM4514P3 = new C5108me(sharedPreferences22, interfaceC1809a162, 0);
                                                c1836h02.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9304C1("SDK 名称", "输入显示的 SDK 名称", str3, 0, (InterfaceC1231l) objM4514P3, c1836h02, 54, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(1700677146);
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
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a14;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                                        boolean zM4538h4 = c1836h03.m4538h(sharedPreferences3);
                                        Object objM4514P4 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C5435wb(sharedPreferences3, interfaceC1809a17, 5);
                                            c1836h03.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "群昵称自定义颜色", "修改群聊成员昵称的颜色和粗细", false, (InterfaceC1231l) objM4514P4, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a17.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-691695926);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a15;
                                            String str4 = (String) interfaceC1809a18.getValue();
                                            Object objM4514P5 = c1836h03.m4514P();
                                            if (objM4514P5 == c1823e2) {
                                                objM4514P5 = new C5070l9(interfaceC1809a18, 12);
                                                c1836h03.m4545k0(objM4514P5);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P5;
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C4712ab(interfaceC1809a18, 8);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9430S("昵称颜色", "留空跟随微信，渐变用 #F59E0B,#22C55E", str4, false, interfaceC1220a, (InterfaceC1231l) objM4514P6, c1836h03, 221238, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a16;
                                            String str5 = (String) interfaceC1809a19.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C4712ab(interfaceC1809a19, 9);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9616n4("昵称粗细", str5, (InterfaceC1231l) objM4514P7, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-691232724);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a14;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a110.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences2;
                                        boolean zM4538h5 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P8 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P8 == c1823e3) {
                                            objM4514P8 = new C5435wb(sharedPreferences4, interfaceC1809a110, 10);
                                            c1836h04.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "余额", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P8, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a15;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                                        boolean zM4538h6 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        if (zM4538h6 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C5435wb(sharedPreferences4, interfaceC1809a111, 11);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "零钱通", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a16;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                                        boolean zM4538h7 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P10 = c1836h04.m4514P();
                                        if (zM4538h7 || objM4514P10 == c1823e3) {
                                            objM4514P10 = new C5435wb(sharedPreferences4, interfaceC1809a112, 12);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "经营账户", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P10, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a14;
                                        String str6 = AbstractC1416l.m3825a((String) interfaceC1809a113.getValue(), "all") ? "微信所有页面" : "仅微信主页";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("home", "仅微信主页"), new C4825dq("all", "所有微信页面"));
                                        String str7 = (String) interfaceC1809a113.getValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences2;
                                        boolean zM4538h8 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h8 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences5, interfaceC1809a113, 24);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9353I2("显示范围", str6, listM101y0, str7, (InterfaceC1231l) objM4514P11, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a15;
                                        String str8 = (String) interfaceC1809a114.getValue();
                                        if (AbstractC1416l.m3825a(str8, WeChatSnsPost.TYPE_TEXT)) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅文字";
                                        } else if (AbstractC1416l.m3825a(str8, "both")) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "图标和文字";
                                        } else {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅图标";
                                        }
                                        List listM101y02 = AbstractC0000a.m101y0(new C4825dq("icon", "仅图标"), new C4825dq(obj6, "仅文字"), new C4825dq("both", "图标和文字"));
                                        String str9 = (String) interfaceC1809a114.getValue();
                                        boolean zM4538h9 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P12 = c1836h05.m4514P();
                                        if (zM4538h9 || objM4514P12 == c1823e4) {
                                            objM4514P12 = new C5108me(sharedPreferences5, interfaceC1809a114, 25);
                                            c1836h05.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9353I2("快捷项样式", str, listM101y02, str9, (InterfaceC1231l) objM4514P12, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        Object objM4514P13 = c1836h05.m4514P();
                                        if (objM4514P13 == c1823e4) {
                                            objM4514P13 = new C4749bf(interfaceC1809a16, 8);
                                            c1836h05.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9503b("按钮外观", "设置按钮渐变、大小和菜单名称样式", (InterfaceC1220a) objM4514P13, c1836h05, 438);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        SharedPreferences sharedPreferences6 = sharedPreferences2;
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_cover_with_avatar", "封面使用点歌人头像", "头像不可用时保留歌曲封面", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_singer_with_nickname", "歌手使用点歌人昵称", "昵称不可用时保留原歌手", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a14;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a115.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h10 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C4818di(sharedPreferences6, interfaceC1809a115, 2);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "自定义 singer", "允许通过 & 指定歌手显示名称", false, (InterfaceC1231l) objM4514P14, c1836h06, 432, 8);
                                        if (((Boolean) interfaceC1809a115.getValue()).booleanValue()) {
                                            c1836h06.m4525a0(-683704780);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a15;
                                            String str10 = (String) interfaceC1809a116.getValue();
                                            boolean zM4538h11 = c1836h06.m4538h(sharedPreferences6);
                                            Object objM4514P15 = c1836h06.m4514P();
                                            if (zM4538h11 || objM4514P15 == c1823e5) {
                                                objM4514P15 = new C4818di(sharedPreferences6, interfaceC1809a116, 3);
                                                c1836h06.m4545k0(objM4514P15);
                                            }
                                            AbstractC4955ho.m9304C1("默认 singer", "留空时使用原歌手或点歌人昵称", str10, 0, (InterfaceC1231l) objM4514P15, c1836h06, 54, 8);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-683399182);
                                            c1836h06.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a16;
                                        String str11 = (String) interfaceC1809a117.getValue();
                                        boolean zM4538h12 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h12 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C4818di(sharedPreferences6, interfaceC1809a117, 4);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9304C1("AppID", "留空时使用 QQ 音乐默认 AppID", str11, 0, (InterfaceC1231l) objM4514P16, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a14;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a118.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences2;
                                        boolean zM4538h13 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P17 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P17 == c1823e6) {
                                            objM4514P17 = new C5441wh(sharedPreferences7, interfaceC1809a118, 3);
                                            c1836h07.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "启用免打扰", "指定时间内不提醒", false, (InterfaceC1231l) objM4514P17, c1836h07, 432, 8);
                                        if (((Boolean) interfaceC1809a118.getValue()).booleanValue()) {
                                            c1836h07.m4525a0(-785358099);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a15;
                                            String str12 = (String) interfaceC1809a119.getValue();
                                            boolean zM4538h14 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P18 = c1836h07.m4514P();
                                            if (zM4538h14 || objM4514P18 == c1823e6) {
                                                objM4514P18 = new C5441wh(sharedPreferences7, interfaceC1809a119, 4);
                                                c1836h07.m4545k0(objM4514P18);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P18, c1836h07, "开始时间", str12, false);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a16;
                                            String str13 = (String) interfaceC1809a120.getValue();
                                            boolean zM4538h15 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P19 = c1836h07.m4514P();
                                            if (zM4538h15 || objM4514P19 == c1823e6) {
                                                objM4514P19 = new C5441wh(sharedPreferences7, interfaceC1809a120, 5);
                                                c1836h07.m4545k0(objM4514P19);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P19, c1836h07, "结束时间", str13, false);
                                            c1836h07.m4553p(false);
                                        } else {
                                            c1836h07.m4525a0(-784792070);
                                            c1836h07.m4553p(false);
                                        }
                                    } else {
                                        c1836h07.m4519V();
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
                    final int i13 = 4;
                    final SharedPreferences sharedPreferences3 = this.f19951h;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f19952i;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f19953j;
                    final InterfaceC1809a1 interfaceC1809a19 = this.f19954k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1866978000, new InterfaceC1235p() { // from class: wb.y8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object obj6;
                            String str;
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a17;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences22 = sharedPreferences3;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a142, 28);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈上传尾巴", "发布时附带指定的 SDK 来源", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a142.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(1700057301);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a18;
                                            String str2 = (String) interfaceC1809a152.getValue();
                                            boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4538h2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5435wb(sharedPreferences22, interfaceC1809a152, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("SDK ID", "输入第三方 SDK 标识", str2, 0, (InterfaceC1231l) objM4514P2, c1836h02, 54, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a19;
                                            String str3 = (String) interfaceC1809a162.getValue();
                                            boolean zM4538h3 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P3 = c1836h02.m4514P();
                                            if (zM4538h3 || objM4514P3 == c1823e) {
                                                objM4514P3 = new C5108me(sharedPreferences22, interfaceC1809a162, 0);
                                                c1836h02.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9304C1("SDK 名称", "输入显示的 SDK 名称", str3, 0, (InterfaceC1231l) objM4514P3, c1836h02, 54, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(1700677146);
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
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences32 = sharedPreferences3;
                                        boolean zM4538h4 = c1836h03.m4538h(sharedPreferences32);
                                        Object objM4514P4 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C5435wb(sharedPreferences32, interfaceC1809a172, 5);
                                            c1836h03.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "群昵称自定义颜色", "修改群聊成员昵称的颜色和粗细", false, (InterfaceC1231l) objM4514P4, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-691695926);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a18;
                                            String str4 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P5 = c1836h03.m4514P();
                                            if (objM4514P5 == c1823e2) {
                                                objM4514P5 = new C5070l9(interfaceC1809a182, 12);
                                                c1836h03.m4545k0(objM4514P5);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P5;
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C4712ab(interfaceC1809a182, 8);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9430S("昵称颜色", "留空跟随微信，渐变用 #F59E0B,#22C55E", str4, false, interfaceC1220a, (InterfaceC1231l) objM4514P6, c1836h03, 221238, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a19;
                                            String str5 = (String) interfaceC1809a192.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C4712ab(interfaceC1809a192, 9);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9616n4("昵称粗细", str5, (InterfaceC1231l) objM4514P7, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-691232724);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a17;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a110.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences3;
                                        boolean zM4538h5 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P8 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P8 == c1823e3) {
                                            objM4514P8 = new C5435wb(sharedPreferences4, interfaceC1809a110, 10);
                                            c1836h04.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "余额", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P8, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a18;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                                        boolean zM4538h6 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        if (zM4538h6 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C5435wb(sharedPreferences4, interfaceC1809a111, 11);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "零钱通", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a19;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                                        boolean zM4538h7 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P10 = c1836h04.m4514P();
                                        if (zM4538h7 || objM4514P10 == c1823e3) {
                                            objM4514P10 = new C5435wb(sharedPreferences4, interfaceC1809a112, 12);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "经营账户", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P10, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a17;
                                        String str6 = AbstractC1416l.m3825a((String) interfaceC1809a113.getValue(), "all") ? "微信所有页面" : "仅微信主页";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("home", "仅微信主页"), new C4825dq("all", "所有微信页面"));
                                        String str7 = (String) interfaceC1809a113.getValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences3;
                                        boolean zM4538h8 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h8 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences5, interfaceC1809a113, 24);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9353I2("显示范围", str6, listM101y0, str7, (InterfaceC1231l) objM4514P11, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a18;
                                        String str8 = (String) interfaceC1809a114.getValue();
                                        if (AbstractC1416l.m3825a(str8, WeChatSnsPost.TYPE_TEXT)) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅文字";
                                        } else if (AbstractC1416l.m3825a(str8, "both")) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "图标和文字";
                                        } else {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅图标";
                                        }
                                        List listM101y02 = AbstractC0000a.m101y0(new C4825dq("icon", "仅图标"), new C4825dq(obj6, "仅文字"), new C4825dq("both", "图标和文字"));
                                        String str9 = (String) interfaceC1809a114.getValue();
                                        boolean zM4538h9 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P12 = c1836h05.m4514P();
                                        if (zM4538h9 || objM4514P12 == c1823e4) {
                                            objM4514P12 = new C5108me(sharedPreferences5, interfaceC1809a114, 25);
                                            c1836h05.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9353I2("快捷项样式", str, listM101y02, str9, (InterfaceC1231l) objM4514P12, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        Object objM4514P13 = c1836h05.m4514P();
                                        if (objM4514P13 == c1823e4) {
                                            objM4514P13 = new C4749bf(interfaceC1809a19, 8);
                                            c1836h05.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9503b("按钮外观", "设置按钮渐变、大小和菜单名称样式", (InterfaceC1220a) objM4514P13, c1836h05, 438);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        SharedPreferences sharedPreferences6 = sharedPreferences3;
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_cover_with_avatar", "封面使用点歌人头像", "头像不可用时保留歌曲封面", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_singer_with_nickname", "歌手使用点歌人昵称", "昵称不可用时保留原歌手", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a17;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a115.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h10 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C4818di(sharedPreferences6, interfaceC1809a115, 2);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "自定义 singer", "允许通过 & 指定歌手显示名称", false, (InterfaceC1231l) objM4514P14, c1836h06, 432, 8);
                                        if (((Boolean) interfaceC1809a115.getValue()).booleanValue()) {
                                            c1836h06.m4525a0(-683704780);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a18;
                                            String str10 = (String) interfaceC1809a116.getValue();
                                            boolean zM4538h11 = c1836h06.m4538h(sharedPreferences6);
                                            Object objM4514P15 = c1836h06.m4514P();
                                            if (zM4538h11 || objM4514P15 == c1823e5) {
                                                objM4514P15 = new C4818di(sharedPreferences6, interfaceC1809a116, 3);
                                                c1836h06.m4545k0(objM4514P15);
                                            }
                                            AbstractC4955ho.m9304C1("默认 singer", "留空时使用原歌手或点歌人昵称", str10, 0, (InterfaceC1231l) objM4514P15, c1836h06, 54, 8);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-683399182);
                                            c1836h06.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a19;
                                        String str11 = (String) interfaceC1809a117.getValue();
                                        boolean zM4538h12 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h12 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C4818di(sharedPreferences6, interfaceC1809a117, 4);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9304C1("AppID", "留空时使用 QQ 音乐默认 AppID", str11, 0, (InterfaceC1231l) objM4514P16, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a17;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a118.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences3;
                                        boolean zM4538h13 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P17 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P17 == c1823e6) {
                                            objM4514P17 = new C5441wh(sharedPreferences7, interfaceC1809a118, 3);
                                            c1836h07.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "启用免打扰", "指定时间内不提醒", false, (InterfaceC1231l) objM4514P17, c1836h07, 432, 8);
                                        if (((Boolean) interfaceC1809a118.getValue()).booleanValue()) {
                                            c1836h07.m4525a0(-785358099);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a18;
                                            String str12 = (String) interfaceC1809a119.getValue();
                                            boolean zM4538h14 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P18 = c1836h07.m4514P();
                                            if (zM4538h14 || objM4514P18 == c1823e6) {
                                                objM4514P18 = new C5441wh(sharedPreferences7, interfaceC1809a119, 4);
                                                c1836h07.m4545k0(objM4514P18);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P18, c1836h07, "开始时间", str12, false);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a19;
                                            String str13 = (String) interfaceC1809a120.getValue();
                                            boolean zM4538h15 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P19 = c1836h07.m4514P();
                                            if (zM4538h15 || objM4514P19 == c1823e6) {
                                                objM4514P19 = new C5441wh(sharedPreferences7, interfaceC1809a120, 5);
                                                c1836h07.m4545k0(objM4514P19);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P19, c1836h07, "结束时间", str13, false);
                                            c1836h07.m4553p(false);
                                        } else {
                                            c1836h07.m4525a0(-784792070);
                                            c1836h07.m4553p(false);
                                        }
                                    } else {
                                        c1836h07.m4519V();
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
                    final int i14 = 0;
                    final SharedPreferences sharedPreferences4 = this.f19951h;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f19952i;
                    final InterfaceC1809a1 interfaceC1809a111 = this.f19953j;
                    final InterfaceC1809a1 interfaceC1809a112 = this.f19954k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(906165256, new InterfaceC1235p() { // from class: wb.y8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object obj6;
                            String str;
                            switch (i14) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a110;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences22 = sharedPreferences4;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a142, 28);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈上传尾巴", "发布时附带指定的 SDK 来源", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a142.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(1700057301);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a111;
                                            String str2 = (String) interfaceC1809a152.getValue();
                                            boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4538h2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5435wb(sharedPreferences22, interfaceC1809a152, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("SDK ID", "输入第三方 SDK 标识", str2, 0, (InterfaceC1231l) objM4514P2, c1836h02, 54, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a112;
                                            String str3 = (String) interfaceC1809a162.getValue();
                                            boolean zM4538h3 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P3 = c1836h02.m4514P();
                                            if (zM4538h3 || objM4514P3 == c1823e) {
                                                objM4514P3 = new C5108me(sharedPreferences22, interfaceC1809a162, 0);
                                                c1836h02.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9304C1("SDK 名称", "输入显示的 SDK 名称", str3, 0, (InterfaceC1231l) objM4514P3, c1836h02, 54, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(1700677146);
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
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a110;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences32 = sharedPreferences4;
                                        boolean zM4538h4 = c1836h03.m4538h(sharedPreferences32);
                                        Object objM4514P4 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C5435wb(sharedPreferences32, interfaceC1809a172, 5);
                                            c1836h03.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "群昵称自定义颜色", "修改群聊成员昵称的颜色和粗细", false, (InterfaceC1231l) objM4514P4, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-691695926);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a111;
                                            String str4 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P5 = c1836h03.m4514P();
                                            if (objM4514P5 == c1823e2) {
                                                objM4514P5 = new C5070l9(interfaceC1809a182, 12);
                                                c1836h03.m4545k0(objM4514P5);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P5;
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C4712ab(interfaceC1809a182, 8);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9430S("昵称颜色", "留空跟随微信，渐变用 #F59E0B,#22C55E", str4, false, interfaceC1220a, (InterfaceC1231l) objM4514P6, c1836h03, 221238, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a112;
                                            String str5 = (String) interfaceC1809a192.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C4712ab(interfaceC1809a192, 9);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9616n4("昵称粗细", str5, (InterfaceC1231l) objM4514P7, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-691232724);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a110;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1102.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences4;
                                        boolean zM4538h5 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P8 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P8 == c1823e3) {
                                            objM4514P8 = new C5435wb(sharedPreferences42, interfaceC1809a1102, 10);
                                            c1836h04.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "余额", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P8, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a111;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a1112.getValue()).booleanValue();
                                        boolean zM4538h6 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        if (zM4538h6 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C5435wb(sharedPreferences42, interfaceC1809a1112, 11);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "零钱通", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a112;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                        boolean zM4538h7 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P10 = c1836h04.m4514P();
                                        if (zM4538h7 || objM4514P10 == c1823e3) {
                                            objM4514P10 = new C5435wb(sharedPreferences42, interfaceC1809a1122, 12);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "经营账户", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P10, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a110;
                                        String str6 = AbstractC1416l.m3825a((String) interfaceC1809a113.getValue(), "all") ? "微信所有页面" : "仅微信主页";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("home", "仅微信主页"), new C4825dq("all", "所有微信页面"));
                                        String str7 = (String) interfaceC1809a113.getValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences4;
                                        boolean zM4538h8 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h8 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences5, interfaceC1809a113, 24);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9353I2("显示范围", str6, listM101y0, str7, (InterfaceC1231l) objM4514P11, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a111;
                                        String str8 = (String) interfaceC1809a114.getValue();
                                        if (AbstractC1416l.m3825a(str8, WeChatSnsPost.TYPE_TEXT)) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅文字";
                                        } else if (AbstractC1416l.m3825a(str8, "both")) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "图标和文字";
                                        } else {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅图标";
                                        }
                                        List listM101y02 = AbstractC0000a.m101y0(new C4825dq("icon", "仅图标"), new C4825dq(obj6, "仅文字"), new C4825dq("both", "图标和文字"));
                                        String str9 = (String) interfaceC1809a114.getValue();
                                        boolean zM4538h9 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P12 = c1836h05.m4514P();
                                        if (zM4538h9 || objM4514P12 == c1823e4) {
                                            objM4514P12 = new C5108me(sharedPreferences5, interfaceC1809a114, 25);
                                            c1836h05.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9353I2("快捷项样式", str, listM101y02, str9, (InterfaceC1231l) objM4514P12, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        Object objM4514P13 = c1836h05.m4514P();
                                        if (objM4514P13 == c1823e4) {
                                            objM4514P13 = new C4749bf(interfaceC1809a112, 8);
                                            c1836h05.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9503b("按钮外观", "设置按钮渐变、大小和菜单名称样式", (InterfaceC1220a) objM4514P13, c1836h05, 438);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        SharedPreferences sharedPreferences6 = sharedPreferences4;
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_cover_with_avatar", "封面使用点歌人头像", "头像不可用时保留歌曲封面", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_singer_with_nickname", "歌手使用点歌人昵称", "昵称不可用时保留原歌手", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a110;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a115.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h10 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C4818di(sharedPreferences6, interfaceC1809a115, 2);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "自定义 singer", "允许通过 & 指定歌手显示名称", false, (InterfaceC1231l) objM4514P14, c1836h06, 432, 8);
                                        if (((Boolean) interfaceC1809a115.getValue()).booleanValue()) {
                                            c1836h06.m4525a0(-683704780);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a111;
                                            String str10 = (String) interfaceC1809a116.getValue();
                                            boolean zM4538h11 = c1836h06.m4538h(sharedPreferences6);
                                            Object objM4514P15 = c1836h06.m4514P();
                                            if (zM4538h11 || objM4514P15 == c1823e5) {
                                                objM4514P15 = new C4818di(sharedPreferences6, interfaceC1809a116, 3);
                                                c1836h06.m4545k0(objM4514P15);
                                            }
                                            AbstractC4955ho.m9304C1("默认 singer", "留空时使用原歌手或点歌人昵称", str10, 0, (InterfaceC1231l) objM4514P15, c1836h06, 54, 8);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-683399182);
                                            c1836h06.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a112;
                                        String str11 = (String) interfaceC1809a117.getValue();
                                        boolean zM4538h12 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h12 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C4818di(sharedPreferences6, interfaceC1809a117, 4);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9304C1("AppID", "留空时使用 QQ 音乐默认 AppID", str11, 0, (InterfaceC1231l) objM4514P16, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a110;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a118.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences4;
                                        boolean zM4538h13 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P17 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P17 == c1823e6) {
                                            objM4514P17 = new C5441wh(sharedPreferences7, interfaceC1809a118, 3);
                                            c1836h07.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "启用免打扰", "指定时间内不提醒", false, (InterfaceC1231l) objM4514P17, c1836h07, 432, 8);
                                        if (((Boolean) interfaceC1809a118.getValue()).booleanValue()) {
                                            c1836h07.m4525a0(-785358099);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a111;
                                            String str12 = (String) interfaceC1809a119.getValue();
                                            boolean zM4538h14 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P18 = c1836h07.m4514P();
                                            if (zM4538h14 || objM4514P18 == c1823e6) {
                                                objM4514P18 = new C5441wh(sharedPreferences7, interfaceC1809a119, 4);
                                                c1836h07.m4545k0(objM4514P18);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P18, c1836h07, "开始时间", str12, false);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a112;
                                            String str13 = (String) interfaceC1809a120.getValue();
                                            boolean zM4538h15 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P19 = c1836h07.m4514P();
                                            if (zM4538h15 || objM4514P19 == c1823e6) {
                                                objM4514P19 = new C5441wh(sharedPreferences7, interfaceC1809a120, 5);
                                                c1836h07.m4545k0(objM4514P19);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P19, c1836h07, "结束时间", str13, false);
                                            c1836h07.m4553p(false);
                                        } else {
                                            c1836h07.m4525a0(-784792070);
                                            c1836h07.m4553p(false);
                                        }
                                    } else {
                                        c1836h07.m4519V();
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
                    final int i15 = 2;
                    final SharedPreferences sharedPreferences5 = this.f19951h;
                    final InterfaceC1809a1 interfaceC1809a113 = this.f19952i;
                    final InterfaceC1809a1 interfaceC1809a114 = this.f19953j;
                    final InterfaceC1809a1 interfaceC1809a115 = this.f19954k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(118879806, new InterfaceC1235p() { // from class: wb.y8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object obj6;
                            String str;
                            switch (i15) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a113;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences22 = sharedPreferences5;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a142, 28);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈上传尾巴", "发布时附带指定的 SDK 来源", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a142.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(1700057301);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a114;
                                            String str2 = (String) interfaceC1809a152.getValue();
                                            boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4538h2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5435wb(sharedPreferences22, interfaceC1809a152, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("SDK ID", "输入第三方 SDK 标识", str2, 0, (InterfaceC1231l) objM4514P2, c1836h02, 54, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a115;
                                            String str3 = (String) interfaceC1809a162.getValue();
                                            boolean zM4538h3 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P3 = c1836h02.m4514P();
                                            if (zM4538h3 || objM4514P3 == c1823e) {
                                                objM4514P3 = new C5108me(sharedPreferences22, interfaceC1809a162, 0);
                                                c1836h02.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9304C1("SDK 名称", "输入显示的 SDK 名称", str3, 0, (InterfaceC1231l) objM4514P3, c1836h02, 54, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(1700677146);
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
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a113;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences32 = sharedPreferences5;
                                        boolean zM4538h4 = c1836h03.m4538h(sharedPreferences32);
                                        Object objM4514P4 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C5435wb(sharedPreferences32, interfaceC1809a172, 5);
                                            c1836h03.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "群昵称自定义颜色", "修改群聊成员昵称的颜色和粗细", false, (InterfaceC1231l) objM4514P4, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-691695926);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a114;
                                            String str4 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P5 = c1836h03.m4514P();
                                            if (objM4514P5 == c1823e2) {
                                                objM4514P5 = new C5070l9(interfaceC1809a182, 12);
                                                c1836h03.m4545k0(objM4514P5);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P5;
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C4712ab(interfaceC1809a182, 8);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9430S("昵称颜色", "留空跟随微信，渐变用 #F59E0B,#22C55E", str4, false, interfaceC1220a, (InterfaceC1231l) objM4514P6, c1836h03, 221238, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a115;
                                            String str5 = (String) interfaceC1809a192.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C4712ab(interfaceC1809a192, 9);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9616n4("昵称粗细", str5, (InterfaceC1231l) objM4514P7, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-691232724);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a113;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1102.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences5;
                                        boolean zM4538h5 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P8 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P8 == c1823e3) {
                                            objM4514P8 = new C5435wb(sharedPreferences42, interfaceC1809a1102, 10);
                                            c1836h04.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "余额", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P8, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a114;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a1112.getValue()).booleanValue();
                                        boolean zM4538h6 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        if (zM4538h6 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C5435wb(sharedPreferences42, interfaceC1809a1112, 11);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "零钱通", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a115;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                        boolean zM4538h7 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P10 = c1836h04.m4514P();
                                        if (zM4538h7 || objM4514P10 == c1823e3) {
                                            objM4514P10 = new C5435wb(sharedPreferences42, interfaceC1809a1122, 12);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "经营账户", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P10, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a113;
                                        String str6 = AbstractC1416l.m3825a((String) interfaceC1809a1132.getValue(), "all") ? "微信所有页面" : "仅微信主页";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("home", "仅微信主页"), new C4825dq("all", "所有微信页面"));
                                        String str7 = (String) interfaceC1809a1132.getValue();
                                        SharedPreferences sharedPreferences52 = sharedPreferences5;
                                        boolean zM4538h8 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h8 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences52, interfaceC1809a1132, 24);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9353I2("显示范围", str6, listM101y0, str7, (InterfaceC1231l) objM4514P11, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a114;
                                        String str8 = (String) interfaceC1809a1142.getValue();
                                        if (AbstractC1416l.m3825a(str8, WeChatSnsPost.TYPE_TEXT)) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅文字";
                                        } else if (AbstractC1416l.m3825a(str8, "both")) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "图标和文字";
                                        } else {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅图标";
                                        }
                                        List listM101y02 = AbstractC0000a.m101y0(new C4825dq("icon", "仅图标"), new C4825dq(obj6, "仅文字"), new C4825dq("both", "图标和文字"));
                                        String str9 = (String) interfaceC1809a1142.getValue();
                                        boolean zM4538h9 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P12 = c1836h05.m4514P();
                                        if (zM4538h9 || objM4514P12 == c1823e4) {
                                            objM4514P12 = new C5108me(sharedPreferences52, interfaceC1809a1142, 25);
                                            c1836h05.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9353I2("快捷项样式", str, listM101y02, str9, (InterfaceC1231l) objM4514P12, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        Object objM4514P13 = c1836h05.m4514P();
                                        if (objM4514P13 == c1823e4) {
                                            objM4514P13 = new C4749bf(interfaceC1809a115, 8);
                                            c1836h05.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9503b("按钮外观", "设置按钮渐变、大小和菜单名称样式", (InterfaceC1220a) objM4514P13, c1836h05, 438);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        SharedPreferences sharedPreferences6 = sharedPreferences5;
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_cover_with_avatar", "封面使用点歌人头像", "头像不可用时保留歌曲封面", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences6, "qq_music_order_replace_singer_with_nickname", "歌手使用点歌人昵称", "昵称不可用时保留原歌手", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a113;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a1152.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h10 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C4818di(sharedPreferences6, interfaceC1809a1152, 2);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "自定义 singer", "允许通过 & 指定歌手显示名称", false, (InterfaceC1231l) objM4514P14, c1836h06, 432, 8);
                                        if (((Boolean) interfaceC1809a1152.getValue()).booleanValue()) {
                                            c1836h06.m4525a0(-683704780);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a114;
                                            String str10 = (String) interfaceC1809a116.getValue();
                                            boolean zM4538h11 = c1836h06.m4538h(sharedPreferences6);
                                            Object objM4514P15 = c1836h06.m4514P();
                                            if (zM4538h11 || objM4514P15 == c1823e5) {
                                                objM4514P15 = new C4818di(sharedPreferences6, interfaceC1809a116, 3);
                                                c1836h06.m4545k0(objM4514P15);
                                            }
                                            AbstractC4955ho.m9304C1("默认 singer", "留空时使用原歌手或点歌人昵称", str10, 0, (InterfaceC1231l) objM4514P15, c1836h06, 54, 8);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-683399182);
                                            c1836h06.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a115;
                                        String str11 = (String) interfaceC1809a117.getValue();
                                        boolean zM4538h12 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h12 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C4818di(sharedPreferences6, interfaceC1809a117, 4);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9304C1("AppID", "留空时使用 QQ 音乐默认 AppID", str11, 0, (InterfaceC1231l) objM4514P16, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a113;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a118.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences5;
                                        boolean zM4538h13 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P17 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P17 == c1823e6) {
                                            objM4514P17 = new C5441wh(sharedPreferences7, interfaceC1809a118, 3);
                                            c1836h07.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "启用免打扰", "指定时间内不提醒", false, (InterfaceC1231l) objM4514P17, c1836h07, 432, 8);
                                        if (((Boolean) interfaceC1809a118.getValue()).booleanValue()) {
                                            c1836h07.m4525a0(-785358099);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a114;
                                            String str12 = (String) interfaceC1809a119.getValue();
                                            boolean zM4538h14 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P18 = c1836h07.m4514P();
                                            if (zM4538h14 || objM4514P18 == c1823e6) {
                                                objM4514P18 = new C5441wh(sharedPreferences7, interfaceC1809a119, 4);
                                                c1836h07.m4545k0(objM4514P18);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P18, c1836h07, "开始时间", str12, false);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a115;
                                            String str13 = (String) interfaceC1809a120.getValue();
                                            boolean zM4538h15 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P19 = c1836h07.m4514P();
                                            if (zM4538h15 || objM4514P19 == c1823e6) {
                                                objM4514P19 = new C5441wh(sharedPreferences7, interfaceC1809a120, 5);
                                                c1836h07.m4545k0(objM4514P19);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P19, c1836h07, "结束时间", str13, false);
                                            c1836h07.m4553p(false);
                                        } else {
                                            c1836h07.m4525a0(-784792070);
                                            c1836h07.m4553p(false);
                                        }
                                    } else {
                                        c1836h07.m4519V();
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
                    final int i16 = 1;
                    final SharedPreferences sharedPreferences6 = this.f19951h;
                    final InterfaceC1809a1 interfaceC1809a116 = this.f19952i;
                    final InterfaceC1809a1 interfaceC1809a117 = this.f19953j;
                    final InterfaceC1809a1 interfaceC1809a118 = this.f19954k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-49329354, new InterfaceC1235p() { // from class: wb.y8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object obj6;
                            String str;
                            switch (i16) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a116;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences22 = sharedPreferences6;
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (zM4538h || objM4514P == c1823e) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a142, 28);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈上传尾巴", "发布时附带指定的 SDK 来源", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                        if (((Boolean) interfaceC1809a142.getValue()).booleanValue()) {
                                            c1836h02.m4525a0(1700057301);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a117;
                                            String str2 = (String) interfaceC1809a152.getValue();
                                            boolean zM4538h2 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (zM4538h2 || objM4514P2 == c1823e) {
                                                objM4514P2 = new C5435wb(sharedPreferences22, interfaceC1809a152, 29);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9304C1("SDK ID", "输入第三方 SDK 标识", str2, 0, (InterfaceC1231l) objM4514P2, c1836h02, 54, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a118;
                                            String str3 = (String) interfaceC1809a162.getValue();
                                            boolean zM4538h3 = c1836h02.m4538h(sharedPreferences22);
                                            Object objM4514P3 = c1836h02.m4514P();
                                            if (zM4538h3 || objM4514P3 == c1823e) {
                                                objM4514P3 = new C5108me(sharedPreferences22, interfaceC1809a162, 0);
                                                c1836h02.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9304C1("SDK 名称", "输入显示的 SDK 名称", str3, 0, (InterfaceC1231l) objM4514P3, c1836h02, 54, 8);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(1700677146);
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
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a116;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences32 = sharedPreferences6;
                                        boolean zM4538h4 = c1836h03.m4538h(sharedPreferences32);
                                        Object objM4514P4 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4538h4 || objM4514P4 == c1823e2) {
                                            objM4514P4 = new C5435wb(sharedPreferences32, interfaceC1809a172, 5);
                                            c1836h03.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "群昵称自定义颜色", "修改群聊成员昵称的颜色和粗细", false, (InterfaceC1231l) objM4514P4, c1836h03, 432, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-691695926);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a117;
                                            String str4 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P5 = c1836h03.m4514P();
                                            if (objM4514P5 == c1823e2) {
                                                objM4514P5 = new C5070l9(interfaceC1809a182, 12);
                                                c1836h03.m4545k0(objM4514P5);
                                            }
                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P5;
                                            Object objM4514P6 = c1836h03.m4514P();
                                            if (objM4514P6 == c1823e2) {
                                                objM4514P6 = new C4712ab(interfaceC1809a182, 8);
                                                c1836h03.m4545k0(objM4514P6);
                                            }
                                            AbstractC4955ho.m9430S("昵称颜色", "留空跟随微信，渐变用 #F59E0B,#22C55E", str4, false, interfaceC1220a, (InterfaceC1231l) objM4514P6, c1836h03, 221238, 8);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a118;
                                            String str5 = (String) interfaceC1809a192.getValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e2) {
                                                objM4514P7 = new C4712ab(interfaceC1809a192, 9);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9616n4("昵称粗细", str5, (InterfaceC1231l) objM4514P7, c1836h03, 390);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-691232724);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a116;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a1102.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences6;
                                        boolean zM4538h5 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P8 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (zM4538h5 || objM4514P8 == c1823e3) {
                                            objM4514P8 = new C5435wb(sharedPreferences42, interfaceC1809a1102, 10);
                                            c1836h04.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "余额", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P8, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a117;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a1112.getValue()).booleanValue();
                                        boolean zM4538h6 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P9 = c1836h04.m4514P();
                                        if (zM4538h6 || objM4514P9 == c1823e3) {
                                            objM4514P9 = new C5435wb(sharedPreferences42, interfaceC1809a1112, 11);
                                            c1836h04.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "零钱通", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P9, c1836h04, 432, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a118;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                        boolean zM4538h7 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P10 = c1836h04.m4514P();
                                        if (zM4538h7 || objM4514P10 == c1823e3) {
                                            objM4514P10 = new C5435wb(sharedPreferences42, interfaceC1809a1122, 12);
                                            c1836h04.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "经营账户", "固定显示或按真实金额动态增减", false, (InterfaceC1231l) objM4514P10, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a116;
                                        String str6 = AbstractC1416l.m3825a((String) interfaceC1809a1132.getValue(), "all") ? "微信所有页面" : "仅微信主页";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("home", "仅微信主页"), new C4825dq("all", "所有微信页面"));
                                        String str7 = (String) interfaceC1809a1132.getValue();
                                        SharedPreferences sharedPreferences52 = sharedPreferences6;
                                        boolean zM4538h8 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P11 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (zM4538h8 || objM4514P11 == c1823e4) {
                                            objM4514P11 = new C5108me(sharedPreferences52, interfaceC1809a1132, 24);
                                            c1836h05.m4545k0(objM4514P11);
                                        }
                                        AbstractC4955ho.m9353I2("显示范围", str6, listM101y0, str7, (InterfaceC1231l) objM4514P11, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a117;
                                        String str8 = (String) interfaceC1809a1142.getValue();
                                        if (AbstractC1416l.m3825a(str8, WeChatSnsPost.TYPE_TEXT)) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅文字";
                                        } else if (AbstractC1416l.m3825a(str8, "both")) {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "图标和文字";
                                        } else {
                                            obj6 = WeChatSnsPost.TYPE_TEXT;
                                            str = "仅图标";
                                        }
                                        List listM101y02 = AbstractC0000a.m101y0(new C4825dq("icon", "仅图标"), new C4825dq(obj6, "仅文字"), new C4825dq("both", "图标和文字"));
                                        String str9 = (String) interfaceC1809a1142.getValue();
                                        boolean zM4538h9 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P12 = c1836h05.m4514P();
                                        if (zM4538h9 || objM4514P12 == c1823e4) {
                                            objM4514P12 = new C5108me(sharedPreferences52, interfaceC1809a1142, 25);
                                            c1836h05.m4545k0(objM4514P12);
                                        }
                                        AbstractC4955ho.m9353I2("快捷项样式", str, listM101y02, str9, (InterfaceC1231l) objM4514P12, false, c1836h05, 6, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        Object objM4514P13 = c1836h05.m4514P();
                                        if (objM4514P13 == c1823e4) {
                                            objM4514P13 = new C4749bf(interfaceC1809a118, 8);
                                            c1836h05.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9503b("按钮外观", "设置按钮渐变、大小和菜单名称样式", (InterfaceC1220a) objM4514P13, c1836h05, 438);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        SharedPreferences sharedPreferences62 = sharedPreferences6;
                                        AbstractC4955ho.m9402O3(sharedPreferences62, "qq_music_order_replace_cover_with_avatar", "封面使用点歌人头像", "头像不可用时保留歌曲封面", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences62, "qq_music_order_replace_singer_with_nickname", "歌手使用点歌人昵称", "昵称不可用时保留原歌手", false, c1836h06, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a116;
                                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a1152.getValue()).booleanValue();
                                        boolean zM4538h10 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P14 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4538h10 || objM4514P14 == c1823e5) {
                                            objM4514P14 = new C4818di(sharedPreferences62, interfaceC1809a1152, 2);
                                            c1836h06.m4545k0(objM4514P14);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue6, "自定义 singer", "允许通过 & 指定歌手显示名称", false, (InterfaceC1231l) objM4514P14, c1836h06, 432, 8);
                                        if (((Boolean) interfaceC1809a1152.getValue()).booleanValue()) {
                                            c1836h06.m4525a0(-683704780);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a117;
                                            String str10 = (String) interfaceC1809a1162.getValue();
                                            boolean zM4538h11 = c1836h06.m4538h(sharedPreferences62);
                                            Object objM4514P15 = c1836h06.m4514P();
                                            if (zM4538h11 || objM4514P15 == c1823e5) {
                                                objM4514P15 = new C4818di(sharedPreferences62, interfaceC1809a1162, 3);
                                                c1836h06.m4545k0(objM4514P15);
                                            }
                                            AbstractC4955ho.m9304C1("默认 singer", "留空时使用原歌手或点歌人昵称", str10, 0, (InterfaceC1231l) objM4514P15, c1836h06, 54, 8);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-683399182);
                                            c1836h06.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a118;
                                        String str11 = (String) interfaceC1809a1172.getValue();
                                        boolean zM4538h12 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P16 = c1836h06.m4514P();
                                        if (zM4538h12 || objM4514P16 == c1823e5) {
                                            objM4514P16 = new C4818di(sharedPreferences62, interfaceC1809a1172, 4);
                                            c1836h06.m4545k0(objM4514P16);
                                        }
                                        AbstractC4955ho.m9304C1("AppID", "留空时使用 QQ 音乐默认 AppID", str11, 0, (InterfaceC1231l) objM4514P16, c1836h06, 54, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a116;
                                        boolean zBooleanValue7 = ((Boolean) interfaceC1809a1182.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences6;
                                        boolean zM4538h13 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P17 = c1836h07.m4514P();
                                        C1823e c1823e6 = C1851l.f6155a;
                                        if (zM4538h13 || objM4514P17 == c1823e6) {
                                            objM4514P17 = new C5441wh(sharedPreferences7, interfaceC1809a1182, 3);
                                            c1836h07.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue7, "启用免打扰", "指定时间内不提醒", false, (InterfaceC1231l) objM4514P17, c1836h07, 432, 8);
                                        if (((Boolean) interfaceC1809a1182.getValue()).booleanValue()) {
                                            c1836h07.m4525a0(-785358099);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a117;
                                            String str12 = (String) interfaceC1809a119.getValue();
                                            boolean zM4538h14 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P18 = c1836h07.m4514P();
                                            if (zM4538h14 || objM4514P18 == c1823e6) {
                                                objM4514P18 = new C5441wh(sharedPreferences7, interfaceC1809a119, 4);
                                                c1836h07.m4545k0(objM4514P18);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P18, c1836h07, "开始时间", str12, false);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a118;
                                            String str13 = (String) interfaceC1809a120.getValue();
                                            boolean zM4538h15 = c1836h07.m4538h(sharedPreferences7);
                                            Object objM4514P19 = c1836h07.m4514P();
                                            if (zM4538h15 || objM4514P19 == c1823e6) {
                                                objM4514P19 = new C5441wh(sharedPreferences7, interfaceC1809a120, 5);
                                                c1836h07.m4545k0(objM4514P19);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P19, c1836h07, "结束时间", str13, false);
                                            c1836h07.m4553p(false);
                                        } else {
                                            c1836h07.m4525a0(-784792070);
                                            c1836h07.m4553p(false);
                                        }
                                    } else {
                                        c1836h07.m4519V();
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
