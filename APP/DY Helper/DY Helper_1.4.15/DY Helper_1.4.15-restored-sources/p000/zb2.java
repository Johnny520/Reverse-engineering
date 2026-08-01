package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class zb2 extends p000.dc2 {

    /* JADX INFO: renamed from: α */
    public final android.view.WindowInsets.Builder f13031;

    public zb2() {
            r1 = this;
            r1.<init>()
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
            r1.f13031 = r0
            return
    }

    public zb2(p000.oc2 r2) {
            r1 = this;
            r1.<init>(r2)
            android.view.WindowInsets r2 = r2.m4226()
            if (r2 == 0) goto Lf
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>(r2)
            goto L14
        Lf:
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
        L14:
            r1.f13031 = r0
            return
    }

    @Override // p000.dc2
    /* JADX INFO: renamed from: β */
    public p000.oc2 mo1698() {
            r2 = this;
            r2.m1697()
            android.view.WindowInsets$Builder r2 = r2.f13031
            android.view.WindowInsets r2 = r2.build()
            r0 = 0
            oc2 r2 = p000.oc2.m4220(r0, r2)
            lc2 r1 = r2.f8033
            r1.mo1912(r0)
            return r2
    }

    @Override // p000.dc2
    /* JADX INFO: renamed from: γ */
    public void mo1699(p000.nm0 r1) {
            r0 = this;
            android.view.WindowInsets$Builder r0 = r0.f13031
            android.graphics.Insets r1 = r1.m4082()
            r0.setStableInsets(r1)
            return
    }

    @Override // p000.dc2
    /* JADX INFO: renamed from: δ */
    public void mo1700(p000.nm0 r1) {
            r0 = this;
            android.view.WindowInsets$Builder r0 = r0.f13031
            android.graphics.Insets r1 = r1.m4082()
            r0.setSystemWindowInsets(r1)
            return
    }
}
