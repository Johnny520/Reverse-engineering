package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import p000.C0439lp;

/* JADX INFO: renamed from: o */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0532o implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4375d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4376e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0532o(int i, Object obj) {
        this.f4375d = i;
        this.f4376e = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: n90.b(org.json.JSONObject, java.lang.String):java.lang.CharSequence */
    /* JADX DEBUG: Class process forced to load method for inline: uq.v(uq, long, long, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0502  */
    @Override // p000.InterfaceC0742sw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        char c;
        int i;
        final C0348ja c0348ja;
        boolean z;
        st0 st0Var;
        C0752t5 c0752t5M1918d;
        boolean z2;
        v80 v80Var;
        List arrayList;
        boolean z3;
        int i2 = 2;
        int i3 = 4;
        int i4 = 5;
        v80 v80Var2 = null;
        switch (this.f4375d) {
            case 0:
                return obj == ((AbstractC0597p) this.f4376e) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                gq0 gq0Var = (gq0) this.f4376e;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == gq0Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != gq0Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                C0719sa c0719sa = (C0719sa) this.f4376e;
                C0507nc c0507nc = (C0507nc) obj;
                if (c0507nc.mo48b() * c0719sa.f5726u < 0.0f || q11.m3186b(c0507nc.f4234d.mo339c()) <= 0.0f) {
                    return c0507nc.m2687a(new C0881w9(1));
                }
                final float fMin = Math.min(C0520np.m2732b(c0719sa.f5726u, 0.0f) ? 1.0f : (float) Math.ceil(c0507nc.mo48b() * c0719sa.f5726u), (float) Math.ceil(q11.m3186b(c0507nc.f4234d.mo339c()) / 2.0f));
                final float f = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0507nc.f4234d.mo339c() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0507nc.f4234d.mo339c() & 4294967295L)) - fMin)) & 4294967295L);
                float f2 = fMin * 2.0f;
                boolean z4 = f2 > q11.m3186b(c0507nc.f4234d.mo339c());
                v50 v50VarMo737a = c0719sa.f5728w.mo737a(c0507nc.f4234d.mo339c(), c0507nc.f4234d.getLayoutDirection(), c0507nc);
                if (!(v50VarMo737a instanceof wm0)) {
                    if (!(v50VarMo737a instanceof ym0)) {
                        boolean z5 = z4;
                        if (!(v50VarMo737a instanceof xm0)) {
                            C0921xc.m5129j();
                            return null;
                        }
                        final g31 g31Var = c0719sa.f5727v;
                        if (z5) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j = jFloatToRawIntBits;
                        if (z5) {
                            jFloatToRawIntBits2 = c0507nc.f4234d.mo339c();
                        }
                        final long j2 = jFloatToRawIntBits2;
                        final o30 s41Var = z5 ? C0664qt.f5220Q : new s41(fMin, 0.0f, 0, 30);
                        return c0507nc.m2687a(new InterfaceC0742sw() { // from class: pa
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p000.InterfaceC0742sw
                            public final Object invoke(Object obj2) {
                                d60 d60Var = (d60) obj2;
                                d60Var.m648a();
                                long j3 = (104 & 2) != 0 ? 0L : j;
                                long jM4338j0 = (104 & 4) != 0 ? InterfaceC0812uq.m4338j0(d60Var.f976d.mo649c(), j3) : j2;
                                float f3 = (104 & 8) != 0 ? 1.0f : 0.0f;
                                o30 o30Var = (104 & 16) != 0 ? C0664qt.f5220Q : s41Var;
                                C0125dd c0125dd = d60Var.f976d;
                                int i5 = (int) (j3 >> 32);
                                int i6 = (int) (j3 & 4294967295L);
                                c0125dd.f1052d.f789c.mo247m(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (jM4338j0 >> 32)) + Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (jM4338j0 & 4294967295L)) + Float.intBitsToFloat(i6), c0125dd.m682d(g31Var, o30Var, f3, null, 3, 1));
                                return na1.f4229a;
                            }
                        });
                    }
                    final g31 g31Var2 = c0719sa.f5727v;
                    bw0 bw0Var = ((ym0) v50VarMo737a).f7657a;
                    if (j50.m1669s(bw0Var)) {
                        final long j3 = bw0Var.f600e;
                        final s41 s41Var2 = new s41(fMin, 0.0f, 0, 30);
                        final boolean z6 = z4;
                        return c0507nc.m2687a(new InterfaceC0742sw() { // from class: qa
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p000.InterfaceC0742sw
                            public final Object invoke(Object obj2) throws Throwable {
                                long j4;
                                d60 d60Var = (d60) obj2;
                                d60Var.m648a();
                                C0125dd c0125dd = d60Var.f976d;
                                boolean z7 = z6;
                                pf1 pf1Var = g31Var2;
                                long j5 = j3;
                                if (z7) {
                                    InterfaceC0812uq.m4336g(d60Var, pf1Var, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f3 = f;
                                    if (fIntBitsToFloat < f3) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0125dd.mo649c() >> 32));
                                        float f4 = fMin;
                                        float f5 = fIntBitsToFloat2 - f4;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c0125dd.mo649c() & 4294967295L)) - f4;
                                        C0541o8 c0541o8 = c0125dd.f1053e;
                                        long jM2803h = c0541o8.m2803h();
                                        c0541o8.m2802f().mo243i();
                                        try {
                                            ((C0541o8) ((C0910x1) c0541o8.f4480a).f7232e).m2802f().mo238d(f4, f4, f5, fIntBitsToFloat3, 0);
                                            j4 = jM2803h;
                                            try {
                                                InterfaceC0812uq.m4336g(d60Var, pf1Var, 0L, 0L, j5, null, 246);
                                                c0541o8.m2802f().mo241g();
                                                c0541o8.m2812q(j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                c0541o8.m2802f().mo241g();
                                                c0541o8.m2812q(j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4 = jM2803h;
                                        }
                                    } else {
                                        InterfaceC0812uq.m4336g(d60Var, pf1Var, jFloatToRawIntBits, jFloatToRawIntBits2, p30.m2985U(f3, j5), s41Var2, 208);
                                    }
                                }
                                return na1.f4229a;
                            }
                        });
                    }
                    boolean z7 = z4;
                    if (c0719sa.f5725t == null) {
                        c0719sa.f5725t = new C0543oa();
                    }
                    C0543oa c0543oa = c0719sa.f5725t;
                    c0543oa.getClass();
                    C0118d6 c0118d6M1030a = c0543oa.f4493d;
                    if (c0118d6M1030a == null) {
                        c0118d6M1030a = AbstractC0198f6.m1030a();
                        c0543oa.f4493d = c0118d6M1030a;
                    }
                    c0118d6M1030a.m638e();
                    C0118d6.m635b(c0118d6M1030a, bw0Var);
                    if (!z7) {
                        C0118d6 c0118d6M1030a2 = AbstractC0198f6.m1030a();
                        C0118d6.m635b(c0118d6M1030a2, new bw0(fMin, fMin, (bw0Var.f598c - bw0Var.f596a) - fMin, (bw0Var.f599d - bw0Var.f597b) - fMin, p30.m2985U(fMin, bw0Var.f600e), p30.m2985U(fMin, bw0Var.f601f), p30.m2985U(fMin, bw0Var.f602g), p30.m2985U(fMin, bw0Var.f603h)));
                        c0118d6M1030a.m637d(c0118d6M1030a, c0118d6M1030a2, 0);
                    }
                    return c0507nc.m2687a(new C0073c(2, c0118d6M1030a, g31Var2));
                }
                g31 g31Var3 = c0719sa.f5727v;
                wm0 wm0Var = (wm0) v50VarMo737a;
                C0118d6 c0118d6 = wm0Var.f7150a;
                if (z4) {
                    return c0507nc.m2687a(new C0073c(3, wm0Var, g31Var3));
                }
                if (g31Var3 != null) {
                    c = ' ';
                    c0348ja = new C0348ja(5, C0207ff.m1093b(1.0f, g31Var3.f1852l));
                    i = 1;
                } else {
                    c = ' ';
                    i = 0;
                    c0348ja = null;
                }
                st0 st0VarM636c = c0118d6.m636c();
                float f3 = st0VarM636c.f5833b;
                float f4 = st0VarM636c.f5832a;
                if (c0719sa.f5725t == null) {
                    c0719sa.f5725t = new C0543oa();
                }
                C0543oa c0543oa2 = c0719sa.f5725t;
                c0543oa2.getClass();
                C0118d6 c0118d6M1030a3 = c0543oa2.f4493d;
                if (c0118d6M1030a3 == null) {
                    c0118d6M1030a3 = AbstractC0198f6.m1030a();
                    c0543oa2.f4493d = c0118d6M1030a3;
                }
                c0118d6M1030a3.m638e();
                float f5 = st0VarM636c.f5832a;
                float f6 = st0VarM636c.f5835d;
                float f7 = st0VarM636c.f5834c;
                float f8 = st0VarM636c.f5833b;
                if (Float.isNaN(f5) || Float.isNaN(f8) || Float.isNaN(f7) || Float.isNaN(f6)) {
                    AbstractC0198f6.m1031b("Invalid rectangle, make sure no value is NaN");
                }
                if (c0118d6M1030a3.f974b == null) {
                    c0118d6M1030a3.f974b = new RectF();
                }
                RectF rectF = c0118d6M1030a3.f974b;
                rectF.getClass();
                rectF.set(f5, f8, f7, f6);
                Path path = c0118d6M1030a3.f973a;
                RectF rectF2 = c0118d6M1030a3.f974b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                c0118d6M1030a3.m637d(c0118d6M1030a3, c0118d6, 0);
                final zt0 zt0Var = new zt0();
                final long jCeil = (((long) ((int) Math.ceil(st0VarM636c.f5834c - f4))) << c) | (((long) ((int) Math.ceil(st0VarM636c.f5835d - f3))) & 4294967295L);
                C0543oa c0543oa3 = c0719sa.f5725t;
                c0543oa3.getClass();
                C0752t5 c0752t5 = c0543oa3.f4490a;
                C0041b3 c0041b3 = c0543oa3.f4491b;
                C0707rz c0707rz = c0752t5 != null ? new C0707rz(c0752t5.m4187a()) : null;
                if (c0707rz != null && c0707rz.f5585a == 0) {
                    z = true;
                } else {
                    C0707rz c0707rz2 = c0752t5 != null ? new C0707rz(c0752t5.m4187a()) : null;
                    if (c0707rz2 == null || i != c0707rz2.f5585a) {
                        z = false;
                    }
                }
                if (c0752t5 != null) {
                    Bitmap bitmap = c0752t5.f5913a;
                    if (c0041b3 != null) {
                        st0Var = st0VarM636c;
                        if (Float.intBitsToFloat((int) (c0507nc.f4234d.mo339c() >> c)) <= bitmap.getWidth() && Float.intBitsToFloat((int) (c0507nc.f4234d.mo339c() & 4294967295L)) <= bitmap.getHeight() && z) {
                            c0752t5M1918d = c0752t5;
                        }
                    } else {
                        st0Var = st0VarM636c;
                    }
                    c0752t5M1918d = AbstractC0398kl.m1918d((int) (jCeil >> c), (int) (jCeil & 4294967295L), i);
                    c0543oa3.f4490a = c0752t5M1918d;
                    Canvas canvas = AbstractC0077c3.f648a;
                    c0041b3 = new C0041b3();
                    c0041b3.f362a = new Canvas(c0752t5M1918d.f5913a);
                    c0543oa3.f4491b = c0041b3;
                }
                C0125dd c0125dd = c0543oa3.f4492c;
                if (c0125dd == null) {
                    c0125dd = new C0125dd();
                    c0543oa3.f4492c = c0125dd;
                }
                C0541o8 c0541o8 = c0125dd.f1053e;
                C0087cd c0087cd = c0125dd.f1052d;
                long jM2759C = o30.m2759C(jCeil);
                C0125dd c0125dd2 = c0125dd;
                k50 layoutDirection = c0507nc.f4234d.getLayoutDirection();
                InterfaceC0968ym interfaceC0968ym = c0087cd.f787a;
                C0118d6 c0118d62 = c0118d6M1030a3;
                k50 k50Var = c0087cd.f788b;
                final st0 st0Var2 = st0Var;
                InterfaceC0051bd interfaceC0051bd = c0087cd.f789c;
                long j4 = c0087cd.f790d;
                c0087cd.f787a = c0507nc;
                c0087cd.f788b = layoutDirection;
                c0087cd.f789c = c0041b3;
                c0087cd.f790d = jM2759C;
                c0041b3.mo243i();
                InterfaceC0812uq.m4339v(c0125dd2, C0207ff.f1702b, jM2759C, 58);
                float f9 = -f4;
                float f10 = -f3;
                ((C0910x1) c0541o8.f4480a).m5080u(f9, f10);
                try {
                    InterfaceC0812uq.m4337h0(c0125dd2, wm0Var.f7150a, g31Var3, 0.0f, new s41(f2, 0.0f, 0, 30), 52);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (c0125dd2.mo649c() >> c)) + 1.0f) / Float.intBitsToFloat((int) (c0125dd2.mo649c() >> c));
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (c0125dd2.mo649c() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (c0125dd2.mo649c() & 4294967295L));
                    long jMo643K = c0125dd2.mo643K();
                    C0752t5 c0752t52 = c0752t5M1918d;
                    C0041b3 c0041b32 = c0041b3;
                    long jM2803h = c0541o8.m2803h();
                    c0541o8.m2802f().mo243i();
                    try {
                        ((C0910x1) c0541o8.f4480a).m5079s(fIntBitsToFloat, fIntBitsToFloat2, jMo643K);
                        InterfaceC0812uq.m4337h0(c0125dd2, c0118d62, g31Var3, 0.0f, null, 28);
                        ((C0910x1) c0541o8.f4480a).m5080u(-f9, -f10);
                        c0041b32.mo241g();
                        c0087cd.f787a = interfaceC0968ym;
                        c0087cd.f788b = k50Var;
                        c0087cd.f789c = interfaceC0051bd;
                        c0087cd.f790d = j4;
                        c0752t52.f5913a.prepareToDraw();
                        zt0Var.f7995d = c0752t52;
                        return c0507nc.m2687a(new InterfaceC0742sw() { // from class: ra
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p000.InterfaceC0742sw
                            public final Object invoke(Object obj2) {
                                zt0 zt0Var2 = zt0Var;
                                long j5 = jCeil;
                                C0348ja c0348ja2 = c0348ja;
                                d60 d60Var = (d60) obj2;
                                d60Var.m648a();
                                st0 st0Var3 = st0Var2;
                                float f11 = st0Var3.f5832a;
                                float f12 = st0Var3.f5833b;
                                C0125dd c0125dd3 = d60Var.f976d;
                                ((C0910x1) c0125dd3.f1053e.f4480a).m5080u(f11, f12);
                                try {
                                    InterfaceC0812uq.m4334H(d60Var, (C0752t5) zt0Var2.f7995d, j5, 0L, 0.0f, c0348ja2, 0, 890);
                                    ((C0910x1) c0125dd3.f1053e.f4480a).m5080u(-f11, -f12);
                                    return na1.f4229a;
                                } catch (Throwable th) {
                                    ((C0910x1) c0125dd3.f1053e.f4480a).m5080u(-f11, -f12);
                                    throw th;
                                }
                            }
                        });
                    } finally {
                        c0541o8.m2802f().mo241g();
                        c0541o8.m2812q(jM2803h);
                    }
                } catch (Throwable th) {
                    ((C0910x1) c0541o8.f4480a).m5080u(-f9, -f10);
                    throw th;
                }
            case 3:
                vt0 vt0Var = (vt0) this.f4376e;
                h91 h91Var = (h91) obj;
                if (!vt0Var.f6825d) {
                    h91Var.getClass();
                    z2 = ((sy0) h91Var).f5861r;
                }
                vt0Var.f6825d = z2;
                return Boolean.valueOf(!z2);
            case 4:
                return DialogC0402kp.m1954m((DialogC0402kp) this.f4376e, (C0439lp.a) obj);
            case 5:
                aa1 aa1Var = (aa1) obj;
                return ((C0408kv) this.f4376e).m1957a(new aa1(null, aa1Var.f78b, aa1Var.f79c, aa1Var.f80d, aa1Var.f81e)).f482d;
            case 6:
                return new C0379k4(i2, (m70) this.f4376e);
            case 7:
                return new C0379k4(i3, (y70) this.f4376e);
            case 8:
                c90 c90Var = (c90) this.f4376e;
                float f11 = -((Float) obj).floatValue();
                if ((f11 >= 0.0f || c90Var.mo502c()) && (f11 <= 0.0f || c90Var.mo500a())) {
                    if (Math.abs(c90Var.f746h) > 0.5f) {
                        z10.m5363c("entered drag with non-zero pending scroll");
                    }
                    c90Var.f742d = true;
                    float f12 = c90Var.f746h + f11;
                    c90Var.f746h = f12;
                    if (Math.abs(f12) > 0.5f) {
                        float f13 = c90Var.f746h;
                        int iRound = Math.round(f13);
                        v80 v80VarM4420f = ((v80) c90Var.f744f.getValue()).m4420f(iRound, !c90Var.f740b);
                        if (v80VarM4420f == null || (v80Var = c90Var.f741c) == null) {
                            v80Var2 = v80VarM4420f;
                            if (v80Var2 == null) {
                                c90Var.m505f(v80Var2, c90Var.f740b, true);
                                c90Var.f760v.setValue(na1.f4229a);
                                c90Var.m507h(f13 - c90Var.f746h, v80Var2);
                            } else {
                                b60 b60Var = c90Var.f749k;
                                if (b60Var != null) {
                                    b60Var.m304k();
                                }
                                c90Var.m507h(f13 - c90Var.f746h, c90Var.m506g());
                            }
                        } else {
                            v80 v80VarM4420f2 = v80Var.m4420f(iRound, true);
                            if (v80VarM4420f2 != null) {
                                c90Var.f741c = v80VarM4420f2;
                                v80Var2 = v80VarM4420f;
                            }
                            if (v80Var2 == null) {
                            }
                        }
                    }
                    if (Math.abs(c90Var.f746h) > 0.5f) {
                        f11 -= c90Var.f746h;
                        c90Var.f746h = 0.0f;
                    }
                    f = f11;
                }
                return Float.valueOf(-f);
            case 9:
                zw0 zw0Var = (zw0) this.f4376e;
                return Boolean.valueOf(zw0Var != null ? zw0Var.mo215b(obj) : true);
            case 10:
                return n90.m2650N((JSONObject) this.f4376e, (String) obj);
            case 11:
                ((di0) this.f4376e).m714g(null);
                return na1.f4229a;
            case 12:
                ((dp0) ((wg0) this.f4376e)).m721h((int) (((d30) obj).f953a >> 32));
                return na1.f4229a;
            case 13:
                ((gv0) obj).m1260d(((Number) ((w31) this.f4376e).getValue()).floatValue());
                return na1.f4229a;
            case 14:
                qo0 qo0Var = (qo0) this.f4376e;
                float fFloatValue = ((Float) obj).floatValue();
                C0399km c0399km = qo0Var.f5207b;
                c0399km.f3558s.m721h(c0399km.m2036k(c0399km.f3543d.f866b.m720g() + rd0.m3458Q(c0399km.m2040p() != 0 ? fFloatValue / c0399km.m2040p() : 0.0f)));
                return na1.f4229a;
            case j50.f2734e /* 15 */:
                zt0 zt0Var2 = (zt0) this.f4376e;
                h91 h91Var2 = (h91) obj;
                h91Var2.getClass();
                d80 d80Var = ((j91) h91Var2).f2774r;
                List list = (List) zt0Var2.f7995d;
                if (list != null) {
                    list.add(d80Var);
                    arrayList = list;
                } else {
                    arrayList = new ArrayList(new C0880w8(new d80[]{d80Var}, true));
                }
                zt0Var2.f7995d = arrayList;
                return g91.f1894e;
            case 16:
                ((C0964yi) this.f4376e).m5285z(obj);
                return na1.f4229a;
            case 17:
                ot0 ot0Var = (ot0) this.f4376e;
                Throwable th2 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th2);
                synchronized (ot0Var.f4633c) {
                    try {
                        c40 c40Var = ot0Var.f4634d;
                        if (c40Var != null) {
                            z31 z31Var = ot0Var.f4651u;
                            jt0 jt0Var = jt0.f2942e;
                            z31Var.getClass();
                            z31Var.m5413j(null, jt0Var);
                            c40Var.mo478a(cancellationException);
                            ot0Var.f4648r = null;
                            c40Var.mo482r(new C0073c(17, ot0Var, th2));
                        } else {
                            ot0Var.f4635e = cancellationException;
                            z31 z31Var2 = ot0Var.f4651u;
                            jt0 jt0Var2 = jt0.f2941d;
                            z31Var2.getClass();
                            z31Var2.m5413j(null, jt0Var2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return na1.f4229a;
            case 18:
                zw0 zw0Var2 = ((yw0) this.f4376e).f7700f;
                return Boolean.valueOf(zw0Var2 != null ? zw0Var2.mo215b(obj) : true);
            case 19:
                py0 py0Var = (py0) this.f4376e;
                float fFloatValue2 = ((Float) obj).floatValue();
                dp0 dp0Var = py0Var.f4988a;
                float fM720g = dp0Var.m720g() + fFloatValue2 + py0Var.f4993f;
                float fM4906m = w60.m4906m(fM720g, 0.0f, py0Var.f4992e.m720g());
                boolean z8 = fM720g == fM4906m;
                float fM720g2 = fM4906m - dp0Var.m720g();
                int iRound2 = Math.round(fM720g2);
                dp0Var.m721h(dp0Var.m720g() + iRound2);
                py0Var.f4993f = fM720g2 - iRound2;
                if (!z8) {
                    fFloatValue2 = fM720g2;
                }
                return Float.valueOf(fFloatValue2);
            case 20:
                lz0 lz0Var = (lz0) this.f4376e;
                return new ok0(lz0Var.m2092c(lz0Var.f3631k, ((ok0) obj).f4590a, lz0Var.f3630j));
            case 21:
                kh0 kh0Var = (kh0) this.f4376e;
                if (obj instanceof e41) {
                    ((e41) obj).m783f(4);
                }
                kh0Var.m1890a(obj);
                return na1.f4229a;
            case 22:
                e31 e31Var = (e31) this.f4376e;
                synchronized (e31Var.f1290g) {
                    d31 d31Var = e31Var.f1292i;
                    d31Var.getClass();
                    Object obj2 = d31Var.f955b;
                    obj2.getClass();
                    int i5 = d31Var.f957d;
                    ch0 ch0Var = d31Var.f956c;
                    if (ch0Var == null) {
                        ch0Var = new ch0();
                        d31Var.f956c = ch0Var;
                        d31Var.f959f.m1707m(obj2, ch0Var);
                    }
                    d31Var.m631b(obj, i5, obj2, ch0Var);
                }
                return na1.f4229a;
            case 23:
                C0793u7 c0793u7 = (C0793u7) obj;
                ((InterfaceC0904ww) this.f4376e).invoke(c0793u7.f6150e.getValue(), AbstractC0398kl.f3213x.f5090b.invoke(c0793u7.f6151f));
                return na1.f4229a;
            case 24:
                f01 f01Var = (f01) this.f4376e;
                AutofillValue autofillValue = ((C0460m5) obj).f3805a;
                Boolean boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    p81 p81Var = boolValueOf.booleanValue() ? p81.f4779d : p81.f4780e;
                    u40[] u40VarArr = d01.f923a;
                    e01 e01Var = b01.f315H;
                    u40 u40Var = d01.f923a[25];
                    f01Var.mo17a(e01Var, p81Var);
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                return new C0379k4(i4, (b91) this.f4376e);
        }
    }

    public /* synthetic */ C0532o(int i, Object obj, Object obj2) {
        this.f4375d = i;
        this.f4376e = obj;
    }
}
