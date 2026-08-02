package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d41 extends j31 implements Map<String, j31>, q41 {
    public static final c41 Companion = new c41();

    /* JADX INFO: renamed from: h */
    public final Map f1861h;

    public d41(Map map) {
        map.getClass();
        this.f1861h = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j31 compute(String str, BiFunction<? super String, ? super j31, ? extends j31> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j31 computeIfAbsent(String str, Function<? super String, ? extends j31> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j31 computeIfPresent(String str, BiFunction<? super String, ? super j31, ? extends j31> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f1861h.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof j31)) {
            return false;
        }
        return this.f1861h.containsValue((j31) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, j31>> entrySet() {
        return this.f1861h.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return t11.m5086l(this.f1861h, obj);
    }

    @Override // java.util.Map
    public final j31 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (j31) this.f1861h.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f1861h.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f1861h.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f1861h.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j31 merge(String str, j31 j31Var, BiFunction<? super j31, ? super j31, ? extends j31> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j31 put(String str, j31 j31Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends j31> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j31 putIfAbsent(String str, j31 j31Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final j31 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j31 replace(String str, j31 j31Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super j31, ? extends j31> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1861h.size();
    }

    public final String toString() {
        return AbstractC0142du.m1165u0(this.f1861h.entrySet(), ",", "{", "}", new nx0(10), 24);
    }

    @Override // java.util.Map
    public final Collection<j31> values() {
        return this.f1861h.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, j31 j31Var, j31 j31Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
