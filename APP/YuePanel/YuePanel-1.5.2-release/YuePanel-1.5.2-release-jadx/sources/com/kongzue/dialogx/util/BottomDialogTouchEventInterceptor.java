package com.kongzue.dialogx.util;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.interfaces.BottomDialogSlideEventLifecycleCallback;
import com.kongzue.dialogx.interfaces.ScrollController;

/* JADX INFO: loaded from: classes2.dex */
public class BottomDialogTouchEventInterceptor {
    private float bkgOldY;
    private float bkgTouchDownY;
    private int oldMode;
    private float scrolledY;
    private boolean isBkgTouched = false;
    private boolean onlyRestrictingSlideTouchEventsToScrollLayoutAreas = false;

    public BottomDialogTouchEventInterceptor(BottomDialog bottomDialog, BottomDialog.DialogImpl dialogImpl) {
        refresh(bottomDialog, dialogImpl);
    }

    private int dip2px(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.kongzue.dialogx.interfaces.ScrollController */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean touchInScrollView(View view, ScrollController scrollController, MotionEvent motionEvent) {
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        ((View) scrollController).getLocationInWindow(iArr);
        view.getLocationInWindow(iArr2);
        float f = iArr[0] - iArr2[0];
        rectF.left = f;
        rectF.top = iArr[1] - iArr2[1];
        rectF.right = f + r7.getWidth();
        rectF.bottom = rectF.top + r7.getHeight();
        return motionEvent.getX() >= rectF.left && motionEvent.getX() <= rectF.right && motionEvent.getY() >= rectF.top && motionEvent.getY() <= rectF.bottom;
    }

    public boolean isOnlyRestrictingSlideTouchEventsToScrollLayoutAreas() {
        return this.onlyRestrictingSlideTouchEventsToScrollLayoutAreas;
    }

    public void refresh(final BottomDialog bottomDialog, final BottomDialog.DialogImpl dialogImpl) {
        final View view;
        if (bottomDialog == null || dialogImpl == null || (view = dialogImpl.bkg) == null || dialogImpl.scrollView == null) {
            return;
        }
        if (bottomDialog.isAllowInterceptTouch()) {
            if (isOnlyRestrictingSlideTouchEventsToScrollLayoutAreas()) {
                dialogImpl.bkg.setOnTouchListener(null);
                view = (View) dialogImpl.scrollView;
            }
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor.1
                /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    if ((bottomDialog.getDialogLifecycleCallback() instanceof BottomDialogSlideEventLifecycleCallback) && ((BottomDialogSlideEventLifecycleCallback) bottomDialog.getDialogLifecycleCallback()).onSlideTouchEvent(bottomDialog, view2, motionEvent)) {
                        return true;
                    }
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        BottomDialogTouchEventInterceptor.this.bkgTouchDownY = motionEvent.getY();
                        BottomDialogTouchEventInterceptor.this.isBkgTouched = true;
                        BottomDialogTouchEventInterceptor.this.bkgOldY = dialogImpl.boxBkg.getY();
                    } else if (action == 1) {
                        BottomDialogTouchEventInterceptor.this.scrolledY = dialogImpl.scrollView.getScrollDistance();
                        BottomDialogTouchEventInterceptor.this.isBkgTouched = false;
                        if (BottomDialogTouchEventInterceptor.this.bkgOldY == dialogImpl.boxRoot.getUnsafePlace().top) {
                            float y = dialogImpl.boxBkg.getY();
                            float f = dialogImpl.boxRoot.getUnsafePlace().top;
                            BottomDialog.DialogImpl dialogImpl2 = dialogImpl;
                            if (y > f + dialogImpl2.bkgEnterAimY + DialogX.touchSlideTriggerThreshold) {
                                dialogImpl2.preDismiss();
                            } else if (dialogImpl2.boxBkg.getY() != BottomDialogTouchEventInterceptor.this.bkgOldY) {
                                RelativeLayout relativeLayout = dialogImpl.boxBkg;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), dialogImpl.bkgEnterAimY);
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.start();
                            }
                        } else if (dialogImpl.boxBkg.getY() > BottomDialogTouchEventInterceptor.this.bkgOldY + DialogX.touchSlideTriggerThreshold) {
                            dialogImpl.preDismiss();
                        } else if (dialogImpl.boxBkg.getY() != BottomDialogTouchEventInterceptor.this.bkgOldY) {
                            RelativeLayout relativeLayout2 = dialogImpl.boxBkg;
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "y", relativeLayout2.getY(), dialogImpl.boxRoot.getUnsafePlace().top);
                            objectAnimatorOfFloat2.setDuration(300L);
                            objectAnimatorOfFloat2.start();
                        }
                        ScrollController scrollController = dialogImpl.scrollView;
                        if (scrollController instanceof ScrollController) {
                            scrollController.lockScroll(false);
                        }
                    } else if (action != 2) {
                        if (action == 3) {
                        }
                    } else if (BottomDialogTouchEventInterceptor.this.isBkgTouched && bottomDialog.isAllowInterceptTouch()) {
                        float y2 = (dialogImpl.boxBkg.getY() + motionEvent.getY()) - BottomDialogTouchEventInterceptor.this.bkgTouchDownY;
                        if (dialogImpl.scrollView.isCanScroll() && BottomDialogTouchEventInterceptor.this.touchInScrollView(view, dialogImpl.scrollView, motionEvent)) {
                            if (y2 <= dialogImpl.boxRoot.getUnsafePlace().top) {
                                dialogImpl.scrollView.lockScroll(false);
                                dialogImpl.boxBkg.setY(r9.boxRoot.getUnsafePlace().top);
                            } else if (dialogImpl.scrollView.getScrollDistance() == 0) {
                                dialogImpl.scrollView.lockScroll(true);
                                dialogImpl.boxBkg.setY(y2);
                            } else {
                                BottomDialogTouchEventInterceptor.this.bkgTouchDownY = motionEvent.getY();
                            }
                        } else {
                            if (y2 > dialogImpl.boxRoot.getUnsafePlace().top) {
                                dialogImpl.boxBkg.setY(y2);
                                return true;
                            }
                            dialogImpl.boxBkg.setY(r9.boxRoot.getUnsafePlace().top);
                        }
                    }
                    return false;
                }
            });
            return;
        }
        ScrollController scrollController = dialogImpl.scrollView;
        if (scrollController instanceof ScrollController) {
            scrollController.lockScroll(false);
        }
        view.setOnTouchListener(null);
    }

    public BottomDialogTouchEventInterceptor setOnlyRestrictingSlideTouchEventsToScrollLayoutAreas(boolean z) {
        this.onlyRestrictingSlideTouchEventsToScrollLayoutAreas = z;
        return this;
    }
}
