package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h6.o, java.lang.Cloneable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j6.d f6723j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f6725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f6726i;

    static {
            j6.d r0 = new j6.d
            r0.<init>()
            j6.d.f6723j = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f6724g = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f6725h = r0
            r1.f6726i = r0
            return
    }

    @Override // h6.o
    public final h6.n a(h6.f r4, n6.a r5) {
            r3 = this;
            java.lang.Class r0 = r5.f9028a
            r1 = 1
            boolean r1 = r3.c(r0, r1)
            r2 = 0
            boolean r0 = r3.c(r0, r2)
            if (r1 != 0) goto L12
            if (r0 != 0) goto L12
            r4 = 0
            return r4
        L12:
            j6.c r0 = new j6.c
            r0.<init>(r3, r1, r4, r5)
            return r0
    }

    public final j6.d b() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            j6.d r0 = (j6.d) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            j8.o.f(r0)
            r0 = 0
            return r0
    }

    public final boolean c(java.lang.Class r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f6724g
            r1 = 1
            if (r0 != 0) goto L18
            boolean r0 = r3.isMemberClass()
            if (r0 == 0) goto L18
            f8.i r0 = l6.c.f7868a
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L18
            return r1
        L18:
            if (r4 != 0) goto L3b
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 != 0) goto L3b
            f8.i r0 = l6.c.f7868a
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L3b
            boolean r0 = r3.isAnonymousClass()
            if (r0 != 0) goto L3a
            boolean r3 = r3.isLocalClass()
            if (r3 == 0) goto L3b
        L3a:
            return r1
        L3b:
            if (r4 == 0) goto L40
            java.util.List r3 = r2.f6725h
            goto L42
        L40:
            java.util.List r3 = r2.f6726i
        L42:
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            r0 = 0
            if (r4 != 0) goto L4e
            return r0
        L4e:
            java.lang.Object r3 = r3.next()
            r3.getClass()
            ah.a.d()
            return r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            j6.d r0 = r1.b()
            return r0
    }
}
