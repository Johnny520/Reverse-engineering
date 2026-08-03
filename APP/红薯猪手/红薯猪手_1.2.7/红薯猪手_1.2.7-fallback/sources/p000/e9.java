package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e9<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.WeakHashMap<java.lang.Object, java.lang.Boolean> f305;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f306;

    public static class a<K, V> extends ۟.e9.c<K, V> {
        public a(۟.e9.b<K, V> r1, ۟.e9.b<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public static class b<K, V> implements java.util.Map.Entry<K, V> {
    }

    public static abstract class c<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        public c(۟.e9.b<K, V> r1, ۟.e9.b<K, V> r2) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public final java.lang.Object next() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public e9() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f305 = r0
            r0 = 0
            r1.f306 = r0
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p000.e9
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ۟.e9 r7 = (p000.e9) r7
            int r1 = r6.f306
            int r3 = r7.f306
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            ۟.e9$c r3 = (۟.e9.c) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            ۟.e9$c r4 = (۟.e9.c) r4
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
            ۟.e9$c r7 = (۟.e9.c) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        L5:
            r2 = r0
            ۟.e9$c r2 = (۟.e9.c) r2
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
            ۟.e9$a r0 = new ۟.e9$a
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            java.util.WeakHashMap<java.lang.Object, java.lang.Boolean> r1 = r3.f305
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r0, r2)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "["
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.util.Iterator r1 = r4.iterator()
        La:
            r2 = r1
            ۟.e9$c r2 = (۟.e9.c) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto La
            java.lang.String r2 = ", "
            r0.append(r2)
            goto La
        L2c:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
