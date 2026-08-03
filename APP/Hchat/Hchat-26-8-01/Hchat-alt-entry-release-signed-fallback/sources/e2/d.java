package e2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements android.os.CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2327b;

    public /* synthetic */ d(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f2326a = r2
            r0.f2327b = r1
            r0.<init>()
            return
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
            r4 = this;
            int r0 = r4.f2326a
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f2327b
            h0.d1 r0 = (h0.d1) r0
            if (r0 == 0) goto L1d
            w.q0 r1 = r0.f4850d
            if (r1 == 0) goto L14
            long r2 = i2.m0.f6358b
            r1.e(r2)
        L14:
            w.q0 r0 = r0.f4850d
            if (r0 == 0) goto L1d
            long r1 = i2.m0.f6358b
            r0.f(r1)
        L1d:
            return
        L1e:
            java.lang.Object r0 = r4.f2327b
            qg.e1 r0 = (qg.e1) r0
            r1 = 0
            r0.a(r1)
            return
    }
}
