package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends k5.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k5.u f7256h;

    public /* synthetic */ p(k5.u r1, int r2) {
            r0 = this;
            r0.f7255g = r2
            r0.f7256h = r1
            r0.<init>()
            return
    }

    public final int b(int r4) {
            r3 = this;
            int r0 = r3.f7255g
            switch(r0) {
                case 0: goto Le7;
                case 1: goto Lac;
                case 2: goto L73;
                case 3: goto L50;
                case 4: goto L2b;
                default: goto L5;
            }
        L5:
            k5.u r0 = r3.f7256h
            int r1 = r0.f7270h
            if (r4 < 0) goto L13
            if (r4 >= r1) goto L13
            int r0 = r0.f7271i
            int r4 = r4 * 12
        L11:
            int r4 = r4 + r0
            return r4
        L13:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            java.lang.String r1 = "Invalid proto index %d, not in [0, %d)"
            java.lang.String r4 = java.lang.String.format(r1, r4)
            r0.<init>(r4)
            throw r0
        L2b:
            k5.u r0 = r3.f7256h
            int r1 = r0.f7274l
            if (r4 < 0) goto L38
            if (r4 >= r1) goto L38
            int r0 = r0.f7275m
        L35:
            int r4 = r4 * 8
            goto L11
        L38:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            java.lang.String r1 = "Invalid method index %d, not in [0, %d)"
            java.lang.String r4 = java.lang.String.format(r1, r4)
            r0.<init>(r4)
            throw r0
        L50:
            k5.u r0 = r3.f7256h
            int r1 = r0.f7272j
            if (r4 < 0) goto L5b
            if (r4 >= r1) goto L5b
            int r0 = r0.f7273k
            goto L35
        L5b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            java.lang.String r1 = "Invalid field index %d, not in [0, %d)"
            java.lang.String r4 = java.lang.String.format(r1, r4)
            r0.<init>(r4)
            throw r0
        L73:
            k5.u r0 = r3.f7256h
            r1 = 8
            m5.b r0 = r0.b(r1)
            if (r4 < 0) goto L90
            int r2 = r3.size()
            if (r4 >= r2) goto L90
            k5.u r2 = r0.f8719a
            androidx.lifecycle.x r2 = r2.f7264b
            int r0 = r0.f8720b
            int r0 = r0 + r1
            int r0 = r2.N(r0)
            int r4 = r4 * r1
            goto L11
        L90:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r1 = r3.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            java.lang.String r1 = "Invalid method handle index %d, not in [0, %d)"
            java.lang.String r4 = java.lang.String.format(r1, r4)
            r0.<init>(r4)
            throw r0
        Lac:
            k5.u r0 = r3.f7256h
            r1 = 7
            m5.b r0 = r0.b(r1)
            if (r4 < 0) goto Lcb
            int r1 = r3.size()
            if (r4 >= r1) goto Lcb
            k5.u r1 = r0.f8719a
            androidx.lifecycle.x r1 = r1.f7264b
            int r0 = r0.f8720b
            int r0 = r0 + 8
            int r0 = r1.N(r0)
            int r4 = r4 * 4
            goto L11
        Lcb:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r1 = r3.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            java.lang.String r1 = "Invalid callsite index %d, not in [0, %d)"
            java.lang.String r4 = java.lang.String.format(r1, r4)
            r0.<init>(r4)
            throw r0
        Le7:
            k5.u r0 = r3.f7256h
            int r1 = r0.f7276n
            if (r4 < 0) goto Lf5
            if (r4 >= r1) goto Lf5
            int r0 = r0.f7277o
            int r4 = r4 * 32
            goto L11
        Lf5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            java.lang.String r1 = "Invalid class index %d, not in [0, %d)"
            java.lang.String r4 = java.lang.String.format(r1, r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // k5.t, java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r7) {
            r6 = this;
            int r0 = r6.f7255g
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L25;
                case 2: goto L1d;
                case 3: goto L15;
                case 4: goto Ld;
                default: goto L5;
            }
        L5:
            n5.d r0 = new n5.d
            k5.u r1 = r6.f7256h
            r0.<init>(r1, r7)
            return r0
        Ld:
            n5.e r0 = new n5.e
            k5.u r1 = r6.f7256h
            r0.<init>(r1, r7)
            return r0
        L15:
            n5.b r0 = new n5.b
            k5.u r1 = r6.f7256h
            r0.<init>(r1, r7)
            return r0
        L1d:
            n5.c r0 = new n5.c
            k5.u r1 = r6.f7256h
            r0.<init>(r1, r7)
            return r0
        L25:
            n5.a r0 = new n5.a
            k5.u r1 = r6.f7256h
            r0.<init>(r1, r7)
            return r0
        L2d:
            k5.o r0 = new k5.o
            int r1 = r6.b(r7)
            k5.u r2 = r6.f7256h
            int r3 = r2.f7279q
            if (r3 != 0) goto L3a
            goto L47
        L3a:
            androidx.lifecycle.x r4 = r2.f7263a
            int r5 = r3 + 4
            int r7 = r7 * 4
            int r7 = r7 + r5
            int r7 = r4.J(r7)
            if (r7 != 0) goto L49
        L47:
            r7 = 0
            goto L4a
        L49:
            int r7 = r7 + r3
        L4a:
            r0.<init>(r2, r1, r7)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r2 = this;
            int r0 = r2.f7255g
            switch(r0) {
                case 0: goto L45;
                case 1: goto L2d;
                case 2: goto L14;
                case 3: goto Lf;
                case 4: goto La;
                default: goto L5;
            }
        L5:
            k5.u r0 = r2.f7256h
            int r0 = r0.f7270h
            return r0
        La:
            k5.u r0 = r2.f7256h
            int r0 = r0.f7274l
            return r0
        Lf:
            k5.u r0 = r2.f7256h
            int r0 = r0.f7272j
            return r0
        L14:
            k5.u r0 = r2.f7256h
            r1 = 8
            m5.b r0 = r0.b(r1)
            if (r0 != 0) goto L20
            r0 = 0
            goto L2c
        L20:
            k5.u r1 = r0.f8719a
            androidx.lifecycle.x r1 = r1.f7264b
            int r0 = r0.f8720b
            int r0 = r0 + 4
            int r0 = r1.N(r0)
        L2c:
            return r0
        L2d:
            k5.u r0 = r2.f7256h
            r1 = 7
            m5.b r0 = r0.b(r1)
            if (r0 != 0) goto L38
            r0 = 0
            goto L44
        L38:
            k5.u r1 = r0.f8719a
            androidx.lifecycle.x r1 = r1.f7264b
            int r0 = r0.f8720b
            int r0 = r0 + 4
            int r0 = r1.N(r0)
        L44:
            return r0
        L45:
            k5.u r0 = r2.f7256h
            int r0 = r0.f7276n
            return r0
    }
}
