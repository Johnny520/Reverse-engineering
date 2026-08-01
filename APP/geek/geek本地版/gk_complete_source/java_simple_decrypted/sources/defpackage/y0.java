package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        ActionBarOverlayLayout r22 = (ActionBarOverlayLayout) this.b;
        r22.w = null;
        r22.k = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r5) {
        switch(this.a) {
            case 0: goto L19;
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        ((r70) this.b).l();
        r5.removeListener(this);
        return;
    L6:
        ip.o("animation", r5);
        ((FrameLayout) this.b).setLayerType(0, null);
        return;
    L8:
        ((HideBottomViewOnScrollBehavior) this.b).h = null;
        return;
    L10:
        ph r52 = (ph) this.b;
        r52.p();
        r52.r.start();
        return;
    L12:
        n2 r0 = (n2) this.b;
        ArrayList r53 = new ArrayList(r0.e);
        int r1 = r53.size();
        int r2 = 0;
    L13:
        if (r2 >= r1) goto L18;
        ColorStateList r3 = ((vt) r53.get(r2)).b.o;
        if (r3 == null) goto L17;
        ch.h(r0, r3);
    L17:
        r2 = r2 + 1;
        goto L13
    L18:
        return;
    L19:
        ActionBarOverlayLayout r54 = (ActionBarOverlayLayout) this.b;
        r54.w = null;
        r54.k = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r7) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r7);
        return;
    L6:
        n2 r0 = (n2) this.b;
        ArrayList r72 = new ArrayList(r0.e);
        int r1 = r72.size();
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L12;
        xt r3 = ((vt) r72.get(r2)).b;
        ColorStateList r4 = r3.o;
        if (r4 == null) goto L11;
        ch.g(r0, r4.getColorForState(r3.s, r4.getDefaultColor()));
    L11:
        r2 = r2 + 1;
        goto L7
    }
}
