package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: zf */
/* JADX INFO: loaded from: classes.dex */
public final class C0965zf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f5582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f5583b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f5584c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n40 f5585d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0067bg f5586e;

    public C0965zf(ViewGroup viewGroup, View view, boolean z, n40 n40Var, C0067bg c0067bg) {
        this.f5582a = viewGroup;
        this.f5583b = view;
        this.f5584c = z;
        this.f5585d = n40Var;
        this.f5586e = c0067bg;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f5582a;
        View view = this.f5583b;
        viewGroup.endViewTransition(view);
        if (this.f5584c) {
            g40.m1138a(view, this.f5585d.f3214a);
        }
        this.f5586e.m1967d();
    }
}
