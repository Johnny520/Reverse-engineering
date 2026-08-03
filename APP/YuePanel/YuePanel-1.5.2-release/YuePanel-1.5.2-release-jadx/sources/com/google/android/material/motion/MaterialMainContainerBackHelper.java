package com.google.android.material.motion;

import Yue.C3505;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private static final float MIN_SCALE = 0.9f;

    @InterfaceC6490
    private Integer expandedCornerSize;

    @InterfaceC6490
    private Rect initialHideFromClipBounds;

    @InterfaceC6490
    private Rect initialHideToClipBounds;
    private float initialTouchY;
    private final float maxTranslationY;
    private final float minEdgeGap;

    public MaterialMainContainerBackHelper(@InterfaceC6391 View view) {
        super(view);
        Resources resources = view.getResources();
        this.minEdgeGap = resources.getDimension(C1980R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.maxTranslationY = resources.getDimension(C1980R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    @InterfaceC6391
    private ValueAnimator createCornerAnimator(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), getExpandedCornerSize());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Yue.ۥۡ۠ۤۡ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$0(clippableRoundedCornerLayout, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @InterfaceC6391
    private AnimatorSet createResetScaleAndTranslationAnimator(@InterfaceC6490 final View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view2 = view;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    private int getMaxDeviceCornerRadius() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.view.getRootWindowInsets()) == null) {
            return 0;
        }
        return Math.max(Math.max(getRoundedCornerRadius(rootWindowInsets, 0), getRoundedCornerRadius(rootWindowInsets, 1)), Math.max(getRoundedCornerRadius(rootWindowInsets, 3), getRoundedCornerRadius(rootWindowInsets, 2)));
    }

    @InterfaceC7113(31)
    private int getRoundedCornerRadius(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private boolean isAtTopOfScreen() {
        int[] iArr = new int[2];
        this.view.getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createCornerAnimator$0(ClippableRoundedCornerLayout clippableRoundedCornerLayout, ValueAnimator valueAnimator) {
        clippableRoundedCornerLayout.updateCornerRadius(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void resetInitialValues() {
        this.initialTouchY = 0.0f;
        this.initialHideToClipBounds = null;
        this.initialHideFromClipBounds = null;
    }

    public void cancelBackProgress(@InterfaceC6490 View view) {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSetCreateResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        V v = this.view;
        if (v instanceof ClippableRoundedCornerLayout) {
            animatorSetCreateResetScaleAndTranslationAnimator.playTogether(createCornerAnimator((ClippableRoundedCornerLayout) v));
        }
        animatorSetCreateResetScaleAndTranslationAnimator.setDuration(this.cancelDuration);
        animatorSetCreateResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    public void finishBackProgress(long j, @InterfaceC6490 View view) {
        AnimatorSet animatorSetCreateResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        animatorSetCreateResetScaleAndTranslationAnimator.setDuration(j);
        animatorSetCreateResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    public int getExpandedCornerSize() {
        if (this.expandedCornerSize == null) {
            this.expandedCornerSize = Integer.valueOf(isAtTopOfScreen() ? getMaxDeviceCornerRadius() : 0);
        }
        return this.expandedCornerSize.intValue();
    }

    @InterfaceC6490
    public Rect getInitialHideFromClipBounds() {
        return this.initialHideFromClipBounds;
    }

    @InterfaceC6490
    public Rect getInitialHideToClipBounds() {
        return this.initialHideToClipBounds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void startBackProgress(@InterfaceC6391 C3505 c3505, @InterfaceC6490 View view) {
        super.onStartBackProgress(c3505);
        startBackProgress(c3505.m9338(), view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void updateBackProgress(@InterfaceC6391 C3505 c3505, @InterfaceC6490 View view, float f) {
        if (super.onUpdateBackProgress(c3505) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        updateBackProgress(c3505.m565(), c3505.m566() == 0, c3505.m9338(), f);
    }

    @InterfaceC8392
    public void startBackProgress(float f, @InterfaceC6490 View view) {
        this.initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.view);
        if (view != null) {
            this.initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.view, view);
        }
        this.initialTouchY = f;
    }

    @InterfaceC8392
    public void updateBackProgress(float f, boolean z, float f2, float f3) {
        float fInterpolateProgress = interpolateProgress(f);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fLerp = AnimationUtils.lerp(1.0f, MIN_SCALE, fInterpolateProgress);
        float fLerp2 = AnimationUtils.lerp(0.0f, Math.max(0.0f, ((width - (MIN_SCALE * width)) / 2.0f) - this.minEdgeGap), fInterpolateProgress) * (z ? 1 : -1);
        float fMin = Math.min(Math.max(0.0f, ((height - (fLerp * height)) / 2.0f) - this.minEdgeGap), this.maxTranslationY);
        float f4 = f2 - this.initialTouchY;
        float fLerp3 = AnimationUtils.lerp(0.0f, fMin, Math.abs(f4) / height) * Math.signum(f4);
        this.view.setScaleX(fLerp);
        this.view.setScaleY(fLerp);
        this.view.setTranslationX(fLerp2);
        this.view.setTranslationY(fLerp3);
        V v = this.view;
        if (v instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) v).updateCornerRadius(AnimationUtils.lerp(getExpandedCornerSize(), f3, fInterpolateProgress));
        }
    }
}
