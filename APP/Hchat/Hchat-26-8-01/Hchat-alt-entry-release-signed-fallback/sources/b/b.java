package b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements android.window.OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.a f324b;

    public /* synthetic */ b(fg.a r1, int r2) {
            r0 = this;
            r0.f323a = r2
            r0.f324b = r1
            r0.<init>()
            return
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
            r1 = this;
            int r0 = r1.f323a
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            fg.a r0 = r1.f324b
            if (r0 == 0) goto Lc
            r0.invoke()
        Lc:
            return
        Ld:
            fg.a r0 = r1.f324b
            r0.invoke()
            return
    }
}
