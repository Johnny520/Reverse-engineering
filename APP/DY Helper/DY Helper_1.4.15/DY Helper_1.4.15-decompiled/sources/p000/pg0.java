package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pg0 implements p000.InterfaceC0676p6 {

    /* JADX INFO: renamed from: ε */
    public final int f8548;

    /* JADX INFO: renamed from: ζ */
    public int f8549;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f8550;

    public pg0() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            pg0[] r0 = new p000.pg0[r0]
            r1.f8550 = r0
            r0 = 0
            r1.f8548 = r0
            r1.f8549 = r0
            return
    }

    public pg0(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f8550 = r0
            r1.f8548 = r2
            r2 = r3 & 7
            if (r2 != 0) goto Le
            r2 = 8
        Le:
            r1.f8549 = r2
            return
    }

    public pg0(p000.InterfaceC0676p6 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f8550 = r1
            r0.f8548 = r2
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: α */
    public void mo3772(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Object r0 = r2.f8550
            p6 r0 = (p000.InterfaceC0676p6) r0
            int r1 = r2.f8549
            if (r1 != 0) goto Lb
            int r2 = r2.f8548
            goto Lc
        Lb:
            r2 = 0
        Lc:
            int r3 = r3 + r2
            r0.mo3772(r3, r4)
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: γ */
    public void mo3773(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f8549
            int r0 = r0 + 1
            r1.f8549 = r0
            java.lang.Object r1 = r1.f8550
            p6 r1 = (p000.InterfaceC0676p6) r1
            r1.mo3773(r2)
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: δ */
    public void mo3774() {
            r0 = this;
            java.lang.Object r0 = r0.f8550
            p6 r0 = (p000.InterfaceC0676p6) r0
            r0.mo3774()
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: ε */
    public void mo3775(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Object r0 = r2.f8550
            p6 r0 = (p000.InterfaceC0676p6) r0
            int r1 = r2.f8549
            if (r1 != 0) goto Lb
            int r2 = r2.f8548
            goto Lc
        Lb:
            r2 = 0
        Lc:
            int r3 = r3 + r2
            r0.mo3775(r3, r4)
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: η */
    public void mo3777(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.f8549
            if (r0 != 0) goto L7
            int r0 = r1.f8548
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.Object r1 = r1.f8550
            p6 r1 = (p000.InterfaceC0676p6) r1
            int r2 = r2 + r0
            int r3 = r3 + r0
            r1.mo3777(r2, r3, r4)
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: θ */
    public java.lang.Object mo3778() {
            r0 = this;
            java.lang.Object r0 = r0.f8550
            p6 r0 = (p000.InterfaceC0676p6) r0
            java.lang.Object r0 = r0.mo3778()
            return r0
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: ι */
    public void mo3779(int r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r2.f8550
            p6 r0 = (p000.InterfaceC0676p6) r0
            int r1 = r2.f8549
            if (r1 != 0) goto Lb
            int r2 = r2.f8548
            goto Lc
        Lb:
            r2 = 0
        Lc:
            int r3 = r3 + r2
            r0.mo3779(r3, r4)
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: κ */
    public void mo4383(p000.e80 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r0.f8550
            p6 r0 = (p000.InterfaceC0676p6) r0
            r0.mo4383(r1, r2)
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: μ */
    public void mo3780() {
            r1 = this;
            int r0 = r1.f8549
            if (r0 <= 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "OffsetApplier up called with no corresponding down"
            p000.AbstractC0804sn.m5526(r0)
        La:
            int r0 = r1.f8549
            int r0 = r0 + (-1)
            r1.f8549 = r0
            java.lang.Object r1 = r1.f8550
            p6 r1 = (p000.InterfaceC0676p6) r1
            r1.mo3780()
            return
    }
}
