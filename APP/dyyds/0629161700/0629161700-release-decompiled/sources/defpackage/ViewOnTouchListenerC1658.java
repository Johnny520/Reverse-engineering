package defpackage;

/* JADX INFO: renamed from: ᲀᛴᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1658 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7405;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7406;

    public /* synthetic */ ViewOnTouchListenerC1658(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7406 = r1
            r0.f7405 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            r6 = this;
            int r7 = r6.f7406
            r0 = 0
            r1 = 1
            java.lang.Object r6 = r6.f7405
            switch(r7) {
                case 0: goto L45;
                default: goto L9;
            }
        L9:
            ᛸᛶᛳᛷ r6 = (defpackage.AbstractC1503) r6
            ᛸᛸᲀᛸ r7 = r6.f6620
            android.os.Handler r2 = r6.f6628
            ᛳᲇᲇᛲ r6 = r6.f6630
            int r3 = r8.getAction()
            float r4 = r8.getX()
            int r4 = (int) r4
            float r8 = r8.getY()
            int r8 = (int) r8
            if (r3 != 0) goto L3f
            if (r6 == 0) goto L3f
            boolean r5 = r6.isShowing()
            if (r5 == 0) goto L3f
            if (r4 < 0) goto L3f
            int r5 = r6.getWidth()
            if (r4 >= r5) goto L3f
            if (r8 < 0) goto L3f
            int r6 = r6.getHeight()
            if (r8 >= r6) goto L3f
            r3 = 250(0xfa, double:1.235E-321)
            r2.postDelayed(r7, r3)
            goto L44
        L3f:
            if (r3 != r1) goto L44
            r2.removeCallbacks(r7)
        L44:
            return r0
        L45:
            ᲀᲀᛲᛴ r6 = (defpackage.C1732) r6
            int r7 = r8.getAction()
            if (r7 != r1) goto L7d
            android.widget.EditText r7 = r6.f7669
            android.graphics.drawable.Drawable[] r7 = r7.getCompoundDrawables()
            r2 = 2
            r7 = r7[r2]
            if (r7 == 0) goto L7d
            android.widget.EditText r7 = r6.f7669
            int r7 = r7.getWidth()
            android.widget.EditText r2 = r6.f7669
            int r2 = r2.getPaddingRight()
            int r7 = r7 - r2
            r2 = 1109393408(0x42200000, float:40.0)
            int r2 = r6.m258(r2)
            int r7 = r7 - r2
            float r7 = (float) r7
            float r8 = r8.getX()
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 < 0) goto L7d
            android.widget.EditText r6 = r6.f7669
            java.lang.String r7 = ""
            r6.setText(r7)
            r0 = r1
        L7d:
            return r0
    }
}
