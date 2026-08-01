package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 extends p000.AbstractC1095 {

    /* JADX INFO: renamed from: η */
    public int f9057;

    /* JADX INFO: renamed from: θ */
    public int f9058;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.ro1 f9059;

    public qo1(p000.ro1 r2) {
            r1 = this;
            r1.<init>()
            r1.f9059 = r2
            int r0 = r2.f9429
            r1.f9057 = r0
            int r2 = r2.f9428
            r1.f9058 = r2
            return
    }

    @Override // p000.AbstractC1095
    /* JADX INFO: renamed from: α */
    public final void mo1025() {
            r4 = this;
            int r0 = r4.f9057
            if (r0 != 0) goto L8
            r0 = 2
            r4.f13415 = r0
            return
        L8:
            ro1 r1 = r4.f9059
            java.lang.Object[] r2 = r1.f9426
            int r3 = r4.f9058
            r2 = r2[r3]
            r4.f13416 = r2
            r2 = 1
            r4.f13415 = r2
            int r3 = r3 + r2
            int r1 = r1.f9427
            int r3 = r3 % r1
            r4.f9058 = r3
            int r0 = r0 + (-1)
            r4.f9057 = r0
            return
    }
}
