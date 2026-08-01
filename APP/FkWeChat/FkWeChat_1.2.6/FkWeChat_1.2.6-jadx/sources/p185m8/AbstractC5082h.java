package p185m8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5082h implements Map, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public static final a f15397q = new a(null);

    /* JADX INFO: renamed from: c */
    public static CharSequence m20593c(AbstractC5082h abstractC5082h, Map.Entry entry) {
        entry.getClass();
        return abstractC5082h.m20596o(entry);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (AbstractC1061t.m3842c(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20594e(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj = get(key);
        if (AbstractC1061t.m3842c(value, obj)) {
            return obj != null || containsKey(key);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return mo455g();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!m20594e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public abstract Set mo455g();

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public abstract Set mo456j();

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return mo456j();
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo457l();

    /* JADX INFO: renamed from: m */
    public abstract Collection mo458m();

    /* JADX INFO: renamed from: n */
    public final String m20595n(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: o */
    public final String m20596o(Map.Entry entry) {
        return m20595n(entry.getKey()) + '=' + m20595n(entry.getValue());
    }

    @Override // java.util.Map, p360yb.InterfaceC9664g
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p360yb.InterfaceC9664g
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return mo457l();
    }

    public String toString() {
        return AbstractC5081g0.m20585s0(entrySet(), ", ", "{", "}", 0, null, new InterfaceC0184l() { // from class: m8.g
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC5082h.m20593c(this.f15395q, (Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return mo458m();
    }

    /* JADX INFO: renamed from: m8.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
