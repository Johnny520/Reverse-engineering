package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: bt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0067bt implements InterfaceC0667rs {

    /* JADX INFO: renamed from: b */
    public static final Map f1008b;

    /* JADX INFO: renamed from: a */
    public final Class f1009a;

    static {
        List listM1435P = AbstractC0179eu.m1435P(xm0.class, in0.class, mn0.class, nn0.class, on0.class, pn0.class, qn0.class, rn0.class, sn0.class, tn0.class, ym0.class, zm0.class, an0.class, bn0.class, cn0.class, dn0.class, en0.class, fn0.class, gn0.class, hn0.class, jn0.class, kn0.class, ln0.class);
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(listM1435P, 10));
        int i = 0;
        for (Object obj : listM1435P) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            arrayList.add(new ow1((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f1008b = we1.m5880u0(arrayList);
    }

    public C0067bt(Class cls) {
        cls.getClass();
        this.f1009a = cls;
    }

    @Override // p000.InterfaceC0667rs
    /* JADX INFO: renamed from: a */
    public final Class mo589a() {
        return this.f1009a;
    }

    /* JADX INFO: renamed from: b */
    public final String m590b() {
        String strM3730m;
        Class cls = this.f1009a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM3730m2 = p40.m3730m(cls.getName());
            return strM3730m2 == null ? cls.getCanonicalName() : strM3730m2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM3730m = p40.m3730m(componentType.getName())) != null) {
            strConcat = strM3730m.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* JADX INFO: renamed from: c */
    public final String m591c() {
        String strM3709T;
        Class cls = this.f1009a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM3709T2 = p40.m3709T(cls.getName());
                return strM3709T2 == null ? cls.getSimpleName() : strM3709T2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM3709T = p40.m3709T(componentType.getName())) != null) {
                strConcat = strM3709T.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return pv2.m3990F0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM4003p0 = pv2.m4003p0(simpleName, '$', 0, 6);
            return iM4003p0 == -1 ? simpleName : simpleName.substring(iM4003p0 + 1, simpleName.length());
        }
        return pv2.m3990F0(simpleName, enclosingConstructor.getName() + '$');
    }

    /* JADX INFO: renamed from: d */
    public final boolean m592d(Object obj) {
        Class clsM3742z = this.f1009a;
        clsM3742z.getClass();
        Map map = f1008b;
        map.getClass();
        Integer num = (Integer) map.get(clsM3742z);
        if (num != null) {
            return xe1.m6093K(num.intValue(), obj);
        }
        if (clsM3742z.isPrimitive()) {
            clsM3742z = p40.m3742z(d72.m967a(clsM3742z));
        }
        return clsM3742z.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0067bt) && p40.m3742z(this).equals(p40.m3742z((C0067bt) obj));
    }

    public final int hashCode() {
        return p40.m3742z(this).hashCode();
    }

    public final String toString() {
        return this.f1009a.toString() + " (Kotlin reflection is not available)";
    }
}
