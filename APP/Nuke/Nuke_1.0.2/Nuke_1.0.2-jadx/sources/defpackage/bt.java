package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bt implements rs {
    public static final Map b;
    public final Class a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        List listP = eu.P(xm0.class, in0.class, mn0.class, nn0.class, on0.class, pn0.class, qn0.class, rn0.class, sn0.class, tn0.class, ym0.class, zm0.class, an0.class, bn0.class, cn0.class, dn0.class, en0.class, fn0.class, gn0.class, hn0.class, jn0.class, kn0.class, ln0.class);
        ArrayList arrayList = new ArrayList(eu.B(listP, 10));
        int i = 0;
        for (Object obj : listP) {
            int i2 = i + 1;
            if (i < 0) {
                eu.a0();
                throw null;
            }
            arrayList.add(new ow1((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = we1.u0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bt(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rs
    public final Class a() {
        return this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        String strM;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM2 = p40.m(cls.getName());
            return strM2 == null ? cls.getCanonicalName() : strM2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM = p40.m(componentType.getName())) != null) {
            strConcat = strM.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c() {
        String strT;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strT2 = p40.T(cls.getName());
                return strT2 == null ? cls.getSimpleName() : strT2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strT = p40.T(componentType.getName())) != null) {
                strConcat = strT.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return pv2.F0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iP0 = pv2.p0(simpleName, '$', 0, 6);
            return iP0 == -1 ? simpleName : simpleName.substring(iP0 + 1, simpleName.length());
        }
        return pv2.F0(simpleName, enclosingConstructor.getName() + '$');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(Object obj) {
        Class clsZ = this.a;
        clsZ.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(clsZ);
        if (num != null) {
            return xe1.K(num.intValue(), obj);
        }
        if (clsZ.isPrimitive()) {
            clsZ = p40.z(d72.a(clsZ));
        }
        return clsZ.isInstance(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof bt) && p40.z(this).equals(p40.z((bt) obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return p40.z(this).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
