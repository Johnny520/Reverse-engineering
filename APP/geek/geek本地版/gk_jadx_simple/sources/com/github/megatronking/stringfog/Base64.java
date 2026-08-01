package com.github.megatronking.stringfog;

/* JADX INFO: loaded from: classes.dex */
public final class Base64 {
    private static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    private static final int URL_SAFE = 8;

    public static abstract class Coder {
        int op;
        byte[] output;

        public Coder() {
        }

        public abstract int maxOutputSize(int r1);

        public abstract boolean process(byte[] r1, int r2, int r3, boolean r4);
    }

    public static class Decoder extends Coder {
        private static final int[] DECODE = null;
        private static final int[] DECODE_WEBSAFE = null;
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        static {
            DECODE = new int[]{SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, 62, SKIP, SKIP, SKIP, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, SKIP, SKIP, SKIP, EQUALS, SKIP, SKIP, SKIP, 0, 1, 2, 3, Base64.CRLF, 5, 6, 7, Base64.URL_SAFE, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP};
            DECODE_WEBSAFE = new int[]{SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, 62, SKIP, SKIP, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, SKIP, SKIP, SKIP, EQUALS, SKIP, SKIP, SKIP, 0, 1, 2, 3, Base64.CRLF, 5, 6, 7, Base64.URL_SAFE, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, SKIP, SKIP, SKIP, SKIP, 63, SKIP, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP};
        }

        public /* synthetic */ Decoder(byte[] r1, int r2, int r3) {
            this(r2, r1);
        }

        @Override // com.github.megatronking.stringfog.Base64.Coder
        public int maxOutputSize(int r1) {
            return ((r1 * 3) / Base64.CRLF) + 10;
        }

        @Override // com.github.megatronking.stringfog.Base64.Coder
        public boolean process(byte[] r17, int r18, int r19, boolean r20) {
            int r1 = this.state;
            if (r1 != 6) goto L5;
            return false;
        L5:
            int r4 = r19 + r18;
            int r5 = this.value;
            byte[] r6 = this.output;
            int[] r7 = this.alphabet;
            int r9 = 0;
            int r8 = r5;
            int r52 = r1;
            int r12 = r18;
        L7:
            if (r12 >= r4) goto L60;
            if (r52 != 0) goto L16;
        L9:
            int r14 = r12 + Base64.CRLF;
            if (r14 > r4) goto L14;
            r8 = (((r7[r17[r12] & 255] << 18) | (r7[r17[r12 + 1] & 255] << 12)) | (r7[r17[r12 + 2] & 255] << 6)) | r7[r17[r12 + 3] & 255];
            if (r8 < 0) goto L14;
            r6[r9 + 2] = (byte) r8;
            r6[r9 + 1] = (byte) (r8 >> Base64.URL_SAFE);
            r6[r9] = (byte) (r8 >> 16);
            r9 = r9 + 3;
            r12 = r14;
        L14:
            if (r12 >= r4) goto L60;
        L16:
            int r142 = r12 + 1;
            int r13 = r7[r17[r12] & 255];
            if (r52 == 0) goto L54;
            if (r52 != 1) goto L20;
            if (r13 >= 0) goto L42;
            if (r13 == SKIP) goto L59;
            this.state = 6;
            return false;
        L59:
            r12 = r142;
        L42:
            r13 = r13 | (r8 << 6);
        L43:
            r52 = r52 + 1;
            r8 = r13;
            goto L59
        L20:
            if (r52 != 2) goto L22;
            if (r13 >= 0) goto L42;
            if (r13 != EQUALS) goto L46;
            r6[r9] = (byte) (r8 >> Base64.CRLF);
            r9 = r9 + 1;
            r52 = Base64.CRLF;
            goto L59
        L46:
            if (r13 == SKIP) goto L59;
            this.state = 6;
            return false;
        L22:
            if (r52 == 3) goto L34;
            if (r52 == Base64.CRLF) goto L29;
            if (r52 != 5) goto L59;
            if (r13 == SKIP) goto L59;
            this.state = 6;
            return false;
        L29:
            if (r13 != EQUALS) goto L31;
            r52 = r52 + 1;
            goto L59
        L31:
            if (r13 == SKIP) goto L59;
            this.state = 6;
            return false;
        L34:
            if (r13 < 0) goto L36;
            int r15 = r13 | (r8 << 6);
            r6[r9 + 2] = (byte) r15;
            r6[r9 + 1] = (byte) (r15 >> Base64.URL_SAFE);
            r6[r9] = (byte) (r15 >> 16);
            r9 = r9 + 3;
            r8 = r15;
            r52 = 0;
            goto L59
        L36:
            if (r13 != EQUALS) goto L38;
            r6[r9 + 1] = (byte) (r8 >> 2);
            r6[r9] = (byte) (r8 >> 10);
            r9 = r9 + 2;
            r52 = 5;
            goto L59
        L38:
            if (r13 == SKIP) goto L59;
            this.state = 6;
            return false;
        L54:
            if (r13 >= 0) goto L43;
            if (r13 == SKIP) goto L59;
            this.state = 6;
            return false;
        L60:
            if (r20 == true) goto L63;
            this.state = r52;
            this.value = r8;
            this.op = r9;
            return true;
        L63:
            if (r52 == 1) goto L74;
            if (r52 == 2) goto L71;
            if (r52 == 3) goto L70;
            if (r52 != Base64.CRLF) goto L72;
            this.state = 6;
            return false;
        L72:
            this.state = r52;
            this.op = r9;
            return true;
        L70:
            int r16 = r9 + 1;
            r6[r9] = (byte) (r8 >> 10);
            r9 = r9 + 2;
            r6[r16] = (byte) (r8 >> 2);
            goto L72
        L71:
            r6[r9] = (byte) (r8 >> Base64.CRLF);
            r9 = r9 + 1;
            goto L72
        L74:
            this.state = 6;
            return false;
        }

