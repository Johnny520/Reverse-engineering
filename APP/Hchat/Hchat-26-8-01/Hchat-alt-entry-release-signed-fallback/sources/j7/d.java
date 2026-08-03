package j7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k7.b implements java.util.Comparator {
    @Override // o7.b
    public final void V() {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            z7.c r1 = r7.f9563k
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            o7.j r2 = (o7.j) r2
            j7.e r4 = r2.f9586m
            z7.c r4 = r4.f9563k
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L38
            java.lang.Object r5 = r4.next()
            l7.m r5 = (l7.m) r5
            s7.b r5 = r5.f7890o
            z7.c r5 = r5.f9563k
            int r5 = r5.size()
            if (r5 <= r3) goto L20
            r3 = r5
            goto L20
        L38:
            l7.j r2 = r2.f9585l
            byte r2 = r2.V()
            java.lang.Byte r4 = java.lang.Byte.valueOf(r2)
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L50
            int r4 = r4.intValue()
            if (r3 <= r4) goto Lb
        L50:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            goto Lb
        L5c:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L64:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld3
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            o7.j r2 = r7.k0(r2)
            l7.j r4 = r2.f9585l
            r7.b r4 = r4.f7883p
            r7.p r4 = (r7.p) r4
            r4.N(r1)
            r7.f r5 = r4.f11576m
            byte[] r4 = r4.f11553k
            int r4 = r4.length
            int r4 = r4 / 4
            r5.k(r4)
            j7.e r2 = r2.f9586m
            z7.c r2 = r2.f9563k
            java.util.Iterator r2 = r2.iterator()
        La3:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r2.next()
            l7.m r4 = (l7.m) r4
            p7.a r5 = r4.f7869m
            p7.k r5 = (p7.k) r5
            r7.c r5 = r5.f10299s
            int r5 = r5.get()
            r5 = r5 & 3
            r6 = 1
            if (r5 != r6) goto Lbf
            goto La3
        Lbf:
            p7.a r5 = r4.f7869m
            p7.k r5 = (p7.k) r5
            r7.f r5 = r5.f10300t
            int r6 = r5.f11560n
            if (r1 != r6) goto Lca
            goto La3
        Lca:
            r5.k(r1)
            s7.b r4 = r4.f7890o
            r4.d0(r1, r3)
            goto La3
        Ld3:
            return
    }

    @Override // o7.b
    public final void X() {
            r0 = this;
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            o7.j r1 = (o7.j) r1
            o7.j r2 = (o7.j) r2
            l7.j r1 = r1.f9585l
            p7.a r1 = r1.f7869m
            p7.g r1 = (p7.g) r1
            r7.c r1 = r1.f10286r
            int r1 = r1.get()
            l7.j r2 = r2.f9585l
            p7.a r2 = r2.f7869m
            p7.g r2 = (p7.g) r2
            r7.c r2 = r2.f10286r
            int r2 = r2.get()
            int r1 = java.lang.Integer.compare(r1, r2)
            return r1
    }

    public final o7.j k0(byte r4) {
            r3 = this;
            r0 = r4 & 255(0xff, float:3.57E-43)
            int r0 = r0 + (-1)
            k7.a r0 = r3.Q(r0)
            o7.j r0 = (o7.j) r0
            if (r0 == 0) goto L15
            l7.j r1 = r0.f9585l
            byte r1 = r1.V()
            if (r1 != r4) goto L15
            return r0
        L15:
            z7.c r0 = r3.f9563k
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            o7.j r1 = (o7.j) r1
            if (r1 == 0) goto L1b
            l7.j r2 = r1.f9585l
            byte r2 = r2.V()
            if (r2 != r4) goto L1b
            return r1
        L32:
            r4 = 0
            return r4
    }

    @Override // k7.d
    public final k7.a n() {
            r1 = this;
            o7.j r0 = new o7.j
            r0.<init>()
            return r0
    }
}
