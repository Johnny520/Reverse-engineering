package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC2203;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2318 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f6811;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f6812;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View f6813;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f6814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ViewGroup f6815;

    public RunnableC2318(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f6811 = true;
        this.f6815 = viewGroup;
        this.f6813 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f6811 = true;
        if (this.f6814) {
            return !this.f6812;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f6814 = true;
            ViewTreeObserverOnPreDrawListenerC2203.m4010(this.f6815, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f6814;
        ViewGroup viewGroup = this.f6815;
        if (z || !this.f6811) {
            viewGroup.endViewTransition(this.f6813);
            this.f6812 = true;
        } else {
            this.f6811 = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f6811 = true;
        if (this.f6814) {
            return !this.f6812;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f6814 = true;
            ViewTreeObserverOnPreDrawListenerC2203.m4010(this.f6815, this);
        }
        return true;
    }
}
