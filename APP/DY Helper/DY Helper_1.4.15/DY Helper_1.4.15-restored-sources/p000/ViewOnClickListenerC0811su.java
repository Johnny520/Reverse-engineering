package p000;

/* JADX INFO: renamed from: su */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0811su implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10043;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.EditText f10044;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f10045;

    public /* synthetic */ ViewOnClickListenerC0811su(android.app.Activity r1, android.widget.EditText r2, int r3) {
            r0 = this;
            r0.f10043 = r3
            r0.f10045 = r1
            r0.f10044 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ ViewOnClickListenerC0811su(android.widget.EditText r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.f10043 = r3
            r0.f10044 = r1
            r0.f10045 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            int r5 = r4.f10043
            r0 = 3
            android.widget.EditText r1 = r4.f10044
            android.app.Activity r4 = r4.f10045
            switch(r5) {
                case 0: goto L50;
                case 1: goto L40;
                case 2: goto L36;
                case 3: goto L2b;
                case 4: goto L20;
                case 5: goto L15;
                default: goto La;
            }
        La:
            bv1 r5 = p000.bv1.f1853
            qu r5 = new qu
            r5.<init>(r4, r1, r0)
            r1.post(r5)
            return
        L15:
            bv1 r5 = p000.bv1.f1853
            qu r5 = new qu
            r5.<init>(r4, r1, r0)
            r1.post(r5)
            return
        L20:
            bv1 r5 = p000.bv1.f1853
            qu r5 = new qu
            r5.<init>(r4, r1, r0)
            r1.post(r5)
            return
        L2b:
            bv1 r5 = p000.bv1.f1853
            qu r5 = new qu
            r5.<init>(r4, r1, r0)
            r1.post(r5)
            return
        L36:
            qu r5 = new qu
            r0 = 2
            r5.<init>(r4, r1, r0)
            r1.post(r5)
            return
        L40:
            r5 = 1
            r1.setCursorVisible(r5)
            r1.requestFocus()
            qu r0 = new qu
            r0.<init>(r4, r1, r5)
            r1.post(r0)
            return
        L50:
            r1.requestFocus()
            android.text.Editable r5 = r1.getText()
            r0 = 0
            if (r5 == 0) goto L5f
            int r5 = r5.length()
            goto L60
        L5f:
            r5 = r0
        L60:
            r1.setSelection(r5)
            qu r5 = new qu
            r5.<init>(r4, r1, r0)
            r2 = 120(0x78, double:5.93E-322)
            r1.postDelayed(r5, r2)
            return
    }
}
