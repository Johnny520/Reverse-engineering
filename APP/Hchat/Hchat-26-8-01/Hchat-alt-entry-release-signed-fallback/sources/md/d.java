package md;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md.f f8875b;

    public /* synthetic */ d(md.f r1, int r2) {
            r0 = this;
            r0.f8874a = r2
            r0.f8875b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f8874a
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.util.Map r5 = (java.util.Map) r5
            md.f r0 = r4.f8875b
            java.util.Map r0 = r0.f8880b
            r5.putAll(r0)
            return
        Lf:
            md.f r0 = r4.f8875b
            md.b r1 = md.b.f8865t
            oc.b r2 = r0.c(r1)
            md.c r2 = (md.c) r2
            if (r2 != 0) goto L2a
            md.c r2 = new md.c
            r2.<init>(r1)
            ae.g r1 = new ae.g
            r3 = 12
            r1.<init>(r2, r3)
            r0.i(r1)
        L2a:
            java.util.ArrayList r0 = r2.f8873h
            r0.add(r5)
            return
    }
}
