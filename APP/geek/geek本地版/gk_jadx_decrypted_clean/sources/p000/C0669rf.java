package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: rf */
/* JADX INFO: loaded from: classes.dex */
public final class C0669rf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4266a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0706sf f4267b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f4268c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f4269d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0780uf f4270e;

    public /* synthetic */ C0669rf(C0780uf c0780uf, C0706sf c0706sf, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f4266a = i;
        this.f4270e = c0780uf;
        this.f4267b = c0706sf;
        this.f4268c = viewPropertyAnimator;
        this.f4269d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4266a) {
            case Base64.DEFAULT /* 0 */:
                this.f4268c.setListener(null);
                View view = this.f4269d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0706sf c0706sf = this.f4267b;
                b00 b00Var = c0706sf.f4430a;
                C0780uf c0780uf = this.f4270e;
                c0780uf.m1612c(b00Var);
                c0780uf.f4728r.remove(c0706sf.f4430a);
                c0780uf.m2450i();
                break;
            default:
                this.f4268c.setListener(null);
                View view2 = this.f4269d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0706sf c0706sf2 = this.f4267b;
                b00 b00Var2 = c0706sf2.f4431b;
                C0780uf c0780uf2 = this.f4270e;
                c0780uf2.m1612c(b00Var2);
                c0780uf2.f4728r.remove(c0706sf2.f4431b);
                c0780uf2.m2450i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4266a) {
            case Base64.DEFAULT /* 0 */:
                b00 b00Var = this.f4267b.f4430a;
                this.f4270e.getClass();
                break;
            default:
                b00 b00Var2 = this.f4267b.f4431b;
                this.f4270e.getClass();
                break;
        }
    }
}
