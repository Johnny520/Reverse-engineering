package p088;

import io.ktor.util.C4207;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6567;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181(with = C7150.class)
public final class C7152 extends AbstractC7176 implements Map<String, AbstractC7176>, InterfaceC6567 {
    public static final C7153 Companion = new C7153();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Map f19116;

    public C7152(Map map) {
        map.getClass();
        this.f19116 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7176 compute(String str, BiFunction<? super String, ? super AbstractC7176, ? extends AbstractC7176> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7176 computeIfAbsent(String str, Function<? super String, ? extends AbstractC7176> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7176 computeIfPresent(String str, BiFunction<? super String, ? super AbstractC7176, ? extends AbstractC7176> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f19116.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC7176)) {
            return false;
        }
        return this.f19116.containsValue((AbstractC7176) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC7176>> entrySet() {
        return this.f19116.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC4395.m8907(this.f19116, obj);
    }

    @Override // java.util.Map
    public final AbstractC7176 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC7176) this.f19116.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f19116.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f19116.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f19116.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7176 merge(String str, AbstractC7176 abstractC7176, BiFunction<? super AbstractC7176, ? super AbstractC7176, ? extends AbstractC7176> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7176 put(String str, AbstractC7176 abstractC7176) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC7176> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7176 putIfAbsent(String str, AbstractC7176 abstractC7176) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC7176 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC7176 replace(String str, AbstractC7176 abstractC7176) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC7176, ? extends AbstractC7176> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19116.size();
    }

    public final String toString() {
        return AbstractC4344.m8810(this.f19116.entrySet(), ",", "{", "}", new C4207(28), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC7176> values() {
        return this.f19116.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC7176 abstractC7176, AbstractC7176 abstractC71762) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
