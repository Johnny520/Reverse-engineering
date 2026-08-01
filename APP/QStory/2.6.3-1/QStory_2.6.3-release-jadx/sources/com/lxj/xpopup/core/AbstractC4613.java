package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p001ui.platform.RunnableC2733;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.lxj.xpopup.enums.PopupAnimation;
import com.lxj.xpopup.enums.PopupStatus;
import com.lxj.xpopup.widget.RunnableC4623;
import com.lxj.xpopup.widget.SmartDragLayout;
import p291.AbstractC9184;
import p291.C9181;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4613 extends AbstractC4608 {
    protected SmartDragLayout bottomPopupContainer;
    private C9181 translateAnimator;

    public AbstractC4613(Context context) {
        super(context);
        this.bottomPopupContainer = (SmartDragLayout) findViewById(C0328R.id.bottomPopupContainer);
    }

    public void addInnerContent() {
        this.bottomPopupContainer.addView(LayoutInflater.from(getContext()).cloneInContext(getContext()).inflate(getImplLayoutId(), (ViewGroup) this.bottomPopupContainer, false));
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public void dismiss() {
        C4616 c4616 = this.popupInfo;
        if (c4616 == null) {
            return;
        }
        PopupStatus popupStatus = this.popupStatus;
        PopupStatus popupStatus2 = PopupStatus.Dismissing;
        if (popupStatus == popupStatus2) {
            return;
        }
        this.popupStatus = popupStatus2;
        c4616.getClass();
        clearFocus();
        SmartDragLayout smartDragLayout = this.bottomPopupContainer;
        smartDragLayout.f12281 = true;
        smartDragLayout.post(new RunnableC4623(smartDragLayout, 1));
    }

    public void doAfterDismiss() {
        C4616 c4616 = this.popupInfo;
        if (c4616 == null) {
            return;
        }
        c4616.getClass();
        this.popupInfo.getClass();
        this.handler.removeCallbacks(this.doAfterDismissTask);
        this.handler.postDelayed(this.doAfterDismissTask, 0L);
    }

    public void doDismissAnimation() {
        C4616 c4616 = this.popupInfo;
        if (c4616 == null) {
            return;
        }
        c4616.getClass();
        SmartDragLayout smartDragLayout = this.bottomPopupContainer;
        smartDragLayout.f12281 = true;
        smartDragLayout.post(new RunnableC4623(smartDragLayout, 1));
    }

    public void doShowAnimation() {
        C4616 c4616 = this.popupInfo;
        if (c4616 == null) {
            return;
        }
        c4616.getClass();
        SmartDragLayout smartDragLayout = this.bottomPopupContainer;
        smartDragLayout.getClass();
        smartDragLayout.post(new RunnableC4623(smartDragLayout, 0));
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public int getImplLayoutId() {
        return 0;
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public final int getInnerLayoutId() {
        return C0328R.layout._xpopup_bottom_popup_view;
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
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

    @Override // com.lxj.xpopup.core.AbstractC4608
    public AbstractC9184 getPopupAnimator() {
        if (this.popupInfo == null) {
            return null;
        }
        if (this.translateAnimator == null) {
            this.translateAnimator = new C9181(getPopupContentView(), getAnimationDuration(), PopupAnimation.TranslateFromBottom);
        }
        this.popupInfo.getClass();
        return null;
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public void initPopupContent() {
        if (this.bottomPopupContainer.getChildCount() == 0) {
            addInnerContent();
        }
        this.bottomPopupContainer.setDuration(getAnimationDuration());
        SmartDragLayout smartDragLayout = this.bottomPopupContainer;
        this.popupInfo.getClass();
        smartDragLayout.f12288 = true;
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
        smartDragLayout2.f12282 = true;
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
                viewGroup2.post(new RunnableC2733(1));
            }
        });
        this.bottomPopupContainer.setOnCloseListener(new C4607(this));
        this.bottomPopupContainer.setOnClickListener(new ViewOnClickListenerC4614(this));
    }

    @Override // com.lxj.xpopup.core.AbstractC4608, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C4616 c4616 = this.popupInfo;
        if (c4616 != null) {
            c4616.getClass();
        }
        super.onDetachedFromWindow();
    }
}
