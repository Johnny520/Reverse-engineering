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

    public AnimationAnimationListenerC2233md(C0557My r1, C2276nd r2, View r3, C2099jd r4) {
        this.f7872a = r1;
        this.f7873b = r2;
        this.f7874c = r3;
        this.f7875d = r4;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation r6) {
        C2276nd r62 = this.f7873b;
        r62.f8009a.post(new RunnableC2445r8(r62, this.f7874c, this.f7875d, 2));
        if (AbstractC2805zi.m5374G(2) == false) goto L6;
        Objects.toString(this.f7872a);
        return;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation r1) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation r1) {
        if (AbstractC2805zi.m5374G(2) == false) goto L6;
        Objects.toString(this.f7872a);
        return;
    }
}
