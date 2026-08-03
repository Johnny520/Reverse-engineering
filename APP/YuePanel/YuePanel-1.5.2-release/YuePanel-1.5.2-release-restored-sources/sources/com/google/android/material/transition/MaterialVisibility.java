package com.google.android.material.transition;

import Yue.AbstractC8388;
import Yue.C7995;
import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends AbstractC8388 {
    private final List<VisibilityAnimatorProvider> additionalAnimatorProviders = new ArrayList();
    private final P primaryAnimatorProvider;

    @InterfaceC6490
    private VisibilityAnimatorProvider secondaryAnimatorProvider;

    public MaterialVisibility(P p, @InterfaceC6490 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.primaryAnimatorProvider = p;
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }

    private static void addAnimatorIfNeeded(List<Animator> list, @InterfaceC6490 VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator animatorCreateAppear = z ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (animatorCreateAppear != null) {
            list.add(animatorCreateAppear);
        }
    }

    private Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z);
        Iterator<VisibilityAnimatorProvider> it = this.additionalAnimatorProviders.iterator();
        while (it.hasNext()) {
            addAnimatorIfNeeded(arrayList, it.next(), viewGroup, view, z);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private void maybeApplyThemeValues(@InterfaceC6391 Context context, boolean z) {
        TransitionUtils.maybeApplyThemeDuration(this, context, getDurationThemeAttrResId(z));
        TransitionUtils.maybeApplyThemeInterpolator(this, context, getEasingThemeAttrResId(z), getDefaultEasingInterpolator(z));
    }

    public void addAdditionalAnimatorProvider(@InterfaceC6391 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.additionalAnimatorProviders.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    @InterfaceC6391
    public TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    @InterfaceC3451
    public int getDurationThemeAttrResId(boolean z) {
        return 0;
    }

    @InterfaceC3451
    public int getEasingThemeAttrResId(boolean z) {
        return 0;
    }

    @InterfaceC6391
    public P getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    @InterfaceC6490
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    @Override // Yue.AbstractC7956
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // Yue.AbstractC8388
    public Animator onAppear(ViewGroup viewGroup, View view, C7995 c7995, C7995 c79952) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // Yue.AbstractC8388
    public Animator onDisappear(ViewGroup viewGroup, View view, C7995 c7995, C7995 c79952) {
        return createAnimator(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@InterfaceC6391 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.additionalAnimatorProviders.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@InterfaceC6490 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }
}
