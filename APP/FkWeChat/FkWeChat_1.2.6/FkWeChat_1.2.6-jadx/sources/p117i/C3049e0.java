package p117i;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: i.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3049e0 implements Map, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final AbstractC3041b1 f8097q;

    /* JADX INFO: renamed from: r */
    public C3054g f8098r;

    /* JADX INFO: renamed from: s */
    public C3083s f8099s;

    /* JADX INFO: renamed from: t */
    public C3068k1 f8100t;

    public C3049e0(AbstractC3041b1 abstractC3041b1) {
        abstractC3041b1.getClass();
        this.f8097q = abstractC3041b1;
    }

    /* JADX INFO: renamed from: a */
    public Set m11279a() {
        C3054g c3054g = this.f8098r;
        if (c3054g != null) {
            return c3054g;
        }
        C3054g c3054g2 = new C3054g(this.f8097q);
        this.f8098r = c3054g2;
        return c3054g2;
    }

    /* JADX INFO: renamed from: c */
    public Set m11280c() {
        C3083s c3083s = this.f8099s;
        if (c3083s != null) {
            return c3083s;
        }
        C3083s c3083s2 = new C3083s(this.f8097q);
        this.f8099s = c3083s2;
        return c3083s2;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f8097q.m11236c(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f8097q.m11237d(obj);
    }

    /* JADX INFO: renamed from: e */
    public int m11281e() {
        return this.f8097q.f8074e;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m11279a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC1061t.m3842c(this.f8097q, ((C3049e0) obj).f8097q);
    }

    /* JADX INFO: renamed from: g */
    public Collection m11282g() {
        C3068k1 c3068k1 = this.f8100t;
        if (c3068k1 != null) {
            return c3068k1;
        }
        C3068k1 c3068k12 = new C3068k1(this.f8097q);
        this.f8100t = c3068k12;
        return c3068k12;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f8097q.m11238e(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f8097q.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f8097q.m11241h();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m11280c();
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m11281e();
    }

    public String toString() {
        return this.f8097q.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m11282g();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
