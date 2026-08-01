package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0298 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0158 f1139;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f1140;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0523 f1141;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0667 f1142;

    public ViewOnTouchListenerC0298(xhss.C0667 r1, xhss.C0523 r2, xhss.C0158 r3, android.view.View r4) {
            r0 = this;
            r0.<init>()
            r0.f1142 = r1
            r0.f1141 = r2
            r0.f1139 = r3
            r0.f1140 = r4
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            r11 = this;
            xhss.ᛵᲇᲀᛳ r12 = r11.f1141
            r12.getClass()
            xhss.ᲁᛲᛸᛴ r0 = new xhss.ᲁᛲᛸᛴ
            r0.<init>()
            int r0 = r13.getAction()
            r1 = 0
            r2 = 1
            xhss.ᛷᛶᲀᛲ r3 = r11.f1142
            xhss.ᛲᛵᛶᲁ r4 = r11.f1139
            if (r0 == 0) goto L184
            r5 = 2
            if (r0 == r2) goto Lee
            if (r0 == r5) goto L20
            r11 = 3
            if (r0 == r11) goto Lee
            goto L183
        L20:
            boolean r0 = r3.f2278
            if (r0 == 0) goto L183
            boolean r12 = r12.m934()
            if (r12 == 0) goto L183
            android.widget.RelativeLayout r12 = r4.f640
            android.widget.RelativeLayout r0 = r4.f640
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r4.f638
            float r12 = r12.getY()
            float r7 = r13.getY()
            float r7 = r7 + r12
            float r12 = r3.f2276
            float r7 = r7 - r12
            xhss.ᛵᛳᛶᛷ r12 = r4.f653
            boolean r12 = r12.mo67()
            if (r12 == 0) goto Ld4
            xhss.ᛵᛳᛶᛷ r12 = r4.f653
            android.view.View r12 = (android.view.View) r12
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            int[] r9 = new int[r5]
            int[] r5 = new int[r5]
            r12.getLocationInWindow(r9)
            android.view.View r11 = r11.f1140
            r11.getLocationInWindow(r5)
            r11 = r9[r1]
            r10 = r5[r1]
            int r11 = r11 - r10
            float r11 = (float) r11
            r8.left = r11
            r9 = r9[r2]
            r5 = r5[r2]
            int r9 = r9 - r5
            float r5 = (float) r9
            r8.top = r5
            int r5 = r12.getWidth()
            float r5 = (float) r5
            float r11 = r11 + r5
            r8.right = r11
            float r11 = r8.top
            int r12 = r12.getHeight()
            float r12 = (float) r12
            float r11 = r11 + r12
            r8.bottom = r11
            float r11 = r13.getX()
            float r12 = r8.left
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 < 0) goto Ld4
            float r11 = r13.getX()
            float r12 = r8.right
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 > 0) goto Ld4
            float r11 = r13.getY()
            float r12 = r8.top
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 < 0) goto Ld4
            float r11 = r13.getY()
            float r12 = r8.bottom
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 > 0) goto Ld4
            android.graphics.Rect r11 = r6.getUnsafePlace()
            int r11 = r11.top
            float r11 = (float) r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            xhss.ᛵᛳᛶᛷ r12 = r4.f653
            if (r11 <= 0) goto Lc6
            int r11 = r12.getScrollDistance()
            if (r11 != 0) goto Lbf
            xhss.ᛵᛳᛶᛷ r11 = r4.f653
            r11.mo66(r2)
            r0.setY(r7)
            return r1
        Lbf:
            float r11 = r13.getY()
            r3.f2276 = r11
            return r1
        Lc6:
            r12.mo66(r1)
            android.graphics.Rect r11 = r6.getUnsafePlace()
            int r11 = r11.top
            float r11 = (float) r11
            r0.setY(r11)
            return r1
        Ld4:
            android.graphics.Rect r11 = r6.getUnsafePlace()
            int r11 = r11.top
            float r11 = (float) r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 <= 0) goto Le3
            r0.setY(r7)
            return r2
        Le3:
            android.graphics.Rect r11 = r6.getUnsafePlace()
            int r11 = r11.top
            float r11 = (float) r11
            r0.setY(r11)
            return r1
        Lee:
            xhss.ᛵᛳᛶᛷ r11 = r4.f653
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r12 = r4.f638
            android.widget.RelativeLayout r13 = r4.f640
            r11.getScrollDistance()
            r3.f2278 = r1
            float r11 = r3.f2277
            android.graphics.Rect r0 = r12.getUnsafePlace()
            int r0 = r0.top
            float r0 = (float) r0
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.String r0 = "y"
            if (r11 != 0) goto L145
            float r11 = r13.getY()
            android.graphics.Rect r12 = r12.getUnsafePlace()
            int r12 = r12.top
            float r12 = (float) r12
            float r8 = r4.f639
            float r12 = r12 + r8
            int r8 = xhss.AbstractC1069.f3448
            float r8 = (float) r8
            float r12 = r12 + r8
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L124
            r4.m402()
            goto L17c
        L124:
            float r11 = r13.getY()
            float r12 = r3.f2277
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 == 0) goto L17c
            float r11 = r13.getY()
            float r12 = r4.f639
            float[] r3 = new float[r5]
            r3[r1] = r11
            r3[r2] = r12
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r13, r0, r3)
            r11.setDuration(r6)
            r11.start()
            goto L17c
        L145:
            float r11 = r13.getY()
            float r8 = r3.f2277
            int r9 = xhss.AbstractC1069.f3448
            float r9 = (float) r9
            float r8 = r8 + r9
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 <= 0) goto L157
            r4.m402()
            goto L17c
        L157:
            float r11 = r13.getY()
            float r3 = r3.f2277
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L17c
            float r11 = r13.getY()
            android.graphics.Rect r12 = r12.getUnsafePlace()
            int r12 = r12.top
            float r12 = (float) r12
            float[] r3 = new float[r5]
            r3[r1] = r11
            r3[r2] = r12
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r13, r0, r3)
            r11.setDuration(r6)
            r11.start()
        L17c:
            xhss.ᛵᛳᛶᛷ r11 = r4.f653
            if (r11 == 0) goto L183
            r11.mo66(r1)
        L183:
            return r1
        L184:
            float r11 = r13.getY()
            r3.f2276 = r11
            r3.f2278 = r2
            android.widget.RelativeLayout r11 = r4.f640
            float r11 = r11.getY()
            r3.f2277 = r11
            return r1
    }
}
