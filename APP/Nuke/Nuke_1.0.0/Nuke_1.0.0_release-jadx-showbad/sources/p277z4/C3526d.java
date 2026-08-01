package p277z4;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.luckypray.dexkit.util.NativeReflect;
import p001A0.C0102b;
import p007B0.C0173F;
import p049I2.AbstractC0797o;
import p056K2.AbstractC0885k;
import p056K2.C0884j;
import p056K2.C0887m;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p149d3.AbstractC1976d;
import p271y4.AbstractC3501c;
import p271y4.AbstractC3502d;

/* JADX INFO: renamed from: z4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3526d {

    /* JADX INFO: renamed from: a */
    public final String f10986a;

    /* JADX INFO: renamed from: b */
    public final String f10987b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f10988c;

    /* JADX INFO: renamed from: d */
    public final String f10989d;

    /* JADX INFO: renamed from: e */
    public final C0887m f10990e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3526d(String str) {
        int i5;
        AbstractC1665j.m2985e(str, "descriptor");
        this.f10990e = AbstractC0797o.m1396u(new C0102b(21, this));
        int iM3634b0 = 0;
        int iM3635c0 = AbstractC1976d.m3635c0(str, "->", 0, 6);
        int iM3635c02 = AbstractC1976d.m3635c0(str, "(", iM3635c0 + 1, 4);
        int i6 = iM3635c02 + 1;
        int iM3635c03 = AbstractC1976d.m3635c0(str, ")", i6, 4);
        if (iM3635c0 == -1 || iM3635c02 == -1 || iM3635c03 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        String strSubstring = str.substring(0, iM3635c0);
        AbstractC1665j.m2984d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f10986a = AbstractC3501c.m5755c(strSubstring);
        String strSubstring2 = str.substring(iM3635c0 + 2, iM3635c02);
        AbstractC1665j.m2984d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f10987b = strSubstring2;
        String strSubstring3 = str.substring(i6, iM3635c03);
        AbstractC1665j.m2984d(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i5 = iM3634b0;
            while (iM3634b0 < strSubstring3.length()) {
                char cCharAt = strSubstring3.charAt(iM3634b0);
                if (cCharAt == '[') {
                    iM3634b0++;
                } else {
                    if (cCharAt == 'L') {
                        iM3634b0 = AbstractC1976d.m3634b0(strSubstring3, ';', iM3634b0, 4);
                    }
                    iM3634b0++;
                    String strSubstring4 = strSubstring3.substring(i5, iM3634b0);
                    AbstractC1665j.m2984d(strSubstring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(AbstractC3501c.m5755c(strSubstring4));
                }
            }
            break loop0;
        }
        if (i5 != iM3634b0) {
            throw new IllegalStateException("Unknown signString: ".concat(strSubstring3));
        }
        this.f10988c = arrayList;
        String strSubstring5 = str.substring(iM3635c03 + 1);
        AbstractC1665j.m2984d(strSubstring5, "(this as java.lang.String).substring(startIndex)");
        this.f10989d = AbstractC3501c.m5755c(strSubstring5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Method m5774a(ClassLoader classLoader, Boolean bool) throws NoSuchMethodException {
        Object array;
        Object objM3229o;
        Object objM3229o2;
        Object objM3229o3;
        AbstractC1665j.m2985e(classLoader, "classLoader");
        C0173F c0173f = AbstractC3502d.f10910a;
        String str = this.f10987b;
        if (AbstractC1665j.m2981a(str, "<clinit>") || AbstractC1665j.m2981a(str, "<init>")) {
            throw new IllegalArgumentException((this + " not a method").toString());
        }
        Class clsM5758a = AbstractC3502d.m5758a(classLoader, this.f10986a);
        ArrayList arrayList = this.f10988c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    objM3229o3 = AbstractC3502d.m5758a(classLoader, (String) it.next());
                } catch (Throwable th) {
                    objM3229o3 = AbstractC1784a.m3229o(th);
                }
                Throwable thM1902a = AbstractC0885k.m1902a(objM3229o3);
                if (thM1902a != null) {
                    array = AbstractC1784a.m3229o(thM1902a);
                    break;
                }
                arrayList2.add((Class) objM3229o3);
            } else {
                array = arrayList2.toArray(new Class[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        Throwable thM1902a2 = AbstractC0885k.m1902a(array);
        if (thM1902a2 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM1902a2);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) array;
        try {
            objM3229o = AbstractC3502d.m5758a(classLoader, this.f10989d);
        } catch (Throwable th2) {
            objM3229o = AbstractC1784a.m3229o(th2);
        }
        Throwable thM1902a3 = AbstractC0885k.m1902a(objM3229o);
        if (thM1902a3 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + this + " not available: return type missing");
            noSuchMethodException2.initCause(thM1902a3);
            throw noSuchMethodException2;
        }
        Class cls = (Class) objM3229o;
        for (Class superclass = clsM5758a; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                objM3229o2 = declaredMethod;
            } catch (Throwable th3) {
                objM3229o2 = AbstractC1784a.m3229o(th3);
            }
            boolean z5 = objM3229o2 instanceof C0884j;
            Object obj = objM3229o2;
            if (z5) {
                obj = null;
            }
            Method method = (Method) obj;
            if (method != null && AbstractC1665j.m2981a(method.getReturnType(), cls)) {
                return method;
            }
        }
        Class superclass2 = clsM5758a;
        while (true) {
            C0887m c0887m = this.f10990e;
            if (superclass2 == null) {
                break;
            }
            try {
                Method[] declaredMethods = superclass2.getDeclaredMethods();
                AbstractC1665j.m2984d(declaredMethods, "clz.declaredMethods");
                for (Method method2 : declaredMethods) {
                    if (AbstractC1665j.m2981a(method2.getName(), str) && AbstractC1665j.m2981a((String) c0887m.getValue(), AbstractC3501c.m5753a(method2))) {
                        method2.setAccessible(true);
                        return method2;
                    }
                }
                superclass2 = superclass2.getSuperclass();
            } catch (Throwable unused) {
                Member reflectedMethod = NativeReflect.getReflectedMethod(clsM5758a, str, (String) c0887m.getValue(), bool);
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
        if (!(obj instanceof C3526d)) {
            return false;
        }
        C3526d c3526d = (C3526d) obj;
        return AbstractC1665j.m2981a(this.f10986a, c3526d.f10986a) && AbstractC1665j.m2981a(this.f10987b, c3526d.f10987b) && AbstractC1665j.m2981a(this.f10988c, c3526d.f10988c) && AbstractC1665j.m2981a(this.f10989d, c3526d.f10989d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10989d.hashCode() + (this.f10988c.hashCode() * 31) + (this.f10987b.hashCode() * 31) + (this.f10986a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = AbstractC3501c.m5757e(this.f10986a) + "->" + this.f10987b + ((String) this.f10990e.getValue());
        AbstractC1665j.m2984d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public C3526d(Method method) {
        this.f10990e = AbstractC0797o.m1396u(new C0102b(21, this));
        Class<?> declaringClass = method.getDeclaringClass();
        AbstractC1665j.m2984d(declaringClass, "method.declaringClass");
        this.f10986a = AbstractC3501c.m5754b(declaringClass);
        String name = method.getName();
        AbstractC1665j.m2984d(name, "method.name");
        this.f10987b = name;
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC1665j.m2984d(parameterTypes, "method.parameterTypes");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            AbstractC1665j.m2984d(cls, "it");
            arrayList.add(AbstractC3501c.m5754b(cls));
        }
        this.f10988c = arrayList;
        Class<?> returnType = method.getReturnType();
        AbstractC1665j.m2984d(returnType, "method.returnType");
        this.f10989d = AbstractC3501c.m5754b(returnType);
    }
}
