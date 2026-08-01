package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 implements p000.i12, p000.rx0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.fq0 f2720;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.kq0 f2721;

    public cq0(p000.kq0 r1) {
            r0 = this;
            r0.<init>()
            r0.f2721 = r1
            fq0 r1 = r1.f6086
            r0.f2720 = r1
            return
    }

    @Override // p000.rx0
    public final p000.np0 getLayoutDirection() {
            r0 = this;
            fq0 r0 = r0.f2720
            np0 r0 = r0.f4063
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Θ */
    public final float mo581(long r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            float r0 = r0.mo581(r1)
            return r0
    }

    @Override // p000.rx0
    /* JADX INFO: renamed from: Ν */
    public final p000.qx0 mo1609(int r1, int r2, java.util.Map r3, p000.a80 r4, p000.a80 r5) {
            r0 = this;
            fq0 r0 = r0.f2720
            qx0 r0 = r0.mo1609(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Ξ */
    public final int mo583(float r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            int r0 = r0.mo583(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: Ψ */
    public final long mo584(long r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            long r0 = r0.mo584(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            fq0 r0 = r0.f2720
            float r0 = r0.f4064
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            fq0 r0 = r0.f2720
            float r0 = r0.f4065
            return r0
    }

    @Override // p000.rx0
    /* JADX INFO: renamed from: ν */
    public final boolean mo1610() {
            r0 = this;
            fq0 r0 = r0.f2720
            boolean r0 = r0.mo1610()
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: σ */
    public final long mo592(float r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            long r0 = r0.mo592(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: τ */
    public final long mo593(long r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            long r0 = r0.mo593(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: υ */
    public final float mo594(float r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            float r0 = r0.mo586()
            float r0 = r0 * r1
            return r0
    }

    @Override // p000.i12
    /* JADX INFO: renamed from: φ */
    public final java.util.List mo1611(p000.e80 r11) {
            r10 = this;
            kq0 r10 = r10.f2721
            yp0 r0 = r10.f6080
            b21 r1 = r10.f6085
            s62 r2 = p000.s62.f9751
            java.lang.Object r3 = r1.m695(r2)
            yp0 r3 = (p000.yp0) r3
            if (r3 == 0) goto L29
            java.util.List r4 = r0.m7000()
            h21 r4 = (p000.h21) r4
            k21 r4 = r4.f4540
            int r4 = r4.m3134(r3)
            int r5 = r10.f6082
            if (r4 >= r5) goto L29
            bq0 r10 = r3.f12734
            ox0 r10 = r10.f1815
            java.util.List r10 = r10.m4329()
            return r10
        L29:
            b21 r3 = r10.f6090
            b21 r4 = r10.f6088
            k21 r5 = r10.f6091
            int r6 = r5.f5718
            int r7 = r10.f6083
            if (r6 < r7) goto L36
            goto L3b
        L36:
            java.lang.String r6 = "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."
            p000.am0.m177(r6)
        L3b:
            java.lang.Object r6 = r1.m695(r2)
            yp0 r6 = (p000.yp0) r6
            int r7 = r5.f5718
            int r8 = r10.f6083
            if (r7 != r8) goto L4b
            r5.m3127(r2)
            goto L51
        L4b:
            java.lang.Object[] r5 = r5.f5716
            r7 = r5[r8]
            r5[r8] = r2
        L51:
            int r5 = r10.f6083
            r7 = 1
            int r5 = r5 + r7
            r10.f6083 = r5
            boolean r5 = r4.m690(r2)
            r8 = 0
            if (r5 != 0) goto Ldb
            if (r6 != 0) goto Ldb
            boolean r5 = r0.m6977()
            if (r5 != 0) goto L67
            goto Lc5
        L67:
            r10.m3406()
            boolean r1 = r1.m691(r2)
            if (r1 != 0) goto Lc5
            r3.m699(r2)
            java.lang.Object r1 = r4.m695(r2)
            if (r1 != 0) goto Lbe
            yp0 r1 = r10.m3411()
            if (r1 == 0) goto L9e
            java.util.List r5 = r0.m7000()
            h21 r5 = (p000.h21) r5
            k21 r5 = r5.f4540
            int r5 = r5.m3134(r1)
            java.util.List r6 = r0.m7000()
            h21 r6 = (p000.h21) r6
            k21 r6 = r6.f4540
            int r6 = r6.f5718
            r10.m3408(r5, r6)
            int r5 = r10.f6093
            int r5 = r5 + r7
            r10.f6093 = r5
            goto Lbb
        L9e:
            java.util.List r1 = r0.m7000()
            h21 r1 = (p000.h21) r1
            k21 r1 = r1.f4540
            int r1 = r1.f5718
            yp0 r5 = new yp0
            r6 = 2
            r5.<init>(r6)
            r0.f12758 = r7
            r0.m6971(r1, r5)
            r0.f12758 = r8
            int r1 = r10.f6093
            int r1 = r1 + r7
            r10.f6093 = r1
            r1 = r5
        Lbb:
            r4.m701(r2, r1)
        Lbe:
            yp0 r1 = (p000.yp0) r1
            an r11 = (p000.C0024an) r11
            r10.m3410(r1, r11)
        Lc5:
            boolean r11 = r0.m6977()
            if (r11 != 0) goto Ld1
            iq0 r10 = new iq0
            r10.<init>()
            goto Ld7
        Ld1:
            jq0 r11 = new jq0
            r11.<init>(r10)
            r10 = r11
        Ld7:
            r3.m701(r2, r10)
            goto L13d
        Ldb:
            if (r5 != 0) goto L120
            if (r6 == 0) goto L120
            java.util.List r5 = r0.m7000()
            h21 r5 = (p000.h21) r5
            k21 r5 = r5.f4540
            int r5 = r5.m3134(r6)
            java.util.List r9 = r0.m7000()
            h21 r9 = (p000.h21) r9
            k21 r9 = r9.f4540
            int r9 = r9.f5718
            r10.m3408(r5, r9)
            int r5 = r10.f6093
            int r5 = r5 + r7
            r10.f6093 = r5
            r1.m699(r2)
            r4.m701(r2, r6)
            boolean r1 = r0.m6977()
            if (r1 != 0) goto L10f
            iq0 r1 = new iq0
            r1.<init>()
            goto L114
        L10f:
            jq0 r1 = new jq0
            r1.<init>(r10)
        L114:
            r3.m701(r2, r1)
            boolean r0 = r0.m6977()
            if (r0 == 0) goto L120
            r10.m3406()
        L120:
            java.lang.Object r0 = r4.m695(r2)
            yp0 r0 = (p000.yp0) r0
            if (r0 == 0) goto L131
            b21 r1 = r10.f6084
            java.lang.Object r1 = r1.m695(r0)
            dq0 r1 = (p000.dq0) r1
            goto L132
        L131:
            r1 = 0
        L132:
            if (r1 == 0) goto L13d
            boolean r1 = r1.f3238
            if (r1 != r7) goto L13d
            an r11 = (p000.C0024an) r11
            r10.m3410(r0, r11)
        L13d:
            java.lang.Object r10 = r4.m695(r2)
            yp0 r10 = (p000.yp0) r10
            if (r10 == 0) goto L164
            bq0 r10 = r10.f12734
            ox0 r10 = r10.f1815
            java.util.List r10 = r10.m4329()
            r11 = r10
            h21 r11 = (p000.h21) r11
            k21 r0 = r11.f4540
            int r0 = r0.f5718
        L154:
            if (r8 >= r0) goto L163
            java.lang.Object r1 = r11.get(r8)
            ox0 r1 = (p000.ox0) r1
            bq0 r1 = r1.f8329
            r1.f1801 = r7
            int r8 = r8 + 1
            goto L154
        L163:
            return r10
        L164:
            jz r10 = p000.C0450jz.f5672
            return r10
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: д */
    public final float mo595(long r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            float r0 = r0.mo595(r1)
            return r0
    }

    @Override // p000.rx0
    /* JADX INFO: renamed from: е */
    public final p000.qx0 mo1612(int r7, int r8, java.util.Map r9, p000.a80 r10) {
            r6 = this;
            fq0 r0 = r6.f2720
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            qx0 r6 = r0.mo1609(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: к */
    public final long mo596(float r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            long r0 = r0.mo596(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: п */
    public final float mo597(int r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            float r0 = r0.mo597(r1)
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: с */
    public final float mo598(float r1) {
            r0 = this;
            fq0 r0 = r0.f2720
            float r0 = r0.mo586()
            float r1 = r1 / r0
            return r1
    }
}
