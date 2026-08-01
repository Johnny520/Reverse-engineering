package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class o70 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3508b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3509c;

    public /* synthetic */ o70(Object obj, View view, int i) {
        this.f3507a = i;
        this.f3508b = obj;
        this.f3509c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3507a) {
            case Base64.NO_PADDING /* 1 */:
                ((ya0) this.f3508b).mo1b((View) this.f3509c);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3507a) {
            case Base64.DEFAULT /* 0 */:
                ((C0511n6) this.f3508b).remove(animator);
                ((r70) this.f3509c).f4237m.remove(animator);
                break;
            case Base64.NO_PADDING /* 1 */:
                ((ya0) this.f3508b).mo0a();
                break;
            default:
                ((gc0) this.f3508b).f2123a.mo1018d(1.0f);
                cc0.m668e((View) this.f3509c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3507a) {
            case Base64.DEFAULT /* 0 */:
                ((r70) this.f3509c).f4237m.add(animator);
                break;
            case Base64.NO_PADDING /* 1 */:
                ((ya0) this.f3508b).mo2c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public o70(r70 r70Var, C0511n6 c0511n6) {
        this.f3507a = 0;
        this.f3509c = r70Var;
        this.f3508b = c0511n6;
    }
}
