package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplListInt64 implements ObjectReader {
    final Class instanceType;
    final long instanceTypeHash;
    final Class listType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplListInt64(Class cls, Class cls2) {
        this.listType = cls;
        this.instanceType = cls2;
        this.instanceTypeHash = Fnv.hashCode64(TypeUtils.getTypeName(cls2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j3) {
        Class cls = this.instanceType;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            C0086a.m450i(this.instanceType, "create list error, type ");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Function buildFunction;
        if (jSONReader.nextIfNull()) {
            return null;
        }
        Class objectClass = this.listType;
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(objectClass, this.instanceTypeHash, j3);
        if (objectReaderCheckAutoType != null) {
            objectClass = objectReaderCheckAutoType.getObjectClass();
        }
        Collection arrayList = objectClass == ArrayList.class ? new ArrayList() : objectClass == JSONArray.class ? new JSONArray() : (objectClass == null || objectClass == this.listType) ? (Collection) createInstance(jSONReader.context.features | j3) : (Collection) objectReaderCheckAutoType.createInstance(j3);
        int iStartArray = jSONReader.startArray();
        for (int i9 = 0; i9 < iStartArray; i9++) {
            arrayList.add(jSONReader.readInt64());
        }
        return (objectReaderCheckAutoType == null || (buildFunction = objectReaderCheckAutoType.getBuildFunction()) == null) ? arrayList : (Collection) buildFunction.apply(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isString()) {
            Collection collection = (Collection) createInstance(jSONReader.context.features | j3);
            String string = jSONReader.readString();
            if (string.indexOf(44) != -1) {
                for (String str : string.split(",")) {
                    collection.add(Long.valueOf(Long.parseLong(str)));
                }
            } else {
                collection.add(Long.valueOf(Long.parseLong(string)));
            }
            jSONReader.nextIfComma();
            return collection;
        }
        boolean zNextIfSet = jSONReader.nextIfSet();
        if (jSONReader.current() != '[') {
            C0086a.m464w(jSONReader.info("format error"));
            return null;
        }
        jSONReader.next();
        Collection linkedHashSet = (zNextIfSet && this.instanceType == Collection.class) ? new LinkedHashSet() : (Collection) createInstance(jSONReader.context.features | j3);
        while (!jSONReader.isEnd()) {
            if (jSONReader.nextIfArrayEnd()) {
                jSONReader.nextIfComma();
                return linkedHashSet;
            }
            if (jSONReader.current() == ',') {
                C0086a.m464w(jSONReader.info("illegal input error"));
                return null;
            }
            linkedHashSet.add(jSONReader.readInt64());
        }
        C0086a.m464w(jSONReader.info("illegal input error"));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        Collection collection2 = (Collection) createInstance(j3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            collection2.add(TypeUtils.toLong(it.next()));
        }
        return collection2;
    }
}
