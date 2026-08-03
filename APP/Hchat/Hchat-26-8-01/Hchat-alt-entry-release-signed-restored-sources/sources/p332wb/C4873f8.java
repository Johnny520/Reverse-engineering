package p332wb;

import java.util.ArrayList;
import java.util.List;
import p036c9.C0497w0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.f8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4873f8 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17069g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f17070h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f17071i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17072j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17073k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4873f8(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, int i9) {
        this.f17069g = i9;
        this.f17070h = interfaceC1809a1;
        this.f17071i = interfaceC1809a12;
        this.f17072j = interfaceC1809a13;
        this.f17073k = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f17069g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 0;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f17070h;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f17071i;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f17072j;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f17073k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1386269371, new InterfaceC1235p() { // from class: wb.y9
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a15 = interfaceC1809a1;
                                        String str = (String) interfaceC1809a15.getValue();
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C5070l9(interfaceC1809a15, 14);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P;
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4712ab(interfaceC1809a15, 12);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9430S("左侧浅色", "对方文本消息，浅色模式", str, false, interfaceC1220a, (InterfaceC1231l) objM4514P2, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a12;
                                        String str2 = (String) interfaceC1809a16.getValue();
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C5070l9(interfaceC1809a16, 15);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P3;
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4712ab(interfaceC1809a16, 13);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9430S("右侧浅色", "自己发送文本消息，浅色模式", str2, false, interfaceC1220a2, (InterfaceC1231l) objM4514P4, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a13;
                                        String str3 = (String) interfaceC1809a17.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5070l9(interfaceC1809a17, 16);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P5;
                                        Object objM4514P6 = c1836h02.m4514P();
                                        if (objM4514P6 == c1823e) {
                                            objM4514P6 = new C4712ab(interfaceC1809a17, 14);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9430S("左侧深色", "对方文本消息，深色模式", str3, false, interfaceC1220a3, (InterfaceC1231l) objM4514P6, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a14;
                                        String str4 = (String) interfaceC1809a18.getValue();
                                        Object objM4514P7 = c1836h02.m4514P();
                                        if (objM4514P7 == c1823e) {
                                            objM4514P7 = new C5070l9(interfaceC1809a18, 17);
                                            c1836h02.m4545k0(objM4514P7);
                                        }
                                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P7;
                                        Object objM4514P8 = c1836h02.m4514P();
                                        if (objM4514P8 == c1823e) {
                                            objM4514P8 = new C4712ab(interfaceC1809a18, 15);
                                            c1836h02.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9430S("右侧深色", "自己发送文本消息，深色模式", str4, false, interfaceC1220a4, (InterfaceC1231l) objM4514P8, c1836h02, 221238, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a1;
                                        String str5 = (String) interfaceC1809a19.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C4944hd(interfaceC1809a19, 0);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9304C1("群主名称", "最多 8 个字符", str5, 0, (InterfaceC1231l) objM4514P9, c1836h03, 24630, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a12;
                                        String str6 = (String) interfaceC1809a110.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C4944hd(interfaceC1809a110, 1);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9304C1("管理员名称", "最多 8 个字符", str6, 0, (InterfaceC1231l) objM4514P10, c1836h03, 24630, 8);
                                        if (((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-918261547);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a14;
                                            String str7 = (String) interfaceC1809a111.getValue();
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (objM4514P11 == c1823e2) {
                                                objM4514P11 = new C4944hd(interfaceC1809a111, 2);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9304C1("群员名称", "最多 8 个字符", str7, 0, (InterfaceC1231l) objM4514P11, c1836h03, 24630, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-918110670);
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
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a1;
                                        String str8 = (String) interfaceC1809a112.getValue();
                                        Object objM4514P12 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P12 == c1823e3) {
                                            objM4514P12 = new C5371ud(interfaceC1809a112, 13);
                                            c1836h04.m4545k0(objM4514P12);
                                        }
                                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P12;
                                        Object objM4514P13 = c1836h04.m4514P();
                                        if (objM4514P13 == c1823e3) {
                                            objM4514P13 = new C5534zd(interfaceC1809a112, 20);
                                            c1836h04.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9430S("浅色背景", "浅色模式消息时间背景", str8, false, interfaceC1220a5, (InterfaceC1231l) objM4514P13, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a12;
                                        String str9 = (String) interfaceC1809a113.getValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5371ud(interfaceC1809a113, 14);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P14;
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a113, 21);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9430S("浅色文字", "浅色模式消息时间文字", str9, false, interfaceC1220a6, (InterfaceC1231l) objM4514P15, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a13;
                                        String str10 = (String) interfaceC1809a114.getValue();
                                        Object objM4514P16 = c1836h04.m4514P();
                                        if (objM4514P16 == c1823e3) {
                                            objM4514P16 = new C5371ud(interfaceC1809a114, 15);
                                            c1836h04.m4545k0(objM4514P16);
                                        }
                                        InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P16;
                                        Object objM4514P17 = c1836h04.m4514P();
                                        if (objM4514P17 == c1823e3) {
                                            objM4514P17 = new C5534zd(interfaceC1809a114, 22);
                                            c1836h04.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9430S("深色背景", "深色模式消息时间背景", str10, false, interfaceC1220a7, (InterfaceC1231l) objM4514P17, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a14;
                                        String str11 = (String) interfaceC1809a115.getValue();
                                        Object objM4514P18 = c1836h04.m4514P();
                                        if (objM4514P18 == c1823e3) {
                                            objM4514P18 = new C5371ud(interfaceC1809a115, 16);
                                            c1836h04.m4545k0(objM4514P18);
                                        }
                                        InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P18;
                                        Object objM4514P19 = c1836h04.m4514P();
                                        if (objM4514P19 == c1823e3) {
                                            objM4514P19 = new C5534zd(interfaceC1809a115, 23);
                                            c1836h04.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9430S("深色文字", "深色模式消息时间文字", str11, false, interfaceC1220a8, (InterfaceC1231l) objM4514P19, c1836h04, 224310, 0);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a1;
                                        String str12 = (String) interfaceC1809a116.getValue();
                                        List list = AbstractC4955ho.f17699n;
                                        Object objM4514P20 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P20 == c1823e4) {
                                            objM4514P20 = new C5109mf(interfaceC1809a116, 0);
                                            c1836h05.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片标题", "支持变量", str12, list, 0, (InterfaceC1231l) objM4514P20, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a12;
                                        String str13 = (String) interfaceC1809a117.getValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C5109mf(interfaceC1809a117, 1);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片描述", "支持变量", str13, list, 3, (InterfaceC1231l) objM4514P21, c1836h05, 221238, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a13;
                                        String str14 = (String) interfaceC1809a118.getValue();
                                        Object objM4514P22 = c1836h05.m4514P();
                                        if (objM4514P22 == c1823e4) {
                                            objM4514P22 = new C5109mf(interfaceC1809a118, 2);
                                            c1836h05.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片标题", "支持变量", str14, list, 0, (InterfaceC1231l) objM4514P22, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a14;
                                        String str15 = (String) interfaceC1809a119.getValue();
                                        Object objM4514P23 = c1836h05.m4514P();
                                        if (objM4514P23 == c1823e4) {
                                            objM4514P23 = new C5109mf(interfaceC1809a119, 3);
                                            c1836h05.m4545k0(objM4514P23);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片描述", "支持变量", str15, list, 3, (InterfaceC1231l) objM4514P23, c1836h05, 221238, 0);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a1;
                                        int iIntValue7 = ((Number) interfaceC1809a120.getValue()).intValue();
                                        String str16 = iIntValue7 != 1 ? iIntValue7 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue8 = ((Number) interfaceC1809a120.getValue()).intValue();
                                        boolean zM4534f = c1836h06.m4534f(interfaceC1809a120);
                                        Object objM4514P24 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4534f || objM4514P24 == c1823e5) {
                                            objM4514P24 = new C4752bi(interfaceC1809a120, 1);
                                            c1836h06.m4545k0(objM4514P24);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str16, arrayListM9333F6, iIntValue8, (InterfaceC1231l) objM4514P24, false, c1836h06, 6);
                                        if (((Number) interfaceC1809a120.getValue()).intValue() == 2) {
                                            c1836h06.m4525a0(-1376241686);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a12;
                                            String str17 = (String) interfaceC1809a121.getValue();
                                            boolean zM4534f2 = c1836h06.m4534f(interfaceC1809a121);
                                            Object objM4514P25 = c1836h06.m4514P();
                                            if (zM4534f2 || objM4514P25 == c1823e5) {
                                                objM4514P25 = new C4752bi(interfaceC1809a121, 2);
                                                c1836h06.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，0 表示不延迟", str17, (InterfaceC1231l) objM4514P25, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else if (((Number) interfaceC1809a120.getValue()).intValue() == 1) {
                                            c1836h06.m4525a0(-1376029119);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a13;
                                            String str18 = (String) interfaceC1809a122.getValue();
                                            boolean zM4534f3 = c1836h06.m4534f(interfaceC1809a122);
                                            Object objM4514P26 = c1836h06.m4514P();
                                            if (zM4534f3 || objM4514P26 == c1823e5) {
                                                objM4514P26 = new C4752bi(interfaceC1809a122, 3);
                                                c1836h06.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms", str18, (InterfaceC1231l) objM4514P26, c1836h06, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a14;
                                            String str19 = (String) interfaceC1809a123.getValue();
                                            boolean zM4534f4 = c1836h06.m4534f(interfaceC1809a123);
                                            Object objM4514P27 = c1836h06.m4514P();
                                            if (zM4534f4 || objM4514P27 == c1823e5) {
                                                objM4514P27 = new C4752bi(interfaceC1809a123, 4);
                                                c1836h06.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str19, (InterfaceC1231l) objM4514P27, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-1375750429);
                                            c1836h06.m4553p(false);
                                        }
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        int size = ((List) interfaceC1809a1.getValue()).size();
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a12;
                                        String str20 = size + " 个配置，当前启用：" + ((String) interfaceC1809a124.getValue());
                                        Object objM4514P28 = c1836h07.m4514P();
                                        if (objM4514P28 == C1851l.f6155a) {
                                            objM4514P28 = new C0497w0(interfaceC1809a124, interfaceC1809a13, interfaceC1809a14, 2);
                                            c1836h07.m4545k0(objM4514P28);
                                        }
                                        AbstractC4955ho.m9503b("配置列表", str20, (InterfaceC1220a) objM4514P28, c1836h07, 390);
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
                    final int i12 = 3;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f17070h;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f17071i;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f17072j;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f17073k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-671611441, new InterfaceC1235p() { // from class: wb.y9
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a15;
                                        String str = (String) interfaceC1809a152.getValue();
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C5070l9(interfaceC1809a152, 14);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P;
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4712ab(interfaceC1809a152, 12);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9430S("左侧浅色", "对方文本消息，浅色模式", str, false, interfaceC1220a, (InterfaceC1231l) objM4514P2, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a16;
                                        String str2 = (String) interfaceC1809a162.getValue();
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C5070l9(interfaceC1809a162, 15);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P3;
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4712ab(interfaceC1809a162, 13);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9430S("右侧浅色", "自己发送文本消息，浅色模式", str2, false, interfaceC1220a2, (InterfaceC1231l) objM4514P4, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                        String str3 = (String) interfaceC1809a172.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5070l9(interfaceC1809a172, 16);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P5;
                                        Object objM4514P6 = c1836h02.m4514P();
                                        if (objM4514P6 == c1823e) {
                                            objM4514P6 = new C4712ab(interfaceC1809a172, 14);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9430S("左侧深色", "对方文本消息，深色模式", str3, false, interfaceC1220a3, (InterfaceC1231l) objM4514P6, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a18;
                                        String str4 = (String) interfaceC1809a182.getValue();
                                        Object objM4514P7 = c1836h02.m4514P();
                                        if (objM4514P7 == c1823e) {
                                            objM4514P7 = new C5070l9(interfaceC1809a182, 17);
                                            c1836h02.m4545k0(objM4514P7);
                                        }
                                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P7;
                                        Object objM4514P8 = c1836h02.m4514P();
                                        if (objM4514P8 == c1823e) {
                                            objM4514P8 = new C4712ab(interfaceC1809a182, 15);
                                            c1836h02.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9430S("右侧深色", "自己发送文本消息，深色模式", str4, false, interfaceC1220a4, (InterfaceC1231l) objM4514P8, c1836h02, 221238, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a15;
                                        String str5 = (String) interfaceC1809a19.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C4944hd(interfaceC1809a19, 0);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9304C1("群主名称", "最多 8 个字符", str5, 0, (InterfaceC1231l) objM4514P9, c1836h03, 24630, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a16;
                                        String str6 = (String) interfaceC1809a110.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C4944hd(interfaceC1809a110, 1);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9304C1("管理员名称", "最多 8 个字符", str6, 0, (InterfaceC1231l) objM4514P10, c1836h03, 24630, 8);
                                        if (((Boolean) interfaceC1809a17.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-918261547);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a18;
                                            String str7 = (String) interfaceC1809a111.getValue();
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (objM4514P11 == c1823e2) {
                                                objM4514P11 = new C4944hd(interfaceC1809a111, 2);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9304C1("群员名称", "最多 8 个字符", str7, 0, (InterfaceC1231l) objM4514P11, c1836h03, 24630, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-918110670);
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
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a15;
                                        String str8 = (String) interfaceC1809a112.getValue();
                                        Object objM4514P12 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P12 == c1823e3) {
                                            objM4514P12 = new C5371ud(interfaceC1809a112, 13);
                                            c1836h04.m4545k0(objM4514P12);
                                        }
                                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P12;
                                        Object objM4514P13 = c1836h04.m4514P();
                                        if (objM4514P13 == c1823e3) {
                                            objM4514P13 = new C5534zd(interfaceC1809a112, 20);
                                            c1836h04.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9430S("浅色背景", "浅色模式消息时间背景", str8, false, interfaceC1220a5, (InterfaceC1231l) objM4514P13, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a16;
                                        String str9 = (String) interfaceC1809a113.getValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5371ud(interfaceC1809a113, 14);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P14;
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a113, 21);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9430S("浅色文字", "浅色模式消息时间文字", str9, false, interfaceC1220a6, (InterfaceC1231l) objM4514P15, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a17;
                                        String str10 = (String) interfaceC1809a114.getValue();
                                        Object objM4514P16 = c1836h04.m4514P();
                                        if (objM4514P16 == c1823e3) {
                                            objM4514P16 = new C5371ud(interfaceC1809a114, 15);
                                            c1836h04.m4545k0(objM4514P16);
                                        }
                                        InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P16;
                                        Object objM4514P17 = c1836h04.m4514P();
                                        if (objM4514P17 == c1823e3) {
                                            objM4514P17 = new C5534zd(interfaceC1809a114, 22);
                                            c1836h04.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9430S("深色背景", "深色模式消息时间背景", str10, false, interfaceC1220a7, (InterfaceC1231l) objM4514P17, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a18;
                                        String str11 = (String) interfaceC1809a115.getValue();
                                        Object objM4514P18 = c1836h04.m4514P();
                                        if (objM4514P18 == c1823e3) {
                                            objM4514P18 = new C5371ud(interfaceC1809a115, 16);
                                            c1836h04.m4545k0(objM4514P18);
                                        }
                                        InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P18;
                                        Object objM4514P19 = c1836h04.m4514P();
                                        if (objM4514P19 == c1823e3) {
                                            objM4514P19 = new C5534zd(interfaceC1809a115, 23);
                                            c1836h04.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9430S("深色文字", "深色模式消息时间文字", str11, false, interfaceC1220a8, (InterfaceC1231l) objM4514P19, c1836h04, 224310, 0);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a15;
                                        String str12 = (String) interfaceC1809a116.getValue();
                                        List list = AbstractC4955ho.f17699n;
                                        Object objM4514P20 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P20 == c1823e4) {
                                            objM4514P20 = new C5109mf(interfaceC1809a116, 0);
                                            c1836h05.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片标题", "支持变量", str12, list, 0, (InterfaceC1231l) objM4514P20, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a16;
                                        String str13 = (String) interfaceC1809a117.getValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C5109mf(interfaceC1809a117, 1);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片描述", "支持变量", str13, list, 3, (InterfaceC1231l) objM4514P21, c1836h05, 221238, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a17;
                                        String str14 = (String) interfaceC1809a118.getValue();
                                        Object objM4514P22 = c1836h05.m4514P();
                                        if (objM4514P22 == c1823e4) {
                                            objM4514P22 = new C5109mf(interfaceC1809a118, 2);
                                            c1836h05.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片标题", "支持变量", str14, list, 0, (InterfaceC1231l) objM4514P22, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a18;
                                        String str15 = (String) interfaceC1809a119.getValue();
                                        Object objM4514P23 = c1836h05.m4514P();
                                        if (objM4514P23 == c1823e4) {
                                            objM4514P23 = new C5109mf(interfaceC1809a119, 3);
                                            c1836h05.m4545k0(objM4514P23);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片描述", "支持变量", str15, list, 3, (InterfaceC1231l) objM4514P23, c1836h05, 221238, 0);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a15;
                                        int iIntValue7 = ((Number) interfaceC1809a120.getValue()).intValue();
                                        String str16 = iIntValue7 != 1 ? iIntValue7 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue8 = ((Number) interfaceC1809a120.getValue()).intValue();
                                        boolean zM4534f = c1836h06.m4534f(interfaceC1809a120);
                                        Object objM4514P24 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4534f || objM4514P24 == c1823e5) {
                                            objM4514P24 = new C4752bi(interfaceC1809a120, 1);
                                            c1836h06.m4545k0(objM4514P24);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str16, arrayListM9333F6, iIntValue8, (InterfaceC1231l) objM4514P24, false, c1836h06, 6);
                                        if (((Number) interfaceC1809a120.getValue()).intValue() == 2) {
                                            c1836h06.m4525a0(-1376241686);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a16;
                                            String str17 = (String) interfaceC1809a121.getValue();
                                            boolean zM4534f2 = c1836h06.m4534f(interfaceC1809a121);
                                            Object objM4514P25 = c1836h06.m4514P();
                                            if (zM4534f2 || objM4514P25 == c1823e5) {
                                                objM4514P25 = new C4752bi(interfaceC1809a121, 2);
                                                c1836h06.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，0 表示不延迟", str17, (InterfaceC1231l) objM4514P25, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else if (((Number) interfaceC1809a120.getValue()).intValue() == 1) {
                                            c1836h06.m4525a0(-1376029119);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a17;
                                            String str18 = (String) interfaceC1809a122.getValue();
                                            boolean zM4534f3 = c1836h06.m4534f(interfaceC1809a122);
                                            Object objM4514P26 = c1836h06.m4514P();
                                            if (zM4534f3 || objM4514P26 == c1823e5) {
                                                objM4514P26 = new C4752bi(interfaceC1809a122, 3);
                                                c1836h06.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms", str18, (InterfaceC1231l) objM4514P26, c1836h06, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a18;
                                            String str19 = (String) interfaceC1809a123.getValue();
                                            boolean zM4534f4 = c1836h06.m4534f(interfaceC1809a123);
                                            Object objM4514P27 = c1836h06.m4514P();
                                            if (zM4534f4 || objM4514P27 == c1823e5) {
                                                objM4514P27 = new C4752bi(interfaceC1809a123, 4);
                                                c1836h06.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str19, (InterfaceC1231l) objM4514P27, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-1375750429);
                                            c1836h06.m4553p(false);
                                        }
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        int size = ((List) interfaceC1809a15.getValue()).size();
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a16;
                                        String str20 = size + " 个配置，当前启用：" + ((String) interfaceC1809a124.getValue());
                                        Object objM4514P28 = c1836h07.m4514P();
                                        if (objM4514P28 == C1851l.f6155a) {
                                            objM4514P28 = new C0497w0(interfaceC1809a124, interfaceC1809a17, interfaceC1809a18, 2);
                                            c1836h07.m4545k0(objM4514P28);
                                        }
                                        AbstractC4955ho.m9503b("配置列表", str20, (InterfaceC1220a) objM4514P28, c1836h07, 390);
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
                    final InterfaceC1809a1 interfaceC1809a19 = this.f17070h;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f17071i;
                    final InterfaceC1809a1 interfaceC1809a111 = this.f17072j;
                    final InterfaceC1809a1 interfaceC1809a112 = this.f17073k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1098188801, new InterfaceC1235p() { // from class: wb.y9
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i13) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a19;
                                        String str = (String) interfaceC1809a152.getValue();
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C5070l9(interfaceC1809a152, 14);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P;
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4712ab(interfaceC1809a152, 12);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9430S("左侧浅色", "对方文本消息，浅色模式", str, false, interfaceC1220a, (InterfaceC1231l) objM4514P2, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a110;
                                        String str2 = (String) interfaceC1809a162.getValue();
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C5070l9(interfaceC1809a162, 15);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P3;
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4712ab(interfaceC1809a162, 13);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9430S("右侧浅色", "自己发送文本消息，浅色模式", str2, false, interfaceC1220a2, (InterfaceC1231l) objM4514P4, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a111;
                                        String str3 = (String) interfaceC1809a172.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5070l9(interfaceC1809a172, 16);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P5;
                                        Object objM4514P6 = c1836h02.m4514P();
                                        if (objM4514P6 == c1823e) {
                                            objM4514P6 = new C4712ab(interfaceC1809a172, 14);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9430S("左侧深色", "对方文本消息，深色模式", str3, false, interfaceC1220a3, (InterfaceC1231l) objM4514P6, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a112;
                                        String str4 = (String) interfaceC1809a182.getValue();
                                        Object objM4514P7 = c1836h02.m4514P();
                                        if (objM4514P7 == c1823e) {
                                            objM4514P7 = new C5070l9(interfaceC1809a182, 17);
                                            c1836h02.m4545k0(objM4514P7);
                                        }
                                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P7;
                                        Object objM4514P8 = c1836h02.m4514P();
                                        if (objM4514P8 == c1823e) {
                                            objM4514P8 = new C4712ab(interfaceC1809a182, 15);
                                            c1836h02.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9430S("右侧深色", "自己发送文本消息，深色模式", str4, false, interfaceC1220a4, (InterfaceC1231l) objM4514P8, c1836h02, 221238, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a19;
                                        String str5 = (String) interfaceC1809a192.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C4944hd(interfaceC1809a192, 0);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9304C1("群主名称", "最多 8 个字符", str5, 0, (InterfaceC1231l) objM4514P9, c1836h03, 24630, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a110;
                                        String str6 = (String) interfaceC1809a1102.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C4944hd(interfaceC1809a1102, 1);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9304C1("管理员名称", "最多 8 个字符", str6, 0, (InterfaceC1231l) objM4514P10, c1836h03, 24630, 8);
                                        if (((Boolean) interfaceC1809a111.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-918261547);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a112;
                                            String str7 = (String) interfaceC1809a1112.getValue();
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (objM4514P11 == c1823e2) {
                                                objM4514P11 = new C4944hd(interfaceC1809a1112, 2);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9304C1("群员名称", "最多 8 个字符", str7, 0, (InterfaceC1231l) objM4514P11, c1836h03, 24630, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-918110670);
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
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a19;
                                        String str8 = (String) interfaceC1809a1122.getValue();
                                        Object objM4514P12 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P12 == c1823e3) {
                                            objM4514P12 = new C5371ud(interfaceC1809a1122, 13);
                                            c1836h04.m4545k0(objM4514P12);
                                        }
                                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P12;
                                        Object objM4514P13 = c1836h04.m4514P();
                                        if (objM4514P13 == c1823e3) {
                                            objM4514P13 = new C5534zd(interfaceC1809a1122, 20);
                                            c1836h04.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9430S("浅色背景", "浅色模式消息时间背景", str8, false, interfaceC1220a5, (InterfaceC1231l) objM4514P13, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a110;
                                        String str9 = (String) interfaceC1809a113.getValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5371ud(interfaceC1809a113, 14);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P14;
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a113, 21);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9430S("浅色文字", "浅色模式消息时间文字", str9, false, interfaceC1220a6, (InterfaceC1231l) objM4514P15, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a111;
                                        String str10 = (String) interfaceC1809a114.getValue();
                                        Object objM4514P16 = c1836h04.m4514P();
                                        if (objM4514P16 == c1823e3) {
                                            objM4514P16 = new C5371ud(interfaceC1809a114, 15);
                                            c1836h04.m4545k0(objM4514P16);
                                        }
                                        InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P16;
                                        Object objM4514P17 = c1836h04.m4514P();
                                        if (objM4514P17 == c1823e3) {
                                            objM4514P17 = new C5534zd(interfaceC1809a114, 22);
                                            c1836h04.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9430S("深色背景", "深色模式消息时间背景", str10, false, interfaceC1220a7, (InterfaceC1231l) objM4514P17, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a112;
                                        String str11 = (String) interfaceC1809a115.getValue();
                                        Object objM4514P18 = c1836h04.m4514P();
                                        if (objM4514P18 == c1823e3) {
                                            objM4514P18 = new C5371ud(interfaceC1809a115, 16);
                                            c1836h04.m4545k0(objM4514P18);
                                        }
                                        InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P18;
                                        Object objM4514P19 = c1836h04.m4514P();
                                        if (objM4514P19 == c1823e3) {
                                            objM4514P19 = new C5534zd(interfaceC1809a115, 23);
                                            c1836h04.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9430S("深色文字", "深色模式消息时间文字", str11, false, interfaceC1220a8, (InterfaceC1231l) objM4514P19, c1836h04, 224310, 0);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a116 = interfaceC1809a19;
                                        String str12 = (String) interfaceC1809a116.getValue();
                                        List list = AbstractC4955ho.f17699n;
                                        Object objM4514P20 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P20 == c1823e4) {
                                            objM4514P20 = new C5109mf(interfaceC1809a116, 0);
                                            c1836h05.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片标题", "支持变量", str12, list, 0, (InterfaceC1231l) objM4514P20, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a110;
                                        String str13 = (String) interfaceC1809a117.getValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C5109mf(interfaceC1809a117, 1);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片描述", "支持变量", str13, list, 3, (InterfaceC1231l) objM4514P21, c1836h05, 221238, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a111;
                                        String str14 = (String) interfaceC1809a118.getValue();
                                        Object objM4514P22 = c1836h05.m4514P();
                                        if (objM4514P22 == c1823e4) {
                                            objM4514P22 = new C5109mf(interfaceC1809a118, 2);
                                            c1836h05.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片标题", "支持变量", str14, list, 0, (InterfaceC1231l) objM4514P22, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a112;
                                        String str15 = (String) interfaceC1809a119.getValue();
                                        Object objM4514P23 = c1836h05.m4514P();
                                        if (objM4514P23 == c1823e4) {
                                            objM4514P23 = new C5109mf(interfaceC1809a119, 3);
                                            c1836h05.m4545k0(objM4514P23);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片描述", "支持变量", str15, list, 3, (InterfaceC1231l) objM4514P23, c1836h05, 221238, 0);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a19;
                                        int iIntValue7 = ((Number) interfaceC1809a120.getValue()).intValue();
                                        String str16 = iIntValue7 != 1 ? iIntValue7 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue8 = ((Number) interfaceC1809a120.getValue()).intValue();
                                        boolean zM4534f = c1836h06.m4534f(interfaceC1809a120);
                                        Object objM4514P24 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4534f || objM4514P24 == c1823e5) {
                                            objM4514P24 = new C4752bi(interfaceC1809a120, 1);
                                            c1836h06.m4545k0(objM4514P24);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str16, arrayListM9333F6, iIntValue8, (InterfaceC1231l) objM4514P24, false, c1836h06, 6);
                                        if (((Number) interfaceC1809a120.getValue()).intValue() == 2) {
                                            c1836h06.m4525a0(-1376241686);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a110;
                                            String str17 = (String) interfaceC1809a121.getValue();
                                            boolean zM4534f2 = c1836h06.m4534f(interfaceC1809a121);
                                            Object objM4514P25 = c1836h06.m4514P();
                                            if (zM4534f2 || objM4514P25 == c1823e5) {
                                                objM4514P25 = new C4752bi(interfaceC1809a121, 2);
                                                c1836h06.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，0 表示不延迟", str17, (InterfaceC1231l) objM4514P25, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else if (((Number) interfaceC1809a120.getValue()).intValue() == 1) {
                                            c1836h06.m4525a0(-1376029119);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a111;
                                            String str18 = (String) interfaceC1809a122.getValue();
                                            boolean zM4534f3 = c1836h06.m4534f(interfaceC1809a122);
                                            Object objM4514P26 = c1836h06.m4514P();
                                            if (zM4534f3 || objM4514P26 == c1823e5) {
                                                objM4514P26 = new C4752bi(interfaceC1809a122, 3);
                                                c1836h06.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms", str18, (InterfaceC1231l) objM4514P26, c1836h06, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a112;
                                            String str19 = (String) interfaceC1809a123.getValue();
                                            boolean zM4534f4 = c1836h06.m4534f(interfaceC1809a123);
                                            Object objM4514P27 = c1836h06.m4514P();
                                            if (zM4534f4 || objM4514P27 == c1823e5) {
                                                objM4514P27 = new C4752bi(interfaceC1809a123, 4);
                                                c1836h06.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str19, (InterfaceC1231l) objM4514P27, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-1375750429);
                                            c1836h06.m4553p(false);
                                        }
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        int size = ((List) interfaceC1809a19.getValue()).size();
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a110;
                                        String str20 = size + " 个配置，当前启用：" + ((String) interfaceC1809a124.getValue());
                                        Object objM4514P28 = c1836h07.m4514P();
                                        if (objM4514P28 == C1851l.f6155a) {
                                            objM4514P28 = new C0497w0(interfaceC1809a124, interfaceC1809a111, interfaceC1809a112, 2);
                                            c1836h07.m4545k0(objM4514P28);
                                        }
                                        AbstractC4955ho.m9503b("配置列表", str20, (InterfaceC1220a) objM4514P28, c1836h07, 390);
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
                    final int i14 = 5;
                    final InterfaceC1809a1 interfaceC1809a113 = this.f17070h;
                    final InterfaceC1809a1 interfaceC1809a114 = this.f17071i;
                    final InterfaceC1809a1 interfaceC1809a115 = this.f17072j;
                    final InterfaceC1809a1 interfaceC1809a116 = this.f17073k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-377816185, new InterfaceC1235p() { // from class: wb.y9
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i14) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a113;
                                        String str = (String) interfaceC1809a152.getValue();
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C5070l9(interfaceC1809a152, 14);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P;
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4712ab(interfaceC1809a152, 12);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9430S("左侧浅色", "对方文本消息，浅色模式", str, false, interfaceC1220a, (InterfaceC1231l) objM4514P2, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a114;
                                        String str2 = (String) interfaceC1809a162.getValue();
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C5070l9(interfaceC1809a162, 15);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P3;
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4712ab(interfaceC1809a162, 13);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9430S("右侧浅色", "自己发送文本消息，浅色模式", str2, false, interfaceC1220a2, (InterfaceC1231l) objM4514P4, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a115;
                                        String str3 = (String) interfaceC1809a172.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5070l9(interfaceC1809a172, 16);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P5;
                                        Object objM4514P6 = c1836h02.m4514P();
                                        if (objM4514P6 == c1823e) {
                                            objM4514P6 = new C4712ab(interfaceC1809a172, 14);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9430S("左侧深色", "对方文本消息，深色模式", str3, false, interfaceC1220a3, (InterfaceC1231l) objM4514P6, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a116;
                                        String str4 = (String) interfaceC1809a182.getValue();
                                        Object objM4514P7 = c1836h02.m4514P();
                                        if (objM4514P7 == c1823e) {
                                            objM4514P7 = new C5070l9(interfaceC1809a182, 17);
                                            c1836h02.m4545k0(objM4514P7);
                                        }
                                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P7;
                                        Object objM4514P8 = c1836h02.m4514P();
                                        if (objM4514P8 == c1823e) {
                                            objM4514P8 = new C4712ab(interfaceC1809a182, 15);
                                            c1836h02.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9430S("右侧深色", "自己发送文本消息，深色模式", str4, false, interfaceC1220a4, (InterfaceC1231l) objM4514P8, c1836h02, 221238, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a113;
                                        String str5 = (String) interfaceC1809a192.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C4944hd(interfaceC1809a192, 0);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9304C1("群主名称", "最多 8 个字符", str5, 0, (InterfaceC1231l) objM4514P9, c1836h03, 24630, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a114;
                                        String str6 = (String) interfaceC1809a1102.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C4944hd(interfaceC1809a1102, 1);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9304C1("管理员名称", "最多 8 个字符", str6, 0, (InterfaceC1231l) objM4514P10, c1836h03, 24630, 8);
                                        if (((Boolean) interfaceC1809a115.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-918261547);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a116;
                                            String str7 = (String) interfaceC1809a1112.getValue();
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (objM4514P11 == c1823e2) {
                                                objM4514P11 = new C4944hd(interfaceC1809a1112, 2);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9304C1("群员名称", "最多 8 个字符", str7, 0, (InterfaceC1231l) objM4514P11, c1836h03, 24630, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-918110670);
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
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a113;
                                        String str8 = (String) interfaceC1809a1122.getValue();
                                        Object objM4514P12 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P12 == c1823e3) {
                                            objM4514P12 = new C5371ud(interfaceC1809a1122, 13);
                                            c1836h04.m4545k0(objM4514P12);
                                        }
                                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P12;
                                        Object objM4514P13 = c1836h04.m4514P();
                                        if (objM4514P13 == c1823e3) {
                                            objM4514P13 = new C5534zd(interfaceC1809a1122, 20);
                                            c1836h04.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9430S("浅色背景", "浅色模式消息时间背景", str8, false, interfaceC1220a5, (InterfaceC1231l) objM4514P13, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a114;
                                        String str9 = (String) interfaceC1809a1132.getValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5371ud(interfaceC1809a1132, 14);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P14;
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a1132, 21);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9430S("浅色文字", "浅色模式消息时间文字", str9, false, interfaceC1220a6, (InterfaceC1231l) objM4514P15, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a115;
                                        String str10 = (String) interfaceC1809a1142.getValue();
                                        Object objM4514P16 = c1836h04.m4514P();
                                        if (objM4514P16 == c1823e3) {
                                            objM4514P16 = new C5371ud(interfaceC1809a1142, 15);
                                            c1836h04.m4545k0(objM4514P16);
                                        }
                                        InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P16;
                                        Object objM4514P17 = c1836h04.m4514P();
                                        if (objM4514P17 == c1823e3) {
                                            objM4514P17 = new C5534zd(interfaceC1809a1142, 22);
                                            c1836h04.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9430S("深色背景", "深色模式消息时间背景", str10, false, interfaceC1220a7, (InterfaceC1231l) objM4514P17, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a116;
                                        String str11 = (String) interfaceC1809a1152.getValue();
                                        Object objM4514P18 = c1836h04.m4514P();
                                        if (objM4514P18 == c1823e3) {
                                            objM4514P18 = new C5371ud(interfaceC1809a1152, 16);
                                            c1836h04.m4545k0(objM4514P18);
                                        }
                                        InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P18;
                                        Object objM4514P19 = c1836h04.m4514P();
                                        if (objM4514P19 == c1823e3) {
                                            objM4514P19 = new C5534zd(interfaceC1809a1152, 23);
                                            c1836h04.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9430S("深色文字", "深色模式消息时间文字", str11, false, interfaceC1220a8, (InterfaceC1231l) objM4514P19, c1836h04, 224310, 0);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a113;
                                        String str12 = (String) interfaceC1809a1162.getValue();
                                        List list = AbstractC4955ho.f17699n;
                                        Object objM4514P20 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P20 == c1823e4) {
                                            objM4514P20 = new C5109mf(interfaceC1809a1162, 0);
                                            c1836h05.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片标题", "支持变量", str12, list, 0, (InterfaceC1231l) objM4514P20, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a117 = interfaceC1809a114;
                                        String str13 = (String) interfaceC1809a117.getValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C5109mf(interfaceC1809a117, 1);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片描述", "支持变量", str13, list, 3, (InterfaceC1231l) objM4514P21, c1836h05, 221238, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a115;
                                        String str14 = (String) interfaceC1809a118.getValue();
                                        Object objM4514P22 = c1836h05.m4514P();
                                        if (objM4514P22 == c1823e4) {
                                            objM4514P22 = new C5109mf(interfaceC1809a118, 2);
                                            c1836h05.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片标题", "支持变量", str14, list, 0, (InterfaceC1231l) objM4514P22, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a119 = interfaceC1809a116;
                                        String str15 = (String) interfaceC1809a119.getValue();
                                        Object objM4514P23 = c1836h05.m4514P();
                                        if (objM4514P23 == c1823e4) {
                                            objM4514P23 = new C5109mf(interfaceC1809a119, 3);
                                            c1836h05.m4545k0(objM4514P23);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片描述", "支持变量", str15, list, 3, (InterfaceC1231l) objM4514P23, c1836h05, 221238, 0);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a120 = interfaceC1809a113;
                                        int iIntValue7 = ((Number) interfaceC1809a120.getValue()).intValue();
                                        String str16 = iIntValue7 != 1 ? iIntValue7 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue8 = ((Number) interfaceC1809a120.getValue()).intValue();
                                        boolean zM4534f = c1836h06.m4534f(interfaceC1809a120);
                                        Object objM4514P24 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4534f || objM4514P24 == c1823e5) {
                                            objM4514P24 = new C4752bi(interfaceC1809a120, 1);
                                            c1836h06.m4545k0(objM4514P24);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str16, arrayListM9333F6, iIntValue8, (InterfaceC1231l) objM4514P24, false, c1836h06, 6);
                                        if (((Number) interfaceC1809a120.getValue()).intValue() == 2) {
                                            c1836h06.m4525a0(-1376241686);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a114;
                                            String str17 = (String) interfaceC1809a121.getValue();
                                            boolean zM4534f2 = c1836h06.m4534f(interfaceC1809a121);
                                            Object objM4514P25 = c1836h06.m4514P();
                                            if (zM4534f2 || objM4514P25 == c1823e5) {
                                                objM4514P25 = new C4752bi(interfaceC1809a121, 2);
                                                c1836h06.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，0 表示不延迟", str17, (InterfaceC1231l) objM4514P25, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else if (((Number) interfaceC1809a120.getValue()).intValue() == 1) {
                                            c1836h06.m4525a0(-1376029119);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a115;
                                            String str18 = (String) interfaceC1809a122.getValue();
                                            boolean zM4534f3 = c1836h06.m4534f(interfaceC1809a122);
                                            Object objM4514P26 = c1836h06.m4514P();
                                            if (zM4534f3 || objM4514P26 == c1823e5) {
                                                objM4514P26 = new C4752bi(interfaceC1809a122, 3);
                                                c1836h06.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms", str18, (InterfaceC1231l) objM4514P26, c1836h06, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a116;
                                            String str19 = (String) interfaceC1809a123.getValue();
                                            boolean zM4534f4 = c1836h06.m4534f(interfaceC1809a123);
                                            Object objM4514P27 = c1836h06.m4514P();
                                            if (zM4534f4 || objM4514P27 == c1823e5) {
                                                objM4514P27 = new C4752bi(interfaceC1809a123, 4);
                                                c1836h06.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str19, (InterfaceC1231l) objM4514P27, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-1375750429);
                                            c1836h06.m4553p(false);
                                        }
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        int size = ((List) interfaceC1809a113.getValue()).size();
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a114;
                                        String str20 = size + " 个配置，当前启用：" + ((String) interfaceC1809a124.getValue());
                                        Object objM4514P28 = c1836h07.m4514P();
                                        if (objM4514P28 == C1851l.f6155a) {
                                            objM4514P28 = new C0497w0(interfaceC1809a124, interfaceC1809a115, interfaceC1809a116, 2);
                                            c1836h07.m4545k0(objM4514P28);
                                        }
                                        AbstractC4955ho.m9503b("配置列表", str20, (InterfaceC1220a) objM4514P28, c1836h07, 390);
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
                    final int i15 = 1;
                    final InterfaceC1809a1 interfaceC1809a117 = this.f17070h;
                    final InterfaceC1809a1 interfaceC1809a118 = this.f17071i;
                    final InterfaceC1809a1 interfaceC1809a119 = this.f17072j;
                    final InterfaceC1809a1 interfaceC1809a120 = this.f17073k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1404761264, new InterfaceC1235p() { // from class: wb.y9
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i15) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a117;
                                        String str = (String) interfaceC1809a152.getValue();
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C5070l9(interfaceC1809a152, 14);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P;
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4712ab(interfaceC1809a152, 12);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9430S("左侧浅色", "对方文本消息，浅色模式", str, false, interfaceC1220a, (InterfaceC1231l) objM4514P2, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a118;
                                        String str2 = (String) interfaceC1809a162.getValue();
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C5070l9(interfaceC1809a162, 15);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P3;
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4712ab(interfaceC1809a162, 13);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9430S("右侧浅色", "自己发送文本消息，浅色模式", str2, false, interfaceC1220a2, (InterfaceC1231l) objM4514P4, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a119;
                                        String str3 = (String) interfaceC1809a172.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5070l9(interfaceC1809a172, 16);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P5;
                                        Object objM4514P6 = c1836h02.m4514P();
                                        if (objM4514P6 == c1823e) {
                                            objM4514P6 = new C4712ab(interfaceC1809a172, 14);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9430S("左侧深色", "对方文本消息，深色模式", str3, false, interfaceC1220a3, (InterfaceC1231l) objM4514P6, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a120;
                                        String str4 = (String) interfaceC1809a182.getValue();
                                        Object objM4514P7 = c1836h02.m4514P();
                                        if (objM4514P7 == c1823e) {
                                            objM4514P7 = new C5070l9(interfaceC1809a182, 17);
                                            c1836h02.m4545k0(objM4514P7);
                                        }
                                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P7;
                                        Object objM4514P8 = c1836h02.m4514P();
                                        if (objM4514P8 == c1823e) {
                                            objM4514P8 = new C4712ab(interfaceC1809a182, 15);
                                            c1836h02.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9430S("右侧深色", "自己发送文本消息，深色模式", str4, false, interfaceC1220a4, (InterfaceC1231l) objM4514P8, c1836h02, 221238, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a117;
                                        String str5 = (String) interfaceC1809a192.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C4944hd(interfaceC1809a192, 0);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9304C1("群主名称", "最多 8 个字符", str5, 0, (InterfaceC1231l) objM4514P9, c1836h03, 24630, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a118;
                                        String str6 = (String) interfaceC1809a1102.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C4944hd(interfaceC1809a1102, 1);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9304C1("管理员名称", "最多 8 个字符", str6, 0, (InterfaceC1231l) objM4514P10, c1836h03, 24630, 8);
                                        if (((Boolean) interfaceC1809a119.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-918261547);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a120;
                                            String str7 = (String) interfaceC1809a1112.getValue();
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (objM4514P11 == c1823e2) {
                                                objM4514P11 = new C4944hd(interfaceC1809a1112, 2);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9304C1("群员名称", "最多 8 个字符", str7, 0, (InterfaceC1231l) objM4514P11, c1836h03, 24630, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-918110670);
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
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a117;
                                        String str8 = (String) interfaceC1809a1122.getValue();
                                        Object objM4514P12 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P12 == c1823e3) {
                                            objM4514P12 = new C5371ud(interfaceC1809a1122, 13);
                                            c1836h04.m4545k0(objM4514P12);
                                        }
                                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P12;
                                        Object objM4514P13 = c1836h04.m4514P();
                                        if (objM4514P13 == c1823e3) {
                                            objM4514P13 = new C5534zd(interfaceC1809a1122, 20);
                                            c1836h04.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9430S("浅色背景", "浅色模式消息时间背景", str8, false, interfaceC1220a5, (InterfaceC1231l) objM4514P13, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a118;
                                        String str9 = (String) interfaceC1809a1132.getValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5371ud(interfaceC1809a1132, 14);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P14;
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a1132, 21);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9430S("浅色文字", "浅色模式消息时间文字", str9, false, interfaceC1220a6, (InterfaceC1231l) objM4514P15, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a119;
                                        String str10 = (String) interfaceC1809a1142.getValue();
                                        Object objM4514P16 = c1836h04.m4514P();
                                        if (objM4514P16 == c1823e3) {
                                            objM4514P16 = new C5371ud(interfaceC1809a1142, 15);
                                            c1836h04.m4545k0(objM4514P16);
                                        }
                                        InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P16;
                                        Object objM4514P17 = c1836h04.m4514P();
                                        if (objM4514P17 == c1823e3) {
                                            objM4514P17 = new C5534zd(interfaceC1809a1142, 22);
                                            c1836h04.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9430S("深色背景", "深色模式消息时间背景", str10, false, interfaceC1220a7, (InterfaceC1231l) objM4514P17, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a120;
                                        String str11 = (String) interfaceC1809a1152.getValue();
                                        Object objM4514P18 = c1836h04.m4514P();
                                        if (objM4514P18 == c1823e3) {
                                            objM4514P18 = new C5371ud(interfaceC1809a1152, 16);
                                            c1836h04.m4545k0(objM4514P18);
                                        }
                                        InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P18;
                                        Object objM4514P19 = c1836h04.m4514P();
                                        if (objM4514P19 == c1823e3) {
                                            objM4514P19 = new C5534zd(interfaceC1809a1152, 23);
                                            c1836h04.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9430S("深色文字", "深色模式消息时间文字", str11, false, interfaceC1220a8, (InterfaceC1231l) objM4514P19, c1836h04, 224310, 0);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a117;
                                        String str12 = (String) interfaceC1809a1162.getValue();
                                        List list = AbstractC4955ho.f17699n;
                                        Object objM4514P20 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P20 == c1823e4) {
                                            objM4514P20 = new C5109mf(interfaceC1809a1162, 0);
                                            c1836h05.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片标题", "支持变量", str12, list, 0, (InterfaceC1231l) objM4514P20, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a118;
                                        String str13 = (String) interfaceC1809a1172.getValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C5109mf(interfaceC1809a1172, 1);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片描述", "支持变量", str13, list, 3, (InterfaceC1231l) objM4514P21, c1836h05, 221238, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a119;
                                        String str14 = (String) interfaceC1809a1182.getValue();
                                        Object objM4514P22 = c1836h05.m4514P();
                                        if (objM4514P22 == c1823e4) {
                                            objM4514P22 = new C5109mf(interfaceC1809a1182, 2);
                                            c1836h05.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片标题", "支持变量", str14, list, 0, (InterfaceC1231l) objM4514P22, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a120;
                                        String str15 = (String) interfaceC1809a1192.getValue();
                                        Object objM4514P23 = c1836h05.m4514P();
                                        if (objM4514P23 == c1823e4) {
                                            objM4514P23 = new C5109mf(interfaceC1809a1192, 3);
                                            c1836h05.m4545k0(objM4514P23);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片描述", "支持变量", str15, list, 3, (InterfaceC1231l) objM4514P23, c1836h05, 221238, 0);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1202 = interfaceC1809a117;
                                        int iIntValue7 = ((Number) interfaceC1809a1202.getValue()).intValue();
                                        String str16 = iIntValue7 != 1 ? iIntValue7 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue8 = ((Number) interfaceC1809a1202.getValue()).intValue();
                                        boolean zM4534f = c1836h06.m4534f(interfaceC1809a1202);
                                        Object objM4514P24 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4534f || objM4514P24 == c1823e5) {
                                            objM4514P24 = new C4752bi(interfaceC1809a1202, 1);
                                            c1836h06.m4545k0(objM4514P24);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str16, arrayListM9333F6, iIntValue8, (InterfaceC1231l) objM4514P24, false, c1836h06, 6);
                                        if (((Number) interfaceC1809a1202.getValue()).intValue() == 2) {
                                            c1836h06.m4525a0(-1376241686);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a121 = interfaceC1809a118;
                                            String str17 = (String) interfaceC1809a121.getValue();
                                            boolean zM4534f2 = c1836h06.m4534f(interfaceC1809a121);
                                            Object objM4514P25 = c1836h06.m4514P();
                                            if (zM4534f2 || objM4514P25 == c1823e5) {
                                                objM4514P25 = new C4752bi(interfaceC1809a121, 2);
                                                c1836h06.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，0 表示不延迟", str17, (InterfaceC1231l) objM4514P25, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else if (((Number) interfaceC1809a1202.getValue()).intValue() == 1) {
                                            c1836h06.m4525a0(-1376029119);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a119;
                                            String str18 = (String) interfaceC1809a122.getValue();
                                            boolean zM4534f3 = c1836h06.m4534f(interfaceC1809a122);
                                            Object objM4514P26 = c1836h06.m4514P();
                                            if (zM4534f3 || objM4514P26 == c1823e5) {
                                                objM4514P26 = new C4752bi(interfaceC1809a122, 3);
                                                c1836h06.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms", str18, (InterfaceC1231l) objM4514P26, c1836h06, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a123 = interfaceC1809a120;
                                            String str19 = (String) interfaceC1809a123.getValue();
                                            boolean zM4534f4 = c1836h06.m4534f(interfaceC1809a123);
                                            Object objM4514P27 = c1836h06.m4514P();
                                            if (zM4534f4 || objM4514P27 == c1823e5) {
                                                objM4514P27 = new C4752bi(interfaceC1809a123, 4);
                                                c1836h06.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str19, (InterfaceC1231l) objM4514P27, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-1375750429);
                                            c1836h06.m4553p(false);
                                        }
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        int size = ((List) interfaceC1809a117.getValue()).size();
                                        InterfaceC1809a1 interfaceC1809a124 = interfaceC1809a118;
                                        String str20 = size + " 个配置，当前启用：" + ((String) interfaceC1809a124.getValue());
                                        Object objM4514P28 = c1836h07.m4514P();
                                        if (objM4514P28 == C1851l.f6155a) {
                                            objM4514P28 = new C0497w0(interfaceC1809a124, interfaceC1809a119, interfaceC1809a120, 2);
                                            c1836h07.m4545k0(objM4514P28);
                                        }
                                        AbstractC4955ho.m9503b("配置列表", str20, (InterfaceC1220a) objM4514P28, c1836h07, 390);
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
                    final int i16 = 2;
                    final InterfaceC1809a1 interfaceC1809a121 = this.f17070h;
                    final InterfaceC1809a1 interfaceC1809a122 = this.f17071i;
                    final InterfaceC1809a1 interfaceC1809a123 = this.f17072j;
                    final InterfaceC1809a1 interfaceC1809a124 = this.f17073k;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1832863156, new InterfaceC1235p() { // from class: wb.y9
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i16) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a152 = interfaceC1809a121;
                                        String str = (String) interfaceC1809a152.getValue();
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C5070l9(interfaceC1809a152, 14);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P;
                                        Object objM4514P2 = c1836h02.m4514P();
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C4712ab(interfaceC1809a152, 12);
                                            c1836h02.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9430S("左侧浅色", "对方文本消息，浅色模式", str, false, interfaceC1220a, (InterfaceC1231l) objM4514P2, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a122;
                                        String str2 = (String) interfaceC1809a162.getValue();
                                        Object objM4514P3 = c1836h02.m4514P();
                                        if (objM4514P3 == c1823e) {
                                            objM4514P3 = new C5070l9(interfaceC1809a162, 15);
                                            c1836h02.m4545k0(objM4514P3);
                                        }
                                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P3;
                                        Object objM4514P4 = c1836h02.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C4712ab(interfaceC1809a162, 13);
                                            c1836h02.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9430S("右侧浅色", "自己发送文本消息，浅色模式", str2, false, interfaceC1220a2, (InterfaceC1231l) objM4514P4, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a123;
                                        String str3 = (String) interfaceC1809a172.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C5070l9(interfaceC1809a172, 16);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P5;
                                        Object objM4514P6 = c1836h02.m4514P();
                                        if (objM4514P6 == c1823e) {
                                            objM4514P6 = new C4712ab(interfaceC1809a172, 14);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9430S("左侧深色", "对方文本消息，深色模式", str3, false, interfaceC1220a3, (InterfaceC1231l) objM4514P6, c1836h02, 221238, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a124;
                                        String str4 = (String) interfaceC1809a182.getValue();
                                        Object objM4514P7 = c1836h02.m4514P();
                                        if (objM4514P7 == c1823e) {
                                            objM4514P7 = new C5070l9(interfaceC1809a182, 17);
                                            c1836h02.m4545k0(objM4514P7);
                                        }
                                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P7;
                                        Object objM4514P8 = c1836h02.m4514P();
                                        if (objM4514P8 == c1823e) {
                                            objM4514P8 = new C4712ab(interfaceC1809a182, 15);
                                            c1836h02.m4545k0(objM4514P8);
                                        }
                                        AbstractC4955ho.m9430S("右侧深色", "自己发送文本消息，深色模式", str4, false, interfaceC1220a4, (InterfaceC1231l) objM4514P8, c1836h02, 221238, 8);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                case 1:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a121;
                                        String str5 = (String) interfaceC1809a192.getValue();
                                        Object objM4514P9 = c1836h03.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (objM4514P9 == c1823e2) {
                                            objM4514P9 = new C4944hd(interfaceC1809a192, 0);
                                            c1836h03.m4545k0(objM4514P9);
                                        }
                                        AbstractC4955ho.m9304C1("群主名称", "最多 8 个字符", str5, 0, (InterfaceC1231l) objM4514P9, c1836h03, 24630, 8);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a122;
                                        String str6 = (String) interfaceC1809a1102.getValue();
                                        Object objM4514P10 = c1836h03.m4514P();
                                        if (objM4514P10 == c1823e2) {
                                            objM4514P10 = new C4944hd(interfaceC1809a1102, 1);
                                            c1836h03.m4545k0(objM4514P10);
                                        }
                                        AbstractC4955ho.m9304C1("管理员名称", "最多 8 个字符", str6, 0, (InterfaceC1231l) objM4514P10, c1836h03, 24630, 8);
                                        if (((Boolean) interfaceC1809a123.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(-918261547);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a124;
                                            String str7 = (String) interfaceC1809a1112.getValue();
                                            Object objM4514P11 = c1836h03.m4514P();
                                            if (objM4514P11 == c1823e2) {
                                                objM4514P11 = new C4944hd(interfaceC1809a1112, 2);
                                                c1836h03.m4545k0(objM4514P11);
                                            }
                                            AbstractC4955ho.m9304C1("群员名称", "最多 8 个字符", str7, 0, (InterfaceC1231l) objM4514P11, c1836h03, 24630, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(-918110670);
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
                                        InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a121;
                                        String str8 = (String) interfaceC1809a1122.getValue();
                                        Object objM4514P12 = c1836h04.m4514P();
                                        C1823e c1823e3 = C1851l.f6155a;
                                        if (objM4514P12 == c1823e3) {
                                            objM4514P12 = new C5371ud(interfaceC1809a1122, 13);
                                            c1836h04.m4545k0(objM4514P12);
                                        }
                                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P12;
                                        Object objM4514P13 = c1836h04.m4514P();
                                        if (objM4514P13 == c1823e3) {
                                            objM4514P13 = new C5534zd(interfaceC1809a1122, 20);
                                            c1836h04.m4545k0(objM4514P13);
                                        }
                                        AbstractC4955ho.m9430S("浅色背景", "浅色模式消息时间背景", str8, false, interfaceC1220a5, (InterfaceC1231l) objM4514P13, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1132 = interfaceC1809a122;
                                        String str9 = (String) interfaceC1809a1132.getValue();
                                        Object objM4514P14 = c1836h04.m4514P();
                                        if (objM4514P14 == c1823e3) {
                                            objM4514P14 = new C5371ud(interfaceC1809a1132, 14);
                                            c1836h04.m4545k0(objM4514P14);
                                        }
                                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P14;
                                        Object objM4514P15 = c1836h04.m4514P();
                                        if (objM4514P15 == c1823e3) {
                                            objM4514P15 = new C5534zd(interfaceC1809a1132, 21);
                                            c1836h04.m4545k0(objM4514P15);
                                        }
                                        AbstractC4955ho.m9430S("浅色文字", "浅色模式消息时间文字", str9, false, interfaceC1220a6, (InterfaceC1231l) objM4514P15, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1142 = interfaceC1809a123;
                                        String str10 = (String) interfaceC1809a1142.getValue();
                                        Object objM4514P16 = c1836h04.m4514P();
                                        if (objM4514P16 == c1823e3) {
                                            objM4514P16 = new C5371ud(interfaceC1809a1142, 15);
                                            c1836h04.m4545k0(objM4514P16);
                                        }
                                        InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P16;
                                        Object objM4514P17 = c1836h04.m4514P();
                                        if (objM4514P17 == c1823e3) {
                                            objM4514P17 = new C5534zd(interfaceC1809a1142, 22);
                                            c1836h04.m4545k0(objM4514P17);
                                        }
                                        AbstractC4955ho.m9430S("深色背景", "深色模式消息时间背景", str10, false, interfaceC1220a7, (InterfaceC1231l) objM4514P17, c1836h04, 224310, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1152 = interfaceC1809a124;
                                        String str11 = (String) interfaceC1809a1152.getValue();
                                        Object objM4514P18 = c1836h04.m4514P();
                                        if (objM4514P18 == c1823e3) {
                                            objM4514P18 = new C5371ud(interfaceC1809a1152, 16);
                                            c1836h04.m4545k0(objM4514P18);
                                        }
                                        InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P18;
                                        Object objM4514P19 = c1836h04.m4514P();
                                        if (objM4514P19 == c1823e3) {
                                            objM4514P19 = new C5534zd(interfaceC1809a1152, 23);
                                            c1836h04.m4545k0(objM4514P19);
                                        }
                                        AbstractC4955ho.m9430S("深色文字", "深色模式消息时间文字", str11, false, interfaceC1220a8, (InterfaceC1231l) objM4514P19, c1836h04, 224310, 0);
                                    } else {
                                        c1836h04.m4519V();
                                    }
                                    break;
                                case 3:
                                    C1836h0 c1836h05 = (C1836h0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1162 = interfaceC1809a121;
                                        String str12 = (String) interfaceC1809a1162.getValue();
                                        List list = AbstractC4955ho.f17699n;
                                        Object objM4514P20 = c1836h05.m4514P();
                                        C1823e c1823e4 = C1851l.f6155a;
                                        if (objM4514P20 == c1823e4) {
                                            objM4514P20 = new C5109mf(interfaceC1809a1162, 0);
                                            c1836h05.m4545k0(objM4514P20);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片标题", "支持变量", str12, list, 0, (InterfaceC1231l) objM4514P20, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1172 = interfaceC1809a122;
                                        String str13 = (String) interfaceC1809a1172.getValue();
                                        Object objM4514P21 = c1836h05.m4514P();
                                        if (objM4514P21 == c1823e4) {
                                            objM4514P21 = new C5109mf(interfaceC1809a1172, 1);
                                            c1836h05.m4545k0(objM4514P21);
                                        }
                                        AbstractC4955ho.m9571i4("进群卡片描述", "支持变量", str13, list, 3, (InterfaceC1231l) objM4514P21, c1836h05, 221238, 0);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1182 = interfaceC1809a123;
                                        String str14 = (String) interfaceC1809a1182.getValue();
                                        Object objM4514P22 = c1836h05.m4514P();
                                        if (objM4514P22 == c1823e4) {
                                            objM4514P22 = new C5109mf(interfaceC1809a1182, 2);
                                            c1836h05.m4545k0(objM4514P22);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片标题", "支持变量", str14, list, 0, (InterfaceC1231l) objM4514P22, c1836h05, 196662, 16);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1192 = interfaceC1809a124;
                                        String str15 = (String) interfaceC1809a1192.getValue();
                                        Object objM4514P23 = c1836h05.m4514P();
                                        if (objM4514P23 == c1823e4) {
                                            objM4514P23 = new C5109mf(interfaceC1809a1192, 3);
                                            c1836h05.m4545k0(objM4514P23);
                                        }
                                        AbstractC4955ho.m9571i4("退群卡片描述", "支持变量", str15, list, 3, (InterfaceC1231l) objM4514P23, c1836h05, 221238, 0);
                                    } else {
                                        c1836h05.m4519V();
                                    }
                                    break;
                                case 4:
                                    C1836h0 c1836h06 = (C1836h0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a1202 = interfaceC1809a121;
                                        int iIntValue7 = ((Number) interfaceC1809a1202.getValue()).intValue();
                                        String str16 = iIntValue7 != 1 ? iIntValue7 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                                        ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                                        int iIntValue8 = ((Number) interfaceC1809a1202.getValue()).intValue();
                                        boolean zM4534f = c1836h06.m4534f(interfaceC1809a1202);
                                        Object objM4514P24 = c1836h06.m4514P();
                                        C1823e c1823e5 = C1851l.f6155a;
                                        if (zM4534f || objM4514P24 == c1823e5) {
                                            objM4514P24 = new C4752bi(interfaceC1809a1202, 1);
                                            c1836h06.m4545k0(objM4514P24);
                                        }
                                        AbstractC4955ho.m9361J2("抢包延迟", str16, arrayListM9333F6, iIntValue8, (InterfaceC1231l) objM4514P24, false, c1836h06, 6);
                                        if (((Number) interfaceC1809a1202.getValue()).intValue() == 2) {
                                            c1836h06.m4525a0(-1376241686);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1212 = interfaceC1809a122;
                                            String str17 = (String) interfaceC1809a1212.getValue();
                                            boolean zM4534f2 = c1836h06.m4534f(interfaceC1809a1212);
                                            Object objM4514P25 = c1836h06.m4514P();
                                            if (zM4534f2 || objM4514P25 == c1823e5) {
                                                objM4514P25 = new C4752bi(interfaceC1809a1212, 2);
                                                c1836h06.m4545k0(objM4514P25);
                                            }
                                            AbstractC4955ho.m9695w2("自定义延迟", "单位 ms，0 表示不延迟", str17, (InterfaceC1231l) objM4514P25, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else if (((Number) interfaceC1809a1202.getValue()).intValue() == 1) {
                                            c1836h06.m4525a0(-1376029119);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1222 = interfaceC1809a123;
                                            String str18 = (String) interfaceC1809a1222.getValue();
                                            boolean zM4534f3 = c1836h06.m4534f(interfaceC1809a1222);
                                            Object objM4514P26 = c1836h06.m4514P();
                                            if (zM4534f3 || objM4514P26 == c1823e5) {
                                                objM4514P26 = new C4752bi(interfaceC1809a1222, 3);
                                                c1836h06.m4545k0(objM4514P26);
                                            }
                                            AbstractC4955ho.m9695w2("最小延迟", "单位 ms", str18, (InterfaceC1231l) objM4514P26, c1836h06, 54);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1232 = interfaceC1809a124;
                                            String str19 = (String) interfaceC1809a1232.getValue();
                                            boolean zM4534f4 = c1836h06.m4534f(interfaceC1809a1232);
                                            Object objM4514P27 = c1836h06.m4514P();
                                            if (zM4534f4 || objM4514P27 == c1823e5) {
                                                objM4514P27 = new C4752bi(interfaceC1809a1232, 4);
                                                c1836h06.m4545k0(objM4514P27);
                                            }
                                            AbstractC4955ho.m9695w2("最大延迟", "单位 ms，不能小于最小延迟", str19, (InterfaceC1231l) objM4514P27, c1836h06, 54);
                                            c1836h06.m4553p(false);
                                        } else {
                                            c1836h06.m4525a0(-1375750429);
                                            c1836h06.m4553p(false);
                                        }
                                    } else {
                                        c1836h06.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h07 = (C1836h0) obj4;
                                    int iIntValue9 = ((Integer) obj5).intValue();
                                    if (c1836h07.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        int size = ((List) interfaceC1809a121.getValue()).size();
                                        InterfaceC1809a1 interfaceC1809a1242 = interfaceC1809a122;
                                        String str20 = size + " 个配置，当前启用：" + ((String) interfaceC1809a1242.getValue());
                                        Object objM4514P28 = c1836h07.m4514P();
                                        if (objM4514P28 == C1851l.f6155a) {
                                            objM4514P28 = new C0497w0(interfaceC1809a1242, interfaceC1809a123, interfaceC1809a124, 2);
                                            c1836h07.m4545k0(objM4514P28);
                                        }
                                        AbstractC4955ho.m9503b("配置列表", str20, (InterfaceC1220a) objM4514P28, c1836h07, 390);
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
