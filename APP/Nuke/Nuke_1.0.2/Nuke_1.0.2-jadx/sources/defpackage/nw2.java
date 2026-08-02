package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nw2 implements mn0 {
    public final /* synthetic */ uh1 h;
    public final /* synthetic */ eq2 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ kw l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nw2(uh1 uh1Var, eq2 eq2Var, long j, float f, kw kwVar) {
        this.h = uh1Var;
        this.i = eq2Var;
        this.j = j;
        this.k = f;
        this.l = kwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9  */
    @Override // defpackage.mn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2) {
        boolean z;
        eq2 eq2Var;
        rh1 rh1Var;
        uh1 uh1VarM;
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
        px pxVar = (px) obj;
        int iIntValue = ((Number) obj2).intValue();
        go0 go0Var = (go0) pxVar;
        boolean zO = go0Var.O(iIntValue & 1, (iIntValue & 3) != 2);
        a83 a83Var = a83.a;
        if (!zO) {
            go0Var.R();
            return a83Var;
        }
        pu puVar = (pu) go0Var.j(ru.a);
        boolean zBooleanValue = ((Boolean) go0Var.j(ru.b)).booleanValue();
        long jMax = puVar.p;
        long j = this.j;
        int i11 = 24;
        if (ju.c(j, jMax) && zBooleanValue) {
            if (za0.b(this.k, 0.0f)) {
                z = true;
            } else {
                long jA = ju.a(ju.b(((((float) Math.log(r4 + 1.0f)) * 4.5f) + 2.0f) / 100.0f, puVar.t), ju.f(jMax));
                float fD = ju.d(jMax);
                float fD2 = ju.d(jA);
                float f = 1.0f - fD2;
                float f2 = (fD * f) + fD2;
                float fH = f2 == 0.0f ? 0.0f : (((ju.h(jMax) * fD) * f) + (ju.h(jA) * fD2)) / f2;
                float fG = f2 == 0.0f ? 0.0f : (((ju.g(jMax) * fD) * f) + (ju.g(jA) * fD2)) / f2;
                float fE = f2 == 0.0f ? 0.0f : (((ju.e(jMax) * fD) * f) + (ju.e(jA) * fD2)) / f2;
                su suVarF = ju.f(jMax);
                if (suVarF.c()) {
                    jMax = ((long) (((int) ((fE * 255.0f) + 0.5f)) | (((((int) ((f2 * 255.0f) + 0.5f)) << 24) | (((int) ((fH * 255.0f) + 0.5f)) << 16)) | (((int) ((fG * 255.0f) + 0.5f)) << 8)))) << 32;
                    z = true;
                } else {
                    int iFloatToRawIntBits = Float.floatToRawIntBits(fH);
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
                                int iFloatToRawIntBits2 = Float.floatToRawIntBits(fG);
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
                                        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fE);
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
                                                    jMax = ((((long) s2) & 65535) << 32) | ((((long) s) & 65535) << 48) | ((((long) ((short) i10)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) suVarF.c) & 63);
                                                } else {
                                                    i15 = i23;
                                                }
                                            }
                                        }
                                        i10 = i9 | (i21 << 15) | (i15 << 10);
                                        jMax = ((((long) s2) & 65535) << 32) | ((((long) s) & 65535) << 48) | ((((long) ((short) i10)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) suVarF.c) & 63);
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
                                int iFloatToRawIntBits32 = Float.floatToRawIntBits(fE);
                                int i212 = iFloatToRawIntBits32 >>> 31;
                                i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                                int i222 = iFloatToRawIntBits32 & 8388607;
                                if (i8 == 255) {
                                }
                                i10 = i9 | (i212 << 15) | (i15 << 10);
                                jMax = ((((long) s22) & 65535) << 32) | ((((long) s) & 65535) << 48) | ((((long) ((short) i10)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) suVarF.c) & 63);
                            } else {
                                i2 = i18;
                            }
                        }
                    }
                    i3 = i2 | (i << 10) | (i12 << 15);
                    short s3 = (short) i3;
                    int iFloatToRawIntBits22 = Float.floatToRawIntBits(fG);
                    int i192 = iFloatToRawIntBits22 >>> 31;
                    i4 = (iFloatToRawIntBits22 >>> 23) & 255;
                    int i202 = iFloatToRawIntBits22 & 8388607;
                    if (i4 != 255) {
                    }
                    i7 = (i5 << 10) | (i192 << 15) | i6;
                    short s222 = (short) i7;
                    int iFloatToRawIntBits322 = Float.floatToRawIntBits(fE);
                    int i2122 = iFloatToRawIntBits322 >>> 31;
                    i8 = (iFloatToRawIntBits322 >>> 23) & 255;
                    int i2222 = iFloatToRawIntBits322 & 8388607;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i2122 << 15) | (i15 << 10);
                    jMax = ((((long) s222) & 65535) << 32) | ((((long) s3) & 65535) << 48) | ((((long) ((short) i10)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) suVarF.c) & 63);
                }
            }
        } else {
            z = true;
            jMax = j;
        }
        float fA = ((e70) go0Var.j(ly.h)).A(10.0f);
        rh1 rh1Var2 = rh1.a;
        eq2 eq2Var2 = this.i;
        if (fA > 0.0f) {
            long j2 = m33.b;
            long j3 = tq0.a;
            uh1VarM = te.M(rh1Var2, 1.0f, 1.0f, 1.0f, fA, j2, eq2Var2, false, j3, j3);
            rh1Var = rh1Var2;
            eq2Var = eq2Var2;
        } else {
            eq2Var = eq2Var2;
            rh1Var = rh1Var2;
            uh1VarM = rh1Var;
        }
        uh1 uh1VarZ = ci0.z(gf1.n(this.h.c(uh1VarM).c(rh1Var), jMax, eq2Var), eq2Var);
        Object objL = go0Var.L();
        eb ebVar = nx.a;
        if (objL == ebVar) {
            objL = new ml2(i11);
            go0Var.f0(objL);
        }
        uh1 uh1VarA = nn2.a(uh1VarZ, false, (in0) objL);
        Object objL2 = go0Var.L();
        if (objL2 == ebVar) {
            objL2 = zo1.c;
            go0Var.f0(objL2);
        }
        uh1 uh1VarA2 = vw2.a(uh1VarA, a83Var, (PointerInputEventHandler) objL2);
        nf1 nf1VarD = dm.d(sn.j, z);
        int iHashCode = Long.hashCode(go0Var.T);
        yy1 yy1VarL = go0Var.l();
        uh1 uh1VarM2 = tl.M(go0Var, uh1VarA2);
        hx.c.getClass();
        jy jyVar = gx.b;
        go0Var.Z();
        if (go0Var.S) {
            go0Var.k(jyVar);
        } else {
            go0Var.i0();
        }
        yf3.c(go0Var, gx.e, nf1VarD);
        yf3.c(go0Var, gx.d, yy1VarL);
        lc lcVar = gx.f;
        if (go0Var.S || !t11.l(go0Var.L(), Integer.valueOf(iHashCode))) {
            go0Var.f0(Integer.valueOf(iHashCode));
            go0Var.b(lcVar, Integer.valueOf(iHashCode));
        }
        yf3.c(go0Var, gx.c, uh1VarM2);
        this.l.g(go0Var, 0);
        go0Var.p(true);
        return a83Var;
    }
}
