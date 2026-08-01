package defpackage;

/* JADX INFO: renamed from: ᛲᛸᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0334 extends android.widget.ListView implements defpackage.InterfaceC2319 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f1721;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.AbstractC1830 f1722;

    public C0334(android.app.Activity r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.setVerticalScrollBarEnabled(r1)
            return
    }

    public C0334(android.app.Activity r2, int r3) {
            r1 = this;
            ᛴᛱᲈᛳ r3 = new ᛴᛱᲈᛳ
            r0 = 1712259270(0x660f00c6, float:1.6882817E23)
            r3.<init>(r2, r0)
            r1.<init>(r3)
            r2 = 0
            r1.setVerticalScrollBarEnabled(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            int r0 = r2.getActionMasked()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L9
            goto L10
        L9:
            ᲁᛳᛴᛴ r0 = r1.f1722
            if (r0 == 0) goto L10
            r0.mo3227()
        L10:
            boolean r1 = super.dispatchTouchEvent(r2)
            return r1
    }

    public defpackage.AbstractC1830 getBottomMenuListViewTouchEvent() {
            r0 = this;
            ᲁᛳᛴᛴ r0 = r0.f1722
            return r0
    }

    @Override // defpackage.InterfaceC2319
    public int getScrollDistance() {
            r2 = this;
            r0 = 0
            android.view.View r1 = r2.getChildAt(r0)
            if (r1 != 0) goto L8
            return r0
        L8:
            int r2 = r2.getFirstVisiblePosition()
            int r0 = r1.getTop()
            int r0 = -r0
            int r1 = r1.getHeight()
            int r1 = r1 * r2
            int r1 = r1 + r0
            return r1
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.f1721
            if (r0 == 0) goto L6
            r1 = 0
            return r1
        L6:
            boolean r1 = super.onTouchEvent(r2)
            return r1
    }

    @Override // defpackage.InterfaceC2319
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo275() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC2319
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo276(boolean r1) {
            r0 = this;
            r0.f1721 = r1
            return
    }
}
