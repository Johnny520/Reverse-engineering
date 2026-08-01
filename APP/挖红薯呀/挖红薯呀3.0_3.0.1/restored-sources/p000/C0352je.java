package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: je */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0352je implements InterfaceC0317ie, n40, l40 {

    /* JADX INFO: renamed from: e */
    public static final Map f2803e;

    /* JADX INFO: renamed from: d */
    public final Class f2804d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Map mapSingletonMap;
        List listM2783w = o30.m2783w(InterfaceC0298hw.class, InterfaceC0742sw.class, InterfaceC0904ww.class, InterfaceC0941xw.class, InterfaceC0978yw.class, InterfaceC1019zw.class, InterfaceC0034ax.class, InterfaceC0071bx.class, InterfaceC0108cx.class, InterfaceC0151dx.class, InterfaceC0333iw.class, InterfaceC0370jw.class, InterfaceC0409kw.class, InterfaceC0446lw.class, InterfaceC0489mw.class, InterfaceC0528nw.class, InterfaceC0593ow.class, InterfaceC0630pw.class, InterfaceC0667qw.class, InterfaceC0704rw.class, InterfaceC0781tw.class, InterfaceC0818uw.class, InterfaceC0867vw.class);
        ArrayList<uo0> arrayList = new ArrayList(AbstractC1001ze.m5585E(listM2783w));
        int i = 0;
        for (Object obj : listM2783w) {
            int i2 = i + 1;
            if (i < 0) {
                o30.m2757A();
                throw null;
            }
            arrayList.add(new uo0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        int size = arrayList.size();
        if (size == 0) {
            mapSingletonMap = C0330is.f2614d;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(md0.m2495x(arrayList.size()));
            for (uo0 uo0Var : arrayList) {
                mapSingletonMap.put(uo0Var.f6274d, uo0Var.f6275e);
            }
        } else {
            uo0 uo0Var2 = (uo0) arrayList.get(0);
            uo0Var2.getClass();
            mapSingletonMap = Collections.singletonMap(uo0Var2.f6274d, uo0Var2.f6275e);
            mapSingletonMap.getClass();
        }
        f2803e = mapSingletonMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0352je(Class cls) {
        cls.getClass();
        this.f2804d = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0317ie
    /* JADX INFO: renamed from: a */
    public final Class mo1249a() {
        return this.f2804d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1694b() {
        String strM3043U;
        Class cls = this.f2804d;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM3043U2 = pf1.m3043U(cls.getName());
                return strM3043U2 == null ? cls.getSimpleName() : strM3043U2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM3043U = pf1.m3043U(componentType.getName())) != null) {
                strConcat = strM3043U.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return k41.m1774f0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM1767Y = k41.m1767Y(simpleName, '$', 0, 6);
            return iM1767Y == -1 ? simpleName : simpleName.substring(iM1767Y + 1, simpleName.length());
        }
        return k41.m1774f0(simpleName, enclosingConstructor.getName() + '$');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C0352je) && AbstractC0398kl.m1928n(this).equals(AbstractC0398kl.m1928n((C0352je) obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0398kl.m1928n(this).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2804d.toString() + " (Kotlin reflection is not available)";
    }
}
