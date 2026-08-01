package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zp0 {

    /* JADX INFO: renamed from: α */
    public final p000.ch1 f13238;

    /* JADX INFO: renamed from: β */
    public boolean f13239;

    /* JADX INFO: renamed from: γ */
    public boolean f13240;

    /* JADX INFO: renamed from: δ */
    public boolean f13241;

    /* JADX INFO: renamed from: ε */
    public boolean f13242;

    /* JADX INFO: renamed from: ζ */
    public p000.InterfaceC0096c0 f13243;

    /* JADX INFO: renamed from: η */
    public final java.util.HashMap f13244;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f13245;

    public zp0(p000.InterfaceC0096c0 r1, int r2) {
            r0 = this;
            r0.f13245 = r2
            r0.<init>()
            ch1 r1 = (p000.ch1) r1
            r0.f13238 = r1
            r1 = 1
            r0.f13239 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f13244 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m7217(p000.zp0 r9, p000.re0 r10, int r11, p000.q31 r12) {
            java.util.HashMap r0 = r9.f13244
            float r11 = (float) r11
            int r1 = java.lang.Float.floatToRawIntBits(r11)
            long r1 = (long) r1
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r3 = (long) r11
            r11 = 32
            long r1 = r1 << r11
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
        L16:
            long r1 = r1 | r3
        L17:
            int r3 = r9.f13245
            switch(r3) {
                case 0: goto L3e;
                default: goto L1c;
            }
        L1c:
            fw0 r3 = r12.mo2314()
            r3.getClass()
            long r3 = r3.f4150
            long r7 = r3 >> r11
            int r7 = (int) r7
            float r7 = (float) r7
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            long r7 = r7 << r11
            long r3 = r3 & r5
            long r3 = r3 | r7
            long r1 = p000.o41.m4205(r3, r1)
            goto L4d
        L3e:
            w81 r3 = r12.f8838
            if (r3 == 0) goto L47
            r4 = 0
            long r1 = r3.mo399(r1, r4)
        L47:
            long r3 = r12.f8826
            long r1 = p000.h62.m2440(r1, r3)
        L4d:
            q31 r12 = r12.f8841
            r12.getClass()
            ch1 r3 = r9.f13238
            gm0 r3 = r3.mo1086()
            boolean r3 = r12.equals(r3)
            if (r3 != 0) goto L7c
            java.util.Map r3 = r9.m7218(r12)
            boolean r3 = r3.containsKey(r10)
            if (r3 == 0) goto L17
            int r1 = r9.m7219(r12, r10)
            float r1 = (float) r1
            int r2 = java.lang.Float.floatToRawIntBits(r1)
            long r2 = (long) r2
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r1
            long r1 = r2 << r11
            long r3 = r7 & r5
            goto L16
        L7c:
            boolean r9 = r10 instanceof p000.re0
            if (r9 == 0) goto L88
            long r11 = r1 & r5
            int r9 = (int) r11
            float r9 = java.lang.Float.intBitsToFloat(r9)
            goto L8f
        L88:
            long r11 = r1 >> r11
            int r9 = (int) r11
            float r9 = java.lang.Float.intBitsToFloat(r9)
        L8f:
            int r9 = java.lang.Math.round(r9)
            boolean r11 = r0.containsKey(r10)
            if (r11 == 0) goto Lb9
            java.lang.Object r11 = p000.ex0.m1968(r0, r10)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            re0 r12 = p000.AbstractC0001a0.f2
            p80 r12 = r10.f9355
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r12.invoke(r11, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        Lb9:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.put(r10, r9)
            return
    }

    /* JADX INFO: renamed from: β */
    public final java.util.Map m7218(p000.q31 r1) {
            r0 = this;
            int r0 = r0.f13245
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            fw0 r0 = r1.mo2314()
            r0.getClass()
            qx0 r0 = r0.mo1805()
            java.util.Map r0 = r0.mo1624()
            return r0
        L15:
            qx0 r0 = r1.mo1805()
            java.util.Map r0 = r0.mo1624()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final int m7219(p000.q31 r1, p000.re0 r2) {
            r0 = this;
            int r0 = r0.f13245
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            fw0 r0 = r1.mo2314()
            r0.getClass()
            int r0 = r0.m1815(r2)
            return r0
        L11:
            int r0 = r1.m1815(r2)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m7220() {
            r1 = this;
            boolean r0 = r1.f13240
            if (r0 != 0) goto Lf
            boolean r0 = r1.f13241
            if (r0 != 0) goto Lf
            boolean r1 = r1.f13242
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m7221() {
            r0 = this;
            r0.m7224()
            c0 r0 = r0.f13243
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final void m7222() {
            r3 = this;
            r0 = 1
            r3.f13239 = r0
            ch1 r0 = r3.f13238
            c0 r1 = r0.mo1087()
            if (r1 != 0) goto Lc
            return
        Lc:
            boolean r2 = r3.f13240
            if (r2 != 0) goto L11
            goto L14
        L11:
            r1.requestLayout()
        L14:
            boolean r2 = r3.f13241
            if (r2 == 0) goto L1b
            r0.mo1092()
        L1b:
            boolean r3 = r3.f13242
            if (r3 == 0) goto L22
            r0.requestLayout()
        L22:
            zp0 r3 = r1.mo1089()
            r3.m7222()
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m7223() {
            r3 = this;
            java.util.HashMap r0 = r3.f13244
            r0.clear()
            b0 r1 = new b0
            r2 = 0
            r1.<init>(r2, r3)
            ch1 r2 = r3.f13238
            r2.mo1090(r1)
            gm0 r1 = r2.mo1086()
            java.util.Map r1 = r3.m7218(r1)
            r0.putAll(r1)
            r0 = 0
            r3.f13239 = r0
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m7224() {
            r2 = this;
            boolean r0 = r2.m7220()
            ch1 r1 = r2.f13238
            if (r0 == 0) goto L9
            goto L51
        L9:
            c0 r0 = r1.mo1087()
            if (r0 != 0) goto L10
            goto L53
        L10:
            zp0 r0 = r0.mo1089()
            c0 r1 = r0.f13243
            if (r1 == 0) goto L23
            zp0 r0 = r1.mo1089()
            boolean r0 = r0.m7220()
            if (r0 == 0) goto L23
            goto L51
        L23:
            c0 r0 = r2.f13243
            if (r0 == 0) goto L53
            zp0 r1 = r0.mo1089()
            boolean r1 = r1.m7220()
            if (r1 == 0) goto L32
            goto L53
        L32:
            c0 r1 = r0.mo1087()
            if (r1 == 0) goto L41
            zp0 r1 = r1.mo1089()
            if (r1 == 0) goto L41
            r1.m7224()
        L41:
            c0 r0 = r0.mo1087()
            if (r0 == 0) goto L50
            zp0 r0 = r0.mo1089()
            if (r0 == 0) goto L50
            c0 r1 = r0.f13243
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f13243 = r1
        L53:
            return
    }
}
