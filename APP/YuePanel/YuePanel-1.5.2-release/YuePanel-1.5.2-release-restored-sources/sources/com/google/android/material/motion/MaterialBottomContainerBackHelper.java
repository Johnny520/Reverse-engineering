package com.google.android.material.motion;

import Yue.C3505;
import Yue.C4790;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistance;
    private final float maxScaleYDistance;

    public MaterialBottomContainerBackHelper(@InterfaceC6391 View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistance = resources.getDimension(C1980R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.maxScaleYDistance = resources.getDimension(C1980R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    private Animator createResetScaleAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v = this.view;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C4790());
        return animatorSet;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        Animator animatorCreateResetScaleAnimator = createResetScaleAnimator();
        animatorCreateResetScaleAnimator.setDuration(this.cancelDuration);
        animatorCreateResetScaleAnimator.start();
    }

    public void finishBackProgressNotPersistent(@InterfaceC6391 C3505 c3505, @InterfaceC6490 Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_Y, this.view.getHeight() * this.view.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new C4790());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, c3505.m565()));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialBottomContainerBackHelper.this.view.setTranslationY(0.0f);
                MaterialBottomContainerBackHelper.this.updateBackProgress(0.0f);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void finishBackProgressPersistent(@InterfaceC6391 C3505 c3505, @InterfaceC6490 Animator.AnimatorListener animatorListener) {
        Animator animatorCreateResetScaleAnimator = createResetScaleAnimator();
        animatorCreateResetScaleAnimator.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, c3505.m565()));
        if (animatorListener != null) {
            animatorCreateResetScaleAnimator.addListener(animatorListener);
        }
        animatorCreateResetScaleAnimator.start();
    }

    public void startBackProgress(@InterfaceC6391 C3505 c3505) {
        super.onStartBackProgress(c3505);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void updateBackProgress(@InterfaceC6391 C3505 c3505) {
        if (super.onUpdateBackProgress(c3505) == null) {
            return;
        }
        updateBackProgress(c3505.m565());
    }

    @InterfaceC8392
    public void updateBackProgress(float f) {
        float fInterpolateProgress = interpolateProgress(f);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.maxScaleXDistance / width;
        float f3 = this.maxScaleYDistance / height;
        float fLerp = 1.0f - AnimationUtils.lerp(0.0f, f2, fInterpolateProgress);
        float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f3, fInterpolateProgress);
        this.view.setScaleX(fLerp);
        this.view.setPivotY(height);
        this.view.setScaleY(fLerp2);
        V v = this.view;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fLerp2 != 0.0f ? fLerp / fLerp2 : 1.0f);
            }
        }
    }
}
