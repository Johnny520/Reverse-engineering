package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gu0 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.appcompat.widget.C0035 f4467;

    public gu0(androidx.appcompat.widget.C0035 r1) {
            r0 = this;
            r0.<init>()
            r0.f4467 = r1
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            androidx.appcompat.widget.θ r4 = r4.f4467
            d1 r5 = r4.f848
            android.os.Handler r0 = r4.f827
            m5 r4 = r4.f831
            int r1 = r6.getAction()
            float r2 = r6.getX()
            int r2 = (int) r2
            float r6 = r6.getY()
            int r6 = (int) r6
            if (r1 != 0) goto L36
            if (r4 == 0) goto L36
            boolean r3 = r4.isShowing()
            if (r3 == 0) goto L36
            if (r2 < 0) goto L36
            int r3 = r4.getWidth()
            if (r2 >= r3) goto L36
            if (r6 < 0) goto L36
            int r4 = r4.getHeight()
            if (r6 >= r4) goto L36
            r1 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r5, r1)
            goto L3c
        L36:
            r4 = 1
            if (r1 != r4) goto L3c
            r0.removeCallbacks(r5)
        L3c:
            r4 = 0
            return r4
    }
}
