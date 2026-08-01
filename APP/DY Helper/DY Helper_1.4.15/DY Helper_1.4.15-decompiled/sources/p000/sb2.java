package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sb2 extends p000.AbstractC1153 implements p000.gz0 {

    /* JADX INFO: renamed from: η */
    public final android.content.Context f9822;

    /* JADX INFO: renamed from: θ */
    public final p000.iz0 f9823;

    /* JADX INFO: renamed from: ι */
    public p000.C0574n5 f9824;

    /* JADX INFO: renamed from: κ */
    public java.lang.ref.WeakReference f9825;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.tb2 f9826;

    public sb2(p000.tb2 r1, android.content.Context r2, p000.C0574n5 r3) {
            r0 = this;
            r0.<init>()
            r0.f9826 = r1
            r0.f9822 = r2
            r0.f9824 = r3
            iz0 r1 = new iz0
            r1.<init>(r2)
            r2 = 1
            r1.f5262 = r2
            r0.f9823 = r1
            r1.f5255 = r0
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: α */
    public final void mo5432() {
            r3 = this;
            tb2 r0 = r3.f9826
            sb2 r1 = r0.f10287
            if (r1 == r3) goto L7
            return
        L7:
            boolean r1 = r0.f10294
            if (r1 == 0) goto L12
            r0.f10288 = r3
            n5 r1 = r3.f9824
            r0.f10289 = r1
            goto L17
        L12:
            n5 r1 = r3.f9824
            r1.m3969(r3)
        L17:
            r1 = 0
            r3.f9824 = r1
            r3 = 0
            r0.m5623(r3)
            androidx.appcompat.widget.ActionBarContextView r3 = r0.f10284
            android.view.View r2 = r3.f476
            if (r2 != 0) goto L27
            r3.m246()
        L27:
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r0.f10281
            boolean r2 = r0.f10299
            r3.setHideOnContentScrollEnabled(r2)
            r0.f10287 = r1
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: β */
    public final android.view.View mo5433() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f9825
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
            iz0 r0 = r0.f9823
            return r0
    }

    @Override // p000.gz0
    /* JADX INFO: renamed from: δ */
    public final boolean mo220(p000.iz0 r1, android.view.MenuItem r2) {
            r0 = this;
            n5 r1 = r0.f9824
            if (r1 == 0) goto Ld
            java.lang.Object r1 = r1.f7387
            i0 r1 = (p000.C0379i0) r1
            boolean r0 = r1.m2553(r0, r2)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ε */
    public final android.view.MenuInflater mo5435() {
            r1 = this;
            s12 r0 = new s12
            android.content.Context r1 = r1.f9822
            r0.<init>(r1)
            return r0
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ζ */
    public final java.lang.CharSequence mo5436() {
            r0 = this;
            tb2 r0 = r0.f9826
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f10284
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: η */
    public final java.lang.CharSequence mo5437() {
            r0 = this;
            tb2 r0 = r0.f9826
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f10284
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // p000.gz0
    /* JADX INFO: renamed from: θ */
    public final void mo221(p000.iz0 r1) {
            r0 = this;
            n5 r1 = r0.f9824
            if (r1 != 0) goto L5
            return
        L5:
            r0.mo5438()
            tb2 r0 = r0.f9826
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f10284
            r0.m248()
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ι */
    public final void mo5438() {
            r2 = this;
            tb2 r0 = r2.f9826
            sb2 r0 = r0.f10287
            if (r0 == r2) goto L7
            return
        L7:
            iz0 r0 = r2.f9823
            r0.m2843()
            n5 r1 = r2.f9824     // Catch: java.lang.Throwable -> L15
            r1.m3970(r2, r0)     // Catch: java.lang.Throwable -> L15
            r0.m2842()
            return
        L15:
            r2 = move-exception
            r0.m2842()
            throw r2
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: κ */
    public final boolean mo5439() {
            r0 = this;
            tb2 r0 = r0.f9826
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f10284
            boolean r0 = r0.f484
            return r0
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: λ */
    public final void mo5440(android.view.View r2) {
            r1 = this;
            tb2 r0 = r1.f9826
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f10284
            r0.setCustomView(r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f9825 = r0
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: μ */
    public final void mo5441(int r2) {
            r1 = this;
            tb2 r0 = r1.f9826
            android.content.Context r0 = r0.f10279
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.mo5442(r2)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ν */
    public final void mo5442(java.lang.CharSequence r1) {
            r0 = this;
            tb2 r0 = r0.f9826
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f10284
            r0.setSubtitle(r1)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ξ */
    public final void mo5443(int r2) {
            r1 = this;
            tb2 r0 = r1.f9826
            android.content.Context r0 = r0.f10279
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.mo5444(r2)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: ο */
    public final void mo5444(java.lang.CharSequence r1) {
            r0 = this;
            tb2 r0 = r0.f9826
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f10284
            r0.setTitle(r1)
            return
    }

    @Override // p000.AbstractC1153
    /* JADX INFO: renamed from: π */
    public final void mo5445(boolean r1) {
            r0 = this;
            r0.f13521 = r1
            tb2 r0 = r0.f9826
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f10284
            r0.setTitleOptional(r1)
            return
    }
}
