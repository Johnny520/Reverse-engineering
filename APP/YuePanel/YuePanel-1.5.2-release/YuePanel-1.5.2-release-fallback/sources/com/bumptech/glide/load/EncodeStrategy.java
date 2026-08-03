package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public enum EncodeStrategy extends java.lang.Enum<com.bumptech.glide.load.EncodeStrategy> {
    private static final /* synthetic */ com.bumptech.glide.load.EncodeStrategy[] $VALUES = null;
    public static final com.bumptech.glide.load.EncodeStrategy NONE = null;
    public static final com.bumptech.glide.load.EncodeStrategy SOURCE = null;
    public static final com.bumptech.glide.load.EncodeStrategy TRANSFORMED = null;

    private static /* synthetic */ com.bumptech.glide.load.EncodeStrategy[] $values() {
            com.bumptech.glide.load.EncodeStrategy r0 = com.bumptech.glide.load.EncodeStrategy.SOURCE
            com.bumptech.glide.load.EncodeStrategy r1 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED
            com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.NONE
            com.bumptech.glide.load.EncodeStrategy[] r0 = new com.bumptech.glide.load.EncodeStrategy[]{r0, r1, r2}
            return r0
    }

    static {
            com.bumptech.glide.load.EncodeStrategy r0 = new com.bumptech.glide.load.EncodeStrategy
            java.lang.String r1 = "SOURCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.bumptech.glide.load.EncodeStrategy.SOURCE = r0
            com.bumptech.glide.load.EncodeStrategy r0 = new com.bumptech.glide.load.EncodeStrategy
            java.lang.String r1 = "TRANSFORMED"
            r2 = 1
            r0.<init>(r1, r2)
            com.bumptech.glide.load.EncodeStrategy.TRANSFORMED = r0
            com.bumptech.glide.load.EncodeStrategy r0 = new com.bumptech.glide.load.EncodeStrategy
            java.lang.String r1 = "NONE"
            r2 = 2
            r0.<init>(r1, r2)
            com.bumptech.glide.load.EncodeStrategy.NONE = r0
            com.bumptech.glide.load.EncodeStrategy[] r0 = $values()
            com.bumptech.glide.load.EncodeStrategy.$VALUES = r0
            return
    }

    EncodeStrategy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bumptech.glide.load.EncodeStrategy valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.load.EncodeStrategy> r0 = com.bumptech.glide.load.EncodeStrategy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.load.EncodeStrategy r1 = (com.bumptech.glide.load.EncodeStrategy) r1
            return r1
    }

    public static com.bumptech.glide.load.EncodeStrategy[] values() {
            com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.load.EncodeStrategy[] r0 = (com.bumptech.glide.load.EncodeStrategy[]) r0
            return r0
    }
}
