package p332wb;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3958e;
import p276sf.C3967n;
import sh.C4029m1;

/* JADX INFO: renamed from: wb.z8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5529z8 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22354g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f22355h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f22356i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f22357j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f22358k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f22359l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f22360m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f22361n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Context f22362o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f22363p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f22364q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f22365r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f22366s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f22367t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f22368u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f22369v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5529z8(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f22362o = context;
        this.f22355h = interfaceC1809a1;
        this.f22356i = interfaceC1809a12;
        this.f22357j = interfaceC1809a13;
        this.f22358k = interfaceC1809a14;
        this.f22359l = interfaceC1809a15;
        this.f22360m = interfaceC1809a16;
        this.f22361n = interfaceC1809a17;
        this.f22363p = interfaceC1809a18;
        this.f22364q = interfaceC1809a19;
        this.f22365r = interfaceC1809a110;
        this.f22366s = interfaceC1809a111;
        this.f22367t = interfaceC1809a112;
        this.f22368u = interfaceC1809a113;
        this.f22369v = interfaceC1809a114;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22354g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Context context = this.f22362o;
                    boolean zM4538h = c1836h0.m4538h(context);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        objM4514P = new C5305sd(context, this.f22355h, this.f22356i, this.f22357j, this.f22358k, this.f22359l, this.f22360m, this.f22361n, this.f22363p, this.f22364q, this.f22365r, this.f22366s, this.f22367t, this.f22368u, this.f22369v, 0);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9503b("恢复默认", "重置本页全部消息显示时间设置", (InterfaceC1220a) objM4514P, c1836h0, 54);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f22355h;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                    boolean zM4534f = c1836h02.m4534f(interfaceC1809a1);
                    Object objM4514P2 = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P2 == c1823e) {
                        objM4514P2 = new C4881fg(interfaceC1809a1, 21);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "通知栏提醒", "抢到红包时提醒", false, (InterfaceC1231l) objM4514P2, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                        c1836h02.m4525a0(679453875);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a12 = this.f22356i;
                        String str = (String) interfaceC1809a12.getValue();
                        List list = AbstractC4955ho.f17690e;
                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a12);
                        Object objM4514P3 = c1836h02.m4514P();
                        if (zM4534f2 || objM4514P3 == c1823e) {
                            objM4514P3 = new C4881fg(interfaceC1809a12, 26);
                            c1836h02.m4545k0(objM4514P3);
                        }
                        AbstractC4955ho.m9571i4("通知栏文案", "支持下方变量", str, list, 0, (InterfaceC1231l) objM4514P3, c1836h02, 54, 16);
                        c1836h02 = c1836h02;
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(679841158);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a13 = this.f22357j;
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    boolean zM4534f3 = c1836h02.m4534f(interfaceC1809a13);
                    Object objM4514P4 = c1836h02.m4514P();
                    if (zM4534f3 || objM4514P4 == c1823e) {
                        objM4514P4 = new C4881fg(interfaceC1809a13, 27);
                        c1836h02.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "浮窗提醒", "抢到红包时短暂提示", false, (InterfaceC1231l) objM4514P4, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                        c1836h02.m4525a0(680195178);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a14 = this.f22358k;
                        String str2 = (String) interfaceC1809a14.getValue();
                        List list2 = AbstractC4955ho.f17690e;
                        boolean zM4534f4 = c1836h02.m4534f(interfaceC1809a14);
                        Object objM4514P5 = c1836h02.m4514P();
                        if (zM4534f4 || objM4514P5 == c1823e) {
                            objM4514P5 = new C4881fg(interfaceC1809a14, 28);
                            c1836h02.m4545k0(objM4514P5);
                        }
                        C1836h0 c1836h03 = c1836h02;
                        AbstractC4955ho.m9571i4("浮窗文案", "支持下方变量", str2, list2, 0, (InterfaceC1231l) objM4514P5, c1836h03, 54, 16);
                        c1836h02 = c1836h03;
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(680591110);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a15 = this.f22359l;
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                    boolean zM4534f5 = c1836h02.m4534f(interfaceC1809a15);
                    Object objM4514P6 = c1836h02.m4514P();
                    if (zM4534f5 || objM4514P6 == c1823e) {
                        objM4514P6 = new C4881fg(interfaceC1809a15, 29);
                        c1836h02.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, "通知铃声", "开启后播放通知铃声", false, (InterfaceC1231l) objM4514P6, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a15.getValue()).booleanValue()) {
                        c1836h02.m4525a0(681000558);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a16 = this.f22360m;
                        String str3 = ((Number) interfaceC1809a16.getValue()).intValue() == 1 ? "从文件选择铃声" : "选择系统铃声";
                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("选择系统铃声", 0), new C3958e("从文件选择铃声", 1));
                        int iIntValue3 = ((Number) interfaceC1809a16.getValue()).intValue();
                        boolean zM4534f6 = c1836h02.m4534f(interfaceC1809a16);
                        InterfaceC1809a1 interfaceC1809a17 = this.f22361n;
                        boolean zM4534f7 = zM4534f6 | c1836h02.m4534f(interfaceC1809a17);
                        Object objM4514P7 = c1836h02.m4514P();
                        if (zM4534f7 || objM4514P7 == c1823e) {
                            objM4514P7 = new C4029m1(9, interfaceC1809a16, interfaceC1809a17);
                            c1836h02.m4545k0(objM4514P7);
                        }
                        C1836h0 c1836h04 = c1836h02;
                        AbstractC4955ho.m9361J2("铃声模式", str3, arrayListM9699w6, iIntValue3, (InterfaceC1231l) objM4514P7, false, c1836h04, 6);
                        c1836h02 = c1836h04;
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        String str4 = (String) interfaceC1809a17.getValue();
                        int iIntValue4 = ((Number) interfaceC1809a16.getValue()).intValue();
                        Context context2 = this.f22362o;
                        String strM9421Q6 = AbstractC4955ho.m9421Q6(context2, str4, iIntValue4);
                        boolean zM4538h2 = c1836h02.m4538h(context2) | c1836h02.m4534f(interfaceC1809a17) | c1836h02.m4534f(interfaceC1809a16);
                        Object objM4514P8 = c1836h02.m4514P();
                        if (zM4538h2 || objM4514P8 == c1823e) {
                            objM4514P8 = new C5205pc(context2, interfaceC1809a16, interfaceC1809a17, 1);
                            c1836h02.m4545k0(objM4514P8);
                        }
                        AbstractC4955ho.m9503b("选择铃声", strM9421Q6, (InterfaceC1220a) objM4514P8, c1836h02, 6);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(683114758);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a18 = this.f22363p;
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                    boolean zM4534f8 = c1836h02.m4534f(interfaceC1809a18);
                    Object objM4514P9 = c1836h02.m4514P();
                    if (zM4534f8 || objM4514P9 == c1823e) {
                        objM4514P9 = new C5341tg(interfaceC1809a18, 0);
                        c1836h02.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue4, "通知震动", "开启后触发通知震动", false, (InterfaceC1231l) objM4514P9, c1836h02, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a19 = this.f22364q;
                    boolean zBooleanValue5 = ((Boolean) interfaceC1809a19.getValue()).booleanValue();
                    boolean zM4534f9 = c1836h02.m4534f(interfaceC1809a19);
                    Object objM4514P10 = c1836h02.m4514P();
                    if (zM4534f9 || objM4514P10 == c1823e) {
                        objM4514P10 = new C5341tg(interfaceC1809a19, 1);
                        c1836h02.m4545k0(objM4514P10);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue5, "抢到红包播报", "抢到后用系统语音播报", false, (InterfaceC1231l) objM4514P10, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a19.getValue()).booleanValue()) {
                        c1836h02.m4525a0(683763216);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a110 = this.f22365r;
                        String str5 = (String) interfaceC1809a110.getValue();
                        List list3 = AbstractC4955ho.f17690e;
                        boolean zM4534f10 = c1836h02.m4534f(interfaceC1809a110);
                        Object objM4514P11 = c1836h02.m4514P();
                        if (zM4534f10 || objM4514P11 == c1823e) {
                            objM4514P11 = new C5341tg(interfaceC1809a110, 2);
                            c1836h02.m4545k0(objM4514P11);
                        }
                        C1836h0 c1836h05 = c1836h02;
                        AbstractC4955ho.m9571i4("播报文案", "支持下方变量", str5, list3, 0, (InterfaceC1231l) objM4514P11, c1836h05, 54, 16);
                        c1836h02 = c1836h05;
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(684153382);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a111 = this.f22366s;
                    boolean zBooleanValue6 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                    boolean zM4534f11 = c1836h02.m4534f(interfaceC1809a111);
                    Object objM4514P12 = c1836h02.m4514P();
                    if (zM4534f11 || objM4514P12 == c1823e) {
                        objM4514P12 = new C4881fg(interfaceC1809a111, 22);
                        c1836h02.m4545k0(objM4514P12);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue6, "未抢到提醒", "未抢到红包时通知", false, (InterfaceC1231l) objM4514P12, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a111.getValue()).booleanValue()) {
                        c1836h02.m4525a0(684528420);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a112 = this.f22367t;
                        String str6 = (String) interfaceC1809a112.getValue();
                        List list4 = AbstractC4955ho.f17690e;
                        boolean zM4534f12 = c1836h02.m4534f(interfaceC1809a112);
                        Object objM4514P13 = c1836h02.m4514P();
                        if (zM4534f12 || objM4514P13 == c1823e) {
                            objM4514P13 = new C4881fg(interfaceC1809a112, 23);
                            c1836h02.m4545k0(objM4514P13);
                        }
                        C1836h0 c1836h06 = c1836h02;
                        AbstractC4955ho.m9571i4("未抢到通知栏文案", "支持下方变量", str6, list4, 0, (InterfaceC1231l) objM4514P13, c1836h06, 54, 16);
                        c1836h02 = c1836h06;
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(684930118);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a113 = this.f22368u;
                    boolean zBooleanValue7 = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                    boolean zM4534f13 = c1836h02.m4534f(interfaceC1809a113);
                    Object objM4514P14 = c1836h02.m4514P();
                    if (zM4534f13 || objM4514P14 == c1823e) {
                        objM4514P14 = new C4881fg(interfaceC1809a113, 24);
                        c1836h02.m4545k0(objM4514P14);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue7, "未抢到浮窗", "未抢到红包时短暂提示", false, (InterfaceC1231l) objM4514P14, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a113.getValue()).booleanValue()) {
                        c1836h02.m4525a0(685304443);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a114 = this.f22369v;
                        String str7 = (String) interfaceC1809a114.getValue();
                        List list5 = AbstractC4955ho.f17690e;
                        boolean zM4534f14 = c1836h02.m4534f(interfaceC1809a114);
                        Object objM4514P15 = c1836h02.m4514P();
                        if (zM4534f14 || objM4514P15 == c1823e) {
                            objM4514P15 = new C4881fg(interfaceC1809a114, 25);
                            c1836h02.m4545k0(objM4514P15);
                        }
                        C1836h0 c1836h07 = c1836h02;
                        AbstractC4955ho.m9571i4("未抢到浮窗文案", "支持下方变量", str7, list5, 0, (InterfaceC1231l) objM4514P15, c1836h07, 54, 16);
                        c1836h07.m4553p(false);
                    } else {
                        c1836h02.m4525a0(685714790);
                        c1836h02.m4553p(false);
                    }
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5529z8(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, Context context, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f22355h = interfaceC1809a1;
        this.f22356i = interfaceC1809a12;
        this.f22357j = interfaceC1809a13;
        this.f22358k = interfaceC1809a14;
        this.f22359l = interfaceC1809a15;
        this.f22360m = interfaceC1809a16;
        this.f22361n = interfaceC1809a17;
        this.f22362o = context;
        this.f22363p = interfaceC1809a18;
        this.f22364q = interfaceC1809a19;
        this.f22365r = interfaceC1809a110;
        this.f22366s = interfaceC1809a111;
        this.f22367t = interfaceC1809a112;
        this.f22368u = interfaceC1809a113;
        this.f22369v = interfaceC1809a114;
    }
}
