package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lf0 {

    /* JADX INFO: renamed from: α */
    public int f6595;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f6596;

    /* JADX INFO: renamed from: γ */
    public final p000.rk1 f6597;

    /* JADX INFO: renamed from: δ */
    public p000.tc0[] f6598;

    /* JADX INFO: renamed from: ε */
    public int f6599;

    /* JADX INFO: renamed from: ζ */
    public int f6600;

    /* JADX INFO: renamed from: η */
    public int f6601;

    public lf0(p000.fg0 r2) {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r1.f6595 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6596 = r0
            rk1 r0 = new rk1
            r0.<init>(r2)
            r1.f6597 = r0
            r2 = 8
            tc0[] r2 = new p000.tc0[r2]
            r1.f6598 = r2
            r2 = 7
            r1.f6599 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final int m3552(int r5) {
            r4 = this;
            r0 = 0
            if (r5 <= 0) goto L39
            tc0[] r1 = r4.f6598
            int r1 = r1.length
            int r1 = r1 + (-1)
        L8:
            int r2 = r4.f6599
            if (r1 < r2) goto L28
            if (r5 <= 0) goto L28
            tc0[] r2 = r4.f6598
            r2 = r2[r1]
            r2.getClass()
            int r2 = r2.f10313
            int r5 = r5 - r2
            int r3 = r4.f6601
            int r3 = r3 - r2
            r4.f6601 = r3
            int r2 = r4.f6600
            int r2 = r2 + (-1)
            r4.f6600 = r2
            int r0 = r0 + 1
            int r1 = r1 + (-1)
            goto L8
        L28:
            tc0[] r5 = r4.f6598
            int r1 = r2 + 1
            int r2 = r2 + 1
            int r2 = r2 + r0
            int r3 = r4.f6600
            java.lang.System.arraycopy(r5, r1, r5, r2, r3)
            int r5 = r4.f6599
            int r5 = r5 + r0
            r4.f6599 = r5
        L39:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final p000.C0208dd m3553(int r3) {
            r2 = this;
            if (r3 < 0) goto Le
            tc0[] r0 = p000.nf0.f7591
            int r1 = r0.length
            int r1 = r1 + (-1)
            if (r3 > r1) goto Le
            r2 = r0[r3]
            dd r2 = r2.f10311
            return r2
        Le:
            tc0[] r0 = p000.nf0.f7591
            int r0 = r0.length
            int r0 = r3 - r0
            int r1 = r2.f6599
            int r1 = r1 + 1
            int r1 = r1 + r0
            if (r1 < 0) goto L27
            tc0[] r2 = r2.f6598
            int r0 = r2.length
            if (r1 >= r0) goto L27
            r2 = r2[r1]
            r2.getClass()
            dd r2 = r2.f10311
            return r2
        L27:
            java.io.IOException r2 = new java.io.IOException
            int r3 = r3 + 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Header index too large "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: γ */
    public final void m3554(p000.tc0 r7) {
            r6 = this;
            java.util.ArrayList r0 = r6.f6596
            r0.add(r7)
            int r0 = r7.f10313
            int r1 = r6.f6595
            r2 = 0
            if (r0 <= r1) goto L1e
            tc0[] r7 = r6.f6598
            r0 = 0
            p000.AbstractC0312g7.m2246(r0, r7)
            tc0[] r7 = r6.f6598
            int r7 = r7.length
            int r7 = r7 + (-1)
            r6.f6599 = r7
            r6.f6600 = r2
            r6.f6601 = r2
            return
        L1e:
            int r3 = r6.f6601
            int r3 = r3 + r0
            int r3 = r3 - r1
            r6.m3552(r3)
            int r1 = r6.f6600
            int r1 = r1 + 1
            tc0[] r3 = r6.f6598
            int r4 = r3.length
            if (r1 <= r4) goto L41
            int r1 = r3.length
            int r1 = r1 * 2
            tc0[] r1 = new p000.tc0[r1]
            int r4 = r3.length
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r4, r5)
            tc0[] r2 = r6.f6598
            int r2 = r2.length
            int r2 = r2 + (-1)
            r6.f6599 = r2
            r6.f6598 = r1
        L41:
            int r1 = r6.f6599
            int r2 = r1 + (-1)
            r6.f6599 = r2
            tc0[] r2 = r6.f6598
            r2[r1] = r7
            int r7 = r6.f6600
            int r7 = r7 + 1
            r6.f6600 = r7
            int r7 = r6.f6601
            int r7 = r7 + r0
            r6.f6601 = r7
            return
    }

    /* JADX INFO: renamed from: δ */
    public final p000.C0208dd m3555() {
            r11 = this;
            rk1 r0 = r11.f6597
            byte r1 = r0.readByte()
            byte[] r2 = p000.sd2.f9867
            r2 = r1 & 255(0xff, float:3.57E-43)
            r3 = 128(0x80, float:1.8E-43)
            r1 = r1 & r3
            r4 = 0
            if (r1 != r3) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = r4
        L13:
            r3 = 127(0x7f, float:1.78E-43)
            int r11 = r11.m3556(r2, r3)
            long r2 = (long) r11
            if (r1 == 0) goto L99
            sc r11 = new sc
            r11.<init>()
            int[] r1 = p000.qg0.f9000
            r0.getClass()
            pg0 r1 = p000.qg0.f9002
            r5 = 0
            r8 = r1
            r6 = r5
            r5 = r4
        L2d:
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 >= 0) goto L6b
            byte r9 = r0.readByte()
            byte[] r10 = p000.sd2.f9867
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r9
            int r5 = r5 + 8
        L3e:
            r9 = 8
            if (r5 < r9) goto L67
            int r9 = r5 + (-8)
            int r9 = r4 >>> r9
            r9 = r9 & 255(0xff, float:3.57E-43)
            java.lang.Object r8 = r8.f8550
            pg0[] r8 = (p000.pg0[]) r8
            r8.getClass()
            r8 = r8[r9]
            r8.getClass()
            java.lang.Object r9 = r8.f8550
            pg0[] r9 = (p000.pg0[]) r9
            if (r9 != 0) goto L64
            int r9 = r8.f8548
            r11.m5466(r9)
            int r8 = r8.f8549
            int r5 = r5 - r8
            r8 = r1
            goto L3e
        L64:
            int r5 = r5 + (-8)
            goto L3e
        L67:
            r9 = 1
            long r6 = r6 + r9
            goto L2d
        L6b:
            if (r5 <= 0) goto L92
            int r0 = 8 - r5
            int r0 = r4 << r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Object r2 = r8.f8550
            pg0[] r2 = (p000.pg0[]) r2
            r2.getClass()
            r0 = r2[r0]
            r0.getClass()
            int r2 = r0.f8549
            java.lang.Object r3 = r0.f8550
            pg0[] r3 = (p000.pg0[]) r3
            if (r3 != 0) goto L92
            if (r2 <= r5) goto L8a
            goto L92
        L8a:
            int r0 = r0.f8548
            r11.m5466(r0)
            int r5 = r5 - r2
            r8 = r1
            goto L6b
        L92:
            long r0 = r11.f9828
            dd r11 = r11.mo58(r0)
            return r11
        L99:
            dd r11 = r0.mo58(r2)
            return r11
    }

    /* JADX INFO: renamed from: ε */
    public final int m3556(int r4, int r5) {
            r3 = this;
            r4 = r4 & r5
            if (r4 >= r5) goto L4
            return r4
        L4:
            r4 = 0
        L5:
            rk1 r0 = r3.f6597
            byte r0 = r0.readByte()
            byte[] r1 = p000.sd2.f9867
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = r0 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L1a
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << r4
            int r5 = r5 + r0
            int r4 = r4 + 7
            goto L5
        L1a:
            int r3 = r1 << r4
            int r5 = r5 + r3
            return r5
    }
}
