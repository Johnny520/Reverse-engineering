package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.j0 f13950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13951c;

    public /* synthetic */ i0(v1.j0 r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f13949a = r3
            r0.f13950b = r1
            r0.f13951c = r2
            r0.<init>()
            return
    }

    private final void a() {
            r0 = this;
            return
    }

    public v1.b0 b() {
            r3 = this;
            v1.j0 r0 = r3.f13950b
            f.k0 r1 = r0.f13964p
            java.lang.Object r2 = r3.f13951c
            java.lang.Object r1 = r1.g(r2)
            x1.f0 r1 = (x1.f0) r1
            if (r1 == 0) goto L17
            f.k0 r0 = r0.f13960l
            java.lang.Object r0 = r0.g(r1)
            v1.b0 r0 = (v1.b0) r0
            return r0
        L17:
            r0 = 0
            return r0
    }

    public final boolean c() {
            r1 = this;
            int r0 = r1.f13949a
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            v1.b0 r0 = r1.b()
            if (r0 == 0) goto L14
            i0.l1 r0 = r0.f13897f
            if (r0 == 0) goto L14
            boolean r0 = r0.c()
            goto L15
        L14:
            r0 = 1
        L15:
            return r0
        L16:
            r0 = 1
            return r0
    }
}
