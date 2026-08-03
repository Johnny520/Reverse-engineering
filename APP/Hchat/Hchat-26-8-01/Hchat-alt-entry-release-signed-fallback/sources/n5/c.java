package n5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a.a implements java.lang.Comparable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f9016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9018l;

    public c(k5.u r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9016j = r1
            r0.f9017k = r2
            k5.p r1 = r1.f7287y
            int r1 = r1.b(r2)
            r0.f9018l = r1
            return
    }

    @Override // a.a, v5.b
    public final void a() {
            r4 = this;
            java.lang.String r0 = "methodhandle@"
            int r1 = r4.f9017k
            if (r1 < 0) goto L1f
            k5.u r2 = r4.f9016j
            k5.p r2 = r2.f7287y
            int r2 = r2.size()
            if (r1 >= r2) goto L1f
            r4.f1()     // Catch: d6.f -> L14
            return
        L14:
            r2 = move-exception
            v5.a r3 = new v5.a
            java.lang.String r0 = eh.a.l(r1, r0)
            r3.<init>(r0, r2)
            throw r3
        L1f:
            v5.a r2 = new v5.a
            java.lang.String r0 = eh.a.l(r1, r0)
            r2.<init>(r0)
            throw r2
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            n5.c r1 = (n5.c) r1
            int r1 = r0.e1(r1)
            return r1
    }

    public final int e1(n5.c r3) {
            r2 = this;
            int r0 = r2.g1()
            int r1 = r3.g1()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            v5.b r0 = r2.f1()
            boolean r1 = r0 instanceof i5.a
            if (r1 == 0) goto L2e
            v5.b r1 = r3.f1()
            boolean r1 = r1 instanceof i5.a
            if (r1 != 0) goto L21
            r3 = -1
            return r3
        L21:
            i5.a r0 = (i5.a) r0
            v5.b r3 = r3.f1()
            i5.a r3 = (i5.a) r3
            int r3 = r0.e1(r3)
            return r3
        L2e:
            v5.b r1 = r3.f1()
            boolean r1 = r1 instanceof i5.b
            if (r1 != 0) goto L38
            r3 = 1
            return r3
        L38:
            i5.b r0 = (i5.b) r0
            v5.b r3 = r3.f1()
            i5.b r3 = (i5.b) r3
            int r3 = r0.e1(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L22
            boolean r0 = r3 instanceof n5.c
            if (r0 == 0) goto L22
            n5.c r3 = (n5.c) r3
            int r0 = r2.g1()
            int r1 = r3.g1()
            if (r0 != r1) goto L22
            v5.b r0 = r2.f1()
            v5.b r3 = r3.f1()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L22
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    public final v5.b f1() {
            r4 = this;
            k5.u r0 = r4.f9016j
            androidx.lifecycle.x r1 = r0.f7263a
            int r2 = r4.f9018l
            int r2 = r2 + 4
            int r1 = r1.P(r2)
            int r2 = r4.g1()
            switch(r2) {
                case 0: goto L2e;
                case 1: goto L2e;
                case 2: goto L2e;
                case 3: goto L2e;
                case 4: goto L28;
                case 5: goto L28;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L13;
            }
        L13:
            d6.f r0 = new d6.f
            int r1 = r4.g1()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 0
            java.lang.String r3 = "Invalid method handle type: %d"
            r0.<init>(r2, r3, r1)
            throw r0
        L28:
            n5.e r2 = new n5.e
            r2.<init>(r0, r1)
            return r2
        L2e:
            n5.b r2 = new n5.b
            r2.<init>(r0, r1)
            return r2
    }

    public final int g1() {
            r2 = this;
            k5.u r0 = r2.f9016j
            androidx.lifecycle.x r0 = r0.f7263a
            int r1 = r2.f9018l
            int r0 = r0.P(r1)
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.g1()
            int r0 = r0 * 31
            v5.b r1 = r2.f1()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            q5.a r1 = new q5.a     // Catch: java.io.IOException -> L12
            r1.<init>(r0)     // Catch: java.io.IOException -> L12
            r1.k(r2)     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.toString()
            return r0
        L12:
            java.lang.String r0 = "Unexpected IOException"
            j8.o.f(r0)
            r0 = 0
            return r0
    }
}
