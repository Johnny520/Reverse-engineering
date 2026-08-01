package defpackage;

/* JADX INFO: renamed from: ᛲᛵᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0301 extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f1613;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.view.View.OnTouchListener f1614;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            android.view.View$OnTouchListener r0 = r2.f1614
            r1 = 1
            if (r0 == 0) goto L1e
            boolean r0 = r0.onTouch(r2, r3)
            if (r0 == 0) goto L1e
            boolean r0 = r2.f1613
            if (r0 == 0) goto L1d
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r3)
            r0 = 3
            r3.setAction(r0)
            super.dispatchTouchEvent(r3)
            r3 = 0
            r2.f1613 = r3
        L1d:
            return r1
        L1e:
            int r0 = r3.getAction()
            if (r0 != 0) goto L26
            r2.f1613 = r1
        L26:
            boolean r2 = super.dispatchTouchEvent(r3)
            return r2
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            android.widget.FrameLayout$LayoutParams r0 = r0.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r0 = -2
            r1.<init>(r0, r0)
            return r1
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener r1) {
            r0 = this;
            r0.f1614 = r1
            return
    }
}
