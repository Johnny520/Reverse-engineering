package p332wb;

import p036c9.C0475p0;
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

/* JADX INFO: renamed from: wb.jc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5007jc implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18091g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f18092h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18093i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18094j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18095k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f18096l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18097m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5007jc(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, int i9) {
        this.f18091g = i9;
        this.f18092h = interfaceC1809a1;
        this.f18093i = interfaceC1809a12;
        this.f18094j = interfaceC1809a13;
        this.f18095k = interfaceC1809a14;
        this.f18096l = interfaceC1809a15;
        this.f18097m = interfaceC1809a16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f18091g;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((C3619d) obj).getClass();
        int i10 = iIntValue & 17;
        switch (i9) {
            case 0:
                if (c1836h0.m4516S(iIntValue & 1, i10 != 16)) {
                    final int i11 = 1;
                    final InterfaceC1809a1 interfaceC1809a1 = this.f18092h;
                    final InterfaceC1809a1 interfaceC1809a12 = this.f18093i;
                    final InterfaceC1809a1 interfaceC1809a13 = this.f18094j;
                    final InterfaceC1809a1 interfaceC1809a14 = this.f18095k;
                    final InterfaceC1809a1 interfaceC1809a15 = this.f18096l;
                    final InterfaceC1809a1 interfaceC1809a16 = this.f18097m;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1761065436, new InterfaceC1235p() { // from class: wb.te
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i11) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        Object objM4514P = c1836h02.m4514P();
                                        if (objM4514P == C1851l.f6155a) {
                                            C0475p0 c0475p0 = new C0475p0(interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, 7);
                                            c1836h02.m4545k0(c0475p0);
                                            objM4514P = c0475p0;
                                        }
                                        AbstractC4955ho.m9503b("恢复默认外观", "恢复按钮和菜单名称的默认外观", (InterfaceC1220a) objM4514P, c1836h02, 438);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a1;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                                        Object objM4514P2 = c1836h03.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C5341tg(interfaceC1809a17, 26);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "应用启用状态", "批量开关会话规则", false, (InterfaceC1231l) objM4514P2, c1836h03, 25008, 8);
                                        if (((Boolean) interfaceC1809a17.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(875014771);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a12;
                                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a18.getValue()).booleanValue();
                                            Object objM4514P3 = c1836h03.m4514P();
                                            if (objM4514P3 == c1823e) {
                                                objM4514P3 = new C5341tg(interfaceC1809a18, 27);
                                                c1836h03.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue2, "启用规则", "关闭后不再接管对应会话通知", false, (InterfaceC1231l) objM4514P3, c1836h03, 25008, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(875156038);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a13;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a19.getValue()).booleanValue();
                                        Object objM4514P4 = c1836h03.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C5341tg(interfaceC1809a19, 28);
                                            c1836h03.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "应用免打扰", "批量设置是否弹自定义通知", false, (InterfaceC1231l) objM4514P4, c1836h03, 25008, 8);
                                        if (((Boolean) interfaceC1809a19.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(875315223);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a14;
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a110.getValue()).booleanValue();
                                            Object objM4514P5 = c1836h03.m4514P();
                                            if (objM4514P5 == c1823e) {
                                                objM4514P5 = new C5341tg(interfaceC1809a110, 29);
                                                c1836h03.m4545k0(objM4514P5);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue4, "免打扰", "开启后不弹自定义通知，只拦截原生通知", false, (InterfaceC1231l) objM4514P5, c1836h03, 25008, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(875452646);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a15;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                                        Object objM4514P6 = c1836h03.m4514P();
                                        if (objM4514P6 == c1823e) {
                                            objM4514P6 = new C4980ih(interfaceC1809a111, 0);
                                            c1836h03.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "应用微信免打扰策略", "批量设置是否忽略微信原生会话免打扰", false, (InterfaceC1231l) objM4514P6, c1836h03, 25008, 8);
                                        if (((Boolean) interfaceC1809a111.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(875701824);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a16;
                                            boolean zBooleanValue6 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e) {
                                                objM4514P7 = new C4980ih(interfaceC1809a112, 1);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue6, "忽略微信自带的消息免打扰", "开启后，对应会话在微信中设置免打扰仍会弹出自定义通知", false, (InterfaceC1231l) objM4514P7, c1836h03, 25008, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(875984358);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
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
                    final InterfaceC1809a1 interfaceC1809a17 = this.f18092h;
                    final InterfaceC1809a1 interfaceC1809a18 = this.f18093i;
                    final InterfaceC1809a1 interfaceC1809a19 = this.f18094j;
                    final InterfaceC1809a1 interfaceC1809a110 = this.f18095k;
                    final InterfaceC1809a1 interfaceC1809a111 = this.f18096l;
                    final InterfaceC1809a1 interfaceC1809a112 = this.f18097m;
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-499035752, new InterfaceC1235p() { // from class: wb.te
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i12) {
                                case 0:
                                    C1836h0 c1836h02 = (C1836h0) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        Object objM4514P = c1836h02.m4514P();
                                        if (objM4514P == C1851l.f6155a) {
                                            C0475p0 c0475p0 = new C0475p0(interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112, 7);
                                            c1836h02.m4545k0(c0475p0);
                                            objM4514P = c0475p0;
                                        }
                                        AbstractC4955ho.m9503b("恢复默认外观", "恢复按钮和菜单名称的默认外观", (InterfaceC1220a) objM4514P, c1836h02, 438);
                                    } else {
                                        c1836h02.m4519V();
                                    }
                                    break;
                                default:
                                    C1836h0 c1836h03 = (C1836h0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a17;
                                        boolean zBooleanValue = ((Boolean) interfaceC1809a172.getValue()).booleanValue();
                                        Object objM4514P2 = c1836h03.m4514P();
                                        C1823e c1823e = C1851l.f6155a;
                                        if (objM4514P2 == c1823e) {
                                            objM4514P2 = new C5341tg(interfaceC1809a172, 26);
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue, "应用启用状态", "批量开关会话规则", false, (InterfaceC1231l) objM4514P2, c1836h03, 25008, 8);
                                        if (((Boolean) interfaceC1809a172.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(875014771);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a18;
                                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a182.getValue()).booleanValue();
                                            Object objM4514P3 = c1836h03.m4514P();
                                            if (objM4514P3 == c1823e) {
                                                objM4514P3 = new C5341tg(interfaceC1809a182, 27);
                                                c1836h03.m4545k0(objM4514P3);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue2, "启用规则", "关闭后不再接管对应会话通知", false, (InterfaceC1231l) objM4514P3, c1836h03, 25008, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(875156038);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a19;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a192.getValue()).booleanValue();
                                        Object objM4514P4 = c1836h03.m4514P();
                                        if (objM4514P4 == c1823e) {
                                            objM4514P4 = new C5341tg(interfaceC1809a192, 28);
                                            c1836h03.m4545k0(objM4514P4);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue3, "应用免打扰", "批量设置是否弹自定义通知", false, (InterfaceC1231l) objM4514P4, c1836h03, 25008, 8);
                                        if (((Boolean) interfaceC1809a192.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(875315223);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a110;
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a1102.getValue()).booleanValue();
                                            Object objM4514P5 = c1836h03.m4514P();
                                            if (objM4514P5 == c1823e) {
                                                objM4514P5 = new C5341tg(interfaceC1809a1102, 29);
                                                c1836h03.m4545k0(objM4514P5);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue4, "免打扰", "开启后不弹自定义通知，只拦截原生通知", false, (InterfaceC1231l) objM4514P5, c1836h03, 25008, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(875452646);
                                            c1836h03.m4553p(false);
                                        }
                                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                        InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a111;
                                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a1112.getValue()).booleanValue();
                                        Object objM4514P6 = c1836h03.m4514P();
                                        if (objM4514P6 == c1823e) {
                                            objM4514P6 = new C4980ih(interfaceC1809a1112, 0);
                                            c1836h03.m4545k0(objM4514P6);
                                        }
                                        AbstractC4955ho.m9410P3(zBooleanValue5, "应用微信免打扰策略", "批量设置是否忽略微信原生会话免打扰", false, (InterfaceC1231l) objM4514P6, c1836h03, 25008, 8);
                                        if (((Boolean) interfaceC1809a1112.getValue()).booleanValue()) {
                                            c1836h03.m4525a0(875701824);
                                            AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                                            InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a112;
                                            boolean zBooleanValue6 = ((Boolean) interfaceC1809a1122.getValue()).booleanValue();
                                            Object objM4514P7 = c1836h03.m4514P();
                                            if (objM4514P7 == c1823e) {
                                                objM4514P7 = new C4980ih(interfaceC1809a1122, 1);
                                                c1836h03.m4545k0(objM4514P7);
                                            }
                                            AbstractC4955ho.m9410P3(zBooleanValue6, "忽略微信自带的消息免打扰", "开启后，对应会话在微信中设置免打扰仍会弹出自定义通知", false, (InterfaceC1231l) objM4514P7, c1836h03, 25008, 8);
                                            c1836h03.m4553p(false);
                                        } else {
                                            c1836h03.m4525a0(875984358);
                                            c1836h03.m4553p(false);
                                        }
                                    } else {
                                        c1836h03.m4519V();
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
