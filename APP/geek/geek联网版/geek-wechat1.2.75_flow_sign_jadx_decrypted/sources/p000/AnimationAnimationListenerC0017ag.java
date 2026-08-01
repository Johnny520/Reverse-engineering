package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: ag */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0017ag implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f79a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f80b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0067bg f81c;

    public AnimationAnimationListenerC0017ag(C0067bg c0067bg, View view, ViewGroup viewGroup) {
        this.f79a = viewGroup;
        this.f80b = view;
        this.f81c = c0067bg;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f79a.post(new RunnableC0325i7(3, this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
