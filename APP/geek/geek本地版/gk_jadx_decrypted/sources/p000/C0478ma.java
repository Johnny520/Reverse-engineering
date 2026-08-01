package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ma */
/* JADX INFO: loaded from: classes.dex */
public final class C0478ma implements InterfaceC0938yp, InterfaceC0441la {

    /* JADX INFO: renamed from: b */
    public static final Map f3161b;

    /* JADX INFO: renamed from: a */
    public final Class f3162a;

    static {
        List listM549f0 = AbstractC0062bb.m549f0(InterfaceC0303hm.class, InterfaceC0713sm.class, InterfaceC0861wm.class, C0368jb.class, C0368jb.class, C0368jb.class, C0368jb.class, InterfaceC0898xm.class, InterfaceC0935ym.class, InterfaceC0972zm.class, InterfaceC0339im.class, InterfaceC0379jm.class, InterfaceC0416km.class, InterfaceC0453lm.class, InterfaceC0490mm.class, InterfaceC0527nm.class, InterfaceC0564om.class, InterfaceC0602pm.class, InterfaceC0639qm.class, InterfaceC0676rm.class, InterfaceC0750tm.class, InterfaceC0787um.class, InterfaceC0824vm.class);
        ArrayList arrayList = new ArrayList(AbstractC0098cb.m657h0(listM549f0));
        int i = 0;
        for (Object obj : listM549f0) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0062bb.m550g0();
                throw null;
            }
            arrayList.add(new C0427kx((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f3161b = AbstractC0162dt.m959A(arrayList);
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
        AbstractC0346ip.m1502n("<get-values>(...)", collectionValues);
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0346ip.m1500l(str);
            sb.append(b50.m530P(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f3161b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0162dt.m960z(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC0346ip.m1500l(str2);
            linkedHashMap.put(key, b50.m530P(str2));
        }
    }

    public C0478ma(Class cls) {
        this.f3162a = cls;
    }

    @Override // p000.InterfaceC0441la
    /* JADX INFO: renamed from: a */
    public final Class mo1238a() {
        return this.f3162a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0478ma) && AbstractC0222ff.m1198t(this).equals(AbstractC0222ff.m1198t((InterfaceC0938yp) obj));
    }

    public final int hashCode() {
        return AbstractC0222ff.m1198t(this).hashCode();
    }

    public final String toString() {
        return this.f3162a + " (Kotlin reflection is not available)";
    }
}
