package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C1296a;
import com.google.android.material.floatingactionbutton.C1297b;

/* JADX INFO: renamed from: a.D6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0063D6 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f211a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f212b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1296a f213c;

    public C0063D6(C1297b c1297b, boolean z, C1296a c1296a) {
        this.f212b = z;
        this.f213c = c1296a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f211a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        throw null;
    }
}
