package com.google.flatbuffers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Utf8 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static com.google.flatbuffers.Utf8 DEFAULT;

    static class DecodeUtil {
        DecodeUtil() {
                r0 = this;
                r0.<init>()
                return
        }

        static void handleFourBytes(byte r3, byte r4, byte r5, byte r6, char[] r7, int r8) throws java.lang.IllegalArgumentException {
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L41
                int r0 = r3 << 28
                int r1 = r4 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r5)
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r6)
                if (r0 != 0) goto L41
                r0 = r3 & 7
                int r0 = r0 << 18
                int r1 = trailingByteValue(r4)
                int r1 = r1 << 12
                r0 = r0 | r1
                int r1 = trailingByteValue(r5)
                int r1 = r1 << 6
                r0 = r0 | r1
                int r1 = trailingByteValue(r6)
                r0 = r0 | r1
                char r1 = highSurrogate(r0)
                r7[r8] = r1
                int r1 = r8 + 1
                char r2 = lowSurrogate(r0)
                r7[r1] = r2
                return
            L41:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Invalid UTF-8"
                r0.<init>(r1)
                throw r0
        }

        static void handleOneByte(byte r1, char[] r2, int r3) {
                char r0 = (char) r1
                r2[r3] = r0
                return
        }

        static void handleThreeBytes(byte r2, byte r3, byte r4, char[] r5, int r6) throws java.lang.IllegalArgumentException {
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
                r0 = r2 & 15
                int r0 = r0 << 12
                int r1 = trailingByteValue(r3)
                int r1 = r1 << 6
                r0 = r0 | r1
                int r1 = trailingByteValue(r4)
                r0 = r0 | r1
                char r0 = (char) r0
                r5[r6] = r0
                return
            L2e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Invalid UTF-8"
                r0.<init>(r1)
                throw r0
        }

        static void handleTwoBytes(byte r2, byte r3, char[] r4, int r5) throws java.lang.IllegalArgumentException {
                r0 = -62
                if (r2 < r0) goto L1f
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L17
                r0 = r2 & 31
                int r0 = r0 << 6
                int r1 = trailingByteValue(r3)
                r0 = r0 | r1
                char r0 = (char) r0
                r4[r5] = r0
                return
            L17:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"
                r0.<init>(r1)
                throw r0
            L1f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
                r0.<init>(r1)
                throw r0
        }

        private static char highSurrogate(int r2) {
                int r0 = r2 >>> 10
                r1 = 55232(0xd7c0, float:7.7397E-41)
                int r0 = r0 + r1
                char r0 = (char) r0
                return r0
        }

        private static boolean isNotTrailingByte(byte r1) {
                r0 = -65
                if (r1 <= r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        static boolean isOneByte(byte r1) {
                if (r1 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                return r0
        }

        static boolean isThreeBytes(byte r1) {
                r0 = -16
                if (r1 >= r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        static boolean isTwoBytes(byte r1) {
                r0 = -32
                if (r1 >= r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        private static char lowSurrogate(int r2) {
                r0 = r2 & 1023(0x3ff, float:1.434E-42)
                r1 = 56320(0xdc00, float:7.8921E-41)
                int r0 = r0 + r1
                char r0 = (char) r0
                return r0
        }

        private static int trailingByteValue(byte r1) {
                r0 = r1 & 63
                return r0
        }
    }

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unpaired surrogate at index "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r1 = " of "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
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

    public static int encodeUtf8CodePoint(java.lang.CharSequence r10, int r11, byte[] r12) {
            int r0 = r10.length()
            r1 = 0
            if (r11 < r0) goto L9
            return r1
        L9:
            char r2 = r10.charAt(r11)
            r3 = 1
            r4 = 128(0x80, float:1.8E-43)
            if (r2 >= r4) goto L16
            byte r4 = (byte) r2
            r12[r1] = r4
            return r3
        L16:
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 2
            if (r2 >= r5) goto L29
            int r5 = r2 >>> 6
            r5 = r5 | 192(0xc0, float:2.69E-43)
            byte r5 = (byte) r5
            r12[r1] = r5
            r1 = r2 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r12[r3] = r1
            return r6
        L29:
            r5 = 55296(0xd800, float:7.7486E-41)
            r7 = 3
            if (r2 < r5) goto L6f
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r5 >= r2) goto L35
            goto L6f
        L35:
            int r5 = r11 + 1
            if (r5 == r0) goto L69
            int r5 = r11 + 1
            char r5 = r10.charAt(r5)
            r8 = r5
            boolean r5 = java.lang.Character.isSurrogatePair(r2, r5)
            if (r5 == 0) goto L69
            int r5 = java.lang.Character.toCodePoint(r2, r8)
            int r9 = r5 >>> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r12[r1] = r9
            int r1 = r5 >>> 12
            r1 = r1 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r12[r3] = r1
            int r1 = r5 >>> 6
            r1 = r1 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r12[r6] = r1
            r1 = r5 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r12[r7] = r1
            r1 = 4
            return r1
        L69:
            com.google.flatbuffers.Utf8$UnpairedSurrogateException r1 = new com.google.flatbuffers.Utf8$UnpairedSurrogateException
            r1.<init>(r11, r0)
            throw r1
        L6f:
            int r5 = r2 >>> 12
            r5 = r5 | 224(0xe0, float:3.14E-43)
            byte r5 = (byte) r5
            r12[r1] = r5
            int r1 = r2 >>> 6
            r1 = r1 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r12[r3] = r1
            r1 = r2 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r12[r6] = r1
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
