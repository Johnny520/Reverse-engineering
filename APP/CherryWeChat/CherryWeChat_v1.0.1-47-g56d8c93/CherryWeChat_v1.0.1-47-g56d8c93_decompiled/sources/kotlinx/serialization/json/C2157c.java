package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p000.AbstractC0585Nj;
import p000.AbstractC2453ra;
import p000.C0620Ob;
import p000.InterfaceC0545Mm;

/* JADX INFO: renamed from: kotlinx.serialization.json.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2157c extends AbstractC2156b implements Map<String, AbstractC2156b>, InterfaceC0545Mm {
    public static final JsonObject$Companion Companion = new JsonObject$Companion();

    /* JADX INFO: renamed from: a */
    public final Map f7535a;

    public C2157c(Map map) {
        this.f7535a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b compute(String str, BiFunction<? super String, ? super AbstractC2156b, ? extends AbstractC2156b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b computeIfAbsent(String str, Function<? super String, ? extends AbstractC2156b> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b computeIfPresent(String str, BiFunction<? super String, ? super AbstractC2156b, ? extends AbstractC2156b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f7535a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC2156b)) {
            return false;
        }
        return this.f7535a.containsValue((AbstractC2156b) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC2156b>> entrySet() {
        return this.f7535a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC0585Nj.m1134a(this.f7535a, obj);
    }

    @Override // java.util.Map
    public final AbstractC2156b get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC2156b) this.f7535a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f7535a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f7535a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f7535a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b merge(String str, AbstractC2156b abstractC2156b, BiFunction<? super AbstractC2156b, ? super AbstractC2156b, ? extends AbstractC2156b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b put(String str, AbstractC2156b abstractC2156b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC2156b> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b putIfAbsent(String str, AbstractC2156b abstractC2156b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC2156b remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b replace(String str, AbstractC2156b abstractC2156b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC2156b, ? extends AbstractC2156b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7535a.size();
    }

    public final String toString() {
        return AbstractC2453ra.m4901k0(this.f7535a.entrySet(), ",", "{", "}", new C0620Ob(24), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC2156b> values() {
        return this.f7535a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC2156b abstractC2156b, AbstractC2156b abstractC2156b2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
