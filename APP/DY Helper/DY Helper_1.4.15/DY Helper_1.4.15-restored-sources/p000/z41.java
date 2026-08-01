package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z41 implements android.window.OnBackAnimationCallback {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.a80 f12970;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.a80 f12971;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ p000.p70 f12972;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ p000.p70 f12973;

    public z41(p000.a80 r1, p000.a80 r2, p000.p70 r3, p000.p70 r4) {
            r0 = this;
            r0.<init>()
            r0.f12970 = r1
            r0.f12971 = r2
            r0.f12972 = r3
            r0.f12973 = r4
            return
    }

    public final void onBackCancelled() {
            r0 = this;
            p70 r0 = r0.f12973
            r0.invoke()
            return
    }

    public final void onBackInvoked() {
            r0 = this;
            p70 r0 = r0.f12972
            r0.invoke()
            return
    }

    public final void onBackProgressed(android.window.BackEvent r2) {
            r1 = this;
            r2.getClass()
            j8 r0 = new j8
            r0.<init>(r2)
            a80 r1 = r1.f12971
            r1.invoke(r0)
            return
    }

    public final void onBackStarted(android.window.BackEvent r2) {
            r1 = this;
            r2.getClass()
            j8 r0 = new j8
            r0.<init>(r2)
            a80 r1 = r1.f12970
            r1.invoke(r0)
            return
    }
}
