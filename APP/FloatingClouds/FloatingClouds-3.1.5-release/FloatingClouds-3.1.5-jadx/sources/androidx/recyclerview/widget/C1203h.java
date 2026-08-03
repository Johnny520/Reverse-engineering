package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1203h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC1163A f5086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5087b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5088c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5089d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f5090e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1206k f5091f;

    public C1203h(C1206k c1206k, RecyclerView.AbstractC1163A abstractC1163A, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5091f = c1206k;
        this.f5086a = abstractC1163A;
        this.f5087b = i;
        this.f5088c = view;
        this.f5089d = i2;
        this.f5090e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f5087b;
        View view = this.f5088c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f5089d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5090e.setListener(null);
        C1206k c1206k = this.f5091f;
        RecyclerView.AbstractC1163A abstractC1163A = this.f5086a;
        c1206k.m2819c(abstractC1163A);
        c1206k.f5109p.remove(abstractC1163A);
        c1206k.m2963i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f5091f.getClass();
    }
}
