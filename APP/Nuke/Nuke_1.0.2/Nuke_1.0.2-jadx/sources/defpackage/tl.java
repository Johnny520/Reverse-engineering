package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tl {
    public static final ok a = new ok(-1.0f);
    public static final ok b = new ok(1.0f);
    public static final Object[] c = new Object[0];
    public static final Type[] d = new Type[0];
    public static final i51 e = new i51(4);
    public static final yo2[] f = new yo2[0];
    public static final Object g = new Object();
    public static final hj0 h = new hj0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int A(im0 im0Var, int i) {
        boolean z = t11.o(im0Var.h, im0.i.h) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vr2 B() {
        return (vr2) ds2.b.p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float C(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = a13.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : gy0.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float D(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = a13.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? gy0.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type E(Type type, Class cls, Class cls2) {
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
                    return E(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return E(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class F(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rg3.s(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) F(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return F(((WildcardType) type).getUpperBounds()[0]);
        }
        um2.j("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final mu2 G(ps2 ps2Var) {
        mu2 mu2Var = ps2Var.h;
        mu2Var.getClass();
        return (mu2) ds2.t(mu2Var, ps2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int I(ps2 ps2Var) {
        mu2 mu2Var = ps2Var.h;
        mu2Var.getClass();
        return ((mu2) ds2.h(mu2Var)).e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final t2 J(Object[] objArr) {
        objArr.getClass();
        return new t2(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vr2 K(vr2 vr2Var) {
        if (vr2Var instanceof a43) {
            a43 a43Var = (a43) vr2Var;
            if (a43Var.t == v93.b()) {
                a43Var.r = null;
                return vr2Var;
            }
        }
        if (vr2Var instanceof b43) {
            b43 b43Var = (b43) vr2Var;
            if (b43Var.i == v93.b()) {
                b43Var.h = null;
                return vr2Var;
            }
        }
        vr2 vr2VarG = ds2.g(vr2Var, null, false);
        vr2VarG.j();
        return vr2VarG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 L(px pxVar, uh1 uh1Var) {
        if (uh1Var.b(v6.B)) {
            return uh1Var;
        }
        ((go0) pxVar).S(1219399079, 0, null, null);
        uh1 uh1Var2 = (uh1) uh1Var.a(new n2(3, pxVar), rh1.a);
        ((go0) pxVar).p(false);
        return uh1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 M(px pxVar, uh1 uh1Var) {
        go0 go0Var = (go0) pxVar;
        go0Var.W(439770924);
        uh1 uh1VarL = L(go0Var, uh1Var);
        go0Var.p(false);
        return uh1VarL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean N(ps2 ps2Var, in0 in0Var) {
        int i;
        c3 c3Var;
        Object objJ;
        vr2 vr2VarJ;
        boolean zH;
        do {
            synchronized (g) {
                mu2 mu2Var = ps2Var.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            lz1 lz1VarE = c3Var.e();
            objJ = in0Var.j(lz1VarE);
            c3 c3VarC = lz1VarE.c();
            if (t11.l(c3VarC, c3Var)) {
                break;
            }
            mu2 mu2Var3 = ps2Var.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = h((mu2) ds2.w(mu2Var3, ps2Var, vr2VarJ), i, c3VarC, true);
            }
            ds2.n(vr2VarJ, ps2Var);
        } while (!zH);
        return ((Boolean) objJ).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 O(uh1 uh1Var, xm0 xm0Var) {
        uh1Var.getClass();
        xm0Var.getClass();
        return s(uh1Var, new hp1(6, new gp1(xm0Var, 0), true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object P(l70 l70Var, xm0 xm0Var) {
        vr2 a43Var;
        vr2 vr2Var = (vr2) ds2.b.p();
        if (vr2Var instanceof a43) {
            a43 a43Var2 = (a43) vr2Var;
            if (a43Var2.t == v93.b()) {
                in0 in0Var = a43Var2.r;
                in0 in0Var2 = a43Var2.s;
                try {
                    ((a43) vr2Var).r = ds2.k(l70Var, in0Var, true);
                    ((a43) vr2Var).s = in0Var2;
                    return xm0Var.a();
                } finally {
                    a43Var2.r = in0Var;
                    a43Var2.s = in0Var2;
                }
            }
        }
        if (vr2Var == null || (vr2Var instanceof wk1)) {
            a43Var = new a43(vr2Var instanceof wk1 ? (wk1) vr2Var : null, l70Var, null, true, false);
        } else {
            a43Var = vr2Var.u(l70Var);
        }
        try {
            vr2 vr2VarJ = a43Var.j();
            try {
                Object objA = xm0Var.a();
                vr2.q(vr2VarJ);
                a43Var.c();
                return objA;
            } catch (Throwable th) {
                vr2.q(vr2VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            a43Var.c();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Q(long j, sd sdVar, boolean z, v vVar) {
        if (z) {
            int i = f13.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(sdVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < sdVar.i.length() ? Character.codePointAt(sdVar, iCharCount2) : 10;
            if (p40.L(iCodePointBefore) && (p40.K(iCodePointAt) || p40.J(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(sdVar, iCharCount);
                    }
                } while (p40.L(iCodePointBefore));
                j = fg1.i(iCharCount, iCharCount2);
            } else if (p40.L(iCodePointAt) && (p40.K(iCodePointBefore) || p40.J(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == sdVar.i.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(sdVar, iCharCount2);
                    }
                } while (p40.L(iCodePointAt));
                j = fg1.i(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        vVar.j(new as0(new rd0[]{new mp2(i2, i2), new z60(f13.d(j), 0)}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x00d6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x0055 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:89:? */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type S(Type type, Class cls, Type type2, HashMap map) {
        Type typeS;
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
                    Type typeE = E(type, cls, cls3);
                    if (typeE instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable2.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) typeE).getActualTypeArguments()[i];
                            } else {
                                i++;
                            }
                        }
                        um2.b();
                        return null;
                    }
                    if (type2 != typeVariable2) {
                    }
                }
            } else if (type2 instanceof Class) {
                Class cls4 = (Class) type2;
                if (cls4.isArray()) {
                    Class<?> componentType = cls4.getComponentType();
                    Type typeS2 = S(type, cls, componentType, map);
                    if (Objects.equals(componentType, typeS2)) {
                        type2 = cls4;
                    } else {
                        mr0Var = new lr0(typeS2);
                        type2 = mr0Var;
                    }
                } else if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type typeS3 = S(type, cls, genericComponentType, map);
                    if (!Objects.equals(genericComponentType, typeS3)) {
                        mr0Var = new lr0(typeS3);
                        type2 = mr0Var;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type typeS4 = S(type, cls, ownerType, map);
                    boolean zEquals = Objects.equals(typeS4, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr = actualTypeArguments;
                    boolean z = false;
                    while (i < length2) {
                        Type typeS5 = S(type, cls, typeArr[i], map);
                        if (!Objects.equals(typeS5, typeArr[i])) {
                            if (!z) {
                                typeArr = (Type[]) typeArr.clone();
                                z = true;
                            }
                            typeArr[i] = typeS5;
                        }
                        i++;
                    }
                    if (!zEquals || z) {
                        mr0Var = new mr0(typeS4, (Class) type2.getRawType(), typeArr);
                        type2 = mr0Var;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeS6 = S(type, cls, lowerBounds[0], map);
                        if (typeS6 != lowerBounds[0]) {
                            type2 = new nr0(new Type[]{Object.class}, typeS6 instanceof WildcardType ? ((WildcardType) typeS6).getLowerBounds() : new Type[]{typeS6});
                        }
                    } else if (upperBounds.length == 1 && (typeS = S(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                        type2 = new nr0(typeS instanceof WildcardType ? ((WildcardType) typeS).getUpperBounds() : new Type[]{typeS}, d);
                    }
                }
            }
        }
        if (typeVariable != null) {
            map.put(typeVariable, type2);
        }
        return type2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List T(zf1 zf1Var, yf1 yf1Var, Class cls, in0 in0Var) throws NoSuchFieldException, NoSuchMethodException {
        Class cls2;
        List listT = be0.h;
        if (cls != null) {
            cls2 = Object.class;
            Class<Object> clsA = p40.A(d72.a(cls2));
            if (!cls.equals(clsA != null ? clsA : Object.class)) {
                Collection collection = (Collection) in0Var.j(cls);
                if (collection.isEmpty()) {
                    if (yf1Var.c) {
                        listT = T(zf1Var, yf1Var, cls.getSuperclass(), in0Var);
                    } else {
                        Z(zf1Var, yf1Var);
                    }
                    collection = listT;
                }
                return (List) collection;
            }
        }
        Z(zf1Var, yf1Var);
        return listT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void U(vr2 vr2Var, vr2 vr2Var2, in0 in0Var) {
        if (vr2Var != vr2Var2) {
            vr2Var2.getClass();
            vr2.q(vr2Var);
            vr2Var2.c();
        } else if (vr2Var instanceof a43) {
            ((a43) vr2Var).r = in0Var;
        } else if (vr2Var instanceof b43) {
            ((b43) vr2Var).h = in0Var;
        } else {
            c80.u("Non-transparent snapshot was reused: ", vr2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String V(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long W(o62 o62Var) {
        float f2 = o62Var.c - o62Var.a;
        return (((long) Float.floatToRawIntBits(o62Var.d - o62Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long X(String str, long j, long j2, long j3) {
        String property;
        int i = nx2.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lG0 = wv2.g0(property, 10);
        if (lG0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lG0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int Y(String str, int i, int i2) {
        return (int) X(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Z(zf1 zf1Var, yf1 yf1Var) throws NoSuchFieldException, NoSuchMethodException {
        Class cls;
        Object x92Var;
        String string;
        String strA;
        boolean z = yf1Var.c;
        Class cls2 = yf1Var.a;
        String str = z ? " (Also tried for superclass)" : "";
        String str2 = !z ? "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. " : "Check if the conditions are correct and valid, and try again. ";
        try {
            Map mapA = zf1Var.a();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapA.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    strA = value instanceof un0 ? "(Runtime Condition)" : ((value instanceof Collection) && ((Collection) value).isEmpty()) ? null : j93.a(value);
                }
                String strB0 = strA != null ? wv2.b0(strA.toString(), " (Kotlin reflection is not available)", "") : null;
                ow1 ow1Var = strB0 != null ? new ow1(str3, strB0) : null;
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
                    final int iJ = j((String) ((ow1) it.next()).h);
                    while (it.hasNext()) {
                        int iJ2 = j((String) ((ow1) it.next()).h);
                        if (iJ < iJ2) {
                            iJ = iJ2;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int iJ3 = j((String) ((ow1) it2.next()).i);
                    while (it2.hasNext()) {
                        int iJ4 = j((String) ((ow1) it2.next()).i);
                        if (iJ3 < iJ4) {
                            iJ3 = iJ4;
                        }
                    }
                    String strB02 = wv2.b0(cls2.toString(), " (Kotlin reflection is not available)", "");
                    int iJ5 = j(strB02) - ((iJ + iJ3) + 3);
                    if (iJ5 < 0) {
                        iJ5 = 0;
                    }
                    final int i = iJ3 + iJ5;
                    cls = cls2;
                    String str4 = "+-" + wv2.a0("-", iJ) + "-+-" + wv2.a0("-", i) + "-+";
                    int i2 = iJ + i + 3;
                    x92Var = du.u0(eu.P("+-" + wv2.a0("-", i2) + "-+", "| " + k(strB02, i2) + " |", str4, du.u0(arrayList, "\n", null, null, new in0() { // from class: dg1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.in0
                        public final Object j(Object obj) {
                            ow1 ow1Var2 = (ow1) obj;
                            return vi0.k("| ", tl.k((String) ow1Var2.h, iJ), " | ", tl.k((String) ow1Var2.i, i), " |");
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
        Object objConcat = wv2.b0(cls.toString(), " (Kotlin reflection is not available)", "").concat("\nFailed to build condition table.");
        if (x92Var instanceof x92) {
            x92Var = objConcat;
        }
        String str5 = (String) x92Var;
        boolean z2 = zf1Var instanceof sg1;
        if (z2) {
            StringBuilder sbO = vi0.o("No method found matching the condition for current class", str, ".\n", str5, "\nSuggestion: ");
            sbO.append(str2);
            string = sbO.toString();
        } else if (!(zf1Var instanceof hi0)) {
            c80.u("Unsupported condition type: ", zf1Var);
            return;
        } else {
            StringBuilder sbO2 = vi0.o("No field found matching the condition for current class", str, ".\n", str5, "\nSuggestion: ");
            sbO2.append(str2);
            string = sbO2.toString();
        }
        xf1 xf1Var = yf1Var.d;
        if (xf1Var != xf1.h) {
            if (xf1Var == xf1.i) {
                tp0.S(pv2.I0(string).toString(), null);
            }
        } else {
            if (z2) {
                throw new NoSuchMethodException(string.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
            }
            if (zf1Var instanceof hi0) {
                throw new NoSuchFieldException(string.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
            }
            c80.u("Unsupported condition type: ", zf1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sz0 sz0Var, uh1 uh1Var, String str, px pxVar, int i) {
        uh1 uh1Var2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1072881857);
        int i2 = i | (go0Var.f(sz0Var) ? 4 : 2) | 48 | (go0Var.f(str) ? 256 : 128);
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            rh1 rh1Var = rh1.a;
            uh1 uh1VarC = te.r0(rh1Var, 300.0f, 520.0f).c(te.e);
            fb2 fb2VarA = gb2.a(8.0f);
            tu2 tu2Var = ru.a;
            long j = ((pu) go0Var.j(tu2Var)).p;
            kw kwVarI0 = xe1.i0(1490904710, new s70(str, sz0Var), go0Var);
            my myVar = ow2.a;
            go0Var.W(89374938);
            pu puVar = (pu) go0Var.j(tu2Var);
            long j2 = puVar.a;
            long j3 = puVar.U;
            long j4 = puVar.Q;
            long j5 = puVar.M;
            long j6 = puVar.q;
            if (ju.c(j, j2)) {
                j3 = puVar.b;
            } else if (ju.c(j, puVar.f)) {
                j3 = puVar.g;
            } else if (ju.c(j, puVar.j)) {
                j3 = puVar.k;
            } else if (ju.c(j, puVar.n)) {
                j3 = puVar.o;
            } else if (ju.c(j, puVar.w)) {
                j3 = puVar.x;
            } else if (ju.c(j, puVar.c)) {
                j3 = puVar.d;
            } else if (ju.c(j, puVar.h)) {
                j3 = puVar.i;
            } else if (ju.c(j, puVar.l)) {
                j3 = puVar.m;
            } else if (ju.c(j, puVar.y)) {
                j3 = puVar.z;
            } else if (ju.c(j, puVar.u)) {
                j3 = puVar.v;
            } else if (!ju.c(j, puVar.p)) {
                if (ju.c(j, puVar.r)) {
                    j3 = puVar.s;
                } else if (ju.c(j, puVar.D) || ju.c(j, puVar.F) || ju.c(j, puVar.G) || ju.c(j, puVar.H) || ju.c(j, puVar.I) || ju.c(j, puVar.J) || ju.c(j, puVar.E)) {
                    j3 = j6;
                } else if (ju.c(j, puVar.K) || ju.c(j, puVar.L)) {
                    j3 = j5;
                } else if (ju.c(j, puVar.O) || ju.c(j, puVar.P)) {
                    j3 = j4;
                } else if (!ju.c(j, puVar.S) && !ju.c(j, puVar.T)) {
                    j3 = ju.g;
                }
            }
            if (j3 == 16) {
                j3 = ((ju) go0Var.j(c00.a)).a;
            }
            go0Var.p(false);
            my myVar2 = ow2.a;
            float f2 = ((za0) go0Var.j(myVar2)).h + 6.0f;
            ci0.b(new f42[]{c00.a.a(new ju(j3)), myVar2.a(new za0(f2))}, xe1.i0(421772006, new nw2(uh1VarC, fb2VarA, j, f2, kwVarI0), go0Var), go0Var, 56);
            uh1Var2 = rh1Var;
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new tt0(sz0Var, uh1Var2, str, i, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] a0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = c;
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
    public static final void b(xm0 xm0Var, uh1 uh1Var, j81 j81Var, w81 w81Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1055276397);
        int i2 = (go0Var.h(xm0Var) ? 4 : 2) | i | (go0Var.f(uh1Var) ? 32 : 16) | (go0Var.f(j81Var) ? 256 : 128) | (go0Var.f(w81Var) ? 2048 : 1024);
        if (go0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            op0.b(xe1.i0(-933153643, new b81(j81Var, uh1Var, w81Var, op0.x(xm0Var, go0Var), 0), go0Var), go0Var, 6);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new v1(xm0Var, uh1Var, j81Var, w81Var, i, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] b0(Collection collection, Object[] objArr) {
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
    public static final tm2 c(er2 er2Var, vl vlVar) {
        u20 u20VarB = er2Var.b();
        bo0 bo0Var = (bo0) er2Var.k;
        boolean z = u20VarB == u20.h;
        return new tm2(g(bo0Var, z, true, vlVar), g(bo0Var, z, false, vlVar), z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class c0(Object obj, yf1 yf1Var, String str) {
        Class<?> clsA;
        Object x92Var;
        Class cls;
        if (obj instanceof Class) {
            clsA = (Class) obj;
        } else if (obj instanceof bt) {
            clsA = p40.y((bt) obj);
        } else if (obj instanceof String) {
            xf1 xf1Var = yf1Var.d;
            Class cls2 = yf1Var.a;
            if (xf1Var == xf1.h) {
                clsA = dt.a(cls2.getClassLoader(), (String) obj);
            } else {
                try {
                    x92Var = dt.a(cls2.getClassLoader(), (String) obj);
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (x92Var instanceof x92) {
                    x92Var = null;
                }
                clsA = (Class) x92Var;
                if (clsA == null) {
                    clsA = fg1.class;
                    Class<?> clsA2 = p40.A(d72.a(clsA));
                    if (clsA2 != null) {
                        clsA = clsA2;
                    }
                }
            }
        } else {
            if (!(obj instanceof j93)) {
                s.h("Unsupported type: ", obj, ", supported types are Class, KClass, String and VagueType.");
                return null;
            }
            clsA = obj.getClass();
        }
        cls = j93.class;
        Class<j93> clsA3 = p40.A(d72.a(cls));
        if (!clsA.equals(clsA3 != null ? clsA3 : j93.class) || str == null) {
            return clsA;
        }
        s.h("VagueType is not supported for \"", str, "\".");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float d(rz1 rz1Var, boolean z, gu0[] gu0VarArr, float f2) {
        float f3 = Float.NaN;
        for (gu0 gu0Var : gu0VarArr) {
            float fC = rz1Var.c(gu0Var);
            if (Float.isNaN(f3)) {
                f3 = fC;
            } else if (z == (fC > f3)) {
            }
        }
        return Float.isNaN(f3) ? f2 : f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sm2 e(final er2 er2Var, final bo0 bo0Var, sm2 sm2Var) {
        int i = bo0Var.c;
        int i2 = bo0Var.b;
        boolean z = er2Var.i;
        final int i3 = z ? i2 : i;
        y03 y03Var = (y03) bo0Var.e;
        int i4 = bo0Var.d;
        mv0 mv0Var = new mv0(bo0Var, i3);
        i91 i91Var = i91.i;
        final j71 j71VarB = p7.B(i91Var, mv0Var);
        final int i5 = z ? i : i2;
        j71 j71VarB2 = p7.B(i91Var, new xm0() { // from class: wm2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                bo0 bo0Var2 = bo0Var;
                y03 y03Var2 = (y03) bo0Var2.e;
                int iIntValue = ((Number) j71VarB.getValue()).intValue();
                er2 er2Var2 = er2Var;
                boolean z2 = er2Var2.i;
                boolean z3 = er2Var2.b() == u20.h;
                int i6 = i3;
                long jI = y03Var2.i(i6);
                lj1 lj1Var = y03Var2.b;
                int i7 = f13.c;
                int iF = (int) (jI >> 32);
                int iD = lj1Var.d(iF);
                int i8 = lj1Var.f;
                if (iD != iIntValue) {
                    iF = iIntValue >= i8 ? y03Var2.f(i8 - 1) : y03Var2.f(iIntValue);
                }
                int iC = (int) (jI & 4294967295L);
                if (lj1Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i8 ? lj1Var.c(i8 - 1, false) : lj1Var.c(iIntValue, false);
                }
                int i9 = i5;
                if (iF == i9) {
                    return bo0Var2.a(iC);
                }
                if (iC == i9) {
                    return bo0Var2.a(iF);
                }
                if (!(z2 ^ z3) ? i6 >= iF : i6 > iC) {
                    iF = iC;
                }
                return bo0Var2.a(iF);
            }
        });
        if (1 != sm2Var.c) {
            return (sm2) j71VarB2.getValue();
        }
        if (i3 == i4) {
            return sm2Var;
        }
        if (((Number) j71VarB.getValue()).intValue() != y03Var.b.d(i4)) {
            return (sm2) j71VarB2.getValue();
        }
        int i6 = sm2Var.b;
        long jI = y03Var.i(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                u20 u20Var = u20.h;
                if (!(((i2 < i ? u20.i : i2 > i ? u20Var : u20.j) == u20Var) ^ z)) {
                }
            }
            return bo0Var.a(i3);
        }
        int i7 = f13.c;
        return (i6 == ((int) (jI >> 32)) || i6 == ((int) (4294967295L & jI))) ? (sm2) j71VarB2.getValue() : bo0Var.a(i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sm2 g(bo0 bo0Var, boolean z, boolean z2, vl vlVar) {
        long j;
        long jF = vlVar.f(bo0Var, z2 ? bo0Var.b : bo0Var.c);
        if (z ^ z2) {
            int i = f13.c;
            j = jF >> 32;
        } else {
            int i2 = f13.c;
            j = 4294967295L & jF;
        }
        return bo0Var.a((int) j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean h(mu2 mu2Var, int i, c3 c3Var, boolean z) {
        boolean z2;
        synchronized (g) {
            try {
                int i2 = mu2Var.d;
                if (i2 == i) {
                    mu2Var.c = c3Var;
                    z2 = true;
                    if (z) {
                        mu2Var.e++;
                    }
                    mu2Var.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bj0 i(ng ngVar, zf1 zf1Var, yf1 yf1Var) {
        byte b2 = 0;
        return y(y(y(y(y(y(y(y(y(y(new bj0(ngVar, new nx0(26), 1), yf1Var, "name", zf1Var.b, new z81(29)), yf1Var, "nameCondition", null, new eg1(b2, b2)), yf1Var, "modifiers", zf1Var.c, new eg1(b2, 1)), yf1Var, "modifiersNot", zf1Var.d, new eg1(b2, 2)), yf1Var, "modifiersCondition", null, new eg1(b2, 3)), yf1Var, "isSynthetic", null, new eg1(b2, 4)), yf1Var, "isSyntheticNot", null, new eg1(b2, 6)), yf1Var, "annotations", zf1Var.e, new cg1(yf1Var, 8)), yf1Var, "annotationsNot", zf1Var.f, new cg1(yf1Var, 9)), yf1Var, "genericString", null, new eg1(b2, 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int j(String str) {
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j += ((long) str.charAt(i)) > 127 ? 2L : 1L;
        }
        return (int) j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String k(String str, int i) {
        int iJ = i - j(str);
        return iJ > 0 ? hk1.h(str, wv2.a0(" ", iJ)) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bundle l(ow1... ow1VarArr) {
        Bundle bundle = new Bundle(ow1VarArr.length);
        for (ow1 ow1Var : ow1VarArr) {
            String str = (String) ow1Var.h;
            Object obj = ow1Var.i;
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
                        s.j(vi0.k("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
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
                    s.j(vi0.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Set m(yo2 yo2Var) {
        yo2Var.getClass();
        if (yo2Var instanceof so) {
            return ((so) yo2Var).g();
        }
        HashSet hashSet = new HashSet(yo2Var.d());
        int iD = yo2Var.d();
        for (int i = 0; i < iD; i++) {
            hashSet.add(yo2Var.e(i));
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type n(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new lr0(n(cls.getComponentType())) : cls;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sm2 o(sm2 sm2Var, bo0 bo0Var, int i) {
        return new sm2(((y03) bo0Var.e).a(i), i, sm2Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void p(Type type) {
        rg3.s(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yo2[] q(List list) {
        yo2[] yo2VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (yo2VarArr = (yo2[]) list.toArray(new yo2[0])) == null) ? f : yo2VarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean r(Collection collection, List list, yf1 yf1Var) {
        Class cls;
        if (collection.size() == list.size()) {
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                Class cls2 = (Class) list.get(i);
                Class clsC0 = c0(obj, yf1Var, null);
                cls = j93.class;
                Class<j93> clsA = p40.A(d72.a(cls));
                if (clsC0.equals(clsA != null ? clsA : j93.class) || t11.l(cls2, clsC0)) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 s(uh1 uh1Var, nn0 nn0Var) {
        return uh1Var.c(new mx(nn0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean t(o62 o62Var, float f2, float f3) {
        float f4 = o62Var.a;
        if (f2 > o62Var.c || f4 > f2) {
            return false;
        }
        return f3 <= o62Var.d && o62Var.b <= f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void u(nc0 nc0Var, long j, float f2, float f3) {
        float f4 = f2 / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (nc0Var.d() >> 32)) - f4) - f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) / 2.0f;
        nc0.O(nc0Var, j, f4, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), null, 120);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final tm2 v(tm2 tm2Var, er2 er2Var) {
        int iFollowing;
        bo0 bo0Var = (bo0) er2Var.k;
        if (tm2Var != null) {
            sm2 sm2Var = tm2Var.a;
            long j = sm2Var.c;
            sm2 sm2Var2 = tm2Var.b;
            if (j != sm2Var2.c) {
                boolean z = tm2Var.c;
                if ((z ? sm2Var : sm2Var2).b != 0) {
                    return tm2Var;
                }
                if (z) {
                    sm2Var = sm2Var2;
                }
                if (((y03) bo0Var.e).a.a.i.length() != sm2Var.b) {
                    return tm2Var;
                }
            } else if (sm2Var.b != sm2Var2.b) {
                return tm2Var;
            }
        }
        tm2 tm2Var2 = (tm2) er2Var.j;
        String str = ((y03) bo0Var.e).a.a.i;
        if (tm2Var2 == null || str.length() == 0) {
            return tm2Var;
        }
        boolean z2 = er2Var.i;
        String str2 = ((y03) bo0Var.e).a.a.i;
        int i = bo0Var.b;
        int length = str2.length();
        if (i == 0) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str2);
            int iFollowing2 = characterInstance.following(0);
            return z2 ? tm2.a(tm2Var, o(tm2Var.a, bo0Var, iFollowing2), null, true, 2) : tm2.a(tm2Var, null, o(tm2Var.b, bo0Var, iFollowing2), false, 1);
        }
        if (i == length) {
            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
            characterInstance2.setText(str2);
            int iPreceding = characterInstance2.preceding(length);
            return z2 ? tm2.a(tm2Var, o(tm2Var.a, bo0Var, iPreceding), null, false, 2) : tm2.a(tm2Var, null, o(tm2Var.b, bo0Var, iPreceding), true, 1);
        }
        boolean z3 = tm2Var2.c;
        if (z2 ^ z3) {
            BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
            characterInstance3.setText(str2);
            iFollowing = characterInstance3.preceding(i);
        } else {
            BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
            characterInstance4.setText(str2);
            iFollowing = characterInstance4.following(i);
        }
        return z2 ? tm2.a(tm2Var, o(tm2Var.a, bo0Var, iFollowing), null, z3, 2) : tm2.a(tm2Var, null, o(tm2Var.b, bo0Var, iFollowing), z3, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean w(Type type, Type type2) {
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
                return w(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int x(HandwritingGesture handwritingGesture, v vVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        vVar.j(new ev(fallbackText, 1));
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bj0 y(uo2 uo2Var, yf1 yf1Var, String str, Object obj, mn0 mn0Var) {
        return new bj0(uo2Var, new pc(obj, mn0Var, yf1Var, str, 6), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static us z(DexKitBridge dexKitBridge, f fVar) {
        dexKitBridge.getClass();
        int iB = fVar.b(4);
        int i = iB != 0 ? fVar.b.getInt(iB + fVar.a) : 0;
        int iB2 = fVar.b(6);
        int i2 = iB2 != 0 ? fVar.b.getInt(iB2 + fVar.a) : 0;
        int iB3 = fVar.b(8);
        if (iB3 != 0) {
            fVar.d(iB3 + fVar.a);
        }
        int iB4 = fVar.b(10);
        int i3 = iB4 != 0 ? fVar.b.getInt(iB4 + fVar.a) : 0;
        int iB5 = fVar.b(12);
        String strD = iB5 != 0 ? fVar.d(iB5 + fVar.a) : null;
        if (strD == null) {
            strD = "";
        }
        String str = strD;
        int iB6 = fVar.b(14);
        int i4 = iB6 != 0 ? fVar.b.getInt(iB6 + fVar.a) : 0;
        Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        ArrayList arrayList = new ArrayList();
        int iB7 = fVar.b(16);
        int iF = iB7 != 0 ? fVar.f(iB7) : 0;
        for (int i5 = 0; i5 < iF; i5++) {
            int iB8 = fVar.b(16);
            arrayList.add(Integer.valueOf(iB8 != 0 ? fVar.b.getInt((i5 * 4) + fVar.e(iB8)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iB9 = fVar.b(18);
        int iF2 = iB9 != 0 ? fVar.f(iB9) : 0;
        for (int i6 = 0; i6 < iF2; i6++) {
            int iB10 = fVar.b(18);
            arrayList2.add(Integer.valueOf(iB10 != 0 ? fVar.b.getInt((i6 * 4) + fVar.e(iB10)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iB11 = fVar.b(20);
        int iF3 = iB11 != 0 ? fVar.f(iB11) : 0;
        for (int i7 = 0; i7 < iF3; i7++) {
            int iB12 = fVar.b(20);
            arrayList3.add(Integer.valueOf(iB12 != 0 ? fVar.b.getInt((i7 * 4) + fVar.e(iB12)) : 0));
        }
        return new us(dexKitBridge, i, i2, i3, str, numValueOf, arrayList, arrayList2, arrayList3);
    }

    public abstract Member H();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ void R() {
        if (ig1.a(H())) {
            return;
        }
        c80.n("Failed to make the member \"", this, "\" accessible. Please check if the member is accessible or if the security manager allows it.");
    }
}
