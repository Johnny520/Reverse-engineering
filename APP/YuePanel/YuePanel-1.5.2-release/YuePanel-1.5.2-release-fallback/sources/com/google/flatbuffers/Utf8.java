package com.google.flatbuffers;

/* JADX INFO: loaded from: classes.dex */
public abstract class Utf8 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static com.google.flatbuffers.Utf8 DEFAULT;

    public static class DecodeUtil {
        public DecodeUtil() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void handleFourBytes(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) throws java.lang.IllegalArgumentException {
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L41
                int r0 = r2 << 28
                int r1 = r3 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r5)
                if (r0 != 0) goto L41
                r2 = r2 & 7
                int r2 = r2 << 18
                int r3 = trailingByteValue(r3)
                int r3 = r3 << 12
                r2 = r2 | r3
                int r3 = trailingByteValue(r4)
                int r3 = r3 << 6
                r2 = r2 | r3
                int r3 = trailingByteValue(r5)
                r2 = r2 | r3
                char r3 = highSurrogate(r2)
                r6[r7] = r3
                int r7 = r7 + 1
                char r2 = lowSurrogate(r2)
                r6[r7] = r2
                return
            L41:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Invalid UTF-8"
                r2.<init>(r3)
                throw r2
        }

        public static void handleOneByte(byte r0, char[] r1, int r2) {
                char r0 = (char) r0
                r1[r2] = r0
                return
        }

        public static void handleThreeBytes(byte r2, byte r3, byte r4, char[] r5, int r6) throws java.lang.IllegalArgumentException {
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L2e
                r0 = -32
                r1 = -96
                if (r2 != r0) goto Le
                if (r3 < r1) goto L2e
            Le:
                r0 = -19
                if (r2 != r0) goto L14
                if (r3 >= r1) goto L2e
            L14:
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L2e
                r2 = r2 & 15
                int r2 = r2 << 12
                int r3 = trailingByteValue(r3)
                int r3 = r3 << 6
                r2 = r2 | r3
                int r3 = trailingByteValue(r4)
                r2 = r2 | r3
                char r2 = (char) r2
                r5[r6] = r2
                return
            L2e:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Invalid UTF-8"
                r2.<init>(r3)
                throw r2
        }

        public static void handleTwoBytes(byte r1, byte r2, char[] r3, int r4) throws java.lang.IllegalArgumentException {
                r0 = -62
                if (r1 < r0) goto L1f
                boolean r0 = isNotTrailingByte(r2)
                if (r0 != 0) goto L17
                r1 = r1 & 31
                int r1 = r1 << 6
                int r2 = trailingByteValue(r2)
                r1 = r1 | r2
                char r1 = (char) r1
                r3[r4] = r1
                return
            L17:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"
                r1.<init>(r2)
                throw r1
            L1f:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
                r1.<init>(r2)
                throw r1
        }

        private static char highSurrogate(int r1) {
                int r1 = r1 >>> 10
                r0 = 55232(0xd7c0, float:7.7397E-41)
                int r1 = r1 + r0
                char r1 = (char) r1
                return r1
        }

        private static boolean isNotTrailingByte(byte r1) {
                r0 = -65
                if (r1 <= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        public static boolean isOneByte(byte r0) {
                if (r0 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                return r0
        }

        public static boolean isThreeBytes(byte r1) {
                r0 = -16
                if (r1 >= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        public static boolean isTwoBytes(byte r1) {
                r0 = -32
                if (r1 >= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        private static char lowSurrogate(int r1) {
                r1 = r1 & 1023(0x3ff, float:1.434E-42)
                r0 = 56320(0xdc00, float:7.8921E-41)
                int r1 = r1 + r0
                char r1 = (char) r1
                return r1
        }

        private static int trailingByteValue(byte r0) {
                r0 = r0 & 63
                return r0
        }
    }

    public static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        public UnpairedSurrogateException(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " of "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    static {
            return
    }

    public Utf8() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int encodeUtf8CodePoint(java.lang.CharSequence r8, int r9, byte[] r10) {
            int r0 = r8.length()
            r1 = 0
            if (r9 < r0) goto L8
            return r1
        L8:
            char r2 = r8.charAt(r9)
            r3 = 1
            r4 = 128(0x80, float:1.8E-43)
            if (r2 >= r4) goto L15
            byte r8 = (byte) r2
            r10[r1] = r8
            return r3
        L15:
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 2
            if (r2 >= r5) goto L28
            int r8 = r2 >>> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8
            r10[r1] = r8
            r8 = r2 & 63
            r8 = r8 | r4
            byte r8 = (byte) r8
            r10[r3] = r8
            return r6
        L28:
            r5 = 55296(0xd800, float:7.7486E-41)
            r7 = 3
            if (r2 < r5) goto L6b
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r5 >= r2) goto L34
            goto L6b
        L34:
            int r5 = r9 + 1
            if (r5 == r0) goto L65
            char r8 = r8.charAt(r5)
            boolean r5 = java.lang.Character.isSurrogatePair(r2, r8)
            if (r5 == 0) goto L65
            int r8 = java.lang.Character.toCodePoint(r2, r8)
            int r9 = r8 >>> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r10[r1] = r9
            int r9 = r8 >>> 12
            r9 = r9 & 63
            r9 = r9 | r4
            byte r9 = (byte) r9
            r10[r3] = r9
            int r9 = r8 >>> 6
            r9 = r9 & 63
            r9 = r9 | r4
            byte r9 = (byte) r9
            r10[r6] = r9
            r8 = r8 & 63
            r8 = r8 | r4
            byte r8 = (byte) r8
            r10[r7] = r8
            r8 = 4
            return r8
        L65:
            com.google.flatbuffers.Utf8$UnpairedSurrogateException r8 = new com.google.flatbuffers.Utf8$UnpairedSurrogateException
            r8.<init>(r9, r0)
            throw r8
        L6b:
            int r8 = r2 >>> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8
            r10[r1] = r8
            int r8 = r2 >>> 6
            r8 = r8 & 63
            r8 = r8 | r4
            byte r8 = (byte) r8
            r10[r3] = r8
            r8 = r2 & 63
            r8 = r8 | r4
            byte r8 = (byte) r8
            r10[r6] = r8
            return r7
    }

    public static com.google.flatbuffers.Utf8 getDefault() {
            com.google.flatbuffers.Utf8 r0 = com.google.flatbuffers.Utf8.DEFAULT
            if (r0 != 0) goto Lb
            com.google.flatbuffers.Utf8Safe r0 = new com.google.flatbuffers.Utf8Safe
            r0.<init>()
            com.google.flatbuffers.Utf8.DEFAULT = r0
        Lb:
            com.google.flatbuffers.Utf8 r0 = com.google.flatbuffers.Utf8.DEFAULT
            return r0
    }

    public static void setDefault(com.google.flatbuffers.Utf8 r0) {
            com.google.flatbuffers.Utf8.DEFAULT = r0
            return
    }

    public abstract java.lang.String decodeUtf8(java.nio.ByteBuffer r1, int r2, int r3);

    public abstract void encodeUtf8(java.lang.CharSequence r1, java.nio.ByteBuffer r2);

    public abstract int encodedLength(java.lang.CharSequence r1);
}
