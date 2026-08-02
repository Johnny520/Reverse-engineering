package defpackage;

import com.dokar.quickjs.binding.JsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vd2 implements xn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vn1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ vd2(vn1 vn1Var, int i) {
        this.a = i;
        this.b = vn1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn0
    public final Object b(Object[] objArr) {
        boolean z;
        int i = this.a;
        JsObject jsObjectX = null;
        vn1 vn1Var = this.b;
        switch (i) {
            case 0:
                objArr.getClass();
                try {
                    sp0.a0(1, objArr);
                    return eu.v(Boolean.valueOf(vn1Var.n(sp0.g0("permission", objArr[0]))));
                } catch (Throwable th) {
                    return eu.u(th);
                }
            case 1:
                objArr.getClass();
                try {
                    sp0.a0(0, objArr);
                    return eu.v(vn1Var.g());
                } catch (Throwable th2) {
                    return eu.u(th2);
                }
            case 2:
                objArr.getClass();
                try {
                    sp0.a0(2, objArr);
                    af2 af2Var = af2.a;
                    try {
                        ph2 ph2VarValueOf = ph2.valueOf(sp0.g0("level", objArr[0]));
                        Object obj = objArr[1];
                        List list = obj instanceof List ? (List) obj : null;
                        if (list == null) {
                            throw new sd2("INVALID_ARGUMENT", "values must be an array.", false, null, null, 28);
                        }
                        vn1Var.t(ph2VarValueOf, du.u0(list, " ", null, null, new e2(1, af2Var, af2.class, "formatLogValue", "formatLogValue(Ljava/lang/Object;)Ljava/lang/String;", 0, 0, 4), 30));
                        return eu.v(a83.a);
                    } catch (IllegalArgumentException e) {
                        throw new sd2("INVALID_ARGUMENT", "Unknown log level.", false, null, e, 12);
                    }
                } catch (Throwable th3) {
                    return eu.u(th3);
                }
            case 3:
                objArr.getClass();
                sp0.a0(0, objArr);
                ((df2) vn1Var.d).a.getClass();
                return 10L;
            case 4:
                objArr.getClass();
                sp0.a0(0, objArr);
                ((df2) vn1Var.d).a.getClass();
                return 128;
            case 5:
                objArr.getClass();
                try {
                    sp0.a0(0, objArr);
                    synchronized (vn1Var.j) {
                        ci2 ci2Var = (ci2) vn1Var.k;
                        if (ci2Var != null) {
                            vn1Var.k = null;
                            jsObjectX = gf1.X(ci2Var, (jh2) vn1Var.i);
                            break;
                        }
                    }
                    return eu.v(jsObjectX);
                } catch (Throwable th4) {
                    return eu.u(th4);
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                objArr.getClass();
                try {
                    sp0.a0(1, objArr);
                    String strG0 = sp0.g0("referenceId", objArr[0]);
                    jh2 jh2Var = (jh2) vn1Var.i;
                    jh2Var.getClass();
                    synchronized (jh2Var.a) {
                        z = jh2Var.b.remove(strG0) != null;
                    }
                    return eu.v(Boolean.valueOf(z));
                } catch (Throwable th5) {
                    return eu.u(th5);
                }
            case 7:
                objArr.getClass();
                try {
                    sp0.a0(0, objArr);
                    return eu.v(vn1Var.r());
                } catch (Throwable th6) {
                    return eu.u(th6);
                }
            case 8:
                objArr.getClass();
                try {
                    sp0.a0(0, objArr);
                    return eu.v(vn1Var.y());
                } catch (Throwable th7) {
                    return eu.u(th7);
                }
            case 9:
                objArr.getClass();
                try {
                    sp0.a0(0, objArr);
                    return eu.v(vn1Var.p());
                } catch (Throwable th8) {
                    return eu.u(th8);
                }
            case 10:
                objArr.getClass();
                af2.a.e(vn1Var, ph2.h, objArr);
                return a83.a;
            case 11:
                objArr.getClass();
                af2.a.e(vn1Var, ph2.i, objArr);
                return a83.a;
            case 12:
                objArr.getClass();
                af2.a.e(vn1Var, ph2.i, objArr);
                return a83.a;
            case 13:
                objArr.getClass();
                af2.a.e(vn1Var, ph2.j, objArr);
                return a83.a;
            case 14:
                objArr.getClass();
                af2.a.e(vn1Var, ph2.k, objArr);
                return a83.a;
            default:
                objArr.getClass();
                try {
                    sp0.a0(1, objArr);
                    String strG02 = sp0.g0("name", objArr[0]);
                    rp0.Q(strG02);
                    vn1Var.w(strG02);
                    Map mapSingletonMap = Collections.singletonMap("className", strG02);
                    mapSingletonMap.getClass();
                    return eu.v(new JsObject(mapSingletonMap));
                } catch (Throwable th9) {
                    return eu.u(th9);
                }
        }
    }
}
