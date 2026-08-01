package com.bumptech.glide.load;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType extends java.lang.Enum<com.bumptech.glide.load.ImageHeaderParser$ImageType> {
    private static final /* synthetic */ com.bumptech.glide.load.ImageHeaderParser$ImageType[] $VALUES = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType ANIMATED_AVIF = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType ANIMATED_WEBP = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType AVIF = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType GIF = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType JPEG = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType PNG = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType PNG_A = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType RAW = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType UNKNOWN = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType WEBP = null;
    public static final com.bumptech.glide.load.ImageHeaderParser$ImageType WEBP_A = null;

    /* JADX INFO: renamed from: ε */
    public final boolean f2221;

    static {
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r1 = "GIF"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r4 = "JPEG"
            r1.<init>(r4, r3, r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG = r1
            r4 = r2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r5 = "RAW"
            r6 = 2
            r2.<init>(r5, r6, r4)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.RAW = r2
            r5 = r3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r6 = "PNG_A"
            r7 = 3
            r3.<init>(r6, r7, r5)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A = r3
            r6 = r4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r7 = "PNG"
            r8 = 4
            r4.<init>(r7, r8, r6)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG = r4
            r7 = r5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r8 = "WEBP_A"
            r9 = 5
            r5.<init>(r8, r9, r7)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A = r5
            r8 = r6
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r9 = "WEBP"
            r10 = 6
            r6.<init>(r9, r10, r8)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP = r6
            r9 = r7
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r10 = "ANIMATED_WEBP"
            r11 = 7
            r7.<init>(r10, r11, r9)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP = r7
            r10 = r8
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r11 = "AVIF"
            r12 = 8
            r8.<init>(r11, r12, r9)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.AVIF = r8
            r11 = r9
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r12 = "ANIMATED_AVIF"
            r13 = 9
            r9.<init>(r12, r13, r11)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF = r9
            r11 = r10
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = new com.bumptech.glide.load.ImageHeaderParser$ImageType
            java.lang.String r12 = "UNKNOWN"
            r13 = 10
            r10.<init>(r12, r13, r11)
            com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN = r10
            com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = new com.bumptech.glide.load.ImageHeaderParser$ImageType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            com.bumptech.glide.load.ImageHeaderParser$ImageType.$VALUES = r0
            return
    }

    ImageHeaderParser$ImageType(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f2221 = r3
            return
    }

    public static com.bumptech.glide.load.ImageHeaderParser$ImageType valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.load.ImageHeaderParser$ImageType> r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = (com.bumptech.glide.load.ImageHeaderParser$ImageType) r1
            return r1
    }

    public static com.bumptech.glide.load.ImageHeaderParser$ImageType[] values() {
            com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.load.ImageHeaderParser$ImageType[] r0 = (com.bumptech.glide.load.ImageHeaderParser$ImageType[]) r0
            return r0
    }

    public boolean hasAlpha() {
            r0 = this;
            boolean r0 = r0.f2221
            return r0
    }

    public boolean isWebp() {
            r2 = this;
            int[] r0 = p000.uk0.f10887
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L13
            r1 = 2
            if (r2 == r1) goto L13
            r1 = 3
            if (r2 == r1) goto L13
            r2 = 0
            return r2
        L13:
            return r0
    }
}
