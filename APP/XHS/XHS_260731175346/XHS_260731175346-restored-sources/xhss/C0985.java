package xhss;

/* JADX INFO: renamed from: xhss.ᲁᲁᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0985 {

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static final xhss.C0985 f3194 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public short f3195;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int[] f3196;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int[] f3197;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public short f3198;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public xhss.C0481 f3199;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public short f3200;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public short f3201;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public xhss.C0985 f3202;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public xhss.C0103 f3203;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public short f3204;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f3205;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public short f3206;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public xhss.C0985 f3207;

    static {
            xhss.ᲁᲁᛱᲀ r0 = new xhss.ᲁᲁᛱᲀ
            r0.<init>()
            xhss.C0985.f3194 = r0
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r0 = "L"
            java.lang.String r1 = xhss.AbstractC0390.m774(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0985 m1619() {
            r1 = this;
            xhss.ᛱᲁᲀᛲ r0 = r1.f3203
            if (r0 != 0) goto L5
            return r1
        L5:
            xhss.ᲁᲁᛱᲀ r1 = r0.f473
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0985 m1620(xhss.C0985 r4) {
            r3 = this;
            xhss.ᛵᛶᛳ r0 = r3.f3199
        L2:
            if (r0 == 0) goto L23
            short r1 = r3.f3198
            r1 = r1 & 16
            if (r1 == 0) goto L13
            xhss.ᛵᛶᛳ r1 = r3.f3199
            java.lang.Object r1 = r1.f1744
            xhss.ᛵᛶᛳ r1 = (xhss.C0481) r1
            if (r0 != r1) goto L13
            goto L1e
        L13:
            java.lang.Object r1 = r0.f1742
            xhss.ᲁᲁᛱᲀ r1 = (xhss.C0985) r1
            xhss.ᲁᲁᛱᲀ r2 = r1.f3202
            if (r2 != 0) goto L1e
            r1.f3202 = r4
            r4 = r1
        L1e:
            java.lang.Object r0 = r0.f1744
            xhss.ᛵᛶᛳ r0 = (xhss.C0481) r0
            goto L2
        L23:
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final boolean m1621(byte[] r8, xhss.C1050 r9, int r10) {
            r7 = this;
            short r0 = r7.f3198
            r0 = r0 | 4
            short r0 = (short) r0
            r7.f3198 = r0
            r7.f3205 = r10
            int[] r0 = r7.f3197
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r0[r1]
        L11:
            if (r0 <= 0) goto L7b
            int[] r2 = r7.f3197
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
            byte[] r2 = r9.f3374
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1622(int r7, int r8, int r9) {
            r6 = this;
            int[] r0 = r6.f3197
            r1 = 6
            if (r0 != 0) goto L9
            int[] r0 = new int[r1]
            r6.f3197 = r0
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
            r6.f3197 = r1
            r0 = r1
        L1c:
            int r3 = r3 + 1
            r0[r3] = r7
            r6 = r8 | r9
            r0[r4] = r6
            r0[r2] = r4
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1623(xhss.C1050 r3, int r4, boolean r5) {
            r2 = this;
            short r0 = r2.f3198
            r0 = r0 & 4
            if (r0 != 0) goto L1d
            int r0 = r3.f3375
            r1 = -1
            if (r5 == 0) goto L14
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r2.m1622(r4, r5, r0)
            r3.m1706(r1)
            return
        L14:
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r2.m1622(r4, r5, r0)
            r3.m1708(r1)
            return
        L1d:
            int r2 = r2.f3205
            if (r5 == 0) goto L26
            int r2 = r2 - r4
            r3.m1706(r2)
            return
        L26:
            int r2 = r2 - r4
            r3.m1708(r2)
            return
    }
}
