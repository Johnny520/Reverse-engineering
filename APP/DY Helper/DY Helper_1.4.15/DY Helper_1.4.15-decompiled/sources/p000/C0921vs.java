package p000;

/* JADX INFO: renamed from: vs */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0921vs extends p000.AbstractC0978xb {

    /* JADX INFO: renamed from: φ */
    public final /* synthetic */ p000.l60 f11373;

    /* JADX INFO: renamed from: χ */
    public final /* synthetic */ p000.DialogInterfaceOnCancelListenerC0958ws f11374;

    public C0921vs(p000.DialogInterfaceOnCancelListenerC0958ws r1, p000.l60 r2) {
            r0 = this;
            r0.<init>()
            r0.f11374 = r1
            r0.f11373 = r2
            return
    }

    @Override // p000.AbstractC0978xb
    /* JADX INFO: renamed from: Ρ */
    public final android.view.View mo3521(int r2) {
            r1 = this;
            l60 r0 = r1.f11373
            r0.mo3522()
            ws r1 = r1.f11374
            xm r1 = r1.f11845
            if (r1 == 0) goto L10
            android.view.View r1 = r1.findViewById(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // p000.AbstractC0978xb
    /* JADX INFO: renamed from: Σ */
    public final boolean mo3522() {
            r1 = this;
            l60 r0 = r1.f11373
            r0.mo3522()
            ws r1 = r1.f11374
            boolean r1 = r1.f11848
            if (r1 == 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }
}
