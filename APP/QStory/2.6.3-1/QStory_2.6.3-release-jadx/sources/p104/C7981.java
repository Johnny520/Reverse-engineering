package p104;

import io.ktor.util.C5039;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010(with = C7979.class)
public final class C7981 extends AbstractC8005 implements Map<String, AbstractC8005>, InterfaceC7396 {
    public static final C7982 Companion = new C7982();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Map f19461;

    public C7981(Map map) {
        map.getClass();
        this.f19461 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC8005 compute(String str, BiFunction<? super String, ? super AbstractC8005, ? extends AbstractC8005> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC8005 computeIfAbsent(String str, Function<? super String, ? extends AbstractC8005> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC8005 computeIfPresent(String str, BiFunction<? super String, ? super AbstractC8005, ? extends AbstractC8005> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f19461.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC8005)) {
            return false;
        }
        return this.f19461.containsValue((AbstractC8005) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC8005>> entrySet() {
        return this.f19461.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC5227.m9466(this.f19461, obj);
    }

    @Override // java.util.Map
    public final AbstractC8005 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC8005) this.f19461.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f19461.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f19461.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f19461.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC8005 merge(String str, AbstractC8005 abstractC8005, BiFunction<? super AbstractC8005, ? super AbstractC8005, ? extends AbstractC8005> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC8005 put(String str, AbstractC8005 abstractC8005) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC8005> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC8005 putIfAbsent(String str, AbstractC8005 abstractC8005) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC8005 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC8005 replace(String str, AbstractC8005 abstractC8005) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC8005, ? extends AbstractC8005> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19461.size();
    }

    public final String toString() {
        return AbstractC5176.m9369(this.f19461.entrySet(), ",", "{", "}", new C5039(28), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC8005> values() {
        return this.f19461.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC8005 abstractC8005, AbstractC8005 abstractC80052) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
