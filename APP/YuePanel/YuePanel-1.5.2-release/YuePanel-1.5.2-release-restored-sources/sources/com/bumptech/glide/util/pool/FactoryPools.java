package com.bumptech.glide.util.pool;

import Yue.C6702;
import Yue.InterfaceC6391;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FactoryPools {
    private static final int DEFAULT_POOL_SIZE = 20;
    private static final Resetter<Object> EMPTY_RESETTER = new Resetter<Object>() { // from class: com.bumptech.glide.util.pool.FactoryPools.1
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public void reset(@InterfaceC6391 Object obj) {
        }
    };
    private static final String TAG = "FactoryPools";

    public interface Factory<T> {
        T create();
    }

    public static final class FactoryPool<T> implements C6702.InterfaceC1067<T> {
        private final Factory<T> factory;
        private final C6702.InterfaceC1067<T> pool;
        private final Resetter<T> resetter;

        public FactoryPool(@InterfaceC6391 C6702.InterfaceC1067<T> interfaceC1067, @InterfaceC6391 Factory<T> factory, @InterfaceC6391 Resetter<T> resetter) {
            this.pool = interfaceC1067;
            this.factory = factory;
            this.resetter = resetter;
        }

        @Override // Yue.C6702.InterfaceC1067
        public T acquire() {
            T tAcquire = this.pool.acquire();
            if (tAcquire == null) {
                tAcquire = this.factory.create();
                if (Log.isLoggable(FactoryPools.TAG, 2)) {
                    Log.v(FactoryPools.TAG, "Created new " + tAcquire.getClass());
                }
            }
            if (tAcquire instanceof Poolable) {
                ((Poolable) tAcquire).getVerifier().setRecycled(false);
            }
            return tAcquire;
        }

        @Override // Yue.C6702.InterfaceC1067
        public boolean release(@InterfaceC6391 T t) {
            if (t instanceof Poolable) {
                ((Poolable) t).getVerifier().setRecycled(true);
            }
            this.resetter.reset(t);
            return this.pool.release(t);
        }
    }

    public interface Poolable {
        @InterfaceC6391
        StateVerifier getVerifier();
    }

    public interface Resetter<T> {
        void reset(@InterfaceC6391 T t);
    }

    private FactoryPools() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    private static <T extends Poolable> C6702.InterfaceC1067<T> build(@InterfaceC6391 C6702.InterfaceC1067<T> interfaceC1067, @InterfaceC6391 Factory<T> factory) {
        return build(interfaceC1067, factory, emptyResetter());
    }

    @InterfaceC6391
    private static <T> Resetter<T> emptyResetter() {
        return (Resetter<T>) EMPTY_RESETTER;
    }

    @InterfaceC6391
    public static <T extends Poolable> C6702.InterfaceC1067<T> simple(int i, @InterfaceC6391 Factory<T> factory) {
        return build(new C6702.C1068(i), factory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static <T extends Poolable> C6702.InterfaceC1067<T> threadSafe(int i, @InterfaceC6391 Factory<T> factory) {
        return build(new C6702.C6703(i), factory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static <T> C6702.InterfaceC1067<List<T>> threadSafeList() {
        return threadSafeList(20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    private static <T> C6702.InterfaceC1067<T> build(@InterfaceC6391 C6702.InterfaceC1067<T> interfaceC1067, @InterfaceC6391 Factory<T> factory, @InterfaceC6391 Resetter<T> resetter) {
        return new FactoryPool(interfaceC1067, factory, resetter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static <T extends Poolable> C6702.InterfaceC1067<T> threadSafe(int i, @InterfaceC6391 Factory<T> factory, @InterfaceC6391 Resetter<T> resetter) {
        return build(new C6702.C6703(i), factory, resetter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static <T> C6702.InterfaceC1067<List<T>> threadSafeList(int i) {
        return build(new C6702.C6703(i), new Factory<List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: create()Ljava/lang/Object; */
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            @InterfaceC6391
            public List<T> create() {
                return new ArrayList();
            }
        }, new Resetter<List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: reset(Ljava/lang/Object;)V */
            @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
            public void reset(@InterfaceC6391 List<T> list) {
                list.clear();
            }
        });
    }
}
