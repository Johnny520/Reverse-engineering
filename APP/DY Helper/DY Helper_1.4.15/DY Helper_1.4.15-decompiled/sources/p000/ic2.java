package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ic2 extends p000.hc2 {

    /* JADX INFO: renamed from: ν */
    public static final p000.oc2 f5002 = null;

    static {
            android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
            r1 = 0
            oc2 r0 = p000.oc2.m4220(r1, r0)
            p000.ic2.f5002 = r0
            return
    }

    public ic2(p000.oc2 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ic2(p000.oc2 r1, p000.ic2 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // p000.ec2, p000.lc2
    /* JADX INFO: renamed from: δ */
    public final void mo1904(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // p000.ec2, p000.lc2
    /* JADX INFO: renamed from: η */
    public p000.nm0 mo1906(int r1) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f3488
            int r1 = p000.mc2.m3803(r1)
            android.graphics.Insets r0 = r0.getInsets(r1)
            nm0 r0 = p000.nm0.m4081(r0)
            return r0
    }

    @Override // p000.ec2, p000.lc2
    /* JADX INFO: renamed from: θ */
    public p000.nm0 mo1907(int r1) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f3488
            int r1 = p000.mc2.m3803(r1)
            android.graphics.Insets r0 = r0.getInsetsIgnoringVisibility(r1)
            nm0 r0 = p000.nm0.m4081(r0)
            return r0
    }

    @Override // p000.ec2, p000.lc2
    /* JADX INFO: renamed from: ρ */
    public boolean mo1911(int r1) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f3488
            int r1 = p000.mc2.m3803(r1)
            boolean r0 = r0.isVisible(r1)
            return r0
    }
}
