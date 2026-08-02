package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ x(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.h;
        int i2 = 3;
        int i3 = 4;
        eb ebVar = nx.a;
        a83 a83Var = a83.a;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                AIChatConfig aIChatConfig = (AIChatConfig) obj5;
                xm0 xm0Var = (xm0) obj4;
                xm0 xm0Var2 = (xm0) obj;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xm0Var2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) pxVar).h(xm0Var2) ? 4 : 2;
                }
                go0 go0Var = (go0) pxVar;
                if (go0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int i4 = (go0Var.f(xm0Var) ? 1 : 0) | ((iIntValue & 14) != 4 ? 0 : 1);
                    Object objL = go0Var.L();
                    if (i4 != 0 || objL == ebVar) {
                        objL = new z(xm0Var, xm0Var2, i);
                        go0Var.f0(objL);
                    }
                    se.a(aIChatConfig, xm0Var2, (in0) objL, go0Var, ((iIntValue << 3) & 112) | AIChatConfig.$stable);
                } else {
                    go0Var.R();
                }
                return a83Var;
            case 1:
                k1 k1Var = (k1) obj5;
                kx1 kx1Var = (kx1) obj4;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var2 = (go0) pxVar2;
                if (go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    se.f(rg3.Q(R.string.ai_chat_model_list_failed, new Object[]{k1Var.a}, go0Var2), go0Var2, 0);
                    String strF = vi0.f(rh1.a, 12.0f, go0Var2, R.string.ai_chat_model_list_retry, go0Var2);
                    Object objL2 = go0Var2.L();
                    if (objL2 == ebVar) {
                        objL2 = new q0(kx1Var, 0);
                        go0Var2.f0(objL2);
                    }
                    se.r(strF, (xm0) objL2, null, false, 0, go0Var2, 48, 60);
                } else {
                    go0Var2.R();
                }
                return a83Var;
            case 2:
                de deVar = (de) obj5;
                xm0 xm0Var3 = (xm0) obj4;
                xm0 xm0Var4 = (xm0) obj;
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                xm0Var4.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((go0) pxVar3).h(xm0Var4) ? 4 : 2;
                }
                go0 go0Var3 = (go0) pxVar3;
                if (go0Var3.O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    int i5 = (go0Var3.f(xm0Var3) ? 1 : 0) | ((iIntValue3 & 14) == 4 ? 1 : 0);
                    Object objL3 = go0Var3.L();
                    if (i5 != 0 || objL3 == ebVar) {
                        objL3 = new z(xm0Var3, xm0Var4, i);
                        go0Var3.f0(objL3);
                    }
                    rg3.a(deVar, xm0Var4, (in0) objL3, go0Var3, (iIntValue3 << 3) & 112);
                } else {
                    go0Var3.R();
                }
                return a83Var;
            case 3:
                in0 in0Var = (in0) obj5;
                c73 c73Var = (c73) obj4;
                px pxVar4 = (px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var4 = (go0) pxVar4;
                if (go0Var4.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    eu.n(null, rg3.P(R.string.home_settings_interaction, go0Var4), xe1.i0(-1864477601, new gf(in0Var, c73Var), go0Var4), go0Var4, 384, 1);
                } else {
                    go0Var4.R();
                }
                return a83Var;
            case 4:
                ch chVar = (ch) obj5;
                xm0 xm0Var5 = (xm0) obj4;
                xm0 xm0Var6 = (xm0) obj;
                px pxVar5 = (px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                xm0Var6.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((go0) pxVar5).h(xm0Var6) ? 4 : 2;
                }
                go0 go0Var5 = (go0) pxVar5;
                if (go0Var5.O(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    int i6 = (go0Var5.f(xm0Var5) ? 1 : 0) | ((iIntValue5 & 14) != 4 ? 0 : 1);
                    Object objL4 = go0Var5.L();
                    if (i6 != 0 || objL4 == ebVar) {
                        objL4 = new z(xm0Var5, xm0Var6, i);
                        go0Var5.f0(objL4);
                    }
                    s11.b(chVar, xm0Var6, (in0) objL4, go0Var5, (iIntValue5 << 3) & 112);
                } else {
                    go0Var5.R();
                }
                return a83Var;
            case 5:
                di diVar = (di) obj5;
                xm0 xm0Var7 = (xm0) obj4;
                xm0 xm0Var8 = (xm0) obj;
                px pxVar6 = (px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                xm0Var8.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((go0) pxVar6).h(xm0Var8) ? 4 : 2;
                }
                go0 go0Var6 = (go0) pxVar6;
                if (go0Var6.O(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    int i7 = (go0Var6.f(xm0Var7) ? 1 : 0) | ((iIntValue6 & 14) != 4 ? 0 : 1);
                    Object objL5 = go0Var6.L();
                    if (i7 != 0 || objL5 == ebVar) {
                        objL5 = new z(xm0Var7, xm0Var8, i2);
                        go0Var6.f0(objL5);
                    }
                    t11.a(diVar, xm0Var8, (in0) objL5, go0Var6, (iIntValue6 << 3) & 112);
                } else {
                    go0Var6.R();
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                cr crVar = (cr) obj5;
                xm0 xm0Var9 = (xm0) obj4;
                xm0 xm0Var10 = (xm0) obj;
                px pxVar7 = (px) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                xm0Var10.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((go0) pxVar7).h(xm0Var10) ? 4 : 2;
                }
                go0 go0Var7 = (go0) pxVar7;
                if (go0Var7.O(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    int i8 = (go0Var7.f(xm0Var9) ? 1 : 0) | ((iIntValue7 & 14) != 4 ? 0 : 1);
                    Object objL6 = go0Var7.L();
                    if (i8 != 0 || objL6 == ebVar) {
                        objL6 = new z(xm0Var9, xm0Var10, i3);
                        go0Var7.f0(objL6);
                    }
                    yr.d(crVar, xm0Var10, (in0) objL6, go0Var7, (iIntValue7 << 3) & 112);
                } else {
                    go0Var7.R();
                }
                return a83Var;
            case 7:
                String str = (String) obj5;
                xm0 xm0Var11 = (xm0) obj4;
                xm0 xm0Var12 = (xm0) obj;
                px pxVar8 = (px) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                xm0Var12.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((go0) pxVar8).h(xm0Var12) ? 4 : 2;
                }
                go0 go0Var8 = (go0) pxVar8;
                if (go0Var8.O(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    int i9 = (go0Var8.f(xm0Var11) ? 1 : 0) | ((iIntValue8 & 14) != 4 ? 0 : 1);
                    Object objL7 = go0Var8.L();
                    if (i9 != 0 || objL7 == ebVar) {
                        objL7 = new z(xm0Var11, xm0Var12, 5);
                        go0Var8.f0(objL7);
                    }
                    rg3.c(str, xm0Var12, (in0) objL7, go0Var8, (iIntValue8 << 3) & 112);
                } else {
                    go0Var8.R();
                }
                return a83Var;
            case 8:
                in0 in0Var2 = (in0) obj5;
                m00 m00Var = (m00) obj4;
                px pxVar9 = (px) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                go0 go0Var9 = (go0) pxVar9;
                if (go0Var9.O(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    Object objL8 = go0Var9.L();
                    if (objL8 == ebVar) {
                        objL8 = new n00();
                        go0Var9.f0(objL8);
                    }
                    n00 n00Var = (n00) objL8;
                    n00Var.a.clear();
                    in0Var2.j(n00Var);
                    n00Var.a(m00Var, go0Var9, 0);
                } else {
                    go0Var9.R();
                }
                return a83Var;
            case 9:
                ci1 ci1Var = (ci1) obj5;
                xm0 xm0Var13 = (xm0) obj4;
                xm0 xm0Var14 = (xm0) obj;
                px pxVar10 = (px) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                xm0Var14.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((go0) pxVar10).h(xm0Var14) ? 4 : 2;
                }
                go0 go0Var10 = (go0) pxVar10;
                if (go0Var10.O(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    int i10 = (go0Var10.f(xm0Var13) ? 1 : 0) | ((iIntValue10 & 14) != 4 ? 0 : 1);
                    Object objL9 = go0Var10.L();
                    if (i10 != 0 || objL9 == ebVar) {
                        objL9 = new z(xm0Var13, xm0Var14, 7);
                        go0Var10.f0(objL9);
                    }
                    pp0.e(ci1Var, xm0Var14, (in0) objL9, go0Var10, (iIntValue10 << 3) & 112);
                } else {
                    go0Var10.R();
                }
                return a83Var;
            case 10:
                xm0 xm0Var15 = (xm0) obj4;
                xm0 xm0Var16 = (xm0) obj5;
                pb2 pb2Var = (pb2) obj;
                px pxVar11 = (px) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((go0) pxVar11).f(pb2Var) ? 4 : 2;
                }
                go0 go0Var11 = (go0) pxVar11;
                if (go0Var11.O(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var11), xm0Var15, pb2.a(pb2Var), false, 0, go0Var11, 0, 56);
                    se.q(rg3.P(R.string.home_settings_save, go0Var11), xm0Var16, pb2.a(pb2Var), false, 0, go0Var11, 0, 56);
                } else {
                    go0Var11.R();
                }
                return a83Var;
            case 11:
                xm0 xm0Var17 = (xm0) obj4;
                in0 in0Var3 = (in0) obj5;
                ((Integer) obj3).getClass();
                go0 go0Var12 = (go0) ((px) obj2);
                go0Var12.W(759876635);
                Object objL10 = go0Var12.L();
                Object obj6 = objL10;
                if (objL10 == ebVar) {
                    n70 n70VarM = op0.m(xm0Var17);
                    go0Var12.f0(n70VarM);
                    obj6 = n70VarM;
                }
                gu2 gu2Var = (gu2) obj6;
                Object objL11 = go0Var12.L();
                Object obj7 = objL11;
                if (objL11 == ebVar) {
                    sc scVar = new sc(new rs1(((rs1) gu2Var.getValue()).a), in2.b, new rs1(in2.c), 8);
                    go0Var12.f0(scVar);
                    obj7 = scVar;
                }
                sc scVar2 = (sc) obj7;
                boolean zH = go0Var12.h(scVar2);
                Object objL12 = go0Var12.L();
                Object obj8 = objL12;
                if (zH || objL12 == ebVar) {
                    b2 b2Var = new b2(gu2Var, scVar2, (t00) null, 19);
                    go0Var12.f0(b2Var);
                    obj8 = b2Var;
                }
                eu.f(go0Var12, (mn0) obj8, a83Var);
                id idVar = scVar2.c;
                boolean zF = go0Var12.f(idVar);
                Object objL13 = go0Var12.L();
                if (zF || objL13 == ebVar) {
                    objL13 = new hn2(idVar, 0);
                    go0Var12.f0(objL13);
                }
                uh1 uh1Var = (uh1) in0Var3.j((xm0) objL13);
                go0Var12.p(false);
                return uh1Var;
            default:
                Spannable spannable = (Spannable) obj5;
                w9 w9Var = (w9) obj4;
                lt2 lt2Var = (lt2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int iIntValue13 = ((Integer) obj3).intValue();
                mx2 mx2Var = lt2Var.f;
                im0 im0Var = lt2Var.c;
                if (im0Var == null) {
                    im0Var = im0.j;
                }
                gm0 gm0Var = lt2Var.d;
                int i11 = gm0Var != null ? gm0Var.a : 0;
                hm0 hm0Var = lt2Var.e;
                int i12 = hm0Var != null ? hm0Var.a : 65535;
                x9 x9Var = (x9) w9Var.i;
                m63 m63VarB = ((yl0) x9Var.e).b(mx2Var, im0Var, i11, i12);
                if (m63VarB instanceof m63) {
                    Object obj9 = m63VarB.h;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                } else {
                    vu2 vu2Var = new vu2(m63VarB, x9Var.j);
                    x9Var.j = vu2Var;
                    Object obj10 = vu2Var.c;
                    obj10.getClass();
                    typeface = (Typeface) obj10;
                }
                spannable.setSpan(new am0(1, typeface), iIntValue12, iIntValue13, 33);
                return a83Var;
        }
    }

    public /* synthetic */ x(xm0 xm0Var, un0 un0Var, int i) {
        this.h = i;
        this.j = xm0Var;
        this.i = un0Var;
    }
}
