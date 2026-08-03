package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.l1 f12037a;

    public k(i.l1 r1) {
            r0 = this;
            r0.<init>()
            r0.f12037a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof s.k
            if (r0 != 0) goto L8
            goto L14
        L8:
            s.k r2 = (s.k) r2
            i.l1 r0 = r1.f12037a
            i.l1 r2 = r2.f12037a
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            s.l r0 = new s.l
            r0.<init>()
            i.l1 r1 = r2.f12037a
            r0.f12038u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            s.l r2 = (s.l) r2
            r2.getClass()
            i.l1 r0 = r1.f12037a
            r2.f12038u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            i.l1 r0 = r1.f12037a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LazyLayoutAnimateItemElement(fadeInSpec=null, placementSpec="
            r0.<init>(r1)
            i.l1 r1 = r2.f12037a
            r0.append(r1)
            java.lang.String r1 = ", fadeOutSpec=null)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
