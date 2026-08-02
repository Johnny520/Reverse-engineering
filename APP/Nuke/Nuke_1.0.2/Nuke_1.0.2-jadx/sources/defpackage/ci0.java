package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ci0 {
    public static volatile ExecutorService a;
    public static final kw h;
    public static final kw l;
    public static final ha x;
    public static final b23 y;
    public static final char[] z;
    public static final int[] b = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] c = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] d = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] e = {R.attr.name, R.attr.pathData};
    public static final kw f = new kw(-793224480, false, new ye(3));
    public static final kw g = new kw(-170430427, false, new ye(14));
    public static final kw i = new kw(408669589, false, new ye(15));
    public static final kw j = new kw(601600790, false, new ye(16));
    public static final kw k = new kw(-907257638, false, new ye(4));
    public static final kw m = new kw(-634806131, false, new ye(6));
    public static final kw n = new kw(1537998623, false, new ye(7));
    public static final kw o = new kw(-359254876, false, new ye(8));
    public static final kw p = new kw(-2730867, false, new ye(9));
    public static final kw q = new kw(-2103219128, false, new ye(10));
    public static final kw r = new kw(1440199015, false, new ye(11));
    public static final kw s = new kw(1587835904, false, new ye(12));
    public static final kw t = new kw(1712782185, false, new ye(13));
    public static final Class[] u = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final hh1 v = new hh1(19, "NO_OWNER");
    public static final ha w = new ha(1000);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 5;
        h = new kw(469827654, false, new ow(i2));
        l = new kw(-2093624668, false, new ye(i2));
        new ha(1007);
        x = new ha(1008);
        new ha(1002);
        y = new b23(0, new long[0], new Object[0]);
        z = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float A(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double B(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float C(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int D(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long E(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void F(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        um2.d(i2, i3, ") is greater than size (", "toIndex (");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fb3 G(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                c80.A("Cannot create an instance of ", cls);
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (fb3) objNewInstance;
            } catch (IllegalAccessException e2) {
                c80.o("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                c80.o("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            c80.o("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, CONST_STR, CONSTRUCTOR, INVOKE, INVOKE, IF, CHECK_CAST, IF, IF, INSTANCE_OF, THROW, IF, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.m(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(ak0 ak0Var, fq fqVar, boolean z2, t00 t00Var) throws Throwable {
        ck0 ck0Var;
        in it;
        in inVar;
        ak0 ak0Var2;
        Object objB;
        if (t00Var instanceof ck0) {
            ck0Var = (ck0) t00Var;
            int i2 = ck0Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ck0Var.p = i2 - Integer.MIN_VALUE;
            } else {
                ck0Var = new ck0(t00Var);
            }
        }
        Object obj = ck0Var.o;
        int i3 = ck0Var.p;
        CancellationException cancellationException = null;
        k20 k20Var = k20.h;
        try {
            if (i3 == 0) {
                fg1.T(obj);
                if (ak0Var instanceof i23) {
                    throw ((i23) ak0Var).h;
                }
                it = fqVar.iterator();
                ck0Var.k = ak0Var;
                ck0Var.l = fqVar;
                ck0Var.m = it;
                ck0Var.n = z2;
                ck0Var.p = 1;
                objB = it.b(ck0Var);
                if (objB != k20Var) {
                }
            } else if (i3 == 1) {
                z2 = ck0Var.n;
                inVar = ck0Var.m;
                fqVar = ck0Var.l;
                ak0Var2 = ck0Var.k;
                fg1.T(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = ck0Var.n;
                inVar = ck0Var.m;
                fqVar = ck0Var.l;
                ak0Var2 = ck0Var.k;
                fg1.T(obj);
                it = inVar;
                ak0Var = ak0Var2;
                ck0Var.k = ak0Var;
                ck0Var.l = fqVar;
                ck0Var.m = it;
                ck0Var.n = z2;
                ck0Var.p = 1;
                objB = it.b(ck0Var);
                if (objB != k20Var) {
                    return k20Var;
                }
                ak0Var2 = ak0Var;
                inVar = it;
                obj = objB;
                if (((Boolean) obj).booleanValue()) {
                    if (z2) {
                        fqVar.c(null);
                    }
                    return a83.a;
                }
                Object objC = inVar.c();
                ck0Var.k = ak0Var2;
                ck0Var.l = fqVar;
                ck0Var.m = inVar;
                ck0Var.n = z2;
                ck0Var.p = 2;
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bh1 I(bh1 bh1Var, d61 d61Var, m13 m13Var, e70 e70Var, xl0 xl0Var) {
        if (bh1Var != null && d61Var == bh1Var.a && xe1.k0(m13Var, d61Var).equals(bh1Var.b) && e70Var.b() == bh1Var.c.h && xl0Var == bh1Var.d) {
            return bh1Var;
        }
        bh1 bh1Var2 = bh1.h;
        if (bh1Var2 != null && d61Var == bh1Var2.a && xe1.k0(m13Var, d61Var).equals(bh1Var2.b) && e70Var.b() == bh1Var2.c.h && xl0Var == bh1Var2.d) {
            return bh1Var2;
        }
        bh1 bh1Var3 = new bh1(d61Var, xe1.k0(m13Var, d61Var), new h70(e70Var.b(), e70Var.m()), xl0Var);
        bh1.h = bh1Var3;
        return bh1Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Executor J() {
        if (a == null) {
            synchronized (ci0.class) {
                try {
                    if (a == null) {
                        a = Executors.newCachedThreadPool();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bundle K(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        s.j(vi0.j("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final c92 L(y03 y03Var, int i2) {
        x03 x03Var = y03Var.a;
        lj1 lj1Var = y03Var.b;
        if (x03Var.a.i.length() != 0) {
            int iD = lj1Var.d(i2);
            if ((i2 != 0 && iD == lj1Var.d(i2 - 1)) || (i2 != x03Var.a.i.length() && iD == lj1Var.d(i2 + 1))) {
                return y03Var.a(i2);
            }
        }
        return y03Var.g(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: mc0 */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void M(mc0 mc0Var) {
        if (((th1) mc0Var).h.u) {
            sp0.Z(mc0Var, 1).Z0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean N(gx2 gx2Var) {
        gx2Var.getClass();
        if (gx2Var.a) {
            pp1 pp1Var = pp1.a;
            if (!pp1.c().a(gx2Var.d(), true)) {
                pp1 pp1Var2 = pp1.a;
                if (!pp1.c().a(gx2Var.d(), false)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean O(String str, int i2, int i3) {
        str.getClass();
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && ug3.k(str.charAt(i2 + 1)) != -1 && ug3.k(str.charAt(i4)) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static js0 P(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            s.j("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (strArr3[i3] == null) {
                s.j("Headers cannot be null");
                return null;
            }
            strArr3[i3] = pv2.I0(strArr2[i3]).toString();
        }
        int iC = p40.C(0, strArr3.length - 1, 2);
        if (iC >= 0) {
            while (true) {
                String str = strArr3[i2];
                String str2 = strArr3[i2 + 1];
                n93.c(str);
                n93.d(str2, str);
                if (i2 == iC) {
                    break;
                }
                i2 += 2;
            }
        }
        return new js0(strArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static oo Q(js0 js0Var) {
        int i2;
        int i3;
        int i4;
        String string;
        js0 js0Var2 = js0Var;
        js0Var2.getClass();
        int size = js0Var2.size();
        int i5 = 0;
        boolean z2 = true;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int iM = -1;
        int iM2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iM3 = -1;
        int iM4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i5 < size) {
            String strB = js0Var2.b(i5);
            String strD = js0Var2.d(i5);
            if (strB.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strD;
                }
                i2 = 0;
                while (i2 < strD.length()) {
                    int length = strD.length();
                    int length2 = i2;
                    while (true) {
                        if (length2 >= length) {
                            i3 = size;
                            length2 = strD.length();
                            break;
                        }
                        i3 = size;
                        if (pv2.i0("=,;", strD.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i3;
                    }
                    String string2 = pv2.I0(strD.substring(i2, length2)).toString();
                    if (length2 == strD.length() || strD.charAt(length2) == ',' || strD.charAt(length2) == ';') {
                        i4 = length2 + 1;
                        string = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = ug3.a;
                        int length4 = strD.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strD.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strD.length();
                                break;
                            }
                        }
                        if (length3 >= strD.length() || strD.charAt(length3) != '\"') {
                            int length5 = strD.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strD.length();
                                    break;
                                }
                                int i6 = length5;
                                if (pv2.i0(",;", strD.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i6;
                            }
                            int i7 = length6;
                            string = pv2.I0(strD.substring(length3, length6)).toString();
                            i4 = i7;
                        } else {
                            int i8 = length3 + 1;
                            int iP0 = pv2.p0(strD, '\"', i8, 4);
                            string = strD.substring(i8, iP0);
                            i4 = iP0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string2)) {
                        i2 = i4;
                        z3 = true;
                    } else if ("no-store".equalsIgnoreCase(string2)) {
                        i2 = i4;
                        z4 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(string2)) {
                            iM = ug3.m(string, -1);
                        } else if ("s-maxage".equalsIgnoreCase(string2)) {
                            iM2 = ug3.m(string, -1);
                        } else if ("private".equalsIgnoreCase(string2)) {
                            i2 = i4;
                            z5 = true;
                        } else if ("public".equalsIgnoreCase(string2)) {
                            i2 = i4;
                            z6 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string2)) {
                            i2 = i4;
                            z7 = true;
                        } else if ("max-stale".equalsIgnoreCase(string2)) {
                            iM3 = ug3.m(string, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(string2)) {
                            iM4 = ug3.m(string, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(string2)) {
                            i2 = i4;
                            z8 = true;
                        } else if ("no-transform".equalsIgnoreCase(string2)) {
                            i2 = i4;
                            z9 = true;
                        } else if ("immutable".equalsIgnoreCase(string2)) {
                            i2 = i4;
                            z10 = true;
                        }
                        i2 = i4;
                    }
                    size = i3;
                }
                i5++;
                js0Var2 = js0Var;
                size = size;
            } else if (!strB.equalsIgnoreCase("Pragma")) {
                i5++;
                js0Var2 = js0Var;
                size = size;
            }
            z2 = false;
            i2 = 0;
            while (i2 < strD.length()) {
            }
            i5++;
            js0Var2 = js0Var;
            size = size;
        }
        return new oo(z3, z4, iM, iM2, z5, z6, z7, iM3, iM4, z8, z9, z10, !z2 ? null : str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String R(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z2 = (i4 & 4) == 0;
        str.getClass();
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                fn fnVar = new fn();
                fnVar.K(str, i2, iCharCount);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iK = ug3.k(str.charAt(iCharCount + 1));
                        int iK2 = ug3.k(str.charAt(i5));
                        if (iK == -1 || iK2 == -1) {
                            fnVar.L(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            fnVar.E((iK << 4) + iK2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z2) {
                        fnVar.E(32);
                        iCharCount++;
                    } else {
                        fnVar.L(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return fnVar.u();
            }
            iCharCount++;
        }
        return str.substring(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long S(oy0 oy0Var, qv1 qv1Var, ny0 ny0Var, boolean z2) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        long j3 = oy0Var.g;
        if (qv1Var != null) {
            int i2 = ny0Var.a;
            if (i2 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            } else if (i2 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
            }
            if (qv1Var == qv1.i) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j2 = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j2 = jFloatToRawIntBits3 << 32;
            }
            j3 = j2 | (jFloatToRawIntBits & 4294967295L);
        }
        long jD = rs1.d(T(oy0Var, qv1Var, ny0Var), j3);
        if (z2 || !oy0Var.i) {
            return jD;
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long T(oy0 oy0Var, qv1 qv1Var, ny0 ny0Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j2;
        if (qv1Var == null) {
            return oy0Var.c;
        }
        int i2 = ny0Var.a;
        if (i2 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (oy0Var.c >> 32));
        } else {
            if (i2 != 2) {
                return oy0Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (oy0Var.c & 4294967295L));
        }
        if (qv1Var == qv1.i) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void U(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void V(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a11 W(c11 c11Var, int i2) {
        c11Var.getClass();
        boolean z2 = i2 > 0;
        Integer numValueOf = Integer.valueOf(i2);
        if (!z2) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i3 = c11Var.h;
        int i4 = c11Var.i;
        if (c11Var.j <= 0) {
            i2 = -i2;
        }
        return new a11(i3, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c11 X(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new c11(i2, i3 - 1, 1);
        }
        c11 c11Var = c11.k;
        return c11.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f42 f42Var, kw kwVar, px pxVar, int i2) {
        m93 m93Var;
        boolean z2;
        b62 b62VarR;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-149765515);
        i11 i11Var = go0Var.x;
        yy1 yy1VarL = go0Var.l();
        go0Var.U(201, tx.b);
        Object objL = go0Var.L();
        if (t11.l(objL, nx.a)) {
            m93Var = null;
        } else {
            objL.getClass();
            m93Var = (m93) objL;
        }
        e42 e42Var = f42Var.a;
        m93 m93VarC = e42Var.c(f42Var, m93Var);
        boolean zEquals = m93VarC.equals(m93Var);
        if (!zEquals) {
            go0Var.f0(m93VarC);
        }
        if (!go0Var.S) {
            pr2 pr2Var = go0Var.G;
            Object objB = pr2Var.b(pr2Var.b, pr2Var.g);
            objB.getClass();
            yy1 yy1Var = (yy1) objB;
            if (!(go0Var.A() && zEquals) && (f42Var.f || !yy1VarL.containsKey(e42Var))) {
                yy1VarL = yy1VarL.d(e42Var, m93VarC);
            } else if ((zEquals && !go0Var.w) || !go0Var.w) {
                yy1VarL = yy1Var;
            }
            if (go0Var.y || yy1Var != yy1VarL) {
                z2 = true;
            }
            if (z2 && !go0Var.S) {
                go0Var.J(yy1VarL);
            }
            i11Var.c(go0Var.w ? 1 : 0);
            go0Var.w = z2;
            go0Var.K = yy1VarL;
            go0Var.S(202, 0, tx.c, yy1VarL);
            kwVar.g(go0Var, Integer.valueOf((i2 >> 3) & 14));
            go0Var.p(false);
            go0Var.p(false);
            go0Var.w = i11Var.b() != 0;
            go0Var.K = null;
            b62VarR = go0Var.r();
            if (b62VarR == null) {
                b62VarR.d = new up(i2, 2, f42Var, kwVar);
                return;
            }
            return;
        }
        if (f42Var.f || !yy1VarL.containsKey(e42Var)) {
            yy1VarL = yy1VarL.d(e42Var, m93VarC);
        }
        go0Var.J = true;
        z2 = false;
        if (z2) {
            go0Var.J(yy1VarL);
        }
        i11Var.c(go0Var.w ? 1 : 0);
        go0Var.w = z2;
        go0Var.K = yy1VarL;
        go0Var.S(202, 0, tx.c, yy1VarL);
        kwVar.g(go0Var, Integer.valueOf((i2 >> 3) & 14));
        go0Var.p(false);
        go0Var.p(false);
        go0Var.w = i11Var.b() != 0;
        go0Var.K = null;
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f42[] f42VarArr, mn0 mn0Var, px pxVar, int i2) {
        yy1 yy1VarD;
        boolean z2;
        b62 b62VarR;
        go0 go0Var = (go0) pxVar;
        go0Var.X(415205898);
        i11 i11Var = go0Var.x;
        yy1 yy1VarL = go0Var.l();
        go0Var.U(201, tx.b);
        boolean z3 = go0Var.S;
        yt1 yt1Var = tx.d;
        if (z3) {
            yy1 yy1VarB = op0.B(f42VarArr, yy1VarL, yy1.k);
            yy1VarL.getClass();
            xy1 xy1Var = new xy1(yy1VarL);
            xy1Var.n = yy1VarL;
            xy1Var.putAll(yy1VarB);
            yy1VarD = xy1Var.a();
            go0Var.U(204, yt1Var);
            go0Var.D();
            go0Var.g0(yy1VarD);
            go0Var.D();
            go0Var.g0(yy1VarB);
            go0Var.p(false);
            go0Var.J = true;
        } else {
            pr2 pr2Var = go0Var.G;
            Object objH = pr2Var.h(pr2Var.g, 0);
            objH.getClass();
            yy1 yy1Var = (yy1) objH;
            pr2 pr2Var2 = go0Var.G;
            Object objH2 = pr2Var2.h(pr2Var2.g, 1);
            objH2.getClass();
            yy1 yy1Var2 = (yy1) objH2;
            yy1 yy1VarB2 = op0.B(f42VarArr, yy1VarL, yy1Var2);
            if (!go0Var.A() || go0Var.y || !yy1Var2.equals(yy1VarB2)) {
                yy1VarL.getClass();
                xy1 xy1Var2 = new xy1(yy1VarL);
                xy1Var2.n = yy1VarL;
                xy1Var2.putAll(yy1VarB2);
                yy1VarD = xy1Var2.a();
                go0Var.U(204, yt1Var);
                go0Var.D();
                go0Var.g0(yy1VarD);
                go0Var.D();
                go0Var.g0(yy1VarB2);
                go0Var.p(false);
                if (go0Var.y || !t11.l(yy1VarD, yy1Var)) {
                    z2 = true;
                }
                if (z2 && !go0Var.S) {
                    go0Var.J(yy1VarD);
                }
                i11Var.c(go0Var.w ? 1 : 0);
                go0Var.w = z2;
                go0Var.K = yy1VarD;
                go0Var.S(202, 0, tx.c, yy1VarD);
                mn0Var.g(go0Var, Integer.valueOf((i2 >> 3) & 14));
                go0Var.p(false);
                go0Var.p(false);
                go0Var.w = i11Var.b() != 0;
                go0Var.K = null;
                b62VarR = go0Var.r();
                if (b62VarR == null) {
                    b62VarR.d = new up(i2, 3, f42VarArr, mn0Var);
                    return;
                }
                return;
            }
            go0Var.l = go0Var.G.s() + go0Var.l;
            yy1VarD = yy1Var;
        }
        z2 = false;
        if (z2) {
            go0Var.J(yy1VarD);
        }
        i11Var.c(go0Var.w ? 1 : 0);
        go0Var.w = z2;
        go0Var.K = yy1VarD;
        go0Var.S(202, 0, tx.c, yy1VarD);
        mn0Var.g(go0Var, Integer.valueOf((i2 >> 3) & 14));
        go0Var.p(false);
        go0Var.p(false);
        go0Var.w = i11Var.b() != 0;
        go0Var.K = null;
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(String str, xm0 xm0Var, in0 in0Var, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1936686629);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.h(in0Var) ? 256 : 128;
        }
        int i4 = 0;
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objL = go0Var.L();
            if (z2 || objL == nx.a) {
                objL = op0.u(str);
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            qp0.d(true, xm0Var, null, rg3.P(me.dartcv.nuke.R.string.custom_input_hint_config_title, go0Var), null, xe1.i0(-61595080, new ih(xm0Var, in0Var, xk1Var, 3), go0Var), xe1.i0(-483523025, new y30(xk1Var, i4), go0Var), go0Var, (i3 & 112) | 1769478, 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new es(str, xm0Var, in0Var, i2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0351  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r14v1, types: [go0, px] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r4v1, types: [go0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [go0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [px] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(int i2, int i3, s8 s8Var, yf yfVar, pk pkVar, px pxVar, n50 n50Var, in0 in0Var, d91 d91Var, uh1 uh1Var, jw1 jw1Var, boolean z2) {
        int i4;
        int i5;
        d91 d91Var2;
        ?? r4;
        int i6;
        int i7;
        Object w81Var;
        d91 d91Var3;
        l81 l81Var;
        ?? r10;
        boolean z3;
        u81 u81Var;
        uh1 uh1VarS;
        ?? r14 = (go0) pxVar;
        r14.X(924924659);
        if ((i2 & 6) == 0) {
            i4 = (r14.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= r14.f(d91Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= r14.f(jw1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= r14.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= r14.g(true) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= r14.f(n50Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= r14.g(z2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= r14.f(s8Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= r14.f(pkVar) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (r14.f(yfVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i8 = i5 | 432;
        if ((i3 & 3072) == 0) {
            i8 |= r14.h(in0Var) ? 2048 : 1024;
        }
        if (r14.O(i4 & 1, ((306783379 & i4) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            r14.T();
            if ((i2 & 1) != 0 && !r14.y()) {
                r14.R();
            }
            int i9 = i4 & (-234881025);
            r14.q();
            int i10 = i9 >> 3;
            int i11 = i10 & 14;
            int i12 = i11 | ((i8 >> 6) & 112);
            xk1 xk1VarX = op0.x(in0Var, r14);
            boolean z4 = (((i12 & 14) ^ 6) > 4 && r14.f(d91Var)) || (i12 & 6) == 4;
            Object objL = r14.L();
            eb ebVar = nx.a;
            if (z4 || objL == ebVar) {
                o71 o71Var = new o71();
                i6 = i11;
                o71Var.a = new kx1(Integer.MAX_VALUE);
                o71Var.b = new kx1(Integer.MAX_VALUE);
                sn snVar = sn.P;
                i7 = i8;
                f0 f0Var = new f0(xk1VarX, 28);
                b5 b5Var = ls2.a;
                objL = new u81(0, 0, gu2.class, new n70(new s1(new n70(f0Var, snVar), d91Var, o71Var, 14), snVar), "value", "getValue()Ljava/lang/Object;");
                r14.f0(objL);
            } else {
                i6 = i11;
                i7 = i8;
            }
            u81 u81Var2 = (u81) objL;
            int i13 = i9 >> 9;
            int i14 = i6 | (i13 & 112);
            boolean z5 = ((((i14 & 112) ^ 48) > 32 && r14.g(true)) || (i14 & 48) == 32) | ((((i14 & 14) ^ 6) > 4 && r14.f(d91Var)) || (i14 & 6) == 4);
            Object objL2 = r14.L();
            if (z5 || objL2 == ebVar) {
                objL2 = new l81(d91Var);
                r14.f0(objL2);
            }
            l81 l81Var2 = (l81) objL2;
            Object objL3 = r14.L();
            if (objL3 == ebVar) {
                objL3 = eu.C(r14);
                r14.f0(objL3);
            }
            j20 j20Var = (j20) objL3;
            nq0 nq0Var = (nq0) r14.j(ly.g);
            j51 j51Var = !((Boolean) r14.j(ly.w)).booleanValue() ? xu2.a : null;
            int i15 = i7 << 18;
            int i16 = (i9 & 65520) | (i13 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | ((i7 << 27) & 1879048192);
            boolean z6 = ((((i16 & 112) ^ 48) > 32 && r14.f(d91Var)) || (i16 & 48) == 32) | ((((i16 & 896) ^ 384) > 256 && r14.f(jw1Var)) || (i16 & 384) == 256) | ((((i16 & 7168) ^ 3072) > 2048 && r14.g(false)) || (i16 & 3072) == 2048);
            if (((57344 & i16) ^ 24576) <= 16384 || !r14.g(true)) {
                boolean z7 = (i16 & 24576) == 16384;
                boolean zD = (((i16 & 234881024) ^ 100663296) > 67108864 && r14.f(null)) | z6 | z7 | r14.d(0) | ((((i16 & 3670016) ^ 1572864) > 1048576 && r14.f(pkVar)) || (i16 & 1572864) == 1048576) | (((i16 & 29360128) ^ 12582912) > 8388608 && r14.f(null)) | ((((i16 & 1879048192) ^ 805306368) > 536870912 && r14.f(yfVar)) || (i16 & 805306368) == 536870912) | r14.f(nq0Var) | r14.f(j51Var);
                Object objL4 = r14.L();
                if (zD || objL4 == ebVar) {
                    d91Var3 = d91Var;
                    l81Var = l81Var2;
                    r10 = 0;
                    z3 = true;
                    w81Var = new w81(d91Var3, jw1Var, u81Var2, yfVar, j20Var, nq0Var, j51Var, pkVar);
                    u81Var = u81Var2;
                    r14.f0(w81Var);
                } else {
                    w81Var = objL4;
                    u81Var = u81Var2;
                    l81Var = l81Var2;
                    r10 = 0;
                    z3 = true;
                    d91Var3 = d91Var;
                }
                w81 w81Var2 = (w81) w81Var;
                qv1 qv1Var = qv1.h;
                if (z2) {
                    r14.W(-2077147368);
                    if (((i10 & 14) ^ 6) > 4) {
                        ?? r26 = z3;
                        if (!r14.f(d91Var3)) {
                            r26 = z3;
                            if ((i10 & 6) != 4) {
                                r26 = r10;
                            }
                        }
                        int i17 = r26 | (r14.d(r10) ? 1 : 0);
                        Object objL5 = r14.L();
                        if (i17 != 0 || objL5 == ebVar) {
                            objL5 = new r81(d91Var3);
                            r14.f0(objL5);
                        }
                        uh1VarS = xe1.S((r81) objL5, d91Var3.o, qv1Var);
                        r14.p(r10);
                    }
                } else {
                    r14.W(-2076718545);
                    r14.p(r10);
                    uh1VarS = rh1.a;
                }
                d91Var2 = d91Var3;
                ?? r42 = r14;
                tl.b(u81Var, fg1.N(p7.D(uh1Var.c(d91Var3.l).c(d91Var3.m), u81Var, l81Var, qv1Var, z2).c(uh1VarS).c(d91Var3.n.i), d91Var3, qv1Var, s8Var, z2, n50Var, d91Var3.g), d91Var2.p, w81Var2, r42, 0);
                r4 = r42;
            }
        } else {
            d91Var2 = d91Var;
            ?? r43 = r14;
            r43.R();
            r4 = r43;
        }
        b62 b62VarR = r4.r();
        if (b62VarR != null) {
            b62VarR.d = new k71(uh1Var, d91Var2, jw1Var, n50Var, z2, s8Var, pkVar, yfVar, in0Var, i2, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(uh1 uh1Var, px pxVar, int i2) {
        int i3;
        uh1 uh1Var2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1695544428);
        int i4 = i2 | 6;
        int i5 = 2;
        if (go0Var.O(i4 & 1, (i4 & 3) != 2)) {
            long j2 = ((lp1) go0Var.j(ur1.a)).g;
            Context context = (Context) go0Var.j(r7.b);
            pp1 pp1Var = pp1.a;
            x83 x83Var = pp1.c;
            if (x83Var == null) {
                t11.S("mUser");
                throw null;
            }
            String strL = x83Var.l();
            uh1Var2 = rh1.a;
            uh1 uh1VarG0 = te.g0(uh1Var2, 38.0f);
            fb2 fb2Var = gb2.a;
            uh1 uh1VarN = gf1.n(z(uh1VarG0, fb2Var), ju.b(0.14f, j2), sp0.h);
            nf1 nf1VarD = dm.d(sn.n, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarN);
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
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            uh1 uh1VarG02 = te.g0(uh1Var2, 22.0f);
            boolean zE = go0Var.e(j2);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (zE || objL == ebVar) {
                objL = new c8(j2, 3);
                go0Var.f0(objL);
            }
            eu.b(uh1VarG02, (in0) objL, go0Var, 6);
            if (pv2.s0(strL)) {
                go0Var.W(242606888);
                go0Var.p(false);
            } else {
                go0Var.W(242057847);
                uh1 uh1VarZ = z(te.g0(uh1Var2, 38.0f), fb2Var);
                Object objL2 = go0Var.L();
                if (objL2 == ebVar) {
                    objL2 = new gs(26);
                    go0Var.f0(objL2);
                }
                in0 in0Var = (in0) objL2;
                boolean zH = go0Var.h(context) | go0Var.f(strL);
                Object objL3 = go0Var.L();
                if (zH || objL3 == ebVar) {
                    objL3 = new u1(context, strL, i5);
                    go0Var.f0(objL3);
                }
                pp0.b(in0Var, uh1VarZ, (in0) objL3, go0Var, 6, 0);
                go0Var.p(false);
            }
            i3 = 1;
            go0Var.p(true);
        } else {
            i3 = 1;
            go0Var.R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new cm(uh1Var2, i2, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(final float f2, px pxVar, final int i2, final int i3) {
        int i4;
        go0 go0Var = (go0) pxVar;
        go0Var.X(339296263);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (go0Var.c(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if (go0Var.O(i4 & 1, (i4 & 3) != 2)) {
            if (i5 != 0) {
                f2 = 16.0f;
            }
            float f3 = f2;
            f2 = f3;
            op0.a(fg1.G(rh1.a, f3, 0.0f, 16.0f, 0.0f, 10), 0.5f, ((lp1) go0Var.j(ur1.a)).d, go0Var, 48, 0);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0() { // from class: ft0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(i2 | 1);
                    ci0.f(f2, (px) obj, iN, i3);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(uh1 uh1Var, String str, String str2, px pxVar, int i2, int i3) {
        int i4;
        String str3;
        int i5;
        uh1 uh1Var2;
        String str4;
        String str5;
        String strP;
        String strP2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(346352169);
        int i6 = i2 | 6;
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i2 | 54;
        } else {
            i4 = i6 | (go0Var.f(str) ? 32 : 16);
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 = i4 | 384;
            str3 = str2;
        } else {
            str3 = str2;
            i5 = i4 | (go0Var.f(str3) ? 256 : 128);
        }
        if (go0Var.O(i5 & 1, (i5 & 147) != 146)) {
            String str6 = i7 != 0 ? null : str;
            String str7 = i8 == 0 ? str3 : null;
            if (str6 == null) {
                go0Var.W(2131957371);
                strP = rg3.P(me.dartcv.nuke.R.string.home_settings_empty_title, go0Var);
                go0Var.p(false);
            } else {
                go0Var.W(2131957092);
                go0Var.p(false);
                strP = str6;
            }
            if (str7 == null) {
                go0Var.W(2131960189);
                strP2 = rg3.P(me.dartcv.nuke.R.string.home_settings_empty_message, go0Var);
                go0Var.p(false);
            } else {
                go0Var.W(2131959848);
                go0Var.p(false);
                strP2 = str7;
            }
            kw kwVarI0 = xe1.i0(823288904, new ct0(strP, strP2), go0Var);
            rh1 rh1Var = rh1.a;
            eu.n(rh1Var, null, kwVarI0, go0Var, 390, 2);
            str5 = str7;
            uh1Var2 = rh1Var;
            str4 = str6;
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
            str4 = str;
            str5 = str3;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(uh1Var2, str4, str5, i2, i3, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final uh1 uh1Var, final kr1 kr1Var, long j2, long j3, float f2, long j4, float f3, jw1 jw1Var, r5 r5Var, kw kwVar, px pxVar, final int i2, final int i3) {
        int i4;
        long j5;
        int i5;
        float f4;
        int i6;
        long j6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        kw kwVar2;
        float f5;
        jw1 jw1Var2;
        long j7;
        r5 r5Var2;
        b62 b62VarR;
        int i13;
        long j8;
        float f6;
        za0 za0Var;
        za0 za0Var2;
        za0 za0Var3;
        za0 za0Var4;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1341778111);
        if ((i2 & 6) == 0) {
            i4 = i2 | (go0Var.f(uh1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go0Var.f(kr1Var) ? 32 : 16;
        }
        int i14 = i4 | (((i3 & 4) == 0 && go0Var.e(j2)) ? 256 : 128);
        int i15 = i3 & 8;
        if (i15 != 0) {
            i5 = i14 | 3072;
            j5 = j3;
        } else {
            j5 = j3;
            i5 = i14 | (go0Var.e(j5) ? 2048 : 1024);
        }
        int i16 = i3 & 16;
        if (i16 != 0) {
            i6 = i5 | 24576;
            f4 = f2;
        } else {
            f4 = f2;
            i6 = i5 | (go0Var.c(f4) ? 16384 : 8192);
        }
        int i17 = i3 & 32;
        if (i17 != 0) {
            i7 = i6 | 196608;
            j6 = j4;
        } else {
            j6 = j4;
            i7 = i6 | (go0Var.e(j6) ? 131072 : 65536);
        }
        int i18 = i3 & 64;
        if (i18 != 0) {
            i8 = i7 | 1572864;
        } else {
            i8 = i7 | (go0Var.c(f3) ? 1048576 : 524288);
        }
        int i19 = i3 & 128;
        if (i19 == 0) {
            if ((i2 & 12582912) == 0) {
                i9 = i19;
                i8 |= go0Var.f(jw1Var) ? 8388608 : 4194304;
            }
            i10 = i3 & 256;
            if (i10 == 0) {
                i12 = i8 | 100663296;
                i11 = i10;
            } else {
                i11 = i10;
                i12 = i8 | (go0Var.f(r5Var) ? 67108864 : 33554432);
            }
            if (go0Var.O(i12 & 1, (i12 & 306783379) == 306783378)) {
                kwVar2 = kwVar;
                go0Var.R();
                f5 = f3;
                jw1Var2 = jw1Var;
                j7 = j6;
                r5Var2 = r5Var;
            } else {
                go0Var.T();
                if ((i2 & 1) == 0 || go0Var.y()) {
                    if ((i3 & 4) != 0) {
                        i13 = i15;
                        j8 = ((lp1) go0Var.j(ur1.a)).c;
                    } else {
                        i13 = i15;
                        j8 = j2;
                    }
                    if (i13 != 0) {
                        j5 = ju.f;
                    }
                    if (i16 != 0) {
                        f4 = 0.0f;
                    }
                    j7 = i17 != 0 ? ju.f : j6;
                    f6 = i18 != 0 ? 0.0f : f3;
                    jw1Var2 = i9 != 0 ? new jw1(0.0f, 0.0f, 0.0f, 0.0f) : jw1Var;
                    if (i11 != 0) {
                        r5Var2 = sn.j;
                    }
                    go0Var.q();
                    za0Var = new za0(f4);
                    za0Var2 = new za0(0.0f);
                    if (za0Var.compareTo(za0Var2) < 0) {
                        za0Var = za0Var2;
                    }
                    za0Var3 = new za0(f6);
                    f5 = f6;
                    za0Var4 = new za0(0.0f);
                    if (za0Var3.compareTo(za0Var4) < 0) {
                        za0Var3 = za0Var4;
                    }
                    uh1 uh1VarZ = z(uh1Var, kr1Var);
                    iu0 iu0Var = sp0.h;
                    uh1 uh1VarC = gf1.n(z(fg1.C(gf1.n(uh1VarZ, j5, iu0Var), za0Var.h), kr1Var), j8, iu0Var).c(new rl(za0Var3.h, new ft2(j7), kr1Var)).c(new iw1(jw1Var2));
                    nf1 nf1VarD = dm.d(r5Var2, false);
                    j2 = j8;
                    int iHashCode = Long.hashCode(go0Var.T);
                    yy1 yy1VarL = go0Var.l();
                    uh1 uh1VarM = tl.M(go0Var, uh1VarC);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var.Z();
                    if (go0Var.S) {
                        go0Var.i0();
                    } else {
                        go0Var.k(jyVar);
                    }
                    yf3.c(go0Var, gx.e, nf1VarD);
                    yf3.c(go0Var, gx.d, yy1VarL);
                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                    yf3.b(go0Var, gx.g);
                    yf3.c(go0Var, gx.c, uh1VarM);
                    kwVar2 = kwVar;
                    kwVar2.e(hm.a, go0Var, 54);
                    go0Var.p(true);
                } else {
                    go0Var.R();
                    j8 = j2;
                    f6 = f3;
                    jw1Var2 = jw1Var;
                    j7 = j6;
                }
                r5Var2 = r5Var;
                go0Var.q();
                za0Var = new za0(f4);
                za0Var2 = new za0(0.0f);
                if (za0Var.compareTo(za0Var2) < 0) {
                }
                za0Var3 = new za0(f6);
                f5 = f6;
                za0Var4 = new za0(0.0f);
                if (za0Var3.compareTo(za0Var4) < 0) {
                }
                uh1 uh1VarZ2 = z(uh1Var, kr1Var);
                iu0 iu0Var2 = sp0.h;
                uh1 uh1VarC2 = gf1.n(z(fg1.C(gf1.n(uh1VarZ2, j5, iu0Var2), za0Var.h), kr1Var), j8, iu0Var2).c(new rl(za0Var3.h, new ft2(j7), kr1Var)).c(new iw1(jw1Var2));
                nf1 nf1VarD2 = dm.d(r5Var2, false);
                j2 = j8;
                int iHashCode2 = Long.hashCode(go0Var.T);
                yy1 yy1VarL2 = go0Var.l();
                uh1 uh1VarM2 = tl.M(go0Var, uh1VarC2);
                hx.c.getClass();
                jy jyVar2 = gx.b;
                go0Var.Z();
                if (go0Var.S) {
                }
                yf3.c(go0Var, gx.e, nf1VarD2);
                yf3.c(go0Var, gx.d, yy1VarL2);
                yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode2));
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM2);
                kwVar2 = kwVar;
                kwVar2.e(hm.a, go0Var, 54);
                go0Var.p(true);
            }
            final long j9 = j2;
            b62VarR = go0Var.r();
            if (b62VarR == null) {
                final r5 r5Var3 = r5Var2;
                final kw kwVar3 = kwVar2;
                final long j10 = j5;
                final float f7 = f4;
                final float f8 = f5;
                final long j11 = j7;
                final jw1 jw1Var3 = jw1Var2;
                b62VarR.d = new mn0() { // from class: vp1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.mn0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iN = pp0.N(i2 | 1);
                        ci0.h(uh1Var, kr1Var, j9, j10, f7, j11, f8, jw1Var3, r5Var3, kwVar3, (px) obj, iN, i3);
                        return a83.a;
                    }
                };
                return;
            }
            return;
        }
        i8 |= 12582912;
        i9 = i19;
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        if (go0Var.O(i12 & 1, (i12 & 306783379) == 306783378)) {
        }
        final long j92 = j2;
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(String str, in0 in0Var, boolean z2, px pxVar, int i2) {
        boolean z3 = z2;
        str.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(1496453591);
        int i3 = 2;
        int i4 = i2 | (go0Var.f(str) ? 4 : 2) | (go0Var.h(in0Var) ? 32 : 16) | (go0Var.g(z3) ? 256 : 128);
        if (go0Var.O(i4 & 1, (i4 & 147) != 146)) {
            av avVarA = yu.a(new xf(12.0f, new s(i3)), sn.u, go0Var, 6);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, rh1.a);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, avVarA);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            tp0.b(str, in0Var, null, rg3.P(me.dartcv.nuke.R.string.home_settings_search_placeholder, go0Var), eu.b, null, false, 0, 0, false, false, null, null, null, go0Var, (i4 & 14) | 24576 | (i4 & 112), 0, 16356);
            z3 = z2;
            if (z3) {
                go0Var.W(1594666828);
                o(null, null, go0Var, 0);
                go0Var.p(false);
            } else {
                go0Var.W(1594706229);
                go0Var.p(false);
            }
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new rh(str, in0Var, z3, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(List list, mn0 mn0Var, rs2 rs2Var, mn0 mn0Var2, String str, px pxVar, int i2) {
        String str2;
        list.getClass();
        mn0Var.getClass();
        rs2Var.getClass();
        mn0Var2.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1054270619);
        int i3 = (go0Var.f(list) ? 4 : 2) | i2 | (go0Var.h(mn0Var) ? 32 : 16) | (go0Var.f(rs2Var) ? 256 : 128) | (go0Var.h(mn0Var2) ? 2048 : 1024) | (go0Var.f(str) ? 16384 : 8192);
        if (go0Var.O(i3 & 1, (i3 & 9363) != 9362)) {
            eu.n(null, str, xe1.i0(258950630, new v1(list, rs2Var, mn0Var2, mn0Var), go0Var), go0Var, ((i3 >> 9) & 112) | 384, 1);
            str2 = str;
        } else {
            str2 = str;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ze(list, mn0Var, rs2Var, mn0Var2, str2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(gw gwVar, rs2 rs2Var, mn0 mn0Var, in0 in0Var, px pxVar, int i2) {
        String strP;
        Object x92Var;
        boolean zBooleanValue;
        boolean z2;
        boolean z3;
        kw kwVar;
        String strP2;
        ju juVar;
        xm0 xm0Var;
        boolean z4;
        kw kwVarI0;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1411334829);
        int i3 = (go0Var.h(in0Var) ? 2048 : 1024) | i2 | (go0Var.h(gwVar) ? 4 : 2) | (go0Var.f(rs2Var) ? 32 : 16) | (go0Var.h(mn0Var) ? 256 : 128);
        if (go0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) go0Var.j(r7.b);
            String strP3 = rg3.P(gwVar.m(), go0Var);
            Integer numK = gwVar.k();
            if (numK == null) {
                go0Var.W(-1640689969);
                go0Var.p(false);
                strP = null;
            } else {
                go0Var.W(-1640689968);
                strP = rg3.P(numK.intValue(), go0Var);
                go0Var.p(false);
            }
            String str = (strP == null || pv2.s0(strP)) ? null : strP;
            pp1 pp1Var = pp1.a;
            boolean zE = pp1.e(gwVar.d());
            zt0 zt0Var = zt0.j;
            zt0 zt0Var2 = zt0.h;
            zt0 zt0Var3 = (zE || !gwVar.b.isEmpty()) ? zt0Var : !gwVar.c ? zt0.i : zt0Var2;
            final boolean z5 = zt0Var3 != zt0Var2;
            final boolean z6 = zt0Var3 != zt0Var;
            if (gwVar.l()) {
                zBooleanValue = true;
            } else {
                try {
                    x92Var = Boolean.valueOf(!t11.l(gwVar.getClass().getMethod("onClick", View.class).getDeclaringClass(), gw.class));
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Object obj = Boolean.FALSE;
                if (x92Var instanceof x92) {
                    x92Var = obj;
                }
                zBooleanValue = ((Boolean) x92Var).booleanValue();
            }
            boolean zF = go0Var.f(gwVar.d());
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (zF || objL == ebVar) {
                objL = new kx1(0);
                go0Var.f0(objL);
            }
            kx1 kx1Var = (kx1) objL;
            int i4 = i3 & 14;
            boolean zD = go0Var.d(kx1Var.g()) | (i4 == 4 || go0Var.f(gwVar)) | go0Var.f(context);
            Object objL2 = go0Var.L();
            if (zD || objL2 == ebVar) {
                String strJ = gwVar.j(context);
                objL2 = (strJ == null || pv2.s0(strJ)) ? null : strJ;
                go0Var.f0(objL2);
            }
            String strP4 = (String) objL2;
            if (zBooleanValue) {
                go0Var.W(-1640094489);
                if (strP4 == null) {
                    go0Var.W(916925795);
                    strP4 = rg3.P(me.dartcv.nuke.R.string.home_settings_configure, go0Var);
                    z2 = false;
                } else {
                    z2 = false;
                    go0Var.W(916925051);
                }
                go0Var.p(z2);
                go0Var.p(z2);
            } else {
                z2 = false;
                go0Var.W(-1640012773);
                go0Var.p(false);
                strP4 = null;
            }
            if (z5) {
                go0Var.W(-1639921168);
                z3 = zBooleanValue;
                kw kwVarI02 = xe1.i0(-1415363503, new bt0(zt0Var3), go0Var);
                go0Var.p(z2);
                kwVar = kwVarI02;
            } else {
                z3 = zBooleanValue;
                go0Var.W(-1639854053);
                go0Var.p(z2);
                kwVar = null;
            }
            if (gwVar instanceof gx2) {
                go0Var.W(-1639661760);
                Boolean bool = (Boolean) rs2Var.get(gwVar.d());
                final boolean zBooleanValue2 = bool != null ? bool.booleanValue() : N((gx2) gwVar);
                boolean zG = (i4 == 4 || go0Var.h(gwVar)) | go0Var.g(zBooleanValue2) | ((i3 & 896) == 256);
                Object objL3 = go0Var.L();
                if (zG || objL3 == ebVar) {
                    objL3 = new dt0(0, gwVar, mn0Var, zBooleanValue2);
                    go0Var.f0(objL3);
                }
                final in0 in0Var2 = (in0) objL3;
                if (z3) {
                    go0Var.W(-1638327024);
                    boolean zF2 = ((i3 & 7168) == 2048) | go0Var.f(kx1Var);
                    Object objL4 = go0Var.L();
                    if (zF2 || objL4 == ebVar) {
                        objL4 = new r1(18, in0Var, kx1Var);
                        go0Var.f0(objL4);
                    }
                    xm0Var = (xm0) objL4;
                    z4 = false;
                    go0Var.p(false);
                } else {
                    go0Var.W(-1638197444);
                    boolean zF3 = go0Var.f(in0Var2) | go0Var.g(zBooleanValue2);
                    Object objL5 = go0Var.L();
                    if (zF3 || objL5 == ebVar) {
                        objL5 = new qh(3, in0Var2, zBooleanValue2);
                        go0Var.f0(objL5);
                    }
                    xm0Var = (xm0) objL5;
                    z4 = false;
                    go0Var.p(false);
                }
                if (z3) {
                    go0Var.W(-1636290479);
                    kwVarI0 = xe1.i0(918261136, new mn0() { // from class: gt0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj2, Object obj3) {
                            px pxVar2 = (px) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            go0 go0Var2 = (go0) pxVar2;
                            if (go0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                rh1 rh1Var = rh1.a;
                                uh1 uh1VarG = fg1.G(rh1Var, 0.0f, 0.0f, 14.0f, 0.0f, 11);
                                ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var2, 48);
                                int iHashCode = Long.hashCode(go0Var2.T);
                                yy1 yy1VarL = go0Var2.l();
                                uh1 uh1VarM = tl.M(go0Var2, uh1VarG);
                                hx.c.getClass();
                                jy jyVar = gx.b;
                                go0Var2.Z();
                                if (go0Var2.S) {
                                    go0Var2.k(jyVar);
                                } else {
                                    go0Var2.i0();
                                }
                                yf3.c(go0Var2, gx.e, ob2VarA);
                                yf3.c(go0Var2, gx.d, yy1VarL);
                                yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
                                yf3.b(go0Var2, gx.g);
                                yf3.c(go0Var2, gx.c, uh1VarM);
                                uh1 uh1VarO = te.O(rh1Var, 28.0f);
                                long j2 = ((lp1) go0Var2.j(ur1.a)).f;
                                boolean z7 = z6;
                                op0.c(uh1VarO, 1.0f, ju.b(z7 ? 0.18f : 0.1f, j2), go0Var2, 54);
                                rp0.O(go0Var2, te.q0(rh1Var, 12.0f));
                                sp0.i(zBooleanValue2, in0Var2, null, z7, 0, go0Var2, 0, 52);
                                go0Var2.p(true);
                            } else {
                                go0Var2.R();
                            }
                            return a83.a;
                        }
                    }, go0Var);
                    go0Var.p(z4);
                } else {
                    go0Var.W(-1635424277);
                    go0Var.p(z4);
                    kwVarI0 = null;
                }
                final boolean z7 = zBooleanValue2;
                final zt0 zt0Var4 = zt0Var3;
                final boolean z8 = z6;
                final String str2 = strP4;
                sp0.g(strP3, null, str, kwVar, xe1.i0(-1996044068, new mn0() { // from class: ht0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.mn0
                    public final Object g(Object obj2, Object obj3) {
                        px pxVar2 = (px) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        go0 go0Var2 = (go0) pxVar2;
                        if (go0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var2, 48);
                            int iHashCode = Long.hashCode(go0Var2.T);
                            yy1 yy1VarL = go0Var2.l();
                            rh1 rh1Var = rh1.a;
                            uh1 uh1VarM = tl.M(go0Var2, rh1Var);
                            hx.c.getClass();
                            jy jyVar = gx.b;
                            go0Var2.Z();
                            if (go0Var2.S) {
                                go0Var2.k(jyVar);
                            } else {
                                go0Var2.i0();
                            }
                            yf3.c(go0Var2, gx.e, ob2VarA);
                            yf3.c(go0Var2, gx.d, yy1VarL);
                            yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
                            yf3.b(go0Var2, gx.g);
                            yf3.c(go0Var2, gx.c, uh1VarM);
                            if (z5) {
                                go0Var2.W(-1547828369);
                                s11.m(zt0Var4, go0Var2, 0);
                                rp0.O(go0Var2, te.q0(rh1Var, 8.0f));
                                go0Var2.p(false);
                            } else {
                                go0Var2.W(-1547679414);
                                go0Var2.p(false);
                            }
                            String str3 = str2;
                            boolean z9 = z8;
                            if (str3 != null) {
                                go0Var2.W(-1547597140);
                                uh1 uh1VarR0 = te.r0(rh1Var, Float.NaN, 96.0f);
                                tu2 tu2Var = ur1.a;
                                eu.a(str3, uh1VarR0, new m13(ju.b(z9 ? 0.86f : 0.42f, ((lp1) go0Var2.j(tu2Var)).f), rg3.D(12), im0.k, 0L, 0, 0L, null, null, 16777208), 2, false, 1, 0, go0Var2, 1597488, 936);
                                rp0.O(go0Var2, te.q0(rh1Var, 4.0f));
                                qp0.g(null, ju.b(z9 ? 0.72f : 0.34f, ((lp1) go0Var2.j(tu2Var)).g), go0Var2, 0);
                                go0Var2.p(false);
                            } else {
                                go0Var2.W(-1546632327);
                                sp0.i(z7, in0Var2, null, z9, 0, go0Var2, 0, 52);
                                go0Var2 = go0Var2;
                                go0Var2.p(false);
                            }
                            go0Var2.p(true);
                        } else {
                            go0Var2.R();
                        }
                        return a83.a;
                    }
                }, go0Var), kwVarI0, z8, xm0Var, null, go0Var, 24576, 258);
                go0Var.p(z4);
            } else {
                boolean z9 = z6;
                String str3 = str;
                zt0 zt0Var5 = zt0Var3;
                kw kwVar2 = kwVar;
                go0Var.W(-1635315374);
                if (z5) {
                    go0Var.W(917084378);
                    strP2 = s11.P(zt0Var5, go0Var);
                    go0Var.p(false);
                } else {
                    go0Var.W(-1635142550);
                    go0Var.p(false);
                    strP2 = null;
                }
                if (z5) {
                    go0Var.W(917086874);
                    long jA = s11.A(zt0Var5);
                    go0Var.p(false);
                    juVar = new ju(jA);
                } else {
                    go0Var.W(-1635065174);
                    go0Var.p(false);
                    juVar = null;
                }
                boolean z10 = (i3 & 7168) == 2048;
                Object objL6 = go0Var.L();
                if (z10 || objL6 == ebVar) {
                    objL6 = new ta(9, in0Var);
                    go0Var.f0(objL6);
                }
                qp0.h(strP3, (xm0) objL6, null, str3, kwVar2, strP2, juVar, z9, null, go0Var, 0, 260);
                go0Var.p(false);
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new v1(gwVar, rs2Var, mn0Var, in0Var, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(sx0 sx0Var, uh1 uh1Var, long j2, px pxVar, int i2, int i3) {
        long j3;
        int i4;
        uh1 uh1Var2;
        b62 b62VarR;
        uh1 uh1Var3;
        sx0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-2001813114);
        int i5 = i2 | (go0Var.f(sx0Var) ? 4 : 2) | 48;
        if ((i3 & 4) == 0) {
            j3 = j2;
            int i6 = go0Var.e(j3) ? 256 : 128;
            i4 = i5 | i6;
            if (go0Var.O(i4 & 1, (i4 & 147) == 146)) {
                go0Var.R();
                uh1Var2 = uh1Var;
            } else {
                go0Var.T();
                int i7 = i2 & 1;
                rh1 rh1Var = rh1.a;
                if (i7 == 0 || go0Var.y()) {
                    if ((i3 & 4) != 0) {
                        j3 = ((lp1) go0Var.j(ur1.a)).g;
                        i4 &= -897;
                    }
                    uh1Var3 = rh1Var;
                } else {
                    go0Var.R();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    uh1Var3 = uh1Var;
                }
                go0Var.q();
                uh1 uh1VarN = gf1.n(z(te.g0(uh1Var3, 34.0f), gb2.a(11.0f)), ju.b(0.12f, j3), sp0.h);
                nf1 nf1VarD = dm.d(sn.n, false);
                int iHashCode = Long.hashCode(go0Var.T);
                yy1 yy1VarL = go0Var.l();
                uh1 uh1VarM = tl.M(go0Var, uh1VarN);
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
                yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM);
                fx0.a(sx0Var, te.g0(rh1Var, 18.0f), j3, go0Var, ((i4 << 3) & 7168) | (i4 & 14) | 432);
                go0Var.p(true);
                uh1Var2 = uh1Var3;
            }
            long j4 = j3;
            b62VarR = go0Var.r();
            if (b62VarR == null) {
                b62VarR.d = new et0(sx0Var, uh1Var2, j4, i2, i3);
                return;
            }
            return;
        }
        j3 = j2;
        i4 = i5 | i6;
        if (go0Var.O(i4 & 1, (i4 & 147) == 146)) {
        }
        long j42 = j3;
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(String str, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(705214894);
        int i3 = (go0Var.f(str) ? 4 : 2) | i2;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            uh1 uh1VarZ = z(rh1.a, gb2.a(999.0f));
            tu2 tu2Var = ur1.a;
            uh1 uh1VarD = fg1.D(gf1.n(uh1VarZ, ju.b(0.13f, ((lp1) go0Var.j(tu2Var)).g), sp0.h), 9.0f, 4.0f);
            nf1 nf1VarD = dm.d(sn.n, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarD);
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
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            eu.a(str, null, new m13(((lp1) go0Var.j(tu2Var)).g, rg3.D(11), im0.l, 0L, 0, 0L, null, null, 16777208), 2, false, 1, 0, go0Var, (i3 & 14) | 1597440, 938);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i2, 10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(String str, List list, mn0 mn0Var, px pxVar, int i2) {
        list.getClass();
        mn0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1402237935);
        int i3 = (go0Var.f(str) ? 4 : 2) | i2 | (go0Var.f(list) ? 32 : 16) | (go0Var.h(mn0Var) ? 256 : 128);
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            eu.n(null, str, xe1.i0(-2092900688, new af(8, list, mn0Var), go0Var), go0Var, ((i3 << 3) & 112) | 384, 1);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new tt0(str, list, mn0Var, i2, 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(String str, String str2, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-961555668);
        int i3 = i2 | 402;
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            go0Var.T();
            if ((i2 & 1) == 0 || go0Var.y()) {
                pp1 pp1Var = pp1.a;
                x83 x83Var = pp1.c;
                if (x83Var == null) {
                    t11.S("mUser");
                    throw null;
                }
                str = x83Var.s();
                x83 x83Var2 = pp1.c;
                if (x83Var2 == null) {
                    t11.S("mUser");
                    throw null;
                }
                str2 = x83Var2.r();
            } else {
                go0Var.R();
            }
            go0Var.q();
            go0Var.W(-637022177);
            String strP = rg3.P(me.dartcv.nuke.R.string.home_settings_user_regular, go0Var);
            go0Var.p(false);
            eu.n(null, null, xe1.i0(162208045, new tt0(str, str2, strP, 7), go0Var), go0Var, 384, 3);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ct0(i2, str, str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p(kw kwVar, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1761377134);
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            uh1 uh1VarN = gf1.n(te.g, ((lp1) go0Var.j(ur1.a)).b, sp0.h);
            nf1 nf1VarD = dm.d(sn.j, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarN);
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
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            kwVar.g(go0Var, 6);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new o0(kwVar, i2, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(String str, uh1 uh1Var, px pxVar, int i2) {
        uh1 uh1Var2;
        str.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-169013635);
        int i3 = (go0Var.f(str) ? 4 : 2) | i2 | 48;
        int i4 = 1;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            uh1 uh1VarG = fg1.G(te.e, 0.0f, 4.0f, 0.0f, 2.0f, 5);
            nf1 nf1VarD = dm.d(sn.n, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarG);
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
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            eu.a(str, null, new m13(ju.b(0.74f, ((lp1) go0Var.j(ur1.a)).f), rg3.D(12), im0.k, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, i3 & 14, 1018);
            go0Var.p(true);
            uh1Var2 = rh1.a;
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new z1(str, uh1Var2, i2, i4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t9 r(String str, m13 m13Var, long j2, e70 e70Var, xl0 xl0Var, int i2, int i3) {
        be0 be0Var = be0.h;
        return new t9(new x9(str, m13Var, be0Var, be0Var, xl0Var, e70Var), i2, 1, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void s(hh1 hh1Var, oy0 oy0Var, qv1 qv1Var, ny0 ny0Var, dk dkVar, long j2) {
        float fIntBitsToFloat;
        lk1 lk1Var = (lk1) dkVar.j;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (oy0Var.c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (oy0Var.c & 4294967295L));
        if (y(oy0Var)) {
            dkVar.i = 0;
            lk1Var.d();
        }
        if (!t(oy0Var) && !y(oy0Var)) {
            if (lk1Var.b == 3) {
                int i2 = dkVar.i;
                dkVar.i = i2 + 1;
                lk1Var.n(i2, oy0Var);
            } else {
                lk1Var.a(oy0Var);
            }
            if (dkVar.i == 3) {
                dkVar.i = 0;
            }
            Object[] objArr = lk1Var.a;
            int i3 = lk1Var.b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((oy0) objArr[i4]).c >> 32));
            }
            int i5 = lk1Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i5;
            Object[] objArr2 = lk1Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i6 = 0; i6 < i5; i6++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((oy0) objArr2[i6]).c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / lk1Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (qv1Var != null) {
            int i7 = ny0Var.a;
            if (i7 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i7 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = qv1Var == qv1.i ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((m60) hh1Var.i).a(oy0Var.b, rs1.e(jFloatToRawIntBits, j2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean t(oy0 oy0Var) {
        return oy0Var.h && !oy0Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int u(long j2, long[] jArr) {
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            long j3 = jArr[i3];
            if (j2 > j3) {
                i2 = i3 + 1;
            } else {
                if (j2 >= j3) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean v(Object obj) {
        if (obj instanceof is2) {
            is2 is2Var = (is2) obj;
            if (is2Var.d() == gd3.C || is2Var.d() == sn.T || is2Var.d() == sn.P) {
                Object value = is2Var.getValue();
                if (value == null) {
                    return true;
                }
                return v(value);
            }
        } else if (!(obj instanceof un0) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (u[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String w(String str, int i2, int i3, String str2, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        int i6 = i3;
        boolean z2 = (i4 & 8) == 0;
        boolean z3 = (i4 & 16) == 0;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = (i4 & 64) == 0;
        str.getClass();
        return x(str, i5, i6, str2, z2, z3, z4, z5, 128);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String x(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z6 = (i4 & 8) != 0 ? false : z2;
        boolean z7 = (i4 & 16) != 0 ? false : z3;
        boolean z8 = (i4 & 64) == 0 ? z5 : false;
        str.getClass();
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || pv2.i0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z6 || (z7 && !O(str, iCharCount, length)))) || (iCodePointAt == 43 && z4)))) {
                fn fnVar = new fn();
                fnVar.K(str, i5, iCharCount);
                fn fnVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            fnVar.J("+");
                        } else if (iCodePointAt2 == 43 && z4) {
                            fnVar.J(z6 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z8) || pv2.i0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z6 || (z7 && !O(str, iCharCount, length)))))) {
                            if (fnVar2 == null) {
                                fnVar2 = new fn();
                            }
                            fnVar2.L(iCodePointAt2);
                            while (!fnVar2.k()) {
                                byte b2 = fnVar2.readByte();
                                fnVar.E(37);
                                char[] cArr = z;
                                fnVar.E(cArr[((b2 & 255) >> 4) & 15]);
                                fnVar.E(cArr[b2 & 15]);
                            }
                        } else {
                            fnVar.L(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i6 = 128;
                }
                return fnVar.u();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean y(oy0 oy0Var) {
        return !oy0Var.h && oy0Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 z(uh1 uh1Var, eq2 eq2Var) {
        return te.N(uh1Var, 0.0f, 0.0f, 0.0f, eq2Var, 518143);
    }
}
