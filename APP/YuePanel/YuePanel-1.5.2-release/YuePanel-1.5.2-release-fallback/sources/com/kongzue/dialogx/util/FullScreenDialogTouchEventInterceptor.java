package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class FullScreenDialogTouchEventInterceptor {
    private float bkgOldY;
    private float bkgTouchDownY;
    private boolean isBkgTouched;


    public FullScreenDialogTouchEventInterceptor(com.kongzue.dialogx.dialogs.FullScreenDialog r2, com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isBkgTouched = r0
            r1.refresh(r2, r3)
            return
    }

    public static /* synthetic */ float access$000(com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r0) {
            float r0 = r0.bkgTouchDownY
            return r0
    }

    public static /* synthetic */ float access$002(com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r0, float r1) {
            r0.bkgTouchDownY = r1
            return r1
    }

    public static /* synthetic */ boolean access$100(com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r0) {
            boolean r0 = r0.isBkgTouched
            return r0
    }

    public static /* synthetic */ boolean access$102(com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r0, boolean r1) {
            r0.isBkgTouched = r1
            return r1
    }

    public static /* synthetic */ float access$200(com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r0) {
            float r0 = r0.bkgOldY
            return r0
    }

    public static /* synthetic */ float access$202(com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r0, float r1) {
            r0.bkgOldY = r1
            return r1
    }

    public static /* synthetic */ boolean access$300(com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor r0, android.view.View r1, com.kongzue.dialogx.interfaces.ScrollController r2, android.view.MotionEvent r3) {
            boolean r0 = r0.touchInScrollView(r1, r2, r3)
            return r0
    }

    private int dip2px(float r2) {
            r1 = this;
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    private boolean touchInScrollView(android.view.View r6, com.kongzue.dialogx.interfaces.ScrollController r7, android.view.MotionEvent r8) {
            r5 = this;
            android.view.View r7 = (android.view.View) r7
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1 = 2
            int[] r2 = new int[r1]
            int[] r1 = new int[r1]
            r7.getLocationInWindow(r2)
            r6.getLocationInWindow(r1)
            r6 = 0
            r3 = r2[r6]
            r4 = r1[r6]
            int r3 = r3 - r4
            float r3 = (float) r3
            r0.left = r3
            r4 = 1
            r2 = r2[r4]
            r1 = r1[r4]
            int r2 = r2 - r1
            float r1 = (float) r2
            r0.top = r1
            int r1 = r7.getWidth()
            float r1 = (float) r1
            float r3 = r3 + r1
            r0.right = r3
            float r1 = r0.top
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r1 = r1 + r7
            r0.bottom = r1
            float r7 = r8.getX()
            float r1 = r0.left
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L5f
            float r7 = r8.getX()
            float r1 = r0.right
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 > 0) goto L5f
            float r7 = r8.getY()
            float r1 = r0.top
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L5f
            float r7 = r8.getY()
            float r8 = r0.bottom
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L5f
            r6 = r4
        L5f:
            return r6
    }

    public void refresh(com.kongzue.dialogx.dialogs.FullScreenDialog r3, com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl r4) {
            r2 = this;
            if (r3 == 0) goto L34
            if (r4 == 0) goto L34
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r4.bkg
            if (r0 != 0) goto L9
            goto L34
        L9:
            boolean r0 = r3.isAllowInterceptTouch()
            if (r0 == 0) goto L20
            android.widget.RelativeLayout r0 = r4.boxCustom
            com.kongzue.dialogx.interfaces.ScrollController r1 = r4.scrollView
            if (r1 == 0) goto L17
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r4.bkg
        L17:
            com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor$1 r1 = new com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor$1
            r1.<init>(r2, r4, r3)
            r0.setOnTouchListener(r1)
            goto L34
        L20:
            android.widget.RelativeLayout r3 = r4.boxCustom
            com.kongzue.dialogx.interfaces.ScrollController r0 = r4.scrollView
            if (r0 == 0) goto L28
            com.kongzue.dialogx.util.views.MaxRelativeLayout r3 = r4.bkg
        L28:
            boolean r4 = r0 instanceof com.kongzue.dialogx.interfaces.ScrollController
            if (r4 == 0) goto L30
            r4 = 0
            r0.lockScroll(r4)
        L30:
            r4 = 0
            r3.setOnTouchListener(r4)
        L34:
            return
    }
}
