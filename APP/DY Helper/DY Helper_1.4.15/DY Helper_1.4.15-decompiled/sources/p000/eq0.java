package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class eq0 implements p000.qx0 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3636;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ int f3637;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.util.Map f3638;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ p000.a80 f3639;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.fq0 f3640;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.kq0 f3641;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.a80 f3642;

    public eq0(int r1, int r2, java.util.Map r3, p000.a80 r4, p000.fq0 r5, p000.kq0 r6, p000.a80 r7) {
            r0 = this;
            r0.<init>()
            r0.f3636 = r1
            r0.f3637 = r2
            r0.f3638 = r3
            r0.f3639 = r4
            r0.f3640 = r5
            r0.f3641 = r6
            r0.f3642 = r7
            return
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: α */
    public final void mo1622() {
            r2 = this;
            kq0 r0 = r2.f3641
            yp0 r0 = r0.f6080
            fq0 r1 = r2.f3640
            boolean r1 = r1.mo1610()
            a80 r2 = r2.f3642
            if (r1 == 0) goto L1c
            k31 r1 = r0.f12733
            gm0 r1 = r1.f5726
            fm0 r1 = r1.f4420
            if (r1 == 0) goto L1c
            ew0 r0 = r1.f3310
            r2.invoke(r0)
            return
        L1c:
            k31 r0 = r0.f12733
            gm0 r0 = r0.f5726
            ew0 r0 = r0.f3310
            r2.invoke(r0)
            return
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: β */
    public final int mo1623() {
            r0 = this;
            int r0 = r0.f3637
            return r0
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: γ */
    public final java.util.Map mo1624() {
            r0 = this;
            java.util.Map r0 = r0.f3638
            return r0
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: δ */
    public final p000.a80 mo1625() {
            r0 = this;
            a80 r0 = r0.f3639
            return r0
    }

    @Override // p000.qx0
    /* JADX INFO: renamed from: ε */
    public final int mo1626() {
            r0 = this;
            int r0 = r0.f3636
            return r0
    }
}
