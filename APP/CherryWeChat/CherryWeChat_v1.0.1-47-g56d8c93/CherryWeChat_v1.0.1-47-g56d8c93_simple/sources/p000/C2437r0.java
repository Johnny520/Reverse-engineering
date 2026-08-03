package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;

/* JADX INFO: renamed from: r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2437r0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8545a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8546b;

    public /* synthetic */ C2437r0(int r1, Object r2) {
        this.f8545a = r1;
        this.f8546b = r2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.f8545a) {
            case 0: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        ((InterfaceC0359IE) this.f8546b).mo797d();
        return;
    L8:
        ActionBarOverlayLayout r22 = (ActionBarOverlayLayout) this.f8546b;
        r22.f3772w = null;
        r22.f3759j = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r5) {
        switch(this.f8545a) {
            case 0: goto L21;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        ((InterfaceC0359IE) this.f8546b).mo796c();
        return;
    L6:
        ((AbstractC0356IB) this.f8546b).m777m();
        r5.removeListener(this);
        return;
    L8:
        ((HideViewOnScrollBehavior) this.f8546b).f4401k = null;
        return;
    L10:
        ((HideBottomViewOnScrollBehavior) this.f8546b).f4390k = null;
        return;
    L12:
        C0494Le r52 = (C0494Le) this.f8546b;
        r52.m2348p();
        r52.f1619r.start();
        return;
    L14:
        C0519M2 r0 = (C0519M2) this.f8546b;
        ArrayList r53 = new ArrayList(r0.f1695e);
        int r1 = r53.size();
        int r2 = 0;
    L15:
        if (r2 >= r1) goto L20;
        ColorStateList r3 = ((C0592Nq) r53.get(r2)).f1921b.f2168o;
        if (r3 == null) goto L19;
        r0.setTintList(r3);
    L19:
        r2 = r2 + 1;
        goto L15
    L20:
        return;
    L21:
        ActionBarOverlayLayout r54 = (ActionBarOverlayLayout) this.f8546b;
        r54.f3772w = null;
        r54.f3759j = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r7) {
        switch(this.f8545a) {
            case 1: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r7);
        return;
    L6:
        ((InterfaceC0359IE) this.f8546b).mo795C();
        return;
    L8:
        C0519M2 r0 = (C0519M2) this.f8546b;
        ArrayList r72 = new ArrayList(r0.f1695e);
        int r1 = r72.size();
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L14;
        C0678Pq r3 = ((C0592Nq) r72.get(r2)).f1921b;
        ColorStateList r4 = r3.f2168o;
        if (r4 == null) goto L13;
        r0.setTint(r4.getColorForState(r3.f2172s, r4.getDefaultColor()));
    L13:
        r2 = r2 + 1;
        goto L9
    }

    public C2437r0(InterfaceC0359IE r1, View r2) {
        this.f8545a = 6;
        this.f8546b = r1;
    }
}
