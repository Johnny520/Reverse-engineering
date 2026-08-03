package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements v1.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f13909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.l f13910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1.d0 f13911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v1.j0 f13912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg.l f13913g;

    public c0(int r1, int r2, java.util.Map r3, fg.l r4, v1.d0 r5, v1.j0 r6, fg.l r7) {
            r0 = this;
            r0.<init>()
            r0.f13907a = r1
            r0.f13908b = r2
            r0.f13909c = r3
            r0.f13910d = r4
            r0.f13911e = r5
            r0.f13912f = r6
            r0.f13913g = r7
            return
    }

    @Override // v1.o0
    public final java.util.Map e() {
            r1 = this;
            java.util.Map r0 = r1.f13909c
            return r0
    }

    @Override // v1.o0
    public final void f() {
            r3 = this;
            v1.j0 r0 = r3.f13912f
            x1.f0 r0 = r0.f13955g
            v1.d0 r1 = r3.f13911e
            boolean r1 = r1.u0()
            fg.l r2 = r3.f13913g
            if (r1 == 0) goto L1c
            x1.b1 r1 = r0.L
            x1.r r1 = r1.f20841c
            x1.q r1 = r1.Z
            if (r1 == 0) goto L1c
            v1.k0 r0 = r1.f21000r
            r2.invoke(r0)
            return
        L1c:
            x1.b1 r0 = r0.L
            x1.r r0 = r0.f20841c
            v1.k0 r0 = r0.f21000r
            r2.invoke(r0)
            return
    }

    @Override // v1.o0
    public final int g() {
            r1 = this;
            int r0 = r1.f13908b
            return r0
    }

    @Override // v1.o0
    public final int h() {
            r1 = this;
            int r0 = r1.f13907a
            return r0
    }

    @Override // v1.o0
    public final fg.l i() {
            r1 = this;
            fg.l r0 = r1.f13910d
            return r0
    }
}
