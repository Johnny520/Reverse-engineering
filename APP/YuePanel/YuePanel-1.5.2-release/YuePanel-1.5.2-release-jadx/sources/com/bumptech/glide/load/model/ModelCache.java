package com.bumptech.glide.load.model;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class ModelCache<A, B> {
    private static final int DEFAULT_SIZE = 250;
    private final LruCache<ModelKey<A>, B> cache;

    @InterfaceC8392
    public static final class ModelKey<A> {
        private static final Queue<ModelKey<?>> KEY_QUEUE = Util.createQueue(0);
        private int height;
        private A model;
        private int width;

        private ModelKey() {
        }

        public static <A> ModelKey<A> get(A a, int i, int i2) {
            ModelKey<A> modelKey;
            Queue<ModelKey<?>> queue = KEY_QUEUE;
            synchronized (queue) {
                modelKey = (ModelKey) queue.poll();
            }
            if (modelKey == null) {
                modelKey = new ModelKey<>();
            }
            modelKey.init(a, i, i2);
            return modelKey;
        }

        private void init(A a, int i, int i2) {
            this.model = a;
            this.width = i;
            this.height = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ModelKey)) {
                return false;
            }
            ModelKey modelKey = (ModelKey) obj;
            return this.width == modelKey.width && this.height == modelKey.height && this.model.equals(modelKey.model);
        }

        public int hashCode() {
            return (((this.height * 31) + this.width) * 31) + this.model.hashCode();
        }

        public void release() {
            Queue<ModelKey<?>> queue = KEY_QUEUE;
            synchronized (queue) {
                queue.offer(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ModelCache() {
        this(250L);
    }

    public void clear() {
        this.cache.clearMemory();
    }

    @InterfaceC6490
    public B get(A a, int i, int i2) {
        ModelKey<A> modelKey = ModelKey.get(a, i, i2);
        B b = this.cache.get(modelKey);
        modelKey.release();
        return b;
    }

    public void put(A a, int i, int i2, B b) {
        this.cache.put(ModelKey.get(a, i, i2), b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ModelCache(long j) {
        this.cache = new LruCache<ModelKey<A>, B>(j) { // from class: com.bumptech.glide.load.model.ModelCache.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: onItemEvicted(Ljava/lang/Object;Ljava/lang/Object;)V */
            @Override // com.bumptech.glide.util.LruCache
            public void onItemEvicted(@InterfaceC6391 ModelKey<A> modelKey, @InterfaceC6490 B b) {
                modelKey.release();
            }
        };
    }
}
