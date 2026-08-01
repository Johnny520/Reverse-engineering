package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Serializer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableSerializer<T> extends Serializer<T> {
    public ImmutableSerializer() {
        setImmutable(true);
    }
}
