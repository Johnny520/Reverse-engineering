package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
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

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplListInt64 implements ObjectReader {
    final Class instanceType;
    final long instanceTypeHash;
    final Class listType;

    public ObjectReaderImplListInt64(Class cls, Class cls2) {
        this.listType = cls;
        this.instanceType = cls2;
        this.instanceTypeHash = Fnv.hashCode64(TypeUtils.getTypeName(cls2));
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j10) {
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
            C1607k.m6296a("create list error, type ", this.instanceType);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Function buildFunction;
        if (jSONReader.nextIfNull()) {
            return null;
        }
        Class objectClass = this.listType;
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(objectClass, this.instanceTypeHash, j10);
        if (objectReaderCheckAutoType != null) {
            objectClass = objectReaderCheckAutoType.getObjectClass();
        }
        Collection arrayList = objectClass == ArrayList.class ? new ArrayList() : objectClass == JSONArray.class ? new JSONArray() : (objectClass == null || objectClass == this.listType) ? (Collection) createInstance(jSONReader.getContext().getFeatures() | j10) : (Collection) objectReaderCheckAutoType.createInstance(j10);
        int iStartArray = jSONReader.startArray();
        for (int i10 = 0; i10 < iStartArray; i10++) {
            arrayList.add(jSONReader.readInt64());
        }
        return (objectReaderCheckAutoType == null || (buildFunction = objectReaderCheckAutoType.getBuildFunction()) == null) ? arrayList : (Collection) buildFunction.apply(arrayList);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isString()) {
            Collection collection = (Collection) createInstance(jSONReader.getContext().getFeatures() | j10);
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
            C1569c.m6258a(jSONReader.info("format error"));
            return null;
        }
        jSONReader.next();
        Collection linkedHashSet = (zNextIfSet && this.instanceType == Collection.class) ? new LinkedHashSet() : (Collection) createInstance(jSONReader.getContext().getFeatures() | j10);
        while (!jSONReader.isEnd()) {
            if (jSONReader.nextIfArrayEnd()) {
                jSONReader.nextIfComma();
                return linkedHashSet;
            }
            linkedHashSet.add(jSONReader.readInt64());
        }
        C1569c.m6258a(jSONReader.info("illegal input error"));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        Collection collection2 = (Collection) createInstance(j10);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            collection2.add(TypeUtils.toLong(it.next()));
        }
        return collection2;
    }
}
