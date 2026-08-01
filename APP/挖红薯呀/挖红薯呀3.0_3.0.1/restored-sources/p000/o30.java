package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.os.Build;
import android.util.Base64;
import android.view.Display;
import android.view.RoundedCorner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o30 {

    /* JADX INFO: renamed from: A */
    public static final EnumC0472mf f4415A;

    /* JADX INFO: renamed from: B */
    public static final z01 f4416B;

    /* JADX INFO: renamed from: C */
    public static final float f4417C;

    /* JADX INFO: renamed from: D */
    public static final float f4418D;

    /* JADX INFO: renamed from: E */
    public static final EnumC0472mf f4419E;

    /* JADX INFO: renamed from: F */
    public static final float f4420F;

    /* JADX INFO: renamed from: G */
    public static final float f4421G;

    /* JADX INFO: renamed from: H */
    public static final float f4422H;

    /* JADX INFO: renamed from: I */
    public static final z01 f4423I;

    /* JADX INFO: renamed from: J */
    public static final float f4424J;

    /* JADX INFO: renamed from: K */
    public static final EnumC0472mf f4425K;

    /* JADX INFO: renamed from: L */
    public static final EnumC0472mf f4426L;

    /* JADX INFO: renamed from: M */
    public static final float f4427M;

    /* JADX INFO: renamed from: N */
    public static final EnumC0472mf f4428N;

    /* JADX INFO: renamed from: O */
    public static final EnumC0472mf f4429O;

    /* JADX INFO: renamed from: P */
    public static final jo0 f4430P;

    /* JADX INFO: renamed from: a */
    public static final C1014zr f4431a;

    /* JADX INFO: renamed from: b */
    public static final int[] f4432b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final long[] f4433c = new long[0];

    /* JADX INFO: renamed from: d */
    public static final Object[] f4434d = new Object[0];

    /* JADX INFO: renamed from: e */
    public static final float f4435e = 1.0f;

    /* JADX INFO: renamed from: f */
    public static final EnumC0472mf f4436f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0472mf f4437g;

    /* JADX INFO: renamed from: h */
    public static final float f4438h;

    /* JADX INFO: renamed from: i */
    public static final float f4439i;

    /* JADX INFO: renamed from: j */
    public static final float f4440j;

    /* JADX INFO: renamed from: k */
    public static final C0272h6 f4441k;

    /* JADX INFO: renamed from: l */
    public static final C1014zr f4442l;

    /* JADX INFO: renamed from: m */
    public static final StackTraceElement[] f4443m;

    /* JADX INFO: renamed from: n */
    public static final C0111d f4444n;

    /* JADX INFO: renamed from: o */
    public static final long[] f4445o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0472mf f4446p;

    /* JADX INFO: renamed from: q */
    public static final float f4447q;

    /* JADX INFO: renamed from: r */
    public static final EnumC0472mf f4448r;

    /* JADX INFO: renamed from: s */
    public static final float f4449s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0472mf f4450t;

    /* JADX INFO: renamed from: u */
    public static final float f4451u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0472mf f4452v;

    /* JADX INFO: renamed from: w */
    public static final float f4453w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0472mf f4454x;

    /* JADX INFO: renamed from: y */
    public static final float f4455y;

    /* JADX INFO: renamed from: z */
    public static final EnumC0472mf f4456z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f4431a = new C1014zr("RESUME_TOKEN", i);
        EnumC0472mf enumC0472mf = EnumC0472mf.f3941q;
        f4436f = enumC0472mf;
        f4437g = EnumC0472mf.f3942r;
        f4438h = 0.38f;
        f4439i = 6.0f;
        f4440j = 1.0f;
        int i2 = 5;
        f4441k = new C0272h6(i2);
        f4442l = new C1014zr("NULL", i);
        f4443m = new StackTraceElement[0];
        f4444n = new C0111d(19, new C0717s8(18), new pg0(i2));
        f4445o = new long[0];
        f4446p = EnumC0472mf.f3938n;
        f4447q = 1.0f;
        EnumC0472mf enumC0472mf2 = EnumC0472mf.f3931g;
        f4448r = enumC0472mf2;
        f4449s = 0.38f;
        f4450t = enumC0472mf2;
        f4451u = 0.12f;
        f4452v = enumC0472mf2;
        f4453w = 0.38f;
        f4454x = enumC0472mf;
        f4455y = 0.38f;
        f4456z = enumC0472mf;
        f4415A = enumC0472mf2;
        z01 z01Var = z01.f7748e;
        f4416B = z01Var;
        f4417C = 28.0f;
        f4418D = 24.0f;
        f4419E = EnumC0472mf.f3929e;
        f4420F = 40.0f;
        f4421G = 32.0f;
        f4422H = 2.0f;
        f4423I = z01Var;
        f4424J = 52.0f;
        EnumC0472mf enumC0472mf3 = EnumC0472mf.f3933i;
        f4425K = enumC0472mf3;
        f4426L = enumC0472mf3;
        f4427M = 16.0f;
        f4428N = enumC0472mf;
        f4429O = enumC0472mf;
        f4430P = new jo0(27);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static void m2757A() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final BlendMode m2758B(int i) {
        return i == 0 ? BlendMode.CLEAR : i == 1 ? BlendMode.SRC : i == 2 ? BlendMode.DST : i == 3 ? BlendMode.SRC_OVER : i == 4 ? BlendMode.DST_OVER : i == 5 ? BlendMode.SRC_IN : i == 6 ? BlendMode.DST_IN : i == 7 ? BlendMode.SRC_OUT : i == 8 ? BlendMode.DST_OUT : i == 9 ? BlendMode.SRC_ATOP : i == 10 ? BlendMode.DST_ATOP : i == 11 ? BlendMode.XOR : i == 12 ? BlendMode.PLUS : i == 13 ? BlendMode.MODULATE : i == 14 ? BlendMode.SCREEN : i == 15 ? BlendMode.OVERLAY : i == 16 ? BlendMode.DARKEN : i == 17 ? BlendMode.LIGHTEN : i == 18 ? BlendMode.COLOR_DODGE : i == 19 ? BlendMode.COLOR_BURN : i == 20 ? BlendMode.HARD_LIGHT : i == 21 ? BlendMode.SOFT_LIGHT : i == 22 ? BlendMode.DIFFERENCE : i == 23 ? BlendMode.EXCLUSION : i == 24 ? BlendMode.MULTIPLY : i == 25 ? BlendMode.HUE : i == 26 ? BlendMode.SATURATION : i == 27 ? BlendMode.COLOR : i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final long m2759C(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static String m2760D(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04aa  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2761a(b91 b91Var, InterfaceC0742sw interfaceC0742sw, pe0 pe0Var, C0863vs c0863vs, C0367jt c0367jt, InterfaceC0904ww interfaceC0904ww, InterfaceC0941xw interfaceC0941xw, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        int i3;
        int i4;
        gp0 gp0Var;
        C0863vs c0863vs2;
        boolean zM3104f;
        Object objM3080L;
        C0367jt c0367jt2;
        boolean z;
        w81 w81Var;
        boolean z2;
        w81 w81Var2;
        boolean z3;
        w81 w81Var3;
        boolean zM3108h;
        Object objM3080L2;
        boolean zM3106g;
        Object objM3080L3;
        Object objM3080L4;
        gp0 gp0Var2 = b91Var.f462d;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1912839215);
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3104f(b91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0742sw) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3104f(pe0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c0616pi.m3104f(c0863vs) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c0616pi.m3104f(c0367jt) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0904ww) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
        }
        int i5 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= c0616pi.m3108h(interfaceC0941xw) ? 8388608 : 4194304;
        }
        if (!c0616pi.m3082O(i5 & 1, (4793491 & i5) != 4793490)) {
            c0616pi.m3085R();
        } else if (((Boolean) interfaceC0742sw.invoke(gp0Var2.getValue())).booleanValue() || ((Boolean) interfaceC0742sw.invoke(b91Var.m328c())).booleanValue() || b91Var.m332g() || b91Var.m329d()) {
            c0616pi.m3090W(-232413539);
            int i6 = i5 & 14;
            int i7 = i6 | 48;
            int i8 = i7 & 14;
            boolean z4 = ((i8 ^ 6) > 4 && c0616pi.m3104f(b91Var)) || (i7 & 6) == 4;
            Object objM3080L5 = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (z4 || objM3080L5 == c0675r3) {
                objM3080L5 = b91Var.m328c();
                c0616pi.m3107g0(objM3080L5);
            }
            if (b91Var.m332g()) {
                objM3080L5 = b91Var.m328c();
            }
            c0616pi.m3090W(1844425648);
            EnumC0485ms enumC0485msM2786z = m2786z(b91Var, interfaceC0742sw, objM3080L5, c0616pi);
            c0616pi.m3119p(false);
            Object value = gp0Var2.getValue();
            c0616pi.m3090W(1844425648);
            EnumC0485ms enumC0485msM2786z2 = m2786z(b91Var, interfaceC0742sw, value, c0616pi);
            c0616pi.m3119p(false);
            int i9 = i8 | 3072;
            int i10 = d91.f1007a;
            int i11 = (i9 & 14) ^ 6;
            boolean z5 = (i11 > 4 && c0616pi.m3104f(b91Var)) || (i9 & 6) == 4;
            Object objM3080L6 = c0616pi.m3080L();
            if (z5 || objM3080L6 == c0675r3) {
                i3 = i5;
                i4 = i9;
                objM3080L6 = new b91(new C0111d(enumC0485msM2786z), b91Var, b91Var.f461c.concat(" > EnterExitTransition"));
                c0616pi.m3107g0(objM3080L6);
            } else {
                i3 = i5;
                i4 = i9;
            }
            b91 b91Var2 = (b91) objM3080L6;
            boolean zM3104f2 = ((i11 > 4 && c0616pi.m3104f(b91Var)) || (i4 & 6) == 4) | c0616pi.m3104f(b91Var2);
            Object objM3080L7 = c0616pi.m3080L();
            if (zM3104f2 || objM3080L7 == c0675r3) {
                objM3080L7 = new C0073c(21, b91Var, b91Var2);
                c0616pi.m3107g0(objM3080L7);
            }
            s91.m4038c(b91Var2, (InterfaceC0742sw) objM3080L7, c0616pi);
            if (b91Var.m332g()) {
                b91Var2.m335j(enumC0485msM2786z, enumC0485msM2786z2);
            } else {
                b91Var2.m336k(enumC0485msM2786z2);
                b91Var2.f469k.setValue(Boolean.FALSE);
            }
            oh0 oh0VarM3424z = r60.m3424z(interfaceC0904ww, c0616pi);
            Object objM328c = b91Var2.m328c();
            gp0 gp0Var3 = b91Var2.f462d;
            Object objInvoke = interfaceC0904ww.invoke(objM328c, gp0Var3.getValue());
            boolean zM3104f3 = c0616pi.m3104f(b91Var2) | c0616pi.m3104f(oh0VarM3424z);
            Object objM3080L8 = c0616pi.m3080L();
            InterfaceC0322ik interfaceC0322ik = null;
            if (zM3104f3 || objM3080L8 == c0675r3) {
                objM3080L8 = new C0302i(b91Var2, oh0VarM3424z, interfaceC0322ik, 1);
                c0616pi.m3107g0(objM3080L8);
            }
            InterfaceC0904ww interfaceC0904ww2 = (InterfaceC0904ww) objM3080L8;
            Object objM3080L9 = c0616pi.m3080L();
            if (objM3080L9 == c0675r3) {
                objM3080L9 = r60.m3419u(objInvoke);
                c0616pi.m3107g0(objM3080L9);
            }
            oh0 oh0Var = (oh0) objM3080L9;
            boolean zM3108h2 = c0616pi.m3108h(interfaceC0904ww2);
            Object objM3080L10 = c0616pi.m3080L();
            if (zM3108h2 || objM3080L10 == c0675r3) {
                objM3080L10 = new C0302i(interfaceC0904ww2, oh0Var, interfaceC0322ik, 11);
                c0616pi.m3107g0(objM3080L10);
            }
            s91.m4039d(c0616pi, (InterfaceC0904ww) objM3080L10, na1.f4229a);
            Object objM328c2 = b91Var2.m328c();
            EnumC0485ms enumC0485ms = EnumC0485ms.f4028f;
            if (objM328c2 == enumC0485ms && gp0Var3.getValue() == enumC0485ms && ((Boolean) oh0Var.getValue()).booleanValue()) {
                c0616pi.m3090W(-272333293);
            } else {
                c0616pi.m3090W(-231383533);
                boolean z6 = i6 == 4;
                Object objM3080L11 = c0616pi.m3080L();
                if (z6 || objM3080L11 == c0675r3) {
                    objM3080L11 = new C0605p7();
                    c0616pi.m3107g0(objM3080L11);
                }
                C0605p7 c0605p7 = (C0605p7) objM3080L11;
                o31 o31Var = AbstractC0700rs.f5549a;
                Object objM3080L12 = c0616pi.m3080L();
                if (objM3080L12 == c0675r3) {
                    objM3080L12 = C0094cj.f821g;
                    c0616pi.m3107g0(objM3080L12);
                }
                InterfaceC0298hw interfaceC0298hw = (InterfaceC0298hw) objM3080L12;
                boolean zM3104f4 = c0616pi.m3104f(b91Var2);
                Object objM3080L13 = c0616pi.m3080L();
                if (zM3104f4 || objM3080L13 == c0675r3) {
                    objM3080L13 = r60.m3419u(c0863vs);
                    c0616pi.m3107g0(objM3080L13);
                }
                oh0 oh0Var2 = (oh0) objM3080L13;
                Object objM328c3 = b91Var2.m328c();
                Object value2 = gp0Var3.getValue();
                EnumC0485ms enumC0485ms2 = EnumC0485ms.f4027e;
                if (objM328c3 != value2 || b91Var2.m328c() != enumC0485ms2) {
                    if (gp0Var3.getValue() == enumC0485ms2) {
                        c91 c91Var = ((C0863vs) oh0Var2.getValue()).f6810a;
                        c91 c91Var2 = c0863vs.f6810a;
                        C0388kd c0388kd = c91Var2.f762a;
                        if (c0388kd == null) {
                            c0388kd = c91Var.f762a;
                        }
                        Map map = c91Var.f764c;
                        Map map2 = c91Var2.f764c;
                        map.getClass();
                        map2.getClass();
                        gp0Var = gp0Var3;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.putAll(map2);
                        oh0Var2.setValue(new C0863vs(new c91((o30) null, c0388kd, linkedHashMap, 32)));
                    }
                    c0863vs2 = (C0863vs) oh0Var2.getValue();
                    zM3104f = c0616pi.m3104f(b91Var2);
                    objM3080L = c0616pi.m3080L();
                    if (!zM3104f || objM3080L == c0675r3) {
                        objM3080L = r60.m3419u(c0367jt);
                        c0616pi.m3107g0(objM3080L);
                    }
                    oh0 oh0Var3 = (oh0) objM3080L;
                    if (b91Var2.m328c() == gp0Var.getValue() || b91Var2.m328c() != enumC0485ms2) {
                        if (gp0Var.getValue() != enumC0485ms2) {
                            c91 c91Var3 = ((C0367jt) oh0Var3.getValue()).f2940a;
                            c91 c91Var4 = c0367jt.f2940a;
                            C0388kd c0388kd2 = c91Var4.f762a;
                            if (c0388kd2 == null) {
                                c0388kd2 = c91Var3.f762a;
                            }
                            boolean z7 = c91Var4.f763b || c91Var3.f763b;
                            Map map3 = c91Var3.f764c;
                            Map map4 = c91Var4.f764c;
                            map3.getClass();
                            map4.getClass();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                            linkedHashMap2.putAll(map4);
                            oh0Var3.setValue(new C0367jt(new c91((o30) null, c0388kd2, z7, linkedHashMap2)));
                        }
                    } else if (b91Var2.m332g()) {
                        oh0Var3.setValue(c0367jt);
                    } else {
                        oh0Var3.setValue(C0367jt.f2938b);
                    }
                    c0367jt2 = (C0367jt) oh0Var3.getValue();
                    z = c0863vs2.f6810a.f762a == null || c0367jt2.f2940a.f762a != null;
                    c0616pi.m3090W(133898448);
                    c0616pi.m3119p(false);
                    if (z) {
                        c0616pi.m3090W(134101063);
                        c0616pi.m3119p(false);
                        w81Var = null;
                    } else {
                        c0616pi.m3090W(133990239);
                        q91 q91Var = AbstractC0398kl.f3188E;
                        Object objM3080L14 = c0616pi.m3080L();
                        if (objM3080L14 == c0675r3) {
                            objM3080L14 = "Built-in shrink/expand";
                            c0616pi.m3107g0("Built-in shrink/expand");
                        }
                        w81 w81VarM671a = d91.m671a(b91Var2, q91Var, (String) objM3080L14, c0616pi);
                        c0616pi.m3119p(false);
                        w81Var = w81VarM671a;
                    }
                    if (z) {
                        z2 = false;
                        c0616pi.m3090W(134345095);
                        c0616pi.m3119p(false);
                        w81Var2 = null;
                    } else {
                        c0616pi.m3090W(134174689);
                        q91 q91Var2 = AbstractC0398kl.f3187D;
                        Object objM3080L15 = c0616pi.m3080L();
                        if (objM3080L15 == c0675r3) {
                            objM3080L15 = "Built-in InterruptionHandlingOffset";
                            c0616pi.m3107g0("Built-in InterruptionHandlingOffset");
                        }
                        w81 w81VarM671a2 = d91.m671a(b91Var2, q91Var2, (String) objM3080L15, c0616pi);
                        z2 = false;
                        c0616pi.m3119p(false);
                        w81Var2 = w81VarM671a2;
                    }
                    z3 = !z;
                    float[] fArr = C0687rf.f5387a;
                    c0616pi.m3090W(135150476);
                    c0616pi.m3119p(z2);
                    c0616pi.m3090W(-703709976);
                    c0616pi.m3119p(z2);
                    c0616pi.m3090W(-703472888);
                    c0616pi.m3119p(z2);
                    c0616pi.m3090W(-703222904);
                    c0616pi.m3119p(z2);
                    w81Var3 = null;
                    zM3108h = c0616pi.m3108h(null) | c0616pi.m3104f(c0863vs2) | c0616pi.m3104f(c0367jt2) | c0616pi.m3108h(null) | c0616pi.m3104f(b91Var2) | c0616pi.m3108h(null);
                    objM3080L2 = c0616pi.m3080L();
                    if (!zM3108h || objM3080L2 == c0675r3) {
                        objM3080L2 = new C0589os(w81Var3, b91Var2, c0863vs2, c0367jt2);
                        c0616pi.m3107g0(objM3080L2);
                    }
                    C0589os c0589os = (C0589os) objM3080L2;
                    zM3106g = c0616pi.m3106g(z3) | c0616pi.m3104f(interfaceC0298hw);
                    objM3080L3 = c0616pi.m3080L();
                    if (!zM3106g || objM3080L3 == c0675r3) {
                        objM3080L3 = new C0663qs(z3, interfaceC0298hw);
                        c0616pi.m3107g0(objM3080L3);
                    }
                    me0 me0Var = me0.f3922a;
                    pe0 pe0VarMo2499c = p30.m2972H(me0Var, (InterfaceC0742sw) objM3080L3).mo2499c(new C0523ns(b91Var2, w81Var, w81Var2, c0863vs2, c0367jt2, interfaceC0298hw, c0589os)).mo2499c(me0Var);
                    c0616pi.m3090W(-7432681);
                    c0616pi.m3119p(false);
                    pe0 pe0VarMo2499c2 = pe0Var.mo2499c(pe0VarMo2499c.mo2499c(me0Var));
                    objM3080L4 = c0616pi.m3080L();
                    if (objM3080L4 == c0675r3) {
                        objM3080L4 = new C0236g7(c0605p7);
                        c0616pi.m3107g0(objM3080L4);
                    }
                    C0236g7 c0236g7 = (C0236g7) objM3080L4;
                    int iHashCode = Long.hashCode(c0616pi.f4878T);
                    fq0 fq0VarM3115l = c0616pi.m3115l();
                    pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarMo2499c2);
                    InterfaceC0210fi.f1733b.getClass();
                    C0094cj c0094cj = C0173ei.f1457b;
                    c0616pi.m3093Z();
                    if (c0616pi.f4877S) {
                        c0616pi.m3113j0();
                    } else {
                        c0616pi.m3114k(c0094cj);
                    }
                    w60.m4888J(c0616pi, C0173ei.f1460e, c0236g7);
                    w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
                    w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
                    w60.m4885G(c0616pi, C0173ei.f1462g);
                    w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
                    interfaceC0941xw.mo353a(c0605p7, c0616pi, Integer.valueOf((i3 >> 18) & 112));
                    c0616pi.m3119p(true);
                } else if (b91Var2.m332g()) {
                    oh0Var2.setValue(c0863vs);
                } else {
                    oh0Var2.setValue(C0863vs.f6809b);
                }
                gp0Var = gp0Var3;
                c0863vs2 = (C0863vs) oh0Var2.getValue();
                zM3104f = c0616pi.m3104f(b91Var2);
                objM3080L = c0616pi.m3080L();
                if (!zM3104f) {
                    objM3080L = r60.m3419u(c0367jt);
                    c0616pi.m3107g0(objM3080L);
                    oh0 oh0Var32 = (oh0) objM3080L;
                    if (b91Var2.m328c() == gp0Var.getValue()) {
                        if (gp0Var.getValue() != enumC0485ms2) {
                        }
                        c0367jt2 = (C0367jt) oh0Var32.getValue();
                        if (c0863vs2.f6810a.f762a == null) {
                            c0616pi.m3090W(133898448);
                            c0616pi.m3119p(false);
                            if (z) {
                            }
                            if (z) {
                            }
                            z3 = !z;
                            float[] fArr2 = C0687rf.f5387a;
                            c0616pi.m3090W(135150476);
                            c0616pi.m3119p(z2);
                            c0616pi.m3090W(-703709976);
                            c0616pi.m3119p(z2);
                            c0616pi.m3090W(-703472888);
                            c0616pi.m3119p(z2);
                            c0616pi.m3090W(-703222904);
                            c0616pi.m3119p(z2);
                            w81Var3 = null;
                            zM3108h = c0616pi.m3108h(null) | c0616pi.m3104f(c0863vs2) | c0616pi.m3104f(c0367jt2) | c0616pi.m3108h(null) | c0616pi.m3104f(b91Var2) | c0616pi.m3108h(null);
                            objM3080L2 = c0616pi.m3080L();
                            if (!zM3108h) {
                                objM3080L2 = new C0589os(w81Var3, b91Var2, c0863vs2, c0367jt2);
                                c0616pi.m3107g0(objM3080L2);
                                C0589os c0589os2 = (C0589os) objM3080L2;
                                zM3106g = c0616pi.m3106g(z3) | c0616pi.m3104f(interfaceC0298hw);
                                objM3080L3 = c0616pi.m3080L();
                                if (!zM3106g) {
                                    objM3080L3 = new C0663qs(z3, interfaceC0298hw);
                                    c0616pi.m3107g0(objM3080L3);
                                    me0 me0Var2 = me0.f3922a;
                                    pe0 pe0VarMo2499c3 = p30.m2972H(me0Var2, (InterfaceC0742sw) objM3080L3).mo2499c(new C0523ns(b91Var2, w81Var, w81Var2, c0863vs2, c0367jt2, interfaceC0298hw, c0589os2)).mo2499c(me0Var2);
                                    c0616pi.m3090W(-7432681);
                                    c0616pi.m3119p(false);
                                    pe0 pe0VarMo2499c22 = pe0Var.mo2499c(pe0VarMo2499c3.mo2499c(me0Var2));
                                    objM3080L4 = c0616pi.m3080L();
                                    if (objM3080L4 == c0675r3) {
                                    }
                                    C0236g7 c0236g72 = (C0236g7) objM3080L4;
                                    int iHashCode2 = Long.hashCode(c0616pi.f4878T);
                                    fq0 fq0VarM3115l2 = c0616pi.m3115l();
                                    pe0 pe0VarM4020E2 = s91.m4020E(c0616pi, pe0VarMo2499c22);
                                    InterfaceC0210fi.f1733b.getClass();
                                    C0094cj c0094cj2 = C0173ei.f1457b;
                                    c0616pi.m3093Z();
                                    if (c0616pi.f4877S) {
                                    }
                                    w60.m4888J(c0616pi, C0173ei.f1460e, c0236g72);
                                    w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l2);
                                    w60.m4918y(c0616pi, Integer.valueOf(iHashCode2), C0173ei.f1461f);
                                    w60.m4885G(c0616pi, C0173ei.f1462g);
                                    w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E2);
                                    interfaceC0941xw.mo353a(c0605p7, c0616pi, Integer.valueOf((i3 >> 18) & 112));
                                    c0616pi.m3119p(true);
                                }
                            }
                        }
                    }
                }
            }
            c0616pi.m3119p(false);
            c0616pi.m3119p(false);
        } else {
            c0616pi.m3090W(-272333293);
            c0616pi.m3119p(false);
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0273h7(b91Var, interfaceC0742sw, pe0Var, c0863vs, c0367jt, interfaceC0904ww, interfaceC0941xw, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2762b(InterfaceC0887wf interfaceC0887wf, boolean z, pe0 pe0Var, C0863vs c0863vs, C0367jt c0367jt, String str, InterfaceC0941xw interfaceC0941xw, InterfaceC0356ji interfaceC0356ji, int i) {
        pe0 pe0Var2;
        String str2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1799879339);
        int i2 = i | (c0616pi.m3106g(z) ? 32 : 16) | 196992;
        if (c0616pi.m3082O(i2 & 1, (599185 & i2) != 599184)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = ((i2 >> 3) & 14) | 48;
            int i4 = d91.f1007a;
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (objM3080L == c0675r3) {
                objM3080L = new b91(new C0111d(boolValueOf), null, "AnimatedVisibility");
                c0616pi.m3107g0(objM3080L);
            }
            b91 b91Var = (b91) objM3080L;
            b91Var.m326a(boolValueOf, c0616pi, (i3 & 14) | 48);
            Object objM3080L2 = c0616pi.m3080L();
            if (objM3080L2 == c0675r3) {
                objM3080L2 = new C0532o(25, b91Var);
                c0616pi.m3107g0(objM3080L2);
            }
            s91.m4038c(b91Var, (InterfaceC0742sw) objM3080L2, c0616pi);
            Object objM3080L3 = c0616pi.m3080L();
            if (objM3080L3 == c0675r3) {
                objM3080L3 = C0601p3.f4715i;
                c0616pi.m3107g0(objM3080L3);
            }
            m2763c(b91Var, (InterfaceC0742sw) objM3080L3, c0863vs, c0367jt, interfaceC0941xw, c0616pi, 224688);
            pe0Var2 = me0.f3922a;
            str2 = "AnimatedVisibility";
        } else {
            c0616pi.m3085R();
            pe0Var2 = pe0Var;
            str2 = str;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0382k7(interfaceC0887wf, z, pe0Var2, c0863vs, c0367jt, str2, interfaceC0941xw, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m2763c(b91 b91Var, InterfaceC0742sw interfaceC0742sw, C0863vs c0863vs, C0367jt c0367jt, InterfaceC0941xw interfaceC0941xw, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        InterfaceC0941xw interfaceC0941xw2;
        C0367jt c0367jt2;
        C0863vs c0863vs2;
        InterfaceC0742sw interfaceC0742sw2;
        b91 b91Var2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1706321816);
        if ((i & 6) == 0) {
            i2 = (c0616pi.m3104f(b91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0742sw) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c0616pi.m3104f(me0.f3922a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c0616pi.m3104f(c0863vs) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c0616pi.m3104f(c0367jt) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= c0616pi.m3108h(interfaceC0941xw) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
        }
        if (c0616pi.m3082O(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (z || objM3080L == c0675r3) {
                objM3080L = new C0421l7(interfaceC0742sw, b91Var);
                c0616pi.m3107g0(objM3080L);
            }
            pe0 pe0VarM1548x = AbstractC0307i4.m1548x((InterfaceC0941xw) objM3080L);
            Object objM3080L2 = c0616pi.m3080L();
            if (objM3080L2 == c0675r3) {
                objM3080L2 = C0462m7.f3829e;
                c0616pi.m3107g0(objM3080L2);
            }
            m2761a(b91Var, interfaceC0742sw, pe0VarM1548x, c0863vs, c0367jt, (InterfaceC0904ww) objM3080L2, interfaceC0941xw, c0616pi, i4 | 196608 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
            b91Var2 = b91Var;
            interfaceC0742sw2 = interfaceC0742sw;
            c0863vs2 = c0863vs;
            c0367jt2 = c0367jt;
            interfaceC0941xw2 = interfaceC0941xw;
        } else {
            interfaceC0941xw2 = interfaceC0941xw;
            c0367jt2 = c0367jt;
            c0863vs2 = c0863vs;
            interfaceC0742sw2 = interfaceC0742sw;
            b91Var2 = b91Var;
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0501n7(b91Var2, interfaceC0742sw2, c0863vs2, c0367jt2, interfaceC0941xw2, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2764d(final InterfaceC0298hw interfaceC0298hw, pe0 pe0Var, boolean z, final x01 x01Var, final C0086cc c0086cc, C0241gc c0241gc, jn0 jn0Var, final InterfaceC0941xw interfaceC0941xw, InterfaceC0356ji interfaceC0356ji, final int i, final int i2) {
        int i3;
        boolean z2;
        C0241gc c0241gc2;
        int i4;
        final jn0 jn0Var2;
        pe0 pe0Var2;
        final boolean z3;
        final C0241gc c0241gc3;
        ht0 ht0VarM3121r;
        C0241gc c0241gc4;
        xg0 xg0Var;
        long j;
        boolean z4;
        C0241gc c0241gc5;
        C0879w7 c0879w7;
        xg0 xg0Var2;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-1310015664);
        if ((i & 6) == 0) {
            i3 = (c0616pi.m3108h(interfaceC0298hw) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0616pi.m3104f(pe0Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= c0616pi.m3106g(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= c0616pi.m3104f(x01Var) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= c0616pi.m3104f(c0086cc) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    c0241gc2 = c0241gc;
                    int i6 = c0616pi.m3104f(c0241gc2) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
                    i3 |= i6;
                } else {
                    c0241gc2 = c0241gc;
                }
                i3 |= i6;
            } else {
                c0241gc2 = c0241gc;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= c0616pi.m3104f(null) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                jn0Var2 = jn0Var;
            } else {
                jn0Var2 = jn0Var;
                if ((i & 12582912) == 0) {
                    i3 |= c0616pi.m3104f(jn0Var2) ? 8388608 : 4194304;
                }
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= c0616pi.m3104f(null) ? 67108864 : 33554432;
            }
            if ((805306368 & i) == 0) {
                i3 |= c0616pi.m3108h(interfaceC0941xw) ? 536870912 : 268435456;
            }
            boolean z5 = true;
            if (c0616pi.m3082O(i3 & 1, (306783379 & i3) == 306783378)) {
                pe0Var2 = pe0Var;
                c0616pi.m3085R();
                z3 = z2;
                c0241gc3 = c0241gc2;
            } else {
                c0616pi.m3087T();
                if ((i & 1) == 0 || c0616pi.m3128y()) {
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 32) != 0) {
                        ln0 ln0Var = AbstractC0124dc.f1045a;
                        c0241gc4 = new C0241gc(AbstractC0398kl.f3205p);
                        i3 &= -458753;
                    } else {
                        c0241gc4 = c0241gc2;
                    }
                    if (i4 != 0) {
                        jn0Var2 = AbstractC0124dc.f1045a;
                    }
                    c0241gc2 = c0241gc4;
                } else {
                    c0616pi.m3085R();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                }
                c0616pi.m3120q();
                c0616pi.m3090W(1691738187);
                Object objM3080L = c0616pi.m3080L();
                C0675r3 c0675r3 = C0320ii.f2572a;
                if (objM3080L == c0675r3) {
                    objM3080L = new xg0();
                    c0616pi.m3107g0(objM3080L);
                }
                xg0 xg0Var3 = (xg0) objM3080L;
                c0616pi.m3119p(false);
                long j2 = z2 ? c0086cc.f778a : c0086cc.f780c;
                long j3 = z2 ? c0086cc.f779b : c0086cc.f781d;
                int i7 = i3;
                if (c0241gc2 == null) {
                    c0616pi.m3090W(1691921830);
                    c0616pi.m3119p(false);
                    xg0Var = xg0Var3;
                    z4 = z2;
                    c0241gc5 = c0241gc2;
                    j = j2;
                    c0879w7 = null;
                } else {
                    c0616pi.m3090W(-499611205);
                    int i8 = ((i7 >> 6) & 14) | ((i7 >> 9) & 896);
                    Object objM3080L2 = c0616pi.m3080L();
                    if (objM3080L2 == c0675r3) {
                        objM3080L2 = new c31();
                        c0616pi.m3107g0(objM3080L2);
                    }
                    c31 c31Var = (c31) objM3080L2;
                    boolean zM3104f = c0616pi.m3104f(xg0Var3);
                    Object objM3080L3 = c0616pi.m3080L();
                    if (zM3104f || objM3080L3 == c0675r3) {
                        objM3080L3 = new C0154e(xg0Var3, c31Var, null, 3);
                        c0616pi.m3107g0(objM3080L3);
                    }
                    s91.m4039d(c0616pi, (InterfaceC0904ww) objM3080L3, xg0Var3);
                    f30 f30Var = (f30) AbstractC0960ye.m5247Q(c31Var);
                    float f = (z2 && !(f30Var instanceof js0) && (f30Var instanceof C0264gz)) ? c0241gc2.f1921a : 0.0f;
                    Object objM3080L4 = c0616pi.m3080L();
                    if (objM3080L4 == c0675r3) {
                        xg0Var = xg0Var3;
                        j = j2;
                        objM3080L4 = new C0045b7(new C0520np(f), AbstractC0398kl.f3215z, null, 12);
                        c0616pi.m3107g0(objM3080L4);
                    } else {
                        xg0Var = xg0Var3;
                        j = j2;
                    }
                    C0045b7 c0045b7 = (C0045b7) objM3080L4;
                    C0520np c0520np = new C0520np(f);
                    boolean zM3108h = c0616pi.m3108h(c0045b7) | c0616pi.m3098c(f) | ((((i8 & 14) ^ 6) > 4 && c0616pi.m3106g(z2)) || (i8 & 6) == 4);
                    if ((((i8 & 896) ^ 384) <= 256 || !c0616pi.m3104f(c0241gc2)) && (i8 & 384) != 256) {
                        z5 = false;
                    }
                    boolean zM3108h2 = zM3108h | z5 | c0616pi.m3108h(f30Var);
                    Object objM3080L5 = c0616pi.m3080L();
                    if (zM3108h2 || objM3080L5 == c0675r3) {
                        z4 = z2;
                        c0241gc5 = c0241gc2;
                        objM3080L5 = new C0204fc(c0045b7, f, z4, c0241gc5, f30Var, null);
                        c0616pi.m3107g0(objM3080L5);
                    } else {
                        z4 = z2;
                        c0241gc5 = c0241gc2;
                    }
                    s91.m4039d(c0616pi, (InterfaceC0904ww) objM3080L5, c0520np);
                    c0879w7 = c0045b7.f432c;
                    c0616pi.m3119p(false);
                }
                float f2 = c0879w7 != null ? ((C0520np) c0879w7.f7016e.getValue()).f4301d : 0.0f;
                Object objM3080L6 = c0616pi.m3080L();
                if (objM3080L6 == c0675r3) {
                    objM3080L6 = new C0881w9(3);
                    c0616pi.m3107g0(objM3080L6);
                }
                pe0Var2 = pe0Var;
                pe0 pe0VarM4362a = uz0.m4362a(pe0Var2, (InterfaceC0742sw) objM3080L6);
                C0474mh c0474mhM1937w = AbstractC0398kl.m1937w(-535639973, new C0387kc(j3, jn0Var2, interfaceC0941xw), c0616pi);
                C0174ej c0174ej = h51.f2147a;
                if (xg0Var == null) {
                    c0616pi.m3090W(-1701037204);
                    Object objM3080L7 = c0616pi.m3080L();
                    if (objM3080L7 == c0675r3) {
                        objM3080L7 = new xg0();
                        c0616pi.m3107g0(objM3080L7);
                    }
                    c0616pi.m3119p(false);
                    xg0Var2 = (xg0) objM3080L7;
                } else {
                    c0616pi.m3090W(2023337163);
                    c0616pi.m3119p(false);
                    xg0Var2 = xg0Var;
                }
                C0174ej c0174ej2 = h51.f2147a;
                float f3 = ((C0520np) c0616pi.m3112j(c0174ej2)).f4301d + 0.0f;
                AbstractC0307i4.m1527c(new ct0[]{AbstractC0928xj.f7352a.mo206a(new C0207ff(j3)), c0174ej2.mo206a(new C0520np(f3))}, AbstractC0398kl.m1937w(849208527, new g51(pe0VarM4362a, x01Var, j, f3, xg0Var2, z4, interfaceC0298hw, f2, c0474mhM1937w), c0616pi), c0616pi, 56);
                z3 = z4;
                c0241gc3 = c0241gc5;
            }
            ht0VarM3121r = c0616pi.m3121r();
            if (ht0VarM3121r == null) {
                final pe0 pe0Var3 = pe0Var2;
                ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: hc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC0904ww
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o30.m2764d(interfaceC0298hw, pe0Var3, z3, x01Var, c0086cc, c0241gc3, jn0Var2, interfaceC0941xw, (InterfaceC0356ji) obj, j50.m1649A(i | 1), i2);
                        return na1.f4229a;
                    }
                };
                return;
            }
            return;
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        boolean z52 = true;
        if (c0616pi.m3082O(i3 & 1, (306783379 & i3) == 306783378)) {
        }
        ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r == null) {
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: xc.l(java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C0834vb m2765e(int i, int i2, EnumC0758tb enumC0758tb) {
        int i3 = i2 & 2;
        EnumC0758tb enumC0758tb2 = EnumC0758tb.f5968d;
        if (i3 != 0) {
            enumC0758tb = enumC0758tb2;
        }
        if (i == -2) {
            if (enumC0758tb != enumC0758tb2) {
                return new C0357jj(1, enumC0758tb);
            }
            InterfaceC0470md.f3918a.getClass();
            return new C0834vb(C0427ld.f3418b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? enumC0758tb == enumC0758tb2 ? new C0834vb(i) : new C0357jj(i, enumC0758tb) : new C0834vb(Integer.MAX_VALUE) : enumC0758tb == enumC0758tb2 ? new C0834vb(0) : new C0357jj(1, enumC0758tb);
        }
        if (enumC0758tb == enumC0758tb2) {
            return new C0357jj(1, EnumC0758tb.f5969e);
        }
        C0921xc.m5131l("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m2766f(ro0 ro0Var, pe0 pe0Var, C0276ha c0276ha, C0675r3 c0675r3, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1142754848);
        int i2 = i | (c0616pi.m3108h(ro0Var) ? 4 : 2) | (c0616pi.m3104f(c0276ha) ? 2048 : 1024) | (c0616pi.m3104f(c0675r3) ? 16384 : 8192) | (c0616pi.m3098c(1.0f) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536) | (c0616pi.m3104f(null) ? 1048576 : 524288);
        if (c0616pi.m3082O(i2 & 1, (599187 & i2) != 599186)) {
            c0616pi.m3090W(1899222916);
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r32 = C0320ii.f2572a;
            if (objM3080L == c0675r32) {
                objM3080L = new C0621pn(24);
                c0616pi.m3107g0(objM3080L);
            }
            pe0 pe0VarM4362a = uz0.m4362a(me0.f3922a, (InterfaceC0742sw) objM3080L);
            c0616pi.m3119p(false);
            pe0 pe0VarM4023J = s91.m4023J(p30.m2974J(pe0Var.mo2499c(pe0VarM4362a), null, 520191), ro0Var, c0276ha, c0675r3, null, 2);
            Object objM3080L2 = c0616pi.m3080L();
            if (objM3080L2 == c0675r32) {
                objM3080L2 = C0043b5.f378f;
                c0616pi.m3107g0(objM3080L2);
            }
            xd0 xd0Var = (xd0) objM3080L2;
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM4023J);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, xd0Var);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new n00(ro0Var, pe0Var, c0276ha, c0675r3, i, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final C0877w5 m2767g() {
        return new C0877w5(new Paint(7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m2768h(InterfaceC0298hw interfaceC0298hw, pe0 pe0Var, boolean z, x01 x01Var, C0086cc c0086cc, jn0 jn0Var, InterfaceC0941xw interfaceC0941xw, InterfaceC0356ji interfaceC0356ji, int i) {
        int i2;
        pe0 pe0Var2;
        boolean z2;
        x01 x01Var2;
        C0086cc c0086cc2;
        jn0 jn0Var2;
        C0086cc c0086cc3;
        int i3;
        jn0 jn0Var3;
        boolean z3;
        x01 x01Var3;
        pe0 pe0Var3;
        C0086cc c0086cc4;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-1061374109);
        if ((i & 6) == 0) {
            i2 = i | (c0616pi.m3108h(interfaceC0298hw) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | 115025328;
        if (c0616pi.m3082O(i4 & 1, (306783379 & i4) != 306783378)) {
            c0616pi.m3087T();
            if ((i & 1) == 0 || c0616pi.m3128y()) {
                ln0 ln0Var = AbstractC0124dc.f1045a;
                x01 x01VarM387a = c11.m387a(AbstractC0398kl.f3198i, c0616pi);
                C0429lf c0429lf = (C0429lf) c0616pi.m3112j(AbstractC0510nf.f4248a);
                C0086cc c0086cc5 = c0429lf.f3449X;
                if (c0086cc5 == null) {
                    long j = C0207ff.f1706f;
                    c0086cc3 = new C0086cc(j, AbstractC0510nf.m2697c(c0429lf, EnumC0472mf.f3935k), j, C0207ff.m1093b(rd0.f5377p, AbstractC0510nf.m2697c(c0429lf, rd0.f5376o)));
                    c0429lf.f3449X = c0086cc3;
                } else {
                    c0086cc3 = c0086cc5;
                }
                i3 = i4 & (-64513);
                jn0Var3 = AbstractC0124dc.f1046b;
                z3 = true;
                x01Var3 = x01VarM387a;
                pe0Var3 = me0.f3922a;
                c0086cc4 = c0086cc3;
            } else {
                c0616pi.m3085R();
                i3 = i4 & (-64513);
                pe0Var3 = pe0Var;
                z3 = z;
                x01Var3 = x01Var;
                c0086cc4 = c0086cc;
                jn0Var3 = jn0Var;
            }
            c0616pi.m3120q();
            m2764d(interfaceC0298hw, pe0Var3, z3, x01Var3, c0086cc4, null, jn0Var3, interfaceC0941xw, c0616pi, i3 & 2147483646, 0);
            pe0Var2 = pe0Var3;
            z2 = z3;
            x01Var2 = x01Var3;
            c0086cc2 = c0086cc4;
            jn0Var2 = jn0Var3;
        } else {
            c0616pi.m3085R();
            pe0Var2 = pe0Var;
            z2 = z;
            x01Var2 = x01Var;
            c0086cc2 = c0086cc;
            jn0Var2 = jn0Var;
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0315ic(interfaceC0298hw, pe0Var2, z2, x01Var2, c0086cc2, jn0Var2, interfaceC0941xw, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static ArrayList m2769i(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0880w8(objArr, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final int m2770j(int[] iArr, int i, int i2) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final int m2771k(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static wa0 m2772l(wa0 wa0Var) {
        wa0Var.m4931f();
        wa0Var.f7055f = true;
        return wa0Var.f7054e > 0 ? wa0Var : wa0.f7052g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static qc1 m2773m(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (qc1) objNewInstance;
            } catch (IllegalAccessException e) {
                C0921xc.m5128i("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                C0921xc.m5128i("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            C0921xc.m5128i("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static long m2774n(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC0654qj.m3263j(i6);
                    throw new C0725sg();
                }
                i5 = 8190;
            }
        }
        return AbstractC0654qj.m3254a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static long m2775o(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC0654qj.m3263j(i6);
                    throw new C0725sg();
                }
                i5 = 8190;
            }
        }
        return AbstractC0654qj.m3254a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final int m2776p(InterfaceC0356ji interfaceC0356ji) {
        interfaceC0356ji.getClass();
        return Long.hashCode(((C0616pi) interfaceC0356ji).f4878T);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static z20 m2777q(Collection collection) {
        collection.getClass();
        return new z20(0, collection.size() - 1, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static int m2778r(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static cw0 m2779s(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        C0921xc.m5131l(AbstractC0748t1.m4154l("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new cw0(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final void m2780t(InterfaceC0618pk interfaceC0618pk, Throwable th) {
        try {
            InterfaceC0729sk interfaceC0729sk = (InterfaceC0729sk) interfaceC0618pk.mo64l(C0496n2.f4164x);
            if (interfaceC0729sk != null) {
                interfaceC0729sk.mo787n(interfaceC0618pk, th);
            } else {
                AbstractC0398kl.m1931q(interfaceC0618pk, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0398kl.m1920f(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0398kl.m1931q(interfaceC0618pk, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final int m2781u(C0164e9 c0164e9, Object obj, int i) {
        int i2 = c0164e9.f1352f;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM2770j = m2770j(c0164e9.f1350d, i2, i);
            if (iM2770j < 0 || p30.m3002l(obj, c0164e9.f1351e[iM2770j])) {
                return iM2770j;
            }
            int i3 = iM2770j + 1;
            while (i3 < i2 && c0164e9.f1350d[i3] == i) {
                if (p30.m3002l(obj, c0164e9.f1351e[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM2770j - 1; i4 >= 0 && c0164e9.f1350d[i4] == i; i4--) {
                if (p30.m3002l(obj, c0164e9.f1351e[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static List m2782v(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static List m2783w(Object... objArr) {
        if (objArr.length <= 0) {
            return C0294hs.f2354d;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static List m2784x(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final C0513ni m2785y(InterfaceC0356ji interfaceC0356ji) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3088U(206, AbstractC0653qi.f5155e);
        if (c0616pi.f4877S) {
            z11.m5366z(c0616pi.f4867I);
        }
        Object objM3072D = c0616pi.m3072D();
        ku0 hv0Var = objM3072D instanceof ku0 ? (ku0) objM3072D : null;
        if (hv0Var == null) {
            hv0Var = new hv0(new C0475mi(new C0513ni(c0616pi, c0616pi.f4878T, c0616pi.f4896q, c0616pi.f4861C, c0616pi.f4887h.f7644w)), -1);
            c0616pi.m3109h0(hv0Var);
        }
        ju0 ju0Var = hv0Var.f3270a;
        ju0Var.getClass();
        C0513ni c0513ni = ((C0475mi) ju0Var).f3983d;
        c0513ni.f4279f.setValue(c0616pi.m3115l());
        c0616pi.m3119p(false);
        return c0513ni;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final EnumC0485ms m2786z(b91 b91Var, InterfaceC0742sw interfaceC0742sw, Object obj, InterfaceC0356ji interfaceC0356ji) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3086S(-422486745, 0, b91Var, null);
        boolean zM332g = b91Var.m332g();
        EnumC0485ms enumC0485ms = EnumC0485ms.f4026d;
        EnumC0485ms enumC0485ms2 = EnumC0485ms.f4028f;
        EnumC0485ms enumC0485ms3 = EnumC0485ms.f4027e;
        if (zM332g) {
            c0616pi.m3090W(-212166497);
            c0616pi.m3119p(false);
            if (((Boolean) interfaceC0742sw.invoke(obj)).booleanValue()) {
                enumC0485ms = enumC0485ms3;
            } else if (((Boolean) interfaceC0742sw.invoke(b91Var.m328c())).booleanValue()) {
                enumC0485ms = enumC0485ms2;
            }
        } else {
            c0616pi.m3090W(-211892364);
            Object objM3080L = c0616pi.m3080L();
            if (objM3080L == C0320ii.f2572a) {
                objM3080L = r60.m3419u(Boolean.FALSE);
                c0616pi.m3107g0(objM3080L);
            }
            oh0 oh0Var = (oh0) objM3080L;
            if (((Boolean) interfaceC0742sw.invoke(b91Var.m328c())).booleanValue()) {
                oh0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) interfaceC0742sw.invoke(obj)).booleanValue()) {
                enumC0485ms = enumC0485ms3;
            } else if (((Boolean) oh0Var.getValue()).booleanValue()) {
                enumC0485ms = enumC0485ms2;
            }
            c0616pi.m3119p(false);
        }
        c0616pi.m3119p(false);
        return enumC0485ms;
    }
}
