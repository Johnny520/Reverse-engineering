package p332wb;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3958e;
import p276sf.C3967n;
import sh.C4029m1;

/* JADX INFO: renamed from: wb.he */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4945he implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17594g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f17595h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f17596i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17597j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17598k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17599l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4945he(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, int i9) {
        this.f17594g = i9;
        this.f17595h = interfaceC1809a1;
        this.f17596i = interfaceC1809a12;
        this.f17597j = interfaceC1809a13;
        this.f17598k = interfaceC1809a14;
        this.f17599l = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f17594g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 1;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f17595h;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f17596i;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f17597j;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f17598k;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f17599l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-531655167, new InterfaceC1235p() { // from class: wb.t8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object obj6;
                            int i12 = i11;
                            C1836h0 c1836h02 = (C1836h0) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            switch (i12) {
                                case 0:
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a16 = interfaceC1809a1;
                                        String str = (String) interfaceC1809a16.getValue();
                                        String str2 = AbstractC1416l.m3825a(str, "avatar_above") ? "头像上方" : AbstractC1416l.m3825a(str, "avatar_below") ? "头像下方" : "消息下方";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("message_bottom", "消息下方"), new C4825dq("avatar_above", "头像上方"), new C4825dq("avatar_below", "头像下方"));
                                        String str3 = (String) interfaceC1809a16.getValue();
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4712ab(interfaceC1809a16, 3);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9353I2("显示位置", str2, listM101y0, str3, (InterfaceC1231l) objM4514P, false, c1836h02, 24582, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a16.getValue(), "message_bottom")) {
                                            c1836h02.m4525a0(-2130750931);
                                            InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a12;
                                            String str4 = (String) interfaceC1809a17.getValue();
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (objM4514P2 == c1823e) {
                                                objM4514P2 = new C4712ab(interfaceC1809a17, 4);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9695w2("左边距", "单位 dp，对方消息使用", str4, (InterfaceC1231l) objM4514P2, c1836h02, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a13;
                                            String str5 = (String) interfaceC1809a18.getValue();
                                            Object objM4514P3 = c1836h02.m4514P();
                                            if (objM4514P3 == c1823e) {
                                                objM4514P3 = new C4712ab(interfaceC1809a18, 5);
                                                c1836h02.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9695w2("右边距", "单位 dp，自己消息使用", str5, (InterfaceC1231l) objM4514P3, c1836h02, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-2130427229);
                                            InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a14;
                                            String str6 = (String) interfaceC1809a19.getValue();
                                            Object objM4514P4 = c1836h02.m4514P();
                                            if (objM4514P4 == c1823e) {
                                                objM4514P4 = new C4712ab(interfaceC1809a19, 6);
                                                c1836h02.m4545k0(objM4514P4);
                                            }
                                            AbstractC4955ho.m9695w2("与头像间距", "单位 dp，可设置 0-64", str6, (InterfaceC1231l) objM4514P4, c1836h02, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            c1836h02.m4553p(false);
                                        }
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a15;
                                        String str7 = (String) interfaceC1809a110.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C4712ab(interfaceC1809a110, 7);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9695w2("字体大小", "单位 sp", str7, (InterfaceC1231l) objM4514P5, c1836h02, 3126);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                default:
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a12;
                                        int iIntValue3 = ((Number) interfaceC1809a111.getValue()).intValue();
                                        String str8 = "只抢含关键词";
                                        if (iIntValue3 == 1) {
                                            obj6 = "只抢含关键词";
                                        } else if (iIntValue3 != 2) {
                                            obj6 = "只抢含关键词";
                                            str8 = "不限关键词";
                                        } else {
                                            obj6 = "只抢含关键词";
                                            str8 = "屏蔽含关键词";
                                        }
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("不限关键词", 0), new C3958e(obj6, 1), new C3958e("屏蔽含关键词", 2));
                                        int iIntValue4 = ((Number) interfaceC1809a111.getValue()).intValue();
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a1;
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1809a112) | c1836h02.m4534f(interfaceC1809a111);
                                        Object objM4514P6 = c1836h02.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4534f || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C4029m1(14, interfaceC1809a112, interfaceC1809a111);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9361J2("关键词过滤", str8, arrayListM9699w6, iIntValue4, (InterfaceC1231l) objM4514P6, false, c1836h02, 6);
                                        C1836h0 c1836h03 = c1836h02;
                                        if (((Number) interfaceC1809a111.getValue()).intValue() != 0) {
                                            c1836h03.m4525a0(1300978703);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str9 = (String) interfaceC1809a112.getValue();
                                            boolean zM4534f2 = c1836h03.m4534f(interfaceC1809a112);
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (zM4534f2 || objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5177oh(interfaceC1809a112, 22);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9304C1("关键词", "多个用 |、逗号或换行分隔", str9, 2, (InterfaceC1231l) objM4514P7, c1836h03, 3126, 0);
                                            c1836h03 = c1836h03;
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(1301334273);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a13;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a113);
                                        Object objM4514P8 = c1836h03.m4514P();
                                        if (zM4534f3 || objM4514P8 == c1823e2) {
                                            objM4514P8 = new C5177oh(interfaceC1809a113, 23);
                                            c1836h03.m4545k0(objM4514P8);
                                        }
                                        C1836h0 c1836h04 = c1836h03;
                                        AbstractC4955ho.m9410P3(zBooleanValue, "禁抢时段", "在指定时间段内不抢红包", false, (InterfaceC1231l) objM4514P8, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a113.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1301667802);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a14;
                                            String str10 = (String) interfaceC1809a114.getValue();
                                            boolean zM4534f4 = c1836h04.m4534f(interfaceC1809a114);
                                            Object objM4514P9 = c1836h04.m4514P();
                                            if (zM4534f4 || objM4514P9 == c1823e2) {
                                                objM4514P9 = new C5177oh(interfaceC1809a114, 24);
                                                c1836h04.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P9, c1836h04, "开始时间", str10, false);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a15;
                                            String str11 = (String) interfaceC1809a115.getValue();
                                            boolean zM4534f5 = c1836h04.m4534f(interfaceC1809a115);
                                            Object objM4514P10 = c1836h04.m4514P();
                                            if (zM4534f5 || objM4514P10 == c1823e2) {
                                                objM4514P10 = new C5177oh(interfaceC1809a115, 25);
                                                c1836h04.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P10, c1836h04, "结束时间", str11, false);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1301920545);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
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
                    final int i12 = 0;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f17595h;
                    final InterfaceC1809a1 interfaceC1809a17 = this.f17596i;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f17597j;
                    final InterfaceC1809a1 interfaceC1809a19 = this.f17598k;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f17599l;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(230167888, new InterfaceC1235p() { // from class: wb.t8
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            Object obj6;
                            int i122 = i12;
                            C1836h0 c1836h02 = (C1836h0) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            switch (i122) {
                                case 0:
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a16;
                                        String str = (String) interfaceC1809a162.getValue();
                                        String str2 = AbstractC1416l.m3825a(str, "avatar_above") ? "头像上方" : AbstractC1416l.m3825a(str, "avatar_below") ? "头像下方" : "消息下方";
                                        List listM101y0 = AbstractC0000a.m101y0(new C4825dq("message_bottom", "消息下方"), new C4825dq("avatar_above", "头像上方"), new C4825dq("avatar_below", "头像下方"));
                                        String str3 = (String) interfaceC1809a162.getValue();
                                        Object objM4514P = c1836h02.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P == c1823e) {
                                            objM4514P = new C4712ab(interfaceC1809a162, 3);
                                            c1836h02.m4545k0(objM4514P);
                                        }
                                        AbstractC4955ho.m9353I2("显示位置", str2, listM101y0, str3, (InterfaceC1231l) objM4514P, false, c1836h02, 24582, 32);
                                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                        if (AbstractC1416l.m3825a((String) interfaceC1809a162.getValue(), "message_bottom")) {
                                            c1836h02.m4525a0(-2130750931);
                                            InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                            String str4 = (String) interfaceC1809a172.getValue();
                                            Object objM4514P2 = c1836h02.m4514P();
                                            if (objM4514P2 == c1823e) {
                                                objM4514P2 = new C4712ab(interfaceC1809a172, 4);
                                                c1836h02.m4545k0(objM4514P2);
                                            }
                                            AbstractC4955ho.m9695w2("左边距", "单位 dp，对方消息使用", str4, (InterfaceC1231l) objM4514P2, c1836h02, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a18;
                                            String str5 = (String) interfaceC1809a182.getValue();
                                            Object objM4514P3 = c1836h02.m4514P();
                                            if (objM4514P3 == c1823e) {
                                                objM4514P3 = new C4712ab(interfaceC1809a182, 5);
                                                c1836h02.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9695w2("右边距", "单位 dp，自己消息使用", str5, (InterfaceC1231l) objM4514P3, c1836h02, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            c1836h02.m4553p(false);
                                        } else {
                                            c1836h02.m4525a0(-2130427229);
                                            InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a19;
                                            String str6 = (String) interfaceC1809a192.getValue();
                                            Object objM4514P4 = c1836h02.m4514P();
                                            if (objM4514P4 == c1823e) {
                                                objM4514P4 = new C4712ab(interfaceC1809a192, 6);
                                                c1836h02.m4545k0(objM4514P4);
                                            }
                                            AbstractC4955ho.m9695w2("与头像间距", "单位 dp，可设置 0-64", str6, (InterfaceC1231l) objM4514P4, c1836h02, 3126);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                                            c1836h02.m4553p(false);
                                        }
                                        InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a110;
                                        String str7 = (String) interfaceC1809a1102.getValue();
                                        Object objM4514P5 = c1836h02.m4514P();
                                        if (objM4514P5 == c1823e) {
                                            objM4514P5 = new C4712ab(interfaceC1809a1102, 7);
                                            c1836h02.m4545k0(objM4514P5);
                                        }
                                        AbstractC4955ho.m9695w2("字体大小", "单位 sp", str7, (InterfaceC1231l) objM4514P5, c1836h02, 3126);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                default:
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a17;
                                        int iIntValue3 = ((Number) interfaceC1809a111.getValue()).intValue();
                                        String str8 = "只抢含关键词";
                                        if (iIntValue3 == 1) {
                                            obj6 = "只抢含关键词";
                                        } else if (iIntValue3 != 2) {
                                            obj6 = "只抢含关键词";
                                            str8 = "不限关键词";
                                        } else {
                                            obj6 = "只抢含关键词";
                                            str8 = "屏蔽含关键词";
                                        }
                                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("不限关键词", 0), new C3958e(obj6, 1), new C3958e("屏蔽含关键词", 2));
                                        int iIntValue4 = ((Number) interfaceC1809a111.getValue()).intValue();
                                        InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a16;
                                        boolean zM4534f = c1836h02.m4534f(interfaceC1809a112) | c1836h02.m4534f(interfaceC1809a111);
                                        Object objM4514P6 = c1836h02.m4514P();
                                        C1823e c1823e2 = C1851l.f6155a;
                                        if (zM4534f || objM4514P6 == c1823e2) {
                                            objM4514P6 = new C4029m1(14, interfaceC1809a112, interfaceC1809a111);
                                            c1836h02.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9361J2("关键词过滤", str8, arrayListM9699w6, iIntValue4, (InterfaceC1231l) objM4514P6, false, c1836h02, 6);
                                        C1836h0 c1836h03 = c1836h02;
                                        if (((Number) interfaceC1809a111.getValue()).intValue() != 0) {
                                            c1836h03.m4525a0(1300978703);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            String str9 = (String) interfaceC1809a112.getValue();
                                            boolean zM4534f2 = c1836h03.m4534f(interfaceC1809a112);
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (zM4534f2 || objM4514P7 == c1823e2) {
                                                objM4514P7 = new C5177oh(interfaceC1809a112, 22);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9304C1("关键词", "多个用 |、逗号或换行分隔", str9, 2, (InterfaceC1231l) objM4514P7, c1836h03, 3126, 0);
                                            c1836h03 = c1836h03;
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(1301334273);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a18;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a113);
                                        Object objM4514P8 = c1836h03.m4514P();
                                        if (zM4534f3 || objM4514P8 == c1823e2) {
                                            objM4514P8 = new C5177oh(interfaceC1809a113, 23);
                                            c1836h03.m4545k0(objM4514P8);
                                        }
                                        C1836h0 c1836h04 = c1836h03;
                                        AbstractC4955ho.m9410P3(zBooleanValue, "禁抢时段", "在指定时间段内不抢红包", false, (InterfaceC1231l) objM4514P8, c1836h04, 432, 8);
                                        if (((Boolean) interfaceC1809a113.getValue()).booleanValue()) {
                                            c1836h04.m4525a0(1301667802);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a114 = interfaceC1809a19;
                                            String str10 = (String) interfaceC1809a114.getValue();
                                            boolean zM4534f4 = c1836h04.m4534f(interfaceC1809a114);
                                            Object objM4514P9 = c1836h04.m4514P();
                                            if (zM4534f4 || objM4514P9 == c1823e2) {
                                                objM4514P9 = new C5177oh(interfaceC1809a114, 24);
                                                c1836h04.m4545k0(objM4514P9);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P9, c1836h04, "开始时间", str10, false);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a115 = interfaceC1809a110;
                                            String str11 = (String) interfaceC1809a115.getValue();
                                            boolean zM4534f5 = c1836h04.m4534f(interfaceC1809a115);
                                            Object objM4514P10 = c1836h04.m4514P();
                                            if (zM4534f5 || objM4514P10 == c1823e2) {
                                                objM4514P10 = new C5177oh(interfaceC1809a115, 25);
                                                c1836h04.m4545k0(objM4514P10);
                                            }
                                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P10, c1836h04, "结束时间", str11, false);
                                            c1836h04.m4553p(false);
                                        } else {
                                            c1836h04.m4525a0(1301920545);
                                            c1836h04.m4553p(false);
                                        }
                                    } else {
                                        c1836h02.m4519V();
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
