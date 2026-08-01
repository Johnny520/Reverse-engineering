package p282t7;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1404e;

/* JADX INFO: renamed from: t7.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8185i implements Map, InterfaceC1404e {

    /* JADX INFO: renamed from: q */
    public final Map f27483q = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public static Map.Entry m31848a(Map.Entry entry) {
        entry.getClass();
        return new C8192p(((C8186j) entry.getKey()).m31860a(), entry.getValue());
    }

    /* JADX INFO: renamed from: c */
    public static String m31849c(C8186j c8186j) {
        c8186j.getClass();
        return c8186j.m31860a();
    }

    /* JADX INFO: renamed from: e */
    public static Map.Entry m31850e(Map.Entry entry) {
        entry.getClass();
        return new C8192p(AbstractC8179c0.m31843a((String) entry.getKey()), entry.getValue());
    }

    /* JADX INFO: renamed from: g */
    public static C8186j m31851g(String str) {
        str.getClass();
        return AbstractC8179c0.m31843a(str);
    }

    @Override // java.util.Map
    public void clear() {
        this.f27483q.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m31852j((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f27483q.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m31854m();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C8185i)) {
            return false;
        }
        return AbstractC1061t.m3842c(((C8185i) obj).f27483q, this.f27483q);
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return m31853l((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f27483q.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f27483q.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public boolean m31852j(String str) {
        str.getClass();
        return this.f27483q.containsKey(new C8186j(str));
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m31855n();
    }

    /* JADX INFO: renamed from: l */
    public Object m31853l(String str) {
        str.getClass();
        return this.f27483q.get(AbstractC8179c0.m31843a(str));
    }

    /* JADX INFO: renamed from: m */
    public Set m31854m() {
        return new C8191o(this.f27483q.entrySet(), new InterfaceC0184l() { // from class: t7.e
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8185i.m31848a((Map.Entry) obj);
            }
        }, new InterfaceC0184l() { // from class: t7.f
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8185i.m31850e((Map.Entry) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public Set m31855n() {
        return new C8191o(this.f27483q.keySet(), new InterfaceC0184l() { // from class: t7.g
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8185i.m31849c((C8186j) obj);
            }
        }, new InterfaceC0184l() { // from class: t7.h
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8185i.m31851g((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public int m31856o() {
        return this.f27483q.size();
    }

    /* JADX INFO: renamed from: p */
    public Collection m31857p() {
        return this.f27483q.values();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            put((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Object put(String str, Object obj) {
        str.getClass();
        obj.getClass();
        return this.f27483q.put(AbstractC8179c0.m31843a(str), obj);
    }

    /* JADX INFO: renamed from: r */
    public Object m31859r(String str) {
        str.getClass();
        return this.f27483q.remove(AbstractC8179c0.m31843a(str));
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return m31859r((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m31856o();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m31857p();
    }
}
