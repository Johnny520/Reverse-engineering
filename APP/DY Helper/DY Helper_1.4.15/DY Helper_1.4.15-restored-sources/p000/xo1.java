package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xo1 implements p000.iv1 {

    /* JADX INFO: renamed from: α */
    public final p000.ea1 f12247;

    /* JADX INFO: renamed from: β */
    public final p000.ea1 f12248;

    /* JADX INFO: renamed from: γ */
    public final p000.ea1 f12249;

    /* JADX INFO: renamed from: δ */
    public final p000.ea1 f12250;

    public xo1(p000.ea1 r1, p000.ea1 r2, p000.ea1 r3, p000.ea1 r4) {
            r0 = this;
            r0.<init>()
            r0.f12247 = r1
            r0.f12248 = r2
            r0.f12249 = r3
            r0.f12250 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.xo1
            if (r0 != 0) goto L8
            goto L35
        L8:
            xo1 r3 = (p000.xo1) r3
            ea1 r0 = r3.f12247
            ea1 r1 = r2.f12247
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L35
        L15:
            ea1 r0 = r2.f12248
            ea1 r1 = r3.f12248
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            ea1 r0 = r2.f12249
            ea1 r1 = r3.f12249
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            ea1 r2 = r2.f12250
            ea1 r3 = r3.f12250
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            ea1 r0 = r3.f12247
            float r0 = r0.f3464
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            ea1 r2 = r3.f12248
            float r2 = r2.f3464
            int r0 = p000.lz1.m3676(r2, r0, r1)
            ea1 r2 = r3.f12249
            float r2 = r2.f3464
            int r0 = p000.lz1.m3676(r2, r0, r1)
            ea1 r3 = r3.f12250
            float r3 = r3.f3464
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RoundedCornerShape(topStart = "
            r0.<init>(r1)
            ea1 r1 = r2.f12247
            r0.append(r1)
            java.lang.String r1 = ", topEnd = "
            r0.append(r1)
            ea1 r1 = r2.f12248
            r0.append(r1)
            java.lang.String r1 = ", bottomEnd = "
            r0.append(r1)
            ea1 r1 = r2.f12249
            r0.append(r1)
            java.lang.String r1 = ", bottomStart = "
            r0.append(r1)
            ea1 r2 = r2.f12250
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.iv1
    /* JADX INFO: renamed from: α */
    public final p000.u81 mo2812(long r29, p000.np0 r31, p000.InterfaceC1031yr r32) {
            r28 = this;
            r0 = r28
            r1 = r29
            r3 = r31
            ea1 r4 = r0.f12247
            float r4 = r4.m1890(r1)
            ea1 r5 = r0.f12248
            float r5 = r5.m1890(r1)
            ea1 r6 = r0.f12249
            float r6 = r6.m1890(r1)
            ea1 r0 = r0.f12250
            float r0 = r0.m1890(r1)
            float r7 = p000.jw1.m2998(r1)
            float r8 = r4 + r0
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 <= 0) goto L2c
            float r8 = r7 / r8
            float r4 = r4 * r8
            float r0 = r0 * r8
        L2c:
            float r8 = r5 + r6
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 <= 0) goto L35
            float r7 = r7 / r8
            float r5 = r5 * r7
            float r6 = r6 * r7
        L35:
            r7 = 0
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 < 0) goto L47
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 < 0) goto L47
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 < 0) goto L47
            int r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r8 < 0) goto L47
            goto L75
        L47:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Corner size in Px can't be negative(topStart = "
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r9 = ", topEnd = "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = ", bottomEnd = "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ", bottomStart = "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = ")!"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            p000.dm0.m1779(r8)
        L75:
            float r8 = r4 + r5
            float r8 = r8 + r6
            float r8 = r8 + r0
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L89
            s81 r0 = new s81
            ml1 r1 = p000.i91.m2676(r8, r1)
            r0.<init>(r1)
            return r0
        L89:
            t81 r7 = new t81
            ml1 r1 = p000.i91.m2676(r8, r1)
            np0 r2 = p000.np0.f7701
            if (r3 != r2) goto L95
            r8 = r4
            goto L96
        L95:
            r8 = r5
        L96:
            int r9 = java.lang.Float.floatToRawIntBits(r8)
            long r9 = (long) r9
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r11 = (long) r8
            r8 = 32
            long r9 = r9 << r8
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r13
            long r20 = r9 | r11
            if (r3 != r2) goto Lae
            r4 = r5
        Lae:
            int r5 = java.lang.Float.floatToRawIntBits(r4)
            long r9 = (long) r5
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r4
            long r9 = r9 << r8
            long r4 = r4 & r13
            long r22 = r9 | r4
            if (r3 != r2) goto Lc0
            r4 = r6
            goto Lc1
        Lc0:
            r4 = r0
        Lc1:
            int r5 = java.lang.Float.floatToRawIntBits(r4)
            long r9 = (long) r5
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r4
            long r9 = r9 << r8
            long r4 = r4 & r13
            long r24 = r9 | r4
            if (r3 != r2) goto Ld2
            goto Ld3
        Ld2:
            r0 = r6
        Ld3:
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r2
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r4 = (long) r0
            long r2 = r2 << r8
            long r4 = r4 & r13
            long r26 = r2 | r4
            wo1 r15 = new wo1
            float r0 = r1.f7200
            float r2 = r1.f7201
            float r3 = r1.f7202
            float r1 = r1.f7203
            r16 = r0
            r19 = r1
            r17 = r2
            r18 = r3
            r15.<init>(r16, r17, r18, r19, r20, r22, r24, r26)
            r7.<init>(r15)
            return r7
    }
}
