package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed0 implements android.content.DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3496;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.nd0 f3497;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ android.app.AlertDialog f3498;

    public /* synthetic */ ed0(p000.nd0 r1, android.app.AlertDialog r2, int r3) {
            r0 = this;
            r0.f3496 = r3
            r0.f3497 = r1
            r0.f3498 = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface r2) {
            r1 = this;
            int r2 = r1.f3496
            switch(r2) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            android.app.AlertDialog r2 = r1.f3498
            r2.getClass()
            r0 = 0
            nd0 r1 = r1.f3497
            r1.m4027(r2, r0)
            return
        L11:
            android.app.AlertDialog r2 = r1.f3498
            r2.getClass()
            r0 = 0
            nd0 r1 = r1.f3497
            r1.m4027(r2, r0)
            return
    }
}
