package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class oj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public oj(View r2) {
        this.a = 0;
        this.b = false;
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
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r4) {
        switch(this.a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        wj r42 = (wj) this.c;
        if (this.b == false) goto L8;
        this.b = false;
        return;
    L8:
        if (((Float) r42.z.getAnimatedValue()).floatValue() != 0.0f) goto L10;
        r42.A = 0;
        r42.f(0);
        return;
    L10:
        r42.A = 2;
        r42.s.invalidate();
        return;
    L12:
        View r43 = (View) this.c;
        bb0.a.N(r43, 1.0f);
        if (this.b == false) goto L18;
        r43.setLayerType(0, null);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r3) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r3);
        return;
    L6:
        View r32 = (View) this.c;
        WeakHashMap r0 = ja0.a;
        if (s90.h(r32) == true) goto L9;
        return;
    L9:
        if (r32.getLayerType() != 0) goto L13;
        this.b = true;
        r32.setLayerType(2, null);
        return;
    }

    public oj(wj r2) {
        this.a = 1;
        this.c = r2;
        this.b = false;
    }
}
