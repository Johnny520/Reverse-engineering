package com.google.android.material.transition;

import Yue.C7995;
import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialFadeThrough extends MaterialVisibility<FadeThroughProvider> {
    private static final float DEFAULT_START_SCALE = 0.92f;

    @InterfaceC3451
    private static final int DEFAULT_THEMED_DURATION_ATTR = C1980R.attr.motionDurationLong1;

    @InterfaceC3451
    private static final int DEFAULT_THEMED_EASING_ATTR = C1980R.attr.motionEasingEmphasizedInterpolator;

    public MaterialFadeThrough() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static FadeThroughProvider createPrimaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(DEFAULT_START_SCALE);
        return scaleProvider;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@InterfaceC6391 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @InterfaceC3451
    public int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @InterfaceC3451
    public int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @InterfaceC6391
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @InterfaceC6490
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility, Yue.AbstractC7956
    public /* bridge */ /* synthetic */ boolean isSeekingSupported() {
        return super.isSeekingSupported();
    }

    @Override // com.google.android.material.transition.MaterialVisibility, Yue.AbstractC8388
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, C7995 c7995, C7995 c79952) {
        return super.onAppear(viewGroup, view, c7995, c79952);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, Yue.AbstractC8388
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, C7995 c7995, C7995 c79952) {
        return super.onDisappear(viewGroup, view, c7995, c79952);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@InterfaceC6391 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@InterfaceC6490 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
