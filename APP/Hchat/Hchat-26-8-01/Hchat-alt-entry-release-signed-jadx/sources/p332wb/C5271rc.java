package p332wb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.rc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5271rc implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20397g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f20398h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f20399i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20400j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20401k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20402l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20403m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20404n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5271rc(SharedPreferences sharedPreferences, List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f20398h = sharedPreferences;
        this.f20399i = list;
        this.f20400j = interfaceC1809a1;
        this.f20401k = interfaceC1809a12;
        this.f20402l = interfaceC1809a13;
        this.f20403m = interfaceC1809a14;
        this.f20404n = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20397g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f20400j;
                    String str = (String) interfaceC1809a1.getValue();
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (objM4514P == c1823e) {
                        objM4514P = new C5109mf(interfaceC1809a1, 12);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9353I2("收款位置", "使用微信当前账号提供的收款账户", this.f20399i, str, (InterfaceC1231l) objM4514P, false, c1836h0, 24630, 32);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    AbstractC4955ho.m9402O3(this.f20398h, "transfer_refund_rejected", "拒收时退回", "规则不通过时原路退回", false, c1836h0, 28080);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    InterfaceC1809a1 interfaceC1809a12 = this.f20401k;
                    int iIntValue2 = ((Number) interfaceC1809a12.getValue()).intValue();
                    String str2 = iIntValue2 != 1 ? iIntValue2 != 2 ? "无延迟" : "自定义延迟" : "随机延迟";
                    ArrayList arrayListM9333F6 = AbstractC4955ho.m9333F6();
                    int iIntValue3 = ((Number) interfaceC1809a12.getValue()).intValue();
                    Object objM4514P2 = c1836h0.m4514P();
                    if (objM4514P2 == c1823e) {
                        objM4514P2 = new C5109mf(interfaceC1809a12, 13);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9361J2("收款延迟", str2, arrayListM9333F6, iIntValue3, (InterfaceC1231l) objM4514P2, false, c1836h0, 24582);
                    if (((Number) interfaceC1809a12.getValue()).intValue() == 2) {
                        c1836h0.m4525a0(-1601584279);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a13 = this.f20402l;
                        String str3 = (String) interfaceC1809a13.getValue();
                        Object objM4514P3 = c1836h0.m4514P();
                        if (objM4514P3 == c1823e) {
                            objM4514P3 = new C5109mf(interfaceC1809a13, 14);
                            c1836h0.m4545k0(objM4514P3);
                        }
                        AbstractC4955ho.m9695w2("自定义延迟", "单位 ms", str3, (InterfaceC1231l) objM4514P3, c1836h0, 3126);
                        c1836h0.m4553p(false);
                    } else if (((Number) interfaceC1809a12.getValue()).intValue() == 1) {
                        c1836h0.m4525a0(-1601388080);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a14 = this.f20403m;
                        String str4 = (String) interfaceC1809a14.getValue();
                        Object objM4514P4 = c1836h0.m4514P();
                        if (objM4514P4 == c1823e) {
                            objM4514P4 = new C5109mf(interfaceC1809a14, 15);
                            c1836h0.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9695w2("最小延迟", "单位 ms", str4, (InterfaceC1231l) objM4514P4, c1836h0, 3126);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a15 = this.f20404n;
                        String str5 = (String) interfaceC1809a15.getValue();
                        Object objM4514P5 = c1836h0.m4514P();
                        if (objM4514P5 == c1823e) {
                            objM4514P5 = new C5109mf(interfaceC1809a15, 16);
                            c1836h0.m4545k0(objM4514P5);
                        }
                        AbstractC4955ho.m9695w2("最大延迟", "单位 ms", str5, (InterfaceC1231l) objM4514P5, c1836h0, 3126);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1601139181);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a16 = this.f20400j;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                    SharedPreferences sharedPreferences = this.f20398h;
                    boolean zM4538h = c1836h02.m4538h(sharedPreferences);
                    Object objM4514P6 = c1836h02.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4538h || objM4514P6 == c1823e2) {
                        objM4514P6 = new C5108me(sharedPreferences, interfaceC1809a16, 26);
                        c1836h02.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "包含关键词筛选", "开启后，正文需命中任意关键词才转发", false, (InterfaceC1231l) objM4514P6, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a16.getValue()).booleanValue()) {
                        c1836h02.m4525a0(1061595526);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a17 = this.f20401k;
                        String str6 = (String) interfaceC1809a17.getValue();
                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences);
                        Object objM4514P7 = c1836h02.m4514P();
                        if (zM4538h2 || objM4514P7 == c1823e2) {
                            objM4514P7 = new C5108me(sharedPreferences, interfaceC1809a17, 27);
                            c1836h02.m4545k0(objM4514P7);
                        }
                        AbstractC4955ho.m9304C1("包含关键词", "多个关键词用逗号或换行分隔", str6, 2, (InterfaceC1231l) objM4514P7, c1836h02, 3126, 0);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1062095246);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a18 = this.f20402l;
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                    boolean zM4538h3 = c1836h02.m4538h(sharedPreferences);
                    Object objM4514P8 = c1836h02.m4514P();
                    if (zM4538h3 || objM4514P8 == c1823e2) {
                        objM4514P8 = new C5108me(sharedPreferences, interfaceC1809a18, 28);
                        c1836h02.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "排除关键词筛选", "开启后，正文命中任意关键词时不转发，优先于包含规则", false, (InterfaceC1231l) objM4514P8, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a18.getValue()).booleanValue()) {
                        c1836h02.m4525a0(1062673830);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a19 = this.f20403m;
                        String str7 = (String) interfaceC1809a19.getValue();
                        boolean zM4538h4 = c1836h02.m4538h(sharedPreferences);
                        Object objM4514P9 = c1836h02.m4514P();
                        if (zM4538h4 || objM4514P9 == c1823e2) {
                            objM4514P9 = new C5108me(sharedPreferences, interfaceC1809a19, 29);
                            c1836h02.m4545k0(objM4514P9);
                        }
                        AbstractC4955ho.m9304C1("排除关键词", "多个关键词用逗号或换行分隔", str7, 2, (InterfaceC1231l) objM4514P9, c1836h02, 3126, 0);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1063173550);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a110 = this.f20404n;
                    String str8 = (String) interfaceC1809a110.getValue();
                    boolean zM4538h5 = c1836h02.m4538h(sharedPreferences);
                    Object objM4514P10 = c1836h02.m4514P();
                    if (zM4538h5 || objM4514P10 == c1823e2) {
                        objM4514P10 = new C5242qg(sharedPreferences, interfaceC1809a110, 0);
                        c1836h02.m4545k0(objM4514P10);
                    }
                    AbstractC4955ho.m9571i4("文案模板", "支持下方变量", str8, this.f20399i, 3, (InterfaceC1231l) objM4514P10, c1836h02, 24630, 0);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5271rc(List list, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15) {
        this.f20399i = list;
        this.f20398h = sharedPreferences;
        this.f20400j = interfaceC1809a1;
        this.f20401k = interfaceC1809a12;
        this.f20402l = interfaceC1809a13;
        this.f20403m = interfaceC1809a14;
        this.f20404n = interfaceC1809a15;
    }
}
