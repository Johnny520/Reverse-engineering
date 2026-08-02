package p000;

import android.graphics.Typeface;
import android.text.Spannable;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: x */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0866x implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12743h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f12744i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f12745j;

    public /* synthetic */ C0866x(int i, Object obj, Object obj2) {
        this.f12743h = i;
        this.f12744i = obj;
        this.f12745j = obj2;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.f12743h;
        int i2 = 3;
        int i3 = 4;
        C0160eb c0160eb = C0520nx.f7360a;
        a83 a83Var = a83.f116a;
        Object obj4 = this.f12745j;
        Object obj5 = this.f12744i;
        switch (i) {
            case 0:
                AIChatConfig aIChatConfig = (AIChatConfig) obj5;
                xm0 xm0Var = (xm0) obj4;
                xm0 xm0Var2 = (xm0) obj;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xm0Var2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) interfaceC0596px).m1984h(xm0Var2) ? 4 : 2;
                }
                go0 go0Var = (go0) interfaceC0596px;
                if (go0Var.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int i4 = (go0Var.m1980f(xm0Var) ? 1 : 0) | ((iIntValue & 14) != 4 ? 0 : 1);
                    Object objM1956L = go0Var.m1956L();
                    if (i4 != 0 || objM1956L == c0160eb) {
                        objM1956L = new C0944z(xm0Var, xm0Var2, i);
                        go0Var.m1981f0(objM1956L);
                    }
                    AbstractC0691se.m4830a(aIChatConfig, xm0Var2, (in0) objM1956L, go0Var, ((iIntValue << 3) & 112) | AIChatConfig.$stable);
                } else {
                    go0Var.m1961R();
                }
                return a83Var;
            case 1:
                C0371k1 c0371k1 = (C0371k1) obj5;
                kx1 kx1Var = (kx1) obj4;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC0691se.m4835f(rg3.m4463Q(R.string.ai_chat_model_list_failed, new Object[]{c0371k1.f5299a}, go0Var2), go0Var2, 0);
                    String strM5687f = vi0.m5687f(rh1.f9587a, 12.0f, go0Var2, R.string.ai_chat_model_list_retry, go0Var2);
                    Object objM1956L2 = go0Var2.m1956L();
                    if (objM1956L2 == c0160eb) {
                        objM1956L2 = new C0600q0(kx1Var, 0);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    AbstractC0691se.m4847r(strM5687f, (xm0) objM1956L2, null, false, 0, go0Var2, 48, 60);
                } else {
                    go0Var2.m1961R();
                }
                return a83Var;
            case 2:
                C0127de c0127de = (C0127de) obj5;
                xm0 xm0Var3 = (xm0) obj4;
                xm0 xm0Var4 = (xm0) obj;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                xm0Var4.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((go0) interfaceC0596px3).m1984h(xm0Var4) ? 4 : 2;
                }
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    int i5 = (go0Var3.m1980f(xm0Var3) ? 1 : 0) | ((iIntValue3 & 14) == 4 ? 1 : 0);
                    Object objM1956L3 = go0Var3.m1956L();
                    if (i5 != 0 || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0944z(xm0Var3, xm0Var4, i);
                        go0Var3.m1981f0(objM1956L3);
                    }
                    rg3.m4465a(c0127de, xm0Var4, (in0) objM1956L3, go0Var3, (iIntValue3 << 3) & 112);
                } else {
                    go0Var3.m1961R();
                }
                return a83Var;
            case 3:
                in0 in0Var = (in0) obj5;
                c73 c73Var = (c73) obj4;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_interaction, go0Var4), xe1.m6126i0(-1864477601, new C0238gf(in0Var, c73Var), go0Var4), go0Var4, 384, 1);
                } else {
                    go0Var4.m1961R();
                }
                return a83Var;
            case 4:
                C0091ch c0091ch = (C0091ch) obj5;
                xm0 xm0Var5 = (xm0) obj4;
                xm0 xm0Var6 = (xm0) obj;
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                xm0Var6.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((go0) interfaceC0596px5).m1984h(xm0Var6) ? 4 : 2;
                }
                go0 go0Var5 = (go0) interfaceC0596px5;
                if (go0Var5.m1958O(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    int i6 = (go0Var5.m1980f(xm0Var5) ? 1 : 0) | ((iIntValue5 & 14) != 4 ? 0 : 1);
                    Object objM1956L4 = go0Var5.m1956L();
                    if (i6 != 0 || objM1956L4 == c0160eb) {
                        objM1956L4 = new C0944z(xm0Var5, xm0Var6, i);
                        go0Var5.m1981f0(objM1956L4);
                    }
                    s11.m4684b(c0091ch, xm0Var6, (in0) objM1956L4, go0Var5, (iIntValue5 << 3) & 112);
                } else {
                    go0Var5.m1961R();
                }
                return a83Var;
            case 5:
                C0131di c0131di = (C0131di) obj5;
                xm0 xm0Var7 = (xm0) obj4;
                xm0 xm0Var8 = (xm0) obj;
                InterfaceC0596px interfaceC0596px6 = (InterfaceC0596px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                xm0Var8.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((go0) interfaceC0596px6).m1984h(xm0Var8) ? 4 : 2;
                }
                go0 go0Var6 = (go0) interfaceC0596px6;
                if (go0Var6.m1958O(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    int i7 = (go0Var6.m1980f(xm0Var7) ? 1 : 0) | ((iIntValue6 & 14) != 4 ? 0 : 1);
                    Object objM1956L5 = go0Var6.m1956L();
                    if (i7 != 0 || objM1956L5 == c0160eb) {
                        objM1956L5 = new C0944z(xm0Var7, xm0Var8, i2);
                        go0Var6.m1981f0(objM1956L5);
                    }
                    t11.m5075a(c0131di, xm0Var8, (in0) objM1956L5, go0Var6, (iIntValue6 << 3) & 112);
                } else {
                    go0Var6.m1961R();
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                C0103cr c0103cr = (C0103cr) obj5;
                xm0 xm0Var9 = (xm0) obj4;
                xm0 xm0Var10 = (xm0) obj;
                InterfaceC0596px interfaceC0596px7 = (InterfaceC0596px) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                xm0Var10.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((go0) interfaceC0596px7).m1984h(xm0Var10) ? 4 : 2;
                }
                go0 go0Var7 = (go0) interfaceC0596px7;
                if (go0Var7.m1958O(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    int i8 = (go0Var7.m1980f(xm0Var9) ? 1 : 0) | ((iIntValue7 & 14) != 4 ? 0 : 1);
                    Object objM1956L6 = go0Var7.m1956L();
                    if (i8 != 0 || objM1956L6 == c0160eb) {
                        objM1956L6 = new C0944z(xm0Var9, xm0Var10, i3);
                        go0Var7.m1981f0(objM1956L6);
                    }
                    AbstractC0933yr.m6315d(c0103cr, xm0Var10, (in0) objM1956L6, go0Var7, (iIntValue7 << 3) & 112);
                } else {
                    go0Var7.m1961R();
                }
                return a83Var;
            case 7:
                String str = (String) obj5;
                xm0 xm0Var11 = (xm0) obj4;
                xm0 xm0Var12 = (xm0) obj;
                InterfaceC0596px interfaceC0596px8 = (InterfaceC0596px) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                xm0Var12.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((go0) interfaceC0596px8).m1984h(xm0Var12) ? 4 : 2;
                }
                go0 go0Var8 = (go0) interfaceC0596px8;
                if (go0Var8.m1958O(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    int i9 = (go0Var8.m1980f(xm0Var11) ? 1 : 0) | ((iIntValue8 & 14) != 4 ? 0 : 1);
                    Object objM1956L7 = go0Var8.m1956L();
                    if (i9 != 0 || objM1956L7 == c0160eb) {
                        objM1956L7 = new C0944z(xm0Var11, xm0Var12, 5);
                        go0Var8.m1981f0(objM1956L7);
                    }
                    rg3.m4467c(str, xm0Var12, (in0) objM1956L7, go0Var8, (iIntValue8 << 3) & 112);
                } else {
                    go0Var8.m1961R();
                }
                return a83Var;
            case 8:
                in0 in0Var2 = (in0) obj5;
                m00 m00Var = (m00) obj4;
                InterfaceC0596px interfaceC0596px9 = (InterfaceC0596px) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                go0 go0Var9 = (go0) interfaceC0596px9;
                if (go0Var9.m1958O(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    Object objM1956L8 = go0Var9.m1956L();
                    if (objM1956L8 == c0160eb) {
                        objM1956L8 = new n00();
                        go0Var9.m1981f0(objM1956L8);
                    }
                    n00 n00Var = (n00) objM1956L8;
                    n00Var.f6948a.clear();
                    in0Var2.mo5j(n00Var);
                    n00Var.m3224a(m00Var, go0Var9, 0);
                } else {
                    go0Var9.m1961R();
                }
                return a83Var;
            case 9:
                ci1 ci1Var = (ci1) obj5;
                xm0 xm0Var13 = (xm0) obj4;
                xm0 xm0Var14 = (xm0) obj;
                InterfaceC0596px interfaceC0596px10 = (InterfaceC0596px) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                xm0Var14.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((go0) interfaceC0596px10).m1984h(xm0Var14) ? 4 : 2;
                }
                go0 go0Var10 = (go0) interfaceC0596px10;
                if (go0Var10.m1958O(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    int i10 = (go0Var10.m1980f(xm0Var13) ? 1 : 0) | ((iIntValue10 & 14) != 4 ? 0 : 1);
                    Object objM1956L9 = go0Var10.m1956L();
                    if (i10 != 0 || objM1956L9 == c0160eb) {
                        objM1956L9 = new C0944z(xm0Var13, xm0Var14, 7);
                        go0Var10.m1981f0(objM1956L9);
                    }
                    pp0.m3907e(ci1Var, xm0Var14, (in0) objM1956L9, go0Var10, (iIntValue10 << 3) & 112);
                } else {
                    go0Var10.m1961R();
                }
                return a83Var;
            case 10:
                xm0 xm0Var15 = (xm0) obj4;
                xm0 xm0Var16 = (xm0) obj5;
                pb2 pb2Var = (pb2) obj;
                InterfaceC0596px interfaceC0596px11 = (InterfaceC0596px) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((go0) interfaceC0596px11).m1980f(pb2Var) ? 4 : 2;
                }
                go0 go0Var11 = (go0) interfaceC0596px11;
                if (go0Var11.m1958O(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var11), xm0Var15, pb2.m3843a(pb2Var), false, 0, go0Var11, 0, 56);
                    AbstractC0691se.m4846q(rg3.m4462P(R.string.home_settings_save, go0Var11), xm0Var16, pb2.m3843a(pb2Var), false, 0, go0Var11, 0, 56);
                } else {
                    go0Var11.m1961R();
                }
                return a83Var;
            case 11:
                xm0 xm0Var17 = (xm0) obj4;
                in0 in0Var3 = (in0) obj5;
                ((Integer) obj3).getClass();
                go0 go0Var12 = (go0) ((InterfaceC0596px) obj2);
                go0Var12.m1966W(759876635);
                Object objM1956L10 = go0Var12.m1956L();
                Object obj6 = objM1956L10;
                if (objM1956L10 == c0160eb) {
                    n70 n70VarM3590m = op0.m3590m(xm0Var17);
                    go0Var12.m1981f0(n70VarM3590m);
                    obj6 = n70VarM3590m;
                }
                gu2 gu2Var = (gu2) obj6;
                Object objM1956L11 = go0Var12.m1956L();
                Object obj7 = objM1956L11;
                if (objM1956L11 == c0160eb) {
                    C0689sc c0689sc = new C0689sc(new rs1(((rs1) gu2Var.getValue()).f9744a), in2.f4705b, new rs1(in2.f4706c), 8);
                    go0Var12.m1981f0(c0689sc);
                    obj7 = c0689sc;
                }
                C0689sc c0689sc2 = (C0689sc) obj7;
                boolean zM1984h = go0Var12.m1984h(c0689sc2);
                Object objM1956L12 = go0Var12.m1956L();
                Object obj8 = objM1956L12;
                if (zM1984h || objM1956L12 == c0160eb) {
                    C0040b2 c0040b2 = new C0040b2(gu2Var, c0689sc2, (t00) null, 19);
                    go0Var12.m1981f0(c0040b2);
                    obj8 = c0040b2;
                }
                AbstractC0179eu.m1456f(go0Var12, (mn0) obj8, a83Var);
                C0310id c0310id = c0689sc2.f10024c;
                boolean zM1980f = go0Var12.m1980f(c0310id);
                Object objM1956L13 = go0Var12.m1956L();
                if (zM1980f || objM1956L13 == c0160eb) {
                    objM1956L13 = new hn2(c0310id, 0);
                    go0Var12.m1981f0(objM1956L13);
                }
                uh1 uh1Var = (uh1) in0Var3.mo5j((xm0) objM1956L13);
                go0Var12.m1994p(false);
                return uh1Var;
            default:
                Spannable spannable = (Spannable) obj5;
                C0839w9 c0839w9 = (C0839w9) obj4;
                lt2 lt2Var = (lt2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int iIntValue13 = ((Integer) obj3).intValue();
                mx2 mx2Var = lt2Var.f6306f;
                im0 im0Var = lt2Var.f6303c;
                if (im0Var == null) {
                    im0Var = im0.f4680j;
                }
                gm0 gm0Var = lt2Var.f6304d;
                int i11 = gm0Var != null ? gm0Var.f3581a : 0;
                hm0 hm0Var = lt2Var.f6305e;
                int i12 = hm0Var != null ? hm0Var.f4076a : 65535;
                C0878x9 c0878x9 = (C0878x9) c0839w9.f12409i;
                m63 m63VarM6288b = ((yl0) c0878x9.f12904e).m6288b(mx2Var, im0Var, i11, i12);
                if (m63VarM6288b instanceof m63) {
                    Object obj9 = m63VarM6288b.f6489h;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                } else {
                    vu2 vu2Var = new vu2(m63VarM6288b, c0878x9.f12909j);
                    c0878x9.f12909j = vu2Var;
                    Object obj10 = vu2Var.f12180c;
                    obj10.getClass();
                    typeface = (Typeface) obj10;
                }
                spannable.setSpan(new am0(1, typeface), iIntValue12, iIntValue13, 33);
                return a83Var;
        }
    }

    public /* synthetic */ C0866x(xm0 xm0Var, un0 un0Var, int i) {
        this.f12743h = i;
        this.f12745j = xm0Var;
        this.f12744i = un0Var;
    }
}
