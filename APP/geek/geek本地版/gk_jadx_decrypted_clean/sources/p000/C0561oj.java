package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: oj */
/* JADX INFO: loaded from: classes.dex */
public final class C0561oj extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3542a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3543b = false;

    /* JADX INFO: renamed from: c */
    public final Object f3544c;

    public C0561oj(View view) {
        this.f3544c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3542a) {
            case Base64.NO_PADDING /* 1 */:
                this.f3543b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3542a) {
            case Base64.DEFAULT /* 0 */:
                View view = (View) this.f3544c;
                bb0.f804a.mo1007N(view, 1.0f);
                if (this.f3543b) {
                    view.setLayerType(0, null);
                }
                break;
            default:
                C0858wj c0858wj = (C0858wj) this.f3544c;
                if (this.f3543b) {
                    this.f3543b = false;
                } else if (((Float) c0858wj.f4996z.getAnimatedValue()).floatValue() != 0.0f) {
                    c0858wj.f4969A = 2;
                    c0858wj.f4989s.invalidate();
                } else {
                    c0858wj.f4969A = 0;
                    c0858wj.m2573f(0);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3542a) {
            case Base64.DEFAULT /* 0 */:
                View view = (View) this.f3544c;
                WeakHashMap weakHashMap = ja0.f2600a;
                if (s90.m2316h(view) && view.getLayerType() == 0) {
                    this.f3543b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0561oj(C0858wj c0858wj) {
        this.f3544c = c0858wj;
    }
}
