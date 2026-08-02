package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.luckypray.dexkit.util.NativeReflect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g80 {

    /* JADX INFO: renamed from: a */
    public final String f3346a;

    /* JADX INFO: renamed from: b */
    public final String f3347b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3348c;

    /* JADX INFO: renamed from: d */
    public final String f3349d;

    /* JADX INFO: renamed from: e */
    public final hx2 f3350e;

    public g80(String str) {
        int i;
        str.getClass();
        this.f3350e = new hx2(new C0159ea(8, this));
        int iM4003p0 = 0;
        int iM4004q0 = pv2.m4004q0(str, "->", 0, false, 6);
        int iM4004q02 = pv2.m4004q0(str, "(", iM4004q0 + 1, false, 4);
        int i2 = iM4004q02 + 1;
        int iM4004q03 = pv2.m4004q0(str, ")", i2, false, 4);
        if (iM4004q0 == -1 || iM4004q02 == -1 || iM4004q03 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f3346a = i80.m2300c(str.substring(0, iM4004q0));
        this.f3347b = str.substring(iM4004q0 + 2, iM4004q02);
        String strSubstring = str.substring(i2, iM4004q03);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM4003p0;
            while (iM4003p0 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(iM4003p0);
                if (cCharAt == '[') {
                    iM4003p0++;
                } else {
                    if (cCharAt == 'L') {
                        iM4003p0 = pv2.m4003p0(strSubstring, ';', iM4003p0, 4);
                    }
                    iM4003p0++;
                    arrayList.add(i80.m2300c(strSubstring.substring(i, iM4003p0)));
                }
            }
            break loop0;
        }
        if (i != iM4003p0) {
            C0676s.m4653l("Unknown signString: ".concat(strSubstring));
            throw null;
        }
        this.f3348c = arrayList;
        this.f3349d = i80.m2300c(str.substring(iM4004q03 + 1));
    }

    /* JADX INFO: renamed from: a */
    public final Method m1811a(ClassLoader classLoader, Boolean bool) throws NoSuchMethodException {
        Object array;
        Object x92Var;
        Object x92Var2;
        Object x92Var3;
        classLoader.getClass();
        kj1 kj1Var = m01.f6424a;
        String str = this.f3347b;
        if (t11.m5086l(str, "<clinit>") || t11.m5086l(str, "<init>")) {
            throw new IllegalArgumentException((this + " not a method").toString());
        }
        Class clsM3022a = m01.m3022a(classLoader, this.f3346a);
        ArrayList arrayList = this.f3348c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    x92Var3 = m01.m3022a(classLoader, (String) it.next());
                } catch (Throwable th) {
                    x92Var3 = new x92(th);
                }
                Throwable thM6237a = y92.m6237a(x92Var3);
                if (thM6237a != null) {
                    array = new x92(thM6237a);
                    break;
                }
                arrayList2.add((Class) x92Var3);
            } else {
                array = arrayList2.toArray(new Class[0]);
                if (array == null) {
                    um2.m5516f("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
            }
        }
        Throwable thM6237a2 = y92.m6237a(array);
        if (thM6237a2 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM6237a2);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) array;
        try {
            x92Var = m01.m3022a(classLoader, this.f3349d);
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        Throwable thM6237a3 = y92.m6237a(x92Var);
        if (thM6237a3 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + this + " not available: return type missing");
            noSuchMethodException2.initCause(thM6237a3);
            throw noSuchMethodException2;
        }
        Class cls = (Class) x92Var;
        for (Class superclass = clsM3022a; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                x92Var2 = declaredMethod;
            } catch (Throwable th3) {
                x92Var2 = new x92(th3);
            }
            boolean z = x92Var2 instanceof x92;
            Object obj = x92Var2;
            if (z) {
                obj = null;
            }
            Method method = (Method) obj;
            if (method != null && t11.m5086l(method.getReturnType(), cls)) {
                return method;
            }
        }
        Class superclass2 = clsM3022a;
        while (true) {
            hx2 hx2Var = this.f3350e;
            if (superclass2 == null) {
                break;
            }
            try {
                Method[] declaredMethods = superclass2.getDeclaredMethods();
                declaredMethods.getClass();
                for (Method method2 : declaredMethods) {
                    if (t11.m5086l(method2.getName(), str) && t11.m5086l((String) hx2Var.getValue(), i80.m2298a(method2))) {
                        method2.setAccessible(true);
                        return method2;
                    }
                }
                superclass2 = superclass2.getSuperclass();
            } catch (Throwable unused) {
                Member reflectedMethod = NativeReflect.getReflectedMethod(clsM3022a, str, (String) hx2Var.getValue(), bool);
                if (reflectedMethod != null) {
                    Method method3 = (Method) reflectedMethod;
                    method3.setAccessible(true);
                    return method3;
                }
                throw new NoSuchMethodException("Method " + this + " not found");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return t11.m5086l(this.f3346a, g80Var.f3346a) && t11.m5086l(this.f3347b, g80Var.f3347b) && t11.m5086l(this.f3348c, g80Var.f3348c) && t11.m5086l(this.f3349d, g80Var.f3349d);
    }

    public final int hashCode() {
        return this.f3349d.hashCode() + (this.f3348c.hashCode() * 31) + (this.f3347b.hashCode() * 31) + (this.f3346a.hashCode() * 31);
    }

    public final String toString() {
        return i80.m2302e(this.f3346a) + "->" + this.f3347b + ((String) this.f3350e.getValue());
    }

    public g80(Method method) {
        this.f3350e = new hx2(new C0159ea(8, this));
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        this.f3346a = i80.m2299b(declaringClass);
        String name = method.getName();
        name.getClass();
        this.f3347b = name;
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            arrayList.add(i80.m2299b(cls));
        }
        this.f3348c = arrayList;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.f3349d = i80.m2299b(returnType);
    }
}
