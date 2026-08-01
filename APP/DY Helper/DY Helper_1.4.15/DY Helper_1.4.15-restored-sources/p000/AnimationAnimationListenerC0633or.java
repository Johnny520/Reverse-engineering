package p000;

/* JADX INFO: renamed from: or */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0633or implements android.view.animation.Animation.AnimationListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.C0697pr f8176;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.C0559mr f8177;

    public AnimationAnimationListenerC0633or(p000.mz1 r1, p000.C0697pr r2, p000.C0559mr r3) {
            r0 = this;
            r0.<init>()
            r0.f8176 = r2
            r0.f8177 = r3
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation r4) {
            r3 = this;
            r4.getClass()
            pr r4 = r3.f8176
            android.view.ViewGroup r0 = r4.f8663
            w1 r1 = new w1
            r2 = 10
            mr r3 = r3.f8177
            r1.<init>(r4, r2, r3)
            r0.post(r1)
            r3 = 2
            boolean r3 = p000.b70.m751(r3)
            if (r3 == 0) goto L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Animation from operation "
            r3.<init>(r4)
            r4 = 0
            r3.append(r4)
            java.lang.String r4 = " has ended."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L33:
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation r1) {
            r0 = this;
            r1.getClass()
            r0 = 2
            boolean r0 = p000.b70.m751(r0)
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Animation from operation "
            r0.<init>(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r1 = " has reached onAnimationStart."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L23:
            return
    }
}
