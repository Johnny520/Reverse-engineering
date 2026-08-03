package p031Q0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.AbstractC0193x;
import p009E0.C0191v;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0276b;
import p029P0.InterfaceC0277c;
import p029P0.InterfaceC0278d;
import p029P0.InterfaceC0279e;
import p029P0.InterfaceC0280f;
import p029P0.InterfaceC0281g;
import p029P0.InterfaceC0282h;
import p029P0.InterfaceC0283i;
import p029P0.InterfaceC0284j;
import p029P0.InterfaceC0285k;
import p029P0.InterfaceC0286l;
import p029P0.InterfaceC0287m;
import p029P0.InterfaceC0288n;
import p029P0.InterfaceC0289o;
import p029P0.InterfaceC0290p;
import p029P0.InterfaceC0291q;
import p029P0.InterfaceC0292r;
import p029P0.InterfaceC0293s;
import p029P0.InterfaceC0294t;
import p029P0.InterfaceC0295u;
import p029P0.InterfaceC0296v;
import p038U0.InterfaceC0391a;
import p042W0.AbstractC0425j;
import p056f0.C0817b;

/* JADX INFO: renamed from: Q0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0303c implements InterfaceC0391a, InterfaceC0302b {

    /* JADX INFO: renamed from: b */
    public static final Map f580b;

    /* JADX INFO: renamed from: a */
    public final Class f581a;

    static {
        List listM556h0 = AbstractC0182m.m556h0(InterfaceC0275a.class, InterfaceC0286l.class, InterfaceC0290p.class, C0817b.class, InterfaceC0291q.class, InterfaceC0292r.class, InterfaceC0293s.class, InterfaceC0294t.class, InterfaceC0295u.class, InterfaceC0296v.class, InterfaceC0276b.class, InterfaceC0277c.class, InterfaceC0278d.class, InterfaceC0279e.class, InterfaceC0280f.class, InterfaceC0281g.class, InterfaceC0282h.class, InterfaceC0283i.class, InterfaceC0284j.class, InterfaceC0285k.class, InterfaceC0287m.class, InterfaceC0288n.class, InterfaceC0289o.class);
        ArrayList<C0139e> arrayList = new ArrayList(AbstractC0183n.m559k0(listM556h0, 10));
        int i2 = 0;
        for (Object obj : listM556h0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0182m.m558j0();
                throw null;
            }
            arrayList.add(new C0139e((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        Map mapSingletonMap = C0191v.f402a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                mapSingletonMap = new LinkedHashMap(AbstractC0193x.m563g0(arrayList.size()));
                for (C0139e c0139e : arrayList) {
                    mapSingletonMap.put(c0139e.f328a, c0139e.f329b);
                }
            } else {
                C0139e c0139e2 = (C0139e) arrayList.get(0);
                AbstractC0307g.m703e(c0139e2, "pair");
                mapSingletonMap = Collections.singletonMap(c0139e2.f328a, c0139e2.f329b);
                AbstractC0307g.m702d(mapSingletonMap, "singletonMap(...)");
            }
        }
        f580b = mapSingletonMap;
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
        AbstractC0307g.m702d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0307g.m700b(str);
            sb.append(AbstractC0425j.m1020Y0(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f580b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0193x.m563g0(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC0425j.m1020Y0((String) entry2.getValue()));
        }
    }

    public C0303c(Class cls) {
        AbstractC0307g.m703e(cls, "jClass");
        this.f581a = cls;
    }

    @Override // p031Q0.InterfaceC0302b
    /* JADX INFO: renamed from: a */
    public final Class mo696a() {
        return this.f581a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0303c) && AbstractC0040p.m118x(this).equals(AbstractC0040p.m118x((InterfaceC0391a) obj));
    }

    public final int hashCode() {
        return AbstractC0040p.m118x(this).hashCode();
    }

    public final String toString() {
        return this.f581a.toString() + " (Kotlin reflection is not available)";
    }
}
