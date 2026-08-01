package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: ol */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0563ol extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f3550a;

    /* JADX INFO: renamed from: b */
    public final View f3551b;

    /* JADX INFO: renamed from: c */
    public boolean f3552c;

    /* JADX INFO: renamed from: d */
    public boolean f3553d;

    /* JADX INFO: renamed from: e */
    public boolean f3554e;

    public RunnableC0563ol(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f3554e = true;
        this.f3550a = viewGroup;
        this.f3551b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f3554e = true;
        if (this.f3552c) {
            return !this.f3553d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f3552c = true;
            ViewTreeObserverOnPreDrawListenerC0130cx.m832a(this.f3550a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f3552c;
        ViewGroup viewGroup = this.f3550a;
        if (z || !this.f3554e) {
            viewGroup.endViewTransition(this.f3551b);
            this.f3553d = true;
        } else {
            this.f3554e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f3554e = true;
        if (this.f3552c) {
            return !this.f3553d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f3552c = true;
            ViewTreeObserverOnPreDrawListenerC0130cx.m832a(this.f3550a, this);
        }
        return true;
    }
}
