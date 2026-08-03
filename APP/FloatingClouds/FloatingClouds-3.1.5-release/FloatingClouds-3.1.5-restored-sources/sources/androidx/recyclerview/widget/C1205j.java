package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1206k;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1205j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1206k.a f5096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f5097b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5098c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1206k f5099d;

    public C1205j(C1206k c1206k, C1206k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f5099d = c1206k;
        this.f5096a = aVar;
        this.f5097b = viewPropertyAnimator;
        this.f5098c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5097b.setListener(null);
        View view = this.f5098c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1206k.a aVar = this.f5096a;
        RecyclerView.AbstractC1163A abstractC1163A = aVar.f5113b;
        C1206k c1206k = this.f5099d;
        c1206k.m2819c(abstractC1163A);
        c1206k.f5111r.remove(aVar.f5113b);
        c1206k.m2963i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC1163A abstractC1163A = this.f5096a.f5113b;
        this.f5099d.getClass();
    }
}
