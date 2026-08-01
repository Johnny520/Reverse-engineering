package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: sf */
/* JADX INFO: loaded from: classes.dex */
public final class C0705sf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0742tf f4312b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f4313c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f4314d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0816vf f4315e;

    public /* synthetic */ C0705sf(C0816vf c0816vf, C0742tf c0742tf, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f4311a = i;
        this.f4315e = c0816vf;
        this.f4312b = c0742tf;
        this.f4313c = viewPropertyAnimator;
        this.f4314d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4311a) {
            case Base64.DEFAULT /* 0 */:
                this.f4313c.setListener(null);
                View view = this.f4314d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0742tf c0742tf = this.f4312b;
                i00 i00Var = c0742tf.f4504a;
                C0816vf c0816vf = this.f4315e;
                c0816vf.m2191c(i00Var);
                c0816vf.f4953r.remove(c0742tf.f4504a);
                c0816vf.m2566i();
                break;
            default:
                this.f4313c.setListener(null);
                View view2 = this.f4314d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0742tf c0742tf2 = this.f4312b;
                i00 i00Var2 = c0742tf2.f4505b;
                C0816vf c0816vf2 = this.f4315e;
                c0816vf2.m2191c(i00Var2);
                c0816vf2.f4953r.remove(c0742tf2.f4505b);
                c0816vf2.m2566i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4311a) {
            case Base64.DEFAULT /* 0 */:
                i00 i00Var = this.f4312b.f4504a;
                this.f4315e.getClass();
                break;
            default:
                i00 i00Var2 = this.f4312b.f4505b;
                this.f4315e.getClass();
                break;
        }
    }
}
