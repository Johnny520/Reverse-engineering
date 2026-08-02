package defpackage;

import com.dokar.quickjs.binding.JsObject;
import java.util.List;
import java.util.concurrent.CancellationException;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yd2 implements ug {
    public final /* synthetic */ int a;
    public final /* synthetic */ vn1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ yd2(vn1 vn1Var, int i) {
        this.a = i;
        this.b = vn1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // defpackage.ug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object[] objArr, t00 t00Var) {
        xd2 xd2Var;
        zd2 zd2Var;
        ae2 ae2Var;
        List list;
        be2 be2Var;
        ce2 ce2Var;
        de2 de2Var;
        ee2 ee2Var;
        String strT;
        wk2 wk2Var;
        fe2 fe2Var;
        ge2 ge2Var;
        ze2 ze2Var;
        int i = this.a;
        a83 a83Var = a83.a;
        String str = "确定";
        vn1 vn1Var = this.b;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                if (t00Var instanceof xd2) {
                    xd2Var = (xd2) t00Var;
                    int i2 = xd2Var.m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        xd2Var.m = i2 - Integer.MIN_VALUE;
                    } else {
                        xd2Var = new xd2(this, (u00) t00Var);
                    }
                }
                Object objD = xd2Var.k;
                int i3 = xd2Var.m;
                try {
                    if (i3 == 0) {
                        fg1.T(objD);
                        sp0.a0(1, objArr);
                        bg2 bg2VarJ = gf1.J(objArr[0]);
                        xd2Var.m = 1;
                        objD = vn1Var.d(new mb(vn1Var, bg2VarJ, null, 2), xd2Var);
                        if (objD == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i3 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objD);
                    }
                    if (objD == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return eu.u(th);
                }
            case 1:
                if (t00Var instanceof zd2) {
                    zd2Var = (zd2) t00Var;
                    int i4 = zd2Var.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        zd2Var.m = i4 - Integer.MIN_VALUE;
                    } else {
                        zd2Var = new zd2(this, (u00) t00Var);
                    }
                }
                Object objL = zd2Var.k;
                int i5 = zd2Var.m;
                try {
                    if (i5 == 0) {
                        fg1.T(objL);
                        sp0.a0(2, objArr);
                        String strG0 = sp0.g0("referenceId", objArr[0]);
                        String strG02 = sp0.g0("property", objArr[1]);
                        zd2Var.m = 1;
                        objL = vn1Var.l(strG0, strG02, zd2Var);
                        if (objL == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i5 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objL);
                    }
                    return eu.v(objL);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    return eu.u(th2);
                }
            case 2:
                if (t00Var instanceof ae2) {
                    ae2Var = (ae2) t00Var;
                    int i6 = ae2Var.m;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ae2Var.m = i6 - Integer.MIN_VALUE;
                    } else {
                        ae2Var = new ae2(this, (u00) t00Var);
                    }
                }
                Object objC = ae2Var.k;
                int i7 = ae2Var.m;
                try {
                    if (i7 == 0) {
                        fg1.T(objC);
                        sp0.a0(3, objArr);
                        Object obj = objArr[2];
                        list = obj instanceof List ? (List) obj : null;
                        if (list == null) {
                            throw new sd2("INVALID_ARGUMENT", "arguments must be an array.", false, null, null, 28);
                        }
                        String strG03 = sp0.g0("referenceId", objArr[0]);
                        String strG04 = sp0.g0("method", objArr[1]);
                        ae2Var.m = 1;
                        objC = vn1Var.c(strG03, strG04, list, ae2Var);
                        if (objC == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i7 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objC);
                    }
                    return eu.v(objC);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th3) {
                    return eu.u(th3);
                }
            case 3:
                if (t00Var instanceof be2) {
                    be2Var = (be2) t00Var;
                    int i8 = be2Var.m;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        be2Var.m = i8 - Integer.MIN_VALUE;
                    } else {
                        be2Var = new be2(this, (u00) t00Var);
                    }
                }
                Object objS = be2Var.k;
                int i9 = be2Var.m;
                try {
                    if (i9 == 0) {
                        fg1.T(objS);
                        sp0.a0(2, objArr);
                        String strG05 = sp0.g0("className", objArr[0]);
                        String strG06 = sp0.g0("field", objArr[1]);
                        be2Var.m = 1;
                        objS = vn1Var.s(strG05, strG06, be2Var);
                        if (objS == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i9 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objS);
                    }
                    return eu.v(objS);
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th4) {
                    return eu.u(th4);
                }
            case 4:
                if (t00Var instanceof ce2) {
                    ce2Var = (ce2) t00Var;
                    int i10 = ce2Var.m;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ce2Var.m = i10 - Integer.MIN_VALUE;
                    } else {
                        ce2Var = new ce2(this, (u00) t00Var);
                    }
                }
                Object objO = ce2Var.k;
                int i11 = ce2Var.m;
                try {
                    if (i11 == 0) {
                        fg1.T(objO);
                        sp0.a0(3, objArr);
                        Object obj2 = objArr[2];
                        list = obj2 instanceof List ? (List) obj2 : null;
                        if (list == null) {
                            throw new sd2("INVALID_ARGUMENT", "arguments must be an array.", false, null, null, 28);
                        }
                        String strG07 = sp0.g0("className", objArr[0]);
                        String strG08 = sp0.g0("method", objArr[1]);
                        ce2Var.m = 1;
                        objO = vn1Var.o(strG07, strG08, list, ce2Var);
                        if (objO == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i11 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objO);
                    }
                    return eu.v(objO);
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th5) {
                    return eu.u(th5);
                }
            case 5:
                if (t00Var instanceof de2) {
                    de2Var = (de2) t00Var;
                    int i12 = de2Var.m;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        de2Var.m = i12 - Integer.MIN_VALUE;
                    } else {
                        de2Var = new de2(this, (u00) t00Var);
                    }
                }
                Object objQ = de2Var.k;
                int i13 = de2Var.m;
                try {
                    if (i13 == 0) {
                        fg1.T(objQ);
                        sp0.a0(2, objArr);
                        Object obj3 = objArr[1];
                        list = obj3 instanceof List ? (List) obj3 : null;
                        if (list == null) {
                            throw new sd2("INVALID_ARGUMENT", "arguments must be an array.", false, null, null, 28);
                        }
                        String strG09 = sp0.g0("className", objArr[0]);
                        de2Var.m = 1;
                        objQ = vn1Var.q(strG09, list, de2Var);
                        if (objQ == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i13 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objQ);
                    }
                    return eu.v(objQ);
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th6) {
                    return eu.u(th6);
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (t00Var instanceof ee2) {
                    ee2Var = (ee2) t00Var;
                    int i14 = ee2Var.m;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        ee2Var.m = i14 - Integer.MIN_VALUE;
                    } else {
                        ee2Var = new ee2(this, (u00) t00Var);
                    }
                }
                Object obj4 = ee2Var.k;
                int i15 = ee2Var.m;
                try {
                    if (i15 == 0) {
                        fg1.T(obj4);
                        sp0.a0(2, objArr);
                        String strG010 = sp0.g0("message", objArr[0]);
                        if (pv2.s0(strG010) || strG010.length() > 4096) {
                            throw new sd2("INVALID_ARGUMENT", "message must not be blank and must contain at most 4096 characters.", false, null, null, 28);
                        }
                        JsObject jsObjectS = sp0.S("options", objArr[1]);
                        if (jsObjectS == null || (strT = sp0.T(jsObjectS, "duration")) == null) {
                            strT = "short";
                        }
                        if (strT.equals("short")) {
                            wk2Var = wk2.h;
                        } else {
                            if (!strT.equals("long")) {
                                throw new sd2("INVALID_ARGUMENT", "duration must be 'short' or 'long'.", false, null, null, 28);
                            }
                            wk2Var = wk2.i;
                        }
                        xk2 xk2Var = new xk2(strG010, wk2Var);
                        ee2Var.m = 1;
                        Object objE = vn1Var.e(new mb(vn1Var, xk2Var, null, 6), ee2Var);
                        if (objE != k20Var) {
                            objE = a83Var;
                        }
                        if (objE == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i15 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj4);
                    }
                    return eu.v(a83Var);
                } catch (CancellationException e7) {
                    throw e7;
                } catch (Throwable th7) {
                    return eu.u(th7);
                }
            case 7:
                if (t00Var instanceof fe2) {
                    fe2Var = (fe2) t00Var;
                    int i16 = fe2Var.m;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        fe2Var.m = i16 - Integer.MIN_VALUE;
                    } else {
                        fe2Var = new fe2(this, (u00) t00Var);
                    }
                }
                Object obj5 = fe2Var.k;
                int i17 = fe2Var.m;
                try {
                    if (i17 == 0) {
                        fg1.T(obj5);
                        sp0.a0(1, objArr);
                        JsObject jsObjectE0 = sp0.e0("options", objArr[0]);
                        String strT2 = sp0.T(jsObjectE0, "title");
                        if (strT2 == null) {
                            strT2 = null;
                        } else if (pv2.s0(strT2) || strT2.length() > 4096) {
                            throw new sd2("INVALID_ARGUMENT", "title must not be blank and must contain at most 4096 characters.", false, null, null, 28);
                        }
                        String strG011 = sp0.g0("message", jsObjectE0.get((Object) "message"));
                        af2.b(strG011);
                        String strT3 = sp0.T(jsObjectE0, "buttonText");
                        if (strT3 != null) {
                            str = strT3;
                        }
                        af2.a(str, "buttonText");
                        jd2 jd2Var = new jd2(strT2, strG011, str);
                        fe2Var.m = 1;
                        Object objE2 = vn1Var.e(new mb(vn1Var, jd2Var, null, 4), fe2Var);
                        if (objE2 != k20Var) {
                            objE2 = a83Var;
                        }
                        if (objE2 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i17 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj5);
                    }
                    return eu.v(a83Var);
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Throwable th8) {
                    return eu.u(th8);
                }
            case 8:
                if (t00Var instanceof ge2) {
                    ge2Var = (ge2) t00Var;
                    int i18 = ge2Var.m;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ge2Var.m = i18 - Integer.MIN_VALUE;
                    } else {
                        ge2Var = new ge2(this, (u00) t00Var);
                    }
                }
                Object objE3 = ge2Var.k;
                int i19 = ge2Var.m;
                try {
                    if (i19 == 0) {
                        fg1.T(objE3);
                        sp0.a0(1, objArr);
                        JsObject jsObjectE02 = sp0.e0("options", objArr[0]);
                        String strT4 = sp0.T(jsObjectE02, "title");
                        if (strT4 == null) {
                            strT4 = null;
                        } else if (pv2.s0(strT4) || strT4.length() > 4096) {
                            throw new sd2("INVALID_ARGUMENT", "title must not be blank and must contain at most 4096 characters.", false, null, null, 28);
                        }
                        String strG012 = sp0.g0("message", jsObjectE02.get((Object) "message"));
                        af2.b(strG012);
                        String strT5 = sp0.T(jsObjectE02, "confirmText");
                        if (strT5 != null) {
                            str = strT5;
                        }
                        af2.a(str, "confirmText");
                        String strT6 = sp0.T(jsObjectE02, "cancelText");
                        if (strT6 == null) {
                            strT6 = "取消";
                        }
                        af2.a(strT6, "cancelText");
                        xf2 xf2Var = new xf2(strT4, strG012, str, strT6);
                        ge2Var.m = 1;
                        objE3 = vn1Var.e(new mb(vn1Var, xf2Var, null, 5), ge2Var);
                        if (objE3 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i19 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objE3);
                    }
                    return eu.v(objE3);
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th9) {
                    return eu.u(th9);
                }
            default:
                if (t00Var instanceof ze2) {
                    ze2Var = (ze2) t00Var;
                    int i20 = ze2Var.m;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        ze2Var.m = i20 - Integer.MIN_VALUE;
                    } else {
                        ze2Var = new ze2(this, (u00) t00Var);
                    }
                }
                Object objD2 = ze2Var.k;
                int i21 = ze2Var.m;
                try {
                    if (i21 == 0) {
                        fg1.T(objD2);
                        sp0.a0(1, objArr);
                        Object obj6 = objArr[0];
                        ((df2) vn1Var.d).a.getClass();
                        zj2 zj2VarK = gf1.K(obj6);
                        ze2Var.m = 1;
                        objD2 = vn1Var.d(new mb(vn1Var, zj2VarK, null, 3), ze2Var);
                        if (objD2 == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i21 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(objD2);
                    }
                    return eu.v(gf1.Y((ak2) objD2));
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th10) {
                    return eu.u(th10);
                }
        }
    }
}
