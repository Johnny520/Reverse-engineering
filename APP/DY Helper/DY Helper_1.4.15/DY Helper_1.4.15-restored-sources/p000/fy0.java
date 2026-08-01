package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fy0 implements android.content.DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4168;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ android.app.AlertDialog f4169;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ android.widget.EditText f4170;

    public /* synthetic */ fy0(android.app.AlertDialog r1, android.widget.EditText r2, int r3) {
            r0 = this;
            r0.f4168 = r3
            r0.f4169 = r1
            r0.f4170 = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface r6) {
            r5 = this;
            int r6 = r5.f4168
            r0 = 180(0xb4, double:8.9E-322)
            r2 = 0
            r3 = 5
            android.widget.EditText r4 = r5.f4170
            android.app.AlertDialog r5 = r5.f4169
            switch(r6) {
                case 0: goto L21;
                default: goto Ld;
            }
        Ld:
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L16
            r5.setSoftInputMode(r3)
        L16:
            qy0 r5 = p000.qy0.f9157
            yx0 r5 = new yx0
            r5.<init>(r4, r2)
            r4.postDelayed(r5, r0)
            return
        L21:
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L2a
            r5.setSoftInputMode(r3)
        L2a:
            qy0 r5 = p000.qy0.f9157
            yx0 r5 = new yx0
            r5.<init>(r4, r2)
            r4.postDelayed(r5, r0)
            return
    }
}
