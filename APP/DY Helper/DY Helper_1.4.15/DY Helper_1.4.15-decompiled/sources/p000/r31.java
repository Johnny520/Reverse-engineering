package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class r31 {

    /* JADX INFO: renamed from: α */
    public static final p000.u11 f9251 = null;

    static {
            u11 r0 = p000.z31.f12956
            u11 r0 = new u11
            r0.<init>()
            p000.r31.f9251 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m5055(p000.q01 r3, int r4, int r5) {
            boolean r0 = r3 instanceof p000.C1014ya
            if (r0 == 0) goto L1b
            r0 = r3
            ya r0 = (p000.C1014ya) r0
            int r1 = r0.f12511
            r2 = r1 & r4
            m5056(r3, r2, r5)
            int r3 = ~r1
            r3 = r3 & r4
            q01 r4 = r0.f12512
        L12:
            if (r4 == 0) goto L1a
            m5055(r4, r3, r5)
            q01 r4 = r4.f8776
            goto L12
        L1a:
            return
        L1b:
            int r0 = r3.f8773
            r4 = r4 & r0
            m5056(r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: β */
    public static final void m5056(p000.q01 r4, int r5, int r6) {
            if (r6 != 0) goto La
            boolean r0 = r4.mo1140()
            if (r0 != 0) goto La
            goto L10a
        La:
            r0 = r5 & 2
            r1 = 2
            if (r0 == 0) goto L22
            boolean r0 = r4 instanceof p000.qp0
            if (r0 == 0) goto L22
            r0 = r4
            qp0 r0 = (p000.qp0) r0
            p000.AbstractC0073bd.m847(r0)
            if (r6 != r1) goto L22
            q31 r0 = p000.h62.m2443(r4, r1)
            r0.m4749()
        L22:
            r0 = r5 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2f
            if (r6 == r1) goto L2f
            yp0 r0 = p000.h62.m2445(r4)
            r0.m6974()
        L2f:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r5
            if (r0 == 0) goto L3e
            if (r6 == r1) goto L3e
            yp0 r0 = p000.h62.m2445(r4)
            r2 = 0
            r0.m6987(r2)
        L3e:
            r0 = r5 & 256(0x100, float:3.59E-43)
            r2 = 1
            if (r0 == 0) goto L99
            boolean r0 = r4 instanceof p000.qa0
            if (r0 == 0) goto L99
            if (r6 == r2) goto L58
            if (r6 == r1) goto L4c
            goto L62
        L4c:
            yp0 r0 = p000.h62.m2445(r4)
            int r3 = r0.f12741
            int r3 = r3 + (-1)
            r0.m7011(r3)
            goto L62
        L58:
            yp0 r0 = p000.h62.m2445(r4)
            int r3 = r0.f12741
            int r3 = r3 + r2
            r0.m7011(r3)
        L62:
            if (r6 == r1) goto L99
            yp0 r6 = p000.h62.m2445(r4)
            int r0 = r6.f12741
            if (r0 == 0) goto L99
            boolean r0 = r6.m7001()
            if (r0 != 0) goto L99
            boolean r0 = r6.m7002()
            if (r0 != 0) goto L99
            boolean r0 = r6.f12740
            if (r0 == 0) goto L7d
            goto L99
        L7d:
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.ln0.m3646(r6)
            mx0 r1 = r0.f932
            n5 r1 = r1.f7314
            r1.getClass()
            int r3 = r6.f12741
            if (r3 <= 0) goto L95
            java.lang.Object r1 = r1.f7387
            k21 r1 = (p000.k21) r1
            r1.m3127(r6)
            r6.f12740 = r2
        L95:
            r6 = 0
            r0.m377(r6)
        L99:
            r6 = r5 & 4
            if (r6 == 0) goto La7
            boolean r6 = r4 instanceof p000.InterfaceC0092bw
            if (r6 == 0) goto La7
            r6 = r4
            bw r6 = (p000.InterfaceC0092bw) r6
            p000.AbstractC1021yh.m6865(r6)
        La7:
            r6 = r5 & 8
            if (r6 == 0) goto Lb5
            boolean r6 = r4 instanceof p000.zr1
            if (r6 == 0) goto Lb5
            yp0 r6 = p000.h62.m2445(r4)
            r6.f12759 = r2
        Lb5:
            r6 = r5 & 64
            if (r6 == 0) goto Ld0
            boolean r6 = r4 instanceof p000.y91
            if (r6 == 0) goto Ld0
            r6 = r4
            y91 r6 = (p000.y91) r6
            yp0 r6 = p000.h62.m2445(r6)
            bq0 r6 = r6.f12734
            ox0 r0 = r6.f1815
            r0.f8338 = r2
            jw0 r6 = r6.f1816
            if (r6 == 0) goto Ld0
            r6.f5594 = r2
        Ld0:
            r6 = r5 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto Le9
            boolean r6 = r4 instanceof p000.C0678p8
            if (r6 != 0) goto Ld9
            goto Le9
        Ld9:
            p8 r4 = (p000.C0678p8) r4
            v01 r4 = r4.f8453
            java.lang.String r5 = "applyFocusProperties called on wrong node"
            p000.am0.m178(r5)
            r4.getClass()
            p000.C1080.m7264()
            return
        Le9:
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L10a
            boolean r5 = r4 instanceof p000.C0678p8
            if (r5 == 0) goto L10a
            p8 r4 = (p000.C0678p8) r4
            androidx.compose.ui.platform.AndroidComposeView r5 = p000.h62.m2446(r4)
            v40 r5 = r5.getFocusOwner()
            y40 r5 = (p000.y40) r5
            s40 r5 = r5.f12448
            c21 r6 = r5.f9709
            boolean r4 = r6.m1107(r4)
            if (r4 == 0) goto L10a
            r5.m5364()
        L10a:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static final void m5057(p000.q01 r2) {
            boolean r0 = r2.f8784
            if (r0 != 0) goto L9
            java.lang.String r0 = "autoInvalidateUpdatedNode called on unattached node"
            p000.am0.m178(r0)
        L9:
            r0 = -1
            r1 = 0
            m5055(r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static final int m5058(p000.q01 r5) {
            int r0 = r5.f8773
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class r0 = r5.getClass()
            u11 r1 = p000.r31.f9251
            int r2 = r1.m5776(r0)
            if (r2 < 0) goto L16
            int[] r5 = r1.f10557
            r5 = r5[r2]
            return r5
        L16:
            boolean r2 = r5 instanceof p000.qp0
            if (r2 == 0) goto L1c
            r2 = 3
            goto L1d
        L1c:
            r2 = 1
        L1d:
            boolean r3 = r5 instanceof p000.InterfaceC0092bw
            if (r3 == 0) goto L23
            r2 = r2 | 4
        L23:
            boolean r3 = r5 instanceof p000.zr1
            if (r3 == 0) goto L29
            r2 = r2 | 8
        L29:
            boolean r3 = r5 instanceof p000.di1
            if (r3 == 0) goto L2f
            r2 = r2 | 16
        L2f:
            boolean r3 = r5 instanceof p000.t01
            if (r3 == 0) goto L35
            r2 = r2 | 32
        L35:
            boolean r3 = r5 instanceof p000.y91
            if (r3 == 0) goto L3b
            r2 = r2 | 64
        L3b:
            boolean r3 = r5 instanceof p000.kp0
            if (r3 == 0) goto L44
            r3 = 4194432(0x400080, float:5.877651E-39)
            r2 = r2 | r3
            goto L48
        L44:
            if (r3 == 0) goto L48
            r2 = r2 | 128(0x80, float:1.8E-43)
        L48:
            boolean r3 = r5 instanceof p000.qa0
            if (r3 == 0) goto L4e
            r2 = r2 | 256(0x100, float:3.59E-43)
        L4e:
            boolean r3 = r5 instanceof p000.c50
            if (r3 == 0) goto L54
            r2 = r2 | 1024(0x400, float:1.435E-42)
        L54:
            boolean r3 = r5 instanceof p000.C0678p8
            if (r3 == 0) goto L5a
            r2 = r2 | 2048(0x800, float:2.87E-42)
        L5a:
            if (r3 == 0) goto L5e
            r2 = r2 | 4096(0x1000, float:5.74E-42)
        L5e:
            boolean r3 = r5 instanceof p000.C0855u0
            if (r3 == 0) goto L64
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L64:
            if (r3 == 0) goto L68
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
        L68:
            boolean r4 = r5 instanceof p000.InterfaceC0047ao
            if (r4 == 0) goto L70
            r4 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r4
        L70:
            boolean r5 = r5 instanceof p000.x52
            if (r5 == 0) goto L77
            r5 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r5
        L77:
            if (r3 == 0) goto L7c
            r5 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r5
        L7c:
            r1.m5779(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static final int m5059(p000.q01 r2) {
            boolean r0 = r2 instanceof p000.C1014ya
            if (r0 == 0) goto L15
            ya r2 = (p000.C1014ya) r2
            int r0 = r2.f12511
            q01 r2 = r2.f12512
        La:
            if (r2 == 0) goto L14
            int r1 = m5059(r2)
            r0 = r0 | r1
            q01 r2 = r2.f8776
            goto La
        L14:
            return r0
        L15:
            int r2 = m5058(r2)
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    public static final boolean m5060(int r4) {
            r0 = r4 & 128(0x80, float:1.8E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r3 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r3
            if (r4 == 0) goto Lf
            r1 = r2
        Lf:
            r4 = r0 | r1
            return r4
    }
}
