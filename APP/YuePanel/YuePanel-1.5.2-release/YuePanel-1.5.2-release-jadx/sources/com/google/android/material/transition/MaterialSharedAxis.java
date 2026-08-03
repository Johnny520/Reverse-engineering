package com.google.android.material.transition;

import Yue.C5194;
import Yue.C7995;
import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C1980R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    @InterfaceC3451
    private static final int DEFAULT_THEMED_DURATION_ATTR = C1980R.attr.motionDurationLong1;

    @InterfaceC3451
    private static final int DEFAULT_THEMED_EASING_ATTR = C1980R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: X */
    public static final int f4142X = 0;

    /* JADX INFO: renamed from: Y */
    public static final int f4143Y = 1;

    /* JADX INFO: renamed from: Z */
    public static final int f4144Z = 2;
    private final int axis;
    private final boolean forward;

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    public MaterialSharedAxis(int i, boolean z) {
        super(createPrimaryAnimatorProvider(i, z), createSecondaryAnimatorProvider());
        this.axis = i;
        this.forward = z;
    }

    private static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i, boolean z) {
        if (i == 0) {
            return new SlideDistanceProvider(z ? 8388613 : C5194.f1338);
        }
        if (i == 1) {
            return new SlideDistanceProvider(z ? 80 : 48);
        }
        if (i == 2) {
            return new ScaleProvider(z);
        }
        throw new IllegalArgumentException("Invalid axis: " + i);
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@InterfaceC6391 VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.axis;
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

    public boolean isForward() {
        return this.forward;
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
