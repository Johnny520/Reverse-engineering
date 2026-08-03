package p332wb;

import gg.AbstractC1416l;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p276sf.C3967n;
import p315v8.C4521a;
import sh.C4029m1;

/* JADX INFO: renamed from: wb.la */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5071la implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18578g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f18579h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18580i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18581j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5071la(C5132n5 c5132n5, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f18578g = 10;
        this.f18579h = interfaceC1809a1;
        this.f18580i = interfaceC1809a12;
        this.f18581j = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f18578g;
        int i10 = 21;
        int i11 = 4;
        int i12 = 20;
        C1823e c1823e = C1851l.f6155a;
        int i13 = 3;
        C3967n c3967n = C3967n.f12976a;
        InterfaceC1809a1 interfaceC1809a1 = this.f18581j;
        InterfaceC1809a1 interfaceC1809a12 = this.f18580i;
        InterfaceC1809a1 interfaceC1809a13 = this.f18579h;
        switch (i9) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    Object objM4514P = c1836h0.m4514P();
                    if (objM4514P == c1823e) {
                        objM4514P = new C5534zd(interfaceC1809a13, 17);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "发送文本格式", "将聊天发送的文字按自定义格式处理", false, (InterfaceC1231l) objM4514P, c1836h0, 25008, 8);
                    if (((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                        c1836h0.m4525a0(-196295545);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        String str = (String) interfaceC1809a12.getValue();
                        List list = AbstractC4955ho.f17694i;
                        Object objM4514P2 = c1836h0.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C5534zd(interfaceC1809a12, 18);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9571i4("文本格式", "点击下方中文变量插入到光标位置", str, list, 2, (InterfaceC1231l) objM4514P2, c1836h0, 221238, 0);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        String str2 = (String) interfaceC1809a1.getValue();
                        Object objM4514P3 = c1836h0.m4514P();
                        if (objM4514P3 == c1823e) {
                            objM4514P3 = new C5534zd(interfaceC1809a1, 19);
                            c1836h0.m4545k0(objM4514P3);
                        }
                        AbstractC4955ho.m9304C1("时间格式", "例如 HH:mm:ss 或 yyyy-MM-dd HH:mm:ss", str2, 0, (InterfaceC1231l) objM4514P3, c1836h0, 24630, 8);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-195657441);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str3 = (String) interfaceC1809a13.getValue();
                    List list2 = AbstractC4955ho.f17698m;
                    Object objM4514P4 = c1836h02.m4514P();
                    if (objM4514P4 == c1823e) {
                        objM4514P4 = new C5534zd(interfaceC1809a13, 2);
                        c1836h02.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9571i4("文本格式", "留空使用默认格式", str3, list2, 0, (InterfaceC1231l) objM4514P4, c1836h02, 196662, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str4 = (String) interfaceC1809a12.getValue();
                    Object objM4514P5 = c1836h02.m4514P();
                    if (objM4514P5 == c1823e) {
                        objM4514P5 = new C5534zd(interfaceC1809a12, 3);
                        c1836h02.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9304C1("时间格式", "使用日期格式，例如 yyyy-MM-dd HH:mm:ss", str4, 0, (InterfaceC1231l) objM4514P5, c1836h02, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                    Object objM4514P6 = c1836h02.m4514P();
                    if (objM4514P6 == c1823e) {
                        objM4514P6 = new C5534zd(interfaceC1809a1, 4);
                        c1836h02.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "隐藏可见范围", "隐藏朋友圈底部的可见范围图标", false, (InterfaceC1231l) objM4514P6, c1836h02, 25008, 8);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    Object objM4514P7 = c1836h03.m4514P();
                    if (objM4514P7 == c1823e) {
                        objM4514P7 = new C4712ab(interfaceC1809a13, 16);
                        c1836h03.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, "消息显示时间", "开启后按所选位置显示自定义消息时间", false, (InterfaceC1231l) objM4514P7, c1836h03, 25008, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a12.getValue()).booleanValue();
                    Object objM4514P8 = c1836h03.m4514P();
                    if (objM4514P8 == c1823e) {
                        objM4514P8 = new C4712ab(interfaceC1809a12, 17);
                        c1836h03.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue4, "点击显详情", "点击详情文字后打开消息内容详情", false, (InterfaceC1231l) objM4514P8, c1836h03, 25008, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    boolean zBooleanValue5 = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                    Object objM4514P9 = c1836h03.m4514P();
                    if (objM4514P9 == c1823e) {
                        objM4514P9 = new C4712ab(interfaceC1809a1, 18);
                        c1836h03.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue5, "内容格式化", "打开详情时格式化 XML 内容", false, (InterfaceC1231l) objM4514P9, c1836h03, 25008, 8);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str5 = (String) interfaceC1809a13.getValue();
                    List list3 = AbstractC4955ho.f17695j;
                    Object objM4514P10 = c1836h04.m4514P();
                    if (objM4514P10 == c1823e) {
                        objM4514P10 = new C5341tg(interfaceC1809a13, 18);
                        c1836h04.m4545k0(objM4514P10);
                    }
                    AbstractC4955ho.m9571i4("通知标题模板", "默认：有人@我 %sender%", str5, list3, 0, (InterfaceC1231l) objM4514P10, c1836h04, 196614, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    String str6 = (String) interfaceC1809a12.getValue();
                    Object objM4514P11 = c1836h04.m4514P();
                    if (objM4514P11 == c1823e) {
                        objM4514P11 = new C5341tg(interfaceC1809a12, 19);
                        c1836h04.m4545k0(objM4514P11);
                    }
                    AbstractC4955ho.m9571i4("通知内容模板", "默认：%content%", str6, list3, 3, (InterfaceC1231l) objM4514P11, c1836h04, 221190, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    String str7 = (String) interfaceC1809a1.getValue();
                    Object objM4514P12 = c1836h04.m4514P();
                    if (objM4514P12 == c1823e) {
                        objM4514P12 = new C5341tg(interfaceC1809a1, 20);
                        c1836h04.m4545k0(objM4514P12);
                    }
                    AbstractC4955ho.m9571i4("Toast 文字模板", "默认：有人 @ 你", str7, list3, 0, (InterfaceC1231l) objM4514P12, c1836h04, 196614, 16);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zBooleanValue6 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    boolean zM4534f = c1836h05.m4534f(interfaceC1809a13) | c1836h05.m4534f(interfaceC1809a12);
                    Object objM4514P13 = c1836h05.m4514P();
                    if (zM4534f || objM4514P13 == c1823e) {
                        objM4514P13 = new C4029m1(12, interfaceC1809a13, interfaceC1809a12);
                        c1836h05.m4545k0(objM4514P13);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue6, "所有消息", "开启后该模板命中范围内全部类型生效", false, (InterfaceC1231l) objM4514P13, c1836h05, 432, 8);
                    if (((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                        c1836h05.m4525a0(1768304363);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(1767041609);
                        c1836h05.m4525a0(-1189923493);
                        for (C4838e6 c4838e6 : AbstractC4955ho.m9618n6()) {
                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                            boolean zContains = ((Set) interfaceC1809a1.getValue()).contains(c4838e6.f16756a);
                            String str8 = c4838e6.f16757b;
                            String str9 = c4838e6.f16758c;
                            boolean zM4534f2 = c1836h05.m4534f(interfaceC1809a1) | c1836h05.m4534f(c4838e6) | c1836h05.m4534f(interfaceC1809a12);
                            Object objM4514P14 = c1836h05.m4514P();
                            if (zM4534f2 || objM4514P14 == c1823e) {
                                objM4514P14 = new C5111mh(c4838e6, interfaceC1809a1, interfaceC1809a12, 1);
                                c1836h05.m4545k0(objM4514P14);
                            }
                            AbstractC4955ho.m9410P3(zContains, str8, str9, false, (InterfaceC1231l) objM4514P14, c1836h05, 0, 8);
                        }
                        c1836h05.m4553p(false);
                        if (((Set) interfaceC1809a1.getValue()).contains(WeChatSnsPost.TYPE_TEXT)) {
                            c1836h05.m4525a0(1767937540);
                            AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                            String str10 = (String) interfaceC1809a12.getValue();
                            boolean zM4534f3 = c1836h05.m4534f(interfaceC1809a12);
                            Object objM4514P15 = c1836h05.m4514P();
                            if (zM4534f3 || objM4514P15 == c1823e) {
                                objM4514P15 = new C5177oh(interfaceC1809a12, 11);
                                c1836h05.m4545k0(objM4514P15);
                            }
                            AbstractC4955ho.m9304C1("文字关键词", "仅文字消息生效；多个用 |、逗号或换行分隔，留空则全部文字命中", str10, 2, (InterfaceC1231l) objM4514P15, c1836h05, 3126, 0);
                            c1836h05.m4553p(false);
                        } else {
                            c1836h05.m4525a0(1768282539);
                            c1836h05.m4553p(false);
                        }
                        c1836h05.m4553p(false);
                    }
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 5:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String str11 = (String) interfaceC1809a13.getValue();
                    boolean zM4534f4 = c1836h06.m4534f(interfaceC1809a13);
                    Object objM4514P16 = c1836h06.m4514P();
                    if (zM4534f4 || objM4514P16 == c1823e) {
                        objM4514P16 = new C4752bi(interfaceC1809a13, 25);
                        c1836h06.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9304C1("模板名称", "用于列表和批量套用", str11, 0, (InterfaceC1231l) objM4514P16, c1836h06, 54, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    boolean zBooleanValue7 = ((Boolean) interfaceC1809a12.getValue()).booleanValue();
                    boolean zM4534f5 = c1836h06.m4534f(interfaceC1809a12);
                    Object objM4514P17 = c1836h06.m4514P();
                    if (zM4534f5 || objM4514P17 == c1823e) {
                        objM4514P17 = new C4752bi(interfaceC1809a12, 26);
                        c1836h06.m4545k0(objM4514P17);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue7, "启用模板", "关闭后已绑定群不会发送改名提醒", false, (InterfaceC1231l) objM4514P17, c1836h06, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    String str12 = (String) interfaceC1809a1.getValue();
                    boolean zM4534f6 = c1836h06.m4534f(interfaceC1809a1);
                    Object objM4514P18 = c1836h06.m4514P();
                    if (zM4534f6 || objM4514P18 == c1823e) {
                        objM4514P18 = new C4752bi(interfaceC1809a1, 27);
                        c1836h06.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9695w2("整体延迟", "单位秒，0-600", str12, (InterfaceC1231l) objM4514P18, c1836h06, 54);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 6:
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String strM9671t5 = AbstractC4955ho.m9671t5((List) interfaceC1809a12.getValue());
                    boolean zM4534f7 = c1836h07.m4534f(interfaceC1809a13);
                    Object objM4514P19 = c1836h07.m4514P();
                    if (zM4534f7 || objM4514P19 == c1823e) {
                        objM4514P19 = new C4749bf(interfaceC1809a13, 17);
                        c1836h07.m4545k0(objM4514P19);
                    }
                    AbstractC4955ho.m9704x3("私聊红包回复", strM9671t5, (InterfaceC1220a) objM4514P19, c1836h07, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                    String strM9671t52 = AbstractC4955ho.m9671t5((List) interfaceC1809a1.getValue());
                    boolean zM4534f8 = c1836h07.m4534f(interfaceC1809a13);
                    Object objM4514P20 = c1836h07.m4514P();
                    if (zM4534f8 || objM4514P20 == c1823e) {
                        objM4514P20 = new C4749bf(interfaceC1809a13, 18);
                        c1836h07.m4545k0(objM4514P20);
                    }
                    AbstractC4955ho.m9704x3("群红包回复", strM9671t52, (InterfaceC1220a) objM4514P20, c1836h07, 6);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 7:
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zBooleanValue8 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    boolean zM4534f9 = c1836h08.m4534f(interfaceC1809a13);
                    Object objM4514P21 = c1836h08.m4514P();
                    if (zM4534f9 || objM4514P21 == c1823e) {
                        objM4514P21 = new C4916gi(interfaceC1809a13, 19);
                        c1836h08.m4545k0(objM4514P21);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue8, "开启时段静默", "指定时间内不弹通知", false, (InterfaceC1231l) objM4514P21, c1836h08, 432, 8);
                    if (((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                        c1836h08.m4525a0(1093905866);
                        AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                        String str13 = (String) interfaceC1809a12.getValue();
                        boolean zM4534f10 = c1836h08.m4534f(interfaceC1809a12);
                        Object objM4514P22 = c1836h08.m4514P();
                        if (zM4534f10 || objM4514P22 == c1823e) {
                            objM4514P22 = new C4916gi(interfaceC1809a12, i12);
                            c1836h08.m4545k0(objM4514P22);
                        }
                        AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P22, c1836h08, "开始时间", str13, false);
                        AbstractC4955ho.m9312D1(0.0f, c1836h08, 0, 1);
                        String str14 = (String) interfaceC1809a1.getValue();
                        boolean zM4534f11 = c1836h08.m4534f(interfaceC1809a1);
                        Object objM4514P23 = c1836h08.m4514P();
                        if (zM4534f11 || objM4514P23 == c1823e) {
                            objM4514P23 = new C4916gi(interfaceC1809a1, i10);
                            c1836h08.m4545k0(objM4514P23);
                        }
                        AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P23, c1836h08, "结束时间", str14, false);
                        c1836h08.m4553p(false);
                    } else {
                        c1836h08.m4525a0(1094154765);
                        c1836h08.m4553p(false);
                    }
                } else {
                    c1836h08.m4519V();
                }
                break;
            case 8:
                C1836h0 c1836h09 = (C1836h0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String str15 = (String) interfaceC1809a13.getValue();
                    List list4 = AbstractC4955ho.f17695j;
                    Object objM4514P24 = c1836h09.m4514P();
                    if (objM4514P24 == c1823e) {
                        objM4514P24 = new C5341tg(interfaceC1809a13, 23);
                        c1836h09.m4545k0(objM4514P24);
                    }
                    AbstractC4955ho.m9571i4("通知标题模板", "默认：%keyword% %sender%", str15, list4, 0, (InterfaceC1231l) objM4514P24, c1836h09, 196614, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h09, 0, 1);
                    String str16 = (String) interfaceC1809a12.getValue();
                    Object objM4514P25 = c1836h09.m4514P();
                    if (objM4514P25 == c1823e) {
                        objM4514P25 = new C5341tg(interfaceC1809a12, 24);
                        c1836h09.m4545k0(objM4514P25);
                    }
                    AbstractC4955ho.m9571i4("通知内容模板", "默认：%content%", str16, list4, 3, (InterfaceC1231l) objM4514P25, c1836h09, 221190, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h09, 0, 1);
                    String str17 = (String) interfaceC1809a1.getValue();
                    Object objM4514P26 = c1836h09.m4514P();
                    if (objM4514P26 == c1823e) {
                        objM4514P26 = new C5341tg(interfaceC1809a1, 25);
                        c1836h09.m4545k0(objM4514P26);
                    }
                    AbstractC4955ho.m9571i4("Toast 文字模板", "默认：%keyword%", str17, list4, 0, (InterfaceC1231l) objM4514P26, c1836h09, 196614, 16);
                } else {
                    c1836h09.m4519V();
                }
                break;
            case 9:
                C1836h0 c1836h010 = (C1836h0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    String str18 = (String) interfaceC1809a13.getValue();
                    List list5 = AbstractC4955ho.f17695j;
                    Object objM4514P27 = c1836h010.m4514P();
                    if (objM4514P27 == c1823e) {
                        objM4514P27 = new C5341tg(interfaceC1809a13, 5);
                        c1836h010.m4545k0(objM4514P27);
                    }
                    AbstractC4955ho.m9571i4("通知标题模板", "默认：关键词通知 %sender%", str18, list5, 0, (InterfaceC1231l) objM4514P27, c1836h010, 196614, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h010, 0, 1);
                    String str19 = (String) interfaceC1809a12.getValue();
                    Object objM4514P28 = c1836h010.m4514P();
                    if (objM4514P28 == c1823e) {
                        objM4514P28 = new C5341tg(interfaceC1809a12, 6);
                        c1836h010.m4545k0(objM4514P28);
                    }
                    AbstractC4955ho.m9571i4("通知内容模板", "默认：%content%", str19, list5, 3, (InterfaceC1231l) objM4514P28, c1836h010, 221190, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h010, 0, 1);
                    String str20 = (String) interfaceC1809a1.getValue();
                    Object objM4514P29 = c1836h010.m4514P();
                    if (objM4514P29 == c1823e) {
                        objM4514P29 = new C5341tg(interfaceC1809a1, 7);
                        c1836h010.m4545k0(objM4514P29);
                    }
                    AbstractC4955ho.m9571i4("Toast 文字模板", "默认：收到关注消息", str20, list5, 0, (InterfaceC1231l) objM4514P29, c1836h010, 196614, 16);
                } else {
                    c1836h010.m4519V();
                }
                break;
            case 10:
                C1836h0 c1836h011 = (C1836h0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    EnumC5033k5 enumC5033k5 = (EnumC5033k5) interfaceC1809a13.getValue();
                    boolean zM4534f12 = c1836h011.m4534f(interfaceC1809a13) | c1836h011.m4534f(interfaceC1809a12) | c1836h011.m4534f(interfaceC1809a1);
                    Object objM4514P30 = c1836h011.m4514P();
                    if (zM4534f12 || objM4514P30 == c1823e) {
                        objM4514P30 = new C4714ad(interfaceC1809a13, interfaceC1809a12, interfaceC1809a1, 2);
                        c1836h011.m4545k0(objM4514P30);
                    }
                    AbstractC4955ho.m9440T1(enumC5033k5, false, (InterfaceC1231l) objM4514P30, c1836h011, 0);
                } else {
                    c1836h011.m4519V();
                }
                break;
            case 11:
                C1836h0 c1836h012 = (C1836h0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    String str21 = (String) interfaceC1809a13.getValue();
                    Object objM4514P31 = c1836h012.m4514P();
                    if (objM4514P31 == c1823e) {
                        objM4514P31 = new C5145ni(interfaceC1809a13, 20);
                        c1836h012.m4545k0(objM4514P31);
                    }
                    AbstractC4955ho.m9304C1("WebSocket 地址", "小智服务地址", str21, 0, (InterfaceC1231l) objM4514P31, c1836h012, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h012, 0, 1);
                    String str22 = (String) interfaceC1809a12.getValue();
                    Object objM4514P32 = c1836h012.m4514P();
                    if (objM4514P32 == c1823e) {
                        objM4514P32 = new C5145ni(interfaceC1809a12, 21);
                        c1836h012.m4545k0(objM4514P32);
                    }
                    AbstractC4955ho.m9304C1("OTA 地址", "小智 OTA 地址", str22, 0, (InterfaceC1231l) objM4514P32, c1836h012, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h012, 0, 1);
                    String str23 = (String) interfaceC1809a1.getValue();
                    Object objM4514P33 = c1836h012.m4514P();
                    if (objM4514P33 == c1823e) {
                        objM4514P33 = new C5145ni(interfaceC1809a1, 22);
                        c1836h012.m4545k0(objM4514P33);
                    }
                    AbstractC4955ho.m9304C1("控制台地址", "用于查看或绑定设备", str23, 0, (InterfaceC1231l) objM4514P33, c1836h012, 24630, 8);
                } else {
                    c1836h012.m4519V();
                }
                break;
            case 12:
                C1836h0 c1836h013 = (C1836h0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c1836h013.m4516S(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    String str24 = (String) interfaceC1809a13.getValue();
                    if (AbstractC3149m.m6721t0(str24)) {
                        str24 = "未设置 WebSocket 地址";
                    }
                    Object objM4514P34 = c1836h013.m4514P();
                    if (objM4514P34 == c1823e) {
                        objM4514P34 = new C4753bj(interfaceC1809a12, i13);
                        c1836h013.m4545k0(objM4514P34);
                    }
                    AbstractC4955ho.m9503b("小智AI配置", str24, (InterfaceC1220a) objM4514P34, c1836h013, 390);
                    AbstractC4955ho.m9312D1(0.0f, c1836h013, 0, 1);
                    String strM9263g = AbstractC4855en.m9263g("当前启用：", (String) interfaceC1809a1.getValue());
                    Object objM4514P35 = c1836h013.m4514P();
                    if (objM4514P35 == c1823e) {
                        objM4514P35 = new C4753bj(interfaceC1809a12, i11);
                        c1836h013.m4545k0(objM4514P35);
                    }
                    AbstractC4955ho.m9503b("智聊AI配置", strM9263g, (InterfaceC1220a) objM4514P35, c1836h013, 390);
                } else {
                    c1836h013.m4519V();
                }
                break;
            case 13:
                C4521a c4521a = (C4521a) obj;
                EnumC4864f enumC4864f = (EnumC4864f) obj2;
                c4521a.getClass();
                enumC4864f.getClass();
                interfaceC1809a13.setValue(c4521a);
                interfaceC1809a12.setValue(enumC4864f);
                interfaceC1809a1.setValue(EnumC4897g.f17316j);
                break;
            case 14:
                String str25 = (String) obj;
                String str26 = (String) obj2;
                str25.getClass();
                str26.getClass();
                interfaceC1809a13.setValue(str25);
                interfaceC1809a12.setValue(str26);
                interfaceC1809a1.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 15:
                List list6 = (List) obj;
                Throwable th2 = (Throwable) obj2;
                C3147k c3147k = AbstractC4955ho.f17686a;
                interfaceC1809a13.setValue(Boolean.FALSE);
                if (th2 != null) {
                    String message = th2.getMessage();
                    interfaceC1809a12.setValue(message != null ? message : "读取联系人失败");
                } else {
                    interfaceC1809a1.setValue(list6);
                }
                break;
            case 16:
                List list7 = (List) obj;
                Throwable th3 = (Throwable) obj2;
                C3147k c3147k2 = AbstractC4955ho.f17686a;
                interfaceC1809a13.setValue(Boolean.FALSE);
                if (th3 != null) {
                    String message2 = th3.getMessage();
                    if (message2 == null) {
                        message2 = "读取群成员失败";
                    }
                    interfaceC1809a12.setValue(message2);
                } else {
                    interfaceC1809a1.setValue(list7);
                }
                break;
            case 17:
                C5000j5 c5000j5 = (C5000j5) obj;
                Throwable th4 = (Throwable) obj2;
                C3147k c3147k3 = AbstractC4955ho.f17686a;
                interfaceC1809a13.setValue(Boolean.FALSE);
                if (th4 != null) {
                    String message3 = th4.getMessage();
                    interfaceC1809a12.setValue(message3 != null ? message3 : "读取联系人失败");
                } else {
                    interfaceC1809a1.setValue(c5000j5);
                }
                break;
            default:
                C1836h0 c1836h014 = (C1836h0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c1836h014.m4516S(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    String str27 = AbstractC1416l.m3825a((String) interfaceC1809a13.getValue(), "downloads") ? "热门（按下载量）" : "最新发布";
                    List listM101y0 = AbstractC0000a.m101y0(new C4825dq("latest", "最新"), new C4825dq("downloads", "热门"));
                    String str28 = (String) interfaceC1809a13.getValue();
                    boolean zM4534f13 = c1836h014.m4534f(interfaceC1809a13);
                    Object objM4514P36 = c1836h014.m4514P();
                    if (zM4534f13 || objM4514P36 == c1823e) {
                        objM4514P36 = new C4917gj(interfaceC1809a13, 29);
                        c1836h014.m4545k0(objM4514P36);
                    }
                    AbstractC4955ho.m9353I2("排序方式", str27, listM101y0, str28, (InterfaceC1231l) objM4514P36, false, c1836h014, 6, 32);
                    AbstractC4955ho.m9312D1(0.0f, c1836h014, 0, 1);
                    String str29 = ((Boolean) interfaceC1809a12.getValue()).booleanValue() ? "正在加载在线插件" : "重新获取当前列表";
                    Object objM4514P37 = c1836h014.m4514P();
                    if (objM4514P37 == c1823e) {
                        objM4514P37 = new C4919gl(interfaceC1809a1, 28);
                        c1836h014.m4545k0(objM4514P37);
                    }
                    AbstractC4955ho.m9503b("刷新", str29, (InterfaceC1220a) objM4514P37, c1836h014, 390);
                } else {
                    c1836h014.m4519V();
                }
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C5071la(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, int i9) {
        this.f18578g = i9;
        this.f18579h = interfaceC1809a1;
        this.f18580i = interfaceC1809a12;
        this.f18581j = interfaceC1809a13;
    }
}
