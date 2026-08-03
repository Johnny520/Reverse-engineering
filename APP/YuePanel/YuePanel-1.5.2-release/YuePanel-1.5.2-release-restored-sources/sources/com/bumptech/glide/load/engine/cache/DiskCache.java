package com.bumptech.glide.load.engine.cache;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.Key;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public interface DiskCache {

    public interface Factory {
        public static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
        public static final int DEFAULT_DISK_CACHE_SIZE = 262144000;

        @InterfaceC6490
        DiskCache build();
    }

    public interface Writer {
        boolean write(@InterfaceC6391 File file);
    }

    void clear();

    void delete(Key key);

    @InterfaceC6490
    File get(Key key);

    void put(Key key, Writer writer);
}
