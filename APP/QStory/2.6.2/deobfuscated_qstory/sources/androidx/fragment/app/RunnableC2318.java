package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC2203;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2318 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f6810;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f6811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View f6812;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f6813;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ViewGroup f6814;

    public RunnableC2318(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f6810 = true;
        this.f6814 = viewGroup;
        this.f6812 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f6810 = true;
        if (this.f6813) {
            return !this.f6811;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f6813 = true;
            ViewTreeObserverOnPreDrawListenerC2203.m4000(this.f6814, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f6813;
        ViewGroup viewGroup = this.f6814;
        if (z || !this.f6810) {
            viewGroup.endViewTransition(this.f6812);
            this.f6811 = true;
        } else {
            this.f6810 = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f6810 = true;
        if (this.f6813) {
            return !this.f6811;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f6813 = true;
            ViewTreeObserverOnPreDrawListenerC2203.m4000(this.f6814, this);
        }
        return true;
    }
}
