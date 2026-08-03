package com.kongzue.dialogx.util;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.dialogs.FullScreenDialog;
import com.kongzue.dialogx.interfaces.ScrollController;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public class FullScreenDialogTouchEventInterceptor {
    private float bkgOldY;
    private float bkgTouchDownY;
    private boolean isBkgTouched = false;

    public FullScreenDialogTouchEventInterceptor(FullScreenDialog fullScreenDialog, FullScreenDialog.DialogImpl dialogImpl) {
        refresh(fullScreenDialog, dialogImpl);
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

    public void refresh(final FullScreenDialog fullScreenDialog, final FullScreenDialog.DialogImpl dialogImpl) {
        if (fullScreenDialog == null || dialogImpl == null || dialogImpl.bkg == null) {
            return;
        }
        if (fullScreenDialog.isAllowInterceptTouch()) {
            View view = dialogImpl.boxCustom;
            if (dialogImpl.scrollView != null) {
                view = dialogImpl.bkg;
            }
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor.1
                /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        FullScreenDialogTouchEventInterceptor.this.bkgTouchDownY = motionEvent.getY();
                        FullScreenDialogTouchEventInterceptor.this.isBkgTouched = true;
                        FullScreenDialogTouchEventInterceptor.this.bkgOldY = dialogImpl.bkg.getY();
                    } else if (action == 1) {
                        FullScreenDialogTouchEventInterceptor.this.isBkgTouched = false;
                        if (FullScreenDialogTouchEventInterceptor.this.bkgOldY == fullScreenDialog.getDialogImpl().getEnterY()) {
                            if (dialogImpl.bkg.getY() < DialogX.touchSlideTriggerThreshold) {
                                MaxRelativeLayout maxRelativeLayout = dialogImpl.bkg;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(maxRelativeLayout, "y", maxRelativeLayout.getY(), fullScreenDialog.getDialogImpl().getEnterY());
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.start();
                            } else if (dialogImpl.bkg.getY() > dialogImpl.getEnterY() + DialogX.touchSlideTriggerThreshold) {
                                dialogImpl.preDismiss();
                            } else {
                                MaxRelativeLayout maxRelativeLayout2 = dialogImpl.bkg;
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(maxRelativeLayout2, "y", maxRelativeLayout2.getY(), dialogImpl.getEnterY());
                                objectAnimatorOfFloat2.setDuration(300L);
                                objectAnimatorOfFloat2.start();
                            }
                        } else if (dialogImpl.bkg.getY() < FullScreenDialogTouchEventInterceptor.this.bkgOldY - DialogX.touchSlideTriggerThreshold) {
                            MaxRelativeLayout maxRelativeLayout3 = dialogImpl.bkg;
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(maxRelativeLayout3, "y", maxRelativeLayout3.getY(), fullScreenDialog.getDialogImpl().getEnterY());
                            objectAnimatorOfFloat3.setDuration(300L);
                            objectAnimatorOfFloat3.start();
                        } else if (dialogImpl.bkg.getY() > FullScreenDialogTouchEventInterceptor.this.bkgOldY + DialogX.touchSlideTriggerThreshold) {
                            dialogImpl.preDismiss();
                        } else {
                            MaxRelativeLayout maxRelativeLayout4 = dialogImpl.bkg;
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(maxRelativeLayout4, "y", maxRelativeLayout4.getY(), dialogImpl.getEnterY());
                            objectAnimatorOfFloat4.setDuration(300L);
                            objectAnimatorOfFloat4.start();
                        }
                        ScrollController scrollController = dialogImpl.scrollView;
                        if (scrollController instanceof ScrollController) {
                            scrollController.lockScroll(false);
                        }
                    } else if (action != 2) {
                        if (action == 3) {
                        }
                    } else if (FullScreenDialogTouchEventInterceptor.this.isBkgTouched) {
                        float y = (dialogImpl.bkg.getY() + motionEvent.getY()) - FullScreenDialogTouchEventInterceptor.this.bkgTouchDownY;
                        ScrollController scrollController2 = dialogImpl.scrollView;
                        if (scrollController2 == null || !scrollController2.isCanScroll() || !FullScreenDialogTouchEventInterceptor.this.touchInScrollView(view2, dialogImpl.scrollView, motionEvent)) {
                            if (y < fullScreenDialog.getDialogImpl().getEnterY()) {
                                y = fullScreenDialog.getDialogImpl().getEnterY();
                            }
                            dialogImpl.bkg.setY(y);
                        } else if (y <= fullScreenDialog.getDialogImpl().getEnterY()) {
                            ScrollController scrollController3 = dialogImpl.scrollView;
                            if (scrollController3 instanceof ScrollController) {
                                scrollController3.lockScroll(false);
                            }
                            dialogImpl.bkg.setY(fullScreenDialog.getDialogImpl().getEnterY());
                        } else if (dialogImpl.scrollView.getScrollDistance() == 0) {
                            ScrollController scrollController4 = dialogImpl.scrollView;
                            if (scrollController4 instanceof ScrollController) {
                                scrollController4.lockScroll(true);
                            }
                            dialogImpl.bkg.setY(y);
                        } else {
                            FullScreenDialogTouchEventInterceptor.this.bkgTouchDownY = motionEvent.getY();
                        }
                    }
                    return false;
                }
            });
            return;
        }
        View view2 = dialogImpl.boxCustom;
        ScrollController scrollController = dialogImpl.scrollView;
        if (scrollController != null) {
            view2 = dialogImpl.bkg;
        }
        if (scrollController instanceof ScrollController) {
            scrollController.lockScroll(false);
        }
        view2.setOnTouchListener(null);
    }
}
