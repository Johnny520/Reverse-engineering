package p332wb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3958e;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.ub */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5369ub implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21072g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f21073h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21074i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21075j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21076k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21077l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21078m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21079n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f21080o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f21081p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f21082q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f21083r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f21084s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f21085t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f21086u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5369ub(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f21086u = sharedPreferences;
        this.f21073h = interfaceC1809a1;
        this.f21074i = interfaceC1809a12;
        this.f21075j = interfaceC1809a13;
        this.f21076k = interfaceC1809a14;
        this.f21077l = interfaceC1809a15;
        this.f21078m = interfaceC1809a16;
        this.f21079n = interfaceC1809a17;
        this.f21080o = interfaceC1809a18;
        this.f21081p = interfaceC1809a19;
        this.f21082q = interfaceC1809a110;
        this.f21083r = interfaceC1809a111;
        this.f21084s = interfaceC1809a112;
        this.f21085t = interfaceC1809a113;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05d2  */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C1823e c1823e;
        Integer num;
        C1823e c1823e2;
        C1823e c1823e3;
        Object objM4514P;
        InterfaceC1809a1 interfaceC1809a1;
        boolean zM4538h;
        Object objM4514P2;
        switch (this.f21072g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f21086u;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a12 = this.f21073h;
                    int iIntValue2 = ((Number) interfaceC1809a12.getValue()).intValue();
                    String str = iIntValue2 != 1 ? iIntValue2 != 2 ? "全部接收" : "拒收黑名单" : "只接收白名单";
                    ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("全部接收", 0), new C3958e("只接收白名单", 1), new C3958e("拒收黑名单", 2));
                    int iIntValue3 = ((Number) interfaceC1809a12.getValue()).intValue();
                    boolean zM4538h2 = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P3 = c1836h0.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4538h2 || objM4514P3 == c1823e4) {
                        objM4514P3 = new C5108me(sharedPreferences, interfaceC1809a12, 7);
                        c1836h0.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9361J2("收款范围", str, arrayListM9699w6, iIntValue3, (InterfaceC1231l) objM4514P3, false, c1836h0, 6);
                    if (((Number) interfaceC1809a12.getValue()).intValue() == 1 || ((Number) interfaceC1809a12.getValue()).intValue() == 2) {
                        c1836h0.m4525a0(1775842248);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        String str2 = ((Number) interfaceC1809a12.getValue()).intValue() == 1 ? "白名单" : "黑名单";
                        int iIntValue4 = ((Number) interfaceC1809a12.getValue()).intValue();
                        InterfaceC1809a1 interfaceC1809a13 = this.f21074i;
                        InterfaceC1809a1 interfaceC1809a14 = this.f21075j;
                        String strM9403O4 = AbstractC4955ho.m9403O4(iIntValue4 == 1 ? (String) interfaceC1809a13.getValue() : (String) interfaceC1809a14.getValue());
                        Object objM4514P4 = c1836h0.m4514P();
                        c1823e = c1823e4;
                        if (objM4514P4 == c1823e) {
                            objM4514P4 = new C4716af(interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, this.f21076k, 0);
                            c1836h0.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9503b(str2, strM9403O4, (InterfaceC1220a) objM4514P4, c1836h0, 384);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(1776408277);
                        c1836h0.m4553p(false);
                        c1823e = c1823e4;
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    InterfaceC1809a1 interfaceC1809a15 = this.f21077l;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                    boolean zM4538h3 = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P5 = c1836h0.m4514P();
                    if (zM4538h3 || objM4514P5 == c1823e) {
                        objM4514P5 = new C5108me(sharedPreferences, interfaceC1809a15, 8);
                        c1836h0.m4545k0(objM4514P5);
                    }
                    C1823e c1823e5 = c1823e;
                    AbstractC4955ho.m9410P3(zBooleanValue, "启用金额规则", "按转账金额决定接收或拒收", false, (InterfaceC1231l) objM4514P5, c1836h0, 432, 8);
                    C1836h0 c1836h02 = c1836h0;
                    if (((Boolean) interfaceC1809a15.getValue()).booleanValue()) {
                        c1836h02.m4525a0(1776696701);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a16 = this.f21078m;
                        int iIntValue5 = ((Number) interfaceC1809a16.getValue()).intValue();
                        String str3 = iIntValue5 != 0 ? iIntValue5 != 2 ? "小于" : "等于" : "大于";
                        ArrayList arrayListM9699w62 = AbstractC4955ho.m9699w6(new C3958e("大于", 0), new C3958e("小于", 1), new C3958e("等于", 2));
                        int iIntValue6 = ((Number) interfaceC1809a16.getValue()).intValue();
                        boolean zM4538h4 = c1836h02.m4538h(sharedPreferences);
                        Object objM4514P6 = c1836h02.m4514P();
                        if (zM4538h4) {
                            c1823e3 = c1823e5;
                        } else {
                            c1823e3 = c1823e5;
                            if (objM4514P6 == c1823e3) {
                            }
                            num = 2;
                            c1823e2 = c1823e3;
                            AbstractC4955ho.m9361J2("金额条件", str3, arrayListM9699w62, iIntValue6, (InterfaceC1231l) objM4514P6, false, c1836h02, 6);
                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                            InterfaceC1809a1 interfaceC1809a17 = this.f21079n;
                            String str4 = (String) interfaceC1809a17.getValue();
                            objM4514P = c1836h02.m4514P();
                            if (objM4514P == c1823e2) {
                                objM4514P = new C5535ze(interfaceC1809a17, 4);
                                c1836h02.m4545k0(objM4514P);
                            }
                            AbstractC4955ho.m9304C1("金额数值", "单位元，例如 10.5", str4, 0, (InterfaceC1231l) objM4514P, c1836h02, 24630, 8);
                            c1836h02 = c1836h02;
                            AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                            interfaceC1809a1 = this.f21080o;
                            String str5 = ((Number) interfaceC1809a1.getValue()).intValue() != 1 ? "仅接收满足条件" : "拒收/忽略";
                            ArrayList arrayListM9699w63 = AbstractC4955ho.m9699w6(new C3958e("拒收/忽略", 0), new C3958e("仅接收满足条件", 1));
                            int iIntValue7 = ((Number) interfaceC1809a1.getValue()).intValue();
                            zM4538h = c1836h02.m4538h(sharedPreferences);
                            objM4514P2 = c1836h02.m4514P();
                            if (!zM4538h || objM4514P2 == c1823e2) {
                                objM4514P2 = new C5108me(sharedPreferences, interfaceC1809a1, 10);
                                c1836h02.m4545k0(objM4514P2);
                            }
                            AbstractC4955ho.m9361J2("命中后动作", str5, arrayListM9699w63, iIntValue7, (InterfaceC1231l) objM4514P2, false, c1836h02, 6);
                            c1836h02.m4553p(false);
                        }
                        objM4514P6 = new C5108me(sharedPreferences, interfaceC1809a16, 9);
                        c1836h02.m4545k0(objM4514P6);
                        num = 2;
                        c1823e2 = c1823e3;
                        AbstractC4955ho.m9361J2("金额条件", str3, arrayListM9699w62, iIntValue6, (InterfaceC1231l) objM4514P6, false, c1836h02, 6);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a172 = this.f21079n;
                        String str42 = (String) interfaceC1809a172.getValue();
                        objM4514P = c1836h02.m4514P();
                        if (objM4514P == c1823e2) {
                        }
                        AbstractC4955ho.m9304C1("金额数值", "单位元，例如 10.5", str42, 0, (InterfaceC1231l) objM4514P, c1836h02, 24630, 8);
                        c1836h02 = c1836h02;
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        interfaceC1809a1 = this.f21080o;
                        if (((Number) interfaceC1809a1.getValue()).intValue() != 1) {
                        }
                        ArrayList arrayListM9699w632 = AbstractC4955ho.m9699w6(new C3958e("拒收/忽略", 0), new C3958e("仅接收满足条件", 1));
                        int iIntValue72 = ((Number) interfaceC1809a1.getValue()).intValue();
                        zM4538h = c1836h02.m4538h(sharedPreferences);
                        objM4514P2 = c1836h02.m4514P();
                        if (!zM4538h) {
                            objM4514P2 = new C5108me(sharedPreferences, interfaceC1809a1, 10);
                            c1836h02.m4545k0(objM4514P2);
                            AbstractC4955ho.m9361J2("命中后动作", str5, arrayListM9699w632, iIntValue72, (InterfaceC1231l) objM4514P2, false, c1836h02, 6);
                            c1836h02.m4553p(false);
                        }
                    } else {
                        num = 2;
                        c1823e2 = c1823e5;
                        c1836h02.m4525a0(1777427061);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a18 = this.f21081p;
                    int iIntValue8 = ((Number) interfaceC1809a18.getValue()).intValue();
                    String str6 = iIntValue8 != 1 ? iIntValue8 != 2 ? "不启用" : "包含则拒收" : "必须包含关键词";
                    ArrayList arrayListM9699w64 = AbstractC4955ho.m9699w6(new C3958e("不启用", 0), new C3958e("必须包含关键词", 1), new C3958e("包含则拒收", num));
                    int iIntValue9 = ((Number) interfaceC1809a18.getValue()).intValue();
                    boolean zM4538h5 = c1836h02.m4538h(sharedPreferences);
                    Object objM4514P7 = c1836h02.m4514P();
                    if (zM4538h5 || objM4514P7 == c1823e2) {
                        objM4514P7 = new C5108me(sharedPreferences, interfaceC1809a18, 11);
                        c1836h02.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9361J2("关键词规则", str6, arrayListM9699w64, iIntValue9, (InterfaceC1231l) objM4514P7, false, c1836h02, 6);
                    if (((Number) interfaceC1809a18.getValue()).intValue() != 0) {
                        c1836h02.m4525a0(1777790040);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a19 = this.f21082q;
                        String str7 = (String) interfaceC1809a19.getValue();
                        Object objM4514P8 = c1836h02.m4514P();
                        if (objM4514P8 == c1823e2) {
                            objM4514P8 = new C5535ze(interfaceC1809a19, 5);
                            c1836h02.m4545k0(objM4514P8);
                        }
                        C1836h0 c1836h03 = c1836h02;
                        AbstractC4955ho.m9304C1("关键词", "多个关键词用 |、逗号或换行分隔", str7, 2, (InterfaceC1231l) objM4514P8, c1836h03, 27702, 0);
                        c1836h02 = c1836h03;
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1777940917);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a110 = this.f21083r;
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a110.getValue()).booleanValue();
                    Object objM4514P9 = c1836h02.m4514P();
                    if (objM4514P9 == c1823e2) {
                        objM4514P9 = new C5535ze(interfaceC1809a110, 6);
                        c1836h02.m4545k0(objM4514P9);
                    }
                    C1836h0 c1836h04 = c1836h02;
                    AbstractC4955ho.m9410P3(zBooleanValue2, "禁收时段", "指定时段内不自动收款", false, (InterfaceC1231l) objM4514P9, c1836h04, 25008, 8);
                    if (((Boolean) interfaceC1809a110.getValue()).booleanValue()) {
                        c1836h04.m4525a0(1778132900);
                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                        InterfaceC1809a1 interfaceC1809a111 = this.f21084s;
                        String str8 = (String) interfaceC1809a111.getValue();
                        Object objM4514P10 = c1836h04.m4514P();
                        if (objM4514P10 == c1823e2) {
                            objM4514P10 = new C5535ze(interfaceC1809a111, 7);
                            c1836h04.m4545k0(objM4514P10);
                        }
                        AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P10, c1836h04, "开始时间", str8, false);
                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                        InterfaceC1809a1 interfaceC1809a112 = this.f21085t;
                        String str9 = (String) interfaceC1809a112.getValue();
                        Object objM4514P11 = c1836h04.m4514P();
                        if (objM4514P11 == c1823e2) {
                            objM4514P11 = new C5535ze(interfaceC1809a112, 3);
                            c1836h04.m4545k0(objM4514P11);
                        }
                        AbstractC4955ho.m9474X3(3078, 4, (InterfaceC1231l) objM4514P11, c1836h04, "结束时间", str9, false);
                        c1836h04.m4553p(false);
                    } else {
                        c1836h04.m4525a0(1778364501);
                        c1836h04.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f21086u;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a114 = this.f21073h;
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                    Object objM4514P12 = c1836h05.m4514P();
                    C1823e c1823e6 = C1851l.f6155a;
                    if (objM4514P12 == c1823e6) {
                        objM4514P12 = new C4980ih(interfaceC1809a114, 8);
                        c1836h05.m4545k0(objM4514P12);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, "应用震动", "批量修改震动状态", false, (InterfaceC1231l) objM4514P12, c1836h05, 25008, 8);
                    if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                        c1836h05.m4525a0(-240955649);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a115 = this.f21074i;
                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a115.getValue()).booleanValue();
                        Object objM4514P13 = c1836h05.m4514P();
                        if (objM4514P13 == c1823e6) {
                            objM4514P13 = new C4980ih(interfaceC1809a115, 13);
                            c1836h05.m4545k0(objM4514P13);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue4, "震动", "通知时震动", false, (InterfaceC1231l) objM4514P13, c1836h05, 25008, 8);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-240823992);
                        c1836h05.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a116 = this.f21075j;
                    boolean zBooleanValue5 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                    Object objM4514P14 = c1836h05.m4514P();
                    if (objM4514P14 == c1823e6) {
                        objM4514P14 = new C4980ih(interfaceC1809a116, 14);
                        c1836h05.m4545k0(objM4514P14);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue5, "应用铃声", "批量修改铃声状态，不修改每个会话已选铃声文件", false, (InterfaceC1231l) objM4514P14, c1836h05, 25008, 8);
                    if (((Boolean) interfaceC1809a116.getValue()).booleanValue()) {
                        c1836h05.m4525a0(-240653151);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a117 = this.f21076k;
                        boolean zBooleanValue6 = ((Boolean) interfaceC1809a117.getValue()).booleanValue();
                        Object objM4514P15 = c1836h05.m4514P();
                        if (objM4514P15 == c1823e6) {
                            objM4514P15 = new C4980ih(interfaceC1809a117, 15);
                            c1836h05.m4545k0(objM4514P15);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue6, "铃声", "通知时播放铃声", false, (InterfaceC1231l) objM4514P15, c1836h05, 25008, 8);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-240523416);
                        c1836h05.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a118 = this.f21077l;
                    boolean zBooleanValue7 = ((Boolean) interfaceC1809a118.getValue()).booleanValue();
                    Object objM4514P16 = c1836h05.m4514P();
                    if (objM4514P16 == c1823e6) {
                        objM4514P16 = new C4980ih(interfaceC1809a118, 16);
                        c1836h05.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue7, "应用已读按钮", "批量修改通知栏已读按钮", false, (InterfaceC1231l) objM4514P16, c1836h05, 25008, 8);
                    if (((Boolean) interfaceC1809a118.getValue()).booleanValue()) {
                        c1836h05.m4525a0(-240352141);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a119 = this.f21078m;
                        boolean zBooleanValue8 = ((Boolean) interfaceC1809a119.getValue()).booleanValue();
                        Object objM4514P17 = c1836h05.m4514P();
                        if (objM4514P17 == c1823e6) {
                            objM4514P17 = new C4980ih(interfaceC1809a119, 17);
                            c1836h05.m4545k0(objM4514P17);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue8, "已读按钮", "通知栏直接标记当前会话已读", false, (InterfaceC1231l) objM4514P17, c1836h05, 25008, 8);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-240208952);
                        c1836h05.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a120 = this.f21079n;
                    boolean zBooleanValue9 = ((Boolean) interfaceC1809a120.getValue()).booleanValue();
                    Object objM4514P18 = c1836h05.m4514P();
                    if (objM4514P18 == c1823e6) {
                        objM4514P18 = new C4980ih(interfaceC1809a120, 18);
                        c1836h05.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue9, "应用快捷回复", "批量修改通知栏快捷回复", false, (InterfaceC1231l) objM4514P18, c1836h05, 25008, 8);
                    if (((Boolean) interfaceC1809a120.getValue()).booleanValue()) {
                        c1836h05.m4525a0(-240031663);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a121 = this.f21080o;
                        boolean zBooleanValue10 = ((Boolean) interfaceC1809a121.getValue()).booleanValue();
                        Object objM4514P19 = c1836h05.m4514P();
                        if (objM4514P19 == c1823e6) {
                            objM4514P19 = new C4980ih(interfaceC1809a121, 19);
                            c1836h05.m4545k0(objM4514P19);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue10, "快捷回复", "通知栏直接回复文本消息", false, (InterfaceC1231l) objM4514P19, c1836h05, 25008, 8);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-239886552);
                        c1836h05.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a122 = this.f21081p;
                    boolean zBooleanValue11 = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                    Object objM4514P20 = c1836h05.m4514P();
                    if (objM4514P20 == c1823e6) {
                        objM4514P20 = new C4980ih(interfaceC1809a122, 20);
                        c1836h05.m4545k0(objM4514P20);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue11, "应用引用消息回复", "批量修改快捷回复是否引用原消息", false, (InterfaceC1231l) objM4514P20, c1836h05, 25008, 8);
                    if (((Boolean) interfaceC1809a122.getValue()).booleanValue()) {
                        c1836h05.m4525a0(-239642675);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a123 = this.f21082q;
                        boolean zBooleanValue12 = ((Boolean) interfaceC1809a123.getValue()).booleanValue();
                        Object objM4514P21 = c1836h05.m4514P();
                        if (objM4514P21 == c1823e6) {
                            objM4514P21 = new C4980ih(interfaceC1809a123, 21);
                            c1836h05.m4545k0(objM4514P21);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue12, "引用消息回复", "快捷回复时引用触发通知的原消息", false, (InterfaceC1231l) objM4514P21, c1836h05, 25008, 8);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-239432216);
                        c1836h05.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a124 = this.f21083r;
                    boolean zBooleanValue13 = ((Boolean) interfaceC1809a124.getValue()).booleanValue();
                    Object objM4514P22 = c1836h05.m4514P();
                    if (objM4514P22 == c1823e6) {
                        objM4514P22 = new C4980ih(interfaceC1809a124, 9);
                        c1836h05.m4545k0(objM4514P22);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue13, "应用通知展示方式", "批量设置同会话通知合并或分散", false, (InterfaceC1231l) objM4514P22, c1836h05, 25008, 8);
                    if (((Boolean) interfaceC1809a124.getValue()).booleanValue()) {
                        c1836h05.m4525a0(-239240512);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        InterfaceC1809a1 interfaceC1809a125 = this.f21084s;
                        boolean zBooleanValue14 = ((Boolean) interfaceC1809a125.getValue()).booleanValue();
                        Object objM4514P23 = c1836h05.m4514P();
                        if (objM4514P23 == c1823e6) {
                            objM4514P23 = new C4980ih(interfaceC1809a125, 10);
                            c1836h05.m4545k0(objM4514P23);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue14, "合并同会话通知", "同一 wxid 的新消息更新到一条通知", false, (InterfaceC1231l) objM4514P23, c1836h05, 25008, 8);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-239079064);
                        c1836h05.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a126 = this.f21085t;
                    boolean zBooleanValue15 = ((Boolean) interfaceC1809a126.getValue()).booleanValue();
                    Object objM4514P24 = c1836h05.m4514P();
                    if (objM4514P24 == c1823e6) {
                        objM4514P24 = new C4980ih(interfaceC1809a126, 11);
                        c1836h05.m4545k0(objM4514P24);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue15, "应用消息详情", "批量修改通知内容是否显示详情", false, (InterfaceC1231l) objM4514P24, c1836h05, 25008, 8);
                    if (((Boolean) interfaceC1809a126.getValue()).booleanValue()) {
                        c1836h05.m4525a0(-238898675);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        boolean zBooleanValue16 = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                        Object objM4514P25 = c1836h05.m4514P();
                        if (objM4514P25 == c1823e6) {
                            objM4514P25 = new C4980ih(interfaceC1809a113, 12);
                            c1836h05.m4545k0(objM4514P25);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue16, "显示消息详情", "关闭后只显示收到一条新消息", false, (InterfaceC1231l) objM4514P25, c1836h05, 25008, 8);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-238749720);
                        c1836h05.m4553p(false);
                    }
                } else {
                    c1836h05.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5369ub(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f21073h = interfaceC1809a1;
        this.f21074i = interfaceC1809a12;
        this.f21075j = interfaceC1809a13;
        this.f21076k = interfaceC1809a14;
        this.f21077l = interfaceC1809a15;
        this.f21078m = interfaceC1809a16;
        this.f21079n = interfaceC1809a17;
        this.f21080o = interfaceC1809a18;
        this.f21081p = interfaceC1809a19;
        this.f21082q = interfaceC1809a110;
        this.f21083r = interfaceC1809a111;
        this.f21084s = interfaceC1809a112;
        this.f21085t = interfaceC1809a113;
        this.f21086u = interfaceC1809a114;
    }
}
