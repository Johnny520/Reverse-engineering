package com.bumptech.glide.load.data;

import Yue.InterfaceC6391;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DataRewinderRegistry {
    private static final DataRewinder.Factory<?> DEFAULT_FACTORY = new DataRewinder.Factory<Object>() { // from class: com.bumptech.glide.load.data.DataRewinderRegistry.1
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @InterfaceC6391
        public DataRewinder<Object> build(@InterfaceC6391 Object obj) {
            return new DefaultRewinder(obj);
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @InterfaceC6391
        public Class<Object> getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    private final Map<Class<?>, DataRewinder.Factory<?>> rewinders = new HashMap();

    public static final class DefaultRewinder implements DataRewinder<Object> {
        private final Object data;

        public DefaultRewinder(@InterfaceC6391 Object obj) {
            this.data = obj;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        @InterfaceC6391
        public Object rewindAndGet() {
            return this.data;
        }
    }

    @InterfaceC6391
    public synchronized <T> DataRewinder<T> build(@InterfaceC6391 T t) {
        DataRewinder.Factory<?> factory;
        try {
            Preconditions.checkNotNull(t);
            factory = this.rewinders.get(t.getClass());
            if (factory == null) {
                Iterator<DataRewinder.Factory<?>> it = this.rewinders.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DataRewinder.Factory<?> next = it.next();
                    if (next.getDataClass().isAssignableFrom(t.getClass())) {
                        factory = next;
                        break;
                    }
                }
            }
            if (factory == null) {
                factory = DEFAULT_FACTORY;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (DataRewinder<T>) factory.build(t);
    }

    public synchronized void register(@InterfaceC6391 DataRewinder.Factory<?> factory) {
        this.rewinders.put(factory.getDataClass(), factory);
    }
}
