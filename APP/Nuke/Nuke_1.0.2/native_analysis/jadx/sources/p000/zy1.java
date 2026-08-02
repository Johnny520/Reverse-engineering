package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class zy1 implements Map, q41 {

    /* JADX INFO: renamed from: j */
    public static final zy1 f14149j = new zy1(h43.f3816e, 0);

    /* JADX INFO: renamed from: h */
    public final h43 f14150h;

    /* JADX INFO: renamed from: i */
    public final int f14151i;

    public zy1(h43 h43Var, int i) {
        this.f14150h = h43Var;
        this.f14151i = i;
    }

    /* JADX INFO: renamed from: a */
    public bz1 mo6368a() {
        return new bz1(this);
    }

    /* JADX INFO: renamed from: b */
    public /* bridge */ bz1 mo6369b() {
        return mo6368a();
    }

    /* JADX INFO: renamed from: c */
    public final zy1 m6516c(Object obj, nb1 nb1Var) {
        C0133dk c0133dkM2074u = this.f14150h.m2074u(obj != null ? obj.hashCode() : 0, 0, obj, nb1Var);
        return c0133dkM2074u == null ? this : new zy1((h43) c0133dkM2074u.f2082j, this.f14151i + c0133dkM2074u.f2081i);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f14150h.m2058d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (t11.m5086l(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new hz1(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f14151i != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (t11.m5086l(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f14150h.m2061g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f14151i == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new hz1(this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f14151i;
    }

    public final String toString() {
        return AbstractC0142du.m1165u0(entrySet(), ", ", "{", "}", new C0792v(2, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new cf1(1, this);
    }
}
