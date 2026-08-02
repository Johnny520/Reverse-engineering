package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nw2 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ uh1 f7355h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ eq2 f7356i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f7357j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f7358k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0402kw f7359l;

    public nw2(uh1 uh1Var, eq2 eq2Var, long j, float f, C0402kw c0402kw) {
        this.f7355h = uh1Var;
        this.f7356i = eq2Var;
        this.f7357j = j;
        this.f7358k = f;
        this.f7359l = c0402kw;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9  */
    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12g(Object obj, Object obj2) {
        boolean z;
        eq2 eq2Var;
        rh1 rh1Var;
        uh1 uh1VarM5184M;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        int iIntValue = ((Number) obj2).intValue();
        go0 go0Var = (go0) interfaceC0596px;
        boolean zM1958O = go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2);
        a83 a83Var = a83.f116a;
        if (!zM1958O) {
            go0Var.m1961R();
            return a83Var;
        }
        C0593pu c0593pu = (C0593pu) go0Var.m1988j(AbstractC0670ru.f9755a);
        boolean zBooleanValue = ((Boolean) go0Var.m1988j(AbstractC0670ru.f9756b)).booleanValue();
        long jMax = c0593pu.f8602p;
        long j = this.f7357j;
        int i11 = 24;
        if (C0363ju.m2566c(j, jMax) && zBooleanValue) {
            if (za0.m6404b(this.f7358k, 0.0f)) {
                z = true;
            } else {
                long jM2564a = C0363ju.m2564a(C0363ju.m2565b(((((float) Math.log(r4 + 1.0f)) * 4.5f) + 2.0f) / 100.0f, c0593pu.f8606t), C0363ju.m2569f(jMax));
                float fM2567d = C0363ju.m2567d(jMax);
                float fM2567d2 = C0363ju.m2567d(jM2564a);
                float f = 1.0f - fM2567d2;
                float f2 = (fM2567d * f) + fM2567d2;
                float fM2571h = f2 == 0.0f ? 0.0f : (((C0363ju.m2571h(jMax) * fM2567d) * f) + (C0363ju.m2571h(jM2564a) * fM2567d2)) / f2;
                float fM2570g = f2 == 0.0f ? 0.0f : (((C0363ju.m2570g(jMax) * fM2567d) * f) + (C0363ju.m2570g(jM2564a) * fM2567d2)) / f2;
                float fM2568e = f2 == 0.0f ? 0.0f : (((C0363ju.m2568e(jMax) * fM2567d) * f) + (C0363ju.m2568e(jM2564a) * fM2567d2)) / f2;
                AbstractC0708su abstractC0708suM2569f = C0363ju.m2569f(jMax);
                if (abstractC0708suM2569f.mo2624c()) {
                    jMax = ((long) (((int) ((fM2568e * 255.0f) + 0.5f)) | (((((int) ((f2 * 255.0f) + 0.5f)) << 24) | (((int) ((fM2571h * 255.0f) + 0.5f)) << 16)) | (((int) ((fM2570g * 255.0f) + 0.5f)) << 8)))) << 32;
                    z = true;
                } else {
                    int iFloatToRawIntBits = Float.floatToRawIntBits(fM2571h);
                    int i12 = iFloatToRawIntBits >>> 31;
                    int i13 = (iFloatToRawIntBits >>> 23) & 255;
                    int i14 = iFloatToRawIntBits & 8388607;
                    int i15 = 49;
                    int i16 = AIChatConfig.DefaultMaxTokens;
                    z = true;
                    if (i13 == 255) {
                        i2 = i14 != 0 ? 512 : 0;
                        i = 31;
                    } else {
                        i = i13 - 112;
                        if (i >= 31) {
                            i = 49;
                            i2 = 0;
                        } else if (i <= 0) {
                            if (i >= -10) {
                                int i17 = (i14 | 8388608) >> (1 - i);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i2 = i17 >> 13;
                            } else {
                                i2 = 0;
                            }
                            i = 0;
                        } else {
                            int i18 = i14 >> 13;
                            if ((iFloatToRawIntBits & 4096) != 0) {
                                i3 = (((i << 10) | i18) + 1) | (i12 << 15);
                                short s = (short) i3;
                                int iFloatToRawIntBits2 = Float.floatToRawIntBits(fM2570g);
                                int i19 = iFloatToRawIntBits2 >>> 31;
                                i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                                int i20 = iFloatToRawIntBits2 & 8388607;
                                if (i4 != 255) {
                                    i6 = i20 != 0 ? 512 : 0;
                                    i5 = 31;
                                } else {
                                    i5 = i4 - 112;
                                    if (i5 >= 31) {
                                        i5 = 49;
                                    } else if (i5 > 0) {
                                        i6 = i20 >> 13;
                                        if ((iFloatToRawIntBits2 & 4096) != 0) {
                                            i7 = (((i5 << 10) | i6) + 1) | (i19 << 15);
                                        }
                                        short s2 = (short) i7;
                                        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fM2568e);
                                        int i21 = iFloatToRawIntBits3 >>> 31;
                                        i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                        int i22 = iFloatToRawIntBits3 & 8388607;
                                        if (i8 == 255) {
                                            if (i22 == 0) {
                                                i16 = 0;
                                            }
                                            i15 = 31;
                                            i9 = i16;
                                        } else {
                                            int i23 = i8 - 112;
                                            if (i23 >= 31) {
                                                i9 = 0;
                                            } else if (i23 <= 0) {
                                                if (i23 >= -10) {
                                                    int i24 = (i22 | 8388608) >> (1 - i23);
                                                    if ((i24 & 4096) != 0) {
                                                        i24 += 8192;
                                                    }
                                                    i9 = i24 >> 13;
                                                } else {
                                                    i9 = 0;
                                                }
                                                i15 = 0;
                                            } else {
                                                i9 = i22 >> 13;
                                                if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                    i10 = ((i9 | (i23 << 10)) + 1) | (i21 << 15);
                                                    jMax = ((((long) s2) & 65535) << 32) | ((((long) s) & 65535) << 48) | ((((long) ((short) i10)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC0708suM2569f.f10370c) & 63);
                                                } else {
                                                    i15 = i23;
                                                }
                                            }
                                        }
                                        i10 = i9 | (i21 << 15) | (i15 << 10);
                                        jMax = ((((long) s2) & 65535) << 32) | ((((long) s) & 65535) << 48) | ((((long) ((short) i10)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC0708suM2569f.f10370c) & 63);
                                    } else if (i5 >= -10) {
                                        int i25 = (i20 | 8388608) >> (1 - i5);
                                        if ((i25 & 4096) != 0) {
                                            i25 += 8192;
                                        }
                                        i6 = i25 >> 13;
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                    }
                                    i6 = 0;
                                }
                                i7 = (i5 << 10) | (i19 << 15) | i6;
                                short s22 = (short) i7;
                                int iFloatToRawIntBits32 = Float.floatToRawIntBits(fM2568e);
                                int i212 = iFloatToRawIntBits32 >>> 31;
                                i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                                int i222 = iFloatToRawIntBits32 & 8388607;
                                if (i8 == 255) {
                                }
                                i10 = i9 | (i212 << 15) | (i15 << 10);
                                jMax = ((((long) s22) & 65535) << 32) | ((((long) s) & 65535) << 48) | ((((long) ((short) i10)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC0708suM2569f.f10370c) & 63);
                            } else {
                                i2 = i18;
                            }
                        }
                    }
                    i3 = i2 | (i << 10) | (i12 << 15);
                    short s3 = (short) i3;
                    int iFloatToRawIntBits22 = Float.floatToRawIntBits(fM2570g);
                    int i192 = iFloatToRawIntBits22 >>> 31;
                    i4 = (iFloatToRawIntBits22 >>> 23) & 255;
                    int i202 = iFloatToRawIntBits22 & 8388607;
                    if (i4 != 255) {
                    }
                    i7 = (i5 << 10) | (i192 << 15) | i6;
                    short s222 = (short) i7;
                    int iFloatToRawIntBits322 = Float.floatToRawIntBits(fM2568e);
                    int i2122 = iFloatToRawIntBits322 >>> 31;
                    i8 = (iFloatToRawIntBits322 >>> 23) & 255;
                    int i2222 = iFloatToRawIntBits322 & 8388607;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i2122 << 15) | (i15 << 10);
                    jMax = ((((long) s222) & 65535) << 32) | ((((long) s3) & 65535) << 48) | ((((long) ((short) i10)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC0708suM2569f.f10370c) & 63);
                }
            }
        } else {
            z = true;
            jMax = j;
        }
        float fMo689A = ((e70) go0Var.m1988j(AbstractC0441ly.f6382h)).mo689A(10.0f);
        rh1 rh1Var2 = rh1.f9587a;
        eq2 eq2Var2 = this.f7356i;
        if (fMo689A > 0.0f) {
            long j2 = m33.f6464b;
            long j3 = tq0.f10898a;
            uh1VarM5184M = AbstractC0731te.m5184M(rh1Var2, 1.0f, 1.0f, 1.0f, fMo689A, j2, eq2Var2, false, j3, j3);
            rh1Var = rh1Var2;
            eq2Var = eq2Var2;
        } else {
            eq2Var = eq2Var2;
            rh1Var = rh1Var2;
            uh1VarM5184M = rh1Var;
        }
        uh1 uh1VarM825z = ci0.m825z(gf1.m1896n(this.f7355h.mo4491c(uh1VarM5184M).mo4491c(rh1Var), jMax, eq2Var), eq2Var);
        Object objM1956L = go0Var.m1956L();
        C0160eb c0160eb = C0520nx.f7360a;
        if (objM1956L == c0160eb) {
            objM1956L = new ml2(i11);
            go0Var.m1981f0(objM1956L);
        }
        uh1 uh1VarM3321a = nn2.m3321a(uh1VarM825z, false, (in0) objM1956L);
        Object objM1956L2 = go0Var.m1956L();
        if (objM1956L2 == c0160eb) {
            objM1956L2 = zo1.f13996c;
            go0Var.m1981f0(objM1956L2);
        }
        uh1 uh1VarM5804a = vw2.m5804a(uh1VarM3321a, a83Var, (PointerInputEventHandler) objM1956L2);
        nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, z);
        int iHashCode = Long.hashCode(go0Var.f3614T);
        yy1 yy1VarM1990l = go0Var.m1990l();
        uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5804a);
        InterfaceC0293hx.f4166c.getClass();
        C0367jy c0367jy = C0256gx.f3727b;
        go0Var.m1969Z();
        if (go0Var.f3613S) {
            go0Var.m1989k(c0367jy);
        } else {
            go0Var.m1987i0();
        }
        yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
        yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
        C0419lc c0419lc = C0256gx.f3731f;
        if (go0Var.f3613S || !t11.m5086l(go0Var.m1956L(), Integer.valueOf(iHashCode))) {
            go0Var.m1981f0(Integer.valueOf(iHashCode));
            go0Var.m1972b(c0419lc, Integer.valueOf(iHashCode));
        }
        yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
        this.f7359l.mo12g(go0Var, 0);
        go0Var.m1994p(true);
        return a83Var;
    }
}
