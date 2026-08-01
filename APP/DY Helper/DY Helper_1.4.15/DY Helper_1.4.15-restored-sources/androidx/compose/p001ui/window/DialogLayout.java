package androidx.compose.p001ui.window;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class DialogLayout extends androidx.compose.p001ui.platform.AbstractComposeView implements p000.v41 {
    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: α */
    public final void mo355(p000.v80 r5, int r6) {
            r4 = this;
            r0 = 1735448596(0x6770d814, float:1.1373539E24)
            r5.m6083(r0)
            boolean r0 = r5.m6092(r4)
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = r1
        L10:
            r0 = r0 | r6
            r2 = r0 & 3
            r3 = 1
            if (r2 == r1) goto L18
            r1 = r3
            goto L19
        L18:
            r1 = 0
        L19:
            r0 = r0 & r3
            boolean r0 = r5.m6075(r0, r1)
            if (r0 != 0) goto L31
            r5.m6078()
            bl1 r5 = r5.m6101()
            if (r5 == 0) goto L30
            androidx.compose.ui.window.α r0 = new androidx.compose.ui.window.α
            r0.<init>(r4, r6)
            r5.f1780 = r0
        L30:
            return
        L31:
            r4 = 0
            throw r4
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: ζ */
    public final void mo360(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r4 = 0
            android.view.View r4 = r3.getChildAt(r4)
            if (r4 != 0) goto L8
            return
        L8:
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r2 = r2 + r0
            int r7 = r7 - r5
            int r8 = r8 - r6
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            int r7 = r7 - r5
            int r7 = r7 - r1
            int r8 = r8 - r6
            int r8 = r8 - r2
            int r0 = r3.getPaddingLeft()
            int r7 = r7 / 2
            int r7 = r7 + r0
            int r3 = r3.getPaddingTop()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r5 = r5 + r7
            int r6 = r6 + r8
            r4.layout(r7, r8, r5, r6)
            return
    }

    @Override // p000.v41
    /* JADX INFO: renamed from: η */
    public final p000.oc2 mo408(android.view.View r6, p000.oc2 r7) {
            r5 = this;
            r6 = 0
            android.view.View r0 = r5.getChildAt(r6)
            int r1 = r0.getLeft()
            int r1 = java.lang.Math.max(r6, r1)
            int r2 = r0.getTop()
            int r2 = java.lang.Math.max(r6, r2)
            int r3 = r5.getWidth()
            int r4 = r0.getRight()
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r6, r3)
            int r5 = r5.getHeight()
            int r0 = r0.getBottom()
            int r5 = r5 - r0
            int r5 = java.lang.Math.max(r6, r5)
            if (r1 != 0) goto L38
            if (r2 != 0) goto L38
            if (r3 != 0) goto L38
            if (r5 != 0) goto L38
            return r7
        L38:
            lc2 r6 = r7.f8033
            oc2 r5 = r6.mo1909(r1, r2, r3, r5)
            return r5
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: θ */
    public final void mo361(int r12, int r13) {
            r11 = this;
            r0 = 0
            android.view.View r1 = r11.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.mo361(r12, r13)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r12)
            int r3 = android.view.View.MeasureSpec.getSize(r13)
            int r4 = android.view.View.MeasureSpec.getMode(r13)
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r6) goto L85
            int r7 = r11.getPaddingLeft()
            int r8 = r11.getPaddingRight()
            int r8 = r8 + r7
            int r7 = r11.getPaddingTop()
            int r9 = r11.getPaddingBottom()
            int r9 = r9 + r7
            int r7 = r2 - r8
            if (r7 >= 0) goto L33
            r7 = r0
        L33:
            int r10 = r3 - r9
            if (r10 >= 0) goto L38
            goto L39
        L38:
            r0 = r10
        L39:
            int r10 = android.view.View.MeasureSpec.getMode(r12)
            if (r10 != 0) goto L40
            goto L44
        L40:
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r6)
        L44:
            if (r4 != 0) goto L47
            goto L4b
        L47:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
        L4b:
            r1.measure(r12, r13)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r6) goto L5b
            if (r10 == r12) goto L64
            int r13 = r1.getMeasuredWidth()
            int r2 = r13 + r8
            goto L64
        L5b:
            int r13 = r1.getMeasuredWidth()
            int r13 = r13 + r8
            int r2 = java.lang.Math.min(r2, r13)
        L64:
            if (r4 == r6) goto L70
            if (r4 == r12) goto L6e
            int r12 = r1.getMeasuredHeight()
            int r12 = r12 + r9
            goto L79
        L6e:
            r12 = r3
            goto L79
        L70:
            int r12 = r1.getMeasuredHeight()
            int r12 = r12 + r9
            int r12 = java.lang.Math.min(r3, r12)
        L79:
            r11.setMeasuredDimension(r2, r12)
            int r11 = r1.getMeasuredHeight()
            int r11 = r11 + r9
            if (r11 > r3) goto L84
            return
        L84:
            throw r5
        L85:
            throw r5
    }
}
