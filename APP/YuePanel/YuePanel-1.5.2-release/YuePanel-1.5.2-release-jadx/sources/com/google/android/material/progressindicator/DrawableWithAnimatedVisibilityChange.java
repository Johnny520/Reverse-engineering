package com.google.android.material.progressindicator;

import Yue.InterfaceC3219;
import Yue.InterfaceC4885;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.utilities.Contrast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements InterfaceC3219 {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final Property<DrawableWithAnimatedVisibilityChange, Float> GROW_FRACTION = new Property<DrawableWithAnimatedVisibilityChange, Float>(Float.class, "growFraction") { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.getGrowFraction());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f) {
            drawableWithAnimatedVisibilityChange.setGrowFraction(f.floatValue());
        }
    };
    private List<InterfaceC3219.AbstractC0084> animationCallbacks;
    final BaseProgressIndicatorSpec baseSpec;
    final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private InterfaceC3219.AbstractC0084 internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    private ValueAnimator showAnimator;

    @InterfaceC5459(from = 0, m2228to = 255)
    private int totalAlpha;
    final Paint paint = new Paint();
    AnimatorDurationScaleProvider animatorDurationScaleProvider = new AnimatorDurationScaleProvider();

    public DrawableWithAnimatedVisibilityChange(@InterfaceC6391 Context context, @InterfaceC6391 BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.context = context;
        this.baseSpec = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    private void cancelAnimatorsWithoutCallbacks(@InterfaceC6391 ValueAnimator... valueAnimatorArr) {
        boolean z = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.ignoreCallbacks = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        InterfaceC3219.AbstractC0084 abstractC0084 = this.internalAnimationCallback;
        if (abstractC0084 != null) {
            abstractC0084.onAnimationEnd(this);
        }
        List<InterfaceC3219.AbstractC0084> list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        Iterator<InterfaceC3219.AbstractC0084> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        InterfaceC3219.AbstractC0084 abstractC0084 = this.internalAnimationCallback;
        if (abstractC0084 != null) {
            abstractC0084.onAnimationStart(this);
        }
        List<InterfaceC3219.AbstractC0084> list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        Iterator<InterfaceC3219.AbstractC0084> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this);
        }
    }

    private void endAnimatorsWithoutCallbacks(@InterfaceC6391 ValueAnimator... valueAnimatorArr) {
        boolean z = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.ignoreCallbacks = z;
    }

    private void maybeInitializeAnimators() {
        if (this.showAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, GROW_FRACTION, 0.0f, 1.0f);
            this.showAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.showAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setShowAnimator(this.showAnimator);
        }
        if (this.hideAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, GROW_FRACTION, 1.0f, 0.0f);
            this.hideAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.hideAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setHideAnimator(this.hideAnimator);
        }
    }

    private void setHideAnimator(@InterfaceC6391 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.hideAnimator = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                DrawableWithAnimatedVisibilityChange.this.dispatchAnimationEnd();
            }
        });
    }

    private void setShowAnimator(@InterfaceC6391 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.showAnimator = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DrawableWithAnimatedVisibilityChange.this.dispatchAnimationStart();
            }
        });
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.totalAlpha;
    }

    public float getGrowFraction() {
        if (this.baseSpec.isShowAnimationEnabled() || this.baseSpec.isHideAnimationEnabled()) {
            return (this.mockHideAnimationRunning || this.mockShowAnimationRunning) ? this.mockGrowFraction : this.growFraction;
        }
        return 1.0f;
    }

    @InterfaceC6391
    public ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.hideAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockHideAnimationRunning;
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.showAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockShowAnimationRunning;
    }

    public void registerAnimationCallback(@InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084) {
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new ArrayList();
        }
        if (this.animationCallbacks.contains(abstractC0084)) {
            return;
        }
        this.animationCallbacks.add(abstractC0084);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@InterfaceC5459(from = 0, m2228to = 255) int i) {
        this.totalAlpha = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC6490 ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowFraction(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        if (this.growFraction != f) {
            this.growFraction = f;
            invalidateSelf();
        }
    }

    public void setInternalAnimationCallback(@InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084) {
        this.internalAnimationCallback = abstractC0084;
    }

    @InterfaceC8392
    public void setMockHideAnimationRunning(boolean z, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        this.mockHideAnimationRunning = z;
        this.mockGrowFraction = f;
    }

    @InterfaceC8392
    public void setMockShowAnimationRunning(boolean z, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        this.mockShowAnimationRunning = z;
        this.mockGrowFraction = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, true);
    }

    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        maybeInitializeAnimators();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.showAnimator : this.hideAnimator;
        ValueAnimator valueAnimator2 = z ? this.hideAnimator : this.showAnimator;
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                cancelAnimatorsWithoutCallbacks(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                endAnimatorsWithoutCallbacks(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(z, false);
        if (!(z ? this.baseSpec.isShowAnimationEnabled() : this.baseSpec.isHideAnimationEnabled())) {
            endAnimatorsWithoutCallbacks(valueAnimator);
            return z4;
        }
        if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z4;
    }

    public void start() {
        setVisibleInternal(true, true, false);
    }

    public void stop() {
        setVisibleInternal(false, true, false);
    }

    public boolean unregisterAnimationCallback(@InterfaceC6391 InterfaceC3219.AbstractC0084 abstractC0084) {
        List<InterfaceC3219.AbstractC0084> list = this.animationCallbacks;
        if (list == null || !list.contains(abstractC0084)) {
            return false;
        }
        this.animationCallbacks.remove(abstractC0084);
        if (!this.animationCallbacks.isEmpty()) {
            return true;
        }
        this.animationCallbacks = null;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean setVisible(boolean z, boolean z2, boolean z3) {
        return setVisibleInternal(z, z2, z3 && this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) > 0.0f);
    }
}
