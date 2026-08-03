package com.bumptech.glide.provider;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ResourceEncoderRegistry {
    private final List<Entry<?>> encoders = new ArrayList();

    public static final class Entry<T> {
        final ResourceEncoder<T> encoder;
        private final Class<T> resourceClass;

        public Entry(@InterfaceC6391 Class<T> cls, @InterfaceC6391 ResourceEncoder<T> resourceEncoder) {
            this.resourceClass = cls;
            this.encoder = resourceEncoder;
        }

        public boolean handles(@InterfaceC6391 Class<?> cls) {
            return this.resourceClass.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void append(@InterfaceC6391 Class<Z> cls, @InterfaceC6391 ResourceEncoder<Z> resourceEncoder) {
        this.encoders.add(new Entry<>(cls, resourceEncoder));
    }

    @InterfaceC6490
    public synchronized <Z> ResourceEncoder<Z> get(@InterfaceC6391 Class<Z> cls) {
        int size = this.encoders.size();
        for (int i = 0; i < size; i++) {
            Entry<?> entry = this.encoders.get(i);
            if (entry.handles(cls)) {
                return (ResourceEncoder<Z>) entry.encoder;
            }
        }
        return null;
    }

    public synchronized <Z> void prepend(@InterfaceC6391 Class<Z> cls, @InterfaceC6391 ResourceEncoder<Z> resourceEncoder) {
        this.encoders.add(0, new Entry<>(cls, resourceEncoder));
    }
}
