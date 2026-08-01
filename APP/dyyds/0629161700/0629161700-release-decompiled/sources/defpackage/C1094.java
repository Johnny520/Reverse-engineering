package defpackage;

/* JADX INFO: renamed from: ᛶᛶᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1094 extends defpackage.AbstractC1115 implements defpackage.InterfaceC0510 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f4891;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f4892;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.content.Context f4893;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.MenuC1701 f4894;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public androidx.appcompat.widget.ActionBarContextView f4895;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0682 f4896;

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void mo2063() {
            r2 = this;
            ᛴᛵᲇᲇ r0 = r2.f4896
            ᲀᛷᛱᲇ r1 = r2.f4894
            r0.m1562(r2, r1)
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void mo2064(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f4893
            java.lang.String r2 = r0.getString(r2)
            r1.mo2065(r2)
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void mo2065(java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f4895
            r0.setSubtitle(r1)
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean mo2066() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f4895
            boolean r0 = r0.f59
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final void mo2067(boolean r1) {
            r0 = this;
            r0.f4987 = r1
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f4895
            r0.setTitleOptional(r1)
            return
    }

    @Override // defpackage.InterfaceC0510
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo1300(defpackage.MenuC1701 r1, android.view.MenuItem r2) {
            r0 = this;
            ᛴᛵᲇᲇ r1 = r0.f4896
            java.lang.Object r1 = r1.f3286
            ᛲᛶᛲᲁ r1 = (defpackage.C0302) r1
            boolean r0 = r1.m959(r0, r2)
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final void mo2068(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f4893
            java.lang.String r2 = r0.getString(r2)
            r1.mo2073(r2)
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.view.MenuInflater mo2069() {
            r1 = this;
            ᛴᛳᛴᛳ r0 = new ᛴᛳᛴᛳ
            androidx.appcompat.widget.ActionBarContextView r1 = r1.f4895
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.MenuC1701 mo2070() {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f4894
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo2071() {
            r1 = this;
            boolean r0 = r1.f4892
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f4892 = r0
            ᛴᛵᲇᲇ r0 = r1.f4896
            r0.m1565(r1)
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void mo2072(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f4895
            r0.setCustomView(r2)
            if (r2 == 0) goto Ld
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.f4891 = r0
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final void mo2073(java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f4895
            r0.setTitle(r1)
            return
    }

    @Override // defpackage.InterfaceC0510
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public final void mo1301(defpackage.MenuC1701 r1) {
            r0 = this;
            r0.mo2063()
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f4895
            ᲁᲀᛴᛷ r0 = r0.f72
            if (r0 == 0) goto Lc
            r0.m3342()
        Lc:
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.view.View mo2074() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f4891
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.CharSequence mo2075() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f4895
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.CharSequence mo2076() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f4895
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }
}
