package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.transition.AbstractC1235e;
import p000a.C0108Ff;
import p000a.C0307Qg;
import p000a.C0396Vg;

/* JADX INFO: renamed from: androidx.transition.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1233c extends AbstractC1239i {

    /* JADX INFO: renamed from: androidx.transition.c$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC1235e.f {

        /* JADX INFO: renamed from: a */
        public final View f5232a;

        /* JADX INFO: renamed from: b */
        public boolean f5233b = false;

        public a(View view) {
            this.f5232a = view;
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: a */
        public final void mo3026a(AbstractC1235e abstractC1235e) {
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: c */
        public final void mo3020c() {
            View view = this.f5232a;
            view.setTag(C1230R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? C0307Qg.f1106a.mo934a(view) : 0.0f));
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: d */
        public final void mo3027d(AbstractC1235e abstractC1235e) {
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: e */
        public final void mo3021e(AbstractC1235e abstractC1235e) {
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: f */
        public final void mo3022f(AbstractC1235e abstractC1235e) {
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: g */
        public final void mo3023g() {
            this.f5232a.setTag(C1230R.id.transition_pause_alpha, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C0307Qg.f1106a.mo935b(this.f5232a, 1.0f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f5232a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f5233b = true;
                view.setLayerType(2, null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            boolean z2 = this.f5233b;
            View view = this.f5232a;
            if (z2) {
                view.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            C0396Vg c0396Vg = C0307Qg.f1106a;
            c0396Vg.mo935b(view, 1.0f);
            c0396Vg.getClass();
        }
    }

    public C1233c(int i) {
        this.f5290C = i;
    }

    /* JADX INFO: renamed from: N */
    public static float m3024N(C0108Ff c0108Ff, float f) {
        Float f2;
        return (c0108Ff == null || (f2 = (Float) c0108Ff.f366a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX INFO: renamed from: M */
    public final ObjectAnimator m3025M(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0307Qg.f1106a.mo935b(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C0307Qg.f1107b, f2);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        m3050o().m3040a(aVar);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: g */
    public final void mo3017g(C0108Ff c0108Ff) {
        AbstractC1239i.m3067K(c0108Ff);
        int i = C1230R.id.transition_pause_alpha;
        View view = c0108Ff.f367b;
        Float fValueOf = (Float) view.getTag(i);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(C0307Qg.f1106a.mo934a(view)) : Float.valueOf(0.0f);
        }
        c0108Ff.f366a.put("android:fade:transitionAlpha", fValueOf);
    }
}
