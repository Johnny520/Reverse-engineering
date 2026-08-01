package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class zf implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ag c;

    public zf(ag r1, View r2, ViewGroup r3) {
        this.a = r3;
        this.b = r2;
        this.c = r1;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation r2) {
        y6 r22 = new y6(3, this);
        this.a.post(r22);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation r1) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation r1) {
    }
}
