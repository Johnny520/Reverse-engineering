package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zk1 extends p000.bo1 {

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f13145;

    /* JADX INFO: renamed from: η */
    public final long f13146;

    /* JADX INFO: renamed from: θ */
    public final p000.rk1 f13147;

    public zk1(java.lang.String r1, long r2, p000.rk1 r4) {
            r0 = this;
            r0.<init>()
            r0.f13145 = r1
            r0.f13146 = r2
            r0.f13147 = r4
            return
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: η */
    public final long mo565() {
            r2 = this;
            long r0 = r2.f13146
            return r0
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: θ */
    public final p000.ez0 mo566() {
            r2 = this;
            r0 = 0
            java.lang.String r2 = r2.f13145
            if (r2 == 0) goto Lc
            ym1 r1 = p000.ez0.f3688
            ez0 r2 = p000.kn0.m3377(r2)     // Catch: java.lang.IllegalArgumentException -> Lc
            return r2
        Lc:
            return r0
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: κ */
    public final p000.InterfaceC0014ad mo567() {
            r0 = this;
            rk1 r0 = r0.f13147
            return r0
    }
}
