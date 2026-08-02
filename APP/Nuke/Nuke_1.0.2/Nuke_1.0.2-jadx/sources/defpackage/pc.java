package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Collection;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        int i = this.h;
        boolean zBooleanValue = true;
        a83 a83Var = a83.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                sc scVar = (sc) obj5;
                id idVar = (id) obj4;
                in0 in0Var = (in0) obj3;
                y62 y62Var = (y62) obj2;
                gd gdVar = (gd) obj;
                te.p0(gdVar, scVar.c);
                nx1 nx1Var = gdVar.e;
                Object objA = sc.a(scVar, nx1Var.getValue());
                if (!t11.l(objA, nx1Var.getValue())) {
                    scVar.c.i.setValue(objA);
                    idVar.i.setValue(objA);
                    if (in0Var != null) {
                        in0Var.j(scVar);
                    }
                    gdVar.i.setValue(Boolean.FALSE);
                    gdVar.d.a();
                    y62Var.h = true;
                } else if (in0Var != null) {
                    in0Var.j(scVar);
                }
                return a83Var;
            case 1:
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                s81.a(s81Var, null, ci0.h, 3);
                s81.a(s81Var, null, new kw(1816224445, true, new b81((Context) obj5, (kx1) obj4, (xk1) obj3, (xk1) obj2)), 3);
                return a83Var;
            case 2:
                t91 t91Var = (t91) obj5;
                o03 o03Var = (o03) obj4;
                k03 k03Var = (k03) obj3;
                xx0 xx0Var = (xx0) obj2;
                if (t91Var.b()) {
                    sz0 sz0Var = t91Var.d;
                    n10 n10Var = t91Var.v;
                    n10 n10Var2 = t91Var.w;
                    o72 o72Var = new o72();
                    m0 m0Var = new m0(sz0Var, n10Var, o72Var);
                    v02 v02Var = o03Var.a;
                    v02Var.f(k03Var, xx0Var, m0Var, n10Var2);
                    t03 t03Var = new t03(o03Var, v02Var);
                    o03Var.b.set(t03Var);
                    o72Var.i = t03Var;
                    t91Var.e = t03Var;
                }
                return new ka(1);
            case 3:
                z62 z62Var = (z62) obj5;
                n50 n50Var = (n50) obj2;
                gd gdVar2 = (gd) obj;
                float fFloatValue = ((Number) gdVar2.e.getValue()).floatValue() - z62Var.h;
                float fA = ((em2) obj4).a(fFloatValue);
                z62Var.h = ((Number) gdVar2.e.getValue()).floatValue();
                ((z62) obj3).h = ((Number) gdVar2.a.b.j(gdVar2.f)).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    gdVar2.i.setValue(Boolean.FALSE);
                    gdVar2.d.a();
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
                long j = cz0Var.c;
                zk1 zk1Var = cz0Var.a;
                if (j == Long.MIN_VALUE || z62Var2.h != te.F(j20Var.g())) {
                    cz0Var.c = jLongValue;
                    Object[] objArr = zk1Var.h;
                    int i2 = zk1Var.j;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((az0) objArr[i3]).m = true;
                    }
                    z62Var2.h = te.F(j20Var.g());
                }
                float f = z62Var2.h;
                if (f == 0.0f) {
                    Object[] objArr2 = zk1Var.h;
                    int i4 = zk1Var.j;
                    for (int i5 = 0; i5 < i4; i5++) {
                        az0 az0Var = (az0) objArr2[i5];
                        az0Var.j.setValue(az0Var.k.c);
                        az0Var.m = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - cz0Var.c) / f);
                    Object[] objArr3 = zk1Var.h;
                    int i6 = zk1Var.j;
                    boolean z = true;
                    for (int i7 = 0; i7 < i6; i7++) {
                        az0 az0Var2 = (az0) objArr3[i7];
                        if (!az0Var2.l) {
                            az0Var2.o.b.setValue(Boolean.FALSE);
                            if (az0Var2.m) {
                                az0Var2.m = false;
                                az0Var2.n = j2;
                            }
                            long j3 = j2 - az0Var2.n;
                            az0Var2.j.setValue(az0Var2.k.b(j3));
                            az0Var2.l = az0Var2.k.g(j3);
                        }
                        if (!az0Var2.l) {
                            z = false;
                        }
                    }
                    cz0Var.d.setValue(Boolean.valueOf(!z));
                }
                return a83Var;
            case 5:
                j81 j81Var = (j81) obj5;
                j81Var.c = new f90((z71) obj4, (hw2) obj3, (q22) obj2);
                return new f8(7, j81Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                mn0 mn0Var = (mn0) obj4;
                yf1 yf1Var = (yf1) obj3;
                String str = (String) obj2;
                if ((obj5 instanceof Collection) && ((Collection) obj5).isEmpty()) {
                    obj5 = null;
                }
                if (obj5 != null) {
                    zBooleanValue = ((Boolean) mn0Var.g(obj5, obj)).booleanValue();
                    if (yf1Var.d != xf1.j && tp0.k.ordinal() <= 0) {
                        String strA = j93.a(obj5);
                        String strB0 = strA != null ? wv2.b0(strA.toString(), " (Kotlin reflection is not available)", "") : null;
                        String strB02 = obj != null ? wv2.b0(obj.toString(), " (Kotlin reflection is not available)", "") : null;
                        StringBuilder sbO = vi0.o("[FILTER] [", zBooleanValue ? "HIT" : "MISS", "] ", str, ": ");
                        sbO.append(strB0);
                        sbO.append(" [RESOLVED] ");
                        sbO.append(strB02);
                        String string = sbO.toString();
                        if (tp0.k.ordinal() <= 0) {
                            Log.d("KavaRef", string, null);
                        }
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                z62 z62Var3 = (z62) obj5;
                si1 si1Var = (si1) obj4;
                gm2 gm2Var = (gm2) obj3;
                h9 h9Var = (h9) obj2;
                gd gdVar3 = (gd) obj;
                nx1 nx1Var2 = gdVar3.e;
                xm0 xm0Var = gdVar3.d;
                nx1 nx1Var3 = gdVar3.i;
                float fFloatValue2 = ((Number) nx1Var2.getValue()).floatValue() - z62Var3.h;
                if (rp0.S(fFloatValue2)) {
                    if (((Boolean) h9Var.j(Float.valueOf(z62Var3.h))).booleanValue()) {
                        nx1Var3.setValue(Boolean.FALSE);
                        xm0Var.a();
                    }
                } else if (rp0.S(fFloatValue2 - si1Var.e(gm2Var, fFloatValue2))) {
                    z62Var3.h += fFloatValue2;
                    if (((Boolean) h9Var.j(Float.valueOf(z62Var3.h))).booleanValue()) {
                    }
                } else {
                    nx1Var3.setValue(Boolean.FALSE);
                    xm0Var.a();
                }
                return a83Var;
        }
    }
}
