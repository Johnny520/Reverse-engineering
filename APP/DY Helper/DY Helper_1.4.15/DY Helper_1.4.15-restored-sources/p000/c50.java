package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c50 extends p000.q01 implements p000.InterfaceC0047ao, p000.kp0, p000.c41, p000.t01 {

    /* JADX INFO: renamed from: τ */
    public boolean f1964;

    /* JADX INFO: renamed from: υ */
    public boolean f1965;

    @Override // p000.c41
    /* JADX INFO: renamed from: Ζ */
    public final void mo603() {
            r0 = this;
            r0.m1138()
            return
    }

    @Override // p000.kp0
    /* JADX INFO: renamed from: ι */
    public final void mo1132(p000.mp0 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: В */
    public final boolean m1133() {
            r22 = this;
            r0 = r22
            uq r1 = p000.kn0.m3348(r0)
            int r1 = r1.ordinal()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L15
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L19
        L15:
            r19 = 0
            goto L299
        L19:
            p000.C1080.m7272()
        L1c:
            r0 = 0
            return r0
        L1e:
            r18 = r5
            goto L29c
        L22:
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.h62.m2446(r0)
            v40 r1 = r1.getFocusOwner()
            y40 r1 = (p000.y40) r1
            c50 r6 = r1.m6827()
            b50 r7 = r0.m1137()
            if (r6 != r0) goto L3a
            r0.m1134(r7, r7)
            return r5
        L3a:
            if (r6 == 0) goto L3d
            goto L50
        L3d:
            androidx.compose.ui.platform.AndroidComposeView r8 = p000.h62.m2446(r0)
            v40 r8 = r8.getFocusOwner()
            y40 r8 = (p000.y40) r8
            androidx.compose.ui.platform.AndroidComposeView r8 = r8.f12445
            boolean r8 = r8.m376()
            if (r8 != 0) goto L50
            goto L15
        L50:
            java.lang.String r8 = "visitAncestors called on an unattached node"
            r9 = 16
            if (r6 == 0) goto Le5
            k21 r11 = new k21
            c50[] r12 = new p000.c50[r9]
            r11.<init>(r12)
            q01 r12 = r6.f8771
            boolean r12 = r12.f8784
            if (r12 != 0) goto L66
            p000.am0.m178(r8)
        L66:
            q01 r12 = r6.f8771
            q01 r12 = r12.f8775
            yp0 r13 = p000.h62.m2445(r6)
        L6e:
            if (r13 == 0) goto Le6
            k31 r14 = r13.f12733
            q01 r14 = r14.f5729
            int r14 = r14.f8774
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto Ld3
        L7a:
            if (r12 == 0) goto Ld3
            int r14 = r12.f8773
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto Lce
            r14 = r12
            r15 = 0
        L84:
            if (r14 == 0) goto Lce
            boolean r10 = r14 instanceof p000.c50
            if (r10 == 0) goto L90
            c50 r14 = (p000.c50) r14
            r11.m3127(r14)
            goto Lc9
        L90:
            int r10 = r14.f8773
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto Lc9
            boolean r10 = r14 instanceof p000.C1014ya
            if (r10 == 0) goto Lc9
            r10 = r14
            ya r10 = (p000.C1014ya) r10
            q01 r10 = r10.f12512
            r3 = 0
        La0:
            if (r10 == 0) goto Lc4
            int r4 = r10.f8773
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Lc0
            int r3 = r3 + 1
            if (r3 != r5) goto Lae
            r14 = r10
            goto Lc0
        Lae:
            if (r15 != 0) goto Lb7
            k21 r15 = new k21
            q01[] r4 = new p000.q01[r9]
            r15.<init>(r4)
        Lb7:
            if (r14 == 0) goto Lbd
            r15.m3127(r14)
            r14 = 0
        Lbd:
            r15.m3127(r10)
        Lc0:
            q01 r10 = r10.f8776
            r4 = 2
            goto La0
        Lc4:
            if (r3 != r5) goto Lc9
        Lc6:
            r3 = 3
            r4 = 2
            goto L84
        Lc9:
            q01 r14 = p000.h62.m2387(r15)
            goto Lc6
        Lce:
            q01 r12 = r12.f8775
            r3 = 3
            r4 = 2
            goto L7a
        Ld3:
            yp0 r13 = r13.m7005()
            if (r13 == 0) goto Le1
            k31 r3 = r13.f12733
            if (r3 == 0) goto Le1
            q22 r3 = r3.f5728
            r12 = r3
            goto Le2
        Le1:
            r12 = 0
        Le2:
            r3 = 3
            r4 = 2
            goto L6e
        Le5:
            r11 = 0
        Le6:
            c50[] r3 = new p000.c50[r9]
            c50[] r4 = new p000.c50[r9]
            q01 r10 = r0.f8771
            boolean r10 = r10.f8784
            if (r10 != 0) goto Lf3
            p000.am0.m178(r8)
        Lf3:
            q01 r8 = r0.f8771
            q01 r8 = r8.f8775
            yp0 r10 = p000.h62.m2445(r0)
            r12 = r5
            r13 = 0
            r14 = 0
        Lfe:
            if (r10 == 0) goto L1fa
            k31 r15 = r10.f12733
            q01 r15 = r15.f5729
            int r15 = r15.f8774
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L1e4
        L10a:
            if (r8 == 0) goto L1e4
            int r15 = r8.f8773
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L1db
            r15 = r8
            r16 = 0
        L115:
            if (r15 == 0) goto L1db
            boolean r9 = r15 instanceof p000.c50
            if (r9 == 0) goto L178
            r9 = r15
            c50 r9 = (p000.c50) r9
            if (r11 == 0) goto L12b
            boolean r18 = r11.m3135(r9)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r18)
            r5 = r18
            goto L12c
        L12b:
            r5 = 0
        L12c:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = p000.ln0.m3626(r5, r2)
            if (r2 == 0) goto L155
            int r2 = r13 + 1
            int r5 = r3.length
            if (r5 >= r2) goto L14c
            int r5 = r3.length
            r20 = r1
            int r1 = r5 * 2
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r21 = r2
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r5)
            r3 = r1
            goto L150
        L14c:
            r20 = r1
            r21 = r2
        L150:
            r3[r13] = r9
            r13 = r21
            goto L173
        L155:
            r20 = r1
            int r1 = r14 + 1
            int r2 = r4.length
            if (r2 >= r1) goto L16d
            int r2 = r4.length
            int r5 = r2 * 2
            int r5 = java.lang.Math.max(r1, r5)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r21 = r1
            r1 = 0
            java.lang.System.arraycopy(r4, r1, r5, r1, r2)
            r4 = r5
            goto L16f
        L16d:
            r21 = r1
        L16f:
            r4[r14] = r9
            r14 = r21
        L173:
            if (r9 != r6) goto L176
            r12 = 0
        L176:
            r1 = 0
            goto L17b
        L178:
            r20 = r1
            r1 = 1
        L17b:
            if (r1 == 0) goto L1d0
            int r1 = r15.f8773
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L1d0
            boolean r1 = r15 instanceof p000.C1014ya
            if (r1 == 0) goto L1d0
            r1 = r15
            ya r1 = (p000.C1014ya) r1
            q01 r1 = r1.f12512
            r2 = 0
        L18d:
            if (r1 == 0) goto L1c7
            int r5 = r1.f8773
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L1c2
            int r2 = r2 + 1
            r5 = 1
            if (r2 != r5) goto L1a0
            r15 = r1
            r17 = r2
            r9 = 16
            goto L1bf
        L1a0:
            if (r16 != 0) goto L1ae
            k21 r5 = new k21
            r17 = r2
            r9 = 16
            q01[] r2 = new p000.q01[r9]
            r5.<init>(r2)
            goto L1b4
        L1ae:
            r17 = r2
            r9 = 16
            r5 = r16
        L1b4:
            if (r15 == 0) goto L1ba
            r5.m3127(r15)
            r15 = 0
        L1ba:
            r5.m3127(r1)
            r16 = r5
        L1bf:
            r2 = r17
            goto L1c4
        L1c2:
            r9 = 16
        L1c4:
            q01 r1 = r1.f8776
            goto L18d
        L1c7:
            r5 = 1
            r9 = 16
            if (r2 != r5) goto L1d2
            r1 = r20
            goto L115
        L1d0:
            r9 = 16
        L1d2:
            q01 r15 = p000.h62.m2387(r16)
            r1 = r20
            r5 = 1
            goto L115
        L1db:
            r20 = r1
            q01 r8 = r8.f8775
            r1 = r20
            r5 = 1
            goto L10a
        L1e4:
            r20 = r1
            yp0 r10 = r10.m7005()
            if (r10 == 0) goto L1f4
            k31 r1 = r10.f12733
            if (r1 == 0) goto L1f4
            q22 r1 = r1.f5728
            r8 = r1
            goto L1f5
        L1f4:
            r8 = 0
        L1f5:
            r1 = r20
            r5 = 1
            goto Lfe
        L1fa:
            r20 = r1
            if (r12 == 0) goto L209
            if (r6 == 0) goto L209
            r1 = 0
            boolean r2 = p000.kn0.m3374(r6, r1)
            if (r2 != 0) goto L209
            goto L15
        L209:
            k1 r1 = new k1
            r2 = 2
            r1.<init>(r2, r0)
            p000.ln0.m3642(r0, r1)
            b50 r1 = r0.m1137()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L238
            r5 = 1
            if (r1 == r5) goto L22b
            r2 = 2
            if (r1 == r2) goto L238
            r2 = 3
            if (r1 != r2) goto L226
            goto L22b
        L226:
            p000.C1080.m7272()
            goto L1c
        L22b:
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.h62.m2446(r0)
            v40 r1 = r1.getFocusOwner()
            y40 r1 = (p000.y40) r1
            r1.m6829(r0)
        L238:
            b50 r1 = p000.b50.f1478
            b50 r2 = p000.b50.f1476
            if (r12 == 0) goto L243
            if (r6 == 0) goto L243
            r6.m1134(r2, r1)
        L243:
            b50 r3 = p000.b50.f1477
            if (r11 == 0) goto L266
            int r5 = r11.f5718
            r18 = 1
            int r5 = r5 + (-1)
            java.lang.Object[] r8 = r11.f5716
            int r9 = r8.length
            if (r5 >= r9) goto L266
        L252:
            if (r5 < 0) goto L266
            r9 = r8[r5]
            c50 r9 = (p000.c50) r9
            c50 r10 = r20.m6827()
            if (r10 == r0) goto L260
            goto L15
        L260:
            r9.m1134(r3, r1)
            int r5 = r5 + (-1)
            goto L252
        L266:
            r18 = 1
            int r14 = r14 + (-1)
            int r5 = r4.length
            if (r14 >= r5) goto L286
        L26d:
            if (r14 < 0) goto L286
            r5 = r4[r14]
            c50 r5 = (p000.c50) r5
            c50 r8 = r20.m6827()
            if (r8 == r0) goto L27b
            goto L15
        L27b:
            if (r5 != r6) goto L27f
            r8 = r2
            goto L280
        L27f:
            r8 = r1
        L280:
            r5.m1134(r8, r3)
            int r14 = r14 + (-1)
            goto L26d
        L286:
            c50 r1 = r20.m6827()
            if (r1 == r0) goto L28e
            goto L15
        L28e:
            r0.m1134(r7, r2)
            c50 r1 = r20.m6827()
            if (r1 == r0) goto L29a
            goto L15
        L299:
            return r19
        L29a:
            r18 = 1
        L29c:
            return r18
    }

    /* JADX INFO: renamed from: Г */
    public final void m1134(p000.b50 r10, p000.b50 r11) {
            r9 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.h62.m2446(r9)
            v40 r0 = r0.getFocusOwner()
            y40 r0 = (p000.y40) r0
            c50 r1 = r0.m6827()
            r10.equals(r11)
            q01 r10 = r9.f8771
            boolean r11 = r10.f8784
            if (r11 != 0) goto L1c
            java.lang.String r11 = "visitAncestors called on an unattached node"
            p000.am0.m178(r11)
        L1c:
            q01 r11 = r9.f8771
            yp0 r9 = p000.h62.m2445(r9)
        L22:
            if (r9 == 0) goto Laa
            k31 r2 = r9.f12733
            q01 r2 = r2.f5729
            int r2 = r2.f8774
            r2 = r2 & 5120(0x1400, float:7.175E-42)
            r3 = 0
            if (r2 == 0) goto L99
        L2f:
            if (r11 == 0) goto L99
            int r2 = r11.f8773
            r4 = r2 & 5120(0x1400, float:7.175E-42)
            if (r4 == 0) goto L96
            if (r11 == r10) goto L3f
            r4 = r2 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L3f
            goto Laa
        L3f:
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L96
            r2 = r11
            r4 = r3
        L45:
            if (r2 == 0) goto L96
            boolean r5 = r2 instanceof p000.C0678p8
            if (r5 == 0) goto L58
            p8 r2 = (p000.C0678p8) r2
            c50 r5 = r0.m6827()
            if (r1 == r5) goto L54
            goto L91
        L54:
            r2.m4386()
            throw r3
        L58:
            int r5 = r2.f8773
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L91
            boolean r5 = r2 instanceof p000.C1014ya
            if (r5 == 0) goto L91
            r5 = r2
            ya r5 = (p000.C1014ya) r5
            q01 r5 = r5.f12512
            r6 = 0
        L68:
            r7 = 1
            if (r5 == 0) goto L8e
            int r8 = r5.f8773
            r8 = r8 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L8b
            int r6 = r6 + 1
            if (r6 != r7) goto L77
            r2 = r5
            goto L8b
        L77:
            if (r4 != 0) goto L82
            k21 r4 = new k21
            r7 = 16
            q01[] r7 = new p000.q01[r7]
            r4.<init>(r7)
        L82:
            if (r2 == 0) goto L88
            r4.m3127(r2)
            r2 = r3
        L88:
            r4.m3127(r5)
        L8b:
            q01 r5 = r5.f8776
            goto L68
        L8e:
            if (r6 != r7) goto L91
            goto L45
        L91:
            q01 r2 = p000.h62.m2387(r4)
            goto L45
        L96:
            q01 r11 = r11.f8775
            goto L2f
        L99:
            yp0 r9 = r9.m7005()
            if (r9 == 0) goto La7
            k31 r11 = r9.f12733
            if (r11 == 0) goto La7
            q22 r11 = r11.f5728
            goto L22
        La7:
            r11 = r3
            goto L22
        Laa:
            return
    }

    /* JADX INFO: renamed from: Д */
    public final p000.z40 m1135() {
            r11 = this;
            z40 r0 = new z40
            r0.<init>()
            r1 = 1
            r0.f12958 = r1
            a50 r2 = p000.a50.f66
            r0.f12959 = r2
            r0.f12960 = r2
            r0.f12961 = r2
            r0.f12962 = r2
            r0.f12963 = r2
            r0.f12964 = r2
            r0.f12965 = r2
            r0.f12966 = r2
            a1 r2 = p000.C0002a1.f28
            r0.f12967 = r2
            a1 r2 = p000.C0002a1.f29
            r0.f12968 = r2
            ml1 r2 = p000.C0966x.f11931
            r0.f12969 = r2
            r2 = 0
            r0.f12958 = r2
            q01 r3 = r11.f8771
            boolean r4 = r3.f8784
            if (r4 != 0) goto L34
            java.lang.String r4 = "visitAncestors called on an unattached node"
            p000.am0.m178(r4)
        L34:
            q01 r4 = r11.f8771
            yp0 r11 = p000.h62.m2445(r11)
        L3a:
            if (r11 == 0) goto Lc5
            k31 r5 = r11.f12733
            q01 r5 = r5.f5729
            int r5 = r5.f8774
            r5 = r5 & 3072(0xc00, float:4.305E-42)
            r6 = 0
            if (r5 == 0) goto Lb4
        L47:
            if (r4 == 0) goto Lb4
            int r5 = r4.f8773
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 == 0) goto Lb1
            if (r4 == r3) goto L57
            r7 = r5 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L57
            goto Lc5
        L57:
            r5 = r5 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto Lb1
            r5 = r4
            r7 = r6
        L5d:
            if (r5 == 0) goto Lb1
            boolean r8 = r5 instanceof p000.C0678p8
            if (r8 != 0) goto La0
            int r8 = r5.f8773
            r8 = r8 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L9b
            boolean r8 = r5 instanceof p000.C1014ya
            if (r8 == 0) goto L9b
            r8 = r5
            ya r8 = (p000.C1014ya) r8
            q01 r8 = r8.f12512
            r9 = r2
        L73:
            if (r8 == 0) goto L98
            int r10 = r8.f8773
            r10 = r10 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L95
            int r9 = r9 + 1
            if (r9 != r1) goto L81
            r5 = r8
            goto L95
        L81:
            if (r7 != 0) goto L8c
            k21 r7 = new k21
            r10 = 16
            q01[] r10 = new p000.q01[r10]
            r7.<init>(r10)
        L8c:
            if (r5 == 0) goto L92
            r7.m3127(r5)
            r5 = r6
        L92:
            r7.m3127(r8)
        L95:
            q01 r8 = r8.f8776
            goto L73
        L98:
            if (r9 != r1) goto L9b
            goto L5d
        L9b:
            q01 r5 = p000.h62.m2387(r7)
            goto L5d
        La0:
            p8 r5 = (p000.C0678p8) r5
            v01 r11 = r5.f8453
            java.lang.String r0 = "applyFocusProperties called on wrong node"
            p000.am0.m178(r0)
            r11.getClass()
            p000.C1080.m7264()
            r11 = 0
            return r11
        Lb1:
            q01 r4 = r4.f8775
            goto L47
        Lb4:
            yp0 r11 = r11.m7005()
            if (r11 == 0) goto Lc2
            k31 r4 = r11.f12733
            if (r4 == 0) goto Lc2
            q22 r4 = r4.f5728
            goto L3a
        Lc2:
            r4 = r6
            goto L3a
        Lc5:
            return r0
    }

    /* JADX INFO: renamed from: Е */
    public final void m1136() {
            r6 = this;
            q01 r0 = r6.f8771
            boolean r0 = r0.f8784
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            p000.am0.m178(r0)
        Lb:
            q01 r0 = r6.f8771
            q01 r0 = r0.f8775
            yp0 r6 = p000.h62.m2445(r6)
        L13:
            if (r6 == 0) goto L78
            k31 r1 = r6.f12733
            q01 r1 = r1.f5729
            int r1 = r1.f8774
            r2 = 8388640(0x800020, float:1.1754988E-38)
            r1 = r1 & r2
            r3 = 0
            if (r1 == 0) goto L69
        L22:
            if (r0 == 0) goto L69
            int r1 = r0.f8773
            r4 = r1 & r2
            if (r4 == 0) goto L66
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L3c
            boolean r6 = r0 instanceof p000.C1014ya
            if (r6 == 0) goto L78
            ya r0 = (p000.C1014ya) r0
            q01 r6 = r0.f12512
        L37:
            if (r6 == 0) goto L78
            q01 r6 = r6.f8776
            goto L37
        L3c:
            r1 = r1 & 32
            if (r1 == 0) goto L66
            boolean r1 = r0 instanceof p000.t01
            if (r1 == 0) goto L46
            r4 = r0
            goto L5b
        L46:
            boolean r1 = r0 instanceof p000.C1014ya
            if (r1 == 0) goto L5a
            r1 = r0
            ya r1 = (p000.C1014ya) r1
            q01 r1 = r1.f12512
            r4 = r3
        L50:
            if (r1 == 0) goto L5b
            boolean r5 = r1 instanceof p000.t01
            if (r5 == 0) goto L57
            r4 = r1
        L57:
            q01 r1 = r1.f8776
            goto L50
        L5a:
            r4 = r3
        L5b:
            t01 r4 = (p000.t01) r4
            if (r4 == 0) goto L66
            x r1 = r4.mo4384()
            r1.getClass()
        L66:
            q01 r0 = r0.f8775
            goto L22
        L69:
            yp0 r6 = r6.m7005()
            if (r6 == 0) goto L76
            k31 r0 = r6.f12733
            if (r0 == 0) goto L76
            q22 r0 = r0.f5728
            goto L13
        L76:
            r0 = r3
            goto L13
        L78:
            return
    }

    /* JADX INFO: renamed from: Ж */
    public final p000.b50 m1137() {
            r10 = this;
            boolean r0 = r10.f8784
            b50 r1 = p000.b50.f1478
            if (r0 != 0) goto L7
            return r1
        L7:
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.h62.m2446(r10)
            v40 r0 = r0.getFocusOwner()
            y40 r0 = (p000.y40) r0
            c50 r0 = r0.m6827()
            if (r0 != 0) goto L18
            return r1
        L18:
            if (r10 != r0) goto L1d
            b50 r10 = p000.b50.f1476
            return r10
        L1d:
            boolean r2 = r0.f8784
            if (r2 == 0) goto La8
            q01 r2 = r0.f8771
            boolean r2 = r2.f8784
            if (r2 != 0) goto L2c
            java.lang.String r2 = "visitAncestors called on an unattached node"
            p000.am0.m178(r2)
        L2c:
            q01 r2 = r0.f8771
            q01 r2 = r2.f8775
            yp0 r0 = p000.h62.m2445(r0)
        L34:
            if (r0 == 0) goto La8
            k31 r3 = r0.f12733
            q01 r3 = r3.f5729
            int r3 = r3.f8774
            r3 = r3 & 1024(0x400, float:1.435E-42)
            r4 = 0
            if (r3 == 0) goto L99
        L41:
            if (r2 == 0) goto L99
            int r3 = r2.f8773
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L96
            r3 = r2
            r5 = r4
        L4b:
            if (r3 == 0) goto L96
            boolean r6 = r3 instanceof p000.c50
            if (r6 == 0) goto L58
            c50 r3 = (p000.c50) r3
            if (r10 != r3) goto L91
            b50 r10 = p000.b50.f1477
            return r10
        L58:
            int r6 = r3.f8773
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L91
            boolean r6 = r3 instanceof p000.C1014ya
            if (r6 == 0) goto L91
            r6 = r3
            ya r6 = (p000.C1014ya) r6
            q01 r6 = r6.f12512
            r7 = 0
        L68:
            r8 = 1
            if (r6 == 0) goto L8e
            int r9 = r6.f8773
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L8b
            int r7 = r7 + 1
            if (r7 != r8) goto L77
            r3 = r6
            goto L8b
        L77:
            if (r5 != 0) goto L82
            k21 r5 = new k21
            r8 = 16
            q01[] r8 = new p000.q01[r8]
            r5.<init>(r8)
        L82:
            if (r3 == 0) goto L88
            r5.m3127(r3)
            r3 = r4
        L88:
            r5.m3127(r6)
        L8b:
            q01 r6 = r6.f8776
            goto L68
        L8e:
            if (r7 != r8) goto L91
            goto L4b
        L91:
            q01 r3 = p000.h62.m2387(r5)
            goto L4b
        L96:
            q01 r2 = r2.f8775
            goto L41
        L99:
            yp0 r0 = r0.m7005()
            if (r0 == 0) goto La6
            k31 r2 = r0.f12733
            if (r2 == 0) goto La6
            q22 r2 = r2.f5728
            goto L34
        La6:
            r2 = r4
            goto L34
        La8:
            return r1
    }

    /* JADX INFO: renamed from: З */
    public final void m1138() {
            r4 = this;
            b50 r0 = r4.m1137()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 == r1) goto L3f
            r2 = 2
            if (r0 == r2) goto L18
            r4 = 3
            if (r0 != r4) goto L14
            goto L3f
        L14:
            p000.C1080.m7272()
            return
        L18:
            um1 r0 = new um1
            r0.<init>()
            y0 r2 = new y0
            r3 = 3
            r2.<init>(r0, r3, r4)
            p000.ln0.m3642(r4, r2)
            java.lang.Object r0 = r0.f10912
            if (r0 == 0) goto L40
            z40 r0 = (p000.z40) r0
            boolean r0 = r0.f12958
            if (r0 != 0) goto L3f
            androidx.compose.ui.platform.AndroidComposeView r4 = p000.h62.m2446(r4)
            v40 r4 = r4.getFocusOwner()
            y40 r4 = (p000.y40) r4
            r0 = 8
            r4.m6823(r0, r1, r1)
        L3f:
            return
        L40:
            java.lang.String r4 = "focusProperties"
            p000.ln0.m3650(r4)
            r4 = 0
            throw r4
    }

    /* JADX INFO: renamed from: И */
    public final boolean m1139(int r2) {
            r1 = this;
            java.lang.String r0 = "FocusTransactions:requestFocus"
            android.os.Trace.beginSection(r0)
            z40 r0 = r1.m1135()     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.f12958     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L15
            boolean r1 = r1.m1133()     // Catch: java.lang.Throwable -> L22
            android.os.Trace.endSection()
            return r1
        L15:
            a1 r0 = new a1     // Catch: java.lang.Throwable -> L22
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22
            boolean r1 = p000.j81.m2918(r1, r2, r0)     // Catch: java.lang.Throwable -> L22
            android.os.Trace.endSection()
            return r1
        L22:
            r1 = move-exception
            android.os.Trace.endSection()
            throw r1
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ф */
    public final boolean mo1140() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ш */
    public final void mo614() {
            r3 = this;
            b50 r0 = r3.m1137()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 == r1) goto L18
            r2 = 2
            if (r0 == r2) goto L23
            r3 = 3
            if (r0 != r3) goto L14
            return
        L14:
            p000.C1080.m7272()
            return
        L18:
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.h62.m2446(r3)
            r0.getFocusOwner()
            p000.ln0.m3641(r3)
            return
        L23:
            androidx.compose.ui.platform.AndroidComposeView r3 = p000.h62.m2446(r3)
            v40 r3 = r3.getFocusOwner()
            y40 r3 = (p000.y40) r3
            r0 = 8
            r2 = 0
            r3.m6823(r0, r1, r2)
            s40 r3 = r3.f12448
            r3.m5364()
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: щ */
    public final void mo1141() {
            r3 = this;
            b50 r0 = r3.m1137()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 == r1) goto L17
            r2 = 2
            if (r0 == r2) goto L18
            r3 = 3
            if (r0 != r3) goto L14
            goto L17
        L14:
            p000.C1080.m7272()
        L17:
            return
        L18:
            androidx.compose.ui.platform.AndroidComposeView r3 = p000.h62.m2446(r3)
            v40 r3 = r3.getFocusOwner()
            r0 = 8
            y40 r3 = (p000.y40) r3
            r3.m6823(r0, r1, r1)
            return
    }
}
