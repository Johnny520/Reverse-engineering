package a;

/* JADX INFO: loaded from: classes.dex */
public class Gd<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.Gd.c<K, V> f101a;
    public a.Gd.c<K, V> b;
    public final java.util.WeakHashMap<a.Gd.f<K, V>, java.lang.Boolean> c;
    public int d;

    public static class a<K, V> extends a.Gd.e<K, V> {
        @Override // a.Gd.e
        public final a.Gd.c<K, V> b(a.Gd.c<K, V> r1) {
                r0 = this;
                a.Gd$c<K, V> r1 = r1.d
                return r1
        }

        @Override // a.Gd.e
        public final a.Gd.c<K, V> c(a.Gd.c<K, V> r1) {
                r0 = this;
                a.Gd$c<K, V> r1 = r1.c
                return r1
        }
    }

    public static class b<K, V> extends a.Gd.e<K, V> {
        @Override // a.Gd.e
        public final a.Gd.c<K, V> b(a.Gd.c<K, V> r1) {
                r0 = this;
                a.Gd$c<K, V> r1 = r1.c
                return r1
        }

        @Override // a.Gd.e
        public final a.Gd.c<K, V> c(a.Gd.c<K, V> r1) {
                r0 = this;
                a.Gd$c<K, V> r1 = r1.d
                return r1
        }
    }

    public static class c<K, V> implements java.util.Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f102a;
        public final V b;
        public a.Gd.c<K, V> c;
        public a.Gd.c<K, V> d;

        public c(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.f102a = r1
                r0.b = r2
                return
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.Gd.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.Gd$c r5 = (a.Gd.c) r5
                K r1 = r5.f102a
                K r3 = r4.f102a
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L21
                V r1 = r4.b
                V r5 = r5.b
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                return r0
            L21:
                return r2
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
                r1 = this;
                K r0 = r1.f102a
                return r0
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
                r1 = this;
                V r0 = r1.b
                return r0
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
                r2 = this;
                K r0 = r2.f102a
                int r0 = r0.hashCode()
                V r1 = r2.b
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public final V setValue(V r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "An entry modification is not supported"
                r2.<init>(r0)
                throw r2
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.f102a
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public class d extends a.Gd.f<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.Gd.c<K, V> f103a;
        public boolean b;
        public final /* synthetic */ a.Gd c;

        public d(a.Gd r1) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r1 = 1
                r0.b = r1
                return
        }

        @Override // a.Gd.f
        public final void a(a.Gd.c<K, V> r2) {
                r1 = this;
                a.Gd$c<K, V> r0 = r1.f103a
                if (r2 != r0) goto Lf
                a.Gd$c<K, V> r2 = r0.d
                r1.f103a = r2
                if (r2 != 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                r1.b = r2
            Lf:
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r3 = this;
                boolean r0 = r3.b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Le
                a.Gd r0 = r3.c
                a.Gd$c<K, V> r0 = r0.f101a
                if (r0 == 0) goto Ld
                return r2
            Ld:
                return r1
            Le:
                a.Gd$c<K, V> r0 = r3.f103a
                if (r0 == 0) goto L17
                a.Gd$c<K, V> r0 = r0.c
                if (r0 == 0) goto L17
                return r2
            L17:
                return r1
        }

        @Override // java.util.Iterator
        public final java.lang.Object next() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto Le
                r0 = 0
                r1.b = r0
                a.Gd r0 = r1.c
                a.Gd$c<K, V> r0 = r0.f101a
                r1.f103a = r0
                goto L18
            Le:
                a.Gd$c<K, V> r0 = r1.f103a
                if (r0 == 0) goto L15
                a.Gd$c<K, V> r0 = r0.c
                goto L16
            L15:
                r0 = 0
            L16:
                r1.f103a = r0
            L18:
                a.Gd$c<K, V> r0 = r1.f103a
                return r0
        }
    }

    public static abstract class e<K, V> extends a.Gd.f<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.Gd.c<K, V> f104a;
        public a.Gd.c<K, V> b;

        public e(a.Gd.c<K, V> r1, a.Gd.c<K, V> r2) {
                r0 = this;
                r0.<init>()
                r0.f104a = r2
                r0.b = r1
                return
        }

        @Override // a.Gd.f
        public final void a(a.Gd.c<K, V> r3) {
                r2 = this;
                a.Gd$c<K, V> r0 = r2.f104a
                r1 = 0
                if (r0 != r3) goto Ld
                a.Gd$c<K, V> r0 = r2.b
                if (r3 != r0) goto Ld
                r2.b = r1
                r2.f104a = r1
            Ld:
                a.Gd$c<K, V> r0 = r2.f104a
                if (r0 != r3) goto L17
                a.Gd$c r0 = r2.b(r0)
                r2.f104a = r0
            L17:
                a.Gd$c<K, V> r0 = r2.b
                if (r0 != r3) goto L28
                a.Gd$c<K, V> r3 = r2.f104a
                if (r0 == r3) goto L26
                if (r3 != 0) goto L22
                goto L26
            L22:
                a.Gd$c r1 = r2.c(r0)
            L26:
                r2.b = r1
            L28:
                return
        }

        public abstract a.Gd.c<K, V> b(a.Gd.c<K, V> r1);

        public abstract a.Gd.c<K, V> c(a.Gd.c<K, V> r1);

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r1 = this;
                a.Gd$c<K, V> r0 = r1.b
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final java.lang.Object next() {
                r2 = this;
                a.Gd$c<K, V> r0 = r2.b
                a.Gd$c<K, V> r1 = r2.f104a
                if (r0 == r1) goto Le
                if (r1 != 0) goto L9
                goto Le
            L9:
                a.Gd$c r1 = r2.c(r0)
                goto Lf
            Le:
                r1 = 0
            Lf:
                r2.b = r1
                return r0
        }
    }

    public static abstract class f<K, V> {
        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void a(a.Gd.c<K, V> r1);
    }

    public Gd() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.d = r0
            return
    }

    public a.Gd.c<K, V> a(K r3) {
            r2 = this;
            a.Gd$c<K, V> r0 = r2.f101a
        L2:
            if (r0 == 0) goto L10
            K r1 = r0.f102a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            a.Gd$c<K, V> r0 = r0.c
            goto L2
        L10:
            return r0
    }

    public V b(K r4) {
            r3 = this;
            a.Gd$c r4 = r3.a(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.d
            int r1 = r1 + (-1)
            r3.d = r1
            java.util.WeakHashMap<a.Gd$f<K, V>, java.lang.Boolean> r1 = r3.c
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2e
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            a.Gd$f r2 = (a.Gd.f) r2
            r2.a(r4)
            goto L1e
        L2e:
            a.Gd$c<K, V> r1 = r4.d
            if (r1 == 0) goto L37
            a.Gd$c<K, V> r2 = r4.c
            r1.c = r2
            goto L3b
        L37:
            a.Gd$c<K, V> r2 = r4.c
            r3.f101a = r2
        L3b:
            a.Gd$c<K, V> r2 = r4.c
            if (r2 == 0) goto L42
            r2.d = r1
            goto L44
        L42:
            r3.b = r1
        L44:
            r4.c = r0
            r4.d = r0
            V r4 = r4.b
            return r4
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof a.Gd
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.Gd r7 = (a.Gd) r7
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            a.Gd$e r3 = (a.Gd.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            a.Gd$e r4 = (a.Gd.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            a.Gd$e r7 = (a.Gd.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        L5:
            r2 = r0
            a.Gd$e r2 = (a.Gd.e) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto L5
        L1a:
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r3 = this;
            a.Gd$a r0 = new a.Gd$a
            a.Gd$c<K, V> r1 = r3.f101a
            a.Gd$c<K, V> r2 = r3.b
            r0.<init>(r1, r2)
            java.util.WeakHashMap<a.Gd$f<K, V>, java.lang.Boolean> r1 = r3.c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r0, r2)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        Lb:
            r2 = r1
            a.Gd$e r2 = (a.Gd.e) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto Lb
            java.lang.String r2 = ", "
            r0.append(r2)
            goto Lb
        L2d:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
