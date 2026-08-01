package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛶᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0485 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static boolean f1777;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0547 f1778 = null;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0547 f1779 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0527 f1780;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final xhss.C0276 f1781 = null;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final xhss.C0276 f1782 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final xhss.C0547 f1783 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0547 f1784 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C0547 f1785 = null;

    static {
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "COMPLETING_ALREADY"
            r2 = 2
            r0.<init>(r1, r2)
            xhss.AbstractC0485.f1778 = r0
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "COMPLETING_WAITING_CHILDREN"
            r0.<init>(r1, r2)
            xhss.AbstractC0485.f1784 = r0
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "COMPLETING_RETRY"
            r0.<init>(r1, r2)
            xhss.AbstractC0485.f1779 = r0
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "TOO_LATE_TO_CANCEL"
            r0.<init>(r1, r2)
            xhss.AbstractC0485.f1785 = r0
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "SEALED"
            r0.<init>(r1, r2)
            xhss.AbstractC0485.f1783 = r0
            xhss.ᛳᛵᲁᛵ r0 = new xhss.ᛳᛵᲁᛵ
            r1 = 0
            r0.<init>(r1)
            xhss.AbstractC0485.f1782 = r0
            xhss.ᛳᛵᲁᛵ r0 = new xhss.ᛳᛵᲁᛵ
            r1 = 1
            r0.<init>(r1)
            xhss.AbstractC0485.f1781 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final void m881(int r3, int r4) {
            if (r3 > r4) goto L3
            return
        L3:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "toIndex ("
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ") is greater than size ("
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ")."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static void m882(java.lang.String r5) {
            r0 = -278176903563333(0xffff02ffe47a77bb, double:NaN)
            r2 = -278078119315525(0xffff0316e47a77bb, double:NaN)
            int r0 = xhss.AbstractC0390.m780(r0, r5, r2)
            if (r0 != 0) goto L11
            goto L33
        L11:
            int r0 = r5.length()
            r1 = 0
        L16:
            if (r1 >= r0) goto L33
            int r2 = r1 + 2000
            if (r2 <= r0) goto L1d
            r2 = r0
        L1d:
            java.lang.String r1 = r5.substring(r1, r2)
            r3 = -278112479053893(0xffff030ee47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r3)
            xhss.ᲇᲁᛱᛸ r3 = xhss.C1085.f3497
            r3.getClass()
            xhss.C1085.m1750(r1)
            r1 = r2
            goto L16
        L33:
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static xhss.C0721 m883(android.view.Display r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L36
            android.view.RoundedCorner r3 = xhss.AbstractC1022.m1671(r3, r4)
            if (r3 == 0) goto L36
            xhss.ᛷᲈᲇᛸ r4 = new xhss.ᛷᲈᲇᛸ
            int r0 = xhss.AbstractC1022.m1666(r3)
            if (r0 == 0) goto L29
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L2a
            r1 = 3
            if (r0 != r1) goto L1f
            goto L2a
        L1f:
            java.lang.String r3 = "Invalid position: "
            java.lang.String r3 = xhss.AbstractC0390.m774(r3, r0)
            xhss.C0532.m959(r3)
            return r2
        L29:
            r1 = 0
        L2a:
            int r0 = xhss.AbstractC1022.m1670(r3)
            android.graphics.Point r3 = xhss.AbstractC1022.m1667(r3)
            r4.<init>(r1, r0, r3)
            return r4
        L36:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static java.lang.Class m884(java.lang.Class r1) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L7
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L7:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto Le
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        Le:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L15
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            return r1
        L15:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L1c
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L23
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L23:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L2a
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L2a:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L31
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        L31:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L38
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            return r1
        L38:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r1 != r0) goto L3e
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
        L3e:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final java.lang.String m885(java.lang.Object[] r3, int r4, int r5, xhss.AbstractC0779 r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lf:
            if (r1 >= r5) goto L2a
            if (r1 <= 0) goto L18
            java.lang.String r2 = ", "
            r0.append(r2)
        L18:
            int r2 = r4 + r1
            r2 = r3[r2]
            if (r2 != r6) goto L24
            java.lang.String r2 = "(this Collection)"
            r0.append(r2)
            goto L27
        L24:
            r0.append(r2)
        L27:
            int r1 = r1 + 1
            goto Lf
        L2a:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final int m886(xhss.C0674 r4, int r5) {
            int[] r0 = r4.f2292
            int r5 = r5 + 1
            byte[][] r4 = r4.f2293
            int r4 = r4.length
            int r4 = r4 + (-1)
            r1 = 0
        La:
            if (r1 > r4) goto L1c
            int r2 = r1 + r4
            int r2 = r2 >>> 1
            r3 = r0[r2]
            if (r3 >= r5) goto L17
            int r1 = r2 + 1
            goto La
        L17:
            if (r3 <= r5) goto L1f
            int r4 = r2 + (-1)
            goto La
        L1c:
            int r4 = -r1
            int r2 = r4 + (-1)
        L1f:
            if (r2 < 0) goto L22
            return r2
        L22:
            int r4 = ~r2
            return r4
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final java.lang.Class m887(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L16
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            java.lang.Class r3 = m887(r3)
            return r3
        L16:
            xhss.ᲇᛲᛶᛸ r0 = new xhss.ᲇᛲᛶᛸ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot cast type "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " to java.lang.Class object."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final void m888(java.lang.Object[] r1, int r2, int r3) {
        L0:
            if (r2 >= r3) goto L8
            r0 = 0
            r1[r2] = r0
            int r2 = r2 + 1
            goto L0
        L8:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.InterfaceC0362 m889(xhss.InterfaceC0362 r3, xhss.InterfaceC0362 r4, boolean r5) {
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            xhss.ᲇᛵᲈᛵ r0 = new xhss.ᲇᛵᲈᛵ
            r1 = 4
            r0.<init>(r1)
            java.lang.Object r0 = r3.mo598(r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            xhss.ᲇᛵᲈᛵ r2 = new xhss.ᲇᛵᲈᛵ
            r2.<init>(r1)
            java.lang.Object r5 = r4.mo598(r5, r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r0 != 0) goto L2a
            if (r5 != 0) goto L2a
            xhss.ᛴᛵᛳᛵ r3 = r3.mo599(r4)
            return r3
        L2a:
            xhss.ᲇᛵᲈᛵ r0 = new xhss.ᲇᛵᲈᛵ
            r1 = 2
            r0.<init>(r1)
            xhss.ᲇᛷᲁᛷ r1 = xhss.C1059.f3421
            java.lang.Object r3 = r3.mo598(r1, r0)
            xhss.ᛴᛵᛳᛵ r3 = (xhss.InterfaceC0362) r3
            if (r5 == 0) goto L46
            xhss.ᛴᛵᛳᛵ r4 = (xhss.InterfaceC0362) r4
            xhss.ᲇᛵᲈᛵ r5 = new xhss.ᲇᛵᲈᛵ
            r0 = 3
            r5.<init>(r0)
            java.lang.Object r4 = r4.mo598(r1, r5)
        L46:
            xhss.ᛴᛵᛳᛵ r4 = (xhss.InterfaceC0362) r4
            xhss.ᛴᛵᛳᛵ r3 = r3.mo599(r4)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static int m890(int r1, int r2, int r3) {
            r2 = r2 & 8
            if (r2 == 0) goto L6
            int r1 = r1 + (-1)
        L6:
            if (r3 > r1) goto La
            int r1 = r1 - r3
            return r1
        La:
            java.lang.String r2 = "PROTOCOL_ERROR padding "
            java.lang.String r0 = " > remaining length "
            java.lang.String r1 = xhss.AbstractC0390.m782(r3, r1, r2, r0)
            xhss.C0532.m947(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final xhss.C1194 m891(xhss.AbstractC0748 r2, xhss.InterfaceC0362 r3, java.lang.Object r4) {
            r0 = 0
            if (r2 != 0) goto L4
            goto L24
        L4:
            xhss.ᲈᲁᲇ r1 = xhss.C1189.f3838
            xhss.ᛳᛵᲈᛲ r1 = r3.mo442(r1)
            if (r1 == 0) goto L24
        Lc:
            boolean r1 = r2 instanceof xhss.C0236
            if (r1 == 0) goto L11
            goto L1f
        L11:
            xhss.ᛱᲇᲀᛷ r2 = r2.mo296()
            if (r2 != 0) goto L18
            goto L1f
        L18:
            boolean r1 = r2 instanceof xhss.C1194
            if (r1 == 0) goto Lc
            r0 = r2
            xhss.ᲈᲇᛵ r0 = (xhss.C1194) r0
        L1f:
            if (r0 == 0) goto L24
            r0.m1918(r3, r4)
        L24:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public abstract java.util.List mo892(java.util.List r1, java.lang.String r2);
}
