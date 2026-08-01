package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Utf8Safe extends androidx.emoji2.text.flatbuffer.Utf8 {

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

    public Utf8Safe() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int computeEncodedLength(java.lang.CharSequence r9) {
            int r0 = r9.length()
            r1 = r0
            r2 = 0
        L6:
            if (r2 >= r0) goto L13
            char r3 = r9.charAt(r2)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L13
            int r2 = r2 + 1
            goto L6
        L13:
            if (r2 >= r0) goto L2b
            char r3 = r9.charAt(r2)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L25
            int r4 = 127 - r3
            int r4 = r4 >>> 31
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L13
        L25:
            int r4 = encodedLengthGeneral(r9, r2)
            int r1 = r1 + r4
        L2b:
            if (r1 < r0) goto L2e
            return r1
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "UTF-8 length does not fit in int: "
            java.lang.StringBuilder r4 = r4.append(r5)
            long r5 = (long) r1
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            long r5 = r5 + r7
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static java.lang.String decodeUtf8Array(byte[] r11, int r12, int r13) {
            r0 = r12 | r13
            int r1 = r11.length
            int r1 = r1 - r12
            int r1 = r1 - r13
            r0 = r0 | r1
            if (r0 < 0) goto Lb4
            r0 = r12
            int r1 = r0 + r13
            char[] r8 = new char[r13]
            r2 = 0
        Le:
            if (r0 >= r1) goto L22
            r3 = r11[r0]
            boolean r4 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r3)
            if (r4 != 0) goto L19
            goto L22
        L19:
            int r0 = r0 + 1
            int r4 = r2 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r3, r8, r2)
            r2 = r4
            goto Le
        L22:
            r7 = r2
        L23:
            if (r0 >= r1) goto Lad
            int r2 = r0 + 1
            r0 = r11[r0]
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r0)
            if (r3 == 0) goto L4b
            int r3 = r7 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r0, r8, r7)
        L34:
            if (r2 >= r1) goto L48
            r4 = r11[r2]
            boolean r5 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r4)
            if (r5 != 0) goto L3f
            goto L48
        L3f:
            int r2 = r2 + 1
            int r5 = r3 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r4, r8, r3)
            r3 = r5
            goto L34
        L48:
            r0 = r2
            r7 = r3
            goto La5
        L4b:
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isTwoBytes(r0)
            java.lang.String r4 = "Invalid UTF-8"
            if (r3 == 0) goto L67
            if (r2 >= r1) goto L61
            int r3 = r2 + 1
            r2 = r11[r2]
            int r4 = r7 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleTwoBytes(r0, r2, r8, r7)
            r0 = r3
            r7 = r4
            goto La5
        L61:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r4)
            throw r3
        L67:
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isThreeBytes(r0)
            if (r3 == 0) goto L87
            int r3 = r1 + (-1)
            if (r2 >= r3) goto L81
            int r3 = r2 + 1
            r2 = r11[r2]
            int r4 = r3 + 1
            r3 = r11[r3]
            int r5 = r7 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleThreeBytes(r0, r2, r3, r8, r7)
            r0 = r4
            r7 = r5
            goto La5
        L81:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r4)
            throw r3
        L87:
            int r3 = r1 + (-2)
            if (r2 >= r3) goto La7
            int r3 = r2 + 1
            r4 = r11[r2]
            int r2 = r3 + 1
            r5 = r11[r3]
            int r9 = r2 + 1
            r6 = r11[r2]
            int r10 = r7 + 1
            r2 = r0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleFourBytes(r2, r3, r4, r5, r6, r7)
            int r10 = r10 + 1
            r0 = r9
            r7 = r10
        La5:
            goto L23
        La7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r4)
            throw r3
        Lad:
            java.lang.String r2 = new java.lang.String
            r3 = 0
            r2.<init>(r8, r3, r7)
            return r2
        Lb4:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r1 = r11.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String decodeUtf8Buffer(java.nio.ByteBuffer r10, int r11, int r12) {
            r0 = r11 | r12
            int r1 = r10.limit()
            int r1 = r1 - r11
            int r1 = r1 - r12
            r0 = r0 | r1
            if (r0 < 0) goto Lc9
            int r0 = r11 + r12
            char[] r7 = new char[r12]
            r1 = 0
        L10:
            if (r11 >= r0) goto L26
            byte r2 = r10.get(r11)
            boolean r3 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r2)
            if (r3 != 0) goto L1d
            goto L26
        L1d:
            int r11 = r11 + 1
            int r3 = r1 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r2, r7, r1)
            r1 = r3
            goto L10
        L26:
            r6 = r1
        L27:
            if (r11 >= r0) goto Lc2
            int r1 = r11 + 1
            byte r11 = r10.get(r11)
            boolean r2 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r11)
            if (r2 == 0) goto L54
            int r2 = r6 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r11, r7, r6)
        L3a:
            if (r1 >= r0) goto L50
            byte r3 = r10.get(r1)
            boolean r4 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isOneByte(r3)
            if (r4 != 0) goto L47
            goto L50
        L47:
            int r1 = r1 + 1
            int r4 = r2 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleOneByte(r3, r7, r2)
            r2 = r4
            goto L3a
        L50:
            r11 = r1
            r6 = r2
            goto Lba
        L54:
            boolean r2 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isTwoBytes(r11)
            java.lang.String r3 = "Invalid UTF-8"
            if (r2 == 0) goto L72
            if (r1 >= r0) goto L6c
            int r2 = r1 + 1
            byte r1 = r10.get(r1)
            int r3 = r6 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleTwoBytes(r11, r1, r7, r6)
            r11 = r2
            r6 = r3
            goto Lba
        L6c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r3)
            throw r2
        L72:
            boolean r2 = androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.isThreeBytes(r11)
            if (r2 == 0) goto L96
            int r2 = r0 + (-1)
            if (r1 >= r2) goto L90
            int r2 = r1 + 1
            byte r1 = r10.get(r1)
            int r3 = r2 + 1
            byte r2 = r10.get(r2)
            int r4 = r6 + 1
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleThreeBytes(r11, r1, r2, r7, r6)
            r11 = r3
            r6 = r4
            goto Lba
        L90:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r3)
            throw r2
        L96:
            int r2 = r0 + (-2)
            if (r1 >= r2) goto Lbc
            int r2 = r1 + 1
            byte r3 = r10.get(r1)
            int r1 = r2 + 1
            byte r4 = r10.get(r2)
            int r8 = r1 + 1
            byte r5 = r10.get(r1)
            int r9 = r6 + 1
            r1 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleFourBytes(r1, r2, r3, r4, r5, r6)
            int r9 = r9 + 1
            r11 = r8
            r6 = r9
        Lba:
            goto L27
        Lbc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r3)
            throw r2
        Lc2:
            java.lang.String r1 = new java.lang.String
            r2 = 0
            r1.<init>(r7, r2, r6)
            return r1
        Lc9:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r1 = r10.limit()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private static int encodeUtf8Array(java.lang.CharSequence r10, byte[] r11, int r12, int r13) {
            int r0 = r10.length()
            r1 = r12
            r2 = 0
            int r3 = r12 + r13
        L8:
            r4 = 128(0x80, float:1.8E-43)
            if (r2 >= r0) goto L1f
            int r5 = r2 + r1
            if (r5 >= r3) goto L1f
            char r5 = r10.charAt(r2)
            r6 = r5
            if (r5 >= r4) goto L1f
            int r4 = r1 + r2
            byte r5 = (byte) r6
            r11[r4] = r5
            int r2 = r2 + 1
            goto L8
        L1f:
            if (r2 != r0) goto L24
            int r4 = r1 + r0
            return r4
        L24:
            int r1 = r1 + r2
        L25:
            if (r2 >= r0) goto L10c
            char r5 = r10.charAt(r2)
            if (r5 >= r4) goto L37
            if (r1 >= r3) goto L37
            int r6 = r1 + 1
            byte r7 = (byte) r5
            r11[r1] = r7
            r1 = r6
            goto Lbf
        L37:
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 >= r6) goto L51
            int r6 = r3 + (-2)
            if (r1 > r6) goto L51
            int r6 = r1 + 1
            int r7 = r5 >>> 6
            r7 = r7 | 960(0x3c0, float:1.345E-42)
            byte r7 = (byte) r7
            r11[r1] = r7
            int r1 = r6 + 1
            r7 = r5 & 63
            r7 = r7 | r4
            byte r7 = (byte) r7
            r11[r6] = r7
            goto Lbf
        L51:
            r6 = 57343(0xdfff, float:8.0355E-41)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L5b
            if (r6 >= r5) goto L7c
        L5b:
            int r8 = r3 + (-3)
            if (r1 > r8) goto L7c
            int r6 = r1 + 1
            int r7 = r5 >>> 12
            r7 = r7 | 480(0x1e0, float:6.73E-43)
            byte r7 = (byte) r7
            r11[r1] = r7
            int r1 = r6 + 1
            int r7 = r5 >>> 6
            r7 = r7 & 63
            r7 = r7 | r4
            byte r7 = (byte) r7
            r11[r6] = r7
            int r6 = r1 + 1
            r7 = r5 & 63
            r7 = r7 | r4
            byte r7 = (byte) r7
            r11[r1] = r7
            r1 = r6
            goto Lbf
        L7c:
            int r8 = r3 + (-4)
            if (r1 > r8) goto Lcb
            int r6 = r2 + 1
            int r7 = r10.length()
            if (r6 == r7) goto Lc3
            int r2 = r2 + 1
            char r6 = r10.charAt(r2)
            r7 = r6
            boolean r6 = java.lang.Character.isSurrogatePair(r5, r6)
            if (r6 == 0) goto Lc3
            int r6 = java.lang.Character.toCodePoint(r5, r7)
            int r8 = r1 + 1
            int r9 = r6 >>> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r11[r1] = r9
            int r1 = r8 + 1
            int r9 = r6 >>> 12
            r9 = r9 & 63
            r9 = r9 | r4
            byte r9 = (byte) r9
            r11[r8] = r9
            int r8 = r1 + 1
            int r9 = r6 >>> 6
            r9 = r9 & 63
            r9 = r9 | r4
            byte r9 = (byte) r9
            r11[r1] = r9
            int r1 = r8 + 1
            r9 = r6 & 63
            r9 = r9 | r4
            byte r9 = (byte) r9
            r11[r8] = r9
        Lbf:
            int r2 = r2 + 1
            goto L25
        Lc3:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r4 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException
            int r6 = r2 + (-1)
            r4.<init>(r6, r0)
            throw r4
        Lcb:
            if (r7 > r5) goto Le9
            if (r5 > r6) goto Le9
            int r4 = r2 + 1
            int r6 = r10.length()
            if (r4 == r6) goto Le3
            int r4 = r2 + 1
            char r4 = r10.charAt(r4)
            boolean r4 = java.lang.Character.isSurrogatePair(r5, r4)
            if (r4 != 0) goto Le9
        Le3:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r4 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException
            r4.<init>(r2, r0)
            throw r4
        Le9:
            java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed writing "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = " at index "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r4.<init>(r6)
            throw r4
        L10c:
            return r1
    }

    private static void encodeUtf8Buffer(java.lang.CharSequence r9, java.nio.ByteBuffer r10) {
            int r0 = r9.length()
            int r1 = r10.position()
            r2 = 0
        L9:
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r0) goto L20
            char r4 = r9.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r5 = r4
            if (r4 >= r3) goto L20
            int r3 = r1 + r2
            byte r4 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r10.put(r3, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            int r2 = r2 + 1
            goto L9
        L1d:
            r3 = move-exception
            goto Lcc
        L20:
            if (r2 != r0) goto L28
            int r3 = r1 + r2
            r10.position(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            return
        L28:
            int r1 = r1 + r2
        L29:
            if (r2 >= r0) goto Lc7
            char r4 = r9.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            if (r4 >= r3) goto L37
            byte r5 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r10.put(r1, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            goto Lc1
        L37:
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L53
            int r5 = r1 + 1
            int r6 = r4 >>> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r10.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            r1 = r4 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            r10.put(r5, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            r1 = r5
            goto Lc1
        L4f:
            r3 = move-exception
            r1 = r5
            goto Lcc
        L53:
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto La5
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r5 >= r4) goto L5e
            goto La5
        L5e:
            int r5 = r2 + 1
            if (r5 == r0) goto L9f
            int r2 = r2 + 1
            char r5 = r9.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r6 = r5
            boolean r5 = java.lang.Character.isSurrogatePair(r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            if (r5 == 0) goto L9f
            int r5 = java.lang.Character.toCodePoint(r4, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            int r7 = r1 + 1
            int r8 = r5 >>> 18
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            r10.put(r1, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L9c
            int r1 = r7 + 1
            int r8 = r5 >>> 12
            r8 = r8 & 63
            r8 = r8 | r3
            byte r8 = (byte) r8
            r10.put(r7, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            int r7 = r1 + 1
            int r8 = r5 >>> 6
            r8 = r8 & 63
            r8 = r8 | r3
            byte r8 = (byte) r8
            r10.put(r1, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L9c
            r1 = r5 & 63
            r1 = r1 | r3
            byte r1 = (byte) r1     // Catch: java.lang.IndexOutOfBoundsException -> L9c
            r10.put(r7, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L9c
            r1 = r7
            goto Lc1
        L9c:
            r3 = move-exception
            r1 = r7
            goto Lcc
        L9f:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r3 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r3.<init>(r2, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            throw r3     // Catch: java.lang.IndexOutOfBoundsException -> L1d
        La5:
            int r5 = r1 + 1
            int r6 = r4 >>> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r10.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            int r1 = r5 + 1
            int r6 = r4 >>> 6
            r6 = r6 & 63
            r6 = r6 | r3
            byte r6 = (byte) r6
            r10.put(r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r5 = r4 & 63
            r5 = r5 | r3
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r10.put(r1, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
        Lc1:
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L29
        Lc7:
            r10.position(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            return
        Lcc:
            int r4 = r10.position()
            int r5 = r10.position()
            int r5 = r1 - r5
            int r5 = r5 + 1
            int r5 = java.lang.Math.max(r2, r5)
            int r4 = r4 + r5
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed writing "
            java.lang.StringBuilder r6 = r6.append(r7)
            char r7 = r9.charAt(r2)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = " at index "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    private static int encodedLengthGeneral(java.lang.CharSequence r6, int r7) {
            int r0 = r6.length()
            r1 = 0
            r2 = r7
        L6:
            if (r2 >= r0) goto L36
            char r3 = r6.charAt(r2)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L16
            int r4 = 127 - r3
            int r4 = r4 >>> 31
            int r1 = r1 + r4
            goto L33
        L16:
            int r1 = r1 + 2
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r4 > r3) goto L33
            r4 = 57343(0xdfff, float:8.0355E-41)
            if (r3 > r4) goto L33
            int r4 = java.lang.Character.codePointAt(r6, r2)
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r4 < r5) goto L2d
            int r2 = r2 + 1
            goto L33
        L2d:
            androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException r5 = new androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException
            r5.<init>(r2, r0)
            throw r5
        L33:
            int r2 = r2 + 1
            goto L6
        L36:
            return r1
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public java.lang.String decodeUtf8(java.nio.ByteBuffer r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r2 = this;
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L14
            byte[] r0 = r3.array()
            int r1 = r3.arrayOffset()
            int r1 = r1 + r4
            java.lang.String r0 = decodeUtf8Array(r0, r1, r5)
            return r0
        L14:
            java.lang.String r0 = decodeUtf8Buffer(r3, r4, r5)
            return r0
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(java.lang.CharSequence r5, java.nio.ByteBuffer r6) {
            r4 = this;
            boolean r0 = r6.hasArray()
            if (r0 == 0) goto L21
            int r0 = r6.arrayOffset()
            byte[] r1 = r6.array()
            int r2 = r6.position()
            int r2 = r2 + r0
            int r3 = r6.remaining()
            int r1 = encodeUtf8Array(r5, r1, r2, r3)
            int r2 = r1 - r0
            r6.position(r2)
            goto L24
        L21:
            encodeUtf8Buffer(r5, r6)
        L24:
            return
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(java.lang.CharSequence r2) {
            r1 = this;
            int r0 = computeEncodedLength(r2)
            return r0
    }
}
