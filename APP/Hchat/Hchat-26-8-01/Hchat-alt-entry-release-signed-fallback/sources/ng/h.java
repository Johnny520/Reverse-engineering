package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Iterator f9438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f9440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ng.j f9441k;

    public h(dg.j r2) {
            r1 = this;
            r0 = 1
            r1.f9437g = r0
            r1.<init>()
            r1.f9441k = r2
            java.lang.Object r2 = r2.f2253c
            ng.j r2 = (ng.j) r2
            java.util.Iterator r2 = r2.iterator()
            r1.f9438h = r2
            return
    }

    public h(ng.i r2) {
            r1 = this;
            r0 = 0
            r1.f9437g = r0
            r1.<init>()
            r1.f9441k = r2
            ng.j r2 = r2.f9442a
            java.util.Iterator r2 = r2.iterator()
            r1.f9438h = r2
            r2 = -1
            r1.f9439i = r2
            return
    }

    public void a() {
            r4 = this;
            ng.j r0 = r4.f9441k
            ng.i r0 = (ng.i) r0
        L4:
            java.util.Iterator r1 = r4.f9438h
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r1 = r1.next()
            fg.l r2 = r0.f9444c
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r0.f9443b
            if (r2 != r3) goto L4
            r4.f9440j = r1
            r0 = 1
            r4.f9439i = r0
            return
        L26:
            r0 = 0
            r4.f9439i = r0
            return
    }

    public boolean c() {
            r4 = this;
            java.lang.Object r0 = r4.f9440j
            java.util.Iterator r0 = (java.util.Iterator) r0
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L10
            r4.f9439i = r1
            return r1
        L10:
            java.util.Iterator r0 = r4.f9438h
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r0 = r0.next()
            ng.j r2 = r4.f9441k
            dg.j r2 = (dg.j) r2
            java.lang.Object r3 = r2.f2254d
            fg.l r3 = (fg.l) r3
            fg.l r2 = r2.f2252b
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Object r0 = r3.invoke(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L10
            r4.f9440j = r0
            r4.f9439i = r1
            return r1
        L3b:
            r0 = 2
            r4.f9439i = r0
            r0 = 0
            r4.f9440j = r0
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f9437g
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r2.f9439i
            r1 = 1
            if (r0 != r1) goto Lb
            goto L14
        Lb:
            r1 = 2
            if (r0 != r1) goto L10
            r1 = 0
            goto L14
        L10:
            boolean r1 = r2.c()
        L14:
            return r1
        L15:
            int r0 = r2.f9439i
            r1 = -1
            if (r0 != r1) goto L1d
            r2.a()
        L1d:
            int r0 = r2.f9439i
            r1 = 1
            if (r0 != r1) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f9437g
            switch(r0) {
                case 0: goto L2c;
                default: goto L5;
            }
        L5:
            int r0 = r3.f9439i
            r1 = 2
            if (r0 == r1) goto L27
            if (r0 != 0) goto L18
            boolean r0 = r3.c()
            if (r0 == 0) goto L13
            goto L18
        L13:
            bsh.j.e()
        L16:
            r0 = 0
            goto L2b
        L18:
            r0 = 0
            r3.f9439i = r0
            java.lang.Object r0 = r3.f9440j
            java.util.Iterator r0 = (java.util.Iterator) r0
            r0.getClass()
            java.lang.Object r0 = r0.next()
            goto L2b
        L27:
            bsh.j.e()
            goto L16
        L2b:
            return r0
        L2c:
            int r0 = r3.f9439i
            r1 = -1
            if (r0 != r1) goto L34
            r3.a()
        L34:
            int r0 = r3.f9439i
            if (r0 == 0) goto L40
            java.lang.Object r0 = r3.f9440j
            r2 = 0
            r3.f9440j = r2
            r3.f9439i = r1
            goto L44
        L40:
            bsh.j.e()
            r0 = 0
        L44:
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f9437g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
