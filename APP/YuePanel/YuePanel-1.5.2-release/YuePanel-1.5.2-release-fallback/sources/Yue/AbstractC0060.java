package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.1")
@Yue.InterfaceC5840({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
public abstract class AbstractC0060<K, V> implements java.util.Map<K, V>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.AbstractC0060.C0061 f128 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public volatile java.util.Set<? extends K> f129;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public volatile java.util.Collection<? extends V> f130;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class C0061 {
        public C0061() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0061(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final boolean m420(@Yue.InterfaceC4418 java.util.Map.Entry<?, ?> r4, @Yue.InterfaceC4543 java.lang.Object r5) {
                r3 = this;
                java.lang.String r0 = "e"
                Yue.C3329.m13906(r4, r0)
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto Lb
                return r1
            Lb:
                java.lang.Object r0 = r4.getKey()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r2 = r5.getKey()
                boolean r0 = Yue.C3329.m13897(r0, r2)
                if (r0 == 0) goto L2a
                java.lang.Object r4 = r4.getValue()
                java.lang.Object r5 = r5.getValue()
                boolean r4 = Yue.C3329.m13897(r4, r5)
                if (r4 == 0) goto L2a
                r1 = 1
            L2a:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int m421(@Yue.InterfaceC4418 java.util.Map.Entry<?, ?> r3) {
                r2 = this;
                java.lang.String r0 = "e"
                Yue.C3329.m13906(r3, r0)
                java.lang.Object r0 = r3.getKey()
                r1 = 0
                if (r0 == 0) goto L11
                int r0 = r0.hashCode()
                goto L12
            L11:
                r0 = r1
            L12:
                java.lang.Object r3 = r3.getValue()
                if (r3 == 0) goto L1c
                int r1 = r3.hashCode()
            L1c:
                r3 = r0 ^ r1
                return r3
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.String m422(@Yue.InterfaceC4418 java.util.Map.Entry<?, ?> r3) {
                r2 = this;
                java.lang.String r0 = "e"
                Yue.C3329.m13906(r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r3.getKey()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                java.lang.Object r3 = r3.getValue()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟, reason: contains not printable characters */
    public static final class C0062 extends Yue.AbstractC0092<K> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0060<K, V> f131;

        /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C0063 implements java.util.Iterator<K>, Yue.InterfaceC3443 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ java.util.Iterator<java.util.Map.Entry<K, V>> f132;

            public C0063(java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                    r0 = this;
                    r0.f132 = r1
                    r0.<init>()
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, V>> r0 = r1.f132
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public K next() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, V>> r0 = r1.f132
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r0 = r0.getKey()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r2 = this;
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    java.lang.String r1 = "Operation is not supported for read-only collection"
                    r0.<init>(r1)
                    throw r0
            }
        }

        public C0062(Yue.AbstractC0060<K, ? extends V> r1) {
                r0 = this;
                r0.f131 = r1
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC0041, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                Yue.ۥ۟۟ۡۤ<K, V> r0 = r1.f131
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // Yue.AbstractC0092, Yue.AbstractC0041, java.util.Collection, java.lang.Iterable
        @Yue.InterfaceC4418
        public java.util.Iterator<K> iterator() {
                r2 = this;
                Yue.ۥ۟۟ۡۤ<K, V> r0 = r2.f131
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                Yue.ۥ۟۟ۡۤ$ۥ۟$ۥ r1 = new Yue.ۥ۟۟ۡۤ$ۥ۟$ۥ
                r1.<init>(r0)
                return r1
        }

        @Override // Yue.AbstractC0041
        /* JADX INFO: renamed from: ۥ */
        public int mo368() {
                r1 = this;
                Yue.ۥ۟۟ۡۤ<K, V> r0 = r1.f131
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟۟, reason: contains not printable characters */
    public static final class C0064 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.util.Map.Entry<? extends K, ? extends V>, java.lang.CharSequence> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0060<K, V> f133;

        public C0064(Yue.AbstractC0060<K, ? extends V> r1) {
                r0 = this;
                r0.f133 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.CharSequence invoke(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.CharSequence r1 = r0.m423(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.CharSequence m423(@Yue.InterfaceC4418 java.util.Map.Entry<? extends K, ? extends V> r2) {
                r1 = this;
                java.lang.String r0 = "it"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥ۟۟ۡۤ<K, V> r0 = r1.f133
                java.lang.String r2 = Yue.AbstractC0060.m411(r0, r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C0065 extends Yue.AbstractC0041<V> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0060<K, V> f134;

        /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۤ$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        public static final class C0066 implements java.util.Iterator<V>, Yue.InterfaceC3443 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ java.util.Iterator<java.util.Map.Entry<K, V>> f135;

            public C0066(java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                    r0 = this;
                    r0.f135 = r1
                    r0.<init>()
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, V>> r0 = r1.f135
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public V next() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, V>> r0 = r1.f135
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r0 = r0.getValue()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r2 = this;
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    java.lang.String r1 = "Operation is not supported for read-only collection"
                    r0.<init>(r1)
                    throw r0
            }
        }

        public C0065(Yue.AbstractC0060<K, ? extends V> r1) {
                r0 = this;
                r0.f134 = r1
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC0041, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                Yue.ۥ۟۟ۡۤ<K, V> r0 = r1.f134
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // Yue.AbstractC0041, java.util.Collection, java.lang.Iterable
        @Yue.InterfaceC4418
        public java.util.Iterator<V> iterator() {
                r2 = this;
                Yue.ۥ۟۟ۡۤ<K, V> r0 = r2.f134
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                Yue.ۥ۟۟ۡۤ$ۥ۟۟۟$ۥ r1 = new Yue.ۥ۟۟ۡۤ$ۥ۟۟۟$ۥ
                r1.<init>(r0)
                return r1
        }

        @Override // Yue.AbstractC0041
        /* JADX INFO: renamed from: ۥ */
        public int mo368() {
                r1 = this;
                Yue.ۥ۟۟ۡۤ<K, V> r0 = r1.f134
                int r0 = r0.size()
                return r0
        }
    }

    static {
            Yue.ۥ۟۟ۡۤ$ۥ r0 = new Yue.ۥ۟۟ۡۤ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.AbstractC0060.f128 = r0
            return
    }

    public AbstractC0060() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.String m411(Yue.AbstractC0060 r0, java.util.Map.Entry r1) {
            java.lang.String r0 = r0.m419(r1)
            return r0
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.m417(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r4) {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L10
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            goto L2b
        L10:
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            boolean r1 = Yue.C3329.m13897(r1, r4)
            if (r1 == 0) goto L14
            r2 = 1
        L2b:
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.m413()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r4.size()
            java.util.Map r5 = (java.util.Map) r5
            int r3 = r5.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            java.util.Set r5 = r5.entrySet()
            boolean r1 = r5 instanceof java.util.Collection
            if (r1 == 0) goto L26
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L26
            goto L3d
        L26:
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = r4.m412(r1)
            if (r1 != 0) goto L2a
            r0 = r2
        L3d:
            return r0
    }

    @Override // java.util.Map
    @Yue.InterfaceC4543
    public V get(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.m417(r1)
            if (r1 == 0) goto Lb
            java.lang.Object r1 = r1.getValue()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.m414()
            return r0
    }

    @Override // java.util.Map
    public V put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.m415()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r9 = this;
            java.util.Set r0 = r9.entrySet()
            Yue.ۥ۟۟ۡۤ$ۥ۟۟ r6 = new Yue.ۥ۟۟ۡۤ$ۥ۟۟
            r6.<init>(r9)
            r7 = 24
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "{"
            java.lang.String r3 = "}"
            r4 = 0
            r5 = 0
            java.lang.String r0 = Yue.C1219.m6398(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.m416()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m412(@Yue.InterfaceC4543 java.util.Map.Entry<?, ?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
            Yue.C3329.m13904(r3, r2)
            java.lang.Object r2 = r3.get(r1)
            boolean r4 = Yue.C3329.m13897(r4, r2)
            if (r4 != 0) goto L1c
            return r0
        L1c:
            if (r2 != 0) goto L2a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>"
            Yue.C3329.m13904(r3, r4)
            boolean r4 = r3.containsKey(r1)
            if (r4 != 0) goto L2a
            return r0
        L2a:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract java.util.Set m413();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Set<K> m414() {
            r1 = this;
            java.util.Set<? extends K> r0 = r1.f129
            if (r0 != 0) goto Lb
            Yue.ۥ۟۟ۡۤ$ۥ۟ r0 = new Yue.ۥ۟۟ۡۤ$ۥ۟
            r0.<init>(r1)
            r1.f129 = r0
        Lb:
            java.util.Set<? extends K> r0 = r1.f129
            Yue.C3329.m13903(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m415() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.size()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.util.Collection<V> m416() {
            r1 = this;
            java.util.Collection<? extends V> r0 = r1.f130
            if (r0 != 0) goto Lb
            Yue.ۥ۟۟ۡۤ$ۥ۟۟۟ r0 = new Yue.ۥ۟۟ۡۤ$ۥ۟۟۟
            r0.<init>(r1)
            r1.f130 = r0
        Lb:
            java.util.Collection<? extends V> r0 = r1.f130
            Yue.C3329.m13903(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.util.Map.Entry<K, V> m417(K r4) {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            boolean r2 = Yue.C3329.m13897(r2, r4)
            if (r2 == 0) goto L8
            goto L21
        L20:
            r1 = 0
        L21:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final java.lang.String m418(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L5
            java.lang.String r1 = "(this Map)"
            goto L9
        L5:
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L9:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.lang.String m419(java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.getKey()
            java.lang.String r1 = r2.m418(r1)
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = r2.m418(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
