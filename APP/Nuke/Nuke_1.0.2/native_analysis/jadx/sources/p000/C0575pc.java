package p000;

import android.content.Context;
import android.util.Log;
import java.util.Collection;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: pc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0575pc implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8249h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f8250i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f8251j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f8252k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f8253l;

    public /* synthetic */ C0575pc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f8249h = i;
        this.f8250i = obj;
        this.f8251j = obj2;
        this.f8252k = obj3;
        this.f8253l = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        int i = this.f8249h;
        boolean zBooleanValue = true;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f8253l;
        Object obj3 = this.f8252k;
        Object obj4 = this.f8251j;
        Object obj5 = this.f8250i;
        switch (i) {
            case 0:
                C0689sc c0689sc = (C0689sc) obj5;
                C0310id c0310id = (C0310id) obj4;
                in0 in0Var = (in0) obj3;
                y62 y62Var = (y62) obj2;
                C0236gd c0236gd = (C0236gd) obj;
                AbstractC0731te.m5229p0(c0236gd, c0689sc.f10024c);
                nx1 nx1Var = c0236gd.f3404e;
                Object objM4785a = C0689sc.m4785a(c0689sc, nx1Var.getValue());
                if (!t11.m5086l(objM4785a, nx1Var.getValue())) {
                    c0689sc.f10024c.f4561i.setValue(objM4785a);
                    c0310id.f4561i.setValue(objM4785a);
                    if (in0Var != null) {
                        in0Var.mo5j(c0689sc);
                    }
                    c0236gd.f3408i.setValue(Boolean.FALSE);
                    c0236gd.f3403d.mo6a();
                    y62Var.f13324h = true;
                } else if (in0Var != null) {
                    in0Var.mo5j(c0689sc);
                }
                return a83Var;
            case 1:
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                s81.m4760a(s81Var, null, ci0.f1552h, 3);
                s81.m4760a(s81Var, null, new C0402kw(1816224445, true, new b81((Context) obj5, (kx1) obj4, (xk1) obj3, (xk1) obj2)), 3);
                return a83Var;
            case 2:
                t91 t91Var = (t91) obj5;
                o03 o03Var = (o03) obj4;
                k03 k03Var = (k03) obj3;
                xx0 xx0Var = (xx0) obj2;
                if (t91Var.m5144b()) {
                    sz0 sz0Var = t91Var.f10625d;
                    n10 n10Var = t91Var.f10643v;
                    n10 n10Var2 = t91Var.f10644w;
                    o72 o72Var = new o72();
                    C0444m0 c0444m0 = new C0444m0(sz0Var, n10Var, o72Var);
                    v02 v02Var = o03Var.f7408a;
                    v02Var.mo2881f(k03Var, xx0Var, c0444m0, n10Var2);
                    t03 t03Var = new t03(o03Var, v02Var);
                    o03Var.f7409b.set(t03Var);
                    o72Var.f7574i = t03Var;
                    t91Var.f10626e = t03Var;
                }
                return new C0380ka(1);
            case 3:
                z62 z62Var = (z62) obj5;
                n50 n50Var = (n50) obj2;
                C0236gd c0236gd2 = (C0236gd) obj;
                float fFloatValue = ((Number) c0236gd2.f3404e.getValue()).floatValue() - z62Var.f13745h;
                float fMo963a = ((em2) obj4).mo963a(fFloatValue);
                z62Var.f13745h = ((Number) c0236gd2.f3404e.getValue()).floatValue();
                ((z62) obj3).f13745h = ((Number) c0236gd2.f3400a.f7005b.mo5j(c0236gd2.f3405f)).floatValue();
                if (Math.abs(fFloatValue - fMo963a) > 0.5f) {
                    c0236gd2.f3408i.setValue(Boolean.FALSE);
                    c0236gd2.f3403d.mo6a();
                }
                n50Var.getClass();
                return a83Var;
            case 4:
                cz0 cz0Var = (cz0) obj4;
                z62 z62Var2 = (z62) obj3;
                j20 j20Var = (j20) obj2;
                long jLongValue = ((Long) obj).longValue();
                gu2 gu2Var = (gu2) ((xk1) obj5).getValue();
                long jLongValue2 = gu2Var != null ? ((Number) gu2Var.getValue()).longValue() : jLongValue;
                long j = cz0Var.f1790c;
                zk1 zk1Var = cz0Var.f1788a;
                if (j == Long.MIN_VALUE || z62Var2.f13745h != AbstractC0731te.m5177F(j20Var.mo705g())) {
                    cz0Var.f1790c = jLongValue;
                    Object[] objArr = zk1Var.f13934h;
                    int i2 = zk1Var.f13936j;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((az0) objArr[i3]).f450m = true;
                    }
                    z62Var2.f13745h = AbstractC0731te.m5177F(j20Var.mo705g());
                }
                float f = z62Var2.f13745h;
                if (f == 0.0f) {
                    Object[] objArr2 = zk1Var.f13934h;
                    int i4 = zk1Var.f13936j;
                    for (int i5 = 0; i5 < i4; i5++) {
                        az0 az0Var = (az0) objArr2[i5];
                        az0Var.f447j.setValue(az0Var.f448k.f1779c);
                        az0Var.f450m = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - cz0Var.f1790c) / f);
                    Object[] objArr3 = zk1Var.f13934h;
                    int i6 = zk1Var.f13936j;
                    boolean z = true;
                    for (int i7 = 0; i7 < i6; i7++) {
                        az0 az0Var2 = (az0) objArr3[i7];
                        if (!az0Var2.f449l) {
                            az0Var2.f452o.f1789b.setValue(Boolean.FALSE);
                            if (az0Var2.f450m) {
                                az0Var2.f450m = false;
                                az0Var2.f451n = j2;
                            }
                            long j3 = j2 - az0Var2.f451n;
                            az0Var2.f447j.setValue(az0Var2.f448k.mo915b(j3));
                            az0Var2.f449l = az0Var2.f448k.m1335g(j3);
                        }
                        if (!az0Var2.f449l) {
                            z = false;
                        }
                    }
                    cz0Var.f1791d.setValue(Boolean.valueOf(!z));
                }
                return a83Var;
            case 5:
                j81 j81Var = (j81) obj5;
                j81Var.f4915c = new f90((z71) obj4, (hw2) obj3, (q22) obj2);
                return new C0194f8(7, j81Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                mn0 mn0Var = (mn0) obj4;
                yf1 yf1Var = (yf1) obj3;
                String str = (String) obj2;
                if ((obj5 instanceof Collection) && ((Collection) obj5).isEmpty()) {
                    obj5 = null;
                }
                if (obj5 != null) {
                    zBooleanValue = ((Boolean) mn0Var.mo12g(obj5, obj)).booleanValue();
                    if (yf1Var.f13437d != xf1.f13008j && tp0.f10884k.ordinal() <= 0) {
                        String strM2472a = j93.m2472a(obj5);
                        String strM6010b0 = strM2472a != null ? wv2.m6010b0(strM2472a.toString(), " (Kotlin reflection is not available)", "") : null;
                        String strM6010b02 = obj != null ? wv2.m6010b0(obj.toString(), " (Kotlin reflection is not available)", "") : null;
                        StringBuilder sbM5696o = vi0.m5696o("[FILTER] [", zBooleanValue ? "HIT" : "MISS", "] ", str, ": ");
                        sbM5696o.append(strM6010b0);
                        sbM5696o.append(" [RESOLVED] ");
                        sbM5696o.append(strM6010b02);
                        String string = sbM5696o.toString();
                        if (tp0.f10884k.ordinal() <= 0) {
                            Log.d("KavaRef", string, null);
                        }
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                z62 z62Var3 = (z62) obj5;
                si1 si1Var = (si1) obj4;
                gm2 gm2Var = (gm2) obj3;
                C0269h9 c0269h9 = (C0269h9) obj2;
                C0236gd c0236gd3 = (C0236gd) obj;
                nx1 nx1Var2 = c0236gd3.f3404e;
                xm0 xm0Var = c0236gd3.f3403d;
                nx1 nx1Var3 = c0236gd3.f3408i;
                float fFloatValue2 = ((Number) nx1Var2.getValue()).floatValue() - z62Var3.f13745h;
                if (rp0.m4533S(fFloatValue2)) {
                    if (((Boolean) c0269h9.mo5j(Float.valueOf(z62Var3.f13745h))).booleanValue()) {
                        nx1Var3.setValue(Boolean.FALSE);
                        xm0Var.mo6a();
                    }
                } else if (rp0.m4533S(fFloatValue2 - si1Var.m4870e(gm2Var, fFloatValue2))) {
                    z62Var3.f13745h += fFloatValue2;
                    if (((Boolean) c0269h9.mo5j(Float.valueOf(z62Var3.f13745h))).booleanValue()) {
                    }
                } else {
                    nx1Var3.setValue(Boolean.FALSE);
                    xm0Var.mo6a();
                }
                return a83Var;
        }
    }
}
