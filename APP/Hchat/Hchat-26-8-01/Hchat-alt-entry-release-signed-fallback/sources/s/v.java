package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class v extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.z f12116a;

    public v(s.z r1) {
            r0 = this;
            r0.<init>()
            r0.f12116a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof s.v
            if (r0 != 0) goto L8
            goto L14
        L8:
            s.v r2 = (s.v) r2
            s.z r0 = r1.f12116a
            s.z r2 = r2.f12116a
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
            s.w r0 = new s.w
            r0.<init>()
            s.z r1 = r2.f12116a
            r0.f12120u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r4) {
            r3 = this;
            s.w r4 = (s.w) r4
            s.z r0 = r4.f12120u
            s.z r1 = r3.f12116a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L21
            y0.n r0 = r4.f21819g
            boolean r0 = r0.f21832t
            if (r0 == 0) goto L21
            s.z r0 = r4.f12120u
            r0.d()
            r2 = 0
            r0.f12147b = r2
            r2 = -1
            r0.f12148c = r2
            r1.f12155j = r4
            r4.f12120u = r1
        L21:
            return
    }

    public final int hashCode() {
            r1 = this;
            s.z r0 = r1.f12116a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayingDisappearingItemsElement(animator="
            r0.<init>(r1)
            s.z r1 = r2.f12116a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
