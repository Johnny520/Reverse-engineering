package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ua */
/* JADX INFO: loaded from: classes.dex */
public final class C0774ua implements InterfaceC0123cq, InterfaceC0737ta {

    /* JADX INFO: renamed from: b */
    public static final Map f4671b;

    /* JADX INFO: renamed from: a */
    public final Class f4672a;

    static {
        List listM1595a0 = AbstractC0368jb.m1595a0(InterfaceC0379jm.class, InterfaceC0786um.class, InterfaceC0935ym.class, C0664rb.class, C0664rb.class, C0664rb.class, C0664rb.class, InterfaceC0972zm.class, InterfaceC0024an.class, InterfaceC0074bn.class, InterfaceC0416km.class, InterfaceC0453lm.class, InterfaceC0490mm.class, InterfaceC0527nm.class, InterfaceC0564om.class, InterfaceC0601pm.class, InterfaceC0638qm.class, InterfaceC0675rm.class, InterfaceC0712sm.class, InterfaceC0749tm.class, InterfaceC0823vm.class, InterfaceC0861wm.class, InterfaceC0898xm.class);
        ArrayList arrayList = new ArrayList(AbstractC0405kb.m1675c0(listM1595a0));
        int i = 0;
        for (Object obj : listM1595a0) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0368jb.m1596b0();
                throw null;
            }
            arrayList.add(new C0723sx((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f4671b = AbstractC0386jt.m1618g0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC0493mp.m1856f("<get-values>(...)", collectionValues);
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0493mp.m1854d(str);
            sb.append(i50.m1470M(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f4671b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0386jt.m1617f0(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC0493mp.m1854d(str2);
            linkedHashMap.put(key, i50.m1470M(str2));
        }
    }

    public C0774ua(Class cls) {
        this.f4672a = cls;
    }

    @Override // p000.InterfaceC0737ta
    /* JADX INFO: renamed from: a */
    public final Class mo1964a() {
        return this.f4672a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0774ua) && AbstractC0259gf.m1263y(this).equals(AbstractC0259gf.m1263y((InterfaceC0123cq) obj));
    }

    public final int hashCode() {
        return AbstractC0259gf.m1263y(this).hashCode();
    }

    public final String toString() {
        return this.f4672a + " (Kotlin reflection is not available)";
    }
}
