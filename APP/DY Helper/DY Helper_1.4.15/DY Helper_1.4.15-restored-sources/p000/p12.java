package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p12 extends android.view.ActionMode {

    /* JADX INFO: renamed from: α */
    public final android.content.Context f8393;

    /* JADX INFO: renamed from: β */
    public final p000.AbstractC1153 f8394;

    public p12(android.content.Context r1, p000.AbstractC1153 r2) {
            r0 = this;
            r0.<init>()
            r0.f8393 = r1
            r0.f8394 = r2
            return
    }

    @Override // android.view.ActionMode
    public final void finish() {
            r0 = this;
            ｗ r0 = r0.f8394
            r0.mo5432()
            return
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
            r0 = this;
            ｗ r0 = r0.f8394
            android.view.View r0 = r0.mo5433()
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
            r2 = this;
            xz0 r0 = new xz0
            ｗ r1 = r2.f8394
            iz0 r1 = r1.mo5434()
            android.content.Context r2 = r2.f8393
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
            r0 = this;
            ｗ r0 = r0.f8394
            android.view.MenuInflater r0 = r0.mo5435()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
            r0 = this;
            ｗ r0 = r0.f8394
            java.lang.CharSequence r0 = r0.mo5436()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
            r0 = this;
            ｗ r0 = r0.f8394
            java.lang.Object r0 = r0.f13520
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
            r0 = this;
            ｗ r0 = r0.f8394
            java.lang.CharSequence r0 = r0.mo5437()
            return r0
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
            r0 = this;
            ｗ r0 = r0.f8394
            boolean r0 = r0.f13521
            return r0
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
            r0 = this;
            ｗ r0 = r0.f8394
            r0.mo5438()
            return
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
            r0 = this;
            ｗ r0 = r0.f8394
            boolean r0 = r0.mo5439()
            return r0
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View r1) {
            r0 = this;
            ｗ r0 = r0.f8394
            r0.mo5440(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int r1) {
            r0 = this;
            ｗ r0 = r0.f8394
            r0.mo5441(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            ｗ r0 = r0.f8394
            r0.mo5442(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object r1) {
            r0 = this;
            ｗ r0 = r0.f8394
            r0.f13520 = r1
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(int r1) {
            r0 = this;
            ｗ r0 = r0.f8394
            r0.mo5443(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            ｗ r0 = r0.f8394
            r0.mo5444(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean r1) {
            r0 = this;
            ｗ r0 = r0.f8394
            r0.mo5445(r1)
            return
    }
}
