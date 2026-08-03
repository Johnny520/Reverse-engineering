package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class b extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th.a f13261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.a f13262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg.l f13263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg.l f13264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg.l f13265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fg.p f13266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fg.l f13267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13268h;

    public b(th.a r1, fg.a r2, fg.l r3, fg.l r4, fg.l r5, fg.p r6, fg.l r7, boolean r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f13261a = r1
            r0.f13262b = r2
            r0.f13263c = r3
            r0.f13264d = r4
            r0.f13265e = r5
            r0.f13266f = r6
            r0.f13267g = r7
            r0.f13268h = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L5f
        L3:
            boolean r0 = r3 instanceof th.b
            if (r0 != 0) goto L8
            goto L5d
        L8:
            th.b r3 = (th.b) r3
            th.a r0 = r3.f13261a
            th.a r1 = r2.f13261a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L15
            goto L5d
        L15:
            fg.a r0 = r2.f13262b
            fg.a r1 = r3.f13262b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L5d
        L20:
            fg.l r0 = r2.f13263c
            fg.l r1 = r3.f13263c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L5d
        L2b:
            fg.l r0 = r2.f13264d
            fg.l r1 = r3.f13264d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L36
            goto L5d
        L36:
            fg.l r0 = r2.f13265e
            fg.l r1 = r3.f13265e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L41
            goto L5d
        L41:
            fg.p r0 = r2.f13266f
            fg.p r1 = r3.f13266f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c
            goto L5d
        L4c:
            fg.l r0 = r2.f13267g
            fg.l r1 = r3.f13267g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L57
            goto L5d
        L57:
            boolean r0 = r2.f13268h
            boolean r3 = r3.f13268h
            if (r0 == r3) goto L5f
        L5d:
            r3 = 0
            return r3
        L5f:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r9 = this;
            th.i r0 = new th.i
            fg.l r7 = r9.f13267g
            boolean r8 = r9.f13268h
            th.a r1 = r9.f13261a
            fg.a r2 = r9.f13262b
            fg.l r3 = r9.f13263c
            fg.l r4 = r9.f13264d
            fg.l r5 = r9.f13265e
            fg.p r6 = r9.f13266f
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r5) {
            r4 = this;
            th.i r5 = (th.i) r5
            r5.getClass()
            boolean r0 = r5.A
            boolean r1 = r4.f13268h
            if (r0 == r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            th.a r2 = r4.f13261a
            r2.getClass()
            r5.f13312u = r2
            fg.a r2 = r4.f13262b
            r2.getClass()
            vh.f r3 = r5.B
            r3.getClass()
            r3.f14388c = r2
            fg.l r2 = r4.f13263c
            r2.getClass()
            r5.f13313v = r2
            fg.l r2 = r4.f13264d
            r5.f13314w = r2
            fg.l r2 = r4.f13265e
            r5.f13315x = r2
            fg.p r2 = r4.f13266f
            r5.f13316y = r2
            fg.l r2 = r4.f13267g
            r5.f13317z = r2
            r5.A = r1
            if (r0 == 0) goto L44
            if (r1 != 0) goto L41
            r5.o1()
        L41:
            x1.k.m(r5)
        L44:
            i.e0 r0 = new i.e0
            r1 = 26
            r0.<init>(r5, r1)
            x1.k.r(r5, r0)
            return
    }

    public final int hashCode() {
            r4 = this;
            th.a r0 = r4.f13261a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            fg.a r2 = r4.f13262b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            fg.l r0 = r4.f13263c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            fg.l r3 = r4.f13264d
            if (r3 == 0) goto L23
            int r3 = r3.hashCode()
            goto L24
        L23:
            r3 = r2
        L24:
            int r0 = r0 + r3
            int r0 = r0 * r1
            fg.l r3 = r4.f13265e
            if (r3 == 0) goto L2f
            int r3 = r3.hashCode()
            goto L30
        L2f:
            r3 = r2
        L30:
            int r0 = r0 + r3
            int r0 = r0 * 961
            fg.p r3 = r4.f13266f
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * r1
            fg.l r0 = r4.f13267g
            if (r0 == 0) goto L43
            int r2 = r0.hashCode()
        L43:
            int r3 = r3 + r2
            int r3 = r3 * 961
            r0 = 3
            int r0 = eh.a.e(r0, r3, r1)
            boolean r1 = r4.f13268h
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
