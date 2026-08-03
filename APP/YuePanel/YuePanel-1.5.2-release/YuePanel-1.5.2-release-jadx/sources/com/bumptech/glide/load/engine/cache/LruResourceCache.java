package com.bumptech.glide.load.engine.cache;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.annotation.SuppressLint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.util.LruCache;

/* JADX INFO: loaded from: classes.dex */
public class LruResourceCache extends LruCache<Key, Resource<?>> implements MemoryCache {
    private MemoryCache.ResourceRemovedListener listener;

    public LruResourceCache(long j) {
        super(j);
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @InterfaceC6490
    public /* bridge */ /* synthetic */ Resource put(@InterfaceC6391 Key key, @InterfaceC6490 Resource resource) {
        return (Resource) super.put(key, resource);
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @InterfaceC6490
    public /* bridge */ /* synthetic */ Resource remove(@InterfaceC6391 Key key) {
        return (Resource) super.remove(key);
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public void setResourceRemovedListener(@InterfaceC6391 MemoryCache.ResourceRemovedListener resourceRemovedListener) {
        this.listener = resourceRemovedListener;
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (i >= 40) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            trimToSize(getMaxSize() / 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getSize(Ljava/lang/Object;)I */
    @Override // com.bumptech.glide.util.LruCache
    public int getSize(@InterfaceC6490 Resource<?> resource) {
        return resource == null ? super.getSize((Object) null) : resource.getSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: onItemEvicted(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // com.bumptech.glide.util.LruCache
    public void onItemEvicted(@InterfaceC6391 Key key, @InterfaceC6490 Resource<?> resource) {
        MemoryCache.ResourceRemovedListener resourceRemovedListener = this.listener;
        if (resourceRemovedListener == null || resource == null) {
            return;
        }
        resourceRemovedListener.onResourceRemoved(resource);
    }
}
