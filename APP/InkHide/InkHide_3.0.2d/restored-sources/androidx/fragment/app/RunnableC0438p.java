package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p099y.ViewTreeObserverOnPreDrawListenerC1087s;

/* JADX INFO: renamed from: androidx.fragment.app.p */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0438p extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f1399a;

    /* JADX INFO: renamed from: b */
    public final View f1400b;

    /* JADX INFO: renamed from: c */
    public boolean f1401c;

    /* JADX INFO: renamed from: d */
    public boolean f1402d;

    /* JADX INFO: renamed from: e */
    public boolean f1403e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0438p(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1403e = true;
        this.f1399a = viewGroup;
        this.f1400b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1403e = true;
        if (this.f1401c) {
            return !this.f1402d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1401c = true;
            ViewTreeObserverOnPreDrawListenerC1087s.m2360a(this.f1399a, this);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1401c;
        ViewGroup viewGroup = this.f1399a;
        if (z2 || !this.f1403e) {
            viewGroup.endViewTransition(this.f1400b);
            this.f1402d = true;
        } else {
            this.f1403e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f) {
        this.f1403e = true;
        if (this.f1401c) {
            return !this.f1402d;
        }
        if (!super.getTransformation(j2, transformation, f)) {
            this.f1401c = true;
            ViewTreeObserverOnPreDrawListenerC1087s.m2360a(this.f1399a, this);
        }
        return true;
    }
}
