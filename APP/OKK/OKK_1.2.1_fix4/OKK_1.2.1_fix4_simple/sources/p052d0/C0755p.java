package p052d0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.LinearLayout;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: d0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0755p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2630a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f2631b;

    public /* synthetic */ C0755p(LinearLayout r1, int r2) {
        this.f2630a = r2;
        this.f2631b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        switch(this.f2630a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r3, "animation");
        this.f2631b.setLayerType(0, null);
        AbstractC0358S.f739s = false;
        return;
    L6:
        AbstractC0307g.m703e(r3, "animation");
        this.f2631b.setLayerType(0, null);
        AbstractC0358S.m898n(false);
    }
}
