package Yue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
@InterfaceC7507({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
public abstract class AbstractC2990<K, V> implements Map<K, V>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0019 f4340 = new C0019(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public volatile Set<? extends K> f4341;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public volatile Collection<? extends V> f4342;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ */
    @InterfaceC7507({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class C0019 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟۟ۡۤ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0019(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public final boolean m58(@InterfaceC6399 Map.Entry<?, ?> entry, @InterfaceC6489 Object obj) {
            C5499.m17103(entry, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            return C5499.m17094(entry.getKey(), entry2.getKey()) && C5499.m17094(entry.getValue(), entry2.getValue());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m59(@InterfaceC6399 Map.Entry<?, ?> entry) {
            C5499.m17103(entry, "e");
            Object key = entry.getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = entry.getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:INVOKE), (wrap:char:SGET), (wrap:java.lang.Object:INVOKE) */
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String m5806(@InterfaceC6399 Map.Entry<?, ?> entry) {
            C5499.m17103(entry, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append(SignatureVisitor.INSTANCEOF);
            sb.append(entry.getValue());
            return sb.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0019() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟ */
    public static final class C0020 extends AbstractC3014<K> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2990<K, V> f4343;

        /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C2991 implements Iterator<K>, InterfaceC5591 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f4344;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Iterator<? extends java.util.Map$Entry<? extends K, ? extends V>> */
            /* JADX WARN: Multi-variable type inference failed */
            public C2991(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f4344 = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4344.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f4344.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟۟ۡۤ<K, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0020(AbstractC2990<K, ? extends V> abstractC2990) {
            this.f4343 = abstractC2990;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean contains(Object obj) {
            return this.f4343.containsKey(obj);
        }

        @Override // Yue.AbstractC3014, Yue.AbstractC2979, java.util.Collection, java.lang.Iterable
        @InterfaceC6399
        public Iterator<K> iterator() {
            return new C2991(this.f4343.entrySet().iterator());
        }

        @Override // Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f4343.size();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟۟, reason: contains not printable characters */
    public static final class C2992 extends AbstractC5673 implements InterfaceC5124<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2990<K, V> f4345;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟۟ۡۤ<K, ? extends V> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2992(AbstractC2990<K, ? extends V> abstractC2990) {
            super(1);
            this.f4345 = abstractC2990;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final CharSequence invoke(@InterfaceC6399 Map.Entry<? extends K, ? extends V> entry) {
            C5499.m17103(entry, "it");
            return this.f4345.m5805(entry);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C2993 extends AbstractC2979<V> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2990<K, V> f4346;

        /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟۟۟$ۥ */
        public static final class C0021 implements Iterator<V>, InterfaceC5591 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f4347;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Iterator<? extends java.util.Map$Entry<? extends K, ? extends V>> */
            /* JADX WARN: Multi-variable type inference failed */
            public C0021(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f4347 = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4347.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f4347.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟۟ۡۤ<K, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public C2993(AbstractC2990<K, ? extends V> abstractC2990) {
            this.f4346 = abstractC2990;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean contains(Object obj) {
            return this.f4346.containsValue(obj);
        }

        @Override // Yue.AbstractC2979, java.util.Collection, java.lang.Iterable
        @InterfaceC6399
        public Iterator<V> iterator() {
            return new C0021(this.f4346.entrySet().iterator());
        }

        @Override // Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f4346.size();
        }
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m5803(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (C5499.m17094(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m5799();
    }

    @Override // java.util.Map
    public boolean equals(@InterfaceC6489 Object obj) {
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
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!m57((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @InterfaceC6489
    public V get(Object obj) {
        Map.Entry<K, V> entryM5803 = m5803(obj);
        if (entryM5803 != null) {
            return entryM5803.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m5800();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m5801();
    }

    @InterfaceC6399
    public String toString() {
        return C3888.m10923(entrySet(), ", ", "{", "}", 0, null, new C2992(this), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m5802();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m57(@InterfaceC6489 Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        C5499.m17101(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v = get(key);
        if (!C5499.m17094(value, v)) {
            return false;
        }
        if (v != null) {
            return true;
        }
        C5499.m17101(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract Set m5799();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Set<K> m5800() {
        if (this.f4341 == null) {
            this.f4341 = new C0020(this);
        }
        Set<? extends K> set = this.f4341;
        C5499.m17100(set);
        return set;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m5801() {
        return entrySet().size();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Collection<V> m5802() {
        if (this.f4342 == null) {
            this.f4342 = new C2993(this);
        }
        Collection<? extends V> collection = this.f4342;
        C5499.m17100(collection);
        return collection;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Map.Entry<K, V> m5803(K k) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C5499.m17094(((Map.Entry) next).getKey(), k)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final String m5804(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final String m5805(Map.Entry<? extends K, ? extends V> entry) {
        return m5804(entry.getKey()) + SignatureVisitor.INSTANCEOF + m5804(entry.getValue());
    }
}
