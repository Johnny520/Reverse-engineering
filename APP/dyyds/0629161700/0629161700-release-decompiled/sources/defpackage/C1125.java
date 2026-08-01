package defpackage;

/* JADX INFO: renamed from: ᛶᛸᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1125 extends defpackage.AbstractC1115 implements defpackage.InterfaceC0510 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f5008;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C2010 f5009;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final android.content.Context f5010;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.MenuC1701 f5011;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0682 f5012;

    public C1125(defpackage.C2010 r1, android.content.Context r2, defpackage.C0682 r3) {
            r0 = this;
            r0.<init>()
            r0.f5009 = r1
            r0.f5010 = r2
            r0.f5012 = r3
            ᲀᛷᛱᲇ r1 = new ᲀᛷᛱᲇ
            r1.<init>(r2)
            r2 = 1
            r1.f7574 = r2
            r0.f5011 = r1
            r1.f7583 = r0
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final void mo2063() {
            r2 = this;
            ᲇᛲᲇᲁ r0 = r2.f5009
            ᛶᛸᛴᲇ r0 = r0.f8673
            if (r0 == r2) goto L7
            return
        L7:
            ᲀᛷᛱᲇ r0 = r2.f5011
            r0.m3084()
            ᛴᛵᲇᲇ r1 = r2.f5012     // Catch: java.lang.Throwable -> L15
            r1.m1562(r2, r0)     // Catch: java.lang.Throwable -> L15
            r0.m3081()
            return
        L15:
            r2 = move-exception
            r0.m3081()
            throw r2
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo2064(int r2) {
            r1 = this;
            ᲇᛲᲇᲁ r0 = r1.f5009
            android.content.Context r0 = r0.f8683
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.mo2065(r2)
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final void mo2065(java.lang.CharSequence r1) {
            r0 = this;
            ᲇᛲᲇᲁ r0 = r0.f5009
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8691
            r0.setSubtitle(r1)
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final boolean mo2066() {
            r0 = this;
            ᲇᛲᲇᲁ r0 = r0.f5009
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8691
            boolean r0 = r0.f59
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public final void mo2067(boolean r1) {
            r0 = this;
            r0.f4987 = r1
            ᲇᛲᲇᲁ r0 = r0.f5009
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8691
            r0.setTitleOptional(r1)
            return
    }

    @Override // defpackage.InterfaceC0510
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo1300(defpackage.MenuC1701 r1, android.view.MenuItem r2) {
            r0 = this;
            ᛴᛵᲇᲇ r1 = r0.f5012
            if (r1 == 0) goto Ld
            java.lang.Object r1 = r1.f3286
            ᛲᛶᛲᲁ r1 = (defpackage.C0302) r1
            boolean r0 = r1.m959(r0, r2)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo2068(int r2) {
            r1 = this;
            ᲇᛲᲇᲁ r0 = r1.f5009
            android.content.Context r0 = r0.f8683
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.mo2073(r2)
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final android.view.MenuInflater mo2069() {
            r1 = this;
            ᛴᛳᛴᛳ r0 = new ᛴᛳᛴᛳ
            android.content.Context r1 = r1.f5010
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final defpackage.MenuC1701 mo2070() {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f5011
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo2071() {
            r3 = this;
            ᲇᛲᲇᲁ r0 = r3.f5009
            ᛶᛸᛴᲇ r1 = r0.f8673
            if (r1 == r3) goto L7
            return
        L7:
            boolean r1 = r0.f8692
            if (r1 == 0) goto L12
            r0.f8684 = r3
            ᛴᛵᲇᲇ r1 = r3.f5012
            r0.f8671 = r1
            goto L17
        L12:
            ᛴᛵᲇᲇ r1 = r3.f5012
            r1.m1565(r3)
        L17:
            r1 = 0
            r3.f5012 = r1
            r3 = 0
            r0.m3401(r3)
            androidx.appcompat.widget.ActionBarContextView r3 = r0.f8691
            android.view.View r2 = r3.f64
            if (r2 != 0) goto L27
            r3.m24()
        L27:
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r0.f8682
            boolean r2 = r0.f8674
            r3.setHideOnContentScrollEnabled(r2)
            r0.f8673 = r1
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo2072(android.view.View r2) {
            r1 = this;
            ᲇᛲᲇᲁ r0 = r1.f5009
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8691
            r0.setCustomView(r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f5008 = r0
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final void mo2073(java.lang.CharSequence r1) {
            r0 = this;
            ᲇᛲᲇᲁ r0 = r0.f5009
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8691
            r0.setTitle(r1)
            return
    }

    @Override // defpackage.InterfaceC0510
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public final void mo1301(defpackage.MenuC1701 r1) {
            r0 = this;
            ᛴᛵᲇᲇ r1 = r0.f5012
            if (r1 != 0) goto L5
            goto L13
        L5:
            r0.mo2063()
            ᲇᛲᲇᲁ r0 = r0.f5009
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8691
            ᲁᲀᛴᛷ r0 = r0.f72
            if (r0 == 0) goto L13
            r0.m3342()
        L13:
            return
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final android.view.View mo2074() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f5008
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final java.lang.CharSequence mo2075() {
            r0 = this;
            ᲇᛲᲇᲁ r0 = r0.f5009
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8691
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // defpackage.AbstractC1115
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final java.lang.CharSequence mo2076() {
            r0 = this;
            ᲇᛲᲇᲁ r0 = r0.f5009
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8691
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }
}
