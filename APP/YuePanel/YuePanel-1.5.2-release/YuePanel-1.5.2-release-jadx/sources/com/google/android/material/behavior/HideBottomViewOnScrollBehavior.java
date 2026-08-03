package com.google.android.material.behavior;

import Yue.InterfaceC4399;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC8792<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;

    @InterfaceC6490
    private ViewPropertyAnimator currentAnimator;

    @ScrollState
    private int currentState;
    private int enterAnimDuration;
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private TimeInterpolator exitAnimInterpolator;
    private int height;

    @InterfaceC6391
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private static final int ENTER_ANIM_DURATION_ATTR = C1980R.attr.motionDurationLong2;
    private static final int EXIT_ANIM_DURATION_ATTR = C1980R.attr.motionDurationMedium4;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = C1980R.attr.motionEasingEmphasizedInterpolator;

    public interface OnScrollStateChangedListener {
        void onStateChanged(@InterfaceC6391 View view, @ScrollState int i);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HideBottomViewOnScrollBehavior() {
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    private void animateChildTo(@InterfaceC6391 V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.currentAnimator = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    private void updateCurrentState(@InterfaceC6391 V v, @ScrollState int i) {
        this.currentState = i;
        Iterator<OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v, this.currentState);
        }
    }

    public void addOnScrollStateChangedListener(@InterfaceC6391 OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }

    public boolean isScrolledDown() {
        return this.currentState == 1;
    }

    public boolean isScrolledUp() {
        return this.currentState == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, int i) {
        this.height = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v.getContext(), ENTER_ANIM_DURATION_ATTR, 225);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v.getContext(), EXIT_ANIM_DURATION_ATTR, 175);
        Context context = v.getContext();
        int i2 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i2, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v.getContext(), i2, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i, int i2, int i3, int i4, int i5, @InterfaceC6391 int[] iArr) {
        if (i2 > 0) {
            slideDown(v);
        } else if (i2 < 0) {
            slideUp(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onStartNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
        return i == 2;
    }

    public void removeOnScrollStateChangedListener(@InterfaceC6391 OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(@InterfaceC6391 V v, @InterfaceC4399 int i) {
        this.additionalHiddenOffsetY = i;
        if (this.currentState == 1) {
            v.setTranslationY(this.height + i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void slideDown(@InterfaceC6391 V v) {
        slideDown(v, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void slideUp(@InterfaceC6391 V v) {
        slideUp(v, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void slideDown(@InterfaceC6391 V v, boolean z) {
        if (isScrolledDown()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 1);
        int i = this.height + this.additionalHiddenOffsetY;
        if (z) {
            animateChildTo(v, i, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            v.setTranslationY(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void slideUp(@InterfaceC6391 V v, boolean z) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 2);
        if (z) {
            animateChildTo(v, 0, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            v.setTranslationY(0);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }
}
