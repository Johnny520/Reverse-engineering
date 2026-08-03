package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends tf.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f9827h;

    public /* synthetic */ h(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f9826g = r2
            r0.f9827h = r1
            r0.<init>()
            return
    }

    public og.e a(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f9827h
            og.i r0 = (og.i) r0
            java.util.regex.Matcher r0 = r0.f9828a
            int r1 = r0.start(r4)
            int r2 = r0.end(r4)
            lg.d r1 = r9.e0.r0(r1, r2)
            int r2 = r1.f8042g
            if (r2 < 0) goto L23
            og.e r2 = new og.e
            java.lang.String r4 = r0.group(r4)
            r4.getClass()
            r2.<init>(r4, r1)
            return r2
        L23:
            r4 = 0
            return r4
    }

    @Override // tf.a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f9826g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f9827h
            p0.b r0 = (p0.b) r0
            boolean r2 = r0.containsValue(r2)
            return r2
        Le:
            if (r2 != 0) goto L12
            r0 = 1
            goto L14
        L12:
            boolean r0 = r2 instanceof og.e
        L14:
            if (r0 != 0) goto L18
            r2 = 0
            goto L1e
        L18:
            og.e r2 = (og.e) r2
            boolean r2 = super.contains(r2)
        L1e:
            return r2
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            int r0 = r1.f9826g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f9827h
            p0.b r0 = (p0.b) r0
            r0.getClass()
            int r0 = r0.f10051h
            return r0
        Lf:
            java.lang.Object r0 = r1.f9827h
            og.i r0 = (og.i) r0
            java.util.regex.Matcher r0 = r0.f9828a
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }

    @Override // tf.a, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f9826g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r0 = super.isEmpty()
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r7 = this;
            int r0 = r7.f9826g
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            p0.i r0 = new p0.i
            java.lang.Object r1 = r7.f9827h
            p0.b r1 = (p0.b) r1
            p0.j r1 = r1.f10050g
            r2 = 8
            p0.k[] r3 = new p0.k[r2]
            r4 = 0
        L12:
            if (r4 >= r2) goto L1f
            p0.l r5 = new p0.l
            r6 = 2
            r5.<init>(r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L12
        L1f:
            r0.<init>(r1, r3)
            return r0
        L23:
            lg.d r0 = a.a.X(r7)
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r0, r2)
            nb.a r0 = new nb.a
            r2 = 1
            r0.<init>(r7, r2)
            ng.t r0 = ng.m.W(r1, r0)
            ng.s r1 = new ng.s
            r1.<init>(r0)
            return r1
    }
}
