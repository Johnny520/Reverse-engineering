package p000;

import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: ow */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0558ow implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7860h;

    public /* synthetic */ C0558ow(int i) {
        this.f7860h = i;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i = this.f7860h;
        ce0 ce0Var = ce0.f1492h;
        rh1 rh1Var = rh1.f9587a;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                m00 m00Var = (m00) obj;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) interfaceC0596px).m1980f(m00Var) ? 4 : 2;
                }
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    go0Var.m1961R();
                } else {
                    AbstractC0135dm.m1057a(gf1.m1896n(AbstractC0731te.m5186O(fg1.m1613E(rh1Var, 0.0f, o00.f7394g, 1).mo4491c(AbstractC0731te.f10693e), o00.f7393f), m00Var.f6421c, sp0.f10267h), go0Var, 0);
                }
                break;
            case 1:
                pf1 pf1Var = (pf1) obj;
                int iMo692T = pf1Var.mo692T(10.0f);
                int i2 = iMo692T * 2;
                sz1 sz1VarMo2340e = ((if1) obj2).mo2340e(AbstractC0258gz.m2035i(i2, 0, ((C0221fz) obj3).f3199a));
                break;
            case 2:
                pf1 pf1Var2 = (pf1) obj;
                int iMo692T2 = pf1Var2.mo692T(10.0f);
                int i3 = iMo692T2 * 2;
                sz1 sz1VarMo2340e2 = ((if1) obj2).mo2340e(AbstractC0258gz.m2035i(0, i3, ((C0221fz) obj3).f3199a));
                break;
            case 3:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.m1961R();
                } else {
                    x32.m6030a(AbstractC0731te.m5211g0(rh1Var, 28.0f), ((lp1) go0Var2.m1988j(ur1.f11452a)).f6239g, 2.5f, 0L, 0, 0.0f, go0Var2, 390);
                    AbstractC0691se.m4835f(vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_model_list_loading, go0Var2), go0Var2, 0);
                }
                break;
            case 4:
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.m1961R();
                } else {
                    AbstractC0691se.m4835f(rg3.m4462P(R.string.ai_chat_model_list_empty, go0Var3), go0Var3, 0);
                }
                break;
            case 5:
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (!go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    go0Var4.m1961R();
                } else {
                    AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_update_installed, go0Var4), ci0.f1551g, go0Var4, 384, 1);
                }
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var5 = (go0) interfaceC0596px5;
                if (!go0Var5.m1958O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    go0Var5.m1961R();
                } else {
                    x32.m6030a(AbstractC0731te.m5211g0(rh1Var, 28.0f), ((lp1) go0Var5.m1988j(ur1.f11452a)).f6239g, 2.5f, 0L, 0, 0.0f, go0Var5, 390);
                    s11.m4690e(vi0.m5687f(rh1Var, 12.0f, go0Var5, R.string.auto_receive_redpacket_loading_contacts, go0Var5), go0Var5, 0);
                }
                break;
            case 7:
                InterfaceC0596px interfaceC0596px6 = (InterfaceC0596px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var6 = (go0) interfaceC0596px6;
                if (!go0Var6.m1958O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    go0Var6.m1961R();
                } else {
                    s11.m4690e(rg3.m4462P(R.string.auto_receive_redpacket_no_contacts, go0Var6), go0Var6, 0);
                }
                break;
            case 8:
                InterfaceC0596px interfaceC0596px7 = (InterfaceC0596px) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var7 = (go0) interfaceC0596px7;
                if (!go0Var7.m1958O(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    go0Var7.m1961R();
                } else {
                    x32.m6030a(AbstractC0731te.m5211g0(rh1Var, 28.0f), ((lp1) go0Var7.m1988j(ur1.f11452a)).f6239g, 2.5f, 0L, 0, 0.0f, go0Var7, 390);
                    t11.m5083i(vi0.m5687f(rh1Var, 12.0f, go0Var7, R.string.auto_receive_transfer_money_loading_contacts, go0Var7), go0Var7, 0);
                }
                break;
            case 9:
                InterfaceC0596px interfaceC0596px8 = (InterfaceC0596px) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var8 = (go0) interfaceC0596px8;
                if (!go0Var8.m1958O(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    go0Var8.m1961R();
                } else {
                    t11.m5083i(rg3.m4462P(R.string.auto_receive_transfer_money_no_contacts, go0Var8), go0Var8, 0);
                }
                break;
            case 10:
                InterfaceC0596px interfaceC0596px9 = (InterfaceC0596px) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var9 = (go0) interfaceC0596px9;
                if (!go0Var9.m1958O(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    go0Var9.m1961R();
                } else {
                    ci0.m816q(rg3.m4463Q(R.string.home_settings_version_label, new Object[]{BuildConfig.VERSION_NAME}, go0Var9), null, go0Var9, 0);
                }
                break;
            case 11:
                InterfaceC0596px interfaceC0596px10 = (InterfaceC0596px) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var10 = (go0) interfaceC0596px10;
                if (!go0Var10.m1958O(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    go0Var10.m1961R();
                } else {
                    ci0.m816q(rg3.m4463Q(R.string.home_settings_version_label, new Object[]{BuildConfig.VERSION_NAME}, go0Var10), null, go0Var10, 0);
                }
                break;
            case 12:
                InterfaceC0596px interfaceC0596px11 = (InterfaceC0596px) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var11 = (go0) interfaceC0596px11;
                if (!go0Var11.m1958O(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    go0Var11.m1961R();
                } else {
                    s11.m4694g(0, go0Var11);
                }
                break;
            case 13:
                InterfaceC0596px interfaceC0596px12 = (InterfaceC0596px) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var12 = (go0) interfaceC0596px12;
                if (!go0Var12.m1958O(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    go0Var12.m1961R();
                } else {
                    ci0.m806g(null, rg3.m4462P(R.string.home_settings_hooker_debug_empty_title, go0Var12), rg3.m4462P(R.string.home_settings_hooker_debug_empty_message, go0Var12), go0Var12, 0, 1);
                }
                break;
            case 14:
                InterfaceC0596px interfaceC0596px13 = (InterfaceC0596px) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                go0 go0Var13 = (go0) interfaceC0596px13;
                if (!go0Var13.m1958O(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    go0Var13.m1961R();
                }
                break;
            case 15:
                InterfaceC0596px interfaceC0596px14 = (InterfaceC0596px) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var14 = (go0) interfaceC0596px14;
                if (!go0Var14.m1958O(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    go0Var14.m1961R();
                } else {
                    ci0.m806g(null, rg3.m4462P(R.string.script_settings_loading, go0Var14), rg3.m4462P(R.string.script_settings_wait, go0Var14), go0Var14, 0, 1);
                }
                break;
            case 16:
                InterfaceC0596px interfaceC0596px15 = (InterfaceC0596px) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var15 = (go0) interfaceC0596px15;
                if (!go0Var15.m1958O(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    go0Var15.m1961R();
                } else {
                    x32.m6030a(AbstractC0731te.m5211g0(rh1Var, 28.0f), ((lp1) go0Var15.m1988j(ur1.f11452a)).f6239g, 2.5f, 0L, 0, 0.0f, go0Var15, 390);
                    AbstractC0691se.m4841l(vi0.m5687f(rh1Var, 12.0f, go0Var15, R.string.wechat_contact_selector_loading_contacts, go0Var15), go0Var15, 0);
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px16 = (InterfaceC0596px) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var16 = (go0) interfaceC0596px16;
                if (!go0Var16.m1958O(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    go0Var16.m1961R();
                } else {
                    AbstractC0691se.m4841l(rg3.m4462P(R.string.wechat_contact_selector_no_contacts, go0Var16), go0Var16, 0);
                }
                break;
        }
        return a83Var;
    }
}
