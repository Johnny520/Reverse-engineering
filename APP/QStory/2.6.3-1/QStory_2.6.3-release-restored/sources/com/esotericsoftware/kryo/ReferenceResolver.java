package com.esotericsoftware.kryo;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface ReferenceResolver {
    int addWrittenObject(Object obj);

    Object getReadObject(Class cls, int i);

    int getWrittenId(Object obj);

    int nextReadId(Class cls);

    void reset();

    void setKryo(Kryo kryo);

    void setReadObject(int i, Object obj);

    boolean useReferences(Class cls);
}
