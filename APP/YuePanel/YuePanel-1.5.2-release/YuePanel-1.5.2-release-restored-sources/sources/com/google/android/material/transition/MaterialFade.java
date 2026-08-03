package com.google.android.material.transition;

import Yue.C7995;
import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialFade extends MaterialVisibility<FadeProvider> {
    private static final float DEFAULT_FADE_END_THRESHOLD_ENTER = 0.3f;
    private static final float DEFAULT_START_SCALE = 0.8f;

    @InterfaceC3451
    private static final int DEFAULT_THEMED_INCOMING_DURATION_ATTR = C1980R.attr.motionDurationMedium4;

    @InterfaceC3451
    private static final int DEFAULT_THEMED_OUTGOING_DURATION_ATTR = C1980R.attr.motionDurationShort3;

    @InterfaceC3451
    private static final int DEFAULT_THEMED_INCOMING_EASING_ATTR = C1980R.attr.motionEasingEmphasizedDecelerateInterpolator;

    @InterfaceC3451
    private static final int DEFAULT_THEMED_OUTGOING_EASING_ATTR = C1980R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public MaterialFade() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static FadeProvider createPrimaryAnimatorProvider() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.setIncomingEndThreshold(DEFAULT_FADE_END_THRESHOLD_ENTER);
        return fadeProvider;
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
    @InterfaceC6391
    public TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return AnimationUtils.LINEAR_INTERPOLATOR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @InterfaceC3451
    public int getDurationThemeAttrResId(boolean z) {
        return z ? DEFAULT_THEMED_INCOMING_DURATION_ATTR : DEFAULT_THEMED_OUTGOING_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @InterfaceC3451
    public int getEasingThemeAttrResId(boolean z) {
        return z ? DEFAULT_THEMED_INCOMING_EASING_ATTR : DEFAULT_THEMED_OUTGOING_EASING_ATTR;
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
