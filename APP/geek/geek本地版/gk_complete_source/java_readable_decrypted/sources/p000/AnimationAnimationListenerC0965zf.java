package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: zf */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0965zf implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f5554a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f5555b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0017ag f5556c;

    public AnimationAnimationListenerC0965zf(C0017ag c0017ag, View view, ViewGroup viewGroup) {
        this.f5554a = viewGroup;
        this.f5555b = view;
        this.f5556c = c0017ag;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f5554a.post(new RunnableC0919y6(3, this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
