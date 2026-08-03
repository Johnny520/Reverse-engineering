package a;

/* JADX INFO: renamed from: a.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0283na implements android.view.View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            int r4 = r4.getAction()
            if (r4 != 0) goto L1f
            r3.requestFocus()
            a.t5 r4 = new a.t5
            r0 = 1
            r4.<init>(r3, r0)
            r0 = 150(0x96, double:7.4E-322)
            r3.postDelayed(r4, r0)
            a.t5 r4 = new a.t5
            r0 = 2
            r4.<init>(r3, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r4, r0)
        L1f:
            r3 = 0
            return r3
    }
}
