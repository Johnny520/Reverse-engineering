package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public enum MemoryCategory extends java.lang.Enum<com.bumptech.glide.MemoryCategory> {
    private static final /* synthetic */ com.bumptech.glide.MemoryCategory[] $VALUES = null;
    public static final com.bumptech.glide.MemoryCategory HIGH = null;
    public static final com.bumptech.glide.MemoryCategory LOW = null;
    public static final com.bumptech.glide.MemoryCategory NORMAL = null;
    private final float multiplier;

    private static /* synthetic */ com.bumptech.glide.MemoryCategory[] $values() {
            com.bumptech.glide.MemoryCategory r0 = com.bumptech.glide.MemoryCategory.LOW
            com.bumptech.glide.MemoryCategory r1 = com.bumptech.glide.MemoryCategory.NORMAL
            com.bumptech.glide.MemoryCategory r2 = com.bumptech.glide.MemoryCategory.HIGH
            com.bumptech.glide.MemoryCategory[] r0 = new com.bumptech.glide.MemoryCategory[]{r0, r1, r2}
            return r0
    }

    static {
            com.bumptech.glide.MemoryCategory r0 = new com.bumptech.glide.MemoryCategory
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            java.lang.String r3 = "LOW"
            r0.<init>(r3, r1, r2)
            com.bumptech.glide.MemoryCategory.LOW = r0
            com.bumptech.glide.MemoryCategory r0 = new com.bumptech.glide.MemoryCategory
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r3 = "NORMAL"
            r0.<init>(r3, r1, r2)
            com.bumptech.glide.MemoryCategory.NORMAL = r0
            com.bumptech.glide.MemoryCategory r0 = new com.bumptech.glide.MemoryCategory
            r1 = 2
            r2 = 1069547520(0x3fc00000, float:1.5)
            java.lang.String r3 = "HIGH"
            r0.<init>(r3, r1, r2)
            com.bumptech.glide.MemoryCategory.HIGH = r0
            com.bumptech.glide.MemoryCategory[] r0 = $values()
            com.bumptech.glide.MemoryCategory.$VALUES = r0
            return
    }

    MemoryCategory(java.lang.String r1, int r2, float r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.multiplier = r3
            return
    }

    public static com.bumptech.glide.MemoryCategory valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.MemoryCategory> r0 = com.bumptech.glide.MemoryCategory.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.MemoryCategory r1 = (com.bumptech.glide.MemoryCategory) r1
            return r1
    }

    public static com.bumptech.glide.MemoryCategory[] values() {
            com.bumptech.glide.MemoryCategory[] r0 = com.bumptech.glide.MemoryCategory.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.MemoryCategory[] r0 = (com.bumptech.glide.MemoryCategory[]) r0
            return r0
    }

    public float getMultiplier() {
            r1 = this;
            float r0 = r1.multiplier
            return r0
    }
}
