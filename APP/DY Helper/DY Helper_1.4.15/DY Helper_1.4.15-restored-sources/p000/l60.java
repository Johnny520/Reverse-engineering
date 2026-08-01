package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l60 extends p000.AbstractC0978xb {

    /* JADX INFO: renamed from: φ */
    public final /* synthetic */ p000.n60 f6454;

    public l60(p000.n60 r1) {
            r0 = this;
            r0.<init>()
            r0.f6454 = r1
            return
    }

    @Override // p000.AbstractC0978xb
    /* JADX INFO: renamed from: Ρ */
    public final android.view.View mo3521(int r3) {
            r2 = this;
            n60 r2 = r2.f6454
            r2.getClass()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " does not have a view"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // p000.AbstractC0978xb
    /* JADX INFO: renamed from: Σ */
    public final boolean mo3522() {
            r0 = this;
            n60 r0 = r0.f6454
            r0.getClass()
            r0 = 0
            return r0
    }
}
