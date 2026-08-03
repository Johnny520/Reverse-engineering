package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public final class Hex {
    private Hex() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String dump(byte[] r6, int r7, int r8, int r9, int r10, int r11) {
            int r0 = r7 + r8
            r1 = r7 | r8
            r1 = r1 | r0
            if (r1 < 0) goto L79
            int r1 = r6.length
            if (r0 > r1) goto L79
            if (r9 < 0) goto L71
            if (r8 != 0) goto L11
            java.lang.String r6 = ""
            return r6
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8 * 4
            r2 = 6
            int r1 = r1 + r2
            r0.<init>(r1)
            r1 = 0
            r3 = r1
        L1c:
            r4 = 10
            if (r8 <= 0) goto L67
            if (r3 != 0) goto L46
            r5 = 2
            if (r11 == r5) goto L39
            r5 = 4
            if (r11 == r5) goto L34
            if (r11 == r2) goto L2f
            java.lang.String r5 = u4(r9)
            goto L3d
        L2f:
            java.lang.String r5 = u3(r9)
            goto L3d
        L34:
            java.lang.String r5 = u2(r9)
            goto L3d
        L39:
            java.lang.String r5 = u1(r9)
        L3d:
            r0.append(r5)
            java.lang.String r5 = ": "
            r0.append(r5)
            goto L4f
        L46:
            r5 = r3 & 1
            if (r5 != 0) goto L4f
            r5 = 32
            r0.append(r5)
        L4f:
            r5 = r6[r7]
            java.lang.String r5 = u1(r5)
            r0.append(r5)
            int r9 = r9 + 1
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r10) goto L64
            r0.append(r4)
            r3 = r1
        L64:
            int r8 = r8 + (-1)
            goto L1c
        L67:
            if (r3 == 0) goto L6c
            r0.append(r4)
        L6c:
            java.lang.String r6 = r0.toString()
            return r6
        L71:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "outOffset < 0"
            r6.<init>(r7)
            throw r6
        L79:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "arr.length "
            r9.append(r10)
            int r6 = r6.length
            r9.append(r6)
            java.lang.String r6 = "; "
            r9.append(r6)
            r9.append(r7)
            java.lang.String r6 = "..!"
            r9.append(r6)
            r9.append(r0)
            java.lang.String r6 = r9.toString()
            r8.<init>(r6)
            throw r8
    }

    public static java.lang.String s1(int r5) {
            r0 = 3
            char[] r0 = new char[r0]
            r1 = 0
            if (r5 >= 0) goto Lc
            r2 = 45
            r0[r1] = r2
            int r5 = -r5
            goto L10
        Lc:
            r2 = 43
            r0[r1] = r2
        L10:
            r2 = 2
            if (r1 >= r2) goto L24
            int r2 = 2 - r1
            r3 = r5 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            r0[r2] = r3
            int r5 = r5 >> 4
            int r1 = r1 + 1
            goto L10
        L24:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            return r5
    }

    public static java.lang.String s2(int r6) {
            r0 = 5
            char[] r0 = new char[r0]
            r1 = 0
            if (r6 >= 0) goto Lc
            r2 = 45
            r0[r1] = r2
            int r6 = -r6
            goto L10
        Lc:
            r2 = 43
            r0[r1] = r2
        L10:
            r2 = 4
            if (r1 >= r2) goto L23
            int r3 = 4 - r1
            r4 = r6 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r0[r3] = r4
            int r6 = r6 >> r2
            int r1 = r1 + 1
            goto L10
        L23:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
    }

    public static java.lang.String s4(int r5) {
            r0 = 9
            char[] r0 = new char[r0]
            r1 = 0
            if (r5 >= 0) goto Ld
            r2 = 45
            r0[r1] = r2
            int r5 = -r5
            goto L11
        Ld:
            r2 = 43
            r0[r1] = r2
        L11:
            r2 = 8
            if (r1 >= r2) goto L26
            int r2 = 8 - r1
            r3 = r5 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            r0[r2] = r3
            int r5 = r5 >> 4
            int r1 = r1 + 1
            goto L11
        L26:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            return r5
    }

    public static java.lang.String s8(long r5) {
            r0 = 17
            char[] r0 = new char[r0]
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r2 = 0
            if (r1 >= 0) goto L11
            r1 = 45
            r0[r2] = r1
            long r5 = -r5
            goto L15
        L11:
            r1 = 43
            r0[r2] = r1
        L15:
            r1 = 16
            if (r2 >= r1) goto L29
            int r3 = 16 - r2
            int r4 = (int) r5
            r4 = r4 & 15
            char r1 = java.lang.Character.forDigit(r4, r1)
            r0[r3] = r1
            r1 = 4
            long r5 = r5 >> r1
            int r2 = r2 + 1
            goto L15
        L29:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            return r5
    }

    public static java.lang.String u1(int r6) {
            r0 = 2
            char[] r1 = new char[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L17
            int r3 = 1 - r2
            r4 = r6 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r1[r3] = r4
            int r6 = r6 >> 4
            int r2 = r2 + 1
            goto L4
        L17:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    public static java.lang.String u2(int r6) {
            r0 = 4
            char[] r1 = new char[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L16
            int r3 = 3 - r2
            r4 = r6 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r1[r3] = r4
            int r6 = r6 >> r0
            int r2 = r2 + 1
            goto L4
        L16:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    public static java.lang.String u2or4(int r1) {
            char r0 = (char) r1
            if (r1 != r0) goto L8
            java.lang.String r1 = u2(r1)
            return r1
        L8:
            java.lang.String r1 = u4(r1)
            return r1
    }

    public static java.lang.String u3(int r6) {
            r0 = 6
            char[] r1 = new char[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L17
            int r3 = 5 - r2
            r4 = r6 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r1[r3] = r4
            int r6 = r6 >> 4
            int r2 = r2 + 1
            goto L4
        L17:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    public static java.lang.String u4(int r6) {
            r0 = 8
            char[] r1 = new char[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L18
            int r3 = 7 - r2
            r4 = r6 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r1[r3] = r4
            int r6 = r6 >> 4
            int r2 = r2 + 1
            goto L5
        L18:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    public static java.lang.String u8(long r5) {
            r0 = 16
            char[] r1 = new char[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L17
            int r3 = 15 - r2
            int r4 = (int) r5
            r4 = r4 & 15
            char r4 = java.lang.Character.forDigit(r4, r0)
            r1[r3] = r4
            r3 = 4
            long r5 = r5 >> r3
            int r2 = r2 + 1
            goto L5
        L17:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
            return r5
    }

    public static java.lang.String uNibble(int r2) {
            r2 = r2 & 15
            r0 = 16
            char r2 = java.lang.Character.forDigit(r2, r0)
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            return r2
    }
}
