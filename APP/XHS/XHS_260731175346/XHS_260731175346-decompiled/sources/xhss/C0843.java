package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛲᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0843 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0843 f2730 = null;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static final xhss.C0843 f2731 = null;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final xhss.C0843 f2732 = null;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final xhss.C0843 f2733 = null;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final xhss.C0843 f2734 = null;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final xhss.C0843 f2735 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final xhss.C0843 f2736 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C0843 f2737 = null;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final xhss.C0843 f2738 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f2739;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f2740;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f2741;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f2742;

    static {
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r1 = 0
            r2 = 1
            java.lang.String r3 = "VZCBSIFJD"
            r0.<init>(r1, r1, r2, r3)
            xhss.C0843.f2730 = r0
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r1 = 2
            r0.<init>(r2, r2, r1, r3)
            xhss.C0843.f2737 = r0
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r2 = 3
            r0.<init>(r1, r1, r2, r3)
            xhss.C0843.f2736 = r0
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r1 = 4
            r0.<init>(r2, r2, r1, r3)
            xhss.C0843.f2733 = r0
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r2 = 5
            r0.<init>(r1, r1, r2, r3)
            xhss.C0843.f2732 = r0
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r1 = 6
            r0.<init>(r2, r2, r1, r3)
            xhss.C0843.f2735 = r0
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r2 = 7
            r0.<init>(r1, r1, r2, r3)
            xhss.C0843.f2738 = r0
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r1 = 8
            r0.<init>(r2, r2, r1, r3)
            xhss.C0843.f2731 = r0
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r2 = 9
            r0.<init>(r1, r1, r2, r3)
            xhss.C0843.f2734 = r0
            return
    }

    public C0843(int r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f2741 = r1
            r0.f2739 = r4
            r0.f2740 = r2
            r0.f2742 = r3
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static int m1421(java.lang.String r5) {
            r0 = 0
            r1 = 1
            r2 = r1
        L3:
            char r3 = r5.charAt(r2)
            r4 = 41
            if (r3 == r4) goto L30
        Lb:
            char r3 = r5.charAt(r2)
            r4 = 91
            if (r3 != r4) goto L16
            int r2 = r2 + 1
            goto Lb
        L16:
            int r3 = r2 + 1
            char r2 = r5.charAt(r2)
            r4 = 76
            if (r2 != r4) goto L2c
            r2 = 59
            int r2 = r5.indexOf(r2, r3)
            int r2 = r2 + r1
            int r2 = java.lang.Math.max(r3, r2)
            goto L2d
        L2c:
            r2 = r3
        L2d:
            int r0 = r0 + 1
            goto L3
        L30:
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static int m1422(java.lang.String r7) {
            r0 = 1
            char r1 = r7.charAt(r0)
            r2 = r0
            r3 = r2
        L7:
            r4 = 41
            r5 = 68
            r6 = 74
            if (r1 == r4) goto L41
            if (r1 == r6) goto L38
            if (r1 != r5) goto L14
            goto L38
        L14:
            char r1 = r7.charAt(r2)
            r4 = 91
            if (r1 != r4) goto L1f
            int r2 = r2 + 1
            goto L14
        L1f:
            int r1 = r2 + 1
            char r2 = r7.charAt(r2)
            r4 = 76
            if (r2 != r4) goto L34
            r2 = 59
            int r2 = r7.indexOf(r2, r1)
            int r2 = r2 + r0
            int r1 = java.lang.Math.max(r1, r2)
        L34:
            int r3 = r3 + 1
            r2 = r1
            goto L3c
        L38:
            int r2 = r2 + 1
            int r3 = r3 + 2
        L3c:
            char r1 = r7.charAt(r2)
            goto L7
        L41:
            int r2 = r2 + r0
            char r7 = r7.charAt(r2)
            r1 = 86
            r2 = 2
            if (r7 != r1) goto L4e
            int r7 = r3 << 2
            return r7
        L4e:
            if (r7 == r6) goto L52
            if (r7 != r5) goto L53
        L52:
            r0 = r2
        L53:
            int r7 = r3 << 2
            r7 = r7 | r0
            return r7
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static java.lang.String m1423(java.lang.Class r2) {
            java.lang.String r2 = r2.getName()
            r0 = 46
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1424(java.lang.Class r1, java.lang.StringBuilder r2) {
        L0:
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L10
            r0 = 91
            r2.append(r0)
            java.lang.Class r1 = r1.getComponentType()
            goto L0
        L10:
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L5e
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L1d
            r1 = 73
            goto L54
        L1d:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r1 != r0) goto L24
            r1 = 86
            goto L54
        L24:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L2b
            r1 = 90
            goto L54
        L2b:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L32
            r1 = 66
            goto L54
        L32:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L39
            r1 = 67
            goto L54
        L39:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L40
            r1 = 83
            goto L54
        L40:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L47
            r1 = 68
            goto L54
        L47:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto L4e
            r1 = 70
            goto L54
        L4e:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L58
            r1 = 74
        L54:
            r2.append(r1)
            return
        L58:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L5e:
            r0 = 76
            r2.append(r0)
            java.lang.String r1 = m1423(r1)
            r2.append(r1)
            r1 = 59
            r2.append(r1)
            return
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static xhss.C0843 m1425(java.lang.String r2, int r3, int r4) {
            char r0 = r2.charAt(r3)
            r1 = 40
            if (r0 == r1) goto L65
            r1 = 70
            if (r0 == r1) goto L62
            r1 = 76
            if (r0 == r1) goto L56
            r1 = 83
            if (r0 == r1) goto L53
            r1 = 86
            if (r0 == r1) goto L50
            r1 = 73
            if (r0 == r1) goto L4d
            r1 = 74
            if (r0 == r1) goto L4a
            r1 = 90
            if (r0 == r1) goto L47
            r1 = 91
            if (r0 == r1) goto L3f
            switch(r0) {
                case 66: goto L3c;
                case 67: goto L39;
                case 68: goto L36;
                default: goto L2b;
            }
        L2b:
            java.lang.String r3 = "Invalid descriptor: "
            java.lang.String r2 = r3.concat(r2)
            xhss.C0532.m959(r2)
            r2 = 0
            return r2
        L36:
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2734
            return r2
        L39:
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2736
            return r2
        L3c:
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2733
            return r2
        L3f:
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r1 = 9
            r0.<init>(r1, r3, r4, r2)
            return r0
        L47:
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2737
            return r2
        L4a:
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2731
            return r2
        L4d:
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2735
            return r2
        L50:
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2730
            return r2
        L53:
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2732
            return r2
        L56:
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            int r3 = r3 + 1
            int r4 = r4 + (-1)
            r1 = 10
            r0.<init>(r1, r3, r4, r2)
            return r0
        L62:
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2738
            return r2
        L65:
            xhss.ᲀᛲᲀᲈ r0 = new xhss.ᲀᛲᲀᲈ
            r1 = 11
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static xhss.C0843 m1426(java.lang.Class r2) {
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L4b
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto Ld
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2735
            return r2
        Ld:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r2 != r0) goto L14
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2730
            return r2
        L14:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 != r0) goto L1b
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2737
            return r2
        L1b:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r2 != r0) goto L22
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2733
            return r2
        L22:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r2 != r0) goto L29
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2736
            return r2
        L29:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r2 != r0) goto L30
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2732
            return r2
        L30:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r2 != r0) goto L37
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2734
            return r2
        L37:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L3e
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2738
            return r2
        L3e:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r2 != r0) goto L45
            xhss.ᲀᛲᲀᲈ r2 = xhss.C0843.f2731
            return r2
        L45:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L4b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            m1424(r2, r0)
            java.lang.String r2 = r0.toString()
            r0 = 0
            int r1 = r2.length()
            xhss.ᲀᛲᲀᲈ r2 = m1425(r2, r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static java.lang.String m1427(java.lang.reflect.Method r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L1a
            r4 = r1[r3]
            m1424(r4, r0)
            int r3 = r3 + 1
            goto L10
        L1a:
            r1 = 41
            r0.append(r1)
            java.lang.Class r5 = r5.getReturnType()
            m1424(r5, r0)
            java.lang.String r5 = r0.toString()
            return r5
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof xhss.C0843
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᲀᛲᲀᲈ r8 = (xhss.C0843) r8
            r1 = 10
            r3 = 12
            int r4 = r7.f2741
            if (r4 != r3) goto L15
            r4 = r1
        L15:
            int r5 = r8.f2741
            if (r5 != r3) goto L1a
            goto L1b
        L1a:
            r1 = r5
        L1b:
            if (r4 == r1) goto L1e
            return r2
        L1e:
            int r1 = r8.f2740
            int r3 = r8.f2742
            int r4 = r7.f2742
            int r5 = r7.f2740
            int r6 = r4 - r5
            int r3 = r3 - r1
            if (r6 == r3) goto L2c
            return r2
        L2c:
            if (r5 >= r4) goto L42
            java.lang.String r3 = r7.f2739
            char r3 = r3.charAt(r5)
            java.lang.String r6 = r8.f2739
            char r6 = r6.charAt(r1)
            if (r3 == r6) goto L3d
            return r2
        L3d:
            int r5 = r5 + 1
            int r1 = r1 + 1
            goto L2c
        L42:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 12
            int r1 = r3.f2741
            if (r1 != r0) goto L9
            r0 = 10
            goto La
        L9:
            r0 = r1
        La:
            int r0 = r0 * 13
            r2 = 9
            if (r1 < r2) goto L22
            int r1 = r3.f2740
        L12:
            int r2 = r3.f2742
            if (r1 >= r2) goto L22
            java.lang.String r2 = r3.f2739
            char r2 = r2.charAt(r1)
            int r2 = r2 + r0
            int r0 = r2 * 17
            int r1 = r1 + 1
            goto L12
        L22:
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.m1428()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String m1428() {
            r4 = this;
            r0 = 10
            java.lang.String r1 = r4.f2739
            int r2 = r4.f2742
            int r3 = r4.f2740
            int r4 = r4.f2741
            if (r4 != r0) goto L15
            int r3 = r3 + (-1)
            int r2 = r2 + 1
            java.lang.String r4 = r1.substring(r3, r2)
            return r4
        L15:
            r0 = 12
            if (r4 != r0) goto L26
            java.lang.String r4 = r1.substring(r3, r2)
            java.lang.String r0 = "L"
            java.lang.String r1 = ";"
            java.lang.String r4 = xhss.AbstractC0390.m781(r0, r4, r1)
            return r4
        L26:
            java.lang.String r4 = r1.substring(r3, r2)
            return r4
    }
}
