package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.RunnableC1898;
import com.davemorrissey.labs.subscaleview.R;
import com.lxj.xpopup.enums.PopupAnimation;
import com.lxj.xpopup.enums.PopupStatus;
import com.lxj.xpopup.widget.RunnableC3791;
import com.lxj.xpopup.widget.SmartDragLayout;
import p275.AbstractC8355;
import p275.C8352;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3781 extends AbstractC3776 {
    protected SmartDragLayout bottomPopupContainer;
    private C8352 translateAnimator;

    public AbstractC3781(Context context) {
        super(context);
        this.bottomPopupContainer = (SmartDragLayout) findViewById(R.id.bottomPopupContainer);
    }

    public void addInnerContent() {
        this.bottomPopupContainer.addView(LayoutInflater.from(getContext()).cloneInContext(getContext()).inflate(getImplLayoutId(), (ViewGroup) this.bottomPopupContainer, false));
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public void dismiss() {
        C3784 c3784 = this.popupInfo;
        if (c3784 == null) {
            return;
        }
        PopupStatus popupStatus = this.popupStatus;
        PopupStatus popupStatus2 = PopupStatus.Dismissing;
        if (popupStatus == popupStatus2) {
            return;
        }
        this.popupStatus = popupStatus2;
        c3784.getClass();
        clearFocus();
        SmartDragLayout smartDragLayout = this.bottomPopupContainer;
        smartDragLayout.f11936 = true;
        smartDragLayout.post(new RunnableC3791(smartDragLayout, 1));
    }

    public void doAfterDismiss() {
        C3784 c3784 = this.popupInfo;
        if (c3784 == null) {
            return;
        }
        c3784.getClass();
        this.popupInfo.getClass();
        this.handler.removeCallbacks(this.doAfterDismissTask);
        this.handler.postDelayed(this.doAfterDismissTask, 0L);
    }

    public void doDismissAnimation() {
        C3784 c3784 = this.popupInfo;
        if (c3784 == null) {
            return;
        }
        c3784.getClass();
        SmartDragLayout smartDragLayout = this.bottomPopupContainer;
        smartDragLayout.f11936 = true;
        smartDragLayout.post(new RunnableC3791(smartDragLayout, 1));
    }

    public void doShowAnimation() {
        C3784 c3784 = this.popupInfo;
        if (c3784 == null) {
            return;
        }
        c3784.getClass();
        SmartDragLayout smartDragLayout = this.bottomPopupContainer;
        smartDragLayout.getClass();
        smartDragLayout.post(new RunnableC3791(smartDragLayout, 0));
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public int getImplLayoutId() {
        return 0;
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public final int getInnerLayoutId() {
        return R.layout._xpopup_bottom_popup_view;
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public int getMaxWidth() {
        this.popupInfo.getClass();
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public AbstractC8355 getPopupAnimator() {
        if (this.popupInfo == null) {
            return null;
        }
        if (this.translateAnimator == null) {
            this.translateAnimator = new C8352(getPopupContentView(), getAnimationDuration(), PopupAnimation.TranslateFromBottom);
        }
        this.popupInfo.getClass();
        return null;
    }

    @Override // com.lxj.xpopup.core.AbstractC3776
    public void initPopupContent() {
        if (this.bottomPopupContainer.getChildCount() == 0) {
            addInnerContent();
        }
        this.bottomPopupContainer.setDuration(getAnimationDuration());
        SmartDragLayout smartDragLayout = this.bottomPopupContainer;
        this.popupInfo.getClass();
        smartDragLayout.f11943 = true;
        this.popupInfo.getClass();
        this.popupInfo.getClass();
        View popupImplView = getPopupImplView();
        this.popupInfo.getClass();
        popupImplView.setTranslationX(0.0f);
        View popupImplView2 = getPopupImplView();
        this.popupInfo.getClass();
        popupImplView2.setTranslationY(0.0f);
        SmartDragLayout smartDragLayout2 = this.bottomPopupContainer;
        this.popupInfo.getClass();
        smartDragLayout2.f11937 = true;
        SmartDragLayout smartDragLayout3 = this.bottomPopupContainer;
        this.popupInfo.getClass();
        smartDragLayout3.getClass();
        final ViewGroup viewGroup = (ViewGroup) getPopupContentView();
        final int maxWidth = getMaxWidth();
        final int maxHeight = getMaxHeight();
        final int popupWidth = getPopupWidth();
        final int popupHeight = getPopupHeight();
        viewGroup.post(new Runnable() { // from class: com.lxj.xpopup.util.飘花落叶言子楪世哲兰苏
            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup viewGroup2 = viewGroup;
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                View childAt = viewGroup2.getChildAt(0);
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                int measuredWidth = viewGroup2.getMeasuredWidth();
                int i = maxWidth;
                int i2 = popupWidth;
                if (i > 0) {
                    layoutParams.width = Math.min(measuredWidth, i);
                    if (layoutParams2.width == -1) {
                        layoutParams2.width = Math.min(measuredWidth, i);
                    }
                    if (i2 > 0) {
                        layoutParams.width = Math.min(i2, i);
                        layoutParams2.width = Math.min(i2, i);
                    }
                } else if (i2 > 0) {
                    layoutParams.width = i2;
                    layoutParams2.width = i2;
                }
                int i3 = maxHeight;
                int i4 = popupHeight;
                if (i3 > 0) {
                    layoutParams.height = Math.min(viewGroup2.getMeasuredHeight(), i3);
                    if (i4 > 0) {
                        layoutParams.height = Math.min(i4, i3);
                        layoutParams2.height = Math.min(i4, i3);
                    }
                } else if (i4 > 0) {
                    layoutParams.height = i4;
                    layoutParams2.height = i4;
                }
                childAt.setLayoutParams(layoutParams2);
                viewGroup2.setLayoutParams(layoutParams);
                viewGroup2.post(new RunnableC1898(1));
            }
        });
        this.bottomPopupContainer.setOnCloseListener(new C3775(this));
        this.bottomPopupContainer.setOnClickListener(new ViewOnClickListenerC3782(this));
    }

    @Override // com.lxj.xpopup.core.AbstractC3776, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C3784 c3784 = this.popupInfo;
        if (c3784 != null) {
            c3784.getClass();
        }
        super.onDetachedFromWindow();
    }
}
