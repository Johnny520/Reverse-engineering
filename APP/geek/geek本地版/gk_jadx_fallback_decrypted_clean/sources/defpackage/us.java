package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class us implements java.util.Iterator, java.util.Map.Entry {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ defpackage.m6 d;

    public us(defpackage.m6 r2) {
            r1 = this;
            r1.<init>()
            r1.d = r2
            r0 = 0
            r1.c = r0
            int r2 = r2.d()
            int r2 = r2 + (-1)
            r1.a = r2
            r2 = -1
            r1.b = r2
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r4.c
            if (r0 == 0) goto L3c
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            int r2 = r4.b
            m6 r3 = r4.d
            java.lang.Object r2 = r3.b(r2, r1)
            if (r0 == r2) goto L24
            if (r0 == 0) goto L23
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L23
            goto L24
        L23:
            return r1
        L24:
            java.lang.Object r5 = r5.getValue()
            int r0 = r4.b
            r2 = 1
            java.lang.Object r0 = r3.b(r0, r2)
            if (r5 == r0) goto L3b
            if (r5 == 0) goto L3a
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            return r1
        L3b:
            return r2
        L3c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "This container does not support retaining Map.Entry objects"
            r5.<init>(r0)
            throw r5
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r3 = this;
            boolean r0 = r3.c
            if (r0 == 0) goto Le
            int r0 = r3.b
            r1 = 0
            m6 r2 = r3.d
            java.lang.Object r0 = r2.b(r0, r1)
            return r0
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r3 = this;
            boolean r0 = r3.c
            if (r0 == 0) goto Le
            int r0 = r3.b
            r1 = 1
            m6 r2 = r3.d
            java.lang.Object r0 = r2.b(r0, r1)
            return r0
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.b
            int r1 = r2.a
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r5 = this;
            boolean r0 = r5.c
            if (r0 == 0) goto L25
            int r0 = r5.b
            m6 r1 = r5.d
            r2 = 0
            java.lang.Object r0 = r1.b(r0, r2)
            int r3 = r5.b
            r4 = 1
            java.lang.Object r1 = r1.b(r3, r4)
            if (r0 != 0) goto L18
            r0 = r2
            goto L1c
        L18:
            int r0 = r0.hashCode()
        L1c:
            if (r1 != 0) goto L1f
            goto L23
        L1f:
            int r2 = r1.hashCode()
        L23:
            r0 = r0 ^ r2
            return r0
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            int r0 = r2.b
            r1 = 1
            int r0 = r0 + r1
            r2.b = r0
            r2.c = r1
            return r2
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            boolean r0 = r2.c
            if (r0 == 0) goto L1b
            m6 r0 = r2.d
            int r1 = r2.b
            r0.g(r1)
            int r0 = r2.b
            int r0 = r0 + (-1)
            r2.b = r0
            int r0 = r2.a
            int r0 = r0 + (-1)
            r2.a = r0
            r0 = 0
            r2.c = r0
            return
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.c
            if (r0 == 0) goto L24
            int r0 = r3.b
            m6 r1 = r3.d
            int r2 = r1.d
            switch(r2) {
                case 0: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "not a map"
            r4.<init>(r0)
            throw r4
        L15:
            java.lang.Object r1 = r1.e
            n6 r1 = (defpackage.n6) r1
            int r0 = r0 << 1
            int r0 = r0 + 1
            java.lang.Object[] r1 = r1.b
            r2 = r1[r0]
            r1[r0] = r4
            return r2
        L24:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "This container does not support retaining Map.Entry objects"
            r4.<init>(r0)
            throw r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r1 = r2.getValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
