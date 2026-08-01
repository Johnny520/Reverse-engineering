package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class do0 extends p000.co0 {

    /* JADX INFO: renamed from: ι */
    public final p000.fo0 f3226;

    /* JADX INFO: renamed from: κ */
    public final p000.eo0 f3227;

    /* JADX INFO: renamed from: λ */
    public final p000.C0722qf f3228;

    /* JADX INFO: renamed from: μ */
    public final java.lang.Object f3229;

    public do0(p000.fo0 r1, p000.eo0 r2, p000.C0722qf r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.f3226 = r1
            r0.f3227 = r2
            r0.f3228 = r3
            r0.f3229 = r4
            return
    }

    @Override // p000.co0
    /* JADX INFO: renamed from: λ */
    public final boolean mo1280() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.co0
    /* JADX INFO: renamed from: μ */
    public final void mo1281(java.lang.Throwable r6) {
            r5 = this;
            qf r6 = r5.f3228
            qf r0 = p000.fo0.m2156(r6)
            fo0 r1 = r5.f3226
            eo0 r2 = r5.f3227
            java.lang.Object r5 = r5.f3229
            if (r0 == 0) goto L15
            boolean r0 = r1.m2179(r2, r0, r5)
            if (r0 == 0) goto L15
            goto L2c
        L15:
            s31 r0 = r2.f3621
            au0 r3 = new au0
            r4 = 2
            r3.<init>(r4)
            r0.m3387(r3, r4)
            qf r6 = p000.fo0.m2156(r6)
            if (r6 == 0) goto L2d
            boolean r6 = r1.m2179(r2, r6, r5)
            if (r6 == 0) goto L2d
        L2c:
            return
        L2d:
            java.lang.Object r5 = r1.m2158(r2, r5)
            r1.mo2181(r5)
            return
    }
}
