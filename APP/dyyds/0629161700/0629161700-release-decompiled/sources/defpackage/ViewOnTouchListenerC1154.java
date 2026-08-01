package defpackage;

/* JADX INFO: renamed from: ᛶᲁᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1154 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f5245;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0438 f5246;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1069 f5247;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0028 f5248;

    public ViewOnTouchListenerC1154(defpackage.C0028 r1, defpackage.C1069 r2, defpackage.C0438 r3, android.view.View r4) {
            r0 = this;
            r0.<init>()
            r0.f5248 = r1
            r0.f5247 = r2
            r0.f5246 = r3
            r0.f5245 = r4
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            r11 = this;
            ᛶᛵᛳᛸ r12 = r11.f5247
            r12.getClass()
            ᲈᲀᛴᛷ r0 = new ᲈᲀᛴᛷ
            r0.<init>()
            int r0 = r13.getAction()
            r1 = 0
            r2 = 1
            ᛱᛱᲈᛳ r3 = r11.f5248
            ᛳᛳᛴᛸ r4 = r11.f5246
            if (r0 == 0) goto L184
            r5 = 2
            if (r0 == r2) goto Lee
            if (r0 == r5) goto L20
            r11 = 3
            if (r0 == r11) goto Lee
            goto L183
        L20:
            boolean r0 = r3.f493
            if (r0 == 0) goto L183
            boolean r12 = r12.m2036()
            if (r12 == 0) goto L183
            android.widget.RelativeLayout r12 = r4.f2158
            android.widget.RelativeLayout r0 = r4.f2158
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r4.f2164
            float r12 = r12.getY()
            float r7 = r13.getY()
            float r7 = r7 + r12
            float r12 = r3.f494
            float r7 = r7 - r12
            ᲈᲀᛲᲀ r12 = r4.f2167
            boolean r12 = r12.mo275()
            if (r12 == 0) goto Ld4
            ᲈᲀᛲᲀ r12 = r4.f2167
            android.view.View r12 = (android.view.View) r12
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            int[] r9 = new int[r5]
            int[] r5 = new int[r5]
            r12.getLocationInWindow(r9)
            android.view.View r11 = r11.f5245
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
            ᲈᲀᛲᲀ r12 = r4.f2167
            if (r11 <= 0) goto Lc6
            int r11 = r12.getScrollDistance()
            if (r11 != 0) goto Lbf
            ᲈᲀᛲᲀ r11 = r4.f2167
            r11.mo276(r2)
            r0.setY(r7)
            return r1
        Lbf:
            float r11 = r13.getY()
            r3.f494 = r11
            return r1
        Lc6:
            r12.mo276(r1)
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
            ᲈᲀᛲᲀ r11 = r4.f2167
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r12 = r4.f2164
            android.widget.RelativeLayout r13 = r4.f2158
            r11.getScrollDistance()
            r3.f493 = r1
            float r11 = r3.f492
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
            float r8 = r4.f2152
            float r12 = r12 + r8
            int r8 = defpackage.AbstractC0042.f555
            float r8 = (float) r8
            float r12 = r12 + r8
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L124
            r4.m1221()
            goto L17c
        L124:
            float r11 = r13.getY()
            float r12 = r3.f492
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 == 0) goto L17c
            float r11 = r13.getY()
            float r12 = r4.f2152
            float[] r3 = new float[r5]
            r3[r1] = r11
            r3[r2] = r12
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r13, r0, r3)
            r11.setDuration(r6)
            r11.start()
            goto L17c
        L145:
            float r11 = r13.getY()
            float r8 = r3.f492
            int r9 = defpackage.AbstractC0042.f555
            float r9 = (float) r9
            float r8 = r8 + r9
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 <= 0) goto L157
            r4.m1221()
            goto L17c
        L157:
            float r11 = r13.getY()
            float r3 = r3.f492
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
            ᲈᲀᛲᲀ r11 = r4.f2167
            if (r11 == 0) goto L183
            r11.mo276(r1)
        L183:
            return r1
        L184:
            float r11 = r13.getY()
            r3.f494 = r11
            r3.f493 = r2
            android.widget.RelativeLayout r11 = r4.f2158
            float r11 = r11.getY()
            r3.f492 = r11
            return r1
    }
}
