package com.google.android.material.navigation;

import Yue.C3913;
import Yue.C4537;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.navigation.DrawerLayoutUtils;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class DrawerLayoutUtils {
    private static final int DEFAULT_SCRIM_ALPHA = Color.alpha(-1728053248);
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;

    private DrawerLayoutUtils() {
    }

    @InterfaceC6391
    public static Animator.AnimatorListener getScrimCloseAnimatorListener(@InterfaceC6391 final C4537 c4537, @InterfaceC6391 final View view) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                c4537.m13316(view, false);
                c4537.setScrimColor(-1728053248);
            }
        };
    }

    @InterfaceC6391
    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(@InterfaceC6391 final C4537 c4537) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: Yue.ۥ۠۠ۢ۟
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0(c4537, valueAnimator);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(C4537 c4537, ValueAnimator valueAnimator) {
        c4537.setScrimColor(C3913.m11173(-1728053248, AnimationUtils.lerp(DEFAULT_SCRIM_ALPHA, 0, valueAnimator.getAnimatedFraction())));
    }
}
