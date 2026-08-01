package p000;

/* JADX INFO: renamed from: tu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0848tu implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10459;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f10460;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.EditText f10461;

    public /* synthetic */ ViewOnTouchListenerC0848tu(android.app.Activity r2, android.widget.EditText r3) {
            r1 = this;
            r0 = 1
            r1.f10459 = r0
            r1.<init>()
            r1.f10460 = r2
            r1.f10461 = r3
            return
    }

    public /* synthetic */ ViewOnTouchListenerC0848tu(android.widget.EditText r2, android.app.Activity r3) {
            r1 = this;
            r0 = 0
            r1.f10459 = r0
            r1.<init>()
            r1.f10461 = r2
            r1.f10460 = r3
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            int r0 = r4.f10459
            r1 = 1
            android.widget.EditText r2 = r4.f10461
            android.app.Activity r4 = r4.f10460
            r3 = 0
            switch(r0) {
                case 0: goto L1d;
                default: goto Lb;
            }
        Lb:
            int r5 = r6.getActionMasked()
            if (r5 != r1) goto L1c
            bv1 r5 = p000.bv1.f1853
            qu r5 = new qu
            r6 = 3
            r5.<init>(r4, r2, r6)
            r2.post(r5)
        L1c:
            return r3
        L1d:
            int r6 = r6.getActionMasked()
            if (r6 != r1) goto L33
            r5.performClick()
            r2.requestFocus()
            qu r5 = new qu
            r5.<init>(r4, r2, r3)
            r0 = 120(0x78, double:5.93E-322)
            r2.postDelayed(r5, r0)
        L33:
            return r3
    }
}
