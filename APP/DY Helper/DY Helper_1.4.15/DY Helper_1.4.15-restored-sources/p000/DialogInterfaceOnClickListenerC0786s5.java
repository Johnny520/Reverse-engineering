package p000;

/* JADX INFO: renamed from: s5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0786s5 implements p000.InterfaceC0972x5, android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public p000.DialogInterfaceC0929w f9734;

    /* JADX INFO: renamed from: ζ */
    public p000.C0823t5 f9735;

    /* JADX INFO: renamed from: η */
    public java.lang.CharSequence f9736;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner f9737;

    public DialogInterfaceOnClickListenerC0786s5(androidx.appcompat.widget.AppCompatSpinner r1) {
            r0 = this;
            r0.<init>()
            r0.f9737 = r1
            return
    }

    @Override // p000.InterfaceC0972x5
    public final void dismiss() {
            r1 = this;
            w r0 = r1.f9734
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r1.f9734 = r0
        La:
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            androidx.appcompat.widget.AppCompatSpinner r4 = r3.f9737
            r4.setSelection(r5)
            android.widget.AdapterView$OnItemClickListener r0 = r4.getOnItemClickListener()
            if (r0 == 0) goto L15
            t5 r0 = r3.f9735
            long r0 = r0.getItemId(r5)
            r2 = 0
            r4.performItemClick(r2, r5, r0)
        L15:
            r3.dismiss()
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: β */
    public final boolean mo5365() {
            r0 = this;
            w r0 = r0.f9734
            if (r0 == 0) goto L9
            boolean r0 = r0.isShowing()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: γ */
    public final int mo5366() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: ε */
    public final android.graphics.drawable.Drawable mo5367() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: η */
    public final void mo332(java.lang.CharSequence r1) {
            r0 = this;
            r0.f9736 = r1
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: ι */
    public final void mo5368(android.graphics.drawable.Drawable r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set popup background for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: λ */
    public final void mo5369(int r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set vertical offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: μ */
    public final void mo333(int r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: ν */
    public final void mo5370(int r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: ξ */
    public final void mo334(int r5, int r6) {
            r4 = this;
            t5 r0 = r4.f9735
            if (r0 != 0) goto L5
            return
        L5:
            v r0 = new v
            androidx.appcompat.widget.AppCompatSpinner r1 = r4.f9737
            android.content.Context r2 = r1.getPopupContext()
            r0.<init>(r2)
            java.lang.Object r2 = r0.f11045
            r r2 = (p000.C0743r) r2
            java.lang.CharSequence r3 = r4.f9736
            if (r3 == 0) goto L1a
            r2.f9179 = r3
        L1a:
            t5 r3 = r4.f9735
            int r1 = r1.getSelectedItemPosition()
            r2.f9182 = r3
            r2.f9183 = r4
            r2.f9185 = r1
            r1 = 1
            r2.f9184 = r1
            w r0 = r0.m6011()
            r4.f9734 = r0
            u r0 = r0.f11501
            androidx.appcompat.app.AlertController$RecycleListView r0 = r0.f10524
            r0.setTextDirection(r5)
            r0.setTextAlignment(r6)
            w r4 = r4.f9734
            r4.show()
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: ο */
    public final int mo5371() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: π */
    public final java.lang.CharSequence mo335() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f9736
            return r0
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: ρ */
    public final void mo336(android.widget.ListAdapter r1) {
            r0 = this;
            t5 r1 = (p000.C0823t5) r1
            r0.f9735 = r1
            return
    }
}
