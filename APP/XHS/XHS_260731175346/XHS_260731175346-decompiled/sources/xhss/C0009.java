package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛱᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0009 extends android.widget.ListView implements xhss.InterfaceC0455 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public boolean f151;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0491 f152;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getActionMasked()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L9
            goto L19
        L9:
            xhss.ᛵᛷᛵᛱ r0 = r2.f152
            if (r0 == 0) goto L19
            xhss.ᲀᛸᛷᛱ r0 = r0.f1801
            xhss.ᲁᛳᛵᛷ r1 = r0.f226
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r1.f3023
            float r1 = r1.getY()
            r0.f2848 = r1
        L19:
            boolean r2 = super.dispatchTouchEvent(r3)
            return r2
    }

    public xhss.AbstractC1020 getBottomMenuListViewTouchEvent() {
            r0 = this;
            xhss.ᛵᛷᛵᛱ r0 = r0.f152
            return r0
    }

    @Override // xhss.InterfaceC0455
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
            boolean r0 = r1.f151
            if (r0 == 0) goto L6
            r1 = 0
            return r1
        L6:
            boolean r1 = super.onTouchEvent(r2)
            return r1
    }

    @Override // xhss.InterfaceC0455
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final void mo66(boolean r1) {
            r0 = this;
            r0.f151 = r1
            return
    }

    @Override // xhss.InterfaceC0455
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final boolean mo67() {
            r0 = this;
            r0 = 1
            return r0
    }
}
