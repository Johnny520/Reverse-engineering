package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eb2 extends p000.p80 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.view.View f3474;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.ProgressBar f3475;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.TextView f3476;

    public eb2(android.view.View r7, android.widget.ProgressBar r8, android.widget.TextView r9) {
            r6 = this;
            r6.f3474 = r7
            r6.f3475 = r8
            r6.f3476 = r9
            java.lang.String r4 = "showConfirmDialog$lambda$171$updateProgress(Landroid/view/View;Landroid/widget/ProgressBar;Landroid/widget/TextView;ILjava/lang/String;)V"
            r5 = 0
            r1 = 2
            java.lang.Class<kn0> r2 = p000.kn0.class
            java.lang.String r3 = "updateProgress"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            android.view.View r0 = r3.f3474
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r3.f3475
            r0.setIndeterminate(r1)
            r2 = 100
            int r4 = p000.j81.m2906(r4, r1, r2)
            r0.setProgress(r4)
            android.widget.TextView r3 = r3.f3476
            r3.setText(r5)
            s62 r3 = p000.s62.f9751
            return r3
    }
}
