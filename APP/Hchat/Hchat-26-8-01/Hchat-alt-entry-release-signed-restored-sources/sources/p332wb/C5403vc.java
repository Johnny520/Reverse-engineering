package p332wb;

import android.content.SharedPreferences;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.vc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5403vc implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21359g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f21360h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21361i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5403vc(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21359g = i9;
        this.f21360h = sharedPreferences;
        this.f21361i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f21359g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 5;
                    final SharedPreferences sharedPreferences = this.f21360h;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f21361i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1732287181, new InterfaceC1235p() { // from class: wb.m8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        AbstractC4955ho.m9402O3(sharedPreferences2, "enable", "群员头衔", "在群聊昵称左侧显示身份头衔", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a12 = interfaceC1809a1;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a12.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences2);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4538h || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C5435wb(sharedPreferences2, interfaceC1809a12, 6);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "显示普通群员", "关闭后只显示群主、管理员和自定义头衔", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences3 = sharedPreferences;
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "protobuf_packet_enable", "Protobuf 抓包", "开启后输出请求和响应到 LSPosed 日志", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "protobuf_packet_capture_request", "抓请求", "记录请求 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "protobuf_packet_capture_response", "抓响应", "记录响应 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a13 = interfaceC1809a1;
                                        String str = (String) interfaceC1809a13.getValue();
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4944hd(interfaceC1809a13, 3);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9304C1("过滤 Type", "多个 Type 用逗号或空格分隔", str, 3, (InterfaceC1231l) objM4514P2, c1836h03, 27702, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a14 = interfaceC1809a1;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5435wb(sharedPreferences4, interfaceC1809a14, 7);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "跳过小程序视频广告", "自动跳过小程序视频广告", false, (InterfaceC1231l) objM4514P3, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a1;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences;
                                        boolean zM4538h3 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P4 = c1836h05.m4514P();
                                        if (zM4538h3 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5435wb(sharedPreferences5, interfaceC1809a15, 20);
                                            c1836h05.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "兼容低版本小程序", "伪装启动基础库版本并阻止官方升级页", false, (InterfaceC1231l) objM4514P4, c1836h05, 432, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a1;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences;
                                        boolean zM4538h4 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P5 = c1836h06.m4514P();
                                        if (zM4538h4 || objM4514P5 == C1851l.f6155a) {
                                            objM4514P5 = new C5435wb(sharedPreferences6, interfaceC1809a16, 8);
                                            c1836h06.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "跳过全局小程序开屏广告", "阻止所有小程序展示启动开屏广告，修改后需重启微信", false, (InterfaceC1231l) objM4514P5, c1836h06, 432, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a1;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences;
                                        boolean zM4538h5 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P6 = c1836h07.m4514P();
                                        if (zM4538h5 || objM4514P6 == C1851l.f6155a) {
                                            objM4514P6 = new C5441wh(sharedPreferences7, interfaceC1809a17, 1);
                                            c1836h07.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "朋友圈自动转发", "按规则静默转发指定好友的新朋友圈", false, (InterfaceC1231l) objM4514P6, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a1;
                                        String str2 = (String) interfaceC1809a18.getValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences;
                                        boolean zM4538h6 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P7 = c1836h08.m4514P();
                                        if (zM4538h6 || objM4514P7 == C1851l.f6155a) {
                                            objM4514P7 = new C5242qg(sharedPreferences8, interfaceC1809a18, 15);
                                            c1836h08.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9304C1("触发词", "多个触发词用逗号分隔", str2, 0, (InterfaceC1231l) objM4514P7, c1836h08, 54, 8);
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
                    final int i12 = 6;
                    final SharedPreferences sharedPreferences2 = this.f21360h;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f21361i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(34595790, new InterfaceC1235p() { // from class: wb.m8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "enable", "群员头衔", "在群聊昵称左侧显示身份头衔", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a12;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4538h || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a122, 6);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "显示普通群员", "关闭后只显示群主、管理员和自定义头衔", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "protobuf_packet_enable", "Protobuf 抓包", "开启后输出请求和响应到 LSPosed 日志", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "protobuf_packet_capture_request", "抓请求", "记录请求 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences3, "protobuf_packet_capture_response", "抓响应", "记录响应 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a13 = interfaceC1809a12;
                                        String str = (String) interfaceC1809a13.getValue();
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4944hd(interfaceC1809a13, 3);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9304C1("过滤 Type", "多个 Type 用逗号或空格分隔", str, 3, (InterfaceC1231l) objM4514P2, c1836h03, 27702, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a14 = interfaceC1809a12;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences2;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5435wb(sharedPreferences4, interfaceC1809a14, 7);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "跳过小程序视频广告", "自动跳过小程序视频广告", false, (InterfaceC1231l) objM4514P3, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a12;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences2;
                                        boolean zM4538h3 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P4 = c1836h05.m4514P();
                                        if (zM4538h3 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5435wb(sharedPreferences5, interfaceC1809a15, 20);
                                            c1836h05.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "兼容低版本小程序", "伪装启动基础库版本并阻止官方升级页", false, (InterfaceC1231l) objM4514P4, c1836h05, 432, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a12;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences2;
                                        boolean zM4538h4 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P5 = c1836h06.m4514P();
                                        if (zM4538h4 || objM4514P5 == C1851l.f6155a) {
                                            objM4514P5 = new C5435wb(sharedPreferences6, interfaceC1809a16, 8);
                                            c1836h06.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "跳过全局小程序开屏广告", "阻止所有小程序展示启动开屏广告，修改后需重启微信", false, (InterfaceC1231l) objM4514P5, c1836h06, 432, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a12;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences2;
                                        boolean zM4538h5 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P6 = c1836h07.m4514P();
                                        if (zM4538h5 || objM4514P6 == C1851l.f6155a) {
                                            objM4514P6 = new C5441wh(sharedPreferences7, interfaceC1809a17, 1);
                                            c1836h07.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "朋友圈自动转发", "按规则静默转发指定好友的新朋友圈", false, (InterfaceC1231l) objM4514P6, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a12;
                                        String str2 = (String) interfaceC1809a18.getValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences2;
                                        boolean zM4538h6 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P7 = c1836h08.m4514P();
                                        if (zM4538h6 || objM4514P7 == C1851l.f6155a) {
                                            objM4514P7 = new C5242qg(sharedPreferences8, interfaceC1809a18, 15);
                                            c1836h08.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9304C1("触发词", "多个触发词用逗号分隔", str2, 0, (InterfaceC1231l) objM4514P7, c1836h08, 54, 8);
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
                    final int i13 = 4;
                    final SharedPreferences sharedPreferences3 = this.f21360h;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f21361i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-183087282, new InterfaceC1235p() { // from class: wb.m8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences3;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "enable", "群员头衔", "在群聊昵称左侧显示身份头衔", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a13;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4538h || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a122, 6);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "显示普通群员", "关闭后只显示群主、管理员和自定义头衔", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences3;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_enable", "Protobuf 抓包", "开启后输出请求和响应到 LSPosed 日志", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_request", "抓请求", "记录请求 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_response", "抓响应", "记录响应 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a13;
                                        String str = (String) interfaceC1809a132.getValue();
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4944hd(interfaceC1809a132, 3);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9304C1("过滤 Type", "多个 Type 用逗号或空格分隔", str, 3, (InterfaceC1231l) objM4514P2, c1836h03, 27702, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a14 = interfaceC1809a13;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences4 = sharedPreferences3;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences4);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5435wb(sharedPreferences4, interfaceC1809a14, 7);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "跳过小程序视频广告", "自动跳过小程序视频广告", false, (InterfaceC1231l) objM4514P3, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a13;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences3;
                                        boolean zM4538h3 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P4 = c1836h05.m4514P();
                                        if (zM4538h3 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5435wb(sharedPreferences5, interfaceC1809a15, 20);
                                            c1836h05.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "兼容低版本小程序", "伪装启动基础库版本并阻止官方升级页", false, (InterfaceC1231l) objM4514P4, c1836h05, 432, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a13;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences3;
                                        boolean zM4538h4 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P5 = c1836h06.m4514P();
                                        if (zM4538h4 || objM4514P5 == C1851l.f6155a) {
                                            objM4514P5 = new C5435wb(sharedPreferences6, interfaceC1809a16, 8);
                                            c1836h06.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "跳过全局小程序开屏广告", "阻止所有小程序展示启动开屏广告，修改后需重启微信", false, (InterfaceC1231l) objM4514P5, c1836h06, 432, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a13;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences3;
                                        boolean zM4538h5 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P6 = c1836h07.m4514P();
                                        if (zM4538h5 || objM4514P6 == C1851l.f6155a) {
                                            objM4514P6 = new C5441wh(sharedPreferences7, interfaceC1809a17, 1);
                                            c1836h07.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "朋友圈自动转发", "按规则静默转发指定好友的新朋友圈", false, (InterfaceC1231l) objM4514P6, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a13;
                                        String str2 = (String) interfaceC1809a18.getValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences3;
                                        boolean zM4538h6 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P7 = c1836h08.m4514P();
                                        if (zM4538h6 || objM4514P7 == C1851l.f6155a) {
                                            objM4514P7 = new C5242qg(sharedPreferences8, interfaceC1809a18, 15);
                                            c1836h08.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9304C1("触发词", "多个触发词用逗号分隔", str2, 0, (InterfaceC1231l) objM4514P7, c1836h08, 54, 8);
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
                    final int i14 = 1;
                    final SharedPreferences sharedPreferences4 = this.f21360h;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f21361i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(291268601, new InterfaceC1235p() { // from class: wb.m8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i14) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences4;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "enable", "群员头衔", "在群聊昵称左侧显示身份头衔", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a14;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4538h || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a122, 6);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "显示普通群员", "关闭后只显示群主、管理员和自定义头衔", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences4;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_enable", "Protobuf 抓包", "开启后输出请求和响应到 LSPosed 日志", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_request", "抓请求", "记录请求 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_response", "抓响应", "记录响应 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a14;
                                        String str = (String) interfaceC1809a132.getValue();
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4944hd(interfaceC1809a132, 3);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9304C1("过滤 Type", "多个 Type 用逗号或空格分隔", str, 3, (InterfaceC1231l) objM4514P2, c1836h03, 27702, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a14;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences4;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5435wb(sharedPreferences42, interfaceC1809a142, 7);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "跳过小程序视频广告", "自动跳过小程序视频广告", false, (InterfaceC1231l) objM4514P3, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a14;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences5 = sharedPreferences4;
                                        boolean zM4538h3 = c1836h05.m4538h(sharedPreferences5);
                                        Object objM4514P4 = c1836h05.m4514P();
                                        if (zM4538h3 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5435wb(sharedPreferences5, interfaceC1809a15, 20);
                                            c1836h05.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "兼容低版本小程序", "伪装启动基础库版本并阻止官方升级页", false, (InterfaceC1231l) objM4514P4, c1836h05, 432, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a14;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences4;
                                        boolean zM4538h4 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P5 = c1836h06.m4514P();
                                        if (zM4538h4 || objM4514P5 == C1851l.f6155a) {
                                            objM4514P5 = new C5435wb(sharedPreferences6, interfaceC1809a16, 8);
                                            c1836h06.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "跳过全局小程序开屏广告", "阻止所有小程序展示启动开屏广告，修改后需重启微信", false, (InterfaceC1231l) objM4514P5, c1836h06, 432, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a14;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences4;
                                        boolean zM4538h5 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P6 = c1836h07.m4514P();
                                        if (zM4538h5 || objM4514P6 == C1851l.f6155a) {
                                            objM4514P6 = new C5441wh(sharedPreferences7, interfaceC1809a17, 1);
                                            c1836h07.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "朋友圈自动转发", "按规则静默转发指定好友的新朋友圈", false, (InterfaceC1231l) objM4514P6, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a14;
                                        String str2 = (String) interfaceC1809a18.getValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences4;
                                        boolean zM4538h6 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P7 = c1836h08.m4514P();
                                        if (zM4538h6 || objM4514P7 == C1851l.f6155a) {
                                            objM4514P7 = new C5242qg(sharedPreferences8, interfaceC1809a18, 15);
                                            c1836h08.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9304C1("触发词", "多个触发词用逗号分隔", str2, 0, (InterfaceC1231l) objM4514P7, c1836h08, 54, 8);
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
                    final int i15 = 0;
                    final SharedPreferences sharedPreferences5 = this.f21360h;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f21361i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(108306350, new InterfaceC1235p() { // from class: wb.m8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i15) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences5;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "enable", "群员头衔", "在群聊昵称左侧显示身份头衔", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a15;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4538h || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a122, 6);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "显示普通群员", "关闭后只显示群主、管理员和自定义头衔", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences5;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_enable", "Protobuf 抓包", "开启后输出请求和响应到 LSPosed 日志", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_request", "抓请求", "记录请求 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_response", "抓响应", "记录响应 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a15;
                                        String str = (String) interfaceC1809a132.getValue();
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4944hd(interfaceC1809a132, 3);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9304C1("过滤 Type", "多个 Type 用逗号或空格分隔", str, 3, (InterfaceC1231l) objM4514P2, c1836h03, 27702, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a15;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences5;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5435wb(sharedPreferences42, interfaceC1809a142, 7);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "跳过小程序视频广告", "自动跳过小程序视频广告", false, (InterfaceC1231l) objM4514P3, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a15;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a152.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences52 = sharedPreferences5;
                                        boolean zM4538h3 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P4 = c1836h05.m4514P();
                                        if (zM4538h3 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5435wb(sharedPreferences52, interfaceC1809a152, 20);
                                            c1836h05.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "兼容低版本小程序", "伪装启动基础库版本并阻止官方升级页", false, (InterfaceC1231l) objM4514P4, c1836h05, 432, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a15;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences6 = sharedPreferences5;
                                        boolean zM4538h4 = c1836h06.m4538h(sharedPreferences6);
                                        Object objM4514P5 = c1836h06.m4514P();
                                        if (zM4538h4 || objM4514P5 == C1851l.f6155a) {
                                            objM4514P5 = new C5435wb(sharedPreferences6, interfaceC1809a16, 8);
                                            c1836h06.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "跳过全局小程序开屏广告", "阻止所有小程序展示启动开屏广告，修改后需重启微信", false, (InterfaceC1231l) objM4514P5, c1836h06, 432, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a15;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences5;
                                        boolean zM4538h5 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P6 = c1836h07.m4514P();
                                        if (zM4538h5 || objM4514P6 == C1851l.f6155a) {
                                            objM4514P6 = new C5441wh(sharedPreferences7, interfaceC1809a17, 1);
                                            c1836h07.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "朋友圈自动转发", "按规则静默转发指定好友的新朋友圈", false, (InterfaceC1231l) objM4514P6, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a15;
                                        String str2 = (String) interfaceC1809a18.getValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences5;
                                        boolean zM4538h6 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P7 = c1836h08.m4514P();
                                        if (zM4538h6 || objM4514P7 == C1851l.f6155a) {
                                            objM4514P7 = new C5242qg(sharedPreferences8, interfaceC1809a18, 15);
                                            c1836h08.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9304C1("触发词", "多个触发词用逗号分隔", str2, 0, (InterfaceC1231l) objM4514P7, c1836h08, 54, 8);
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
                    final int i16 = 3;
                    final SharedPreferences sharedPreferences6 = this.f21360h;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f21361i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1561925776, new InterfaceC1235p() { // from class: wb.m8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i16) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences6;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "enable", "群员头衔", "在群聊昵称左侧显示身份头衔", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a16;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4538h || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a122, 6);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "显示普通群员", "关闭后只显示群主、管理员和自定义头衔", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences6;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_enable", "Protobuf 抓包", "开启后输出请求和响应到 LSPosed 日志", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_request", "抓请求", "记录请求 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_response", "抓响应", "记录响应 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a16;
                                        String str = (String) interfaceC1809a132.getValue();
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4944hd(interfaceC1809a132, 3);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9304C1("过滤 Type", "多个 Type 用逗号或空格分隔", str, 3, (InterfaceC1231l) objM4514P2, c1836h03, 27702, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a16;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences6;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5435wb(sharedPreferences42, interfaceC1809a142, 7);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "跳过小程序视频广告", "自动跳过小程序视频广告", false, (InterfaceC1231l) objM4514P3, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a16;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a152.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences52 = sharedPreferences6;
                                        boolean zM4538h3 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P4 = c1836h05.m4514P();
                                        if (zM4538h3 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5435wb(sharedPreferences52, interfaceC1809a152, 20);
                                            c1836h05.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "兼容低版本小程序", "伪装启动基础库版本并阻止官方升级页", false, (InterfaceC1231l) objM4514P4, c1836h05, 432, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a16;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a162.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences62 = sharedPreferences6;
                                        boolean zM4538h4 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P5 = c1836h06.m4514P();
                                        if (zM4538h4 || objM4514P5 == C1851l.f6155a) {
                                            objM4514P5 = new C5435wb(sharedPreferences62, interfaceC1809a162, 8);
                                            c1836h06.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "跳过全局小程序开屏广告", "阻止所有小程序展示启动开屏广告，修改后需重启微信", false, (InterfaceC1231l) objM4514P5, c1836h06, 432, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a16;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences7 = sharedPreferences6;
                                        boolean zM4538h5 = c1836h07.m4538h(sharedPreferences7);
                                        Object objM4514P6 = c1836h07.m4514P();
                                        if (zM4538h5 || objM4514P6 == C1851l.f6155a) {
                                            objM4514P6 = new C5441wh(sharedPreferences7, interfaceC1809a17, 1);
                                            c1836h07.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "朋友圈自动转发", "按规则静默转发指定好友的新朋友圈", false, (InterfaceC1231l) objM4514P6, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a16;
                                        String str2 = (String) interfaceC1809a18.getValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences6;
                                        boolean zM4538h6 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P7 = c1836h08.m4514P();
                                        if (zM4538h6 || objM4514P7 == C1851l.f6155a) {
                                            objM4514P7 = new C5242qg(sharedPreferences8, interfaceC1809a18, 15);
                                            c1836h08.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9304C1("触发词", "多个触发词用逗号分隔", str2, 0, (InterfaceC1231l) objM4514P7, c1836h08, 54, 8);
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
                    final int i17 = 2;
                    final SharedPreferences sharedPreferences7 = this.f21360h;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f21361i;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-317967255, new InterfaceC1235p() { // from class: wb.m8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i17) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        SharedPreferences sharedPreferences22 = sharedPreferences7;
                                        AbstractC4955ho.m9402O3(sharedPreferences22, "enable", "群员头衔", "在群聊昵称左侧显示身份头衔", false, c1836h02, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a17;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                                        boolean zM4538h = c1836h02.m4538h(sharedPreferences22);
                                        Object objM4514P = c1836h02.m4514P();
                                        if (zM4538h || objM4514P == C1851l.f6155a) {
                                            objM4514P = new C5435wb(sharedPreferences22, interfaceC1809a122, 6);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "显示普通群员", "关闭后只显示群主、管理员和自定义头衔", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        SharedPreferences sharedPreferences32 = sharedPreferences7;
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_enable", "Protobuf 抓包", "开启后输出请求和响应到 LSPosed 日志", false, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_request", "抓请求", "记录请求 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        AbstractC4955ho.m9402O3(sharedPreferences32, "protobuf_packet_capture_response", "抓响应", "记录响应 URI、Type 和 PB JSON", true, c1836h03, 28080);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a132 = interfaceC1809a17;
                                        String str = (String) interfaceC1809a132.getValue();
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (objM4514P2 == C1851l.f6155a) {
                                            objM4514P2 = new C4944hd(interfaceC1809a132, 3);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9304C1("过滤 Type", "多个 Type 用逗号或空格分隔", str, 3, (InterfaceC1231l) objM4514P2, c1836h03, 27702, 0);
                                    } else {
                                        c1836h03.m4519V();
                                    }
                                    break;
                                case 2:
                                    C1836h0 c1836h04 = (C1836h0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a17;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences42 = sharedPreferences7;
                                        boolean zM4538h2 = c1836h04.m4538h(sharedPreferences42);
                                        Object objM4514P3 = c1836h04.m4514P();
                                        if (zM4538h2 || objM4514P3 == C1851l.f6155a) {
                                            objM4514P3 = new C5435wb(sharedPreferences42, interfaceC1809a142, 7);
                                            c1836h04.m4545k0(objM4514P3);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue2, "跳过小程序视频广告", "自动跳过小程序视频广告", false, (InterfaceC1231l) objM4514P3, c1836h04, 432, 8);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a17;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a152.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences52 = sharedPreferences7;
                                        boolean zM4538h3 = c1836h05.m4538h(sharedPreferences52);
                                        Object objM4514P4 = c1836h05.m4514P();
                                        if (zM4538h3 || objM4514P4 == C1851l.f6155a) {
                                            objM4514P4 = new C5435wb(sharedPreferences52, interfaceC1809a152, 20);
                                            c1836h05.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "兼容低版本小程序", "伪装启动基础库版本并阻止官方升级页", false, (InterfaceC1231l) objM4514P4, c1836h05, 432, 8);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a17;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a162.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences62 = sharedPreferences7;
                                        boolean zM4538h4 = c1836h06.m4538h(sharedPreferences62);
                                        Object objM4514P5 = c1836h06.m4514P();
                                        if (zM4538h4 || objM4514P5 == C1851l.f6155a) {
                                            objM4514P5 = new C5435wb(sharedPreferences62, interfaceC1809a162, 8);
                                            c1836h06.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue4, "跳过全局小程序开屏广告", "阻止所有小程序展示启动开屏广告，修改后需重启微信", false, (InterfaceC1231l) objM4514P5, c1836h06, 432, 8);
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                case 5:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        SharedPreferences sharedPreferences72 = sharedPreferences7;
                                        boolean zM4538h5 = c1836h07.m4538h(sharedPreferences72);
                                        Object objM4514P6 = c1836h07.m4514P();
                                        if (zM4538h5 || objM4514P6 == C1851l.f6155a) {
                                            objM4514P6 = new C5441wh(sharedPreferences72, interfaceC1809a172, 1);
                                            c1836h07.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "朋友圈自动转发", "按规则静默转发指定好友的新朋友圈", false, (InterfaceC1231l) objM4514P6, c1836h07, 432, 8);
                                    } else {
                                        c1836h07.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h08 = (C1836h0) obj4;
                                    int iIntValue8 = ((Integer) obj5).intValue();
                                    if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a17;
                                        String str2 = (String) interfaceC1809a18.getValue();
                                        SharedPreferences sharedPreferences8 = sharedPreferences7;
                                        boolean zM4538h6 = c1836h08.m4538h(sharedPreferences8);
                                        Object objM4514P7 = c1836h08.m4514P();
                                        if (zM4538h6 || objM4514P7 == C1851l.f6155a) {
                                            objM4514P7 = new C5242qg(sharedPreferences8, interfaceC1809a18, 15);
                                            c1836h08.m4545k0(objM4514P7);
                                        }
                                        AbstractC4955ho.m9304C1("触发词", "多个触发词用逗号分隔", str2, 0, (InterfaceC1231l) objM4514P7, c1836h08, 54, 8);
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
