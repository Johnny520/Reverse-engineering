package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲇᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0110 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean f490;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C1050 f491;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f492;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1102 f493;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0110 f494;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f495;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0110 f496;

    public C0110(xhss.C1102 r1, boolean r2, xhss.C1050 r3, xhss.C0110 r4) {
            r0 = this;
            r0.<init>()
            r0.f493 = r1
            r0.f490 = r2
            r0.f491 = r3
            int r1 = r3.f3375
            if (r1 != 0) goto Lf
            r1 = -1
            goto L11
        Lf:
            int r1 = r1 + (-2)
        L11:
            r0.f495 = r1
            r0.f496 = r4
            if (r4 == 0) goto L19
            r4.f494 = r0
        L19:
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static int m297(xhss.C0110 r1, xhss.C0110 r2, xhss.C0110 r3, xhss.C0110 r4) {
            if (r1 == 0) goto L9
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            int r1 = r1.m303(r0)
            goto La
        L9:
            r1 = 0
        La:
            if (r2 == 0) goto L13
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            int r2 = r2.m303(r0)
            int r1 = r1 + r2
        L13:
            if (r3 == 0) goto L1c
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r2 = r3.m303(r2)
            int r1 = r1 + r2
        L1c:
            if (r4 == 0) goto L26
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r2 = r4.m303(r2)
            int r2 = r2 + r1
            return r2
        L26:
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static int m298(java.lang.String r4, xhss.C0110[] r5, int r6) {
            int r0 = r6 * 2
            int r0 = r0 + 7
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r6) goto L18
            r3 = r5[r2]
            if (r3 != 0) goto Le
            r3 = r1
            goto L14
        Le:
            int r3 = r3.m303(r4)
            int r3 = r3 + (-8)
        L14:
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static xhss.C0110 m299(xhss.C1102 r2, java.lang.String r3, xhss.C0110 r4) {
            xhss.ᲇᛶᲁᛶ r0 = new xhss.ᲇᛶᲁᛶ
            r0.<init>()
            int r3 = r2.m1783(r3)
            r0.m1708(r3)
            r3 = 0
            r0.m1708(r3)
            xhss.ᛱᲇᲈᛶ r3 = new xhss.ᛱᲇᲈᛶ
            r1 = 1
            r3.<init>(r2, r1, r0, r4)
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static void m300(int r6, xhss.C0110[] r7, int r8, xhss.C1050 r9) {
            int r0 = r8 * 2
            int r0 = r0 + 1
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r8) goto L19
            r4 = r7[r2]
            if (r4 != 0) goto Lf
            r3 = r1
            goto L15
        Lf:
            int r3 = r4.m303(r3)
            int r3 = r3 + (-8)
        L15:
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
        L19:
            r9.m1708(r6)
            r9.m1706(r0)
            r9.m1709(r8)
            r6 = r1
        L23:
            if (r6 >= r8) goto L4a
            r0 = r7[r6]
            r2 = r1
            r4 = r3
        L29:
            if (r0 == 0) goto L36
            r0.m307()
            int r2 = r2 + 1
            xhss.ᛱᲇᲈᛶ r4 = r0.f496
            r5 = r4
            r4 = r0
            r0 = r5
            goto L29
        L36:
            r9.m1708(r2)
        L39:
            if (r4 == 0) goto L47
            xhss.ᲇᛶᲁᛶ r0 = r4.f491
            byte[] r2 = r0.f3374
            int r0 = r0.f3375
            r9.m1707(r2, r1, r0)
            xhss.ᛱᲇᲈᛶ r4 = r4.f494
            goto L39
        L47:
            int r6 = r6 + 1
            goto L23
        L4a:
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static void m301(xhss.C1102 r1, xhss.C0110 r2, xhss.C0110 r3, xhss.C0110 r4, xhss.C0110 r5, xhss.C1050 r6) {
            if (r2 == 0) goto Lb
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            int r0 = r1.m1783(r0)
            r2.m306(r0, r6)
        Lb:
            if (r3 == 0) goto L16
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r2 = r1.m1783(r2)
            r3.m306(r2, r6)
        L16:
            if (r4 == 0) goto L21
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r2 = r1.m1783(r2)
            r4.m306(r2, r6)
        L21:
            if (r5 == 0) goto L2c
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.m1783(r2)
            r5.m306(r1, r6)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static xhss.C0110 m302(xhss.C1102 r4, int r5, xhss.C1050 r6, java.lang.String r7, xhss.C0110 r8) {
            xhss.ᲇᛶᲁᛶ r0 = new xhss.ᲇᛶᲁᛶ
            r0.<init>()
            int r1 = r5 >>> 24
            r2 = 1
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L2a
            switch(r1) {
                case 16: goto L20;
                case 17: goto L20;
                case 18: goto L20;
                case 19: goto L1c;
                case 20: goto L1c;
                case 21: goto L1c;
                case 22: goto L2a;
                case 23: goto L20;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 66: goto L20;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L18;
                case 72: goto L18;
                case 73: goto L18;
                case 74: goto L18;
                case 75: goto L18;
                default: goto L12;
            }
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L18:
            r0.m1706(r5)
            goto L2f
        L1c:
            r0.m1709(r1)
            goto L2f
        L20:
            r3 = 16776960(0xffff00, float:2.3509528E-38)
            r5 = r5 & r3
            int r5 = r5 >> 8
            r0.m1704(r1, r5)
            goto L2f
        L2a:
            int r5 = r5 >>> 16
            r0.m1708(r5)
        L2f:
            r5 = 0
            if (r6 != 0) goto L36
            r0.m1709(r5)
            goto L42
        L36:
            byte[] r1 = r6.f3374
            int r6 = r6.f3375
            r3 = r1[r6]
            int r3 = r3 * 2
            int r3 = r3 + r2
            r0.m1707(r1, r6, r3)
        L42:
            int r6 = r4.m1783(r7)
            r0.m1708(r6)
            r0.m1708(r5)
            xhss.ᛱᲇᲈᛶ r5 = new xhss.ᛱᲇᲈᛶ
            r5.<init>(r4, r2, r0, r8)
            return r5
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int m303(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L7
            xhss.ᲇᲇᲈᛷ r0 = r1.f493
            r0.m1783(r2)
        L7:
            r2 = 8
        L9:
            if (r1 == 0) goto L13
            xhss.ᲇᛶᲁᛶ r0 = r1.f491
            int r0 = r0.f3375
            int r2 = r2 + r0
            xhss.ᛱᲇᲈᛶ r1 = r1.f496
            goto L9
        L13:
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m304(java.lang.Object r9, java.lang.String r10) {
            r8 = this;
            int r0 = r8.f492
            int r0 = r0 + 1
            r8.f492 = r0
            boolean r0 = r8.f490
            xhss.ᲇᲇᲈᛷ r1 = r8.f493
            xhss.ᲇᛶᲁᛶ r8 = r8.f491
            if (r0 == 0) goto L15
            int r10 = r1.m1783(r10)
            r8.m1708(r10)
        L15:
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L25
            java.lang.String r9 = (java.lang.String) r9
            int r9 = r1.m1783(r9)
            r10 = 115(0x73, float:1.61E-43)
            r8.m1704(r10, r9)
            return
        L25:
            boolean r10 = r9 instanceof java.lang.Byte
            r0 = 66
            r2 = 3
            if (r10 == 0) goto L3c
            java.lang.Byte r9 = (java.lang.Byte) r9
            byte r9 = r9.byteValue()
            xhss.ᛳᛴᛶᛷ r9 = r1.m1788(r2, r9)
            int r9 = r9.f965
            r8.m1704(r0, r9)
            return
        L3c:
            boolean r10 = r9 instanceof java.lang.Boolean
            r3 = 90
            if (r10 == 0) goto L52
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            xhss.ᛳᛴᛶᛷ r9 = r1.m1788(r2, r9)
            int r9 = r9.f965
            r8.m1704(r3, r9)
            return
        L52:
            boolean r10 = r9 instanceof java.lang.Character
            r4 = 67
            if (r10 == 0) goto L68
            java.lang.Character r9 = (java.lang.Character) r9
            char r9 = r9.charValue()
            xhss.ᛳᛴᛶᛷ r9 = r1.m1788(r2, r9)
            int r9 = r9.f965
            r8.m1704(r4, r9)
            return
        L68:
            boolean r10 = r9 instanceof java.lang.Short
            r5 = 83
            if (r10 == 0) goto L7e
            java.lang.Short r9 = (java.lang.Short) r9
            short r9 = r9.shortValue()
            xhss.ᛳᛴᛶᛷ r9 = r1.m1788(r2, r9)
            int r9 = r9.f965
            r8.m1704(r5, r9)
            return
        L7e:
            boolean r10 = r9 instanceof xhss.C0843
            if (r10 == 0) goto L92
            xhss.ᲀᛲᲀᲈ r9 = (xhss.C0843) r9
            java.lang.String r9 = r9.m1428()
            int r9 = r1.m1783(r9)
            r10 = 99
            r8.m1704(r10, r9)
            return
        L92:
            boolean r10 = r9 instanceof byte[]
            r6 = 0
            r7 = 91
            if (r10 == 0) goto Lb0
            byte[] r9 = (byte[]) r9
            int r10 = r9.length
            r8.m1704(r7, r10)
            int r10 = r9.length
        La0:
            if (r6 >= r10) goto L186
            r3 = r9[r6]
            xhss.ᛳᛴᛶᛷ r3 = r1.m1788(r2, r3)
            int r3 = r3.f965
            r8.m1704(r0, r3)
            int r6 = r6 + 1
            goto La0
        Lb0:
            boolean r10 = r9 instanceof boolean[]
            if (r10 == 0) goto Lcb
            boolean[] r9 = (boolean[]) r9
            int r10 = r9.length
            r8.m1704(r7, r10)
            int r10 = r9.length
        Lbb:
            if (r6 >= r10) goto L186
            boolean r0 = r9[r6]
            xhss.ᛳᛴᛶᛷ r0 = r1.m1788(r2, r0)
            int r0 = r0.f965
            r8.m1704(r3, r0)
            int r6 = r6 + 1
            goto Lbb
        Lcb:
            boolean r10 = r9 instanceof short[]
            if (r10 == 0) goto Le6
            short[] r9 = (short[]) r9
            int r10 = r9.length
            r8.m1704(r7, r10)
            int r10 = r9.length
        Ld6:
            if (r6 >= r10) goto L186
            short r0 = r9[r6]
            xhss.ᛳᛴᛶᛷ r0 = r1.m1788(r2, r0)
            int r0 = r0.f965
            r8.m1704(r5, r0)
            int r6 = r6 + 1
            goto Ld6
        Le6:
            boolean r10 = r9 instanceof char[]
            if (r10 == 0) goto L101
            char[] r9 = (char[]) r9
            int r10 = r9.length
            r8.m1704(r7, r10)
            int r10 = r9.length
        Lf1:
            if (r6 >= r10) goto L186
            char r0 = r9[r6]
            xhss.ᛳᛴᛶᛷ r0 = r1.m1788(r2, r0)
            int r0 = r0.f965
            r8.m1704(r4, r0)
            int r6 = r6 + 1
            goto Lf1
        L101:
            boolean r10 = r9 instanceof int[]
            if (r10 == 0) goto L11e
            int[] r9 = (int[]) r9
            int r10 = r9.length
            r8.m1704(r7, r10)
            int r10 = r9.length
        L10c:
            if (r6 >= r10) goto L186
            r0 = r9[r6]
            xhss.ᛳᛴᛶᛷ r0 = r1.m1788(r2, r0)
            int r0 = r0.f965
            r3 = 73
            r8.m1704(r3, r0)
            int r6 = r6 + 1
            goto L10c
        L11e:
            boolean r10 = r9 instanceof long[]
            if (r10 == 0) goto L13c
            long[] r9 = (long[]) r9
            int r10 = r9.length
            r8.m1704(r7, r10)
            int r10 = r9.length
        L129:
            if (r6 >= r10) goto L186
            r2 = r9[r6]
            r0 = 5
            xhss.ᛳᛴᛶᛷ r0 = r1.m1780(r2, r0)
            int r0 = r0.f965
            r2 = 74
            r8.m1704(r2, r0)
            int r6 = r6 + 1
            goto L129
        L13c:
            boolean r10 = r9 instanceof float[]
            if (r10 == 0) goto L161
            float[] r9 = (float[]) r9
            int r10 = r9.length
            r8.m1704(r7, r10)
            int r10 = r9.length
        L147:
            if (r6 >= r10) goto L186
            r0 = r9[r6]
            r1.getClass()
            r2 = 4
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            xhss.ᛳᛴᛶᛷ r0 = r1.m1788(r2, r0)
            int r0 = r0.f965
            r2 = 70
            r8.m1704(r2, r0)
            int r6 = r6 + 1
            goto L147
        L161:
            boolean r10 = r9 instanceof double[]
            if (r10 == 0) goto L187
            double[] r9 = (double[]) r9
            int r10 = r9.length
            r8.m1704(r7, r10)
            int r10 = r9.length
        L16c:
            if (r6 >= r10) goto L186
            r2 = r9[r6]
            r1.getClass()
            r0 = 6
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            xhss.ᛳᛴᛶᛷ r0 = r1.m1780(r2, r0)
            int r0 = r0.f965
            r2 = 68
            r8.m1704(r2, r0)
            int r6 = r6 + 1
            goto L16c
        L186:
            return
        L187:
            xhss.ᛳᛴᛶᛷ r9 = r1.m1777(r9)
            java.lang.String r10 = ".s.IFJDCS"
            int r0 = r9.f962
            char r10 = r10.charAt(r0)
            int r9 = r9.f965
            r8.m1704(r10, r9)
            return
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C0110 m305(java.lang.String r4) {
            r3 = this;
            int r0 = r3.f492
            int r0 = r0 + 1
            r3.f492 = r0
            boolean r0 = r3.f490
            xhss.ᲇᲇᲈᛷ r1 = r3.f493
            xhss.ᲇᛶᲁᛶ r3 = r3.f491
            if (r0 == 0) goto L15
            int r4 = r1.m1783(r4)
            r3.m1708(r4)
        L15:
            r4 = 91
            r0 = 0
            r3.m1704(r4, r0)
            xhss.ᛱᲇᲈᛶ r4 = new xhss.ᛱᲇᲈᛶ
            r2 = 0
            r4.<init>(r1, r0, r3, r2)
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m306(int r6, xhss.C1050 r7) {
            r5 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            r3 = r1
        L4:
            if (r5 == 0) goto L16
            r5.m307()
            xhss.ᲇᛶᲁᛶ r2 = r5.f491
            int r2 = r2.f3375
            int r0 = r0 + r2
            int r3 = r3 + 1
            xhss.ᛱᲇᲈᛶ r2 = r5.f496
            r4 = r2
            r2 = r5
            r5 = r4
            goto L4
        L16:
            r7.m1708(r6)
            r7.m1706(r0)
            r7.m1708(r3)
        L1f:
            if (r2 == 0) goto L2d
            xhss.ᲇᛶᲁᛶ r5 = r2.f491
            byte[] r6 = r5.f3374
            int r5 = r5.f3375
            r7.m1707(r6, r1, r5)
            xhss.ᛱᲇᲈᛶ r2 = r2.f494
            goto L1f
        L2d:
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final void m307() {
            r3 = this;
            r0 = -1
            int r1 = r3.f495
            if (r1 == r0) goto L15
            xhss.ᲇᛶᲁᛶ r0 = r3.f491
            byte[] r0 = r0.f3374
            int r3 = r3.f492
            int r2 = r3 >>> 8
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            byte r3 = (byte) r3
            r0[r1] = r3
        L15:
            return
    }
}
