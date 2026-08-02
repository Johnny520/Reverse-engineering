package p000;

import android.graphics.Paint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Size;
import android.util.SizeF;
import android.view.inputmethod.HandwritingGesture;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: tl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0738tl {

    /* JADX INFO: renamed from: a */
    public static final C0546ok f10820a = new C0546ok(-1.0f);

    /* JADX INFO: renamed from: b */
    public static final C0546ok f10821b = new C0546ok(1.0f);

    /* JADX INFO: renamed from: c */
    public static final Object[] f10822c = new Object[0];

    /* JADX INFO: renamed from: d */
    public static final Type[] f10823d = new Type[0];

    /* JADX INFO: renamed from: e */
    public static final i51 f10824e = new i51(4);

    /* JADX INFO: renamed from: f */
    public static final yo2[] f10825f = new yo2[0];

    /* JADX INFO: renamed from: g */
    public static final Object f10826g = new Object();

    /* JADX INFO: renamed from: h */
    public static final hj0 f10827h = new hj0();

    /* JADX INFO: renamed from: A */
    public static final int m5274A(im0 im0Var, int i) {
        boolean z = t11.m5089o(im0Var.f4684h, im0.f4679i.f4684h) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* JADX INFO: renamed from: B */
    public static vr2 m5275B() {
        return (vr2) ds2.f2180b.m429p();
    }

    /* JADX INFO: renamed from: C */
    public static final float m5276C(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = a13.f30a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : gy0.f3735a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: D */
    public static final float m5277D(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = a13.f30a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? gy0.f3735a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: E */
    public static Type m5278E(Type type, Class cls, Class cls2) {
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
                    return m5278E(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m5278E(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: F */
    public static Class m5279F(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rg3.m4483s(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m5279F(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m5279F(((WildcardType) type).getUpperBounds()[0]);
        }
        um2.m5520j("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    /* JADX INFO: renamed from: G */
    public static final mu2 m5280G(ps2 ps2Var) {
        mu2 mu2Var = ps2Var.f8552h;
        mu2Var.getClass();
        return (mu2) ds2.m1136t(mu2Var, ps2Var);
    }

    /* JADX INFO: renamed from: I */
    public static final int m5281I(ps2 ps2Var) {
        mu2 mu2Var = ps2Var.f8552h;
        mu2Var.getClass();
        return ((mu2) ds2.m1124h(mu2Var)).f6886e;
    }

    /* JADX INFO: renamed from: J */
    public static final C0717t2 m5282J(Object[] objArr) {
        objArr.getClass();
        return new C0717t2(objArr);
    }

    /* JADX INFO: renamed from: K */
    public static vr2 m5283K(vr2 vr2Var) {
        if (vr2Var instanceof a43) {
            a43 a43Var = (a43) vr2Var;
            if (a43Var.f58t == v93.m5656b()) {
                a43Var.f56r = null;
                return vr2Var;
            }
        }
        if (vr2Var instanceof b43) {
            b43 b43Var = (b43) vr2Var;
            if (b43Var.f560i == v93.m5656b()) {
                b43Var.f559h = null;
                return vr2Var;
            }
        }
        vr2 vr2VarM1123g = ds2.m1123g(vr2Var, null, false);
        vr2VarM1123g.m5787j();
        return vr2VarM1123g;
    }

    /* JADX INFO: renamed from: L */
    public static final uh1 m5284L(InterfaceC0596px interfaceC0596px, uh1 uh1Var) {
        if (uh1Var.mo1173b(C0799v6.f11749B)) {
            return uh1Var;
        }
        ((go0) interfaceC0596px).m1962S(1219399079, 0, null, null);
        uh1 uh1Var2 = (uh1) uh1Var.mo1172a(new C0483n2(3, interfaceC0596px), rh1.f9587a);
        ((go0) interfaceC0596px).m1994p(false);
        return uh1Var2;
    }

    /* JADX INFO: renamed from: M */
    public static final uh1 m5285M(InterfaceC0596px interfaceC0596px, uh1 uh1Var) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1966W(439770924);
        uh1 uh1VarM5284L = m5284L(go0Var, uh1Var);
        go0Var.m1994p(false);
        return uh1VarM5284L;
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m5286N(ps2 ps2Var, in0 in0Var) {
        int i;
        AbstractC0077c3 abstractC0077c3;
        Object objMo5j;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        do {
            synchronized (f10826g) {
                mu2 mu2Var = ps2Var.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            lz1 lz1VarMo622e = abstractC0077c3.mo622e();
            objMo5j = in0Var.mo5j(lz1VarMo622e);
            AbstractC0077c3 abstractC0077c3M2997c = lz1VarMo622e.m2997c();
            if (t11.m5086l(abstractC0077c3M2997c, abstractC0077c3)) {
                break;
            }
            mu2 mu2Var3 = ps2Var.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = m5309h((mu2) ds2.m1139w(mu2Var3, ps2Var, vr2VarM1126j), i, abstractC0077c3M2997c, true);
            }
            ds2.m1130n(vr2VarM1126j, ps2Var);
        } while (!zM5309h);
        return ((Boolean) objMo5j).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public static uh1 m5287O(uh1 uh1Var, xm0 xm0Var) {
        uh1Var.getClass();
        xm0Var.getClass();
        return m5320s(uh1Var, new hp1(6, new gp1(xm0Var, 0), true));
    }

    /* JADX INFO: renamed from: P */
    public static Object m5288P(l70 l70Var, xm0 xm0Var) {
        vr2 a43Var;
        vr2 vr2Var = (vr2) ds2.f2180b.m429p();
        if (vr2Var instanceof a43) {
            a43 a43Var2 = (a43) vr2Var;
            if (a43Var2.f58t == v93.m5656b()) {
                in0 in0Var = a43Var2.f56r;
                in0 in0Var2 = a43Var2.f57s;
                try {
                    ((a43) vr2Var).f56r = ds2.m1127k(l70Var, in0Var, true);
                    ((a43) vr2Var).f57s = in0Var2;
                    return xm0Var.mo6a();
                } finally {
                    a43Var2.f56r = in0Var;
                    a43Var2.f57s = in0Var2;
                }
            }
        }
        if (vr2Var == null || (vr2Var instanceof wk1)) {
            a43Var = new a43(vr2Var instanceof wk1 ? (wk1) vr2Var : null, l70Var, null, true, false);
        } else {
            a43Var = vr2Var.mo89u(l70Var);
        }
        try {
            vr2 vr2VarM5787j = a43Var.m5787j();
            try {
                Object objMo6a = xm0Var.mo6a();
                vr2.m5784q(vr2VarM5787j);
                a43Var.mo75c();
                return objMo6a;
            } catch (Throwable th) {
                vr2.m5784q(vr2VarM5787j);
                throw th;
            }
        } catch (Throwable th2) {
            a43Var.mo75c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m5289Q(long j, C0690sd c0690sd, boolean z, C0792v c0792v) {
        if (z) {
            int i = f13.f2738c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c0690sd, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c0690sd.f10051i.length() ? Character.codePointAt(c0690sd, iCharCount2) : 10;
            if (p40.m3702L(iCodePointBefore) && (p40.m3701K(iCodePointAt) || p40.m3700J(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c0690sd, iCharCount);
                    }
                } while (p40.m3702L(iCodePointBefore));
                j = fg1.m1636i(iCharCount, iCharCount2);
            } else if (p40.m3702L(iCodePointAt) && (p40.m3701K(iCodePointBefore) || p40.m3700J(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c0690sd.f10051i.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c0690sd, iCharCount2);
                    }
                } while (p40.m3702L(iCodePointAt));
                j = fg1.m1636i(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        c0792v.mo5j(new as0(new rd0[]{new mp2(i2, i2), new z60(f13.m1495d(j), 0)}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f A[EDGE_INSN: B:86:0x013f->B:80:0x013f BREAK  A[LOOP:0: B:3:0x0002->B:89:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:0: B:3:0x0002->B:89:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [nr0] */
    /* JADX WARN: Type inference failed for: r12v4, types: [nr0] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type m5290S(Type type, Class cls, Type type2, HashMap map) {
        Type typeM5290S;
        Type mr0Var;
        TypeVariable typeVariable = null;
        while (true) {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = (TypeVariable) type2;
                Type type3 = (Type) map.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                map.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 == null) {
                    type2 = typeVariable2;
                    if (type2 != typeVariable2) {
                        break;
                    }
                } else {
                    Type typeM5278E = m5278E(type, cls, cls3);
                    if (typeM5278E instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable2.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) typeM5278E).getActualTypeArguments()[i];
                            } else {
                                i++;
                            }
                        }
                        um2.m5513b();
                        return null;
                    }
                    if (type2 != typeVariable2) {
                    }
                }
            } else if (type2 instanceof Class) {
                Class cls4 = (Class) type2;
                if (cls4.isArray()) {
                    Class<?> componentType = cls4.getComponentType();
                    Type typeM5290S2 = m5290S(type, cls, componentType, map);
                    if (Objects.equals(componentType, typeM5290S2)) {
                        type2 = cls4;
                    } else {
                        mr0Var = new lr0(typeM5290S2);
                        type2 = mr0Var;
                    }
                } else if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type typeM5290S3 = m5290S(type, cls, genericComponentType, map);
                    if (!Objects.equals(genericComponentType, typeM5290S3)) {
                        mr0Var = new lr0(typeM5290S3);
                        type2 = mr0Var;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type typeM5290S4 = m5290S(type, cls, ownerType, map);
                    boolean zEquals = Objects.equals(typeM5290S4, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr = actualTypeArguments;
                    boolean z = false;
                    while (i < length2) {
                        Type typeM5290S5 = m5290S(type, cls, typeArr[i], map);
                        if (!Objects.equals(typeM5290S5, typeArr[i])) {
                            if (!z) {
                                typeArr = (Type[]) typeArr.clone();
                                z = true;
                            }
                            typeArr[i] = typeM5290S5;
                        }
                        i++;
                    }
                    if (!zEquals || z) {
                        mr0Var = new mr0(typeM5290S4, (Class) type2.getRawType(), typeArr);
                        type2 = mr0Var;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM5290S6 = m5290S(type, cls, lowerBounds[0], map);
                        if (typeM5290S6 != lowerBounds[0]) {
                            type2 = new nr0(new Type[]{Object.class}, typeM5290S6 instanceof WildcardType ? ((WildcardType) typeM5290S6).getLowerBounds() : new Type[]{typeM5290S6});
                        }
                    } else if (upperBounds.length == 1 && (typeM5290S = m5290S(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                        type2 = new nr0(typeM5290S instanceof WildcardType ? ((WildcardType) typeM5290S).getUpperBounds() : new Type[]{typeM5290S}, f10823d);
                    }
                }
            }
        }
        if (typeVariable != null) {
            map.put(typeVariable, type2);
        }
        return type2;
    }

    /* JADX INFO: renamed from: T */
    public static List m5291T(zf1 zf1Var, yf1 yf1Var, Class cls, in0 in0Var) throws NoSuchFieldException, NoSuchMethodException {
        Class cls2;
        List listM5291T = be0.f819h;
        if (cls != null) {
            cls2 = Object.class;
            Class<Object> clsM3691A = p40.m3691A(d72.m967a(cls2));
            if (!cls.equals(clsM3691A != null ? clsM3691A : Object.class)) {
                Collection collection = (Collection) in0Var.mo5j(cls);
                if (collection.isEmpty()) {
                    if (yf1Var.f13436c) {
                        listM5291T = m5291T(zf1Var, yf1Var, cls.getSuperclass(), in0Var);
                    } else {
                        m5297Z(zf1Var, yf1Var);
                    }
                    collection = listM5291T;
                }
                return (List) collection;
            }
        }
        m5297Z(zf1Var, yf1Var);
        return listM5291T;
    }

    /* JADX INFO: renamed from: U */
    public static void m5292U(vr2 vr2Var, vr2 vr2Var2, in0 in0Var) {
        if (vr2Var != vr2Var2) {
            vr2Var2.getClass();
            vr2.m5784q(vr2Var);
            vr2Var2.mo75c();
        } else if (vr2Var instanceof a43) {
            ((a43) vr2Var).f56r = in0Var;
        } else if (vr2Var instanceof b43) {
            ((b43) vr2Var).f559h = in0Var;
        } else {
            c80.m677u("Non-transparent snapshot was reused: ", vr2Var);
        }
    }

    /* JADX INFO: renamed from: V */
    public static final String m5293V(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX INFO: renamed from: W */
    public static final long m5294W(o62 o62Var) {
        float f = o62Var.f7538c - o62Var.f7536a;
        return (((long) Float.floatToRawIntBits(o62Var.f7539d - o62Var.f7537b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: X */
    public static final long m5295X(String str, long j, long j2, long j3) {
        String property;
        int i = nx2.f7364a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM6015g0 = wv2.m6015g0(property, 10);
        if (lM6015g0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM6015g0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: Y */
    public static int m5296Y(String str, int i, int i2) {
        return (int) m5295X(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: Z */
    public static void m5297Z(zf1 zf1Var, yf1 yf1Var) throws NoSuchFieldException, NoSuchMethodException {
        Class cls;
        Object x92Var;
        String string;
        String strM2472a;
        boolean z = yf1Var.f13436c;
        Class cls2 = yf1Var.f13434a;
        String str = z ? " (Also tried for superclass)" : "";
        String str2 = !z ? "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. " : "Check if the conditions are correct and valid, and try again. ";
        try {
            Map mapMo2193a = zf1Var.mo2193a();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapMo2193a.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    strM2472a = value instanceof un0 ? "(Runtime Condition)" : ((value instanceof Collection) && ((Collection) value).isEmpty()) ? null : j93.m2472a(value);
                }
                String strM6010b0 = strM2472a != null ? wv2.m6010b0(strM2472a.toString(), " (Kotlin reflection is not available)", "") : null;
                ow1 ow1Var = strM6010b0 != null ? new ow1(str3, strM6010b0) : null;
                if (ow1Var != null) {
                    arrayList.add(ow1Var);
                }
            }
            if (arrayList.isEmpty()) {
                x92Var = cls2.toString();
                cls = cls2;
            } else {
                Iterator it = arrayList.iterator();
                try {
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    final int iM5311j = m5311j((String) ((ow1) it.next()).f7862h);
                    while (it.hasNext()) {
                        int iM5311j2 = m5311j((String) ((ow1) it.next()).f7862h);
                        if (iM5311j < iM5311j2) {
                            iM5311j = iM5311j2;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int iM5311j3 = m5311j((String) ((ow1) it2.next()).f7863i);
                    while (it2.hasNext()) {
                        int iM5311j4 = m5311j((String) ((ow1) it2.next()).f7863i);
                        if (iM5311j3 < iM5311j4) {
                            iM5311j3 = iM5311j4;
                        }
                    }
                    String strM6010b02 = wv2.m6010b0(cls2.toString(), " (Kotlin reflection is not available)", "");
                    int iM5311j5 = m5311j(strM6010b02) - ((iM5311j + iM5311j3) + 3);
                    if (iM5311j5 < 0) {
                        iM5311j5 = 0;
                    }
                    final int i = iM5311j3 + iM5311j5;
                    cls = cls2;
                    String str4 = "+-" + wv2.m6009a0("-", iM5311j) + "-+-" + wv2.m6009a0("-", i) + "-+";
                    int i2 = iM5311j + i + 3;
                    x92Var = AbstractC0142du.m1165u0(AbstractC0179eu.m1435P("+-" + wv2.m6009a0("-", i2) + "-+", "| " + m5312k(strM6010b02, i2) + " |", str4, AbstractC0142du.m1165u0(arrayList, "\n", null, null, new in0() { // from class: dg1
                        @Override // p000.in0
                        /* JADX INFO: renamed from: j */
                        public final Object mo5j(Object obj) {
                            ow1 ow1Var2 = (ow1) obj;
                            return vi0.m5692k("| ", AbstractC0738tl.m5312k((String) ow1Var2.f7862h, iM5311j), " | ", AbstractC0738tl.m5312k((String) ow1Var2.f7863i, i), " |");
                        }
                    }, 30), str4), "\n", null, null, null, 62);
                } catch (Throwable th) {
                    th = th;
                    x92Var = new x92(th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls2;
        }
        Object objConcat = wv2.m6010b0(cls.toString(), " (Kotlin reflection is not available)", "").concat("\nFailed to build condition table.");
        if (x92Var instanceof x92) {
            x92Var = objConcat;
        }
        String str5 = (String) x92Var;
        boolean z2 = zf1Var instanceof sg1;
        if (z2) {
            StringBuilder sbM5696o = vi0.m5696o("No method found matching the condition for current class", str, ".\n", str5, "\nSuggestion: ");
            sbM5696o.append(str2);
            string = sbM5696o.toString();
        } else if (!(zf1Var instanceof hi0)) {
            c80.m677u("Unsupported condition type: ", zf1Var);
            return;
        } else {
            StringBuilder sbM5696o2 = vi0.m5696o("No field found matching the condition for current class", str, ".\n", str5, "\nSuggestion: ");
            sbM5696o2.append(str2);
            string = sbM5696o2.toString();
        }
        xf1 xf1Var = yf1Var.f13437d;
        if (xf1Var != xf1.f13006h) {
            if (xf1Var == xf1.f13007i) {
                tp0.m5355S(pv2.m3993I0(string).toString(), null);
            }
        } else {
            if (z2) {
                throw new NoSuchMethodException(string.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
            }
            if (zf1Var instanceof hi0) {
                throw new NoSuchFieldException(string.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
            }
            c80.m677u("Unsupported condition type: ", zf1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5298a(sz0 sz0Var, uh1 uh1Var, String str, InterfaceC0596px interfaceC0596px, int i) {
        uh1 uh1Var2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1072881857);
        int i2 = i | (go0Var.m1980f(sz0Var) ? 4 : 2) | 48 | (go0Var.m1980f(str) ? 256 : 128);
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarMo4491c = AbstractC0731te.m5233r0(rh1Var, 300.0f, 520.0f).mo4491c(AbstractC0731te.f10693e);
            fb2 fb2VarM1827a = gb2.m1827a(8.0f);
            tu2 tu2Var = AbstractC0670ru.f9755a;
            long j = ((C0593pu) go0Var.m1988j(tu2Var)).f8602p;
            C0402kw c0402kwM6126i0 = xe1.m6126i0(1490904710, new s70(str, sz0Var), go0Var);
            C0478my c0478my = ow2.f7864a;
            go0Var.m1966W(89374938);
            C0593pu c0593pu = (C0593pu) go0Var.m1988j(tu2Var);
            long j2 = c0593pu.f8587a;
            long j3 = c0593pu.f8585U;
            long j4 = c0593pu.f8581Q;
            long j5 = c0593pu.f8577M;
            long j6 = c0593pu.f8603q;
            if (C0363ju.m2566c(j, j2)) {
                j3 = c0593pu.f8588b;
            } else if (C0363ju.m2566c(j, c0593pu.f8592f)) {
                j3 = c0593pu.f8593g;
            } else if (C0363ju.m2566c(j, c0593pu.f8596j)) {
                j3 = c0593pu.f8597k;
            } else if (C0363ju.m2566c(j, c0593pu.f8600n)) {
                j3 = c0593pu.f8601o;
            } else if (C0363ju.m2566c(j, c0593pu.f8609w)) {
                j3 = c0593pu.f8610x;
            } else if (C0363ju.m2566c(j, c0593pu.f8589c)) {
                j3 = c0593pu.f8590d;
            } else if (C0363ju.m2566c(j, c0593pu.f8594h)) {
                j3 = c0593pu.f8595i;
            } else if (C0363ju.m2566c(j, c0593pu.f8598l)) {
                j3 = c0593pu.f8599m;
            } else if (C0363ju.m2566c(j, c0593pu.f8611y)) {
                j3 = c0593pu.f8612z;
            } else if (C0363ju.m2566c(j, c0593pu.f8607u)) {
                j3 = c0593pu.f8608v;
            } else if (!C0363ju.m2566c(j, c0593pu.f8602p)) {
                if (C0363ju.m2566c(j, c0593pu.f8604r)) {
                    j3 = c0593pu.f8605s;
                } else if (C0363ju.m2566c(j, c0593pu.f8568D) || C0363ju.m2566c(j, c0593pu.f8570F) || C0363ju.m2566c(j, c0593pu.f8571G) || C0363ju.m2566c(j, c0593pu.f8572H) || C0363ju.m2566c(j, c0593pu.f8573I) || C0363ju.m2566c(j, c0593pu.f8574J) || C0363ju.m2566c(j, c0593pu.f8569E)) {
                    j3 = j6;
                } else if (C0363ju.m2566c(j, c0593pu.f8575K) || C0363ju.m2566c(j, c0593pu.f8576L)) {
                    j3 = j5;
                } else if (C0363ju.m2566c(j, c0593pu.f8579O) || C0363ju.m2566c(j, c0593pu.f8580P)) {
                    j3 = j4;
                } else if (!C0363ju.m2566c(j, c0593pu.f8583S) && !C0363ju.m2566c(j, c0593pu.f8584T)) {
                    j3 = C0363ju.f5217g;
                }
            }
            if (j3 == 16) {
                j3 = ((C0363ju) go0Var.m1988j(c00.f1090a)).f5219a;
            }
            go0Var.m1994p(false);
            C0478my c0478my2 = ow2.f7864a;
            float f = ((za0) go0Var.m1988j(c0478my2)).f13798h + 6.0f;
            ci0.m801b(new f42[]{c00.f1090a.mo1251a(new C0363ju(j3)), c0478my2.mo1251a(new za0(f))}, xe1.m6126i0(421772006, new nw2(uh1VarMo4491c, fb2VarM1827a, j, f, c0402kwM6126i0), go0Var), go0Var, 56);
            uh1Var2 = rh1Var;
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new tt0(sz0Var, uh1Var2, str, i, 6);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final Object[] m5299a0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = f10822c;
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

    /* JADX INFO: renamed from: b */
    public static final void m5300b(xm0 xm0Var, uh1 uh1Var, j81 j81Var, w81 w81Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1055276397);
        int i2 = (go0Var.m1984h(xm0Var) ? 4 : 2) | i | (go0Var.m1980f(uh1Var) ? 32 : 16) | (go0Var.m1980f(j81Var) ? 256 : 128) | (go0Var.m1980f(w81Var) ? 2048 : 1024);
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            op0.m3580b(xe1.m6126i0(-933153643, new b81(j81Var, uh1Var, w81Var, op0.m3601x(xm0Var, go0Var), 0), go0Var), go0Var, 6);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0794v1(xm0Var, uh1Var, j81Var, w81Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final Object[] m5301b0(Collection collection, Object[] objArr) {
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

    /* JADX INFO: renamed from: c */
    public static final tm2 m5302c(er2 er2Var, InterfaceC0814vl interfaceC0814vl) {
        u20 u20VarM1412b = er2Var.m1412b();
        bo0 bo0Var = (bo0) er2Var.f2578k;
        boolean z = u20VarM1412b == u20.f11067h;
        return new tm2(m5308g(bo0Var, z, true, interfaceC0814vl), m5308g(bo0Var, z, false, interfaceC0814vl), z);
    }

    /* JADX INFO: renamed from: c0 */
    public static Class m5303c0(Object obj, yf1 yf1Var, String str) {
        Class<?> clsM1140a;
        Object x92Var;
        Class cls;
        if (obj instanceof Class) {
            clsM1140a = (Class) obj;
        } else if (obj instanceof C0067bt) {
            clsM1140a = p40.m3741y((C0067bt) obj);
        } else if (obj instanceof String) {
            xf1 xf1Var = yf1Var.f13437d;
            Class cls2 = yf1Var.f13434a;
            if (xf1Var == xf1.f13006h) {
                clsM1140a = AbstractC0141dt.m1140a(cls2.getClassLoader(), (String) obj);
            } else {
                try {
                    x92Var = AbstractC0141dt.m1140a(cls2.getClassLoader(), (String) obj);
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (x92Var instanceof x92) {
                    x92Var = null;
                }
                clsM1140a = (Class) x92Var;
                if (clsM1140a == null) {
                    clsM1140a = fg1.class;
                    Class<?> clsM3691A = p40.m3691A(d72.m967a(clsM1140a));
                    if (clsM3691A != null) {
                        clsM1140a = clsM3691A;
                    }
                }
            }
        } else {
            if (!(obj instanceof j93)) {
                C0676s.m4649h("Unsupported type: ", obj, ", supported types are Class, KClass, String and VagueType.");
                return null;
            }
            clsM1140a = obj.getClass();
        }
        cls = j93.class;
        Class<j93> clsM3691A2 = p40.m3691A(d72.m967a(cls));
        if (!clsM1140a.equals(clsM3691A2 != null ? clsM3691A2 : j93.class) || str == null) {
            return clsM1140a;
        }
        C0676s.m4649h("VagueType is not supported for \"", str, "\".");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float m5304d(rz1 rz1Var, boolean z, gu0[] gu0VarArr, float f) {
        float f2 = Float.NaN;
        for (gu0 gu0Var : gu0VarArr) {
            float fMo2895c = rz1Var.mo2895c(gu0Var);
            if (Float.isNaN(f2)) {
                f2 = fMo2895c;
            } else if (z == (fMo2895c > f2)) {
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    /* JADX INFO: renamed from: d0 */
    public static String m5305d0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: e */
    public static final sm2 m5306e(final er2 er2Var, final bo0 bo0Var, sm2 sm2Var) {
        int i = bo0Var.f958c;
        int i2 = bo0Var.f957b;
        boolean z = er2Var.f2576i;
        final int i3 = z ? i2 : i;
        y03 y03Var = (y03) bo0Var.f960e;
        int i4 = bo0Var.f959d;
        mv0 mv0Var = new mv0(bo0Var, i3);
        i91 i91Var = i91.f4498i;
        final j71 j71VarM3746B = AbstractC0570p7.m3746B(i91Var, mv0Var);
        final int i5 = z ? i : i2;
        j71 j71VarM3746B2 = AbstractC0570p7.m3746B(i91Var, new xm0() { // from class: wm2
            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                bo0 bo0Var2 = bo0Var;
                y03 y03Var2 = (y03) bo0Var2.f960e;
                int iIntValue = ((Number) j71VarM3746B.getValue()).intValue();
                er2 er2Var2 = er2Var;
                boolean z2 = er2Var2.f2576i;
                boolean z3 = er2Var2.m1412b() == u20.f11067h;
                int i6 = i3;
                long jM6209i = y03Var2.m6209i(i6);
                lj1 lj1Var = y03Var2.f13267b;
                int i7 = f13.f2738c;
                int iM6206f = (int) (jM6209i >> 32);
                int iM2917d = lj1Var.m2917d(iM6206f);
                int i8 = lj1Var.f6151f;
                if (iM2917d != iIntValue) {
                    iM6206f = iIntValue >= i8 ? y03Var2.m6206f(i8 - 1) : y03Var2.m6206f(iIntValue);
                }
                int iM2916c = (int) (jM6209i & 4294967295L);
                if (lj1Var.m2917d(iM2916c) != iIntValue) {
                    iM2916c = iIntValue >= i8 ? lj1Var.m2916c(i8 - 1, false) : lj1Var.m2916c(iIntValue, false);
                }
                int i9 = i5;
                if (iM6206f == i9) {
                    return bo0Var2.m576a(iM2916c);
                }
                if (iM2916c == i9) {
                    return bo0Var2.m576a(iM6206f);
                }
                if (!(z2 ^ z3) ? i6 >= iM6206f : i6 > iM2916c) {
                    iM6206f = iM2916c;
                }
                return bo0Var2.m576a(iM6206f);
            }
        });
        if (1 != sm2Var.f10196c) {
            return (sm2) j71VarM3746B2.getValue();
        }
        if (i3 == i4) {
            return sm2Var;
        }
        if (((Number) j71VarM3746B.getValue()).intValue() != y03Var.f13267b.m2917d(i4)) {
            return (sm2) j71VarM3746B2.getValue();
        }
        int i6 = sm2Var.f10195b;
        long jM6209i = y03Var.m6209i(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                u20 u20Var = u20.f11067h;
                if (!(((i2 < i ? u20.f11068i : i2 > i ? u20Var : u20.f11069j) == u20Var) ^ z)) {
                }
            }
            return bo0Var.m576a(i3);
        }
        int i7 = f13.f2738c;
        return (i6 == ((int) (jM6209i >> 32)) || i6 == ((int) (4294967295L & jM6209i))) ? (sm2) j71VarM3746B2.getValue() : bo0Var.m576a(i3);
    }

    /* JADX INFO: renamed from: f */
    public static final void m5307f(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX INFO: renamed from: g */
    public static final sm2 m5308g(bo0 bo0Var, boolean z, boolean z2, InterfaceC0814vl interfaceC0814vl) {
        long j;
        long jMo1844f = interfaceC0814vl.mo1844f(bo0Var, z2 ? bo0Var.f957b : bo0Var.f958c);
        if (z ^ z2) {
            int i = f13.f2738c;
            j = jMo1844f >> 32;
        } else {
            int i2 = f13.f2738c;
            j = 4294967295L & jMo1844f;
        }
        return bo0Var.m576a((int) j);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m5309h(mu2 mu2Var, int i, AbstractC0077c3 abstractC0077c3, boolean z) {
        boolean z2;
        synchronized (f10826g) {
            try {
                int i2 = mu2Var.f6885d;
                if (i2 == i) {
                    mu2Var.f6884c = abstractC0077c3;
                    z2 = true;
                    if (z) {
                        mu2Var.f6886e++;
                    }
                    mu2Var.f6885d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: i */
    public static bj0 m5310i(C0497ng c0497ng, zf1 zf1Var, yf1 yf1Var) {
        byte b = 0;
        return m5326y(m5326y(m5326y(m5326y(m5326y(m5326y(m5326y(m5326y(m5326y(m5326y(new bj0(c0497ng, new nx0(26), 1), yf1Var, "name", zf1Var.f13871b, new z81(29)), yf1Var, "nameCondition", null, new eg1(b, b)), yf1Var, "modifiers", zf1Var.f13872c, new eg1(b, 1)), yf1Var, "modifiersNot", zf1Var.f13873d, new eg1(b, 2)), yf1Var, "modifiersCondition", null, new eg1(b, 3)), yf1Var, "isSynthetic", null, new eg1(b, 4)), yf1Var, "isSyntheticNot", null, new eg1(b, 6)), yf1Var, "annotations", zf1Var.f13874e, new cg1(yf1Var, 8)), yf1Var, "annotationsNot", zf1Var.f13875f, new cg1(yf1Var, 9)), yf1Var, "genericString", null, new eg1(b, 7));
    }

    /* JADX INFO: renamed from: j */
    public static final int m5311j(String str) {
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j += ((long) str.charAt(i)) > 127 ? 2L : 1L;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: k */
    public static final String m5312k(String str, int i) {
        int iM5311j = i - m5311j(str);
        return iM5311j > 0 ? hk1.m2209h(str, wv2.m6009a0(" ", iM5311j)) : str;
    }

    /* JADX INFO: renamed from: l */
    public static final Bundle m5313l(ow1... ow1VarArr) {
        Bundle bundle = new Bundle(ow1VarArr.length);
        for (ow1 ow1Var : ow1VarArr) {
            String str = (String) ow1Var.f7862h;
            Object obj = ow1Var.f7863i;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        C0676s.m4651j(vi0.m5692k("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    C0676s.m4651j(vi0.m5692k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: m */
    public static final Set m5314m(yo2 yo2Var) {
        yo2Var.getClass();
        if (yo2Var instanceof InterfaceC0701so) {
            return ((InterfaceC0701so) yo2Var).mo254g();
        }
        HashSet hashSet = new HashSet(yo2Var.mo252d());
        int iMo252d = yo2Var.mo252d();
        for (int i = 0; i < iMo252d; i++) {
            hashSet.add(yo2Var.mo253e(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: n */
    public static Type m5315n(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new lr0(m5315n(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new mr0(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new lr0(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new nr0(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: o */
    public static final sm2 m5316o(sm2 sm2Var, bo0 bo0Var, int i) {
        return new sm2(((y03) bo0Var.f960e).m6201a(i), i, sm2Var.f10196c);
    }

    /* JADX INFO: renamed from: p */
    public static void m5317p(Type type) {
        rg3.m4483s(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX INFO: renamed from: q */
    public static final yo2[] m5318q(List list) {
        yo2[] yo2VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (yo2VarArr = (yo2[]) list.toArray(new yo2[0])) == null) ? f10825f : yo2VarArr;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m5319r(Collection collection, List list, yf1 yf1Var) {
        Class cls;
        if (collection.size() == list.size()) {
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                Class cls2 = (Class) list.get(i);
                Class clsM5303c0 = m5303c0(obj, yf1Var, null);
                cls = j93.class;
                Class<j93> clsM3691A = p40.m3691A(d72.m967a(cls));
                if (clsM5303c0.equals(clsM3691A != null ? clsM3691A : j93.class) || t11.m5086l(cls2, clsM5303c0)) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static uh1 m5320s(uh1 uh1Var, nn0 nn0Var) {
        return uh1Var.mo4491c(new C0477mx(nn0Var));
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m5321t(o62 o62Var, float f, float f2) {
        float f3 = o62Var.f7536a;
        if (f > o62Var.f7538c || f3 > f) {
            return false;
        }
        return f2 <= o62Var.f7539d && o62Var.f7537b <= f2;
    }

    /* JADX INFO: renamed from: u */
    public static final void m5322u(nc0 nc0Var, long j, float f, float f2) {
        float f3 = f / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)) - f3) - f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) / 2.0f;
        nc0.m3267O(nc0Var, j, f3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), null, 120);
    }

    /* JADX INFO: renamed from: v */
    public static final tm2 m5323v(tm2 tm2Var, er2 er2Var) {
        int iFollowing;
        bo0 bo0Var = (bo0) er2Var.f2578k;
        if (tm2Var != null) {
            sm2 sm2Var = tm2Var.f10849a;
            long j = sm2Var.f10196c;
            sm2 sm2Var2 = tm2Var.f10850b;
            if (j != sm2Var2.f10196c) {
                boolean z = tm2Var.f10851c;
                if ((z ? sm2Var : sm2Var2).f10195b != 0) {
                    return tm2Var;
                }
                if (z) {
                    sm2Var = sm2Var2;
                }
                if (((y03) bo0Var.f960e).f13266a.f12754a.f10051i.length() != sm2Var.f10195b) {
                    return tm2Var;
                }
            } else if (sm2Var.f10195b != sm2Var2.f10195b) {
                return tm2Var;
            }
        }
        tm2 tm2Var2 = (tm2) er2Var.f2577j;
        String str = ((y03) bo0Var.f960e).f13266a.f12754a.f10051i;
        if (tm2Var2 == null || str.length() == 0) {
            return tm2Var;
        }
        boolean z2 = er2Var.f2576i;
        String str2 = ((y03) bo0Var.f960e).f13266a.f12754a.f10051i;
        int i = bo0Var.f957b;
        int length = str2.length();
        if (i == 0) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str2);
            int iFollowing2 = characterInstance.following(0);
            return z2 ? tm2.m5332a(tm2Var, m5316o(tm2Var.f10849a, bo0Var, iFollowing2), null, true, 2) : tm2.m5332a(tm2Var, null, m5316o(tm2Var.f10850b, bo0Var, iFollowing2), false, 1);
        }
        if (i == length) {
            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
            characterInstance2.setText(str2);
            int iPreceding = characterInstance2.preceding(length);
            return z2 ? tm2.m5332a(tm2Var, m5316o(tm2Var.f10849a, bo0Var, iPreceding), null, false, 2) : tm2.m5332a(tm2Var, null, m5316o(tm2Var.f10850b, bo0Var, iPreceding), true, 1);
        }
        boolean z3 = tm2Var2.f10851c;
        if (z2 ^ z3) {
            BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
            characterInstance3.setText(str2);
            iFollowing = characterInstance3.preceding(i);
        } else {
            BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
            characterInstance4.setText(str2);
            iFollowing = characterInstance4.following(i);
        }
        return z2 ? tm2.m5332a(tm2Var, m5316o(tm2Var.f10849a, bo0Var, iFollowing), null, z3, 2) : tm2.m5332a(tm2Var, null, m5316o(tm2Var.f10850b, bo0Var, iFollowing), z3, 1);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m5324w(Type type, Type type2) {
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
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m5324w(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: x */
    public static int m5325x(HandwritingGesture handwritingGesture, C0792v c0792v) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c0792v.mo5j(new C0180ev(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: y */
    public static bj0 m5326y(uo2 uo2Var, yf1 yf1Var, String str, Object obj, mn0 mn0Var) {
        return new bj0(uo2Var, new C0575pc(obj, mn0Var, yf1Var, str, 6), 0);
    }

    /* JADX INFO: renamed from: z */
    public static C0784us m5327z(DexKitBridge dexKitBridge, C0185f c0185f) {
        dexKitBridge.getClass();
        int iM3661b = c0185f.m3661b(4);
        int i = iM3661b != 0 ? c0185f.f7869b.getInt(iM3661b + c0185f.f7868a) : 0;
        int iM3661b2 = c0185f.m3661b(6);
        int i2 = iM3661b2 != 0 ? c0185f.f7869b.getInt(iM3661b2 + c0185f.f7868a) : 0;
        int iM3661b3 = c0185f.m3661b(8);
        if (iM3661b3 != 0) {
            c0185f.m3663d(iM3661b3 + c0185f.f7868a);
        }
        int iM3661b4 = c0185f.m3661b(10);
        int i3 = iM3661b4 != 0 ? c0185f.f7869b.getInt(iM3661b4 + c0185f.f7868a) : 0;
        int iM3661b5 = c0185f.m3661b(12);
        String strM3663d = iM3661b5 != 0 ? c0185f.m3663d(iM3661b5 + c0185f.f7868a) : null;
        if (strM3663d == null) {
            strM3663d = "";
        }
        String str = strM3663d;
        int iM3661b6 = c0185f.m3661b(14);
        int i4 = iM3661b6 != 0 ? c0185f.f7869b.getInt(iM3661b6 + c0185f.f7868a) : 0;
        Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        ArrayList arrayList = new ArrayList();
        int iM3661b7 = c0185f.m3661b(16);
        int iM3665f = iM3661b7 != 0 ? c0185f.m3665f(iM3661b7) : 0;
        for (int i5 = 0; i5 < iM3665f; i5++) {
            int iM3661b8 = c0185f.m3661b(16);
            arrayList.add(Integer.valueOf(iM3661b8 != 0 ? c0185f.f7869b.getInt((i5 * 4) + c0185f.m3664e(iM3661b8)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM3661b9 = c0185f.m3661b(18);
        int iM3665f2 = iM3661b9 != 0 ? c0185f.m3665f(iM3661b9) : 0;
        for (int i6 = 0; i6 < iM3665f2; i6++) {
            int iM3661b10 = c0185f.m3661b(18);
            arrayList2.add(Integer.valueOf(iM3661b10 != 0 ? c0185f.f7869b.getInt((i6 * 4) + c0185f.m3664e(iM3661b10)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM3661b11 = c0185f.m3661b(20);
        int iM3665f3 = iM3661b11 != 0 ? c0185f.m3665f(iM3661b11) : 0;
        for (int i7 = 0; i7 < iM3665f3; i7++) {
            int iM3661b12 = c0185f.m3661b(20);
            arrayList3.add(Integer.valueOf(iM3661b12 != 0 ? c0185f.f7869b.getInt((i7 * 4) + c0185f.m3664e(iM3661b12)) : 0));
        }
        return new C0784us(dexKitBridge, i, i2, i3, str, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: H */
    public abstract Member mo2762H();

    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m5328R() {
        if (ig1.m2344a(mo2762H())) {
            return;
        }
        c80.m670n("Failed to make the member \"", this, "\" accessible. Please check if the member is accessible or if the security manager allows it.");
    }
}
