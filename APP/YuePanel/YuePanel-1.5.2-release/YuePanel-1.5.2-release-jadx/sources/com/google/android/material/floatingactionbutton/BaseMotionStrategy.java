package com.google.android.material.floatingactionbutton;

import Yue.C6740;
import Yue.InterfaceC3647;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseMotionStrategy implements MotionStrategy {
    private final Context context;

    @InterfaceC6490
    private MotionSpec defaultMotionSpec;

    @InterfaceC6391
    private final ExtendedFloatingActionButton fab;
    private final ArrayList<Animator.AnimatorListener> listeners = new ArrayList<>();

    @InterfaceC6490
    private MotionSpec motionSpec;
    private final AnimatorTracker tracker;

    public BaseMotionStrategy(@InterfaceC6391 ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.fab = extendedFloatingActionButton;
        this.context = extendedFloatingActionButton.getContext();
        this.tracker = animatorTracker;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void addAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.listeners.add(animatorListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public AnimatorSet createAnimator() {
        return createAnimator(getCurrentMotionSpec());
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final MotionSpec getCurrentMotionSpec() {
        MotionSpec motionSpec = this.motionSpec;
        if (motionSpec != null) {
            return motionSpec;
        }
        if (this.defaultMotionSpec == null) {
            this.defaultMotionSpec = MotionSpec.createFromResource(this.context, getDefaultMotionSpecResource());
        }
        return (MotionSpec) C6740.m21415(this.defaultMotionSpec);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @InterfaceC6391
    public final List<Animator.AnimatorListener> getListeners() {
        return this.listeners;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @InterfaceC6490
    public MotionSpec getMotionSpec() {
        return this.motionSpec;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @InterfaceC3647
    public void onAnimationCancel() {
        this.tracker.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @InterfaceC3647
    public void onAnimationEnd() {
        this.tracker.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    @InterfaceC3647
    public void onAnimationStart(Animator animator) {
        this.tracker.onNextAnimationStart(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void removeAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.listeners.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void setMotionSpec(@InterfaceC6490 MotionSpec motionSpec) {
        this.motionSpec = motionSpec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public AnimatorSet createAnimator(@InterfaceC6391 MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        if (motionSpec.hasPropertyValues("opacity")) {
            arrayList.add(motionSpec.getAnimator("opacity", this.fab, View.ALPHA));
        }
        if (motionSpec.hasPropertyValues("scale")) {
            arrayList.add(motionSpec.getAnimator("scale", this.fab, View.SCALE_Y));
            arrayList.add(motionSpec.getAnimator("scale", this.fab, View.SCALE_X));
        }
        if (motionSpec.hasPropertyValues("width")) {
            arrayList.add(motionSpec.getAnimator("width", this.fab, ExtendedFloatingActionButton.WIDTH));
        }
        if (motionSpec.hasPropertyValues("height")) {
            arrayList.add(motionSpec.getAnimator("height", this.fab, ExtendedFloatingActionButton.HEIGHT));
        }
        if (motionSpec.hasPropertyValues("paddingStart")) {
            arrayList.add(motionSpec.getAnimator("paddingStart", this.fab, ExtendedFloatingActionButton.PADDING_START));
        }
        if (motionSpec.hasPropertyValues("paddingEnd")) {
            arrayList.add(motionSpec.getAnimator("paddingEnd", this.fab, ExtendedFloatingActionButton.PADDING_END));
        }
        if (motionSpec.hasPropertyValues("labelOpacity")) {
            arrayList.add(motionSpec.getAnimator("labelOpacity", this.fab, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") { // from class: com.google.android.material.floatingactionbutton.BaseMotionStrategy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // android.util.Property
                public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    return Float.valueOf(AnimationUtils.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.fab.originalTextCsl.getDefaultColor()))));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
                @Override // android.util.Property
                public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
                    int colorForState = extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.fab.originalTextCsl.getDefaultColor());
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f.floatValue() == 1.0f) {
                        extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
                    } else {
                        extendedFloatingActionButton.silentlyUpdateTextColor(colorStateListValueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }
}
