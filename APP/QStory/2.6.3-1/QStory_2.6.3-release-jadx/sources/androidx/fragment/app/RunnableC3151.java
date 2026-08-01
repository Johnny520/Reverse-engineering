package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC3036;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3151 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f7156;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f7157;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View f7158;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7159;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ViewGroup f7160;

    public RunnableC3151(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f7156 = true;
        this.f7160 = viewGroup;
        this.f7158 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f7156 = true;
        if (this.f7159) {
            return !this.f7157;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f7159 = true;
            ViewTreeObserverOnPreDrawListenerC3036.m4570(this.f7160, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f7159;
        ViewGroup viewGroup = this.f7160;
        if (z || !this.f7156) {
            viewGroup.endViewTransition(this.f7158);
            this.f7157 = true;
        } else {
            this.f7156 = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f7156 = true;
        if (this.f7159) {
            return !this.f7157;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f7159 = true;
            ViewTreeObserverOnPreDrawListenerC3036.m4570(this.f7160, this);
        }
        return true;
    }
}
