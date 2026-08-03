package a;

/* JADX INFO: loaded from: classes.dex */
public final class J1<K, V> extends a.C0162ge<K, V> implements java.util.Map<K, V> {
    public a.I1 h;

    public J1() {
            r0 = this;
            r0.<init>()
            return
    }

    public J1(a.C0162ge r5) {
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L37
            int r0 = r5.c
            int r1 = r4.c
            int r1 = r1 + r0
            r4.b(r1)
            int r1 = r4.c
            r2 = 0
            if (r1 != 0) goto L27
            if (r0 <= 0) goto L37
            int[] r1 = r5.f486a
            int[] r3 = r4.f486a
            java.lang.System.arraycopy(r1, r2, r3, r2, r0)
            java.lang.Object[] r5 = r5.b
            java.lang.Object[] r1 = r4.b
            int r3 = r0 << 1
            java.lang.System.arraycopy(r5, r2, r1, r2, r3)
            r4.c = r0
            return
        L27:
            if (r2 >= r0) goto L37
            java.lang.Object r1 = r5.h(r2)
            java.lang.Object r3 = r5.j(r2)
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L27
        L37:
            return
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            a.I1 r0 = r2.h
            if (r0 != 0) goto Lc
            a.I1 r0 = new a.I1
            r1 = 0
            r0.<init>(r1, r2)
            r2.h = r0
        Lc:
            a.I1 r0 = r2.h
            a.Z9<K, V>$b r1 = r0.f373a
            if (r1 != 0) goto L19
            a.Z9$b r1 = new a.Z9$b
            r1.<init>(r0)
            r0.f373a = r1
        L19:
            a.Z9<K, V>$b r0 = r0.f373a
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
            r2 = this;
            a.I1 r0 = r2.h
            if (r0 != 0) goto Lc
            a.I1 r0 = new a.I1
            r1 = 0
            r0.<init>(r1, r2)
            r2.h = r0
        Lc:
            a.I1 r0 = r2.h
            a.Z9<K, V>$c r1 = r0.b
            if (r1 != 0) goto L19
            a.Z9$c r1 = new a.Z9$c
            r1.<init>(r0)
            r0.b = r1
        L19:
            a.Z9<K, V>$c r0 = r0.b
            return r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            int r0 = r2.c
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.b(r1)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L12
        L2a:
            return
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
            r2 = this;
            a.I1 r0 = r2.h
            if (r0 != 0) goto Lc
            a.I1 r0 = new a.I1
            r1 = 0
            r0.<init>(r1, r2)
            r2.h = r0
        Lc:
            a.I1 r0 = r2.h
            a.Z9<K, V>$e r1 = r0.c
            if (r1 != 0) goto L19
            a.Z9$e r1 = new a.Z9$e
            r1.<init>(r0)
            r0.c = r1
        L19:
            a.Z9<K, V>$e r0 = r0.c
            return r0
    }
}
