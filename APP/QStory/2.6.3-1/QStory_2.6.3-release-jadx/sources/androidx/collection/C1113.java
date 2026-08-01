package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1113 implements Map, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1128 f1301;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1126 f1302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1118 f1303;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1083 f1304;

    public C1113(C1083 c1083) {
        c1083.getClass();
        this.f1304 = c1083;
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
        return this.f1304.m1312(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f1304.m1311(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1126 c1126 = this.f1302;
        if (c1126 != null) {
            return c1126;
        }
        C1126 c11262 = new C1126(this.f1304);
        this.f1302 = c11262;
        return c11262;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1113.class != obj.getClass()) {
            return false;
        }
        return AbstractC5227.m9466(this.f1304, ((C1113) obj).f1304);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f1304.m1317(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f1304.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f1304.m1320();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1118 c1118 = this.f1303;
        if (c1118 != null) {
            return c1118;
        }
        C1118 c11182 = new C1118(this.f1304);
        this.f1303 = c11182;
        return c11182;
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
        return this.f1304.f1222;
    }

    public final String toString() {
        return this.f1304.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C1128 c1128 = this.f1301;
        if (c1128 != null) {
            return c1128;
        }
        C1128 c11282 = new C1128(this.f1304);
        this.f1301 = c11282;
        return c11282;
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
