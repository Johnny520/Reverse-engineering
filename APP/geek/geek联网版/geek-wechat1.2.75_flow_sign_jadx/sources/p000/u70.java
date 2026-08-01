package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class u70 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4662b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4663c;

    public /* synthetic */ u70(Object obj, View view, int i) {
        this.f4661a = i;
        this.f4662b = obj;
        this.f4663c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4661a) {
            case Base64.NO_PADDING /* 1 */:
                ((db0) this.f4662b).mo1b((View) this.f4663c);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4661a) {
            case Base64.DEFAULT /* 0 */:
                ((C0511n6) this.f4662b).remove(animator);
                ((x70) this.f4663c).f5215m.remove(animator);
                break;
            case Base64.NO_PADDING /* 1 */:
                ((db0) this.f4662b).mo0a();
                break;
            default:
                ((lc0) this.f4662b).f2997a.mo1601d(1.0f);
                hc0.m1386e((View) this.f4663c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4661a) {
            case Base64.DEFAULT /* 0 */:
                ((x70) this.f4663c).f5215m.add(animator);
                break;
            case Base64.NO_PADDING /* 1 */:
                ((db0) this.f4662b).mo2c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public u70(x70 x70Var, C0511n6 c0511n6) {
        this.f4661a = 0;
        this.f4663c = x70Var;
        this.f4662b = c0511n6;
    }
}
