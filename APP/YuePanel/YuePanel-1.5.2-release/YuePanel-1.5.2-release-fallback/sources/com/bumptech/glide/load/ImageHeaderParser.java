package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {
    public static final int UNKNOWN_ORIENTATION = -1;

    /* JADX INFO: renamed from: com.bumptech.glide.load.ImageHeaderParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType = null;

        static {
                com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.load.ImageHeaderParser.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bumptech.glide.load.ImageHeaderParser.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bumptech.glide.load.ImageHeaderParser.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType     // Catch: java.lang.NoSuchFieldError -> L28
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public enum ImageType extends java.lang.Enum<com.bumptech.glide.load.ImageHeaderParser.ImageType> {
        private static final /* synthetic */ com.bumptech.glide.load.ImageHeaderParser.ImageType[] $VALUES = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType ANIMATED_AVIF = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType ANIMATED_WEBP = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType AVIF = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType GIF = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType JPEG = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType PNG = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType PNG_A = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType RAW = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType UNKNOWN = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType WEBP = null;
        public static final com.bumptech.glide.load.ImageHeaderParser.ImageType WEBP_A = null;
        private final boolean hasAlpha;

        private static /* synthetic */ com.bumptech.glide.load.ImageHeaderParser.ImageType[] $values() {
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
                com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.RAW
                com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
                com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
                com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP
                com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF
                com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_AVIF
                com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = new com.bumptech.glide.load.ImageHeaderParser.ImageType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
                return r0
        }

        static {
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "GIF"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "JPEG"
                r0.<init>(r1, r3, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "RAW"
                r4 = 2
                r0.<init>(r1, r4, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.RAW = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "PNG_A"
                r4 = 3
                r0.<init>(r1, r4, r3)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "PNG"
                r4 = 4
                r0.<init>(r1, r4, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "WEBP_A"
                r4 = 5
                r0.<init>(r1, r4, r3)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "WEBP"
                r4 = 6
                r0.<init>(r1, r4, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "ANIMATED_WEBP"
                r4 = 7
                r0.<init>(r1, r4, r3)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "AVIF"
                r4 = 8
                r0.<init>(r1, r4, r3)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "ANIMATED_AVIF"
                r4 = 9
                r0.<init>(r1, r4, r3)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_AVIF = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
                java.lang.String r1 = "UNKNOWN"
                r3 = 10
                r0.<init>(r1, r3, r2)
                com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN = r0
                com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = $values()
                com.bumptech.glide.load.ImageHeaderParser.ImageType.$VALUES = r0
                return
        }

        ImageType(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.hasAlpha = r3
                return
        }

        public static com.bumptech.glide.load.ImageHeaderParser.ImageType valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.load.ImageHeaderParser$ImageType> r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = (com.bumptech.glide.load.ImageHeaderParser.ImageType) r1
                return r1
        }

        public static com.bumptech.glide.load.ImageHeaderParser.ImageType[] values() {
                com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = (com.bumptech.glide.load.ImageHeaderParser.ImageType[]) r0
                return r0
        }

        public boolean hasAlpha() {
                r1 = this;
                boolean r0 = r1.hasAlpha
                return r0
        }

        public boolean isWebp() {
                r3 = this;
                int[] r0 = com.bumptech.glide.load.ImageHeaderParser.AnonymousClass1.$SwitchMap$com$bumptech$glide$load$ImageHeaderParser$ImageType
                int r1 = r3.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L13
                r2 = 2
                if (r0 == r2) goto L13
                r2 = 3
                if (r0 == r2) goto L13
                r0 = 0
                return r0
            L13:
                return r1
        }
    }

    int getOrientation(@Yue.InterfaceC4410 java.io.InputStream r1, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2) throws java.io.IOException;

    int getOrientation(@Yue.InterfaceC4410 java.nio.ByteBuffer r1, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2) throws java.io.IOException;

    @Yue.InterfaceC4410
    com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@Yue.InterfaceC4410 java.io.InputStream r1) throws java.io.IOException;

    @Yue.InterfaceC4410
    com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@Yue.InterfaceC4410 java.nio.ByteBuffer r1) throws java.io.IOException;
}
