package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f805b;

    public /* synthetic */ i0(java.lang.String r1, int r2) {
            r0 = this;
            r0.f804a = r2
            r0.f805b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f804a
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            qd.l r2 = (qd.l) r2
            boolean r0 = r2 instanceof qd.o
            if (r0 == 0) goto L12
            qd.o r2 = (qd.o) r2
            java.lang.String r0 = r1.f805b
            r2.p(r0)
        L12:
            return
        L13:
            java.lang.String r0 = r1.f805b
            ud.e r2 = (ud.e) r2
            r2.L(r0)
            return
    }
}
