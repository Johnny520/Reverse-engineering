package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements com.bumptech.glide.load.ImageHeaderParser {
    private static final int AVIF_BRAND = 1635150182;
    private static final int AVIS_BRAND = 1635150195;
    private static final int[] BYTES_PER_FORMAT = null;
    static final int EXIF_MAGIC_NUMBER = 65496;
    static final int EXIF_SEGMENT_TYPE = 225;
    private static final int FTYP_HEADER = 1718909296;
    private static final int GIF_HEADER = 4671814;
    private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
    private static final java.lang.String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\u0000\u0000";
    static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = null;
    private static final int MARKER_EOI = 217;
    private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
    private static final int ORIENTATION_TAG_TYPE = 274;
    private static final int PNG_HEADER = -1991225785;
    private static final int RIFF_HEADER = 1380533830;
    private static final int SEGMENT_SOS = 218;
    static final int SEGMENT_START_ID = 255;
    private static final java.lang.String TAG = "DfltImageHeaderParser";
    private static final int VP8_HEADER = 1448097792;
    private static final int VP8_HEADER_MASK = -256;
    private static final int VP8_HEADER_TYPE_EXTENDED = 88;
    private static final int VP8_HEADER_TYPE_LOSSLESS = 76;
    private static final int VP8_HEADER_TYPE_MASK = 255;
    private static final int WEBP_EXTENDED_ALPHA_FLAG = 16;
    private static final int WEBP_EXTENDED_ANIMATION_FLAG = 2;
    private static final int WEBP_HEADER = 1464156752;
    private static final int WEBP_LOSSLESS_ALPHA_FLAG = 8;

    public static final class ByteBufferReader implements com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader {
        private final java.nio.ByteBuffer byteBuffer;

        public ByteBufferReader(java.nio.ByteBuffer r2) {
                r1 = this;
                r1.<init>()
                r1.byteBuffer = r2
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r2.order(r0)
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int getUInt16() throws com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException {
                r2 = this;
                short r0 = r2.getUInt8()
                int r0 = r0 << 8
                short r1 = r2.getUInt8()
                r0 = r0 | r1
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short getUInt8() throws com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.byteBuffer
                int r0 = r0.remaining()
                r1 = 1
                if (r0 < r1) goto L13
                java.nio.ByteBuffer r0 = r2.byteBuffer
                byte r0 = r0.get()
                r0 = r0 & 255(0xff, float:3.57E-43)
                short r0 = (short) r0
                return r0
            L13:
                com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException
                r0.<init>()
                throw r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] r3, int r4) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.byteBuffer
                int r0 = r0.remaining()
                int r4 = java.lang.Math.min(r4, r0)
                if (r4 != 0) goto Le
                r3 = -1
                return r3
            Le:
                java.nio.ByteBuffer r0 = r2.byteBuffer
                r1 = 0
                r0.get(r3, r1, r4)
                return r4
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long r3) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.byteBuffer
                int r0 = r0.remaining()
                long r0 = (long) r0
                long r3 = java.lang.Math.min(r0, r3)
                int r3 = (int) r3
                java.nio.ByteBuffer r4 = r2.byteBuffer
                int r0 = r4.position()
                int r0 = r0 + r3
                r4.position(r0)
                long r3 = (long) r3
                return r3
        }
    }

    public static final class RandomAccessReader {
        private final java.nio.ByteBuffer data;

        public RandomAccessReader(byte[] r2, int r3) {
                r1 = this;
                r1.<init>()
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r0)
                java.nio.Buffer r2 = r2.limit(r3)
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                r1.data = r2
                return
        }

        private boolean isAvailable(int r2, int r3) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                int r0 = r0.remaining()
                int r0 = r0 - r2
                if (r0 < r3) goto Lb
                r2 = 1
                goto Lc
            Lb:
                r2 = 0
            Lc:
                return r2
        }

        public short getInt16(int r2) {
                r1 = this;
                r0 = 2
                boolean r0 = r1.isAvailable(r2, r0)
                if (r0 == 0) goto Le
                java.nio.ByteBuffer r0 = r1.data
                short r2 = r0.getShort(r2)
                goto Lf
            Le:
                r2 = -1
            Lf:
                return r2
        }

        public int getInt32(int r2) {
                r1 = this;
                r0 = 4
                boolean r0 = r1.isAvailable(r2, r0)
                if (r0 == 0) goto Le
                java.nio.ByteBuffer r0 = r1.data
                int r2 = r0.getInt(r2)
                goto Lf
            Le:
                r2 = -1
            Lf:
                return r2
        }

        public int length() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                int r0 = r0.remaining()
                return r0
        }

        public void order(java.nio.ByteOrder r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.data
                r0.order(r2)
                return
        }
    }

    public interface Reader {

        public static final class EndOfFileException extends java.io.IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                    r1 = this;
                    java.lang.String r0 = "Unexpectedly reached end of a file"
                    r1.<init>(r0)
                    return
            }
        }

        int getUInt16() throws java.io.IOException;

        short getUInt8() throws java.io.IOException;

        int read(byte[] r1, int r2) throws java.io.IOException;

        long skip(long r1) throws java.io.IOException;
    }

    public static final class StreamReader implements com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader {
        private final java.io.InputStream is;

        public StreamReader(java.io.InputStream r1) {
                r0 = this;
                r0.<init>()
                r0.is = r1
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int getUInt16() throws java.io.IOException {
                r2 = this;
                short r0 = r2.getUInt8()
                int r0 = r0 << 8
                short r1 = r2.getUInt8()
                r0 = r0 | r1
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short getUInt8() throws java.io.IOException {
                r2 = this;
                java.io.InputStream r0 = r2.is
                int r0 = r0.read()
                r1 = -1
                if (r0 == r1) goto Lb
                short r0 = (short) r0
                return r0
            Lb:
                com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException
                r0.<init>()
                throw r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] r5, int r6) throws java.io.IOException {
                r4 = this;
                r0 = 0
                r1 = r0
            L2:
                r2 = -1
                if (r0 >= r6) goto L11
                java.io.InputStream r1 = r4.is
                int r3 = r6 - r0
                int r1 = r1.read(r5, r0, r3)
                if (r1 == r2) goto L11
                int r0 = r0 + r1
                goto L2
            L11:
                if (r0 != 0) goto L1c
                if (r1 == r2) goto L16
                goto L1c
            L16:
                com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException r5 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException
                r5.<init>()
                throw r5
            L1c:
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long r8) throws java.io.IOException {
                r7 = this;
                r0 = 0
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 >= 0) goto L7
                return r0
            L7:
                r2 = r8
            L8:
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L25
                java.io.InputStream r4 = r7.is
                long r4 = r4.skip(r2)
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 <= 0) goto L18
            L16:
                long r2 = r2 - r4
                goto L8
            L18:
                java.io.InputStream r4 = r7.is
                int r4 = r4.read()
                r5 = -1
                if (r4 != r5) goto L22
                goto L25
            L22:
                r4 = 1
                goto L16
            L25:
                long r8 = r8 - r2
                return r8
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "Exif\u0000\u0000"
            byte[] r0 = r1.getBytes(r0)
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = r0
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8} // fill-array
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.BYTES_PER_FORMAT = r0
            return
    }

    public DefaultImageHeaderParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int calcTagOffset(int r0, int r1) {
            int r0 = r0 + 2
            int r1 = r1 * 12
            int r0 = r0 + r1
            return r0
    }

    private int getOrientation(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r7) throws java.io.IOException {
            r5 = this;
            r0 = -1
            int r1 = r6.getUInt16()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            boolean r2 = handles(r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            r3 = 3
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r2 != 0) goto L29
            boolean r6 = android.util.Log.isLoggable(r4, r3)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            if (r6 == 0) goto L28
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            r6.<init>()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            java.lang.String r7 = "Parser doesn't handle magic number: "
            r6.append(r7)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            r6.append(r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            java.lang.String r6 = r6.toString()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            android.util.Log.d(r4, r6)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
        L28:
            return r0
        L29:
            int r1 = r5.moveToExifSegmentAndGetLength(r6)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            if (r1 != r0) goto L3b
            boolean r6 = android.util.Log.isLoggable(r4, r3)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            if (r6 == 0) goto L3a
            java.lang.String r6 = "Failed to parse exif segment length, or exif segment not found"
            android.util.Log.d(r4, r6)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
        L3a:
            return r0
        L3b:
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r2 = r7.get(r1, r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            byte[] r2 = (byte[]) r2     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            int r6 = r5.parseExifSegment(r6, r2, r1)     // Catch: java.lang.Throwable -> L4b
            r7.put(r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            return r6
        L4b:
            r6 = move-exception
            r7.put(r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
            throw r6     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L50
        L50:
            return r0
    }

    @Yue.InterfaceC4410
    private com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6) throws java.io.IOException {
            r5 = this;
            int r0 = r6.getUInt16()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto Lc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        Lc:
            int r0 = r0 << 8
            short r1 = r6.getUInt8()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L1b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        L1b:
            int r0 = r0 << 8
            short r1 = r6.getUInt8()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L3c
            r0 = 21
            r6.skip(r0)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            short r6 = r6.getUInt8()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L39
            r0 = 3
            if (r6 < r0) goto L36
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L39
            goto L38
        L36:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L39
        L38:
            return r6
        L39:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        L3c:
            r1 = 1380533830(0x52494646, float:2.1611685E11)
            if (r0 == r1) goto L46
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r5.sniffAvif(r6, r0)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        L46:
            r0 = 4
            r6.skip(r0)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            int r2 = r6.getUInt16()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            int r2 = r2 << 16
            int r3 = r6.getUInt16()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.168886E14)
            if (r2 == r3) goto L5e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        L5e:
            int r2 = r6.getUInt16()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            int r2 = r2 << 16
            int r3 = r6.getUInt16()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            r2 = r2 | r3
            r3 = r2 & (-256(0xffffffffffffff00, float:NaN))
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L73
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        L73:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L91
            r6.skip(r0)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            short r6 = r6.getUInt8()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            r0 = r6 & 2
            if (r0 == 0) goto L87
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        L87:
            r6 = r6 & 16
            if (r6 == 0) goto L8e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        L8e:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        L91:
            r3 = 76
            if (r2 != r3) goto La6
            r6.skip(r0)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            short r6 = r6.getUInt8()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            r6 = r6 & 8
            if (r6 == 0) goto La3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            goto La5
        La3:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
        La5:
            return r6
        La6:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La9
            return r6
        La9:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
    }

    private static boolean handles(int r2) {
            r0 = 65496(0xffd8, float:9.178E-41)
            r1 = r2 & r0
            if (r1 == r0) goto L12
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r2 == r0) goto L12
            r0 = 18761(0x4949, float:2.629E-41)
            if (r2 != r0) goto L10
            goto L12
        L10:
            r2 = 0
            goto L13
        L12:
            r2 = 1
        L13:
            return r2
    }

    private boolean hasJpegExifPreamble(byte[] r5, int r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto La
            byte[] r1 = com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.JPEG_EXIF_SEGMENT_PREAMBLE_BYTES
            int r1 = r1.length
            if (r6 <= r1) goto La
            r6 = 1
            goto Lb
        La:
            r6 = r0
        Lb:
            if (r6 == 0) goto L1d
            r1 = r0
        Le:
            byte[] r2 = com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.JPEG_EXIF_SEGMENT_PREAMBLE_BYTES
            int r3 = r2.length
            if (r1 >= r3) goto L1d
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto L1a
            goto L1e
        L1a:
            int r1 = r1 + 1
            goto Le
        L1d:
            r0 = r6
        L1e:
            return r0
    }

    private int moveToExifSegmentAndGetLength(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r10) throws java.io.IOException {
            r9 = this;
        L0:
            short r0 = r10.getUInt8()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L27
            boolean r10 = android.util.Log.isLoggable(r4, r2)
            if (r10 == 0) goto L26
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Unknown segmentId="
            r10.append(r1)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r4, r10)
        L26:
            return r3
        L27:
            short r0 = r10.getUInt8()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L30
            return r3
        L30:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L40
            boolean r10 = android.util.Log.isLoggable(r4, r2)
            if (r10 == 0) goto L3f
            java.lang.String r10 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r10)
        L3f:
            return r3
        L40:
            int r1 = r10.getUInt16()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L7e
            long r5 = (long) r1
            long r7 = r10.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r10 = android.util.Log.isLoggable(r4, r2)
            if (r10 == 0) goto L7d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "Unable to skip enough data, type: "
            r10.append(r2)
            r10.append(r0)
            java.lang.String r0 = ", wanted to skip: "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ", but actually skipped: "
            r10.append(r0)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r4, r10)
        L7d:
            return r3
        L7e:
            return r1
    }

    private static int parseExifSegment(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.RandomAccessReader r12) {
            r0 = 6
            short r1 = r12.getInt16(r0)
            r2 = 18761(0x4949, float:2.629E-41)
            r3 = 3
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r1 == r2) goto L30
            r2 = 19789(0x4d4d, float:2.773E-41)
            if (r1 == r2) goto L2d
            boolean r2 = android.util.Log.isLoggable(r4, r3)
            if (r2 == 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Unknown endianness = "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.d(r4, r1)
        L2a:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L32
        L2d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L32
        L30:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
        L32:
            r12.order(r1)
            r1 = 10
            int r1 = r12.getInt32(r1)
            int r1 = r1 + r0
            short r0 = r12.getInt16(r1)
            r2 = 0
        L41:
            if (r2 >= r0) goto L13f
            int r5 = calcTagOffset(r1, r2)
            short r6 = r12.getInt16(r5)
            r7 = 274(0x112, float:3.84E-43)
            if (r6 == r7) goto L51
            goto L13b
        L51:
            int r7 = r5 + 2
            short r7 = r12.getInt16(r7)
            r8 = 1
            if (r7 < r8) goto L121
            r8 = 12
            if (r7 <= r8) goto L60
            goto L121
        L60:
            int r8 = r5 + 4
            int r8 = r12.getInt32(r8)
            if (r8 >= 0) goto L75
            boolean r5 = android.util.Log.isLoggable(r4, r3)
            if (r5 == 0) goto L13b
            java.lang.String r5 = "Negative tiff component count"
            android.util.Log.d(r4, r5)
            goto L13b
        L75:
            boolean r9 = android.util.Log.isLoggable(r4, r3)
            java.lang.String r10 = " tagType="
            if (r9 == 0) goto La7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Got tagIndex="
            r9.append(r11)
            r9.append(r2)
            r9.append(r10)
            r9.append(r6)
            java.lang.String r11 = " formatCode="
            r9.append(r11)
            r9.append(r7)
            java.lang.String r11 = " componentCount="
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        La7:
            int[] r9 = com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.BYTES_PER_FORMAT
            r9 = r9[r7]
            int r8 = r8 + r9
            r9 = 4
            if (r8 <= r9) goto Lcb
            boolean r5 = android.util.Log.isLoggable(r4, r3)
            if (r5 == 0) goto L13b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got byte count > 4, not orientation, continuing, formatCode="
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
            goto L13b
        Lcb:
            int r5 = r5 + 8
            if (r5 < 0) goto L100
            int r7 = r12.length()
            if (r5 <= r7) goto Ld6
            goto L100
        Ld6:
            if (r8 < 0) goto Le5
            int r8 = r8 + r5
            int r7 = r12.length()
            if (r8 <= r7) goto Le0
            goto Le5
        Le0:
            short r12 = r12.getInt16(r5)
            return r12
        Le5:
            boolean r5 = android.util.Log.isLoggable(r4, r3)
            if (r5 == 0) goto L13b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Illegal number of bytes for TI tag data tagType="
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
            goto L13b
        L100:
            boolean r7 = android.util.Log.isLoggable(r4, r3)
            if (r7 == 0) goto L13b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Illegal tagValueOffset="
            r7.append(r8)
            r7.append(r5)
            r7.append(r10)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            android.util.Log.d(r4, r5)
            goto L13b
        L121:
            boolean r5 = android.util.Log.isLoggable(r4, r3)
            if (r5 == 0) goto L13b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got invalid format code = "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
        L13b:
            int r2 = r2 + 1
            goto L41
        L13f:
            r12 = -1
            return r12
    }

    private int parseExifSegment(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r4, byte[] r5, int r6) throws java.io.IOException {
            r3 = this;
            int r4 = r4.read(r5, r6)
            r0 = -1
            r1 = 3
            java.lang.String r2 = "DfltImageHeaderParser"
            if (r4 == r6) goto L2d
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L2c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Unable to read exif segment data, length: "
            r5.append(r1)
            r5.append(r6)
            java.lang.String r6 = ", actually read: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.d(r2, r4)
        L2c:
            return r0
        L2d:
            boolean r4 = r3.hasJpegExifPreamble(r5, r6)
            if (r4 == 0) goto L3d
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$RandomAccessReader r4 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$RandomAccessReader
            r4.<init>(r5, r6)
            int r4 = parseExifSegment(r4)
            return r4
        L3d:
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L48
            java.lang.String r4 = "Missing jpeg exif preamble"
            android.util.Log.d(r2, r4)
        L48:
            return r0
    }

    private com.bumptech.glide.load.ImageHeaderParser.ImageType sniffAvif(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r8, int r9) throws java.io.IOException {
            r7 = this;
            int r0 = r8.getUInt16()
            int r0 = r0 << 16
            int r1 = r8.getUInt16()
            r0 = r0 | r1
            r1 = 1718909296(0x66747970, float:2.8862439E23)
            if (r0 == r1) goto L13
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r8
        L13:
            int r0 = r8.getUInt16()
            int r0 = r0 << 16
            int r1 = r8.getUInt16()
            r0 = r0 | r1
            r1 = 1635150195(0x61766973, float:2.8409359E20)
            if (r0 != r1) goto L26
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_AVIF
            return r8
        L26:
            r2 = 0
            r3 = 1635150182(0x61766966, float:2.8409336E20)
            r4 = 1
            if (r0 != r3) goto L2f
            r0 = r4
            goto L30
        L2f:
            r0 = r2
        L30:
            r5 = 4
            r8.skip(r5)
            int r9 = r9 + (-16)
            int r5 = r9 % 4
            if (r5 != 0) goto L58
        L3b:
            r5 = 5
            if (r2 >= r5) goto L58
            if (r9 <= 0) goto L58
            int r5 = r8.getUInt16()
            int r5 = r5 << 16
            int r6 = r8.getUInt16()
            r5 = r5 | r6
            if (r5 != r1) goto L50
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_AVIF
            return r8
        L50:
            if (r5 != r3) goto L53
            r0 = r4
        L53:
            int r2 = r2 + 1
            int r9 = r9 + (-4)
            goto L3b
        L58:
            if (r0 == 0) goto L5d
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF
            goto L5f
        L5d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
        L5f:
            return r8
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@Yue.InterfaceC4410 java.io.InputStream r2, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$StreamReader r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$StreamReader
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r0.<init>(r2)
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool) r2
            int r2 = r1.getOrientation(r0, r2)
            return r2
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@Yue.InterfaceC4410 java.nio.ByteBuffer r2, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$ByteBufferReader r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$ByteBufferReader
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r0.<init>(r2)
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool) r2
            int r2 = r1.getOrientation(r0, r2)
            return r2
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @Yue.InterfaceC4410
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@Yue.InterfaceC4410 java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$StreamReader r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$StreamReader
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r0.<init>(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r1.getType(r0)
            return r2
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @Yue.InterfaceC4410
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@Yue.InterfaceC4410 java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$ByteBufferReader r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$ByteBufferReader
            java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r0.<init>(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r1.getType(r0)
            return r2
    }
}
