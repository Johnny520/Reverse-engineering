package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Serializer<T> {
    private boolean acceptsNull;
    private boolean immutable;

    public Serializer(boolean z, boolean z2) {
        this.acceptsNull = z;
        this.immutable = z2;
    }

    public T copy(Kryo kryo, T t) {
        if (isImmutable()) {
            return t;
        }
        throw new KryoException("Serializer does not support copy: ".concat(getClass().getName()));
    }

    public boolean getAcceptsNull() {
        return this.acceptsNull;
    }

    public boolean isImmutable() {
        return this.immutable;
    }

    public abstract T read(Kryo kryo, Input input, Class<? extends T> cls);

    public void setAcceptsNull(boolean z) {
        this.acceptsNull = z;
    }

    public void setImmutable(boolean z) {
        this.immutable = z;
    }

    public abstract void write(Kryo kryo, Output output, T t);

    public Serializer(boolean z) {
        this.acceptsNull = z;
    }

    public Serializer() {
    }
}
