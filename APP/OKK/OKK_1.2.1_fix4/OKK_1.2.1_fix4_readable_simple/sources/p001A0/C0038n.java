package p001A0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import p043Y.AbstractC0454m;

/* JADX INFO: renamed from: A0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0038n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f92a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f93b;

    public /* synthetic */ C0038n(int r1, Object r2) {
        this.f92a = r1;
        this.f93b = r2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.f92a) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        ActionBarOverlayLayout r02 = (ActionBarOverlayLayout) this.f93b;
        r02.f1135t = null;
        r02.f1124i = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        switch(this.f92a) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((HideBottomViewOnScrollBehavior) this.f93b).f2272h = null;
        return;
    L6:
        ActionBarOverlayLayout r02 = (ActionBarOverlayLayout) this.f93b;
        r02.f1135t = null;
        r02.f1124i = false;
        return;
    L8:
        ((AbstractC0454m) this.f93b).m1083m();
        r2.removeListener(this);
        return;
    L10:
        C0039o r22 = (C0039o) this.f93b;
        r22.m156q();
        r22.f107r.start();
    }
}
