package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k00 extends p000.up1 {

    /* JADX INFO: renamed from: ι */
    public final java.util.HashMap f5689;

    public k00() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f5689 = r0
            return
    }

    @Override // p000.up1
    /* JADX INFO: renamed from: α */
    public final p000.rp1 mo3105(java.lang.Object r1) {
            r0 = this;
            java.util.HashMap r0 = r0.f5689
            java.lang.Object r0 = r0.get(r1)
            rp1 r0 = (p000.rp1) r0
            return r0
    }

    @Override // p000.up1
    /* JADX INFO: renamed from: β */
    public final java.lang.Object mo3106(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = super.mo3106(r2)
            java.util.HashMap r1 = r1.f5689
            r1.remove(r2)
            return r0
    }
}
