package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes.dex */
public interface DiskCache {

    public interface Factory {
        public static final java.lang.String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
        public static final int DEFAULT_DISK_CACHE_SIZE = 262144000;

        @Yue.InterfaceC4544
        com.bumptech.glide.load.engine.cache.DiskCache build();
    }

    public interface Writer {
        boolean write(@Yue.InterfaceC4410 java.io.File r1);
    }

    void clear();

    void delete(com.bumptech.glide.load.Key r1);

    @Yue.InterfaceC4544
    java.io.File get(com.bumptech.glide.load.Key r1);

    void put(com.bumptech.glide.load.Key r1, com.bumptech.glide.load.engine.cache.DiskCache.Writer r2);
}
