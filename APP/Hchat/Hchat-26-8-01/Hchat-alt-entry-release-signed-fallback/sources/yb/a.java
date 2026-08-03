package yb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements th.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th.a f22395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th.j f22396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22397c;

    public a(th.a r1, th.j r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f22395a = r1
            r0.f22396b = r2
            r1 = 1
            r0.f22397c = r1
            return
    }

    @Override // th.a
    public final void a(h1.d r8, u2.c r9, v1.t r10, fg.l r11, int r12) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            th.a r0 = r7.f22395a
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.a(r1, r2, r3, r4, r5)
            th.j r8 = r7.f22396b
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r8
            r1.a(r2, r3, r4, r5, r6)
            return
    }

    @Override // th.a
    public final boolean b() {
            r1 = this;
            boolean r0 = r1.f22397c
            return r0
    }

    @Override // th.a
    public final float c() {
            r1 = this;
            th.a r0 = r1.f22395a
            float r0 = r0.c()
            return r0
    }

    @Override // th.a
    public final float d() {
            r1 = this;
            th.a r0 = r1.f22395a
            float r0 = r0.d()
            return r0
    }
}