        private Decoder(int r1, byte[] r2) {
            this.output = r2;
            if ((r1 & Base64.URL_SAFE) != 0) goto L5;
            int[] r12 = DECODE;
        L6:
            this.alphabet = r12;
            this.state = 0;
            this.value = 0;
            return;
        L5:
            r12 = DECODE_WEBSAFE;
            goto L6
        }
    }

    public static class Encoder extends Coder {
        private static final byte[] ENCODE = null;
        private static final byte[] ENCODE_WEBSAFE = null;
        static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        final boolean do_cr;
        final boolean do_newline;
        final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        static {
            ENCODE = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
            ENCODE_WEBSAFE = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        }

        public /* synthetic */ Encoder(int r2) {
            this(r2, null);
        }

        @Override // com.github.megatronking.stringfog.Base64.Coder
        public int maxOutputSize(int r1) {
            return ((r1 * Base64.URL_SAFE) / 5) + 10;
        }

        @Override // com.github.megatronking.stringfog.Base64.Coder
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            byte[] r1 = this.alphabet;
            byte[] r2 = this.output;
            int r3 = this.count;
            int r4 = r20 + r19;
            int r5 = this.tailLen;
            char r6 = 2;
            int r7 = 0;
            if (r5 == 1) goto L10;
            if (r5 != 2) goto L12;
            int r52 = r19 + 1;
            if (r52 > r4) goto L12;
            byte[] r10 = this.tail;
            int r102 = (((r10[1] & 255) << Base64.URL_SAFE) | ((r10[0] & 255) << 16)) | (r18[r19] & 255);
            this.tailLen = 0;
            int r11 = r52;
        L14:
            if (r102 == (-1)) goto L23;
            r2[0] = r1[(r102 >> 18) & 63];
            r2[1] = r1[(r102 >> 12) & 63];
            r2[2] = r1[(r102 >> 6) & 63];
            r2[3] = r1[r102 & 63];
            r3 = r3 - 1;
            if (r3 == 0) goto L18;
            int r8 = Base64.CRLF;
        L24:
            int r103 = r11 + 3;
            if (r103 > r4) goto L34;
            char r202 = r6;
            int r62 = (((r18[r11 + 1] & 255) << Base64.URL_SAFE) | ((r18[r11] & 255) << 16)) | (r18[r11 + 2] & 255);
            r2[r8] = r1[(r62 >> 18) & 63];
            r2[r8 + 1] = r1[(r62 >> 12) & 63];
            r2[r8 + 2] = r1[(r62 >> 6) & 63];
            r2[r8 + 3] = r1[r62 & 63];
            int r63 = r8 + Base64.CRLF;
            r3 = r3 - 1;
            if (r3 == 0) goto L29;
            r8 = r63;
            r11 = r103;
            r6 = r202;
            goto L24
        L29:
            if (this.do_cr == false) goto L31;
            r2[r63] = 13;
            r63 = r8 + 5;
        L31:
            r8 = r63 + 1;
            r2[r63] = 10;
            r6 = r202;
            r3 = LINE_GROUPS;
            r11 = r103;
            goto L24
        L34:
            if (r21 == false) goto L79;
            int r64 = this.tailLen;
            if ((r11 - r64) != (r4 - 1)) goto L51;
            if (r64 <= 0) goto L39;
            byte r42 = this.tail[0];
            r7 = 1;
        L40:
            int r43 = (r42 & 255) << Base64.CRLF;
            this.tailLen = r64 - r7;
            r2[r8] = r1[(r43 >> 6) & 63];
            int r65 = r8 + 2;
            r2[r8 + 1] = r1[r43 & 63];
            if (this.do_padding == false) goto L44;
            r2[r65] = 61;
            r65 = r8 + Base64.CRLF;
            r2[r8 + 3] = 61;
        L44:
            if (this.do_newline == true) goto L46;
            r8 = r65;
        L84:
            this.op = r8;
            this.count = r3;
            return true;
        L46:
            if (this.do_cr == false) goto L48;
            r2[r65] = 13;
            r65 = r65 + 1;
        L48:
            int r12 = r65 + 1;
            r2[r65] = 10;
        L77:
            r8 = r12;
            goto L84
        L39:
            r42 = r18[r11];
            goto L40
        L51:
            if ((r11 - r64) != (r4 - 2)) goto L70;
            if (r64 <= 1) goto L54;
            byte r44 = this.tail[0];
            r7 = 1;
        L55:
            int r45 = (r44 & 255) << 10;
            if (r64 <= 0) goto L58;
            byte r53 = this.tail[r7];
            r7 = r7 + 1;
        L59:
            int r46 = r45 | ((r53 & 255) << 2);
            this.tailLen = r64 - r7;
            r2[r8] = r1[(r46 >> 12) & 63];
            r2[r8 + 1] = r1[(r46 >> 6) & 63];
            int r54 = r8 + 3;
            r2[r8 + 2] = r1[r46 & 63];
            if (this.do_padding == false) goto L63;
            int r82 = r8 + Base64.CRLF;
            r2[r54] = 61;
            r54 = r82;
        L63:
            if (this.do_newline == true) goto L65;
            r8 = r54;
            goto L84
        L65:
            if (this.do_cr == false) goto L67;
            r2[r54] = 13;
            r54 = r54 + 1;
        L67:
            r12 = r54 + 1;
            r2[r54] = 10;
            goto L77
        L58:
            r53 = r18[r11];
            goto L59
        L54:
            byte r55 = r18[r11];
            r11 = r11 + 1;
            r44 = r55;
            goto L55
        L70:
            if (this.do_newline == false) goto L84;
            if (r8 <= 0) goto L84;
            if (r3 == LINE_GROUPS) goto L84;
            if (this.do_cr == false) goto L76;
            r2[r8] = 13;
            r8 = r8 + 1;
        L76:
            r12 = r8 + 1;
            r2[r8] = 10;
            goto L77
        L79:
            if (r11 != (r4 - 1)) goto L82;
            byte[] r13 = this.tail;
            int r22 = this.tailLen;
            this.tailLen = r22 + 1;
            r13[r22] = r18[r11];
            goto L84
        L82:
            if (r11 != (r4 - 2)) goto L84;
            byte[] r14 = this.tail;
            int r23 = this.tailLen;
            int r47 = r23 + 1;
            this.tailLen = r47;
            r14[r23] = r18[r11];
            this.tailLen = r23 + 2;
            r14[r47] = r18[r11 + 1];
            goto L84
        L18:
            if (this.do_cr == false) goto L20;
            r2[Base64.CRLF] = 13;
            int r32 = 5;
        L21:
            r8 = r32 + 1;
            r2[r32] = 10;
            r3 = LINE_GROUPS;
            goto L24
        L20:
            r32 = Base64.CRLF;
            goto L21
        L23:
            r8 = 0;
        L12:
            r11 = r19;
            r102 = -1;
            goto L14
        L10:
            if ((r19 + 2) > r4) goto L12;
            r11 = r19 + 2;
            r102 = (r18[r19 + 1] & 255) | (((this.tail[0] & 255) << 16) | ((r18[r19] & 255) << Base64.URL_SAFE));
            this.tailLen = 0;
            goto L14
        }

