package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: FB */
/* JADX INFO: loaded from: classes.dex */
public final class C0227FB extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f669c;

    public C0227FB(C2538tF r2, View r3) {
        this.f667a = 1;
        this.f668b = r2;
        this.f669c = r3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        switch(this.f667a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C2538tF) this.f668b).f8846a.mo4896d(1.0f);
        C2358pF.m4774e((View) this.f669c);
        return;
    L6:
        ((C0521M4) this.f668b).remove(r2);
        ((AbstractC0356IB) this.f669c).f1209n.remove(r2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r2) {
        switch(this.f667a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r2);
        return;
    L6:
        ((AbstractC0356IB) this.f669c).f1209n.add(r2);
    }

    public C0227FB(AbstractC0356IB r2, C0521M4 r3) {
        this.f667a = 0;
        this.f669c = r2;
        this.f668b = r3;
    }
}
