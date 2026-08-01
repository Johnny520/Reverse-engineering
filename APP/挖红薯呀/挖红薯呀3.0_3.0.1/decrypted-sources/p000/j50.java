package p000;

import android.os.LocaleList;
import android.view.View;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.luckypray.dexkit.C0587R;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j50 {

    /* JADX INFO: renamed from: a */
    public static final int f2730a = 9;

    /* JADX INFO: renamed from: b */
    public static final int f2731b = 6;

    /* JADX INFO: renamed from: c */
    public static final int f2732c = 10;

    /* JADX INFO: renamed from: d */
    public static final int f2733d = 5;

    /* JADX INFO: renamed from: e */
    public static final int f2734e = 15;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final int m1649A(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final void m1650B(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1651a(final pe0 pe0Var, c90 c90Var, final jn0 jn0Var, final InterfaceC0975yt interfaceC0975yt, final C0343j5 c0343j5, final C0239ga c0239ga, final InterfaceC0794u8 interfaceC0794u8, final InterfaceC0742sw interfaceC0742sw, InterfaceC0356ji interfaceC0356ji, final int i, final int i2) {
        int i3;
        c90 c90Var2;
        C0616pi c0616pi;
        C0675r3 c0675r3;
        boolean z;
        x70 x70Var;
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3091X(924924659);
        if ((i & 6) == 0) {
            i3 = (c0616pi2.m3104f(pe0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0616pi2.m3104f(c90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0616pi2.m3104f(jn0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0616pi2.m3106g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0616pi2.m3106g(false) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0616pi2.m3104f(interfaceC0975yt) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c0616pi2.m3106g(true) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c0616pi2.m3104f(c0343j5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        int i4 = i3 | 805306368;
        int i5 = i2 | 6;
        if ((i2 & 48) == 0) {
            i5 |= c0616pi2.m3104f(c0239ga) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c0616pi2.m3104f(interfaceC0794u8) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= c0616pi2.m3108h(interfaceC0742sw) ? 2048 : 1024;
        }
        int i6 = i5;
        if (c0616pi2.m3082O(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            c0616pi2.m3087T();
            if ((i & 1) != 0 && !c0616pi2.m3128y()) {
                c0616pi2.m3085R();
            }
            int i7 = i4 & (-234881025);
            c0616pi2.m3120q();
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            int i10 = ((i6 >> 6) & 112) | i9;
            oh0 oh0VarM3424z = r60.m3424z(interfaceC0742sw, c0616pi2);
            boolean z2 = (((i10 & 14) ^ 6) > 4 && c0616pi2.m3104f(c90Var)) || (i10 & 6) == 4;
            Object objM3080L = c0616pi2.m3080L();
            C0675r3 c0675r32 = C0320ii.f2572a;
            if (z2 || objM3080L == c0675r32) {
                y60 y60Var = new y60();
                y60Var.f7552a = new dp0(Integer.MAX_VALUE);
                y60Var.f7553b = new dp0(Integer.MAX_VALUE);
                C0496n2 c0496n2 = C0496n2.f4138R;
                objM3080L = new x70(0, 1, w31.class, r60.m3410l(c0496n2, new C0607p9(r60.m3410l(c0496n2, new q70(oh0VarM3424z, 1)), c90Var, y60Var, 5)), "value", "getValue()Ljava/lang/Object;");
                c0616pi2.m3107g0(objM3080L);
            }
            x70 x70Var2 = (x70) objM3080L;
            int i11 = i7 >> 9;
            int i12 = (i11 & 112) | i9;
            boolean z3 = ((((i12 & 112) ^ 48) > 32 && c0616pi2.m3106g(false)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && c0616pi2.m3104f(c90Var)) || (i12 & 6) == 4);
            Object objM3080L2 = c0616pi2.m3080L();
            if (z3 || objM3080L2 == c0675r32) {
                objM3080L2 = new h80(c90Var);
                c0616pi2.m3107g0(objM3080L2);
            }
            f80 f80Var = (f80) objM3080L2;
            Object objM3080L3 = c0616pi2.m3080L();
            if (objM3080L3 == c0675r32) {
                objM3080L3 = s91.m4054s(c0616pi2);
                c0616pi2.m3107g0(objM3080L3);
            }
            InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) objM3080L3;
            InterfaceC0819ux interfaceC0819ux = (InterfaceC0819ux) c0616pi2.m3112j(AbstractC0131dj.f1120g);
            jo0 jo0Var = !((Boolean) c0616pi2.m3112j(AbstractC0131dj.f1135v)).booleanValue() ? i41.f2447a : null;
            int i13 = i6 << 18;
            int i14 = (i7 & 65520) | (i11 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | ((i6 << 27) & 1879048192);
            boolean zM3100d = ((((i14 & 112) ^ 48) > 32 && c0616pi2.m3104f(c90Var)) || (i14 & 48) == 32) | ((((i14 & 896) ^ 384) > 256 && c0616pi2.m3104f(jn0Var)) || (i14 & 384) == 256) | ((((i14 & 7168) ^ 3072) > 2048 && c0616pi2.m3106g(false)) || (i14 & 3072) == 2048) | ((((57344 & i14) ^ 24576) > 16384 && c0616pi2.m3106g(false)) || (i14 & 24576) == 16384) | c0616pi2.m3100d(0) | (((i14 & 3670016) ^ 1572864) > 1048576 && c0616pi2.m3104f(null)) | ((((i14 & 29360128) ^ 12582912) > 8388608 && c0616pi2.m3104f(c0239ga)) || (i14 & 12582912) == 8388608) | ((((i14 & 234881024) ^ 100663296) > 67108864 && c0616pi2.m3104f(interfaceC0794u8)) || (i14 & 100663296) == 67108864) | (((i14 & 1879048192) ^ 805306368) > 536870912 && c0616pi2.m3104f(null)) | c0616pi2.m3104f(interfaceC0819ux) | c0616pi2.m3104f(jo0Var);
            Object objM3080L4 = c0616pi2.m3080L();
            if (zM3100d || objM3080L4 == c0675r32) {
                c0675r3 = c0675r32;
                z = true;
                objM3080L4 = new u80(c90Var, jn0Var, x70Var2, interfaceC0794u8, interfaceC0966yk, interfaceC0819ux, jo0Var, c0239ga);
                x70Var = x70Var2;
                c0616pi2.m3107g0(objM3080L4);
            } else {
                c0675r3 = c0675r32;
                z = true;
                x70Var = x70Var2;
            }
            r70 r70Var = (r70) objM3080L4;
            c0616pi2.m3090W(-2077147368);
            boolean zM3100d2 = (((((i8 & 14) ^ 6) <= 4 || !c0616pi2.m3104f(c90Var)) && (i8 & 6) != 4) ? false : z) | c0616pi2.m3100d(0);
            Object objM3080L5 = c0616pi2.m3080L();
            if (zM3100d2 || objM3080L5 == c0675r3) {
                objM3080L5 = new n80(c90Var);
                c0616pi2.m3107g0(objM3080L5);
            }
            C0166eb c0166eb = c90Var.f753o;
            um0 um0Var = um0.f6265e;
            pe0 pe0VarM1934t = AbstractC0398kl.m1934t((n80) objM3080L5, c0166eb, um0Var);
            c0616pi2.m3119p(false);
            c90Var2 = c90Var;
            c0616pi = c0616pi2;
            r60.m3400b(x70Var, s91.m4027N(p30.m2979O(pe0Var.mo2499c(c90Var.f750l).mo2499c(c90Var.f751m), x70Var, f80Var, um0Var, z).mo2499c(pe0VarM1934t).mo2499c(c90Var.f752n.f3379i), c90Var, um0Var, c0343j5, true, interfaceC0975yt, c90Var.f745g, null), c90Var2.f754p, r70Var, c0616pi, 0);
        } else {
            c90Var2 = c90Var;
            c0616pi = c0616pi2;
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            final c90 c90Var3 = c90Var2;
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: s80
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j50.m1651a(pe0Var, c90Var3, jn0Var, interfaceC0975yt, c0343j5, c0239ga, interfaceC0794u8, interfaceC0742sw, (InterfaceC0356ji) obj, j50.m1649A(i | 1), j50.m1649A(i2));
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final bw0 m1652b(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new bw0(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final xz0 m1653c(b60 b60Var, boolean z) {
        oe0 oe0Var = b60Var.f395I.f3998f;
        Object obj = null;
        if ((oe0Var.f4532g & 8) != 0) {
            loop0: while (true) {
                if (oe0Var == null) {
                    break;
                }
                if ((oe0Var.f4531f & 8) != 0) {
                    oe0 oe0VarM3050f = oe0Var;
                    sh0 sh0Var = null;
                    while (oe0VarM3050f != null) {
                        if (oe0VarM3050f instanceof vz0) {
                            obj = oe0VarM3050f;
                            break loop0;
                        }
                        if ((oe0VarM3050f.f4531f & 8) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                            int i = 0;
                            for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                if ((oe0Var2.f4531f & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        oe0VarM3050f = oe0Var2;
                                    } else {
                                        if (sh0Var == null) {
                                            sh0Var = new sh0(new oe0[16]);
                                        }
                                        if (oe0VarM3050f != null) {
                                            sh0Var.m4072b(oe0VarM3050f);
                                            oe0VarM3050f = null;
                                        }
                                        sh0Var.m4072b(oe0Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        oe0VarM3050f = pf1.m3050f(sh0Var);
                    }
                    if ((oe0Var.f4532g & 8) != 0) {
                        break;
                    }
                    oe0Var = oe0Var.f4534i;
                } else if ((oe0Var.f4532g & 8) != 0) {
                }
            }
        }
        obj.getClass();
        oe0 oe0Var3 = ((oe0) ((vz0) obj)).f4529d;
        sz0 sz0VarM317x = b60Var.m317x();
        if (sz0VarM317x == null) {
            sz0VarM317x = new sz0();
        }
        return new xz0(oe0Var3, z, b60Var, sz0VarM317x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1654d(ny0 ny0Var, float f, C0879w7 c0879w7, C0478ml c0478ml, InterfaceC0742sw interfaceC0742sw, AbstractC0358jk abstractC0358jk) {
        h21 h21Var;
        float f2;
        wt0 wt0Var;
        if (abstractC0358jk instanceof h21) {
            h21Var = (h21) abstractC0358jk;
            int i = h21Var.f2134k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h21Var.f2134k = i - Integer.MIN_VALUE;
            } else {
                h21Var = new h21(abstractC0358jk);
            }
        }
        Object obj = h21Var.f2133j;
        int i2 = h21Var.f2134k;
        if (i2 == 0) {
            w60.m4891M(obj);
            wt0 wt0Var2 = new wt0();
            boolean z = ((Number) c0879w7.m4921a()).floatValue() == 0.0f;
            g21 g21Var = new g21(f, wt0Var2, ny0Var, interfaceC0742sw, 0);
            h21Var.f2131h = c0879w7;
            h21Var.f2132i = wt0Var2;
            h21Var.f2130g = f;
            h21Var.f2134k = 1;
            Object objM5437g = z60.m5437g(c0879w7, c0478ml, !z, g21Var, h21Var);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM5437g == enumC1007zk) {
                return enumC1007zk;
            }
            f2 = f;
            wt0Var = wt0Var2;
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = h21Var.f2130g;
            wt0Var = h21Var.f2132i;
            c0879w7 = h21Var.f2131h;
            w60.m4891M(obj);
        }
        return new C0716s7(new Float(f2 - wt0Var.f7189d), c0879w7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1655e(ny0 ny0Var, float f, float f2, C0879w7 c0879w7, o31 o31Var, InterfaceC0742sw interfaceC0742sw, AbstractC0358jk abstractC0358jk) {
        i21 i21Var;
        float fFloatValue;
        C0879w7 c0879w72;
        wt0 wt0Var;
        float f3 = f;
        if (abstractC0358jk instanceof i21) {
            i21Var = (i21) abstractC0358jk;
            int i = i21Var.f2413l;
            if ((i & Integer.MIN_VALUE) != 0) {
                i21Var.f2413l = i - Integer.MIN_VALUE;
            } else {
                i21Var = new i21(abstractC0358jk);
            }
        }
        i21 i21Var2 = i21Var;
        Object obj = i21Var2.f2412k;
        int i2 = i21Var2.f2413l;
        if (i2 == 0) {
            w60.m4891M(obj);
            wt0 wt0Var2 = new wt0();
            fFloatValue = ((Number) c0879w7.m4921a()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) c0879w7.m4921a()).floatValue() == 0.0f;
            g21 g21Var = new g21(f2, wt0Var2, ny0Var, interfaceC0742sw, 1);
            i21Var2.f2410i = c0879w7;
            i21Var2.f2411j = wt0Var2;
            i21Var2.f2408g = f3;
            i21Var2.f2409h = fFloatValue;
            i21Var2.f2413l = 1;
            Object objM5438h = z60.m5438h(c0879w7, f4, o31Var, !z, g21Var, i21Var2);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM5438h == enumC1007zk) {
                return enumC1007zk;
            }
            c0879w72 = c0879w7;
            wt0Var = wt0Var2;
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = i21Var2.f2409h;
            float f6 = i21Var2.f2408g;
            wt0Var = i21Var2.f2411j;
            c0879w72 = i21Var2.f2410i;
            w60.m4891M(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new C0716s7(new Float(f3 - wt0Var.f7189d), pf1.m3057q(c0879w72, 0.0f, m1660j(((Number) c0879w72.m4921a()).floatValue(), fFloatValue), 29));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m1656f(C0793u7 c0793u7, ny0 ny0Var, InterfaceC0742sw interfaceC0742sw, float f) {
        float fMo1511a;
        try {
            fMo1511a = ny0Var.mo1511a(f);
        } catch (CancellationException unused) {
            c0793u7.m4285a();
            fMo1511a = 0.0f;
        }
        interfaceC0742sw.invoke(Float.valueOf(fMo1511a));
        if (Math.abs(f - fMo1511a) > 0.5f) {
            c0793u7.m4285a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final st0 m1657g(i50 i50Var) {
        i50 i50VarMo346k = i50Var.mo346k();
        return i50VarMo346k != null ? i50VarMo346k.mo341B(i50Var, true) : new st0(0.0f, 0.0f, (int) (i50Var.mo342G() >> 32), (int) (i50Var.mo342G() & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final st0 m1658h(i50 i50Var, boolean z) {
        i50 i50VarM1662l = m1662l(i50Var);
        float fMo342G = (int) (i50VarM1662l.mo342G() >> 32);
        float fMo342G2 = (int) (i50VarM1662l.mo342G() & 4294967295L);
        st0 st0VarMo341B = i50VarM1662l.mo341B(i50Var, z);
        float f = st0VarMo341B.f5832a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fMo342G) {
                f = fMo342G;
            }
        }
        float f2 = st0VarMo341B.f5833b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fMo342G2) {
                f2 = fMo342G2;
            }
        }
        float f3 = st0VarMo341B.f5834c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fMo342G) {
                fMo342G = f3;
            }
            f3 = fMo342G;
        }
        float f4 = st0VarMo341B.f5835d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fMo342G2) {
                fMo342G2 = f5;
            }
            f4 = fMo342G2;
        }
        if (f == f3 || f2 == f4) {
            return st0.f5831e;
        }
        long jMo345i = i50VarM1662l.mo345i((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo345i2 = i50VarM1662l.mo345i((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo345i3 = i50VarM1662l.mo345i((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jMo345i4 = i50VarM1662l.mo345i((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo345i >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo345i2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo345i4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo345i3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo345i & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo345i2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo345i4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo345i3 & 4294967295L));
        return new st0(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final List m1659i(o70 o70Var, a80 a80Var, C0166eb c0166eb) {
        z20 z20Var;
        sh0 sh0Var = c0166eb.f1367a;
        if (!(sh0Var.f5770f != 0) && a80Var.f69d.isEmpty()) {
            return C0294hs.f2354d;
        }
        ArrayList arrayList = new ArrayList();
        if (c0166eb.f1367a.f5770f != 0) {
            int i = sh0Var.f5770f;
            if (i == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = sh0Var.f5768d;
            int i2 = ((a70) objArr[0]).f63a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((a70) objArr[i3]).f63a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                z10.m5361a("negative minIndex");
            }
            int i5 = sh0Var.f5770f;
            if (i5 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = sh0Var.f5768d;
            int i6 = ((a70) objArr2[0]).f64b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((a70) objArr2[i7]).f64b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            z20Var = new z20(i2, Math.min(i6, o70Var.mo2791a() - 1), 1);
        } else {
            z20Var = z20.f7777g;
        }
        int size = a80Var.f69d.size();
        for (int i9 = 0; i9 < size; i9++) {
            y70 y70Var = (y70) a80Var.get(i9);
            int iM1212k = g60.m1212k(y70Var.f7561c, o70Var, y70Var.f7559a);
            int i10 = z20Var.f7248d;
            if ((iM1212k > z20Var.f7249e || i10 > iM1212k) && iM1212k >= 0 && iM1212k < o70Var.mo2791a()) {
                arrayList.add(Integer.valueOf(iM1212k));
            }
        }
        int i11 = z20Var.f7248d;
        int i12 = z20Var.f7249e;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final float m1660j(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final long m1661k(lo0 lo0Var) {
        return rd0.m3459R(lo0Var.m2037l() * lo0Var.m2040p()) + (((long) lo0Var.f3543d.f866b.m720g()) * ((long) lo0Var.m2040p()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final i50 m1662l(i50 i50Var) {
        i50 i50Var2;
        i50 i50VarMo346k = i50Var.mo346k();
        while (true) {
            i50 i50Var3 = i50VarMo346k;
            i50Var2 = i50Var;
            i50Var = i50Var3;
            if (i50Var == null) {
                break;
            }
            i50VarMo346k = i50Var.mo346k();
        }
        qj0 qj0Var = i50Var2 instanceof qj0 ? (qj0) i50Var2 : null;
        if (qj0Var == null) {
            return i50Var2;
        }
        qj0 qj0Var2 = qj0Var.f5182t;
        while (true) {
            qj0 qj0Var3 = qj0Var2;
            qj0 qj0Var4 = qj0Var;
            qj0Var = qj0Var3;
            if (qj0Var == null) {
                return qj0Var4;
            }
            qj0Var2 = qj0Var.f5182t;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final x90 m1663m(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(C0587R.id.view_tree_lifecycle_owner);
            x90 x90Var = tag instanceof x90 ? (x90) tag : null;
            if (x90Var != null) {
                return x90Var;
            }
            Object objM5455y = z60.m5455y(view);
            view = objM5455y instanceof View ? (View) objM5455y : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static fb0 m1664n() {
        C0541o8 c0541o8 = cr0.f883a;
        c0541o8.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((jo0) c0541o8.f4482c)) {
            try {
                fb0 fb0Var = (fb0) c0541o8.f4481b;
                if (fb0Var != null && localeList == ((LocaleList) c0541o8.f4480a)) {
                    return fb0Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new eb0(localeList.get(i)));
                }
                fb0 fb0Var2 = new fb0(arrayList);
                c0541o8.f4480a = localeList;
                c0541o8.f4481b = fb0Var2;
                return fb0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final ur0 m1665o(View view) {
        ur0 ur0Var = (ur0) view.getTag(C0587R.id.pooling_container_listener_holder_tag);
        if (ur0Var != null) {
            return ur0Var;
        }
        ur0 ur0Var2 = new ur0();
        view.setTag(C0587R.id.pooling_container_listener_holder_tag, ur0Var2);
        return ur0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final long m1666p(double d) {
        return m1670t((float) d, 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final long m1667q(int i) {
        return m1670t(i, 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final int m1668r(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final boolean m1669s(bw0 bw0Var) {
        long j = bw0Var.f600e;
        return (j >>> 32) == (4294967295L & j) && j == bw0Var.f601f && j == bw0Var.f602g && j == bw0Var.f603h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final long m1670t(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        v71[] v71VarArr = u71.f6157b;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final void m1671u(sm0 sm0Var, int i, Object obj) {
        sm0Var.f5787e[(sm0Var.f5788f - sm0Var.f5783a[sm0Var.f5784b - 1].f4929b) + i] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final void m1672v(sm0 sm0Var, int i, Object obj, int i2, Object obj2) {
        int i3 = sm0Var.f5788f - sm0Var.f5783a[sm0Var.f5784b - 1].f4929b;
        Object[] objArr = sm0Var.f5787e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final long m1673w(String str, long j, long j2, long j3) {
        String property;
        int i = a61.f60a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM3384U = r41.m3384U(property);
        if (lM3384U == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM3384U.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static int m1674x(int i, int i2, String str) {
        return (int) m1673w(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final long m1675y(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final Class m1676z(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m1676z(((ParameterizedType) type).getRawType());
        }
        throw new r91("Cannot cast type " + type + " to java.lang.Class object.");
    }
}
