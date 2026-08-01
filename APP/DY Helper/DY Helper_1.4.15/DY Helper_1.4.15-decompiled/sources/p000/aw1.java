package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class aw1 extends p000.AbstractC1113 {

    /* JADX INFO: renamed from: α */
    public long f1351;

    /* JADX INFO: renamed from: β */
    public p000.C0015ae f1352;

    @Override // p000.AbstractC1113
    /* JADX INFO: renamed from: α */
    public final boolean mo616(p000.AbstractC1112 r5) {
            r4 = this;
            k12 r5 = (p000.k12) r5
            long r0 = r4.f1351
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto Lc
            r4 = 0
            return r4
        Lc:
            long r0 = r5.f5707
            long r2 = r5.f5708
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L16
            r5.f5708 = r0
        L16:
            r4.f1351 = r0
            r4 = 1
            return r4
    }

    @Override // p000.AbstractC1113
    /* JADX INFO: renamed from: β */
    public final p000.InterfaceC0631op[] mo617(p000.AbstractC1112 r5) {
            r4 = this;
            k12 r5 = (p000.k12) r5
            long r0 = r4.f1351
            r2 = -1
            r4.f1351 = r2
            r2 = 0
            r4.f1352 = r2
            op[] r4 = r5.m3122(r0)
            return r4
    }
}
