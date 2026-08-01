package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends android.graphics.drawable.Animatable2.AnimationCallback {
    public final /* synthetic */ defpackage.vt a;

    public j2(defpackage.vt r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(android.graphics.drawable.Drawable r2) {
            r1 = this;
            vt r0 = r1.a
            xt r0 = r0.b
            android.content.res.ColorStateList r0 = r0.o
            if (r0 == 0) goto Lb
            defpackage.ch.h(r2, r0)
        Lb:
            return
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(android.graphics.drawable.Drawable r4) {
            r3 = this;
            vt r0 = r3.a
            xt r0 = r0.b
            android.content.res.ColorStateList r1 = r0.o
            if (r1 == 0) goto L15
            int[] r0 = r0.s
            int r2 = r1.getDefaultColor()
            int r0 = r1.getColorForState(r0, r2)
            defpackage.ch.g(r4, r0)
        L15:
            return
    }
}
