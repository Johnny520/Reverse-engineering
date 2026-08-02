package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: v */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0792v implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11572h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f11573i;

    public /* synthetic */ C0792v(int i, Object obj) {
        this.f11572h = i;
        this.f11573i = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0677  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        int i;
        C0095cl c0095cl;
        boolean z;
        long j;
        C0702sp c0702sp;
        C0043b5 c0043b5;
        float f;
        float f2;
        long jM434u;
        String strConcat;
        StringBuilder sb;
        int i2;
        x81 x81Var;
        Object x92Var;
        Object x92Var2;
        Activity activity;
        List listM1437R;
        t91 t91Var;
        int i3 = 8;
        int i4 = 6;
        float f3 = 0.0f;
        x81 x81Var2 = null;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        switch (this.f11572h) {
            case 0:
                by0 by0Var = (by0) this.f11573i;
                jo2 jo2Var = (jo2) obj;
                jo2Var.getClass();
                C0038b0.f458d.getClass();
                String str = C0038b0.f462h;
                String str2 = by0Var.f1074a;
                String lowerCase = jo2Var.f5131b.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str3 = jo2Var.f5132c;
                StringBuilder sbM5696o = vi0.m5696o("AI reply send failed: talker=", str2, ", code=", lowerCase, ", reason=");
                sbM5696o.append(str3);
                hg3.m2166d(str, sbM5696o.toString());
                return a83.f116a;
            case 1:
                return obj == ((AbstractC0372k2) this.f11573i) ? "(this Collection)" : String.valueOf(obj);
            case 2:
                zy1 zy1Var = (zy1) this.f11573i;
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
                C0568p5 c0568p5 = (C0568p5) this.f11573i;
                c0568p5.f7979x.mo12g((oy2) obj, p40.m3733p(c0568p5, AbstractC0646r7.f9411b));
                return a83.f116a;
            case 4:
                ((zn2) obj).mo1533a(gn2.f3587a, new fn2(rr0.f9716h, ((ws1) this.f11573i).mo611a(), en2.f2518i, true));
                return a83.f116a;
            case 5:
                return new C0194f8(3, (C0243gk) this.f11573i);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                C0623ql c0623ql = (C0623ql) this.f11573i;
                C0626qo c0626qo = (C0626qo) obj;
                if (c0626qo.mo693b() * c0623ql.f9021y < 0.0f || gr2.m2020b(c0626qo.f9053h.mo1842d()) <= 0.0f) {
                    return c0626qo.m4218a(new C0829w(23));
                }
                final float fMin = Math.min(za0.m6404b(c0623ql.f9021y, 0.0f) ? 1.0f : (float) Math.ceil(c0626qo.mo693b() * c0623ql.f9021y), (float) Math.ceil(gr2.m2020b(c0626qo.f9053h.mo1842d()) / 2.0f));
                final float f4 = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0626qo.f9053h.mo1842d() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0626qo.f9053h.mo1842d() >> 32)) - fMin)) << 32);
                float f5 = fMin * 2.0f;
                boolean z3 = f5 > gr2.m2020b(c0626qo.f9053h.mo1842d());
                AbstractC0731te abstractC0731teMo248a = c0623ql.f9018A.mo248a(c0626qo.f9053h.mo1842d(), c0626qo.f9053h.getLayoutDirection(), c0626qo);
                if (!(abstractC0731teMo248a instanceof sv1)) {
                    if (!(abstractC0731teMo248a instanceof uv1)) {
                        boolean z4 = z3;
                        if (!(abstractC0731teMo248a instanceof tv1)) {
                            c80.m675s();
                            return null;
                        }
                        final ft2 ft2Var = c0623ql.f9022z;
                        final long j2 = z4 ? 0L : jFloatToRawIntBits;
                        final long jMo1842d = z4 ? c0626qo.f9053h.mo1842d() : jFloatToRawIntBits2;
                        final op0 xv2Var = z4 ? xi0.f13041h : new xv2(fMin, 0.0f, 0, 0, 30);
                        return c0626qo.m4218a(new in0() { // from class: nl
                            @Override // p000.in0
                            /* JADX INFO: renamed from: j */
                            public final Object mo5j(Object obj2) {
                                t61 t61Var = (t61) obj2;
                                t61Var.m5125a();
                                nc0.m3266F(t61Var, ft2Var, j2, jMo1842d, 0.0f, xv2Var, 104);
                                return a83.f116a;
                            }
                        });
                    }
                    final ft2 ft2Var2 = c0623ql.f9022z;
                    db2 db2Var = ((uv1) abstractC0731teMo248a).f11514j;
                    if (AbstractC0570p7.m3790z(db2Var)) {
                        final long j3 = db2Var.f1960e;
                        final xv2 xv2Var2 = new xv2(fMin, 0.0f, 0, 0, 30);
                        final boolean z5 = z3;
                        return c0626qo.m4218a(new in0() { // from class: ol
                            @Override // p000.in0
                            /* JADX INFO: renamed from: j */
                            public final Object mo5j(Object obj2) throws Throwable {
                                long j4;
                                t61 t61Var = (t61) obj2;
                                t61Var.m5125a();
                                C0702sp c0702sp2 = t61Var.f10581h;
                                boolean z6 = z5;
                                AbstractC0024an abstractC0024an = ft2Var2;
                                long j5 = j3;
                                if (z6) {
                                    nc0.m3271s0(t61Var, abstractC0024an, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f6 = f4;
                                    if (fIntBitsToFloat < f6) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0702sp2.mo3280d() >> 32));
                                        float f7 = fMin;
                                        float f8 = fIntBitsToFloat2 - f7;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c0702sp2.mo3280d() & 4294967295L)) - f7;
                                        C0043b5 c0043b52 = c0702sp2.f10257i;
                                        long jM434u2 = c0043b52.m434u();
                                        c0043b52.m430q().mo1522l();
                                        try {
                                            ((C0043b5) ((C0485n4) c0043b52.f562i).f6983i).m430q().mo1517f(f7, f7, f8, fIntBitsToFloat3, 0);
                                            j4 = jM434u2;
                                            try {
                                                nc0.m3271s0(t61Var, abstractC0024an, 0L, 0L, j5, null, 246);
                                                vi0.m5699r(c0043b52, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                vi0.m5699r(c0043b52, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4 = jM434u2;
                                        }
                                    } else {
                                        nc0.m3271s0(t61Var, abstractC0024an, jFloatToRawIntBits, jFloatToRawIntBits2, fg1.m1623P(f6, j5), xv2Var2, 208);
                                    }
                                }
                                return a83.f116a;
                            }
                        });
                    }
                    boolean z6 = z3;
                    if (c0623ql.f9020x == null) {
                        c0623ql.f9020x = new C0465ml();
                    }
                    C0465ml c0465ml = c0623ql.f9020x;
                    c0465ml.getClass();
                    C0915y9 c0915y9M117a = c0465ml.f6714d;
                    if (c0915y9M117a == null) {
                        c0915y9M117a = AbstractC0011aa.m117a();
                        c0465ml.f6714d = c0915y9M117a;
                    }
                    c0915y9M117a.m6235g();
                    C0915y9.m6230b(c0915y9M117a, db2Var);
                    if (!z6) {
                        C0915y9 c0915y9M117a2 = AbstractC0011aa.m117a();
                        C0915y9.m6230b(c0915y9M117a2, new db2(fMin, fMin, (db2Var.f1958c - db2Var.f1956a) - fMin, (db2Var.f1959d - db2Var.f1957b) - fMin, fg1.m1623P(fMin, db2Var.f1960e), fg1.m1623P(fMin, db2Var.f1961f), fg1.m1623P(fMin, db2Var.f1962g), fg1.m1623P(fMin, db2Var.f1963h)));
                        c0915y9M117a.m6234f(c0915y9M117a, c0915y9M117a2, 0);
                    }
                    return c0626qo.m4218a(new C0115d2(i4, c0915y9M117a, ft2Var2));
                }
                ft2 ft2Var3 = c0623ql.f9022z;
                sv1 sv1Var = (sv1) abstractC0731teMo248a;
                C0915y9 c0915y9 = sv1Var.f10384j;
                if (z3) {
                    return c0626qo.m4218a(new C0115d2(7, sv1Var, ft2Var3));
                }
                if (ft2Var3 != null) {
                    c0095cl = new C0095cl(C0363ju.m2565b(1.0f, ft2Var3.f3140a), 5);
                    i = 1;
                } else {
                    i = 0;
                    c0095cl = null;
                }
                o62 o62VarM6232d = c0915y9.m6232d();
                float f6 = o62VarM6232d.f7537b;
                float f7 = o62VarM6232d.f7536a;
                if (c0623ql.f9020x == null) {
                    c0623ql.f9020x = new C0465ml();
                }
                C0465ml c0465ml2 = c0623ql.f9020x;
                c0465ml2.getClass();
                C0915y9 c0915y9M117a3 = c0465ml2.f6714d;
                if (c0915y9M117a3 == null) {
                    c0915y9M117a3 = AbstractC0011aa.m117a();
                    c0465ml2.f6714d = c0915y9M117a3;
                }
                c0915y9M117a3.m6235g();
                ux1 ux1Var = ux1.f11544h;
                float f8 = o62VarM6232d.f7536a;
                float f9 = o62VarM6232d.f7539d;
                float f10 = o62VarM6232d.f7538c;
                float f11 = o62VarM6232d.f7537b;
                if (Float.isNaN(f8) || Float.isNaN(f11) || Float.isNaN(f10) || Float.isNaN(f9)) {
                    AbstractC0011aa.m119c("Invalid rectangle, make sure no value is NaN");
                }
                if (c0915y9M117a3.f13366b == null) {
                    c0915y9M117a3.f13366b = new RectF();
                }
                RectF rectF = c0915y9M117a3.f13366b;
                rectF.getClass();
                rectF.set(f8, f11, f10, f9);
                Path path = c0915y9M117a3.f13365a;
                RectF rectF2 = c0915y9M117a3.f13366b;
                rectF2.getClass();
                path.addRect(rectF2, AbstractC0011aa.m118b(ux1Var));
                c0915y9M117a3.m6234f(c0915y9M117a3, c0915y9, 0);
                o72 o72Var = new o72();
                long jCeil = (((long) ((int) Math.ceil(o62VarM6232d.f7539d - f6))) & 4294967295L) | (((long) ((int) Math.ceil(o62VarM6232d.f7538c - f7))) << 32);
                C0465ml c0465ml3 = c0623ql.f9020x;
                c0465ml3.getClass();
                C0122d9 c0122d9M3766b = c0465ml3.f6711a;
                C0192f6 c0192f6M4520F = c0465ml3.f6712b;
                ix0 ix0Var = c0122d9M3766b != null ? new ix0(c0122d9M3766b.m971a()) : null;
                if (ix0Var != null && ix0Var.f4826a == 0) {
                    z = true;
                } else {
                    ix0 ix0Var2 = c0122d9M3766b != null ? new ix0(c0122d9M3766b.m971a()) : null;
                    if (ix0Var2 == null || i != ix0Var2.f4826a) {
                        z = false;
                    }
                }
                try {
                    try {
                        if (c0122d9M3766b != null && c0192f6M4520F != null) {
                            j = jCeil;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c0626qo.f9053h.mo1842d() >> 32));
                            Bitmap bitmap = c0122d9M3766b.f1913a;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (c0626qo.f9053h.mo1842d() & 4294967295L)) > bitmap.getHeight() || !z) {
                            }
                            c0702sp = c0465ml3.f6713c;
                            if (c0702sp == null) {
                                c0702sp = new C0702sp();
                                c0465ml3.f6713c = c0702sp;
                            }
                            c0043b5 = c0702sp.f10257i;
                            C0664rp c0664rp = c0702sp.f10256h;
                            long jM4715q0 = s11.m4715q0(j);
                            d61 layoutDirection = c0626qo.f9053h.getLayoutDirection();
                            C0702sp c0702sp2 = c0702sp;
                            e70 e70Var = c0664rp.f9665a;
                            C0095cl c0095cl2 = c0095cl;
                            d61 d61Var = c0664rp.f9666b;
                            InterfaceC0627qp interfaceC0627qp = c0664rp.f9667c;
                            long j4 = c0664rp.f9668d;
                            c0664rp.f9665a = c0626qo;
                            c0664rp.f9666b = layoutDirection;
                            c0664rp.f9667c = c0192f6M4520F;
                            c0664rp.f9668d = jM4715q0;
                            c0192f6M4520F.mo1522l();
                            nc0.m3270i0(c0702sp2, C0363ju.f5212b, 0L, jM4715q0, 58);
                            f = -f7;
                            f2 = -f6;
                            ((C0485n4) c0043b5.f562i).m3235C(f, f2);
                            nc0.m3272v(c0702sp2, sv1Var.f10384j, ft2Var3, 0.0f, new xv2(f5, 0.0f, 0, 0, 30), 52);
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (c0702sp2.mo3280d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (c0702sp2.mo3280d() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (c0702sp2.mo3280d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (c0702sp2.mo3280d() & 4294967295L));
                            long jMo3278a0 = c0702sp2.mo3278a0();
                            C0122d9 c0122d9 = c0122d9M3766b;
                            C0192f6 c0192f6 = c0192f6M4520F;
                            jM434u = c0043b5.m434u();
                            c0043b5.m430q().mo1522l();
                            C0915y9 c0915y92 = c0915y9M117a3;
                            ((C0485n4) c0043b5.f562i).m3234A(fIntBitsToFloat2, fIntBitsToFloat3, jMo3278a0);
                            nc0.m3272v(c0702sp2, c0915y92, ft2Var3, 0.0f, null, 28);
                            ((C0485n4) c0043b5.f562i).m3235C(-f, -f2);
                            c0192f6.mo1520i();
                            c0664rp.f9665a = e70Var;
                            c0664rp.f9666b = d61Var;
                            c0664rp.f9667c = interfaceC0627qp;
                            c0664rp.f9668d = j4;
                            c0122d9.f1913a.prepareToDraw();
                            o72Var.f7574i = c0122d9;
                            return c0626qo.m4218a(new C0584pl(o62VarM6232d, o72Var, j, c0095cl2));
                        }
                        j = jCeil;
                        ((C0485n4) c0043b5.f562i).m3234A(fIntBitsToFloat2, fIntBitsToFloat3, jMo3278a0);
                        nc0.m3272v(c0702sp2, c0915y92, ft2Var3, 0.0f, null, 28);
                        ((C0485n4) c0043b5.f562i).m3235C(-f, -f2);
                        c0192f6.mo1520i();
                        c0664rp.f9665a = e70Var;
                        c0664rp.f9666b = d61Var;
                        c0664rp.f9667c = interfaceC0627qp;
                        c0664rp.f9668d = j4;
                        c0122d9.f1913a.prepareToDraw();
                        o72Var.f7574i = c0122d9;
                        return c0626qo.m4218a(new C0584pl(o62VarM6232d, o72Var, j, c0095cl2));
                    } finally {
                        c0043b5.m430q().mo1520i();
                        c0043b5.m414E(jM434u);
                    }
                    nc0.m3272v(c0702sp2, sv1Var.f10384j, ft2Var3, 0.0f, new xv2(f5, 0.0f, 0, 0, 30), 52);
                    float fIntBitsToFloat22 = (Float.intBitsToFloat((int) (c0702sp2.mo3280d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (c0702sp2.mo3280d() >> 32));
                    float fIntBitsToFloat32 = (Float.intBitsToFloat((int) (c0702sp2.mo3280d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (c0702sp2.mo3280d() & 4294967295L));
                    long jMo3278a02 = c0702sp2.mo3278a0();
                    C0122d9 c0122d92 = c0122d9M3766b;
                    C0192f6 c0192f62 = c0192f6M4520F;
                    jM434u = c0043b5.m434u();
                    c0043b5.m430q().mo1522l();
                    C0915y9 c0915y922 = c0915y9M117a3;
                } catch (Throwable th) {
                    ((C0485n4) c0043b5.f562i).m3235C(-f, -f2);
                    throw th;
                }
                c0122d9M3766b = AbstractC0570p7.m3766b((int) (j >> 32), (int) (j & 4294967295L), i);
                c0465ml3.f6711a = c0122d9M3766b;
                c0192f6M4520F = rp0.m4520F(c0122d9M3766b);
                c0465ml3.f6712b = c0192f6M4520F;
                c0702sp = c0465ml3.f6713c;
                if (c0702sp == null) {
                }
                c0043b5 = c0702sp.f10257i;
                C0664rp c0664rp2 = c0702sp.f10256h;
                long jM4715q02 = s11.m4715q0(j);
                d61 layoutDirection2 = c0626qo.f9053h.getLayoutDirection();
                C0702sp c0702sp22 = c0702sp;
                e70 e70Var2 = c0664rp2.f9665a;
                C0095cl c0095cl22 = c0095cl;
                d61 d61Var2 = c0664rp2.f9666b;
                InterfaceC0627qp interfaceC0627qp2 = c0664rp2.f9667c;
                long j42 = c0664rp2.f9668d;
                c0664rp2.f9665a = c0626qo;
                c0664rp2.f9666b = layoutDirection2;
                c0664rp2.f9667c = c0192f6M4520F;
                c0664rp2.f9668d = jM4715q02;
                c0192f6M4520F.mo1522l();
                nc0.m3270i0(c0702sp22, C0363ju.f5212b, 0L, jM4715q02, 58);
                f = -f7;
                f2 = -f6;
                ((C0485n4) c0043b5.f562i).m3235C(f, f2);
                break;
            case 7:
                return Boolean.valueOf(((Constructor) obj).getParameterTypes().length == ((Object[]) this.f11573i).length);
            case 8:
                ((dd1) this.f11573i).mo6a();
                return a83.f116a;
            case 9:
                rd0 rd0Var = (rd0) obj;
                String str4 = ((rd0) this.f11573i) == rd0Var ? " > " : "   ";
                if (rd0Var instanceof C0180ev) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    C0180ev c0180ev = (C0180ev) rd0Var;
                    sb.append(c0180ev.f2649a.f10051i.length());
                    sb.append(", newCursorPosition=");
                    i2 = c0180ev.f2650b;
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
                            String strM591c = d72.m967a(rd0Var.getClass()).m591c();
                            if (strM591c == null) {
                                strM591c = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(strM591c);
                        }
                        return str4.concat(strConcat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    lp2 lp2Var = (lp2) rd0Var;
                    sb.append(lp2Var.f6240a.f10051i.length());
                    sb.append(", newCursorPosition=");
                    i2 = lp2Var.f6241b;
                }
                strConcat = vi0.m5694m(sb, i2, ')');
                return str4.concat(strConcat);
            case 10:
                l63 l63Var = (l63) obj;
                return ((yl0) this.f11573i).m6287a(new l63(null, l63Var.f5962b, l63Var.f5963c, l63Var.f5964d, l63Var.f5965e)).f6489h;
            case 11:
                return new C0194f8(i4, (y71) this.f11573i);
            case 12:
                return new C0194f8(i3, (e81) this.f11573i);
            case 13:
                Object obj2 = this.f11573i;
                ((Integer) obj).getClass();
                return obj2;
            case 14:
                d91 d91Var = (d91) this.f11573i;
                float f12 = -((Float) obj).floatValue();
                if ((f12 >= 0.0f || d91Var.mo569c()) && (f12 <= 0.0f || d91Var.mo567a())) {
                    if (Math.abs(d91Var.f1923h) > 0.5f) {
                        nz0.m3458c("entered drag with non-zero pending scroll");
                    }
                    d91Var.f1919d = true;
                    float f13 = d91Var.f1923h + f12;
                    d91Var.f1923h = f13;
                    if (Math.abs(f13) > 0.5f) {
                        float f14 = d91Var.f1923h;
                        int iRound = Math.round(f14);
                        x81 x81VarM6046f = ((x81) d91Var.f1921f.getValue()).m6046f(iRound, !d91Var.f1917b);
                        if (x81VarM6046f == null || (x81Var = d91Var.f1918c) == null) {
                            x81Var2 = x81VarM6046f;
                            if (x81Var2 == null) {
                                d91Var.m972f(x81Var2, d91Var.f1917b, true);
                                d91Var.f1937v.setValue(a83.f116a);
                                d91Var.m974h(f14 - d91Var.f1923h, x81Var2);
                            } else {
                                r61 r61Var = d91Var.f1926k;
                                if (r61Var != null) {
                                    r61Var.m4379k();
                                }
                                d91Var.m974h(f14 - d91Var.f1923h, d91Var.m973g());
                            }
                        } else {
                            x81 x81VarM6046f2 = x81Var.m6046f(iRound, true);
                            if (x81VarM6046f2 != null) {
                                d91Var.f1918c = x81VarM6046f2;
                                x81Var2 = x81VarM6046f;
                            }
                            if (x81Var2 == null) {
                            }
                        }
                    }
                    if (Math.abs(d91Var.f1923h) > 0.5f) {
                        f12 -= d91Var.f1923h;
                        d91Var.f1923h = 0.0f;
                    }
                    f3 = f12;
                }
                return Float.valueOf(-f3);
            case 15:
                fc2 fc2Var = (fc2) this.f11573i;
                return Boolean.valueOf(fc2Var != null ? fc2Var.mo976b(obj) : true);
            case 16:
                return ((cf1) this.f11573i).m767b(((Integer) obj).intValue());
            case 17:
                ((kl1) this.f11573i).m2722f(null);
                return a83.f116a;
            case 18:
                AbstractC0812vj[] abstractC0812vjArr = (AbstractC0812vj[]) this.f11573i;
                jg3 jg3Var = (jg3) obj;
                a83 a83Var = a83.f116a;
                jg3Var.getClass();
                Context context = (Context) jg3Var.m2496a()[0];
                if (context != null) {
                    pp1 pp1Var = pp1.f8445a;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    up0.f11401i = applicationContext;
                    ClassLoader classLoader = context.getClassLoader();
                    classLoader.getClass();
                    up0.f11402j = classLoader;
                    if (pp1.f8450f.compareAndSet(false, true)) {
                        SystemClock.elapsedRealtime();
                        try {
                            op0.m3593p(abstractC0812vjArr, AbstractC0731te.m5190S(pp1.m3932d()));
                            x92Var = a83Var;
                        } catch (Throwable th2) {
                            x92Var = new x92(th2);
                        }
                        Throwable thM6237a = y92.m6237a(x92Var);
                        if (thM6237a != null) {
                            String str5 = up0.f11405m;
                            if (str5 == null) {
                                t11.m5067S("hostProcess");
                                throw null;
                            }
                            String string = ("Secondary process hook installation failed in " + str5 + ": " + fg1.m1624Q(thM6237a)).toString();
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
                View view = (View) this.f11573i;
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
                    return new C0380ka(2);
                }
                mb3 mb3Var = new mb3(window, view);
                df3 df3Var = (df3) mb3Var.f6554a;
                int iMo1012a = df3Var.mo1012a();
                rd3.m4434a(window, false);
                df3Var.mo1015d(2);
                switch (df3Var.f2033a) {
                    case 0:
                        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
                            if ((519 & i5) != 0) {
                                if (i5 == 1) {
                                    df3Var.m1016e(4);
                                } else if (i5 == 2) {
                                    df3Var.m1016e(2);
                                } else if (i5 == 8) {
                                    ((hh1) ((hh1) df3Var.f2035c).f4019i).mo1418A();
                                }
                            }
                        }
                        break;
                    default:
                        ((WindowInsetsController) df3Var.f2035c).hide(519);
                        break;
                }
                return new xp1(mb3Var, iMo1012a, window);
            case AIChatConfig.MaxContextRounds /* 20 */:
                yo2 yo2Var = (yo2) this.f11573i;
                int iIntValue = ((Integer) obj).intValue();
                return yo2Var.mo253e(iIntValue) + ": " + yo2Var.mo256j(iIntValue).mo250b();
            case 21:
                o72 o72Var2 = (o72) this.f11573i;
                d43 d43Var = (d43) obj;
                d43Var.getClass();
                j81 j81Var = ((f43) d43Var).f2793v;
                List list = (List) o72Var2.f7574i;
                if (list != null) {
                    list.add(j81Var);
                    listM1437R = list;
                } else {
                    listM1437R = AbstractC0179eu.m1437R(j81Var);
                }
                o72Var2.f7574i = listM1437R;
                return c43.f1147i;
            case 22:
                ((C0220fy) this.f11573i).m1754y(obj);
                return a83.f116a;
            case 23:
                i62 i62Var = (i62) this.f11573i;
                Throwable th4 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th4);
                synchronized (i62Var.f4293c) {
                    try {
                        k21 k21Var = i62Var.f4294d;
                        if (k21Var != null) {
                            ju2 ju2Var = i62Var.f4311u;
                            f62 f62Var = f62.f2817i;
                            ju2Var.getClass();
                            ju2Var.m2576h(null, f62Var);
                            k21Var.mo1704c(cancellationException);
                            i62Var.f4308r = null;
                            k21Var.mo1707t(new d62(z ? 1 : 0, i62Var, th4));
                        } else {
                            i62Var.f4295e = cancellationException;
                            ju2 ju2Var2 = i62Var.f4311u;
                            f62 f62Var2 = f62.f2816h;
                            ju2Var2.getClass();
                            ju2Var2.m2576h(null, f62Var2);
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return a83.f116a;
            case 24:
                ((l62) this.f11573i).m2846a((rd0) obj);
                return a83.f116a;
            case 25:
                fc2 fc2Var2 = ((dc2) this.f11573i).f1987j;
                return Boolean.valueOf(fc2Var2 != null ? fc2Var2.mo976b(obj) : true);
            case 26:
                String str6 = (String) this.f11573i;
                gq1 gq1Var = (gq1) obj;
                gq1Var.getClass();
                return AbstractC0142du.m1165u0(AbstractC0179eu.m1436Q(gq1Var.f3659b, gq1Var.f3660c), str6, null, null, null, 62);
            case 27:
                nl2 nl2Var = (nl2) this.f11573i;
                float fFloatValue = ((Float) obj).floatValue();
                kx1 kx1Var = nl2Var.f7216a;
                float fM2759g = kx1Var.m2759g() + fFloatValue + nl2Var.f7221f;
                float fM778C = ci0.m778C(fM2759g, 0.0f, nl2Var.f7220e.m2759g());
                boolean z7 = fM2759g == fM778C;
                float fM2759g2 = fM778C - kx1Var.m2759g();
                int iRound2 = Math.round(fM2759g2);
                kx1Var.m2760h(kx1Var.m2759g() + iRound2);
                nl2Var.f7221f = fM2759g2 - iRound2;
                if (!z7) {
                    fFloatValue = fM2759g2;
                }
                return Float.valueOf(fFloatValue);
            case 28:
                im2 im2Var = (im2) this.f11573i;
                return new rs1(im2Var.m2366c(im2Var.f4697k, ((rs1) obj).f9744a, im2Var.f4696j));
            default:
                er2 er2Var = (er2) this.f11573i;
                o12 o12Var = (o12) obj;
                long j5 = o12Var.f7422c;
                b03 b03Var = (b03) er2Var.f2578k;
                if (b03Var.m347k() && b03Var.m350n().f5296a.f10051i.length() != 0 && (t91Var = b03Var.f483d) != null && t91Var.m5146d() != null) {
                    er2Var.m1415e(b03Var.m350n(), j5, false, gd3.f3421H);
                    z2 = true;
                }
                if (z2) {
                    o12Var.m3463a();
                }
                return a83.f116a;
        }
    }

    public /* synthetic */ C0792v(int i, Object obj, Object obj2) {
        this.f11572h = i;
        this.f11573i = obj;
    }
}
