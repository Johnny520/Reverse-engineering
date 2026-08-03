package s0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends p0.b implements i0.t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s0.h f12195j = null;

    static {
            s0.h r0 = new s0.h
            p0.j r1 = p0.j.f10065e
            r2 = 0
            r0.<init>(r1, r2)
            s0.h.f12195j = r0
            return
    }

    public final s0.h c(i0.p1 r4, i0.p2 r5) {
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 0
            p0.j r2 = r3.f10050g
            a5.a r4 = r2.u(r0, r4, r5, r1)
            if (r4 != 0) goto Le
            return r3
        Le:
            s0.h r5 = new s0.h
            java.lang.Object r0 = r4.f57i
            p0.j r0 = (p0.j) r0
            int r1 = r3.f10051h
            int r4 = r4.f56h
            int r1 = r1 + r4
            r5.<init>(r0, r1)
            return r5
    }

    @Override // p0.b, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i0.p1
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            i0.p1 r2 = (i0.p1) r2
            boolean r2 = super.containsKey(r2)
            return r2
    }

    @Override // p0.b, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i0.p2
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            i0.p2 r2 = (i0.p2) r2
            boolean r2 = super.containsValue(r2)
            return r2
    }

    @Override // p0.b, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i0.p1
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            i0.p1 r2 = (i0.p1) r2
            java.lang.Object r2 = super.get(r2)
            i0.p2 r2 = (i0.p2) r2
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof i0.p1
            if (r0 != 0) goto L5
            return r3
        L5:
            i0.p1 r2 = (i0.p1) r2
            i0.p2 r3 = (i0.p2) r3
            java.lang.Object r2 = super.getOrDefault(r2, r3)
            i0.p2 r2 = (i0.p2) r2
            return r2
    }
}
