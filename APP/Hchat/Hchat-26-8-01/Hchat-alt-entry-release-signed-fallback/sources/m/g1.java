package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sg.g f8165h;

    public /* synthetic */ g1(sg.g r1, int r2) {
            r0 = this;
            r0.f8164g = r2
            r0.f8165h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f8164g
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            sg.g r0 = r2.f8165h
            java.lang.Object r0 = r0.d()
            boolean r1 = r0 instanceof sg.i
            if (r1 != 0) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            m.b3 r0 = (m.b3) r0
            return r0
        L14:
            sg.g r0 = r2.f8165h
            java.lang.Object r0 = r0.d()
            boolean r1 = r0 instanceof sg.i
            if (r1 != 0) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            m.h1 r0 = (m.h1) r0
            return r0
    }
}
