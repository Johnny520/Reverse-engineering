package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jr implements android.view.View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jr(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            android.widget.Checkable r6 = (android.widget.Checkable) r6
            boolean r6 = r6.isChecked()
            if (r6 == 0) goto L16
            java.lang.Object r6 = r5.b
            android.view.GestureDetector r6 = (android.view.GestureDetector) r6
            boolean r6 = r6.onTouchEvent(r7)
            goto L17
        L16:
            r6 = 0
        L17:
            return r6
        L18:
            java.lang.Object r6 = r5.b
            kr r6 = (defpackage.kr) r6
            hr r0 = r6.r
            android.os.Handler r1 = r6.v
            c4 r6 = r6.z
            int r2 = r7.getAction()
            float r3 = r7.getX()
            int r3 = (int) r3
            float r7 = r7.getY()
            int r7 = (int) r7
            if (r2 != 0) goto L50
            if (r6 == 0) goto L50
            boolean r4 = r6.isShowing()
            if (r4 == 0) goto L50
            if (r3 < 0) goto L50
            int r4 = r6.getWidth()
            if (r3 >= r4) goto L50
            if (r7 < 0) goto L50
            int r6 = r6.getHeight()
            if (r7 >= r6) goto L50
            r6 = 250(0xfa, double:1.235E-321)
            r1.postDelayed(r0, r6)
            goto L56
        L50:
            r6 = 1
            if (r2 != r6) goto L56
            r1.removeCallbacks(r0)
        L56:
            r6 = 0
            return r6
    }
}
