package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i.k1 f5591h;

    public /* synthetic */ a1(i.k1 r1, int r2) {
            r0 = this;
            r0.f5590g = r2
            r0.f5591h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f5590g
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            i.k1 r0 = r5.f5591h
            long r0 = r0.b()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L10:
            i.k1 r0 = r5.f5591h
            i0.j1 r1 = r0.f5710d
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r2 = r0.c()
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L40
            i0.h1 r1 = r0.f5713g
            long r1 = r1.g()
            r3 = -9223372036854775808
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L2f
            goto L40
        L2f:
            i0.j1 r0 = r0.f5714h
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3e
            goto L40
        L3e:
            r0 = 0
            goto L41
        L40:
            r0 = 1
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
