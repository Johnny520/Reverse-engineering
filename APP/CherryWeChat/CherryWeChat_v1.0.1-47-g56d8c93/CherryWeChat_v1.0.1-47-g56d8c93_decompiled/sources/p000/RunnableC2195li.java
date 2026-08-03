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

    public RunnableC2195li(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f7652e = true;
        this.f7648a = viewGroup;
        this.f7649b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f7652e = true;
        if (this.f7650c) {
            return !this.f7651d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f7650c = true;
            ViewTreeObserverOnPreDrawListenerC2515st.m4996a(this.f7648a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f7650c;
        ViewGroup viewGroup = this.f7648a;
        if (z || !this.f7652e) {
            viewGroup.endViewTransition(this.f7649b);
            this.f7651d = true;
        } else {
            this.f7652e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f7652e = true;
        if (this.f7650c) {
            return !this.f7651d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f7650c = true;
            ViewTreeObserverOnPreDrawListenerC2515st.m4996a(this.f7648a, this);
        }
        return true;
    }
}
