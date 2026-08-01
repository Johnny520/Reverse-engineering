package p000;

/* JADX INFO: renamed from: ya */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1014ya extends p000.q01 implements p000.zr1 {

    /* JADX INFO: renamed from: Α */
    public final p000.C0318gd f12510;

    /* JADX INFO: renamed from: τ */
    public final int f12511;

    /* JADX INFO: renamed from: υ */
    public p000.q01 f12512;

    /* JADX INFO: renamed from: φ */
    public p000.C0828ta f12513;

    /* JADX INFO: renamed from: χ */
    public float f12514;

    /* JADX INFO: renamed from: ψ */
    public p000.px1 f12515;

    /* JADX INFO: renamed from: ω */
    public p000.iv1 f12516;

    public C1014ya(float r6, p000.px1 r7, p000.iv1 r8) {
            r5 = this;
            r5.<init>()
            int r0 = p000.r31.m5058(r5)
            r5.f12511 = r0
            r5.f12514 = r6
            r5.f12515 = r7
            r5.f12516 = r8
            θ r6 = new θ
            r7 = 4
            r6.<init>(r7, r5)
            gd r7 = new gd
            hd r8 = new hd
            r8.<init>()
            x r0 = p000.C0966x.f11924
            r8.f4690 = r0
            r7.<init>(r8, r6)
            q01 r6 = r7.f8771
            if (r6 == r7) goto L3c
            q01 r8 = r7.f8775
            q01 r0 = r5.f8771
            if (r6 != r0) goto L35
            boolean r6 = p000.ln0.m3626(r8, r5)
            if (r6 == 0) goto L35
            goto Le8
        L35:
            java.lang.String r5 = "Cannot delegate to an already delegated node"
            p000.C1080.m7279(r5)
            r5 = 0
            throw r5
        L3c:
            boolean r8 = r6.f8784
            if (r8 == 0) goto L45
            java.lang.String r8 = "Cannot delegate to an already attached node"
            p000.am0.m178(r8)
        L45:
            q01 r8 = r5.f8771
            r6.mo4646(r8)
            int r8 = r5.f8773
            int r0 = p000.r31.m5059(r6)
            r6.f8773 = r0
            int r1 = r5.f8773
            r2 = r0 & 2
            if (r2 == 0) goto L79
            r1 = r1 & 2
            if (r1 == 0) goto L79
            boolean r1 = r5 instanceof p000.qp0
            if (r1 != 0) goto L79
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r3 = "\nDelegate Node: "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            p000.am0.m178(r1)
        L79:
            q01 r1 = r5.f12512
            r6.f8776 = r1
            r5.f12512 = r6
            r6.f8775 = r5
            int r1 = r5.f8773
            r0 = r0 | r1
            r5.f8773 = r0
            if (r1 == r0) goto Lb4
            q01 r1 = r5.f8771
            if (r1 != r5) goto L8e
            r5.f8774 = r0
        L8e:
            boolean r3 = r5.f8784
            if (r3 == 0) goto Lb4
            r3 = r5
        L93:
            if (r3 == 0) goto L9f
            int r4 = r3.f8773
            r0 = r0 | r4
            r3.f8773 = r0
            if (r3 == r1) goto L9f
            q01 r3 = r3.f8775
            goto L93
        L9f:
            if (r3 == 0) goto La8
            q01 r1 = r3.f8776
            if (r1 == 0) goto La8
            int r1 = r1.f8774
            goto La9
        La8:
            r1 = 0
        La9:
            r0 = r0 | r1
        Laa:
            if (r3 == 0) goto Lb4
            int r1 = r3.f8773
            r0 = r0 | r1
            r3.f8774 = r0
            q01 r3 = r3.f8775
            goto Laa
        Lb4:
            boolean r0 = r5.f8784
            if (r0 == 0) goto Le8
            if (r2 == 0) goto Lcf
            r8 = r8 & 2
            if (r8 == 0) goto Lbf
            goto Lcf
        Lbf:
            yp0 r8 = p000.h62.m2445(r5)
            k31 r8 = r8.f12733
            q01 r0 = r5.f8771
            r1 = 0
            r0.mo4647(r1)
            r8.m3147()
            goto Ld4
        Lcf:
            q31 r8 = r5.f8778
            r5.mo4647(r8)
        Ld4:
            r6.mo4649()
            r6.mo4652()
            boolean r8 = r6.f8784
            if (r8 != 0) goto Le3
            java.lang.String r8 = "autoInvalidateInsertedNode called on unattached node"
            p000.am0.m178(r8)
        Le3:
            r8 = -1
            r0 = 1
            p000.r31.m5055(r6, r8, r0)
        Le8:
            r5.f12510 = r7
            return
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: Ω */
    public final void mo600(p000.js1 r1) {
            r0 = this;
            iv1 r0 = r0.f12516
            p000.hs1.m2529(r1, r0)
            return
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: γ */
    public final boolean mo2339() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: А */
    public final void mo4646(p000.q01 r1) {
            r0 = this;
            r0.f8771 = r1
            q01 r0 = r0.f12512
        L4:
            if (r0 == 0) goto Lc
            r0.mo4646(r1)
            q01 r0 = r0.f8776
            goto L4
        Lc:
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: Б */
    public final void mo4647(p000.q31 r1) {
            r0 = this;
            r0.f8778 = r1
            q01 r0 = r0.f12512
        L4:
            if (r0 == 0) goto Lc
            r0.mo4647(r1)
            q01 r0 = r0.f8776
            goto L4
        Lc:
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ф */
    public final boolean mo1140() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: х */
    public final void mo4649() {
            r2 = this;
            super.mo4649()
            q01 r0 = r2.f12512
        L5:
            if (r0 == 0) goto L16
            q31 r1 = r2.f8778
            r0.mo4647(r1)
            boolean r1 = r0.f8784
            if (r1 != 0) goto L13
            r0.mo4649()
        L13:
            q01 r0 = r0.f8776
            goto L5
        L16:
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ц */
    public final void mo4650() {
            r1 = this;
            q01 r0 = r1.f12512
        L2:
            if (r0 == 0) goto La
            r0.mo4650()
            q01 r0 = r0.f8776
            goto L2
        La:
            super.mo4650()
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: э */
    public final void mo4651() {
            r0 = this;
            super.mo4651()
            q01 r0 = r0.f12512
        L5:
            if (r0 == 0) goto Ld
            r0.mo4651()
            q01 r0 = r0.f8776
            goto L5
        Ld:
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ю */
    public final void mo4652() {
            r1 = this;
            q01 r0 = r1.f12512
        L2:
            if (r0 == 0) goto La
            r0.mo4652()
            q01 r0 = r0.f8776
            goto L2
        La:
            super.mo4652()
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: я */
    public final void mo4653() {
            r0 = this;
            super.mo4653()
            q01 r0 = r0.f12512
        L5:
            if (r0 == 0) goto Ld
            r0.mo4653()
            q01 r0 = r0.f8776
            goto L5
        Ld:
            return
    }
}
