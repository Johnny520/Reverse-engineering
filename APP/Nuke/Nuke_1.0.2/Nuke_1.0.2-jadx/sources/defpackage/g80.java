package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.luckypray.dexkit.util.NativeReflect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g80 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final hx2 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g80(String str) {
        int i;
        str.getClass();
        this.e = new hx2(new ea(8, this));
        int iP0 = 0;
        int iQ0 = pv2.q0(str, "->", 0, false, 6);
        int iQ02 = pv2.q0(str, "(", iQ0 + 1, false, 4);
        int i2 = iQ02 + 1;
        int iQ03 = pv2.q0(str, ")", i2, false, 4);
        if (iQ0 == -1 || iQ02 == -1 || iQ03 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.a = i80.c(str.substring(0, iQ0));
        this.b = str.substring(iQ0 + 2, iQ02);
        String strSubstring = str.substring(i2, iQ03);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iP0;
            while (iP0 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(iP0);
                if (cCharAt == '[') {
                    iP0++;
                } else {
                    if (cCharAt == 'L') {
                        iP0 = pv2.p0(strSubstring, ';', iP0, 4);
                    }
                    iP0++;
                    arrayList.add(i80.c(strSubstring.substring(i, iP0)));
                }
            }
            break loop0;
        }
        if (i != iP0) {
            s.l("Unknown signString: ".concat(strSubstring));
            throw null;
        }
        this.c = arrayList;
        this.d = i80.c(str.substring(iQ03 + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Method a(ClassLoader classLoader, Boolean bool) throws NoSuchMethodException {
        Object array;
        Object x92Var;
        Object x92Var2;
        Object x92Var3;
        classLoader.getClass();
        kj1 kj1Var = m01.a;
        String str = this.b;
        if (t11.l(str, "<clinit>") || t11.l(str, "<init>")) {
            throw new IllegalArgumentException((this + " not a method").toString());
        }
        Class clsA = m01.a(classLoader, this.a);
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    x92Var3 = m01.a(classLoader, (String) it.next());
                } catch (Throwable th) {
                    x92Var3 = new x92(th);
                }
                Throwable thA = y92.a(x92Var3);
                if (thA != null) {
                    array = new x92(thA);
                    break;
                }
                arrayList2.add((Class) x92Var3);
            } else {
                array = arrayList2.toArray(new Class[0]);
                if (array == null) {
                    um2.f("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
            }
        }
        Throwable thA2 = y92.a(array);
        if (thA2 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thA2);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) array;
        try {
            x92Var = m01.a(classLoader, this.d);
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        Throwable thA3 = y92.a(x92Var);
        if (thA3 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + this + " not available: return type missing");
            noSuchMethodException2.initCause(thA3);
            throw noSuchMethodException2;
        }
        Class cls = (Class) x92Var;
        for (Class superclass = clsA; superclass != null; superclass = superclass.getSuperclass()) {
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
            if (method != null && t11.l(method.getReturnType(), cls)) {
                return method;
            }
        }
        Class superclass2 = clsA;
        while (true) {
            hx2 hx2Var = this.e;
            if (superclass2 == null) {
                break;
            }
            try {
                Method[] declaredMethods = superclass2.getDeclaredMethods();
                declaredMethods.getClass();
                for (Method method2 : declaredMethods) {
                    if (t11.l(method2.getName(), str) && t11.l((String) hx2Var.getValue(), i80.a(method2))) {
                        method2.setAccessible(true);
                        return method2;
                    }
                }
                superclass2 = superclass2.getSuperclass();
            } catch (Throwable unused) {
                Member reflectedMethod = NativeReflect.getReflectedMethod(clsA, str, (String) hx2Var.getValue(), bool);
                if (reflectedMethod != null) {
                    Method method3 = (Method) reflectedMethod;
                    method3.setAccessible(true);
                    return method3;
                }
                throw new NoSuchMethodException("Method " + this + " not found");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return t11.l(this.a, g80Var.a) && t11.l(this.b, g80Var.b) && t11.l(this.c, g80Var.c) && t11.l(this.d, g80Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return i80.e(this.a) + "->" + this.b + ((String) this.e.getValue());
    }

    public g80(Method method) {
        this.e = new hx2(new ea(8, this));
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        this.a = i80.b(declaringClass);
        String name = method.getName();
        name.getClass();
        this.b = name;
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            arrayList.add(i80.b(cls));
        }
        this.c = arrayList;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.d = i80.b(returnType);
    }
}
