package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class DrawerLayoutUtils {
    private static final int DEFAULT_SCRIM_ALPHA = 0;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;


    static {
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            int r0 = android.graphics.Color.alpha(r0)
            com.google.android.material.navigation.DrawerLayoutUtils.DEFAULT_SCRIM_ALPHA = r0
            return
    }

    private DrawerLayoutUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    public static android.animation.Animator.AnimatorListener getScrimCloseAnimatorListener(@Yue.InterfaceC4410 Yue.C2019 r1, @Yue.InterfaceC4410 android.view.View r2) {
            com.google.android.material.navigation.DrawerLayoutUtils$1 r0 = new com.google.android.material.navigation.DrawerLayoutUtils$1
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    public static android.animation.ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(@Yue.InterfaceC4410 Yue.C2019 r1) {
            Yue.ۥ۠۠ۢ۟ r0 = new Yue.ۥ۠۠ۢ۟
            r0.<init>(r1)
            return r0
    }

    private static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(Yue.C2019 r2, android.animation.ValueAnimator r3) {
            int r0 = com.google.android.material.navigation.DrawerLayoutUtils.DEFAULT_SCRIM_ALPHA
            r1 = 0
            float r3 = r3.getAnimatedFraction()
            int r3 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r3)
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            int r3 = Yue.C1248.m6668(r0, r3)
            r2.setScrimColor(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m30588(Yue.C2019 r0, android.animation.ValueAnimator r1) {
            lambda$getScrimCloseAnimatorUpdateListener$0(r0, r1)
            return
    }
}
