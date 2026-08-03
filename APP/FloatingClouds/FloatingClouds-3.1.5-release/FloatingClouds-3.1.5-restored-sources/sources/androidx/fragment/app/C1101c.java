package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p000a.ViewTreeObserverOnPreDrawListenerC0615hc;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1101c {
    /* JADX INFO: renamed from: a */
    public static int m2542a(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Animation f4597a;

        /* JADX INFO: renamed from: b */
        public final AnimatorSet f4598b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(Animation animation) {
            this.f4597a = animation;
            this.f4598b = null;
        }

        public a(Animator animator) {
            this.f4597a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f4598b = animatorSet;
            animatorSet.play(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$b */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f4599a;

        /* JADX INFO: renamed from: b */
        public final View f4600b;

        /* JADX INFO: renamed from: c */
        public boolean f4601c;

        /* JADX INFO: renamed from: d */
        public boolean f4602d;

        /* JADX INFO: renamed from: e */
        public boolean f4603e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4603e = true;
            this.f4599a = viewGroup;
            this.f4600b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.f4603e = true;
            if (this.f4601c) {
                return !this.f4602d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f4601c = true;
                ViewTreeObserverOnPreDrawListenerC0615hc.m1466a(this.f4599a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.f4601c;
            ViewGroup viewGroup = this.f4599a;
            if (z || !this.f4603e) {
                viewGroup.endViewTransition(this.f4600b);
                this.f4602d = true;
            } else {
                this.f4603e = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f4603e = true;
            if (this.f4601c) {
                return !this.f4602d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f4601c = true;
                ViewTreeObserverOnPreDrawListenerC0615hc.m1466a(this.f4599a, this);
            }
            return true;
        }
    }
}
