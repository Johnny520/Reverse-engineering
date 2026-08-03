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

    public C2190ld(C2276nd r1, View r2, boolean r3, C0557My r4, C2099jd r5) {
        this.f7639a = r1;
        this.f7640b = r2;
        this.f7641c = r3;
        this.f7642d = r4;
        this.f7643e = r5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        ViewGroup r32 = this.f7639a.f8009a;
        View r0 = this.f7640b;
        r32.endViewTransition(r0);
        boolean r33 = this.f7641c;
        C0557My r1 = this.f7642d;
        if (r33 == false) goto L5;
        AbstractC2374ph.m4804a(r0, r1.f1825a);
    L5:
        this.f7643e.m78d();
        if (AbstractC2805zi.m5374G(2) == false) goto L9;
        Objects.toString(r1);
        return;
    }
}
