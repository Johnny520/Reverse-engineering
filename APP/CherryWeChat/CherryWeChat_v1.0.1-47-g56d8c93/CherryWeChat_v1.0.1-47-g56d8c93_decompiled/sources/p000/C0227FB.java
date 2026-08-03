package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: FB */
/* JADX INFO: loaded from: classes.dex */
public final class C0227FB extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f667a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f669c;

    public C0227FB(C2538tF c2538tF, View view) {
        this.f668b = c2538tF;
        this.f669c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f667a) {
            case 0:
                ((C0521M4) this.f668b).remove(animator);
                ((AbstractC0356IB) this.f669c).f1209n.remove(animator);
                break;
            default:
                ((C2538tF) this.f668b).f8846a.mo4896d(1.0f);
                C2358pF.m4774e((View) this.f669c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f667a) {
            case 0:
                ((AbstractC0356IB) this.f669c).f1209n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0227FB(AbstractC0356IB abstractC0356IB, C0521M4 c0521m4) {
        this.f669c = abstractC0356IB;
        this.f668b = c0521m4;
    }
}
