package com.google.android.material.transition;

import Yue.C7995;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialElevationScale extends MaterialVisibility<ScaleProvider> {
    private static final float DEFAULT_SCALE = 0.85f;
    private final boolean growing;

    public MaterialElevationScale(boolean z) {
        super(createPrimaryAnimatorProvider(z), createSecondaryAnimatorProvider());
        this.growing = z;
    }

    private static ScaleProvider createPrimaryAnimatorProvider(boolean z) {
        ScaleProvider scaleProvider = new ScaleProvider(z);
        scaleProvider.setOutgoingEndScale(DEFAULT_SCALE);
        scaleProvider.setIncomingStartScale(DEFAULT_SCALE);
        return scaleProvider;
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeProvider();
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
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @InterfaceC6490
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isGrowing() {
        return this.growing;
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
