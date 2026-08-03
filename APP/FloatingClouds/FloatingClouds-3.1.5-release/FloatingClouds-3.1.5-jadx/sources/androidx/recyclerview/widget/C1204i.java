package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1206k;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1204i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1206k.a f5092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f5093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5094c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1206k f5095d;

    public C1204i(C1206k c1206k, C1206k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f5095d = c1206k;
        this.f5092a = aVar;
        this.f5093b = viewPropertyAnimator;
        this.f5094c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5093b.setListener(null);
        View view = this.f5094c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1206k.a aVar = this.f5092a;
        RecyclerView.AbstractC1163A abstractC1163A = aVar.f5112a;
        C1206k c1206k = this.f5095d;
        c1206k.m2819c(abstractC1163A);
        c1206k.f5111r.remove(aVar.f5112a);
        c1206k.m2963i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC1163A abstractC1163A = this.f5092a.f5112a;
        this.f5095d.getClass();
    }
}
