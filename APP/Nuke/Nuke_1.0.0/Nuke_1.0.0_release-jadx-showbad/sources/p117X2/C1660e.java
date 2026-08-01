package p117X2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p056K2.C0882h;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0974n;
import p061L2.AbstractC0984x;
import p061L2.C0982v;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1600b;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1602d;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p112W2.InterfaceC1605g;
import p112W2.InterfaceC1606h;
import p112W2.InterfaceC1607i;
import p127Z2.AbstractC1784a;
import p136b0.InterfaceC1841c;
import p137b3.InterfaceC1854b;
import p149d3.AbstractC1976d;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: X2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1660e implements InterfaceC1854b, InterfaceC1659d {

    /* JADX INFO: renamed from: b */
    public static final Map f5698b;

    /* JADX INFO: renamed from: a */
    public final Class f5699a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Map mapSingletonMap;
        List listM1987K = AbstractC0972l.m1987K(new Class[]{InterfaceC1599a.class, InterfaceC1601c.class, InterfaceC1603e.class, InterfaceC1604f.class, InterfaceC1605g.class, InterfaceC1606h.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1607i.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1600b.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1841c.class, InterfaceC1602d.class});
        ArrayList<C0882h> arrayList = new ArrayList(AbstractC0974n.m2029K(listM1987K, 10));
        int i5 = 0;
        for (Object obj : listM1987K) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC2352g.m4187J();
                throw null;
            }
            arrayList.add(new C0882h((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        int size = arrayList.size();
        if (size == 0) {
            mapSingletonMap = C0982v.f3048d;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(AbstractC0984x.m2034F(arrayList.size()));
            for (C0882h c0882h : arrayList) {
                mapSingletonMap.put(c0882h.f2769d, c0882h.f2770e);
            }
        } else {
            C0882h c0882h2 = (C0882h) arrayList.get(0);
            AbstractC1665j.m2985e(c0882h2, "pair");
            mapSingletonMap = Collections.singletonMap(c0882h2.f2769d, c0882h2.f2770e);
            AbstractC1665j.m2984d(mapSingletonMap, "singletonMap(...)");
        }
        f5698b = mapSingletonMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1660e(Class cls) {
        AbstractC1665j.m2985e(cls, "jClass");
        this.f5699a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117X2.InterfaceC1659d
    /* JADX INFO: renamed from: a */
    public final Class mo2977a() {
        return this.f5699a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m2978b() {
        String strM2990j;
        Class cls = this.f5699a;
        AbstractC1665j.m2985e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM2990j2 = AbstractC1665j.m2990j(cls.getName());
                return strM2990j2 == null ? cls.getSimpleName() : strM2990j2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM2990j = AbstractC1665j.m2990j(componentType.getName())) != null) {
                strConcat = strM2990j.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC1976d.m3645m0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return AbstractC1976d.m3645m0(simpleName, enclosingConstructor.getName() + '$');
        }
        int iM3634b0 = AbstractC1976d.m3634b0(simpleName, '$', 0, 6);
        if (iM3634b0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iM3634b0 + 1, simpleName.length());
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1660e) && AbstractC1784a.m3239y(this).equals(AbstractC1784a.m3239y((InterfaceC1854b) obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC1784a.m3239y(this).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f5699a.toString() + " (Kotlin reflection is not available)";
    }
}
