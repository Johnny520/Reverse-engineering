package p088;

import io.ktor.util.C4206;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6566;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180(with = C7149.class)
public final class C7151 extends AbstractC7175 implements Map<String, AbstractC7175>, InterfaceC6566 {
    public static final C7152 Companion = new C7152();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Map f19121;

    public C7151(Map map) {
        map.getClass();
        this.f19121 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7175 compute(String str, BiFunction<? super String, ? super AbstractC7175, ? extends AbstractC7175> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7175 computeIfAbsent(String str, Function<? super String, ? extends AbstractC7175> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7175 computeIfPresent(String str, BiFunction<? super String, ? super AbstractC7175, ? extends AbstractC7175> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f19121.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC7175)) {
            return false;
        }
        return this.f19121.containsValue((AbstractC7175) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC7175>> entrySet() {
        return this.f19121.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC4394.m8917(this.f19121, obj);
    }

    @Override // java.util.Map
    public final AbstractC7175 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC7175) this.f19121.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f19121.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f19121.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f19121.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7175 merge(String str, AbstractC7175 abstractC7175, BiFunction<? super AbstractC7175, ? super AbstractC7175, ? extends AbstractC7175> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7175 put(String str, AbstractC7175 abstractC7175) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC7175> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7175 putIfAbsent(String str, AbstractC7175 abstractC7175) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC7175 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7175 replace(String str, AbstractC7175 abstractC7175) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC7175, ? extends AbstractC7175> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19121.size();
    }

    public final String toString() {
        return AbstractC4343.m8813(this.f19121.entrySet(), ",", "{", "}", new C4206(28), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC7175> values() {
        return this.f19121.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC7175 abstractC7175, AbstractC7175 abstractC71752) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
