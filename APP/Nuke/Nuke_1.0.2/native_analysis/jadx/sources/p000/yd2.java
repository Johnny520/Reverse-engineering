package p000;

import com.dokar.quickjs.binding.JsObject;
import java.util.List;
import java.util.concurrent.CancellationException;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yd2 implements InterfaceC0772ug {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vn1 f13424b;

    public /* synthetic */ yd2(vn1 vn1Var, int i) {
        this.f13423a = i;
        this.f13424b = vn1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    @Override // p000.InterfaceC0772ug
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2148a(Object[] objArr, t00 t00Var) {
        xd2 xd2Var;
        zd2 zd2Var;
        ae2 ae2Var;
        List list;
        be2 be2Var;
        ce2 ce2Var;
        de2 de2Var;
        ee2 ee2Var;
        String strM4921T;
        wk2 wk2Var;
        fe2 fe2Var;
        ge2 ge2Var;
        ze2 ze2Var;
        int i = this.f13423a;
        a83 a83Var = a83.f116a;
        String str = "确定";
        vn1 vn1Var = this.f13424b;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                if (t00Var instanceof xd2) {
                    xd2Var = (xd2) t00Var;
                    int i2 = xd2Var.f12979m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        xd2Var.f12979m = i2 - Integer.MIN_VALUE;
                    } else {
                        xd2Var = new xd2(this, (u00) t00Var);
                    }
                }
                Object objM5724d = xd2Var.f12977k;
                int i3 = xd2Var.f12979m;
                try {
                    if (i3 == 0) {
                        fg1.m1627T(objM5724d);
                        sp0.m4929a0(1, objArr);
                        bg2 bg2VarM1862J = gf1.m1862J(objArr[0]);
                        xd2Var.f12979m = 1;
                        objM5724d = vn1Var.m5724d(new C0455mb(vn1Var, bg2VarM1862J, null, 2), xd2Var);
                        if (objM5724d == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i3 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM5724d);
                    }
                    if (objM5724d == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return AbstractC0179eu.m1471u(th);
                }
            case 1:
                if (t00Var instanceof zd2) {
                    zd2Var = (zd2) t00Var;
                    int i4 = zd2Var.f13841m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        zd2Var.f13841m = i4 - Integer.MIN_VALUE;
                    } else {
                        zd2Var = new zd2(this, (u00) t00Var);
                    }
                }
                Object objM5730l = zd2Var.f13839k;
                int i5 = zd2Var.f13841m;
                try {
                    if (i5 == 0) {
                        fg1.m1627T(objM5730l);
                        sp0.m4929a0(2, objArr);
                        String strM4941g0 = sp0.m4941g0("referenceId", objArr[0]);
                        String strM4941g02 = sp0.m4941g0("property", objArr[1]);
                        zd2Var.f13841m = 1;
                        objM5730l = vn1Var.m5730l(strM4941g0, strM4941g02, zd2Var);
                        if (objM5730l == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i5 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM5730l);
                    }
                    return AbstractC0179eu.m1472v(objM5730l);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    return AbstractC0179eu.m1471u(th2);
                }
            case 2:
                if (t00Var instanceof ae2) {
                    ae2Var = (ae2) t00Var;
                    int i6 = ae2Var.f176m;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ae2Var.f176m = i6 - Integer.MIN_VALUE;
                    } else {
                        ae2Var = new ae2(this, (u00) t00Var);
                    }
                }
                Object objM5723c = ae2Var.f174k;
                int i7 = ae2Var.f176m;
                try {
                    if (i7 == 0) {
                        fg1.m1627T(objM5723c);
                        sp0.m4929a0(3, objArr);
                        Object obj = objArr[2];
                        list = obj instanceof List ? (List) obj : null;
                        if (list == null) {
                            throw new sd2("INVALID_ARGUMENT", "arguments must be an array.", false, null, null, 28);
                        }
                        String strM4941g03 = sp0.m4941g0("referenceId", objArr[0]);
                        String strM4941g04 = sp0.m4941g0("method", objArr[1]);
                        ae2Var.f176m = 1;
                        objM5723c = vn1Var.m5723c(strM4941g03, strM4941g04, list, ae2Var);
                        if (objM5723c == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i7 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM5723c);
                    }
                    return AbstractC0179eu.m1472v(objM5723c);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th3) {
                    return AbstractC0179eu.m1471u(th3);
                }
            case 3:
                if (t00Var instanceof be2) {
                    be2Var = (be2) t00Var;
                    int i8 = be2Var.f823m;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        be2Var.f823m = i8 - Integer.MIN_VALUE;
                    } else {
                        be2Var = new be2(this, (u00) t00Var);
                    }
                }
                Object objM5737s = be2Var.f821k;
                int i9 = be2Var.f823m;
                try {
                    if (i9 == 0) {
                        fg1.m1627T(objM5737s);
                        sp0.m4929a0(2, objArr);
                        String strM4941g05 = sp0.m4941g0("className", objArr[0]);
                        String strM4941g06 = sp0.m4941g0("field", objArr[1]);
                        be2Var.f823m = 1;
                        objM5737s = vn1Var.m5737s(strM4941g05, strM4941g06, be2Var);
                        if (objM5737s == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i9 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM5737s);
                    }
                    return AbstractC0179eu.m1472v(objM5737s);
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th4) {
                    return AbstractC0179eu.m1471u(th4);
                }
            case 4:
                if (t00Var instanceof ce2) {
                    ce2Var = (ce2) t00Var;
                    int i10 = ce2Var.f1496m;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ce2Var.f1496m = i10 - Integer.MIN_VALUE;
                    } else {
                        ce2Var = new ce2(this, (u00) t00Var);
                    }
                }
                Object objM5733o = ce2Var.f1494k;
                int i11 = ce2Var.f1496m;
                try {
                    if (i11 == 0) {
                        fg1.m1627T(objM5733o);
                        sp0.m4929a0(3, objArr);
                        Object obj2 = objArr[2];
                        list = obj2 instanceof List ? (List) obj2 : null;
                        if (list == null) {
                            throw new sd2("INVALID_ARGUMENT", "arguments must be an array.", false, null, null, 28);
                        }
                        String strM4941g07 = sp0.m4941g0("className", objArr[0]);
                        String strM4941g08 = sp0.m4941g0("method", objArr[1]);
                        ce2Var.f1496m = 1;
                        objM5733o = vn1Var.m5733o(strM4941g07, strM4941g08, list, ce2Var);
                        if (objM5733o == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i11 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM5733o);
                    }
                    return AbstractC0179eu.m1472v(objM5733o);
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th5) {
                    return AbstractC0179eu.m1471u(th5);
                }
            case 5:
                if (t00Var instanceof de2) {
                    de2Var = (de2) t00Var;
                    int i12 = de2Var.f2009m;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        de2Var.f2009m = i12 - Integer.MIN_VALUE;
                    } else {
                        de2Var = new de2(this, (u00) t00Var);
                    }
                }
                Object objM5735q = de2Var.f2007k;
                int i13 = de2Var.f2009m;
                try {
                    if (i13 == 0) {
                        fg1.m1627T(objM5735q);
                        sp0.m4929a0(2, objArr);
                        Object obj3 = objArr[1];
                        list = obj3 instanceof List ? (List) obj3 : null;
                        if (list == null) {
                            throw new sd2("INVALID_ARGUMENT", "arguments must be an array.", false, null, null, 28);
                        }
                        String strM4941g09 = sp0.m4941g0("className", objArr[0]);
                        de2Var.f2009m = 1;
                        objM5735q = vn1Var.m5735q(strM4941g09, list, de2Var);
                        if (objM5735q == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i13 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM5735q);
                    }
                    return AbstractC0179eu.m1472v(objM5735q);
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th6) {
                    return AbstractC0179eu.m1471u(th6);
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (t00Var instanceof ee2) {
                    ee2Var = (ee2) t00Var;
                    int i14 = ee2Var.f2419m;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        ee2Var.f2419m = i14 - Integer.MIN_VALUE;
                    } else {
                        ee2Var = new ee2(this, (u00) t00Var);
                    }
                }
                Object obj4 = ee2Var.f2417k;
                int i15 = ee2Var.f2419m;
                try {
                    if (i15 == 0) {
                        fg1.m1627T(obj4);
                        sp0.m4929a0(2, objArr);
                        String strM4941g010 = sp0.m4941g0("message", objArr[0]);
                        if (pv2.m4006s0(strM4941g010) || strM4941g010.length() > 4096) {
                            throw new sd2("INVALID_ARGUMENT", "message must not be blank and must contain at most 4096 characters.", false, null, null, 28);
                        }
                        JsObject jsObjectM4920S = sp0.m4920S("options", objArr[1]);
                        if (jsObjectM4920S == null || (strM4921T = sp0.m4921T(jsObjectM4920S, "duration")) == null) {
                            strM4921T = "short";
                        }
                        if (strM4921T.equals("short")) {
                            wk2Var = wk2.f12566h;
                        } else {
                            if (!strM4921T.equals("long")) {
                                throw new sd2("INVALID_ARGUMENT", "duration must be 'short' or 'long'.", false, null, null, 28);
                            }
                            wk2Var = wk2.f12567i;
                        }
                        xk2 xk2Var = new xk2(strM4941g010, wk2Var);
                        ee2Var.f2419m = 1;
                        Object objM5725e = vn1Var.m5725e(new C0455mb(vn1Var, xk2Var, null, 6), ee2Var);
                        if (objM5725e != k20Var) {
                            objM5725e = a83Var;
                        }
                        if (objM5725e == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i15 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj4);
                    }
                    return AbstractC0179eu.m1472v(a83Var);
                } catch (CancellationException e7) {
                    throw e7;
                } catch (Throwable th7) {
                    return AbstractC0179eu.m1471u(th7);
                }
            case 7:
                if (t00Var instanceof fe2) {
                    fe2Var = (fe2) t00Var;
                    int i16 = fe2Var.f2923m;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        fe2Var.f2923m = i16 - Integer.MIN_VALUE;
                    } else {
                        fe2Var = new fe2(this, (u00) t00Var);
                    }
                }
                Object obj5 = fe2Var.f2921k;
                int i17 = fe2Var.f2923m;
                try {
                    if (i17 == 0) {
                        fg1.m1627T(obj5);
                        sp0.m4929a0(1, objArr);
                        JsObject jsObjectM4937e0 = sp0.m4937e0("options", objArr[0]);
                        String strM4921T2 = sp0.m4921T(jsObjectM4937e0, "title");
                        if (strM4921T2 == null) {
                            strM4921T2 = null;
                        } else if (pv2.m4006s0(strM4921T2) || strM4921T2.length() > 4096) {
                            throw new sd2("INVALID_ARGUMENT", "title must not be blank and must contain at most 4096 characters.", false, null, null, 28);
                        }
                        String strM4941g011 = sp0.m4941g0("message", jsObjectM4937e0.get((Object) "message"));
                        af2.m147b(strM4941g011);
                        String strM4921T3 = sp0.m4921T(jsObjectM4937e0, "buttonText");
                        if (strM4921T3 != null) {
                            str = strM4921T3;
                        }
                        af2.m146a(str, "buttonText");
                        jd2 jd2Var = new jd2(strM4921T2, strM4941g011, str);
                        fe2Var.f2923m = 1;
                        Object objM5725e2 = vn1Var.m5725e(new C0455mb(vn1Var, jd2Var, null, 4), fe2Var);
                        if (objM5725e2 != k20Var) {
                            objM5725e2 = a83Var;
                        }
                        if (objM5725e2 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i17 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj5);
                    }
                    return AbstractC0179eu.m1472v(a83Var);
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Throwable th8) {
                    return AbstractC0179eu.m1471u(th8);
                }
            case 8:
                if (t00Var instanceof ge2) {
                    ge2Var = (ge2) t00Var;
                    int i18 = ge2Var.f3470m;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ge2Var.f3470m = i18 - Integer.MIN_VALUE;
                    } else {
                        ge2Var = new ge2(this, (u00) t00Var);
                    }
                }
                Object objM5725e3 = ge2Var.f3468k;
                int i19 = ge2Var.f3470m;
                try {
                    if (i19 == 0) {
                        fg1.m1627T(objM5725e3);
                        sp0.m4929a0(1, objArr);
                        JsObject jsObjectM4937e02 = sp0.m4937e0("options", objArr[0]);
                        String strM4921T4 = sp0.m4921T(jsObjectM4937e02, "title");
                        if (strM4921T4 == null) {
                            strM4921T4 = null;
                        } else if (pv2.m4006s0(strM4921T4) || strM4921T4.length() > 4096) {
                            throw new sd2("INVALID_ARGUMENT", "title must not be blank and must contain at most 4096 characters.", false, null, null, 28);
                        }
                        String strM4941g012 = sp0.m4941g0("message", jsObjectM4937e02.get((Object) "message"));
                        af2.m147b(strM4941g012);
                        String strM4921T5 = sp0.m4921T(jsObjectM4937e02, "confirmText");
                        if (strM4921T5 != null) {
                            str = strM4921T5;
                        }
                        af2.m146a(str, "confirmText");
                        String strM4921T6 = sp0.m4921T(jsObjectM4937e02, "cancelText");
                        if (strM4921T6 == null) {
                            strM4921T6 = "取消";
                        }
                        af2.m146a(strM4921T6, "cancelText");
                        xf2 xf2Var = new xf2(strM4921T4, strM4941g012, str, strM4921T6);
                        ge2Var.f3470m = 1;
                        objM5725e3 = vn1Var.m5725e(new C0455mb(vn1Var, xf2Var, null, 5), ge2Var);
                        if (objM5725e3 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i19 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM5725e3);
                    }
                    return AbstractC0179eu.m1472v(objM5725e3);
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th9) {
                    return AbstractC0179eu.m1471u(th9);
                }
            default:
                if (t00Var instanceof ze2) {
                    ze2Var = (ze2) t00Var;
                    int i20 = ze2Var.f13865m;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        ze2Var.f13865m = i20 - Integer.MIN_VALUE;
                    } else {
                        ze2Var = new ze2(this, (u00) t00Var);
                    }
                }
                Object objM5724d2 = ze2Var.f13863k;
                int i21 = ze2Var.f13865m;
                try {
                    if (i21 == 0) {
                        fg1.m1627T(objM5724d2);
                        sp0.m4929a0(1, objArr);
                        Object obj6 = objArr[0];
                        ((df2) vn1Var.f12033d).f2023a.getClass();
                        zj2 zj2VarM1863K = gf1.m1863K(obj6);
                        ze2Var.f13865m = 1;
                        objM5724d2 = vn1Var.m5724d(new C0455mb(vn1Var, zj2VarM1863K, null, 3), ze2Var);
                        if (objM5724d2 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i21 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM5724d2);
                    }
                    return AbstractC0179eu.m1472v(gf1.m1877Y((ak2) objM5724d2));
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th10) {
                    return AbstractC0179eu.m1471u(th10);
                }
        }
    }
}
