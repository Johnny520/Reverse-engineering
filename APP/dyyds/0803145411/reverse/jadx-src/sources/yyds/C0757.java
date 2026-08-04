package yyds;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import org.luckypray.dexkit.util.NativeReflect;

/* JADX INFO: renamed from: yyds.ᛳᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0757 implements InterfaceC1863 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0078 f3501 = new C0078(new C1223(6, this));

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f3502;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f3503;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f3504;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f3505;

    public C0757(String str) {
        int i;
        int iM1290 = 0;
        int iM1311 = AbstractC0473.m1311(str, "->", 0, false, 6);
        int iM13112 = AbstractC0473.m1311(str, "(", iM1311 + 1, false, 4);
        int i2 = iM13112 + 1;
        int iM13113 = AbstractC0473.m1311(str, ")", i2, false, 4);
        if (iM1311 == -1 || iM13112 == -1 || iM13113 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f3502 = AbstractC2431.m4474(str.substring(0, iM1311));
        this.f3503 = str.substring(iM1311 + 2, iM13112);
        String strSubstring = str.substring(i2, iM13113);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM1290;
            while (iM1290 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(iM1290);
                if (cCharAt == 'L') {
                    iM1290 = AbstractC0473.m1290(strSubstring, ';', iM1290, 4);
                } else if (cCharAt != '[') {
                    break;
                } else {
                    iM1290++;
                }
                iM1290++;
                arrayList.add(AbstractC2431.m4474(strSubstring.substring(i, iM1290)));
            }
            break loop0;
        }
        if (i != iM1290) {
            C0188.m800("Unknown signString: ".concat(strSubstring));
            throw null;
        }
        this.f3504 = arrayList;
        this.f3505 = AbstractC2431.m4474(str.substring(iM13113 + 1));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Method m1702(C0757 c0757, ClassLoader classLoader) throws NoSuchMethodException {
        Object c2658;
        Object c26582;
        c0757.getClass();
        C0078 c0078 = c0757.f3501;
        C0299 c0299 = AbstractC1962.f9855;
        String str = c0757.f3503;
        if (AbstractC1544.m3188(str, "<clinit>") || c0757.m1704()) {
            throw new IllegalArgumentException((c0757 + " not a method").toString());
        }
        Class clsM3794 = AbstractC1962.m3794(classLoader, c0757.f3502);
        Object objM3795 = AbstractC1962.m3795(classLoader, c0757.f3504);
        Throwable thM4249 = C2248.m4249(objM3795);
        if (thM4249 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + c0757 + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM4249);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM3795;
        try {
            c2658 = AbstractC1962.m3794(classLoader, c0757.f3505);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM42492 = C2248.m4249(c2658);
        if (thM42492 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + c0757 + " not available: return type missing");
            noSuchMethodException2.initCause(thM42492);
            throw noSuchMethodException2;
        }
        Class cls = (Class) c2658;
        Class superclass = clsM3794;
        while (true) {
            if (superclass == null) {
                for (Class superclass2 = clsM3794; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    try {
                        Method[] declaredMethods = superclass2.getDeclaredMethods();
                        int i = 0;
                        while (i < declaredMethods.length) {
                            int i2 = i + 1;
                            try {
                                Method method = declaredMethods[i];
                                if (AbstractC1544.m3188(method.getName(), str) && AbstractC1544.m3188((String) c0078.getValue(), AbstractC2431.m4473(method))) {
                                    method.setAccessible(true);
                                    return method;
                                }
                                i = i2;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw new NoSuchElementException(e.getMessage());
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                Member reflectedMethod = NativeReflect.getReflectedMethod(clsM3794, str, (String) c0078.getValue(), null);
                if (reflectedMethod != null) {
                    Method method2 = (Method) reflectedMethod;
                    method2.setAccessible(true);
                    return method2;
                }
                throw new NoSuchMethodException("Method " + c0757 + " not found");
            }
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                c26582 = declaredMethod;
            } catch (Throwable th2) {
                c26582 = new C2658(th2);
            }
            Method method3 = (Method) (c26582 instanceof C2658 ? null : c26582);
            if (method3 != null && AbstractC1544.m3188(method3.getReturnType(), cls)) {
                return method3;
            }
            superclass = superclass.getSuperclass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0757)) {
            return false;
        }
        C0757 c0757 = (C0757) obj;
        return AbstractC1544.m3188(this.f3502, c0757.f3502) && AbstractC1544.m3188(this.f3503, c0757.f3503) && AbstractC1544.m3188(this.f3504, c0757.f3504) && AbstractC1544.m3188(this.f3505, c0757.f3505);
    }

    public final int hashCode() {
        return this.f3505.hashCode() + (this.f3504.hashCode() * 31) + (this.f3503.hashCode() * 31) + (this.f3502.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2431.m4476(this.f3502) + "->" + this.f3503 + ((String) this.f3501.getValue());
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Constructor m1703(ClassLoader classLoader) throws NoSuchMethodException {
        Object c2658;
        C0078 c0078 = this.f3501;
        C0299 c0299 = AbstractC1962.f9855;
        if (!m1704()) {
            throw new IllegalArgumentException((this + " not a constructor").toString());
        }
        Class clsM3794 = AbstractC1962.m3794(classLoader, this.f3502);
        Object objM3795 = AbstractC1962.m3795(classLoader, this.f3504);
        Throwable thM4249 = C2248.m4249(objM3795);
        if (thM4249 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Constructor " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM4249);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM3795;
        try {
            Constructor declaredConstructor = clsM3794.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredConstructor.setAccessible(true);
            c2658 = declaredConstructor;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        boolean z = c2658 instanceof C2658;
        Object obj = c2658;
        if (z) {
            obj = null;
        }
        Constructor constructor = (Constructor) obj;
        if (constructor != null) {
            return constructor;
        }
        try {
            Constructor<?>[] declaredConstructors = clsM3794.getDeclaredConstructors();
            int i = 0;
            while (i < declaredConstructors.length) {
                int i2 = i + 1;
                try {
                    Constructor<?> constructor2 = declaredConstructors[i];
                    String str = (String) c0078.getValue();
                    LinkedHashMap linkedHashMap = AbstractC2431.f11989;
                    if (AbstractC1544.m3188(str, "(" + AbstractC2070.m3945(constructor2.getParameterTypes(), new C2460(19)) + ")V")) {
                        constructor2.setAccessible(true);
                        return constructor2;
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
        } catch (Throwable unused) {
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM3794, this.f3503, (String) c0078.getValue(), Boolean.FALSE);
        if (reflectedMethod != null) {
            Constructor constructor3 = (Constructor) reflectedMethod;
            constructor3.setAccessible(true);
            return constructor3;
        }
        throw new NoSuchMethodException("Constructor " + this + " not found");
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean m1704() {
        return AbstractC1544.m3188(this.f3503, "<init>");
    }
}
