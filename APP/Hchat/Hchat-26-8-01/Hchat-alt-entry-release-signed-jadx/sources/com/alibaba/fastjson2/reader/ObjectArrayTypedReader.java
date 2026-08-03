package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import p012ah.C0086a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectArrayTypedReader extends ObjectReaderPrimitive {
    final Class componentClass;
    final long componentClassHash;
    final Class componentType;
    final String typeName;
    final long typeNameHashCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectArrayTypedReader(Class cls) {
        super(cls);
        Class<?> componentType = cls.getComponentType();
        this.componentType = componentType;
        String typeName = TypeUtils.getTypeName((Class) componentType);
        this.componentClassHash = Fnv.hashCode64(typeName);
        String strM9263g = AbstractC4855en.m9263g("[", typeName);
        this.typeName = strM9263g;
        this.typeNameHashCode = Fnv.hashCode64(strM9263g);
        this.componentClass = TypeUtils.getClass(componentType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        Class<?> cls;
        Class<?> cls2;
        Function typeConvert;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.componentClass, collection.size());
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && (cls = next.getClass()) != (cls2 = this.componentType) && (typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(cls, cls2)) != null) {
                next = typeConvert.apply(next);
            }
            if (!this.componentType.isInstance(next)) {
                ObjectReader objectReader = JSONFactory.defaultObjectReaderProvider.getObjectReader(this.componentType);
                if (next instanceof Map) {
                    next = objectReader.createInstance((Map) next, j3);
                } else if (next instanceof Collection) {
                    next = objectReader.createInstance((Collection) next, j3);
                } else if (next instanceof Object[]) {
                    next = objectReader.createInstance(JSONArray.m1636of((Object[]) next), j3);
                } else if (next != null) {
                    Class<?> cls3 = next.getClass();
                    if (!cls3.isArray()) {
                        C0086a.m454m("component type not match, expect ", this.componentType.getName(), ", but ", cls3);
                        return null;
                    }
                    int length = Array.getLength(next);
                    JSONArray jSONArray = new JSONArray(length);
                    for (int i10 = 0; i10 < length; i10++) {
                        jSONArray.add(Array.get(next, i10));
                    }
                    next = objectReader.createInstance(jSONArray, j3);
                } else {
                    continue;
                }
            }
            objArr[i9] = next;
            i9++;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Object jSONBObject;
        Object obj2;
        if (jSONReader.getType() == -110) {
            jSONReader.next();
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != ObjectArrayReader.TYPE_HASH_CODE && typeHashCode != this.typeNameHashCode) {
                if (!jSONReader.isSupportAutoType(j3)) {
                    C0086a.m464w(jSONReader.info("not support autotype : " + jSONReader.getString()));
                    return null;
                }
                ObjectReader objectReaderAutoType = jSONReader.getObjectReaderAutoType(typeHashCode, this.objectClass, j3);
                if (objectReaderAutoType != null) {
                    return objectReaderAutoType.readObject(jSONReader, type, obj, j3);
                }
                C0086a.m464w(jSONReader.info("auotype not support : " + jSONReader.getString()));
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.componentClass, iStartArray);
        for (int i9 = 0; i9 < iStartArray; i9++) {
            if (jSONReader.isReference()) {
                String reference = jSONReader.readReference();
                if ("..".equals(reference)) {
                    obj2 = objArr;
                } else {
                    jSONReader.addResolveTask(objArr, i9, JSONPath.m1657of(reference));
                    obj2 = null;
                }
                jSONBObject = obj2;
            } else {
                ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.componentClass, this.componentClassHash, j3);
                jSONBObject = objectReaderCheckAutoType != null ? objectReaderCheckAutoType.readJSONBObject(jSONReader, null, null, j3) : jSONReader.read(this.componentType);
            }
            objArr[i9] = jSONBObject;
        }
        return objArr;
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
        if (!jSONReader.nextIfArrayStart()) {
            if (jSONReader.current() == '\"' && jSONReader.readString().isEmpty()) {
                return null;
            }
            C0086a.m464w(jSONReader.info("TODO"));
            return null;
        }
        Object[] objArrCopyOf = (Object[]) Array.newInstance((Class<?>) this.componentType, 16);
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i10 = i9 + 1;
            if (i10 - objArrCopyOf.length > 0) {
                int length = objArrCopyOf.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            objArrCopyOf[i9] = jSONReader.read(this.componentType);
            jSONReader.nextIfComma();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(objArrCopyOf, i9);
    }
}
