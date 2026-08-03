package fc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends fc.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.Map f3876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.util.Map f3877j;

    public b(bc.g r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f3874g = r1
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.f3876i = r1
            r0.f3877j = r1
            return
    }

    @Override // fc.f
    public final fc.f a(char r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f3882a
            r0.append(r2)
            int r2 = r1.f3875h
            int r2 = r2 + 1
            r1.f3875h = r2
            return r1
    }

    @Override // fc.f
    public final fc.f b(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f3882a
            r0.append(r2)
            int r0 = r1.f3875h
            int r2 = r2.length()
            int r2 = r2 + r0
            r1.f3875h = r2
            return r1
    }

    @Override // fc.f
    public final void c(fc.b r5) {
            r4 = this;
            int r0 = r4.f3874g
            int r0 = r0 + (-1)
            r4.f3874g = r0
            java.lang.StringBuilder r0 = r4.f3882a
            int r0 = r0.length()
            java.util.Map r1 = r5.f3876i
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 + r0
            java.lang.Object r2 = r2.getValue()
            hc.a r2 = (hc.a) r2
            r4.v(r2, r3)
            goto L16
        L37:
            java.util.Map r0 = r5.f3877j
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r2 = r4.f3874g
            java.lang.Object r3 = r1.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 + r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            java.util.Map r2 = r4.f3877j
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L72
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r4.f3877j = r2
        L72:
            java.util.Map r2 = r4.f3877j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r1)
            goto L41
        L7c:
            int r0 = r4.f3874g
            int r1 = r5.f3874g
            int r0 = r0 + r1
            r4.f3874g = r0
            int r0 = r5.f3875h
            r4.f3875h = r0
            java.lang.StringBuilder r0 = r4.f3882a
            java.lang.StringBuilder r5 = r5.f3882a
            r0.append(r5)
            return
    }

    @Override // fc.f
    public final fc.f d(char r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f3882a
            r0.append(r2)
            int r2 = r1.f3875h
            int r2 = r2 + 1
            r1.f3875h = r2
            return r1
    }

    @Override // fc.f
    public final fc.f e(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.f3882a
            r0.append(r2)
            int r0 = r1.f3875h
            int r2 = r2.length()
            int r2 = r2 + r0
            r1.f3875h = r2
            return r1
    }

    @Override // fc.f
    public final void f() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.f3882a
            java.lang.String r1 = r2.f3886e
            r0.append(r1)
            int r0 = r2.f3874g
            int r0 = r0 + 1
            r2.f3874g = r0
            r0 = 0
            r2.f3875h = r0
            return
    }

    @Override // fc.f
    public final void g() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.f3882a
            java.lang.String r1 = r2.f3883b
            r0.append(r1)
            int r0 = r2.f3875h
            java.lang.String r1 = r2.f3883b
            int r1 = r1.length()
            int r1 = r1 + r0
            r2.f3875h = r1
            return
    }

    @Override // fc.f
    public final /* bridge */ /* synthetic */ fc.f h(java.lang.String r1) {
            r0 = this;
            r0.u(r1)
            return r0
    }

    @Override // fc.f
    public final /* bridge */ /* synthetic */ fc.f i(java.lang.String r1) {
            r0 = this;
            r0.u(r1)
            return r0
    }

    @Override // fc.f
    public final void j(hc.a r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = r1.f3882a
            int r0 = r0.length()
            r1.v(r2, r0)
            return
    }

    @Override // fc.f
    public final void k(hc.c r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            ic.b r0 = new ic.b
            r0.<init>(r2)
            r1.j(r0)
            return
    }

    @Override // fc.f
    public final void l(ic.a r3) {
            r2 = this;
            java.lang.StringBuilder r0 = r2.f3882a
            int r0 = r0.length()
            int r1 = r2.f3875h
            int r0 = r0 - r1
            r2.v(r3, r0)
            return
    }

    @Override // fc.f
    public final void m(int r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            int r0 = r2.f3874g
            java.util.Map r1 = r2.f3877j
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r2.f3877j = r1
        L14:
            java.util.Map r1 = r2.f3877j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r0, r3)
            return
    }

    public final void u(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = r7.f3886e
            boolean r1 = r8.contains(r0)
            java.lang.StringBuilder r2 = r7.f3882a
            if (r1 == 0) goto L4e
            java.lang.String r1 = r7.f3883b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r8.replace(r0, r1)
            r2.append(r1)
            int r1 = r7.f3874g
            xe.q r2 = xe.q.f21574b
            boolean r2 = r8.isEmpty()
            r3 = 0
            if (r2 != 0) goto L47
            if (r0 == 0) goto L47
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L36
            goto L47
        L36:
            int r2 = r0.length()
            r4 = r3
            r5 = r4
        L3c:
            int r4 = r8.indexOf(r0, r4)
            r6 = -1
            if (r4 == r6) goto L48
            int r5 = r5 + 1
            int r4 = r4 + r2
            goto L3c
        L47:
            r5 = r3
        L48:
            int r1 = r1 + r5
            r7.f3874g = r1
            r7.f3875h = r3
            return
        L4e:
            r2.append(r8)
            return
    }

    public final void v(hc.a r2, int r3) {
            r1 = this;
            java.util.Map r0 = r1.f3876i
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3876i = r0
        Lf:
            java.util.Map r0 = r1.f3876i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r2)
            return
    }

    public final bc.d w() {
            r4 = this;
            java.lang.StringBuilder r0 = r4.f3882a
            java.lang.String r0 = r0.toString()
            r1 = 0
            r4.f3882a = r1
            fc.a r1 = new fc.a
            java.util.Map r2 = r4.f3877j
            java.util.Map r3 = r4.f3876i
            r1.<init>(r0, r2, r3)
            return r1
    }
}