        private Encoder(int r4, byte[] r5) {
            this.output = r5;
            boolean r1 = true;
            if ((r4 & 1) != 0) goto L5;
            boolean r52 = true;
        L6:
            this.do_padding = r52;
            if ((r4 & 2) != 0) goto L9;
            boolean r53 = true;
        L10:
            this.do_newline = r53;
            if ((r4 & Base64.CRLF) != 0) goto L14;
            r1 = false;
        L14:
            this.do_cr = r1;
            if ((r4 & Base64.URL_SAFE) != 0) goto L17;
            byte[] r42 = ENCODE;
        L18:
            this.alphabet = r42;
            this.tail = new byte[2];
            this.tailLen = 0;
            if (r53 == false) goto L21;
            int r43 = LINE_GROUPS;
        L22:
            this.count = r43;
            return;
        L21:
            r43 = -1;
            goto L22
        L17:
            r42 = ENCODE_WEBSAFE;
            goto L18
        L9:
            r53 = false;
            goto L10
        L5:
            r52 = false;
            goto L6
        }
    }

    private Base64() {
    }

    public static byte[] decode(String r0, int r1) {
        return decode(r0.getBytes(), r1);
    }

    public static byte[] encode(String r0, int r1) {
        return encode(r0.getBytes(), r1);
    }

    public static byte[] decode(byte[] r2, int r3) {
        return decode(r2, 0, r2.length, r3);
    }

    public static byte[] encode(byte[] r2, int r3) {
        return encode(r2, 0, r2.length, r3);
    }

    private static byte[] decode(byte[] r3, int r4, int r5, int r6) {
        Decoder r0 = new Decoder(new byte[(r5 * 3) / CRLF], r6, 0);
        if (r0.process(r3, r4, r5, true) == false) goto L10;
        int r32 = r0.op;
        byte[] r42 = r0.output;
        if (r32 != r42.length) goto L7;
        return r42;
    L7:
        byte[] r52 = new byte[r32];
        System.arraycopy(r42, 0, r52, 0, r32);
        return r52;
    L10:
        throw new IllegalArgumentException("bad base-64");
    }

    private static byte[] encode(byte[] r5, int r6, int r7, int r8) {
        Encoder r0 = new Encoder(r8);
        int r82 = (r7 / 3) * CRLF;
        int r2 = 2;
        if (r0.do_padding == true) goto L5;
        int r1 = r7 % 3;
        if (r1 == 1) goto L12;
        if (r1 != 2) goto L14;
        r82 = r82 + 3;
    L14:
        if (r0.do_newline == false) goto L21;
        if (r7 <= 0) goto L21;
        int r12 = ((r7 - 1) / 57) + 1;
        if (r0.do_cr == true) goto L20;
        r2 = 1;
    L20:
        r82 = r82 + (r12 * r2);
    L21:
        r0.output = new byte[r82];
        r0.process(r5, r6, r7, true);
        return r0.output;
    L12:
        r82 = r82 + 2;
        goto L14
    L5:
        if ((r7 % 3) <= 0) goto L14;
        r82 = r82 + CRLF;
        goto L14
    }
}
