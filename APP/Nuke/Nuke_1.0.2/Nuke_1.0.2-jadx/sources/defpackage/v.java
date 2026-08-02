package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ v(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: nc0.i0(nc0, long, long, long, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0677  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        int i;
        cl clVar;
        boolean z;
        long j;
        sp spVar;
        b5 b5Var;
        float f;
        float f2;
        long jU;
        String strConcat;
        StringBuilder sb;
        int i2;
        x81 x81Var;
        Object x92Var;
        Object x92Var2;
        Activity activity;
        List listR;
        t91 t91Var;
        int i3 = 8;
        int i4 = 6;
        float f3 = 0.0f;
        x81 x81Var2 = null;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        switch (this.h) {
            case 0:
                by0 by0Var = (by0) this.i;
                jo2 jo2Var = (jo2) obj;
                jo2Var.getClass();
                b0.d.getClass();
                String str = b0.h;
                String str2 = by0Var.a;
                String lowerCase = jo2Var.b.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str3 = jo2Var.c;
                StringBuilder sbO = vi0.o("AI reply send failed: talker=", str2, ", code=", lowerCase, ", reason=");
                sbO.append(str3);
                hg3.d(str, sbO.toString());
                return a83.a;
            case 1:
                return obj == ((k2) this.i) ? "(this Collection)" : String.valueOf(obj);
            case 2:
                zy1 zy1Var = (zy1) this.i;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == zy1Var ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != zy1Var ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 3:
                p5 p5Var = (p5) this.i;
                p5Var.x.g((oy2) obj, p40.p(p5Var, r7.b));
                return a83.a;
            case 4:
                ((zn2) obj).a(gn2.a, new fn2(rr0.h, ((ws1) this.i).a(), en2.i, true));
                return a83.a;
            case 5:
                return new f8(3, (gk) this.i);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ql qlVar = (ql) this.i;
                qo qoVar = (qo) obj;
                if (qoVar.b() * qlVar.y < 0.0f || gr2.b(qoVar.h.d()) <= 0.0f) {
                    return qoVar.a(new w(23));
                }
                final float fMin = Math.min(za0.b(qlVar.y, 0.0f) ? 1.0f : (float) Math.ceil(qoVar.b() * qlVar.y), (float) Math.ceil(gr2.b(qoVar.h.d()) / 2.0f));
                final float f4 = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qoVar.h.d() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qoVar.h.d() >> 32)) - fMin)) << 32);
                float f5 = fMin * 2.0f;
                boolean z3 = f5 > gr2.b(qoVar.h.d());
                te teVarA = qlVar.A.a(qoVar.h.d(), qoVar.h.getLayoutDirection(), qoVar);
                if (!(teVarA instanceof sv1)) {
                    if (!(teVarA instanceof uv1)) {
                        boolean z4 = z3;
                        if (!(teVarA instanceof tv1)) {
                            c80.s();
                            return null;
                        }
                        final ft2 ft2Var = qlVar.z;
                        final long j2 = z4 ? 0L : jFloatToRawIntBits;
                        final long jD = z4 ? qoVar.h.d() : jFloatToRawIntBits2;
                        final op0 xv2Var = z4 ? xi0.h : new xv2(fMin, 0.0f, 0, 0, 30);
                        return qoVar.a(new in0() { // from class: nl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.in0
                            public final Object j(Object obj2) {
                                t61 t61Var = (t61) obj2;
                                t61Var.a();
                                nc0.F(t61Var, ft2Var, j2, jD, 0.0f, xv2Var, 104);
                                return a83.a;
                            }
                        });
                    }
                    final ft2 ft2Var2 = qlVar.z;
                    db2 db2Var = ((uv1) teVarA).j;
                    if (p7.z(db2Var)) {
                        final long j3 = db2Var.e;
                        final xv2 xv2Var2 = new xv2(fMin, 0.0f, 0, 0, 30);
                        final boolean z5 = z3;
                        return qoVar.a(new in0() { // from class: ol
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.in0
                            public final Object j(Object obj2) throws Throwable {
                                long j4;
                                t61 t61Var = (t61) obj2;
                                t61Var.a();
                                sp spVar2 = t61Var.h;
                                boolean z6 = z5;
                                an anVar = ft2Var2;
                                long j5 = j3;
                                if (z6) {
                                    nc0.s0(t61Var, anVar, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f6 = f4;
                                    if (fIntBitsToFloat < f6) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (spVar2.d() >> 32));
                                        float f7 = fMin;
                                        float f8 = fIntBitsToFloat2 - f7;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (spVar2.d() & 4294967295L)) - f7;
                                        b5 b5Var2 = spVar2.i;
                                        long jU2 = b5Var2.u();
                                        b5Var2.q().l();
                                        try {
                                            ((b5) ((n4) b5Var2.i).i).q().f(f7, f7, f8, fIntBitsToFloat3, 0);
                                            j4 = jU2;
                                            try {
                                                nc0.s0(t61Var, anVar, 0L, 0L, j5, null, 246);
                                                vi0.r(b5Var2, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                vi0.r(b5Var2, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4 = jU2;
                                        }
                                    } else {
                                        nc0.s0(t61Var, anVar, jFloatToRawIntBits, jFloatToRawIntBits2, fg1.P(f6, j5), xv2Var2, 208);
                                    }
                                }
                                return a83.a;
                            }
                        });
                    }
                    boolean z6 = z3;
                    if (qlVar.x == null) {
                        qlVar.x = new ml();
                    }
                    ml mlVar = qlVar.x;
                    mlVar.getClass();
                    y9 y9VarA = mlVar.d;
                    if (y9VarA == null) {
                        y9VarA = aa.a();
                        mlVar.d = y9VarA;
                    }
                    y9VarA.g();
                    y9.b(y9VarA, db2Var);
                    if (!z6) {
                        y9 y9VarA2 = aa.a();
                        y9.b(y9VarA2, new db2(fMin, fMin, (db2Var.c - db2Var.a) - fMin, (db2Var.d - db2Var.b) - fMin, fg1.P(fMin, db2Var.e), fg1.P(fMin, db2Var.f), fg1.P(fMin, db2Var.g), fg1.P(fMin, db2Var.h)));
                        y9VarA.f(y9VarA, y9VarA2, 0);
                    }
                    return qoVar.a(new d2(i4, y9VarA, ft2Var2));
                }
                ft2 ft2Var3 = qlVar.z;
                sv1 sv1Var = (sv1) teVarA;
                y9 y9Var = sv1Var.j;
                if (z3) {
                    return qoVar.a(new d2(7, sv1Var, ft2Var3));
                }
                if (ft2Var3 != null) {
                    clVar = new cl(ju.b(1.0f, ft2Var3.a), 5);
                    i = 1;
                } else {
                    i = 0;
                    clVar = null;
                }
                o62 o62VarD = y9Var.d();
                float f6 = o62VarD.b;
                float f7 = o62VarD.a;
                if (qlVar.x == null) {
                    qlVar.x = new ml();
                }
                ml mlVar2 = qlVar.x;
                mlVar2.getClass();
                y9 y9VarA3 = mlVar2.d;
                if (y9VarA3 == null) {
                    y9VarA3 = aa.a();
                    mlVar2.d = y9VarA3;
                }
                y9VarA3.g();
                ux1 ux1Var = ux1.h;
                float f8 = o62VarD.a;
                float f9 = o62VarD.d;
                float f10 = o62VarD.c;
                float f11 = o62VarD.b;
                if (Float.isNaN(f8) || Float.isNaN(f11) || Float.isNaN(f10) || Float.isNaN(f9)) {
                    aa.c("Invalid rectangle, make sure no value is NaN");
                }
                if (y9VarA3.b == null) {
                    y9VarA3.b = new RectF();
                }
                RectF rectF = y9VarA3.b;
                rectF.getClass();
                rectF.set(f8, f11, f10, f9);
                Path path = y9VarA3.a;
                RectF rectF2 = y9VarA3.b;
                rectF2.getClass();
                path.addRect(rectF2, aa.b(ux1Var));
                y9VarA3.f(y9VarA3, y9Var, 0);
                o72 o72Var = new o72();
                long jCeil = (((long) ((int) Math.ceil(o62VarD.d - f6))) & 4294967295L) | (((long) ((int) Math.ceil(o62VarD.c - f7))) << 32);
                ml mlVar3 = qlVar.x;
                mlVar3.getClass();
                d9 d9VarB = mlVar3.a;
                f6 f6VarF = mlVar3.b;
                ix0 ix0Var = d9VarB != null ? new ix0(d9VarB.a()) : null;
                if (ix0Var != null && ix0Var.a == 0) {
                    z = true;
                } else {
                    ix0 ix0Var2 = d9VarB != null ? new ix0(d9VarB.a()) : null;
                    if (ix0Var2 == null || i != ix0Var2.a) {
                        z = false;
                    }
                }
                try {
                    try {
                        if (d9VarB != null && f6VarF != null) {
                            j = jCeil;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (qoVar.h.d() >> 32));
                            Bitmap bitmap = d9VarB.a;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (qoVar.h.d() & 4294967295L)) > bitmap.getHeight() || !z) {
                            }
                            spVar = mlVar3.c;
                            if (spVar == null) {
                                spVar = new sp();
                                mlVar3.c = spVar;
                            }
                            b5Var = spVar.i;
                            rp rpVar = spVar.h;
                            long jQ0 = s11.q0(j);
                            d61 layoutDirection = qoVar.h.getLayoutDirection();
                            sp spVar2 = spVar;
                            e70 e70Var = rpVar.a;
                            cl clVar2 = clVar;
                            d61 d61Var = rpVar.b;
                            qp qpVar = rpVar.c;
                            long j4 = rpVar.d;
                            rpVar.a = qoVar;
                            rpVar.b = layoutDirection;
                            rpVar.c = f6VarF;
                            rpVar.d = jQ0;
                            f6VarF.l();
                            nc0.i0(spVar2, ju.b, 0L, jQ0, 58);
                            f = -f7;
                            f2 = -f6;
                            ((n4) b5Var.i).C(f, f2);
                            nc0.v(spVar2, sv1Var.j, ft2Var3, 0.0f, new xv2(f5, 0.0f, 0, 0, 30), 52);
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (spVar2.d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (spVar2.d() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (spVar2.d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (spVar2.d() & 4294967295L));
                            long jA0 = spVar2.a0();
                            d9 d9Var = d9VarB;
                            f6 f6Var = f6VarF;
                            jU = b5Var.u();
                            b5Var.q().l();
                            y9 y9Var2 = y9VarA3;
                            ((n4) b5Var.i).A(fIntBitsToFloat2, fIntBitsToFloat3, jA0);
                            nc0.v(spVar2, y9Var2, ft2Var3, 0.0f, null, 28);
                            ((n4) b5Var.i).C(-f, -f2);
                            f6Var.i();
                            rpVar.a = e70Var;
                            rpVar.b = d61Var;
                            rpVar.c = qpVar;
                            rpVar.d = j4;
                            d9Var.a.prepareToDraw();
                            o72Var.i = d9Var;
                            return qoVar.a(new pl(o62VarD, o72Var, j, clVar2));
                        }
                        j = jCeil;
                        ((n4) b5Var.i).A(fIntBitsToFloat2, fIntBitsToFloat3, jA0);
                        nc0.v(spVar2, y9Var2, ft2Var3, 0.0f, null, 28);
                        ((n4) b5Var.i).C(-f, -f2);
                        f6Var.i();
                        rpVar.a = e70Var;
                        rpVar.b = d61Var;
                        rpVar.c = qpVar;
                        rpVar.d = j4;
                        d9Var.a.prepareToDraw();
                        o72Var.i = d9Var;
                        return qoVar.a(new pl(o62VarD, o72Var, j, clVar2));
                    } finally {
                        b5Var.q().i();
                        b5Var.E(jU);
                    }
                    nc0.v(spVar2, sv1Var.j, ft2Var3, 0.0f, new xv2(f5, 0.0f, 0, 0, 30), 52);
                    float fIntBitsToFloat22 = (Float.intBitsToFloat((int) (spVar2.d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (spVar2.d() >> 32));
                    float fIntBitsToFloat32 = (Float.intBitsToFloat((int) (spVar2.d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (spVar2.d() & 4294967295L));
                    long jA02 = spVar2.a0();
                    d9 d9Var2 = d9VarB;
                    f6 f6Var2 = f6VarF;
                    jU = b5Var.u();
                    b5Var.q().l();
                    y9 y9Var22 = y9VarA3;
                } catch (Throwable th) {
                    ((n4) b5Var.i).C(-f, -f2);
                    throw th;
                }
                d9VarB = p7.b((int) (j >> 32), (int) (j & 4294967295L), i);
                mlVar3.a = d9VarB;
                f6VarF = rp0.F(d9VarB);
                mlVar3.b = f6VarF;
                spVar = mlVar3.c;
                if (spVar == null) {
                }
                b5Var = spVar.i;
                rp rpVar2 = spVar.h;
                long jQ02 = s11.q0(j);
                d61 layoutDirection2 = qoVar.h.getLayoutDirection();
                sp spVar22 = spVar;
                e70 e70Var2 = rpVar2.a;
                cl clVar22 = clVar;
                d61 d61Var2 = rpVar2.b;
                qp qpVar2 = rpVar2.c;
                long j42 = rpVar2.d;
                rpVar2.a = qoVar;
                rpVar2.b = layoutDirection2;
                rpVar2.c = f6VarF;
                rpVar2.d = jQ02;
                f6VarF.l();
                nc0.i0(spVar22, ju.b, 0L, jQ02, 58);
                f = -f7;
                f2 = -f6;
                ((n4) b5Var.i).C(f, f2);
                break;
            case 7:
                return Boolean.valueOf(((Constructor) obj).getParameterTypes().length == ((Object[]) this.i).length);
            case 8:
                ((dd1) this.i).a();
                return a83.a;
            case 9:
                rd0 rd0Var = (rd0) obj;
                String str4 = ((rd0) this.i) == rd0Var ? " > " : "   ";
                if (rd0Var instanceof ev) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    ev evVar = (ev) rd0Var;
                    sb.append(evVar.a.i.length());
                    sb.append(", newCursorPosition=");
                    i2 = evVar.b;
                } else {
                    if (!(rd0Var instanceof lp2)) {
                        if (rd0Var instanceof kp2) {
                            strConcat = ((kp2) rd0Var).toString();
                        } else if (rd0Var instanceof z60) {
                            strConcat = ((z60) rd0Var).toString();
                        } else if (rd0Var instanceof a70) {
                            strConcat = ((a70) rd0Var).toString();
                        } else if (rd0Var instanceof mp2) {
                            strConcat = ((mp2) rd0Var).toString();
                        } else if (rd0Var instanceof ej0) {
                            strConcat = "FinishComposingTextCommand()";
                        } else if (rd0Var instanceof y60) {
                            strConcat = "DeleteAllCommand()";
                        } else {
                            String strC = d72.a(rd0Var.getClass()).c();
                            if (strC == null) {
                                strC = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(strC);
                        }
                        return str4.concat(strConcat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    lp2 lp2Var = (lp2) rd0Var;
                    sb.append(lp2Var.a.i.length());
                    sb.append(", newCursorPosition=");
                    i2 = lp2Var.b;
                }
                strConcat = vi0.m(sb, i2, ')');
                return str4.concat(strConcat);
            case 10:
                l63 l63Var = (l63) obj;
                return ((yl0) this.i).a(new l63(null, l63Var.b, l63Var.c, l63Var.d, l63Var.e)).h;
            case 11:
                return new f8(i4, (y71) this.i);
            case 12:
                return new f8(i3, (e81) this.i);
            case 13:
                Object obj2 = this.i;
                ((Integer) obj).getClass();
                return obj2;
            case 14:
                d91 d91Var = (d91) this.i;
                float f12 = -((Float) obj).floatValue();
                if ((f12 >= 0.0f || d91Var.c()) && (f12 <= 0.0f || d91Var.a())) {
                    if (Math.abs(d91Var.h) > 0.5f) {
                        nz0.c("entered drag with non-zero pending scroll");
                    }
                    d91Var.d = true;
                    float f13 = d91Var.h + f12;
                    d91Var.h = f13;
                    if (Math.abs(f13) > 0.5f) {
                        float f14 = d91Var.h;
                        int iRound = Math.round(f14);
                        x81 x81VarF = ((x81) d91Var.f.getValue()).f(iRound, !d91Var.b);
                        if (x81VarF == null || (x81Var = d91Var.c) == null) {
                            x81Var2 = x81VarF;
                            if (x81Var2 == null) {
                                d91Var.f(x81Var2, d91Var.b, true);
                                d91Var.v.setValue(a83.a);
                                d91Var.h(f14 - d91Var.h, x81Var2);
                            } else {
                                r61 r61Var = d91Var.k;
                                if (r61Var != null) {
                                    r61Var.k();
                                }
                                d91Var.h(f14 - d91Var.h, d91Var.g());
                            }
                        } else {
                            x81 x81VarF2 = x81Var.f(iRound, true);
                            if (x81VarF2 != null) {
                                d91Var.c = x81VarF2;
                                x81Var2 = x81VarF;
                            }
                            if (x81Var2 == null) {
                            }
                        }
                    }
                    if (Math.abs(d91Var.h) > 0.5f) {
                        f12 -= d91Var.h;
                        d91Var.h = 0.0f;
                    }
                    f3 = f12;
                }
                return Float.valueOf(-f3);
            case 15:
                fc2 fc2Var = (fc2) this.i;
                return Boolean.valueOf(fc2Var != null ? fc2Var.b(obj) : true);
            case 16:
                return ((cf1) this.i).b(((Integer) obj).intValue());
            case 17:
                ((kl1) this.i).f(null);
                return a83.a;
            case 18:
                vj[] vjVarArr = (vj[]) this.i;
                jg3 jg3Var = (jg3) obj;
                a83 a83Var = a83.a;
                jg3Var.getClass();
                Context context = (Context) jg3Var.a()[0];
                if (context != null) {
                    pp1 pp1Var = pp1.a;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    up0.i = applicationContext;
                    ClassLoader classLoader = context.getClassLoader();
                    classLoader.getClass();
                    up0.j = classLoader;
                    if (pp1.f.compareAndSet(false, true)) {
                        SystemClock.elapsedRealtime();
                        try {
                            op0.p(vjVarArr, te.S(pp1.d()));
                            x92Var = a83Var;
                        } catch (Throwable th2) {
                            x92Var = new x92(th2);
                        }
                        Throwable thA = y92.a(x92Var);
                        if (thA != null) {
                            String str5 = up0.m;
                            if (str5 == null) {
                                t11.S("hostProcess");
                                throw null;
                            }
                            String string = ("Secondary process hook installation failed in " + str5 + ": " + fg1.Q(thA)).toString();
                            try {
                                XposedBridge.log("[NukeCore]" + string);
                                x92Var2 = a83Var;
                            } catch (Throwable th3) {
                                x92Var2 = new x92(th3);
                            }
                            if (x92Var2 instanceof x92) {
                                Log.println(6, "NukeCore", string);
                            }
                        }
                    }
                }
                return a83Var;
            case 19:
                View view = (View) this.i;
                ((ba0) obj).getClass();
                Context context2 = view.getContext();
                context2.getClass();
                while (true) {
                    if (context2 instanceof Activity) {
                        activity = (Activity) context2;
                    } else if (context2 instanceof ContextWrapper) {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                        context2.getClass();
                    } else {
                        activity = null;
                    }
                }
                Window window = activity != null ? activity.getWindow() : null;
                if (window == null) {
                    return new ka(2);
                }
                mb3 mb3Var = new mb3(window, view);
                df3 df3Var = (df3) mb3Var.a;
                int iA = df3Var.a();
                rd3.a(window, false);
                df3Var.d(2);
                switch (df3Var.a) {
                    case 0:
                        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
                            if ((519 & i5) != 0) {
                                if (i5 == 1) {
                                    df3Var.e(4);
                                } else if (i5 == 2) {
                                    df3Var.e(2);
                                } else if (i5 == 8) {
                                    ((hh1) ((hh1) df3Var.c).i).A();
                                }
                            }
                        }
                        break;
                    default:
                        ((WindowInsetsController) df3Var.c).hide(519);
                        break;
                }
                return new xp1(mb3Var, iA, window);
            case AIChatConfig.MaxContextRounds /* 20 */:
                yo2 yo2Var = (yo2) this.i;
                int iIntValue = ((Integer) obj).intValue();
                return yo2Var.e(iIntValue) + ": " + yo2Var.j(iIntValue).b();
            case 21:
                o72 o72Var2 = (o72) this.i;
                d43 d43Var = (d43) obj;
                d43Var.getClass();
                j81 j81Var = ((f43) d43Var).v;
                List list = (List) o72Var2.i;
                if (list != null) {
                    list.add(j81Var);
                    listR = list;
                } else {
                    listR = eu.R(j81Var);
                }
                o72Var2.i = listR;
                return c43.i;
            case 22:
                ((fy) this.i).y(obj);
                return a83.a;
            case 23:
                i62 i62Var = (i62) this.i;
                Throwable th4 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th4);
                synchronized (i62Var.c) {
                    try {
                        k21 k21Var = i62Var.d;
                        if (k21Var != null) {
                            ju2 ju2Var = i62Var.u;
                            f62 f62Var = f62.i;
                            ju2Var.getClass();
                            ju2Var.h(null, f62Var);
                            k21Var.c(cancellationException);
                            i62Var.r = null;
                            k21Var.t(new d62(z ? 1 : 0, i62Var, th4));
                        } else {
                            i62Var.e = cancellationException;
                            ju2 ju2Var2 = i62Var.u;
                            f62 f62Var2 = f62.h;
                            ju2Var2.getClass();
                            ju2Var2.h(null, f62Var2);
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return a83.a;
            case 24:
                ((l62) this.i).a((rd0) obj);
                return a83.a;
            case 25:
                fc2 fc2Var2 = ((dc2) this.i).j;
                return Boolean.valueOf(fc2Var2 != null ? fc2Var2.b(obj) : true);
            case 26:
                String str6 = (String) this.i;
                gq1 gq1Var = (gq1) obj;
                gq1Var.getClass();
                return du.u0(eu.Q(gq1Var.b, gq1Var.c), str6, null, null, null, 62);
            case 27:
                nl2 nl2Var = (nl2) this.i;
                float fFloatValue = ((Float) obj).floatValue();
                kx1 kx1Var = nl2Var.a;
                float fG = kx1Var.g() + fFloatValue + nl2Var.f;
                float fC = ci0.C(fG, 0.0f, nl2Var.e.g());
                boolean z7 = fG == fC;
                float fG2 = fC - kx1Var.g();
                int iRound2 = Math.round(fG2);
                kx1Var.h(kx1Var.g() + iRound2);
                nl2Var.f = fG2 - iRound2;
                if (!z7) {
                    fFloatValue = fG2;
                }
                return Float.valueOf(fFloatValue);
            case 28:
                im2 im2Var = (im2) this.i;
                return new rs1(im2Var.c(im2Var.k, ((rs1) obj).a, im2Var.j));
            default:
                er2 er2Var = (er2) this.i;
                o12 o12Var = (o12) obj;
                long j5 = o12Var.c;
                b03 b03Var = (b03) er2Var.k;
                if (b03Var.k() && b03Var.n().a.i.length() != 0 && (t91Var = b03Var.d) != null && t91Var.d() != null) {
                    er2Var.e(b03Var.n(), j5, false, gd3.H);
                    z2 = true;
                }
                if (z2) {
                    o12Var.a();
                }
                return a83.a;
        }
    }

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
    }
}
