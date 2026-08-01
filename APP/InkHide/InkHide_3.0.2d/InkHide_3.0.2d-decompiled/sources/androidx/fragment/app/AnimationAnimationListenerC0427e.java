package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p006D.RunnableC0073b;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0427e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f1322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0428f f1324c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AnimationAnimationListenerC0427e(ViewGroup viewGroup, View view, C0428f c0428f) {
        this.f1322a = viewGroup;
        this.f1323b = view;
        this.f1324c = c0428f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1322a.post(new RunnableC0073b(2, this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
