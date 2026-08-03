package ye;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ye.e f22426b;

    public /* synthetic */ b(ye.e r1, int r2) {
            r0 = this;
            r0.f22425a = r2
            r0.f22426b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f22425a
            ud.g r3 = (ud.g) r3
            switch(r0) {
                case 0: goto L13;
                default: goto L7;
            }
        L7:
            ye.e r0 = r2.f22426b
            java.util.HashMap r0 = r0.f22434b
            od.c r1 = r3.f13707l
            java.lang.String r1 = r1.f9774h
            r0.put(r1, r3)
            return
        L13:
            ye.e r0 = r2.f22426b
            java.util.HashMap r0 = r0.f22434b
            od.c r1 = r3.f13707l
            java.lang.String r1 = r1.f9774h
            r0.put(r1, r3)
            return
    }
}
