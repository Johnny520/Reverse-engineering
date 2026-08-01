package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0577 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final byte[] f2010 = null;

    static {
            r0 = 0
            byte[] r1 = new byte[r0]
            xhss.AbstractC0577.f2010 = r1
            java.lang.String r1 = "efbbbf"
            xhss.ᛳᛶᲈᲈ r1 = xhss.AbstractC1178.m1870(r1)
            java.lang.String r2 = "feff"
            xhss.ᛳᛶᲈᲈ r2 = xhss.AbstractC1178.m1870(r2)
            java.lang.String r3 = "fffe0000"
            xhss.ᛳᛶᲈᲈ r3 = xhss.AbstractC1178.m1870(r3)
            java.lang.String r4 = "fffe"
            xhss.ᛳᛶᲈᲈ r4 = xhss.AbstractC1178.m1870(r4)
            java.lang.String r5 = "0000feff"
            xhss.ᛳᛶᲈᲈ r5 = xhss.AbstractC1178.m1870(r5)
            xhss.ᛳᛶᲈᲈ[] r1 = new xhss.C0289[]{r1, r2, r3, r4, r5}
            java.util.ArrayList r6 = new java.util.ArrayList
            xhss.ᛳᛲᛷᛷ r2 = new xhss.ᛳᛲᛷᛷ
            r2.<init>(r0, r1)
            r6.<init>(r2)
            int r2 = r6.size()
            r3 = 1
            if (r2 <= r3) goto L3b
            java.util.Collections.sort(r6)
        L3b:
            int r2 = r6.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            r4 = r0
        L45:
            if (r4 >= r2) goto L52
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.add(r5)
            int r4 = r4 + 1
            goto L45
        L52:
            r2 = r0
            r4 = r2
        L54:
            r10 = 5
            if (r2 >= r10) goto Lc9
            r5 = r1[r2]
            int r7 = r4 + 1
            int r8 = r6.size()
            int r10 = r6.size()
            java.lang.String r11 = ")."
            if (r8 < 0) goto Lb2
            if (r8 > r10) goto L93
            int r8 = r8 + (-1)
            r10 = r0
        L6c:
            if (r10 > r8) goto L85
            int r11 = r10 + r8
            int r11 = r11 >>> r3
            java.lang.Object r12 = r6.get(r11)
            java.lang.Comparable r12 = (java.lang.Comparable) r12
            int r12 = xhss.AbstractC0775.m1305(r12, r5)
            if (r12 >= 0) goto L80
            int r10 = r11 + 1
            goto L6c
        L80:
            if (r12 <= 0) goto L88
            int r8 = r11 + (-1)
            goto L6c
        L85:
            int r10 = r10 + 1
            int r11 = -r10
        L88:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.set(r11, r4)
            int r2 = r2 + 1
            r4 = r7
            goto L54
        L93:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "toIndex ("
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = ") is greater than size ("
            r1.append(r2)
            r1.append(r10)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fromIndex (0) is greater than toIndex ("
            r1.<init>(r2)
            r1.append(r8)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lc9:
            java.lang.Object r2 = r6.get(r0)
            xhss.ᛳᛶᲈᲈ r2 = (xhss.C0289) r2
            int r2 = r2.mo611()
            if (r2 <= 0) goto L172
            r2 = r0
        Ld6:
            int r3 = r6.size()
            if (r2 >= r3) goto L148
            java.lang.Object r3 = r6.get(r2)
            xhss.ᛳᛶᲈᲈ r3 = (xhss.C0289) r3
            int r4 = r2 + 1
            r5 = r4
        Le5:
            int r7 = r6.size()
            if (r5 >= r7) goto L146
            java.lang.Object r7 = r6.get(r5)
            xhss.ᛳᛶᲈᲈ r7 = (xhss.C0289) r7
            r7.getClass()
            int r8 = r3.mo611()
            boolean r8 = r7.mo617(r3, r8)
            if (r8 == 0) goto L146
            int r8 = r7.mo611()
            int r11 = r3.mo611()
            if (r8 == r11) goto L12e
            java.lang.Object r7 = r9.get(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r9.get(r2)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r7 <= r8) goto L12b
            r6.remove(r5)
            java.lang.Object r7 = r9.remove(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            goto Le5
        L12b:
            int r5 = r5 + 1
            goto Le5
        L12e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "duplicate option: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L146:
            r2 = r4
            goto Ld6
        L148:
            xhss.ᛴᛲᛴᛶ r4 = new xhss.ᛴᛲᛴᛶ
            r4.<init>()
            r7 = 0
            int r8 = r6.size()
            r2 = 0
            r5 = 0
            xhss.C0915.m1494(r2, r4, r5, r6, r7, r8, r9)
            long r2 = r4.f1261
            r5 = 4
            long r2 = r2 / r5
            int r2 = (int) r2
            int[] r3 = new int[r2]
        L160:
            if (r0 >= r2) goto L16b
            int r5 = r4.m697()
            r3[r0] = r5
            int r0 = r0 + 1
            goto L160
        L16b:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r10)
            xhss.ᛳᛶᲈᲈ[] r0 = (xhss.C0289[]) r0
            return
        L172:
            java.lang.String r0 = "the empty byte string is not a supported option"
            xhss.C0532.m959(r0)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final int m1038(int r1, int r2, java.lang.String r3, java.lang.String r4) {
        L0:
            if (r1 >= r2) goto L10
            char r0 = r3.charAt(r1)
            boolean r0 = xhss.AbstractC0120.m338(r4, r0)
            if (r0 == 0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L0
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final int m1039(java.lang.String r1, char r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto Lc
            char r0 = r1.charAt(r3)
            if (r0 != r2) goto L9
            return r3
        L9:
            int r3 = r3 + 1
            goto L0
        Lc:
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final int m1040(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L20
            char r2 = r4.charAt(r1)
            r3 = 31
            int r3 = xhss.AbstractC0007.m102(r2, r3)
            if (r3 <= 0) goto L1f
            r3 = 127(0x7f, float:1.78E-43)
            int r2 = xhss.AbstractC0007.m102(r2, r3)
            if (r2 < 0) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L5
        L1f:
            return r1
        L20:
            r4 = -1
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final void m1041(java.io.Closeable r0) {
            r0.close()     // Catch: java.lang.Exception -> L3 java.lang.RuntimeException -> L4
        L3:
            return
        L4:
            r0 = move-exception
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static final int m1042(java.lang.String r2, int r3) {
            if (r2 == 0) goto L1b
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L1b
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
        L11:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L19
            r2 = 0
            return r2
        L19:
            int r2 = (int) r2
            return r2
        L1b:
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final boolean m1043(java.lang.String r1) {
            java.lang.String r0 = "Authorization"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "Cookie"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "Set-Cookie"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final java.lang.String[] m1044(java.lang.String[] r8, java.lang.String[] r9, java.util.Comparator r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L22
            r4 = r8[r3]
            int r5 = r9.length
            r6 = r2
        Le:
            if (r6 >= r5) goto L1f
            r7 = r9[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L1c
            r0.add(r4)
            goto L1f
        L1c:
            int r6 = r6 + 1
            goto Le
        L1f:
            int r3 = r3 + 1
            goto L8
        L22:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final int m1045(char r2) {
            r0 = 48
            if (r0 > r2) goto La
            r1 = 58
            if (r2 >= r1) goto La
            int r2 = r2 - r0
            return r2
        La:
            r0 = 97
            if (r0 > r2) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r2 >= r0) goto L15
            int r2 = r2 + (-87)
            return r2
        L15:
            r0 = 65
            if (r0 > r2) goto L20
            r0 = 71
            if (r2 >= r0) goto L20
            int r2 = r2 + (-55)
            return r2
        L20:
            r2 = -1
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final int m1046(java.lang.String r2, int r3, int r4) {
            int r4 = r4 + (-1)
            if (r3 > r4) goto L24
        L4:
            char r0 = r2.charAt(r4)
            r1 = 9
            if (r0 == r1) goto L1f
            r1 = 10
            if (r0 == r1) goto L1f
            r1 = 12
            if (r0 == r1) goto L1f
            r1 = 13
            if (r0 == r1) goto L1f
            r1 = 32
            if (r0 == r1) goto L1f
            int r4 = r4 + 1
            return r4
        L1f:
            if (r4 == r3) goto L24
            int r4 = r4 + (-1)
            goto L4
        L24:
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final boolean m1047(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator r9) {
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L5
            goto L25
        L5:
            if (r8 == 0) goto L25
            int r0 = r8.length
            if (r0 != 0) goto Lb
            goto L25
        Lb:
            int r0 = r7.length
            r2 = r1
        Ld:
            if (r2 >= r0) goto L25
            r3 = r7[r2]
            int r4 = r8.length
            r5 = r1
        L13:
            if (r5 >= r4) goto L22
            r6 = r8[r5]
            int r6 = r9.compare(r3, r6)
            if (r6 != 0) goto L1f
            r7 = 1
            return r7
        L1f:
            int r5 = r5 + 1
            goto L13
        L22:
            int r2 = r2 + 1
            goto Ld
        L25:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final int m1048(java.lang.String r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto L1e
            char r0 = r2.charAt(r3)
            r1 = 9
            if (r0 == r1) goto L1b
            r1 = 10
            if (r0 == r1) goto L1b
            r1 = 12
            if (r0 == r1) goto L1b
            r1 = 13
            if (r0 == r1) goto L1b
            r1 = 32
            if (r0 == r1) goto L1b
            return r3
        L1b:
            int r3 = r3 + 1
            goto L0
        L1e:
            return r4
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final int m1049(xhss.C0976 r2) {
            byte r0 = r2.m1615()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            byte r1 = r2.m1615()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r2 = r2.m1615()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }
}
