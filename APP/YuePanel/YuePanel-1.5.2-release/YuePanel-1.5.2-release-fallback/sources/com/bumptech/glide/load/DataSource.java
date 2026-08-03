package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public enum DataSource extends java.lang.Enum<com.bumptech.glide.load.DataSource> {
    private static final /* synthetic */ com.bumptech.glide.load.DataSource[] $VALUES = null;
    public static final com.bumptech.glide.load.DataSource DATA_DISK_CACHE = null;
    public static final com.bumptech.glide.load.DataSource LOCAL = null;
    public static final com.bumptech.glide.load.DataSource MEMORY_CACHE = null;
    public static final com.bumptech.glide.load.DataSource REMOTE = null;
    public static final com.bumptech.glide.load.DataSource RESOURCE_DISK_CACHE = null;

    private static /* synthetic */ com.bumptech.glide.load.DataSource[] $values() {
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.LOCAL
            com.bumptech.glide.load.DataSource r1 = com.bumptech.glide.load.DataSource.REMOTE
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.DATA_DISK_CACHE
            com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            com.bumptech.glide.load.DataSource r4 = com.bumptech.glide.load.DataSource.MEMORY_CACHE
            com.bumptech.glide.load.DataSource[] r0 = new com.bumptech.glide.load.DataSource[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            com.bumptech.glide.load.DataSource r0 = new com.bumptech.glide.load.DataSource
            java.lang.String r1 = "LOCAL"
            r2 = 0
            r0.<init>(r1, r2)
            com.bumptech.glide.load.DataSource.LOCAL = r0
            com.bumptech.glide.load.DataSource r0 = new com.bumptech.glide.load.DataSource
            java.lang.String r1 = "REMOTE"
            r2 = 1
            r0.<init>(r1, r2)
            com.bumptech.glide.load.DataSource.REMOTE = r0
            com.bumptech.glide.load.DataSource r0 = new com.bumptech.glide.load.DataSource
            java.lang.String r1 = "DATA_DISK_CACHE"
            r2 = 2
            r0.<init>(r1, r2)
            com.bumptech.glide.load.DataSource.DATA_DISK_CACHE = r0
            com.bumptech.glide.load.DataSource r0 = new com.bumptech.glide.load.DataSource
            java.lang.String r1 = "RESOURCE_DISK_CACHE"
            r2 = 3
            r0.<init>(r1, r2)
            com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE = r0
            com.bumptech.glide.load.DataSource r0 = new com.bumptech.glide.load.DataSource
            java.lang.String r1 = "MEMORY_CACHE"
            r2 = 4
            r0.<init>(r1, r2)
            com.bumptech.glide.load.DataSource.MEMORY_CACHE = r0
            com.bumptech.glide.load.DataSource[] r0 = $values()
            com.bumptech.glide.load.DataSource.$VALUES = r0
            return
    }

    DataSource(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bumptech.glide.load.DataSource valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.load.DataSource> r0 = com.bumptech.glide.load.DataSource.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.load.DataSource r1 = (com.bumptech.glide.load.DataSource) r1
            return r1
    }

    public static com.bumptech.glide.load.DataSource[] values() {
            com.bumptech.glide.load.DataSource[] r0 = com.bumptech.glide.load.DataSource.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.load.DataSource[] r0 = (com.bumptech.glide.load.DataSource[]) r0
            return r0
    }
}
