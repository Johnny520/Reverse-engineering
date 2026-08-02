package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Trace;
import com.dokar.quickjs.binding.JsObject;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.IDN;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.UByteArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xe1 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final hh1 e = new hh1(19, "CLOSED");
    public static final o62 f = new o62(0.0f, 0.0f, 10.0f, 10.0f);
    public static final Type[] g = new Type[0];
    public static boolean h = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type A(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return A(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return A(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final k21 B(a20 a20Var) {
        k21 k21Var = (k21) a20Var.o(sn.K);
        if (k21Var != null) {
            return k21Var;
        }
        c80.u("Current context doesn't contain Job in it: ", a20Var);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type C(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbN = vi0.n(i, "Index ", " not in range [0,");
        sbN.append(actualTypeArguments.length);
        sbN.append(") for ");
        sbN.append(parameterizedType);
        throw new IllegalArgumentException(sbN.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class D(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) D(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return D(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        String name = type.getClass().getName();
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type E(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return j0(type, cls, A(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean F(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return F(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            um2.j("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (F(type2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int G(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return xu.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ca0 H(k21 k21Var, boolean z, n21 n21Var) {
        if (k21Var instanceof r21) {
            return ((r21) k21Var).R(z, n21Var);
        }
        return k21Var.B(n21Var.k(), z, new e2(1, n21Var, n21.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean I(a20 a20Var) {
        k21 k21Var = (k21) a20Var.o(sn.K);
        if (k21Var != null) {
            return k21Var.b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean J(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean K(int i, Object obj) {
        if (obj instanceof un0) {
            if ((obj instanceof wn0 ? ((wn0) obj).c() : obj instanceof xm0 ? 0 : obj instanceof in0 ? 1 : obj instanceof mn0 ? 2 : obj instanceof nn0 ? 3 : obj instanceof on0 ? 4 : obj instanceof pn0 ? 5 : obj instanceof qn0 ? 6 : obj instanceof rn0 ? 7 : obj instanceof sn0 ? 8 : obj instanceof tn0 ? 9 : obj instanceof ym0 ? 10 : obj instanceof zm0 ? 11 : obj instanceof bn0 ? 13 : obj instanceof cn0 ? 14 : obj instanceof dn0 ? 15 : obj instanceof en0 ? 16 : obj instanceof fn0 ? 17 : obj instanceof gn0 ? 18 : obj instanceof hn0 ? 19 : obj instanceof jn0 ? 20 : obj instanceof kn0 ? 21 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean L(qn2 qn2Var) {
        zn1 zn1VarD = qn2Var.d();
        rk1 rk1Var = qn2Var.d.h;
        return (zn1VarD != null ? zn1VarD.a1() : false) || rk1Var.c(vn2.q) || rk1Var.c(vn2.p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean M(qn2 qn2Var) {
        if (!L(qn2Var)) {
            ln2 ln2Var = qn2Var.d;
            if (ln2Var.j) {
                return true;
            }
            rk1 rk1Var = ln2Var.h;
            Object[] objArr = rk1Var.b;
            Object[] objArr2 = rk1Var.c;
            long[] jArr = rk1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((yn2) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean N(long j) {
        return (j & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean O(long j) {
        return (j & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean P(float f2, float f3, y9 y9Var) {
        float f4 = f2 - 0.005f;
        float f5 = f3 - 0.005f;
        float f6 = f2 + 0.005f;
        float f7 = f3 + 0.005f;
        y9 y9VarA = aa.a();
        if (Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) {
            aa.c("Invalid rectangle, make sure no value is NaN");
        }
        if (y9VarA.b == null) {
            y9VarA.b = new RectF();
        }
        RectF rectF = y9VarA.b;
        rectF.getClass();
        rectF.set(f4, f5, f6, f7);
        Path path = y9VarA.a;
        RectF rectF2 = y9VarA.b;
        rectF2.getClass();
        path.addRect(rectF2, aa.b(ux1.h));
        y9 y9VarA2 = aa.a();
        y9VarA2.f(y9Var, y9VarA, 1);
        boolean zIsEmpty = y9VarA2.a.isEmpty();
        y9VarA2.g();
        y9VarA.g();
        return !zIsEmpty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean Q(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean R(float f2, float f3, float f4, float f5, long j) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f7 * f7) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 S(r81 r81Var, lm lmVar, qv1 qv1Var) {
        return new q71(r81Var, lmVar, qv1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float T(int i) {
        float f2 = i / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int U(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static IllegalArgumentException V(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a20 W(y10 y10Var, z10 z10Var) {
        z10Var.getClass();
        return t11.l(y10Var.getKey(), z10Var) ? zd0.h : y10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String X(String str, String str2) {
        if (str.length() <= 0) {
            s.c(vi0.i("Network origin host must not be empty: ", str2));
            return null;
        }
        if (!pv2.i0(str, ':')) {
            try {
                str = IDN.toASCII(str, 2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(vi0.i("Invalid network origin host: ", str2), e2);
            }
        }
        try {
            xw0 xw0Var = new xw0();
            xw0Var.g("https");
            str.getClass();
            xw0Var.d(str);
            String lowerCase = xw0Var.b().d.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.length() > 0) {
                return lowerCase;
            }
            s.c(vi0.i("Network origin host must not be empty: ", str2));
            return null;
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException(vi0.i("Invalid network origin host: ", str2), e3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String Y(String str) {
        str.getClass();
        if (pv2.s0(str)) {
            s.j("Script path must not be blank.");
            return null;
        }
        String strReplace = str.replace('\\', '/');
        strReplace.getClass();
        if (pv2.E0(strReplace, '/')) {
            s.c("Script path must be relative: ".concat(str));
            return null;
        }
        if (oi2.i.b(strReplace)) {
            s.c("Script path must be relative: ".concat(str));
            return null;
        }
        List listC0 = pv2.C0(strReplace, new char[]{'/'});
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listC0) {
            String str2 = (String) obj;
            if (str2.length() != 0 && !str2.equals(".")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            s.c("Script path must not be empty: ".concat(str));
            return null;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (t11.l((String) it.next(), "..")) {
                    s.c("Script path must not escape the script root: ".concat(str));
                    return null;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (String str3 : arrayList) {
                if (pv2.i0(str3, (char) 0) || pv2.i0(str3, ':')) {
                    s.c("Script path contains unsupported characters: ".concat(str));
                    return null;
                }
            }
        }
        return du.u0(arrayList, "/", null, null, null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 Z(uh1 uh1Var, lw1 lw1Var, cl clVar) {
        return uh1Var.c(new mw1(lw1Var, clVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(boolean z, mn0 mn0Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-642000585);
        int i2 = 2;
        int i3 = (go0Var.g(z) ? 4 : 2) | i | (go0Var.h(mn0Var) ? 32 : 16);
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objA = cc1.a(go0Var);
            if (objA == null) {
                go0Var.W(1512740606);
                objA = dc1.a(go0Var);
            } else {
                go0Var.W(1512737723);
            }
            go0Var.p(false);
            if (objA == null) {
                s.l("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = go0Var.f(objA);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (zF || objL == ebVar) {
                gm1 gm1Var = objA instanceof gm1 ? (gm1) objA : null;
                fm1 navigationEventDispatcher = gm1Var != null ? gm1Var.getNavigationEventDispatcher() : null;
                pt1 pt1Var = objA instanceof pt1 ? (pt1) objA : null;
                objL = new gj(navigationEventDispatcher, pt1Var != null ? pt1Var.getOnBackPressedDispatcher() : null);
                go0Var.f0(objL);
            }
            gj gjVar = (gj) objL;
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                objL2 = eu.C(go0Var);
                go0Var.f0(objL2);
            }
            j20 j20Var = (j20) objL2;
            long j = go0Var.T;
            boolean zF2 = go0Var.f(gjVar) | go0Var.e(j);
            Object objL3 = go0Var.L();
            if (zF2 || objL3 == ebVar) {
                objL3 = new yw(j20Var, new m22(j, objA));
                go0Var.f0(objL3);
            }
            yw ywVar = (yw) objL3;
            go0Var.W(-348514256);
            boolean zH = go0Var.h(ywVar) | go0Var.h(mn0Var);
            Object objL4 = go0Var.L();
            if (zH || objL4 == ebVar) {
                objL4 = new r1(26, ywVar, mn0Var);
                go0Var.f0(objL4);
            }
            eu.r((xm0) objL4, go0Var);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean zH2 = (i4 == 4) | go0Var.h(ywVar);
            Object objL5 = go0Var.L();
            if (zH2 || objL5 == ebVar) {
                objL5 = new ij(ywVar, z, i2);
                go0Var.f0(objL5);
            }
            eu.h(boolValueOf, ywVar, null, (in0) objL5, go0Var, i4);
            boolean zH3 = go0Var.h(gjVar) | go0Var.h(ywVar);
            Object objL6 = go0Var.L();
            if (zH3 || objL6 == ebVar) {
                objL6 = new d2(27, gjVar, ywVar);
                go0Var.f0(objL6);
            }
            eu.d(gjVar, ywVar, (in0) objL6, go0Var);
            go0Var.p(false);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new m10(z, mn0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static IllegalArgumentException a0(Method method, int i, String str, Object... objArr) {
        return V(method, null, str + " (" + yz1.b.l(method, i) + ")", objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final qb2 b(u21 u21Var, String str) {
        u21Var.getClass();
        str.getClass();
        return new qb2(str, u21Var.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static IllegalArgumentException b0(Method method, Exception exc, int i, String str, Object... objArr) {
        return V(method, exc, str + " (" + yz1.b.l(method, i) + ")", objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(l4 l4Var, qn2 qn2Var) {
        ln2 ln2Var = qn2Var.d;
        rk1 rk1Var = ln2Var.h;
        Object objG = ln2Var.h.g(vn2.z);
        if (objG == null) {
            objG = null;
        }
        if (rg3.j(qn2Var)) {
            Object objG2 = rk1Var.g(kn2.y);
            if (objG2 == null) {
                objG2 = null;
            }
            q3 q3Var = (q3) objG2;
            if (q3Var != null) {
                l4Var.a(new f4(null, R.id.accessibilityActionPageUp, q3Var.a, null));
            }
            Object objG3 = rk1Var.g(kn2.A);
            if (objG3 == null) {
                objG3 = null;
            }
            q3 q3Var2 = (q3) objG3;
            if (q3Var2 != null) {
                l4Var.a(new f4(null, R.id.accessibilityActionPageDown, q3Var2.a, null));
            }
            Object objG4 = rk1Var.g(kn2.z);
            if (objG4 == null) {
                objG4 = null;
            }
            q3 q3Var3 = (q3) objG4;
            if (q3Var3 != null) {
                l4Var.a(new f4(null, R.id.accessibilityActionPageLeft, q3Var3.a, null));
            }
            Object objG5 = rk1Var.g(kn2.B);
            if (objG5 == null) {
                objG5 = null;
            }
            q3 q3Var4 = (q3) objG5;
            if (q3Var4 != null) {
                l4Var.a(new f4(null, R.id.accessibilityActionPageRight, q3Var4.a, null));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Type inference failed for r1v44. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0222, code lost:
    
        r14 = java.util.Locale.US;
        r14.getClass();
        r14 = r13.toLowerCase(r14);
        r14.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0236, code lost:
    
        if (defpackage.mw0.g.contains(r14) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0238, code lost:
    
        r7 = java.lang.Math.addExact(r7, defpackage.mw0.c(r10) + defpackage.mw0.c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0247, code lost:
    
        if (r7 > 65536) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0249, code lost:
    
        r1.a(r13, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0250, code lost:
    
        defpackage.c80.p("INVALID_ARGUMENT", "Invalid HTTP header.", 0, null, r0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025f, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0260, code lost:
    
        defpackage.c80.p("QUOTA_EXCEEDED", "HTTP request headers exceed the limit.", 0, null, null, 28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026c, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x026d, code lost:
    
        defpackage.c80.p("INVALID_ARGUMENT", defpackage.vi0.j("The HTTP header '", r13, "' is computed by the client and cannot be set manually."), 0, null, null, 28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027f, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01fa, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ff, code lost:
    
        if (r14 >= r10.length()) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0201, code lost:
    
        r15 = r10.charAt(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0205, code lost:
    
        if (r15 == r2) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0209, code lost:
    
        if (r15 == '\n') goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020b, code lost:
    
        if (r15 == 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020d, code lost:
    
        r14 = r14 + 1;
        r2 = '\r';
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0212, code lost:
    
        defpackage.c80.p("INVALID_ARGUMENT", "Invalid HTTP header value.", 0, null, null, 28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0221, code lost:
    
        return r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r7v15, types: [pw0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tw0 c0(Object obj, bf2 bf2Var, boolean z) {
        tw0 tw0Var;
        ArrayList<ow1> arrayList;
        js0 js0VarB;
        Object ow0Var;
        x62 x62Var;
        bf2Var.getClass();
        JsObject jsObject = obj == null ? new JsObject(ce0.h) : sp0.e0("options", obj);
        Set setB0 = np2.b0(jsObject.keySet(), z ? mw0.f : mw0.e);
        if (!setB0.isEmpty()) {
            c80.p("INVALID_ARGUMENT", vi0.j("Unknown HTTP options: ", du.u0(du.z0(setB0), null, null, null, null, 63), "."), 0, null, null, 28);
            return null;
        }
        Object obj2 = jsObject.get((Object) "method");
        String strG0 = obj2 == null ? null : sp0.g0("method", obj2);
        if (strG0 == null) {
            strG0 = "GET";
        }
        String str = strG0;
        if (!mw0.a.contains(str)) {
            c80.p("INVALID_ARGUMENT", "Unsupported HTTP method.", 0, null, null, 28);
            return null;
        }
        Object obj3 = jsObject.get((Object) "timeoutMs");
        Long lValueOf = obj3 == null ? null : Long.valueOf(sp0.d0(obj3, "timeoutMs", 1L, 30000L));
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 30000L;
        long jLongValue2 = z ? 67108864L : 16777216L;
        String str2 = z ? "maxBytes" : "maxResponseBytes";
        Object obj4 = jsObject.get((Object) str2);
        Long lValueOf2 = obj4 == null ? null : Long.valueOf(sp0.d0(obj4, str2, 1L, jLongValue2));
        if (lValueOf2 != null) {
            jLongValue2 = lValueOf2.longValue();
        }
        long j = jLongValue2;
        Object obj5 = jsObject.get((Object) "headers");
        if (obj5 == null) {
            js0VarB = new js0((String[]) new ArrayList(20).toArray(new String[0]));
            tw0Var = null;
        } else {
            if (obj5 instanceof JsObject) {
                Set<Map.Entry<String, Object>> setEntrySet = ((JsObject) obj5).entrySet();
                arrayList = new ArrayList(eu.B(setEntrySet, 10));
                Iterator it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str3 = (String) entry.getKey();
                    arrayList.add(new ow1(str3, sp0.g0("header '" + str3 + "'", entry.getValue())));
                }
                tw0Var = null;
            } else {
                tw0Var = null;
                if (!(obj5 instanceof List)) {
                    c80.p("INVALID_ARGUMENT", "headers must be an object or an array of pairs.", 0, null, null, 28);
                    return null;
                }
                Iterable iterable = (Iterable) obj5;
                arrayList = new ArrayList(eu.B(iterable, 10));
                Iterator it2 = iterable.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        eu.a0();
                        throw null;
                    }
                    List list = next instanceof List ? (List) next : null;
                    if (list == null) {
                        c80.p("INVALID_ARGUMENT", hk1.g(i, "headers[", "] must be a two-item array."), 0, null, null, 28);
                        return null;
                    }
                    Iterator it3 = it2;
                    if (list.size() != 2) {
                        c80.p("INVALID_ARGUMENT", hk1.g(i, "headers[", "] must be a two-item array."), 0, null, null, 28);
                        return null;
                    }
                    arrayList.add(new ow1(sp0.g0("headers[" + i + "][0]", list.get(0)), sp0.g0("headers[" + i + "][1]", list.get(1))));
                    i = i2;
                    it2 = it3;
                }
            }
            if (arrayList.size() > 128) {
                c80.p("QUOTA_EXCEEDED", "HTTP request has too many headers.", 0, null, null, 28);
                return tw0Var;
            }
            ye0 ye0Var = new ye0(1);
            int iAddExact = 0;
            loop1: for (ow1 ow1Var : arrayList) {
                String str4 = (String) ow1Var.h;
                String str5 = (String) ow1Var.i;
                if (str4.length() != 0) {
                    int i3 = 0;
                    while (true) {
                        char c2 = '\r';
                        if (i3 >= str4.length()) {
                            break;
                        }
                        char cCharAt = str4.charAt(i3);
                        if (cCharAt == '\r' || cCharAt == '\n' || cCharAt == 0) {
                            break loop1;
                        }
                        i3++;
                    }
                }
                c80.p("INVALID_ARGUMENT", "Invalid HTTP header name.", 0, null, null, 28);
                return tw0Var;
            }
            js0VarB = ye0Var.b();
        }
        Object obj6 = jsObject.get((Object) "body");
        if (obj6 == null) {
            ow0Var = tw0Var;
        } else if (obj6 instanceof String) {
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = ((String) obj6).getBytes(charset);
            bytes.getClass();
            ow0Var = new nw0(bytes);
        } else if (obj6 instanceof UByteArray) {
            byte[] bArr = ((UByteArray) obj6).h;
            ow0Var = new nw0(Arrays.copyOf(bArr, bArr.length));
        } else if (obj6 instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj6;
            ow0Var = new nw0(Arrays.copyOf(bArr2, bArr2.length));
        } else {
            if (!(obj6 instanceof JsObject)) {
                c80.p("INVALID_ARGUMENT", "body must be a string, Uint8Array, ArrayBuffer, or FileRef.", 0, null, null, 28);
                return tw0Var;
            }
            ow0Var = new ow0(i51.y("body", obj6));
        }
        Object obj7 = jsObject.get((Object) "redirect");
        Object objG0 = obj7 == null ? tw0Var : sp0.g0("redirect", obj7);
        x62.h.getClass();
        if (objG0 == null) {
            objG0 = "follow";
        }
        if (objG0.equals("follow")) {
            x62Var = x62.i;
        } else {
            if (!objG0.equals("error")) {
                c80.p("INVALID_ARGUMENT", "redirect must be follow or error.", 0, null, null, 28);
                return tw0Var;
            }
            x62Var = x62.j;
        }
        x62 x62Var2 = x62Var;
        Object obj8 = jsObject.get((Object) "overwrite");
        ?? ValueOf = obj8 == null ? tw0Var : Boolean.valueOf(sp0.X("overwrite", obj8));
        boolean zBooleanValue = ValueOf != 0 ? ValueOf.booleanValue() : false;
        Object obj9 = jsObject.get((Object) "createParents");
        ?? ValueOf2 = obj9 == null ? tw0Var : Boolean.valueOf(sp0.X("createParents", obj9));
        boolean zBooleanValue2 = ValueOf2 != 0 ? ValueOf2.booleanValue() : false;
        Object obj10 = jsObject.get((Object) "requireSuccess");
        ?? ValueOf3 = obj10 == null ? tw0Var : Boolean.valueOf(sp0.X("requireSuccess", obj10));
        return new tw0(str, js0VarB, ow0Var, jLongValue, x62Var2, j, zBooleanValue, zBooleanValue2, ValueOf3 != 0 ? ValueOf3.booleanValue() : true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float d(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        return f8 < 0.0f ? -f8 : f8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static on1 d0(String str) {
        String lowerCase;
        ow1 ow1Var;
        String strX;
        nn1 nn1Var;
        Integer numValueOf;
        str.getClass();
        if (!str.equals(pv2.I0(str).toString()) || str.length() <= 0) {
            s.j("Network origin must not contain surrounding whitespace.");
            return null;
        }
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (!t11.l(lowerCase, "http") && !t11.l(lowerCase, "https")) {
                s.c("Network origin must use http or https: ".concat(str));
                return null;
            }
            if (uri.getRawUserInfo() != null) {
                s.c("Network origin must not contain user information: ".concat(str));
                return null;
            }
            String rawPath = uri.getRawPath();
            if (rawPath != null && rawPath.length() != 0) {
                s.c("Network origin must not contain a path: ".concat(str));
                return null;
            }
            if (uri.getRawQuery() != null) {
                s.c("Network origin must not contain a query: ".concat(str));
                return null;
            }
            if (uri.getRawFragment() != null) {
                s.c("Network origin must not contain a fragment: ".concat(str));
                return null;
            }
            String rawAuthority = uri.getRawAuthority();
            if (rawAuthority == null) {
                s.j("Network origin must contain a host: ".concat(str));
                return null;
            }
            if (pv2.i0(rawAuthority, '@')) {
                s.c("Network origin must not contain user information: ".concat(str));
                return null;
            }
            if (pv2.E0(rawAuthority, '[')) {
                int iP0 = pv2.p0(rawAuthority, ']', 0, 6);
                if (iP0 <= 1) {
                    s.c("Invalid IPv6 network origin: ".concat(str));
                    return null;
                }
                String strSubstring = rawAuthority.substring(1, iP0);
                String strSubstring2 = rawAuthority.substring(iP0 + 1);
                if (strSubstring2.length() == 0) {
                    numValueOf = null;
                } else {
                    if (!pv2.E0(strSubstring2, ':')) {
                        s.j("Invalid IPv6 network origin: ".concat(str));
                        return null;
                    }
                    numValueOf = Integer.valueOf(e0(strSubstring2.substring(1), str));
                }
                ow1Var = new ow1(strSubstring, numValueOf);
            } else {
                int i = 0;
                for (int i2 = 0; i2 < rawAuthority.length(); i2++) {
                    if (rawAuthority.charAt(i2) == ':') {
                        i++;
                    }
                }
                if (i > 1) {
                    s.c("IPv6 network origins must use brackets: ".concat(str));
                    return null;
                }
                int iU0 = pv2.u0(rawAuthority, ':', 0, 6);
                ow1Var = iU0 < 0 ? new ow1(rawAuthority, null) : new ow1(rawAuthority.substring(0, iU0), Integer.valueOf(e0(rawAuthority.substring(iU0 + 1), str)));
            }
            String str2 = (String) ow1Var.h;
            Integer num = (Integer) ow1Var.i;
            int iIntValue = num != null ? num.intValue() : t11.l(lowerCase, "https") ? 443 : 80;
            if (1 > iIntValue || iIntValue >= 65536) {
                s.c("Network origin port is out of range: ".concat(str));
                return null;
            }
            if (t11.l(str2, "*")) {
                nn1Var = nn1.h;
                strX = "";
            } else if (wv2.d0(str2, "*.", false)) {
                strX = X(pv2.y0(str2, "*."), str);
                if (pv2.i0(strX, ':')) {
                    s.c("Wildcard network origins require a DNS host: ".concat(str));
                    return null;
                }
                nn1Var = nn1.j;
            } else {
                if (pv2.i0(str2, '*')) {
                    s.j("Invalid wildcard network origin: ".concat(str));
                    return null;
                }
                strX = X(str2, str);
                nn1Var = nn1.i;
            }
            return new on1(lowerCase, nn1Var, strX, iIntValue);
        } catch (Exception e2) {
            throw new IllegalArgumentException(vi0.j("Invalid network origin '", str, "'."), e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map e(Object obj) {
        if ((obj instanceof q41) && !(obj instanceof s41)) {
            l0("kotlin.collections.MutableMap", obj);
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            t11.O(e2, xe1.class.getName());
            throw e2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int e0(String str, String str2) {
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            Integer numE0 = wv2.e0(str);
            if (numE0 != null) {
                return numE0.intValue();
            }
            s.j(vi0.i("Invalid network origin port: ", str2));
            return 0;
        }
        s.c(vi0.i("Invalid network origin port: ", str2));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(int i, Object obj) {
        if (obj == null || K(i, obj)) {
            return;
        }
        l0("kotlin.jvm.functions.Function" + i, obj);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a20 f0(y10 y10Var, a20 a20Var) {
        a20Var.getClass();
        return a20Var == zd0.h ? y10Var : (a20) a20Var.r(new ye(24), y10Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int g(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g0(tr2 tr2Var, rf rfVar, int i) {
        while (true) {
            int i2 = tr2Var.v;
            if (i > i2 && i < tr2Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            tr2Var.M();
            if (tr2Var.y(tr2Var.v)) {
                rfVar.o();
            }
            tr2Var.j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String h(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] h0(BufferedInputStream bufferedInputStream, int i) throws IOException {
        if (i <= 0) {
            s.j("maxBytes must be positive.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i2 = bufferedInputStream.read(bArr);
            if (i2 < 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            }
            if (i2 != 0) {
                j += (long) i2;
                if (j > i) {
                    throw new bh2(i);
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final kw i0(int i, un0 un0Var, px pxVar) {
        go0 go0Var = (go0) pxVar;
        Object objL = go0Var.L();
        if (objL == nx.a) {
            objL = new kw(i, true, un0Var);
            go0Var.f0(objL);
        }
        kw kwVar = (kw) objL;
        if (!kwVar.j.equals(un0Var)) {
            kwVar.j = un0Var;
            if (kwVar.i) {
                b62 b62Var = kwVar.k;
                if (b62Var != null) {
                    fy fyVar = b62Var.a;
                    if (fyVar != null) {
                        fyVar.s(b62Var, null);
                    }
                    kwVar.k = null;
                }
                ArrayList arrayList = kwVar.l;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        b62 b62Var2 = (b62) arrayList.get(i2);
                        fy fyVar2 = b62Var2.a;
                        if (fyVar2 != null) {
                            fyVar2.s(b62Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return kwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbN = vi0.n(i, "radix ", " was not in valid range ");
            sbN.append(new c11(2, 36, 1));
            throw new IllegalArgumentException(sbN.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type j0(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (true) {
            int i = 0;
            if (!(type4 instanceof TypeVariable)) {
                if (type4 instanceof Class) {
                    Class cls2 = (Class) type4;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeJ0 = j0(type, cls, componentType);
                        return componentType == typeJ0 ? cls2 : new d93(typeJ0);
                    }
                }
                if (type4 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type4;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeJ02 = j0(type, cls, genericComponentType);
                    return genericComponentType == typeJ02 ? genericArrayType : new d93(typeJ02);
                }
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeJ03 = j0(type, cls, ownerType);
                    boolean z = typeJ03 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeJ04 = j0(type, cls, actualTypeArguments[i]);
                        if (typeJ04 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeJ04;
                        }
                        i++;
                    }
                    return z ? new e93(typeJ03, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type4 instanceof WildcardType;
                Type type5 = type4;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type4;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeJ05 = j0(type, cls, lowerBounds[0]);
                        type5 = wildcardType;
                        if (typeJ05 != lowerBounds[0]) {
                            return new f93(new Type[]{Object.class}, new Type[]{typeJ05});
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type typeJ06 = j0(type, cls, upperBounds[0]);
                            type5 = wildcardType;
                            if (typeJ06 != upperBounds[0]) {
                                return new f93(new Type[]{typeJ06}, g);
                            }
                        }
                    }
                }
                return type5;
            }
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type3 = typeVariable;
            } else {
                Type typeA = A(type, cls, cls3);
                if (typeA instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) typeA).getActualTypeArguments()[i];
                        } else {
                            i++;
                        }
                    }
                    um2.b();
                    return null;
                }
            }
            if (type3 == typeVariable) {
                return type3;
            }
            type4 = type3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int k(long j, long j2) {
        boolean zO = O(j);
        if (zO != O(j2)) {
            return zO ? -1 : 1;
        }
        return (Math.min(z(j), z(j2)) >= 0.0f && N(j) != N(j2)) ? N(j) ? -1 : 1 : (int) Math.signum(z(j) - z(j2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final m13 k0(m13 m13Var, d61 d61Var) {
        long j;
        n03 n03Var;
        int i;
        int i2;
        d13 d13Var;
        lt2 lt2Var = m13Var.a;
        l03 l03Var = mt2.d;
        l03 l03Var2 = lt2Var.a;
        if (l03Var2.equals(sn.U)) {
            l03Var2 = mt2.d;
        }
        l03 l03Var3 = l03Var2;
        long j2 = lt2Var.b;
        q13[] q13VarArr = p13.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = mt2.a;
        }
        long j3 = j2;
        im0 im0Var = lt2Var.c;
        if (im0Var == null) {
            im0Var = im0.j;
        }
        im0 im0Var2 = im0Var;
        gm0 gm0Var = lt2Var.d;
        gm0 gm0Var2 = new gm0(gm0Var != null ? gm0Var.a : 0);
        hm0 hm0Var = lt2Var.e;
        hm0 hm0Var2 = new hm0(hm0Var != null ? hm0Var.a : 65535);
        mx2 mx2Var = lt2Var.f;
        if (mx2Var == null) {
            mx2Var = mx2.a;
        }
        mx2 mx2Var2 = mx2Var;
        String str = lt2Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = lt2Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = mt2.b;
        }
        long j5 = j4;
        xj xjVar = lt2Var.i;
        float f2 = xjVar != null ? xjVar.a : 0.0f;
        xj xjVar2 = new xj(Float.isNaN(f2) ? 0.0f : f2);
        m03 m03Var = lt2Var.j;
        if (m03Var == null) {
            m03Var = m03.c;
        }
        m03 m03Var2 = m03Var;
        kc1 kc1VarR = lt2Var.k;
        if (kc1VarR == null) {
            kc1 kc1Var = kc1.j;
            kc1VarR = d02.a.r();
        }
        kc1 kc1Var2 = kc1VarR;
        long j6 = lt2Var.l;
        if (j6 == 16) {
            j6 = mt2.c;
        }
        long j7 = j6;
        gz2 gz2Var = lt2Var.m;
        if (gz2Var == null) {
            gz2Var = gz2.b;
        }
        gz2 gz2Var2 = gz2Var;
        bq2 bq2Var = lt2Var.n;
        if (bq2Var == null) {
            bq2Var = bq2.d;
        }
        bq2 bq2Var2 = bq2Var;
        op0 op0Var = lt2Var.o;
        if (op0Var == null) {
            op0Var = xi0.h;
        }
        lt2 lt2Var2 = new lt2(l03Var3, j3, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j5, xjVar2, m03Var2, kc1Var2, j7, gz2Var2, bq2Var2, op0Var);
        vw1 vw1Var = m13Var.b;
        int i3 = ww1.b;
        int i4 = vw1Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = vw1Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = d61Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        c80.s();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = vw1Var.c;
            if ((j & 1095216660480L) == 0) {
                j = ww1.a;
            }
            n03Var = vw1Var.d;
            if (n03Var == null) {
                n03Var = n03.c;
            }
            k02 k02Var = vw1Var.e;
            ya1 ya1Var = vw1Var.f;
            i = vw1Var.g;
            if (i == 0) {
                i = ta1.b;
            }
            i2 = vw1Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            d13Var = vw1Var.i;
            if (d13Var == null) {
                d13Var = d13.c;
            }
            return new m13(lt2Var2, new vw1(i4, i6, j, n03Var, k02Var, ya1Var, i, i2, d13Var), m13Var.c);
        }
        int iOrdinal2 = d61Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            c80.s();
            return null;
        }
        i6 = i5;
        j = vw1Var.c;
        if ((j & 1095216660480L) == 0) {
        }
        n03Var = vw1Var.d;
        if (n03Var == null) {
        }
        k02 k02Var2 = vw1Var.e;
        ya1 ya1Var2 = vw1Var.f;
        i = vw1Var.g;
        if (i == 0) {
        }
        i2 = vw1Var.h;
        if (i2 == 0) {
        }
        d13Var = vw1Var.i;
        if (d13Var == null) {
        }
        return new m13(lt2Var2, new vw1(i4, i6, j, n03Var, k02Var2, ya1Var2, i, i2, d13Var), m13Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.io.Serializable */
    /* JADX WARN: Multi-variable type inference failed */
    public static long[] l(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l0(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        t11.O(classCastException, xe1.class.getName());
        throw classCastException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(nc0 nc0Var, pq0 pq0Var) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f2;
        qp qpVarQ = nc0Var.E().q();
        pq0 pq0Var2 = (pq0) nc0Var.E().j;
        rq0 rq0Var = pq0Var.a;
        if (pq0Var.s) {
            return;
        }
        pq0Var.a();
        if (!rq0Var.G()) {
            try {
                pq0Var.a.w(pq0Var.b, pq0Var.c, pq0Var, pq0Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = rq0Var.F() > 0.0f;
        if (z4) {
            qpVarQ.r();
        }
        Canvas canvasA = g6.a(qpVarQ);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = pq0Var.t;
            float f3 = (int) (j >> 32);
            float f4 = (int) (j & 4294967295L);
            long j2 = pq0Var.u;
            float f5 = ((int) (j2 >> 32)) + f3;
            float f6 = ((int) (j2 & 4294967295L)) + f4;
            float fA = rq0Var.a();
            cl clVarX = rq0Var.x();
            int iK = rq0Var.K();
            if (fA < 1.0f || iK != 3 || clVarX != null || rq0Var.u() == 1) {
                q9 q9VarI = pq0Var.p;
                if (q9VarI == null) {
                    q9VarI = pp0.i();
                    pq0Var.p = q9VarI;
                }
                q9VarI.i(fA);
                q9VarI.j(iK);
                q9VarI.l(clVarX);
                canvasA = canvasA;
                f2 = f3;
                canvasA.saveLayer(f2, f4, f5, f6, (Paint) q9VarI.c);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f2 = f3;
            }
            canvasA.translate(f2, f4);
            canvasA.concat(rq0Var.B());
        }
        boolean z5 = !zIsHardwareAccelerated && pq0Var.w;
        if (z5) {
            qpVarQ.l();
            te teVarD = pq0Var.d();
            if (teVarD instanceof tv1) {
                qp.k(qpVarQ, ((tv1) teVarD).j);
            } else if (teVarD instanceof uv1) {
                y9 y9VarA = pq0Var.m;
                if (y9VarA != null) {
                    y9VarA.a.rewind();
                } else {
                    y9VarA = aa.a();
                    pq0Var.m = y9VarA;
                }
                y9.b(y9VarA, ((uv1) teVarD).j);
                qpVarQ.s(y9VarA);
            } else {
                if (!(teVarD instanceof sv1)) {
                    c80.s();
                    return;
                }
                qpVarQ.s(((sv1) teVarD).j);
            }
        }
        if (pq0Var2 != null) {
            os osVar = pq0Var2.r;
            if (!osVar.a) {
                jz0.a("Only add dependencies during a tracking");
            }
            sk1 sk1Var = (sk1) osVar.d;
            if (sk1Var != null) {
                sk1Var.a(pq0Var);
            } else if (((pq0) osVar.b) != null) {
                sk1 sk1Var2 = fd2.a;
                sk1 sk1Var3 = new sk1();
                pq0 pq0Var3 = (pq0) osVar.b;
                pq0Var3.getClass();
                sk1Var3.a(pq0Var3);
                sk1Var3.a(pq0Var);
                osVar.d = sk1Var3;
                osVar.b = null;
            } else {
                osVar.b = pq0Var;
            }
            sk1 sk1Var4 = (sk1) osVar.e;
            if (sk1Var4 != null) {
                z3 = !sk1Var4.l(pq0Var);
            } else if (((pq0) osVar.c) != pq0Var) {
                z3 = true;
            } else {
                osVar.c = null;
                z3 = false;
            }
            if (z3) {
                pq0Var.q++;
            }
        }
        if (((f6) qpVarQ).a.isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = canvasA;
            rq0Var.s(qpVarQ);
        } else {
            sp spVar = pq0Var.o;
            if (spVar == null) {
                spVar = new sp();
                pq0Var.o = spVar;
            }
            b5 b5Var = spVar.i;
            e70 e70Var = pq0Var.b;
            d61 d61Var = pq0Var.c;
            long jQ0 = s11.q0(pq0Var.u);
            rp rpVar = ((sp) b5Var.k).h;
            e70 e70Var2 = rpVar.a;
            d61 d61Var2 = rpVar.b;
            qp qpVarQ2 = b5Var.q();
            z2 = z5;
            canvas = canvasA;
            long jU = b5Var.u();
            z = z4;
            pq0 pq0Var4 = (pq0) b5Var.j;
            b5Var.C(e70Var);
            b5Var.D(d61Var);
            b5Var.B(qpVarQ);
            b5Var.E(jQ0);
            b5Var.j = pq0Var;
            qpVarQ.l();
            try {
                pq0Var.c(spVar);
            } finally {
                qpVarQ.i();
                b5Var.C(e70Var2);
                b5Var.D(d61Var2);
                b5Var.B(qpVarQ2);
                b5Var.E(jU);
                b5Var.j = pq0Var4;
            }
        }
        if (z2) {
            qpVarQ.i();
        }
        if (z) {
            qpVarQ.n();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(a20 a20Var) {
        k21 k21Var = (k21) a20Var.o(sn.K);
        if (k21Var != null && !k21Var.b()) {
            throw k21Var.q();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String n0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean o(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float o0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean p(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return p(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long q(long j, boolean z, int i, float f2) {
        int iH = ((z || i == 2 || i == 4 || i == 5) && fz.d(j)) ? fz.h(j) : Integer.MAX_VALUE;
        if (fz.j(j) != iH) {
            iH = ci0.D(qp0.l(f2), fz.j(j), iH);
        }
        return rp0.d0(0, iH, 0, fz.g(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object r(lm2 lm2Var, long j, mn0 mn0Var) {
        while (true) {
            if (lm2Var.c >= j && !lm2Var.d()) {
                return lm2Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oy.a;
            Object obj = atomicReferenceFieldUpdater.get(lm2Var);
            hh1 hh1Var = e;
            if (obj == hh1Var) {
                return hh1Var;
            }
            lm2 lm2Var2 = (lm2) ((oy) obj);
            if (lm2Var2 == null) {
                lm2Var2 = (lm2) mn0Var.g(Long.valueOf(lm2Var.c + 1), lm2Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(lm2Var, null, lm2Var2)) {
                    if (atomicReferenceFieldUpdater.get(lm2Var) != null) {
                        break;
                    }
                }
                if (lm2Var.d()) {
                    lm2Var.e();
                }
            }
            lm2Var = lm2Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 s(uh1 uh1Var, boolean z) {
        return uh1Var.c(z ? new tl0() : rh1.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int t(byte b2) {
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            return 2;
        }
        if (b2 == 3) {
            return 3;
        }
        if (b2 == 4) {
            return 4;
        }
        if (b2 == 5) {
            return 5;
        }
        if (b2 == 6) {
            return 6;
        }
        if (b2 == 7) {
            return 7;
        }
        if (b2 == 8) {
            return 8;
        }
        if (b2 == 9) {
            return 9;
        }
        if (b2 == 10) {
            return 10;
        }
        if (b2 == 11) {
            return 11;
        }
        if (b2 == 12) {
            return 12;
        }
        if (b2 == 13) {
            return 13;
        }
        if (b2 == 14) {
            return 14;
        }
        if (b2 == 15) {
            return 15;
        }
        s.j(vi0.i("Unknown AnnotationEncodeValueType: ", String.valueOf(b2 & 255)));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static y10 u(y10 y10Var, z10 z10Var) {
        z10Var.getClass();
        if (t11.l(y10Var.getKey(), z10Var)) {
            return y10Var;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final zj1 v(tn2 tn2Var, in0 in0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            qn2 qn2VarA = tn2Var.a();
            r61 r61Var = qn2VarA.c;
            if (r61Var.I() && r61Var.H()) {
                o62 o62VarG = qn2VarA.g();
                zj1 zj1Var = new zj1(48);
                hh1 hh1Var = new hh1(11);
                hh1Var.F(up0.F(o62VarG));
                y(in0Var, new hh1(11), hh1Var, zj1Var, qn2VarA, qn2VarA);
                return zj1Var;
            }
            zj1 zj1Var2 = y01.a;
            zj1Var2.getClass();
            return zj1Var2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void w(in0 in0Var, hh1 hh1Var, hh1 hh1Var2, zj1 zj1Var, qn2 qn2Var, qn2 qn2Var2) {
        hh1 hh1Var3 = hh1Var;
        Region region = (Region) hh1Var3.i;
        hh1 hh1Var4 = hh1Var2;
        Region region2 = (Region) hh1Var4.i;
        r61 r61Var = qn2Var2.c;
        r61 r61Var2 = qn2Var2.c;
        if (!r61Var.I() || !r61Var2.H() || region2.isEmpty()) {
            if (qn2Var2.o()) {
                x(zj1Var, qn2Var, qn2Var2);
                return;
            }
            return;
        }
        o62 o62VarM = qn2Var2.m();
        if (o62VarM.f()) {
            Object objF = qn2Var2.f();
            if (objF == null) {
                qz0 qz0Var = (qz0) r61Var2.M.d;
                o62VarM = s11.J(qz0Var).J(qz0Var, false);
            } else {
                th1 th1Var = ((th1) objF).h;
                Object objG = qn2Var2.d.h.g(kn2.b);
                if (objG == null) {
                    objG = null;
                }
                o62VarM = qp0.v(th1Var, objG != null, false);
            }
        }
        d11 d11VarF = up0.F(o62VarM);
        hh1Var3.F(d11VarF);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = qn2Var2.f;
            qn2 qn2Var3 = qn2Var;
            if (i == qn2Var3.f) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            sn2 sn2Var = new sn2(qn2Var2, new d11(bounds.left, bounds.top, bounds.right, bounds.bottom));
            zj1 zj1Var2 = zj1Var;
            zj1Var2.h(i, sn2Var);
            List listJ = qn2.j(4, qn2Var2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) in0Var.j(listJ.get(size))).booleanValue()) {
                    w(in0Var, hh1Var3, hh1Var4, zj1Var2, qn2Var3, (qn2) listJ.get(size));
                }
                size--;
                hh1Var3 = hh1Var;
                hh1Var4 = hh1Var2;
                zj1Var2 = zj1Var;
                qn2Var3 = qn2Var;
            }
            if (M(qn2Var2)) {
                region2.op(d11VarF.a, d11VarF.b, d11VarF.c, d11VarF.d, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void x(zj1 zj1Var, qn2 qn2Var, qn2 qn2Var2) {
        r61 r61Var;
        qn2 qn2VarL = qn2Var2.l();
        o62 o62VarG = (qn2VarL == null || (r61Var = qn2VarL.c) == null || !r61Var.I()) ? f : qn2VarL.g();
        int i = qn2Var2.f;
        if (i == qn2Var.f) {
            i = -1;
        }
        zj1Var.h(i, new sn2(qn2Var2, up0.F(o62VarG)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y(in0 in0Var, hh1 hh1Var, hh1 hh1Var2, zj1 zj1Var, qn2 qn2Var, qn2 qn2Var2) {
        boolean z;
        o62 o62VarV;
        boolean z2;
        zn1 zn1VarD;
        in0 in0Var2 = in0Var;
        qn2 qn2Var3 = qn2Var;
        int i = qn2Var3.f;
        Region region = (Region) hh1Var.i;
        hh1 hh1Var3 = hh1Var2;
        Region region2 = (Region) hh1Var3.i;
        r61 r61Var = qn2Var2.c;
        ln2 ln2Var = qn2Var2.d;
        r61 r61Var2 = qn2Var2.c;
        int i2 = qn2Var2.f;
        boolean z3 = (r61Var.I() && r61Var2.H()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z3 || qn2Var2.o()) {
                d11 d11VarF = up0.F(qn2Var2.m());
                hh1Var.F(d11VarF);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (qn2Var2.o()) {
                        x(zj1Var, qn2Var, qn2Var2);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            zj1Var.h(i2, new sn2(qn2Var2, new d11(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                zj1Var.h(i2, new sn2(qn2Var2, new d11(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = qn2.j(4, qn2Var2);
                if (ln2Var.j) {
                    qn2 qn2VarL = qn2Var2.l();
                    while (true) {
                        if (qn2VarL == null) {
                            qn2VarL = null;
                            break;
                        }
                        rk1 rk1Var = qn2VarL.d.h;
                        if (rk1Var.c(vn2.w) || rk1Var.c(vn2.v)) {
                            break;
                        } else {
                            qn2VarL = qn2VarL.l();
                        }
                    }
                    if (qn2VarL == null) {
                        z2 = false;
                        z = z2;
                    } else {
                        zn1 zn1VarD2 = qn2Var2.d();
                        if (zn1VarD2 == null) {
                            zn1VarD2 = null;
                            zn1VarD = qn2VarL.d();
                            if (zn1VarD == null) {
                                zn1VarD = null;
                                if (zn1VarD2 == null && zn1VarD != null) {
                                    o62 o62VarJ = zn1VarD.J(zn1VarD2, false);
                                    z2 = !o62VarJ.equals(o62VarJ.e(eu.q(0L, s11.q0(zn1VarD.j))));
                                }
                                if (z2) {
                                }
                            } else {
                                if (!zn1VarD.S0().u) {
                                    zn1VarD = null;
                                }
                                if (zn1VarD == null) {
                                }
                                if (zn1VarD2 == null) {
                                    z2 = false;
                                    if (z2) {
                                    }
                                }
                            }
                        } else {
                            if (!zn1VarD2.S0().u) {
                                zn1VarD2 = null;
                            }
                            if (zn1VarD2 == null) {
                            }
                            zn1VarD = qn2VarL.d();
                            if (zn1VarD == null) {
                            }
                        }
                    }
                }
                if (z) {
                    hh1 hh1Var4 = new hh1(11);
                    Object objF = qn2Var2.f();
                    if (objF == null) {
                        qz0 qz0Var = (qz0) r61Var2.M.d;
                        o62VarV = s11.J(qz0Var).J(qz0Var, false);
                    } else {
                        th1 th1Var = ((th1) objF).h;
                        Object objG = ln2Var.h.g(kn2.b);
                        o62VarV = qp0.v(th1Var, (objG == null ? null : objG) != null, false);
                    }
                    hh1Var4.F(up0.F(o62VarV));
                    int size = listJ.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) in0Var2.j(listJ.get(size))).booleanValue()) {
                            w(in0Var2, new hh1(11), hh1Var4, zj1Var, qn2Var3, (qn2) listJ.get(size));
                        }
                        size--;
                        qn2Var3 = qn2Var;
                    }
                } else {
                    int size2 = listJ.size() - 1;
                    while (-1 < size2) {
                        if (!((Boolean) in0Var2.j(listJ.get(size2))).booleanValue()) {
                            y(in0Var2, hh1Var, hh1Var3, zj1Var, qn2Var, (qn2) listJ.get(size2));
                        }
                        size2--;
                        in0Var2 = in0Var;
                        hh1Var3 = hh1Var2;
                    }
                }
                if (M(qn2Var2)) {
                    region2.op(d11VarF.a, d11VarF.b, d11VarF.c, d11VarF.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float z(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }
}
