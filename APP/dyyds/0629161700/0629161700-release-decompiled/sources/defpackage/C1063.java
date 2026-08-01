package defpackage;

/* JADX INFO: renamed from: ᛶᛴᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1063 {

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final defpackage.C1063 f4700 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public short f4701;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public defpackage.C1063 f4702;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public defpackage.C1126 f4703;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public short f4704;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int[] f4705;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public defpackage.C1063 f4706;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f4707;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int[] f4708;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public short f4709;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.C1468 f4710;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public short f4711;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public short f4712;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public short f4713;

    static {
            ᛶᛴᲀᲇ r0 = new ᛶᛴᲀᲇ
            r0.<init>()
            defpackage.C1063.f4700 = r0
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r0 = "L"
            java.lang.String r1 = defpackage.AbstractC1124.m2145(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean m2012(byte[] r8, defpackage.C0031 r9, int r10) {
            r7 = this;
            short r0 = r7.f4709
            r0 = r0 | 4
            short r0 = (short) r0
            r7.f4709 = r0
            r7.f4707 = r10
            int[] r0 = r7.f4705
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r0[r1]
        L11:
            if (r0 <= 0) goto L7b
            int[] r2 = r7.f4705
            int r3 = r0 + (-1)
            r3 = r2[r3]
            r2 = r2[r0]
            int r4 = r10 - r3
            r5 = 268435455(0xfffffff, float:2.5243547E-29)
            r5 = r5 & r2
            r6 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r2 = r2 & r6
            r6 = 268435456(0x10000000, float:2.524355E-29)
            if (r2 != r6) goto L4f
            r2 = -32768(0xffffffffffff8000, float:NaN)
            if (r4 < r2) goto L30
            r2 = 32767(0x7fff, float:4.5916E-41)
            if (r4 <= r2) goto L44
        L30:
            r1 = r8[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 198(0xc6, float:2.77E-43)
            if (r1 >= r2) goto L3e
            int r1 = r1 + 49
            byte r1 = (byte) r1
            r8[r3] = r1
            goto L43
        L3e:
            int r1 = r1 + 20
            byte r1 = (byte) r1
            r8[r3] = r1
        L43:
            r1 = 1
        L44:
            int r2 = r5 + 1
            int r3 = r4 >>> 8
            byte r3 = (byte) r3
            r8[r5] = r3
            byte r3 = (byte) r4
            r8[r2] = r3
            goto L78
        L4f:
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 != r3) goto L6c
            int r2 = r5 + 1
            int r3 = r4 >>> 24
            byte r3 = (byte) r3
            r8[r5] = r3
            int r3 = r5 + 2
            int r6 = r4 >>> 16
            byte r6 = (byte) r6
            r8[r2] = r6
            int r5 = r5 + 3
            int r2 = r4 >>> 8
            byte r2 = (byte) r2
            r8[r3] = r2
            byte r2 = (byte) r4
            r8[r5] = r2
            goto L78
        L6c:
            byte[] r2 = r9.f520
            int r3 = r5 + 1
            int r4 = r10 >>> 8
            byte r4 = (byte) r4
            r2[r5] = r4
            byte r4 = (byte) r10
            r2[r3] = r4
        L78:
            int r0 = r0 + (-2)
            goto L11
        L7b:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m2013(defpackage.C0031 r3, int r4, boolean r5) {
            r2 = this;
            short r0 = r2.f4709
            r0 = r0 & 4
            if (r0 != 0) goto L1d
            int r0 = r3.f518
            r1 = -1
            if (r5 == 0) goto L14
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r2.m2015(r4, r5, r0)
            r3.m339(r1)
            return
        L14:
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r2.m2015(r4, r5, r0)
            r3.m344(r1)
            return
        L1d:
            int r2 = r2.f4707
            if (r5 == 0) goto L26
            int r2 = r2 - r4
            r3.m339(r2)
            return
        L26:
            int r2 = r2 - r4
            r3.m344(r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1063 m2014(defpackage.C1063 r4) {
            r3 = this;
            ᛶᛸᛶᛲ r0 = r3.f4703
        L2:
            if (r0 == 0) goto L23
            short r1 = r3.f4709
            r1 = r1 & 16
            if (r1 == 0) goto L13
            ᛶᛸᛶᛲ r1 = r3.f4703
            java.lang.Object r1 = r1.f5013
            ᛶᛸᛶᛲ r1 = (defpackage.C1126) r1
            if (r0 != r1) goto L13
            goto L1e
        L13:
            java.lang.Object r1 = r0.f5014
            ᛶᛴᲀᲇ r1 = (defpackage.C1063) r1
            ᛶᛴᲀᲇ r2 = r1.f4706
            if (r2 != 0) goto L1e
            r1.f4706 = r4
            r4 = r1
        L1e:
            java.lang.Object r0 = r0.f5013
            ᛶᛸᛶᛲ r0 = (defpackage.C1126) r0
            goto L2
        L23:
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2015(int r7, int r8, int r9) {
            r6 = this;
            int[] r0 = r6.f4705
            r1 = 6
            if (r0 != 0) goto L9
            int[] r0 = new int[r1]
            r6.f4705 = r0
        L9:
            r2 = 0
            r3 = r0[r2]
            int r4 = r3 + 2
            int r5 = r0.length
            if (r4 < r5) goto L1c
            int r5 = r0.length
            int r5 = r5 + r1
            int[] r1 = new int[r5]
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r2, r1, r2, r5)
            r6.f4705 = r1
            r0 = r1
        L1c:
            int r3 = r3 + 1
            r0[r3] = r7
            r6 = r8 | r9
            r0[r4] = r6
            r0[r2] = r4
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1063 m2016() {
            r1 = this;
            ᛸᛴᛱᲁ r0 = r1.f4710
            if (r0 != 0) goto L5
            return r1
        L5:
            ᛶᛴᲀᲇ r1 = r0.f6503
            return r1
    }
}
