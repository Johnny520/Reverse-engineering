package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f60 {

    /* JADX INFO: renamed from: α */
    public final android.net.Uri f3758;

    /* JADX INFO: renamed from: β */
    public final int f3759;

    /* JADX INFO: renamed from: γ */
    public final int f3760;

    /* JADX INFO: renamed from: δ */
    public final boolean f3761;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f3762;

    /* JADX INFO: renamed from: ζ */
    public final int f3763;

    public f60(android.net.Uri r1, int r2, int r3, boolean r4, int r5) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.f3758 = r1
            r0.f3759 = r2
            r0.f3760 = r3
            r0.f3761 = r4
            r1 = 0
            r0.f3762 = r1
            r0.f3763 = r5
            return
    }

    public f60(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "systemfont"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            android.net.Uri$Builder r3 = r0.authority(r3)
            android.net.Uri r3 = r3.build()
            r2.f3758 = r3
            r3 = 0
            r2.f3759 = r3
            r0 = 400(0x190, float:5.6E-43)
            r2.f3760 = r0
            r2.f3761 = r3
            r2.f3762 = r4
            r2.f3763 = r3
            return
    }
}
