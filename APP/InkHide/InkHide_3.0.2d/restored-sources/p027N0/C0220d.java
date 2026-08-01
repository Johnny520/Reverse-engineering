package p027N0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p006D.AbstractC0079h;
import p009E0.C0103c;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0124l;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0134v;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0194b;
import p025M0.InterfaceC0195c;
import p025M0.InterfaceC0196d;
import p025M0.InterfaceC0197e;
import p025M0.InterfaceC0198f;
import p025M0.InterfaceC0199g;
import p025M0.InterfaceC0200h;
import p025M0.InterfaceC0201i;
import p025M0.InterfaceC0202j;
import p025M0.InterfaceC0203k;
import p025M0.InterfaceC0204l;
import p025M0.InterfaceC0205m;
import p025M0.InterfaceC0206n;
import p025M0.InterfaceC0207o;
import p025M0.InterfaceC0208p;
import p025M0.InterfaceC0209q;
import p025M0.InterfaceC0210r;
import p025M0.InterfaceC0211s;
import p025M0.InterfaceC0212t;
import p025M0.InterfaceC0213u;
import p025M0.InterfaceC0214v;
import p036S0.InterfaceC0249b;
import p040U0.AbstractC0299i;
import p086r0.C0915k0;

/* JADX INFO: renamed from: N0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0220d implements InterfaceC0249b, InterfaceC0219c {

    /* JADX INFO: renamed from: b */
    public static final Map f560b;

    /* JADX INFO: renamed from: a */
    public final Class f561a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        List listM252Z = AbstractC0120h.m252Z(new Class[]{InterfaceC0193a.class, InterfaceC0204l.class, InterfaceC0208p.class, C0915k0.class, InterfaceC0209q.class, InterfaceC0210r.class, InterfaceC0211s.class, InterfaceC0212t.class, InterfaceC0213u.class, InterfaceC0214v.class, InterfaceC0194b.class, InterfaceC0195c.class, InterfaceC0196d.class, InterfaceC0197e.class, InterfaceC0198f.class, InterfaceC0199g.class, InterfaceC0200h.class, InterfaceC0201i.class, InterfaceC0202j.class, InterfaceC0203k.class, InterfaceC0205m.class, InterfaceC0206n.class, InterfaceC0207o.class});
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(listM252Z));
        int i2 = 0;
        for (Object obj : listM252Z) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0124l.m288b0();
                throw null;
            }
            arrayList.add(new C0103c((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f560b = AbstractC0134v.m298c0(arrayList);
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
        AbstractC0223g.m417d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0223g.m415b(str);
            sb.append(AbstractC0299i.m525w0(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f560b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0134v.m294Y(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC0299i.m525w0((String) entry2.getValue()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0220d(Class cls) {
        this.f561a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027N0.InterfaceC0219c
    /* JADX INFO: renamed from: a */
    public final Class mo413a() {
        return this.f561a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C0220d) && AbstractC0079h.m194u(this).equals(AbstractC0079h.m194u((InterfaceC0249b) obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0079h.m194u(this).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f561a.toString() + " (Kotlin reflection is not available)";
    }
}
