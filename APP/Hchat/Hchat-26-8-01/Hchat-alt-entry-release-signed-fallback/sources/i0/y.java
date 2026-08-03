package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements i0.a2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fg.l f6093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0.z f6094h;

    public y(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f6093g = r1
            return
    }

    @Override // i0.a2
    public final void d() {
            r0 = this;
            return
    }

    @Override // i0.a2
    public final void f() {
            r1 = this;
            i0.z r0 = r1.f6094h
            if (r0 == 0) goto L7
            r0.a()
        L7:
            r0 = 0
            r1.f6094h = r0
            return
    }

    @Override // i0.a2
    public final void j() {
            r2 = this;
            fg.l r0 = r2.f6093g
            i0.a0 r1 = i0.r.f6026b
            java.lang.Object r0 = r0.invoke(r1)
            i0.z r0 = (i0.z) r0
            r2.f6094h = r0
            return
    }
}
