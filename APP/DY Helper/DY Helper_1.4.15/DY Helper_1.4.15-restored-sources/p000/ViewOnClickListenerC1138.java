package p000;

/* JADX INFO: renamed from: ｈ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1138 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13483;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f13484;

    public /* synthetic */ ViewOnClickListenerC1138(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f13483 = r1
            r0.f13484 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r1.f13483
            switch(r2) {
                case 0: goto L28;
                case 1: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f13484
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            v42 r1 = r1.f753
            if (r1 != 0) goto Lf
            r1 = 0
            goto L11
        Lf:
            lz0 r1 = r1.f11103
        L11:
            if (r1 == 0) goto L16
            r1.collapseActionView()
        L16:
            return
        L17:
            java.lang.Object r1 = r1.f13484
            u r1 = (p000.C0854u) r1
            s r2 = r1.f10541
            r0 = 1
            w r1 = r1.f10521
            android.os.Message r1 = r2.obtainMessage(r0, r1)
            r1.sendToTarget()
            return
        L28:
            java.lang.Object r1 = r1.f13484
            ｗ r1 = (p000.AbstractC1153) r1
            r1.mo5432()
            return
    }
}
