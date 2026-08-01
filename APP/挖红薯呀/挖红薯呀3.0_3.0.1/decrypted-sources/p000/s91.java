package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RenderNode;
import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s91 {

    /* JADX INFO: renamed from: C */
    public static final C1014zr f5695C;

    /* JADX INFO: renamed from: l */
    public static final C1014zr f5710l;

    /* JADX INFO: renamed from: m */
    public static final C1014zr f5711m;

    /* JADX INFO: renamed from: n */
    public static final C1014zr f5712n;

    /* JADX INFO: renamed from: o */
    public static final C1014zr f5713o;

    /* JADX INFO: renamed from: p */
    public static final C1014zr f5714p;

    /* JADX INFO: renamed from: s */
    public static final C0541o8 f5717s;

    /* JADX INFO: renamed from: t */
    public static C0541o8 f5718t;

    /* JADX INFO: renamed from: a */
    public static final Object[] f5699a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final EnumC0472mf f5700b = EnumC0472mf.f3935k;

    /* JADX INFO: renamed from: c */
    public static final ea1 f5701c = ea1.f1364f;

    /* JADX INFO: renamed from: d */
    public static final EnumC0472mf f5702d = EnumC0472mf.f3940p;

    /* JADX INFO: renamed from: e */
    public static final z01 f5703e = z01.f7747d;

    /* JADX INFO: renamed from: f */
    public static final EnumC0472mf f5704f = EnumC0472mf.f3931g;

    /* JADX INFO: renamed from: g */
    public static final ea1 f5705g = ea1.f1363e;

    /* JADX INFO: renamed from: h */
    public static final EnumC0472mf f5706h = EnumC0472mf.f3932h;

    /* JADX INFO: renamed from: i */
    public static final ea1 f5707i = ea1.f1362d;

    /* JADX INFO: renamed from: j */
    public static final EnumC0472mf f5708j = EnumC0472mf.f3936l;

    /* JADX INFO: renamed from: k */
    public static final C0558oo f5709k = new C0558oo();

    /* JADX INFO: renamed from: q */
    public static final C0103cs f5715q = new C0103cs(false);

    /* JADX INFO: renamed from: r */
    public static final C0103cs f5716r = new C0103cs(true);

    /* JADX INFO: renamed from: u */
    public static final byte[] f5719u = {48, 49, 53, 0};

    /* JADX INFO: renamed from: v */
    public static final byte[] f5720v = {48, 49, 48, 0};

    /* JADX INFO: renamed from: w */
    public static final byte[] f5721w = {48, 48, 57, 0};

    /* JADX INFO: renamed from: x */
    public static final byte[] f5722x = {48, 48, 53, 0};

    /* JADX INFO: renamed from: y */
    public static final byte[] f5723y = {48, 48, 49, 0};

    /* JADX INFO: renamed from: z */
    public static final byte[] f5724z = {48, 48, 49, 0};

    /* JADX INFO: renamed from: A */
    public static final byte[] f5693A = {48, 48, 50, 0};

    /* JADX INFO: renamed from: B */
    public static final Object f5694B = new Object();

    /* JADX INFO: renamed from: D */
    public static final rx0 f5696D = new rx0(26);

    /* JADX INFO: renamed from: E */
    public static final rx0 f5697E = new rx0(27);

    /* JADX INFO: renamed from: F */
    public static final rx0 f5698F = new rx0(28);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f5710l = new C1014zr("COMPLETING_ALREADY", i);
        f5711m = new C1014zr("COMPLETING_WAITING_CHILDREN", i);
        f5712n = new C1014zr("COMPLETING_RETRY", i);
        f5713o = new C1014zr("TOO_LATE_TO_CANCEL", i);
        f5714p = new C1014zr("SEALED", i);
        Object obj = null;
        f5717s = new C0541o8(obj, obj, obj);
        f5695C = new C1014zr("NO_THREAD_ELEMENTS", i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final float[] m4016A(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final boolean m4017B(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m4018C(int i, Object obj) {
        if (obj instanceof InterfaceC0188ex) {
            if ((obj instanceof InterfaceC0225fx ? ((InterfaceC0225fx) obj).getArity() : obj instanceof InterfaceC0298hw ? 0 : obj instanceof InterfaceC0742sw ? 1 : obj instanceof InterfaceC0904ww ? 2 : obj instanceof InterfaceC0941xw ? 3 : obj instanceof InterfaceC0978yw ? 4 : obj instanceof InterfaceC1019zw ? 5 : obj instanceof InterfaceC0034ax ? 6 : obj instanceof InterfaceC0071bx ? 7 : obj instanceof InterfaceC0108cx ? 8 : obj instanceof InterfaceC0151dx ? 9 : obj instanceof InterfaceC0333iw ? 10 : obj instanceof InterfaceC0370jw ? 11 : obj instanceof InterfaceC0446lw ? 13 : obj instanceof InterfaceC0489mw ? 14 : obj instanceof InterfaceC0528nw ? 15 : obj instanceof InterfaceC0593ow ? 16 : obj instanceof InterfaceC0630pw ? 17 : obj instanceof InterfaceC0667qw ? 18 : obj instanceof InterfaceC0704rw ? 19 : obj instanceof InterfaceC0781tw ? 20 : obj instanceof InterfaceC0818uw ? 21 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final pe0 m4019D(InterfaceC0356ji interfaceC0356ji, pe0 pe0Var) {
        if (pe0Var.mo1102b(C0601p3.f4719m)) {
            return pe0Var;
        }
        ((C0616pi) interfaceC0356ji).m3086S(1219399079, 0, null, null);
        pe0 pe0Var2 = (pe0) pe0Var.mo1101a(new C0634q(4, interfaceC0356ji), me0.f3922a);
        ((C0616pi) interfaceC0356ji).m3119p(false);
        return pe0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static final pe0 m4020E(InterfaceC0356ji interfaceC0356ji, pe0 pe0Var) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3090W(439770924);
        pe0 pe0VarM4019D = m4019D(c0616pi, pe0Var);
        c0616pi.m3119p(false);
        return pe0VarM4019D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final float[] m4021F(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final float[] m4022G(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static pe0 m4023J(pe0 pe0Var, ro0 ro0Var, C0276ha c0276ha, C0675r3 c0675r3, C0348ja c0348ja, int i) {
        if ((i & 4) != 0) {
            c0276ha = C0496n2.f4149i;
        }
        return pe0Var.mo2499c(new so0(ro0Var, c0276ha, c0675r3, 1.0f, c0348ja));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static final long m4024K(h10 h10Var, um0 um0Var, g10 g10Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (um0Var == null) {
            return h10Var.f2116c;
        }
        int i = g10Var.f1840a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (h10Var.f2116c >> 32));
        } else {
            if (i != 2) {
                return h10Var.f2116c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (h10Var.f2116c & 4294967295L));
        }
        if (um0Var == um0.f6265e) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static final long m4025L(h10 h10Var, um0 um0Var, g10 g10Var) {
        float fIntBitsToFloat;
        long j = h10Var.f2120g;
        if (um0Var == null) {
            return j;
        }
        int i = g10Var.f1840a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            if (i != 2) {
                return j;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (um0Var == um0.f6265e) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static final void m4026M(InterfaceC0618pk interfaceC0618pk, Object obj) {
        if (obj == f5695C) {
            return;
        }
        if (!(obj instanceof b81)) {
            interfaceC0618pk.mo65p(f5697E, null).getClass();
            C0921xc.m5123d();
            return;
        }
        InterfaceC0397kk[] interfaceC0397kkArr = ((b81) obj).f449b;
        int length = interfaceC0397kkArr.length - 1;
        if (length < 0) {
            return;
        }
        InterfaceC0397kk interfaceC0397kk = interfaceC0397kkArr[length];
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final pe0 m4027N(pe0 pe0Var, ez0 ez0Var, um0 um0Var, C0343j5 c0343j5, boolean z, InterfaceC0975yt interfaceC0975yt, xg0 xg0Var, on0 on0Var) {
        um0 um0Var2 = um0.f6264d;
        me0 me0Var = me0.f3922a;
        return pe0Var.mo2499c(um0Var == um0Var2 ? p30.m2974J(me0Var, C0227fz.f1823c, 518143) : p30.m2974J(me0Var, C0227fz.f1822b, 518143)).mo2499c(new qy0(c0343j5, on0Var, interfaceC0975yt, xg0Var, um0Var, ez0Var, z, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static o31 m4028O(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new o31(f, f2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static final Object m4029P(InterfaceC0618pk interfaceC0618pk) {
        Object objMo65p = interfaceC0618pk.mo65p(f5696D, 0);
        objMo65p.getClass();
        return objMo65p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static void m4030Q(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        p30.m2984T(classCastException, s91.class.getName());
        throw classCastException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static final Object[] m4031R(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = f5699a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static final Object[] m4032S(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static String m4033T(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + rd0.m3462U(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + rd0.m3462U(Float.intBitsToFloat(i)) + ", " + rd0.m3462U(Float.intBitsToFloat(i2)) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static final Object m4034U(Object obj) {
        y00 y00Var;
        z00 z00Var = obj instanceof z00 ? (z00) obj : null;
        return (z00Var == null || (y00Var = z00Var.f7746a) == null) ? obj : y00Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static final Object m4035V(InterfaceC0618pk interfaceC0618pk, Object obj) {
        if (obj == null) {
            obj = m4029P(interfaceC0618pk);
        }
        if (obj == 0) {
            return f5695C;
        }
        if (obj instanceof Integer) {
            return interfaceC0618pk.mo65p(f5698F, new b81(((Number) obj).intValue(), interfaceC0618pk));
        }
        C0921xc.m5123d();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9 A[Catch: RejectedExecutionException -> 0x018d, TryCatch #0 {RejectedExecutionException -> 0x018d, blocks: (B:101:0x0186, B:109:0x0197, B:111:0x01a9, B:117:0x01b6, B:119:0x01c7, B:123:0x01d0, B:113:0x01af, B:105:0x0190), top: B:148:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01af A[Catch: RejectedExecutionException -> 0x018d, TryCatch #0 {RejectedExecutionException -> 0x018d, blocks: (B:101:0x0186, B:109:0x0197, B:111:0x01a9, B:117:0x01b6, B:119:0x01c7, B:123:0x01d0, B:113:0x01af, B:105:0x0190), top: B:148:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c7 A[Catch: RejectedExecutionException -> 0x018d, TryCatch #0 {RejectedExecutionException -> 0x018d, blocks: (B:101:0x0186, B:109:0x0197, B:111:0x01a9, B:117:0x01b6, B:119:0x01c7, B:123:0x01d0, B:113:0x01af, B:105:0x0190), top: B:148:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d0 A[Catch: RejectedExecutionException -> 0x018d, TRY_LEAVE, TryCatch #0 {RejectedExecutionException -> 0x018d, blocks: (B:101:0x0186, B:109:0x0197, B:111:0x01a9, B:117:0x01b6, B:119:0x01c7, B:123:0x01d0, B:113:0x01af, B:105:0x0190), top: B:148:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0237  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4036a(final String str, final pe0 pe0Var, final s71 s71Var, final int i, final boolean z, final int i2, final int i3, InterfaceC0356ji interfaceC0356ji, final int i4) {
        int i5;
        InterfaceC0369jv interfaceC0369jv;
        boolean z2;
        boolean z3;
        boolean zM3100d;
        Object runnableC0084ca;
        Executor executor;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-1040751001);
        if ((i4 & 6) == 0) {
            i5 = (c0616pi.m3104f(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0616pi.m3104f(pe0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0616pi.m3104f(s71Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0616pi.m3108h(null) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0616pi.m3100d(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0616pi.m3106g(z) ? MethodData.ACC_DECLARED_SYNCHRONIZED : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0616pi.m3100d(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= c0616pi.m3100d(i3) ? 8388608 : 4194304;
        }
        int i6 = i5 | 100663296;
        if ((805306368 & i4) == 0) {
            i6 |= (1073741824 & i4) == 0 ? c0616pi.m3104f(null) : c0616pi.m3108h(null) ? 536870912 : 268435456;
        }
        if (c0616pi.m3082O(i6 & 1, (306783379 & i6) != 306783378)) {
            if (i3 <= 0 || i2 <= 0) {
                z10.m5361a("both minLines " + i3 + " and maxLines " + i2 + " must be greater than zero");
            }
            if (i3 > i2) {
                z10.m5361a("minLines " + i3 + " must be less than or equal to maxLines " + i2);
            }
            if (c0616pi.m3112j(qz0.f5251a) != null) {
                C0921xc.m5123d();
                return;
            }
            c0616pi.m3090W(356914239);
            c0616pi.m3119p(false);
            InterfaceC0369jv interfaceC0369jv2 = (InterfaceC0369jv) c0616pi.m3112j(AbstractC0131dj.f1124k);
            int i7 = ((i6 >> 3) & 112) | (i6 & 14);
            Executor executor2 = (Executor) c0616pi.m3112j(AbstractC0122da.f1008a);
            if (executor2 != null) {
                int length = str.length();
                if (length >= 8 && length < 1000) {
                    if (AbstractC0122da.f1009b == null) {
                        AbstractC0122da.f1009b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    }
                    Boolean bool = AbstractC0122da.f1009b;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        c0616pi.m3090W(1254274527);
                        k50 k50Var = (k50) c0616pi.m3112j(AbstractC0131dj.f1127n);
                        InterfaceC0968ym interfaceC0968ym = (InterfaceC0968ym) c0616pi.m3112j(AbstractC0131dj.f1121h);
                        if (((i7 & 112) ^ 48) > 32) {
                            try {
                            } catch (RejectedExecutionException unused) {
                                interfaceC0369jv = interfaceC0369jv2;
                            }
                            if (!c0616pi.m3104f(s71Var)) {
                                if ((i7 & 48) != 32) {
                                    z3 = false;
                                }
                                zM3100d = ((((i7 & 14) ^ 6) > 4 && c0616pi.m3104f(str)) || (i7 & 6) == 4) | z3 | c0616pi.m3100d(k50Var.ordinal()) | c0616pi.m3104f(interfaceC0968ym) | c0616pi.m3108h(interfaceC0369jv2);
                                Object objM3080L = c0616pi.m3080L();
                                if (zM3100d || objM3080L == C0320ii.f2572a) {
                                    executor = executor2;
                                    try {
                                        runnableC0084ca = new RunnableC0084ca(s71Var, k50Var, str, interfaceC0968ym, interfaceC0369jv2, 0);
                                        interfaceC0369jv = interfaceC0369jv2;
                                        try {
                                            c0616pi.m3107g0(runnableC0084ca);
                                        } catch (RejectedExecutionException unused2) {
                                        }
                                    } catch (RejectedExecutionException unused3) {
                                        interfaceC0369jv = interfaceC0369jv2;
                                    }
                                } else {
                                    runnableC0084ca = objM3080L;
                                    interfaceC0369jv = interfaceC0369jv2;
                                    executor = executor2;
                                }
                                executor.execute((Runnable) runnableC0084ca);
                                z2 = false;
                                c0616pi.m3119p(z2);
                                c0616pi.m3090W(357875859);
                                c0616pi.m3119p(z2);
                                pe0 pe0VarMo2499c = pe0Var.mo2499c(new o71(str, s71Var, interfaceC0369jv, i, z, i2, i3));
                                C0043b5 c0043b5 = C0043b5.f376d;
                                int iHashCode = Long.hashCode(c0616pi.f4878T);
                                pe0 pe0VarM4020E = m4020E(c0616pi, pe0VarMo2499c);
                                fq0 fq0VarM3115l = c0616pi.m3115l();
                                InterfaceC0210fi.f1733b.getClass();
                                C0094cj c0094cj = C0173ei.f1457b;
                                c0616pi.m3093Z();
                                if (c0616pi.f4877S) {
                                    c0616pi.m3114k(c0094cj);
                                } else {
                                    c0616pi.m3113j0();
                                }
                                w60.m4888J(c0616pi, C0173ei.f1460e, c0043b5);
                                w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
                                w60.m4885G(c0616pi, C0173ei.f1462g);
                                w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
                                w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
                                c0616pi.m3119p(true);
                            }
                            z3 = true;
                            if (((i7 & 14) ^ 6) > 4) {
                                zM3100d = ((((i7 & 14) ^ 6) > 4 && c0616pi.m3104f(str)) || (i7 & 6) == 4) | z3 | c0616pi.m3100d(k50Var.ordinal()) | c0616pi.m3104f(interfaceC0968ym) | c0616pi.m3108h(interfaceC0369jv2);
                                Object objM3080L2 = c0616pi.m3080L();
                                if (zM3100d) {
                                    executor = executor2;
                                    runnableC0084ca = new RunnableC0084ca(s71Var, k50Var, str, interfaceC0968ym, interfaceC0369jv2, 0);
                                    interfaceC0369jv = interfaceC0369jv2;
                                    c0616pi.m3107g0(runnableC0084ca);
                                    executor.execute((Runnable) runnableC0084ca);
                                    z2 = false;
                                    c0616pi.m3119p(z2);
                                    c0616pi.m3090W(357875859);
                                    c0616pi.m3119p(z2);
                                    pe0 pe0VarMo2499c2 = pe0Var.mo2499c(new o71(str, s71Var, interfaceC0369jv, i, z, i2, i3));
                                    C0043b5 c0043b52 = C0043b5.f376d;
                                    int iHashCode2 = Long.hashCode(c0616pi.f4878T);
                                    pe0 pe0VarM4020E2 = m4020E(c0616pi, pe0VarMo2499c2);
                                    fq0 fq0VarM3115l2 = c0616pi.m3115l();
                                    InterfaceC0210fi.f1733b.getClass();
                                    C0094cj c0094cj2 = C0173ei.f1457b;
                                    c0616pi.m3093Z();
                                    if (c0616pi.f4877S) {
                                    }
                                    w60.m4888J(c0616pi, C0173ei.f1460e, c0043b52);
                                    w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l2);
                                    w60.m4885G(c0616pi, C0173ei.f1462g);
                                    w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E2);
                                    w60.m4918y(c0616pi, Integer.valueOf(iHashCode2), C0173ei.f1461f);
                                    c0616pi.m3119p(true);
                                }
                            } else {
                                zM3100d = ((((i7 & 14) ^ 6) > 4 && c0616pi.m3104f(str)) || (i7 & 6) == 4) | z3 | c0616pi.m3100d(k50Var.ordinal()) | c0616pi.m3104f(interfaceC0968ym) | c0616pi.m3108h(interfaceC0369jv2);
                                Object objM3080L22 = c0616pi.m3080L();
                                if (zM3100d) {
                                }
                            }
                        } else {
                            if ((i7 & 48) != 32) {
                                z3 = true;
                            }
                        }
                    }
                }
                interfaceC0369jv = interfaceC0369jv2;
                z2 = false;
            } else {
                interfaceC0369jv = interfaceC0369jv2;
                z2 = false;
            }
            c0616pi.m3090W(1250991751);
            c0616pi.m3119p(z2);
            c0616pi.m3090W(357875859);
            c0616pi.m3119p(z2);
            pe0 pe0VarMo2499c22 = pe0Var.mo2499c(new o71(str, s71Var, interfaceC0369jv, i, z, i2, i3));
            C0043b5 c0043b522 = C0043b5.f376d;
            int iHashCode22 = Long.hashCode(c0616pi.f4878T);
            pe0 pe0VarM4020E22 = m4020E(c0616pi, pe0VarMo2499c22);
            fq0 fq0VarM3115l22 = c0616pi.m3115l();
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj22 = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, c0043b522);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l22);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E22);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode22), C0173ei.f1461f);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new InterfaceC0904ww() { // from class: ba
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0904ww
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s91.m4036a(str, pe0Var, s71Var, i, z, i2, i3, (InterfaceC0356ji) obj, j50.m1649A(i4 | 1));
                    return na1.f4229a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4037b(pe0 pe0Var, InterfaceC0742sw interfaceC0742sw, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-932836462);
        int i2 = (c0616pi.m3104f(pe0Var) ? 4 : 2) | i | (c0616pi.m3108h(interfaceC0742sw) ? 32 : 16);
        int i3 = 0;
        if (c0616pi.m3082O(i2 & 1, (i2 & 19) != 18)) {
            u50.m4262c(c0616pi, rd0.m3486o(pe0Var, interfaceC0742sw));
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0168ed(i, i3, pe0Var, interfaceC0742sw);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m4038c(Object obj, InterfaceC0742sw interfaceC0742sw, InterfaceC0356ji interfaceC0356ji) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        boolean zM3104f = c0616pi.m3104f(obj);
        Object objM3080L = c0616pi.m3080L();
        if (zM3104f || objM3080L == C0320ii.f2572a) {
            objM3080L = new C0481mo(interfaceC0742sw);
            c0616pi.m3107g0(objM3080L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m4039d(InterfaceC0356ji interfaceC0356ji, InterfaceC0904ww interfaceC0904ww, Object obj) {
        InterfaceC0618pk interfaceC0618pk = ((C0616pi) interfaceC0356ji).f4876R;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        boolean zM3104f = c0616pi.m3104f(obj);
        Object objM3080L = c0616pi.m3080L();
        if (zM3104f || objM3080L == C0320ii.f2572a) {
            objM3080L = new e50(interfaceC0618pk, interfaceC0904ww);
            c0616pi.m3107g0(objM3080L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m4040e(InterfaceC0298hw interfaceC0298hw, InterfaceC0356ji interfaceC0356ji) {
        sm0 sm0Var = ((C0616pi) interfaceC0356ji).f4871M.f3156b.f2797a;
        sm0Var.m4093I(hm0.f2294c);
        j50.m1671u(sm0Var, 0, interfaceC0298hw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m4041f(qb1 qb1Var, h10 h10Var, um0 um0Var, g10 g10Var, p10 p10Var, long j) {
        float fIntBitsToFloat;
        ArrayList arrayList = p10Var.f4694b;
        long j2 = h10Var.f2116c;
        boolean z = h10Var.f2117d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (h10Var.f2116c & 4294967295L));
        boolean z2 = h10Var.f2121h;
        if (!z2 && z) {
            p10Var.f4693a = 0;
            arrayList.clear();
        }
        if (!m4042g(h10Var) && (z2 || !z)) {
            if (arrayList.size() == 3) {
                int i = p10Var.f4693a;
                p10Var.f4693a = i + 1;
                arrayList.set(i, h10Var);
            } else {
                arrayList.add(h10Var);
            }
            if (p10Var.f4693a == 3) {
                p10Var.f4693a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((h10) arrayList.get(i2)).f2116c >> 32))));
            }
            fIntBitsToFloat2 = (float) AbstractC0960ye.m5238H(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((h10) arrayList.get(i3)).f2116c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) AbstractC0960ye.m5238H(arrayList3);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (um0Var != null) {
            int i4 = g10Var.f1840a;
            if (i4 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i4 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = um0Var == um0.f6265e ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((C0620pm) qb1Var.f5106d).m3142a(h10Var.f2115b, ok0.m2934e(jFloatToRawIntBits, j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m4042g(h10 h10Var) {
        return h10Var.f2121h && !h10Var.f2117d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m4043h(C0734sp c0734sp, long j) {
        if (!c0734sp.f4529d.f4542q) {
            return false;
        }
        c20 c20Var = pf1.m3039Q(c0734sp).f395I.f3995c;
        if (!c20Var.f643T.f4542q) {
            return false;
        }
        long jM3275P0 = c20Var.m3275P0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3275P0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM3275P0 & 4294967295L));
        long j2 = c0734sp.f5817t;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static AbstractC0549of m4044i(AbstractC0549of abstractC0549of) {
        cd1 cd1Var = rd0.f5368g;
        if (rd0.m3487p(abstractC0549of.f4545b, 12884901888L)) {
            nv0 nv0Var = (nv0) abstractC0549of;
            cd1 cd1Var2 = nv0Var.f4348d;
            if (!m4053r(cd1Var2, cd1Var)) {
                return new nv0(nv0Var.f4544a, nv0Var.f4352h, cd1Var, m4021F(m4052q((float[]) C0910x1.f7230f.f7232e, cd1Var2.m509a(), cd1Var.m509a()), nv0Var.f4353i), nv0Var.f4355k, nv0Var.f4358n, nv0Var.f4349e, nv0Var.f4350f, nv0Var.f4351g, -1);
            }
        }
        return abstractC0549of;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final void m4045j(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String strReplace = cls.getName().replace('.', '/');
        strReplace.getClass();
        sb.append((CharSequence) strReplace);
        sb.append(";");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Map m4046k(Object obj) {
        if ((obj instanceof p40) && !(obj instanceof s40)) {
            m4030Q(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            p30.m2984T(e, s91.class.getName());
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final pe0 m4047l(pe0 pe0Var, long j, x01 x01Var) {
        return pe0Var.mo2499c(new C0718s9(j, x01Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m4048m(int i, Object obj) {
        if (obj == null || m4018C(i, obj)) {
            return;
        }
        m4030Q(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final Object m4049n(InterfaceC0694rm interfaceC0694rm, C0607p9 c0607p9, m51 m51Var) {
        Object obj;
        qj0 qj0VarM3038P;
        Object objMo674a0;
        mj0 mj0Var;
        if (((oe0) interfaceC0694rm).f4529d.f4542q) {
            oe0 oe0Var = (oe0) interfaceC0694rm;
            if (!oe0Var.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var2 = oe0Var.f4529d.f4533h;
            b60 b60VarM3039Q = pf1.m3039Q(interfaceC0694rm);
            loop0: while (true) {
                obj = null;
                if (b60VarM3039Q == null) {
                    break;
                }
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 524288) != 0) {
                    while (oe0Var2 != null) {
                        if ((oe0Var2.f4531f & 524288) != 0) {
                            oe0 oe0VarM3050f = oe0Var2;
                            sh0 sh0Var = null;
                            while (oe0VarM3050f != null) {
                                if (oe0VarM3050f instanceof InterfaceC0123db) {
                                    obj = oe0VarM3050f;
                                    break loop0;
                                }
                                if ((oe0VarM3050f.f4531f & 524288) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                    int i = 0;
                                    for (oe0 oe0Var3 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                        if ((oe0Var3.f4531f & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                oe0VarM3050f = oe0Var3;
                                            } else {
                                                if (sh0Var == null) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (oe0VarM3050f != null) {
                                                    sh0Var.m4072b(oe0VarM3050f);
                                                    oe0VarM3050f = null;
                                                }
                                                sh0Var.m4072b(oe0Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                oe0VarM3050f = pf1.m3050f(sh0Var);
                            }
                        }
                        oe0Var2 = oe0Var2.f4533h;
                    }
                }
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var2 = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
            }
            InterfaceC0123db interfaceC0123db = (InterfaceC0123db) obj;
            if (interfaceC0123db != null && (objMo674a0 = interfaceC0123db.mo674a0((qj0VarM3038P = pf1.m3038P(interfaceC0694rm)), new C0458m3(3, c0607p9, qj0VarM3038P), m51Var)) == EnumC1007zk.f7916d) {
                return objMo674a0;
            }
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m4050o(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            C0921xc.m5131l(AbstractC0748t1.m4153k(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final void m4051p(long j, um0 um0Var) {
        if (um0Var == um0.f6264d) {
            if (C0617pj.m3136g(j) != Integer.MAX_VALUE) {
                return;
            }
            z10.m5363c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C0617pj.m3137h(j) != Integer.MAX_VALUE) {
                return;
            }
            z10.m5363c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final float[] m4052q(float[] fArr, float[] fArr2, float[] fArr3) {
        m4022G(fArr, fArr2);
        m4022G(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrM4016A = m4016A(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return m4021F(fArrM4016A, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final boolean m4053r(cd1 cd1Var, cd1 cd1Var2) {
        if (cd1Var == cd1Var2) {
            return true;
        }
        return Math.abs(cd1Var.f792a - cd1Var2.f792a) < 0.001f && Math.abs(cd1Var.f793b - cd1Var2.f793b) < 0.001f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC0966yk m4054s(InterfaceC0356ji interfaceC0356ji) {
        return new nu0(((C0616pi) interfaceC0356ji).f4876R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final C0476mj m4055t(AbstractC0549of abstractC0549of, AbstractC0549of abstractC0549of2) {
        return abstractC0549of == abstractC0549of2 ? new C0396kj(abstractC0549of, abstractC0549of, 1) : (rd0.m3487p(abstractC0549of.f4545b, 12884901888L) && rd0.m3487p(abstractC0549of2.f4545b, 12884901888L)) ? new C0433lj((nv0) abstractC0549of, (nv0) abstractC0549of2) : new C0476mj(abstractC0549of, abstractC0549of2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final Object m4056u(long j, AbstractC0358jk abstractC0358jk) {
        if (j > 0) {
            C0884wc c0884wc = new C0884wc(1, rd0.m3497z(abstractC0358jk));
            c0884wc.m4992v();
            if (j < Long.MAX_VALUE) {
                m4061z(c0884wc.f7077h).mo1074d(j, c0884wc);
            }
            Object objM4990t = c0884wc.m4990t();
            if (objM4990t == EnumC1007zk.f7916d) {
                return objM4990t;
            }
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m4057v(ViewOnAttachStateChangeListenerC0827v4 viewOnAttachStateChangeListenerC0827v4, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        zz0 zz0Var;
        xz0 xz0Var;
        InterfaceC0742sw interfaceC0742sw;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM1019q = AbstractC0195f3.m1019q(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM1019q != null && (value = viewTranslationResponseM1019q.getValue("android:text")) != null && (text = value.getText()) != null && (zz0Var = (zz0) viewOnAttachStateChangeListenerC0827v4.m4390h().m4248b((int) jKeyAt)) != null && (xz0Var = zz0Var.f8062a) != null) {
                Object objM1701g = xz0Var.f7471d.f5877d.m1701g(rz0.f5599l);
                if (objM1701g == null) {
                    objM1701g = null;
                }
                C0533o0 c0533o0 = (C0533o0) objM1701g;
                if (c0533o0 != null && (interfaceC0742sw = (InterfaceC0742sw) c0533o0.f4378b) != null) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final void m4058w(InterfaceC0812uq interfaceC0812uq, C0868vx c0868vx) {
        boolean z;
        Object obj;
        Object obj2;
        boolean z2;
        float f;
        float f2;
        InterfaceC0051bd interfaceC0051bdM2802f = interfaceC0812uq.mo655t().m2802f();
        C0868vx c0868vx2 = (C0868vx) interfaceC0812uq.mo655t().f4481b;
        C1020zx c1020zx = c0868vx.f6837a;
        C1020zx c1020zx2 = c0868vx.f6837a;
        RenderNode renderNode = c1020zx.f8012c;
        if (c0868vx.f6855s) {
            return;
        }
        c0868vx.m4794a();
        if (!renderNode.hasDisplayList()) {
            try {
                c0868vx.m4799f();
            } catch (Throwable unused) {
            }
        }
        boolean z3 = c1020zx2.f8021l > 0.0f;
        if (z3) {
            interfaceC0051bdM2802f.mo249o();
        }
        Canvas canvasM439a = AbstractC0077c3.m439a(interfaceC0051bdM2802f);
        boolean zIsHardwareAccelerated = canvasM439a.isHardwareAccelerated();
        if (zIsHardwareAccelerated) {
            z = z3;
            obj = null;
        } else {
            long j = c0868vx.f6856t;
            float f3 = (int) (j >> 32);
            float f4 = (int) (j & 4294967295L);
            z = z3;
            long j2 = c0868vx.f6857u;
            float f5 = ((int) (j2 >> 32)) + f3;
            float f6 = f4 + ((int) (j2 & 4294967295L));
            float f7 = c1020zx2.f8017h;
            int i = c1020zx.f8018i;
            if (f7 < 1.0f || i != 3 || c1020zx.f8028s == 1) {
                C0877w5 c0877w5M2767g = c0868vx.f6852p;
                if (c0877w5M2767g == null) {
                    c0877w5M2767g = o30.m2767g();
                    c0868vx.f6852p = c0877w5M2767g;
                }
                c0877w5M2767g.m4869c(f7);
                c0877w5M2767g.m4870d(i);
                obj = null;
                c0877w5M2767g.m4872f(null);
                f = f3;
                f2 = f4;
                canvasM439a.saveLayer(f, f2, f5, f6, c0877w5M2767g.f7002a);
            } else {
                canvasM439a.save();
                f = f3;
                f2 = f4;
                obj = null;
            }
            canvasM439a.translate(f, f2);
            Matrix matrix = c1020zx.f8015f;
            if (matrix == null) {
                matrix = new Matrix();
                c1020zx.f8015f = matrix;
            }
            renderNode.getMatrix(matrix);
            canvasM439a.concat(matrix);
        }
        boolean z4 = !zIsHardwareAccelerated && c0868vx.f6859w;
        if (z4) {
            interfaceC0051bdM2802f.mo243i();
            v50 v50VarM4797d = c0868vx.m4797d();
            if (v50VarM4797d instanceof xm0) {
                st0 st0Var = ((xm0) v50VarM4797d).f7375a;
                obj2 = obj;
                interfaceC0051bdM2802f.mo238d(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d, 1);
            } else {
                obj2 = obj;
                if (v50VarM4797d instanceof ym0) {
                    C0118d6 c0118d6M1030a = c0868vx.f6849m;
                    if (c0118d6M1030a != null) {
                        c0118d6M1030a.f973a.rewind();
                    } else {
                        c0118d6M1030a = AbstractC0198f6.m1030a();
                        c0868vx.f6849m = c0118d6M1030a;
                    }
                    C0118d6.m635b(c0118d6M1030a, ((ym0) v50VarM4797d).f7657a);
                    interfaceC0051bdM2802f.mo250p(c0118d6M1030a);
                } else {
                    if (!(v50VarM4797d instanceof wm0)) {
                        C0921xc.m5129j();
                        return;
                    }
                    interfaceC0051bdM2802f.mo250p(((wm0) v50VarM4797d).f7150a);
                }
            }
        } else {
            obj2 = obj;
        }
        if (c0868vx2 != null) {
            C0206fe c0206fe = c0868vx2.f6854r;
            if (!c0206fe.f1696a) {
                v10.m4364a("Only add dependencies during a tracking");
            }
            kh0 kh0Var = (kh0) c0206fe.f1699d;
            if (kh0Var != null) {
                kh0Var.m1890a(c0868vx);
            } else if (((C0868vx) c0206fe.f1697b) != null) {
                kh0 kh0Var2 = ey0.f1546a;
                kh0 kh0Var3 = new kh0();
                C0868vx c0868vx3 = (C0868vx) c0206fe.f1697b;
                c0868vx3.getClass();
                kh0Var3.m1890a(c0868vx3);
                kh0Var3.m1890a(c0868vx);
                c0206fe.f1699d = kh0Var3;
                c0206fe.f1697b = obj2;
            } else {
                c0206fe.f1697b = c0868vx;
            }
            kh0 kh0Var4 = (kh0) c0206fe.f1700e;
            if (kh0Var4 != null) {
                z2 = !kh0Var4.m1901l(c0868vx);
            } else if (((C0868vx) c0206fe.f1698c) != c0868vx) {
                z2 = true;
            } else {
                c0206fe.f1698c = obj2;
                z2 = false;
            }
            if (z2) {
                c0868vx.f6853q++;
            }
        }
        C0041b3 c0041b3 = (C0041b3) interfaceC0051bdM2802f;
        if (c0041b3.f362a.isHardwareAccelerated()) {
            c0041b3.f362a.drawRenderNode(renderNode);
        } else {
            C0125dd c0125dd = c0868vx.f6851o;
            if (c0125dd == null) {
                c0125dd = new C0125dd();
                c0868vx.f6851o = c0125dd;
            }
            C0541o8 c0541o8 = c0125dd.f1053e;
            InterfaceC0968ym interfaceC0968ym = c0868vx.f6838b;
            k50 k50Var = c0868vx.f6839c;
            long jM2759C = o30.m2759C(c0868vx.f6857u);
            C0087cd c0087cd = ((C0125dd) c0541o8.f4482c).f1052d;
            InterfaceC0968ym interfaceC0968ym2 = c0087cd.f787a;
            k50 k50Var2 = c0087cd.f788b;
            InterfaceC0051bd interfaceC0051bdM2802f2 = c0541o8.m2802f();
            long jM2803h = c0541o8.m2803h();
            C0868vx c0868vx4 = (C0868vx) c0541o8.f4481b;
            c0541o8.m2810o(interfaceC0968ym);
            c0541o8.m2811p(k50Var);
            c0541o8.m2809n(interfaceC0051bdM2802f);
            c0541o8.m2812q(jM2759C);
            c0541o8.f4481b = c0868vx;
            interfaceC0051bdM2802f.mo243i();
            try {
                c0868vx.m4796c(c0125dd);
            } finally {
                interfaceC0051bdM2802f.mo241g();
                c0541o8.m2810o(interfaceC0968ym2);
                c0541o8.m2811p(k50Var2);
                c0541o8.m2809n(interfaceC0051bdM2802f2);
                c0541o8.m2812q(jM2803h);
                c0541o8.f4481b = c0868vx4;
            }
        }
        if (z4) {
            interfaceC0051bdM2802f.mo241g();
        }
        if (z) {
            interfaceC0051bdM2802f.mo245k();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasM439a.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0021 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r1.mo827f(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0050, B:28:0x0065, B:30:0x006d, B:20:0x0045, B:23:0x004c), top: B:47:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [qs0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [md] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [md] */
    /* JADX WARN: Type inference failed for: r8v3, types: [md] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007f -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4059x(InterfaceC0331iu interfaceC0331iu, qs0 qs0Var, boolean z, AbstractC0358jk abstractC0358jk) {
        C0368ju c0368ju;
        C0797ub it;
        ?? r8;
        C0797ub c0797ub;
        InterfaceC0331iu interfaceC0331iu2;
        Object objM4292b;
        if (abstractC0358jk instanceof C0368ju) {
            c0368ju = (C0368ju) abstractC0358jk;
            int i = c0368ju.f2953l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0368ju.f2953l = i - Integer.MIN_VALUE;
            } else {
                c0368ju = new C0368ju(abstractC0358jk);
            }
        }
        Object obj = c0368ju.f2952k;
        int i2 = c0368ju.f2953l;
        CancellationException cancellationException = null;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        try {
            if (i2 == 0) {
                w60.m4891M(obj);
                it = qs0Var.iterator();
                qs0Var = qs0Var;
                c0368ju.f2948g = interfaceC0331iu;
                c0368ju.f2949h = qs0Var;
                c0368ju.f2950i = it;
                c0368ju.f2951j = z;
                c0368ju.f2953l = 1;
                objM4292b = it.m4292b(c0368ju);
                if (objM4292b != enumC1007zk) {
                }
            } else if (i2 == 1) {
                z = c0368ju.f2951j;
                c0797ub = c0368ju.f2950i;
                InterfaceC0470md interfaceC0470md = c0368ju.f2949h;
                interfaceC0331iu2 = c0368ju.f2948g;
                w60.m4891M(obj);
                r8 = interfaceC0470md;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = c0368ju.f2951j;
                c0797ub = c0368ju.f2950i;
                InterfaceC0470md interfaceC0470md2 = c0368ju.f2949h;
                interfaceC0331iu2 = c0368ju.f2948g;
                w60.m4891M(obj);
                ?? r82 = interfaceC0470md2;
                it = c0797ub;
                interfaceC0331iu = interfaceC0331iu2;
                qs0Var = r82;
                c0368ju.f2948g = interfaceC0331iu;
                c0368ju.f2949h = qs0Var;
                c0368ju.f2950i = it;
                c0368ju.f2951j = z;
                c0368ju.f2953l = 1;
                objM4292b = it.m4292b(c0368ju);
                if (objM4292b != enumC1007zk) {
                    return enumC1007zk;
                }
                interfaceC0331iu2 = interfaceC0331iu;
                c0797ub = it;
                obj = objM4292b;
                r8 = qs0Var;
                if (((Boolean) obj).booleanValue()) {
                    if (z) {
                        r8.mo2492a(null);
                    }
                    return na1.f4229a;
                }
                Object objM4293c = c0797ub.m4293c();
                c0368ju.f2948g = interfaceC0331iu2;
                c0368ju.f2949h = r8;
                c0368ju.f2950i = c0797ub;
                c0368ju.f2951j = z;
                c0368ju.f2953l = 2;
                r82 = r8;
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final boolean m4060y(long j, long j2) {
        return j == j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC0657qm m4061z(InterfaceC0618pk interfaceC0618pk) {
        InterfaceC0515nk interfaceC0515nkMo64l = interfaceC0618pk.mo64l(C0496n2.f4163w);
        InterfaceC0657qm interfaceC0657qm = interfaceC0515nkMo64l instanceof InterfaceC0657qm ? (InterfaceC0657qm) interfaceC0515nkMo64l : null;
        return interfaceC0657qm == null ? AbstractC0768tl.f6011a : interfaceC0657qm;
    }

    /* JADX INFO: renamed from: H */
    public abstract void mo2734H(Throwable th);

    /* JADX INFO: renamed from: I */
    public abstract void mo2735I(C0948y2 c0948y2);
}
