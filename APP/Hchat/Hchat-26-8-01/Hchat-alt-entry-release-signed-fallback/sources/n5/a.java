package n5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f9010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9013m;

    public a(k5.u r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f9013m = r0
            r1.f9010j = r2
            r1.f9011k = r3
            k5.p r2 = r2.f7286x
            int r2 = r2.b(r3)
            r1.f9012l = r2
            return
    }

    @Override // a.a, v5.b
    public final void a() {
            r3 = this;
            int r0 = r3.f9011k
            if (r0 < 0) goto Lf
            k5.u r1 = r3.f9010j
            k5.p r1 = r1.f7286x
            int r1 = r1.size()
            if (r0 >= r1) goto Lf
            return
        Lf:
            v5.a r1 = new v5.a
            java.lang.String r2 = "callsite@"
            java.lang.String r0 = eh.a.l(r0, r2)
            r1.<init>(r0)
            throw r1
    }

    public final o5.m e1() {
            r3 = this;
            int r0 = r3.f9013m
            k5.u r1 = r3.f9010j
            if (r0 >= 0) goto L10
            androidx.lifecycle.x r0 = r1.f7263a
            int r2 = r3.f9012l
            int r0 = r0.N(r2)
            r3.f9013m = r0
        L10:
            int r0 = r3.f9013m
            if (r0 != 0) goto L17
            o5.k r0 = o5.m.f9530a
            return r0
        L17:
            o5.l r2 = new o5.l
            r2.<init>(r1, r0)
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L42
            boolean r0 = r3 instanceof n5.a
            if (r0 == 0) goto L42
            n5.a r3 = (n5.a) r3
            n5.c r0 = r2.g1()
            n5.c r1 = r3.g1()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            java.lang.String r0 = r2.h1()
            java.lang.String r1 = r3.h1()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            n5.d r0 = r2.i1()
            n5.d r1 = r3.i1()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            java.util.List r0 = r2.f1()
            java.util.List r3 = r3.f1()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L42
            r3 = 1
            return r3
        L42:
            r3 = 0
            return r3
    }

    public final java.util.List f1() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            o5.m r1 = r4.e1()
            int r2 = r1.a()
            r3 = 3
            if (r2 < r3) goto L2f
            int r2 = r1.a()
            if (r2 != r3) goto L17
            goto L2e
        L17:
            r1.d()
            r1.d()
            r1.d()
            w5.a r2 = r1.b()
        L24:
            if (r2 == 0) goto L2e
            r0.add(r2)
            w5.a r2 = r1.b()
            goto L24
        L2e:
            return r0
        L2f:
            d6.f r0 = new d6.f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "Invalid call site item: must contain at least 3 entries."
            r0.<init>(r2, r3, r1)
            throw r0
    }

    public final n5.c g1() {
            r4 = this;
            o5.m r0 = r4.e1()
            int r0 = r0.a()
            r1 = 3
            r2 = 0
            if (r0 < r1) goto L3d
            o5.m r0 = r4.e1()
            w5.a r0 = r0.b()
            int r1 = r0.h()
            r3 = 22
            if (r1 != r3) goto L23
            p5.f r0 = (p5.f) r0
            n5.c r0 = r0.a()
            return r0
        L23:
            d6.f r1 = new d6.f
            int r0 = r0.h()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r4.f9011k
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            java.lang.String r3 = "Invalid encoded value type (%d) for the first item in call site %d"
            r1.<init>(r2, r3, r0)
            throw r1
        L3d:
            d6.f r0 = new d6.f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Invalid call site item: must contain at least 3 entries."
            r0.<init>(r2, r3, r1)
            throw r0
    }

    public final java.lang.String getName() {
            r2 = this;
            int r0 = r2.f9011k
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "call_site_%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    public final java.lang.String h1() {
            r4 = this;
            o5.m r0 = r4.e1()
            int r1 = r0.a()
            r2 = 3
            r3 = 0
            if (r1 < r2) goto L3c
            r0.d()
            w5.a r0 = r0.b()
            int r1 = r0.h()
            r2 = 23
            if (r1 != r2) goto L22
            p5.h r0 = (p5.h) r0
            java.lang.String r0 = r0.a()
            return r0
        L22:
            d6.f r1 = new d6.f
            int r0 = r0.h()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r4.f9011k
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "Invalid encoded value type (%d) for the second item in call site %d"
            r1.<init>(r3, r2, r0)
            throw r1
        L3c:
            d6.f r0 = new d6.f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Invalid call site item: must contain at least 3 entries."
            r0.<init>(r3, r2, r1)
            throw r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            n5.c r1 = r2.g1()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.h1()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            n5.d r1 = r2.i1()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.f1()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final n5.d i1() {
            r4 = this;
            o5.m r0 = r4.e1()
            int r1 = r0.a()
            r2 = 3
            r3 = 0
            if (r1 < r2) goto L3f
            r0.d()
            r0.d()
            w5.a r0 = r0.b()
            int r1 = r0.h()
            r2 = 21
            if (r1 != r2) goto L25
            p5.g r0 = (p5.g) r0
            n5.d r0 = r0.a()
            return r0
        L25:
            d6.f r1 = new d6.f
            int r0 = r0.h()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r4.f9011k
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "Invalid encoded value type (%d) for the second item in call site %d"
            r1.<init>(r3, r2, r0)
            throw r1
        L3f:
            d6.f r0 = new d6.f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Invalid call site item: must contain at least 3 entries."
            r0.<init>(r3, r2, r1)
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            q5.a r1 = new q5.a     // Catch: java.io.IOException -> L12
            r1.<init>(r0)     // Catch: java.io.IOException -> L12
            r1.c(r2)     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.toString()
            return r0
        L12:
            java.lang.String r0 = "Unexpected IOException"
            j8.o.f(r0)
            r0 = 0
            return r0
    }
}
