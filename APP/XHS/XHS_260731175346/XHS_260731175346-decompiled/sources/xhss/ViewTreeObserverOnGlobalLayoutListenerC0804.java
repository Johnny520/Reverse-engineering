package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲀᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0804 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0644 f2622;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f2623;

    public ViewTreeObserverOnGlobalLayoutListenerC0804(xhss.C0644 r1, android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.f2622 = r1
            r0.f2623 = r2
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r3 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.View r1 = r3.f2623
            r1.getWindowVisibleDisplayFrame(r0)
            int r1 = r1.getHeight()
            xhss.ᛷᛴᛱᲀ r3 = r3.f2622
            android.view.View r2 = r3.m1127()
            android.view.WindowInsetsController r2 = r2.getWindowInsetsController()
            if (r2 == 0) goto L24
            int r2 = r2.getSystemBarsBehavior()
            r2 = r2 & 16
            if (r2 != 0) goto L24
            r0.bottom = r1
        L24:
            int r0 = r0.bottom
            int r1 = r1 - r0
            int r0 = r3.f2208
            if (r1 == r0) goto L36
            r3.f2208 = r1
            int r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f97
            xhss.ᲇᲇᛱ r0 = r3.f2210
            if (r0 == 0) goto L36
            r3.m1129(r0)
        L36:
            return
    }
}
