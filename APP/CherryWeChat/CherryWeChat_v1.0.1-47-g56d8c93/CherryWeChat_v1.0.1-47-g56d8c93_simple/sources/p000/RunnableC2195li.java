package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: li */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2195li extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f7648a;

    /* JADX INFO: renamed from: b */
    public final View f7649b;

    /* JADX INFO: renamed from: c */
    public boolean f7650c;

    /* JADX INFO: renamed from: d */
    public boolean f7651d;

    /* JADX INFO: renamed from: e */
    public boolean f7652e;

    public RunnableC2195li(Animation r2, ViewGroup r3, View r4) {
        super(false);
        this.f7652e = true;
        this.f7648a = r3;
        this.f7649b = r4;
        addAnimation(r2);
        r3.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long r3, Transformation r5) {
        this.f7652e = true;
        if (this.f7650c == false) goto L7;
        return !this.f7651d;
    L7:
        if (super.getTransformation(r3, r5) == true) goto L9;
        this.f7650c = true;
        ViewTreeObserverOnPreDrawListenerC2515st.m4996a(this.f7648a, this);
    L9:
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r0 = this.f7650c;
        ViewGroup r1 = this.f7648a;
        if (r0 == false) goto L5;
    L8:
        r1.endViewTransition(this.f7649b);
        this.f7651d = true;
        return;
    L5:
        if (this.f7652e == false) goto L8;
        this.f7652e = false;
        r1.post(this);
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long r3, Transformation r5, float r6) {
        this.f7652e = true;
        if (this.f7650c == false) goto L7;
        return !this.f7651d;
    L7:
        if (super.getTransformation(r3, r5, r6) == true) goto L9;
        this.f7650c = true;
        ViewTreeObserverOnPreDrawListenerC2515st.m4996a(this.f7648a, this);
    L9:
        return true;
    }
}
