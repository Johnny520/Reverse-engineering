package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public final class HexParser {
    private HexParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] parse(java.lang.String r16) {
            r0 = r16
            int r1 = r16.length()
            int r2 = r1 / 2
            byte[] r3 = new byte[r2]
            r4 = 0
            r5 = r4
            r6 = r5
        Ld:
            if (r5 >= r1) goto L121
            r7 = 10
            int r7 = r0.indexOf(r7, r5)
            if (r7 >= 0) goto L18
            r7 = r1
        L18:
            r8 = 35
            int r8 = r0.indexOf(r8, r5)
            if (r8 < 0) goto L27
            if (r8 >= r7) goto L27
            java.lang.String r5 = r0.substring(r5, r8)
            goto L2b
        L27:
            java.lang.String r5 = r0.substring(r5, r7)
        L2b:
            int r7 = r7 + 1
            r8 = 58
            int r8 = r5.indexOf(r8)
            r9 = 16
            r10 = 34
            r11 = -1
            if (r8 == r11) goto L6f
            int r12 = r5.indexOf(r10)
            if (r12 == r11) goto L43
            if (r12 >= r8) goto L43
            goto L6f
        L43:
            java.lang.String r12 = r5.substring(r4, r8)
            java.lang.String r12 = r12.trim()
            int r8 = r8 + 1
            java.lang.String r5 = r5.substring(r8)
            int r8 = java.lang.Integer.parseInt(r12, r9)
            if (r8 != r6) goto L58
            goto L6f
        L58:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bogus offset marker: "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            int r8 = r5.length()
            r12 = r4
            r14 = r12
            r13 = r11
        L76:
            java.lang.String r15 = "spare digit around offset "
            if (r12 >= r8) goto Le5
            char r4 = r5.charAt(r12)
            if (r14 == 0) goto L8a
            if (r4 != r10) goto L84
            r14 = 0
            goto Lc5
        L84:
            byte r4 = (byte) r4
            r3[r6] = r4
            int r6 = r6 + 1
            goto Lc5
        L8a:
            r9 = 32
            if (r4 > r9) goto L91
        L8e:
            r9 = 16
            goto Lc5
        L91:
            if (r4 != r10) goto Lb0
            if (r13 != r11) goto L97
            r14 = 1
            goto L8e
        L97:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb0:
            r9 = 16
            int r15 = java.lang.Character.digit(r4, r9)
            if (r15 == r11) goto Lc9
            if (r13 != r11) goto Lbc
            r13 = r15
            goto Lc5
        Lbc:
            int r4 = r13 << 4
            r4 = r4 | r15
            byte r4 = (byte) r4
            r3[r6] = r4
            int r6 = r6 + 1
            r13 = r11
        Lc5:
            int r12 = r12 + 1
            r4 = 0
            goto L76
        Lc9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bogus digit character: \""
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "\""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Le5:
            if (r13 != r11) goto L108
            if (r14 != 0) goto Led
            r5 = r7
            r4 = 0
            goto Ld
        Led:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unterminated quote around offset "
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L108:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L121:
            if (r6 >= r2) goto L12a
            byte[] r0 = new byte[r6]
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r0, r1, r6)
            r3 = r0
        L12a:
            return r3
    }
}
