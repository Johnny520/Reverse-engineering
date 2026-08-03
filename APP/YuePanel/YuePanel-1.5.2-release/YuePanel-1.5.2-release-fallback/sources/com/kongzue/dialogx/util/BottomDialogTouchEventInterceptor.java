package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class BottomDialogTouchEventInterceptor {
    private float bkgOldY;
    private float bkgTouchDownY;
    private boolean isBkgTouched;
    private int oldMode;
    private boolean onlyRestrictingSlideTouchEventsToScrollLayoutAreas;
    private float scrolledY;


    public BottomDialogTouchEventInterceptor(com.kongzue.dialogx.dialogs.BottomDialog r2, com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isBkgTouched = r0
            r1.onlyRestrictingSlideTouchEventsToScrollLayoutAreas = r0
            r1.refresh(r2, r3)
            return
    }

    public static /* synthetic */ float access$000(com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r0) {
            float r0 = r0.bkgTouchDownY
            return r0
    }

    public static /* synthetic */ float access$002(com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r0, float r1) {
            r0.bkgTouchDownY = r1
            return r1
    }

    public static /* synthetic */ boolean access$100(com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r0) {
            boolean r0 = r0.isBkgTouched
            return r0
    }

    public static /* synthetic */ boolean access$102(com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r0, boolean r1) {
            r0.isBkgTouched = r1
            return r1
    }

    public static /* synthetic */ float access$200(com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r0) {
            float r0 = r0.bkgOldY
            return r0
    }

    public static /* synthetic */ float access$202(com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r0, float r1) {
            r0.bkgOldY = r1
            return r1
    }

    public static /* synthetic */ boolean access$300(com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r0, android.view.View r1, com.kongzue.dialogx.interfaces.ScrollController r2, android.view.MotionEvent r3) {
            boolean r0 = r0.touchInScrollView(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ float access$402(com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor r0, float r1) {
            r0.scrolledY = r1
            return r1
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

    public boolean isOnlyRestrictingSlideTouchEventsToScrollLayoutAreas() {
            r1 = this;
            boolean r0 = r1.onlyRestrictingSlideTouchEventsToScrollLayoutAreas
            return r0
    }

    public void refresh(com.kongzue.dialogx.dialogs.BottomDialog r4, com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl r5) {
            r3 = this;
            if (r4 == 0) goto L39
            if (r5 == 0) goto L39
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r5.bkg
            if (r0 == 0) goto L39
            com.kongzue.dialogx.interfaces.ScrollController r1 = r5.scrollView
            if (r1 != 0) goto Ld
            goto L39
        Ld:
            boolean r1 = r4.isAllowInterceptTouch()
            r2 = 0
            if (r1 == 0) goto L2c
            boolean r1 = r3.isOnlyRestrictingSlideTouchEventsToScrollLayoutAreas()
            if (r1 == 0) goto L23
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r5.bkg
            r0.setOnTouchListener(r2)
            com.kongzue.dialogx.interfaces.ScrollController r0 = r5.scrollView
            android.view.View r0 = (android.view.View) r0
        L23:
            com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor$1 r1 = new com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor$1
            r1.<init>(r3, r4, r5, r0)
            r0.setOnTouchListener(r1)
            goto L39
        L2c:
            com.kongzue.dialogx.interfaces.ScrollController r4 = r5.scrollView
            boolean r5 = r4 instanceof com.kongzue.dialogx.interfaces.ScrollController
            if (r5 == 0) goto L36
            r5 = 0
            r4.lockScroll(r5)
        L36:
            r0.setOnTouchListener(r2)
        L39:
            return
    }

    public com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor setOnlyRestrictingSlideTouchEventsToScrollLayoutAreas(boolean r1) {
            r0 = this;
            r0.onlyRestrictingSlideTouchEventsToScrollLayoutAreas = r1
            return r0
    }
}
