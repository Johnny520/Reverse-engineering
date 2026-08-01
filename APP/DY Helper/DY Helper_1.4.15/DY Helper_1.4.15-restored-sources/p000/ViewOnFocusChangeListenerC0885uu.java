package p000;

/* JADX INFO: renamed from: uu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0885uu implements android.view.View.OnFocusChangeListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10955;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f10956;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.EditText f10957;

    public /* synthetic */ ViewOnFocusChangeListenerC0885uu(android.app.Activity r1, android.widget.EditText r2, int r3) {
            r0 = this;
            r0.f10955 = r3
            r0.f10956 = r1
            r0.f10957 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r3, boolean r4) {
            r2 = this;
            int r3 = r2.f10955
            switch(r3) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            if (r4 == 0) goto L14
            qu r3 = new qu
            r4 = 2
            android.app.Activity r0 = r2.f10956
            android.widget.EditText r2 = r2.f10957
            r3.<init>(r0, r2, r4)
            r2.post(r3)
        L14:
            return
        L15:
            if (r4 == 0) goto L26
            qu r3 = new qu
            r4 = 0
            android.app.Activity r0 = r2.f10956
            android.widget.EditText r2 = r2.f10957
            r3.<init>(r0, r2, r4)
            r0 = 120(0x78, double:5.93E-322)
            r2.postDelayed(r3, r0)
        L26:
            return
    }
}
