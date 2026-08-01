package com.esotericsoftware.kryo;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
