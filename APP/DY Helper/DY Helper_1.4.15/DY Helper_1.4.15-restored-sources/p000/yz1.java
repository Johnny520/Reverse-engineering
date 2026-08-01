package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yz1 extends p000.oz0 implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {

    /* JADX INFO: renamed from: ζ */
    public final android.content.Context f12893;

    /* JADX INFO: renamed from: η */
    public final p000.iz0 f12894;

    /* JADX INFO: renamed from: θ */
    public final p000.fz0 f12895;

    /* JADX INFO: renamed from: ι */
    public final boolean f12896;

    /* JADX INFO: renamed from: κ */
    public final int f12897;

    /* JADX INFO: renamed from: λ */
    public final int f12898;

    /* JADX INFO: renamed from: μ */
    public final androidx.appcompat.widget.C0036 f12899;

    /* JADX INFO: renamed from: ν */
    public final p000.ViewTreeObserverOnGlobalLayoutListenerC0194d f12900;

    /* JADX INFO: renamed from: ξ */
    public final p000.ViewOnAttachStateChangeListenerC0454k2 f12901;

    /* JADX INFO: renamed from: ο */
    public android.widget.PopupWindow.OnDismissListener f12902;

    /* JADX INFO: renamed from: π */
    public android.view.View f12903;

    /* JADX INFO: renamed from: ρ */
    public android.view.View f12904;

    /* JADX INFO: renamed from: σ */
    public p000.tz0 f12905;

    /* JADX INFO: renamed from: τ */
    public android.view.ViewTreeObserver f12906;

    /* JADX INFO: renamed from: υ */
    public boolean f12907;

    /* JADX INFO: renamed from: φ */
    public boolean f12908;

    /* JADX INFO: renamed from: χ */
    public int f12909;

    /* JADX INFO: renamed from: ψ */
    public int f12910;

    /* JADX INFO: renamed from: ω */
    public boolean f12911;

    public yz1(android.content.Context r5, p000.iz0 r6, android.view.View r7, int r8, boolean r9) {
            r4 = this;
            r4.<init>()
            d r0 = new d
            r1 = 4
            r0.<init>(r1, r4)
            r4.f12900 = r0
            k2 r0 = new k2
            r0.<init>(r1, r4)
            r4.f12901 = r0
            r0 = 0
            r4.f12910 = r0
            r4.f12893 = r5
            r4.f12894 = r6
            r4.f12896 = r9
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            fz0 r2 = new fz0
            r3 = 2131492883(0x7f0c0013, float:1.860923E38)
            r2.<init>(r6, r1, r9, r3)
            r4.f12895 = r2
            r4.f12898 = r8
            android.content.res.Resources r9 = r5.getResources()
            android.util.DisplayMetrics r1 = r9.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 / 2
            r2 = 2131165207(0x7f070017, float:1.7944625E38)
            int r9 = r9.getDimensionPixelSize(r2)
            int r9 = java.lang.Math.max(r1, r9)
            r4.f12897 = r9
            r4.f12903 = r7
            androidx.appcompat.widget.ι r7 = new androidx.appcompat.widget.ι
            r9 = 0
            r7.<init>(r5, r9, r8, r0)
            r4.f12899 = r7
            r6.m2830(r4, r5)
            return
    }

    @Override // p000.ew1
    public final void dismiss() {
            r1 = this;
            boolean r0 = r1.mo340()
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.ι r1 = r1.f12899
            r1.dismiss()
        Lb:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r2 = this;
            r0 = 1
            r2.f12907 = r0
            iz0 r1 = r2.f12894
            r1.m2831(r0)
            android.view.ViewTreeObserver r0 = r2.f12906
            if (r0 == 0) goto L24
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1a
            android.view.View r0 = r2.f12904
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.f12906 = r0
        L1a:
            android.view.ViewTreeObserver r0 = r2.f12906
            d r1 = r2.f12900
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.f12906 = r0
        L24:
            android.view.View r0 = r2.f12904
            k2 r1 = r2.f12901
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r2 = r2.f12902
            if (r2 == 0) goto L32
            r2.onDismiss()
        L32:
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r0 = 0
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: α */
    public final void mo320(p000.iz0 r2, boolean r3) {
            r1 = this;
            iz0 r0 = r1.f12894
            if (r2 == r0) goto L5
            goto Lf
        L5:
            r1.dismiss()
            tz0 r1 = r1.f12905
            if (r1 == 0) goto Lf
            r1.mo3078(r2, r3)
        Lf:
            return
    }

    @Override // p000.ew1
    /* JADX INFO: renamed from: β */
    public final boolean mo340() {
            r1 = this;
            boolean r0 = r1.f12907
            if (r0 != 0) goto L10
            androidx.appcompat.widget.ι r1 = r1.f12899
            m5 r1 = r1.f831
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // p000.ew1
    /* JADX INFO: renamed from: δ */
    public final void mo342() {
            r7 = this;
            boolean r0 = r7.mo340()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.f12907
            if (r0 != 0) goto La9
            android.view.View r0 = r7.f12903
            if (r0 == 0) goto La9
            r7.f12904 = r0
            androidx.appcompat.widget.ι r0 = r7.f12899
            m5 r1 = r0.f831
            m5 r2 = r0.f831
            r1.setOnDismissListener(r7)
            r0.f847 = r7
            r1 = 1
            r0.f830 = r1
            r2.setFocusable(r1)
            android.view.View r3 = r7.f12904
            android.view.ViewTreeObserver r4 = r7.f12906
            r5 = 0
            if (r4 != 0) goto L2b
            r4 = r1
            goto L2c
        L2b:
            r4 = r5
        L2c:
            android.view.ViewTreeObserver r6 = r3.getViewTreeObserver()
            r7.f12906 = r6
            if (r4 == 0) goto L39
            d r4 = r7.f12900
            r6.addOnGlobalLayoutListener(r4)
        L39:
            k2 r4 = r7.f12901
            r3.addOnAttachStateChangeListener(r4)
            r0.f846 = r3
            int r3 = r7.f12910
            r0.f843 = r3
            boolean r3 = r7.f12908
            android.content.Context r4 = r7.f12893
            fz0 r6 = r7.f12895
            if (r3 != 0) goto L56
            int r3 = r7.f12897
            int r3 = p000.oz0.m4337(r6, r4, r3)
            r7.f12909 = r3
            r7.f12908 = r1
        L56:
            int r1 = r7.f12909
            r0.m349(r1)
            r1 = 2
            r2.setInputMethodMode(r1)
            android.graphics.Rect r1 = r7.f8360
            r2 = 0
            if (r1 == 0) goto L6a
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1)
            goto L6b
        L6a:
            r3 = r2
        L6b:
            r0.f829 = r3
            r0.mo342()
            androidx.appcompat.widget.DropDownListView r1 = r0.f834
            r1.setOnKeyListener(r7)
            boolean r3 = r7.f12911
            if (r3 == 0) goto La2
            iz0 r7 = r7.f12894
            java.lang.CharSequence r3 = r7.f5263
            if (r3 == 0) goto La2
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r4)
            r4 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r3 = r3.inflate(r4, r1, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L9c
            java.lang.CharSequence r7 = r7.f5263
            r4.setText(r7)
        L9c:
            r3.setEnabled(r5)
            r1.addHeaderView(r3, r2, r5)
        La2:
            r0.mo336(r6)
            r0.mo342()
            return
        La9:
            java.lang.String r7 = "StandardMenuPopup cannot be used without an anchor"
            p000.C1080.m7279(r7)
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ε */
    public final void mo324(p000.tz0 r1) {
            r0 = this;
            r0.f12905 = r1
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: η */
    public final void mo326() {
            r1 = this;
            r0 = 0
            r1.f12908 = r0
            fz0 r1 = r1.f12895
            if (r1 == 0) goto La
            r1.notifyDataSetChanged()
        La:
            return
    }

    @Override // p000.ew1
    /* JADX INFO: renamed from: θ */
    public final android.widget.ListView mo344() {
            r0 = this;
            androidx.appcompat.widget.ι r0 = r0.f12899
            androidx.appcompat.widget.DropDownListView r0 = r0.f834
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: κ */
    public final boolean mo329(p000.b12 r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L8d
            qz0 r2 = new qz0
            android.view.View r5 = r9.f12904
            int r7 = r9.f12898
            r8 = 0
            android.content.Context r3 = r9.f12893
            boolean r6 = r9.f12896
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            tz0 r10 = r9.f12905
            r2.f9170 = r10
            oz0 r0 = r2.f9171
            if (r0 == 0) goto L21
            r0.mo324(r10)
        L21:
            java.util.ArrayList r10 = r4.f5256
            int r10 = r10.size()
            r0 = r1
        L28:
            r3 = 1
            if (r0 >= r10) goto L40
            android.view.MenuItem r5 = r4.getItem(r0)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L3d
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L3d
            r10 = r3
            goto L41
        L3d:
            int r0 = r0 + 1
            goto L28
        L40:
            r10 = r1
        L41:
            r2.f9169 = r10
            oz0 r0 = r2.f9171
            if (r0 == 0) goto L4a
            r0.mo2747(r10)
        L4a:
            android.widget.PopupWindow$OnDismissListener r10 = r9.f12902
            r2.f9172 = r10
            r10 = 0
            r9.f12902 = r10
            iz0 r10 = r9.f12894
            r10.m2831(r1)
            androidx.appcompat.widget.ι r10 = r9.f12899
            int r0 = r10.f837
            int r10 = r10.m348()
            int r5 = r9.f12910
            android.view.View r6 = r9.f12903
            int r6 = r6.getLayoutDirection()
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r5 = r5 & 7
            r6 = 5
            if (r5 != r6) goto L76
            android.view.View r5 = r9.f12903
            int r5 = r5.getWidth()
            int r0 = r0 + r5
        L76:
            boolean r5 = r2.m5039()
            if (r5 == 0) goto L7d
            goto L85
        L7d:
            android.view.View r5 = r2.f9167
            if (r5 != 0) goto L82
            goto L8d
        L82:
            r2.m5041(r0, r10, r3, r3)
        L85:
            tz0 r9 = r9.f12905
            if (r9 == 0) goto L8c
            r9.mo3079(r4)
        L8c:
            return r3
        L8d:
            return r1
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: λ */
    public final boolean mo330() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: μ */
    public final void mo2745(p000.iz0 r1) {
            r0 = this;
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: ξ */
    public final void mo2746(android.view.View r1) {
            r0 = this;
            r0.f12903 = r1
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: ο */
    public final void mo2747(boolean r1) {
            r0 = this;
            fz0 r0 = r0.f12895
            r0.f4176 = r1
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: π */
    public final void mo2748(int r1) {
            r0 = this;
            r0.f12910 = r1
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: ρ */
    public final void mo2749(int r1) {
            r0 = this;
            androidx.appcompat.widget.ι r0 = r0.f12899
            r0.f837 = r1
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: σ */
    public final void mo2750(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f12902 = r1
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: τ */
    public final void mo2751(boolean r1) {
            r0 = this;
            r0.f12911 = r1
            return
    }

    @Override // p000.oz0
    /* JADX INFO: renamed from: υ */
    public final void mo2752(int r1) {
            r0 = this;
            androidx.appcompat.widget.ι r0 = r0.f12899
            r0.m346(r1)
            return
    }
}
