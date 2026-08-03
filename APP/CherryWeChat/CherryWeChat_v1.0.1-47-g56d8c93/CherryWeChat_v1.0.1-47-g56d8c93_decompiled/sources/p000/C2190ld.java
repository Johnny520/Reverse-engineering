package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: renamed from: ld */
/* JADX INFO: loaded from: classes.dex */
public final class C2190ld extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2276nd f7639a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f7640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f7641c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0557My f7642d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2099jd f7643e;

    public C2190ld(C2276nd c2276nd, View view, boolean z, C0557My c0557My, C2099jd c2099jd) {
        this.f7639a = c2276nd;
        this.f7640b = view;
        this.f7641c = z;
        this.f7642d = c0557My;
        this.f7643e = c2099jd;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f7639a.f8009a;
        View view = this.f7640b;
        viewGroup.endViewTransition(view);
        boolean z = this.f7641c;
        C0557My c0557My = this.f7642d;
        if (z) {
            AbstractC2374ph.m4804a(view, c0557My.f1825a);
        }
        this.f7643e.m78d();
        if (AbstractC2805zi.m5374G(2)) {
            Objects.toString(c0557My);
        }
    }
}
