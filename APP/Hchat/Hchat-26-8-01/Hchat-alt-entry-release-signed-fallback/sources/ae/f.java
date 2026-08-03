package ae;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ud.a f234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xd.b f236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public qd.l f237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ae.h f238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f240i;

    public f(int r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.f232a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f235d = r0
            r0 = 0
            r2.f240i = r0
            r2.f233b = r3
            return
    }

    public final boolean a(ud.r r4, od.a r5) {
            r3 = this;
            java.util.ArrayList r0 = r3.f232a
            if (r5 == 0) goto L10
            boolean r4 = r0.contains(r5)
            if (r4 == 0) goto Lb
            goto L46
        Lb:
            boolean r4 = r0.add(r5)
            return r4
        L10:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L46
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L1f
            java.lang.String r5 = "all"
            goto L2b
        L1f:
            ae.d r5 = new ae.d
            r1 = 0
            r5.<init>(r1)
            java.lang.String r1 = " | "
            java.lang.String r5 = xe.s.k(r0, r1, r5)
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Throwable added to exception handler: '"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = "', keep only Throwable"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.I(r5)
            r0.clear()
            r4 = 1
            return r4
        L46:
            r4 = 0
            return r4
    }

    public final qd.j b() {
            r3 = this;
            boolean r0 = r3.c()
            if (r0 == 0) goto L9
            qd.e r0 = qd.j.f10881o
            return r0
        L9:
            java.util.ArrayList r0 = r3.f232a
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L1f
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            od.a r0 = (od.a) r0
            qd.j r0 = r0.f9765g
            return r0
        L1f:
            qd.e r0 = qd.j.f10881o
            return r0
    }

    public final boolean c() {
            r3 = this;
            java.util.ArrayList r0 = r3.f232a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9
            goto L23
        L9:
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            od.a r1 = (od.a) r1
            java.lang.String r1 = r1.f9768j
            java.lang.String r2 = "java.lang.Throwable"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Ld
        L23:
            r0 = 1
            return r0
        L25:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2a
        L3:
            if (r3 == 0) goto L2c
            java.lang.Class<ae.f> r0 = ae.f.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L2c
        Le:
            ae.f r3 = (ae.f) r3
            int r0 = r2.f233b
            int r1 = r3.f233b
            if (r0 != r1) goto L2c
            java.util.ArrayList r0 = r2.f232a
            java.util.ArrayList r1 = r3.f232a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            ae.h r0 = r2.f238g
            ae.h r3 = r3.f238g
            boolean r3 = java.util.Objects.equals(r0, r3)
            if (r3 == 0) goto L2c
        L2a:
            r3 = 1
            return r3
        L2c:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f233b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.ArrayList r1 = r2.f232a
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.util.ArrayList r0 = r3.f232a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            java.lang.String r0 = "all"
            goto L17
        Lb:
            ae.d r1 = new ae.d
            r2 = 0
            r1.<init>(r2)
            java.lang.String r2 = " | "
            java.lang.String r0 = xe.s.k(r0, r2, r1)
        L17:
            int r1 = r3.f233b
            java.lang.String r1 = xe.m.d(r1)
            java.lang.String r2 = " -> "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }
}
