package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1201f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC1163A f5078a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f5079b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5080c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1206k f5081d;

    public C1201f(View view, ViewPropertyAnimator viewPropertyAnimator, C1206k c1206k, RecyclerView.AbstractC1163A abstractC1163A) {
        this.f5081d = c1206k;
        this.f5078a = abstractC1163A;
        this.f5079b = viewPropertyAnimator;
        this.f5080c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5079b.setListener(null);
        this.f5080c.setAlpha(1.0f);
        C1206k c1206k = this.f5081d;
        RecyclerView.AbstractC1163A abstractC1163A = this.f5078a;
        c1206k.m2819c(abstractC1163A);
        c1206k.f5110q.remove(abstractC1163A);
        c1206k.m2963i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f5081d.getClass();
    }
}
