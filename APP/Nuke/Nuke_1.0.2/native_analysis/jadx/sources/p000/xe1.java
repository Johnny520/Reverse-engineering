package p000;

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

    /* JADX INFO: renamed from: a */
    public static final float[][] f12992a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f12993b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f12994c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f12995d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: e */
    public static final hh1 f12996e = new hh1(19, "CLOSED");

    /* JADX INFO: renamed from: f */
    public static final o62 f12997f = new o62(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: g */
    public static final Type[] f12998g = new Type[0];

    /* JADX INFO: renamed from: h */
    public static boolean f12999h = true;

    /* JADX INFO: renamed from: A */
    public static Type m6083A(Type type, Class cls, Class cls2) {
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
                    return m6083A(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m6083A(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: B */
    public static final k21 m6084B(a20 a20Var) {
        k21 k21Var = (k21) a20Var.mo15o(C0700sn.f10207K);
        if (k21Var != null) {
            return k21Var;
        }
        c80.m677u("Current context doesn't contain Job in it: ", a20Var);
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static Type m6085C(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM5695n = vi0.m5695n(i, "Index ", " not in range [0,");
        sbM5695n.append(actualTypeArguments.length);
        sbM5695n.append(") for ");
        sbM5695n.append(parameterizedType);
        throw new IllegalArgumentException(sbM5695n.toString());
    }

    /* JADX INFO: renamed from: D */
    public static Class m6086D(Type type) {
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
            return Array.newInstance((Class<?>) m6086D(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m6086D(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        String name = type.getClass().getName();
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: E */
    public static Type m6087E(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m6128j0(type, cls, m6083A(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m6088F(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return m6088F(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            um2.m5520j("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (m6088F(type2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static int m6089G(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f12994c;
        return AbstractC0899xu.m6181a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: H */
    public static final ca0 m6090H(k21 k21Var, boolean z, n21 n21Var) {
        if (k21Var instanceof r21) {
            return ((r21) k21Var).m4316R(z, n21Var);
        }
        return k21Var.mo1702B(n21Var.mo1214k(), z, new C0151e2(1, n21Var, n21.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 2));
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m6091I(a20 a20Var) {
        k21 k21Var = (k21) a20Var.mo15o(C0700sn.f10207K);
        if (k21Var != null) {
            return k21Var.mo1703b();
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m6092J(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m6093K(int i, Object obj) {
        if (obj instanceof un0) {
            if ((obj instanceof wn0 ? ((wn0) obj).mo2601c() : obj instanceof xm0 ? 0 : obj instanceof in0 ? 1 : obj instanceof mn0 ? 2 : obj instanceof nn0 ? 3 : obj instanceof on0 ? 4 : obj instanceof pn0 ? 5 : obj instanceof qn0 ? 6 : obj instanceof rn0 ? 7 : obj instanceof sn0 ? 8 : obj instanceof tn0 ? 9 : obj instanceof ym0 ? 10 : obj instanceof zm0 ? 11 : obj instanceof bn0 ? 13 : obj instanceof cn0 ? 14 : obj instanceof dn0 ? 15 : obj instanceof en0 ? 16 : obj instanceof fn0 ? 17 : obj instanceof gn0 ? 18 : obj instanceof hn0 ? 19 : obj instanceof jn0 ? 20 : obj instanceof kn0 ? 21 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m6094L(qn2 qn2Var) {
        zn1 zn1VarM4203d = qn2Var.m4203d();
        rk1 rk1Var = qn2Var.f9050d.f6221h;
        return (zn1VarM4203d != null ? zn1VarM4203d.m6458a1() : false) || rk1Var.m4501c(vn2.f12074q) || rk1Var.m4501c(vn2.f12073p);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m6095M(qn2 qn2Var) {
        if (!m6094L(qn2Var)) {
            ln2 ln2Var = qn2Var.f9050d;
            if (ln2Var.f6223j) {
                return true;
            }
            rk1 rk1Var = ln2Var.f6221h;
            Object[] objArr = rk1Var.f9619b;
            Object[] objArr2 = rk1Var.f9620c;
            long[] jArr = rk1Var.f9618a;
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
                                if (((yn2) obj).f13535c) {
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

    /* JADX INFO: renamed from: N */
    public static final boolean m6096N(long j) {
        return (j & 2) != 0;
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m6097O(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m6098P(float f, float f2, C0915y9 c0915y9) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        C0915y9 c0915y9M117a = AbstractC0011aa.m117a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            AbstractC0011aa.m119c("Invalid rectangle, make sure no value is NaN");
        }
        if (c0915y9M117a.f13366b == null) {
            c0915y9M117a.f13366b = new RectF();
        }
        RectF rectF = c0915y9M117a.f13366b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = c0915y9M117a.f13365a;
        RectF rectF2 = c0915y9M117a.f13366b;
        rectF2.getClass();
        path.addRect(rectF2, AbstractC0011aa.m118b(ux1.f11544h));
        C0915y9 c0915y9M117a2 = AbstractC0011aa.m117a();
        c0915y9M117a2.m6234f(c0915y9, c0915y9M117a, 1);
        boolean zIsEmpty = c0915y9M117a2.f13365a.isEmpty();
        c0915y9M117a2.m6235g();
        c0915y9M117a.m6235g();
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m6099Q(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m6100R(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX INFO: renamed from: S */
    public static final uh1 m6101S(r81 r81Var, C0429lm c0429lm, qv1 qv1Var) {
        return new q71(r81Var, c0429lm, qv1Var);
    }

    /* JADX INFO: renamed from: T */
    public static float m6102T(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: U */
    public static int m6103U(int i) {
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

    /* JADX INFO: renamed from: V */
    public static IllegalArgumentException m6104V(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    /* JADX INFO: renamed from: W */
    public static a20 m6105W(y10 y10Var, z10 z10Var) {
        z10Var.getClass();
        return t11.m5086l(y10Var.getKey(), z10Var) ? zd0.f13837h : y10Var;
    }

    /* JADX INFO: renamed from: X */
    public static String m6106X(String str, String str2) {
        if (str.length() <= 0) {
            C0676s.m4645c(vi0.m5690i("Network origin host must not be empty: ", str2));
            return null;
        }
        if (!pv2.m3996i0(str, ':')) {
            try {
                str = IDN.toASCII(str, 2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(vi0.m5690i("Invalid network origin host: ", str2), e);
            }
        }
        try {
            xw0 xw0Var = new xw0();
            xw0Var.m6198g("https");
            str.getClass();
            xw0Var.m6195d(str);
            String lowerCase = xw0Var.m6193b().f13644d.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.length() > 0) {
                return lowerCase;
            }
            C0676s.m4645c(vi0.m5690i("Network origin host must not be empty: ", str2));
            return null;
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(vi0.m5690i("Invalid network origin host: ", str2), e2);
        }
    }

    /* JADX INFO: renamed from: Y */
    public static String m6107Y(String str) {
        str.getClass();
        if (pv2.m4006s0(str)) {
            C0676s.m4651j("Script path must not be blank.");
            return null;
        }
        String strReplace = str.replace('\\', '/');
        strReplace.getClass();
        if (pv2.m3989E0(strReplace, '/')) {
            C0676s.m4645c("Script path must be relative: ".concat(str));
            return null;
        }
        if (oi2.f7689i.m3539b(strReplace)) {
            C0676s.m4645c("Script path must be relative: ".concat(str));
            return null;
        }
        List listM3987C0 = pv2.m3987C0(strReplace, new char[]{'/'});
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listM3987C0) {
            String str2 = (String) obj;
            if (str2.length() != 0 && !str2.equals(".")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            C0676s.m4645c("Script path must not be empty: ".concat(str));
            return null;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (t11.m5086l((String) it.next(), "..")) {
                    C0676s.m4645c("Script path must not escape the script root: ".concat(str));
                    return null;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (String str3 : arrayList) {
                if (pv2.m3996i0(str3, (char) 0) || pv2.m3996i0(str3, ':')) {
                    C0676s.m4645c("Script path contains unsupported characters: ".concat(str));
                    return null;
                }
            }
        }
        return AbstractC0142du.m1165u0(arrayList, "/", null, null, null, 62);
    }

    /* JADX INFO: renamed from: Z */
    public static uh1 m6108Z(uh1 uh1Var, lw1 lw1Var, C0095cl c0095cl) {
        return uh1Var.mo4491c(new mw1(lw1Var, c0095cl));
    }

    /* JADX INFO: renamed from: a */
    public static final void m6109a(boolean z, mn0 mn0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-642000585);
        int i2 = 2;
        int i3 = (go0Var.m1982g(z) ? 4 : 2) | i | (go0Var.m1984h(mn0Var) ? 32 : 16);
        if (go0Var.m1958O(i3 & 1, (i3 & 19) != 18)) {
            Object objM741a = cc1.m741a(go0Var);
            if (objM741a == null) {
                go0Var.m1966W(1512740606);
                objM741a = dc1.m990a(go0Var);
            } else {
                go0Var.m1966W(1512737723);
            }
            go0Var.m1994p(false);
            if (objM741a == null) {
                C0676s.m4653l("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zM1980f = go0Var.m1980f(objM741a);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1980f || objM1956L == c0160eb) {
                gm1 gm1Var = objM741a instanceof gm1 ? (gm1) objM741a : null;
                fm1 navigationEventDispatcher = gm1Var != null ? gm1Var.getNavigationEventDispatcher() : null;
                pt1 pt1Var = objM741a instanceof pt1 ? (pt1) objM741a : null;
                objM1956L = new C0242gj(navigationEventDispatcher, pt1Var != null ? pt1Var.getOnBackPressedDispatcher() : null);
                go0Var.m1981f0(objM1956L);
            }
            C0242gj c0242gj = (C0242gj) objM1956L;
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                objM1956L2 = AbstractC0179eu.m1422C(go0Var);
                go0Var.m1981f0(objM1956L2);
            }
            j20 j20Var = (j20) objM1956L2;
            long j = go0Var.f3614T;
            boolean zM1980f2 = go0Var.m1980f(c0242gj) | go0Var.m1978e(j);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1980f2 || objM1956L3 == c0160eb) {
                objM1956L3 = new C0940yw(j20Var, new m22(j, objM741a));
                go0Var.m1981f0(objM1956L3);
            }
            C0940yw c0940yw = (C0940yw) objM1956L3;
            go0Var.m1966W(-348514256);
            boolean zM1984h = go0Var.m1984h(c0940yw) | go0Var.m1984h(mn0Var);
            Object objM1956L4 = go0Var.m1956L();
            if (zM1984h || objM1956L4 == c0160eb) {
                objM1956L4 = new C0640r1(26, c0940yw, mn0Var);
                go0Var.m1981f0(objM1956L4);
            }
            AbstractC0179eu.m1468r((xm0) objM1956L4, go0Var);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean zM1984h2 = (i4 == 4) | go0Var.m1984h(c0940yw);
            Object objM1956L5 = go0Var.m1956L();
            if (zM1984h2 || objM1956L5 == c0160eb) {
                objM1956L5 = new C0315ij(c0940yw, z, i2);
                go0Var.m1981f0(objM1956L5);
            }
            AbstractC0179eu.m1458h(boolValueOf, c0940yw, null, (in0) objM1956L5, go0Var, i4);
            boolean zM1984h3 = go0Var.m1984h(c0242gj) | go0Var.m1984h(c0940yw);
            Object objM1956L6 = go0Var.m1956L();
            if (zM1984h3 || objM1956L6 == c0160eb) {
                objM1956L6 = new C0115d2(27, c0242gj, c0940yw);
                go0Var.m1981f0(objM1956L6);
            }
            AbstractC0179eu.m1452d(c0242gj, c0940yw, (in0) objM1956L6, go0Var);
            go0Var.m1994p(false);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new m10(z, mn0Var, i);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static IllegalArgumentException m6110a0(Method method, int i, String str, Object... objArr) {
        return m6104V(method, null, str + " (" + yz1.f13683b.mo659l(method, i) + ")", objArr);
    }

    /* JADX INFO: renamed from: b */
    public static final qb2 m6111b(u21 u21Var, String str) {
        u21Var.getClass();
        str.getClass();
        return new qb2(str, u21Var.f11072a);
    }

    /* JADX INFO: renamed from: b0 */
    public static IllegalArgumentException m6112b0(Method method, Exception exc, int i, String str, Object... objArr) {
        return m6104V(method, exc, str + " (" + yz1.f13683b.mo659l(method, i) + ")", objArr);
    }

    /* JADX INFO: renamed from: c */
    public static final void m6113c(C0411l4 c0411l4, qn2 qn2Var) {
        ln2 ln2Var = qn2Var.f9050d;
        rk1 rk1Var = ln2Var.f6221h;
        Object objM4505g = ln2Var.f6221h.m4505g(vn2.f12083z);
        if (objM4505g == null) {
            objM4505g = null;
        }
        if (rg3.m4474j(qn2Var)) {
            Object objM4505g2 = rk1Var.m4505g(kn2.f5683y);
            if (objM4505g2 == null) {
                objM4505g2 = null;
            }
            C0603q3 c0603q3 = (C0603q3) objM4505g2;
            if (c0603q3 != null) {
                c0411l4.m2801a(new C0190f4(null, R.id.accessibilityActionPageUp, c0603q3.f8712a, null));
            }
            Object objM4505g3 = rk1Var.m4505g(kn2.f5656A);
            if (objM4505g3 == null) {
                objM4505g3 = null;
            }
            C0603q3 c0603q32 = (C0603q3) objM4505g3;
            if (c0603q32 != null) {
                c0411l4.m2801a(new C0190f4(null, R.id.accessibilityActionPageDown, c0603q32.f8712a, null));
            }
            Object objM4505g4 = rk1Var.m4505g(kn2.f5684z);
            if (objM4505g4 == null) {
                objM4505g4 = null;
            }
            C0603q3 c0603q33 = (C0603q3) objM4505g4;
            if (c0603q33 != null) {
                c0411l4.m2801a(new C0190f4(null, R.id.accessibilityActionPageLeft, c0603q33.f8712a, null));
            }
            Object objM4505g5 = rk1Var.m4505g(kn2.f5657B);
            if (objM4505g5 == null) {
                objM4505g5 = null;
            }
            C0603q3 c0603q34 = (C0603q3) objM4505g5;
            if (c0603q34 != null) {
                c0411l4.m2801a(new C0190f4(null, R.id.accessibilityActionPageRight, c0603q34.f8712a, null));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0222, code lost:
    
        r14 = java.util.Locale.US;
        r14.getClass();
        r14 = r13.toLowerCase(r14);
        r14.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0236, code lost:
    
        if (p000.mw0.f6909g.contains(r14) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0238, code lost:
    
        r7 = java.lang.Math.addExact(r7, p000.mw0.m3216c(r10) + p000.mw0.m3216c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0247, code lost:
    
        if (r7 > 65536) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0249, code lost:
    
        r1.m6249a(r13, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0250, code lost:
    
        p000.c80.m672p("INVALID_ARGUMENT", "Invalid HTTP header.", 0, null, r0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025f, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0260, code lost:
    
        p000.c80.m672p("QUOTA_EXCEEDED", "HTTP request headers exceed the limit.", 0, null, null, 28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026c, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x026d, code lost:
    
        p000.c80.m672p("INVALID_ARGUMENT", p000.vi0.m5691j("The HTTP header '", r13, "' is computed by the client and cannot be set manually."), 0, null, null, 28);
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
    
        p000.c80.m672p("INVALID_ARGUMENT", "Invalid HTTP header value.", 0, null, null, 28);
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
    /* JADX INFO: renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tw0 m6114c0(Object obj, bf2 bf2Var, boolean z) {
        tw0 tw0Var;
        ArrayList<ow1> arrayList;
        js0 js0VarM6250b;
        Object ow0Var;
        x62 x62Var;
        bf2Var.getClass();
        JsObject jsObject = obj == null ? new JsObject(ce0.f1492h) : sp0.m4937e0("options", obj);
        Set setM3353b0 = np2.m3353b0(jsObject.keySet(), z ? mw0.f6908f : mw0.f6907e);
        if (!setM3353b0.isEmpty()) {
            c80.m672p("INVALID_ARGUMENT", vi0.m5691j("Unknown HTTP options: ", AbstractC0142du.m1165u0(AbstractC0142du.m1170z0(setM3353b0), null, null, null, null, 63), "."), 0, null, null, 28);
            return null;
        }
        Object obj2 = jsObject.get((Object) "method");
        String strM4941g0 = obj2 == null ? null : sp0.m4941g0("method", obj2);
        if (strM4941g0 == null) {
            strM4941g0 = "GET";
        }
        String str = strM4941g0;
        if (!mw0.f6903a.contains(str)) {
            c80.m672p("INVALID_ARGUMENT", "Unsupported HTTP method.", 0, null, null, 28);
            return null;
        }
        Object obj3 = jsObject.get((Object) "timeoutMs");
        Long lValueOf = obj3 == null ? null : Long.valueOf(sp0.m4935d0(obj3, "timeoutMs", 1L, 30000L));
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 30000L;
        long jLongValue2 = z ? 67108864L : 16777216L;
        String str2 = z ? "maxBytes" : "maxResponseBytes";
        Object obj4 = jsObject.get((Object) str2);
        Long lValueOf2 = obj4 == null ? null : Long.valueOf(sp0.m4935d0(obj4, str2, 1L, jLongValue2));
        if (lValueOf2 != null) {
            jLongValue2 = lValueOf2.longValue();
        }
        long j = jLongValue2;
        Object obj5 = jsObject.get((Object) "headers");
        if (obj5 == null) {
            js0VarM6250b = new js0((String[]) new ArrayList(20).toArray(new String[0]));
            tw0Var = null;
        } else {
            if (obj5 instanceof JsObject) {
                Set<Map.Entry<String, Object>> setEntrySet = ((JsObject) obj5).entrySet();
                arrayList = new ArrayList(AbstractC0179eu.m1421B(setEntrySet, 10));
                Iterator it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str3 = (String) entry.getKey();
                    arrayList.add(new ow1(str3, sp0.m4941g0("header '" + str3 + "'", entry.getValue())));
                }
                tw0Var = null;
            } else {
                tw0Var = null;
                if (!(obj5 instanceof List)) {
                    c80.m672p("INVALID_ARGUMENT", "headers must be an object or an array of pairs.", 0, null, null, 28);
                    return null;
                }
                Iterable iterable = (Iterable) obj5;
                arrayList = new ArrayList(AbstractC0179eu.m1421B(iterable, 10));
                Iterator it2 = iterable.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0179eu.m1447a0();
                        throw null;
                    }
                    List list = next instanceof List ? (List) next : null;
                    if (list == null) {
                        c80.m672p("INVALID_ARGUMENT", hk1.m2208g(i, "headers[", "] must be a two-item array."), 0, null, null, 28);
                        return null;
                    }
                    Iterator it3 = it2;
                    if (list.size() != 2) {
                        c80.m672p("INVALID_ARGUMENT", hk1.m2208g(i, "headers[", "] must be a two-item array."), 0, null, null, 28);
                        return null;
                    }
                    arrayList.add(new ow1(sp0.m4941g0("headers[" + i + "][0]", list.get(0)), sp0.m4941g0("headers[" + i + "][1]", list.get(1))));
                    i = i2;
                    it2 = it3;
                }
            }
            if (arrayList.size() > 128) {
                c80.m672p("QUOTA_EXCEEDED", "HTTP request has too many headers.", 0, null, null, 28);
                return tw0Var;
            }
            ye0 ye0Var = new ye0(1);
            int iAddExact = 0;
            loop1: for (ow1 ow1Var : arrayList) {
                String str4 = (String) ow1Var.f7862h;
                String str5 = (String) ow1Var.f7863i;
                if (str4.length() != 0) {
                    int i3 = 0;
                    while (true) {
                        char c = '\r';
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
                c80.m672p("INVALID_ARGUMENT", "Invalid HTTP header name.", 0, null, null, 28);
                return tw0Var;
            }
            js0VarM6250b = ye0Var.m6250b();
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
            byte[] bArr = ((UByteArray) obj6).f5697h;
            ow0Var = new nw0(Arrays.copyOf(bArr, bArr.length));
        } else if (obj6 instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj6;
            ow0Var = new nw0(Arrays.copyOf(bArr2, bArr2.length));
        } else {
            if (!(obj6 instanceof JsObject)) {
                c80.m672p("INVALID_ARGUMENT", "body must be a string, Uint8Array, ArrayBuffer, or FileRef.", 0, null, null, 28);
                return tw0Var;
            }
            ow0Var = new ow0(i51.m2274y("body", obj6));
        }
        Object obj7 = jsObject.get((Object) "redirect");
        Object objM4941g0 = obj7 == null ? tw0Var : sp0.m4941g0("redirect", obj7);
        x62.f12850h.getClass();
        if (objM4941g0 == null) {
            objM4941g0 = "follow";
        }
        if (objM4941g0.equals("follow")) {
            x62Var = x62.f12851i;
        } else {
            if (!objM4941g0.equals("error")) {
                c80.m672p("INVALID_ARGUMENT", "redirect must be follow or error.", 0, null, null, 28);
                return tw0Var;
            }
            x62Var = x62.f12852j;
        }
        x62 x62Var2 = x62Var;
        Object obj8 = jsObject.get((Object) "overwrite");
        ?? ValueOf = obj8 == null ? tw0Var : Boolean.valueOf(sp0.m4925X("overwrite", obj8));
        boolean zBooleanValue = ValueOf != 0 ? ValueOf.booleanValue() : false;
        Object obj9 = jsObject.get((Object) "createParents");
        ?? ValueOf2 = obj9 == null ? tw0Var : Boolean.valueOf(sp0.m4925X("createParents", obj9));
        boolean zBooleanValue2 = ValueOf2 != 0 ? ValueOf2.booleanValue() : false;
        Object obj10 = jsObject.get((Object) "requireSuccess");
        ?? ValueOf3 = obj10 == null ? tw0Var : Boolean.valueOf(sp0.m4925X("requireSuccess", obj10));
        return new tw0(str, js0VarM6250b, ow0Var, jLongValue, x62Var2, j, zBooleanValue, zBooleanValue2, ValueOf3 != 0 ? ValueOf3.booleanValue() : true);
    }

    /* JADX INFO: renamed from: d */
    public static float m6115d(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    /* JADX INFO: renamed from: d0 */
    public static on1 m6116d0(String str) {
        String lowerCase;
        ow1 ow1Var;
        String strM6106X;
        nn1 nn1Var;
        Integer numValueOf;
        str.getClass();
        if (!str.equals(pv2.m3993I0(str).toString()) || str.length() <= 0) {
            C0676s.m4651j("Network origin must not contain surrounding whitespace.");
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
            if (!t11.m5086l(lowerCase, "http") && !t11.m5086l(lowerCase, "https")) {
                C0676s.m4645c("Network origin must use http or https: ".concat(str));
                return null;
            }
            if (uri.getRawUserInfo() != null) {
                C0676s.m4645c("Network origin must not contain user information: ".concat(str));
                return null;
            }
            String rawPath = uri.getRawPath();
            if (rawPath != null && rawPath.length() != 0) {
                C0676s.m4645c("Network origin must not contain a path: ".concat(str));
                return null;
            }
            if (uri.getRawQuery() != null) {
                C0676s.m4645c("Network origin must not contain a query: ".concat(str));
                return null;
            }
            if (uri.getRawFragment() != null) {
                C0676s.m4645c("Network origin must not contain a fragment: ".concat(str));
                return null;
            }
            String rawAuthority = uri.getRawAuthority();
            if (rawAuthority == null) {
                C0676s.m4651j("Network origin must contain a host: ".concat(str));
                return null;
            }
            if (pv2.m3996i0(rawAuthority, '@')) {
                C0676s.m4645c("Network origin must not contain user information: ".concat(str));
                return null;
            }
            if (pv2.m3989E0(rawAuthority, '[')) {
                int iM4003p0 = pv2.m4003p0(rawAuthority, ']', 0, 6);
                if (iM4003p0 <= 1) {
                    C0676s.m4645c("Invalid IPv6 network origin: ".concat(str));
                    return null;
                }
                String strSubstring = rawAuthority.substring(1, iM4003p0);
                String strSubstring2 = rawAuthority.substring(iM4003p0 + 1);
                if (strSubstring2.length() == 0) {
                    numValueOf = null;
                } else {
                    if (!pv2.m3989E0(strSubstring2, ':')) {
                        C0676s.m4651j("Invalid IPv6 network origin: ".concat(str));
                        return null;
                    }
                    numValueOf = Integer.valueOf(m6118e0(strSubstring2.substring(1), str));
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
                    C0676s.m4645c("IPv6 network origins must use brackets: ".concat(str));
                    return null;
                }
                int iM4008u0 = pv2.m4008u0(rawAuthority, ':', 0, 6);
                ow1Var = iM4008u0 < 0 ? new ow1(rawAuthority, null) : new ow1(rawAuthority.substring(0, iM4008u0), Integer.valueOf(m6118e0(rawAuthority.substring(iM4008u0 + 1), str)));
            }
            String str2 = (String) ow1Var.f7862h;
            Integer num = (Integer) ow1Var.f7863i;
            int iIntValue = num != null ? num.intValue() : t11.m5086l(lowerCase, "https") ? 443 : 80;
            if (1 > iIntValue || iIntValue >= 65536) {
                C0676s.m4645c("Network origin port is out of range: ".concat(str));
                return null;
            }
            if (t11.m5086l(str2, "*")) {
                nn1Var = nn1.f7261h;
                strM6106X = "";
            } else if (wv2.m6012d0(str2, "*.", false)) {
                strM6106X = m6106X(pv2.m4012y0(str2, "*."), str);
                if (pv2.m3996i0(strM6106X, ':')) {
                    C0676s.m4645c("Wildcard network origins require a DNS host: ".concat(str));
                    return null;
                }
                nn1Var = nn1.f7263j;
            } else {
                if (pv2.m3996i0(str2, '*')) {
                    C0676s.m4651j("Invalid wildcard network origin: ".concat(str));
                    return null;
                }
                strM6106X = m6106X(str2, str);
                nn1Var = nn1.f7262i;
            }
            return new on1(lowerCase, nn1Var, strM6106X, iIntValue);
        } catch (Exception e) {
            throw new IllegalArgumentException(vi0.m5691j("Invalid network origin '", str, "'."), e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Map m6117e(Object obj) {
        if ((obj instanceof q41) && !(obj instanceof s41)) {
            m6132l0("kotlin.collections.MutableMap", obj);
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            t11.m5063O(e, xe1.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static int m6118e0(String str, String str2) {
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            Integer numM6013e0 = wv2.m6013e0(str);
            if (numM6013e0 != null) {
                return numM6013e0.intValue();
            }
            C0676s.m4651j(vi0.m5690i("Invalid network origin port: ", str2));
            return 0;
        }
        C0676s.m4645c(vi0.m5690i("Invalid network origin port: ", str2));
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static void m6119f(int i, Object obj) {
        if (obj == null || m6093K(i, obj)) {
            return;
        }
        m6132l0("kotlin.jvm.functions.Function" + i, obj);
        throw null;
    }

    /* JADX INFO: renamed from: f0 */
    public static a20 m6120f0(y10 y10Var, a20 a20Var) {
        a20Var.getClass();
        return a20Var == zd0.f13837h ? y10Var : (a20) a20Var.mo16r(new C0920ye(24), y10Var);
    }

    /* JADX INFO: renamed from: g */
    public static final int m6121g(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m6122g0(tr2 tr2Var, InterfaceC0654rf interfaceC0654rf, int i) {
        while (true) {
            int i2 = tr2Var.f10934v;
            if (i > i2 && i < tr2Var.f10933u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            tr2Var.m5401M();
            if (tr2Var.m5433y(tr2Var.f10934v)) {
                interfaceC0654rf.mo2465o();
            }
            tr2Var.m5418j();
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m6123h(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h0 */
    public static final byte[] m6124h0(BufferedInputStream bufferedInputStream, int i) throws IOException {
        if (i <= 0) {
            C0676s.m4651j("maxBytes must be positive.");
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

    /* JADX INFO: renamed from: i */
    public static void m6125i(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final C0402kw m6126i0(int i, un0 un0Var, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        Object objM1956L = go0Var.m1956L();
        if (objM1956L == C0520nx.f7360a) {
            objM1956L = new C0402kw(i, true, un0Var);
            go0Var.m1981f0(objM1956L);
        }
        C0402kw c0402kw = (C0402kw) objM1956L;
        if (!c0402kw.f5835j.equals(un0Var)) {
            c0402kw.f5835j = un0Var;
            if (c0402kw.f5834i) {
                b62 b62Var = c0402kw.f5836k;
                if (b62Var != null) {
                    C0220fy c0220fy = b62Var.f613a;
                    if (c0220fy != null) {
                        c0220fy.m1748s(b62Var, null);
                    }
                    c0402kw.f5836k = null;
                }
                ArrayList arrayList = c0402kw.f5837l;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        b62 b62Var2 = (b62) arrayList.get(i2);
                        C0220fy c0220fy2 = b62Var2.f613a;
                        if (c0220fy2 != null) {
                            c0220fy2.m1748s(b62Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c0402kw;
    }

    /* JADX INFO: renamed from: j */
    public static void m6127j(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM5695n = vi0.m5695n(i, "radix ", " was not in valid range ");
            sbM5695n.append(new c11(2, 36, 1));
            throw new IllegalArgumentException(sbM5695n.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX INFO: renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type m6128j0(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (true) {
            int i = 0;
            if (!(type4 instanceof TypeVariable)) {
                if (type4 instanceof Class) {
                    Class cls2 = (Class) type4;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeM6128j0 = m6128j0(type, cls, componentType);
                        return componentType == typeM6128j0 ? cls2 : new d93(typeM6128j0);
                    }
                }
                if (type4 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type4;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM6128j02 = m6128j0(type, cls, genericComponentType);
                    return genericComponentType == typeM6128j02 ? genericArrayType : new d93(typeM6128j02);
                }
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeM6128j03 = m6128j0(type, cls, ownerType);
                    boolean z = typeM6128j03 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeM6128j04 = m6128j0(type, cls, actualTypeArguments[i]);
                        if (typeM6128j04 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeM6128j04;
                        }
                        i++;
                    }
                    return z ? new e93(typeM6128j03, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type4 instanceof WildcardType;
                Type type5 = type4;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type4;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM6128j05 = m6128j0(type, cls, lowerBounds[0]);
                        type5 = wildcardType;
                        if (typeM6128j05 != lowerBounds[0]) {
                            return new f93(new Type[]{Object.class}, new Type[]{typeM6128j05});
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type typeM6128j06 = m6128j0(type, cls, upperBounds[0]);
                            type5 = wildcardType;
                            if (typeM6128j06 != upperBounds[0]) {
                                return new f93(new Type[]{typeM6128j06}, f12998g);
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
                Type typeM6083A = m6083A(type, cls, cls3);
                if (typeM6083A instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) typeM6083A).getActualTypeArguments()[i];
                        } else {
                            i++;
                        }
                    }
                    um2.m5513b();
                    return null;
                }
            }
            if (type3 == typeVariable) {
                return type3;
            }
            type4 = type3;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final int m6129k(long j, long j2) {
        boolean zM6097O = m6097O(j);
        if (zM6097O != m6097O(j2)) {
            return zM6097O ? -1 : 1;
        }
        return (Math.min(m6149z(j), m6149z(j2)) >= 0.0f && m6096N(j) != m6096N(j2)) ? m6096N(j) ? -1 : 1 : (int) Math.signum(m6149z(j) - m6149z(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX INFO: renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final m13 m6130k0(m13 m13Var, d61 d61Var) {
        long j;
        n03 n03Var;
        int i;
        int i2;
        d13 d13Var;
        lt2 lt2Var = m13Var.f6435a;
        l03 l03Var = mt2.f6834d;
        l03 l03Var2 = lt2Var.f6301a;
        if (l03Var2.equals(C0700sn.f10217U)) {
            l03Var2 = mt2.f6834d;
        }
        l03 l03Var3 = l03Var2;
        long j2 = lt2Var.f6302b;
        q13[] q13VarArr = p13.f7927b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = mt2.f6831a;
        }
        long j3 = j2;
        im0 im0Var = lt2Var.f6303c;
        if (im0Var == null) {
            im0Var = im0.f4680j;
        }
        im0 im0Var2 = im0Var;
        gm0 gm0Var = lt2Var.f6304d;
        gm0 gm0Var2 = new gm0(gm0Var != null ? gm0Var.f3581a : 0);
        hm0 hm0Var = lt2Var.f6305e;
        hm0 hm0Var2 = new hm0(hm0Var != null ? hm0Var.f4076a : 65535);
        mx2 mx2Var = lt2Var.f6306f;
        if (mx2Var == null) {
            mx2Var = mx2.f6914a;
        }
        mx2 mx2Var2 = mx2Var;
        String str = lt2Var.f6307g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = lt2Var.f6308h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = mt2.f6832b;
        }
        long j5 = j4;
        C0888xj c0888xj = lt2Var.f6309i;
        float f = c0888xj != null ? c0888xj.f13048a : 0.0f;
        C0888xj c0888xj2 = new C0888xj(Float.isNaN(f) ? 0.0f : f);
        m03 m03Var = lt2Var.f6310j;
        if (m03Var == null) {
            m03Var = m03.f6426c;
        }
        m03 m03Var2 = m03Var;
        kc1 kc1VarM431r = lt2Var.f6311k;
        if (kc1VarM431r == null) {
            kc1 kc1Var = kc1.f5453j;
            kc1VarM431r = d02.f1801a.m431r();
        }
        kc1 kc1Var2 = kc1VarM431r;
        long j6 = lt2Var.f6312l;
        if (j6 == 16) {
            j6 = mt2.f6833c;
        }
        long j7 = j6;
        gz2 gz2Var = lt2Var.f6313m;
        if (gz2Var == null) {
            gz2Var = gz2.f3746b;
        }
        gz2 gz2Var2 = gz2Var;
        bq2 bq2Var = lt2Var.f6314n;
        if (bq2Var == null) {
            bq2Var = bq2.f985d;
        }
        bq2 bq2Var2 = bq2Var;
        op0 op0Var = lt2Var.f6315o;
        if (op0Var == null) {
            op0Var = xi0.f13041h;
        }
        lt2 lt2Var2 = new lt2(l03Var3, j3, im0Var2, gm0Var2, hm0Var2, mx2Var2, str2, j5, c0888xj2, m03Var2, kc1Var2, j7, gz2Var2, bq2Var2, op0Var);
        vw1 vw1Var = m13Var.f6436b;
        int i3 = ww1.f12699b;
        int i4 = vw1Var.f12198a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = vw1Var.f12199b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = d61Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        c80.m675s();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = vw1Var.f12200c;
            if ((j & 1095216660480L) == 0) {
                j = ww1.f12698a;
            }
            n03Var = vw1Var.f12201d;
            if (n03Var == null) {
                n03Var = n03.f6960c;
            }
            k02 k02Var = vw1Var.f12202e;
            ya1 ya1Var = vw1Var.f12203f;
            i = vw1Var.f12204g;
            if (i == 0) {
                i = ta1.f10655b;
            }
            i2 = vw1Var.f12205h;
            if (i2 == 0) {
                i2 = 1;
            }
            d13Var = vw1Var.f12206i;
            if (d13Var == null) {
                d13Var = d13.f1812c;
            }
            return new m13(lt2Var2, new vw1(i4, i6, j, n03Var, k02Var, ya1Var, i, i2, d13Var), m13Var.f6437c);
        }
        int iOrdinal2 = d61Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            c80.m675s();
            return null;
        }
        i6 = i5;
        j = vw1Var.f12200c;
        if ((j & 1095216660480L) == 0) {
        }
        n03Var = vw1Var.f12201d;
        if (n03Var == null) {
        }
        k02 k02Var2 = vw1Var.f12202e;
        ya1 ya1Var2 = vw1Var.f12203f;
        i = vw1Var.f12204g;
        if (i == 0) {
        }
        i2 = vw1Var.f12205h;
        if (i2 == 0) {
        }
        d13Var = vw1Var.f12206i;
        if (d13Var == null) {
        }
        return new m13(lt2Var2, new vw1(i4, i6, j, n03Var, k02Var2, ya1Var2, i, i2, d13Var), m13Var.f6437c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static long[] m6131l(Serializable serializable) {
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

    /* JADX INFO: renamed from: l0 */
    public static void m6132l0(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        t11.m5063O(classCastException, xe1.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: m */
    public static final void m6133m(nc0 nc0Var, pq0 pq0Var) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f;
        InterfaceC0627qp interfaceC0627qpM430q = nc0Var.mo3274E().m430q();
        pq0 pq0Var2 = (pq0) nc0Var.mo3274E().f563j;
        rq0 rq0Var = pq0Var.f8454a;
        if (pq0Var.f8472s) {
            return;
        }
        pq0Var.m3943a();
        if (!rq0Var.mo4575G()) {
            try {
                pq0Var.f8454a.mo4604w(pq0Var.f8455b, pq0Var.f8456c, pq0Var, pq0Var.f8458e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = rq0Var.mo4574F() > 0.0f;
        if (z4) {
            interfaceC0627qpM430q.mo1528r();
        }
        Canvas canvasM1806a = AbstractC0229g6.m1806a(interfaceC0627qpM430q);
        boolean zIsHardwareAccelerated = canvasM1806a.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = pq0Var.f8473t;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = pq0Var.f8474u;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float fMo4582a = rq0Var.mo4582a();
            C0095cl c0095clMo4605x = rq0Var.mo4605x();
            int iMo4579K = rq0Var.mo4579K();
            if (fMo4582a < 1.0f || iMo4579K != 3 || c0095clMo4605x != null || rq0Var.mo4602u() == 1) {
                C0611q9 c0611q9M3911i = pq0Var.f8469p;
                if (c0611q9M3911i == null) {
                    c0611q9M3911i = pp0.m3911i();
                    pq0Var.f8469p = c0611q9M3911i;
                }
                c0611q9M3911i.m4093i(fMo4582a);
                c0611q9M3911i.m4094j(iMo4579K);
                c0611q9M3911i.m4096l(c0095clMo4605x);
                canvasM1806a = canvasM1806a;
                f = f2;
                canvasM1806a.saveLayer(f, f3, f4, f5, (Paint) c0611q9M3911i.f8830c);
            } else {
                canvasM1806a.save();
                canvasM1806a = canvasM1806a;
                f = f2;
            }
            canvasM1806a.translate(f, f3);
            canvasM1806a.concat(rq0Var.mo4570B());
        }
        boolean z5 = !zIsHardwareAccelerated && pq0Var.f8476w;
        if (z5) {
            interfaceC0627qpM430q.mo1522l();
            AbstractC0731te abstractC0731teM3946d = pq0Var.m3946d();
            if (abstractC0731teM3946d instanceof tv1) {
                InterfaceC0627qp.m4219k(interfaceC0627qpM430q, ((tv1) abstractC0731teM3946d).f10974j);
            } else if (abstractC0731teM3946d instanceof uv1) {
                C0915y9 c0915y9M117a = pq0Var.f8466m;
                if (c0915y9M117a != null) {
                    c0915y9M117a.f13365a.rewind();
                } else {
                    c0915y9M117a = AbstractC0011aa.m117a();
                    pq0Var.f8466m = c0915y9M117a;
                }
                C0915y9.m6230b(c0915y9M117a, ((uv1) abstractC0731teM3946d).f11514j);
                interfaceC0627qpM430q.mo1529s(c0915y9M117a);
            } else {
                if (!(abstractC0731teM3946d instanceof sv1)) {
                    c80.m675s();
                    return;
                }
                interfaceC0627qpM430q.mo1529s(((sv1) abstractC0731teM3946d).f10384j);
            }
        }
        if (pq0Var2 != null) {
            C0554os c0554os = pq0Var2.f8471r;
            if (!c0554os.f7820a) {
                jz0.m2596a("Only add dependencies during a tracking");
            }
            sk1 sk1Var = (sk1) c0554os.f7823d;
            if (sk1Var != null) {
                sk1Var.m4882a(pq0Var);
            } else if (((pq0) c0554os.f7821b) != null) {
                sk1 sk1Var2 = fd2.f2911a;
                sk1 sk1Var3 = new sk1();
                pq0 pq0Var3 = (pq0) c0554os.f7821b;
                pq0Var3.getClass();
                sk1Var3.m4882a(pq0Var3);
                sk1Var3.m4882a(pq0Var);
                c0554os.f7823d = sk1Var3;
                c0554os.f7821b = null;
            } else {
                c0554os.f7821b = pq0Var;
            }
            sk1 sk1Var4 = (sk1) c0554os.f7824e;
            if (sk1Var4 != null) {
                z3 = !sk1Var4.m4893l(pq0Var);
            } else if (((pq0) c0554os.f7822c) != pq0Var) {
                z3 = true;
            } else {
                c0554os.f7822c = null;
                z3 = false;
            }
            if (z3) {
                pq0Var.f8470q++;
            }
        }
        if (((C0192f6) interfaceC0627qpM430q).f2807a.isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = canvasM1806a;
            rq0Var.mo4600s(interfaceC0627qpM430q);
        } else {
            C0702sp c0702sp = pq0Var.f8468o;
            if (c0702sp == null) {
                c0702sp = new C0702sp();
                pq0Var.f8468o = c0702sp;
            }
            C0043b5 c0043b5 = c0702sp.f10257i;
            e70 e70Var = pq0Var.f8455b;
            d61 d61Var = pq0Var.f8456c;
            long jM4715q0 = s11.m4715q0(pq0Var.f8474u);
            C0664rp c0664rp = ((C0702sp) c0043b5.f564k).f10256h;
            e70 e70Var2 = c0664rp.f9665a;
            d61 d61Var2 = c0664rp.f9666b;
            InterfaceC0627qp interfaceC0627qpM430q2 = c0043b5.m430q();
            z2 = z5;
            canvas = canvasM1806a;
            long jM434u = c0043b5.m434u();
            z = z4;
            pq0 pq0Var4 = (pq0) c0043b5.f563j;
            c0043b5.m412C(e70Var);
            c0043b5.m413D(d61Var);
            c0043b5.m411B(interfaceC0627qpM430q);
            c0043b5.m414E(jM4715q0);
            c0043b5.f563j = pq0Var;
            interfaceC0627qpM430q.mo1522l();
            try {
                pq0Var.m3945c(c0702sp);
            } finally {
                interfaceC0627qpM430q.mo1520i();
                c0043b5.m412C(e70Var2);
                c0043b5.m413D(d61Var2);
                c0043b5.m411B(interfaceC0627qpM430q2);
                c0043b5.m414E(jM434u);
                c0043b5.f563j = pq0Var4;
            }
        }
        if (z2) {
            interfaceC0627qpM430q.mo1520i();
        }
        if (z) {
            interfaceC0627qpM430q.mo1524n();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m6134m0(Throwable th) {
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

    /* JADX INFO: renamed from: n */
    public static final void m6135n(a20 a20Var) {
        k21 k21Var = (k21) a20Var.mo15o(C0700sn.f10207K);
        if (k21Var != null && !k21Var.mo1703b()) {
            throw k21Var.mo1706q();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static String m6136n0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m6137o(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: o0 */
    public static float m6138o0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m6139p(Type type, Type type2) {
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
                return m6139p(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* JADX INFO: renamed from: q */
    public static final long m6140q(long j, boolean z, int i, float f) {
        int iM1763h = ((z || i == 2 || i == 4 || i == 5) && C0221fz.m1759d(j)) ? C0221fz.m1763h(j) : Integer.MAX_VALUE;
        if (C0221fz.m1765j(j) != iM1763h) {
            iM1763h = ci0.m779D(qp0.m4257l(f), C0221fz.m1765j(j), iM1763h);
        }
        return rp0.m4543d0(0, iM1763h, 0, C0221fz.m1762g(j));
    }

    /* JADX INFO: renamed from: r */
    public static final Object m6141r(lm2 lm2Var, long j, mn0 mn0Var) {
        while (true) {
            if (lm2Var.f6198c >= j && !lm2Var.mo2943d()) {
                return lm2Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0560oy.f7873a;
            Object obj = atomicReferenceFieldUpdater.get(lm2Var);
            hh1 hh1Var = f12996e;
            if (obj == hh1Var) {
                return hh1Var;
            }
            lm2 lm2Var2 = (lm2) ((AbstractC0560oy) obj);
            if (lm2Var2 == null) {
                lm2Var2 = (lm2) mn0Var.mo12g(Long.valueOf(lm2Var.f6198c + 1), lm2Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(lm2Var, null, lm2Var2)) {
                    if (atomicReferenceFieldUpdater.get(lm2Var) != null) {
                        break;
                    }
                }
                if (lm2Var.mo2943d()) {
                    lm2Var.m3668e();
                }
            }
            lm2Var = lm2Var2;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final uh1 m6142s(uh1 uh1Var, boolean z) {
        return uh1Var.mo4491c(z ? new tl0() : rh1.f9587a);
    }

    /* JADX INFO: renamed from: t */
    public static int m6143t(byte b) {
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        if (b == 3) {
            return 3;
        }
        if (b == 4) {
            return 4;
        }
        if (b == 5) {
            return 5;
        }
        if (b == 6) {
            return 6;
        }
        if (b == 7) {
            return 7;
        }
        if (b == 8) {
            return 8;
        }
        if (b == 9) {
            return 9;
        }
        if (b == 10) {
            return 10;
        }
        if (b == 11) {
            return 11;
        }
        if (b == 12) {
            return 12;
        }
        if (b == 13) {
            return 13;
        }
        if (b == 14) {
            return 14;
        }
        if (b == 15) {
            return 15;
        }
        C0676s.m4651j(vi0.m5690i("Unknown AnnotationEncodeValueType: ", String.valueOf(b & 255)));
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public static y10 m6144u(y10 y10Var, z10 z10Var) {
        z10Var.getClass();
        if (t11.m5086l(y10Var.getKey(), z10Var)) {
            return y10Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final zj1 m6145v(tn2 tn2Var, in0 in0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            qn2 qn2VarM5334a = tn2Var.m5334a();
            r61 r61Var = qn2VarM5334a.f9049c;
            if (r61Var.m4351I() && r61Var.m4350H()) {
                o62 o62VarM4206g = qn2VarM5334a.m4206g();
                zj1 zj1Var = new zj1(48);
                hh1 hh1Var = new hh1(11);
                hh1Var.m2183F(up0.m5527F(o62VarM4206g));
                m6148y(in0Var, new hh1(11), hh1Var, zj1Var, qn2VarM5334a, qn2VarM5334a);
                return zj1Var;
            }
            zj1 zj1Var2 = y01.f13265a;
            zj1Var2.getClass();
            return zj1Var2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m6146w(in0 in0Var, hh1 hh1Var, hh1 hh1Var2, zj1 zj1Var, qn2 qn2Var, qn2 qn2Var2) {
        hh1 hh1Var3 = hh1Var;
        Region region = (Region) hh1Var3.f4019i;
        hh1 hh1Var4 = hh1Var2;
        Region region2 = (Region) hh1Var4.f4019i;
        r61 r61Var = qn2Var2.f9049c;
        r61 r61Var2 = qn2Var2.f9049c;
        if (!r61Var.m4351I() || !r61Var2.m4350H() || region2.isEmpty()) {
            if (qn2Var2.m4213o()) {
                m6147x(zj1Var, qn2Var, qn2Var2);
                return;
            }
            return;
        }
        o62 o62VarM4211m = qn2Var2.m4211m();
        if (o62VarM4211m.m3518f()) {
            Object objM4205f = qn2Var2.m4205f();
            if (objM4205f == null) {
                qz0 qz0Var = (qz0) r61Var2.f9372M.f12033d;
                o62VarM4211m = s11.m4665J(qz0Var).mo644J(qz0Var, false);
            } else {
                th1 th1Var = ((th1) objM4205f).f10757h;
                Object objM4505g = qn2Var2.f9050d.f6221h.m4505g(kn2.f5660b);
                if (objM4505g == null) {
                    objM4505g = null;
                }
                o62VarM4211m = qp0.m4267v(th1Var, objM4505g != null, false);
            }
        }
        d11 d11VarM5527F = up0.m5527F(o62VarM4211m);
        hh1Var3.m2183F(d11VarM5527F);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = qn2Var2.f9052f;
            qn2 qn2Var3 = qn2Var;
            if (i == qn2Var3.f9052f) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            sn2 sn2Var = new sn2(qn2Var2, new d11(bounds.left, bounds.top, bounds.right, bounds.bottom));
            zj1 zj1Var2 = zj1Var;
            zj1Var2.m6421h(i, sn2Var);
            List listM4199j = qn2.m4199j(4, qn2Var2);
            int size = listM4199j.size() - 1;
            while (-1 < size) {
                if (!((Boolean) in0Var.mo5j(listM4199j.get(size))).booleanValue()) {
                    m6146w(in0Var, hh1Var3, hh1Var4, zj1Var2, qn2Var3, (qn2) listM4199j.get(size));
                }
                size--;
                hh1Var3 = hh1Var;
                hh1Var4 = hh1Var2;
                zj1Var2 = zj1Var;
                qn2Var3 = qn2Var;
            }
            if (m6095M(qn2Var2)) {
                region2.op(d11VarM5527F.f1807a, d11VarM5527F.f1808b, d11VarM5527F.f1809c, d11VarM5527F.f1810d, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m6147x(zj1 zj1Var, qn2 qn2Var, qn2 qn2Var2) {
        r61 r61Var;
        qn2 qn2VarM4210l = qn2Var2.m4210l();
        o62 o62VarM4206g = (qn2VarM4210l == null || (r61Var = qn2VarM4210l.f9049c) == null || !r61Var.m4351I()) ? f12997f : qn2VarM4210l.m4206g();
        int i = qn2Var2.f9052f;
        if (i == qn2Var.f9052f) {
            i = -1;
        }
        zj1Var.m6421h(i, new sn2(qn2Var2, up0.m5527F(o62VarM4206g)));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6148y(in0 in0Var, hh1 hh1Var, hh1 hh1Var2, zj1 zj1Var, qn2 qn2Var, qn2 qn2Var2) {
        boolean z;
        o62 o62VarM4267v;
        boolean z2;
        zn1 zn1VarM4203d;
        in0 in0Var2 = in0Var;
        qn2 qn2Var3 = qn2Var;
        int i = qn2Var3.f9052f;
        Region region = (Region) hh1Var.f4019i;
        hh1 hh1Var3 = hh1Var2;
        Region region2 = (Region) hh1Var3.f4019i;
        r61 r61Var = qn2Var2.f9049c;
        ln2 ln2Var = qn2Var2.f9050d;
        r61 r61Var2 = qn2Var2.f9049c;
        int i2 = qn2Var2.f9052f;
        boolean z3 = (r61Var.m4351I() && r61Var2.m4350H()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z3 || qn2Var2.m4213o()) {
                d11 d11VarM5527F = up0.m5527F(qn2Var2.m4211m());
                hh1Var.m2183F(d11VarM5527F);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (qn2Var2.m4213o()) {
                        m6147x(zj1Var, qn2Var, qn2Var2);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            zj1Var.m6421h(i2, new sn2(qn2Var2, new d11(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                zj1Var.m6421h(i2, new sn2(qn2Var2, new d11(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listM4199j = qn2.m4199j(4, qn2Var2);
                if (ln2Var.f6223j) {
                    qn2 qn2VarM4210l = qn2Var2.m4210l();
                    while (true) {
                        if (qn2VarM4210l == null) {
                            qn2VarM4210l = null;
                            break;
                        }
                        rk1 rk1Var = qn2VarM4210l.f9050d.f6221h;
                        if (rk1Var.m4501c(vn2.f12080w) || rk1Var.m4501c(vn2.f12079v)) {
                            break;
                        } else {
                            qn2VarM4210l = qn2VarM4210l.m4210l();
                        }
                    }
                    if (qn2VarM4210l == null) {
                        z2 = false;
                        z = z2;
                    } else {
                        zn1 zn1VarM4203d2 = qn2Var2.m4203d();
                        if (zn1VarM4203d2 == null) {
                            zn1VarM4203d2 = null;
                            zn1VarM4203d = qn2VarM4210l.m4203d();
                            if (zn1VarM4203d == null) {
                                zn1VarM4203d = null;
                                if (zn1VarM4203d2 == null && zn1VarM4203d != null) {
                                    o62 o62VarMo644J = zn1VarM4203d.mo644J(zn1VarM4203d2, false);
                                    z2 = !o62VarMo644J.equals(o62VarMo644J.m3517e(AbstractC0179eu.m1467q(0L, s11.m4715q0(zn1VarM4203d.f10440j))));
                                }
                                if (z2) {
                                }
                            } else {
                                if (!zn1VarM4203d.mo2843S0().f10770u) {
                                    zn1VarM4203d = null;
                                }
                                if (zn1VarM4203d == null) {
                                }
                                if (zn1VarM4203d2 == null) {
                                    z2 = false;
                                    if (z2) {
                                    }
                                }
                            }
                        } else {
                            if (!zn1VarM4203d2.mo2843S0().f10770u) {
                                zn1VarM4203d2 = null;
                            }
                            if (zn1VarM4203d2 == null) {
                            }
                            zn1VarM4203d = qn2VarM4210l.m4203d();
                            if (zn1VarM4203d == null) {
                            }
                        }
                    }
                }
                if (z) {
                    hh1 hh1Var4 = new hh1(11);
                    Object objM4205f = qn2Var2.m4205f();
                    if (objM4205f == null) {
                        qz0 qz0Var = (qz0) r61Var2.f9372M.f12033d;
                        o62VarM4267v = s11.m4665J(qz0Var).mo644J(qz0Var, false);
                    } else {
                        th1 th1Var = ((th1) objM4205f).f10757h;
                        Object objM4505g = ln2Var.f6221h.m4505g(kn2.f5660b);
                        o62VarM4267v = qp0.m4267v(th1Var, (objM4505g == null ? null : objM4505g) != null, false);
                    }
                    hh1Var4.m2183F(up0.m5527F(o62VarM4267v));
                    int size = listM4199j.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) in0Var2.mo5j(listM4199j.get(size))).booleanValue()) {
                            m6146w(in0Var2, new hh1(11), hh1Var4, zj1Var, qn2Var3, (qn2) listM4199j.get(size));
                        }
                        size--;
                        qn2Var3 = qn2Var;
                    }
                } else {
                    int size2 = listM4199j.size() - 1;
                    while (-1 < size2) {
                        if (!((Boolean) in0Var2.mo5j(listM4199j.get(size2))).booleanValue()) {
                            m6148y(in0Var2, hh1Var, hh1Var3, zj1Var, qn2Var, (qn2) listM4199j.get(size2));
                        }
                        size2--;
                        in0Var2 = in0Var;
                        hh1Var3 = hh1Var2;
                    }
                }
                if (m6095M(qn2Var2)) {
                    region2.op(d11VarM5527F.f1807a, d11VarM5527F.f1808b, d11VarM5527F.f1809c, d11VarM5527F.f1810d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static final float m6149z(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }
}
