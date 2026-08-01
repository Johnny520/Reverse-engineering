package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: yf */
/* JADX INFO: loaded from: classes.dex */
public final class C0928yf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f5335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f5336b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f5337c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ g40 f5338d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0017ag f5339e;

    public C0928yf(ViewGroup viewGroup, View view, boolean z, g40 g40Var, C0017ag c0017ag) {
        this.f5335a = viewGroup;
        this.f5336b = view;
        this.f5337c = z;
        this.f5338d = g40Var;
        this.f5339e = c0017ag;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f5335a;
        View view = this.f5336b;
        viewGroup.endViewTransition(view);
        if (this.f5337c) {
            z30.m2756a(view, this.f5338d.f2014a);
        }
        this.f5339e.m1986d();
    }
}
