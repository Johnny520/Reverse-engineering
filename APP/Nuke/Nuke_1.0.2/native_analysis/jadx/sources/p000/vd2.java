package p000;

import com.dokar.quickjs.binding.JsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vd2 implements xn0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vn1 f11912b;

    public /* synthetic */ vd2(vn1 vn1Var, int i) {
        this.f11911a = i;
        this.f11912b = vn1Var;
    }

    @Override // p000.xn0
    /* JADX INFO: renamed from: b */
    public final Object mo5172b(Object[] objArr) {
        boolean z;
        int i = this.f11911a;
        JsObject jsObjectM1876X = null;
        vn1 vn1Var = this.f11912b;
        switch (i) {
            case 0:
                objArr.getClass();
                try {
                    sp0.m4929a0(1, objArr);
                    return AbstractC0179eu.m1472v(Boolean.valueOf(vn1Var.m5732n(sp0.m4941g0("permission", objArr[0]))));
                } catch (Throwable th) {
                    return AbstractC0179eu.m1471u(th);
                }
            case 1:
                objArr.getClass();
                try {
                    sp0.m4929a0(0, objArr);
                    return AbstractC0179eu.m1472v(vn1Var.m5727g());
                } catch (Throwable th2) {
                    return AbstractC0179eu.m1471u(th2);
                }
            case 2:
                objArr.getClass();
                try {
                    sp0.m4929a0(2, objArr);
                    af2 af2Var = af2.f186a;
                    try {
                        ph2 ph2VarValueOf = ph2.valueOf(sp0.m4941g0("level", objArr[0]));
                        Object obj = objArr[1];
                        List list = obj instanceof List ? (List) obj : null;
                        if (list == null) {
                            throw new sd2("INVALID_ARGUMENT", "values must be an array.", false, null, null, 28);
                        }
                        vn1Var.m5738t(ph2VarValueOf, AbstractC0142du.m1165u0(list, " ", null, null, new C0151e2(1, af2Var, af2.class, "formatLogValue", "formatLogValue(Ljava/lang/Object;)Ljava/lang/String;", 0, 0, 4), 30));
                        return AbstractC0179eu.m1472v(a83.f116a);
                    } catch (IllegalArgumentException e) {
                        throw new sd2("INVALID_ARGUMENT", "Unknown log level.", false, null, e, 12);
                    }
                } catch (Throwable th3) {
                    return AbstractC0179eu.m1471u(th3);
                }
            case 3:
                objArr.getClass();
                sp0.m4929a0(0, objArr);
                ((df2) vn1Var.f12033d).f2023a.getClass();
                return 10L;
            case 4:
                objArr.getClass();
                sp0.m4929a0(0, objArr);
                ((df2) vn1Var.f12033d).f2023a.getClass();
                return 128;
            case 5:
                objArr.getClass();
                try {
                    sp0.m4929a0(0, objArr);
                    synchronized (vn1Var.f12039j) {
                        ci2 ci2Var = (ci2) vn1Var.f12040k;
                        if (ci2Var != null) {
                            vn1Var.f12040k = null;
                            jsObjectM1876X = gf1.m1876X(ci2Var, (jh2) vn1Var.f12038i);
                            break;
                        }
                    }
                    return AbstractC0179eu.m1472v(jsObjectM1876X);
                } catch (Throwable th4) {
                    return AbstractC0179eu.m1471u(th4);
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                objArr.getClass();
                try {
                    sp0.m4929a0(1, objArr);
                    String strM4941g0 = sp0.m4941g0("referenceId", objArr[0]);
                    jh2 jh2Var = (jh2) vn1Var.f12038i;
                    jh2Var.getClass();
                    synchronized (jh2Var.f5035a) {
                        z = jh2Var.f5036b.remove(strM4941g0) != null;
                    }
                    return AbstractC0179eu.m1472v(Boolean.valueOf(z));
                } catch (Throwable th5) {
                    return AbstractC0179eu.m1471u(th5);
                }
            case 7:
                objArr.getClass();
                try {
                    sp0.m4929a0(0, objArr);
                    return AbstractC0179eu.m1472v(vn1Var.m5736r());
                } catch (Throwable th6) {
                    return AbstractC0179eu.m1471u(th6);
                }
            case 8:
                objArr.getClass();
                try {
                    sp0.m4929a0(0, objArr);
                    return AbstractC0179eu.m1472v(vn1Var.m5743y());
                } catch (Throwable th7) {
                    return AbstractC0179eu.m1471u(th7);
                }
            case 9:
                objArr.getClass();
                try {
                    sp0.m4929a0(0, objArr);
                    return AbstractC0179eu.m1472v(vn1Var.m5734p());
                } catch (Throwable th8) {
                    return AbstractC0179eu.m1471u(th8);
                }
            case 10:
                objArr.getClass();
                af2.f186a.m150e(vn1Var, ph2.f8351h, objArr);
                return a83.f116a;
            case 11:
                objArr.getClass();
                af2.f186a.m150e(vn1Var, ph2.f8352i, objArr);
                return a83.f116a;
            case 12:
                objArr.getClass();
                af2.f186a.m150e(vn1Var, ph2.f8352i, objArr);
                return a83.f116a;
            case 13:
                objArr.getClass();
                af2.f186a.m150e(vn1Var, ph2.f8353j, objArr);
                return a83.f116a;
            case 14:
                objArr.getClass();
                af2.f186a.m150e(vn1Var, ph2.f8354k, objArr);
                return a83.f116a;
            default:
                objArr.getClass();
                try {
                    sp0.m4929a0(1, objArr);
                    String strM4941g02 = sp0.m4941g0("name", objArr[0]);
                    rp0.m4531Q(strM4941g02);
                    vn1Var.m5741w(strM4941g02);
                    Map mapSingletonMap = Collections.singletonMap("className", strM4941g02);
                    mapSingletonMap.getClass();
                    return AbstractC0179eu.m1472v(new JsObject(mapSingletonMap));
                } catch (Throwable th9) {
                    return AbstractC0179eu.m1471u(th9);
                }
        }
    }
}
