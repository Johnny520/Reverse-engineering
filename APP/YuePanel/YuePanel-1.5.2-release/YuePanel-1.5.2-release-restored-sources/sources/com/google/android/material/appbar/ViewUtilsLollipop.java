package com.google.android.material.appbar;

import Yue.AbstractC5616;
import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.C1980R;
import com.google.android.material.internal.ThemeEnforcement;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
class ViewUtilsLollipop {
    private static final int[] STATE_LIST_ANIM_ATTRS = {R.attr.stateListAnimator};

    public static void setBoundsViewOutlineProvider(@InterfaceC6391 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void setDefaultAppBarLayoutStateListAnimator(@InterfaceC6391 View view, float f) {
        int integer = view.getResources().getInteger(C1980R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, C1980R.attr.state_liftable, -C1980R.attr.state_lifted}, ObjectAnimator.ofFloat(view, AbstractC5616.f13585, 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, AbstractC5616.f13585, f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, AbstractC5616.f13585, 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void setStateListAnimatorFromAttrs(@InterfaceC6391 View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, STATE_LIST_ANIM_ATTRS, i, i2, new int[0]);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
