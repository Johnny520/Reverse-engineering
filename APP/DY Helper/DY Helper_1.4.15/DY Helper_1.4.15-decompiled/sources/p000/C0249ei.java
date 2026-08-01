package p000;

/* JADX INFO: renamed from: ei */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0249ei implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3563;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.um1 f3564;

    public /* synthetic */ C0249ei(p000.um1 r1, int r2) {
            r0 = this;
            r0.f3563 = r2
            r0.f3564 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f3563
            um1 r1 = r1.f3564
            switch(r0) {
                case 0: goto L1a;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r1.f10912
            if (r1 == 0) goto L13
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            r1.dismiss()
        L10:
            s62 r1 = p000.s62.f9751
            return r1
        L13:
            java.lang.String r1 = "dialog"
            p000.ln0.m3650(r1)
            r1 = 0
            throw r1
        L1a:
            java.lang.Object r1 = r1.f10912
            if (r1 == 0) goto L24
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            r1.dismiss()
            goto L10
        L24:
            java.lang.String r1 = "dialog"
            p000.ln0.m3650(r1)
            r1 = 0
            throw r1
    }
}
