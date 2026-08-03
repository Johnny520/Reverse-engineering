package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1202g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC1163A f5082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f5083b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f5084c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1206k f5085d;

    public C1202g(View view, ViewPropertyAnimator viewPropertyAnimator, C1206k c1206k, RecyclerView.AbstractC1163A abstractC1163A) {
        this.f5085d = c1206k;
        this.f5082a = abstractC1163A;
        this.f5083b = view;
        this.f5084c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5083b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5084c.setListener(null);
        C1206k c1206k = this.f5085d;
        RecyclerView.AbstractC1163A abstractC1163A = this.f5082a;
        c1206k.m2819c(abstractC1163A);
        c1206k.f5108o.remove(abstractC1163A);
        c1206k.m2963i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f5085d.getClass();
    }
}
