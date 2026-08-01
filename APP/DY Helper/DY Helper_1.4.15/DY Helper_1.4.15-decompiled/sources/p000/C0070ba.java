package p000;

/* JADX INFO: renamed from: ba */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0070ba {

    /* JADX INFO: renamed from: α */
    public float f1575;

    /* JADX INFO: renamed from: β */
    public p000.np0 f1576;

    /* JADX INFO: renamed from: γ */
    public final p000.C0534m2 f1577;

    /* JADX INFO: renamed from: δ */
    public final long f1578;

    /* JADX INFO: renamed from: ε */
    public int f1579;

    /* JADX INFO: renamed from: ζ */
    public final long f1580;

    /* JADX INFO: renamed from: η */
    public float f1581;

    public C0070ba(p000.C0534m2 r5, long r6) {
            r4 = this;
            r4.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.f1575 = r0
            np0 r1 = p000.np0.f7701
            r4.f1576 = r1
            r4.f1577 = r5
            r4.f1578 = r6
            r1 = 1
            r4.f1579 = r1
            r1 = 0
            int r3 = (int) r1
            if (r3 < 0) goto L3f
            int r1 = (int) r1
            if (r1 < 0) goto L3f
            r1 = 32
            long r1 = r6 >> r1
            int r1 = (int) r1
            if (r1 < 0) goto L3f
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            if (r2 < 0) goto L3f
            android.graphics.Bitmap r3 = r5.f6906
            int r3 = r3.getWidth()
            if (r1 > r3) goto L3f
            android.graphics.Bitmap r5 = r5.f6906
            int r5 = r5.getHeight()
            if (r2 > r5) goto L3f
            r4.f1580 = r6
            r4.f1581 = r0
            return
        L3f:
            java.lang.String r4 = "Failed requirement."
            p000.C1080.m7275(r4)
            r4 = 0
            throw r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2f
        L3:
            boolean r0 = r5 instanceof p000.C0070ba
            if (r0 != 0) goto L8
            goto L31
        L8:
            ba r5 = (p000.C0070ba) r5
            m2 r0 = r5.f1577
            m2 r1 = r4.f1577
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 != 0) goto L15
            goto L31
        L15:
            r0 = 0
            boolean r0 = p000.um0.m5938(r0, r0)
            if (r0 != 0) goto L1e
            goto L31
        L1e:
            long r0 = r4.f1578
            long r2 = r5.f1578
            boolean r0 = p000.bn0.m985(r0, r2)
            if (r0 != 0) goto L29
            goto L31
        L29:
            int r4 = r4.f1579
            int r5 = r5.f1579
            if (r4 != r5) goto L31
        L2f:
            r4 = 1
            return r4
        L31:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r4 = this;
            m2 r0 = r4.f1577
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.f1578
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r4 = r4.f1579
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BitmapPainter(image="
            r0.<init>(r1)
            m2 r1 = r3.f1577
            r0.append(r1)
            java.lang.String r1 = ", srcOffset="
            r0.append(r1)
            r1 = 0
            java.lang.String r1 = p000.um0.m5941(r1)
            r0.append(r1)
            java.lang.String r1 = ", srcSize="
            r0.append(r1)
            long r1 = r3.f1578
            java.lang.String r1 = p000.bn0.m986(r1)
            r0.append(r1)
            java.lang.String r1 = ", filterQuality="
            r0.append(r1)
            int r3 = r3.f1579
            if (r3 != 0) goto L34
            java.lang.String r3 = "None"
            goto L48
        L34:
            r1 = 1
            if (r3 != r1) goto L3a
            java.lang.String r3 = "Low"
            goto L48
        L3a:
            r1 = 2
            if (r3 != r1) goto L40
            java.lang.String r3 = "Medium"
            goto L48
        L40:
            r1 = 3
            if (r3 != r1) goto L46
            java.lang.String r3 = "High"
            goto L48
        L46:
            java.lang.String r3 = "Unknown"
        L48:
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final void m830(p000.aq0 r17, long r18, float r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            fe r10 = r1.f1284
            float r3 = r0.f1575
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto Lf
            goto L13
        Lf:
            r0.f1581 = r2
            r0.f1575 = r2
        L13:
            np0 r3 = r1.getLayoutDirection()
            np0 r4 = r0.f1576
            if (r4 == r3) goto L1d
            r0.f1576 = r3
        L1d:
            long r3 = r10.mo585()
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r6 = r18 >> r5
            int r4 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r4)
            float r11 = r3 - r6
            long r6 = r10.mo585()
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r3 = (int) r6
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r6 = r18 & r8
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r12 = r3 - r7
            m6 r3 = r10.f3907
            java.lang.Object r3 = r3.f6967
            n r3 = (p000.C0568n) r3
            r7 = 0
            r3.m3929(r7, r7, r11, r12)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 <= 0) goto Laa
            float r2 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> L9d
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto Laa
            float r2 = java.lang.Float.intBitsToFloat(r6)     // Catch: java.lang.Throwable -> L9d
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto Laa
            m2 r1 = r0.f1577     // Catch: java.lang.Throwable -> L9d
            long r2 = r0.f1578     // Catch: java.lang.Throwable -> L9d
            long r6 = r10.mo585()     // Catch: java.lang.Throwable -> L9d
            long r6 = r6 >> r5
            int r4 = (int) r6     // Catch: java.lang.Throwable -> L9d
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> L9d
            int r4 = java.lang.Math.round(r4)     // Catch: java.lang.Throwable -> L9d
            long r6 = r10.mo585()     // Catch: java.lang.Throwable -> L9d
            long r6 = r6 & r8
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L9d
            float r6 = java.lang.Float.intBitsToFloat(r6)     // Catch: java.lang.Throwable -> L9d
            int r6 = java.lang.Math.round(r6)     // Catch: java.lang.Throwable -> L9d
            long r14 = (long) r4     // Catch: java.lang.Throwable -> L9d
            long r4 = r14 << r5
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L9d
            long r6 = r6 & r8
            long r4 = r4 | r6
            float r6 = r0.f1581     // Catch: java.lang.Throwable -> L9d
            int r8 = r0.f1579     // Catch: java.lang.Throwable -> L9d
            r9 = 328(0x148, float:4.6E-43)
            r7 = 0
            r0 = r17
            p000.InterfaceC0190cw.m1618(r0, r1, r2, r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9d
            goto Laa
        L9d:
            r0 = move-exception
            m6 r1 = r10.f3907
            java.lang.Object r1 = r1.f6967
            n r1 = (p000.C0568n) r1
            float r2 = -r11
            float r3 = -r12
            r1.m3929(r13, r13, r2, r3)
            throw r0
        Laa:
            m6 r0 = r10.f3907
            java.lang.Object r0 = r0.f6967
            n r0 = (p000.C0568n) r0
            float r1 = -r11
            float r2 = -r12
            r0.m3929(r13, r13, r1, r2)
            return
    }
}
