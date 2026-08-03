package p000;

import android.view.View;
import android.view.animation.Animation;
import java.util.Objects;

/* JADX INFO: renamed from: md */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC2233md implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0557My f7872a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2276nd f7873b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f7874c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2099jd f7875d;

    public AnimationAnimationListenerC2233md(C0557My c0557My, C2276nd c2276nd, View view, C2099jd c2099jd) {
        this.f7872a = c0557My;
        this.f7873b = c2276nd;
        this.f7874c = view;
        this.f7875d = c2099jd;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C2276nd c2276nd = this.f7873b;
        c2276nd.f8009a.post(new RunnableC2445r8(c2276nd, this.f7874c, this.f7875d, 2));
        if (AbstractC2805zi.m5374G(2)) {
            Objects.toString(this.f7872a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (AbstractC2805zi.m5374G(2)) {
            Objects.toString(this.f7872a);
        }
    }
}
