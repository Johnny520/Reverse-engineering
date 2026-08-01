package defpackage;

/* JADX INFO: renamed from: ᲀᛷᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1705 extends androidx.appcompat.widget.ContentFrameLayout {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.LayoutInflaterFactory2C1411 f7589;

    public C1705(defpackage.LayoutInflaterFactory2C1411 r1, defpackage.C0620 r2) {
            r0 = this;
            r0.f7589 = r1
            r0.<init>(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            ᛸᛱᛱᛲ r0 = r1.f7589
            boolean r0 = r0.m2578(r2)
            if (r0 != 0) goto L11
            boolean r1 = super.dispatchKeyEvent(r2)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L31
            float r0 = r4.getX()
            int r0 = (int) r0
            float r1 = r4.getY()
            int r1 = (int) r1
            r2 = -5
            if (r0 < r2) goto L25
            if (r1 < r2) goto L25
            int r2 = r3.getWidth()
            int r2 = r2 + 5
            if (r0 > r2) goto L25
            int r0 = r3.getHeight()
            int r0 = r0 + 5
            if (r1 <= r0) goto L31
        L25:
            r4 = 0
            ᛸᛱᛱᛲ r3 = r3.f7589
            ᛱᛳᲈᛵ r4 = r3.m2576(r4)
            r0 = 1
            r3.m2586(r4, r0)
            return r0
        L31:
            boolean r3 = super.onInterceptTouchEvent(r4)
            return r3
    }

    @Override // android.view.View
    public final void setBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r0, r2)
            r1.setBackgroundDrawable(r2)
            return
    }
}
