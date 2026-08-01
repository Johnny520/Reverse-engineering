package p000;

/* JADX INFO: renamed from: fe */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0282fe implements p000.InterfaceC0190cw {

    /* JADX INFO: renamed from: ε */
    public final p000.C0245ee f3906;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0538m6 f3907;

    /* JADX INFO: renamed from: η */
    public p000.C0709q2 f3908;

    /* JADX INFO: renamed from: θ */
    public p000.C0709q2 f3909;

    public C0282fe() {
            r3 = this;
            r3.<init>()
            ee r0 = new ee
            zr r1 = p000.AbstractC0782s1.f9643
            r0.<init>()
            r0.f3514 = r1
            np0 r1 = p000.np0.f7701
            r0.f3515 = r1
            gz r1 = p000.C0340gz.f4507
            r0.f3516 = r1
            r1 = 0
            r0.f3517 = r1
            r3.f3906 = r0
            m6 r0 = new m6
            r0.<init>(r3)
            r3.f3907 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public static p000.C0709q2 m2102(p000.C0282fe r2, long r3, p000.kn0 r5, float r6, int r7) {
            q2 r2 = r2.m2104(r5)
            java.lang.Object r5 = r2.f8800
            android.graphics.Paint r5 = (android.graphics.Paint) r5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L18
        Lf:
            float r0 = p000.C0114ci.m1193(r3)
            float r0 = r0 * r6
            long r3 = p000.C0114ci.m1191(r3, r0)
        L18:
            int r6 = r5.getColor()
            long r0 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            boolean r6 = p000.C0114ci.m1192(r0, r3)
            if (r6 != 0) goto L29
            r2.m4714(r3)
        L29:
            java.lang.Object r3 = r2.f8801
            android.graphics.Shader r3 = (android.graphics.Shader) r3
            r4 = 0
            if (r3 == 0) goto L33
            r2.m4715(r4)
        L33:
            java.lang.Object r3 = r2.f8802
            ga r3 = (p000.C0315ga) r3
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L42
            r2.f8802 = r4
            r5.setColorFilter(r4)
        L42:
            int r3 = r2.f8799
            if (r3 != r7) goto L47
            goto L4a
        L47:
            r2.m4713(r7)
        L4a:
            boolean r3 = r5.isFilterBitmap()
            r4 = 1
            if (r3 != r4) goto L52
            return r2
        L52:
            r5.setFilterBitmap(r4)
            return r2
    }

    @Override // p000.InterfaceC0190cw
    public final p000.np0 getLayoutDirection() {
            r0 = this;
            ee r0 = r0.f3906
            np0 r0 = r0.f3515
            return r0
    }

    @Override // p000.InterfaceC0190cw
    /* JADX INFO: renamed from: Β */
    public final p000.C0538m6 mo579() {
            r0 = this;
            m6 r0 = r0.f3907
            return r0
    }

    @Override // p000.InterfaceC0190cw
    /* JADX INFO: renamed from: Λ */
    public final void mo582(long r11, long r13, long r15, float r17, p000.kn0 r18, int r19) {
            r10 = this;
            ee r0 = r10.f3906
            de r0 = r0.f3516
            r1 = 32
            long r2 = r13 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r4
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r15 >> r1
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r2
            float r13 = java.lang.Float.intBitsToFloat(r13)
            long r4 = r4 & r15
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r13
            r4 = r10
            r5 = r11
            r8 = r17
            r7 = r18
            r9 = r19
            q2 r10 = m2102(r4, r5, r7, r8, r9)
            r15 = r10
            r12 = r14
            r10 = r0
            r13 = r1
            r14 = r2
            r11 = r3
            r10.mo1731(r11, r12, r13, r14, r15)
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            ee r0 = r0.f3906
            yr r0 = r0.f3514
            float r0 = r0.mo586()
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final p000.C0709q2 m2103(p000.kn0 r5, p000.kn0 r6, float r7, p000.C0315ga r8, int r9, int r10) {
            r4 = this;
            q2 r6 = r4.m2104(r6)
            java.lang.Object r0 = r6.f8800
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r1 = 0
            if (r5 == 0) goto L13
            long r2 = r4.mo585()
            r5.mo3381(r2, r6, r7)
            goto L3f
        L13:
            java.lang.Object r4 = r6.f8801
            android.graphics.Shader r4 = (android.graphics.Shader) r4
            if (r4 == 0) goto L1c
            r6.m4715(r1)
        L1c:
            int r4 = r0.getColor()
            long r4 = (long) r4
            r2 = 32
            long r4 = r4 << r2
            long r2 = p000.C0114ci.f2120
            boolean r4 = p000.C0114ci.m1192(r4, r2)
            if (r4 != 0) goto L2f
            r6.m4714(r2)
        L2f:
            int r4 = r0.getAlpha()
            float r4 = (float) r4
            r5 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 / r5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L3c
            goto L3f
        L3c:
            r6.m4712(r7)
        L3f:
            java.lang.Object r4 = r6.f8802
            ga r4 = (p000.C0315ga) r4
            boolean r4 = p000.ln0.m3626(r4, r8)
            if (r4 != 0) goto L52
            r6.f8802 = r8
            if (r8 == 0) goto L4f
            android.graphics.BlendModeColorFilter r1 = r8.f4290
        L4f:
            r0.setColorFilter(r1)
        L52:
            int r4 = r6.f8799
            if (r4 != r9) goto L57
            goto L5a
        L57:
            r6.m4713(r9)
        L5a:
            boolean r4 = r0.isFilterBitmap()
            if (r4 != r10) goto L61
            return r6
        L61:
            r4 = 1
            if (r10 != 0) goto L66
            r5 = r4
            goto L67
        L66:
            r5 = 0
        L67:
            r4 = r4 ^ r5
            r0.setFilterBitmap(r4)
            return r6
    }

    /* JADX INFO: renamed from: ζ */
    public final p000.C0709q2 m2104(p000.kn0 r8) {
            r7 = this;
            t30 r0 = p000.t30.f10165
            boolean r0 = p000.ln0.m3626(r8, r0)
            r1 = 0
            if (r0 == 0) goto L17
            q2 r8 = r7.f3908
            if (r8 != 0) goto L16
            q2 r8 = p000.pd2.m4479()
            r8.m4716(r1)
            r7.f3908 = r8
        L16:
            return r8
        L17:
            boolean r0 = r8 instanceof p000.y02
            if (r0 == 0) goto L94
            q2 r0 = r7.f3909
            r2 = 1
            if (r0 != 0) goto L29
            q2 r0 = p000.pd2.m4479()
            r0.m4716(r2)
            r7.f3909 = r0
        L29:
            java.lang.Object r7 = r0.f8800
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            float r3 = r7.getStrokeWidth()
            y02 r8 = (p000.y02) r8
            float r8 = r8.f12420
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L3a
            goto L3d
        L3a:
            r7.setStrokeWidth(r8)
        L3d:
            android.graphics.Paint$Cap r8 = r7.getStrokeCap()
            r3 = -1
            if (r8 != 0) goto L46
            r8 = r3
            goto L4e
        L46:
            int[] r4 = p000.AbstractC0746r2.f9233
            int r8 = r8.ordinal()
            r8 = r4[r8]
        L4e:
            r4 = 3
            r5 = 2
            if (r8 == r2) goto L5b
            if (r8 == r5) goto L59
            if (r8 == r4) goto L57
            goto L5b
        L57:
            r8 = r5
            goto L5c
        L59:
            r8 = r2
            goto L5c
        L5b:
            r8 = r1
        L5c:
            if (r8 != 0) goto L5f
            goto L64
        L5f:
            android.graphics.Paint$Cap r8 = android.graphics.Paint.Cap.BUTT
            r7.setStrokeCap(r8)
        L64:
            float r8 = r7.getStrokeMiter()
            r6 = 1082130432(0x40800000, float:4.0)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto L72
        L6f:
            r7.setStrokeMiter(r6)
        L72:
            android.graphics.Paint$Join r8 = r7.getStrokeJoin()
            if (r8 != 0) goto L79
            goto L81
        L79:
            int[] r3 = p000.AbstractC0746r2.f9234
            int r8 = r8.ordinal()
            r3 = r3[r8]
        L81:
            if (r3 == r2) goto L8b
            if (r3 == r5) goto L8a
            if (r3 == r4) goto L88
            goto L8b
        L88:
            r1 = r2
            goto L8b
        L8a:
            r1 = r5
        L8b:
            if (r1 != 0) goto L8e
            return r0
        L8e:
            android.graphics.Paint$Join r8 = android.graphics.Paint.Join.MITER
            r7.setStrokeJoin(r8)
            return r0
        L94:
            p000.C1080.m7272()
            r7 = 0
            return r7
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            ee r0 = r0.f3906
            yr r0 = r0.f3514
            float r0 = r0.mo590()
            return r0
    }

    @Override // p000.InterfaceC0190cw
    /* JADX INFO: renamed from: ρ */
    public final void mo591(p000.z91 r9, p000.kn0 r10, float r11, p000.kn0 r12, int r13) {
            r8 = this;
            ee r0 = r8.f3906
            de r0 = r0.f3516
            r5 = 0
            r7 = 1
            r1 = r8
            r2 = r10
            r4 = r11
            r3 = r12
            r6 = r13
            q2 r8 = r1.m2103(r2, r3, r4, r5, r6, r7)
            r0.mo1726(r9, r8)
            return
    }
}
