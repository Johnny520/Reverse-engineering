package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.s0 f5995a;

    public p1(fg.a r2) {
            r1 = this;
            r1.<init>()
            i0.s0 r0 = new i0.s0
            r0.<init>(r2)
            r1.f5995a = r0
            return
    }

    public abstract i0.q1 a(java.lang.Object r1);

    public i0.p2 b() {
            r1 = this;
            i0.s0 r0 = r1.f5995a
            return r0
    }

    public final i0.p2 c(i0.q1 r4, i0.p2 r5) {
            r3 = this;
            boolean r0 = r5 instanceof i0.b0
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r4.f6022d
            if (r0 == 0) goto L3d
            r1 = r5
            i0.b0 r1 = (i0.b0) r1
            i0.j1 r5 = r1.f5849a
            java.lang.Object r0 = r4.a()
            r5.setValue(r0)
            goto L3d
        L16:
            boolean r0 = r5 instanceof i0.n2
            if (r0 == 0) goto L36
            boolean r0 = r4.f6020b
            if (r0 != 0) goto L22
            java.lang.Object r0 = r4.f6023e
            if (r0 == 0) goto L3d
        L22:
            boolean r0 = r4.f6022d
            if (r0 != 0) goto L3d
            java.lang.Object r0 = r4.a()
            i0.n2 r5 = (i0.n2) r5
            java.lang.Object r2 = r5.f5984a
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L3d
            r1 = r5
            goto L3d
        L36:
            boolean r5 = r5 instanceof i0.v
            if (r5 == 0) goto L3d
            r4.getClass()
        L3d:
            if (r1 != 0) goto L60
            boolean r5 = r4.f6022d
            if (r5 == 0) goto L56
            i0.b0 r5 = new i0.b0
            java.lang.Object r0 = r4.f6023e
            i0.e r4 = r4.f6021c
            if (r4 != 0) goto L4d
            i0.e r4 = i0.e.f5870m
        L4d:
            i0.j1 r1 = new i0.j1
            r1.<init>(r0, r4)
            r5.<init>(r1)
            return r5
        L56:
            i0.n2 r5 = new i0.n2
            java.lang.Object r4 = r4.a()
            r5.<init>(r4)
            return r5
        L60:
            return r1
    }
}
