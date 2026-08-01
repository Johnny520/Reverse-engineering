package defpackage;

/* JADX INFO: renamed from: ᛵᛶᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0911 extends defpackage.AbstractC1503 implements defpackage.InterfaceC1739 {

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public int f4143;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public java.lang.CharSequence f4144;

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public defpackage.C0072 f4145;

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0616 f4146;

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public final android.graphics.Rect f4147;

    public C0911(defpackage.C0616 r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r1.f4146 = r2
            r0 = 1711538840(0x66040298, float:1.5585006E23)
            r1.<init>(r3, r4, r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.f4147 = r3
            r1.f6631 = r2
            r2 = 1
            r1.f6633 = r2
            ᛳᲇᲇᛲ r3 = r1.f6630
            r3.setFocusable(r2)
            ᛶᛷᛱᲇ r2 = new ᛶᛷᛱᲇ
            r3 = 0
            r2.<init>(r3, r1)
            r1.f6632 = r2
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final void mo1580(int r6, int r7) {
            r5 = this;
            ᛳᲇᲇᛲ r0 = r5.f6630
            boolean r1 = r0.isShowing()
            r5.m1880()
            r2 = 2
            r0.setInputMethodMode(r2)
            r5.show()
            ᛲᲈᲁᛸ r2 = r5.f6621
            r3 = 1
            r2.setChoiceMode(r3)
            defpackage.AbstractC0044.m384(r2, r6)
            defpackage.AbstractC0044.m385(r2, r7)
            ᛴᛱᲀᛸ r6 = r5.f4146
            int r7 = r6.getSelectedItemPosition()
            ᛲᲈᲁᛸ r2 = r5.f6621
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
            goto L55
        L3f:
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            if (r6 == 0) goto L55
            ᛴᲈᛶᛳ r7 = new ᛴᲈᛶᛳ
            r7.<init>(r3, r5)
            r6.addOnGlobalLayoutListener(r7)
            ᛳᛳᛴᛱ r6 = new ᛳᛳᛴᛱ
            r6.<init>(r5, r7)
            r0.setOnDismissListener(r6)
        L55:
            return
    }

    @Override // defpackage.AbstractC1503, defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public final void mo1581(android.widget.ListAdapter r1) {
            r0 = this;
            super.mo1581(r1)
            ᛱᛴᛴᛲ r1 = (defpackage.C0072) r1
            r0.f4145 = r1
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo1584(java.lang.CharSequence r1) {
            r0 = this;
            r0.f4144 = r1
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo1587(int r1) {
            r0 = this;
            r0.f4143 = r1
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.CharSequence mo1588() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f4144
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final void m1880() {
            r9 = this;
            ᛳᲇᲇᛲ r0 = r9.f6630
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            ᛴᛱᲀᛸ r2 = r9.f4146
            android.graphics.Rect r3 = r2.f3022
            if (r1 == 0) goto L1c
            r1.getPadding(r3)
            boolean r1 = defpackage.AbstractC1211.m2349(r2)
            if (r1 == 0) goto L18
            int r1 = r3.right
            goto L21
        L18:
            int r1 = r3.left
            int r1 = -r1
            goto L21
        L1c:
            r1 = 0
            r3.right = r1
            r3.left = r1
        L21:
            int r4 = r2.getPaddingLeft()
            int r5 = r2.getPaddingRight()
            int r6 = r2.getWidth()
            int r7 = r2.f3018
            r8 = -2
            if (r7 != r8) goto L5e
            ᛱᛴᛴᛲ r7 = r9.f4145
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            int r0 = r2.m1414(r7, r0)
            android.content.Context r7 = r2.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            int r8 = r3.left
            int r7 = r7 - r8
            int r3 = r3.right
            int r7 = r7 - r3
            if (r0 <= r7) goto L53
            r0 = r7
        L53:
            int r3 = r6 - r4
            int r3 = r3 - r5
            int r0 = java.lang.Math.max(r0, r3)
            r9.m2728(r0)
            goto L6b
        L5e:
            r0 = -1
            if (r7 != r0) goto L68
            int r0 = r6 - r4
            int r0 = r0 - r5
            r9.m2728(r0)
            goto L6b
        L68:
            r9.m2728(r7)
        L6b:
            boolean r0 = defpackage.AbstractC1211.m2349(r2)
            if (r0 == 0) goto L7a
            int r6 = r6 - r5
            int r0 = r9.f6637
            int r6 = r6 - r0
            int r0 = r9.f4143
            int r6 = r6 - r0
            int r6 = r6 + r1
            goto L7f
        L7a:
            int r0 = r9.f4143
            int r4 = r4 + r0
            int r6 = r4 + r1
        L7f:
            r9.f6613 = r6
            return
    }
}
