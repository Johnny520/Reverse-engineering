package p000;

/* JADX INFO: renamed from: js */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0443js implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5565;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f5566;

    public /* synthetic */ ViewOnTouchListenerC0443js(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f5565 = r1
            r0.f5566 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
            r3 = this;
            int r0 = r3.f5565
            java.lang.Object r3 = r3.f5566
            switch(r0) {
                case 0: goto L18;
                default: goto L7;
            }
        L7:
            d81 r3 = (p000.d81) r3
            int r0 = r5.getActionMasked()
            if (r0 != 0) goto L11
            r3.f2960 = r4
        L11:
            android.view.GestureDetector r3 = r3.f2961
            boolean r3 = r3.onTouchEvent(r5)
            return r3
        L18:
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 1
            boolean r1 = r3.canScrollVertically(r0)
            r2 = 0
            if (r1 != 0) goto L29
            r1 = -1
            boolean r3 = r3.canScrollVertically(r1)
            if (r3 == 0) goto L48
        L29:
            android.view.ViewParent r3 = r4.getParent()
            if (r3 == 0) goto L32
            r3.requestDisallowInterceptTouchEvent(r0)
        L32:
            int r3 = r5.getAction()
            if (r3 == r0) goto L3f
            int r3 = r5.getAction()
            r5 = 3
            if (r3 != r5) goto L48
        L3f:
            android.view.ViewParent r3 = r4.getParent()
            if (r3 == 0) goto L48
            r3.requestDisallowInterceptTouchEvent(r2)
        L48:
            return r2
    }
}
