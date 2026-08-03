package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f7001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2.c f7002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p.x0 f7004d;

    public j(android.content.Context r1, u2.c r2, long r3, p.x0 r5) {
            r0 = this;
            r0.<init>()
            r0.f7001a = r1
            r0.f7002b = r2
            r0.f7003c = r3
            r0.f7004d = r5
            return
    }

    @Override // k.l1
    public final k.k1 a() {
            r6 = this;
            k.i r0 = new k.i
            long r3 = r6.f7003c
            p.x0 r5 = r6.f7004d
            android.content.Context r1 = r6.f7001a
            u2.c r2 = r6.f7002b
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            if (r8 == 0) goto Lb
            java.lang.Class r1 = r8.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<k.j> r2 = k.j.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r8.getClass()
            k.j r8 = (k.j) r8
            android.content.Context r1 = r7.f7001a
            android.content.Context r3 = r8.f7001a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            u2.c r1 = r7.f7002b
            u2.c r3 = r8.f7002b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L31
            return r2
        L31:
            long r3 = r7.f7003c
            long r5 = r8.f7003c
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L3c
            return r2
        L3c:
            p.x0 r1 = r7.f7004d
            p.x0 r8 = r8.f7004d
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L47
            return r2
        L47:
            return r0
    }

    public final int hashCode() {
            r5 = this;
            android.content.Context r0 = r5.f7001a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            u2.c r2 = r5.f7002b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = f1.w.f3132h
            long r3 = r5.f7003c
            int r0 = eh.a.f(r2, r1, r3)
            p.x0 r1 = r5.f7004d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
