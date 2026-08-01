package com.kongzue.dialogx.util.views;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class DialogScrollView extends android.widget.ScrollView implements defpackage.InterfaceC2319 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f386;

    public DialogScrollView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DialogScrollView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC2319
    public int getScrollDistance() {
            r0 = this;
            int r0 = r0.getScrollY()
            return r0
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.f386
            if (r0 == 0) goto L6
            r1 = 0
            return r1
        L6:
            boolean r1 = super.onTouchEvent(r2)
            return r1
    }

    @Override // defpackage.InterfaceC2319
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean mo275() {
            r2 = this;
            r0 = 0
            android.view.View r1 = r2.getChildAt(r0)
            if (r1 == 0) goto L13
            int r1 = r1.getHeight()
            int r2 = r2.getHeight()
            if (r2 >= r1) goto L13
            r2 = 1
            return r2
        L13:
            return r0
    }

    @Override // defpackage.InterfaceC2319
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void mo276(boolean r1) {
            r0 = this;
            r0.f386 = r1
            return
    }
}
