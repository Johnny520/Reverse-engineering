package r3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg.b0 f11341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tf.k f11342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tf.k f11343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashSet f11344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashSet f11345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashSet f11346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11349i;

    public d() {
            r1 = this;
            r1.<init>()
            r3.e r0 = r3.e.f11350a
            tg.s.b(r0)
            r3.b r0 = new r3.b
            r0.<init>()
            tg.b0 r0 = tg.s.b(r0)
            r1.f11341a = r0
            tf.k r0 = new tf.k
            r0.<init>()
            r1.f11342b = r0
            tf.k r0 = new tf.k
            r0.<init>()
            r1.f11343c = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11344d = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11345e = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11346f = r0
            return
    }

    public static s3.a b(r3.d r5) {
            tf.k r0 = r5.f11343c
            tf.k r5 = r5.f11342b
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r1 = r5.hasNext()
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r5.next()
            r3 = r1
            s3.a r3 = (s3.a) r3
            boolean r4 = r3.f12338d
            if (r4 != 0) goto L20
            boolean r3 = r3.f12339e
            if (r3 == 0) goto L8
            goto L20
        L1f:
            r1 = r2
        L20:
            s3.a r1 = (s3.a) r1
            if (r1 != 0) goto L41
            java.util.Iterator r5 = r0.iterator()
        L28:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r5.next()
            r1 = r0
            s3.a r1 = (s3.a) r1
            boolean r3 = r1.f12338d
            if (r3 != 0) goto L3d
            boolean r1 = r1.f12339e
            if (r1 == 0) goto L28
        L3d:
            r2 = r0
        L3e:
            s3.a r2 = (s3.a) r2
            return r2
        L41:
            return r1
    }

    public final void a() {
            r8 = this;
            r0 = 1
            r1 = 0
            tf.k r2 = r8.f11342b
            if (r2 == 0) goto Le
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Le
        Lc:
            r2 = r1
            goto L27
        Le:
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc
            java.lang.Object r3 = r2.next()
            s3.a r3 = (s3.a) r3
            boolean r4 = r3.f12338d
            if (r4 != 0) goto L26
            boolean r3 = r3.f12339e
            if (r3 == 0) goto L12
        L26:
            r2 = r0
        L27:
            tf.k r3 = r8.f11343c
            if (r3 == 0) goto L33
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L33
        L31:
            r3 = r1
            goto L4c
        L33:
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            s3.a r4 = (s3.a) r4
            boolean r5 = r4.f12338d
            if (r5 != 0) goto L4b
            boolean r4 = r4.f12339e
            if (r4 == 0) goto L37
        L4b:
            r3 = r0
        L4c:
            if (r2 != 0) goto L53
            if (r3 == 0) goto L51
            goto L53
        L51:
            r4 = r1
            goto L54
        L53:
            r4 = r0
        L54:
            boolean r5 = r8.f11348h
            if (r5 == r2) goto L5a
            r5 = r0
            goto L5b
        L5a:
            r5 = r1
        L5b:
            boolean r6 = r8.f11347g
            if (r6 == r3) goto L61
            r6 = r0
            goto L62
        L61:
            r6 = r1
        L62:
            boolean r7 = r8.f11349i
            if (r7 == r4) goto L67
            goto L68
        L67:
            r0 = r1
        L68:
            if (r5 == 0) goto L82
            java.util.LinkedHashSet r1 = r8.f11346f
            java.util.Iterator r1 = r1.iterator()
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L77
            goto L82
        L77:
            java.lang.Object r0 = r1.next()
            r0.getClass()
            ah.a.d()
            return
        L82:
            if (r6 == 0) goto L9c
            java.util.LinkedHashSet r1 = r8.f11345e
            java.util.Iterator r1 = r1.iterator()
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L91
            goto L9c
        L91:
            java.lang.Object r0 = r1.next()
            r0.getClass()
            ah.a.d()
            return
        L9c:
            if (r0 == 0) goto Lb6
            java.util.LinkedHashSet r0 = r8.f11344d
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Lab
            goto Lb6
        Lab:
            java.lang.Object r0 = r0.next()
            r0.getClass()
            ah.a.d()
            return
        Lb6:
            r8.f11348h = r2
            r8.f11347g = r3
            r8.f11349i = r4
            s3.a r0 = b(r8)
            r8.c(r0)
            return
    }

    public final void c(s3.a r5) {
            r4 = this;
            s3.a r0 = b(r4)
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto Lc
            goto Lba
        Lc:
            if (r0 != 0) goto L14
            r3.b r5 = new r3.b
            r5.<init>()
            goto L83
        L14:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            tf.k r1 = r4.f11342b
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            s3.a r2 = (s3.a) r2
            boolean r3 = r2.f12338d
            if (r3 == 0) goto L1f
            java.util.List r3 = r2.f12336b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L1f
            java.util.List r2 = r2.f12336b
            r5.addAll(r2)
            goto L1f
        L3d:
            tf.k r1 = r4.f11343c
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()
            s3.a r2 = (s3.a) r2
            boolean r3 = r2.f12338d
            if (r3 == 0) goto L43
            java.util.List r3 = r2.f12336b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L43
            java.util.List r2 = r2.f12336b
            r5.addAll(r2)
            goto L43
        L61:
            r3.c r1 = r0.f12335a
            java.util.List r0 = r0.f12337c
            r3.b r2 = new r3.b
            r1.getClass()
            uf.c r3 = a.a.E()
            tf.r.h1(r3, r5)
            r3.add(r1)
            tf.r.h1(r3, r0)
            uf.c r0 = a.a.t(r3)
            int r5 = r5.size()
            r2.<init>(r5, r0)
            r5 = r2
        L83:
            tg.b0 r0 = r4.f11341a
            java.lang.Object r1 = r0.getValue()
            r3.b r1 = (r3.b) r1
            boolean r1 = gg.l.a(r1, r5)
            if (r1 == 0) goto L92
            goto Lba
        L92:
            r1 = 0
            r0.h(r1, r5)
            java.util.LinkedHashSet r5 = r4.f11346f
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto Ld1
            java.util.LinkedHashSet r5 = r4.f11345e
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto Lc6
            java.util.LinkedHashSet r5 = r4.f11344d
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto Lbb
        Lba:
            return
        Lbb:
            java.lang.Object r5 = r5.next()
            r5.getClass()
            ah.a.d()
            return
        Lc6:
            java.lang.Object r5 = r5.next()
            r5.getClass()
            ah.a.d()
            return
        Ld1:
            java.lang.Object r5 = r5.next()
            r5.getClass()
            ah.a.d()
            return
    }
}
