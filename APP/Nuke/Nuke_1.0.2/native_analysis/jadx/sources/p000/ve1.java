package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ve1 implements Map, q41 {

    /* JADX INFO: renamed from: h */
    public final rk1 f11915h;

    /* JADX INFO: renamed from: i */
    public uf0 f11916i;

    /* JADX INFO: renamed from: j */
    public uf0 f11917j;

    /* JADX INFO: renamed from: k */
    public jw2 f11918k;

    public ve1(rk1 rk1Var) {
        rk1Var.getClass();
        this.f11915h = rk1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f11915h.m4501c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f11915h.m4502d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        uf0 uf0Var = this.f11916i;
        if (uf0Var != null) {
            return uf0Var;
        }
        uf0 uf0Var2 = new uf0(this.f11915h, 0);
        this.f11916i = uf0Var2;
        return uf0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ve1.class != obj.getClass()) {
            return false;
        }
        return t11.m5086l(this.f11915h, ((ve1) obj).f11915h);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f11915h.m4505g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f11915h.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11915h.m4507i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        uf0 uf0Var = this.f11917j;
        if (uf0Var != null) {
            return uf0Var;
        }
        uf0 uf0Var2 = new uf0(this.f11915h, 1);
        this.f11917j = uf0Var2;
        return uf0Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11915h.f9622e;
    }

    public final String toString() {
        return this.f11915h.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        jw2 jw2Var = this.f11918k;
        if (jw2Var != null) {
            return jw2Var;
        }
        jw2 jw2Var2 = new jw2(this.f11915h);
        this.f11918k = jw2Var2;
        return jw2Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
