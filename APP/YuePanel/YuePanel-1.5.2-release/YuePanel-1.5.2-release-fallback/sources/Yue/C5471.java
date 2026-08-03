package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C5471<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C5471.C5474<K, V> f20279;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.C5471.C5474<K, V> f20280;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final java.util.WeakHashMap<Yue.C5471.AbstractC5477<K, V>, java.lang.Boolean> f20281;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f20282;

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ, reason: contains not printable characters */
    public static class C5472<K, V> extends Yue.C5471.AbstractC5476<K, V> {
        public C5472(Yue.C5471.C5474<K, V> r1, Yue.C5471.C5474<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.C5471.AbstractC5476
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C5471.C5474<K, V> mo20630(Yue.C5471.C5474<K, V> r1) {
                r0 = this;
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r1 = r1.f20286
                return r1
        }

        @Override // Yue.C5471.AbstractC5476
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C5471.C5474<K, V> mo20631(Yue.C5471.C5474<K, V> r1) {
                r0 = this;
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r1 = r1.f20285
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟, reason: contains not printable characters */
    public static class C5473<K, V> extends Yue.C5471.AbstractC5476<K, V> {
        public C5473(Yue.C5471.C5474<K, V> r1, Yue.C5471.C5474<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.C5471.AbstractC5476
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.C5471.C5474<K, V> mo20630(Yue.C5471.C5474<K, V> r1) {
                r0 = this;
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r1 = r1.f20285
                return r1
        }

        @Override // Yue.C5471.AbstractC5476
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Yue.C5471.C5474<K, V> mo20631(Yue.C5471.C5474<K, V> r1) {
                r0 = this;
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r1 = r1.f20286
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C5474<K, V> implements java.util.Map.Entry<K, V> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final K f20283;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final V f20284;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Yue.C5471.C5474<K, V> f20285;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Yue.C5471.C5474<K, V> f20286;

        public C5474(@Yue.InterfaceC4410 K r1, @Yue.InterfaceC4410 V r2) {
                r0 = this;
                r0.<init>()
                r0.f20283 = r1
                r0.f20284 = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof Yue.C5471.C5474
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                Yue.ۥۡۧۢۥ$ۥ۟۟ r5 = (Yue.C5471.C5474) r5
                K r1 = r4.f20283
                K r3 = r5.f20283
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                V r1 = r4.f20284
                V r5 = r5.f20284
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = r2
            L22:
                return r0
        }

        @Override // java.util.Map.Entry
        @Yue.InterfaceC4410
        public K getKey() {
                r1 = this;
                K r0 = r1.f20283
                return r0
        }

        @Override // java.util.Map.Entry
        @Yue.InterfaceC4410
        public V getValue() {
                r1 = this;
                V r0 = r1.f20284
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r2 = this;
                K r0 = r2.f20283
                int r0 = r0.hashCode()
                V r1 = r2.f20284
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "An entry modification is not supported"
                r2.<init>(r0)
                throw r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.f20283
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.f20284
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public class C5475 extends Yue.C5471.AbstractC5477<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Yue.C5471.C5474<K, V> f20287;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f20288;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5471 f20289;

        public C5475(Yue.C5471 r1) {
                r0 = this;
                r0.f20289 = r1
                r0.<init>()
                r1 = 1
                r0.f20288 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                boolean r0 = r3.f20288
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Le
                Yue.ۥۡۧۢۥ r0 = r3.f20289
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r0.f20279
                if (r0 == 0) goto Ld
                r1 = r2
            Ld:
                return r1
            Le:
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r3.f20287
                if (r0 == 0) goto L17
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r0.f20285
                if (r0 == 0) goto L17
                r1 = r2
            L17:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.m20633()
                return r0
        }

        @Override // Yue.C5471.AbstractC5477
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo20632(@Yue.InterfaceC4410 Yue.C5471.C5474<K, V> r2) {
                r1 = this;
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20287
                if (r2 != r0) goto Lf
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r2 = r0.f20286
                r1.f20287 = r2
                if (r2 != 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                r1.f20288 = r2
            Lf:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.util.Map.Entry<K, V> m20633() {
                r1 = this;
                boolean r0 = r1.f20288
                if (r0 == 0) goto Le
                r0 = 0
                r1.f20288 = r0
                Yue.ۥۡۧۢۥ r0 = r1.f20289
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r0.f20279
                r1.f20287 = r0
                goto L18
            Le:
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20287
                if (r0 == 0) goto L15
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r0.f20285
                goto L16
            L15:
                r0 = 0
            L16:
                r1.f20287 = r0
            L18:
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20287
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC5476<K, V> extends Yue.C5471.AbstractC5477<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Yue.C5471.C5474<K, V> f20290;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Yue.C5471.C5474<K, V> f20291;

        public AbstractC5476(Yue.C5471.C5474<K, V> r1, Yue.C5471.C5474<K, V> r2) {
                r0 = this;
                r0.<init>()
                r0.f20290 = r2
                r0.f20291 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20291
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.m20634()
                return r0
        }

        @Override // Yue.C5471.AbstractC5477
        /* JADX INFO: renamed from: ۥ */
        public void mo20632(@Yue.InterfaceC4410 Yue.C5471.C5474<K, V> r2) {
                r1 = this;
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20290
                if (r0 != r2) goto Ld
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20291
                if (r2 != r0) goto Ld
                r0 = 0
                r1.f20291 = r0
                r1.f20290 = r0
            Ld:
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20290
                if (r0 != r2) goto L17
                Yue.ۥۡۧۢۥ$ۥ۟۟ r0 = r1.mo20630(r0)
                r1.f20290 = r0
            L17:
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20291
                if (r0 != r2) goto L21
                Yue.ۥۡۧۢۥ$ۥ۟۟ r2 = r1.m20635()
                r1.f20291 = r2
            L21:
                return
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract Yue.C5471.C5474<K, V> mo20630(Yue.C5471.C5474<K, V> r1);

        /* JADX INFO: renamed from: ۥ۟۟ */
        public abstract Yue.C5471.C5474<K, V> mo20631(Yue.C5471.C5474<K, V> r1);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public java.util.Map.Entry<K, V> m20634() {
                r2 = this;
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r2.f20291
                Yue.ۥۡۧۢۥ$ۥ۟۟ r1 = r2.m20635()
                r2.f20291 = r1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final Yue.C5471.C5474<K, V> m20635() {
                r2 = this;
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r2.f20291
                Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r1 = r2.f20290
                if (r0 == r1) goto Le
                if (r1 != 0) goto L9
                goto Le
            L9:
                Yue.ۥۡۧۢۥ$ۥ۟۟ r0 = r2.mo20631(r0)
                return r0
            Le:
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public static abstract class AbstractC5477<K, V> {
        public AbstractC5477() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract void mo20632(@Yue.InterfaceC4410 Yue.C5471.C5474<K, V> r1);
    }

    public C5471() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f20281 = r0
            r0 = 0
            r1.f20282 = r0
            return
    }

    @Yue.InterfaceC4410
    public java.util.Iterator<java.util.Map.Entry<K, V>> descendingIterator() {
            r3 = this;
            Yue.ۥۡۧۢۥ$ۥ۟ r0 = new Yue.ۥۡۧۢۥ$ۥ۟
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r1 = r3.f20280
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r2 = r3.f20279
            r0.<init>(r1, r2)
            java.util.WeakHashMap<Yue.ۥۡۧۢۥ$ۥ۟۟۟۠<K, V>, java.lang.Boolean> r1 = r3.f20281
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r0, r2)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof Yue.C5471
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥۡۧۢۥ r6 = (Yue.C5471) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            java.util.Iterator r1 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L42
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r6.next()
            if (r3 != 0) goto L39
            if (r4 != 0) goto L41
        L39:
            if (r3 == 0) goto L1f
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1f
        L41:
            return r2
        L42:
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L4f
            boolean r6 = r6.hasNext()
            if (r6 != 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto L5
        L17:
            return r1
    }

    @Override // java.lang.Iterable
    @Yue.InterfaceC4410
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r3 = this;
            Yue.ۥۡۧۢۥ$ۥ r0 = new Yue.ۥۡۧۢۥ$ۥ
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r1 = r3.f20279
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r2 = r3.f20280
            r0.<init>(r1, r2)
            java.util.WeakHashMap<Yue.ۥۡۧۢۥ$ۥ۟۟۟۠<K, V>, java.lang.Boolean> r1 = r3.f20281
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r0, r2)
            return r0
    }

    public int size() {
            r1 = this;
            int r0 = r1.f20282
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.util.Iterator r1 = r3.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le
            java.lang.String r2 = ", "
            r0.append(r2)
            goto Le
        L2d:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.Map.Entry<K, V> m20626() {
            r1 = this;
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20279
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.C5471.C5474<K, V> mo10710(K r3) {
            r2 = this;
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r2.f20279
        L2:
            if (r0 == 0) goto L10
            K r1 = r0.f20283
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r0.f20285
            goto L2
        L10:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C5471<K, V>.C5475 m20627() {
            r3 = this;
            Yue.ۥۡۧۢۥ$ۥ۟۟۟ r0 = new Yue.ۥۡۧۢۥ$ۥ۟۟۟
            r0.<init>(r3)
            java.util.WeakHashMap<Yue.ۥۡۧۢۥ$ۥ۟۟۟۠<K, V>, java.lang.Boolean> r1 = r3.f20281
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r0, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Map.Entry<K, V> m20628() {
            r1 = this;
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r0 = r1.f20280
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C5471.C5474<K, V> m20629(@Yue.InterfaceC4410 K r2, @Yue.InterfaceC4410 V r3) {
            r1 = this;
            Yue.ۥۡۧۢۥ$ۥ۟۟ r0 = new Yue.ۥۡۧۢۥ$ۥ۟۟
            r0.<init>(r2, r3)
            int r2 = r1.f20282
            int r2 = r2 + 1
            r1.f20282 = r2
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r2 = r1.f20280
            if (r2 != 0) goto L14
            r1.f20279 = r0
            r1.f20280 = r0
            return r0
        L14:
            r2.f20285 = r0
            r0.f20286 = r2
            r1.f20280 = r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public V mo10711(@Yue.InterfaceC4410 K r2, @Yue.InterfaceC4410 V r3) {
            r1 = this;
            Yue.ۥۡۧۢۥ$ۥ۟۟ r0 = r1.mo10710(r2)
            if (r0 == 0) goto L9
            V r2 = r0.f20284
            return r2
        L9:
            r1.m20629(r2, r3)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public V mo10712(@Yue.InterfaceC4410 K r4) {
            r3 = this;
            Yue.ۥۡۧۢۥ$ۥ۟۟ r4 = r3.mo10710(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.f20282
            int r1 = r1 + (-1)
            r3.f20282 = r1
            java.util.WeakHashMap<Yue.ۥۡۧۢۥ$ۥ۟۟۟۠<K, V>, java.lang.Boolean> r1 = r3.f20281
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L30
            java.util.WeakHashMap<Yue.ۥۡۧۢۥ$ۥ۟۟۟۠<K, V>, java.lang.Boolean> r1 = r3.f20281
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            Yue.ۥۡۧۢۥ$ۥ۟۟۟۠ r2 = (Yue.C5471.AbstractC5477) r2
            r2.mo20632(r4)
            goto L20
        L30:
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r1 = r4.f20286
            if (r1 == 0) goto L39
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r2 = r4.f20285
            r1.f20285 = r2
            goto L3d
        L39:
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r2 = r4.f20285
            r3.f20279 = r2
        L3d:
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r2 = r4.f20285
            if (r2 == 0) goto L44
            r2.f20286 = r1
            goto L46
        L44:
            r3.f20280 = r1
        L46:
            r4.f20285 = r0
            r4.f20286 = r0
            V r4 = r4.f20284
            return r4
    }
}
