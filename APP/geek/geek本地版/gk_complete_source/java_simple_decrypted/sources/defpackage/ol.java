package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class ol extends AnimationSet implements Runnable {
    public final ViewGroup a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;

    public ol(Animation r2, ViewGroup r3, View r4) {
        super(false);
        this.e = true;
        this.a = r3;
        this.b = r4;
        addAnimation(r2);
        r3.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long r3, Transformation r5) {
        this.e = true;
        if (this.c == false) goto L7;
        return !this.d;
    L7:
        if (super.getTransformation(r3, r5) == true) goto L9;
        this.c = true;
        cx.a(this.a, this);
    L9:
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r0 = this.c;
        ViewGroup r1 = this.a;
        if (r0 == false) goto L5;
    L8:
        r1.endViewTransition(this.b);
        this.d = true;
        return;
    L5:
        if (this.e == false) goto L8;
        this.e = false;
        r1.post(this);
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long r3, Transformation r5, float r6) {
        this.e = true;
        if (this.c == false) goto L7;
        return !this.d;
    L7:
        if (super.getTransformation(r3, r5, r6) == true) goto L9;
        this.c = true;
        cx.a(this.a, this);
    L9:
        return true;
    }
}
