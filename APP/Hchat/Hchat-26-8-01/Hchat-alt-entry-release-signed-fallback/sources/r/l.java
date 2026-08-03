package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l extends gg.p implements mg.d, fg.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f11178n;

    public /* synthetic */ l(int r1, int r2, java.lang.Class r3, java.lang.Object r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.f11178n = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @Override // gg.d
    public final mg.a e() {
            r1 = this;
            gg.w r0 = gg.v.f4565a
            r0.getClass()
            return r1
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f11178n
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f4549h
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            goto L18
        L10:
            java.lang.Object r0 = r1.f4549h
            i0.l2 r0 = (i0.l2) r0
            java.lang.Object r0 = r0.getValue()
        L18:
            return r0
    }
}
