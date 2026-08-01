package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ts implements java.util.Set {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.m6 b;

    public /* synthetic */ ts(defpackage.m6 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        Lb:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r6) {
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            r6.<init>()
            throw r6
        Lb:
            m6 r0 = r5.b
            int r1 = r0.d()
            java.util.Iterator r6 = r6.iterator()
        L15:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            int r4 = r0.d
            switch(r4) {
                case 0: goto L36;
                default: goto L2e;
            }
        L2e:
            java.lang.Object r2 = r0.e
            q6 r2 = (defpackage.q6) r2
            r2.add(r3)
            goto L15
        L36:
            java.lang.Object r4 = r0.e
            n6 r4 = (defpackage.n6) r4
            r4.put(r3, r2)
            goto L15
        L3e:
            int r6 = r0.d()
            if (r1 == r6) goto L46
            r6 = 1
            goto L47
        L46:
            r6 = 0
        L47:
            return r6
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            m6 r0 = r1.b
            r0.a()
            return
        Lb:
            m6 r0 = r1.b
            r0.a()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            m6 r0 = r4.b
            int r5 = r0.e(r5)
            if (r5 < 0) goto Lf
            r5 = 1
            goto L10
        Lf:
            r5 = 0
        L10:
            return r5
        L11:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L17
            goto L3a
        L17:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            m6 r2 = r4.b
            int r0 = r2.e(r0)
            if (r0 >= 0) goto L26
            goto L3a
        L26:
            r3 = 1
            java.lang.Object r0 = r2.b(r0, r3)
            java.lang.Object r5 = r5.getValue()
            if (r0 == r5) goto L39
            if (r0 == 0) goto L3a
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L3a
        L39:
            r1 = r3
        L3a:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            m6 r0 = r2.b
            java.util.Map r0 = r0.c()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto Lf
            r3 = 0
            goto L22
        L21:
            r3 = 1
        L22:
            return r3
        L23:
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L27
            r3 = 0
            goto L3a
        L39:
            r3 = 1
        L3a:
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = defpackage.m6.h(r1, r2)
            return r2
        La:
            boolean r2 = defpackage.m6.h(r1, r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            m6 r0 = r7.b
            int r1 = r0.d()
            int r1 = r1 + (-1)
            r2 = 0
            r3 = r2
        Lf:
            if (r1 < 0) goto L21
            java.lang.Object r4 = r0.b(r1, r2)
            if (r4 != 0) goto L19
            r4 = r2
            goto L1d
        L19:
            int r4 = r4.hashCode()
        L1d:
            int r3 = r3 + r4
            int r1 = r1 + (-1)
            goto Lf
        L21:
            return r3
        L22:
            m6 r0 = r7.b
            int r1 = r0.d()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r4 = r3
        L2c:
            if (r1 < 0) goto L4b
            java.lang.Object r5 = r0.b(r1, r3)
            java.lang.Object r6 = r0.b(r1, r2)
            if (r5 != 0) goto L3a
            r5 = r3
            goto L3e
        L3a:
            int r5 = r5.hashCode()
        L3e:
            if (r6 != 0) goto L42
            r6 = r3
            goto L46
        L42:
            int r6 = r6.hashCode()
        L46:
            r5 = r5 ^ r6
            int r4 = r4 + r5
            int r1 = r1 + (-1)
            goto L2c
        L4b:
            return r4
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            m6 r0 = r1.b
            int r0 = r0.d()
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
        L11:
            m6 r0 = r1.b
            int r0 = r0.d()
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            ss r0 = new ss
            m6 r1 = r3.b
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        Le:
            us r0 = new us
            m6 r1 = r3.b
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            m6 r0 = r1.b
            int r2 = r0.e(r2)
            if (r2 < 0) goto L12
            r0.g(r2)
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
        L14:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L2b;
                default: goto L5;
            }
        L5:
            m6 r0 = r3.b
            java.util.Map r0 = r0.c()
            int r1 = r0.size()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r4.next()
            r0.remove(r2)
            goto L13
        L21:
            int r4 = r0.size()
            if (r1 == r4) goto L29
            r4 = 1
            goto L2a
        L29:
            r4 = 0
        L2a:
            return r4
        L2b:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            m6 r0 = r4.b
            java.util.Map r0 = r0.c()
            int r1 = r0.size()
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L17
            r2.remove()
            goto L17
        L2b:
            int r5 = r0.size()
            if (r1 == r5) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            return r5
        L35:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>()
            throw r5
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            m6 r0 = r1.b
            int r0 = r0.d()
            return r0
        Lc:
            m6 r0 = r1.b
            int r0 = r0.d()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            m6 r0 = r6.b
            int r1 = r0.d()
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r1) goto L1a
            java.lang.Object r5 = r0.b(r4, r3)
            r2[r4] = r5
            int r4 = r4 + 1
            goto Lf
        L1a:
            return r2
        L1b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            m6 r0 = r2.b
            r1 = 0
            java.lang.Object[] r3 = r0.i(r3, r1)
            return r3
        Ld:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }
}
