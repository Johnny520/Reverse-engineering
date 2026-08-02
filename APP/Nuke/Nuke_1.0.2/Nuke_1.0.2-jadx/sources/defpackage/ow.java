package defpackage;

import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ow implements nn0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ci0.<clinit>():void, gf1.<clinit>():void, op0.<clinit>():void, p40.<clinit>():void, pp0.<clinit>():void, qp0.<clinit>():void, s11.<clinit>():void, sp0.<clinit>():void, t11.<clinit>():void, tp0.<clinit>():void] */
    public /* synthetic */ ow(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        ce0 ce0Var = ce0.h;
        rh1 rh1Var = rh1.a;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                m00 m00Var = (m00) obj;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) pxVar).f(m00Var) ? 4 : 2;
                }
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    go0Var.R();
                } else {
                    dm.a(gf1.n(te.O(fg1.E(rh1Var, 0.0f, o00.g, 1).c(te.e), o00.f), m00Var.c, sp0.h), go0Var, 0);
                }
                break;
            case 1:
                pf1 pf1Var = (pf1) obj;
                int iT = pf1Var.T(10.0f);
                int i2 = iT * 2;
                sz1 sz1VarE = ((if1) obj2).e(gz.i(i2, 0, ((fz) obj3).a));
                break;
            case 2:
                pf1 pf1Var2 = (pf1) obj;
                int iT2 = pf1Var2.T(10.0f);
                int i3 = iT2 * 2;
                sz1 sz1VarE2 = ((if1) obj2).e(gz.i(0, i3, ((fz) obj3).a));
                break;
            case 3:
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.R();
                } else {
                    x32.a(te.g0(rh1Var, 28.0f), ((lp1) go0Var2.j(ur1.a)).g, 2.5f, 0L, 0, 0.0f, go0Var2, 390);
                    se.f(vi0.f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_model_list_loading, go0Var2), go0Var2, 0);
                }
                break;
            case 4:
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.R();
                } else {
                    se.f(rg3.P(R.string.ai_chat_model_list_empty, go0Var3), go0Var3, 0);
                }
                break;
            case 5:
                px pxVar4 = (px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var4 = (go0) pxVar4;
                if (!go0Var4.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    go0Var4.R();
                } else {
                    eu.n(null, rg3.P(R.string.home_settings_update_installed, go0Var4), ci0.g, go0Var4, 384, 1);
                }
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                px pxVar5 = (px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var5 = (go0) pxVar5;
                if (!go0Var5.O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    go0Var5.R();
                } else {
                    x32.a(te.g0(rh1Var, 28.0f), ((lp1) go0Var5.j(ur1.a)).g, 2.5f, 0L, 0, 0.0f, go0Var5, 390);
                    s11.e(vi0.f(rh1Var, 12.0f, go0Var5, R.string.auto_receive_redpacket_loading_contacts, go0Var5), go0Var5, 0);
                }
                break;
            case 7:
                px pxVar6 = (px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var6 = (go0) pxVar6;
                if (!go0Var6.O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    go0Var6.R();
                } else {
                    s11.e(rg3.P(R.string.auto_receive_redpacket_no_contacts, go0Var6), go0Var6, 0);
                }
                break;
            case 8:
                px pxVar7 = (px) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var7 = (go0) pxVar7;
                if (!go0Var7.O(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    go0Var7.R();
                } else {
                    x32.a(te.g0(rh1Var, 28.0f), ((lp1) go0Var7.j(ur1.a)).g, 2.5f, 0L, 0, 0.0f, go0Var7, 390);
                    t11.i(vi0.f(rh1Var, 12.0f, go0Var7, R.string.auto_receive_transfer_money_loading_contacts, go0Var7), go0Var7, 0);
                }
                break;
            case 9:
                px pxVar8 = (px) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var8 = (go0) pxVar8;
                if (!go0Var8.O(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    go0Var8.R();
                } else {
                    t11.i(rg3.P(R.string.auto_receive_transfer_money_no_contacts, go0Var8), go0Var8, 0);
                }
                break;
            case 10:
                px pxVar9 = (px) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var9 = (go0) pxVar9;
                if (!go0Var9.O(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    go0Var9.R();
                } else {
                    ci0.q(rg3.Q(R.string.home_settings_version_label, new Object[]{BuildConfig.VERSION_NAME}, go0Var9), null, go0Var9, 0);
                }
                break;
            case 11:
                px pxVar10 = (px) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var10 = (go0) pxVar10;
                if (!go0Var10.O(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    go0Var10.R();
                } else {
                    ci0.q(rg3.Q(R.string.home_settings_version_label, new Object[]{BuildConfig.VERSION_NAME}, go0Var10), null, go0Var10, 0);
                }
                break;
            case 12:
                px pxVar11 = (px) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var11 = (go0) pxVar11;
                if (!go0Var11.O(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    go0Var11.R();
                } else {
                    s11.g(0, go0Var11);
                }
                break;
            case 13:
                px pxVar12 = (px) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var12 = (go0) pxVar12;
                if (!go0Var12.O(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    go0Var12.R();
                } else {
                    ci0.g(null, rg3.P(R.string.home_settings_hooker_debug_empty_title, go0Var12), rg3.P(R.string.home_settings_hooker_debug_empty_message, go0Var12), go0Var12, 0, 1);
                }
                break;
            case 14:
                px pxVar13 = (px) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                go0 go0Var13 = (go0) pxVar13;
                if (!go0Var13.O(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    go0Var13.R();
                }
                break;
            case 15:
                px pxVar14 = (px) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var14 = (go0) pxVar14;
                if (!go0Var14.O(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    go0Var14.R();
                } else {
                    ci0.g(null, rg3.P(R.string.script_settings_loading, go0Var14), rg3.P(R.string.script_settings_wait, go0Var14), go0Var14, 0, 1);
                }
                break;
            case 16:
                px pxVar15 = (px) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var15 = (go0) pxVar15;
                if (!go0Var15.O(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    go0Var15.R();
                } else {
                    x32.a(te.g0(rh1Var, 28.0f), ((lp1) go0Var15.j(ur1.a)).g, 2.5f, 0L, 0, 0.0f, go0Var15, 390);
                    se.l(vi0.f(rh1Var, 12.0f, go0Var15, R.string.wechat_contact_selector_loading_contacts, go0Var15), go0Var15, 0);
                }
                break;
            default:
                px pxVar16 = (px) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var16 = (go0) pxVar16;
                if (!go0Var16.O(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    go0Var16.R();
                } else {
                    se.l(rg3.P(R.string.wechat_contact_selector_no_contacts, go0Var16), go0Var16, 0);
                }
                break;
        }
        return a83Var;
    }
}
