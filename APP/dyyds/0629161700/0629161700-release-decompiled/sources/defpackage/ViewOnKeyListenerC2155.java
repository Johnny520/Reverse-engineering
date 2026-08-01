package defpackage;

/* JADX INFO: renamed from: ᲇᲇᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC2155 extends defpackage.AbstractC1173 implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int f9155;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.ViewTreeObserverOnGlobalLayoutListenerC0799 f9156;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final defpackage.ViewOnAttachStateChangeListenerC0912 f9157;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int f9158;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public int f9159;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public int f9160;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public android.view.View f9161;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public boolean f9162;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.MenuC1701 f9163;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public android.widget.PopupWindow.OnDismissListener f9164;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.Context f9165;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public boolean f9166;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.C1912 f9167;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public android.view.View f9168;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public android.view.ViewTreeObserver f9169;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public boolean f9170;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1510 f9171;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public defpackage.InterfaceC1469 f9172;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean f9173;

    public ViewOnKeyListenerC2155(android.content.Context r4, defpackage.MenuC1701 r5, android.view.View r6, int r7, boolean r8) {
            r3 = this;
            r3.<init>()
            ᛴᲈᛶᛳ r0 = new ᛴᲈᛶᛳ
            r1 = 3
            r0.<init>(r1, r3)
            r3.f9156 = r0
            ᛵᛶᛵᛷ r0 = new ᛵᛶᛵᛷ
            r1 = 1
            r0.<init>(r1, r3)
            r3.f9157 = r0
            r0 = 0
            r3.f9159 = r0
            r3.f9165 = r4
            r3.f9163 = r5
            r3.f9173 = r8
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            ᛸᛶᛶᲀ r1 = new ᛸᛶᛶᲀ
            r2 = 1712062483(0x660c0013, float:1.6528317E23)
            r1.<init>(r5, r0, r8, r2)
            r3.f9171 = r1
            r3.f9158 = r7
            android.content.res.Resources r8 = r4.getResources()
            android.util.DisplayMetrics r0 = r8.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            r1 = 1711734807(0x66070017, float:1.5938028E23)
            int r8 = r8.getDimensionPixelSize(r1)
            int r8 = java.lang.Math.max(r0, r8)
            r3.f9155 = r8
            r3.f9168 = r6
            ᲁᲀᛷᛲ r6 = new ᲁᲀᛷᛲ
            r8 = 0
            r6.<init>(r4, r8, r7)
            r3.f9167 = r6
            r5.m3087(r3, r4)
            return
    }

    @Override // defpackage.InterfaceC2128
    public final void dismiss() {
            r1 = this;
            boolean r0 = r1.mo2605()
            if (r0 == 0) goto Lb
            ᲁᲀᛷᛲ r1 = r1.f9167
            r1.dismiss()
        Lb:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r2 = this;
            r0 = 1
            r2.f9170 = r0
            ᲀᛷᛱᲇ r1 = r2.f9163
            r1.m3082(r0)
            android.view.ViewTreeObserver r0 = r2.f9169
            if (r0 == 0) goto L24
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1a
            android.view.View r0 = r2.f9161
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.f9169 = r0
        L1a:
            android.view.ViewTreeObserver r0 = r2.f9169
            ᛴᲈᛶᛳ r1 = r2.f9156
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.f9169 = r0
        L24:
            android.view.View r0 = r2.f9161
            ᛵᛶᛵᛷ r1 = r2.f9157
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r2 = r2.f9164
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

    @Override // defpackage.InterfaceC2128
    public final void show() {
            r7 = this;
            boolean r0 = r7.mo2605()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.f9170
            if (r0 != 0) goto La9
            android.view.View r0 = r7.f9168
            if (r0 == 0) goto La9
            r7.f9161 = r0
            ᲁᲀᛷᛲ r0 = r7.f9167
            ᛳᲇᲇᛲ r1 = r0.f6630
            ᛳᲇᲇᛲ r2 = r0.f6630
            r1.setOnDismissListener(r7)
            r0.f6632 = r7
            r1 = 1
            r0.f6633 = r1
            r2.setFocusable(r1)
            android.view.View r3 = r7.f9161
            android.view.ViewTreeObserver r4 = r7.f9169
            r5 = 0
            if (r4 != 0) goto L2b
            r4 = r1
            goto L2c
        L2b:
            r4 = r5
        L2c:
            android.view.ViewTreeObserver r6 = r3.getViewTreeObserver()
            r7.f9169 = r6
            if (r4 == 0) goto L39
            ᛴᲈᛶᛳ r4 = r7.f9156
            r6.addOnGlobalLayoutListener(r4)
        L39:
            ᛵᛶᛵᛷ r4 = r7.f9157
            r3.addOnAttachStateChangeListener(r4)
            r0.f6631 = r3
            int r3 = r7.f9159
            r0.f6627 = r3
            boolean r3 = r7.f9162
            android.content.Context r4 = r7.f9165
            ᛸᛶᛶᲀ r6 = r7.f9171
            if (r3 != 0) goto L56
            int r3 = r7.f9155
            int r3 = defpackage.AbstractC1173.m2274(r6, r4, r3)
            r7.f9160 = r3
            r7.f9162 = r1
        L56:
            int r1 = r7.f9160
            r0.m2728(r1)
            r1 = 2
            r2.setInputMethodMode(r1)
            android.graphics.Rect r1 = r7.f5294
            r2 = 0
            if (r1 == 0) goto L6a
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1)
            goto L6b
        L6a:
            r3 = r2
        L6b:
            r0.f6636 = r3
            r0.show()
            ᛲᲈᲁᛸ r1 = r0.f6621
            r1.setOnKeyListener(r7)
            boolean r3 = r7.f9166
            if (r3 == 0) goto La2
            ᲀᛷᛱᲇ r7 = r7.f9163
            java.lang.CharSequence r3 = r7.f7566
            if (r3 == 0) goto La2
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r4)
            r4 = 1712062482(0x660c0012, float:1.6528315E23)
            android.view.View r3 = r3.inflate(r4, r1, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L9c
            java.lang.CharSequence r7 = r7.f7566
            r4.setText(r7)
        L9c:
            r3.setEnabled(r5)
            r1.addHeaderView(r3, r2, r5)
        La2:
            r0.mo1581(r6)
            r0.show()
            return
        La9:
            java.lang.String r7 = "StandardMenuPopup cannot be used without an anchor"
            defpackage.C2264.m3676(r7)
            return
    }

    @Override // defpackage.InterfaceC2128
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final defpackage.C0398 mo2603() {
            r0 = this;
            ᲁᲀᛷᛲ r0 = r0.f9167
            ᛲᲈᲁᛸ r0 = r0.f6621
            return r0
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo2275(defpackage.MenuC1701 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final boolean mo849(defpackage.SubMenuC1502 r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L8f
            ᲁᲀᛳᲈ r2 = new ᲁᲀᛳᲈ
            android.view.View r5 = r9.f9161
            int r7 = r9.f9158
            r8 = 0
            android.content.Context r3 = r9.f9165
            boolean r6 = r9.f9173
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            ᛸᛴᛲᛶ r10 = r9.f9172
            r2.f8271 = r10
            ᛶᲇᲀᛵ r0 = r2.f8273
            if (r0 == 0) goto L21
            r0.mo851(r10)
        L21:
            java.util.ArrayList r10 = r4.f7560
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
            r2.f8281 = r10
            ᛶᲇᲀᛵ r0 = r2.f8273
            if (r0 == 0) goto L4a
            r0.mo2279(r10)
        L4a:
            android.widget.PopupWindow$OnDismissListener r10 = r9.f9164
            r2.f8278 = r10
            r10 = 0
            r9.f9164 = r10
            ᲀᛷᛱᲇ r10 = r9.f9163
            r10.m3082(r1)
            ᲁᲀᛷᛲ r10 = r9.f9167
            int r0 = r10.f6613
            int r10 = r10.m2726()
            int r5 = r9.f9159
            android.view.View r6 = r9.f9168
            java.util.WeakHashMap r7 = defpackage.AbstractC0858.f3911
            int r6 = r6.getLayoutDirection()
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r5 = r5 & 7
            r6 = 5
            if (r5 != r6) goto L78
            android.view.View r5 = r9.f9168
            int r5 = r5.getWidth()
            int r0 = r0 + r5
        L78:
            boolean r5 = r2.m3339()
            if (r5 == 0) goto L7f
            goto L87
        L7f:
            android.view.View r5 = r2.f8274
            if (r5 != 0) goto L84
            goto L8f
        L84:
            r2.m3337(r0, r10, r3, r3)
        L87:
            ᛸᛴᛲᛶ r9 = r9.f9172
            if (r9 == 0) goto L8e
            r9.mo2546(r4)
        L8e:
            return r3
        L8f:
            return r1
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public final void mo2276(int r1) {
            r0 = this;
            r0.f9159 = r1
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public final void mo2277(int r1) {
            r0 = this;
            ᲁᲀᛷᛲ r0 = r0.f9167
            r0.m2730(r1)
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo2278(android.view.View r1) {
            r0 = this;
            r0.f9168 = r1
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo851(defpackage.InterfaceC1469 r1) {
            r0 = this;
            r0.f9172 = r1
            return
    }

    @Override // defpackage.InterfaceC2128
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo2605() {
            r1 = this;
            boolean r0 = r1.f9170
            if (r0 != 0) goto L10
            ᲁᲀᛷᛲ r1 = r1.f9167
            ᛳᲇᲇᛲ r1 = r1.f6630
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final boolean mo853() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final void mo2279(boolean r1) {
            r0 = this;
            ᛸᛶᛶᲀ r0 = r0.f9171
            r0.f6672 = r1
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public final void mo2280(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f9164 = r1
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ */
    public final void mo2281(boolean r1) {
            r0 = this;
            r0.f9166 = r1
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo854(defpackage.MenuC1701 r2, boolean r3) {
            r1 = this;
            ᲀᛷᛱᲇ r0 = r1.f9163
            if (r2 == r0) goto L5
            goto Lf
        L5:
            r1.dismiss()
            ᛸᛴᛲᛶ r1 = r1.f9172
            if (r1 == 0) goto Lf
            r1.mo2547(r2, r3)
        Lf:
            return
    }

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo855() {
            r1 = this;
            r0 = 0
            r1.f9162 = r0
            ᛸᛶᛶᲀ r1 = r1.f9171
            if (r1 == 0) goto La
            r1.notifyDataSetChanged()
        La:
            return
    }

    @Override // defpackage.AbstractC1173
    /* JADX INFO: renamed from: ᲇᲀᛲᛱ */
    public final void mo2282(int r1) {
            r0 = this;
            ᲁᲀᛷᛲ r0 = r0.f9167
            r0.f6613 = r1
            return
    }
}
