package androidx.fragment.app;

import Yue.C6884;
import Yue.InterfaceC3218;
import Yue.InterfaceC6391;
import Yue.ViewTreeObserverOnPreDrawListenerC6565;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8875 {
    @InterfaceC3218
    /* JADX INFO: renamed from: ۥ */
    public static int m4839(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1695 m4840(@InterfaceC6391 Context context, @InterfaceC6391 Fragment fragment, boolean z, boolean z2) {
        Animator animatorLoadAnimator;
        int nextTransition = fragment.getNextTransition();
        int iM4839 = m4839(fragment, z, z2);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(C6884.C6885.f18208) != null) {
            fragment.mContainer.setTag(C6884.C6885.f18208, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, iM4839);
        if (animationOnCreateAnimation != null) {
            return new C1695(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, iM4839);
        if (animatorOnCreateAnimator != null) {
            return new C1695(animatorOnCreateAnimator);
        }
        if (iM4839 == 0 && nextTransition != 0) {
            iM4839 = m29962(context, nextTransition, z);
        }
        if (iM4839 != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM4839));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iM4839);
                    if (animationLoadAnimation != null) {
                        return new C1695(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM4839);
                        if (animatorLoadAnimator != null) {
                        }
                    } catch (RuntimeException e2) {
                        if (zEquals) {
                            throw e2;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM4839);
                        if (animationLoadAnimation2 != null) {
                            return new C1695(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM4839);
                if (animatorLoadAnimator != null) {
                    return new C1695(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    @InterfaceC3218
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m29961(@InterfaceC6391 Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @InterfaceC3218
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m29962(@InterfaceC6391 Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? C6884.C1106.f18206 : C6884.C1106.f18207;
        }
        if (i == 8194) {
            return z ? C6884.C1106.f2412 : C6884.C1106.f2413;
        }
        if (i == 8197) {
            return z ? m29961(context, R.attr.activityCloseEnterAnimation) : m29961(context, R.attr.activityCloseExitAnimation);
        }
        if (i == 4099) {
            return z ? C6884.C1106.f18204 : C6884.C1106.f18205;
        }
        if (i != 4100) {
            return -1;
        }
        return z ? m29961(context, R.attr.activityOpenEnterAnimation) : m29961(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۠$ۥ */
    public static class C1695 {

        /* JADX INFO: renamed from: ۥ */
        public final Animation f3827;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Animator f3828;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1695(Animation animation) {
            this.f3827 = animation;
            this.f3828 = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public C1695(Animator animator) {
            this.f3827 = null;
            this.f3828 = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۠$ۥ۟ */
    public static class RunnableC1696 extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final ViewGroup f29707;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final View f29708;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f29709;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f29710;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f29711;

        public RunnableC1696(@InterfaceC6391 Animation animation, @InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view) {
            super(false);
            this.f29711 = true;
            this.f29707 = viewGroup;
            this.f29708 = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, @InterfaceC6391 Transformation transformation) {
            this.f29711 = true;
            if (this.f29709) {
                return !this.f29710;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f29709 = true;
                ViewTreeObserverOnPreDrawListenerC6565.m3026(this.f29707, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29709 || !this.f29711) {
                this.f29707.endViewTransition(this.f29708);
                this.f29710 = true;
            } else {
                this.f29711 = false;
                this.f29707.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, @InterfaceC6391 Transformation transformation, float f) {
            this.f29711 = true;
            if (this.f29709) {
                return !this.f29710;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f29709 = true;
                ViewTreeObserverOnPreDrawListenerC6565.m3026(this.f29707, this);
            }
            return true;
        }
    }
}
