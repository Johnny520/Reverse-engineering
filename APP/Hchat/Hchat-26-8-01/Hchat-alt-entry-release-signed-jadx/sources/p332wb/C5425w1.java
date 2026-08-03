package p332wb;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p000a.AbstractC0000a;
import p015b0.C0144j;
import p015b0.C0146l;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.C3143g;
import p261rb.C3797m;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.C4179z;
import ua.C4298i;

/* JADX INFO: renamed from: wb.w1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5425w1 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21570g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f21571h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5425w1(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21570g = i9;
        this.f21571h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21570g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f21571h;
                    String str = (String) interfaceC1809a1.getValue();
                    boolean zM4534f = c1836h0.m4534f(interfaceC1809a1);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C0146l(interfaceC1809a1, 17);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9304C1("搜索", "会话名称 / 备注 / wxid", str, 0, (InterfaceC1231l) objM4514P, c1836h0, 54, 8);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC4955ho.m9657s0((String) this.f21571h.getValue(), c1836h02, 0);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a12 = this.f21571h;
                    boolean zM4534f2 = c1836h03.m4534f(interfaceC1809a12);
                    Object objM4514P2 = c1836h03.m4514P();
                    if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C0144j(interfaceC1809a12, 18);
                        c1836h03.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9503b("删除分组", "子分组移到上一级，直属会话移到上级分组或微信首页", (InterfaceC1220a) objM4514P2, c1836h03, 54);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a13 = this.f21571h;
                    String str2 = (String) interfaceC1809a13.getValue();
                    Object objM4514P3 = c1836h04.m4514P();
                    if (objM4514P3 == C1851l.f6155a) {
                        objM4514P3 = new C0146l(interfaceC1809a13, 18);
                        c1836h04.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9304C1("搜索", "分组名称 / 所属路径", str2, 0, (InterfaceC1231l) objM4514P3, c1836h04, 24630, 8);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a14 = this.f21571h;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                    Object objM4514P4 = c1836h05.m4514P();
                    if (objM4514P4 == C1851l.f6155a) {
                        objM4514P4 = new C5534zd(interfaceC1809a14, 1);
                        c1836h05.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "朋友圈底部详情", "在朋友圈底部显示自定义时间和详情", false, (InterfaceC1231l) objM4514P4, c1836h05, 25008, 8);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a15 = this.f21571h;
                    String str3 = (String) interfaceC1809a15.getValue();
                    List list = AbstractC4955ho.f17700o;
                    Object objM4514P5 = c1836h06.m4514P();
                    if (objM4514P5 == C1851l.f6155a) {
                        objM4514P5 = new C5109mf(interfaceC1809a15, 25);
                        c1836h06.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9571i4("改名提醒文本", "多个模板用 || 分隔随机选择", str3, list, 3, (InterfaceC1231l) objM4514P5, c1836h06, 221238, 0);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a16 = this.f21571h;
                    String str4 = (String) interfaceC1809a16.getValue();
                    Object objM4514P6 = c1836h07.m4514P();
                    if (objM4514P6 == C1851l.f6155a) {
                        objM4514P6 = new C5534zd(interfaceC1809a16, 27);
                        c1836h07.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9304C1("时间变量格式", "用于 {time}，例如 yyyy-MM-dd HH:mm:ss", str4, 0, (InterfaceC1231l) objM4514P6, c1836h07, 24630, 8);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a17 = this.f21571h;
                    String str5 = (String) interfaceC1809a17.getValue();
                    Object objM4514P7 = c1836h08.m4514P();
                    if (objM4514P7 == C1851l.f6155a) {
                        objM4514P7 = new C4881fg(interfaceC1809a17, 4);
                        c1836h08.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9304C1("时间变量格式", "用于 {time}，例如 yyyy-MM-dd HH:mm:ss", str5, 0, (InterfaceC1231l) objM4514P7, c1836h08, 24630, 8);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                C1836h0 c1836h09 = (C1836h0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a18 = this.f21571h;
                    String str6 = (String) interfaceC1809a18.getValue();
                    Object objM4514P8 = c1836h09.m4514P();
                    if (objM4514P8 == C1851l.f6155a) {
                        objM4514P8 = new C4980ih(interfaceC1809a18, 22);
                        c1836h09.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9304C1("搜索聊天", "昵称 / ID / 模板名", str6, 0, (InterfaceC1231l) objM4514P8, c1836h09, 24630, 8);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                C1836h0 c1836h010 = (C1836h0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a19 = this.f21571h;
                    String str7 = ((C4298i) interfaceC1809a19.getValue()).f14301b;
                    boolean zM4534f3 = c1836h010.m4534f(interfaceC1809a19);
                    Object objM4514P9 = c1836h010.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f3 || objM4514P9 == c1823e) {
                        objM4514P9 = new C4916gi(interfaceC1809a19, 12);
                        c1836h010.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9304C1("模板名称", "用于默认规则和聊天绑定", str7, 0, (InterfaceC1231l) objM4514P9, c1836h010, 54, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h010, 0, 1);
                    boolean z9 = ((C4298i) interfaceC1809a19.getValue()).f14302c;
                    boolean zM4534f4 = c1836h010.m4534f(interfaceC1809a19);
                    Object objM4514P10 = c1836h010.m4514P();
                    if (zM4534f4 || objM4514P10 == c1823e) {
                        objM4514P10 = new C4916gi(interfaceC1809a19, 13);
                        c1836h010.m4545k0(objM4514P10);
                    }
                    AbstractC4955ho.m9410P3(z9, "启用模板", "关闭后使用该模板的聊天不会自动收款", false, (InterfaceC1231l) objM4514P10, c1836h010, 432, 8);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                C1836h0 c1836h011 = (C1836h0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC4955ho.m9657s0((String) this.f21571h.getValue(), c1836h011, 0);
                } else {
                    c1836h011.m4519V();
                }
                return C3967n.f12976a;
            case 11:
                C1836h0 c1836h012 = (C1836h0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a110 = this.f21571h;
                    String str8 = (String) interfaceC1809a110.getValue();
                    List list2 = AbstractC4955ho.f17700o;
                    boolean zM4534f5 = c1836h012.m4534f(interfaceC1809a110);
                    Object objM4514P11 = c1836h012.m4514P();
                    if (zM4534f5 || objM4514P11 == C1851l.f6155a) {
                        objM4514P11 = new C5341tg(interfaceC1809a110, 4);
                        c1836h012.m4545k0(objM4514P11);
                    }
                    AbstractC4955ho.m9571i4("改名提醒文本", "本群专属；多个模板用 || 分隔随机选择", str8, list2, 3, (InterfaceC1231l) objM4514P11, c1836h012, 24630, 0);
                } else {
                    c1836h012.m4519V();
                }
                return C3967n.f12976a;
            case 12:
                C1836h0 c1836h013 = (C1836h0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c1836h013.m4516S(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC4955ho.m9657s0(AbstractC3149m.m6721t0((String) this.f21571h.getValue()) ? "没有可选收藏" : "没有匹配收藏", c1836h013, 0);
                } else {
                    c1836h013.m4519V();
                }
                return C3967n.f12976a;
            case 13:
                C1836h0 c1836h014 = (C1836h0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c1836h014.m4516S(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a111 = this.f21571h;
                    EnumC4966i2 enumC4966i2 = (EnumC4966i2) interfaceC1809a111.getValue();
                    Object objM4514P12 = c1836h014.m4514P();
                    if (objM4514P12 == C1851l.f6155a) {
                        objM4514P12 = new C5341tg(interfaceC1809a111, 3);
                        c1836h014.m4545k0(objM4514P12);
                    }
                    AbstractC4955ho.m9531e0(enumC4966i2, (InterfaceC1231l) objM4514P12, false, c1836h014, 48, 4);
                } else {
                    c1836h014.m4519V();
                }
                return C3967n.f12976a;
            case 14:
                C1836h0 c1836h015 = (C1836h0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c1836h015.m4516S(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a112 = this.f21571h;
                    String str9 = (String) interfaceC1809a112.getValue();
                    Object objM4514P13 = c1836h015.m4514P();
                    if (objM4514P13 == C1851l.f6155a) {
                        objM4514P13 = new C5177oh(interfaceC1809a112, 9);
                        c1836h015.m4545k0(objM4514P13);
                    }
                    AbstractC4955ho.m9304C1("搜索聊天", "昵称 / wxid / 群号 / 模板名", str9, 0, (InterfaceC1231l) objM4514P13, c1836h015, 24630, 8);
                } else {
                    c1836h015.m4519V();
                }
                return C3967n.f12976a;
            case 15:
                C1836h0 c1836h016 = (C1836h0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c1836h016.m4516S(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a113 = this.f21571h;
                    String str10 = (String) interfaceC1809a113.getValue();
                    Object objM4514P14 = c1836h016.m4514P();
                    if (objM4514P14 == C1851l.f6155a) {
                        objM4514P14 = new C5177oh(interfaceC1809a113, 26);
                        c1836h016.m4545k0(objM4514P14);
                    }
                    AbstractC4955ho.m9304C1("搜索名单", "昵称 / wxid / 群号 / 模板名", str10, 0, (InterfaceC1231l) objM4514P14, c1836h016, 24630, 8);
                } else {
                    c1836h016.m4519V();
                }
                return C3967n.f12976a;
            case 16:
                C1836h0 c1836h017 = (C1836h0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (c1836h017.m4516S(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    AbstractC4955ho.m9657s0((String) this.f21571h.getValue(), c1836h017, 0);
                } else {
                    c1836h017.m4519V();
                }
                return C3967n.f12976a;
            case 17:
                C1836h0 c1836h018 = (C1836h0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (c1836h018.m4516S(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a114 = this.f21571h;
                    EnumC4966i2 enumC4966i22 = (EnumC4966i2) interfaceC1809a114.getValue();
                    Object objM4514P15 = c1836h018.m4514P();
                    if (objM4514P15 == C1851l.f6155a) {
                        objM4514P15 = new C5177oh(interfaceC1809a114, 28);
                        c1836h018.m4545k0(objM4514P15);
                    }
                    AbstractC4955ho.m9531e0(enumC4966i22, (InterfaceC1231l) objM4514P15, false, c1836h018, 432, 0);
                } else {
                    c1836h018.m4519V();
                }
                return C3967n.f12976a;
            case 18:
                C1836h0 c1836h019 = (C1836h0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (c1836h019.m4516S(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a115 = this.f21571h;
                    String str11 = (String) interfaceC1809a115.getValue();
                    Object objM4514P16 = c1836h019.m4514P();
                    if (objM4514P16 == C1851l.f6155a) {
                        objM4514P16 = new C4752bi(interfaceC1809a115, 19);
                        c1836h019.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9304C1("关键词", "按标签名筛选", str11, 0, (InterfaceC1231l) objM4514P16, c1836h019, 24630, 8);
                } else {
                    c1836h019.m4519V();
                }
                return C3967n.f12976a;
            case 19:
                C1836h0 c1836h020 = (C1836h0) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (c1836h020.m4516S(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a116 = this.f21571h;
                    EnumC4966i2 enumC4966i23 = (EnumC4966i2) interfaceC1809a116.getValue();
                    Object objM4514P17 = c1836h020.m4514P();
                    if (objM4514P17 == C1851l.f6155a) {
                        objM4514P17 = new C5177oh(interfaceC1809a116, 5);
                        c1836h020.m4545k0(objM4514P17);
                    }
                    AbstractC4955ho.m9531e0(enumC4966i23, (InterfaceC1231l) objM4514P17, false, c1836h020, 432, 0);
                } else {
                    c1836h020.m4519V();
                }
                return C3967n.f12976a;
            case 20:
                C1836h0 c1836h021 = (C1836h0) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (c1836h021.m4516S(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    AbstractC4955ho.m9657s0((String) this.f21571h.getValue(), c1836h021, 0);
                } else {
                    c1836h021.m4519V();
                }
                return C3967n.f12976a;
            case 21:
                C1836h0 c1836h022 = (C1836h0) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (c1836h022.m4516S(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    Iterator it = new C3143g(AbstractC4166m.m8404M1(12, ((C3797m) this.f21571h.getValue()).f12473h)).iterator();
                    int i9 = 0;
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((C4179z) it).f13716h;
                        if (listIterator.hasPrevious()) {
                            Object objPrevious = listIterator.previous();
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            String str12 = (String) objPrevious;
                            if (i9 > 0) {
                                c1836h022.m4525a0(-1029250068);
                                AbstractC4955ho.m9312D1(0.0f, c1836h022, 0, 1);
                            } else {
                                c1836h022.m4525a0(-1841967580);
                            }
                            c1836h022.m4553p(false);
                            AbstractC4955ho.m9296B1("记录", str12, null, c1836h022, 6, 4);
                            i9 = i10;
                        }
                    }
                } else {
                    c1836h022.m4519V();
                }
                return C3967n.f12976a;
            case 22:
                C1836h0 c1836h023 = (C1836h0) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (c1836h023.m4516S(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a117 = this.f21571h;
                    String str13 = (String) interfaceC1809a117.getValue();
                    Object objM4514P18 = c1836h023.m4514P();
                    if (objM4514P18 == C1851l.f6155a) {
                        objM4514P18 = new C4881fg(interfaceC1809a117, 20);
                        c1836h023.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9304C1("搜索监听群", "群名称 / 群聊备注 / 群号", str13, 0, (InterfaceC1231l) objM4514P18, c1836h023, 24630, 8);
                } else {
                    c1836h023.m4519V();
                }
                return C3967n.f12976a;
            case 23:
                C1836h0 c1836h024 = (C1836h0) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (c1836h024.m4516S(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a118 = this.f21571h;
                    String str14 = (String) interfaceC1809a118.getValue();
                    Object objM4514P19 = c1836h024.m4514P();
                    if (objM4514P19 == C1851l.f6155a) {
                        objM4514P19 = new C4916gi(interfaceC1809a118, 7);
                        c1836h024.m4545k0(objM4514P19);
                    }
                    AbstractC4955ho.m9304C1("搜索监听群", "群名称 / 群聊备注 / 群号", str14, 0, (InterfaceC1231l) objM4514P19, c1836h024, 24630, 8);
                } else {
                    c1836h024.m4519V();
                }
                return C3967n.f12976a;
            case 24:
                C1836h0 c1836h025 = (C1836h0) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (c1836h025.m4516S(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    AbstractC4955ho.m9657s0((String) this.f21571h.getValue(), c1836h025, 0);
                } else {
                    c1836h025.m4519V();
                }
                return C3967n.f12976a;
            case 25:
                C1836h0 c1836h026 = (C1836h0) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (c1836h026.m4516S(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a119 = this.f21571h;
                    EnumC4966i2 enumC4966i24 = (EnumC4966i2) interfaceC1809a119.getValue();
                    Object objM4514P20 = c1836h026.m4514P();
                    if (objM4514P20 == C1851l.f6155a) {
                        objM4514P20 = new C4980ih(interfaceC1809a119, 7);
                        c1836h026.m4545k0(objM4514P20);
                    }
                    AbstractC4955ho.m9531e0(enumC4966i24, (InterfaceC1231l) objM4514P20, false, c1836h026, 48, 4);
                } else {
                    c1836h026.m4519V();
                }
                return C3967n.f12976a;
            case 26:
                C1836h0 c1836h027 = (C1836h0) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (c1836h027.m4516S(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a120 = this.f21571h;
                    String str15 = (String) interfaceC1809a120.getValue();
                    List list3 = AbstractC4955ho.f17700o;
                    boolean zM4534f6 = c1836h027.m4534f(interfaceC1809a120);
                    Object objM4514P21 = c1836h027.m4514P();
                    if (zM4534f6 || objM4514P21 == C1851l.f6155a) {
                        objM4514P21 = new C4881fg(interfaceC1809a120, 17);
                        c1836h027.m4545k0(objM4514P21);
                    }
                    AbstractC4955ho.m9571i4("改名提醒文本", "多个模板用 || 分隔随机选择", str15, list3, 3, (InterfaceC1231l) objM4514P21, c1836h027, 24630, 0);
                } else {
                    c1836h027.m4519V();
                }
                return C3967n.f12976a;
            case 27:
                C1836h0 c1836h028 = (C1836h0) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (c1836h028.m4516S(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a121 = this.f21571h;
                    String str16 = (String) interfaceC1809a121.getValue();
                    boolean zM4534f7 = c1836h028.m4534f(interfaceC1809a121);
                    Object objM4514P22 = c1836h028.m4514P();
                    if (zM4534f7 || objM4514P22 == C1851l.f6155a) {
                        objM4514P22 = new C5341tg(interfaceC1809a121, 21);
                        c1836h028.m4545k0(objM4514P22);
                    }
                    AbstractC4955ho.m9304C1("搜索", "昵称 / 群聊备注 / wxid", str16, 0, (InterfaceC1231l) objM4514P22, c1836h028, 54, 8);
                } else {
                    c1836h028.m4519V();
                }
                return C3967n.f12976a;
            case 28:
                C1836h0 c1836h029 = (C1836h0) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (c1836h029.m4516S(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a122 = this.f21571h;
                    String str17 = (String) interfaceC1809a122.getValue();
                    Object objM4514P23 = c1836h029.m4514P();
                    if (objM4514P23 == C1851l.f6155a) {
                        objM4514P23 = new C4752bi(interfaceC1809a122, 20);
                        c1836h029.m4545k0(objM4514P23);
                    }
                    AbstractC4955ho.m9304C1("搜索监听群", "群名称 / 群聊备注 / 群号", str17, 0, (InterfaceC1231l) objM4514P23, c1836h029, 24630, 8);
                } else {
                    c1836h029.m4519V();
                }
                return C3967n.f12976a;
            default:
                C1836h0 c1836h030 = (C1836h0) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (c1836h030.m4516S(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    AbstractC4955ho.m9657s0((String) this.f21571h.getValue(), c1836h030, 0);
                } else {
                    c1836h030.m4519V();
                }
                return C3967n.f12976a;
        }
    }
}
