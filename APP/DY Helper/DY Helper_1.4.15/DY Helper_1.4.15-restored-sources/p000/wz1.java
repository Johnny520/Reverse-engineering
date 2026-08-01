package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wz1 extends p000.AbstractC1153 implements p000.gz0 {

    /* JADX INFO: renamed from: η */
    public android.content.Context f11908;

    /* JADX INFO: renamed from: θ */
    public androidx.appcompat.widget.ActionBarContextView f11909;

    /* JADX INFO: renamed from: ι */
    public p000.C0574n5 f11910;

    /* JADX INFO: renamed from: κ */
    public java.lang.ref.WeakReference f11911;

    /* JADX INFO: renamed from: λ */
    public boolean f11912;

    /* JADX INFO: renamed from: μ */
    public p000.iz0 f11913;

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: α */
    public final void mo5432() {
            r1 = this;
            boolean r0 = r1.f11912
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f11912 = r0
            n5 r0 = r1.f11910
            r0.m3969(r1)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: β */
    public final android.view.View mo5433() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f11911
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: γ */
    public final p000.iz0 mo5434() {
            r0 = this;
            iz0 r0 = r0.f11913
            return r0
    }

    @Override // p000.gz0
    /* JADX INFO: renamed from: δ */
    public final boolean mo220(p000.iz0 r1, android.view.MenuItem r2) {
            r0 = this;
            n5 r1 = r0.f11910
            java.lang.Object r1 = r1.f7387
            i0 r1 = (p000.C0379i0) r1
            boolean r0 = r1.m2553(r0, r2)
            return r0
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ε */
    public final android.view.MenuInflater mo5435() {
            r1 = this;
            s12 r0 = new s12
            androidx.appcompat.widget.ActionBarContextView r1 = r1.f11909
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ζ */
    public final java.lang.CharSequence mo5436() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f11909
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: η */
    public final java.lang.CharSequence mo5437() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f11909
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // p000.gz0
    /* JADX INFO: renamed from: θ */
    public final void mo221(p000.iz0 r1) {
            r0 = this;
            r0.mo5438()
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f11909
            r0.m248()
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ι */
    public final void mo5438() {
            r2 = this;
            n5 r0 = r2.f11910
            iz0 r1 = r2.f11913
            r0.m3970(r2, r1)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: κ */
    public final boolean mo5439() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f11909
            boolean r0 = r0.f484
            return r0
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: λ */
    public final void mo5440(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f11909
            r0.setCustomView(r2)
            if (r2 == 0) goto Ld
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.f11911 = r0
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: μ */
    public final void mo5441(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f11908
            java.lang.String r2 = r0.getString(r2)
            r1.mo5442(r2)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ν */
    public final void mo5442(java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f11909
            r0.setSubtitle(r1)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ξ */
    public final void mo5443(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f11908
            java.lang.String r2 = r0.getString(r2)
            r1.mo5444(r2)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ο */
    public final void mo5444(java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f11909
            r0.setTitle(r1)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: π */
    public final void mo5445(boolean r1) {
            r0 = this;
            r0.f13521 = r1
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f11909
            r0.setTitleOptional(r1)
            return
    }
}
