package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f11760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r9.d0 f11761i;

    public /* synthetic */ l(android.widget.TextView r1, r9.d0 r2, int r3) {
            r0 = this;
            r0.f11759g = r3
            r0.f11760h = r1
            r0.f11761i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f11759g
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            android.widget.TextView r0 = r3.f11760h
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.getTag()
            java.lang.String r2 = "hchat_message_details_view"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L21
            r9.d0 r1 = r3.f11761i
            r1.e(r0)
            r0.invalidate()
        L21:
            return
        L22:
            android.widget.TextView r0 = r3.f11760h
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.getTag()
            java.lang.String r2 = "hchat_message_details_view"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L3e
            r9.d0 r1 = r3.f11761i
            r1.e(r0)
            r0.invalidate()
        L3e:
            return
    }
}
