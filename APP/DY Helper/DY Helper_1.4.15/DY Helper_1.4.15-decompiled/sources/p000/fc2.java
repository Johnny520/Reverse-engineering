package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class fc2 extends p000.ec2 {

    /* JADX INFO: renamed from: ι */
    public p000.nm0 f3882;

    public fc2(p000.oc2 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f3882 = r1
            return
    }

    public fc2(p000.oc2 r1, p000.fc2 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f3882 = r1
            nm0 r1 = r2.f3882
            r0.f3882 = r1
            return
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: β */
    public p000.oc2 mo2095() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f3488
            android.view.WindowInsets r1 = r1.consumeStableInsets()
            r0 = 0
            oc2 r1 = p000.oc2.m4220(r0, r1)
            return r1
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: γ */
    public p000.oc2 mo2096() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f3488
            android.view.WindowInsets r1 = r1.consumeSystemWindowInsets()
            r0 = 0
            oc2 r1 = p000.oc2.m4220(r0, r1)
            return r1
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: κ */
    public final p000.nm0 mo2097() {
            r4 = this;
            nm0 r0 = r4.f3882
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.f3488
            int r1 = r0.getStableInsetLeft()
            int r2 = r0.getStableInsetTop()
            int r3 = r0.getStableInsetRight()
            int r0 = r0.getStableInsetBottom()
            nm0 r0 = p000.nm0.m4080(r1, r2, r3, r0)
            r4.f3882 = r0
        L1c:
            nm0 r4 = r4.f3882
            return r4
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: ο */
    public boolean mo2098() {
            r0 = this;
            android.view.WindowInsets r0 = r0.f3488
            boolean r0 = r0.isConsumed()
            return r0
    }
}
