package defpackage;

/* JADX INFO: renamed from: ᛴᛷᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0709 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final byte[] f3358 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C2248 f3359 = null;

    static {
            r0 = 0
            byte[] r1 = new byte[r0]
            defpackage.AbstractC0709.f3358 = r1
            java.lang.String r1 = "efbbbf"
            ᛶᛸᛸᛶ r1 = defpackage.AbstractC0762.m1687(r1)
            java.lang.String r2 = "feff"
            ᛶᛸᛸᛶ r2 = defpackage.AbstractC0762.m1687(r2)
            java.lang.String r3 = "fffe0000"
            ᛶᛸᛸᛶ r3 = defpackage.AbstractC0762.m1687(r3)
            java.lang.String r4 = "fffe"
            ᛶᛸᛸᛶ r4 = defpackage.AbstractC0762.m1687(r4)
            java.lang.String r5 = "0000feff"
            ᛶᛸᛸᛶ r5 = defpackage.AbstractC0762.m1687(r5)
            ᛶᛸᛸᛶ[] r1 = new defpackage.C1128[]{r1, r2, r3, r4, r5}
            java.util.ArrayList r6 = new java.util.ArrayList
            ᲁᲇᲈᛷ r2 = new ᲁᲇᲈᛷ
            r2.<init>(r1, r0)
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
            if (r2 >= r10) goto Lb2
            r5 = r1[r2]
            int r7 = r4 + 1
            int r8 = r6.size()
            int r10 = r6.size()
            if (r8 < 0) goto L99
            if (r8 > r10) goto L91
            int r8 = r8 + (-1)
            r10 = r0
        L6a:
            if (r10 > r8) goto L83
            int r11 = r10 + r8
            int r11 = r11 >>> r3
            java.lang.Object r12 = r6.get(r11)
            java.lang.Comparable r12 = (java.lang.Comparable) r12
            int r12 = defpackage.AbstractC1171.m2273(r12, r5)
            if (r12 >= 0) goto L7e
            int r10 = r11 + 1
            goto L6a
        L7e:
            if (r12 <= 0) goto L86
            int r8 = r11 + (-1)
            goto L6a
        L83:
            int r10 = r10 + 1
            int r11 = -r10
        L86:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.set(r11, r4)
            int r2 = r2 + 1
            r4 = r7
            goto L54
        L91:
            java.lang.String r0 = "toIndex ("
            java.lang.String r1 = ") is greater than size ("
            defpackage.C1356.m2533(r0, r8, r1, r10)
            return
        L99:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fromIndex (0) is greater than toIndex ("
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = ")."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb2:
            java.lang.Object r2 = r6.get(r0)
            ᛶᛸᛸᛶ r2 = (defpackage.C1128) r2
            int r2 = r2.mo2165()
            if (r2 <= 0) goto L162
            r2 = r0
        Lbf:
            int r3 = r6.size()
            if (r2 >= r3) goto L131
            java.lang.Object r3 = r6.get(r2)
            ᛶᛸᛸᛶ r3 = (defpackage.C1128) r3
            int r4 = r2 + 1
            r5 = r4
        Lce:
            int r7 = r6.size()
            if (r5 >= r7) goto L12f
            java.lang.Object r7 = r6.get(r5)
            ᛶᛸᛸᛶ r7 = (defpackage.C1128) r7
            r7.getClass()
            int r8 = r3.mo2165()
            boolean r8 = r7.mo2167(r3, r8)
            if (r8 == 0) goto L12f
            int r8 = r7.mo2165()
            int r11 = r3.mo2165()
            if (r8 == r11) goto L117
            java.lang.Object r7 = r9.get(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r9.get(r2)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r7 <= r8) goto L114
            r6.remove(r5)
            java.lang.Object r7 = r9.remove(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            goto Lce
        L114:
            int r5 = r5 + 1
            goto Lce
        L117:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "duplicate option: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L12f:
            r2 = r4
            goto Lbf
        L131:
            ᛸᲁᛵ r4 = new ᛸᲁᛵ
            r4.<init>()
            r7 = 0
            int r8 = r6.size()
            r2 = 0
            r5 = 0
            defpackage.AbstractC1628.m2951(r2, r4, r5, r6, r7, r8, r9)
            long r2 = r4.f6928
            r5 = 4
            long r2 = r2 / r5
            int r2 = (int) r2
            int[] r3 = new int[r2]
        L149:
            if (r0 >= r2) goto L154
            int r5 = r4.m2852()
            r3[r0] = r5
            int r0 = r0 + 1
            goto L149
        L154:
            ᲈᛵᲇᛷ r0 = new ᲈᛵᲇᛷ
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r10)
            ᛶᛸᛸᛶ[] r1 = (defpackage.C1128[]) r1
            r0.<init>(r1, r3)
            defpackage.AbstractC0709.f3359 = r0
            return
        L162:
            java.lang.String r0 = "the empty byte string is not a supported option"
            defpackage.C2264.m3684(r0)
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final int m1600(java.lang.String r2, int r3, int r4) {
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

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final int m1601(char r2) {
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

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final int m1602(defpackage.C2252 r2) {
            byte r0 = r2.m3641()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            byte r1 = r2.m3641()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r2 = r2.m3641()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final java.lang.String[] m1603(java.lang.String[] r8, java.lang.String[] r9, java.util.Comparator r10) {
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

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final boolean m1604(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator r9) {
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

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final int m1605(defpackage.C1569 r3) {
            r0 = 0
        L1:
            boolean r1 = r3.m2848()
            if (r1 != 0) goto L17
            r1 = 0
            byte r1 = r3.m2857(r1)
            r2 = 61
            if (r1 != r2) goto L17
            int r0 = r0 + 1
            r3.m2831()
            goto L1
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final int m1606(java.lang.String r1, char r2, int r3, int r4) {
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

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final int m1607(int r1, int r2, java.lang.String r3, java.lang.String r4) {
        L0:
            if (r1 >= r2) goto L10
            char r0 = r3.charAt(r1)
            boolean r0 = defpackage.AbstractC1347.m2510(r4, r0)
            if (r0 == 0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L0
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final void m1608(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "length="
            r9.<init>(r0)
            r9.append(r4)
            java.lang.String r4 = ", offset="
            r9.append(r4)
            r9.append(r6)
            java.lang.String r4 = ", count="
            r9.append(r4)
            r9.append(r6)
            java.lang.String r4 = r9.toString()
            r8.<init>(r4)
            throw r8
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final boolean m1609(java.lang.String r1) {
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

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final int m1610(int r2, java.lang.String r3) {
            if (r3 == 0) goto L1a
            long r2 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L1a
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
        L1a:
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final void m1611(java.io.Closeable r0) {
            r0.close()     // Catch: java.lang.Exception -> L3 java.lang.RuntimeException -> L4
        L3:
            return
        L4:
            r0 = move-exception
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final int m1612(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L20
            char r2 = r4.charAt(r1)
            r3 = 31
            int r3 = defpackage.AbstractC0498.m1275(r2, r3)
            if (r3 <= 0) goto L1f
            r3 = 127(0x7f, float:1.78E-43)
            int r2 = defpackage.AbstractC0498.m1275(r2, r3)
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

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final int m1613(java.lang.String r2, int r3, int r4) {
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
}
