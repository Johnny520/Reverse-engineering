package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: a.r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0795r2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f3129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionMenuView f3130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3131c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f3132d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ BottomAppBar f3133e;

    public C0795r2(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f3133e = bottomAppBar;
        this.f3130b = actionMenuView;
        this.f3131c = i;
        this.f3132d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3129a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3129a) {
            return;
        }
        this.f3133e.m3093E(this.f3130b, this.f3131c, this.f3132d, false);
    }
}
