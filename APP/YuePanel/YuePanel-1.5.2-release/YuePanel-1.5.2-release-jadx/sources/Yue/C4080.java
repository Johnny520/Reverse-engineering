package Yue;

import Yue.InterfaceC5597;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4080<K, V> extends AbstractC2997<K, V> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8131 = AtomicIntegerFieldUpdater.newUpdater(C4080.class, "_size");

    @InterfaceC6399
    private volatile /* synthetic */ int _size;

    @InterfaceC6399
    volatile /* synthetic */ Object core;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public final ReferenceQueue<K> f8132;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ */
    public final class C0319 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f8133 = AtomicIntegerFieldUpdater.newUpdater(C0319.class, "load");

        @InterfaceC6399
        private volatile /* synthetic */ int load = 0;

        /* JADX INFO: renamed from: ۥ */
        public final int f655;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f656;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f8134;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public /* synthetic */ AtomicReferenceArray f8135;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public /* synthetic */ AtomicReferenceArray f8136;

        /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ$ۥ, reason: contains not printable characters */
        public final class C4081<E> implements Iterator<E>, InterfaceC5594 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            @InterfaceC6399
            public final InterfaceC5138<K, V, E> f8138;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f8139 = -1;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public K f8140;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public V f8141;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super K, ? super V, ? extends E> */
            /* JADX WARN: Multi-variable type inference failed */
            public C4081(@InterfaceC6399 InterfaceC5138<? super K, ? super V, ? extends E> interfaceC5138) {
                this.f8138 = interfaceC5138;
                m1039();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f8139 < C0319.this.f655;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.Iterator
            public E next() {
                if (this.f8139 >= C0319.this.f655) {
                    throw new NoSuchElementException();
                }
                InterfaceC5138<K, V, E> interfaceC5138 = this.f8138;
                K k = this.f8140;
                if (k == false) {
                    C5499.m17132(C6659.f17103);
                    k = (K) C8107.f3222;
                }
                V v = this.f8141;
                if (v == false) {
                    C5499.m17132("value");
                    v = (V) C8107.f3222;
                }
                E e = (E) interfaceC5138.invoke(k, v);
                m1039();
                return e;
            }

            /* JADX INFO: renamed from: ۥ */
            public final void m1039() {
                K k;
                while (true) {
                    int i = this.f8139 + 1;
                    this.f8139 = i;
                    if (i >= C0319.this.f655) {
                        return;
                    }
                    C5252 c5252 = (C5252) C0319.this.f8135.get(this.f8139);
                    if (c5252 != null && (k = (K) c5252.get()) != null) {
                        this.f8140 = k;
                        Object obj = (V) C0319.this.f8136.get(this.f8139);
                        if (obj instanceof C5948) {
                            obj = (V) ((C5948) obj).f1791;
                        }
                        if (obj != null) {
                            this.f8141 = (V) obj;
                            return;
                        }
                    }
                }
            }

            /* JADX DEBUG: Method merged with bridge method: remove()V */
            @Override // java.util.Iterator
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                C4085.m11542();
                throw new C5667();
            }
        }

        public C0319(int i) {
            this.f655 = i;
            this.f656 = Integer.numberOfLeadingZeros(i) + 1;
            this.f8134 = (i * 2) / 3;
            this.f8135 = new AtomicReferenceArray(i);
            this.f8136 = new AtomicReferenceArray(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥ۟ۦۦ۟$ۥ */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static /* synthetic */ Object m11532(C0319 c0319, Object obj, Object obj2, C5252 c5252, int i, Object obj3) {
            if ((i & 4) != 0) {
                c5252 = null;
            }
            return c0319.m11536(obj, obj2, c5252);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m1038(@InterfaceC6399 C5252<?> c5252) {
            int iM11534 = m11534(c5252.f1368);
            while (true) {
                C5252<?> c52522 = (C5252) this.f8135.get(iM11534);
                if (c52522 == null) {
                    return;
                }
                if (c52522 == c5252) {
                    m11538(iM11534);
                    return;
                } else {
                    if (iM11534 == 0) {
                        iM11534 = this.f655;
                    }
                    iM11534--;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: V */
        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final V m11533(@InterfaceC6399 K k) {
            int iM11534 = m11534(k.hashCode());
            while (true) {
                C5252 c5252 = (C5252) this.f8135.get(iM11534);
                if (c5252 == null) {
                    return null;
                }
                T t = c5252.get();
                if (C5499.m17094(k, t)) {
                    V v = (V) this.f8136.get(iM11534);
                    return v instanceof C5948 ? (V) ((C5948) v).f1791 : v;
                }
                if (t == 0) {
                    m11538(iM11534);
                }
                if (iM11534 == 0) {
                    iM11534 = this.f655;
                }
                iM11534--;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m11534(int i) {
            return (i * (-1640531527)) >>> this.f656;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final <E> Iterator<E> m11535(@InterfaceC6399 InterfaceC5138<? super K, ? super V, ? extends E> interfaceC5138) {
            return new C4081(interfaceC5138);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final Object m11536(@InterfaceC6399 K k, @InterfaceC6489 V v, @InterfaceC6489 C5252<K> c5252) {
            int i;
            Object obj;
            int iM11534 = m11534(k.hashCode());
            boolean z = false;
            while (true) {
                C5252 c52522 = (C5252) this.f8135.get(iM11534);
                if (c52522 != null) {
                    T t = c52522.get();
                    if (!C5499.m17094(k, t)) {
                        if (t == 0) {
                            m11538(iM11534);
                        }
                        if (iM11534 == 0) {
                            iM11534 = this.f655;
                        }
                        iM11534--;
                    } else if (z) {
                        f8133.decrementAndGet(this);
                    }
                } else if (v != null) {
                    if (!z) {
                        do {
                            i = this.load;
                            if (i >= this.f8134) {
                                return C4085.f8149;
                            }
                        } while (!f8133.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (c5252 == null) {
                        c5252 = new C5252<>(k, C4080.this.f8132);
                    }
                    if (C4079.m1036(this.f8135, iM11534, null, c5252)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
            do {
                obj = this.f8136.get(iM11534);
                if (obj instanceof C5948) {
                    return C4085.f8149;
                }
            } while (!C4079.m1036(this.f8136, iM11534, obj, v));
            return obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Yue.ۥ۟ۦۦ۟<K, V>$ۥ */
        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C4080<K, V>.C0319 m11537() {
            int i;
            Object obj;
            while (true) {
                C4080<K, V>.C0319 c0319 = (C4080<K, V>.C0319) C4080.this.new C0319(Integer.highestOneBit(C7007.m21661(C4080.this.size(), 4)) * 4);
                int i2 = this.f655;
                while (i < i2) {
                    C5252 c5252 = (C5252) this.f8135.get(i);
                    Object obj2 = c5252 != null ? c5252.get() : null;
                    if (c5252 != null && obj2 == null) {
                        m11538(i);
                    }
                    while (true) {
                        obj = this.f8136.get(i);
                        if (obj instanceof C5948) {
                            obj = ((C5948) obj).f1791;
                            break;
                        }
                        if (C4079.m1036(this.f8136, i, obj, C4085.m11541(obj))) {
                            break;
                        }
                    }
                    i = (obj2 == null || obj == null || c0319.m11536(obj2, obj, c5252) != C4085.f8149) ? i + 1 : 0;
                }
                return c0319;
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m11538(int i) {
            Object obj;
            do {
                obj = this.f8136.get(i);
                if (obj == null || (obj instanceof C5948)) {
                    return;
                }
            } while (!C4079.m1036(this.f8136, i, obj, null));
            C4080.this.m11529();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ۟ */
    public static final class C0320<K, V> implements Map.Entry<K, V>, InterfaceC5597.InterfaceC0801 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final K f8143;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final V f8144;

        public C0320(K k, V v) {
            this.f8143 = k;
            this.f8144 = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f8143;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f8144;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C4085.m11542();
            throw new C5667();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ۟۟, reason: contains not printable characters */
    public final class C4082<E> extends AbstractC2998<E> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC5138<K, V, E> f8145;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super K, ? super V, ? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4082(@InterfaceC6399 InterfaceC5138<? super K, ? super V, ? extends E> interfaceC5138) {
            this.f8145 = interfaceC5138;
        }

        @Override // Yue.AbstractC2998, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e) {
            C4085.m11542();
            throw new C5667();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @InterfaceC6399
        public Iterator<E> iterator() {
            return ((C0319) C4080.this.core).m11535(this.f8145);
        }

        @Override // Yue.AbstractC2998
        /* JADX INFO: renamed from: ۥ */
        public int mo66() {
            return C4080.this.size();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4083 extends AbstractC5673 implements InterfaceC5138<K, V, Map.Entry<K, V>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C4083 f8147 = new C4083();

        public C4083() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Map.Entry<K, V> invoke(@InterfaceC6399 K k, @InterfaceC6399 V v) {
            return new C0320(k, v);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۦ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4084 extends AbstractC5673 implements InterfaceC5138<K, V, K> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C4084 f8148 = new C4084();

        public C4084() {
            super(2);
        }

        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        public final K invoke(@InterfaceC6399 K k, @InterfaceC6399 V v) {
            return k;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4080() {
        this(false, 1, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC6489
    public V get(@InterfaceC6489 Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((C0319) this.core).m11533(obj);
    }

    @Override // Yue.AbstractC2997, java.util.AbstractMap, java.util.Map
    @InterfaceC6489
    public V put(@InterfaceC6399 K k, @InterfaceC6399 V v) {
        V vM11530 = (V) C0319.m11532((C0319) this.core, k, v, null, 4, null);
        if (vM11530 == C4085.f8149) {
            vM11530 = m11530(k, v);
        }
        if (vM11530 == null) {
            f8131.incrementAndGet(this);
        }
        return vM11530;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC6489
    public V remove(@InterfaceC6489 Object obj) {
        if (obj == 0) {
            return null;
        }
        V vM11530 = (V) C0319.m11532((C0319) this.core, obj, null, null, 4, null);
        if (vM11530 == C4085.f8149) {
            vM11530 = m11530(obj, null);
        }
        if (vM11530 != null) {
            f8131.decrementAndGet(this);
        }
        return vM11530;
    }

    @Override // Yue.AbstractC2997
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public Set<Map.Entry<K, V>> mo64() {
        return new C4082(C4083.f8147);
    }

    @Override // Yue.AbstractC2997
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public Set<K> mo65() {
        return new C4082(C4084.f8148);
    }

    @Override // Yue.AbstractC2997
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo5810() {
        return this._size;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m11528(C5252<?> c5252) {
        ((C0319) this.core).m1038(c5252);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m11529() {
        f8131.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final synchronized V m11530(K k, V v) {
        V v2;
        C0319 c0319M11537 = (C0319) this.core;
        while (true) {
            v2 = (V) C0319.m11532(c0319M11537, k, v, null, 4, null);
            if (v2 == C4085.f8149) {
                c0319M11537 = c0319M11537.m11537();
                this.core = c0319M11537;
            }
        }
        return v2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m11531() {
        if (this.f8132 == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.f8132.remove();
                if (referenceRemove == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                }
                m11528((C5252) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:2) call: Yue.ۥ۟ۦۦ۟.<init>(boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C4080(boolean z, int i, C4335 c4335) {
        this((i & 1) != 0 ? false : z);
    }

    public C4080(boolean z) {
        this._size = 0;
        this.core = new C0319(16);
        this.f8132 = z ? new ReferenceQueue<>() : null;
    }
}
