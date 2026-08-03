package com.bumptech.glide.provider;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EncoderRegistry {
    private final List<Entry<?>> encoders = new ArrayList();

    public static final class Entry<T> {
        private final Class<T> dataClass;
        final Encoder<T> encoder;

        public Entry(@InterfaceC6391 Class<T> cls, @InterfaceC6391 Encoder<T> encoder) {
            this.dataClass = cls;
            this.encoder = encoder;
        }

        public boolean handles(@InterfaceC6391 Class<?> cls) {
            return this.dataClass.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void append(@InterfaceC6391 Class<T> cls, @InterfaceC6391 Encoder<T> encoder) {
        this.encoders.add(new Entry<>(cls, encoder));
    }

    @InterfaceC6490
    public synchronized <T> Encoder<T> getEncoder(@InterfaceC6391 Class<T> cls) {
        for (Entry<?> entry : this.encoders) {
            if (entry.handles(cls)) {
                return (Encoder<T>) entry.encoder;
            }
        }
        return null;
    }

    public synchronized <T> void prepend(@InterfaceC6391 Class<T> cls, @InterfaceC6391 Encoder<T> encoder) {
        this.encoders.add(0, new Entry<>(cls, encoder));
    }
}
