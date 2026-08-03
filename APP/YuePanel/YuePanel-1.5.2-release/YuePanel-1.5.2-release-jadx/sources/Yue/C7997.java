package Yue;

import Yue.AbstractC7956;
import Yue.C6934;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7997 {
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static Animator m4007(@InterfaceC6391 View view, @InterfaceC6391 C7995 c7995, int i, int i2, float f, float f2, float f3, float f4, @InterfaceC6490 TimeInterpolator timeInterpolator, @InterfaceC6391 AbstractC7956 abstractC7956) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) c7995.f3178.getTag(C6934.C1117.f20101)) != null) {
            f5 = (r7[0] - i) + translationX;
            f6 = (r7[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        C1401 c1401 = new C1401(view, c7995.f3178, translationX, translationY);
        abstractC7956.addListener(c1401);
        objectAnimatorOfPropertyValuesHolder.addListener(c1401);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۡۦ$ۥ */
    public static class C1401 extends AnimatorListenerAdapter implements AbstractC7956.InterfaceC7964 {

        /* JADX INFO: renamed from: ۥ */
        public final View f3181;

        /* JADX INFO: renamed from: ۥ۟ */
        public final View f3182;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int[] f23772;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f23773;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f23774;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final float f23775;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final float f23776;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f23777;

        public C1401(View view, View view2, float f, float f2) {
            this.f3182 = view;
            this.f3181 = view2;
            this.f23775 = f;
            this.f23776 = f2;
            int[] iArr = (int[]) view2.getTag(C6934.C1117.f20101);
            this.f23772 = iArr;
            if (iArr != null) {
                view2.setTag(C6934.C1117.f20101, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f23777 = true;
            this.f3182.setTranslationX(this.f23775);
            this.f3182.setTranslationY(this.f23776);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC6391 Animator animator, boolean z) {
            if (z) {
                return;
            }
            this.f3182.setTranslationX(this.f23775);
            this.f3182.setTranslationY(this.f23776);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f23777 = true;
            this.f3182.setTranslationX(this.f23775);
            this.f3182.setTranslationY(this.f23776);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            mo25140(abstractC7956, false);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
            m4008();
            this.f23773 = this.f3182.getTranslationX();
            this.f23774 = this.f3182.getTranslationY();
            this.f3182.setTranslationX(this.f23775);
            this.f3182.setTranslationY(this.f23776);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f3182.setTranslationX(this.f23773);
            this.f3182.setTranslationY(this.f23774);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4008() {
            if (this.f23772 == null) {
                this.f23772 = new int[2];
            }
            this.f3182.getLocationOnScreen(this.f23772);
            this.f3181.setTag(C6934.C1117.f20101, this.f23772);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo25140(@InterfaceC6391 AbstractC7956 abstractC7956, boolean z) {
            if (this.f23777) {
                return;
            }
            this.f3181.setTag(C6934.C1117.f20101, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC6391 Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
