package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ι */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0036 extends androidx.appcompat.widget.C0035 implements p000.kz0 {

    /* JADX INFO: renamed from: Ζ */
    public p000.C0568n f852;

    @Override // androidx.appcompat.widget.C0035
    /* JADX INFO: renamed from: α */
    public final androidx.appcompat.widget.DropDownListView mo339(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView r0 = new androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }

    @Override // p000.kz0
    /* JADX INFO: renamed from: ζ */
    public final void mo350(p000.iz0 r1, android.view.MenuItem r2) {
            r0 = this;
            n r0 = r0.f852
            if (r0 == 0) goto L7
            r0.mo350(r1, r2)
        L7:
            return
    }

    @Override // p000.kz0
    /* JADX INFO: renamed from: κ */
    public final void mo351(p000.iz0 r1, p000.lz0 r2) {
            r0 = this;
            n r0 = r0.f852
            if (r0 == 0) goto L7
            r0.mo351(r1, r2)
        L7:
            return
    }
}
