package p000;

/* JADX INFO: renamed from: yi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1022yi implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12632;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.content.Context f12633;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f12634;

    public /* synthetic */ RunnableC1022yi(int r1, android.content.Context r2, java.lang.String r3) {
            r0 = this;
            r0.f12632 = r1
            r0.f12633 = r2
            r0.f12634 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f12632
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r2.f12633
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 != 0) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            r1 = 0
            java.lang.String r2 = r2.f12634
            android.widget.Toast r2 = android.widget.Toast.makeText(r0, r2, r1)
            r2.show()
            return
        L1a:
            android.content.Context r0 = r2.f12633
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 != 0) goto L23
            goto L24
        L23:
            r0 = r1
        L24:
            r1 = 1
            java.lang.String r2 = r2.f12634
            android.widget.Toast r2 = android.widget.Toast.makeText(r0, r2, r1)
            r2.show()
            return
    }
}
