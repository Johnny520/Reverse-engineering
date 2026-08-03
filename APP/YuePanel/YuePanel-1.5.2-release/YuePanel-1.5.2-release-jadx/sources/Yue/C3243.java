package Yue;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3243 {

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۧ$ۥ */
    public class C0094 implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Runnable f162;

        static {
            NativeUtil.classesInit0(1035);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0094(Runnable runnable) {
            this.f162 = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public native void onAnimationCancel(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        public native void onAnimationEnd(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        public native void onAnimationRepeat(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        public native void onAnimationStart(Animator animator);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۧ$ۥ۟ */
    public class C0095 extends Animation {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ View f4992;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f4993;

        static {
            NativeUtil.classesInit0(740);
        }

        public C0095(View view, int i) {
            this.f4992 = view;
            this.f4993 = i;
        }

        @Override // android.view.animation.Animation
        public native void applyTransformation(float f, Transformation transformation);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۧ$ۥ۟۟, reason: contains not printable characters */
    public class C3244 extends Animation {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ View f4994;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f4995;

        static {
            NativeUtil.classesInit0(562);
        }

        public C3244(View view, int i) {
            this.f4994 = view;
            this.f4995 = i;
        }

        @Override // android.view.animation.Animation
        public native void applyTransformation(float f, Transformation transformation);
    }

    static {
        NativeUtil.classesInit0(463);
    }

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m322(View view, ValueAnimator valueAnimator);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native void m323(View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m6627(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6628(View view, ValueAnimator valueAnimator);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m6629(View view, int i, int i2, Runnable runnable);
}
