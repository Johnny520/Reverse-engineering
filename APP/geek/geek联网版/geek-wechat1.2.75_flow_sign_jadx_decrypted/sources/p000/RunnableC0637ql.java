package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: ql */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0637ql extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f3922a;

    /* JADX INFO: renamed from: b */
    public final View f3923b;

    /* JADX INFO: renamed from: c */
    public boolean f3924c;

    /* JADX INFO: renamed from: d */
    public boolean f3925d;

    /* JADX INFO: renamed from: e */
    public boolean f3926e;

    public RunnableC0637ql(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f3926e = true;
        this.f3922a = viewGroup;
        this.f3923b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f3926e = true;
        if (this.f3924c) {
            return !this.f3925d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f3924c = true;
            ViewTreeObserverOnPreDrawListenerC0427kx.m1722a(this.f3922a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f3924c;
        ViewGroup viewGroup = this.f3922a;
        if (z || !this.f3926e) {
            viewGroup.endViewTransition(this.f3923b);
            this.f3925d = true;
        } else {
            this.f3926e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f3926e = true;
        if (this.f3924c) {
            return !this.f3925d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f3924c = true;
            ViewTreeObserverOnPreDrawListenerC0427kx.m1722a(this.f3922a, this);
        }
        return true;
    }
}
