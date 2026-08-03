package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.Iterator f22599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f22600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f22601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f22602k;

    public f(java.util.Iterator r2, java.lang.Class r3, bc.i r4) {
            r1 = this;
            r0 = 1
            r1.f22598g = r0
            r1.<init>()
            r1.f22599h = r2
            r1.f22601j = r3
            r1.f22602k = r4
            return
    }

    public f(java.util.Iterator r2, java.util.Iterator r3) {
            r1 = this;
            r0 = 0
            r1.f22598g = r0
            r1.<init>()
            r1.f22599h = r2
            r1.f22601j = r3
            return
    }

    public java.lang.Object a() {
            r5 = this;
            java.lang.Object r0 = r5.f22600i
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.Iterator r0 = r5.f22599h
            java.lang.Object r1 = r5.f22601j
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r2 = r5.f22602k
            java.util.function.Predicate r2 = (java.util.function.Predicate) r2
        Lf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.next()
            if (r3 != 0) goto L1c
            goto Lf
        L1c:
            boolean r4 = r1.isInstance(r3)
            if (r4 == 0) goto Lf
            if (r2 == 0) goto L2a
            boolean r4 = r2.test(r3)
            if (r4 == 0) goto Lf
        L2a:
            r5.f22600i = r3
            return r3
        L2d:
            r0 = 0
            return r0
    }

    public java.lang.Object b() {
            r3 = this;
            java.lang.Object r0 = r3.f22600i
            if (r0 != 0) goto L4a
            java.util.Iterator r0 = r3.f22599h
            r1 = 0
            if (r0 == 0) goto L19
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r0.next()
            if (r2 == 0) goto L9
        L15:
            r1 = r2
            goto L47
        L17:
            r3.f22599h = r1
        L19:
            java.lang.Object r0 = r3.f22601j
            java.util.Iterator r0 = (java.util.Iterator) r0
            if (r0 == 0) goto L2e
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            if (r2 == 0) goto L1f
            goto L15
        L2c:
            r3.f22601j = r1
        L2e:
            java.lang.Object r0 = r3.f22602k
            java.util.Iterator r0 = (java.util.Iterator) r0
            if (r0 == 0) goto L45
        L34:
            if (r0 == 0) goto L47
        L36:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            if (r2 == 0) goto L36
            goto L15
        L43:
            r3.f22602k = r1
        L45:
            r0 = r1
            goto L34
        L47:
            r3.f22600i = r1
            return r1
        L4a:
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f22598g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.a()
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
        Lf:
            java.lang.Object r0 = r1.b()
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            int r0 = r2.f22598g
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.a()
            if (r0 == 0) goto Lf
            r1 = 0
            r2.f22600i = r1
            goto L13
        Lf:
            bsh.j.e()
            r0 = 0
        L13:
            return r0
        L14:
            java.lang.Object r0 = r2.b()
            if (r0 == 0) goto L1e
            r1 = 0
            r2.f22600i = r1
            goto L22
        L1e:
            bsh.j.e()
            r0 = 0
        L22:
            return r0
    }
}
