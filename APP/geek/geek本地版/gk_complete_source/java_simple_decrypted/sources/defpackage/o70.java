package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o70(Object r1, View r2, int r3) {
        this.a = r3;
        this.b = r1;
        this.c = r2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        ((ya0) this.b).b((View) this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((gc0) this.b).a.d(1.0f);
        cc0.e((View) this.c);
        return;
    L6:
        ((ya0) this.b).a();
        return;
    L8:
        ((n6) this.b).remove(r2);
        ((r70) this.c).m.remove(r2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r2) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r2);
        return;
    L6:
        ((ya0) this.b).c();
        return;
    L8:
        ((r70) this.c).m.add(r2);
    }

    public o70(r70 r2, n6 r3) {
        this.a = 0;
        this.c = r2;
        this.b = r3;
    }
}
