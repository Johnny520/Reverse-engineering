package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Huffman {
    private static final int[] CODES = null;
    private static final byte[] CODE_BIT_COUNTS = null;
    public static final okhttp3.internal.http2.Huffman INSTANCE = null;
    private static final okhttp3.internal.http2.Huffman.Node root = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Node {
        private final okhttp3.internal.http2.Huffman.Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
                r1 = this;
                r1.<init>()
                r0 = 256(0x100, float:3.59E-43)
                okhttp3.internal.http2.Huffman$Node[] r0 = new okhttp3.internal.http2.Huffman.Node[r0]
                r1.children = r0
                r0 = 0
                r1.symbol = r0
                r1.terminalBitCount = r0
                return
        }

        public Node(int r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.children = r0
                r1.symbol = r2
                r2 = r3 & 7
                if (r2 != 0) goto Le
                r2 = 8
            Le:
                r1.terminalBitCount = r2
                return
        }

        public final okhttp3.internal.http2.Huffman.Node[] getChildren() {
                r1 = this;
                okhttp3.internal.http2.Huffman$Node[] r0 = r1.children
                return r0
        }

        public final int getSymbol() {
                r1 = this;
                int r0 = r1.symbol
                return r0
        }

        public final int getTerminalBitCount() {
                r1 = this;
                int r0 = r1.terminalBitCount
                return r0
        }
    }

    static {
            okhttp3.internal.http2.Huffman r0 = new okhttp3.internal.http2.Huffman
            r0.<init>()
            okhttp3.internal.http2.Huffman.INSTANCE = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r1 = {x0032: FILL_ARRAY_DATA , data: [8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846} // fill-array
            okhttp3.internal.http2.Huffman.CODES = r1
            byte[] r1 = new byte[r0]
            r1 = {x0236: FILL_ARRAY_DATA , data: [13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26} // fill-array
            okhttp3.internal.http2.Huffman.CODE_BIT_COUNTS = r1
            okhttp3.internal.http2.Huffman$Node r1 = new okhttp3.internal.http2.Huffman$Node
            r1.<init>()
            okhttp3.internal.http2.Huffman.root = r1
            r1 = 0
        L1f:
            if (r1 >= r0) goto L31
            okhttp3.internal.http2.Huffman r2 = okhttp3.internal.http2.Huffman.INSTANCE
            int[] r3 = okhttp3.internal.http2.Huffman.CODES
            r3 = r3[r1]
            byte[] r4 = okhttp3.internal.http2.Huffman.CODE_BIT_COUNTS
            r4 = r4[r1]
            r2.addCode(r1, r3, r4)
            int r1 = r1 + 1
            goto L1f
        L31:
            return
    }

    private Huffman() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void addCode(int r4, int r5, int r6) {
            r3 = this;
            okhttp3.internal.http2.Huffman$Node r0 = new okhttp3.internal.http2.Huffman$Node
            r0.<init>(r4, r6)
            okhttp3.internal.http2.Huffman$Node r4 = okhttp3.internal.http2.Huffman.root
        L7:
            r1 = 8
            if (r6 <= r1) goto L25
            int r6 = r6 + (-8)
            int r1 = r5 >>> r6
            r1 = r1 & 255(0xff, float:3.57E-43)
            okhttp3.internal.http2.Huffman$Node[] r4 = r4.getChildren()
            r4.getClass()
            r2 = r4[r1]
            if (r2 != 0) goto L23
            okhttp3.internal.http2.Huffman$Node r2 = new okhttp3.internal.http2.Huffman$Node
            r2.<init>()
            r4[r1] = r2
        L23:
            r4 = r2
            goto L7
        L25:
            int r1 = r1 - r6
            int r5 = r5 << r1
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 1
            int r6 = r6 << r1
            okhttp3.internal.http2.Huffman$Node[] r4 = r4.getChildren()
            r4.getClass()
            int r6 = r6 + r5
            java.util.Arrays.fill(r4, r5, r6, r0)
            return
    }

    public final void decode(okio.BufferedSource r8, long r9, okio.BufferedSink r11) {
            r7 = this;
            r8.getClass()
            r11.getClass()
            okhttp3.internal.http2.Huffman$Node r0 = okhttp3.internal.http2.Huffman.root
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = r1
        Ld:
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r6 = 255(0xff, float:3.57E-43)
            if (r5 >= 0) goto L51
            byte r5 = r8.readByte()
            int r5 = okhttp3.internal.Util.and(r5, r6)
            int r1 = r1 << 8
            r1 = r1 | r5
            int r2 = r2 + 8
        L20:
            r5 = 8
            if (r2 < r5) goto L4d
            int r5 = r2 + (-8)
            int r5 = r1 >>> r5
            r5 = r5 & r6
            okhttp3.internal.http2.Huffman$Node[] r0 = r0.getChildren()
            r0.getClass()
            r0 = r0[r5]
            r0.getClass()
            okhttp3.internal.http2.Huffman$Node[] r5 = r0.getChildren()
            if (r5 != 0) goto L4a
            int r5 = r0.getSymbol()
            r11.writeByte(r5)
            int r0 = r0.getTerminalBitCount()
            int r2 = r2 - r0
            okhttp3.internal.http2.Huffman$Node r0 = okhttp3.internal.http2.Huffman.root
            goto L20
        L4a:
            int r2 = r2 + (-8)
            goto L20
        L4d:
            r5 = 1
            long r3 = r3 + r5
            goto Ld
        L51:
            if (r2 <= 0) goto L80
            int r8 = 8 - r2
            int r8 = r1 << r8
            r8 = r8 & r6
            okhttp3.internal.http2.Huffman$Node[] r9 = r0.getChildren()
            r9.getClass()
            r8 = r9[r8]
            r8.getClass()
            okhttp3.internal.http2.Huffman$Node[] r9 = r8.getChildren()
            if (r9 != 0) goto L80
            int r9 = r8.getTerminalBitCount()
            if (r9 <= r2) goto L71
            goto L80
        L71:
            int r9 = r8.getSymbol()
            r11.writeByte(r9)
            int r8 = r8.getTerminalBitCount()
            int r2 = r2 - r8
            okhttp3.internal.http2.Huffman$Node r0 = okhttp3.internal.http2.Huffman.root
            goto L51
        L80:
            return
    }

    public final void encode(okio.ByteString r9, okio.BufferedSink r10) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            int r0 = r9.size()
            r1 = 0
            r3 = 0
            r4 = r3
        Le:
            if (r3 >= r0) goto L36
            byte r5 = r9.getByte(r3)
            r6 = 255(0xff, float:3.57E-43)
            int r5 = okhttp3.internal.Util.and(r5, r6)
            int[] r6 = okhttp3.internal.http2.Huffman.CODES
            r6 = r6[r5]
            byte[] r7 = okhttp3.internal.http2.Huffman.CODE_BIT_COUNTS
            r5 = r7[r5]
            long r1 = r1 << r5
            long r6 = (long) r6
            long r1 = r1 | r6
            int r4 = r4 + r5
        L26:
            r5 = 8
            if (r4 < r5) goto L33
            int r4 = r4 + (-8)
            long r5 = r1 >> r4
            int r5 = (int) r5
            r10.writeByte(r5)
            goto L26
        L33:
            int r3 = r3 + 1
            goto Le
        L36:
            if (r4 <= 0) goto L44
            int r9 = 8 - r4
            long r0 = r1 << r9
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 >>> r4
            long r0 = r0 | r2
            int r9 = (int) r0
            r10.writeByte(r9)
        L44:
            return
    }

    public final int encodedLength(okio.ByteString r7) {
            r6 = this;
            r7.getClass()
            int r0 = r7.size()
            r1 = 0
            r3 = 0
        La:
            if (r3 >= r0) goto L1f
            byte r4 = r7.getByte(r3)
            r5 = 255(0xff, float:3.57E-43)
            int r4 = okhttp3.internal.Util.and(r4, r5)
            byte[] r5 = okhttp3.internal.http2.Huffman.CODE_BIT_COUNTS
            r4 = r5[r4]
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto La
        L1f:
            r7 = 7
            long r3 = (long) r7
            long r1 = r1 + r3
            r7 = 3
            long r0 = r1 >> r7
            int r7 = (int) r0
            return r7
    }
}
