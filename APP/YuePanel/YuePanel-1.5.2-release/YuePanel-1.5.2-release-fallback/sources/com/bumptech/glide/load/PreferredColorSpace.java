package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public enum PreferredColorSpace extends java.lang.Enum<com.bumptech.glide.load.PreferredColorSpace> {
    private static final /* synthetic */ com.bumptech.glide.load.PreferredColorSpace[] $VALUES = null;
    public static final com.bumptech.glide.load.PreferredColorSpace DISPLAY_P3 = null;
    public static final com.bumptech.glide.load.PreferredColorSpace SRGB = null;

    private static /* synthetic */ com.bumptech.glide.load.PreferredColorSpace[] $values() {
            com.bumptech.glide.load.PreferredColorSpace r0 = com.bumptech.glide.load.PreferredColorSpace.SRGB
            com.bumptech.glide.load.PreferredColorSpace r1 = com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3
            com.bumptech.glide.load.PreferredColorSpace[] r0 = new com.bumptech.glide.load.PreferredColorSpace[]{r0, r1}
            return r0
    }

    static {
            com.bumptech.glide.load.PreferredColorSpace r0 = new com.bumptech.glide.load.PreferredColorSpace
            java.lang.String r1 = "SRGB"
            r2 = 0
            r0.<init>(r1, r2)
            com.bumptech.glide.load.PreferredColorSpace.SRGB = r0
            com.bumptech.glide.load.PreferredColorSpace r0 = new com.bumptech.glide.load.PreferredColorSpace
            java.lang.String r1 = "DISPLAY_P3"
            r2 = 1
            r0.<init>(r1, r2)
            com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3 = r0
            com.bumptech.glide.load.PreferredColorSpace[] r0 = $values()
            com.bumptech.glide.load.PreferredColorSpace.$VALUES = r0
            return
    }

    PreferredColorSpace(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bumptech.glide.load.PreferredColorSpace valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.load.PreferredColorSpace> r0 = com.bumptech.glide.load.PreferredColorSpace.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.load.PreferredColorSpace r1 = (com.bumptech.glide.load.PreferredColorSpace) r1
            return r1
    }

    public static com.bumptech.glide.load.PreferredColorSpace[] values() {
            com.bumptech.glide.load.PreferredColorSpace[] r0 = com.bumptech.glide.load.PreferredColorSpace.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.load.PreferredColorSpace[] r0 = (com.bumptech.glide.load.PreferredColorSpace[]) r0
            return r0
    }
}
