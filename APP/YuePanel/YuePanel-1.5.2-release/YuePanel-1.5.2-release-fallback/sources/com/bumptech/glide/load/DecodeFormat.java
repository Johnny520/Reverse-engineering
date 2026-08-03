package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public enum DecodeFormat extends java.lang.Enum<com.bumptech.glide.load.DecodeFormat> {
    private static final /* synthetic */ com.bumptech.glide.load.DecodeFormat[] $VALUES = null;
    public static final com.bumptech.glide.load.DecodeFormat DEFAULT = null;
    public static final com.bumptech.glide.load.DecodeFormat PREFER_ARGB_8888 = null;
    public static final com.bumptech.glide.load.DecodeFormat PREFER_RGB_565 = null;

    private static /* synthetic */ com.bumptech.glide.load.DecodeFormat[] $values() {
            com.bumptech.glide.load.DecodeFormat r0 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            com.bumptech.glide.load.DecodeFormat r1 = com.bumptech.glide.load.DecodeFormat.PREFER_RGB_565
            com.bumptech.glide.load.DecodeFormat[] r0 = new com.bumptech.glide.load.DecodeFormat[]{r0, r1}
            return r0
    }

    static {
            com.bumptech.glide.load.DecodeFormat r0 = new com.bumptech.glide.load.DecodeFormat
            java.lang.String r1 = "PREFER_ARGB_8888"
            r2 = 0
            r0.<init>(r1, r2)
            com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888 = r0
            com.bumptech.glide.load.DecodeFormat r1 = new com.bumptech.glide.load.DecodeFormat
            java.lang.String r2 = "PREFER_RGB_565"
            r3 = 1
            r1.<init>(r2, r3)
            com.bumptech.glide.load.DecodeFormat.PREFER_RGB_565 = r1
            com.bumptech.glide.load.DecodeFormat[] r1 = $values()
            com.bumptech.glide.load.DecodeFormat.$VALUES = r1
            com.bumptech.glide.load.DecodeFormat.DEFAULT = r0
            return
    }

    DecodeFormat(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bumptech.glide.load.DecodeFormat valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.load.DecodeFormat> r0 = com.bumptech.glide.load.DecodeFormat.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.load.DecodeFormat r1 = (com.bumptech.glide.load.DecodeFormat) r1
            return r1
    }

    public static com.bumptech.glide.load.DecodeFormat[] values() {
            com.bumptech.glide.load.DecodeFormat[] r0 = com.bumptech.glide.load.DecodeFormat.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.load.DecodeFormat[] r0 = (com.bumptech.glide.load.DecodeFormat[]) r0
            return r0
    }
}
