package md;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.Map f8878c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.EnumSet f8879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.Map f8880b;

    static {
            md.a[] r0 = md.a.values()
            int r0 = r0.length
            r1 = 64
            if (r0 >= r1) goto Le
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            md.f.f8878c = r0
            return
        Le:
            java.lang.String r1 = "Try to reduce flags count to 64 for use one long in EnumSet, now "
            java.lang.String r0 = eh.a.l(r0, r1)
            ah.a.k(r0)
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            java.lang.Class<md.a> r0 = md.a.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            r1.f8879a = r0
            java.util.Map r0 = md.f.f8878c
            r1.f8880b = r0
            return
    }

    public boolean a(md.a r2) {
            r1 = this;
            java.util.EnumSet r0 = r1.f8879a
            boolean r2 = r0.contains(r2)
            return r2
    }

    public boolean b(oc.a r2) {
            r1 = this;
            java.util.Map r0 = r1.f8880b
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public oc.b c(oc.a r2) {
            r1 = this;
            java.util.Map r0 = r1.f8880b
            java.lang.Object r2 = r0.get(r2)
            oc.b r2 = (oc.b) r2
            return r2
    }

    public java.util.List d(md.b r1) {
            r0 = this;
            oc.b r1 = r0.c(r1)
            md.c r1 = (md.c) r1
            if (r1 != 0) goto Lb
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
        Lb:
            java.util.ArrayList r1 = r1.f8873h
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
    }

    public java.util.List e() {
            r3 = this;
            java.util.EnumSet r0 = r3.f8879a
            int r1 = r0.size()
            java.util.Map r2 = r3.f8880b
            int r2 = r2.size()
            int r2 = r2 + r1
            if (r2 != 0) goto L12
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            md.a r2 = (md.a) r2
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            goto L1b
        L2f:
            java.util.Map r0 = r3.f8880b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r0.next()
            oc.b r2 = (oc.b) r2
            java.lang.String r2 = r2.d()
            r1.add(r2)
            goto L39
        L4d:
            return r1
    }

    public boolean f() {
            r1 = this;
            java.util.EnumSet r0 = r1.f8879a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            java.util.Map r0 = r1.f8880b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public void g(md.a r2) {
            r1 = this;
            java.util.EnumSet r0 = r1.f8879a
            r0.remove(r2)
            return
    }

    public void h(oc.a r3) {
            r2 = this;
            java.util.Map r0 = r2.f8880b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            ae.g r0 = new ae.g
            r1 = 11
            r0.<init>(r3, r1)
            r2.i(r0)
        L12:
            return
    }

    public final void i(java.util.function.Consumer r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.f8880b     // Catch: java.lang.Throwable -> L10
            java.util.Map r1 = md.f.f8878c     // Catch: java.lang.Throwable -> L10
            if (r0 != r1) goto L12
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> L10
            r2 = 2
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10
            r3.f8880b = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r4 = move-exception
            goto L23
        L12:
            java.util.Map r0 = r3.f8880b     // Catch: java.lang.Throwable -> L10
            r4.accept(r0)     // Catch: java.lang.Throwable -> L10
            java.util.Map r4 = r3.f8880b     // Catch: java.lang.Throwable -> L10
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L21
            r3.f8880b = r1     // Catch: java.lang.Throwable -> L10
        L21:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            return
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r4
    }

    public java.lang.String toString() {
            r3 = this;
            java.util.List r0 = r3.e()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            java.lang.String r0 = ""
            return r0
        Ld:
            b8.c r1 = new b8.c
            r2 = 6
            r1.<init>(r2)
            r0.sort(r1)
            java.lang.String r1 = ", "
            java.lang.String r0 = xe.s.j(r0, r1)
            java.lang.String r1 = "A["
            java.lang.String r2 = "]"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }
}
