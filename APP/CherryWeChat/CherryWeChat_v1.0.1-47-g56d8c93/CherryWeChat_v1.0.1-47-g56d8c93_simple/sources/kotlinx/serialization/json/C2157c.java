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
    public static final JsonObject$Companion Companion = null;

    /* JADX INFO: renamed from: a */
    public final Map f7535a;

    static {
        Companion = new JsonObject$Companion();
    }

    public C2157c(Map r1) {
        this.f7535a = r1;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b compute(String r1, BiFunction<? super String, ? super AbstractC2156b, ? extends AbstractC2156b> r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b computeIfAbsent(String r1, Function<? super String, ? extends AbstractC2156b> r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b computeIfPresent(String r1, BiFunction<? super String, ? super AbstractC2156b, ? extends AbstractC2156b> r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object r2) {
        if ((r2 instanceof String) == true) goto L6;
        return false;
    L6:
        Map r0 = this.f7535a;
        return r0.containsKey((String) r2);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object r2) {
        if ((r2 instanceof AbstractC2156b) == true) goto L6;
        return false;
    L6:
        Map r0 = this.f7535a;
        return r0.containsValue((AbstractC2156b) r2);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC2156b>> entrySet() {
        return this.f7535a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object r2) {
        return AbstractC0585Nj.m1134a(this.f7535a, r2);
    }

    @Override // java.util.Map
    public final AbstractC2156b get(Object r2) {
        if ((r2 instanceof String) == true) goto L6;
        return null;
    L6:
        Map r0 = this.f7535a;
        return (AbstractC2156b) r0.get((String) r2);
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
    public final /* bridge */ /* synthetic */ AbstractC2156b merge(String r1, AbstractC2156b r2, BiFunction<? super AbstractC2156b, ? super AbstractC2156b, ? extends AbstractC2156b> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b put(String r1, AbstractC2156b r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC2156b> r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b putIfAbsent(String r1, AbstractC2156b r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC2156b remove(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC2156b replace(String r1, AbstractC2156b r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC2156b, ? extends AbstractC2156b> r2) {
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
    public final boolean remove(Object r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String r1, AbstractC2156b r2, AbstractC2156b r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
