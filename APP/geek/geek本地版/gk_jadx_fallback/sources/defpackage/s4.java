package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends defpackage.kr implements defpackage.u4 {
    public java.lang.CharSequence C;
    public defpackage.p4 D;
    public final android.graphics.Rect E;
    public int F;
    public final /* synthetic */ defpackage.v4 G;

    public s4(defpackage.v4 r3, android.content.Context r4, android.util.AttributeSet r5) {
            r2 = this;
            r2.G = r3
            r0 = 0
            r1 = 2130969498(0x7f04039a, float:1.754768E38)
            r2.<init>(r4, r5, r1, r0)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r2.E = r4
            r2.o = r3
            r3 = 1
            r2.y = r3
            c4 r4 = r2.z
            r4.setFocusable(r3)
            q4 r3 = new q4
            r4 = 0
            r3.<init>(r4, r2)
            r2.p = r3
            return
    }

    @Override // defpackage.u4
    public final void e(int r6, int r7) {
            r5 = this;
            c4 r0 = r5.z
            boolean r1 = r0.isShowing()
            r5.s()
            r2 = 2
            r0.setInputMethodMode(r2)
            r5.f()
            kh r2 = r5.c
            r3 = 1
            r2.setChoiceMode(r3)
            defpackage.m4.d(r2, r6)
            defpackage.m4.c(r2, r7)
            v4 r6 = r5.G
            int r7 = r6.getSelectedItemPosition()
            kh r2 = r5.c
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
            k4 r7 = new k4
            r1 = 1
            r7.<init>(r1, r5)
            r6.addOnGlobalLayoutListener(r7)
            r4 r6 = new r4
            r6.<init>(r5, r7)
            r0.setOnDismissListener(r6)
        L56:
            return
    }

    @Override // defpackage.u4
    public final java.lang.CharSequence i() {
            r1 = this;
            java.lang.CharSequence r0 = r1.C
            return r0
    }

    @Override // defpackage.u4
    public final void k(java.lang.CharSequence r1) {
            r0 = this;
            r0.C = r1
            return
    }

    @Override // defpackage.kr, defpackage.u4
    public final void n(android.widget.ListAdapter r1) {
            r0 = this;
            super.n(r1)
            p4 r1 = (defpackage.p4) r1
            r0.D = r1
            return
    }

    @Override // defpackage.u4
    public final void o(int r1) {
            r0 = this;
            r0.F = r1
            return
    }

    public final void s() {
            r9 = this;
            v4 r0 = r9.G
            android.graphics.Rect r1 = r0.h
            c4 r2 = r9.z
            android.graphics.drawable.Drawable r3 = r2.getBackground()
            if (r3 == 0) goto L1c
            r3.getPadding(r1)
            boolean r3 = defpackage.cb0.a(r0)
            if (r3 == 0) goto L18
            int r3 = r1.right
            goto L21
        L18:
            int r3 = r1.left
            int r3 = -r3
            goto L21
        L1c:
            r3 = 0
            r1.right = r3
            r1.left = r3
        L21:
            int r4 = r0.getPaddingLeft()
            int r5 = r0.getPaddingRight()
            int r6 = r0.getWidth()
            int r7 = r0.g
            r8 = -2
            if (r7 != r8) goto L5e
            p4 r7 = r9.D
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            int r2 = r0.a(r7, r2)
            android.content.Context r7 = r0.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            int r8 = r1.left
            int r7 = r7 - r8
            int r1 = r1.right
            int r7 = r7 - r1
            if (r2 <= r7) goto L53
            r2 = r7
        L53:
            int r1 = r6 - r4
            int r1 = r1 - r5
            int r1 = java.lang.Math.max(r2, r1)
            r9.q(r1)
            goto L6b
        L5e:
            r1 = -1
            if (r7 != r1) goto L68
            int r1 = r6 - r4
            int r1 = r1 - r5
            r9.q(r1)
            goto L6b
        L68:
            r9.q(r7)
        L6b:
            boolean r0 = defpackage.cb0.a(r0)
            if (r0 == 0) goto L7a
            int r6 = r6 - r5
            int r0 = r9.e
            int r6 = r6 - r0
            int r0 = r9.F
            int r6 = r6 - r0
            int r6 = r6 + r3
            goto L7f
        L7a:
            int r0 = r9.F
            int r4 = r4 + r0
            int r6 = r4 + r3
        L7f:
            r9.f = r6
            return
    }
}
