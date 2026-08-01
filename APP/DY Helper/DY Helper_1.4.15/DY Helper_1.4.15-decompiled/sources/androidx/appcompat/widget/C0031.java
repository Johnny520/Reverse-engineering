package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.δ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0031 extends androidx.appcompat.widget.C0035 implements p000.InterfaceC0972x5 {

    /* JADX INFO: renamed from: Ζ */
    public java.lang.CharSequence f810;

    /* JADX INFO: renamed from: Η */
    public p000.C0823t5 f811;

    /* JADX INFO: renamed from: Θ */
    public final android.graphics.Rect f812;

    /* JADX INFO: renamed from: Ι */
    public int f813;

    /* JADX INFO: renamed from: Κ */
    public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner f814;

    public C0031(androidx.appcompat.widget.AppCompatSpinner r2, android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r1 = this;
            r1.f814 = r2
            r0 = 0
            r1.<init>(r3, r4, r5, r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f812 = r3
            r1.f846 = r2
            r2 = 1
            r1.f830 = r2
            m5 r3 = r1.f831
            r3.setFocusable(r2)
            u5 r2 = new u5
            r3 = 0
            r2.<init>(r3, r1)
            r1.f847 = r2
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: η */
    public final void mo332(java.lang.CharSequence r1) {
            r0 = this;
            r0.f810 = r1
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: μ */
    public final void mo333(int r1) {
            r0 = this;
            r0.f813 = r1
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: ξ */
    public final void mo334(int r6, int r7) {
            r5 = this;
            m5 r0 = r5.f831
            boolean r1 = r0.isShowing()
            r5.m337()
            r2 = 2
            r0.setInputMethodMode(r2)
            r5.mo342()
            androidx.appcompat.widget.DropDownListView r2 = r5.f834
            r3 = 1
            r2.setChoiceMode(r3)
            r2.setTextDirection(r6)
            r2.setTextAlignment(r7)
            androidx.appcompat.widget.AppCompatSpinner r6 = r5.f814
            int r7 = r6.getSelectedItemPosition()
            androidx.appcompat.widget.DropDownListView r2 = r5.f834
            boolean r4 = r0.isShowing()
            if (r4 == 0) goto L3c
            if (r2 == 0) goto L3c
            r4 = 0
            r2.setListSelectionHidden(r4)
            r2.setSelection(r7)
            int r4 = r2.getChoiceMode()
            if (r4 == 0) goto L3c
            r2.setItemChecked(r7, r3)
        L3c:
            if (r1 == 0) goto L3f
            goto L56
        L3f:
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            if (r6 == 0) goto L56
            d r7 = new d
            r1 = 2
            r7.<init>(r1, r5)
            r6.addOnGlobalLayoutListener(r7)
            v5 r6 = new v5
            r6.<init>(r5, r7)
            r0.setOnDismissListener(r6)
        L56:
            return
    }

    @Override // p000.InterfaceC0972x5
    /* JADX INFO: renamed from: π */
    public final java.lang.CharSequence mo335() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f810
            return r0
    }

    @Override // androidx.appcompat.widget.C0035, p000.InterfaceC0972x5
    /* JADX INFO: renamed from: ρ */
    public final void mo336(android.widget.ListAdapter r1) {
            r0 = this;
            super.mo336(r1)
            t5 r1 = (p000.C0823t5) r1
            r0.f811 = r1
            return
    }

    /* JADX INFO: renamed from: τ */
    public final void m337() {
            r10 = this;
            m5 r0 = r10.f831
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            androidx.appcompat.widget.AppCompatSpinner r2 = r10.f814
            android.graphics.Rect r3 = r2.f585
            r4 = 1
            if (r1 == 0) goto L1d
            r1.getPadding(r3)
            int r1 = r2.getLayoutDirection()
            if (r1 != r4) goto L19
            int r1 = r3.right
            goto L22
        L19:
            int r1 = r3.left
            int r1 = -r1
            goto L22
        L1d:
            r1 = 0
            r3.right = r1
            r3.left = r1
        L22:
            int r5 = r2.getPaddingLeft()
            int r6 = r2.getPaddingRight()
            int r7 = r2.getWidth()
            int r8 = r2.f584
            r9 = -2
            if (r8 != r9) goto L5f
            t5 r8 = r10.f811
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            int r0 = r2.m271(r8, r0)
            android.content.Context r8 = r2.getContext()
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r8 = r8.widthPixels
            int r9 = r3.left
            int r8 = r8 - r9
            int r3 = r3.right
            int r8 = r8 - r3
            if (r0 <= r8) goto L54
            r0 = r8
        L54:
            int r3 = r7 - r5
            int r3 = r3 - r6
            int r0 = java.lang.Math.max(r0, r3)
            r10.m349(r0)
            goto L6c
        L5f:
            r0 = -1
            if (r8 != r0) goto L69
            int r0 = r7 - r5
            int r0 = r0 - r6
            r10.m349(r0)
            goto L6c
        L69:
            r10.m349(r8)
        L6c:
            int r0 = r2.getLayoutDirection()
            if (r0 != r4) goto L7b
            int r7 = r7 - r6
            int r0 = r10.f836
            int r7 = r7 - r0
            int r0 = r10.f813
            int r7 = r7 - r0
            int r7 = r7 + r1
            goto L80
        L7b:
            int r0 = r10.f813
            int r5 = r5 + r0
            int r7 = r5 + r1
        L80:
            r10.f837 = r7
            return
    }
}
