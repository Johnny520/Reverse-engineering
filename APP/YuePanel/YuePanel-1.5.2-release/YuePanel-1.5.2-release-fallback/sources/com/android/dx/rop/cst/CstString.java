package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstString extends com.android.dx.rop.cst.TypedConstant {
    public static final com.android.dx.rop.cst.CstString EMPTY_STRING = null;
    private final com.android.dx.util.ByteArray bytes;
    private final java.lang.String string;

    static {
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString
            java.lang.String r1 = ""
            r0.<init>(r1)
            com.android.dx.rop.cst.CstString.EMPTY_STRING = r0
            return
    }

    public CstString(com.android.dx.util.ByteArray r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L12
            r1.bytes = r2
            java.lang.String r2 = utf8BytesToString(r2)
            java.lang.String r2 = r2.intern()
            r1.string = r2
            return
        L12:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "bytes == null"
            r2.<init>(r0)
            throw r2
    }

    public CstString(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L17
            java.lang.String r0 = r2.intern()
            r1.string = r0
            com.android.dx.util.ByteArray r0 = new com.android.dx.util.ByteArray
            byte[] r2 = stringToUtf8Bytes(r2)
            r0.<init>(r2)
            r1.bytes = r0
            return
        L17:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "string == null"
            r2.<init>(r0)
            throw r2
    }

    public static byte[] stringToUtf8Bytes(java.lang.String r9) {
            int r0 = r9.length()
            int r1 = r0 * 3
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = r2
            r4 = r3
        Lb:
            if (r3 >= r0) goto L55
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L1d
            if (r5 >= r6) goto L1d
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r4 + 1
            goto L52
        L1d:
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 >= r7) goto L35
            int r7 = r5 >> 6
            r7 = r7 & 31
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r1[r4] = r7
            int r7 = r4 + 1
            r5 = r5 & 63
            r5 = r5 | r6
            byte r5 = (byte) r5
            r1[r7] = r5
            int r4 = r4 + 2
            goto L52
        L35:
            int r7 = r5 >> 12
            r7 = r7 & 15
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r1[r4] = r7
            int r7 = r4 + 1
            int r8 = r5 >> 6
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r1[r7] = r8
            int r7 = r4 + 2
            r5 = r5 & 63
            r5 = r5 | r6
            byte r5 = (byte) r5
            r1[r7] = r5
            int r4 = r4 + 3
        L52:
            int r3 = r3 + 1
            goto Lb
        L55:
            byte[] r9 = new byte[r4]
            java.lang.System.arraycopy(r1, r2, r9, r2, r4)
            return r9
    }

    private static java.lang.String throwBadUtf8(int r3, int r4) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bad utf-8 byte "
            r1.append(r2)
            java.lang.String r3 = com.android.dx.util.Hex.u1(r3)
            r1.append(r3)
            java.lang.String r3 = " at offset "
            r1.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static java.lang.String utf8BytesToString(com.android.dx.util.ByteArray r11) {
            int r0 = r11.size()
            char[] r1 = new char[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            if (r0 <= 0) goto L97
            int r5 = r11.getUnsignedByte(r4)
            int r6 = r5 >> 4
            r7 = 128(0x80, float:1.8E-43)
            switch(r6) {
                case 0: goto L85;
                case 1: goto L85;
                case 2: goto L85;
                case 3: goto L85;
                case 4: goto L85;
                case 5: goto L85;
                case 6: goto L85;
                case 7: goto L85;
                case 8: goto L16;
                case 9: goto L16;
                case 10: goto L16;
                case 11: goto L16;
                case 12: goto L59;
                case 13: goto L59;
                case 14: goto L1b;
                default: goto L16;
            }
        L16:
            java.lang.String r11 = throwBadUtf8(r5, r4)
            return r11
        L1b:
            int r0 = r0 + (-3)
            if (r0 >= 0) goto L24
            java.lang.String r11 = throwBadUtf8(r5, r4)
            return r11
        L24:
            int r6 = r4 + 1
            int r8 = r11.getUnsignedByte(r6)
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 == r7) goto L33
            java.lang.String r11 = throwBadUtf8(r8, r6)
            return r11
        L33:
            int r6 = r4 + 2
            int r10 = r11.getUnsignedByte(r6)
            if (r9 == r7) goto L40
            java.lang.String r11 = throwBadUtf8(r10, r6)
            return r11
        L40:
            r5 = r5 & 15
            int r5 = r5 << 12
            r7 = r8 & 63
            int r7 = r7 << 6
            r5 = r5 | r7
            r7 = r10 & 63
            r5 = r5 | r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 >= r7) goto L55
            java.lang.String r11 = throwBadUtf8(r10, r6)
            return r11
        L55:
            char r5 = (char) r5
            int r4 = r4 + 3
            goto L91
        L59:
            int r0 = r0 + (-2)
            if (r0 >= 0) goto L62
            java.lang.String r11 = throwBadUtf8(r5, r4)
            return r11
        L62:
            int r6 = r4 + 1
            int r8 = r11.getUnsignedByte(r6)
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 == r7) goto L71
            java.lang.String r11 = throwBadUtf8(r8, r6)
            return r11
        L71:
            r5 = r5 & 31
            int r5 = r5 << 6
            r9 = r8 & 63
            r5 = r5 | r9
            if (r5 == 0) goto L81
            if (r5 >= r7) goto L81
            java.lang.String r11 = throwBadUtf8(r8, r6)
            return r11
        L81:
            char r5 = (char) r5
            int r4 = r4 + 2
            goto L91
        L85:
            int r0 = r0 + (-1)
            if (r5 != 0) goto L8e
            java.lang.String r11 = throwBadUtf8(r5, r4)
            return r11
        L8e:
            char r5 = (char) r5
            int r4 = r4 + 1
        L91:
            r1[r3] = r5
            int r3 = r3 + 1
            goto L9
        L97:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r1, r2, r3)
            return r11
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            java.lang.String r0 = r1.string
            com.android.dx.rop.cst.CstString r2 = (com.android.dx.rop.cst.CstString) r2
            java.lang.String r2 = r2.string
            int r2 = r0.compareTo(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstString
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r0 = r1.string
            com.android.dx.rop.cst.CstString r2 = (com.android.dx.rop.cst.CstString) r2
            java.lang.String r2 = r2.string
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.android.dx.util.ByteArray getBytes() {
            r1 = this;
            com.android.dx.util.ByteArray r0 = r1.bytes
            return r0
    }

    public java.lang.String getString() {
            r1 = this;
            java.lang.String r0 = r1.string
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.STRING
            return r0
    }

    public int getUtf16Size() {
            r1 = this;
            java.lang.String r0 = r1.string
            int r0 = r0.length()
            return r0
    }

    public int getUtf8Size() {
            r1 = this;
            com.android.dx.util.ByteArray r0 = r1.bytes
            int r0 = r0.size()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.string
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r10 = this;
            java.lang.String r0 = r10.string
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 3
            int r2 = r2 / 2
            r1.<init>(r2)
            r2 = 0
            r3 = r2
        L11:
            if (r3 >= r0) goto Lbf
            java.lang.String r4 = r10.string
            char r4 = r4.charAt(r3)
            r5 = 32
            r6 = 127(0x7f, float:1.78E-43)
            r7 = 92
            if (r4 < r5) goto L35
            if (r4 >= r6) goto L35
            r5 = 39
            if (r4 == r5) goto L2d
            r5 = 34
            if (r4 == r5) goto L2d
            if (r4 != r7) goto L30
        L2d:
            r1.append(r7)
        L30:
            r1.append(r4)
            goto Lbb
        L35:
            if (r4 > r6) goto L8c
            r5 = 9
            if (r4 == r5) goto L86
            r5 = 10
            if (r4 == r5) goto L80
            r5 = 13
            if (r4 == r5) goto L7a
            int r5 = r0 + (-1)
            if (r3 >= r5) goto L50
            java.lang.String r5 = r10.string
            int r6 = r3 + 1
            char r5 = r5.charAt(r6)
            goto L51
        L50:
            r5 = r2
        L51:
            r6 = 48
            r8 = 1
            if (r5 < r6) goto L5c
            r9 = 55
            if (r5 > r9) goto L5c
            r5 = r8
            goto L5d
        L5c:
            r5 = r2
        L5d:
            r1.append(r7)
            r7 = 6
        L61:
            if (r7 < 0) goto L74
            int r9 = r4 >> r7
            r9 = r9 & 7
            int r9 = r9 + r6
            char r9 = (char) r9
            if (r9 != r6) goto L6d
            if (r5 == 0) goto L71
        L6d:
            r1.append(r9)
            r5 = r8
        L71:
            int r7 = r7 + (-3)
            goto L61
        L74:
            if (r5 != 0) goto Lbb
            r1.append(r6)
            goto Lbb
        L7a:
            java.lang.String r4 = "\\r"
            r1.append(r4)
            goto Lbb
        L80:
            java.lang.String r4 = "\\n"
            r1.append(r4)
            goto Lbb
        L86:
            java.lang.String r4 = "\\t"
            r1.append(r4)
            goto Lbb
        L8c:
            java.lang.String r5 = "\\u"
            r1.append(r5)
            int r5 = r4 >> 12
            r6 = 16
            char r5 = java.lang.Character.forDigit(r5, r6)
            r1.append(r5)
            int r5 = r4 >> 8
            r5 = r5 & 15
            char r5 = java.lang.Character.forDigit(r5, r6)
            r1.append(r5)
            int r5 = r4 >> 4
            r5 = r5 & 15
            char r5 = java.lang.Character.forDigit(r5, r6)
            r1.append(r5)
            r4 = r4 & 15
            char r4 = java.lang.Character.forDigit(r4, r6)
            r1.append(r4)
        Lbb:
            int r3 = r3 + 1
            goto L11
        Lbf:
            java.lang.String r0 = r1.toString()
            return r0
    }

    public java.lang.String toQuoted() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 34
            r0.append(r1)
            java.lang.String r2 = r3.toHuman()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toQuoted(int r4) {
            r3 = this;
            java.lang.String r0 = r3.toHuman()
            int r1 = r0.length()
            int r2 = r4 + (-2)
            if (r1 > r2) goto Lf
            java.lang.String r4 = ""
            goto L18
        Lf:
            int r4 = r4 + (-5)
            r1 = 0
            java.lang.String r0 = r0.substring(r1, r4)
            java.lang.String r4 = "..."
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 34
            r1.append(r2)
            r1.append(r0)
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "string{\""
            r0.append(r1)
            java.lang.String r1 = r2.toHuman()
            r0.append(r1)
            java.lang.String r1 = "\"}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "utf8"
            return r0
    }
}
