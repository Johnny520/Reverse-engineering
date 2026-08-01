package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i60 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4925;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.appcompat.widget.AbstractViewOnTouchListenerC0033 f4926;

    public /* synthetic */ i60(androidx.appcompat.widget.AbstractViewOnTouchListenerC0033 r1, int r2) {
            r0 = this;
            r0.f4925 = r2
            r0.f4926 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f4925
            switch(r0) {
                case 0: goto L3e;
                default: goto L5;
            }
        L5:
            androidx.appcompat.widget.ζ r11 = r11.f4926
            r11.m338()
            android.view.View r0 = r11.f820
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L3d
            boolean r1 = r0.isLongClickable()
            if (r1 == 0) goto L19
            goto L3d
        L19:
            boolean r1 = r11.mo318()
            if (r1 != 0) goto L20
            goto L3d
        L20:
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            r1.requestDisallowInterceptTouchEvent(r2)
            long r3 = android.os.SystemClock.uptimeMillis()
            r9 = 0
            r10 = 0
            r7 = 3
            r8 = 0
            r5 = r3
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r0.onTouchEvent(r1)
            r1.recycle()
            r11.f823 = r2
        L3d:
            return
        L3e:
            androidx.appcompat.widget.ζ r11 = r11.f4926
            android.view.View r11 = r11.f820
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L4c
            r0 = 1
            r11.requestDisallowInterceptTouchEvent(r0)
        L4c:
            return
    }
}
