package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends Animatable2.AnimationCallback {
    public final /* synthetic */ vt a;

    public j2(vt r1) {
        this.a = r1;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable r2) {
        ColorStateList r0 = this.a.b.o;
        if (r0 == null) goto L6;
        ch.h(r2, r0);
        return;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable r4) {
        xt r0 = this.a.b;
        ColorStateList r1 = r0.o;
        if (r1 == null) goto L6;
        ch.g(r4, r1.getColorForState(r0.s, r1.getDefaultColor()));
        return;
    }
}
