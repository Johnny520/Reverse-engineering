package p000;

/* JADX INFO: renamed from: kg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0468kg extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ android.view.View f5896;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ float f5897;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ int f5898;

    public C0468kg(float r1, int r2, android.view.View r3) {
            r0 = this;
            r0.f5896 = r3
            r0.f5897 = r1
            r0.f5898 = r2
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r3) {
            r2 = this;
            r3.getClass()
            android.view.View r2 = r2.f5896
            r0 = 2131618514(0x7f0dead2, float:1.886404E38)
            java.lang.Object r1 = r2.getTag(r0)
            if (r1 != r3) goto L12
            r3 = 0
            r2.setTag(r0, r3)
        L12:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r4) {
            r3 = this;
            r4.getClass()
            android.view.View r0 = r3.f5896
            r1 = 2131618514(0x7f0dead2, float:1.886404E38)
            java.lang.Object r2 = r0.getTag(r1)
            if (r2 == r4) goto Lf
            goto L3b
        Lf:
            r4 = 0
            r0.setTag(r1, r4)
            tg r4 = p000.AbstractC0871ug.f10771
            float r4 = r3.f5897
            p000.C0834tg.m5677(r0, r4)
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 > 0) goto L3b
            int r3 = r3.f5898
            boolean r3 = p000.C0834tg.m5678(r3)
            if (r3 == 0) goto L3b
            r3 = 2131618521(0x7f0dead9, float:1.8864055E38)
            java.lang.Object r3 = r0.getTag(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L3b
            r3 = 8
            p000.C0834tg.m5639(r0, r3)
        L3b:
            return
    }
}
