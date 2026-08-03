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

    public /* synthetic */ C0038n(int i2, Object obj) {
        this.f92a = i2;
        this.f93b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f92a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f93b;
                actionBarOverlayLayout.f1135t = null;
                actionBarOverlayLayout.f1124i = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f92a) {
            case 0:
                C0039o c0039o = (C0039o) this.f93b;
                c0039o.m156q();
                c0039o.f107r.start();
                break;
            case 1:
                ((AbstractC0454m) this.f93b).m1083m();
                animator.removeListener(this);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f93b;
                actionBarOverlayLayout.f1135t = null;
                actionBarOverlayLayout.f1124i = false;
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f93b).f2272h = null;
                break;
        }
    }
}
