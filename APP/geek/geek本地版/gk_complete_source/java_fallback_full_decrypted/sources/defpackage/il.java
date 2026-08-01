package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class il implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.jl b;

    public /* synthetic */ il(defpackage.jl r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L3e;
                default: goto L5;
            }
        L5:
            jl r0 = r12.b
            r0.a()
            android.view.View r1 = r0.d
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L3d
            boolean r2 = r1.isLongClickable()
            if (r2 == 0) goto L19
            goto L3d
        L19:
            boolean r2 = r0.c()
            if (r2 != 0) goto L20
            goto L3d
        L20:
            android.view.ViewParent r2 = r1.getParent()
            r3 = 1
            r2.requestDisallowInterceptTouchEvent(r3)
            long r4 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r11 = 0
            r8 = 3
            r9 = 0
            r6 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r1.onTouchEvent(r2)
            r2.recycle()
            r0.g = r3
        L3d:
            return
        L3e:
            jl r0 = r12.b
            android.view.View r0 = r0.d
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L4c
            r1 = 1
            r0.requestDisallowInterceptTouchEvent(r1)
        L4c:
            return
    }
}
