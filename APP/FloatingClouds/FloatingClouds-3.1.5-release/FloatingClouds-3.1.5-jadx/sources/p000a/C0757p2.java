package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: a.p2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0757p2 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomAppBar f2983b;

    public /* synthetic */ C0757p2(BottomAppBar bottomAppBar, int i) {
        this.f2982a = i;
        this.f2983b = bottomAppBar;
    }

    /* JADX INFO: renamed from: a */
    private final void m1798a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1799b(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f2983b;
        switch (this.f2982a) {
            case 0:
                int i = BottomAppBar.f5410i0;
                bottomAppBar.f5413V = null;
                break;
            case 1:
                int i2 = BottomAppBar.f5410i0;
                bottomAppBar.f5414W = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2982a) {
            case 0:
            case 1:
                return;
            default:
                this.f2983b.getClass();
                throw null;
        }
    }
}
