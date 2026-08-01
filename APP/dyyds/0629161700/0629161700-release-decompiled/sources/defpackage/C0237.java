package defpackage;

/* JADX INFO: renamed from: ᛲᛱᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0237 extends android.view.ActionMode {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f1421;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC1115 f1422;

    public C0237(android.content.Context r1, defpackage.AbstractC1115 r2) {
            r0 = this;
            r0.<init>()
            r0.f1421 = r1
            r0.f1422 = r2
            return
    }

    @Override // android.view.ActionMode
    public final void finish() {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            r0.mo2071()
            return
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            android.view.View r0 = r0.mo2074()
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
            r2 = this;
            ᲀᲁᛲᛸ r0 = new ᲀᲁᛲᛸ
            ᛶᛷᛸᲈ r1 = r2.f1422
            ᲀᛷᛱᲇ r1 = r1.mo2070()
            android.content.Context r2 = r2.f1421
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            android.view.MenuInflater r0 = r0.mo2069()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            java.lang.CharSequence r0 = r0.mo2075()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            java.lang.Object r0 = r0.f4988
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            java.lang.CharSequence r0 = r0.mo2076()
            return r0
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            boolean r0 = r0.f4987
            return r0
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            r0.mo2063()
            return
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            boolean r0 = r0.mo2066()
            return r0
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View r1) {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            r0.mo2072(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int r1) {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            r0.mo2064(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            r0.mo2065(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object r1) {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            r0.f4988 = r1
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(int r1) {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            r0.mo2068(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            r0.mo2073(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean r1) {
            r0 = this;
            ᛶᛷᛸᲈ r0 = r0.f1422
            r0.mo2067(r1)
            return
    }
}
