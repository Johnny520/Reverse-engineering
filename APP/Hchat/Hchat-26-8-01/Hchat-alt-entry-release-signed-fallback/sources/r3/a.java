package r3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r3.d f11334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashSet f11335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashSet f11336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashSet f11337e;

    public a() {
            r1 = this;
            r1.<init>()
            r3.d r0 = new r3.d
            r0.<init>()
            r1.f11334b = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11335c = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11336d = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11337e = r0
            return
    }

    public final void a() {
            r7 = this;
            boolean r0 = r7.f11333a
            if (r0 != 0) goto L68
            r0 = 1
            r7.f11333a = r0
            tf.k r1 = new tf.k
            r1.<init>()
            r1.addLast(r7)
        Lf:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L67
            java.lang.Object r2 = r1.removeFirst()
            r3.a r2 = (r3.a) r2
            r2.f11333a = r0
            java.util.LinkedHashSet r3 = r2.f11336d
            java.util.LinkedHashSet r4 = r2.f11337e
            java.util.LinkedHashSet r2 = r2.f11335c
            tf.r.h1(r1, r2)
            java.util.List r5 = tf.m.P1(r4)
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L56
            r4.clear()
            java.util.List r4 = tf.m.P1(r3)
            java.util.Iterator r4 = r4.iterator()
        L3f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            s3.a r5 = (s3.a) r5
            r5.a()
            goto L3f
        L4f:
            r3.clear()
            r2.clear()
            goto Lf
        L56:
            java.lang.Object r0 = r5.next()
            if (r0 == 0) goto L60
            ah.a.d()
            return
        L60:
            r3.d r0 = r7.f11334b
            r0.getClass()
            r0 = 0
            throw r0
        L67:
            return
        L68:
            java.lang.String r0 = "This NavigationEventDispatcher has already been disposed and cannot be used."
            j8.o.A(r0)
            return
    }
}
