package p000a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: a.f3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0568f3 implements InterfaceC0764p9<Object>, InterfaceC0473a3 {

    /* JADX INFO: renamed from: b */
    public static final Map<Class<? extends InterfaceC0280P7<?>>, Integer> f2124b;

    /* JADX INFO: renamed from: a */
    public final Class<?> f2125a;

    static {
        List listM1757d0 = C0739o3.m1757d0(InterfaceC0819s7.class, InterfaceC0064D7.class, InterfaceC0136H7.class, InterfaceC0154I7.class, InterfaceC0172J7.class, InterfaceC0190K7.class, InterfaceC0208L7.class, InterfaceC0226M7.class, InterfaceC0244N7.class, InterfaceC0262O7.class, InterfaceC0838t7.class, InterfaceC0857u7.class, InterfaceC0876v7.class, InterfaceC0895w7.class, InterfaceC0914x7.class, InterfaceC0933y7.class, InterfaceC0952z7.class, InterfaceC0008A7.class, InterfaceC0027B7.class, InterfaceC0046C7.class, InterfaceC0082E7.class, InterfaceC0100F7.class, InterfaceC0118G7.class);
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(listM1757d0, 10));
        int i = 0;
        for (Object obj : listM1757d0) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0710mc((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f2124b = C0499ba.m1231G(arrayList);
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
        C0631i9.m1481d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            C0631i9.m1479b(str);
            sb.append(C0034Be.m105T(str, '.'));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends InterfaceC0280P7<?>>, Integer> entry : f2124b.entrySet()) {
            Class<? extends InterfaceC0280P7<?>> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            map3.put(key.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0480aa.m1169C(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            C0631i9.m1479b(str2);
            linkedHashMap.put(key2, C0034Be.m105T(str2, '.'));
        }
    }

    public C0568f3(Class<?> cls) {
        C0631i9.m1482e(cls, "jClass");
        this.f2125a = cls;
    }

    @Override // p000a.InterfaceC0473a3
    /* JADX INFO: renamed from: a */
    public final Class<?> mo1151a() {
        return this.f2125a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0568f3) && C0726n9.m1675r(this).equals(C0726n9.m1675r((InterfaceC0764p9) obj));
    }

    public final int hashCode() {
        return C0726n9.m1675r(this).hashCode();
    }

    public final String toString() {
        return this.f2125a + " (Kotlin reflection is not available)";
    }
}
