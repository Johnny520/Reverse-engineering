package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class hc2 extends p000.gc2 {

    /* JADX INFO: renamed from: κ */
    public p000.nm0 f4687;

    /* JADX INFO: renamed from: λ */
    public p000.nm0 f4688;

    /* JADX INFO: renamed from: μ */
    public p000.nm0 f4689;

    public hc2(p000.oc2 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f4687 = r1
            r0.f4688 = r1
            r0.f4689 = r1
            return
    }

    public hc2(p000.oc2 r1, p000.hc2 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f4687 = r1
            r0.f4688 = r1
            r0.f4689 = r1
            return
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: ι */
    public p000.nm0 mo2490() {
            r1 = this;
            nm0 r0 = r1.f4688
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.f3488
            android.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
            nm0 r0 = p000.nm0.m4081(r0)
            r1.f4688 = r0
        L10:
            nm0 r1 = r1.f4688
            return r1
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: λ */
    public p000.nm0 mo2491() {
            r1 = this;
            nm0 r0 = r1.f4687
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.f3488
            android.graphics.Insets r0 = r0.getSystemGestureInsets()
            nm0 r0 = p000.nm0.m4081(r0)
            r1.f4687 = r0
        L10:
            nm0 r1 = r1.f4687
            return r1
    }

    @Override // p000.lc2
    /* JADX INFO: renamed from: ν */
    public p000.nm0 mo2492() {
            r1 = this;
            nm0 r0 = r1.f4689
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.f3488
            android.graphics.Insets r0 = r0.getTappableElementInsets()
            nm0 r0 = p000.nm0.m4081(r0)
            r1.f4689 = r0
        L10:
            nm0 r1 = r1.f4689
            return r1
    }

    @Override // p000.ec2, p000.lc2
    /* JADX INFO: renamed from: ξ */
    public p000.oc2 mo1909(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f3488
            android.view.WindowInsets r0 = r0.inset(r1, r2, r3, r4)
            r1 = 0
            oc2 r0 = p000.oc2.m4220(r1, r0)
            return r0
    }
}
