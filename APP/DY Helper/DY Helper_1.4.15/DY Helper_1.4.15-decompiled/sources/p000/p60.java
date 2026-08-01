package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p60 extends p000.AbstractC0978xb implements p000.r92, p000.hr0, p000.kq1, p000.f70 {

    /* JADX INFO: renamed from: Α */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f8429;

    /* JADX INFO: renamed from: φ */
    public final androidx.fragment.app.FragmentActivity f8430;

    /* JADX INFO: renamed from: χ */
    public final androidx.fragment.app.FragmentActivity f8431;

    /* JADX INFO: renamed from: ψ */
    public final android.os.Handler f8432;

    /* JADX INFO: renamed from: ω */
    public final p000.b70 f8433;

    public p60(androidx.fragment.app.FragmentActivity r3) {
            r2 = this;
            r2.<init>()
            r2.f8429 = r3
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            b70 r1 = new b70
            r1.<init>()
            r2.f8433 = r1
            r2.f8430 = r3
            r2.f8431 = r3
            r2.f8432 = r0
            return
    }

    @Override // p000.AbstractC0978xb
    /* JADX INFO: renamed from: Ρ */
    public final android.view.View mo3521(int r1) {
            r0 = this;
            androidx.fragment.app.FragmentActivity r0 = r0.f8429
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    @Override // p000.AbstractC0978xb
    /* JADX INFO: renamed from: Σ */
    public final boolean mo3522() {
            r0 = this;
            androidx.fragment.app.FragmentActivity r0 = r0.f8429
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L10
            android.view.View r0 = r0.peekDecorView()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: α */
    public final p000.C0574n5 mo189() {
            r0 = this;
            androidx.fragment.app.FragmentActivity r0 = r0.f8429
            n5 r0 = r0.f343
            java.lang.Object r0 = r0.f7388
            n5 r0 = (p000.C0574n5) r0
            return r0
    }

    @Override // p000.f70
    /* JADX INFO: renamed from: β */
    public final void mo2040() {
            r0 = this;
            return
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: γ */
    public final p000.q92 mo191() {
            r0 = this;
            androidx.fragment.app.FragmentActivity r0 = r0.f8429
            q92 r0 = r0.mo191()
            return r0
    }

    @Override // p000.hr0
    /* JADX INFO: renamed from: δ */
    public final p000.jr0 mo192() {
            r0 = this;
            androidx.fragment.app.FragmentActivity r0 = r0.f8429
            jr0 r0 = r0.f1097
            return r0
    }
}
