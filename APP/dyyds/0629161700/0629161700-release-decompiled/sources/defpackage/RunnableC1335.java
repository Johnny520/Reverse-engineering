package defpackage;

/* JADX INFO: renamed from: ᛷᛸᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1335 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractViewOnTouchListenerC0027 f5907;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5908;

    public /* synthetic */ RunnableC1335(defpackage.AbstractViewOnTouchListenerC0027 r1, int r2) {
            r0 = this;
            r0.f5908 = r2
            r0.f5907 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f5908
            r1 = 1
            ᛱᛱᲇᛳ r11 = r11.f5907
            switch(r0) {
                case 0: goto L3e;
                default: goto L8;
            }
        L8:
            r11.m335()
            android.view.View r0 = r11.f490
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L3d
            boolean r2 = r0.isLongClickable()
            if (r2 == 0) goto L1a
            goto L3d
        L1a:
            boolean r2 = r11.mo334()
            if (r2 != 0) goto L21
            goto L3d
        L21:
            android.view.ViewParent r2 = r0.getParent()
            r2.requestDisallowInterceptTouchEvent(r1)
            long r3 = android.os.SystemClock.uptimeMillis()
            r9 = 0
            r10 = 0
            r7 = 3
            r8 = 0
            r5 = r3
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r0.onTouchEvent(r2)
            r2.recycle()
            r11.f485 = r1
        L3d:
            return
        L3e:
            android.view.View r11 = r11.f490
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L49
            r11.requestDisallowInterceptTouchEvent(r1)
        L49:
            return
    }
}
